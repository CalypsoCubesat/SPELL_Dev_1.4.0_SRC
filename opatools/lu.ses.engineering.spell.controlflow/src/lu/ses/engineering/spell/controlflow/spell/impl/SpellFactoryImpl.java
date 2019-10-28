/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpellFactoryImpl extends EFactoryImpl implements SpellFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SpellFactory init() {
		try {
			SpellFactory theSpellFactory = (SpellFactory)EPackage.Registry.INSTANCE.getEFactory(SpellPackage.eNS_URI);
			if (theSpellFactory != null) {
				return theSpellFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SpellFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpellFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SpellPackage.SINGLE_INPUT: return createsingle_input();
			case SpellPackage.FILE_INPUT: return createfile_input();
			case SpellPackage.EVAL_INPUT: return createeval_input();
			case SpellPackage.DECORATOR: return createdecorator();
			case SpellPackage.DECORATORS: return createdecorators();
			case SpellPackage.DECORATED: return createdecorated();
			case SpellPackage.FUNCDEF: return createfuncdef();
			case SpellPackage.PARAMETERS: return createparameters();
			case SpellPackage.VARARGSLIST_ELEMENT: return createvarargslist_element();
			case SpellPackage.VARARGSLIST: return createvarargslist();
			case SpellPackage.FPDEF: return createfpdef();
			case SpellPackage.FPLIST: return createfplist();
			case SpellPackage.STMT: return createstmt();
			case SpellPackage.SIMPLE_STMT: return createsimple_stmt();
			case SpellPackage.SMALL_STMT: return createsmall_stmt();
			case SpellPackage.EXPR_STMT: return createexpr_stmt();
			case SpellPackage.YIELD_OR_TESTLIST: return createyield_or_testlist();
			case SpellPackage.DEL_STMT: return createdel_stmt();
			case SpellPackage.PASS_STMT: return createpass_stmt();
			case SpellPackage.FLOW_STMT: return createflow_stmt();
			case SpellPackage.BREAK_STMT: return createbreak_stmt();
			case SpellPackage.CONTINUE_STMT: return createcontinue_stmt();
			case SpellPackage.RETURN_STMT: return createreturn_stmt();
			case SpellPackage.YIELD_STMT: return createyield_stmt();
			case SpellPackage.RAISE_STMT: return createraise_stmt();
			case SpellPackage.IMPORT_STMT: return createimport_stmt();
			case SpellPackage.IMPORT_NAME: return createimport_name();
			case SpellPackage.IMPORT_FROM: return createimport_from();
			case SpellPackage.IMPORT_AS_NAME: return createimport_as_name();
			case SpellPackage.DOTTED_AS_NAME: return createdotted_as_name();
			case SpellPackage.IMPORT_AS_NAMES: return createimport_as_names();
			case SpellPackage.DOTTED_AS_NAMES: return createdotted_as_names();
			case SpellPackage.GLOBAL_STMT: return createglobal_stmt();
			case SpellPackage.EXEC_STMT: return createexec_stmt();
			case SpellPackage.ASSERT_STMT: return createassert_stmt();
			case SpellPackage.COMPOUND_STMT: return createcompound_stmt();
			case SpellPackage.ELSE_IF_STMT: return createelse_if_stmt();
			case SpellPackage.IF_STMT: return createif_stmt();
			case SpellPackage.WHILE_STMT: return createwhile_stmt();
			case SpellPackage.FOR_STMT: return createfor_stmt();
			case SpellPackage.TRY_STMT: return createtry_stmt();
			case SpellPackage.WITH_STMT: return createwith_stmt();
			case SpellPackage.WITH_ITEM: return createwith_item();
			case SpellPackage.EXCEPT_CLAUSE: return createexcept_clause();
			case SpellPackage.SUITE: return createsuite();
			case SpellPackage.TESTLIST_SAFE: return createtestlist_safe();
			case SpellPackage.TEST: return createtest();
			case SpellPackage.OR_TEST: return createor_test();
			case SpellPackage.AND_TEST: return createand_test();
			case SpellPackage.NOT_TEST: return createnot_test();
			case SpellPackage.COMPARISON: return createcomparison();
			case SpellPackage.EXPR: return createexpr();
			case SpellPackage.XOR_EXPR: return createxor_expr();
			case SpellPackage.AND_EXPR: return createand_expr();
			case SpellPackage.SHIFT_EXPR: return createshift_expr();
			case SpellPackage.ARITH_EXPR: return createarith_expr();
			case SpellPackage.TERM: return createterm();
			case SpellPackage.FACTOR: return createfactor();
			case SpellPackage.POWER: return createpower();
			case SpellPackage.YIELD_OR_TESTLIST_COMP: return createyield_or_testlist_comp();
			case SpellPackage.ATOM: return createatom();
			case SpellPackage.LISTMAKER: return createlistmaker();
			case SpellPackage.TESTLIST_COMP: return createtestlist_comp();
			case SpellPackage.LAMBDEF: return createlambdef();
			case SpellPackage.TRAILER: return createtrailer();
			case SpellPackage.SUBSCRIPTLIST: return createsubscriptlist();
			case SpellPackage.SUBSCRIPT: return createsubscript();
			case SpellPackage.SLICEOP: return createsliceop();
			case SpellPackage.EXPRLIST: return createexprlist();
			case SpellPackage.TESTLIST: return createtestlist();
			case SpellPackage.DICTORSET_ENTRY: return createdictorset_entry();
			case SpellPackage.DICTORSETMAKER: return createdictorsetmaker();
			case SpellPackage.CLASSDEF: return createclassdef();
			case SpellPackage.ARGLIST: return createarglist();
			case SpellPackage.ARGUMENT: return createargument();
			case SpellPackage.LIST_ITER: return createlist_iter();
			case SpellPackage.LIST_FOR: return createlist_for();
			case SpellPackage.LIST_IF: return createlist_if();
			case SpellPackage.COMP_ITER: return createcomp_iter();
			case SpellPackage.COMP_FOR: return createcomp_for();
			case SpellPackage.COMP_IF: return createcomp_if();
			case SpellPackage.TESTLIST1: return createtestlist1();
			case SpellPackage.YIELD_EXPR: return createyield_expr();
			case SpellPackage.SPELL_ELEMENT: return createSpellElement();
			case SpellPackage.FUNCTIONCALL: return createfunctioncall();
			case SpellPackage.PYTHON_INPUT: return createpython_input();
			case SpellPackage.STEP: return createStep();
			case SpellPackage.VERIFY: return createVerify();
			case SpellPackage.SEND: return createSend();
			case SpellPackage.SHOW_TM: return createShowTM();
			case SpellPackage.GET_TM: return createGetTM();
			case SpellPackage.ASSIGNMENT_STMT: return createassignment_stmt();
			case SpellPackage.CHANGE_LANGUAGE_CONFIG: return createChangeLanguageConfig();
			case SpellPackage.SET_LIMITS: return createSetLimits();
			case SpellPackage.BUILD_TC: return createBuildTC();
			case SpellPackage.GOTO: return createGoto();
			case SpellPackage.DISPLAY_STEP: return createDisplayStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public single_input createsingle_input() {
		single_inputImpl single_input = new single_inputImpl();
		return single_input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public file_input createfile_input() {
		file_inputImpl file_input = new file_inputImpl();
		return file_input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public eval_input createeval_input() {
		eval_inputImpl eval_input = new eval_inputImpl();
		return eval_input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decorator createdecorator() {
		decoratorImpl decorator = new decoratorImpl();
		return decorator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decorators createdecorators() {
		decoratorsImpl decorators = new decoratorsImpl();
		return decorators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public decorated createdecorated() {
		decoratedImpl decorated = new decoratedImpl();
		return decorated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public funcdef createfuncdef() {
		funcdefImpl funcdef = new funcdefImpl();
		return funcdef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public parameters createparameters() {
		parametersImpl parameters = new parametersImpl();
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public varargslist_element createvarargslist_element() {
		varargslist_elementImpl varargslist_element = new varargslist_elementImpl();
		return varargslist_element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public varargslist createvarargslist() {
		varargslistImpl varargslist = new varargslistImpl();
		return varargslist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fpdef createfpdef() {
		fpdefImpl fpdef = new fpdefImpl();
		return fpdef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public fplist createfplist() {
		fplistImpl fplist = new fplistImpl();
		return fplist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stmt createstmt() {
		stmtImpl stmt = new stmtImpl();
		return stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public simple_stmt createsimple_stmt() {
		simple_stmtImpl simple_stmt = new simple_stmtImpl();
		return simple_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public small_stmt createsmall_stmt() {
		small_stmtImpl small_stmt = new small_stmtImpl();
		return small_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public expr_stmt createexpr_stmt() {
		expr_stmtImpl expr_stmt = new expr_stmtImpl();
		return expr_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public yield_or_testlist createyield_or_testlist() {
		yield_or_testlistImpl yield_or_testlist = new yield_or_testlistImpl();
		return yield_or_testlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public del_stmt createdel_stmt() {
		del_stmtImpl del_stmt = new del_stmtImpl();
		return del_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public pass_stmt createpass_stmt() {
		pass_stmtImpl pass_stmt = new pass_stmtImpl();
		return pass_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public flow_stmt createflow_stmt() {
		flow_stmtImpl flow_stmt = new flow_stmtImpl();
		return flow_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public break_stmt createbreak_stmt() {
		break_stmtImpl break_stmt = new break_stmtImpl();
		return break_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public continue_stmt createcontinue_stmt() {
		continue_stmtImpl continue_stmt = new continue_stmtImpl();
		return continue_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public return_stmt createreturn_stmt() {
		return_stmtImpl return_stmt = new return_stmtImpl();
		return return_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public yield_stmt createyield_stmt() {
		yield_stmtImpl yield_stmt = new yield_stmtImpl();
		return yield_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public raise_stmt createraise_stmt() {
		raise_stmtImpl raise_stmt = new raise_stmtImpl();
		return raise_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public import_stmt createimport_stmt() {
		import_stmtImpl import_stmt = new import_stmtImpl();
		return import_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public import_name createimport_name() {
		import_nameImpl import_name = new import_nameImpl();
		return import_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public import_from createimport_from() {
		import_fromImpl import_from = new import_fromImpl();
		return import_from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public import_as_name createimport_as_name() {
		import_as_nameImpl import_as_name = new import_as_nameImpl();
		return import_as_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dotted_as_name createdotted_as_name() {
		dotted_as_nameImpl dotted_as_name = new dotted_as_nameImpl();
		return dotted_as_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public import_as_names createimport_as_names() {
		import_as_namesImpl import_as_names = new import_as_namesImpl();
		return import_as_names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dotted_as_names createdotted_as_names() {
		dotted_as_namesImpl dotted_as_names = new dotted_as_namesImpl();
		return dotted_as_names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public global_stmt createglobal_stmt() {
		global_stmtImpl global_stmt = new global_stmtImpl();
		return global_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exec_stmt createexec_stmt() {
		exec_stmtImpl exec_stmt = new exec_stmtImpl();
		return exec_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public assert_stmt createassert_stmt() {
		assert_stmtImpl assert_stmt = new assert_stmtImpl();
		return assert_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public compound_stmt createcompound_stmt() {
		compound_stmtImpl compound_stmt = new compound_stmtImpl();
		return compound_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public else_if_stmt createelse_if_stmt() {
		else_if_stmtImpl else_if_stmt = new else_if_stmtImpl();
		return else_if_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public if_stmt createif_stmt() {
		if_stmtImpl if_stmt = new if_stmtImpl();
		return if_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public while_stmt createwhile_stmt() {
		while_stmtImpl while_stmt = new while_stmtImpl();
		return while_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public for_stmt createfor_stmt() {
		for_stmtImpl for_stmt = new for_stmtImpl();
		return for_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public try_stmt createtry_stmt() {
		try_stmtImpl try_stmt = new try_stmtImpl();
		return try_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public with_stmt createwith_stmt() {
		with_stmtImpl with_stmt = new with_stmtImpl();
		return with_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public with_item createwith_item() {
		with_itemImpl with_item = new with_itemImpl();
		return with_item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public except_clause createexcept_clause() {
		except_clauseImpl except_clause = new except_clauseImpl();
		return except_clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public suite createsuite() {
		suiteImpl suite = new suiteImpl();
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testlist_safe createtestlist_safe() {
		testlist_safeImpl testlist_safe = new testlist_safeImpl();
		return testlist_safe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test createtest() {
		testImpl test = new testImpl();
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public or_test createor_test() {
		or_testImpl or_test = new or_testImpl();
		return or_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public and_test createand_test() {
		and_testImpl and_test = new and_testImpl();
		return and_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public not_test createnot_test() {
		not_testImpl not_test = new not_testImpl();
		return not_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comparison createcomparison() {
		comparisonImpl comparison = new comparisonImpl();
		return comparison;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public expr createexpr() {
		exprImpl expr = new exprImpl();
		return expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public xor_expr createxor_expr() {
		xor_exprImpl xor_expr = new xor_exprImpl();
		return xor_expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public and_expr createand_expr() {
		and_exprImpl and_expr = new and_exprImpl();
		return and_expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public shift_expr createshift_expr() {
		shift_exprImpl shift_expr = new shift_exprImpl();
		return shift_expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arith_expr createarith_expr() {
		arith_exprImpl arith_expr = new arith_exprImpl();
		return arith_expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public term createterm() {
		termImpl term = new termImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public factor createfactor() {
		factorImpl factor = new factorImpl();
		return factor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public power createpower() {
		powerImpl power = new powerImpl();
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public yield_or_testlist_comp createyield_or_testlist_comp() {
		yield_or_testlist_compImpl yield_or_testlist_comp = new yield_or_testlist_compImpl();
		return yield_or_testlist_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public atom createatom() {
		atomImpl atom = new atomImpl();
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public listmaker createlistmaker() {
		listmakerImpl listmaker = new listmakerImpl();
		return listmaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testlist_comp createtestlist_comp() {
		testlist_compImpl testlist_comp = new testlist_compImpl();
		return testlist_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public lambdef createlambdef() {
		lambdefImpl lambdef = new lambdefImpl();
		return lambdef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public trailer createtrailer() {
		trailerImpl trailer = new trailerImpl();
		return trailer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public subscriptlist createsubscriptlist() {
		subscriptlistImpl subscriptlist = new subscriptlistImpl();
		return subscriptlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public subscript createsubscript() {
		subscriptImpl subscript = new subscriptImpl();
		return subscript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sliceop createsliceop() {
		sliceopImpl sliceop = new sliceopImpl();
		return sliceop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public exprlist createexprlist() {
		exprlistImpl exprlist = new exprlistImpl();
		return exprlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testlist createtestlist() {
		testlistImpl testlist = new testlistImpl();
		return testlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dictorset_entry createdictorset_entry() {
		dictorset_entryImpl dictorset_entry = new dictorset_entryImpl();
		return dictorset_entry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dictorsetmaker createdictorsetmaker() {
		dictorsetmakerImpl dictorsetmaker = new dictorsetmakerImpl();
		return dictorsetmaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public classdef createclassdef() {
		classdefImpl classdef = new classdefImpl();
		return classdef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arglist createarglist() {
		arglistImpl arglist = new arglistImpl();
		return arglist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public argument createargument() {
		argumentImpl argument = new argumentImpl();
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public list_iter createlist_iter() {
		list_iterImpl list_iter = new list_iterImpl();
		return list_iter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public list_for createlist_for() {
		list_forImpl list_for = new list_forImpl();
		return list_for;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public list_if createlist_if() {
		list_ifImpl list_if = new list_ifImpl();
		return list_if;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comp_iter createcomp_iter() {
		comp_iterImpl comp_iter = new comp_iterImpl();
		return comp_iter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comp_for createcomp_for() {
		comp_forImpl comp_for = new comp_forImpl();
		return comp_for;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public comp_if createcomp_if() {
		comp_ifImpl comp_if = new comp_ifImpl();
		return comp_if;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public testlist1 createtestlist1() {
		testlist1Impl testlist1 = new testlist1Impl();
		return testlist1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public yield_expr createyield_expr() {
		yield_exprImpl yield_expr = new yield_exprImpl();
		return yield_expr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpellElement createSpellElement() {
		SpellElementImpl spellElement = new SpellElementImpl();
		return spellElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public functioncall createfunctioncall() {
		functioncallImpl functioncall = new functioncallImpl();
		return functioncall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public python_input createpython_input() {
		python_inputImpl python_input = new python_inputImpl();
		return python_input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Verify createVerify() {
		VerifyImpl verify = new VerifyImpl();
		return verify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Send createSend() {
		SendImpl send = new SendImpl();
		return send;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildTC createBuildTC() {
		BuildTCImpl buildTC = new BuildTCImpl();
		return buildTC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goto createGoto() {
		GotoImpl goto_ = new GotoImpl();
		return goto_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisplayStep createDisplayStep() {
		DisplayStepImpl displayStep = new DisplayStepImpl();
		return displayStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShowTM createShowTM() {
		ShowTMImpl showTM = new ShowTMImpl();
		return showTM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetTM createGetTM() {
		GetTMImpl getTM = new GetTMImpl();
		return getTM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public assignment_stmt createassignment_stmt() {
		assignment_stmtImpl assignment_stmt = new assignment_stmtImpl();
		return assignment_stmt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeLanguageConfig createChangeLanguageConfig() {
		ChangeLanguageConfigImpl changeLanguageConfig = new ChangeLanguageConfigImpl();
		return changeLanguageConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetLimits createSetLimits() {
		SetLimitsImpl setLimits = new SetLimitsImpl();
		return setLimits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpellPackage getSpellPackage() {
		return (SpellPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SpellPackage getPackage() {
		return SpellPackage.eINSTANCE;
	}

} //SpellFactoryImpl
