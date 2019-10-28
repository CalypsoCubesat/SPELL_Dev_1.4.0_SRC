/**
 */
package lu.ses.engineering.spell.controlflow.spell.util;

import lu.ses.engineering.spell.controlflow.spell.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage
 * @generated
 */
public class SpellSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SpellPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpellSwitch() {
		if (modelPackage == null) {
			modelPackage = SpellPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SpellPackage.SINGLE_INPUT: {
				single_input single_input = (single_input)theEObject;
				T result = casesingle_input(single_input);
				if (result == null) result = casepython_input(single_input);
				if (result == null) result = caseSpellElement(single_input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.FILE_INPUT: {
				file_input file_input = (file_input)theEObject;
				T result = casefile_input(file_input);
				if (result == null) result = casepython_input(file_input);
				if (result == null) result = caseSpellElement(file_input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.EVAL_INPUT: {
				eval_input eval_input = (eval_input)theEObject;
				T result = caseeval_input(eval_input);
				if (result == null) result = casepython_input(eval_input);
				if (result == null) result = caseSpellElement(eval_input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.DECORATOR: {
				decorator decorator = (decorator)theEObject;
				T result = casedecorator(decorator);
				if (result == null) result = caseSpellElement(decorator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.DECORATORS: {
				decorators decorators = (decorators)theEObject;
				T result = casedecorators(decorators);
				if (result == null) result = caseSpellElement(decorators);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.DECORATED: {
				decorated decorated = (decorated)theEObject;
				T result = casedecorated(decorated);
				if (result == null) result = casecompound_stmt(decorated);
				if (result == null) result = casestmt(decorated);
				if (result == null) result = caseSpellElement(decorated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.FUNCDEF: {
				funcdef funcdef = (funcdef)theEObject;
				T result = casefuncdef(funcdef);
				if (result == null) result = casecompound_stmt(funcdef);
				if (result == null) result = casestmt(funcdef);
				if (result == null) result = caseSpellElement(funcdef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.PARAMETERS: {
				parameters parameters = (parameters)theEObject;
				T result = caseparameters(parameters);
				if (result == null) result = caseSpellElement(parameters);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.VARARGSLIST_ELEMENT: {
				varargslist_element varargslist_element = (varargslist_element)theEObject;
				T result = casevarargslist_element(varargslist_element);
				if (result == null) result = caseSpellElement(varargslist_element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.VARARGSLIST: {
				varargslist varargslist = (varargslist)theEObject;
				T result = casevarargslist(varargslist);
				if (result == null) result = caseSpellElement(varargslist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.FPDEF: {
				fpdef fpdef = (fpdef)theEObject;
				T result = casefpdef(fpdef);
				if (result == null) result = caseSpellElement(fpdef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.FPLIST: {
				fplist fplist = (fplist)theEObject;
				T result = casefplist(fplist);
				if (result == null) result = caseSpellElement(fplist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.STMT: {
				stmt stmt = (stmt)theEObject;
				T result = casestmt(stmt);
				if (result == null) result = caseSpellElement(stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.SIMPLE_STMT: {
				simple_stmt simple_stmt = (simple_stmt)theEObject;
				T result = casesimple_stmt(simple_stmt);
				if (result == null) result = casestmt(simple_stmt);
				if (result == null) result = casesuite(simple_stmt);
				if (result == null) result = caseSpellElement(simple_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.SMALL_STMT: {
				small_stmt small_stmt = (small_stmt)theEObject;
				T result = casesmall_stmt(small_stmt);
				if (result == null) result = casesimple_stmt(small_stmt);
				if (result == null) result = casestmt(small_stmt);
				if (result == null) result = casesuite(small_stmt);
				if (result == null) result = caseSpellElement(small_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.EXPR_STMT: {
				expr_stmt expr_stmt = (expr_stmt)theEObject;
				T result = caseexpr_stmt(expr_stmt);
				if (result == null) result = casesmall_stmt(expr_stmt);
				if (result == null) result = casesimple_stmt(expr_stmt);
				if (result == null) result = casestmt(expr_stmt);
				if (result == null) result = casesuite(expr_stmt);
				if (result == null) result = caseSpellElement(expr_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.YIELD_OR_TESTLIST: {
				yield_or_testlist yield_or_testlist = (yield_or_testlist)theEObject;
				T result = caseyield_or_testlist(yield_or_testlist);
				if (result == null) result = caseSpellElement(yield_or_testlist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.DEL_STMT: {
				del_stmt del_stmt = (del_stmt)theEObject;
				T result = casedel_stmt(del_stmt);
				if (result == null) result = casesmall_stmt(del_stmt);
				if (result == null) result = casesimple_stmt(del_stmt);
				if (result == null) result = casestmt(del_stmt);
				if (result == null) result = casesuite(del_stmt);
				if (result == null) result = caseSpellElement(del_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.PASS_STMT: {
				pass_stmt pass_stmt = (pass_stmt)theEObject;
				T result = casepass_stmt(pass_stmt);
				if (result == null) result = casesmall_stmt(pass_stmt);
				if (result == null) result = casesimple_stmt(pass_stmt);
				if (result == null) result = casestmt(pass_stmt);
				if (result == null) result = casesuite(pass_stmt);
				if (result == null) result = caseSpellElement(pass_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.FLOW_STMT: {
				flow_stmt flow_stmt = (flow_stmt)theEObject;
				T result = caseflow_stmt(flow_stmt);
				if (result == null) result = casesmall_stmt(flow_stmt);
				if (result == null) result = casesimple_stmt(flow_stmt);
				if (result == null) result = casestmt(flow_stmt);
				if (result == null) result = casesuite(flow_stmt);
				if (result == null) result = caseSpellElement(flow_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.BREAK_STMT: {
				break_stmt break_stmt = (break_stmt)theEObject;
				T result = casebreak_stmt(break_stmt);
				if (result == null) result = caseflow_stmt(break_stmt);
				if (result == null) result = casesmall_stmt(break_stmt);
				if (result == null) result = casesimple_stmt(break_stmt);
				if (result == null) result = casestmt(break_stmt);
				if (result == null) result = casesuite(break_stmt);
				if (result == null) result = caseSpellElement(break_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.CONTINUE_STMT: {
				continue_stmt continue_stmt = (continue_stmt)theEObject;
				T result = casecontinue_stmt(continue_stmt);
				if (result == null) result = caseflow_stmt(continue_stmt);
				if (result == null) result = casesmall_stmt(continue_stmt);
				if (result == null) result = casesimple_stmt(continue_stmt);
				if (result == null) result = casestmt(continue_stmt);
				if (result == null) result = casesuite(continue_stmt);
				if (result == null) result = caseSpellElement(continue_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.RETURN_STMT: {
				return_stmt return_stmt = (return_stmt)theEObject;
				T result = casereturn_stmt(return_stmt);
				if (result == null) result = caseflow_stmt(return_stmt);
				if (result == null) result = casesmall_stmt(return_stmt);
				if (result == null) result = casesimple_stmt(return_stmt);
				if (result == null) result = casestmt(return_stmt);
				if (result == null) result = casesuite(return_stmt);
				if (result == null) result = caseSpellElement(return_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.YIELD_STMT: {
				yield_stmt yield_stmt = (yield_stmt)theEObject;
				T result = caseyield_stmt(yield_stmt);
				if (result == null) result = caseflow_stmt(yield_stmt);
				if (result == null) result = casesmall_stmt(yield_stmt);
				if (result == null) result = casesimple_stmt(yield_stmt);
				if (result == null) result = casestmt(yield_stmt);
				if (result == null) result = casesuite(yield_stmt);
				if (result == null) result = caseSpellElement(yield_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.RAISE_STMT: {
				raise_stmt raise_stmt = (raise_stmt)theEObject;
				T result = caseraise_stmt(raise_stmt);
				if (result == null) result = caseflow_stmt(raise_stmt);
				if (result == null) result = casesmall_stmt(raise_stmt);
				if (result == null) result = casesimple_stmt(raise_stmt);
				if (result == null) result = casestmt(raise_stmt);
				if (result == null) result = casesuite(raise_stmt);
				if (result == null) result = caseSpellElement(raise_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.IMPORT_STMT: {
				import_stmt import_stmt = (import_stmt)theEObject;
				T result = caseimport_stmt(import_stmt);
				if (result == null) result = casesmall_stmt(import_stmt);
				if (result == null) result = casesimple_stmt(import_stmt);
				if (result == null) result = casestmt(import_stmt);
				if (result == null) result = casesuite(import_stmt);
				if (result == null) result = caseSpellElement(import_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.IMPORT_NAME: {
				import_name import_name = (import_name)theEObject;
				T result = caseimport_name(import_name);
				if (result == null) result = caseimport_stmt(import_name);
				if (result == null) result = casesmall_stmt(import_name);
				if (result == null) result = casesimple_stmt(import_name);
				if (result == null) result = casestmt(import_name);
				if (result == null) result = casesuite(import_name);
				if (result == null) result = caseSpellElement(import_name);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.IMPORT_FROM: {
				import_from import_from = (import_from)theEObject;
				T result = caseimport_from(import_from);
				if (result == null) result = caseimport_stmt(import_from);
				if (result == null) result = casesmall_stmt(import_from);
				if (result == null) result = casesimple_stmt(import_from);
				if (result == null) result = casestmt(import_from);
				if (result == null) result = casesuite(import_from);
				if (result == null) result = caseSpellElement(import_from);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.IMPORT_AS_NAME: {
				import_as_name import_as_name = (import_as_name)theEObject;
				T result = caseimport_as_name(import_as_name);
				if (result == null) result = caseSpellElement(import_as_name);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.DOTTED_AS_NAME: {
				dotted_as_name dotted_as_name = (dotted_as_name)theEObject;
				T result = casedotted_as_name(dotted_as_name);
				if (result == null) result = caseSpellElement(dotted_as_name);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.IMPORT_AS_NAMES: {
				import_as_names import_as_names = (import_as_names)theEObject;
				T result = caseimport_as_names(import_as_names);
				if (result == null) result = caseSpellElement(import_as_names);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.DOTTED_AS_NAMES: {
				dotted_as_names dotted_as_names = (dotted_as_names)theEObject;
				T result = casedotted_as_names(dotted_as_names);
				if (result == null) result = caseSpellElement(dotted_as_names);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.GLOBAL_STMT: {
				global_stmt global_stmt = (global_stmt)theEObject;
				T result = caseglobal_stmt(global_stmt);
				if (result == null) result = casesmall_stmt(global_stmt);
				if (result == null) result = casesimple_stmt(global_stmt);
				if (result == null) result = casestmt(global_stmt);
				if (result == null) result = casesuite(global_stmt);
				if (result == null) result = caseSpellElement(global_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.EXEC_STMT: {
				exec_stmt exec_stmt = (exec_stmt)theEObject;
				T result = caseexec_stmt(exec_stmt);
				if (result == null) result = casesmall_stmt(exec_stmt);
				if (result == null) result = casesimple_stmt(exec_stmt);
				if (result == null) result = casestmt(exec_stmt);
				if (result == null) result = casesuite(exec_stmt);
				if (result == null) result = caseSpellElement(exec_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.ASSERT_STMT: {
				assert_stmt assert_stmt = (assert_stmt)theEObject;
				T result = caseassert_stmt(assert_stmt);
				if (result == null) result = casesmall_stmt(assert_stmt);
				if (result == null) result = casesimple_stmt(assert_stmt);
				if (result == null) result = casestmt(assert_stmt);
				if (result == null) result = casesuite(assert_stmt);
				if (result == null) result = caseSpellElement(assert_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.COMPOUND_STMT: {
				compound_stmt compound_stmt = (compound_stmt)theEObject;
				T result = casecompound_stmt(compound_stmt);
				if (result == null) result = casestmt(compound_stmt);
				if (result == null) result = caseSpellElement(compound_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.ELSE_IF_STMT: {
				else_if_stmt else_if_stmt = (else_if_stmt)theEObject;
				T result = caseelse_if_stmt(else_if_stmt);
				if (result == null) result = caseSpellElement(else_if_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.IF_STMT: {
				if_stmt if_stmt = (if_stmt)theEObject;
				T result = caseif_stmt(if_stmt);
				if (result == null) result = casecompound_stmt(if_stmt);
				if (result == null) result = casestmt(if_stmt);
				if (result == null) result = caseSpellElement(if_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.WHILE_STMT: {
				while_stmt while_stmt = (while_stmt)theEObject;
				T result = casewhile_stmt(while_stmt);
				if (result == null) result = casecompound_stmt(while_stmt);
				if (result == null) result = casestmt(while_stmt);
				if (result == null) result = caseSpellElement(while_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.FOR_STMT: {
				for_stmt for_stmt = (for_stmt)theEObject;
				T result = casefor_stmt(for_stmt);
				if (result == null) result = casecompound_stmt(for_stmt);
				if (result == null) result = casestmt(for_stmt);
				if (result == null) result = caseSpellElement(for_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.TRY_STMT: {
				try_stmt try_stmt = (try_stmt)theEObject;
				T result = casetry_stmt(try_stmt);
				if (result == null) result = casecompound_stmt(try_stmt);
				if (result == null) result = casestmt(try_stmt);
				if (result == null) result = caseSpellElement(try_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.WITH_STMT: {
				with_stmt with_stmt = (with_stmt)theEObject;
				T result = casewith_stmt(with_stmt);
				if (result == null) result = casecompound_stmt(with_stmt);
				if (result == null) result = casestmt(with_stmt);
				if (result == null) result = caseSpellElement(with_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.WITH_ITEM: {
				with_item with_item = (with_item)theEObject;
				T result = casewith_item(with_item);
				if (result == null) result = caseSpellElement(with_item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.EXCEPT_CLAUSE: {
				except_clause except_clause = (except_clause)theEObject;
				T result = caseexcept_clause(except_clause);
				if (result == null) result = caseSpellElement(except_clause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.SUITE: {
				suite suite = (suite)theEObject;
				T result = casesuite(suite);
				if (result == null) result = caseSpellElement(suite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.TESTLIST_SAFE: {
				testlist_safe testlist_safe = (testlist_safe)theEObject;
				T result = casetestlist_safe(testlist_safe);
				if (result == null) result = caseSpellElement(testlist_safe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.TEST: {
				test test = (test)theEObject;
				T result = casetest(test);
				if (result == null) result = casetestlist(test);
				if (result == null) result = caseargument(test);
				if (result == null) result = caseexpr_stmt(test);
				if (result == null) result = caseyield_or_testlist(test);
				if (result == null) result = casesmall_stmt(test);
				if (result == null) result = casesimple_stmt(test);
				if (result == null) result = casestmt(test);
				if (result == null) result = casesuite(test);
				if (result == null) result = caseSpellElement(test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.OR_TEST: {
				or_test or_test = (or_test)theEObject;
				T result = caseor_test(or_test);
				if (result == null) result = casetest(or_test);
				if (result == null) result = casetestlist(or_test);
				if (result == null) result = caseargument(or_test);
				if (result == null) result = caseexpr_stmt(or_test);
				if (result == null) result = caseyield_or_testlist(or_test);
				if (result == null) result = casesmall_stmt(or_test);
				if (result == null) result = casesimple_stmt(or_test);
				if (result == null) result = casestmt(or_test);
				if (result == null) result = casesuite(or_test);
				if (result == null) result = caseSpellElement(or_test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.AND_TEST: {
				and_test and_test = (and_test)theEObject;
				T result = caseand_test(and_test);
				if (result == null) result = caseor_test(and_test);
				if (result == null) result = casetest(and_test);
				if (result == null) result = casetestlist(and_test);
				if (result == null) result = caseargument(and_test);
				if (result == null) result = caseexpr_stmt(and_test);
				if (result == null) result = caseyield_or_testlist(and_test);
				if (result == null) result = casesmall_stmt(and_test);
				if (result == null) result = casesimple_stmt(and_test);
				if (result == null) result = casestmt(and_test);
				if (result == null) result = casesuite(and_test);
				if (result == null) result = caseSpellElement(and_test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.NOT_TEST: {
				not_test not_test = (not_test)theEObject;
				T result = casenot_test(not_test);
				if (result == null) result = caseand_test(not_test);
				if (result == null) result = caseor_test(not_test);
				if (result == null) result = casetest(not_test);
				if (result == null) result = casetestlist(not_test);
				if (result == null) result = caseargument(not_test);
				if (result == null) result = caseexpr_stmt(not_test);
				if (result == null) result = caseyield_or_testlist(not_test);
				if (result == null) result = casesmall_stmt(not_test);
				if (result == null) result = casesimple_stmt(not_test);
				if (result == null) result = casestmt(not_test);
				if (result == null) result = casesuite(not_test);
				if (result == null) result = caseSpellElement(not_test);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.COMPARISON: {
				comparison comparison = (comparison)theEObject;
				T result = casecomparison(comparison);
				if (result == null) result = casenot_test(comparison);
				if (result == null) result = caseand_test(comparison);
				if (result == null) result = caseor_test(comparison);
				if (result == null) result = casetest(comparison);
				if (result == null) result = casetestlist(comparison);
				if (result == null) result = caseargument(comparison);
				if (result == null) result = caseexpr_stmt(comparison);
				if (result == null) result = caseyield_or_testlist(comparison);
				if (result == null) result = casesmall_stmt(comparison);
				if (result == null) result = casesimple_stmt(comparison);
				if (result == null) result = casestmt(comparison);
				if (result == null) result = casesuite(comparison);
				if (result == null) result = caseSpellElement(comparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.EXPR: {
				expr expr = (expr)theEObject;
				T result = caseexpr(expr);
				if (result == null) result = casecomparison(expr);
				if (result == null) result = casenot_test(expr);
				if (result == null) result = caseand_test(expr);
				if (result == null) result = caseor_test(expr);
				if (result == null) result = casetest(expr);
				if (result == null) result = casetestlist(expr);
				if (result == null) result = caseargument(expr);
				if (result == null) result = caseexpr_stmt(expr);
				if (result == null) result = caseyield_or_testlist(expr);
				if (result == null) result = casesmall_stmt(expr);
				if (result == null) result = casesimple_stmt(expr);
				if (result == null) result = casestmt(expr);
				if (result == null) result = casesuite(expr);
				if (result == null) result = caseSpellElement(expr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.XOR_EXPR: {
				xor_expr xor_expr = (xor_expr)theEObject;
				T result = casexor_expr(xor_expr);
				if (result == null) result = caseexpr(xor_expr);
				if (result == null) result = casecomparison(xor_expr);
				if (result == null) result = casenot_test(xor_expr);
				if (result == null) result = caseand_test(xor_expr);
				if (result == null) result = caseor_test(xor_expr);
				if (result == null) result = casetest(xor_expr);
				if (result == null) result = casetestlist(xor_expr);
				if (result == null) result = caseargument(xor_expr);
				if (result == null) result = caseexpr_stmt(xor_expr);
				if (result == null) result = caseyield_or_testlist(xor_expr);
				if (result == null) result = casesmall_stmt(xor_expr);
				if (result == null) result = casesimple_stmt(xor_expr);
				if (result == null) result = casestmt(xor_expr);
				if (result == null) result = casesuite(xor_expr);
				if (result == null) result = caseSpellElement(xor_expr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.AND_EXPR: {
				and_expr and_expr = (and_expr)theEObject;
				T result = caseand_expr(and_expr);
				if (result == null) result = casexor_expr(and_expr);
				if (result == null) result = caseexpr(and_expr);
				if (result == null) result = casecomparison(and_expr);
				if (result == null) result = casenot_test(and_expr);
				if (result == null) result = caseand_test(and_expr);
				if (result == null) result = caseor_test(and_expr);
				if (result == null) result = casetest(and_expr);
				if (result == null) result = casetestlist(and_expr);
				if (result == null) result = caseargument(and_expr);
				if (result == null) result = caseexpr_stmt(and_expr);
				if (result == null) result = caseyield_or_testlist(and_expr);
				if (result == null) result = casesmall_stmt(and_expr);
				if (result == null) result = casesimple_stmt(and_expr);
				if (result == null) result = casestmt(and_expr);
				if (result == null) result = casesuite(and_expr);
				if (result == null) result = caseSpellElement(and_expr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.SHIFT_EXPR: {
				shift_expr shift_expr = (shift_expr)theEObject;
				T result = caseshift_expr(shift_expr);
				if (result == null) result = caseand_expr(shift_expr);
				if (result == null) result = casexor_expr(shift_expr);
				if (result == null) result = caseexpr(shift_expr);
				if (result == null) result = casecomparison(shift_expr);
				if (result == null) result = casenot_test(shift_expr);
				if (result == null) result = caseand_test(shift_expr);
				if (result == null) result = caseor_test(shift_expr);
				if (result == null) result = casetest(shift_expr);
				if (result == null) result = casetestlist(shift_expr);
				if (result == null) result = caseargument(shift_expr);
				if (result == null) result = caseexpr_stmt(shift_expr);
				if (result == null) result = caseyield_or_testlist(shift_expr);
				if (result == null) result = casesmall_stmt(shift_expr);
				if (result == null) result = casesimple_stmt(shift_expr);
				if (result == null) result = casestmt(shift_expr);
				if (result == null) result = casesuite(shift_expr);
				if (result == null) result = caseSpellElement(shift_expr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.ARITH_EXPR: {
				arith_expr arith_expr = (arith_expr)theEObject;
				T result = casearith_expr(arith_expr);
				if (result == null) result = caseshift_expr(arith_expr);
				if (result == null) result = caseand_expr(arith_expr);
				if (result == null) result = casexor_expr(arith_expr);
				if (result == null) result = caseexpr(arith_expr);
				if (result == null) result = casecomparison(arith_expr);
				if (result == null) result = casenot_test(arith_expr);
				if (result == null) result = caseand_test(arith_expr);
				if (result == null) result = caseor_test(arith_expr);
				if (result == null) result = casetest(arith_expr);
				if (result == null) result = casetestlist(arith_expr);
				if (result == null) result = caseargument(arith_expr);
				if (result == null) result = caseexpr_stmt(arith_expr);
				if (result == null) result = caseyield_or_testlist(arith_expr);
				if (result == null) result = casesmall_stmt(arith_expr);
				if (result == null) result = casesimple_stmt(arith_expr);
				if (result == null) result = casestmt(arith_expr);
				if (result == null) result = casesuite(arith_expr);
				if (result == null) result = caseSpellElement(arith_expr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.TERM: {
				term term = (term)theEObject;
				T result = caseterm(term);
				if (result == null) result = casearith_expr(term);
				if (result == null) result = caseshift_expr(term);
				if (result == null) result = caseand_expr(term);
				if (result == null) result = casexor_expr(term);
				if (result == null) result = caseexpr(term);
				if (result == null) result = casecomparison(term);
				if (result == null) result = casenot_test(term);
				if (result == null) result = caseand_test(term);
				if (result == null) result = caseor_test(term);
				if (result == null) result = casetest(term);
				if (result == null) result = casetestlist(term);
				if (result == null) result = caseargument(term);
				if (result == null) result = caseexpr_stmt(term);
				if (result == null) result = caseyield_or_testlist(term);
				if (result == null) result = casesmall_stmt(term);
				if (result == null) result = casesimple_stmt(term);
				if (result == null) result = casestmt(term);
				if (result == null) result = casesuite(term);
				if (result == null) result = caseSpellElement(term);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.FACTOR: {
				factor factor = (factor)theEObject;
				T result = casefactor(factor);
				if (result == null) result = caseterm(factor);
				if (result == null) result = casearith_expr(factor);
				if (result == null) result = caseshift_expr(factor);
				if (result == null) result = caseand_expr(factor);
				if (result == null) result = casexor_expr(factor);
				if (result == null) result = caseexpr(factor);
				if (result == null) result = casecomparison(factor);
				if (result == null) result = casenot_test(factor);
				if (result == null) result = caseand_test(factor);
				if (result == null) result = caseor_test(factor);
				if (result == null) result = casetest(factor);
				if (result == null) result = casetestlist(factor);
				if (result == null) result = caseargument(factor);
				if (result == null) result = caseexpr_stmt(factor);
				if (result == null) result = caseyield_or_testlist(factor);
				if (result == null) result = casesmall_stmt(factor);
				if (result == null) result = casesimple_stmt(factor);
				if (result == null) result = casestmt(factor);
				if (result == null) result = casesuite(factor);
				if (result == null) result = caseSpellElement(factor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.POWER: {
				power power = (power)theEObject;
				T result = casepower(power);
				if (result == null) result = casefactor(power);
				if (result == null) result = caseterm(power);
				if (result == null) result = casearith_expr(power);
				if (result == null) result = caseshift_expr(power);
				if (result == null) result = caseand_expr(power);
				if (result == null) result = casexor_expr(power);
				if (result == null) result = caseexpr(power);
				if (result == null) result = casecomparison(power);
				if (result == null) result = casenot_test(power);
				if (result == null) result = caseand_test(power);
				if (result == null) result = caseor_test(power);
				if (result == null) result = casetest(power);
				if (result == null) result = casetestlist(power);
				if (result == null) result = caseargument(power);
				if (result == null) result = caseexpr_stmt(power);
				if (result == null) result = caseyield_or_testlist(power);
				if (result == null) result = casesmall_stmt(power);
				if (result == null) result = casesimple_stmt(power);
				if (result == null) result = casestmt(power);
				if (result == null) result = casesuite(power);
				if (result == null) result = caseSpellElement(power);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.YIELD_OR_TESTLIST_COMP: {
				yield_or_testlist_comp yield_or_testlist_comp = (yield_or_testlist_comp)theEObject;
				T result = caseyield_or_testlist_comp(yield_or_testlist_comp);
				if (result == null) result = caseSpellElement(yield_or_testlist_comp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.ATOM: {
				atom atom = (atom)theEObject;
				T result = caseatom(atom);
				if (result == null) result = casepower(atom);
				if (result == null) result = casefactor(atom);
				if (result == null) result = caseterm(atom);
				if (result == null) result = casearith_expr(atom);
				if (result == null) result = caseshift_expr(atom);
				if (result == null) result = caseand_expr(atom);
				if (result == null) result = casexor_expr(atom);
				if (result == null) result = caseexpr(atom);
				if (result == null) result = casecomparison(atom);
				if (result == null) result = casenot_test(atom);
				if (result == null) result = caseand_test(atom);
				if (result == null) result = caseor_test(atom);
				if (result == null) result = casetest(atom);
				if (result == null) result = casetestlist(atom);
				if (result == null) result = caseargument(atom);
				if (result == null) result = caseexpr_stmt(atom);
				if (result == null) result = caseyield_or_testlist(atom);
				if (result == null) result = casesmall_stmt(atom);
				if (result == null) result = casesimple_stmt(atom);
				if (result == null) result = casestmt(atom);
				if (result == null) result = casesuite(atom);
				if (result == null) result = caseSpellElement(atom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.LISTMAKER: {
				listmaker listmaker = (listmaker)theEObject;
				T result = caselistmaker(listmaker);
				if (result == null) result = caseSpellElement(listmaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.TESTLIST_COMP: {
				testlist_comp testlist_comp = (testlist_comp)theEObject;
				T result = casetestlist_comp(testlist_comp);
				if (result == null) result = caseyield_or_testlist_comp(testlist_comp);
				if (result == null) result = caseSpellElement(testlist_comp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.LAMBDEF: {
				lambdef lambdef = (lambdef)theEObject;
				T result = caselambdef(lambdef);
				if (result == null) result = casetest(lambdef);
				if (result == null) result = casetestlist(lambdef);
				if (result == null) result = caseargument(lambdef);
				if (result == null) result = caseexpr_stmt(lambdef);
				if (result == null) result = caseyield_or_testlist(lambdef);
				if (result == null) result = casesmall_stmt(lambdef);
				if (result == null) result = casesimple_stmt(lambdef);
				if (result == null) result = casestmt(lambdef);
				if (result == null) result = casesuite(lambdef);
				if (result == null) result = caseSpellElement(lambdef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.TRAILER: {
				trailer trailer = (trailer)theEObject;
				T result = casetrailer(trailer);
				if (result == null) result = caseSpellElement(trailer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.SUBSCRIPTLIST: {
				subscriptlist subscriptlist = (subscriptlist)theEObject;
				T result = casesubscriptlist(subscriptlist);
				if (result == null) result = caseSpellElement(subscriptlist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.SUBSCRIPT: {
				subscript subscript = (subscript)theEObject;
				T result = casesubscript(subscript);
				if (result == null) result = caseSpellElement(subscript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.SLICEOP: {
				sliceop sliceop = (sliceop)theEObject;
				T result = casesliceop(sliceop);
				if (result == null) result = caseSpellElement(sliceop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.EXPRLIST: {
				exprlist exprlist = (exprlist)theEObject;
				T result = caseexprlist(exprlist);
				if (result == null) result = caseSpellElement(exprlist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.TESTLIST: {
				testlist testlist = (testlist)theEObject;
				T result = casetestlist(testlist);
				if (result == null) result = caseexpr_stmt(testlist);
				if (result == null) result = caseyield_or_testlist(testlist);
				if (result == null) result = casesmall_stmt(testlist);
				if (result == null) result = casesimple_stmt(testlist);
				if (result == null) result = casestmt(testlist);
				if (result == null) result = casesuite(testlist);
				if (result == null) result = caseSpellElement(testlist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.DICTORSET_ENTRY: {
				dictorset_entry dictorset_entry = (dictorset_entry)theEObject;
				T result = casedictorset_entry(dictorset_entry);
				if (result == null) result = caseSpellElement(dictorset_entry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.DICTORSETMAKER: {
				dictorsetmaker dictorsetmaker = (dictorsetmaker)theEObject;
				T result = casedictorsetmaker(dictorsetmaker);
				if (result == null) result = caseSpellElement(dictorsetmaker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.CLASSDEF: {
				classdef classdef = (classdef)theEObject;
				T result = caseclassdef(classdef);
				if (result == null) result = casecompound_stmt(classdef);
				if (result == null) result = casestmt(classdef);
				if (result == null) result = caseSpellElement(classdef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.ARGLIST: {
				arglist arglist = (arglist)theEObject;
				T result = casearglist(arglist);
				if (result == null) result = caseSpellElement(arglist);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.ARGUMENT: {
				argument argument = (argument)theEObject;
				T result = caseargument(argument);
				if (result == null) result = caseSpellElement(argument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.LIST_ITER: {
				list_iter list_iter = (list_iter)theEObject;
				T result = caselist_iter(list_iter);
				if (result == null) result = caseSpellElement(list_iter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.LIST_FOR: {
				list_for list_for = (list_for)theEObject;
				T result = caselist_for(list_for);
				if (result == null) result = caselist_iter(list_for);
				if (result == null) result = caseSpellElement(list_for);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.LIST_IF: {
				list_if list_if = (list_if)theEObject;
				T result = caselist_if(list_if);
				if (result == null) result = caselist_iter(list_if);
				if (result == null) result = caseSpellElement(list_if);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.COMP_ITER: {
				comp_iter comp_iter = (comp_iter)theEObject;
				T result = casecomp_iter(comp_iter);
				if (result == null) result = caseSpellElement(comp_iter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.COMP_FOR: {
				comp_for comp_for = (comp_for)theEObject;
				T result = casecomp_for(comp_for);
				if (result == null) result = casecomp_iter(comp_for);
				if (result == null) result = caseSpellElement(comp_for);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.COMP_IF: {
				comp_if comp_if = (comp_if)theEObject;
				T result = casecomp_if(comp_if);
				if (result == null) result = casecomp_iter(comp_if);
				if (result == null) result = caseSpellElement(comp_if);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.TESTLIST1: {
				testlist1 testlist1 = (testlist1)theEObject;
				T result = casetestlist1(testlist1);
				if (result == null) result = caseSpellElement(testlist1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.YIELD_EXPR: {
				yield_expr yield_expr = (yield_expr)theEObject;
				T result = caseyield_expr(yield_expr);
				if (result == null) result = caseyield_or_testlist(yield_expr);
				if (result == null) result = caseyield_or_testlist_comp(yield_expr);
				if (result == null) result = caseSpellElement(yield_expr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.SPELL_ELEMENT: {
				SpellElement spellElement = (SpellElement)theEObject;
				T result = caseSpellElement(spellElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.FUNCTIONCALL: {
				functioncall functioncall = (functioncall)theEObject;
				T result = casefunctioncall(functioncall);
				if (result == null) result = casetrailer(functioncall);
				if (result == null) result = caseSpellElement(functioncall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.PYTHON_INPUT: {
				python_input python_input = (python_input)theEObject;
				T result = casepython_input(python_input);
				if (result == null) result = caseSpellElement(python_input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = casepower(step);
				if (result == null) result = casefactor(step);
				if (result == null) result = caseterm(step);
				if (result == null) result = casearith_expr(step);
				if (result == null) result = caseshift_expr(step);
				if (result == null) result = caseand_expr(step);
				if (result == null) result = casexor_expr(step);
				if (result == null) result = caseexpr(step);
				if (result == null) result = casecomparison(step);
				if (result == null) result = casenot_test(step);
				if (result == null) result = caseand_test(step);
				if (result == null) result = caseor_test(step);
				if (result == null) result = casetest(step);
				if (result == null) result = casetestlist(step);
				if (result == null) result = caseargument(step);
				if (result == null) result = caseexpr_stmt(step);
				if (result == null) result = caseyield_or_testlist(step);
				if (result == null) result = casesmall_stmt(step);
				if (result == null) result = casesimple_stmt(step);
				if (result == null) result = casestmt(step);
				if (result == null) result = casesuite(step);
				if (result == null) result = caseSpellElement(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.VERIFY: {
				Verify verify = (Verify)theEObject;
				T result = caseVerify(verify);
				if (result == null) result = casepower(verify);
				if (result == null) result = casefactor(verify);
				if (result == null) result = caseterm(verify);
				if (result == null) result = casearith_expr(verify);
				if (result == null) result = caseshift_expr(verify);
				if (result == null) result = caseand_expr(verify);
				if (result == null) result = casexor_expr(verify);
				if (result == null) result = caseexpr(verify);
				if (result == null) result = casecomparison(verify);
				if (result == null) result = casenot_test(verify);
				if (result == null) result = caseand_test(verify);
				if (result == null) result = caseor_test(verify);
				if (result == null) result = casetest(verify);
				if (result == null) result = casetestlist(verify);
				if (result == null) result = caseargument(verify);
				if (result == null) result = caseexpr_stmt(verify);
				if (result == null) result = caseyield_or_testlist(verify);
				if (result == null) result = casesmall_stmt(verify);
				if (result == null) result = casesimple_stmt(verify);
				if (result == null) result = casestmt(verify);
				if (result == null) result = casesuite(verify);
				if (result == null) result = caseSpellElement(verify);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.SEND: {
				Send send = (Send)theEObject;
				T result = caseSend(send);
				if (result == null) result = casepower(send);
				if (result == null) result = casefactor(send);
				if (result == null) result = caseterm(send);
				if (result == null) result = casearith_expr(send);
				if (result == null) result = caseshift_expr(send);
				if (result == null) result = caseand_expr(send);
				if (result == null) result = casexor_expr(send);
				if (result == null) result = caseexpr(send);
				if (result == null) result = casecomparison(send);
				if (result == null) result = casenot_test(send);
				if (result == null) result = caseand_test(send);
				if (result == null) result = caseor_test(send);
				if (result == null) result = casetest(send);
				if (result == null) result = casetestlist(send);
				if (result == null) result = caseargument(send);
				if (result == null) result = caseexpr_stmt(send);
				if (result == null) result = caseyield_or_testlist(send);
				if (result == null) result = casesmall_stmt(send);
				if (result == null) result = casesimple_stmt(send);
				if (result == null) result = casestmt(send);
				if (result == null) result = casesuite(send);
				if (result == null) result = caseSpellElement(send);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.SHOW_TM: {
				ShowTM showTM = (ShowTM)theEObject;
				T result = caseShowTM(showTM);
				if (result == null) result = casepower(showTM);
				if (result == null) result = casefactor(showTM);
				if (result == null) result = caseterm(showTM);
				if (result == null) result = casearith_expr(showTM);
				if (result == null) result = caseshift_expr(showTM);
				if (result == null) result = caseand_expr(showTM);
				if (result == null) result = casexor_expr(showTM);
				if (result == null) result = caseexpr(showTM);
				if (result == null) result = casecomparison(showTM);
				if (result == null) result = casenot_test(showTM);
				if (result == null) result = caseand_test(showTM);
				if (result == null) result = caseor_test(showTM);
				if (result == null) result = casetest(showTM);
				if (result == null) result = casetestlist(showTM);
				if (result == null) result = caseargument(showTM);
				if (result == null) result = caseexpr_stmt(showTM);
				if (result == null) result = caseyield_or_testlist(showTM);
				if (result == null) result = casesmall_stmt(showTM);
				if (result == null) result = casesimple_stmt(showTM);
				if (result == null) result = casestmt(showTM);
				if (result == null) result = casesuite(showTM);
				if (result == null) result = caseSpellElement(showTM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.GET_TM: {
				GetTM getTM = (GetTM)theEObject;
				T result = caseGetTM(getTM);
				if (result == null) result = casepower(getTM);
				if (result == null) result = casefactor(getTM);
				if (result == null) result = caseterm(getTM);
				if (result == null) result = casearith_expr(getTM);
				if (result == null) result = caseshift_expr(getTM);
				if (result == null) result = caseand_expr(getTM);
				if (result == null) result = casexor_expr(getTM);
				if (result == null) result = caseexpr(getTM);
				if (result == null) result = casecomparison(getTM);
				if (result == null) result = casenot_test(getTM);
				if (result == null) result = caseand_test(getTM);
				if (result == null) result = caseor_test(getTM);
				if (result == null) result = casetest(getTM);
				if (result == null) result = casetestlist(getTM);
				if (result == null) result = caseargument(getTM);
				if (result == null) result = caseexpr_stmt(getTM);
				if (result == null) result = caseyield_or_testlist(getTM);
				if (result == null) result = casesmall_stmt(getTM);
				if (result == null) result = casesimple_stmt(getTM);
				if (result == null) result = casestmt(getTM);
				if (result == null) result = casesuite(getTM);
				if (result == null) result = caseSpellElement(getTM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.ASSIGNMENT_STMT: {
				assignment_stmt assignment_stmt = (assignment_stmt)theEObject;
				T result = caseassignment_stmt(assignment_stmt);
				if (result == null) result = caseexpr_stmt(assignment_stmt);
				if (result == null) result = casesmall_stmt(assignment_stmt);
				if (result == null) result = casesimple_stmt(assignment_stmt);
				if (result == null) result = casestmt(assignment_stmt);
				if (result == null) result = casesuite(assignment_stmt);
				if (result == null) result = caseSpellElement(assignment_stmt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.CHANGE_LANGUAGE_CONFIG: {
				ChangeLanguageConfig changeLanguageConfig = (ChangeLanguageConfig)theEObject;
				T result = caseChangeLanguageConfig(changeLanguageConfig);
				if (result == null) result = casepower(changeLanguageConfig);
				if (result == null) result = casefactor(changeLanguageConfig);
				if (result == null) result = caseterm(changeLanguageConfig);
				if (result == null) result = casearith_expr(changeLanguageConfig);
				if (result == null) result = caseshift_expr(changeLanguageConfig);
				if (result == null) result = caseand_expr(changeLanguageConfig);
				if (result == null) result = casexor_expr(changeLanguageConfig);
				if (result == null) result = caseexpr(changeLanguageConfig);
				if (result == null) result = casecomparison(changeLanguageConfig);
				if (result == null) result = casenot_test(changeLanguageConfig);
				if (result == null) result = caseand_test(changeLanguageConfig);
				if (result == null) result = caseor_test(changeLanguageConfig);
				if (result == null) result = casetest(changeLanguageConfig);
				if (result == null) result = casetestlist(changeLanguageConfig);
				if (result == null) result = caseargument(changeLanguageConfig);
				if (result == null) result = caseexpr_stmt(changeLanguageConfig);
				if (result == null) result = caseyield_or_testlist(changeLanguageConfig);
				if (result == null) result = casesmall_stmt(changeLanguageConfig);
				if (result == null) result = casesimple_stmt(changeLanguageConfig);
				if (result == null) result = casestmt(changeLanguageConfig);
				if (result == null) result = casesuite(changeLanguageConfig);
				if (result == null) result = caseSpellElement(changeLanguageConfig);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.SET_LIMITS: {
				SetLimits setLimits = (SetLimits)theEObject;
				T result = caseSetLimits(setLimits);
				if (result == null) result = casepower(setLimits);
				if (result == null) result = casefactor(setLimits);
				if (result == null) result = caseterm(setLimits);
				if (result == null) result = casearith_expr(setLimits);
				if (result == null) result = caseshift_expr(setLimits);
				if (result == null) result = caseand_expr(setLimits);
				if (result == null) result = casexor_expr(setLimits);
				if (result == null) result = caseexpr(setLimits);
				if (result == null) result = casecomparison(setLimits);
				if (result == null) result = casenot_test(setLimits);
				if (result == null) result = caseand_test(setLimits);
				if (result == null) result = caseor_test(setLimits);
				if (result == null) result = casetest(setLimits);
				if (result == null) result = casetestlist(setLimits);
				if (result == null) result = caseargument(setLimits);
				if (result == null) result = caseexpr_stmt(setLimits);
				if (result == null) result = caseyield_or_testlist(setLimits);
				if (result == null) result = casesmall_stmt(setLimits);
				if (result == null) result = casesimple_stmt(setLimits);
				if (result == null) result = casestmt(setLimits);
				if (result == null) result = casesuite(setLimits);
				if (result == null) result = caseSpellElement(setLimits);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.BUILD_TC: {
				BuildTC buildTC = (BuildTC)theEObject;
				T result = caseBuildTC(buildTC);
				if (result == null) result = casepower(buildTC);
				if (result == null) result = casefactor(buildTC);
				if (result == null) result = caseterm(buildTC);
				if (result == null) result = casearith_expr(buildTC);
				if (result == null) result = caseshift_expr(buildTC);
				if (result == null) result = caseand_expr(buildTC);
				if (result == null) result = casexor_expr(buildTC);
				if (result == null) result = caseexpr(buildTC);
				if (result == null) result = casecomparison(buildTC);
				if (result == null) result = casenot_test(buildTC);
				if (result == null) result = caseand_test(buildTC);
				if (result == null) result = caseor_test(buildTC);
				if (result == null) result = casetest(buildTC);
				if (result == null) result = casetestlist(buildTC);
				if (result == null) result = caseargument(buildTC);
				if (result == null) result = caseexpr_stmt(buildTC);
				if (result == null) result = caseyield_or_testlist(buildTC);
				if (result == null) result = casesmall_stmt(buildTC);
				if (result == null) result = casesimple_stmt(buildTC);
				if (result == null) result = casestmt(buildTC);
				if (result == null) result = casesuite(buildTC);
				if (result == null) result = caseSpellElement(buildTC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.GOTO: {
				Goto goto_ = (Goto)theEObject;
				T result = caseGoto(goto_);
				if (result == null) result = casepower(goto_);
				if (result == null) result = casefactor(goto_);
				if (result == null) result = caseterm(goto_);
				if (result == null) result = casearith_expr(goto_);
				if (result == null) result = caseshift_expr(goto_);
				if (result == null) result = caseand_expr(goto_);
				if (result == null) result = casexor_expr(goto_);
				if (result == null) result = caseexpr(goto_);
				if (result == null) result = casecomparison(goto_);
				if (result == null) result = casenot_test(goto_);
				if (result == null) result = caseand_test(goto_);
				if (result == null) result = caseor_test(goto_);
				if (result == null) result = casetest(goto_);
				if (result == null) result = casetestlist(goto_);
				if (result == null) result = caseargument(goto_);
				if (result == null) result = caseexpr_stmt(goto_);
				if (result == null) result = caseyield_or_testlist(goto_);
				if (result == null) result = casesmall_stmt(goto_);
				if (result == null) result = casesimple_stmt(goto_);
				if (result == null) result = casestmt(goto_);
				if (result == null) result = casesuite(goto_);
				if (result == null) result = caseSpellElement(goto_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SpellPackage.DISPLAY_STEP: {
				DisplayStep displayStep = (DisplayStep)theEObject;
				T result = caseDisplayStep(displayStep);
				if (result == null) result = casepower(displayStep);
				if (result == null) result = casefactor(displayStep);
				if (result == null) result = caseterm(displayStep);
				if (result == null) result = casearith_expr(displayStep);
				if (result == null) result = caseshift_expr(displayStep);
				if (result == null) result = caseand_expr(displayStep);
				if (result == null) result = casexor_expr(displayStep);
				if (result == null) result = caseexpr(displayStep);
				if (result == null) result = casecomparison(displayStep);
				if (result == null) result = casenot_test(displayStep);
				if (result == null) result = caseand_test(displayStep);
				if (result == null) result = caseor_test(displayStep);
				if (result == null) result = casetest(displayStep);
				if (result == null) result = casetestlist(displayStep);
				if (result == null) result = caseargument(displayStep);
				if (result == null) result = caseexpr_stmt(displayStep);
				if (result == null) result = caseyield_or_testlist(displayStep);
				if (result == null) result = casesmall_stmt(displayStep);
				if (result == null) result = casesimple_stmt(displayStep);
				if (result == null) result = casestmt(displayStep);
				if (result == null) result = casesuite(displayStep);
				if (result == null) result = caseSpellElement(displayStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>single input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>single input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesingle_input(single_input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>file input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>file input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefile_input(file_input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>eval input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>eval input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseeval_input(eval_input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decorator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decorator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecorator(decorator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decorators</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decorators</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecorators(decorators object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>decorated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>decorated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedecorated(decorated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>funcdef</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>funcdef</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefuncdef(funcdef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>parameters</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>parameters</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseparameters(parameters object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>varargslist element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>varargslist element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casevarargslist_element(varargslist_element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>varargslist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>varargslist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casevarargslist(varargslist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>fpdef</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>fpdef</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefpdef(fpdef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>fplist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>fplist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefplist(fplist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casestmt(stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>simple stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>simple stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesimple_stmt(simple_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>small stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>small stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesmall_stmt(small_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>expr stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>expr stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseexpr_stmt(expr_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>yield or testlist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>yield or testlist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseyield_or_testlist(yield_or_testlist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>del stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>del stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedel_stmt(del_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>pass stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>pass stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepass_stmt(pass_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>flow stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>flow stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseflow_stmt(flow_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>break stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>break stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casebreak_stmt(break_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>continue stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>continue stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecontinue_stmt(continue_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>return stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>return stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casereturn_stmt(return_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>yield stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>yield stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseyield_stmt(yield_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>raise stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>raise stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseraise_stmt(raise_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>import stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>import stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseimport_stmt(import_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>import name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>import name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseimport_name(import_name object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>import from</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>import from</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseimport_from(import_from object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>import as name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>import as name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseimport_as_name(import_as_name object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>dotted as name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>dotted as name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedotted_as_name(dotted_as_name object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>import as names</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>import as names</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseimport_as_names(import_as_names object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>dotted as names</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>dotted as names</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedotted_as_names(dotted_as_names object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>global stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>global stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseglobal_stmt(global_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>exec stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>exec stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseexec_stmt(exec_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>assert stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>assert stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseassert_stmt(assert_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>compound stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>compound stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecompound_stmt(compound_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>else if stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>else if stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseelse_if_stmt(else_if_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>if stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>if stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseif_stmt(if_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>while stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>while stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewhile_stmt(while_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>for stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>for stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefor_stmt(for_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>try stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>try stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetry_stmt(try_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>with stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>with stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewith_stmt(with_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>with item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>with item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casewith_item(with_item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>except clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>except clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseexcept_clause(except_clause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>suite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>suite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesuite(suite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>testlist safe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>testlist safe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetestlist_safe(testlist_safe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetest(test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>or test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>or test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseor_test(or_test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>and test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>and test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseand_test(and_test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>not test</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>not test</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casenot_test(not_test object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecomparison(comparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseexpr(expr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>xor expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>xor expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casexor_expr(xor_expr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>and expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>and expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseand_expr(and_expr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>shift expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>shift expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseshift_expr(shift_expr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>arith expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>arith expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casearith_expr(arith_expr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>term</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>term</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseterm(term object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>factor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>factor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefactor(factor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>power</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>power</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepower(power object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>yield or testlist comp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>yield or testlist comp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseyield_or_testlist_comp(yield_or_testlist_comp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>atom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>atom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseatom(atom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>listmaker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>listmaker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselistmaker(listmaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>testlist comp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>testlist comp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetestlist_comp(testlist_comp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>lambdef</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>lambdef</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselambdef(lambdef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>trailer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>trailer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetrailer(trailer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>subscriptlist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>subscriptlist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesubscriptlist(subscriptlist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>subscript</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>subscript</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesubscript(subscript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>sliceop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>sliceop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casesliceop(sliceop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>exprlist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>exprlist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseexprlist(exprlist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>testlist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>testlist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetestlist(testlist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>dictorset entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>dictorset entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedictorset_entry(dictorset_entry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>dictorsetmaker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>dictorsetmaker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casedictorsetmaker(dictorsetmaker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>classdef</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>classdef</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseclassdef(classdef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>arglist</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>arglist</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casearglist(arglist object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseargument(argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>list iter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>list iter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselist_iter(list_iter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>list for</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>list for</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselist_for(list_for object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>list if</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>list if</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caselist_if(list_if object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>comp iter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>comp iter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecomp_iter(comp_iter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>comp for</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>comp for</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecomp_for(comp_for object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>comp if</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>comp if</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casecomp_if(comp_if object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>testlist1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>testlist1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casetestlist1(testlist1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>yield expr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>yield expr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseyield_expr(yield_expr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpellElement(SpellElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>functioncall</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>functioncall</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casefunctioncall(functioncall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>python input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>python input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casepython_input(python_input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verify</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verify</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerify(Verify object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSend(Send object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build TC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build TC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildTC(BuildTC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Goto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Goto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoto(Goto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayStep(DisplayStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Show TM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Show TM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShowTM(ShowTM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get TM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get TM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTM(GetTM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>assignment stmt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>assignment stmt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseassignment_stmt(assignment_stmt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Language Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Language Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeLanguageConfig(ChangeLanguageConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Limits</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Limits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetLimits(SetLimits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SpellSwitch
