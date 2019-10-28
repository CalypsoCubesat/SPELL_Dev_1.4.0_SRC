///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.processing
// 
// FILE      : EventDispatcher.java
//
// DATE      : Mar 22, 2011
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
package com.astra.ses.spell.dev.scheck.processing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.python.pydev.parser.jython.SimpleNode;
import org.python.pydev.parser.jython.Visitor;
import org.python.pydev.parser.jython.ast.Assign;
import org.python.pydev.parser.jython.ast.Attribute;
import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.Dict;
import org.python.pydev.parser.jython.ast.For;
import org.python.pydev.parser.jython.ast.FunctionDef;
import org.python.pydev.parser.jython.ast.Import;
import org.python.pydev.parser.jython.ast.ImportFrom;
import org.python.pydev.parser.jython.ast.ListComp;
import org.python.pydev.parser.jython.ast.Str;
import org.python.pydev.parser.jython.ast.StrJoin;
import org.python.pydev.parser.jython.ast.Subscript;
import org.python.pydev.parser.jython.ast.While;

import com.astra.ses.spell.dev.scheck.interfaces.EventType;
import com.astra.ses.spell.dev.scheck.interfaces.IEvent;
import com.astra.ses.spell.dev.scheck.interfaces.IEventRuleChecker;
import com.astra.ses.spell.dev.scheck.interfaces.IIssue;
import com.astra.ses.spell.dev.scheck.interfaces.IIssueList;
import com.astra.ses.spell.dev.scheck.interfaces.IssueFactory;

public class EventDispatcher extends Visitor implements IEventDispatcher  
{
	private Map<EventType,List<IEventRuleChecker>> m_listeners;
	private IIssueList m_issues;
	private IProgressMonitor m_monitor;
	private int m_currentLine;
	private int m_totalLines;
	
	/**************************************************************************
	* 
	**************************************************************************/
	public EventDispatcher()
	{
		m_listeners = new HashMap<EventType,List<IEventRuleChecker>>();
		m_issues = null;
	}
	
	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public void initialize( IResource resource, int totalLines, IProgressMonitor monitor )
	{
		m_issues = IssueFactory.createIssueList(resource);
		m_monitor = monitor;
		m_totalLines = totalLines;
		m_currentLine = 0;
	}

	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public void finalize()
	{
		if (m_currentLine < m_totalLines)
		{
			m_monitor.worked( m_totalLines - m_currentLine );
		}
		if (m_issues != null) m_issues.clear();
	}

	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public void gatherIssues( IIssueList issues )
	{
		for(IIssue issue : m_issues.getIssues())
		{
			issues.addIssue(issue);
			if (m_monitor.isCanceled()) return;
		}
	}
	
	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public void registerForEvent( EventType event, IEventRuleChecker listener) 
	{
		if (m_listeners.containsKey(event))
		{
			if (!m_listeners.get(event).contains(listener))
			{
				m_listeners.get(event).add(listener);
			}
		}
		else
		{
			List<IEventRuleChecker> list = new ArrayList<IEventRuleChecker>();
			list.add(listener);
			m_listeners.put(event, list );
		}
	}

	/**************************************************************************
	* 
	**************************************************************************/
	private void updateStatus( SimpleNode node )
	{
		if (m_currentLine < node.beginLine )
		{
			int diff = (node.beginLine - m_currentLine);
			m_monitor.worked(diff);
			m_currentLine = node.beginLine;
		}
	}

	/**************************************************************************
	* 
	**************************************************************************/
	//public HashMap<IEventRuleChecker,Long> times_Taken = new HashMap<IEventRuleChecker, Long>();
	private boolean dispatch( IEvent event, List<IEventRuleChecker> list ) throws Exception
	{
		
		for(IEventRuleChecker checker : list)
		{
			try
			{
				//m_monitor.subTask( "Rule checker: " + checker.getName() );
				if (m_monitor.isCanceled()) 
				{
					return false;
				}
				//long start = System.nanoTime();
				checker.notifyEvent(event, m_issues);
				//long dur = System.nanoTime() - start;
				//System.out.println("Checker Dispatch "+checker+" time taken: " + (dur / 1000000) + " ms");
				//Long timeTaken = times_Taken.get(checker);
				//if (timeTaken == null)
				//	timeTaken = 0L;
				//times_Taken.put(checker, timeTaken + dur);
				if (m_monitor.isCanceled()) 
				{
					return false;
				}
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		return true;
	}

	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public Object visitCall( Call node ) throws Exception
	{
		if (m_monitor.isCanceled()) 
		{
			return null;
		}
		try {
			updateStatus(node);
			if (m_listeners.containsKey(EventType.FUNCTION_CALL))
			{
				IEvent event = new ParseEvent( EventType.FUNCTION_CALL, node );
				if (dispatch(event, m_listeners.get(EventType.FUNCTION_CALL) ))
				{
					return super.visitCall(node);
				}
			}
			else
			{
				return super.visitCall(node);
			}
		} catch (NullPointerException ex){
			ex.printStackTrace();
		}
		return null;
	}

	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public Object visitFunctionDef( FunctionDef def ) throws Exception
	{
		if (m_monitor.isCanceled()) 
		{
			return null;
		}
		updateStatus(def);
		if (m_listeners.containsKey(EventType.FUNCTION_DEF))
		{
			IEvent event = new ParseEvent( EventType.FUNCTION_DEF, def );
			if (dispatch(event, m_listeners.get(EventType.FUNCTION_DEF) ))
			{
				return super.visitFunctionDef(def);
			}
		}
		else
		{
			return super.visitFunctionDef(def);
		}
		return null;
	}

	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public Object visitStr( Str str ) throws Exception
	{
		if (m_monitor.isCanceled()) 
		{
			return null;
		}
		updateStatus(str);
		if (m_listeners.containsKey(EventType.STRING_LITERAL))
		{
			IEvent event = new ParseEvent( EventType.STRING_LITERAL, str );
			if (dispatch(event, m_listeners.get(EventType.STRING_LITERAL) ))
			{
				return super.visitStr(str);
			}
		}
		else
		{
			return super.visitStr(str);
		}
		return null;
	}

	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public Object visitAssign( Assign assign ) throws Exception
	{
		if (m_monitor.isCanceled()) 
		{
			return null;
		}
		updateStatus(assign);
		if (m_listeners.containsKey(EventType.ASSIGN))
		{
			IEvent event = new ParseEvent( EventType.ASSIGN, assign );
			if (dispatch(event, m_listeners.get(EventType.ASSIGN) ))
			{
				return super.visitAssign(assign);
			}
		}
		else
		{
			return super.visitAssign(assign);
		}
		return null;
	}
	
	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public Object visitStrJoin( StrJoin str ) throws Exception
	{
		if (m_monitor.isCanceled()) 
		{
			return null;
		}
		updateStatus(str);
		if (m_listeners.containsKey(EventType.STRING_LITERAL))
		{
			IEvent event = new ParseEvent( EventType.STRING_LITERAL, str );
			if (dispatch(event, m_listeners.get(EventType.STRING_LITERAL) ))
			{
				return super.visitStrJoin(str);
			}
		}
		else
		{
			return super.visitStrJoin(str);
		}
		return null;
	}

	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public Object visitImport( Import impt ) throws Exception
	{
		if (m_monitor.isCanceled()) 
		{
			return null;
		}
		updateStatus(impt);
		if (m_listeners.containsKey(EventType.IMPORT))
		{
			IEvent event = new ParseEvent( EventType.IMPORT, impt );
			if (dispatch(event, m_listeners.get(EventType.IMPORT) ))
			{
				return super.visitImport(impt);
			}
		}
		else
		{
			return super.visitImport(impt);
		}
		return null;
	}

	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public Object visitImportFrom( ImportFrom impt ) throws Exception
	{
		if (m_monitor.isCanceled()) 
		{
			return null;
		}
		updateStatus(impt);
		if (m_listeners.containsKey(EventType.IMPORT_FROM))
		{
			IEvent event = new ParseEvent( EventType.IMPORT_FROM, impt );
			if (dispatch(event, m_listeners.get(EventType.IMPORT_FROM) ))
			{
				return super.visitImportFrom(impt);
			}
		}
		else
		{
			return super.visitImportFrom(impt);
		}
		return null;
	}

	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public Object visitFor( For ffor ) throws Exception
	{
		if (m_monitor.isCanceled()) 
		{
			return null;
		}
		updateStatus(ffor);
		if (m_listeners.containsKey(EventType.FOR_LOOP))
		{
			IEvent event = new ParseEvent( EventType.FOR_LOOP, ffor );
			if (dispatch(event, m_listeners.get(EventType.FOR_LOOP) ))
			{
				return super.visitFor(ffor);
			}
		}
		else
		{
			return super.visitFor(ffor);
		}
		return null;
	}

	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public Object visitWhile( While wwhile ) throws Exception
	{
		if (m_monitor.isCanceled()) 
		{
			return null;
		}
		updateStatus(wwhile);
		if (m_listeners.containsKey(EventType.WHILE_LOOP))
		{
			IEvent event = new ParseEvent( EventType.WHILE_LOOP, wwhile );
			if (dispatch(event, m_listeners.get(EventType.WHILE_LOOP) ))
			{
				return super.visitWhile(wwhile);
			}
		}
		else
		{
			return super.visitWhile(wwhile);
		}
		return null;
	}

	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public Object visitAttribute( Attribute attr ) throws Exception
	{
		if (m_monitor.isCanceled()) 
		{
			return null;
		}
		updateStatus(attr);
		if (m_listeners.containsKey(EventType.ATTRIBUTE))
		{
			IEvent event = new ParseEvent( EventType.ATTRIBUTE, attr );
			if (dispatch(event, m_listeners.get(EventType.ATTRIBUTE) ))
			{
				return super.visitAttribute(attr);
			}
		}
		else
		{
			return super.visitAttribute(attr);
		}
		return null;
	}

	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public Object visitSubscript( Subscript subs ) throws Exception
	{
		if (m_monitor.isCanceled()) 
		{
			return null;
		}
		updateStatus(subs);
		if (m_listeners.containsKey(EventType.SUBSCRIPT))
		{
			IEvent event = new ParseEvent( EventType.SUBSCRIPT, subs );
			if (dispatch(event, m_listeners.get(EventType.SUBSCRIPT) ))
			{
				return super.visitSubscript(subs);
			}
		}
		else
		{
			return super.visitSubscript(subs);
		}
		return null;
	}

	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public Object visitList( org.python.pydev.parser.jython.ast.List list ) throws Exception
	{
		if (m_monitor.isCanceled()) 
		{
			return null;
		}
		updateStatus(list);
		if (m_listeners.containsKey(EventType.LIST))
		{
			IEvent event = new ParseEvent( EventType.LIST, list );
			if (dispatch(event, m_listeners.get(EventType.LIST) ))
			{
				return super.visitList(list);
			}
		}
		else
		{
			return super.visitList(list);
		}
		return null;
	}

	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public Object visitListComp( ListComp list ) throws Exception
	{
		if (m_monitor.isCanceled()) 
		{
			return null;
		}
		updateStatus(list);
		if (m_listeners.containsKey(EventType.LIST))
		{
			IEvent event = new ParseEvent( EventType.LIST, list );
			if (dispatch(event, m_listeners.get(EventType.LIST) ))
			{
				return super.visitListComp(list);
			}
		}
		else
		{
			return super.visitListComp(list);
		}
		return null;
	}

	/**************************************************************************
	* 
	**************************************************************************/
	@Override
	public Object visitDict( Dict dict ) throws Exception
	{
		if (m_monitor.isCanceled()) 
		{
			return null;
		}
		updateStatus(dict);
		if (m_listeners.containsKey(EventType.DICT))
		{
			IEvent event = new ParseEvent( EventType.DICT, dict);
			if (dispatch(event, m_listeners.get(EventType.DICT) ))
			{
				return super.visitDict(dict);
			}
		}
		else
		{
			return super.visitDict(dict);
		}
		return null;
	}
}
