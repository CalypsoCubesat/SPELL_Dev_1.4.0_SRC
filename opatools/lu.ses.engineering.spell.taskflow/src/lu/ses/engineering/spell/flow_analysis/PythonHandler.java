package lu.ses.engineering.spell.flow_analysis;

import static lu.ses.engineering.spell.flow_analysis.PythonAction.FallBack;
import static lu.ses.engineering.spell.flow_analysis.PythonAction.None;

import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceStore;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Tuples;

import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;

import lu.ses.engineering.spell.controlflow.spell.BuildTC;
import lu.ses.engineering.spell.controlflow.spell.DisplayStep;
import lu.ses.engineering.spell.controlflow.spell.GetTM;
import lu.ses.engineering.spell.controlflow.spell.Goto;
import lu.ses.engineering.spell.controlflow.spell.Send;
import lu.ses.engineering.spell.controlflow.spell.SetLimits;
import lu.ses.engineering.spell.controlflow.spell.ShowTM;
import lu.ses.engineering.spell.controlflow.spell.SpellElement;
import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.Step;
import lu.ses.engineering.spell.controlflow.spell.Verify;
import lu.ses.engineering.spell.controlflow.spell.arglist;
import lu.ses.engineering.spell.controlflow.spell.argument;
import lu.ses.engineering.spell.controlflow.spell.assignment_stmt;
import lu.ses.engineering.spell.controlflow.spell.atom;
import lu.ses.engineering.spell.controlflow.spell.dotted_as_name;
import lu.ses.engineering.spell.controlflow.spell.else_if_stmt;
import lu.ses.engineering.spell.controlflow.spell.expr_stmt;
import lu.ses.engineering.spell.controlflow.spell.for_stmt;
import lu.ses.engineering.spell.controlflow.spell.fpdef;
import lu.ses.engineering.spell.controlflow.spell.funcdef;
import lu.ses.engineering.spell.controlflow.spell.if_stmt;
import lu.ses.engineering.spell.controlflow.spell.import_from;
import lu.ses.engineering.spell.controlflow.spell.import_name;
import lu.ses.engineering.spell.controlflow.spell.not_test;
import lu.ses.engineering.spell.controlflow.spell.power;
import lu.ses.engineering.spell.controlflow.spell.subscript;
import lu.ses.engineering.spell.controlflow.spell.suite;
import lu.ses.engineering.spell.controlflow.spell.testlist;
import lu.ses.engineering.spell.controlflow.spell.trailer;
import lu.ses.engineering.spell.controlflow.spell.try_stmt;
import lu.ses.engineering.spell.controlflow.spell.varargslist_element;
import lu.ses.engineering.spell.controlflow.spell.while_stmt;
import lu.ses.engineering.spell.controlflow.spell.yield_or_testlist;
import lu.ses.engineering.spell.refactoring.refactoringDefinition.Refactorings;
import lu.ses.engineering.spell.taskflow.digraph.DiGraph;
import lu.ses.engineering.spell.taskflow.digraph.DiGraphComment;
import lu.ses.engineering.spell.taskflow.digraph.DiGraphEdge;
import lu.ses.engineering.spell.taskflow.digraph.DiGraphNode;
import lu.ses.engineering.spell.taskflow.digraph.DiGraphProcedureCall;

public class PythonHandler {

	protected ArrayDeque<StepContext> oldBase = new ArrayDeque<StepContext>();
	
	private boolean fallback;

	protected StepContext origStepBaseObject;
	static enum Handler{
		ImportHandler(){
			@Override
			public PythonAction handle(PythonHandler handler,
					SpellElement current) {
				if (current instanceof import_name){
					import_name cur = (import_name) current;
					for (dotted_as_name dotted : cur.getDotted_as_names().getDotted_names()) {
						String identifier = dotted.getIdentifier();
						if (identifier == null)
							identifier = dotted.getName();
						String longName = dotted.getName();
						if (longName == null)
							longName = identifier;
						handler.imports.add(longName);
						PythonObject obj = new PythonObject(identifier, current);
						obj.setUnknownMembers(true);
						handler.getLocals().put(obj.getName(), obj);
						//System.out.println("registering import " + obj.getName() );
					}
				} else if (current instanceof import_from){
					
				}
				return PythonAction.None;
			}
		},
		FuncDefHandler(){
			@Override
			public PythonAction handle(PythonHandler handler,
					SpellElement current) {
				funcdef f = (funcdef) current;
				
				PythonObject obj = new PythonObject(f.getName(), f);
				
				if (f.getParameters().getVarargslist() != null){
					
				}
				
				handler.getLocals().put(obj.getName(), obj);
				//System.out.println("define function " + obj.getName() );
				//return PythonAction.StartSeperatedBranches.setSource(f);
						
				return PythonAction.None;
			}
			@Override
			public void join(PythonHandler handler1, PythonHandler handler2) {
				if (!handler2.fallback){
					StepContext lastContext = handler1.getLastContext();
					//lastContext.setDeadEnd(true);
					if (lastContext != handler2.getLastContext()){
						
						//lastContext.getId().clear();
						StepContext lastContext2 = handler2.getLastContext();
						lastContext.getId().addAll(lastContext2.getId());
					}
					//joinHandlerInLoop(handler1, handler2);
					//handler1.getLastContext().setDeadEnd(false);
					
				}
				super.join(handler1, handler2);
			}
			@Override
			public void initializeVariables(PythonHandler handler,
					SpellElement ele, PythonAction action) {
				funcdef f = (funcdef) ele;
				arglist vars = (arglist) action.getVars();
				Iterator<argument> iterator = Collections.EMPTY_LIST.iterator();
				if (vars != null){
					iterator = vars.getArguments().iterator();
				}
				
				//System.out.println("entering function " + f.getName() );
				if (f.getParameters().getVarargslist()!= null){
					for (varargslist_element vararg2 : f.getParameters().getVarargslist().getVarargs1()) {
						if (vararg2.getFpdef() != null){
							fpdef fpdef = vararg2.getFpdef();
							String varName = fpdef.getName();
							PythonObject pyObj = new PythonObject(varName,ele);
							handler.getLocals().put(varName, pyObj);
							if (iterator.hasNext()){
								argument arg = iterator.next();
								if (arg instanceof atom && ((atom) arg).getName() != null ){
									String origin = ((atom) arg).getName();
									PythonObject pythonObject = handler.getLocals().get(origin);
									if (pythonObject != null){
										for (SpellElement originObj : pythonObject.origin) {
											pyObj.origin.add(originObj);
										}
									}
								}
							}
						}
					}
					for (varargslist_element vararg2 : f.getParameters().getVarargslist().getVarargs3()) {
						if (vararg2.getFpdef() != null){
							fpdef fpdef = vararg2.getFpdef();
							String varName = fpdef.getName();
							PythonObject pyObj = new PythonObject(varName,ele);
							handler.getLocals().put(varName, pyObj);
							if (iterator.hasNext()){
								argument arg = iterator.next();
								if (arg instanceof atom && ((atom) arg).getName() != null ){
									String origin = ((atom) arg).getName();
									PythonObject pythonObject = handler.getLocals().get(origin);
									if (pythonObject != null){
										for (SpellElement originObj : pythonObject.origin) {
											pyObj.origin.add(originObj);
										}
									}
								}
							}
						}
					}
					varargslist_element vararg2 = f.getParameters().getVarargslist().getVararg2();
					if (vararg2 != null && vararg2.getFpdef() != null){
						fpdef fpdef = vararg2.getFpdef();
						String varName = fpdef.getName();
						PythonObject pyObj = new PythonObject(varName,ele);
						handler.getLocals().put(varName, pyObj);
						if (iterator.hasNext()){
							argument arg = iterator.next();
							if (arg instanceof atom && ((atom) arg).getName() != null ){
								String origin = ((atom) arg).getName();
								PythonObject pythonObject = handler.getLocals().get(origin);
								if (pythonObject != null){
									for (SpellElement originObj : pythonObject.origin) {
										pyObj.origin.add(originObj);
									}
								}
							}
						}
					}
				}
				super.initializeVariables(handler, ele,action);
			}
		},
		NotHandler(){
			@Override
			public PythonAction handle(PythonHandler handler,
					SpellElement current) {
				
				not_test if_s = (not_test) current;
				//System.out.println("branch into if " );
				PythonAction action = handleSpellStatement(handler, if_s.getComparison());
				doBranch(handler, current, if_s.getComparison(), action);
							
				
				return PythonAction.None;
			}
			
			@Override
			public void join(PythonHandler handler1, PythonHandler handler2) {
				//System.out.println("joining if branches");
				joinHandlerOutsideLoop(handler1, handler2);
				super.join(handler1, handler2);
			}


			
		},
		IfHandler(){
			@Override
			public PythonAction handle(PythonHandler handler,
					SpellElement current) {
				
				if_stmt if_s = (if_stmt) current;
				//System.out.println("branch into if " );
				
				PythonAction action = handleSpellStatement(handler, if_s.getTest());
				doBranch(handler, current, if_s.getTest(), action);
				if (if_s.getElse() != null) 
					handler.getLastContext().setDeadEnd(true);
				else
					handler.getLastContext().setDeadEnd(false);
				for (else_if_stmt elif : if_s.getElse_if_stmts()) {
					action = handleSpellStatement(handler, elif.getTest());
					doBranch(handler, current, elif.getTest(), action);
					
				}
				
				return PythonAction.StartSeperatedBranches.setSource(current);
			}
			@Override
			public void handleCleanup(PythonHandler handler) {
				// TODO Auto-generated method stub
				super.handleCleanup(handler);
			}
			
			@Override
			public void join(PythonHandler handler1, PythonHandler handler2) {
				//System.out.println("joining if branches");
				//System.out.println("local:" + handler1.locals);
				//System.out.println("branch:" + handler2.locals);
				
//				for (Entry<String, PythonObject> entry : handler2.locals.entrySet()) {
//					PythonObject newObject = CompoundPythonObject.joinObjects(entry.getValue(),handler1.locals.get(entry.getKey()));
//					PythonObject put = handler1.locals.put(entry.getKey(),newObject);
//					if (put != null && !put.equals(newObject)){
//						for (SpellElement s : put.origin){
//							//System.out.println("Adding new Origin " + s + " to " + newObject);
//							newObject.origin.addLast(s);
//						}
//					}
//				
//				}
//				handler2.locals = handler1.locals;
//				//for (Entry<String, PythonObject> entry : handler1.locals.entrySet()) {
//				//	handler1.locals.put(entry.getKey(), CompoundPythonObject.joinObjects(entry.getValue(),handler2.locals.get(entry.getKey())));
//				//}
//				if (!handler1.stepContext.isEmpty()){
//					StepContext currentContext = handler1.stepContext.getLast();
//					if (!currentContext.equals(handler2.stepContext.getLast())){
//						handler1.stepContext.addAll(handler2.stepContext);
//						handler1.stepContext.removeLast();
//						handler1.stepContext.add(currentContext.joinContext(handler2.stepContext.getLast()));
//					}
//				} else if (!handler2.stepContext.isEmpty()){
//					handler1.stepContext = handler2.stepContext;
//				}
				if (!handler2.fallback){
					joinHandlerOutsideLoop(handler1, handler2);
				}
				super.join(handler1, handler2);
			}
			@Override
			public PythonAction handleFallback(PythonAction action,
					SpellElement lastSource, PythonHandler pythonHandler,
					int amtFallback, int amtRegular) {
				if_stmt if_Stmt = (if_stmt) lastSource;
				if (if_Stmt.getElse() == null)
					return None;
				if (amtRegular > 0){
					if (amtFallback > 0){
						System.out.println();
					}
					return None;
				}
				if (amtFallback > 0){
					pythonHandler.getLastContext().getId().clear();
					return FallBack;
				}
				return None;
			}
			
			@Override
			public void collectLocalConditions(PythonHandler handler,
					SpellElement node, List<DiGraphComment> conditions,Function<SpellElement, Boolean> returnCondition) {
				DiGraphComment condition = new DiGraphComment(handler.diGraph,((if_stmt)node).getTest());
				conditions.add(condition);
				super.collectLocalConditions(handler, node, conditions,returnCondition);
			}
		},

		ElseIfHandler(){
			@Override
			public void collectLocalConditions(PythonHandler handler,
					SpellElement node, List<DiGraphComment> conditions,Function<SpellElement, Boolean> returnCondition) {
				DiGraphComment condition = new DiGraphComment(handler.diGraph,((else_if_stmt)node).getTest());
				conditions.add(condition);
				ArrayList<DiGraphComment> if_conds = new ArrayList<>();
				super.collectLocalConditions(handler, node, if_conds, (SpellElement e) -> (e instanceof if_stmt));
				DiGraphComment diGraphComment = if_conds.get(0);
				diGraphComment.setPrefix("not ");
				if_conds.clear();
				ArrayDeque<DiGraphComment> else_if_conds = new ArrayDeque<>();
				
				for (else_if_stmt elif_stmt: ((if_stmt)diGraphComment.getNode().eContainer()).getElse_if_stmts()) {
					if (elif_stmt.equals(node))
						break;
					collectConditions(handler, elif_stmt, if_conds, (SpellElement e) -> (e instanceof else_if_stmt));
					DiGraphComment else_if_cond = if_conds.get(0);
					else_if_cond.setPrefix("not ");
					else_if_conds.addFirst(else_if_cond);
				}
				
				
				conditions.addAll(else_if_conds);
				conditions.add(diGraphComment);
				
				//conditions.add(diGraphComment);
				
				
				super.collectLocalConditions(handler, (SpellElement) node.eContainer(), conditions,returnCondition);
			}
		},
		WhileHandler(){
			@Override
			public void collectLocalConditions(PythonHandler handler,
					SpellElement node, List<DiGraphComment> conditions,Function<SpellElement, Boolean> returnCondition) {
				DiGraphComment condition = new DiGraphComment(handler.diGraph,((while_stmt)node).getTest());
				conditions.add(condition);
				super.collectLocalConditions(handler, node, conditions,returnCondition);
			}
			
			@Override
			public PythonAction handle(PythonHandler handler,
					SpellElement current) {
				
				while_stmt if_s = (while_stmt) current;
				//System.out.println("branch into while " );
				handler.oldBase.push(handler.stepBaseObject);
				handler.stepBaseObject = new StepContext(handler.stepContext.peekLast());
				handler.origStepBaseObject = handler.stepBaseObject;
				
				
				PythonAction action = handleSpellStatement(handler, if_s.getTest());
				action = doBranch(handler, current, if_s.getTest(), action);
				
				return PythonAction.StartSeperatedBranches.setSource(current);
			}
			
			@Override
			public void join(PythonHandler handler1, PythonHandler handler2) {
				//System.out.println("joining if branches");
				if (!handler2.fallback)
					joinHandlerInLoop(handler1, handler2);
				super.join(handler1, handler2);
			}
			@Override
			public PythonAction handleFallback(PythonAction action,
					SpellElement lastSource, PythonHandler pythonHandler,
					int amtFallback, int amtRegular) {
				if (pythonHandler.fallback) {
					pythonHandler.getLastContext().getId().clear();
				}
				
				return None;
			}
			@Override
			public void handleCleanup(PythonHandler handler) {
				
				ArrayDeque<StepContext> delayedContexts = handler.stepBaseObject.getDelayedContexts();
				
				handler.getLastContext().setDelayedContexts(delayedContexts);
				handler.stepBaseObject = handler.oldBase.pop();
			}
			
			
		},
		ForHandler(){
			@Override
			public PythonAction handle(PythonHandler handler,
					SpellElement current) {
				
				for_stmt if_s = (for_stmt) current;
				//System.out.println("branch into if " );
				handler.oldBase.push(handler.stepBaseObject);
				handler.stepBaseObject =  new StepContext(handler.stepContext.peekLast());
				handler.origStepBaseObject = handler.stepBaseObject;
				
				PythonAction action = handleSpellStatement(handler, if_s.getExprlist());
				doBranch(handler, current, if_s.getExprlist(), action);
				
				return PythonAction.StartSeperatedBranches.setSource(current);
			}
			
			@Override
			public void join(PythonHandler handler1, PythonHandler handler2) {
				joinHandlerInLoop(handler1, handler2);
				super.join(handler1, handler2);
			}
			@Override
			public PythonAction handleFallback(PythonAction action,
					SpellElement lastSource, PythonHandler pythonHandler,
					int amtFallback, int amtRegular) {
				if (pythonHandler.fallback) {
					pythonHandler.getLastContext().getId().clear();
				}
			
				return None;
			}
			@Override
			public void handleCleanup(PythonHandler handler) {
				
				ArrayDeque<StepContext> delayedContexts = handler.stepBaseObject.getDelayedContexts();
				
				handler.getLastContext().setDelayedContexts(delayedContexts);
				handler.stepBaseObject = handler.oldBase.pop();
			}
		},
		GotoHandler(){
			
			@Override
			public PythonAction handle(PythonHandler handler,
					SpellElement current) {
				Goto gotoElement = (Goto) current;
				handler.gotoTargets.add(gotoElement);
				String stepId = "";
				boolean unknownTarget = false;
				if (gotoElement.getTarget() != null){
					stepId = gotoElement.getTarget();
				} else if (gotoElement.getVariable() != null){
					stepId = gotoElement.getVariable();
					unknownTarget = true;
				} else if (gotoElement.getExpr() != null){
					stepId = handler.getCode(gotoElement.getExpr());
					
					unknownTarget = true;
				}
				
				
				StepContext lastContext = handler.stepContext.peekLast();
				int hashcode = 0;
				for (DiGraphNode<?> ctx : lastContext) {
					if (ctx.isGoto())
						continue;
				
					hashcode += ctx.hashCode();
				}
				String hash = " " + hashcode;
				if (gotoElement.getHash() == null){
					gotoElement.setHash(hash);
				} else {
					hash = gotoElement.getHash();
				}
				DiGraphNode<Goto> diGraphNode = new DiGraphNode<Goto>(handler.diGraph,gotoElement);
				StepContext context = new StepContext(diGraphNode,handler.getLastContext());
				
				handler.stepContext.add(context);
				handleDelayedContexts(handler,lastContext.getDelayedContexts(),diGraphNode);
				//System.out.println("encountered step " + context.getName());
				
				for (DiGraphNode<?> lastStep : lastContext){
					if (lastStep.isGoto())
						continue;
					if (lastStep.isUndefined()){
						handler.getStepFlowInformation().add(new DiGraphEdge(DiGraphNode.STARTNODE, diGraphNode, false));
						//handler.getStepFlowInformation().add("\"Procedure Started\" -> \"" + context.getName().split(" := ")[0] + "\"");
						
					} else {
						handler.getStepFlowInformation().add(new DiGraphEdge(lastStep, diGraphNode, false));
						//handler.getStepFlowInformation().add("\"" + lastStep.split(" := ")[0] + "\" -> \"" + context.getName().split(" := ")[0] + "\"");
					}
					if (!unknownTarget){
						handler.getStepFlowInformation().add(new DiGraphEdge(diGraphNode, handler.diGraph.createReferredReferenceNode(stepId), false));
						//handler.getStepFlowInformation().add("\"" + context.getName().split(" := ")[0] + "\" -> \"" + stepId  + "\"" );
					}
				}
				return PythonAction.None;
			}
		},
		StepHandler(){
			
			@Override
			public PythonAction handle(PythonHandler handler,
					SpellElement current) {
				Step step = (Step) current;
				
				handler.steps.add(step);
				StepContext lastContext = handler.stepContext.peekLast();
				
//				if (!lastContext.getName().equals("Undefined")){
//					for (DiGraphNode<?> stepStr : lastContext) {
//						if (lastContext.hasBeenHandled(stepStr))
//							continue;
//						handler.tmIdToStepMapping.add(Tuples.create("#",stepStr));
//					}
//				}
				
				DiGraphNode<SpellElement> diGraphNode = new DiGraphNode<SpellElement>(handler.diGraph,step);
				LinkedHashSet<DiGraphComment> annotations = handler.getLastContext().getAnnotations();
				for (DiGraphComment diGraphComment : annotations) {
					diGraphNode.addAnnotation(diGraphComment);
				}
				annotations.clear();
				List<DiGraphComment> conditionList = new ArrayList<>();
				collectConditions(handler,(SpellElement) step.eContainer(),conditionList );
				for (DiGraphComment diGraphComment : conditionList) {
					diGraphNode.addCondition(diGraphComment);
				}
				StepContext context = new StepContext(diGraphNode,handler.getLastContext());
				handler.tmIdToStepMapping.add(Tuples.create("#",diGraphNode));
				handler.stepContext.add(context);
				if (!context.getDelayedContexts().isEmpty()){
					handleDelayedContexts(handler,context.getDelayedContexts(),diGraphNode);
					
				}
				//System.out.println("encountered step " + context.getName());
				if (handler.stepBaseObject.equals(lastContext) &&
						handler.handlerParent != null && 
						!current.getPrevStatements().isEmpty() &&
						(current.getPrevStatements().get(0) instanceof suite) &&
						((current.getPrevStatements().get(0).eContainer() instanceof while_stmt) ||
						 (current.getPrevStatements().get(0).eContainer() instanceof for_stmt)) ){
					handler.handlerParent.stepBaseObject = new StepContext(context);
					handler.stepBaseObject = handler.handlerParent.stepBaseObject;
				}
				for (DiGraphNode<?> lastStep : lastContext){
					if (lastStep.isGoto())
						continue;
					if (lastStep.isUndefined()){
						handler.getStepFlowInformation().add(new DiGraphEdge(DiGraphNode.STARTNODE, diGraphNode, false));
						//handler.getStepFlowInformation().add("\"Procedure Started\" -> \"" + context.getName().split(" := ")[0] + "\"");
					} else {
						handler.getStepFlowInformation().add(new DiGraphEdge(lastStep, diGraphNode, false));
						//handler.getStepFlowInformation().add("\"" + lastStep.split(" := ")[0] + "\" -> \"" + context.getName().split(" := ")[0] + "\"");
					}
					
				}
				
				
				
				return PythonAction.None;
			}
		},
		DisplayStepHandler(){
			
			@Override
			public PythonAction handle(PythonHandler handler,
					SpellElement current) {
				DisplayStep step = (DisplayStep) current;
				handler.displaySteps.add(step);

				StepContext lastContext = handler.stepContext.peekLast();
				if (!lastContext.getName().equals("undefined Step")){
					for (DiGraphNode<?> stepStr : lastContext) {
						if (lastContext.hasBeenHandled(stepStr))
							continue;
						//handler.tmIdToStepMapping.add(new DisplayEntry<String,String>("#",stepStr));
					}
				}
				DiGraphNode<SpellElement> diGraphNode = new DiGraphNode<SpellElement>(handler.diGraph,step);
				StepContext context = new StepContext(diGraphNode,handler.getLastContext());
				handler.stepContext.add(context);
				
				handleDelayedContexts(handler,lastContext.getDelayedContexts(),diGraphNode);
				
				//System.out.println("encountered step " + context.getName());
				
				for (DiGraphNode<?> lastStep : lastContext){
					if (lastStep.isGoto())
						continue;
					if (lastStep.isUndefined()){
						handler.getStepFlowInformation().add(new DiGraphEdge(DiGraphNode.STARTNODE, diGraphNode, false));
						//handler.getStepFlowInformation().add("\"Procedure Started\" -> \"" + context.getName().split(" := ")[0] + "\"");
					} else {
						handler.getStepFlowInformation().add(new DiGraphEdge(lastStep, diGraphNode, false));
						//handler.getStepFlowInformation().add("\"" + lastStep.split(" := ")[0] + "\" -> \"" + context.getName().split(" := ")[0] + "\"");
					}
					
				}
				
				
				
				return PythonAction.None;
			}

		},
		PowerHandler(){

			@Override
			public PythonAction handle(PythonHandler handler,
					SpellElement current) {
				
				power p = (power) current;				
				atom atomVar = p.getAtom();
				if (atomVar.getName() != null && !atomVar.getName().isEmpty()){
					if (handler.getProperty(SHOW_PROMPT)){
						//if (DiGraphPrompt.isValid(atomVar.getName(),handler)){
						//	
						//}
					}
					
					if (handler.getProperty(SHOW_START_PROC)){
						if (DiGraphProcedureCall.isValid(atomVar.getName())){
							String procName = handler.getCode(p.getTrailer().get(0).getArglist().getArguments().get(0));
							if (procName.startsWith("\"") || procName.startsWith("'")){
								procName = procName.substring(1,procName.length() - 1);
							}
							DiGraphProcedureCall<SpellElement> diGraphProcedureCall = new DiGraphProcedureCall<SpellElement>(handler.diGraph, p,atomVar,procName,handler.getLastContext() );
							StepContext lastContext = handler.getLastContext();

							for (DiGraphNode prev : lastContext){
								if (prev.isGoto()){
									continue;
								}
								if (prev.equals(DiGraphNode.STARTNODE)){
									StepContext newContext = new StepContext(lastContext);
									diGraphProcedureCall.setContext(newContext);
									newContext.getId().clear();
									newContext.getId().add(diGraphProcedureCall);
									handler.stepFlowInformation.add(new DiGraphEdge(prev, diGraphProcedureCall, false));
								} else {
									handler.stepFlowInformation.add(new DiGraphEdge(prev, diGraphProcedureCall, true));
								}
							}
						} else {
							String variable = atomVar.getName();
							PythonObject pythonObject = handler.getLocals().get(variable);
							if (pythonObject != null){
								SpellElement origin = pythonObject.getOrigin();
								if (DiGraphProcedureCall.isValid(origin)){
									DiGraphProcedureCall<SpellElement> diGraphProcedureCall = new DiGraphProcedureCall<SpellElement>(handler.diGraph, origin,p, variable,handler.getLastContext());
									StepContext lastContext = handler.getLastContext();
									for (DiGraphNode prev : lastContext){
										if (prev.isGoto()){
											continue;
										}
										if (prev.equals(DiGraphNode.STARTNODE)){
											StepContext newContext = new StepContext(lastContext);
											diGraphProcedureCall.setContext(newContext);
											newContext.getId().clear();
											newContext.getId().add(diGraphProcedureCall);
											handler.stepFlowInformation.add(new DiGraphEdge(prev, diGraphProcedureCall, false));
										} else {
											handler.stepFlowInformation.add(new DiGraphEdge(prev, diGraphProcedureCall, true));
										}
									}
								}
							}
						}
					}
				}
	
				boolean shouldBranch = false;
				arglist args = null;
				for (trailer tr : p.getTrailer()) {
					if (tr.isRoundBracket()){
						shouldBranch = true;
						args = tr.getArglist();
						if (args != null){
							argument argument = args.getArgument();
							PythonHandler newHandler = new PythonHandler(handler, false);
							if (argument != null){
								PythonAction action = handleSpellStatement(newHandler, argument);
								doBranch(newHandler, current, argument, action);
								this.join(handler, newHandler);
							}
							for (argument argument2 : args.getArguments()) {
								newHandler = new PythonHandler(handler, false);
								PythonAction action = handleSpellStatement(newHandler, argument2);
								doBranch(newHandler, current, argument2, action);
								this.join(handler, newHandler);
							}
						}
						
						
						break;
					}
				}
				if (shouldBranch){
					SpellElement branchableObject = findBranchableObject(handler, current, PythonAction.None);
					//handler.stepBaseObject = handler.stepContext.peekLast();
					if (branchableObject != null){
						return PythonAction.StartBranchInSameContext.setSource(branchableObject).setVars(args);
					}
					return PythonAction.None;	
				} else {
					return PythonAction.None;	
				}
				
			}
			
			@Override
			public void join(PythonHandler handler1, PythonHandler handler2) {
				joinHandlerOutsideLoop(handler1, handler2);
				super.join(handler1, handler2);
			}
			
			@Override
			public SpellElement findBranchableObject(PythonHandler handler,
					SpellElement current, PythonAction action) {
				power p = (power) current;
				String baseName = p.getAtom().getName();
				
				PythonObject baseObject = findPythonObject(handler,p.getAtom(),null);
				
				for (trailer tr : p.getTrailer()) {
					if (tr.isRoundBracket() && baseObject != null){
						//System.out.println("Jumping to function " + baseName);
						return baseObject.getOrigin();
					}
					if (tr.isSquareBracket()){
						baseObject = findPythonObject(handler,tr,baseObject);
						//baseObject = baseObject.getMember("");
					}
					if (tr.getDotName() != null && baseObject != null){
						baseName += "." + tr.getDotName();
						baseObject = baseObject.getMember(tr.getDotName());
					}
				}
				return super.findBranchableObject(handler, current, action);
			}
			
			@Override
			public PythonObject findPythonObject(PythonHandler handler,
					SpellElement element, PythonObject knownObject) {
				if (element instanceof atom){
					atom a = (atom) element;
					String funcName = a.getName();
					return handler.getLocals().get(funcName);
				}
				TreeIterator<EObject> eAllContents = element.eAllContents();
				while (eAllContents.hasNext()){
					EObject next = eAllContents.next();
					if (next instanceof atom){
						atom a = (atom) next;
						String funcName = a.getName();
						return handler.getLocals().get(funcName);
					}
				}
				return null;
			}
			
			
		},
		
		ContinueHandler {
			public PythonAction handle(PythonHandler handler, SpellElement current) {
				addContinueInformation(handler);
				handler.doFallBack(true);
				return PythonAction.FallBack;
			}
		},
		BreakHandler {
			public PythonAction handle(PythonHandler handler, SpellElement current) {
				addBreakInformation(handler);
				handler.doFallBack(true);
				return PythonAction.FallBack;
			}
		},
		
		AtomHandler {
			@Override
			public PythonObject findPythonObject(PythonHandler handler,
					SpellElement element, PythonObject knownObject) {
				atom a = (atom) element;
				
				String objName = a.getName();
				if (objName != null){
					return handler.getLocals().get(objName);
				}
				
				return super.findPythonObject(handler, element, knownObject);
			}
		},
		Expr_StmtHandler(){
			public PythonAction handle(PythonHandler handler, SpellElement current) {
				String code = NodeModelUtils.getTokenText(NodeModelUtils.getNode(current));
				expr_stmt stm = (expr_stmt) current;
				
				PythonObject obj = null;
				String objName = null;

				//String code = NodeModelUtils.getTokenText(NodeModelUtils.getNode(current));
				if (handler.collectTM) {
					Pattern priPattern = Pattern.compile("PRI\\s*\\+\\s*[\"'](\\w+)");
					Pattern redPattern = Pattern.compile("RED\\s*\\+\\s*[\"'](\\w+)");
					Pattern numPattern = Pattern.compile("[\"']T\\s+(\\w+)");
					StepContext context = handler.stepContext.peekLast();
					Matcher matcher = priPattern.matcher(code);
					while (matcher.find()){
						String number = matcher.group(1);
						for (DiGraphNode<?> stepStr : context) {
							boolean scp1 = !handler.useSCP2TM ;
							if (scp1){
								if (number.length() > 4)
									number = number.substring(1);
								handler.tmIdToStepMapping.add(Tuples.create("1" + number,stepStr));
							} else {
								if (number.length() > 4)
									number = number.substring(1);
								handler.tmIdToStepMapping.add(Tuples.create("2" + number,stepStr));
							}
							//handler.tmIdToStepMapping.add(new DisplayEntry<String,String>("2" + number,stepStr));	
							context.setHandled(stepStr);
						}
					}
					matcher = redPattern.matcher(code);
					while (matcher.find()){
						String number = matcher.group(1);
						for (DiGraphNode<?> stepStr : context) {
							//handler.tmIdToStepMapping.add(new DisplayEntry<String,String>("1" + number,stepStr));
							
							boolean scp1 = !handler.useSCP2TM;
							if (scp1){
								if (number.length() > 4)
									number = number.substring(1);
								handler.tmIdToStepMapping.add(Tuples.create("2" + number,stepStr));
							} else {
								if (number.length() > 4)
									number = number.substring(1);
								handler.tmIdToStepMapping.add(Tuples.create("1" + number,stepStr));
							}
							context.setHandled(stepStr);
						}
					}
					matcher = numPattern.matcher(code);
					while (matcher.find()){
						String number = matcher.group(1);
						for (DiGraphNode<?> stepStr : context) {
							handler.tmIdToStepMapping.add(Tuples.create( number,stepStr));	
							context.setHandled(stepStr);
						}
					}
				
				}
				
				try {
					if (stm.getLeft() instanceof testlist && stm.getLeft().eClass().getName().equals("testlist")){
						for (testlist t : stm.getLeft().getTests()) {
							if (t instanceof atom){
								obj = handler.getLocals().get(((atom) t).getName());
								if (obj == null){
									objName = ((atom) t).getName();
								}
							}else if (t instanceof power){
								power p = (power) t;
								obj = handler.getLocals().get(((atom)p.getAtom()).getName());
								if (obj == null){
									objName = ((atom)p.getAtom()).getName();
								}
								for (trailer tr : p.getTrailer()) {
									if (tr.isRoundBracket()){
										super.handle(handler, current);
										return PythonAction.None;
									}
									if (tr.isSquareBracket() && obj != null){
										subscript subscript = tr.getSubscriptlist().getSubscript().get(0);
										String arrayIndex = "";
										if (subscript.getSubscript1() instanceof atom){
											atom subAtom = (atom) subscript.getSubscript1();
											if (subAtom.getName() != null){
												arrayIndex = subAtom.getName();
											} else if (!subAtom.getStrings().isEmpty()){
												for (String str : subAtom.getStrings()) {
													arrayIndex += str;							

												}

											}
										}
										PythonObject member = obj.getMember(arrayIndex);
										if (member != null){
											obj = member;
										} else {
											objName = arrayIndex;
										}
									}
								}
							} 

							if (obj == null && objName != null){
								obj = new PythonObject(objName,current);
								PythonObject put = handler.getLocals().put(objName, obj);
								if (put != null){
									for (SpellElement origin : put.origin) {
										obj.origin.add(origin);
									}
								}
									
							} else if (obj != null && objName != null){
								PythonObject newObj = new PythonObject(objName,current);
								obj.addMember(objName, newObj);
								obj = newObj;
							}
							obj = null;
							objName = null;
						}
						super.handle(handler, current);
						return PythonAction.None;
					} else	if (stm.getLeft() instanceof atom) {
						obj = handler.getLocals().get(((atom) stm.getLeft()).getName());
						if (obj == null){
							objName = ((atom) stm.getLeft()).getName();
						}
					} else if (stm.getLeft() instanceof power){
						power p = (power) stm.getLeft();
						obj = handler.getLocals().get(((atom)p.getAtom()).getName());
						if (obj == null){
							objName = ((atom)p.getAtom()).getName();
						}
						for (trailer tr : p.getTrailer()) {
							if (tr.isRoundBracket()){
								super.handle(handler, current);
								return PythonAction.None;
							}
							if (tr.isSquareBracket() && obj != null){
								subscript subscript = tr.getSubscriptlist().getSubscript().get(0);
								String arrayIndex = "";
								if (subscript.getSubscript1() instanceof atom){
									atom subAtom = (atom) subscript.getSubscript1();
									if (subAtom.getName() != null){
										arrayIndex = subAtom.getName();
									} else if (!subAtom.getStrings().isEmpty()){
										for (String str : subAtom.getStrings()) {
											arrayIndex += str;							

										}

									}
								}
								PythonObject member = obj.getMember(arrayIndex);
								if (member != null){
									obj = member;
								} else {
									objName = arrayIndex;
								}
							}
						}
					} 
					//System.out.println("obj=" + obj + "   objName=" + objName + " left=" + stm.getLeft() + "  code=" + NodeModelUtils.getTokenText(NodeModelUtils.getNode(stm.getLeft())));
					if (obj != null){
						objName = obj.getName();
						obj = new PythonObject(objName,current);
						PythonObject put = handler.getLocals().put(objName, obj);
						if (put != null){
							for (SpellElement origin : put.origin) {
								obj.origin.add(origin);
							}
						}
					} else if (obj == null && objName != null){
						//System.out.println("Assign var " + objName);
						obj = new PythonObject(objName,current);
						PythonObject put = handler.getLocals().put(objName, obj);
						if (put != null){
							for (SpellElement origin : put.origin) {
								obj.origin.add(origin);
							}
						}
					} else if (obj != null && objName != null){
						//System.out.println("Assign var " + objName);
						PythonObject newObj = new PythonObject(objName,current);
						obj.addMember(objName, newObj);
						obj = newObj;
						
					}
				} finally {
					yield_or_testlist value = stm.getRight();
						
					if (value == null && stm instanceof assignment_stmt){
						assignment_stmt ass = (assignment_stmt) stm;
						value = ass.getAssignments().get(ass.getAssignments().size()-1);

					}
					PythonHandler newHandler = new PythonHandler(handler, false);
					PythonAction action = handleSpellStatement(newHandler, value);
					action = PythonAction.StartBranchInSameContext.setSource(current);
					//newHandler.oldBase = newHandler.stepBaseObject;
					//newHandler.stepBaseObject = handler.stepContext.peekLast();
					doBranch(newHandler, current, value, action);
					this.join(handler, newHandler);
					//newHandler.stepBaseObject = newHandler.oldBase;
					
				}
				super.handle(handler, current);
				return PythonAction.None;


			};
			@Override
			public void join(PythonHandler handler1, PythonHandler handler2) {
				joinHandlerOutsideLoop(handler1, handler2);
				super.join(handler1, handler2);
			}
			
		},DelHandler,ReturnHandler,
		RaiseHandler, WithHandler,  
		SendHandler{
			@Override
			public PythonAction handle(PythonHandler handler,
					SpellElement current) {
				super.handle(handler, current);
				
				String code = NodeModelUtils.getTokenText(NodeModelUtils.getNode(current));
				
				if (current instanceof Send){
					code = NodeModelUtils.getTokenText(NodeModelUtils.getNode(((Send) current).getArgs().get(0).getArguments().get(0)));
				}
				if (current instanceof BuildTC){
					code = NodeModelUtils.getTokenText(NodeModelUtils.getNode(((BuildTC) current).getArgs().get(0).getArguments().get(0)));
				}
				//String code = NodeModelUtils.getTokenText(NodeModelUtils.getNode(current));
				if (handler.collectTM) {
					Pattern priPattern = Pattern.compile("PRI\\s*\\+\\s*[\"'](\\w+)");
					Pattern redPattern = Pattern.compile("RED\\s*\\+\\s*[\"'](\\w+)");
					Pattern numPattern = Pattern.compile("[\"']T\\s+(\\w+)");
					StepContext context = handler.stepContext.peekLast();
					Matcher matcher = priPattern.matcher(code);
					while (matcher.find()){
						String number = matcher.group(1);
						for (DiGraphNode<?> stepStr : context) {
							boolean scp1 = !handler.useSCP2TM ;
							if (scp1){
								if (number.length() > 4)
									number = number.substring(1);
								handler.tmIdToStepMapping.add(Tuples.create("1" + number,stepStr));
							} else {
								if (number.length() > 4)
									number = number.substring(1);
								handler.tmIdToStepMapping.add(Tuples.create("2" + number,stepStr));
							}
							//handler.tmIdToStepMapping.add(new DisplayEntry<String,String>("2" + number,stepStr));	
							context.setHandled(stepStr);
						}
					}
					matcher = redPattern.matcher(code);
					while (matcher.find()){
						String number = matcher.group(1);
						for (DiGraphNode<?> stepStr : context) {
							//handler.tmIdToStepMapping.add(new DisplayEntry<String,String>("1" + number,stepStr));
							
							boolean scp1 = !handler.useSCP2TM;
							if (scp1){
								if (number.length() > 4)
									number = number.substring(1);
								handler.tmIdToStepMapping.add(Tuples.create("2" + number,stepStr));
							} else {
								if (number.length() > 4)
									number = number.substring(1);
								handler.tmIdToStepMapping.add(Tuples.create("1" + number,stepStr));
							}
							context.setHandled(stepStr);
						}
					}
					matcher = numPattern.matcher(code);
					while (matcher.find()){
						String number = matcher.group(1);
						for (DiGraphNode<?> stepStr : context) {
							handler.tmIdToStepMapping.add(Tuples.create( number,stepStr));	
							context.setHandled(stepStr);
						}
					}
				
				}
				boolean reportErrors = current instanceof Send ||
						current instanceof BuildTC ;
				Pattern varPattern = Pattern.compile("([\\w_]+)");
				Pattern charPattern = Pattern.compile("['\"]([\\w\\s_]+)['\"]");
				
				
				
				StepContext context = handler.stepContext.peekLast();
				//System.out.println("Refactor TM verify (" + code + ")");
				boolean refactorTC = handler.refactorTC(current,context,reportErrors);
				
				Matcher matcher = varPattern.matcher(code);
				while (matcher.find()){
					String var = matcher.group(1);
					
					PythonObject pythonObject = handler.getLocals().get(var);
					if (pythonObject != null){
						for (SpellElement element : pythonObject.origin) {
							refactorTC = handler.refactorTC(element,context,!refactorTC) || refactorTC;
						}
						for (PythonObject member : pythonObject.knownMemberDomain.values()) {
							if (member != null)
								refactorTC = handler.refactorTC(member.getOrigin(),context,!refactorTC) || refactorTC;
						}
					}	
				}
				EList<arglist> argsList;
				if (current instanceof Send){
					argsList = ((Send) current).getArgs();
				} else {
					argsList = ((BuildTC) current).getArgs();
				}
				boolean first = true;
				
				for (argument arg : argsList.get(0).getArguments()) {		
					if (first){
						first = false;
						continue;
					}
					if (arg.getTest() != null){
						//System.out.println("testing " + arg);
						String keyword = NodeModelUtils.getTokenText(NodeModelUtils.getNode(arg.getTest()));
						//System.out.print(" keyword: " + keyword + "("+(keyword.trim().equalsIgnoreCase("verify"))+")\n");
						if (keyword.trim().equalsIgnoreCase("command")){
							boolean success = handler.refactorTC(arg.getTest2(), context,true);
							if (success)
								continue;
							String varCode = NodeModelUtils.getTokenText(NodeModelUtils.getNode(arg.getTest2()));
							varPattern = Pattern.compile("^([\\w_]+)");

							matcher = varPattern.matcher(varCode.trim());
							if (matcher.find()){
								String var = matcher.group(1);

								PythonObject pythonObject = handler.getLocals().get(var);
								//System.out.println("found var usage '" + var + "' corresponding object is " + pythonObject);
								if (pythonObject != null){
									for (SpellElement element : pythonObject.origin) {
										//System.out.println("\t\tRefactoring Origin " + element);
										handler.refactorTC(element,context,true);
									}
									for (PythonObject member : pythonObject.knownMemberDomain.values()) {
										//System.out.println("\t\tRefactoring Member " + member.getName() + " " + member.getOrigin() + "(" + member +")");
										if (member != null)
											handler.refactorTC(member.getOrigin(),context,true);
									}
								}	
							}
						}
						if (keyword.trim().equalsIgnoreCase("group")){
							PythonAction action = handleSpellStatement(handler, arg.getTest2());
							doBranch(handler, current,arg.getTest2(), action);

						}

						if (keyword.trim().equalsIgnoreCase("verify")){
							boolean success = handler.refactorTM(arg.getTest2(), context,true);
							if (success)
								continue;
							String varCode = NodeModelUtils.getTokenText(NodeModelUtils.getNode(arg.getTest2()));
							varPattern = Pattern.compile("^([\\w_]+)");

							matcher = varPattern.matcher(varCode.trim());
							if (matcher.find()){
								String var = matcher.group(1);

								PythonObject pythonObject = handler.getLocals().get(var);
								//System.out.println("found var usage '" + var + "' corresponding object is " + pythonObject);
								if (pythonObject != null){
									for (SpellElement element : pythonObject.origin) {
										//System.out.println("\t\tRefactoring Origin " + element);
										handler.refactorTM(element,context,true);
									}
									for (PythonObject member : pythonObject.knownMemberDomain.values()) {
										//System.out.println("\t\tRefactoring Member " + member.getName() + " " + member.getOrigin() + "(" + member +")");
										if (member != null)
											handler.refactorTM(member.getOrigin(),context,true);
									}
								}	
							}
						}
					}
				}
				return PythonAction.None;
			}
		},
		VerifyHandler(){
			@Override
			public PythonAction handle(PythonHandler handler,
					SpellElement current) {
				String code = NodeModelUtils.getTokenText(NodeModelUtils.getNode(current));
				if (current instanceof GetTM){
					code = NodeModelUtils.getTokenText(NodeModelUtils.getNode(((GetTM) current).getTm()));
				}
				if (current instanceof SetLimits){
					code = NodeModelUtils.getTokenText(NodeModelUtils.getNode(((SetLimits) current).getTm()));
				}
				if (current instanceof ShowTM){
					code = NodeModelUtils.getTokenText(NodeModelUtils.getNode(((ShowTM) current).getArgs().get(0).getArguments().get(0)));
				}
				if (current instanceof Verify){
					code = NodeModelUtils.getTokenText(NodeModelUtils.getNode(((Verify) current).getArgs().getArguments().get(0)));
				}
				if (handler.collectTM) {
					Pattern priPattern = Pattern.compile("PRI\\s*\\+\\s*[\"'](\\w+)");
					Pattern redPattern = Pattern.compile("RED\\s*\\+\\s*[\"'](\\w+)");
					Pattern numPattern = Pattern.compile("[\"']T\\s+(\\w+)");
					StepContext context = handler.stepContext.peekLast();
					Matcher matcher = priPattern.matcher(code);
					while (matcher.find()){
						String number = matcher.group(1);
						for (DiGraphNode<?> stepStr : context) {
							boolean scp1 = !handler.useSCP2TM;
							if (number.length() > 4)
								number = number.substring(1);
							if (scp1){
								handler.tmIdToStepMapping.add(Tuples.create("1" + number,stepStr));
							} else {
								handler.tmIdToStepMapping.add(Tuples.create("2" + number,stepStr));
							}
							context.setHandled(stepStr);
						}
					}
					matcher = redPattern.matcher(code);
					while (matcher.find()){
						String number = matcher.group(1);
						for (DiGraphNode<?> stepStr : context) {
							boolean scp1 = !handler.useSCP2TM;
							if (number.length() > 4)
								number = number.substring(1);
							if (scp1){
								handler.tmIdToStepMapping.add(Tuples.create("2" + number,stepStr));
							} else {
								handler.tmIdToStepMapping.add(Tuples.create("1" + number,stepStr));
							}
							context.setHandled(stepStr);
						}
					}
					matcher = numPattern.matcher(code);
					while (matcher.find()){
						String number = matcher.group(1);
						for (DiGraphNode<?> stepStr : context) {
							handler.tmIdToStepMapping.add(Tuples.create( number,stepStr));
							context.setHandled(stepStr);
						}
					}
				}
				boolean reportErrors = current instanceof GetTM ||
						current instanceof ShowTM ||
						current instanceof Verify ||
						current instanceof SetLimits;
				Pattern varPattern = Pattern.compile("([\\w_]+)");
				Pattern charPattern = Pattern.compile("['\"]([\\w\\s_]+)['\"]");



				StepContext context = handler.stepContext.peekLast();
				//System.out.println("Refactor TM verify (" + code + ")");
				boolean refactorTM = handler.refactorTM(current,context,reportErrors);

				Matcher matcher = varPattern.matcher(code);
				while (matcher.find()){
					String var = matcher.group(1);

					PythonObject pythonObject = handler.getLocals().get(var);
					if (pythonObject != null){
						for (SpellElement element : pythonObject.origin) {
							refactorTM = handler.refactorTM(element,context,!refactorTM) || refactorTM;
						}
						for (PythonObject member : pythonObject.knownMemberDomain.values()) {
							if (member != null)
								refactorTM = handler.refactorTM(member.getOrigin(),context,!refactorTM) || refactorTM;
						}
					}	
				}
				/*if (current instanceof GetTM ||
						current instanceof ShowTM ||
						current instanceof Verify ){
					matcher = charPattern.matcher(code);
					while (matcher.find()){
						String tmValue = matcher.group(1);

						if (!handler.db.isTelemetryParameter(tmValue)){
							try {
								createTMProblemMarker(handler, current, tmValue);


							} catch (CoreException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}*/

				/*Verify verify = (Verify) current;
				arglist args = verify.getArgs();

				for (argument arg : args.getArguments()) {

				}
				argument arg = args.getArgument();
				if (arg != null){
					test t = arg.getTest();
					if (t instanceof atom){
						 
					} else if (t instanceof power){
						
					}
				}*/
				return super.handle(handler, current);
			}
			
		},
		TryHandler(){
			@Override
			public PythonAction handle(PythonHandler handler,
					SpellElement current) {
				
				try_stmt if_s = (try_stmt) current;
				//System.out.println("branch into if " );

				
				return PythonAction.StartSeperatedBranches.setSource(current);
			}
			
			@Override
			public void join(PythonHandler handler1, PythonHandler handler2) {
				joinHandlerOutsideLoop(handler1, handler2);		
				super.join(handler1, handler2);
			}
		}
		,
		DefaultHandler,
		DefaultHandler2{
			public PythonAction handle(PythonHandler handler,SpellElement current){
								
				return PythonAction.None;
			}
		},
		StrHandler{
			public PythonAction handle(PythonHandler handler,SpellElement current){
				atom val = (atom) current;
				if (!val.getStrings().isEmpty()) {
					String code = val.getStrings().get(0);
					Pattern numPattern = Pattern.compile("[\"']T\\s+(\\w+)");
					Matcher matcher = numPattern.matcher(code);
					StepContext context = handler.stepContext.peekLast();
					while (matcher.find()){
						String number = matcher.group(1);
						for (DiGraphNode<?> stepStr : context) {
							handler.tmIdToStepMapping.add(Tuples.create(number,stepStr));
							context.setHandled(stepStr);
						}
					}
				}
				return PythonAction.None;
			}
		}, SuiteHandler{
			public PythonAction handle(PythonHandler handler,SpellElement current){
				
				return PythonAction.StartBranchInSameContext.setSource(current);
			}
			
			
			
		}
		
		;
		
		public PythonAction handle(PythonHandler handler,SpellElement current){
			for (EObject content : current.eContents()) {
				if (current.getNextStatements().contains(content))
					continue;
				handleSpellStatement(handler, (SpellElement) content);
			}
			
			return PythonAction.None;
		}
		
		public final PythonAction branch(PythonHandler handler,SpellElement current){
		//	System.out.println();
			ICompositeNode node = NodeModelUtils.getNode(current);
			//System.out.println("branching " + node.getStartLine() + " " + current.eClass().getName());
			handleCleanup(handler);
			for (SpellElement next : current.getNextStatements()) {
				PythonAction action = handleSpellStatement(handler, next);
				
				action = doBranch(handler, current, next, action);
				Handler handler2 = spellHandler.get(current.eClass());
				if (handler2 == null){
					handler2 = spellHandler.get(null);
				}
				
				if (action.equals(PythonAction.FallBack)){
					
					return action;
				}
				
			}
			
			return PythonAction.None;
		}

		protected PythonAction doBranch(PythonHandler handler, SpellElement current,
				SpellElement next, PythonAction action) {
			
			switch (action.getType()){
			case PythonAction.SAME_CONTEXT_TYPE:
				action = handler.branchWithSameContext(current, next,action);
				break;
			case PythonAction.SEPERATED_CONTEXT_TYPE:
				action = handler.branchWithNewContext(next,action);;
				//System.out.println();
				break;
			case PythonAction.FALL_BACK_TYPE:
				Handler handler2 = spellHandler.get(current.eClass());
				if (handler2 == null){
					handler2 = spellHandler.get(null);
				}
				return action;
			default:
				break;
			}
			if (action.equals(PythonAction.FallBack)){
				return action;
			}
			
			return branchSpellStatement(handler, next);
		}
		
		public void join(PythonHandler handler1,PythonHandler handler2){
			//if (handler2.stepBaseObject != null){
			//	ArrayDeque<StepContext> delayedContexts = handler2.stepBaseObject.getDelayedContexts();
			//	handler1.getLastContext().setDelayedContexts(delayedContexts);
			//}
		}		
		
		public SpellElement findBranchableObject(PythonHandler handler,SpellElement current, PythonAction action) {
			return action.getSource();
		}
		
		public PythonObject findPythonObject(PythonHandler handler,SpellElement element,PythonObject knownObject){
			return knownObject;
		}
		
		public void initializeVariables(PythonHandler handler,SpellElement ele,PythonAction action){
			
		}
		public PythonAction handleFallback(PythonAction action, SpellElement lastSource, PythonHandler pythonHandler, int amtFallback, int amtRegular) {
			// TODO Auto-generated method stub
			return action;
		}

		public void handleCleanup(PythonHandler handler){
			
		}

		public void collectLocalConditions(PythonHandler handler,SpellElement node,List<DiGraphComment> conditions,Function<SpellElement, Boolean> returnCondition){
			if (!returnCondition.apply(node))
				collectConditions(handler, (SpellElement) node.eContainer(), conditions,returnCondition);
		}
		public void handleComments(PythonHandler handler,String comments){
			if (comments != null && !comments.isEmpty()){
				StepContext lastContext = handler.getLastContext();
				DiGraphComment comment = new DiGraphComment(handler.diGraph, comments);
				lastContext.getAnnotations().add(comment);
			}
		}
		
	}
	

	
	private static HashMap<EClass,Handler> spellHandler = new HashMap<EClass, Handler>();
	static {
		spellHandler.put(SpellPackage.Literals.FUNCDEF, Handler.FuncDefHandler);
		
		spellHandler.put(SpellPackage.Literals.POWER, Handler.PowerHandler);
		spellHandler.put(SpellPackage.Literals.ATOM, Handler.AtomHandler);
		spellHandler.put(SpellPackage.Literals.EXPR_STMT, Handler.Expr_StmtHandler);
		spellHandler.put(SpellPackage.Literals.ASSIGNMENT_STMT, Handler.Expr_StmtHandler);
		spellHandler.put(SpellPackage.Literals.DEL_STMT, Handler.DelHandler);
		spellHandler.put(SpellPackage.Literals.RETURN_STMT, Handler.ReturnHandler);
		spellHandler.put(SpellPackage.Literals.RAISE_STMT, Handler.RaiseHandler);
		spellHandler.put(SpellPackage.Literals.IMPORT_FROM, Handler.ImportHandler);
		spellHandler.put(SpellPackage.Literals.IMPORT_NAME, Handler.ImportHandler);
		
		spellHandler.put(SpellPackage.Literals.WITH_STMT, Handler.WithHandler);
		
		spellHandler.put(SpellPackage.Literals.STEP, Handler.StepHandler);
		spellHandler.put(SpellPackage.Literals.GOTO, Handler.GotoHandler);
		spellHandler.put(SpellPackage.Literals.DISPLAY_STEP, Handler.DisplayStepHandler);
		
		spellHandler.put(SpellPackage.Literals.SEND, Handler.SendHandler);
		spellHandler.put(SpellPackage.Literals.BUILD_TC, Handler.SendHandler);
		
		spellHandler.put(SpellPackage.Literals.SHOW_TM, Handler.VerifyHandler);
		spellHandler.put(SpellPackage.Literals.GET_TM, Handler.VerifyHandler);
		spellHandler.put(SpellPackage.Literals.SET_LIMITS, Handler.VerifyHandler);
		//spellHandler.put(SpellPackage.Literals.DICTORSETMAKER, Handler.VerifyHandler);
		//spellHandler.put(SpellPackage.Literals.LISTMAKER, Handler.VerifyHandler);
		
		
		spellHandler.put(SpellPackage.Literals.IF_STMT, Handler.IfHandler);
		spellHandler.put(SpellPackage.Literals.WHILE_STMT, Handler.WhileHandler);
		spellHandler.put(SpellPackage.Literals.FOR_STMT, Handler.ForHandler);
		
		spellHandler.put(SpellPackage.Literals.TRY_STMT, Handler.TryHandler);
		
		spellHandler.put(SpellPackage.Literals.BREAK_STMT, Handler.BreakHandler);
		spellHandler.put(SpellPackage.Literals.CONTINUE_STMT, Handler.ContinueHandler);
		
		spellHandler.put(SpellPackage.Literals.VERIFY, Handler.VerifyHandler);
		spellHandler.put(SpellPackage.Literals.ELSE_IF_STMT, Handler.ElseIfHandler);
		
		spellHandler.put(SpellPackage.Literals.FILE_INPUT, Handler.DefaultHandler2);
		spellHandler.put(SpellPackage.Literals.SUITE, Handler.SuiteHandler);
		
		spellHandler.put(SpellPackage.Literals.ATOM, Handler.StrHandler);
		
		
		spellHandler.put(SpellPackage.Literals.NOT_TEST, Handler.NotHandler);
		//spellHandler.put(SpellPackage.Literals.TEST, Handler.NotHandler);
		
		spellHandler.put(null, Handler.DefaultHandler);
	}
	private static SpellElement findBranchableObject(PythonHandler handler,SpellElement current,PythonAction action){
		Handler handler2 = spellHandler.get(current.eClass());
		if (handler2 == null){
			handler2 = spellHandler.get(null);
		}
		return handler2.findBranchableObject(handler,current,action);
		
	}
	
	protected void doFallBack(boolean b) {
		this.fallback = b;
		
	}

	protected boolean refactorTM(SpellElement current, StepContext context,boolean reportWrongEntries) {
		//System.out.println("Refactoring TM " + current);
		boolean refactored = false;
		if (current == null)
			return false;
		if (tmRefactorings == null)
			return false;
		boolean isInBrackets = current instanceof atom &&  ((atom) current).isSquareBracket();
		if (current instanceof atom && ! ((atom) current).isSquareBracket() && ! ((atom) current).isRoundBracket() && !((atom) current).isCurlyBracket()){
			if (!((atom) current).getStrings().isEmpty()){
				String lrv = ((atom) current).getStrings().get(0);
				//System.out.println("found TM " + lrv);
				if (lrv.startsWith("'")){
					lrv = lrv.substring(1,lrv.length()-1);
				}
				if (lrv.startsWith("T ")){
					lrv = lrv.split(" ")[1];
				}
				String newLrv = tmRefactorings.getRefactorings().get(lrv);
				if (newLrv != null){
					//System.out.println("Replacing TM " + lrv + " with " + newLrv);
					refactored = true;
					//newLrv = newLrv;
					((atom) current).getStrings().clear();
					((atom) current).getStrings().add(newLrv);
				} else {
					if (db != null && lrv != null){
						if (db.isTelemetryParameter(lrv)){
							refactored = true;
						}
					}
					
				}
				lrv = ((atom) current).getStrings().get(0);
				if (lrv.startsWith("'")){
					lrv = lrv.substring(1,lrv.length()-1);
				}
				if (lrv.startsWith("T ")){
					lrv = lrv.split(" ")[1];
				}
				
				if (db != null){
					if (!refactored && !db.isTelemetryParameter(lrv) && reportWrongEntries){
						//System.out.println("TM ("+lrv+") is not in DB!");

						createTMProblemMarker(this,current,lrv);
						refactored = true;
					}
				}
			} else if (((atom)current).getName() != null){
				((atom)current).getName();

			}
		} else {
			EList<EObject> eContents = current.eContents();
			for (EObject eObject : eContents) {		
				if (refactored){
					reportWrongEntries = false;
				}
				refactored = refactorTM((SpellElement) eObject, context,reportWrongEntries) || refactored;
				if (refactored && isInBrackets && !(eObject instanceof atom && ((atom)eObject).isSquareBracket())){
					return refactored;
				}
			}
		}
		return refactored;
	}
	
	protected boolean refactorTC(SpellElement current, StepContext context,boolean reportWrongEntries) {
		//System.out.println("Refactoring TM " + current);
		boolean refactored = false;
		if (current == null)
			return false;
		if (tcRefactorings == null)
			return false;
		boolean isInBrackets = current instanceof atom &&  ((atom) current).isSquareBracket();
		if (current instanceof atom && ! ((atom) current).isSquareBracket() && ! ((atom) current).isRoundBracket() && !((atom) current).isCurlyBracket()){
			if (!((atom) current).getStrings().isEmpty()){
				String lrv = ((atom) current).getStrings().get(0);
				//System.out.println("found TC " + lrv);
				if (lrv.startsWith("'")){
					lrv = lrv.substring(1,lrv.length()-1);
				}
				if (lrv.startsWith("C ")){
					lrv = lrv.split(" ")[1];
				}
				String newLrv = tcRefactorings.getRefactorings().get(lrv);
				if (newLrv != null){
					//System.out.println("Replacing TC " + lrv + " with " + newLrv);
					refactored = true;
					//newLrv = newLrv;
					((atom) current).getStrings().clear();
					((atom) current).getStrings().add(newLrv);
				} else {
					if (db != null && lrv != null){
						if (db.isTelecommand(lrv)){
							refactored = true;
						}
					}
					
				}
				lrv = ((atom) current).getStrings().get(0);
				if (lrv.startsWith("'")){
					lrv = lrv.substring(1,lrv.length()-1);
				}
				if (lrv.startsWith("C ")){
					lrv = lrv.split(" ")[1];
				}
				
				if (db != null){
					if (!refactored && !db.isTelecommand(lrv) && reportWrongEntries){
						//System.out.println("TM ("+lrv+") is not in DB!");

						createTCProblemMarker(this,current,lrv);
						refactored = true;
					}
				}
			} else if (((atom)current).getName() != null){
				((atom)current).getName();

			}
		} else {
			EList<EObject> eContents = current.eContents();
			for (EObject eObject : eContents) {		
				if (refactored){
					reportWrongEntries = false;
				}
				refactored = refactorTC((SpellElement) eObject, context,reportWrongEntries) || refactored;
				if (refactored && isInBrackets && !(eObject instanceof atom && ((atom)eObject).isSquareBracket())){
					return refactored;
				}
			}
		}
		return refactored;
	}
	
	
	private static PythonObject findPythonObject(PythonHandler handler,SpellElement current,PythonObject knownObject){
		Handler handler2 = spellHandler.get(current.eClass());
		if (handler2 == null){
			handler2 = spellHandler.get(null);
		}
		return handler2.findPythonObject(handler, current, knownObject);
		
	}
	private static PythonAction handleSpellStatement(PythonHandler handler,SpellElement current){
		ICompositeNode node = NodeModelUtils.getNode(current);
		//System.out.println("handling " + node.getStartLine() + " " + current.eClass().getName());
		Handler handler2 = spellHandler.get(current.eClass());
		if (handler2 == null){
			handler2 = spellHandler.get(null);
		} 
		//System.out.println("Handle " + current);
		handler2.handleComments(handler, extractComments(node));
		return handler2.handle(handler,current);
		
	}
	
	private static void collectConditions(PythonHandler handler,SpellElement node,List<DiGraphComment> conditions){

		final Function<SpellElement, Boolean> returnCondition = (SpellElement e) -> false;
	
		collectConditions(handler,node,conditions , returnCondition);
	}
	
	private static void collectConditions(PythonHandler handler,SpellElement node,List<DiGraphComment> conditions,Function<SpellElement, Boolean> returnCondition){
		if (node == null)
			return;
		Handler handler2 = spellHandler.get(node.eClass());
		if (handler2 == null){
			handler2 = spellHandler.get(null);
		} 
		handler2.collectLocalConditions(handler, (SpellElement) node, conditions,returnCondition);
	}
	
	
	private static String extractComments(ICompositeNode node) {

		Iterable<ILeafNode> leafNodes = node.getLeafNodes();
		String comments = "";
		boolean noteInProgress = false;
		for (ILeafNode iLeafNode : leafNodes) {
		
			String leafText = NodeModelUtils.getTokenText(iLeafNode).trim();
			if (!leafText.isEmpty()){
				if (!leafText.startsWith("#")){
					break;
				}
				leafText = leafText.substring(1).trim();
				if (!noteInProgress){
					if (!leafText.startsWith("NOTE:")){
						continue;
					} else {
						noteInProgress = true;
						leafText = leafText.substring("NOTE:".length()).trim();
					}
				}
					
			
				comments += leafText.trim() + "\n";
				//System.out.println(leafText);
			}
			
		}
		comments = comments.trim();
		
		return comments;
	}

	private static PythonAction branchSpellStatement(PythonHandler handler,SpellElement current){
		Handler handler2 = spellHandler.get(current.eClass());
		if (handler2 == null){
			handler2 = spellHandler.get(null);
		}
		
		return handler2.branch(handler,current);
		
	}
	
	
	private static void handleJoin(PythonHandler handler1,PythonHandler handler2,SpellElement current){
		Handler h = spellHandler.get(current.eClass());
		if (h == null){
			h = spellHandler.get(null);
		}
		h.join(handler1,handler2);
		
	}
	
	private static void handleInialization(PythonHandler handler,SpellElement current,PythonAction action){
		Handler handler2 = spellHandler.get(current.eClass());
		if (handler2 == null){
			handler2 = spellHandler.get(null);
		}
		handler2.initializeVariables(handler,current,action);		
	}
	private HashSet<Integer> problemMarkers = new HashSet<Integer>();
	private static java.util.concurrent.ConcurrentLinkedQueue<Runnable> markerJobs = null;
	
	private static Job markerJob = null;
	
	private synchronized static void createTMProblemMarker(final PythonHandler handler,
			final SpellElement current,final String tmValue) {
		
		System.out.println("Problem found at line " + NodeModelUtils.getNode(current).getStartLine() + " TM is " + tmValue);
		
		Runnable createMarkerJob = new Runnable(){
			

			@Override
			public void run() {
				IMarker marker;
				try {
					if (handler.problemMarkers.contains(NodeModelUtils.getNode(current).getStartLine()))
						return;
					marker = handler.spellFile.createMarker("lu.ses.engineering.spell.marker.MissingTM");

					marker.setAttribute(IMarker.MESSAGE, "TM '" + tmValue + "' could not be found in Database.");
					marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_NORMAL);
					marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
					marker.setAttribute(IMarker.LINE_NUMBER, NodeModelUtils.getNode(current).getStartLine());
					marker.setAttribute(IMarker.TEXT, "TM '" + tmValue + "' could not be found in Database.");
					handler.problemMarkers.add(NodeModelUtils.getNode(current).getStartLine());
					//marker.setAttribute(IMarker.CHAR_START, NodeModelUtils.getNode(current).getTotalOffset());
					//marker.setAttribute(IMarker.CHAR_END, NodeModelUtils.getNode(current).getTotalOffset() + NodeModelUtils.getNode(current).getTotalLength());
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		if (markerJobs == null){
			markerJobs = new ConcurrentLinkedQueue<Runnable>();
		}
		markerJobs.add(createMarkerJob);
		if (markerJob == null){
			markerJob = new Job("Spell Marking Job") {
				
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					monitor.beginTask("Creating Spell Marker", 1);
					
					while(markerJobs != null){
						try {
							Runnable poll = markerJobs.poll();
							if (poll != null)
								poll.run();
							try {
								if (markerJobs.isEmpty()){
									synchronized (this.getThread()) {
										Thread.sleep(50);
									}
								}
							} catch (Exception e) {

							}
							if ((markerJobCanFinish && markerJobs.isEmpty()) || monitor.isCanceled()){
								markerJobs = null;
							}
						} catch (Exception e){
							e.printStackTrace();
						}
					}
					markerJob = null;
					monitor.done();
					return Status.OK_STATUS;
				}
			};
			markerJob.schedule();
		}
	}
	
	private synchronized static void createTCProblemMarker(final PythonHandler handler,
			final SpellElement current,final String tmValue) {
		
		System.out.println("Problem found at line " + NodeModelUtils.getNode(current).getStartLine() + " TC is " + tmValue);
		
		Runnable createMarkerJob = new Runnable(){
			

			@Override
			public void run() {
				IMarker marker;
				try {
					if (handler.problemMarkers.contains(NodeModelUtils.getNode(current).getStartLine()))
						return;
					marker = handler.spellFile.createMarker("lu.ses.engineering.spell.marker.MissingTM");

					marker.setAttribute(IMarker.MESSAGE, "TC '" + tmValue + "' could not be found in Database.");
					marker.setAttribute(IMarker.PRIORITY, IMarker.PRIORITY_NORMAL);
					marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_WARNING);
					marker.setAttribute(IMarker.LINE_NUMBER, NodeModelUtils.getNode(current).getStartLine());
					marker.setAttribute(IMarker.TEXT, "TC '" + tmValue + "' could not be found in Database.");
					handler.problemMarkers.add(NodeModelUtils.getNode(current).getStartLine());
					//marker.setAttribute(IMarker.CHAR_START, NodeModelUtils.getNode(current).getTotalOffset());
					//marker.setAttribute(IMarker.CHAR_END, NodeModelUtils.getNode(current).getTotalOffset() + NodeModelUtils.getNode(current).getTotalLength());
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		if (markerJobs == null){
			markerJobs = new ConcurrentLinkedQueue<Runnable>();
		}
		markerJobs.add(createMarkerJob);
		if (markerJob == null){
			markerJob = new Job("Spell Marking Job") {
				
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					monitor.beginTask("Creating Spell Marker", 1);
					
					while(markerJobs != null){
						try {
							Runnable poll = markerJobs.poll();
							if (poll != null)
								poll.run();
							try {
								if (markerJobs.isEmpty()){
									synchronized (this.getThread()) {
										Thread.sleep(50);
									}
								}
							} catch (Exception e) {

							}
							if ((markerJobCanFinish && markerJobs.isEmpty()) || monitor.isCanceled()){
								markerJobs = null;
							}
						} catch (Exception e){
							e.printStackTrace();
						}
					}
					markerJob = null;
					monitor.done();
					return Status.OK_STATUS;
				}
			};
			markerJob.schedule();
		}
	}
	
	
	public String getCode(SpellElement e){
		//NodeModelUtils.getTokenText(NodeModelUtils.findActualNodeFor(e));
		return NodeModelUtils.findActualNodeFor(e).getText().trim();
	}
	
	//private HashMap<String,PythonObject> globals = new HashMap<>();
	private HashMap<String,PythonObject> locals = new HashMap<String, PythonObject>();

	private ArrayDeque<StepContext> stepContext = new ArrayDeque<StepContext>();

	private ArrayDeque<Step> steps = new ArrayDeque<Step>();
	private ArrayDeque<DisplayStep> displaySteps = new ArrayDeque<DisplayStep>();
	private ArrayDeque<Goto> gotoTargets = new ArrayDeque<Goto>();
	private ArrayDeque<String> imports = new ArrayDeque<String>();
	private ArrayDeque<ArrayDeque<? extends DiGraphNode>> contextStack = new ArrayDeque<ArrayDeque<? extends DiGraphNode>>();
	private LinkedHashSet<Pair<String, DiGraphNode<?>>> tmIdToStepMapping = new LinkedHashSet<Pair<String,DiGraphNode<?>>>();

	private ISpellDatabase db;

	private Refactorings tcRefactorings;

	private Refactorings tmRefactorings;

	private Refactorings stateRefactorings;

	private IFile spellFile;

	private Job handlerJob;
	
	private LinkedHashSet<DiGraphEdge> stepFlowInformation;
	
	private LinkedHashSet<String> ifConditions;
	private StepContext stepBaseObject;
	private PythonHandler handlerParent;
	private DiGraph diGraph;
	private IPreferenceStore prefs = null;
	private boolean collectTM = false;
	private boolean useSCP2TM = false;
	
	
	private static boolean markerJobCanFinish;
	
	public ArrayDeque<String> getImports() {
		return imports;
	}
	
	public PythonHandler(IFile spellFile,ISpellDatabase database,List<Refactorings> refactoring,IPreferenceStore prefs) {
		this.db = database;
		if (refactoring != null){
			for (Refactorings refactorings : refactoring) {
				if (refactorings.getRefactorings().get("TYPE").equals("TC")){
					this.tcRefactorings = refactorings;
				}
				if (refactorings.getRefactorings().get("TYPE").equals("TM")){
					this.tmRefactorings = refactorings;
				}
				if (refactorings.getRefactorings().get("TYPE").equals("STATES")){
					this.stateRefactorings = refactorings;
				}
			}
		}
		this.spellFile = spellFile;
		this.stepFlowInformation = new LinkedHashSet<DiGraphEdge>();
		this.ifConditions = new LinkedHashSet<String>();
		this.diGraph = new DiGraph(spellFile,prefs);
		stepContext.add(new StepContext(new DiGraphNode<SpellElement>(diGraph,null),null));
		stepBaseObject = stepContext.peekLast();
		origStepBaseObject = stepBaseObject;
		this.prefs = prefs;
		
	}
	
	private PythonHandler(PythonHandler handler,boolean separate){
		if (separate){
			//this.globals = new HashMap<>(handler.globals);
			this.setLocals(new HashMap<String, PythonObject>(handler.getLocals()));	
			this.stepContext = new ArrayDeque<StepContext>(handler.stepContext);
			
			this.ifConditions = new LinkedHashSet<String>(handler.ifConditions);
			this.stepBaseObject = handler.stepBaseObject;
		} else {
			//this.globals = handler.globals;
			this.setLocals(handler.getLocals());
			this.stepContext = handler.stepContext;
			this.ifConditions = handler.ifConditions;
			this.stepBaseObject = handler.stepBaseObject;
			this.origStepBaseObject = handler.origStepBaseObject;
		}
		this.contextStack = handler.contextStack;
		this.diGraph = handler.diGraph;
		this.spellFile = handler.spellFile;
		this.imports = handler.imports;
		this.steps = handler.steps;
		this.displaySteps = handler.displaySteps;
		this.gotoTargets = handler.gotoTargets;
		this.tcRefactorings = handler.tcRefactorings;
		this.tmRefactorings = handler.tmRefactorings;
		this.stateRefactorings = handler.stateRefactorings;
		this.stepFlowInformation = handler.stepFlowInformation;
		this.prefs = handler.prefs;
		this.handlerParent = handler;
		this.db = handler.db;
		this.tmIdToStepMapping = handler.tmIdToStepMapping;
		this.setCollectTM(handler.isCollectTM());
		this.setUseSCP2TM(handler.isUseSCP2TM());
		
	}
	
	public void dispose(){
		this.imports = null;
		this.steps =null;
		this.displaySteps = null;
		this.gotoTargets = null;
		this.tcRefactorings = null;
		this.tmRefactorings = null;
		this.stateRefactorings = null;
		this.stepFlowInformation = null;
		this.tmIdToStepMapping = null;
	}
	
	public LinkedHashSet<Pair<String, DiGraphNode<?>>> getTmIdToStepMapping() {
		return tmIdToStepMapping;
	}
	
	public void waitForResult(){
		
		
		//Display display = Display.getDefault();
		
		//while (!finished) {
		//	if (!display.readAndDispatch())
		//		display.sleep();
		//}
		if (handlerJob != null){
			try {
				handlerJob.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void waitForMarker(){
		//Display display = Display.getDefault();
		markerJobCanFinish = true;
		try {
			if (markerJob != null)
				markerJob.join();
		} catch (InterruptedException e) {
			
		}
		//while (markerJob != null) {
		//	if (!display.readAndDispatch())
		//		display.sleep();
		//}
	}
	
	private boolean finished = false;
	public void handle(final SpellElement pyRoot) {
		finished = false;
		handlerJob = new Job("Python Handler Job"){

			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("Handling Spell procedure", 1);
				handleSpellStatement(PythonHandler.this, pyRoot);
				branchSpellStatement(PythonHandler.this, pyRoot);
				monitor.done();
				finished = true;
				handlerJob = null;
				return Status.OK_STATUS;
			}
			
		};
		handlerJob.schedule();
		
 		/*ArrayDeque<SpellElement> currentElements = new ArrayDeque<>();
		currentElements.add(pyRoot);
		while (!currentElements.isEmpty()){
			SpellElement current = currentElements.pollFirst();
			
			PythonAction action = handleSpellStatement(this, current);
			
			//ICompositeNode node = NodeModelUtils.getNode(current);
			//System.out.println(node.getStartLine() + " " + current.eClass().getName());
			switch (action){
			case StartBranchInSameContext:
				branchWithSameContext(pyRoot, current);
				break;
			case StartSeperatedBranches:
				branchWithNewContext(current);
				break;
			default:
				break;
			}
			
		
			currentElements.addAll(current.getNextStatements());
		}*/
	}
	public PythonAction branchWithNewContext(SpellElement current,PythonAction action) {
		SpellElement lastSource = null;
		int amtFallback = 0;
		int amtRegular = 0;
		do {
			SpellElement branchable = findBranchableObject(this, current,action);
			action = action.setSource(action.getNextSource());
			lastSource = action.getSource();
			if (branchable == null)
				return PythonAction.None;
			
			//System.out.println("Branch new Context source: " + branchable + " next statements are: " + branchable.getAlternativeNextStatements());
			if (branchable!= null && !branchable.getAlternativeNextStatements().isEmpty()){

				ArrayDeque<PythonHandler> branches = new ArrayDeque<PythonHandler>();

				for (SpellElement branch : branchable.getAlternativeNextStatements()) {
					//if (branch.equals(pyRoot.eContainer()))
					//	continue;
					
					PythonHandler branchHandler = new PythonHandler(this,true);
					Handler handler2 = spellHandler.get(branch.eClass());
					if (handler2 == null){
						handler2 = spellHandler.get(null);
					} 
					//System.out.println("Branch target: " + branch + " handler is: " + handler2);
					handleInialization(branchHandler,branchable,action);
					//branchHandler.handle(branch);
					
					handleSpellStatement(branchHandler, branch);
					
					PythonAction endAction = branchSpellStatement(branchHandler, branch);
					if (endAction.equals(PythonAction.FallBack)){
						amtFallback++;
						branches.push(branchHandler);
					} else {
						amtRegular++;
						branches.push(branchHandler);
					}
					


				}
				for (PythonHandler branchHandler : branches) {
					if (!branchHandler.fallback)
						handleJoin(this, branchHandler, branchable);
				}
			}
			
		} while (lastSource != null);
		Handler handler2 = spellHandler.get(current.eClass());
		if (handler2 == null){
			handler2 = spellHandler.get(null);
		} 
		action = handler2.handleFallback(action,current,this,amtFallback,amtRegular);
		if (!action.equals(PythonAction.FallBack)){
			
			amtFallback = 0;
		}
		if (amtFallback > 0 && amtRegular == 0){
			this.doFallBack(true);
			return PythonAction.FallBack;
		}
		return PythonAction.None;
	}
	public PythonAction branchWithSameContext(SpellElement pyRoot,
			SpellElement current,PythonAction action) {
		SpellElement lastSource = null;
		do {
			SpellElement branchable = findBranchableObject(this, current,action);
			action = action.setSource(action.getNextSource());
			lastSource = action.getSource();
			if (branchable == null)
				return PythonAction.FallBack;
			//System.out.println("Branch new Context source: " + branchable + " next statements are: " + branchable.getAlternativeNextStatements());
			if (branchable != null && !branchable.getAlternativeNextStatements( ) .isEmpty()){

				for (SpellElement branch : branchable.getAlternativeNextStatements()) {
					Handler handler2 = spellHandler.get(branch.eClass());
					if (handler2 == null){
						handler2 = spellHandler.get(null);
					} 
					//System.out.println("Branch target: " + branch + " handler is: " + handler2);
					if (branch.equals(pyRoot.eContainer()))
						continue;
					PythonHandler branchHandler = new PythonHandler(this,false);
					handleInialization(this,branchable,action);
					//branchHandler.handle(branch);
					handleSpellStatement(branchHandler, branch);
					branchSpellStatement(branchHandler, branch);

					handleJoin(this, branchHandler, branchable);

				}

			}
		} while (lastSource != null);
		return PythonAction.None;
	}
	public LinkedHashSet<DiGraphEdge> getStepFlowInformation() {
		return stepFlowInformation;
	}
	private static void addContinueInformation(PythonHandler handler){
		StepContext baseContext = handler.stepBaseObject;
		StepContext currentContext = handler.stepContext.peekLast();
		if (!baseContext.equals(currentContext)){ 
			for (DiGraphNode<?> last : currentContext) {
				if (last.isGoto())
					continue;
				for (DiGraphNode<?> first : baseContext) {
					handler.stepFlowInformation.add(new DiGraphEdge(last, first, false).setConstraining(false));
					//handler.stepFlowInformation.add("\"" + last.split(" := ")[0] + "\" -> \"" + first.split(" := ")[0] + "\"");
				}
			}
		}
	}
	private static void addBreakInformation(PythonHandler handler){
		StepContext baseContext = handler.stepBaseObject;
		StepContext currentContext = handler.stepContext.peekLast();
		
		baseContext.addDelayedContext(new StepContext(currentContext));
		
	}
	
	private static void joinHandlerInLoop(PythonHandler handler1,
			PythonHandler handler2) {
		for (Entry<String, PythonObject> entry : handler2.getLocals().entrySet()) {
			PythonObject newObject = CompoundPythonObject.joinObjects(entry.getValue(),handler1.getLocals().get(entry.getKey()));
			PythonObject put = handler1.getLocals().put(entry.getKey(),newObject);
			if (put != null && !put.equals(newObject))
				for (SpellElement s : put.origin){
				newObject.origin.add(s);
			}
		}
		handler2.setLocals(handler1.getLocals());
		if (!handler1.stepContext.isEmpty()){
			StepContext currentContext = handler1.stepContext.getLast();

			StepContext firstContextInLoop = handler1.stepBaseObject;//iterator.next();
			StepContext lastContextInLoop = handler2.stepContext.getLast();
			if (!firstContextInLoop.equals(lastContextInLoop)){ 
				for (DiGraphNode<?> last : lastContextInLoop) {
					if (last.isGoto())
						continue;

					for (DiGraphNode<?> first : firstContextInLoop) {
						if (!last.equals(first))
							handler1.stepFlowInformation.add(new DiGraphEdge(last, first, false).setConstraining(false));
						//handler1.stepFlowInformation.add("\"" + last.split(" := ")[0] + "\" -> \"" + first.split(" := ")[0] + "\"");
					}
				}
			}
			if (!currentContext.equals(handler2.stepContext.getLast())){
				StepContext last = handler2.stepContext.getLast();
				handler2.stepContext.removeAll(handler1.stepContext);
				handler1.stepContext.addAll(handler2.stepContext);
				handler1.stepContext.add(currentContext.joinContext(last));
			}
		} else if (!handler2.stepContext.isEmpty()){
			handler1.stepContext = handler2.stepContext;
		}
		handler2.dispose();
	}

	private static void handleDelayedContexts(PythonHandler handler,
			ArrayDeque<StepContext> delayedContexts, DiGraphNode<?> context) {
		for (StepContext lastContext : delayedContexts) {
			
			for (DiGraphNode<?> lastStep : lastContext){
				if (lastStep.isGoto())
					continue;
				if (lastStep.isUndefined()){
					handler.getStepFlowInformation().add(new DiGraphEdge(DiGraphNode.STARTNODE, context, false));
					//handler.getStepFlowInformation().add("\"Procedure Started\" -> \"" + context.getName().split(" := ")[0] + "\"");
				} else {
					handler.getStepFlowInformation().add(new DiGraphEdge(lastStep, context, false));
					//handler.getStepFlowInformation().add("\"" + lastStep.split(" := ")[0] + "\" -> \"" + context.getName().split(" := ")[0] + "\"");
				}
				
			}
		}
		delayedContexts.clear();
		
		
	}
	private static void joinHandlerOutsideLoop(PythonHandler handler1,
			PythonHandler handler2) {
		for (Entry<String, PythonObject> entry : handler2.getLocals().entrySet()) {
			PythonObject newObject = CompoundPythonObject.joinObjects(entry.getValue(),handler1.getLocals().get(entry.getKey()));
			PythonObject put = handler1.getLocals().put(entry.getKey(),newObject);
			if (put != null && !put.equals(newObject)){
				for (SpellElement s : put.origin){
					newObject.origin.add(s);
				}
			}
		}
		
		handler2.setLocals(handler1.getLocals());
		if (!handler1.stepContext.isEmpty()){
			StepContext currentContext = handler1.stepContext.getLast();
			
			if (!currentContext.equals(handler2.stepContext.getLast())){
				StepContext last = handler2.stepContext.getLast();
				if (currentContext.isDeadEnd()){
					if (!currentContext.getId().equals(last.getId())){
						currentContext = new StepContext(currentContext);
						currentContext.getId().clear();
						currentContext.setDeadEnd(false);
						handler1.stepContext.addLast(currentContext);
					} else {
						currentContext.setDeadEnd(false);
					}
				}
				
				handler2.stepContext.removeAll(handler1.stepContext);
				handler1.stepContext.addAll(handler2.stepContext);
				handler1.stepContext.addLast(currentContext.joinContext(last));
				handler1.getLastContext().setDeadEnd(false);
			} else {
				currentContext.setDeadEnd(false);
			}
		} else if (!handler2.stepContext.isEmpty()){
			handler1.stepContext = handler2.stepContext;
		}
		
		handler1.fallback = handler2.fallback;
		handler2.dispose();
	}
	public ArrayDeque<Step> getSteps() {
		// TODO Auto-generated method stub
		return steps;
	}
	
	public ArrayDeque<Goto> getGotoTargets() {
		return gotoTargets;
	}
	
	public ArrayDeque<DisplayStep> getDisplaySteps() {
		return displaySteps;
	}
	public StepContext getLastContext() {
		// TODO Auto-generated method stub
		return stepContext.peekLast();
	}

	public DiGraph getDiGraph() {
		// TODO Auto-generated method stub
		return diGraph;
	}
	public static final String SHOW_START_PROC = "DotShowStartProc";
	public static final String SHOW_PROMPT = "DotShowPrompt";
	public static final String COLLECT_ALL_CONDITIONS= "";
	
	public boolean getProperty(String property){
		if (prefs == null){
			prefs = new PreferenceStore();
		}
		return prefs.getBoolean(property);
	}

	public HashMap<String,PythonObject> getLocals() {
		return locals;
	}

	public void setLocals(HashMap<String,PythonObject> locals) {
		this.locals = locals;
	}

	public boolean isCollectTM() {
		return collectTM;
	}

	public void setCollectTM(boolean collectTM) {
		this.collectTM = collectTM;
	}

	public boolean isUseSCP2TM() {
		return useSCP2TM;
	}

	public void setUseSCP2TM(boolean useSCP2TM) {
		this.useSCP2TM = useSCP2TM;
	}
	
}
