///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.event.functions
// 
// FILE      : FunctionBody.java
//
// DATE      : Apr 28, 2014
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
package com.astra.ses.spell.dev.scheck.event.functions;

import java.util.LinkedList;
import java.util.List;

import org.python.pydev.parser.jython.SimpleNode;
import org.python.pydev.parser.jython.Visitor;
import org.python.pydev.parser.jython.ast.Assign;
import org.python.pydev.parser.jython.ast.FunctionDef;
import org.python.pydev.parser.jython.ast.Import;
import org.python.pydev.parser.jython.ast.ImportFrom;
import org.python.pydev.parser.jython.ast.Name;
import org.python.pydev.parser.jython.ast.NameTok;
import org.python.pydev.parser.jython.ast.Tuple;
import org.python.pydev.parser.jython.ast.aliasType;
import org.python.pydev.parser.jython.ast.exprType;

import com.astra.ses.spell.dev.scheck.interfaces.IIssueList;
import com.astra.ses.spell.dev.scheck.interfaces.IssueFactory;

public class FunctionBody
{
	private String      m_name;
	private int		    m_begin;
	private int		    m_end;
	private FunctionDef	m_def;
	private List<String>  m_assignedItems;
	private List<String>  m_importedItems;
	private List<String>  m_importedModules;
	private List<String>  m_argumentNames;
	private IIssueList    m_issues;
	 
	/************************************************************************************
	 * Constructor.
	 * @param m_def
	 ***********************************************************************************/
	FunctionBody( FunctionDef def, IIssueList issues )
	{
		this.m_def = def;
		m_name = ((NameTok) def.name).id;
		m_begin = def.beginLine;
		m_assignedItems = new LinkedList<String>();
		m_importedItems = new LinkedList<String>();
		m_importedModules = new LinkedList<String>();
		m_argumentNames = new LinkedList<String>();
		m_issues = issues;
		processArguments();
		processBody();
	}

	/************************************************************************************
	 * Get function name
	 ***********************************************************************************/
	public String getName()
	{
		return m_name;
	}

	/************************************************************************************
	 * Get function definition statements
	 ***********************************************************************************/
	public final FunctionDef getDef()
	{
		return m_def;
	}

	/************************************************************************************
	 * Check if line is contained
	 ***********************************************************************************/
	public boolean contains( int lineNo )
	{
		return (m_begin <= lineNo) && (lineNo <= m_end);
	}

	/************************************************************************************
	 * Check if a given m_name belongs to the function arguments
	 ***********************************************************************************/
	public boolean isArgument( String name )
	{
		return m_argumentNames.contains(name);
	}

	/************************************************************************************
	 * Check if a given m_name belongs to the function imported or assigned items
	 ***********************************************************************************/
	public boolean isDeclared( String name )
	{
		return m_assignedItems.contains(name) || m_importedItems.contains(name);
	}

	/************************************************************************************
	 * Check if a given m_name belongs to the function imported or assigned items
	 ***********************************************************************************/
	public boolean isImportedModule( String name )
	{
		return m_importedModules.contains(name);
	}

	/************************************************************************************
	 * Extract information from the function body
	 ***********************************************************************************/
	private void processBody()
	{
		Visitor v = new Visitor() {

			public void traverse(SimpleNode node) throws Exception 
			{
		        node.traverse(this);
		        if (m_end<node.beginLine) m_end = node.beginLine;
		    }
			
		    public Object visitAssign(Assign node) throws Exception 
		    {
				for(exprType target : node.targets)
				{
					if (target instanceof Name)
					{
						String tn = ((Name) target).id;
						if (!m_assignedItems.contains(tn))
						{
							m_assignedItems.add(tn);
						}
					}
					else if (target instanceof Tuple)
					{
						Tuple tp = (Tuple) target;
						for(exprType expr : tp.elts)
						{
							if (expr instanceof Name)
							{
								String tn = ((Name) expr).id;
								if (!m_assignedItems.contains(tn))
								{
									m_assignedItems.add(tn);
								}
							}
						}
					}
				}
		        return super.visitAssign(node);
		    }
		    
		    public Object visitImport( Import impt ) throws Exception
		    {
				for (aliasType alias : impt.names)
				{
					if (alias.name instanceof NameTok)
					{
						String moduleName = ((NameTok) alias.name).id;
						
						// Store the imported module and raise a warning when imported twice
						if (!m_importedModules.contains(moduleName))
						{
							m_importedModules.add(moduleName);
						}
						else
						{
							m_issues.addIssue(IssueFactory.createWarningIssue("Module '" + moduleName + "' is already imported", alias.name));
						}
						
						if (FunctionCallConsistencyChecker.discouragedModules.contains(moduleName))
						{
							m_issues.addIssue(IssueFactory.createWarningIssue("Using module '" + moduleName + "' is discouraged", alias.name));
						}

						
						if (alias.asname != null && alias.asname instanceof NameTok)
						{
							NameTok nt = (NameTok) alias.asname;
							if (m_importedModules.contains(nt.id))
							{
								m_issues.addIssue(IssueFactory.createWarningIssue("Module '" + moduleName + "' is already imported as '" + nt.id
									        + "'", alias.asname));
							}
						}
					}
				}
		    	return super.visitImport(impt);
		    }
		    
		    public Object visitImportFrom( ImportFrom impt ) throws Exception
		    {
				if (impt.module instanceof NameTok)
				{
					if (impt.names.length == 0) // from module import *
					{
						m_issues.addIssue(IssueFactory.createWarningIssue(
						        "Use of wildcard on imports is strongly discouraged. Module functions cannot be checked", impt));
					}
					else
					{
						for (aliasType alias : impt.names)
						{
							String importedItem = ((NameTok) alias.name).id;
							if (m_importedItems.contains(importedItem))
							{
								m_issues.addIssue(IssueFactory
								        .createWarningIssue("Object '" + importedItem + "' is already imported", alias.name));
								continue;
							}
							if (alias.asname != null)
							{
								String importedAlias = ((NameTok) alias.asname).id;
								if (m_importedItems.contains(importedAlias))
								{
									m_issues.addIssue(IssueFactory.createWarningIssue("Alias '" + importedAlias + "' is already used",
									        alias.asname));
									continue;
								}
								m_importedItems.add(importedAlias);
							}
							else
							{
								m_importedItems.add(importedItem);
							}
						}
					}
				}
				return super.visitImportFrom(impt);
		    }
		};
		try
        {
	        v.visit(m_def.body);
        }
        catch (Exception e)
        {
	        e.printStackTrace();
        }
	}
	
	/************************************************************************************
	 * Extract information from the function arguments
	 ***********************************************************************************/
	private void processArguments()
	{
		Visitor av = new Visitor()
		{
			public Object visitName(Name node) throws Exception
			{
				m_argumentNames.add(node.id);
				return super.visitName(node);
			}

			public Object visitNameTok(NameTok node) throws Exception
			{
				m_argumentNames.add(node.id);
				return super.visitNameTok(node);
			}
		};
		try
		{
			av.visit(m_def.args);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
