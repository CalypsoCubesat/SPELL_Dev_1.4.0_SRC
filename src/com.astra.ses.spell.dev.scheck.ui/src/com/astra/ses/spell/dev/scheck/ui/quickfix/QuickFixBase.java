///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.ui.quickfix
// 
// FILE      : QuickFixBase.java
//
// DATE      : Apr 18, 2014
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMarkerResolution2;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.markers.MarkerSupportView;
import org.eclipse.ui.views.markers.WorkbenchMarkerResolution;

import com.astra.ses.spell.dev.scheck.interfaces.IIssue;
import com.astra.ses.spell.dev.scheck.ui.MarkerHelper;

public abstract class QuickFixBase extends WorkbenchMarkerResolution implements IMarkerResolution2
{
	private IProgressMonitor m_monitor;
	private static Map<IFile, ResourceReplacementQuickFix> s_modifiedResources = new HashMap<IFile, ResourceReplacementQuickFix>();
	
	/************************************************************************************
	 * Get image associated with this quick fix
	 ***********************************************************************************/
	@Override
	public Image getImage()
	{
		return null;
	}

	/************************************************************************************
	 * Report progress
	 ***********************************************************************************/
	protected void progress(String message)
	{
		m_monitor.subTask(message);
	}

	/************************************************************************************
	 * Run all selected quick fixes from the Quick Fix wizard. 
	 *
	 * This methid overrides the original behavior of this method for a Workbench resolution: 
	 * we want to be in better control of the fixes that are applied.
	 ***********************************************************************************/
	@Override
	public void run(IMarker[] markers, IProgressMonitor monitor)
	{
		m_monitor = monitor;
		s_modifiedResources.clear();
		
		// IMPORTANT: we need to fix the markers ensuring ascending line order. Otherwise the accumulated
		// delta idea cannot be used to rearrange the markers one by one as well as the operation goes on.
		ArrayList<IMarker> sorted = new ArrayList<IMarker>();
		sorted.addAll( Arrays.asList(markers) );
		Collections.sort(sorted, new Comparator<IMarker>()
				{
					@Override
                    public int compare(IMarker arg0, IMarker arg1)
                    {
	                    Integer l0 = MarkerHelper.getLineNo(arg0);
	                    Integer l1 = MarkerHelper.getLineNo(arg1);
	                    return l0.compareTo(l1);
                    }
				});

		// Run a fix for each marker selected in the problems view
		for (IMarker marker : sorted)
		{
			IResource rsc = marker.getResource();
			if (rsc instanceof IFile)
			{
				IFile file = (IFile) rsc;
				try
				{
					ResourceReplacementQuickFix rpf = null;
					if (!s_modifiedResources.containsKey(file))
					{
						rpf = new ResourceReplacementQuickFix(file);
						s_modifiedResources.put(file, rpf);
					}
					String message = MarkerHelper.getMessage(marker);
					progress("Applying fix: " + message);
					s_modifiedResources.get(file).executeFix(marker, this, monitor);
				}
				catch(Exception ex)
				{
					s_modifiedResources.remove(file);
					continue;
				}
			}
			else
			{
				progress("Applying fix: " + MarkerHelper.getMessage(marker));
				run(marker);
			}
		}
		
		// Once all fixes are done, perform the update of all markers and files
		for(IFile file : s_modifiedResources.keySet())
		{
			progress("Updating resource changes: " + file);
			s_modifiedResources.get(file).commitFix();
		}

		s_modifiedResources.clear();
	}

	/************************************************************************************
	 * Overriden by other quick fixes
	 ***********************************************************************************/
	protected abstract String getId();

	/************************************************************************************
	 * Get reference to the markers view
	 ***********************************************************************************/
	protected MarkerSupportView getMarkersView()
	{
		IWorkbenchPart part = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart();
		if (!(part instanceof MarkerSupportView)) return null;
		return (MarkerSupportView) part;
	}

	/************************************************************************************
	 * Find other markers related to this one, so that all can be fixed together in 
	 * one shot
	 ***********************************************************************************/
	@Override
	public IMarker[] findOtherMarkers(IMarker[] markers)
	{
		List<IMarker> list = new LinkedList<IMarker>();
		IStructuredSelection isel = (IStructuredSelection) getMarkersView().getSite().getSelectionProvider().getSelection();
		IAdaptable adp = (IAdaptable) isel.getFirstElement();
		IMarker smarker = (IMarker) adp.getAdapter(IMarker.class);
		
		// We need to filter out the SELECTED marker
		int sstart = -1;
		int send = -1;
		int sline = -1;
		try
		{
			sline = (Integer) smarker.getAttribute(IMarker.LINE_NUMBER);
			sstart = (Integer) smarker.getAttribute(IMarker.CHAR_START);
			send = (Integer) smarker.getAttribute(IMarker.CHAR_END);
		}
		catch (CoreException e1)
		{
			e1.printStackTrace();
		}
		for (IMarker marker : markers)
		{
			try
			{
				Object attr = marker.getAttribute(IIssue.QUICK_FIX_ID);
				if (attr != null && ((String)attr).equals(getId()))
				{
					int mline = (Integer) marker.getAttribute(IMarker.LINE_NUMBER);
					int mstart = (Integer) marker.getAttribute(IMarker.CHAR_START);
					int mend = (Integer) marker.getAttribute(IMarker.CHAR_END);
					if (!list.contains(marker) && (sline != mline) && (sstart != mstart) && (send != mend))
					{
						list.add(marker);
					}
				}
			}
			catch (CoreException e)
			{
				e.printStackTrace();
			}
		}
		return list.toArray(new IMarker[0]);
	}
	
	/************************************************************************************
	 * Obtain the replacement string for an old one
	 ***********************************************************************************/
	protected abstract String getReplacement( String old, IMarker marker ) throws Exception;
	
	/************************************************************************************
	 * Not to be used
	 * Has been replaced by executeFix() method of the ResourceReplacementQuickFix class
	 ***********************************************************************************/
	public void run( IMarker marker ) {};
	
}
