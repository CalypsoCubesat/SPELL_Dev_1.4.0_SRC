/**
 */
package lu.ses.engineering.spell.controlflow.spell.util;

import lu.ses.engineering.spell.controlflow.spell.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage
 * @generated
 */
public class SpellAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpellPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpellAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SpellPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpellSwitch<Adapter> modelSwitch =
		new SpellSwitch<Adapter>() {
			@Override
			public Adapter casesingle_input(single_input object) {
				return createsingle_inputAdapter();
			}
			@Override
			public Adapter casefile_input(file_input object) {
				return createfile_inputAdapter();
			}
			@Override
			public Adapter caseeval_input(eval_input object) {
				return createeval_inputAdapter();
			}
			@Override
			public Adapter casedecorator(decorator object) {
				return createdecoratorAdapter();
			}
			@Override
			public Adapter casedecorators(decorators object) {
				return createdecoratorsAdapter();
			}
			@Override
			public Adapter casedecorated(decorated object) {
				return createdecoratedAdapter();
			}
			@Override
			public Adapter casefuncdef(funcdef object) {
				return createfuncdefAdapter();
			}
			@Override
			public Adapter caseparameters(parameters object) {
				return createparametersAdapter();
			}
			@Override
			public Adapter casevarargslist_element(varargslist_element object) {
				return createvarargslist_elementAdapter();
			}
			@Override
			public Adapter casevarargslist(varargslist object) {
				return createvarargslistAdapter();
			}
			@Override
			public Adapter casefpdef(fpdef object) {
				return createfpdefAdapter();
			}
			@Override
			public Adapter casefplist(fplist object) {
				return createfplistAdapter();
			}
			@Override
			public Adapter casestmt(stmt object) {
				return createstmtAdapter();
			}
			@Override
			public Adapter casesimple_stmt(simple_stmt object) {
				return createsimple_stmtAdapter();
			}
			@Override
			public Adapter casesmall_stmt(small_stmt object) {
				return createsmall_stmtAdapter();
			}
			@Override
			public Adapter caseexpr_stmt(expr_stmt object) {
				return createexpr_stmtAdapter();
			}
			@Override
			public Adapter caseyield_or_testlist(yield_or_testlist object) {
				return createyield_or_testlistAdapter();
			}
			@Override
			public Adapter casedel_stmt(del_stmt object) {
				return createdel_stmtAdapter();
			}
			@Override
			public Adapter casepass_stmt(pass_stmt object) {
				return createpass_stmtAdapter();
			}
			@Override
			public Adapter caseflow_stmt(flow_stmt object) {
				return createflow_stmtAdapter();
			}
			@Override
			public Adapter casebreak_stmt(break_stmt object) {
				return createbreak_stmtAdapter();
			}
			@Override
			public Adapter casecontinue_stmt(continue_stmt object) {
				return createcontinue_stmtAdapter();
			}
			@Override
			public Adapter casereturn_stmt(return_stmt object) {
				return createreturn_stmtAdapter();
			}
			@Override
			public Adapter caseyield_stmt(yield_stmt object) {
				return createyield_stmtAdapter();
			}
			@Override
			public Adapter caseraise_stmt(raise_stmt object) {
				return createraise_stmtAdapter();
			}
			@Override
			public Adapter caseimport_stmt(import_stmt object) {
				return createimport_stmtAdapter();
			}
			@Override
			public Adapter caseimport_name(import_name object) {
				return createimport_nameAdapter();
			}
			@Override
			public Adapter caseimport_from(import_from object) {
				return createimport_fromAdapter();
			}
			@Override
			public Adapter caseimport_as_name(import_as_name object) {
				return createimport_as_nameAdapter();
			}
			@Override
			public Adapter casedotted_as_name(dotted_as_name object) {
				return createdotted_as_nameAdapter();
			}
			@Override
			public Adapter caseimport_as_names(import_as_names object) {
				return createimport_as_namesAdapter();
			}
			@Override
			public Adapter casedotted_as_names(dotted_as_names object) {
				return createdotted_as_namesAdapter();
			}
			@Override
			public Adapter caseglobal_stmt(global_stmt object) {
				return createglobal_stmtAdapter();
			}
			@Override
			public Adapter caseexec_stmt(exec_stmt object) {
				return createexec_stmtAdapter();
			}
			@Override
			public Adapter caseassert_stmt(assert_stmt object) {
				return createassert_stmtAdapter();
			}
			@Override
			public Adapter casecompound_stmt(compound_stmt object) {
				return createcompound_stmtAdapter();
			}
			@Override
			public Adapter caseelse_if_stmt(else_if_stmt object) {
				return createelse_if_stmtAdapter();
			}
			@Override
			public Adapter caseif_stmt(if_stmt object) {
				return createif_stmtAdapter();
			}
			@Override
			public Adapter casewhile_stmt(while_stmt object) {
				return createwhile_stmtAdapter();
			}
			@Override
			public Adapter casefor_stmt(for_stmt object) {
				return createfor_stmtAdapter();
			}
			@Override
			public Adapter casetry_stmt(try_stmt object) {
				return createtry_stmtAdapter();
			}
			@Override
			public Adapter casewith_stmt(with_stmt object) {
				return createwith_stmtAdapter();
			}
			@Override
			public Adapter casewith_item(with_item object) {
				return createwith_itemAdapter();
			}
			@Override
			public Adapter caseexcept_clause(except_clause object) {
				return createexcept_clauseAdapter();
			}
			@Override
			public Adapter casesuite(suite object) {
				return createsuiteAdapter();
			}
			@Override
			public Adapter casetestlist_safe(testlist_safe object) {
				return createtestlist_safeAdapter();
			}
			@Override
			public Adapter casetest(test object) {
				return createtestAdapter();
			}
			@Override
			public Adapter caseor_test(or_test object) {
				return createor_testAdapter();
			}
			@Override
			public Adapter caseand_test(and_test object) {
				return createand_testAdapter();
			}
			@Override
			public Adapter casenot_test(not_test object) {
				return createnot_testAdapter();
			}
			@Override
			public Adapter casecomparison(comparison object) {
				return createcomparisonAdapter();
			}
			@Override
			public Adapter caseexpr(expr object) {
				return createexprAdapter();
			}
			@Override
			public Adapter casexor_expr(xor_expr object) {
				return createxor_exprAdapter();
			}
			@Override
			public Adapter caseand_expr(and_expr object) {
				return createand_exprAdapter();
			}
			@Override
			public Adapter caseshift_expr(shift_expr object) {
				return createshift_exprAdapter();
			}
			@Override
			public Adapter casearith_expr(arith_expr object) {
				return createarith_exprAdapter();
			}
			@Override
			public Adapter caseterm(term object) {
				return createtermAdapter();
			}
			@Override
			public Adapter casefactor(factor object) {
				return createfactorAdapter();
			}
			@Override
			public Adapter casepower(power object) {
				return createpowerAdapter();
			}
			@Override
			public Adapter caseyield_or_testlist_comp(yield_or_testlist_comp object) {
				return createyield_or_testlist_compAdapter();
			}
			@Override
			public Adapter caseatom(atom object) {
				return createatomAdapter();
			}
			@Override
			public Adapter caselistmaker(listmaker object) {
				return createlistmakerAdapter();
			}
			@Override
			public Adapter casetestlist_comp(testlist_comp object) {
				return createtestlist_compAdapter();
			}
			@Override
			public Adapter caselambdef(lambdef object) {
				return createlambdefAdapter();
			}
			@Override
			public Adapter casetrailer(trailer object) {
				return createtrailerAdapter();
			}
			@Override
			public Adapter casesubscriptlist(subscriptlist object) {
				return createsubscriptlistAdapter();
			}
			@Override
			public Adapter casesubscript(subscript object) {
				return createsubscriptAdapter();
			}
			@Override
			public Adapter casesliceop(sliceop object) {
				return createsliceopAdapter();
			}
			@Override
			public Adapter caseexprlist(exprlist object) {
				return createexprlistAdapter();
			}
			@Override
			public Adapter casetestlist(testlist object) {
				return createtestlistAdapter();
			}
			@Override
			public Adapter casedictorset_entry(dictorset_entry object) {
				return createdictorset_entryAdapter();
			}
			@Override
			public Adapter casedictorsetmaker(dictorsetmaker object) {
				return createdictorsetmakerAdapter();
			}
			@Override
			public Adapter caseclassdef(classdef object) {
				return createclassdefAdapter();
			}
			@Override
			public Adapter casearglist(arglist object) {
				return createarglistAdapter();
			}
			@Override
			public Adapter caseargument(argument object) {
				return createargumentAdapter();
			}
			@Override
			public Adapter caselist_iter(list_iter object) {
				return createlist_iterAdapter();
			}
			@Override
			public Adapter caselist_for(list_for object) {
				return createlist_forAdapter();
			}
			@Override
			public Adapter caselist_if(list_if object) {
				return createlist_ifAdapter();
			}
			@Override
			public Adapter casecomp_iter(comp_iter object) {
				return createcomp_iterAdapter();
			}
			@Override
			public Adapter casecomp_for(comp_for object) {
				return createcomp_forAdapter();
			}
			@Override
			public Adapter casecomp_if(comp_if object) {
				return createcomp_ifAdapter();
			}
			@Override
			public Adapter casetestlist1(testlist1 object) {
				return createtestlist1Adapter();
			}
			@Override
			public Adapter caseyield_expr(yield_expr object) {
				return createyield_exprAdapter();
			}
			@Override
			public Adapter caseSpellElement(SpellElement object) {
				return createSpellElementAdapter();
			}
			@Override
			public Adapter casefunctioncall(functioncall object) {
				return createfunctioncallAdapter();
			}
			@Override
			public Adapter casepython_input(python_input object) {
				return createpython_inputAdapter();
			}
			@Override
			public Adapter caseStep(Step object) {
				return createStepAdapter();
			}
			@Override
			public Adapter caseVerify(Verify object) {
				return createVerifyAdapter();
			}
			@Override
			public Adapter caseSend(Send object) {
				return createSendAdapter();
			}
			@Override
			public Adapter caseShowTM(ShowTM object) {
				return createShowTMAdapter();
			}
			@Override
			public Adapter caseGetTM(GetTM object) {
				return createGetTMAdapter();
			}
			@Override
			public Adapter caseassignment_stmt(assignment_stmt object) {
				return createassignment_stmtAdapter();
			}
			@Override
			public Adapter caseChangeLanguageConfig(ChangeLanguageConfig object) {
				return createChangeLanguageConfigAdapter();
			}
			@Override
			public Adapter caseSetLimits(SetLimits object) {
				return createSetLimitsAdapter();
			}
			@Override
			public Adapter caseBuildTC(BuildTC object) {
				return createBuildTCAdapter();
			}
			@Override
			public Adapter caseGoto(Goto object) {
				return createGotoAdapter();
			}
			@Override
			public Adapter caseDisplayStep(DisplayStep object) {
				return createDisplayStepAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.single_input <em>single input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.single_input
	 * @generated
	 */
	public Adapter createsingle_inputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.file_input <em>file input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.file_input
	 * @generated
	 */
	public Adapter createfile_inputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.eval_input <em>eval input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.eval_input
	 * @generated
	 */
	public Adapter createeval_inputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.decorator <em>decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.decorator
	 * @generated
	 */
	public Adapter createdecoratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.decorators <em>decorators</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.decorators
	 * @generated
	 */
	public Adapter createdecoratorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.decorated <em>decorated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.decorated
	 * @generated
	 */
	public Adapter createdecoratedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.funcdef <em>funcdef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.funcdef
	 * @generated
	 */
	public Adapter createfuncdefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.parameters <em>parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.parameters
	 * @generated
	 */
	public Adapter createparametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.varargslist_element <em>varargslist element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.varargslist_element
	 * @generated
	 */
	public Adapter createvarargslist_elementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.varargslist <em>varargslist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.varargslist
	 * @generated
	 */
	public Adapter createvarargslistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.fpdef <em>fpdef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.fpdef
	 * @generated
	 */
	public Adapter createfpdefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.fplist <em>fplist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.fplist
	 * @generated
	 */
	public Adapter createfplistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.stmt <em>stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.stmt
	 * @generated
	 */
	public Adapter createstmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.simple_stmt <em>simple stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.simple_stmt
	 * @generated
	 */
	public Adapter createsimple_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.small_stmt <em>small stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.small_stmt
	 * @generated
	 */
	public Adapter createsmall_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.expr_stmt <em>expr stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.expr_stmt
	 * @generated
	 */
	public Adapter createexpr_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.yield_or_testlist <em>yield or testlist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.yield_or_testlist
	 * @generated
	 */
	public Adapter createyield_or_testlistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.del_stmt <em>del stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.del_stmt
	 * @generated
	 */
	public Adapter createdel_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.pass_stmt <em>pass stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.pass_stmt
	 * @generated
	 */
	public Adapter createpass_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.flow_stmt <em>flow stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.flow_stmt
	 * @generated
	 */
	public Adapter createflow_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.break_stmt <em>break stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.break_stmt
	 * @generated
	 */
	public Adapter createbreak_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.continue_stmt <em>continue stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.continue_stmt
	 * @generated
	 */
	public Adapter createcontinue_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.return_stmt <em>return stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.return_stmt
	 * @generated
	 */
	public Adapter createreturn_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.yield_stmt <em>yield stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.yield_stmt
	 * @generated
	 */
	public Adapter createyield_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.raise_stmt <em>raise stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.raise_stmt
	 * @generated
	 */
	public Adapter createraise_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.import_stmt <em>import stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_stmt
	 * @generated
	 */
	public Adapter createimport_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.import_name <em>import name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_name
	 * @generated
	 */
	public Adapter createimport_nameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.import_from <em>import from</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_from
	 * @generated
	 */
	public Adapter createimport_fromAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.import_as_name <em>import as name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_as_name
	 * @generated
	 */
	public Adapter createimport_as_nameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.dotted_as_name <em>dotted as name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.dotted_as_name
	 * @generated
	 */
	public Adapter createdotted_as_nameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.import_as_names <em>import as names</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_as_names
	 * @generated
	 */
	public Adapter createimport_as_namesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.dotted_as_names <em>dotted as names</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.dotted_as_names
	 * @generated
	 */
	public Adapter createdotted_as_namesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.global_stmt <em>global stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.global_stmt
	 * @generated
	 */
	public Adapter createglobal_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.exec_stmt <em>exec stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.exec_stmt
	 * @generated
	 */
	public Adapter createexec_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.assert_stmt <em>assert stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.assert_stmt
	 * @generated
	 */
	public Adapter createassert_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.compound_stmt <em>compound stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.compound_stmt
	 * @generated
	 */
	public Adapter createcompound_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.else_if_stmt <em>else if stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.else_if_stmt
	 * @generated
	 */
	public Adapter createelse_if_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.if_stmt <em>if stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.if_stmt
	 * @generated
	 */
	public Adapter createif_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.while_stmt <em>while stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.while_stmt
	 * @generated
	 */
	public Adapter createwhile_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.for_stmt <em>for stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.for_stmt
	 * @generated
	 */
	public Adapter createfor_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.try_stmt <em>try stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.try_stmt
	 * @generated
	 */
	public Adapter createtry_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.with_stmt <em>with stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.with_stmt
	 * @generated
	 */
	public Adapter createwith_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.with_item <em>with item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.with_item
	 * @generated
	 */
	public Adapter createwith_itemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.except_clause <em>except clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.except_clause
	 * @generated
	 */
	public Adapter createexcept_clauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.suite <em>suite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.suite
	 * @generated
	 */
	public Adapter createsuiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.testlist_safe <em>testlist safe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist_safe
	 * @generated
	 */
	public Adapter createtestlist_safeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.test <em>test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.test
	 * @generated
	 */
	public Adapter createtestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.or_test <em>or test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.or_test
	 * @generated
	 */
	public Adapter createor_testAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.and_test <em>and test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.and_test
	 * @generated
	 */
	public Adapter createand_testAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.not_test <em>not test</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.not_test
	 * @generated
	 */
	public Adapter createnot_testAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.comparison <em>comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.comparison
	 * @generated
	 */
	public Adapter createcomparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.expr <em>expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.expr
	 * @generated
	 */
	public Adapter createexprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.xor_expr <em>xor expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.xor_expr
	 * @generated
	 */
	public Adapter createxor_exprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.and_expr <em>and expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.and_expr
	 * @generated
	 */
	public Adapter createand_exprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.shift_expr <em>shift expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.shift_expr
	 * @generated
	 */
	public Adapter createshift_exprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.arith_expr <em>arith expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.arith_expr
	 * @generated
	 */
	public Adapter createarith_exprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.term <em>term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.term
	 * @generated
	 */
	public Adapter createtermAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.factor <em>factor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.factor
	 * @generated
	 */
	public Adapter createfactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.power <em>power</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.power
	 * @generated
	 */
	public Adapter createpowerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.yield_or_testlist_comp <em>yield or testlist comp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.yield_or_testlist_comp
	 * @generated
	 */
	public Adapter createyield_or_testlist_compAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.atom <em>atom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.atom
	 * @generated
	 */
	public Adapter createatomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.listmaker <em>listmaker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.listmaker
	 * @generated
	 */
	public Adapter createlistmakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.testlist_comp <em>testlist comp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist_comp
	 * @generated
	 */
	public Adapter createtestlist_compAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.lambdef <em>lambdef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.lambdef
	 * @generated
	 */
	public Adapter createlambdefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.trailer <em>trailer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.trailer
	 * @generated
	 */
	public Adapter createtrailerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.subscriptlist <em>subscriptlist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.subscriptlist
	 * @generated
	 */
	public Adapter createsubscriptlistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.subscript <em>subscript</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.subscript
	 * @generated
	 */
	public Adapter createsubscriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.sliceop <em>sliceop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.sliceop
	 * @generated
	 */
	public Adapter createsliceopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.exprlist <em>exprlist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.exprlist
	 * @generated
	 */
	public Adapter createexprlistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.testlist <em>testlist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist
	 * @generated
	 */
	public Adapter createtestlistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.dictorset_entry <em>dictorset entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.dictorset_entry
	 * @generated
	 */
	public Adapter createdictorset_entryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.dictorsetmaker <em>dictorsetmaker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.dictorsetmaker
	 * @generated
	 */
	public Adapter createdictorsetmakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.classdef <em>classdef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.classdef
	 * @generated
	 */
	public Adapter createclassdefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.arglist <em>arglist</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.arglist
	 * @generated
	 */
	public Adapter createarglistAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.argument <em>argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.argument
	 * @generated
	 */
	public Adapter createargumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.list_iter <em>list iter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.list_iter
	 * @generated
	 */
	public Adapter createlist_iterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.list_for <em>list for</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.list_for
	 * @generated
	 */
	public Adapter createlist_forAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.list_if <em>list if</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.list_if
	 * @generated
	 */
	public Adapter createlist_ifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.comp_iter <em>comp iter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.comp_iter
	 * @generated
	 */
	public Adapter createcomp_iterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.comp_for <em>comp for</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.comp_for
	 * @generated
	 */
	public Adapter createcomp_forAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.comp_if <em>comp if</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.comp_if
	 * @generated
	 */
	public Adapter createcomp_ifAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.testlist1 <em>testlist1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist1
	 * @generated
	 */
	public Adapter createtestlist1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.yield_expr <em>yield expr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.yield_expr
	 * @generated
	 */
	public Adapter createyield_exprAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.SpellElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellElement
	 * @generated
	 */
	public Adapter createSpellElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.functioncall <em>functioncall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.functioncall
	 * @generated
	 */
	public Adapter createfunctioncallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.python_input <em>python input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.python_input
	 * @generated
	 */
	public Adapter createpython_inputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.Verify <em>Verify</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.Verify
	 * @generated
	 */
	public Adapter createVerifyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.Send <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.Send
	 * @generated
	 */
	public Adapter createSendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.BuildTC <em>Build TC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.BuildTC
	 * @generated
	 */
	public Adapter createBuildTCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.Goto <em>Goto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.Goto
	 * @generated
	 */
	public Adapter createGotoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.DisplayStep <em>Display Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.DisplayStep
	 * @generated
	 */
	public Adapter createDisplayStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.ShowTM <em>Show TM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.ShowTM
	 * @generated
	 */
	public Adapter createShowTMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.GetTM <em>Get TM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.GetTM
	 * @generated
	 */
	public Adapter createGetTMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.assignment_stmt <em>assignment stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.assignment_stmt
	 * @generated
	 */
	public Adapter createassignment_stmtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.ChangeLanguageConfig <em>Change Language Config</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.ChangeLanguageConfig
	 * @generated
	 */
	public Adapter createChangeLanguageConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.controlflow.spell.SetLimits <em>Set Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see lu.ses.engineering.spell.controlflow.spell.SetLimits
	 * @generated
	 */
	public Adapter createSetLimitsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SpellAdapterFactory
