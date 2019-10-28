///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.ui.quickfix
// 
// FILE      : ResourceReplacementQuickFix.java
//
// DATE      : Apr 22, 2014
//
// Copyright (C) 2008, 2011 SES ENGINEERING, Luxembourg S.A.R.L.
//
// By using this software in any way, you are agreeing to be bound by
// the terms of this license.
//
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// NO WARRANTY
// EXCEPT AS EXPRESSLY SET FORTH IN THIS AGREEMENT, THE PROGRAM IS PROVIDED
// ON AN "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, EITHER
// EXPRESS OR IMPLIED INCLUDING, WITHOUT LIMITATION, ANY WARRANTIES OR
// CONDITIONS OF TITLE, NON-INFRINGEMENT, MERCHANTABILITY OR FITNESS FOR A
// PARTICULAR PURPOSE. Each Recipient is solely responsible for determining
// the appropriateness of using and distributing the Program and assumes all
// risks associated with its exercise of rights under this Agreement ,
// including but not limited to the risks and costs of program errors,
// compliance with applicable laws, damage to or loss of data, programs or
// equipment, and unavailability or interruption of operations.
//
// DISCLAIMER OF LIABILITY
// EXCEPT AS EXPRESSLY SET FORTH IN THIS AGREEMENT, NEITHER RECIPIENT NOR ANY
// CONTRIBUTORS SHALL HAVE ANY LIABILITY FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING WITHOUT LIMITATION
// LOST PROFITS), HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
// ARISING IN ANY WAY OUT OF THE USE OR DISTRIBUTION OF THE PROGRAM OR THE
// EXERCISE OF ANY RIGHTS GRANTED HEREUNDER, EVEN IF ADVISED OF THE
// POSSIBILITY OF SUCH DAMAGES.
//
// Contributors:
//    SES ENGINEERING - initial API and implementation and/or initial documentation
//
// PROJECT   : SPELL
//
// SUBPROJECT: SPELL DEV
//
///////////////////////////////////////////////////////////////////////////////
package com.astra.ses.spell.dev.scheck.ui.quickfix;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import com.astra.ses.spell.dev.scheck.ui.MarkerHelper;
import com.astra.ses.spell.dev.scheck.ui.MarkerManager;

class ResourceReplacementQuickFix 
{
	private IFile m_file;
	private InputStream m_newIs;
	private List<Delta> m_accumulatedDeltas = new LinkedList<Delta>();
	private int m_maximumDelta;
	private IProgressMonitor m_monitor;
	
	/************************************************************************************
	 * Utility class to track offset changes applied to file input stream
	 ***********************************************************************************/
	private class Delta
	{
		int lineNo;
		int accDelta;
	}
	
	/************************************************************************************
	 * Constructor
	 ***********************************************************************************/
	public ResourceReplacementQuickFix( IFile file ) throws Exception
	{
		m_file = file;
		m_newIs = file.getContents();
		m_accumulatedDeltas.clear();
		m_maximumDelta = 0;
	}
	
	/************************************************************************************
	 * Report progress in the progress monitor object if any
	 ***********************************************************************************/
	protected void progress(String message)
	{
		if (m_monitor != null) m_monitor.subTask(message);
	}

	/************************************************************************************
	 * Get the character offset delta corresponding to the current line. This is the
	 * accumulated delta from the line where the changes begun, to the given line. 
	 ***********************************************************************************/
	protected int getDelta( int currentLineNo )
	{
		for(int index=m_accumulatedDeltas.size()-1; index>=0; index--)
		{
			// We start from the end and search for the first line number
			// that falls before or matches the given one
			if (m_accumulatedDeltas.get(index).lineNo<=currentLineNo)
			{
				return m_accumulatedDeltas.get(index).accDelta;
			}
		}
		return 0;
	}

	/************************************************************************************
	 * Register a new character offset delta created by a modification, happening at the
	 * given line number. If there are other deltas in the given line, the delta is
	 * accumulated.
	 * 
	 * This delta has into account all deltas happened in previous lines.
	 ***********************************************************************************/
	protected void accumulateDelta( int delta, int lineNo )
	{
		m_maximumDelta += delta;
		if (m_accumulatedDeltas.isEmpty())
		{
			Delta d = new Delta();
			d.lineNo = lineNo;
			d.accDelta = m_maximumDelta;
			m_accumulatedDeltas.add(d);
		}
		else
		{	
			int lastIndex = m_accumulatedDeltas.size()-1;
			if (m_accumulatedDeltas.get(lastIndex).lineNo==lineNo)
			{
				Delta d = new Delta();
				d.lineNo = lineNo;
				d.accDelta = m_maximumDelta;
				m_accumulatedDeltas.remove(lastIndex);
				m_accumulatedDeltas.add(d);
			}
			else if (m_accumulatedDeltas.get(lastIndex).lineNo<lineNo)
			{
				Delta d = new Delta();
				d.lineNo = lineNo;
				d.accDelta = m_maximumDelta;
				m_accumulatedDeltas.add(d);
			}
			else
			{
				throw new RuntimeException("Unordered delta");
			}
		}
	}
	
	/************************************************************************************
	 * Commit all the changes done on the input stream to disk and update all the other
	 * markers that may be associated with this resource: the offset have normally changed
	 * so all markers need to be reviewed, regardless they have quick fixes or not.
	 ***********************************************************************************/
	public void commitFix()
	{
		try
        {
	        m_file.setContents( m_newIs, true, true, null );
	        
			int fixesStartAtLine = m_accumulatedDeltas.isEmpty() ? 0 : m_accumulatedDeltas.get(0).lineNo;

	        // And update other markers that may exist for this resource
			List<IMarker> otherMarkers = MarkerManager.getAllMarkers(m_file);
			for(IMarker marker : otherMarkers)
			{
				int lineNo = MarkerHelper.getLineNo(marker);
				if (lineNo>fixesStartAtLine)
				{
					int start = (Integer) marker.getAttribute(IMarker.CHAR_START);
					int end = (Integer) marker.getAttribute(IMarker.CHAR_END);
					int accDelta = getDelta(lineNo);
			    	start -= accDelta;
			    	end -= accDelta;
			    	marker.setAttribute(IMarker.CHAR_START, start);
			    	marker.setAttribute(IMarker.CHAR_END, end);
				}
			}

        }
        catch (CoreException e)
        {
	        e.printStackTrace();
        }
	}

	/************************************************************************************
	 * Execute the given quick fix against this resource. Note that in this implementation
	 * it is assumed that the quickfix class is going to replace one part of the file 
	 * text by another one. Changes of any other nature (e.g. append to file) may not
	 * work here.
	 ***********************************************************************************/
	public void executeFix( IMarker marker, QuickFixBase qf, IProgressMonitor monitor )
	{
		m_monitor = monitor;
		try
		{
			// Get the location of the marker
			int start = MarkerHelper.getStart(marker);
			int end = MarkerHelper.getEnd(marker);
			int lineNo = MarkerHelper.getLineNo(marker);
			
			// Get the accumulated delta up to this line. We need to take it into account
			// so that we re-adjust the marker location: note that the marker offset information
			// is not updated globally (setAttribute calls) until the fixes are finished, for
			// performance reasons.
	    	int accDelta = getDelta(lineNo);
	    	start -= accDelta;
	    	end -= accDelta;

	    	// Will hold the modified stream
	    	ByteArrayOutputStream out = new ByteArrayOutputStream();
	    	int offset = 0;
	    	BufferedReader in = new BufferedReader(new InputStreamReader(m_newIs, Charset.defaultCharset()));
	    	
	    	// Write the beginning of the file up to the marker start
	    	while(offset != start)
	    	{
	    		int data = in.read();
	    		out.write(data);
	    		offset++;
	    	}
	    	marker.getAttribute("Node");
	    	// to be replaced
	    	ByteArrayOutputStream oldBytes = new ByteArrayOutputStream();
	    	while(offset != end)
	    	{
	    		int data = in.read();
	    		oldBytes.write(data);
	    		offset++;
	    	}
	    	String old = new String(oldBytes.toByteArray());
	    	
	    	// Get the replacement text from the quick fix class
	    	String replacement = qf.getReplacement( old, marker );

	    	if (replacement != null)
	    	{
	    		out.write(replacement.getBytes());
	    	}
	    	else
	    	{
	    		out.write(old.getBytes());
	    	}
	    	
	    	// write the rest of the file
	    	while(in.ready())
	    	{
	    		int data = in.read();
	    		out.write(data);
	    	}
	    	in.close();
	    	// Store the new input stream but do not set it to the file yet:
	    	// only when everything goes well, the QuickFixBase class will call
	    	// the commitFix() method to really update the file.
	    	m_newIs = new ByteArrayInputStream(out.toByteArray());

	    	// Add the offset delta corresponding to this change, if any
			if (replacement != null)
			{
				int delta = old.length() - replacement.length();
		    	if (delta != 0)
		    	{
		    		accumulateDelta(delta, lineNo);
		    	}
			}
			
			// Delete the marker if everything went well (we have fixed the issue)
			marker.delete();
		}
		catch(Exception ex)
		{
			throw new RuntimeException("Failed to execute fix: " + ex.getLocalizedMessage());
		}
    }
}
