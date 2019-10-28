///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.model
//
// FILE      : Issue.java
//
// DATE      : Feb 7, 2011
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
package com.astra.ses.spell.dev.scheck.model;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.python.pydev.parser.jython.SimpleNode;
import org.python.pydev.parser.jython.ast.Assert;
import org.python.pydev.parser.jython.ast.Assign;
import org.python.pydev.parser.jython.ast.Attribute;
import org.python.pydev.parser.jython.ast.AugAssign;
import org.python.pydev.parser.jython.ast.BinOp;
import org.python.pydev.parser.jython.ast.BoolOp;
import org.python.pydev.parser.jython.ast.Break;
import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.ClassDef;
import org.python.pydev.parser.jython.ast.Compare;
import org.python.pydev.parser.jython.ast.Comprehension;
import org.python.pydev.parser.jython.ast.Continue;
import org.python.pydev.parser.jython.ast.Delete;
import org.python.pydev.parser.jython.ast.Dict;
import org.python.pydev.parser.jython.ast.DictComp;
import org.python.pydev.parser.jython.ast.Ellipsis;
import org.python.pydev.parser.jython.ast.Exec;
import org.python.pydev.parser.jython.ast.Expr;
import org.python.pydev.parser.jython.ast.Expression;
import org.python.pydev.parser.jython.ast.ExtSlice;
import org.python.pydev.parser.jython.ast.For;
import org.python.pydev.parser.jython.ast.FunctionDef;
import org.python.pydev.parser.jython.ast.GeneratorExp;
import org.python.pydev.parser.jython.ast.Global;
import org.python.pydev.parser.jython.ast.If;
import org.python.pydev.parser.jython.ast.IfExp;
import org.python.pydev.parser.jython.ast.Import;
import org.python.pydev.parser.jython.ast.ImportFrom;
import org.python.pydev.parser.jython.ast.Index;
import org.python.pydev.parser.jython.ast.Interactive;
import org.python.pydev.parser.jython.ast.Lambda;
import org.python.pydev.parser.jython.ast.List;
import org.python.pydev.parser.jython.ast.ListComp;
import org.python.pydev.parser.jython.ast.Module;
import org.python.pydev.parser.jython.ast.Name;
import org.python.pydev.parser.jython.ast.NameTok;
import org.python.pydev.parser.jython.ast.NonLocal;
import org.python.pydev.parser.jython.ast.Num;
import org.python.pydev.parser.jython.ast.Pass;
import org.python.pydev.parser.jython.ast.Print;
import org.python.pydev.parser.jython.ast.Raise;
import org.python.pydev.parser.jython.ast.Repr;
import org.python.pydev.parser.jython.ast.Return;
import org.python.pydev.parser.jython.ast.Set;
import org.python.pydev.parser.jython.ast.SetComp;
import org.python.pydev.parser.jython.ast.Slice;
import org.python.pydev.parser.jython.ast.Starred;
import org.python.pydev.parser.jython.ast.Str;
import org.python.pydev.parser.jython.ast.StrJoin;
import org.python.pydev.parser.jython.ast.Subscript;
import org.python.pydev.parser.jython.ast.Suite;
import org.python.pydev.parser.jython.ast.TryExcept;
import org.python.pydev.parser.jython.ast.TryFinally;
import org.python.pydev.parser.jython.ast.Tuple;
import org.python.pydev.parser.jython.ast.UnaryOp;
import org.python.pydev.parser.jython.ast.VisitorBase;
import org.python.pydev.parser.jython.ast.VisitorIF;
import org.python.pydev.parser.jython.ast.While;
import org.python.pydev.parser.jython.ast.With;
import org.python.pydev.parser.jython.ast.WithItem;
import org.python.pydev.parser.jython.ast.Yield;

import com.astra.ses.spell.dev.scheck.QuickFix;
import com.astra.ses.spell.dev.scheck.interfaces.IIssue;
import com.astra.ses.spell.dev.scheck.interfaces.IssueSeverity;
import com.astra.ses.spell.dev.scheck.interfaces.TokenHelper;

/******************************************************************************
 * Implementation of semantic issue 
 *****************************************************************************/
public class Issue implements IIssue
{
	/** Holds the issue message */
	private String m_message;
	/** Holds the issue severity */
	private IssueSeverity m_severity;
	/** Holds the issue line number. Used when there is no node associated */
	private int m_line;
	/** Holds the issue start character. Used when there is no node associated */
	private int m_start;
	/** Holds the issue end character. Used when there is no node associated */
	private int m_end;
	/** Associated parse node */
	private SimpleNode m_node;
	/** Quick fix ID if there is any associated */
	private QuickFix m_quickFix;

	/**************************************************************************
	 * Constructor for issues not associated to a specific line of a file
	 * @param message Issue message
	 * @param severity Issue severity
	 *************************************************************************/
	public Issue( String message, IssueSeverity severity )
	{
		m_line = m_start = m_end = -1;
		m_node = null;
		m_message = message;
		m_severity = severity;
		m_quickFix = null;
	}

	/**************************************************************************
	 * Constructor for issues not associated to a specific parser node, but
	 * associated to a range in a file
	 * @param message Issue message
	 * @param severity Issue severity
	 * @param line Issue line number
	 * @param start Issue start character
	 * @param end Issue end character
	 *************************************************************************/
	public Issue( String message, IssueSeverity severity, int line, int start, int end )
	{
		m_message = message;
		m_severity = severity;
		m_line = line;
		m_start = start;
		m_end = end;
		m_node = null;
		m_quickFix = null;
	}

	/**************************************************************************
	 * Constructor for issues not associated to a specific parser node, but
	 * associated to a line in a file (no range specified)
	 * @param message Issue message
	 * @param severity Issue severity
	 * @param line Issue line number
	 *************************************************************************/
	public Issue( String message, IssueSeverity severity, int line )
	{
		m_message = message;
		m_severity = severity;
		m_line = line;
		m_start = -1;
		m_end = -1;
		m_node = null;
		m_quickFix = null;
	}

	/**************************************************************************
	 * Constructor for issues associated to a specific parser node
	 * @param message Issue message
	 * @param severity Issue severity
	 * @param node The associated parser node
	 *************************************************************************/
	public Issue( String message, IssueSeverity severity, SimpleNode node )
	{
		m_message = message;
		m_severity = severity;
		m_line = node.beginLine;
		// The start and end will be calculated when adapting markers
		m_start = -1;
		m_end = -1;
		m_node = node;
		m_quickFix = null;
	}

	@Override
	public String getMessage()
	{
		return m_message;
	}

	@Override
	public int getLine()
	{
		return m_line;
	}

	@Override
	public void setQuickFix( QuickFix id )
	{
		m_quickFix = id;
	}

	@Override
	public IssueSeverity getSeverity()
	{
		return m_severity;
	}

	@Override
	public void adaptMarker( IMarker marker )
	{
		try
		{
			// Set the marker message
			marker.setAttribute( IMarker.MESSAGE, m_message);
			// Set the quick fix id if any 
			if (m_quickFix != null)
			{
				marker.setAttribute(IIssue.QUICK_FIX_ID, m_quickFix.name());
			}
			// Set the line only if the issue has it (there may be issues
			// applying to the whole resource 
			if (m_node != null)
			{
				marker.setAttribute( IMarker.LINE_NUMBER, m_node.beginLine );
			}
			else if (m_line != -1)
			{
				marker.setAttribute( IMarker.LINE_NUMBER, m_line );
			}
			// Set the char interval only if the issue has it (there may be issues
			// applying to the whole resource 
			if (m_node != null)
			{
				if (m_start == -1)
				{
					m_start = TokenHelper.getStartOffset( marker.getResource(), m_node );
					m_end = TokenHelper.getTokenLength(marker.getResource(), m_node, false) + m_start;
				}
				marker.setAttribute( IMarker.CHAR_START, m_start);
				marker.setAttribute( IMarker.CHAR_END, m_end);
			}
			else if ((m_start != -1)&&(m_end != -1))
			{
				marker.setAttribute( IMarker.CHAR_START, m_start);
				marker.setAttribute( IMarker.CHAR_END, m_end);
			}
			// Set the severity, it will be used in the problems view to
			// classify the markers by severity. IMPORTANT! the severity
			// attribute in the extension point for the annotations must
			// be left empty, otherwise icons and other preferences of the
			// markers are ignored and overriden by eclipse defaults
			switch(m_severity)
			{
			case INFORMATION:
				marker.setAttribute( IMarker.SEVERITY, IMarker.SEVERITY_INFO);
				break;
			case WARNING:
				marker.setAttribute( IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
				break;
			case ERROR:
				marker.setAttribute( IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
				break;
			}
			// Save memory: we dont need the reference to node anymore
			m_node = null;
		}
		catch(CoreException ex)
		{
			ex.printStackTrace();
		}

	}

	@Override
	public int getColStart(IResource resource) {
		if (m_start != -1)
			return m_start;
		if (m_node != null){
			final int[] col = new int[]{m_node.beginColumn};
			try {
				m_node.traverse(new VisitorBase() {
					
					@Override
					protected Object unhandled_node(SimpleNode node) throws Exception {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public void traverse(SimpleNode node) throws Exception {
						if (node.beginColumn < col[0]){
							col[0] = node.beginColumn;
						}
						node.traverse(this);
					}
				});
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return col[0];
		}
		return 0;
	}

	@Override
	public int getColEnd(final IResource resource) {
		if (m_end != -1)
			return m_end;
		if (m_node != null){
			int length = TokenHelper.getTokenLength(resource, m_node, false);
			
			return length + getColStart(resource);
		}
			
		return 0;
	}

	@Override
	public String getQuickFix() {
		if (m_quickFix != null)
			return m_quickFix.name();
		return null;
	}
}
