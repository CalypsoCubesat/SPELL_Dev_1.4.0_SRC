/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import lu.ses.engineering.spell.controlflow.spell.BuildTC;
import lu.ses.engineering.spell.controlflow.spell.ChangeLanguageConfig;
import lu.ses.engineering.spell.controlflow.spell.DisplayStep;
import lu.ses.engineering.spell.controlflow.spell.GetTM;
import lu.ses.engineering.spell.controlflow.spell.Goto;
import lu.ses.engineering.spell.controlflow.spell.Send;
import lu.ses.engineering.spell.controlflow.spell.SetLimits;
import lu.ses.engineering.spell.controlflow.spell.ShowTM;
import lu.ses.engineering.spell.controlflow.spell.SpellElement;
import lu.ses.engineering.spell.controlflow.spell.SpellFactory;
import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.Step;
import lu.ses.engineering.spell.controlflow.spell.Verify;
import lu.ses.engineering.spell.controlflow.spell.and_expr;
import lu.ses.engineering.spell.controlflow.spell.and_test;
import lu.ses.engineering.spell.controlflow.spell.arglist;
import lu.ses.engineering.spell.controlflow.spell.argument;
import lu.ses.engineering.spell.controlflow.spell.arith_expr;
import lu.ses.engineering.spell.controlflow.spell.assert_stmt;
import lu.ses.engineering.spell.controlflow.spell.assignment_stmt;
import lu.ses.engineering.spell.controlflow.spell.atom;
import lu.ses.engineering.spell.controlflow.spell.break_stmt;
import lu.ses.engineering.spell.controlflow.spell.classdef;
import lu.ses.engineering.spell.controlflow.spell.comp_for;
import lu.ses.engineering.spell.controlflow.spell.comp_if;
import lu.ses.engineering.spell.controlflow.spell.comp_iter;
import lu.ses.engineering.spell.controlflow.spell.comparison;
import lu.ses.engineering.spell.controlflow.spell.compound_stmt;
import lu.ses.engineering.spell.controlflow.spell.continue_stmt;
import lu.ses.engineering.spell.controlflow.spell.decorated;
import lu.ses.engineering.spell.controlflow.spell.decorator;
import lu.ses.engineering.spell.controlflow.spell.decorators;
import lu.ses.engineering.spell.controlflow.spell.del_stmt;
import lu.ses.engineering.spell.controlflow.spell.dictorset_entry;
import lu.ses.engineering.spell.controlflow.spell.dictorsetmaker;
import lu.ses.engineering.spell.controlflow.spell.dotted_as_name;
import lu.ses.engineering.spell.controlflow.spell.dotted_as_names;
import lu.ses.engineering.spell.controlflow.spell.else_if_stmt;
import lu.ses.engineering.spell.controlflow.spell.eval_input;
import lu.ses.engineering.spell.controlflow.spell.except_clause;
import lu.ses.engineering.spell.controlflow.spell.exec_stmt;
import lu.ses.engineering.spell.controlflow.spell.expr;
import lu.ses.engineering.spell.controlflow.spell.expr_stmt;
import lu.ses.engineering.spell.controlflow.spell.exprlist;
import lu.ses.engineering.spell.controlflow.spell.factor;
import lu.ses.engineering.spell.controlflow.spell.factor_or_power;
import lu.ses.engineering.spell.controlflow.spell.file_input;
import lu.ses.engineering.spell.controlflow.spell.flow_stmt;
import lu.ses.engineering.spell.controlflow.spell.for_stmt;
import lu.ses.engineering.spell.controlflow.spell.fpdef;
import lu.ses.engineering.spell.controlflow.spell.fplist;
import lu.ses.engineering.spell.controlflow.spell.funcdef;
import lu.ses.engineering.spell.controlflow.spell.functioncall;
import lu.ses.engineering.spell.controlflow.spell.global_stmt;
import lu.ses.engineering.spell.controlflow.spell.if_stmt;
import lu.ses.engineering.spell.controlflow.spell.import_as_name;
import lu.ses.engineering.spell.controlflow.spell.import_as_names;
import lu.ses.engineering.spell.controlflow.spell.import_from;
import lu.ses.engineering.spell.controlflow.spell.import_name;
import lu.ses.engineering.spell.controlflow.spell.import_stmt;
import lu.ses.engineering.spell.controlflow.spell.lambdef;
import lu.ses.engineering.spell.controlflow.spell.list_for;
import lu.ses.engineering.spell.controlflow.spell.list_if;
import lu.ses.engineering.spell.controlflow.spell.list_iter;
import lu.ses.engineering.spell.controlflow.spell.listmaker;
import lu.ses.engineering.spell.controlflow.spell.not_test;
import lu.ses.engineering.spell.controlflow.spell.or_test;
import lu.ses.engineering.spell.controlflow.spell.parameters;
import lu.ses.engineering.spell.controlflow.spell.pass_stmt;
import lu.ses.engineering.spell.controlflow.spell.power;
import lu.ses.engineering.spell.controlflow.spell.python_input;
import lu.ses.engineering.spell.controlflow.spell.raise_stmt;
import lu.ses.engineering.spell.controlflow.spell.return_stmt;
import lu.ses.engineering.spell.controlflow.spell.shift_expr;
import lu.ses.engineering.spell.controlflow.spell.simple_stmt;
import lu.ses.engineering.spell.controlflow.spell.single_input;
import lu.ses.engineering.spell.controlflow.spell.sliceop;
import lu.ses.engineering.spell.controlflow.spell.small_stmt;
import lu.ses.engineering.spell.controlflow.spell.stmt;
import lu.ses.engineering.spell.controlflow.spell.subscript;
import lu.ses.engineering.spell.controlflow.spell.subscriptlist;
import lu.ses.engineering.spell.controlflow.spell.suite;
import lu.ses.engineering.spell.controlflow.spell.term;
import lu.ses.engineering.spell.controlflow.spell.test;
import lu.ses.engineering.spell.controlflow.spell.testlist;
import lu.ses.engineering.spell.controlflow.spell.testlist1;
import lu.ses.engineering.spell.controlflow.spell.testlist_comp;
import lu.ses.engineering.spell.controlflow.spell.testlist_safe;
import lu.ses.engineering.spell.controlflow.spell.trailer;
import lu.ses.engineering.spell.controlflow.spell.try_stmt;
import lu.ses.engineering.spell.controlflow.spell.varargslist;
import lu.ses.engineering.spell.controlflow.spell.varargslist_element;
import lu.ses.engineering.spell.controlflow.spell.while_stmt;
import lu.ses.engineering.spell.controlflow.spell.with_item;
import lu.ses.engineering.spell.controlflow.spell.with_stmt;
import lu.ses.engineering.spell.controlflow.spell.xor_expr;
import lu.ses.engineering.spell.controlflow.spell.yield_expr;
import lu.ses.engineering.spell.controlflow.spell.yield_or_testlist;
import lu.ses.engineering.spell.controlflow.spell.yield_or_testlist_comp;
import lu.ses.engineering.spell.controlflow.spell.yield_stmt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SpellPackageImpl extends EPackageImpl implements SpellPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass single_inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass file_inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eval_inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decoratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decoratorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decoratedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcdefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varargslist_elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varargslistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fpdefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fplistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simple_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass small_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expr_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yield_or_testlistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass del_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pass_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flow_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass break_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continue_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass return_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yield_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raise_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass import_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass import_nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass import_fromEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass import_as_nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotted_as_nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass import_as_namesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dotted_as_namesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass global_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exec_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assert_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compound_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass else_if_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass if_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass while_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass for_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass try_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass with_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass with_itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass except_clauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass suiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testlist_safeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass or_testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass and_testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass not_testEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xor_exprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass and_exprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shift_exprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arith_exprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass factorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yield_or_testlist_compEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listmakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testlist_compEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lambdefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trailerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptlistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscriptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sliceopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exprlistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testlistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictorset_entryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dictorsetmakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classdefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arglistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass list_iterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass list_forEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass list_ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comp_iterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comp_forEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comp_ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testlist1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass yield_exprEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spellElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functioncallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass python_inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verifyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buildTCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gotoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass showTMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignment_stmtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeLanguageConfigEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setLimitsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SpellPackageImpl() {
		super(eNS_URI, SpellFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SpellPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SpellPackage init() {
		if (isInited) return (SpellPackage)EPackage.Registry.INSTANCE.getEPackage(SpellPackage.eNS_URI);

		// Obtain or create and register package
		SpellPackageImpl theSpellPackage = (SpellPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SpellPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SpellPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theSpellPackage.createPackageContents();

		// Initialize created meta-data
		theSpellPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSpellPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SpellPackage.eNS_URI, theSpellPackage);
		return theSpellPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsingle_input() {
		return single_inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsingle_input_Stmt() {
		return (EReference)single_inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfile_input() {
		return file_inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfile_input_Stmts() {
		return (EReference)file_inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass geteval_input() {
		return eval_inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference geteval_input_Testlist() {
		return (EReference)eval_inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecorator() {
		return decoratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdecorator_Dotted_name() {
		return (EAttribute)decoratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdecorator_RoundBracket() {
		return (EAttribute)decoratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdecorator_Arglist() {
		return (EReference)decoratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecorators() {
		return decoratorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdecorators_Decorators() {
		return (EReference)decoratorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdecorated() {
		return decoratedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdecorated_Decorators() {
		return (EReference)decoratedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdecorated_Def() {
		return (EReference)decoratedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfuncdef() {
		return funcdefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getfuncdef_Name() {
		return (EAttribute)funcdefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfuncdef_Parameters() {
		return (EReference)funcdefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfuncdef_Suite() {
		return (EReference)funcdefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getparameters() {
		return parametersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getparameters_Varargslist() {
		return (EReference)parametersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getvarargslist_element() {
		return varargslist_elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getvarargslist_element_Fpdef() {
		return (EReference)varargslist_elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getvarargslist_element_Test() {
		return (EReference)varargslist_elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getvarargslist() {
		return varargslistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getvarargslist_Varargs1() {
		return (EReference)varargslistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getvarargslist_Dot1Name() {
		return (EAttribute)varargslistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getvarargslist_Dot2Name() {
		return (EAttribute)varargslistEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getvarargslist_Dot3Name() {
		return (EAttribute)varargslistEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getvarargslist_Vararg2() {
		return (EReference)varargslistEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getvarargslist_Varargs3() {
		return (EReference)varargslistEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getvarargslist_AdditionalComma() {
		return (EAttribute)varargslistEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfpdef() {
		return fpdefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getfpdef_Name() {
		return (EAttribute)fpdefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfpdef_Fplist() {
		return (EReference)fpdefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfplist() {
		return fplistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfplist_Def1() {
		return (EReference)fplistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfplist_Definitions() {
		return (EReference)fplistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getfplist_OptionalSemicolon() {
		return (EAttribute)fplistEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstmt() {
		return stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsimple_stmt() {
		return simple_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsimple_stmt_Stmt() {
		return (EReference)simple_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getsimple_stmt_AdditionalComma() {
		return (EAttribute)simple_stmtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsmall_stmt() {
		return small_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getexpr_stmt() {
		return expr_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getexpr_stmt_Left() {
		return (EReference)expr_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getexpr_stmt_Symbol() {
		return (EAttribute)expr_stmtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getexpr_stmt_Right() {
		return (EReference)expr_stmtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getyield_or_testlist() {
		return yield_or_testlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdel_stmt() {
		return del_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdel_stmt_Exprlist() {
		return (EReference)del_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpass_stmt() {
		return pass_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getflow_stmt() {
		return flow_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getbreak_stmt() {
		return break_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcontinue_stmt() {
		return continue_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getreturn_stmt() {
		return return_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getreturn_stmt_Testlist() {
		return (EReference)return_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getyield_stmt() {
		return yield_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getyield_stmt_Yield_expr() {
		return (EReference)yield_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getraise_stmt() {
		return raise_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getraise_stmt_Tests() {
		return (EReference)raise_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getimport_stmt() {
		return import_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getimport_name() {
		return import_nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getimport_name_Dotted_as_names() {
		return (EReference)import_nameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getimport_from() {
		return import_fromEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getimport_from_Dots() {
		return (EAttribute)import_fromEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getimport_from_Dotted_name() {
		return (EAttribute)import_fromEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getimport_from_Dots2() {
		return (EAttribute)import_fromEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getimport_from_RoundBracket() {
		return (EAttribute)import_fromEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getimport_from_Import_as_names() {
		return (EReference)import_fromEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getimport_as_name() {
		return import_as_nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getimport_as_name_Name() {
		return (EAttribute)import_as_nameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getimport_as_name_Identifier() {
		return (EAttribute)import_as_nameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdotted_as_name() {
		return dotted_as_nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdotted_as_name_Name() {
		return (EAttribute)dotted_as_nameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdotted_as_name_Identifier() {
		return (EAttribute)dotted_as_nameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getimport_as_names() {
		return import_as_namesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getimport_as_names_Imports() {
		return (EReference)import_as_namesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getimport_as_names_OptionalComma() {
		return (EAttribute)import_as_namesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdotted_as_names() {
		return dotted_as_namesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdotted_as_names_Dotted_names() {
		return (EReference)dotted_as_namesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getglobal_stmt() {
		return global_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getglobal_stmt_Globals() {
		return (EAttribute)global_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getexec_stmt() {
		return exec_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getexec_stmt_Expr() {
		return (EReference)exec_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getexec_stmt_Tests() {
		return (EReference)exec_stmtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getassert_stmt() {
		return assert_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getassert_stmt_Assers() {
		return (EReference)assert_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcompound_stmt() {
		return compound_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getelse_if_stmt() {
		return else_if_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getelse_if_stmt_Test() {
		return (EReference)else_if_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getelse_if_stmt_Suite() {
		return (EReference)else_if_stmtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getif_stmt() {
		return if_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getif_stmt_Test() {
		return (EReference)if_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getif_stmt_Suite() {
		return (EReference)if_stmtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getif_stmt_Else_if_stmts() {
		return (EReference)if_stmtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getif_stmt_Else() {
		return (EReference)if_stmtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwhile_stmt() {
		return while_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwhile_stmt_Test() {
		return (EReference)while_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwhile_stmt_Suite() {
		return (EReference)while_stmtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwhile_stmt_Else() {
		return (EReference)while_stmtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfor_stmt() {
		return for_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfor_stmt_Exprlist() {
		return (EReference)for_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfor_stmt_Testlist() {
		return (EReference)for_stmtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfor_stmt_Suite() {
		return (EReference)for_stmtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfor_stmt_Else() {
		return (EReference)for_stmtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettry_stmt() {
		return try_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettry_stmt_Suite() {
		return (EReference)try_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettry_stmt_Except_clause() {
		return (EReference)try_stmtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettry_stmt_Else() {
		return (EReference)try_stmtEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettry_stmt_Finally() {
		return (EReference)try_stmtEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwith_stmt() {
		return with_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwith_stmt_With_item() {
		return (EReference)with_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwith_stmt_Suite() {
		return (EReference)with_stmtEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwith_item() {
		return with_itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwith_item_Test() {
		return (EReference)with_itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwith_item_Expr() {
		return (EReference)with_itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getexcept_clause() {
		return except_clauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getexcept_clause_Test() {
		return (EReference)except_clauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getexcept_clause_Sign() {
		return (EAttribute)except_clauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getexcept_clause_Next_test() {
		return (EReference)except_clauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getexcept_clause_Suite() {
		return (EReference)except_clauseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsuite() {
		return suiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsuite_Stmts() {
		return (EReference)suiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettestlist_safe() {
		return testlist_safeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettestlist_safe_Old_test() {
		return (EReference)testlist_safeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettestlist_safe_OptionalComa() {
		return (EAttribute)testlist_safeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettest() {
		return testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettest_If_test() {
		return (EReference)testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettest_If_else_test() {
		return (EReference)testEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getor_test() {
		return or_testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getor_test_Sign() {
		return (EAttribute)or_testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getand_test() {
		return and_testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnot_test() {
		return not_testEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getnot_test_Not() {
		return (EAttribute)not_testEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getnot_test_Comparison() {
		return (EReference)not_testEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcomparison() {
		return comparisonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcomparison_Comp_op() {
		return (EAttribute)comparisonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getexpr() {
		return exprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getxor_expr() {
		return xor_exprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getand_expr() {
		return and_exprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getshift_expr() {
		return shift_exprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarith_expr() {
		return arith_exprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getterm() {
		return termEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfactor() {
		return factorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getfactor_Factor() {
		return (EReference)factorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpower() {
		return powerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpower_Atom() {
		return (EReference)powerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getpower_Trailer() {
		return (EReference)powerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getyield_or_testlist_comp() {
		return yield_or_testlist_compEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getatom() {
		return atomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getatom_RoundBracket() {
		return (EAttribute)atomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getatom_Yield_or_testlist_comp() {
		return (EReference)atomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getatom_SquareBracket() {
		return (EAttribute)atomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getatom_Listmaker() {
		return (EReference)atomEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getatom_CurlyBracket() {
		return (EAttribute)atomEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getatom_Dictorsetmaker() {
		return (EReference)atomEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getatom_Testlist1() {
		return (EReference)atomEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getatom_Name() {
		return (EAttribute)atomEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getatom_Strings() {
		return (EAttribute)atomEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlistmaker() {
		return listmakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getlistmaker_Test() {
		return (EReference)listmakerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getlistmaker_List_for() {
		return (EReference)listmakerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getlistmaker_AdditionalTests() {
		return (EReference)listmakerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getlistmaker_OptionalComma() {
		return (EAttribute)listmakerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettestlist_comp() {
		return testlist_compEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettestlist_comp_Test() {
		return (EReference)testlist_compEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettestlist_comp_Comp_for() {
		return (EReference)testlist_compEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettestlist_comp_AdditionalTests() {
		return (EReference)testlist_compEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettestlist_comp_OptionalComma() {
		return (EAttribute)testlist_compEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlambdef() {
		return lambdefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getlambdef_Varargslist() {
		return (EReference)lambdefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettrailer() {
		return trailerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettrailer_RoundBracket() {
		return (EAttribute)trailerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettrailer_Arglist() {
		return (EReference)trailerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettrailer_SquareBracket() {
		return (EAttribute)trailerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettrailer_Subscriptlist() {
		return (EReference)trailerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettrailer_DotName() {
		return (EAttribute)trailerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsubscriptlist() {
		return subscriptlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsubscriptlist_Subscript() {
		return (EReference)subscriptlistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getsubscriptlist_OptionalComma() {
		return (EAttribute)subscriptlistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsubscript() {
		return subscriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsubscript_Subscript1() {
		return (EReference)subscriptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsubscript_Subscript2() {
		return (EReference)subscriptEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsubscript_Sliceop() {
		return (EReference)subscriptEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getsubscript_Symbol() {
		return (EAttribute)subscriptEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsliceop() {
		return sliceopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getsliceop_Test() {
		return (EReference)sliceopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getexprlist() {
		return exprlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getexprlist_Exprs() {
		return (EReference)exprlistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getexprlist_OptionalComma() {
		return (EAttribute)exprlistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettestlist() {
		return testlistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettestlist_Tests() {
		return (EReference)testlistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute gettestlist_OptionalComma() {
		return (EAttribute)testlistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdictorset_entry() {
		return dictorset_entryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdictorset_entry_Test1() {
		return (EReference)dictorset_entryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdictorset_entry_Test2() {
		return (EReference)dictorset_entryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdictorsetmaker() {
		return dictorsetmakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdictorsetmaker_Entries() {
		return (EReference)dictorsetmakerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdictorsetmaker_Comp_for() {
		return (EReference)dictorsetmakerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdictorsetmaker_OptionalComma() {
		return (EAttribute)dictorsetmakerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getdictorsetmaker_Tests() {
		return (EReference)dictorsetmakerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getclassdef() {
		return classdefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getclassdef_Name() {
		return (EAttribute)classdefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getclassdef_RoundBrackets() {
		return (EAttribute)classdefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getclassdef_Testlist() {
		return (EReference)classdefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getclassdef_Suite() {
		return (EReference)classdefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getarglist() {
		return arglistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getarglist_Arguments() {
		return (EReference)arglistEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getarglist_Argument() {
		return (EReference)arglistEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getarglist_OptionalComma() {
		return (EAttribute)arglistEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getarglist_Dot1_test() {
		return (EReference)arglistEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getarglist_Dot1_arguments() {
		return (EReference)arglistEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getarglist_Dot2_test() {
		return (EReference)arglistEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getargument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getargument_Test() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getargument_Comp_for() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getargument_Test2() {
		return (EReference)argumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlist_iter() {
		return list_iterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getlist_iter_List_iter() {
		return (EReference)list_iterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlist_for() {
		return list_forEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getlist_for_Exprlist() {
		return (EReference)list_forEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getlist_for_Testlist_safe() {
		return (EReference)list_forEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlist_if() {
		return list_ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getlist_if_Old_test() {
		return (EReference)list_ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcomp_iter() {
		return comp_iterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcomp_iter_Comp_iter() {
		return (EReference)comp_iterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcomp_for() {
		return comp_forEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcomp_for_Exprlist() {
		return (EReference)comp_forEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcomp_for_Or_test() {
		return (EReference)comp_forEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcomp_if() {
		return comp_ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getcomp_if_Test() {
		return (EReference)comp_ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettestlist1() {
		return testlist1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference gettestlist1_Tests() {
		return (EReference)testlist1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getyield_expr() {
		return yield_exprEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getyield_expr_Testlist() {
		return (EReference)yield_exprEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpellElement() {
		return spellElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpellElement_NextStatements() {
		return (EReference)spellElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpellElement_PrevStatements() {
		return (EReference)spellElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpellElement_AlternativeNextStatements() {
		return (EReference)spellElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpellElement_AlternativePrevStatements() {
		return (EReference)spellElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getfunctioncall() {
		return functioncallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getpython_input() {
		return python_inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Id() {
		return (EReference)stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStep_Description() {
		return (EReference)stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerify() {
		return verifyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerify_Args() {
		return (EReference)verifyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSend() {
		return sendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSend_Command() {
		return (EReference)sendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSend_Verify() {
		return (EReference)sendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSend_Arguments() {
		return (EReference)sendEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSend_Values() {
		return (EReference)sendEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSend_Args() {
		return (EReference)sendEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuildTC() {
		return buildTCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildTC_Command() {
		return (EReference)buildTCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildTC_Verify() {
		return (EReference)buildTCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildTC_Arguments() {
		return (EReference)buildTCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildTC_Values() {
		return (EReference)buildTCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuildTC_Args() {
		return (EReference)buildTCEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoto() {
		return gotoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoto_Variable() {
		return (EAttribute)gotoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoto_Target() {
		return (EAttribute)gotoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoto_Expr() {
		return (EReference)gotoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGoto_Hash() {
		return (EAttribute)gotoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayStep() {
		return displayStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisplayStep_Id() {
		return (EReference)displayStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisplayStep_Description() {
		return (EReference)displayStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShowTM() {
		return showTMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShowTM_Tms() {
		return (EReference)showTMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShowTM_Args() {
		return (EReference)showTMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetTM() {
		return getTMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetTM_Tm() {
		return (EReference)getTMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetTM_Args() {
		return (EReference)getTMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getassignment_stmt() {
		return assignment_stmtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getassignment_stmt_Assignments() {
		return (EReference)assignment_stmtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeLanguageConfig() {
		return changeLanguageConfigEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeLanguageConfig_Statement() {
		return (EAttribute)changeLanguageConfigEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeLanguageConfig_Args() {
		return (EReference)changeLanguageConfigEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetLimits() {
		return setLimitsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetLimits_Tm() {
		return (EReference)setLimitsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetLimits_Args() {
		return (EReference)setLimitsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpellFactory getSpellFactory() {
		return (SpellFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		single_inputEClass = createEClass(SINGLE_INPUT);
		createEReference(single_inputEClass, SINGLE_INPUT__STMT);

		file_inputEClass = createEClass(FILE_INPUT);
		createEReference(file_inputEClass, FILE_INPUT__STMTS);

		eval_inputEClass = createEClass(EVAL_INPUT);
		createEReference(eval_inputEClass, EVAL_INPUT__TESTLIST);

		decoratorEClass = createEClass(DECORATOR);
		createEAttribute(decoratorEClass, DECORATOR__DOTTED_NAME);
		createEAttribute(decoratorEClass, DECORATOR__ROUND_BRACKET);
		createEReference(decoratorEClass, DECORATOR__ARGLIST);

		decoratorsEClass = createEClass(DECORATORS);
		createEReference(decoratorsEClass, DECORATORS__DECORATORS);

		decoratedEClass = createEClass(DECORATED);
		createEReference(decoratedEClass, DECORATED__DECORATORS);
		createEReference(decoratedEClass, DECORATED__DEF);

		funcdefEClass = createEClass(FUNCDEF);
		createEAttribute(funcdefEClass, FUNCDEF__NAME);
		createEReference(funcdefEClass, FUNCDEF__PARAMETERS);
		createEReference(funcdefEClass, FUNCDEF__SUITE);

		parametersEClass = createEClass(PARAMETERS);
		createEReference(parametersEClass, PARAMETERS__VARARGSLIST);

		varargslist_elementEClass = createEClass(VARARGSLIST_ELEMENT);
		createEReference(varargslist_elementEClass, VARARGSLIST_ELEMENT__FPDEF);
		createEReference(varargslist_elementEClass, VARARGSLIST_ELEMENT__TEST);

		varargslistEClass = createEClass(VARARGSLIST);
		createEReference(varargslistEClass, VARARGSLIST__VARARGS1);
		createEAttribute(varargslistEClass, VARARGSLIST__DOT1_NAME);
		createEAttribute(varargslistEClass, VARARGSLIST__DOT2_NAME);
		createEAttribute(varargslistEClass, VARARGSLIST__DOT3_NAME);
		createEReference(varargslistEClass, VARARGSLIST__VARARG2);
		createEReference(varargslistEClass, VARARGSLIST__VARARGS3);
		createEAttribute(varargslistEClass, VARARGSLIST__ADDITIONAL_COMMA);

		fpdefEClass = createEClass(FPDEF);
		createEAttribute(fpdefEClass, FPDEF__NAME);
		createEReference(fpdefEClass, FPDEF__FPLIST);

		fplistEClass = createEClass(FPLIST);
		createEReference(fplistEClass, FPLIST__DEF1);
		createEReference(fplistEClass, FPLIST__DEFINITIONS);
		createEAttribute(fplistEClass, FPLIST__OPTIONAL_SEMICOLON);

		stmtEClass = createEClass(STMT);

		simple_stmtEClass = createEClass(SIMPLE_STMT);
		createEReference(simple_stmtEClass, SIMPLE_STMT__STMT);
		createEAttribute(simple_stmtEClass, SIMPLE_STMT__ADDITIONAL_COMMA);

		small_stmtEClass = createEClass(SMALL_STMT);

		expr_stmtEClass = createEClass(EXPR_STMT);
		createEReference(expr_stmtEClass, EXPR_STMT__LEFT);
		createEAttribute(expr_stmtEClass, EXPR_STMT__SYMBOL);
		createEReference(expr_stmtEClass, EXPR_STMT__RIGHT);

		yield_or_testlistEClass = createEClass(YIELD_OR_TESTLIST);

		del_stmtEClass = createEClass(DEL_STMT);
		createEReference(del_stmtEClass, DEL_STMT__EXPRLIST);

		pass_stmtEClass = createEClass(PASS_STMT);

		flow_stmtEClass = createEClass(FLOW_STMT);

		break_stmtEClass = createEClass(BREAK_STMT);

		continue_stmtEClass = createEClass(CONTINUE_STMT);

		return_stmtEClass = createEClass(RETURN_STMT);
		createEReference(return_stmtEClass, RETURN_STMT__TESTLIST);

		yield_stmtEClass = createEClass(YIELD_STMT);
		createEReference(yield_stmtEClass, YIELD_STMT__YIELD_EXPR);

		raise_stmtEClass = createEClass(RAISE_STMT);
		createEReference(raise_stmtEClass, RAISE_STMT__TESTS);

		import_stmtEClass = createEClass(IMPORT_STMT);

		import_nameEClass = createEClass(IMPORT_NAME);
		createEReference(import_nameEClass, IMPORT_NAME__DOTTED_AS_NAMES);

		import_fromEClass = createEClass(IMPORT_FROM);
		createEAttribute(import_fromEClass, IMPORT_FROM__DOTS);
		createEAttribute(import_fromEClass, IMPORT_FROM__DOTTED_NAME);
		createEAttribute(import_fromEClass, IMPORT_FROM__DOTS2);
		createEAttribute(import_fromEClass, IMPORT_FROM__ROUND_BRACKET);
		createEReference(import_fromEClass, IMPORT_FROM__IMPORT_AS_NAMES);

		import_as_nameEClass = createEClass(IMPORT_AS_NAME);
		createEAttribute(import_as_nameEClass, IMPORT_AS_NAME__NAME);
		createEAttribute(import_as_nameEClass, IMPORT_AS_NAME__IDENTIFIER);

		dotted_as_nameEClass = createEClass(DOTTED_AS_NAME);
		createEAttribute(dotted_as_nameEClass, DOTTED_AS_NAME__NAME);
		createEAttribute(dotted_as_nameEClass, DOTTED_AS_NAME__IDENTIFIER);

		import_as_namesEClass = createEClass(IMPORT_AS_NAMES);
		createEReference(import_as_namesEClass, IMPORT_AS_NAMES__IMPORTS);
		createEAttribute(import_as_namesEClass, IMPORT_AS_NAMES__OPTIONAL_COMMA);

		dotted_as_namesEClass = createEClass(DOTTED_AS_NAMES);
		createEReference(dotted_as_namesEClass, DOTTED_AS_NAMES__DOTTED_NAMES);

		global_stmtEClass = createEClass(GLOBAL_STMT);
		createEAttribute(global_stmtEClass, GLOBAL_STMT__GLOBALS);

		exec_stmtEClass = createEClass(EXEC_STMT);
		createEReference(exec_stmtEClass, EXEC_STMT__EXPR);
		createEReference(exec_stmtEClass, EXEC_STMT__TESTS);

		assert_stmtEClass = createEClass(ASSERT_STMT);
		createEReference(assert_stmtEClass, ASSERT_STMT__ASSERS);

		compound_stmtEClass = createEClass(COMPOUND_STMT);

		else_if_stmtEClass = createEClass(ELSE_IF_STMT);
		createEReference(else_if_stmtEClass, ELSE_IF_STMT__TEST);
		createEReference(else_if_stmtEClass, ELSE_IF_STMT__SUITE);

		if_stmtEClass = createEClass(IF_STMT);
		createEReference(if_stmtEClass, IF_STMT__TEST);
		createEReference(if_stmtEClass, IF_STMT__SUITE);
		createEReference(if_stmtEClass, IF_STMT__ELSE_IF_STMTS);
		createEReference(if_stmtEClass, IF_STMT__ELSE);

		while_stmtEClass = createEClass(WHILE_STMT);
		createEReference(while_stmtEClass, WHILE_STMT__TEST);
		createEReference(while_stmtEClass, WHILE_STMT__SUITE);
		createEReference(while_stmtEClass, WHILE_STMT__ELSE);

		for_stmtEClass = createEClass(FOR_STMT);
		createEReference(for_stmtEClass, FOR_STMT__EXPRLIST);
		createEReference(for_stmtEClass, FOR_STMT__TESTLIST);
		createEReference(for_stmtEClass, FOR_STMT__SUITE);
		createEReference(for_stmtEClass, FOR_STMT__ELSE);

		try_stmtEClass = createEClass(TRY_STMT);
		createEReference(try_stmtEClass, TRY_STMT__SUITE);
		createEReference(try_stmtEClass, TRY_STMT__EXCEPT_CLAUSE);
		createEReference(try_stmtEClass, TRY_STMT__ELSE);
		createEReference(try_stmtEClass, TRY_STMT__FINALLY);

		with_stmtEClass = createEClass(WITH_STMT);
		createEReference(with_stmtEClass, WITH_STMT__WITH_ITEM);
		createEReference(with_stmtEClass, WITH_STMT__SUITE);

		with_itemEClass = createEClass(WITH_ITEM);
		createEReference(with_itemEClass, WITH_ITEM__TEST);
		createEReference(with_itemEClass, WITH_ITEM__EXPR);

		except_clauseEClass = createEClass(EXCEPT_CLAUSE);
		createEReference(except_clauseEClass, EXCEPT_CLAUSE__TEST);
		createEAttribute(except_clauseEClass, EXCEPT_CLAUSE__SIGN);
		createEReference(except_clauseEClass, EXCEPT_CLAUSE__NEXT_TEST);
		createEReference(except_clauseEClass, EXCEPT_CLAUSE__SUITE);

		suiteEClass = createEClass(SUITE);
		createEReference(suiteEClass, SUITE__STMTS);

		testlist_safeEClass = createEClass(TESTLIST_SAFE);
		createEReference(testlist_safeEClass, TESTLIST_SAFE__OLD_TEST);
		createEAttribute(testlist_safeEClass, TESTLIST_SAFE__OPTIONAL_COMA);

		testEClass = createEClass(TEST);
		createEReference(testEClass, TEST__IF_TEST);
		createEReference(testEClass, TEST__IF_ELSE_TEST);

		or_testEClass = createEClass(OR_TEST);
		createEAttribute(or_testEClass, OR_TEST__SIGN);

		and_testEClass = createEClass(AND_TEST);

		not_testEClass = createEClass(NOT_TEST);
		createEAttribute(not_testEClass, NOT_TEST__NOT);
		createEReference(not_testEClass, NOT_TEST__COMPARISON);

		comparisonEClass = createEClass(COMPARISON);
		createEAttribute(comparisonEClass, COMPARISON__COMP_OP);

		exprEClass = createEClass(EXPR);

		xor_exprEClass = createEClass(XOR_EXPR);

		and_exprEClass = createEClass(AND_EXPR);

		shift_exprEClass = createEClass(SHIFT_EXPR);

		arith_exprEClass = createEClass(ARITH_EXPR);

		termEClass = createEClass(TERM);

		factorEClass = createEClass(FACTOR);
		createEReference(factorEClass, FACTOR__FACTOR);

		powerEClass = createEClass(POWER);
		createEReference(powerEClass, POWER__ATOM);
		createEReference(powerEClass, POWER__TRAILER);

		yield_or_testlist_compEClass = createEClass(YIELD_OR_TESTLIST_COMP);

		atomEClass = createEClass(ATOM);
		createEAttribute(atomEClass, ATOM__ROUND_BRACKET);
		createEReference(atomEClass, ATOM__YIELD_OR_TESTLIST_COMP);
		createEAttribute(atomEClass, ATOM__SQUARE_BRACKET);
		createEReference(atomEClass, ATOM__LISTMAKER);
		createEAttribute(atomEClass, ATOM__CURLY_BRACKET);
		createEReference(atomEClass, ATOM__DICTORSETMAKER);
		createEReference(atomEClass, ATOM__TESTLIST1);
		createEAttribute(atomEClass, ATOM__NAME);
		createEAttribute(atomEClass, ATOM__STRINGS);

		listmakerEClass = createEClass(LISTMAKER);
		createEReference(listmakerEClass, LISTMAKER__TEST);
		createEReference(listmakerEClass, LISTMAKER__LIST_FOR);
		createEReference(listmakerEClass, LISTMAKER__ADDITIONAL_TESTS);
		createEAttribute(listmakerEClass, LISTMAKER__OPTIONAL_COMMA);

		testlist_compEClass = createEClass(TESTLIST_COMP);
		createEReference(testlist_compEClass, TESTLIST_COMP__TEST);
		createEReference(testlist_compEClass, TESTLIST_COMP__COMP_FOR);
		createEReference(testlist_compEClass, TESTLIST_COMP__ADDITIONAL_TESTS);
		createEAttribute(testlist_compEClass, TESTLIST_COMP__OPTIONAL_COMMA);

		lambdefEClass = createEClass(LAMBDEF);
		createEReference(lambdefEClass, LAMBDEF__VARARGSLIST);

		trailerEClass = createEClass(TRAILER);
		createEAttribute(trailerEClass, TRAILER__ROUND_BRACKET);
		createEReference(trailerEClass, TRAILER__ARGLIST);
		createEAttribute(trailerEClass, TRAILER__SQUARE_BRACKET);
		createEReference(trailerEClass, TRAILER__SUBSCRIPTLIST);
		createEAttribute(trailerEClass, TRAILER__DOT_NAME);

		subscriptlistEClass = createEClass(SUBSCRIPTLIST);
		createEReference(subscriptlistEClass, SUBSCRIPTLIST__SUBSCRIPT);
		createEAttribute(subscriptlistEClass, SUBSCRIPTLIST__OPTIONAL_COMMA);

		subscriptEClass = createEClass(SUBSCRIPT);
		createEReference(subscriptEClass, SUBSCRIPT__SUBSCRIPT1);
		createEReference(subscriptEClass, SUBSCRIPT__SUBSCRIPT2);
		createEReference(subscriptEClass, SUBSCRIPT__SLICEOP);
		createEAttribute(subscriptEClass, SUBSCRIPT__SYMBOL);

		sliceopEClass = createEClass(SLICEOP);
		createEReference(sliceopEClass, SLICEOP__TEST);

		exprlistEClass = createEClass(EXPRLIST);
		createEReference(exprlistEClass, EXPRLIST__EXPRS);
		createEAttribute(exprlistEClass, EXPRLIST__OPTIONAL_COMMA);

		testlistEClass = createEClass(TESTLIST);
		createEReference(testlistEClass, TESTLIST__TESTS);
		createEAttribute(testlistEClass, TESTLIST__OPTIONAL_COMMA);

		dictorset_entryEClass = createEClass(DICTORSET_ENTRY);
		createEReference(dictorset_entryEClass, DICTORSET_ENTRY__TEST1);
		createEReference(dictorset_entryEClass, DICTORSET_ENTRY__TEST2);

		dictorsetmakerEClass = createEClass(DICTORSETMAKER);
		createEReference(dictorsetmakerEClass, DICTORSETMAKER__ENTRIES);
		createEReference(dictorsetmakerEClass, DICTORSETMAKER__COMP_FOR);
		createEAttribute(dictorsetmakerEClass, DICTORSETMAKER__OPTIONAL_COMMA);
		createEReference(dictorsetmakerEClass, DICTORSETMAKER__TESTS);

		classdefEClass = createEClass(CLASSDEF);
		createEAttribute(classdefEClass, CLASSDEF__NAME);
		createEAttribute(classdefEClass, CLASSDEF__ROUND_BRACKETS);
		createEReference(classdefEClass, CLASSDEF__TESTLIST);
		createEReference(classdefEClass, CLASSDEF__SUITE);

		arglistEClass = createEClass(ARGLIST);
		createEReference(arglistEClass, ARGLIST__ARGUMENTS);
		createEReference(arglistEClass, ARGLIST__ARGUMENT);
		createEAttribute(arglistEClass, ARGLIST__OPTIONAL_COMMA);
		createEReference(arglistEClass, ARGLIST__DOT1_TEST);
		createEReference(arglistEClass, ARGLIST__DOT1_ARGUMENTS);
		createEReference(arglistEClass, ARGLIST__DOT2_TEST);

		argumentEClass = createEClass(ARGUMENT);
		createEReference(argumentEClass, ARGUMENT__TEST);
		createEReference(argumentEClass, ARGUMENT__COMP_FOR);
		createEReference(argumentEClass, ARGUMENT__TEST2);

		list_iterEClass = createEClass(LIST_ITER);
		createEReference(list_iterEClass, LIST_ITER__LIST_ITER);

		list_forEClass = createEClass(LIST_FOR);
		createEReference(list_forEClass, LIST_FOR__EXPRLIST);
		createEReference(list_forEClass, LIST_FOR__TESTLIST_SAFE);

		list_ifEClass = createEClass(LIST_IF);
		createEReference(list_ifEClass, LIST_IF__OLD_TEST);

		comp_iterEClass = createEClass(COMP_ITER);
		createEReference(comp_iterEClass, COMP_ITER__COMP_ITER);

		comp_forEClass = createEClass(COMP_FOR);
		createEReference(comp_forEClass, COMP_FOR__EXPRLIST);
		createEReference(comp_forEClass, COMP_FOR__OR_TEST);

		comp_ifEClass = createEClass(COMP_IF);
		createEReference(comp_ifEClass, COMP_IF__TEST);

		testlist1EClass = createEClass(TESTLIST1);
		createEReference(testlist1EClass, TESTLIST1__TESTS);

		yield_exprEClass = createEClass(YIELD_EXPR);
		createEReference(yield_exprEClass, YIELD_EXPR__TESTLIST);

		spellElementEClass = createEClass(SPELL_ELEMENT);
		createEReference(spellElementEClass, SPELL_ELEMENT__NEXT_STATEMENTS);
		createEReference(spellElementEClass, SPELL_ELEMENT__PREV_STATEMENTS);
		createEReference(spellElementEClass, SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS);
		createEReference(spellElementEClass, SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS);

		functioncallEClass = createEClass(FUNCTIONCALL);

		python_inputEClass = createEClass(PYTHON_INPUT);

		stepEClass = createEClass(STEP);
		createEReference(stepEClass, STEP__ID);
		createEReference(stepEClass, STEP__DESCRIPTION);

		verifyEClass = createEClass(VERIFY);
		createEReference(verifyEClass, VERIFY__ARGS);

		sendEClass = createEClass(SEND);
		createEReference(sendEClass, SEND__COMMAND);
		createEReference(sendEClass, SEND__VERIFY);
		createEReference(sendEClass, SEND__ARGUMENTS);
		createEReference(sendEClass, SEND__VALUES);
		createEReference(sendEClass, SEND__ARGS);

		showTMEClass = createEClass(SHOW_TM);
		createEReference(showTMEClass, SHOW_TM__TMS);
		createEReference(showTMEClass, SHOW_TM__ARGS);

		getTMEClass = createEClass(GET_TM);
		createEReference(getTMEClass, GET_TM__TM);
		createEReference(getTMEClass, GET_TM__ARGS);

		assignment_stmtEClass = createEClass(ASSIGNMENT_STMT);
		createEReference(assignment_stmtEClass, ASSIGNMENT_STMT__ASSIGNMENTS);

		changeLanguageConfigEClass = createEClass(CHANGE_LANGUAGE_CONFIG);
		createEAttribute(changeLanguageConfigEClass, CHANGE_LANGUAGE_CONFIG__STATEMENT);
		createEReference(changeLanguageConfigEClass, CHANGE_LANGUAGE_CONFIG__ARGS);

		setLimitsEClass = createEClass(SET_LIMITS);
		createEReference(setLimitsEClass, SET_LIMITS__TM);
		createEReference(setLimitsEClass, SET_LIMITS__ARGS);

		buildTCEClass = createEClass(BUILD_TC);
		createEReference(buildTCEClass, BUILD_TC__COMMAND);
		createEReference(buildTCEClass, BUILD_TC__VERIFY);
		createEReference(buildTCEClass, BUILD_TC__ARGUMENTS);
		createEReference(buildTCEClass, BUILD_TC__VALUES);
		createEReference(buildTCEClass, BUILD_TC__ARGS);

		gotoEClass = createEClass(GOTO);
		createEAttribute(gotoEClass, GOTO__VARIABLE);
		createEAttribute(gotoEClass, GOTO__TARGET);
		createEReference(gotoEClass, GOTO__EXPR);
		createEAttribute(gotoEClass, GOTO__HASH);

		displayStepEClass = createEClass(DISPLAY_STEP);
		createEReference(displayStepEClass, DISPLAY_STEP__ID);
		createEReference(displayStepEClass, DISPLAY_STEP__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		single_inputEClass.getESuperTypes().add(this.getpython_input());
		file_inputEClass.getESuperTypes().add(this.getpython_input());
		eval_inputEClass.getESuperTypes().add(this.getpython_input());
		decoratorEClass.getESuperTypes().add(this.getSpellElement());
		decoratorsEClass.getESuperTypes().add(this.getSpellElement());
		decoratedEClass.getESuperTypes().add(this.getcompound_stmt());
		funcdefEClass.getESuperTypes().add(this.getcompound_stmt());
		parametersEClass.getESuperTypes().add(this.getSpellElement());
		varargslist_elementEClass.getESuperTypes().add(this.getSpellElement());
		varargslistEClass.getESuperTypes().add(this.getSpellElement());
		fpdefEClass.getESuperTypes().add(this.getSpellElement());
		fplistEClass.getESuperTypes().add(this.getSpellElement());
		stmtEClass.getESuperTypes().add(this.getSpellElement());
		simple_stmtEClass.getESuperTypes().add(this.getstmt());
		simple_stmtEClass.getESuperTypes().add(this.getsuite());
		small_stmtEClass.getESuperTypes().add(this.getsimple_stmt());
		expr_stmtEClass.getESuperTypes().add(this.getsmall_stmt());
		yield_or_testlistEClass.getESuperTypes().add(this.getSpellElement());
		del_stmtEClass.getESuperTypes().add(this.getsmall_stmt());
		pass_stmtEClass.getESuperTypes().add(this.getsmall_stmt());
		flow_stmtEClass.getESuperTypes().add(this.getsmall_stmt());
		break_stmtEClass.getESuperTypes().add(this.getflow_stmt());
		continue_stmtEClass.getESuperTypes().add(this.getflow_stmt());
		return_stmtEClass.getESuperTypes().add(this.getflow_stmt());
		yield_stmtEClass.getESuperTypes().add(this.getflow_stmt());
		raise_stmtEClass.getESuperTypes().add(this.getflow_stmt());
		import_stmtEClass.getESuperTypes().add(this.getsmall_stmt());
		import_nameEClass.getESuperTypes().add(this.getimport_stmt());
		import_fromEClass.getESuperTypes().add(this.getimport_stmt());
		import_as_nameEClass.getESuperTypes().add(this.getSpellElement());
		dotted_as_nameEClass.getESuperTypes().add(this.getSpellElement());
		import_as_namesEClass.getESuperTypes().add(this.getSpellElement());
		dotted_as_namesEClass.getESuperTypes().add(this.getSpellElement());
		global_stmtEClass.getESuperTypes().add(this.getsmall_stmt());
		exec_stmtEClass.getESuperTypes().add(this.getsmall_stmt());
		assert_stmtEClass.getESuperTypes().add(this.getsmall_stmt());
		compound_stmtEClass.getESuperTypes().add(this.getstmt());
		else_if_stmtEClass.getESuperTypes().add(this.getSpellElement());
		if_stmtEClass.getESuperTypes().add(this.getcompound_stmt());
		while_stmtEClass.getESuperTypes().add(this.getcompound_stmt());
		for_stmtEClass.getESuperTypes().add(this.getcompound_stmt());
		try_stmtEClass.getESuperTypes().add(this.getcompound_stmt());
		with_stmtEClass.getESuperTypes().add(this.getcompound_stmt());
		with_itemEClass.getESuperTypes().add(this.getSpellElement());
		except_clauseEClass.getESuperTypes().add(this.getSpellElement());
		suiteEClass.getESuperTypes().add(this.getSpellElement());
		testlist_safeEClass.getESuperTypes().add(this.getSpellElement());
		testEClass.getESuperTypes().add(this.gettestlist());
		testEClass.getESuperTypes().add(this.getargument());
		or_testEClass.getESuperTypes().add(this.gettest());
		and_testEClass.getESuperTypes().add(this.getor_test());
		not_testEClass.getESuperTypes().add(this.getand_test());
		comparisonEClass.getESuperTypes().add(this.getnot_test());
		exprEClass.getESuperTypes().add(this.getcomparison());
		xor_exprEClass.getESuperTypes().add(this.getexpr());
		and_exprEClass.getESuperTypes().add(this.getxor_expr());
		shift_exprEClass.getESuperTypes().add(this.getand_expr());
		arith_exprEClass.getESuperTypes().add(this.getshift_expr());
		termEClass.getESuperTypes().add(this.getarith_expr());
		factorEClass.getESuperTypes().add(this.getterm());
		powerEClass.getESuperTypes().add(this.getfactor());
		yield_or_testlist_compEClass.getESuperTypes().add(this.getSpellElement());
		atomEClass.getESuperTypes().add(this.getpower());
		listmakerEClass.getESuperTypes().add(this.getSpellElement());
		testlist_compEClass.getESuperTypes().add(this.getyield_or_testlist_comp());
		lambdefEClass.getESuperTypes().add(this.gettest());
		trailerEClass.getESuperTypes().add(this.getSpellElement());
		subscriptlistEClass.getESuperTypes().add(this.getSpellElement());
		subscriptEClass.getESuperTypes().add(this.getSpellElement());
		sliceopEClass.getESuperTypes().add(this.getSpellElement());
		exprlistEClass.getESuperTypes().add(this.getSpellElement());
		testlistEClass.getESuperTypes().add(this.getexpr_stmt());
		testlistEClass.getESuperTypes().add(this.getyield_or_testlist());
		dictorset_entryEClass.getESuperTypes().add(this.getSpellElement());
		dictorsetmakerEClass.getESuperTypes().add(this.getSpellElement());
		classdefEClass.getESuperTypes().add(this.getcompound_stmt());
		arglistEClass.getESuperTypes().add(this.getSpellElement());
		argumentEClass.getESuperTypes().add(this.getSpellElement());
		list_iterEClass.getESuperTypes().add(this.getSpellElement());
		list_forEClass.getESuperTypes().add(this.getlist_iter());
		list_ifEClass.getESuperTypes().add(this.getlist_iter());
		comp_iterEClass.getESuperTypes().add(this.getSpellElement());
		comp_forEClass.getESuperTypes().add(this.getcomp_iter());
		comp_ifEClass.getESuperTypes().add(this.getcomp_iter());
		testlist1EClass.getESuperTypes().add(this.getSpellElement());
		yield_exprEClass.getESuperTypes().add(this.getyield_or_testlist());
		yield_exprEClass.getESuperTypes().add(this.getyield_or_testlist_comp());
		functioncallEClass.getESuperTypes().add(this.gettrailer());
		python_inputEClass.getESuperTypes().add(this.getSpellElement());
		stepEClass.getESuperTypes().add(this.getpower());
		verifyEClass.getESuperTypes().add(this.getpower());
		sendEClass.getESuperTypes().add(this.getpower());
		showTMEClass.getESuperTypes().add(this.getpower());
		getTMEClass.getESuperTypes().add(this.getpower());
		assignment_stmtEClass.getESuperTypes().add(this.getsmall_stmt());
		assignment_stmtEClass.getESuperTypes().add(this.getexpr_stmt());
		changeLanguageConfigEClass.getESuperTypes().add(this.getpower());
		setLimitsEClass.getESuperTypes().add(this.getpower());
		buildTCEClass.getESuperTypes().add(this.getpower());
		gotoEClass.getESuperTypes().add(this.getpower());
		displayStepEClass.getESuperTypes().add(this.getpower());

		// Initialize classes and features; add operations and parameters
		initEClass(single_inputEClass, single_input.class, "single_input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getsingle_input_Stmt(), this.getstmt(), null, "stmt", null, 0, 1, single_input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(file_inputEClass, file_input.class, "file_input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getfile_input_Stmts(), this.getstmt(), null, "stmts", null, 0, -1, file_input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eval_inputEClass, eval_input.class, "eval_input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(geteval_input_Testlist(), this.gettestlist(), null, "testlist", null, 0, 1, eval_input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decoratorEClass, decorator.class, "decorator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getdecorator_Dotted_name(), ecorePackage.getEString(), "dotted_name", null, 0, 1, decorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getdecorator_RoundBracket(), ecorePackage.getEBoolean(), "roundBracket", null, 0, 1, decorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getdecorator_Arglist(), this.getarglist(), null, "arglist", null, 0, 1, decorator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decoratorsEClass, decorators.class, "decorators", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdecorators_Decorators(), this.getdecorator(), null, "decorators", null, 0, -1, decorators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(decoratedEClass, decorated.class, "decorated", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdecorated_Decorators(), this.getdecorators(), null, "decorators", null, 0, 1, decorated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getdecorated_Def(), this.getcompound_stmt(), null, "def", null, 0, 1, decorated.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcdefEClass, funcdef.class, "funcdef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getfuncdef_Name(), ecorePackage.getEString(), "name", null, 0, 1, funcdef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getfuncdef_Parameters(), this.getparameters(), null, "parameters", null, 0, 1, funcdef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getfuncdef_Suite(), this.getsuite(), null, "suite", null, 0, 1, funcdef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parametersEClass, parameters.class, "parameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getparameters_Varargslist(), this.getvarargslist(), null, "varargslist", null, 0, 1, parameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varargslist_elementEClass, varargslist_element.class, "varargslist_element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getvarargslist_element_Fpdef(), this.getfpdef(), null, "fpdef", null, 0, 1, varargslist_element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getvarargslist_element_Test(), this.gettest(), null, "test", null, 0, 1, varargslist_element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varargslistEClass, varargslist.class, "varargslist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getvarargslist_Varargs1(), this.getvarargslist_element(), null, "varargs1", null, 0, -1, varargslist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getvarargslist_Dot1Name(), ecorePackage.getEString(), "dot1Name", null, 0, 1, varargslist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getvarargslist_Dot2Name(), ecorePackage.getEString(), "dot2Name", null, 0, 1, varargslist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getvarargslist_Dot3Name(), ecorePackage.getEString(), "dot3Name", null, 0, 1, varargslist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getvarargslist_Vararg2(), this.getvarargslist_element(), null, "vararg2", null, 0, 1, varargslist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getvarargslist_Varargs3(), this.getvarargslist_element(), null, "varargs3", null, 0, -1, varargslist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getvarargslist_AdditionalComma(), ecorePackage.getEBoolean(), "additionalComma", null, 0, 1, varargslist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fpdefEClass, fpdef.class, "fpdef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getfpdef_Name(), ecorePackage.getEString(), "name", null, 0, 1, fpdef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getfpdef_Fplist(), this.getfplist(), null, "fplist", null, 0, 1, fpdef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fplistEClass, fplist.class, "fplist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getfplist_Def1(), this.getfpdef(), null, "def1", null, 0, 1, fplist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getfplist_Definitions(), this.getfpdef(), null, "definitions", null, 0, -1, fplist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getfplist_OptionalSemicolon(), ecorePackage.getEBoolean(), "optionalSemicolon", null, 0, 1, fplist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stmtEClass, stmt.class, "stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simple_stmtEClass, simple_stmt.class, "simple_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getsimple_stmt_Stmt(), this.getsmall_stmt(), null, "stmt", null, 0, -1, simple_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsimple_stmt_AdditionalComma(), ecorePackage.getEBoolean(), "additionalComma", null, 0, 1, simple_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(small_stmtEClass, small_stmt.class, "small_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expr_stmtEClass, expr_stmt.class, "expr_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getexpr_stmt_Left(), this.gettestlist(), null, "left", null, 0, 1, expr_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getexpr_stmt_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, expr_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getexpr_stmt_Right(), this.getyield_or_testlist(), null, "right", null, 0, 1, expr_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yield_or_testlistEClass, yield_or_testlist.class, "yield_or_testlist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(del_stmtEClass, del_stmt.class, "del_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdel_stmt_Exprlist(), this.getexprlist(), null, "exprlist", null, 0, 1, del_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pass_stmtEClass, pass_stmt.class, "pass_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flow_stmtEClass, flow_stmt.class, "flow_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(break_stmtEClass, break_stmt.class, "break_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(continue_stmtEClass, continue_stmt.class, "continue_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(return_stmtEClass, return_stmt.class, "return_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getreturn_stmt_Testlist(), this.gettestlist(), null, "testlist", null, 0, 1, return_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yield_stmtEClass, yield_stmt.class, "yield_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getyield_stmt_Yield_expr(), this.getyield_expr(), null, "yield_expr", null, 0, 1, yield_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(raise_stmtEClass, raise_stmt.class, "raise_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getraise_stmt_Tests(), this.gettest(), null, "tests", null, 0, -1, raise_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(import_stmtEClass, import_stmt.class, "import_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(import_nameEClass, import_name.class, "import_name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getimport_name_Dotted_as_names(), this.getdotted_as_names(), null, "dotted_as_names", null, 0, 1, import_name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(import_fromEClass, import_from.class, "import_from", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getimport_from_Dots(), ecorePackage.getEString(), "dots", null, 0, -1, import_from.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getimport_from_Dotted_name(), ecorePackage.getEString(), "dotted_name", null, 0, 1, import_from.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getimport_from_Dots2(), ecorePackage.getEString(), "dots2", null, 0, -1, import_from.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getimport_from_RoundBracket(), ecorePackage.getEBoolean(), "roundBracket", null, 0, 1, import_from.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getimport_from_Import_as_names(), this.getimport_as_names(), null, "import_as_names", null, 0, 1, import_from.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(import_as_nameEClass, import_as_name.class, "import_as_name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getimport_as_name_Name(), ecorePackage.getEString(), "name", null, 0, 1, import_as_name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getimport_as_name_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, import_as_name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dotted_as_nameEClass, dotted_as_name.class, "dotted_as_name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getdotted_as_name_Name(), ecorePackage.getEString(), "name", null, 0, 1, dotted_as_name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getdotted_as_name_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, dotted_as_name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(import_as_namesEClass, import_as_names.class, "import_as_names", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getimport_as_names_Imports(), this.getimport_as_name(), null, "imports", null, 0, -1, import_as_names.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getimport_as_names_OptionalComma(), ecorePackage.getEBoolean(), "optionalComma", null, 0, 1, import_as_names.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dotted_as_namesEClass, dotted_as_names.class, "dotted_as_names", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdotted_as_names_Dotted_names(), this.getdotted_as_name(), null, "dotted_names", null, 0, -1, dotted_as_names.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(global_stmtEClass, global_stmt.class, "global_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getglobal_stmt_Globals(), ecorePackage.getEString(), "globals", null, 0, -1, global_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exec_stmtEClass, exec_stmt.class, "exec_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getexec_stmt_Expr(), this.getexpr(), null, "expr", null, 0, 1, exec_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getexec_stmt_Tests(), this.gettest(), null, "tests", null, 0, -1, exec_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assert_stmtEClass, assert_stmt.class, "assert_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getassert_stmt_Assers(), this.gettest(), null, "assers", null, 0, -1, assert_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compound_stmtEClass, compound_stmt.class, "compound_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(else_if_stmtEClass, else_if_stmt.class, "else_if_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getelse_if_stmt_Test(), this.gettest(), null, "test", null, 0, 1, else_if_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getelse_if_stmt_Suite(), this.getsuite(), null, "suite", null, 0, 1, else_if_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(if_stmtEClass, if_stmt.class, "if_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getif_stmt_Test(), this.gettest(), null, "test", null, 0, 1, if_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getif_stmt_Suite(), this.getsuite(), null, "suite", null, 0, 1, if_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getif_stmt_Else_if_stmts(), this.getelse_if_stmt(), null, "else_if_stmts", null, 0, -1, if_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getif_stmt_Else(), this.getsuite(), null, "else", null, 0, 1, if_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(while_stmtEClass, while_stmt.class, "while_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getwhile_stmt_Test(), this.gettest(), null, "test", null, 0, 1, while_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwhile_stmt_Suite(), this.getsuite(), null, "suite", null, 0, 1, while_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwhile_stmt_Else(), this.getsuite(), null, "else", null, 0, 1, while_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(for_stmtEClass, for_stmt.class, "for_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getfor_stmt_Exprlist(), this.getexprlist(), null, "exprlist", null, 0, 1, for_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getfor_stmt_Testlist(), this.gettestlist(), null, "testlist", null, 0, 1, for_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getfor_stmt_Suite(), this.getsuite(), null, "suite", null, 0, 1, for_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getfor_stmt_Else(), this.getsuite(), null, "else", null, 0, 1, for_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(try_stmtEClass, try_stmt.class, "try_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettry_stmt_Suite(), this.getsuite(), null, "suite", null, 0, 1, try_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettry_stmt_Except_clause(), this.getexcept_clause(), null, "except_clause", null, 0, -1, try_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettry_stmt_Else(), this.getsuite(), null, "else", null, 0, 1, try_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettry_stmt_Finally(), this.getsuite(), null, "finally", null, 0, 1, try_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(with_stmtEClass, with_stmt.class, "with_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getwith_stmt_With_item(), this.getwith_item(), null, "with_item", null, 0, -1, with_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwith_stmt_Suite(), this.getsuite(), null, "suite", null, 0, 1, with_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(with_itemEClass, with_item.class, "with_item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getwith_item_Test(), this.gettest(), null, "test", null, 0, 1, with_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwith_item_Expr(), this.getexpr(), null, "expr", null, 0, 1, with_item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(except_clauseEClass, except_clause.class, "except_clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getexcept_clause_Test(), this.gettest(), null, "test", null, 0, 1, except_clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getexcept_clause_Sign(), ecorePackage.getEString(), "sign", null, 0, 1, except_clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getexcept_clause_Next_test(), this.gettest(), null, "next_test", null, 0, 1, except_clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getexcept_clause_Suite(), this.getsuite(), null, "suite", null, 0, 1, except_clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(suiteEClass, suite.class, "suite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getsuite_Stmts(), this.getstmt(), null, "stmts", null, 0, -1, suite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testlist_safeEClass, testlist_safe.class, "testlist_safe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettestlist_safe_Old_test(), this.gettest(), null, "old_test", null, 0, -1, testlist_safe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettestlist_safe_OptionalComa(), ecorePackage.getEBoolean(), "optionalComa", null, 0, 1, testlist_safe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testEClass, test.class, "test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettest_If_test(), this.getor_test(), null, "if_test", null, 0, 1, test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettest_If_else_test(), this.gettest(), null, "if_else_test", null, 0, 1, test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(or_testEClass, or_test.class, "or_test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getor_test_Sign(), ecorePackage.getEString(), "sign", null, 0, 1, or_test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(and_testEClass, and_test.class, "and_test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(not_testEClass, not_test.class, "not_test", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getnot_test_Not(), ecorePackage.getEString(), "not", null, 0, -1, not_test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getnot_test_Comparison(), this.getcomparison(), null, "comparison", null, 0, 1, not_test.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonEClass, comparison.class, "comparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcomparison_Comp_op(), ecorePackage.getEString(), "comp_op", null, 0, 1, comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exprEClass, expr.class, "expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xor_exprEClass, xor_expr.class, "xor_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(and_exprEClass, and_expr.class, "and_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shift_exprEClass, shift_expr.class, "shift_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arith_exprEClass, arith_expr.class, "arith_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(termEClass, term.class, "term", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(factorEClass, factor.class, "factor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getfactor_Factor(), this.getfactor(), null, "factor", null, 0, 1, factor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerEClass, power.class, "power", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getpower_Atom(), this.getatom(), null, "atom", null, 0, 1, power.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getpower_Trailer(), this.gettrailer(), null, "trailer", null, 0, -1, power.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yield_or_testlist_compEClass, yield_or_testlist_comp.class, "yield_or_testlist_comp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomEClass, atom.class, "atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getatom_RoundBracket(), ecorePackage.getEBoolean(), "roundBracket", null, 0, 1, atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getatom_Yield_or_testlist_comp(), this.getyield_or_testlist_comp(), null, "yield_or_testlist_comp", null, 0, 1, atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getatom_SquareBracket(), ecorePackage.getEBoolean(), "squareBracket", null, 0, 1, atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getatom_Listmaker(), this.getlistmaker(), null, "listmaker", null, 0, 1, atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getatom_CurlyBracket(), ecorePackage.getEBoolean(), "curlyBracket", null, 0, 1, atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getatom_Dictorsetmaker(), this.getdictorsetmaker(), null, "dictorsetmaker", null, 0, 1, atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getatom_Testlist1(), this.gettestlist1(), null, "testlist1", null, 0, 1, atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getatom_Name(), ecorePackage.getEString(), "name", null, 0, 1, atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getatom_Strings(), ecorePackage.getEString(), "strings", null, 0, -1, atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listmakerEClass, listmaker.class, "listmaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getlistmaker_Test(), this.gettest(), null, "test", null, 0, 1, listmaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getlistmaker_List_for(), this.getlist_for(), null, "list_for", null, 0, 1, listmaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getlistmaker_AdditionalTests(), this.gettest(), null, "additionalTests", null, 0, -1, listmaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getlistmaker_OptionalComma(), ecorePackage.getEBoolean(), "optionalComma", null, 0, 1, listmaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testlist_compEClass, testlist_comp.class, "testlist_comp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettestlist_comp_Test(), this.gettest(), null, "test", null, 0, 1, testlist_comp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettestlist_comp_Comp_for(), this.getcomp_for(), null, "comp_for", null, 0, 1, testlist_comp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettestlist_comp_AdditionalTests(), this.gettest(), null, "additionalTests", null, 0, -1, testlist_comp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettestlist_comp_OptionalComma(), ecorePackage.getEBoolean(), "optionalComma", null, 0, 1, testlist_comp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lambdefEClass, lambdef.class, "lambdef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getlambdef_Varargslist(), this.getvarargslist(), null, "varargslist", null, 0, 1, lambdef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trailerEClass, trailer.class, "trailer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(gettrailer_RoundBracket(), ecorePackage.getEBoolean(), "roundBracket", null, 0, 1, trailer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettrailer_Arglist(), this.getarglist(), null, "arglist", null, 0, 1, trailer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettrailer_SquareBracket(), ecorePackage.getEBoolean(), "squareBracket", null, 0, 1, trailer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(gettrailer_Subscriptlist(), this.getsubscriptlist(), null, "subscriptlist", null, 0, 1, trailer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettrailer_DotName(), ecorePackage.getEString(), "dotName", null, 0, 1, trailer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscriptlistEClass, subscriptlist.class, "subscriptlist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getsubscriptlist_Subscript(), this.getsubscript(), null, "subscript", null, 0, -1, subscriptlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsubscriptlist_OptionalComma(), ecorePackage.getEBoolean(), "optionalComma", null, 0, 1, subscriptlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subscriptEClass, subscript.class, "subscript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getsubscript_Subscript1(), this.gettest(), null, "subscript1", null, 0, 1, subscript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsubscript_Subscript2(), this.gettest(), null, "subscript2", null, 0, 1, subscript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getsubscript_Sliceop(), this.getsliceop(), null, "sliceop", null, 0, 1, subscript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getsubscript_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, subscript.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sliceopEClass, sliceop.class, "sliceop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getsliceop_Test(), this.gettest(), null, "test", null, 0, 1, sliceop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(exprlistEClass, exprlist.class, "exprlist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getexprlist_Exprs(), this.getexpr(), null, "exprs", null, 0, -1, exprlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getexprlist_OptionalComma(), ecorePackage.getEBoolean(), "optionalComma", null, 0, 1, exprlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testlistEClass, testlist.class, "testlist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettestlist_Tests(), this.gettestlist(), null, "tests", null, 0, -1, testlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(gettestlist_OptionalComma(), ecorePackage.getEBoolean(), "optionalComma", null, 0, 1, testlist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dictorset_entryEClass, dictorset_entry.class, "dictorset_entry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdictorset_entry_Test1(), this.gettest(), null, "test1", null, 0, 1, dictorset_entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getdictorset_entry_Test2(), this.gettest(), null, "test2", null, 0, 1, dictorset_entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dictorsetmakerEClass, dictorsetmaker.class, "dictorsetmaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getdictorsetmaker_Entries(), this.getdictorset_entry(), null, "entries", null, 0, -1, dictorsetmaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getdictorsetmaker_Comp_for(), this.getcomp_for(), null, "comp_for", null, 0, 1, dictorsetmaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getdictorsetmaker_OptionalComma(), ecorePackage.getEBoolean(), "optionalComma", null, 0, 1, dictorsetmaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getdictorsetmaker_Tests(), this.gettest(), null, "tests", null, 0, -1, dictorsetmaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classdefEClass, classdef.class, "classdef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getclassdef_Name(), ecorePackage.getEString(), "name", null, 0, 1, classdef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getclassdef_RoundBrackets(), ecorePackage.getEBoolean(), "roundBrackets", null, 0, 1, classdef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getclassdef_Testlist(), this.gettestlist(), null, "testlist", null, 0, 1, classdef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getclassdef_Suite(), this.getsuite(), null, "suite", null, 0, 1, classdef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arglistEClass, arglist.class, "arglist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getarglist_Arguments(), this.getargument(), null, "arguments", null, 0, -1, arglist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getarglist_Argument(), this.getargument(), null, "argument", null, 0, 1, arglist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getarglist_OptionalComma(), ecorePackage.getEBoolean(), "optionalComma", null, 0, 1, arglist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getarglist_Dot1_test(), this.gettest(), null, "dot1_test", null, 0, 1, arglist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getarglist_Dot1_arguments(), this.getargument(), null, "dot1_arguments", null, 0, -1, arglist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getarglist_Dot2_test(), this.gettest(), null, "dot2_test", null, 0, 1, arglist.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentEClass, argument.class, "argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getargument_Test(), this.gettest(), null, "test", null, 0, 1, argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getargument_Comp_for(), this.getcomp_for(), null, "comp_for", null, 0, 1, argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getargument_Test2(), this.gettest(), null, "test2", null, 0, 1, argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(list_iterEClass, list_iter.class, "list_iter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getlist_iter_List_iter(), this.getlist_iter(), null, "list_iter", null, 0, 1, list_iter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(list_forEClass, list_for.class, "list_for", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getlist_for_Exprlist(), this.getexprlist(), null, "exprlist", null, 0, 1, list_for.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getlist_for_Testlist_safe(), this.gettestlist_safe(), null, "testlist_safe", null, 0, 1, list_for.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(list_ifEClass, list_if.class, "list_if", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getlist_if_Old_test(), this.gettest(), null, "old_test", null, 0, 1, list_if.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comp_iterEClass, comp_iter.class, "comp_iter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getcomp_iter_Comp_iter(), this.getcomp_iter(), null, "comp_iter", null, 0, 1, comp_iter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comp_forEClass, comp_for.class, "comp_for", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getcomp_for_Exprlist(), this.getexprlist(), null, "exprlist", null, 0, 1, comp_for.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getcomp_for_Or_test(), this.getor_test(), null, "or_test", null, 0, 1, comp_for.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comp_ifEClass, comp_if.class, "comp_if", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getcomp_if_Test(), this.gettest(), null, "test", null, 0, 1, comp_if.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(testlist1EClass, testlist1.class, "testlist1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(gettestlist1_Tests(), this.gettest(), null, "tests", null, 0, -1, testlist1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(yield_exprEClass, yield_expr.class, "yield_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getyield_expr_Testlist(), this.gettestlist(), null, "testlist", null, 0, 1, yield_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spellElementEClass, SpellElement.class, "SpellElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpellElement_NextStatements(), this.getSpellElement(), this.getSpellElement_PrevStatements(), "nextStatements", null, 0, -1, SpellElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpellElement_PrevStatements(), this.getSpellElement(), this.getSpellElement_NextStatements(), "prevStatements", null, 0, -1, SpellElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpellElement_AlternativeNextStatements(), this.getSpellElement(), this.getSpellElement_AlternativePrevStatements(), "alternativeNextStatements", null, 0, -1, SpellElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpellElement_AlternativePrevStatements(), this.getSpellElement(), this.getSpellElement_AlternativeNextStatements(), "alternativePrevStatements", null, 0, -1, SpellElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(spellElementEClass, this.getSpellElement(), "addControlFlowInformation", 0, -1, IS_UNIQUE, IS_ORDERED);

		addEOperation(spellElementEClass, null, "clearControlFlowInformation", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(functioncallEClass, functioncall.class, "functioncall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(python_inputEClass, python_input.class, "python_input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStep_Id(), this.getatom(), null, "id", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStep_Description(), this.getarith_expr(), null, "description", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verifyEClass, Verify.class, "Verify", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerify_Args(), this.getarglist(), null, "args", null, 0, 1, Verify.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sendEClass, Send.class, "Send", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSend_Command(), this.getarglist(), null, "command", null, 0, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSend_Verify(), this.getarglist(), null, "verify", null, 0, 1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSend_Arguments(), this.gettest(), null, "arguments", null, 0, -1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSend_Values(), this.gettest(), null, "values", null, 0, -1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSend_Args(), this.getarglist(), null, "args", null, 0, -1, Send.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(showTMEClass, ShowTM.class, "ShowTM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShowTM_Tms(), this.gettest(), null, "tms", null, 0, -1, ShowTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShowTM_Args(), this.getarglist(), null, "args", null, 0, -1, ShowTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getTMEClass, GetTM.class, "GetTM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetTM_Tm(), this.gettest(), null, "tm", null, 0, 1, GetTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetTM_Args(), this.getarglist(), null, "args", null, 0, -1, GetTM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assignment_stmtEClass, assignment_stmt.class, "assignment_stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getassignment_stmt_Assignments(), this.getyield_or_testlist(), null, "assignments", null, 0, -1, assignment_stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeLanguageConfigEClass, ChangeLanguageConfig.class, "ChangeLanguageConfig", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeLanguageConfig_Statement(), ecorePackage.getEString(), "statement", null, 0, 1, ChangeLanguageConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChangeLanguageConfig_Args(), this.getarglist(), null, "args", null, 0, 1, ChangeLanguageConfig.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setLimitsEClass, SetLimits.class, "SetLimits", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetLimits_Tm(), this.gettest(), null, "tm", null, 0, 1, SetLimits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSetLimits_Args(), this.getarglist(), null, "args", null, 0, -1, SetLimits.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buildTCEClass, BuildTC.class, "BuildTC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuildTC_Command(), this.getarglist(), null, "command", null, 0, 1, BuildTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildTC_Verify(), this.getarglist(), null, "verify", null, 0, 1, BuildTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildTC_Arguments(), this.gettest(), null, "arguments", null, 0, -1, BuildTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildTC_Values(), this.gettest(), null, "values", null, 0, -1, BuildTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuildTC_Args(), this.getarglist(), null, "args", null, 0, -1, BuildTC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gotoEClass, Goto.class, "Goto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGoto_Variable(), ecorePackage.getEString(), "variable", null, 0, 1, Goto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoto_Target(), ecorePackage.getEString(), "target", null, 0, 1, Goto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGoto_Expr(), this.gettest(), null, "expr", null, 0, 1, Goto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGoto_Hash(), ecorePackage.getEString(), "hash", null, 0, 1, Goto.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayStepEClass, DisplayStep.class, "DisplayStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisplayStep_Id(), this.getarith_expr(), null, "id", null, 0, 1, DisplayStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayStep_Description(), this.getarith_expr(), null, "description", null, 0, 1, DisplayStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SpellPackageImpl
