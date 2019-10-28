///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.dev.scheck.event.functions
//
// FILE      : FunctionCallConsistencyChecker.java
//
// DATE      : Feb 15, 2011
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.python.pydev.parser.jython.SimpleNode;
import org.python.pydev.parser.jython.ast.Assign;
import org.python.pydev.parser.jython.ast.Attribute;
import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.Dict;
import org.python.pydev.parser.jython.ast.For;
import org.python.pydev.parser.jython.ast.FunctionDef;
import org.python.pydev.parser.jython.ast.Import;
import org.python.pydev.parser.jython.ast.ImportFrom;
import org.python.pydev.parser.jython.ast.ListComp;
import org.python.pydev.parser.jython.ast.Name;
import org.python.pydev.parser.jython.ast.NameTok;
import org.python.pydev.parser.jython.ast.Tuple;
import org.python.pydev.parser.jython.ast.aliasType;
import org.python.pydev.parser.jython.ast.argumentsType;
import org.python.pydev.parser.jython.ast.exprType;

import com.astra.ses.spell.dev.scheck.UserLibRegistry;
import com.astra.ses.spell.dev.scheck.interfaces.AbstractEventRuleChecker;
import com.astra.ses.spell.dev.scheck.interfaces.IEvent;
import com.astra.ses.spell.dev.scheck.interfaces.IEventRuleChecker;
import com.astra.ses.spell.dev.scheck.interfaces.IIssueList;
import com.astra.ses.spell.dev.scheck.interfaces.IssueFactory;
import com.astra.ses.spell.dev.scheck.processing.KnownFunctionsRegistry;

public class FunctionCallConsistencyChecker extends AbstractEventRuleChecker implements IEventRuleChecker
{
	private static final String[]	dictMethodsStr	= { "clear", "copy", "fromkeys", "get", "has_key", "items", "iteritems", "iterkeys",
	        "itervalues", "keys", "pop", "popitem", "setdefault", "update", "values" };
	private static final String[]	listMethodsStr	= { "append", "count", "extend", "index", "insert", "pop", "remove", "reverse", "sort" };
	private static final String[]	tupleMethodsStr	= { "count", "index" };
	private static final String[]	discouragedModulesStr	= { "os", "sys", "time" };

	
	
	private static List<String> dictMethods = Arrays.asList( dictMethodsStr );
	private static List<String> listMethods = Arrays.asList( listMethodsStr );
	private static List<String> tupleMethods = Arrays.asList( tupleMethodsStr );
	
	static List<String> discouragedModules = Arrays.asList( discouragedModulesStr );

	private Map<String, FunctionBody>	m_declaredFunctions;
	private List<String>	            m_globallyImportedItems;
	private List<String>	            m_globallyAssignedItems;
	private List<String>	            m_globallyImportedModules;
	private List<Call>	                m_calledFunctions;

	/**************************************************************************
	 * 
	 *************************************************************************/
	@Override
	public String getName()
	{
		return "function call consistency checker";
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	@Override
	public void notifyEvent(IEvent event, IIssueList issues)
	{
		switch (event.getType())
		{
		case FUNCTION_CALL:
			processCall(event, issues);
			break;
		case FUNCTION_DEF:
			processDef(event, issues);
			break;
		case IMPORT:
			processImport(event, issues);
			break;
		case IMPORT_FROM:
			processImportFrom(event, issues);
			break;
		case ASSIGN:
			processAssign(event, issues);
			break;
		case FOR_LOOP:
			processFor(event, issues);
			break;
		case ATTRIBUTE:
			processAttribute(event, issues);
			break;
		case LIST:
			if (event.getNode() instanceof ListComp)
			{
				processListComp(event, issues);
			}
			break;
		default: 
			System.err.println("UNPROCESSED EVENT IN FunctionCallConsistencyChecker: " + event.getType());
			break;
		}
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	@Override
	public void notifyParsingStarted(IIssueList issues)
	{
		super.notifyParsingStarted(issues);
		m_declaredFunctions = new TreeMap<String, FunctionBody>();
		m_globallyImportedItems = new ArrayList<String>();
		m_globallyAssignedItems = new ArrayList<String>();
		m_globallyImportedModules = new ArrayList<String>();
		m_calledFunctions = new ArrayList<Call>();
	}

	/**************************************************************************
	 * 
	 *************************************************************************/
	@Override
	public void notifyParsingFinished(IIssueList issues)
	{
		List<String> processableFunctions = checkCallConsistency(issues);
		checkArgumentsConsistency(processableFunctions, issues);
		m_declaredFunctions.clear();
		m_calledFunctions.clear();
		m_globallyImportedItems.clear();
		m_globallyAssignedItems.clear();
		m_globallyImportedModules.clear();
	}

	/**************************************************************************
	 * Process a function call event
	 * 
	 * @param event
	 * @param issues
	 *************************************************************************/
	private void processCall(IEvent event, IIssueList issues)
	{
		Call call = (Call) event.getNode();
		try
		{
			// It is calling a builtin function or a function supposedly
			// declared in the procedure
			if (call.func instanceof Name || call.func instanceof Attribute)
			{
				m_calledFunctions.add(call);
			}
		}
		catch (Exception ex)
		{
			issues.addIssue(IssueFactory.createErrorIssue("Internal error processing token " + call + ": " + ex.getLocalizedMessage(), call));
		}
	}

	/**************************************************************************
	 * Process an assignment event
	 * 
	 * @param event
	 * @param issues
	 *************************************************************************/
	private void processAssign(IEvent event, IIssueList issues)
	{
		Assign assign = (Assign) event.getNode();
		// Do not re-process lines in functions
		if (getContainingFunction(assign.beginLine) != null) return;
		try
		{
			for(exprType target : assign.targets)
			{
				if (target instanceof Name)
				{
					String tn = ((Name) target).id;
					if (!m_globallyAssignedItems.contains(tn))
					{
						m_globallyAssignedItems.add(tn);
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
							if (!m_globallyAssignedItems.contains(tn))
							{
								m_globallyAssignedItems.add(tn);
							}
						}
					}
				}
			}
		}
		catch (Exception ex)
		{
			issues.addIssue(IssueFactory.createErrorIssue("Internal error processing token " + assign + ": " + ex.getLocalizedMessage(),
			        assign));
		}
	}

	/**************************************************************************
	 * Process an assignment event
	 * 
	 * @param event
	 * @param issues
	 *************************************************************************/
	private void processListComp(IEvent event, IIssueList issues)
	{
		ListComp lc = (ListComp) event.getNode();
		// Do not re-process lines in functions
		if (getContainingFunction(lc.beginLine) != null) return;
		try
		{
			if (lc.elt instanceof Name)
			{
				Name name = (Name) lc.elt;
				m_globallyAssignedItems.add(name.id);
			}
		}
		catch (Exception ex)
		{
			issues.addIssue(IssueFactory.createErrorIssue("Internal error processing token " + lc + ": " + ex.getLocalizedMessage(),
			        lc));
		}
	}

	/**************************************************************************
	 * Process an for loop event
	 * 
	 * @param event
	 * @param issues
	 *************************************************************************/
	private void processFor(IEvent event, IIssueList issues)
	{
		For ffor = (For) event.getNode();
		try
		{
			if (ffor.target instanceof Name)
			{
				m_globallyAssignedItems.add( ((Name)ffor.target).id ); 
			}
		}
		catch (Exception ex)
		{
			issues.addIssue(IssueFactory.createErrorIssue("Internal error processing token: " + ex.getLocalizedMessage(), ffor));
		}
	}

	/**************************************************************************
	 * Process an attribute event
	 * 
	 * @param event
	 * @param issues
	 *************************************************************************/
	private void processAttribute(IEvent event, IIssueList issues)
	{
		Attribute attr = (Attribute) event.getNode();
		try
		{
			if ( attr.value instanceof Name )
			{
				String name = ((Name)attr.value).id;
				if (!m_globallyAssignedItems.contains(name) && 
					!m_globallyImportedItems.contains(name) && 
					!m_globallyImportedModules.contains(name) &&
					!name.startsWith("spell") &&
					!name.equals("TIME") && // We need to do this TIME check as TIME has static methods
					!name.equals("ARGS") &&
					!name.equals("PROC") &&
					!name.equals("IVARS") )
				{
					FunctionBody body = getContainingFunction(attr.value.beginLine);
					if (body != null)
					{
						if (!body.isArgument(name) && !body.isDeclared(name) && !body.isImportedModule(name))
						{
							//issues.addIssue(IssueFactory.createErrorIssue("Unknown name '" + name + "'", attr.value));
						}
					}
					else
					{
						//issues.addIssue(IssueFactory.createErrorIssue("Unknown name '" + name + "'", attr.value));
					}
				}
			}
		}
		catch (Exception ex)
		{
			issues.addIssue(IssueFactory.createErrorIssue("Internal error processing token: " + ex.getLocalizedMessage(), attr));
		}
	}

	/**************************************************************************
	 * Process a function import event
	 * 
	 * @param event
	 * @param issues
	 *************************************************************************/
	private void processImport(IEvent event, IIssueList issues)
	{
		Import impt = (Import) event.getNode();
		// Do not re-process lines in functions
		if (getContainingFunction(impt.beginLine) != null) return;
		try
		{
			for (aliasType alias : impt.names)
			{
				if (alias.name instanceof NameTok)
				{
					String moduleName = ((NameTok) alias.name).id;
					if (m_globallyImportedModules.contains(moduleName))
					{
						issues.addIssue(IssueFactory.createWarningIssue("Module '" + moduleName + "' is already imported", alias.name));
						continue;
					}
					if (discouragedModules.contains(moduleName))
					{
						issues.addIssue(IssueFactory.createWarningIssue("Using module '" + moduleName + "' is discouraged", alias.name));
					}
					if (alias.asname != null && alias.asname instanceof NameTok)
					{
						NameTok nt = (NameTok) alias.asname;
						if (m_globallyImportedModules.contains(nt.id))
						{
							issues.addIssue(IssueFactory.createWarningIssue("Module '" + moduleName + "' is already imported as '" + nt.id
							        + "'", alias.asname));
							continue;
						}
						m_globallyImportedModules.add(nt.id);
					}
					// No alias
					else
					{
						m_globallyImportedModules.add(moduleName);
					}
				}
			}
		}
		catch (Exception ex)
		{
			issues.addIssue(IssueFactory.createErrorIssue("Internal error processing token " + impt + ": " + ex.getLocalizedMessage(), impt));
		}
	}

	/**************************************************************************
	 * Process a function import event
	 * 
	 * @param event
	 * @param issues
	 *************************************************************************/
	private void processImportFrom(IEvent event, IIssueList issues)
	{
		ImportFrom impt = (ImportFrom) event.getNode();
		// Do not re-process lines in functions
		if (getContainingFunction(impt.beginLine) != null) return;
		try
		{
			if (impt.module instanceof NameTok)
			{
				if (impt.names.length == 0) // from module import *
				{
					issues.addIssue(IssueFactory.createWarningIssue(
					        "Use of wildcard on imports is strongly discouraged. Module functions cannot be checked", impt));
				}
				else
				{
					for (aliasType alias : impt.names)
					{
						String importedItem = ((NameTok) alias.name).id;
						if (m_globallyImportedItems.contains(importedItem))
						{
							issues.addIssue(IssueFactory
							        .createWarningIssue("Object '" + importedItem + "' is already imported", alias.name));
							continue;
						}
						if (alias.asname != null)
						{
							String importedAlias = ((NameTok) alias.asname).id;
							if (m_globallyImportedItems.contains(importedAlias))
							{
								issues.addIssue(IssueFactory.createWarningIssue("Alias '" + importedAlias + "' is already used",
								        alias.asname));
								continue;
							}
							m_globallyImportedItems.add(importedAlias);
						}
						else
						{
							m_globallyImportedItems.add(importedItem);
						}
					}
				}
			}
		}
		catch (Exception ex)
		{
			issues.addIssue(IssueFactory.createErrorIssue("Internal error processing token " + impt + ": " + ex.getLocalizedMessage(), impt));
		}
	}

	/**************************************************************************
	 * Process a function definition event
	 * 
	 * @param event
	 * @param issues
	 *************************************************************************/
	private void processDef(IEvent event, IIssueList issues)
	{
		FunctionBody body = new FunctionBody((FunctionDef) event.getNode(), issues);
		try
		{
			m_declaredFunctions.put(body.getName(), body);
		}
		catch (Exception ex)
		{
			issues.addIssue(IssueFactory.createErrorIssue("Internal error processing token " + body.getDef() + ": " + ex.getLocalizedMessage(),
			        body.getDef()));
		}
	}

	/**************************************************************************
	 * Check a function name against declared and imported items
	 *************************************************************************/
	private void checkFunctionName( String name, SimpleNode node, IIssueList issues, List<FunctionDef> matchedLocalFunctions, List<String> matchedImportedItems )
	{
		// Check match with discouraged functions
		if (KnownFunctionsRegistry.instance().isDiscouragedFunction(name))
		{
			issues.addIssue(IssueFactory.createWarningIssue("Discouraged function: '" + name + "'", node));
		}
		else
		// Not discouraged
		{
			// Check existence in declared functions
			boolean found = false;
			if (m_declaredFunctions.containsKey(name))
			{
				found = true;
				FunctionDef def = m_declaredFunctions.get(name).getDef();
				matchedLocalFunctions.add(def);
			}

			if (!found) if (m_globallyImportedItems.contains(name))
			{
				found = true;
				matchedImportedItems.add(name);
			}

			if (!found) // Function not declared locally nor imported
			{
				// Check existence in userlib
				if (!UserLibRegistry.instance().isUserLibFunction(issues.getResource().getProject(), name))
				{
					// Not userlib, check existence in known functions
					if (!KnownFunctionsRegistry.instance().isKnownFunction(name))
					{
						// checked by pydev analysis
						//issues.addIssue(IssueFactory.createErrorIssue("Unknown function: '" + name + "'", node));
					}
				}
			}
		}
	}
	
	/**************************************************************************
	 * Check the consistency of function calls. Functions shall be known, or be
	 * SPELL functions, or be declared in the procedure
	 * 
	 * @param issues
	 * @return The list of functions that can be processed in further checks
	 *************************************************************************/
	private List<String> checkCallConsistency(IIssueList issues)
	{
		List<FunctionDef> matchedLocalFunctions = new ArrayList<FunctionDef>();
		List<String> matchedImportedItems = new ArrayList<String>();
		List<String> processableFunctions = new ArrayList<String>();

		// Check discouraged functions, declared functions, userlib functions
		for (Call call : m_calledFunctions)
		{
			if (call.func instanceof Name)
			{
				String name = ((Name) call.func).id;

				checkFunctionName( name, call, issues, matchedLocalFunctions, matchedImportedItems );
			}
			// It is a call of a module function
			else if (call.func instanceof Attribute)
			{
				// For the time being just check that the module has been
				// imported
				exprType value = ((Attribute) call.func).value;
				while (value instanceof Attribute)
				{
					value = ((Attribute) value).value;
				}

				if (value instanceof Tuple)
				{
					// Tuple case: if the tuple has a single element, WHICH CAN BE A BINOP
					// operation, then we cannot evaluate it as we don't know what is inside.
					Tuple tuple = (Tuple) value;
					Attribute attr = (Attribute) call.func;
					NameTok lmethod = (NameTok) attr.attr;
					if (tuple.elts.length>1)
					{
						if (!tupleMethods.contains(lmethod))
						{
							issues.addIssue(IssueFactory.createErrorIssue("Invalid method call '" + lmethod.id + "' on a tuple", lmethod));
						}
					}
				}
				else if (value instanceof org.python.pydev.parser.jython.ast.List)
				{
					// Check that the method called on the list is consistent
					Attribute attr = (Attribute) call.func;
					NameTok lmethod = (NameTok) attr.attr;
					if (!listMethods.contains(lmethod))
					{
						issues.addIssue(IssueFactory.createErrorIssue("Invalid method call '" + lmethod.id + "' on a list", lmethod));
					}
				}
				else if (value instanceof Dict)
				{
					// Check that the method called on the dictionary is consistent
					Attribute attr = (Attribute) call.func;
					NameTok lmethod = (NameTok) attr.attr;
					if (!dictMethods.contains(lmethod))
					{
						issues.addIssue(IssueFactory.createErrorIssue("Invalid method call '" + lmethod.id + "' on a dictionary", lmethod));
					}
				}
			}
		}

		for (FunctionBody body : m_declaredFunctions.values())
		{
			NameTok defName = (NameTok) body.getDef().name;
			if (!matchedLocalFunctions.contains(body.getDef()))
			{
				//issues.addIssue(IssueFactory.createWarningIssue("Declared function is never used: '" + defName.id + "'", body.getDef()));
			}
			else
			{
				processableFunctions.add(defName.id);
			}
		}

		return processableFunctions;
	}

	/**************************************************************************
	 * Check if a given name belongs to the body of a function
	 *************************************************************************/
	private FunctionBody getContainingFunction(int lineNo)
	{
		for (FunctionBody b : m_declaredFunctions.values())
		{
			if (b.contains(lineNo)) return b;
		}
		return null;
	}

	/**************************************************************************
	 * Check the consistency of function calls in terms of argument numbers
	 * 
	 * @param issues
	 *************************************************************************/
	private void checkArgumentsConsistency(List<String> processableFunctions, IIssueList issues)
	{
		for (Call call : m_calledFunctions)
		{
			if (!(call.func instanceof Name)) continue;
			String functionName = ((Name) call.func).id;
			if (processableFunctions.contains(functionName))
			{
				// Get the definition
				FunctionDef def = m_declaredFunctions.get(functionName).getDef();
				argumentsType args = (argumentsType) def.args;

				// If the definition has flexible positional or keyword
				// arguments, dont do checks
				if ((args.vararg == null) && (args.kwarg == null))
				{
					// This is the, in principle, amount of arguments in the
					// definition
					int numArgumentsInDef = args.args.length;

					// We will need to consider less args though, if there are
					// default values
					int numDefaultValues = 0;
					for (exprType type : args.defaults)
					{
						if (type != null) numDefaultValues++;
					}

					// Get the number of arguments in the call
					int numArgumentsInCall = call.args.length;

					// If the number of arguments in the call does not match the
					// number of arguments in the definition
					if (numArgumentsInCall != numArgumentsInDef)
					{
						// It may happen that there are default values: there is
						// an error if:
						// the number of required arguments AT LEAST is the
						// number of defined ones minus the number of defaults
						if (numArgumentsInDef < numArgumentsInCall)
						{
							issues.addIssue(IssueFactory.createErrorIssue("Too many arguments in function call, expected at maximum "
							        + numArgumentsInDef + ", found " + numArgumentsInCall, call));

						}
						else if (numArgumentsInDef > numArgumentsInCall)
						{
							// Less argument are given. At least it shall be the
							// # of mandatory arguments
							int numMandatory = numArgumentsInDef - numDefaultValues;
							if (numArgumentsInCall < numMandatory)
							{
								//issues.addIssue(IssueFactory.createErrorIssue(
								//        "Wrong number of arguments in function call, expected at least " + numMandatory + ", found "
								//                + numArgumentsInCall, call));
							}
						}
					}
				}
			}
		}
	}
}
