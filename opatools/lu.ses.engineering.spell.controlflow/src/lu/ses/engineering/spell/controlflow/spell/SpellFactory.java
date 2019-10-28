/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage
 * @generated
 */
public interface SpellFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpellFactory eINSTANCE = lu.ses.engineering.spell.controlflow.spell.impl.SpellFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>single input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>single input</em>'.
	 * @generated
	 */
	single_input createsingle_input();

	/**
	 * Returns a new object of class '<em>file input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>file input</em>'.
	 * @generated
	 */
	file_input createfile_input();

	/**
	 * Returns a new object of class '<em>eval input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>eval input</em>'.
	 * @generated
	 */
	eval_input createeval_input();

	/**
	 * Returns a new object of class '<em>decorator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>decorator</em>'.
	 * @generated
	 */
	decorator createdecorator();

	/**
	 * Returns a new object of class '<em>decorators</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>decorators</em>'.
	 * @generated
	 */
	decorators createdecorators();

	/**
	 * Returns a new object of class '<em>decorated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>decorated</em>'.
	 * @generated
	 */
	decorated createdecorated();

	/**
	 * Returns a new object of class '<em>funcdef</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>funcdef</em>'.
	 * @generated
	 */
	funcdef createfuncdef();

	/**
	 * Returns a new object of class '<em>parameters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>parameters</em>'.
	 * @generated
	 */
	parameters createparameters();

	/**
	 * Returns a new object of class '<em>varargslist element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>varargslist element</em>'.
	 * @generated
	 */
	varargslist_element createvarargslist_element();

	/**
	 * Returns a new object of class '<em>varargslist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>varargslist</em>'.
	 * @generated
	 */
	varargslist createvarargslist();

	/**
	 * Returns a new object of class '<em>fpdef</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>fpdef</em>'.
	 * @generated
	 */
	fpdef createfpdef();

	/**
	 * Returns a new object of class '<em>fplist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>fplist</em>'.
	 * @generated
	 */
	fplist createfplist();

	/**
	 * Returns a new object of class '<em>stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>stmt</em>'.
	 * @generated
	 */
	stmt createstmt();

	/**
	 * Returns a new object of class '<em>simple stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>simple stmt</em>'.
	 * @generated
	 */
	simple_stmt createsimple_stmt();

	/**
	 * Returns a new object of class '<em>small stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>small stmt</em>'.
	 * @generated
	 */
	small_stmt createsmall_stmt();

	/**
	 * Returns a new object of class '<em>expr stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>expr stmt</em>'.
	 * @generated
	 */
	expr_stmt createexpr_stmt();

	/**
	 * Returns a new object of class '<em>yield or testlist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>yield or testlist</em>'.
	 * @generated
	 */
	yield_or_testlist createyield_or_testlist();

	/**
	 * Returns a new object of class '<em>del stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>del stmt</em>'.
	 * @generated
	 */
	del_stmt createdel_stmt();

	/**
	 * Returns a new object of class '<em>pass stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>pass stmt</em>'.
	 * @generated
	 */
	pass_stmt createpass_stmt();

	/**
	 * Returns a new object of class '<em>flow stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>flow stmt</em>'.
	 * @generated
	 */
	flow_stmt createflow_stmt();

	/**
	 * Returns a new object of class '<em>break stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>break stmt</em>'.
	 * @generated
	 */
	break_stmt createbreak_stmt();

	/**
	 * Returns a new object of class '<em>continue stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>continue stmt</em>'.
	 * @generated
	 */
	continue_stmt createcontinue_stmt();

	/**
	 * Returns a new object of class '<em>return stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>return stmt</em>'.
	 * @generated
	 */
	return_stmt createreturn_stmt();

	/**
	 * Returns a new object of class '<em>yield stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>yield stmt</em>'.
	 * @generated
	 */
	yield_stmt createyield_stmt();

	/**
	 * Returns a new object of class '<em>raise stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>raise stmt</em>'.
	 * @generated
	 */
	raise_stmt createraise_stmt();

	/**
	 * Returns a new object of class '<em>import stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>import stmt</em>'.
	 * @generated
	 */
	import_stmt createimport_stmt();

	/**
	 * Returns a new object of class '<em>import name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>import name</em>'.
	 * @generated
	 */
	import_name createimport_name();

	/**
	 * Returns a new object of class '<em>import from</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>import from</em>'.
	 * @generated
	 */
	import_from createimport_from();

	/**
	 * Returns a new object of class '<em>import as name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>import as name</em>'.
	 * @generated
	 */
	import_as_name createimport_as_name();

	/**
	 * Returns a new object of class '<em>dotted as name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>dotted as name</em>'.
	 * @generated
	 */
	dotted_as_name createdotted_as_name();

	/**
	 * Returns a new object of class '<em>import as names</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>import as names</em>'.
	 * @generated
	 */
	import_as_names createimport_as_names();

	/**
	 * Returns a new object of class '<em>dotted as names</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>dotted as names</em>'.
	 * @generated
	 */
	dotted_as_names createdotted_as_names();

	/**
	 * Returns a new object of class '<em>global stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>global stmt</em>'.
	 * @generated
	 */
	global_stmt createglobal_stmt();

	/**
	 * Returns a new object of class '<em>exec stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>exec stmt</em>'.
	 * @generated
	 */
	exec_stmt createexec_stmt();

	/**
	 * Returns a new object of class '<em>assert stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>assert stmt</em>'.
	 * @generated
	 */
	assert_stmt createassert_stmt();

	/**
	 * Returns a new object of class '<em>compound stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>compound stmt</em>'.
	 * @generated
	 */
	compound_stmt createcompound_stmt();

	/**
	 * Returns a new object of class '<em>else if stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>else if stmt</em>'.
	 * @generated
	 */
	else_if_stmt createelse_if_stmt();

	/**
	 * Returns a new object of class '<em>if stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>if stmt</em>'.
	 * @generated
	 */
	if_stmt createif_stmt();

	/**
	 * Returns a new object of class '<em>while stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>while stmt</em>'.
	 * @generated
	 */
	while_stmt createwhile_stmt();

	/**
	 * Returns a new object of class '<em>for stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>for stmt</em>'.
	 * @generated
	 */
	for_stmt createfor_stmt();

	/**
	 * Returns a new object of class '<em>try stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>try stmt</em>'.
	 * @generated
	 */
	try_stmt createtry_stmt();

	/**
	 * Returns a new object of class '<em>with stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>with stmt</em>'.
	 * @generated
	 */
	with_stmt createwith_stmt();

	/**
	 * Returns a new object of class '<em>with item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>with item</em>'.
	 * @generated
	 */
	with_item createwith_item();

	/**
	 * Returns a new object of class '<em>except clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>except clause</em>'.
	 * @generated
	 */
	except_clause createexcept_clause();

	/**
	 * Returns a new object of class '<em>suite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>suite</em>'.
	 * @generated
	 */
	suite createsuite();

	/**
	 * Returns a new object of class '<em>testlist safe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>testlist safe</em>'.
	 * @generated
	 */
	testlist_safe createtestlist_safe();

	/**
	 * Returns a new object of class '<em>test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>test</em>'.
	 * @generated
	 */
	test createtest();

	/**
	 * Returns a new object of class '<em>or test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>or test</em>'.
	 * @generated
	 */
	or_test createor_test();

	/**
	 * Returns a new object of class '<em>and test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>and test</em>'.
	 * @generated
	 */
	and_test createand_test();

	/**
	 * Returns a new object of class '<em>not test</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>not test</em>'.
	 * @generated
	 */
	not_test createnot_test();

	/**
	 * Returns a new object of class '<em>comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>comparison</em>'.
	 * @generated
	 */
	comparison createcomparison();

	/**
	 * Returns a new object of class '<em>expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>expr</em>'.
	 * @generated
	 */
	expr createexpr();

	/**
	 * Returns a new object of class '<em>xor expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>xor expr</em>'.
	 * @generated
	 */
	xor_expr createxor_expr();

	/**
	 * Returns a new object of class '<em>and expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>and expr</em>'.
	 * @generated
	 */
	and_expr createand_expr();

	/**
	 * Returns a new object of class '<em>shift expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>shift expr</em>'.
	 * @generated
	 */
	shift_expr createshift_expr();

	/**
	 * Returns a new object of class '<em>arith expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>arith expr</em>'.
	 * @generated
	 */
	arith_expr createarith_expr();

	/**
	 * Returns a new object of class '<em>term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>term</em>'.
	 * @generated
	 */
	term createterm();

	/**
	 * Returns a new object of class '<em>factor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>factor</em>'.
	 * @generated
	 */
	factor createfactor();

	/**
	 * Returns a new object of class '<em>power</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>power</em>'.
	 * @generated
	 */
	power createpower();

	/**
	 * Returns a new object of class '<em>yield or testlist comp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>yield or testlist comp</em>'.
	 * @generated
	 */
	yield_or_testlist_comp createyield_or_testlist_comp();

	/**
	 * Returns a new object of class '<em>atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>atom</em>'.
	 * @generated
	 */
	atom createatom();

	/**
	 * Returns a new object of class '<em>listmaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>listmaker</em>'.
	 * @generated
	 */
	listmaker createlistmaker();

	/**
	 * Returns a new object of class '<em>testlist comp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>testlist comp</em>'.
	 * @generated
	 */
	testlist_comp createtestlist_comp();

	/**
	 * Returns a new object of class '<em>lambdef</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>lambdef</em>'.
	 * @generated
	 */
	lambdef createlambdef();

	/**
	 * Returns a new object of class '<em>trailer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>trailer</em>'.
	 * @generated
	 */
	trailer createtrailer();

	/**
	 * Returns a new object of class '<em>subscriptlist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>subscriptlist</em>'.
	 * @generated
	 */
	subscriptlist createsubscriptlist();

	/**
	 * Returns a new object of class '<em>subscript</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>subscript</em>'.
	 * @generated
	 */
	subscript createsubscript();

	/**
	 * Returns a new object of class '<em>sliceop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>sliceop</em>'.
	 * @generated
	 */
	sliceop createsliceop();

	/**
	 * Returns a new object of class '<em>exprlist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>exprlist</em>'.
	 * @generated
	 */
	exprlist createexprlist();

	/**
	 * Returns a new object of class '<em>testlist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>testlist</em>'.
	 * @generated
	 */
	testlist createtestlist();

	/**
	 * Returns a new object of class '<em>dictorset entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>dictorset entry</em>'.
	 * @generated
	 */
	dictorset_entry createdictorset_entry();

	/**
	 * Returns a new object of class '<em>dictorsetmaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>dictorsetmaker</em>'.
	 * @generated
	 */
	dictorsetmaker createdictorsetmaker();

	/**
	 * Returns a new object of class '<em>classdef</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>classdef</em>'.
	 * @generated
	 */
	classdef createclassdef();

	/**
	 * Returns a new object of class '<em>arglist</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>arglist</em>'.
	 * @generated
	 */
	arglist createarglist();

	/**
	 * Returns a new object of class '<em>argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>argument</em>'.
	 * @generated
	 */
	argument createargument();

	/**
	 * Returns a new object of class '<em>list iter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>list iter</em>'.
	 * @generated
	 */
	list_iter createlist_iter();

	/**
	 * Returns a new object of class '<em>list for</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>list for</em>'.
	 * @generated
	 */
	list_for createlist_for();

	/**
	 * Returns a new object of class '<em>list if</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>list if</em>'.
	 * @generated
	 */
	list_if createlist_if();

	/**
	 * Returns a new object of class '<em>comp iter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>comp iter</em>'.
	 * @generated
	 */
	comp_iter createcomp_iter();

	/**
	 * Returns a new object of class '<em>comp for</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>comp for</em>'.
	 * @generated
	 */
	comp_for createcomp_for();

	/**
	 * Returns a new object of class '<em>comp if</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>comp if</em>'.
	 * @generated
	 */
	comp_if createcomp_if();

	/**
	 * Returns a new object of class '<em>testlist1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>testlist1</em>'.
	 * @generated
	 */
	testlist1 createtestlist1();

	/**
	 * Returns a new object of class '<em>yield expr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>yield expr</em>'.
	 * @generated
	 */
	yield_expr createyield_expr();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	SpellElement createSpellElement();

	/**
	 * Returns a new object of class '<em>functioncall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>functioncall</em>'.
	 * @generated
	 */
	functioncall createfunctioncall();

	/**
	 * Returns a new object of class '<em>python input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>python input</em>'.
	 * @generated
	 */
	python_input createpython_input();

	/**
	 * Returns a new object of class '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Step</em>'.
	 * @generated
	 */
	Step createStep();

	/**
	 * Returns a new object of class '<em>Verify</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verify</em>'.
	 * @generated
	 */
	Verify createVerify();

	/**
	 * Returns a new object of class '<em>Send</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send</em>'.
	 * @generated
	 */
	Send createSend();

	/**
	 * Returns a new object of class '<em>Build TC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build TC</em>'.
	 * @generated
	 */
	BuildTC createBuildTC();

	/**
	 * Returns a new object of class '<em>Goto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Goto</em>'.
	 * @generated
	 */
	Goto createGoto();

	/**
	 * Returns a new object of class '<em>Display Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display Step</em>'.
	 * @generated
	 */
	DisplayStep createDisplayStep();

	/**
	 * Returns a new object of class '<em>Show TM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Show TM</em>'.
	 * @generated
	 */
	ShowTM createShowTM();

	/**
	 * Returns a new object of class '<em>Get TM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get TM</em>'.
	 * @generated
	 */
	GetTM createGetTM();

	/**
	 * Returns a new object of class '<em>assignment stmt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>assignment stmt</em>'.
	 * @generated
	 */
	assignment_stmt createassignment_stmt();

	/**
	 * Returns a new object of class '<em>Change Language Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Language Config</em>'.
	 * @generated
	 */
	ChangeLanguageConfig createChangeLanguageConfig();

	/**
	 * Returns a new object of class '<em>Set Limits</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Limits</em>'.
	 * @generated
	 */
	SetLimits createSetLimits();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SpellPackage getSpellPackage();

} //SpellFactory
