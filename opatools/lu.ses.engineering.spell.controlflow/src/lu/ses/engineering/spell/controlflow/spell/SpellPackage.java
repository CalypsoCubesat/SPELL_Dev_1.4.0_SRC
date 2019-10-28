/**
 */
package lu.ses.engineering.spell.controlflow.spell;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see lu.ses.engineering.spell.controlflow.spell.SpellFactory
 * @model kind="package"
 * @generated
 */
public interface SpellPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "spell";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://lu.ses.engineering.controlflow.grammar";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "spell";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpellPackage eINSTANCE = lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl.init();

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.SpellElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellElementImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getSpellElement()
	 * @generated
	 */
	int SPELL_ELEMENT = 83;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPELL_ELEMENT__NEXT_STATEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPELL_ELEMENT__PREV_STATEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS = 2;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS = 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPELL_ELEMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.python_inputImpl <em>python input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.python_inputImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getpython_input()
	 * @generated
	 */
	int PYTHON_INPUT = 85;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_INPUT__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_INPUT__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_INPUT__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_INPUT__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The number of structural features of the '<em>python input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PYTHON_INPUT_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.single_inputImpl <em>single input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.single_inputImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getsingle_input()
	 * @generated
	 */
	int SINGLE_INPUT = 0;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INPUT__NEXT_STATEMENTS = PYTHON_INPUT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INPUT__PREV_STATEMENTS = PYTHON_INPUT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INPUT__ALTERNATIVE_NEXT_STATEMENTS = PYTHON_INPUT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INPUT__ALTERNATIVE_PREV_STATEMENTS = PYTHON_INPUT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INPUT__STMT = PYTHON_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>single input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INPUT_FEATURE_COUNT = PYTHON_INPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.file_inputImpl <em>file input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.file_inputImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getfile_input()
	 * @generated
	 */
	int FILE_INPUT = 1;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__NEXT_STATEMENTS = PYTHON_INPUT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__PREV_STATEMENTS = PYTHON_INPUT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__ALTERNATIVE_NEXT_STATEMENTS = PYTHON_INPUT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__ALTERNATIVE_PREV_STATEMENTS = PYTHON_INPUT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT__STMTS = PYTHON_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>file input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_INPUT_FEATURE_COUNT = PYTHON_INPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.eval_inputImpl <em>eval input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.eval_inputImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#geteval_input()
	 * @generated
	 */
	int EVAL_INPUT = 2;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_INPUT__NEXT_STATEMENTS = PYTHON_INPUT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_INPUT__PREV_STATEMENTS = PYTHON_INPUT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_INPUT__ALTERNATIVE_NEXT_STATEMENTS = PYTHON_INPUT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_INPUT__ALTERNATIVE_PREV_STATEMENTS = PYTHON_INPUT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Testlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_INPUT__TESTLIST = PYTHON_INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>eval input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_INPUT_FEATURE_COUNT = PYTHON_INPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.decoratorImpl <em>decorator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.decoratorImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdecorator()
	 * @generated
	 */
	int DECORATOR = 3;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Dotted name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__DOTTED_NAME = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Round Bracket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__ROUND_BRACKET = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arglist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR__ARGLIST = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>decorator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATOR_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.decoratorsImpl <em>decorators</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.decoratorsImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdecorators()
	 * @generated
	 */
	int DECORATORS = 4;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATORS__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATORS__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATORS__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATORS__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATORS__DECORATORS = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>decorators</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATORS_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.stmtImpl <em>stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getstmt()
	 * @generated
	 */
	int STMT = 12;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STMT__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STMT__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STMT__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STMT__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The number of structural features of the '<em>stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STMT_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.compound_stmtImpl <em>compound stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.compound_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getcompound_stmt()
	 * @generated
	 */
	int COMPOUND_STMT = 35;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_STMT__NEXT_STATEMENTS = STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_STMT__PREV_STATEMENTS = STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_STMT__ALTERNATIVE_NEXT_STATEMENTS = STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_STMT__ALTERNATIVE_PREV_STATEMENTS = STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The number of structural features of the '<em>compound stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.decoratedImpl <em>decorated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.decoratedImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdecorated()
	 * @generated
	 */
	int DECORATED = 5;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATED__NEXT_STATEMENTS = COMPOUND_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATED__PREV_STATEMENTS = COMPOUND_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATED__ALTERNATIVE_NEXT_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATED__ALTERNATIVE_PREV_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Decorators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATED__DECORATORS = COMPOUND_STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATED__DEF = COMPOUND_STMT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>decorated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECORATED_FEATURE_COUNT = COMPOUND_STMT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.funcdefImpl <em>funcdef</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.funcdefImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getfuncdef()
	 * @generated
	 */
	int FUNCDEF = 6;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCDEF__NEXT_STATEMENTS = COMPOUND_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCDEF__PREV_STATEMENTS = COMPOUND_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCDEF__ALTERNATIVE_NEXT_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCDEF__ALTERNATIVE_PREV_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCDEF__NAME = COMPOUND_STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCDEF__PARAMETERS = COMPOUND_STMT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCDEF__SUITE = COMPOUND_STMT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>funcdef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCDEF_FEATURE_COUNT = COMPOUND_STMT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.parametersImpl <em>parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.parametersImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getparameters()
	 * @generated
	 */
	int PARAMETERS = 7;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Varargslist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS__VARARGSLIST = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETERS_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.varargslist_elementImpl <em>varargslist element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.varargslist_elementImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getvarargslist_element()
	 * @generated
	 */
	int VARARGSLIST_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST_ELEMENT__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST_ELEMENT__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST_ELEMENT__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Fpdef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST_ELEMENT__FPDEF = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST_ELEMENT__TEST = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>varargslist element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST_ELEMENT_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.varargslistImpl <em>varargslist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.varargslistImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getvarargslist()
	 * @generated
	 */
	int VARARGSLIST = 9;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Varargs1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST__VARARGS1 = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dot1 Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST__DOT1_NAME = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dot2 Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST__DOT2_NAME = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dot3 Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST__DOT3_NAME = SPELL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Vararg2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST__VARARG2 = SPELL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Varargs3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST__VARARGS3 = SPELL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST__ADDITIONAL_COMMA = SPELL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>varargslist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARARGSLIST_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.fpdefImpl <em>fpdef</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.fpdefImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getfpdef()
	 * @generated
	 */
	int FPDEF = 10;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPDEF__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPDEF__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPDEF__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPDEF__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPDEF__NAME = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fplist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPDEF__FPLIST = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>fpdef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPDEF_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.fplistImpl <em>fplist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.fplistImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getfplist()
	 * @generated
	 */
	int FPLIST = 11;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPLIST__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPLIST__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPLIST__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPLIST__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Def1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPLIST__DEF1 = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPLIST__DEFINITIONS = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional Semicolon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPLIST__OPTIONAL_SEMICOLON = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>fplist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPLIST_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.simple_stmtImpl <em>simple stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.simple_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getsimple_stmt()
	 * @generated
	 */
	int SIMPLE_STMT = 13;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STMT__NEXT_STATEMENTS = STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STMT__PREV_STATEMENTS = STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STMT__ALTERNATIVE_NEXT_STATEMENTS = STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STMT__ALTERNATIVE_PREV_STATEMENTS = STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STMT__STMTS = STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STMT__STMT = STMT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STMT__ADDITIONAL_COMMA = STMT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>simple stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_STMT_FEATURE_COUNT = STMT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.small_stmtImpl <em>small stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.small_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getsmall_stmt()
	 * @generated
	 */
	int SMALL_STMT = 14;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STMT__NEXT_STATEMENTS = SIMPLE_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STMT__PREV_STATEMENTS = SIMPLE_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STMT__ALTERNATIVE_NEXT_STATEMENTS = SIMPLE_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STMT__ALTERNATIVE_PREV_STATEMENTS = SIMPLE_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STMT__STMTS = SIMPLE_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STMT__STMT = SIMPLE_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STMT__ADDITIONAL_COMMA = SIMPLE_STMT__ADDITIONAL_COMMA;

	/**
	 * The number of structural features of the '<em>small stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_STMT_FEATURE_COUNT = SIMPLE_STMT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.expr_stmtImpl <em>expr stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.expr_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getexpr_stmt()
	 * @generated
	 */
	int EXPR_STMT = 15;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_STMT__NEXT_STATEMENTS = SMALL_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_STMT__PREV_STATEMENTS = SMALL_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_STMT__ALTERNATIVE_NEXT_STATEMENTS = SMALL_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_STMT__ALTERNATIVE_PREV_STATEMENTS = SMALL_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_STMT__STMTS = SMALL_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_STMT__STMT = SMALL_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_STMT__ADDITIONAL_COMMA = SMALL_STMT__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_STMT__LEFT = SMALL_STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_STMT__SYMBOL = SMALL_STMT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_STMT__RIGHT = SMALL_STMT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>expr stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_STMT_FEATURE_COUNT = SMALL_STMT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.yield_or_testlistImpl <em>yield or testlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.yield_or_testlistImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getyield_or_testlist()
	 * @generated
	 */
	int YIELD_OR_TESTLIST = 16;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_OR_TESTLIST__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_OR_TESTLIST__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_OR_TESTLIST__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_OR_TESTLIST__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The number of structural features of the '<em>yield or testlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_OR_TESTLIST_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.del_stmtImpl <em>del stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.del_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdel_stmt()
	 * @generated
	 */
	int DEL_STMT = 17;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_STMT__NEXT_STATEMENTS = SMALL_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_STMT__PREV_STATEMENTS = SMALL_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_STMT__ALTERNATIVE_NEXT_STATEMENTS = SMALL_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_STMT__ALTERNATIVE_PREV_STATEMENTS = SMALL_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_STMT__STMTS = SMALL_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_STMT__STMT = SMALL_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_STMT__ADDITIONAL_COMMA = SMALL_STMT__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Exprlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_STMT__EXPRLIST = SMALL_STMT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>del stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_STMT_FEATURE_COUNT = SMALL_STMT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.pass_stmtImpl <em>pass stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.pass_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getpass_stmt()
	 * @generated
	 */
	int PASS_STMT = 18;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_STMT__NEXT_STATEMENTS = SMALL_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_STMT__PREV_STATEMENTS = SMALL_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_STMT__ALTERNATIVE_NEXT_STATEMENTS = SMALL_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_STMT__ALTERNATIVE_PREV_STATEMENTS = SMALL_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_STMT__STMTS = SMALL_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_STMT__STMT = SMALL_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_STMT__ADDITIONAL_COMMA = SMALL_STMT__ADDITIONAL_COMMA;

	/**
	 * The number of structural features of the '<em>pass stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASS_STMT_FEATURE_COUNT = SMALL_STMT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.flow_stmtImpl <em>flow stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.flow_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getflow_stmt()
	 * @generated
	 */
	int FLOW_STMT = 19;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STMT__NEXT_STATEMENTS = SMALL_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STMT__PREV_STATEMENTS = SMALL_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STMT__ALTERNATIVE_NEXT_STATEMENTS = SMALL_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STMT__ALTERNATIVE_PREV_STATEMENTS = SMALL_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STMT__STMTS = SMALL_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STMT__STMT = SMALL_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STMT__ADDITIONAL_COMMA = SMALL_STMT__ADDITIONAL_COMMA;

	/**
	 * The number of structural features of the '<em>flow stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_STMT_FEATURE_COUNT = SMALL_STMT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.break_stmtImpl <em>break stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.break_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getbreak_stmt()
	 * @generated
	 */
	int BREAK_STMT = 20;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STMT__NEXT_STATEMENTS = FLOW_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STMT__PREV_STATEMENTS = FLOW_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STMT__ALTERNATIVE_NEXT_STATEMENTS = FLOW_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STMT__ALTERNATIVE_PREV_STATEMENTS = FLOW_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STMT__STMTS = FLOW_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STMT__STMT = FLOW_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STMT__ADDITIONAL_COMMA = FLOW_STMT__ADDITIONAL_COMMA;

	/**
	 * The number of structural features of the '<em>break stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BREAK_STMT_FEATURE_COUNT = FLOW_STMT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.continue_stmtImpl <em>continue stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.continue_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getcontinue_stmt()
	 * @generated
	 */
	int CONTINUE_STMT = 21;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STMT__NEXT_STATEMENTS = FLOW_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STMT__PREV_STATEMENTS = FLOW_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STMT__ALTERNATIVE_NEXT_STATEMENTS = FLOW_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STMT__ALTERNATIVE_PREV_STATEMENTS = FLOW_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STMT__STMTS = FLOW_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STMT__STMT = FLOW_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STMT__ADDITIONAL_COMMA = FLOW_STMT__ADDITIONAL_COMMA;

	/**
	 * The number of structural features of the '<em>continue stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTINUE_STMT_FEATURE_COUNT = FLOW_STMT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.return_stmtImpl <em>return stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.return_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getreturn_stmt()
	 * @generated
	 */
	int RETURN_STMT = 22;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STMT__NEXT_STATEMENTS = FLOW_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STMT__PREV_STATEMENTS = FLOW_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STMT__ALTERNATIVE_NEXT_STATEMENTS = FLOW_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STMT__ALTERNATIVE_PREV_STATEMENTS = FLOW_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STMT__STMTS = FLOW_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STMT__STMT = FLOW_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STMT__ADDITIONAL_COMMA = FLOW_STMT__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Testlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STMT__TESTLIST = FLOW_STMT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>return stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_STMT_FEATURE_COUNT = FLOW_STMT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.yield_stmtImpl <em>yield stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.yield_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getyield_stmt()
	 * @generated
	 */
	int YIELD_STMT = 23;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_STMT__NEXT_STATEMENTS = FLOW_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_STMT__PREV_STATEMENTS = FLOW_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_STMT__ALTERNATIVE_NEXT_STATEMENTS = FLOW_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_STMT__ALTERNATIVE_PREV_STATEMENTS = FLOW_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_STMT__STMTS = FLOW_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_STMT__STMT = FLOW_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_STMT__ADDITIONAL_COMMA = FLOW_STMT__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Yield expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_STMT__YIELD_EXPR = FLOW_STMT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>yield stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_STMT_FEATURE_COUNT = FLOW_STMT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.raise_stmtImpl <em>raise stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.raise_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getraise_stmt()
	 * @generated
	 */
	int RAISE_STMT = 24;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_STMT__NEXT_STATEMENTS = FLOW_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_STMT__PREV_STATEMENTS = FLOW_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_STMT__ALTERNATIVE_NEXT_STATEMENTS = FLOW_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_STMT__ALTERNATIVE_PREV_STATEMENTS = FLOW_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_STMT__STMTS = FLOW_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_STMT__STMT = FLOW_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_STMT__ADDITIONAL_COMMA = FLOW_STMT__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_STMT__TESTS = FLOW_STMT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>raise stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_STMT_FEATURE_COUNT = FLOW_STMT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.import_stmtImpl <em>import stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.import_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getimport_stmt()
	 * @generated
	 */
	int IMPORT_STMT = 25;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STMT__NEXT_STATEMENTS = SMALL_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STMT__PREV_STATEMENTS = SMALL_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STMT__ALTERNATIVE_NEXT_STATEMENTS = SMALL_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STMT__ALTERNATIVE_PREV_STATEMENTS = SMALL_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STMT__STMTS = SMALL_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STMT__STMT = SMALL_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STMT__ADDITIONAL_COMMA = SMALL_STMT__ADDITIONAL_COMMA;

	/**
	 * The number of structural features of the '<em>import stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_STMT_FEATURE_COUNT = SMALL_STMT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.import_nameImpl <em>import name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.import_nameImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getimport_name()
	 * @generated
	 */
	int IMPORT_NAME = 26;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_NAME__NEXT_STATEMENTS = IMPORT_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_NAME__PREV_STATEMENTS = IMPORT_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_NAME__ALTERNATIVE_NEXT_STATEMENTS = IMPORT_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_NAME__ALTERNATIVE_PREV_STATEMENTS = IMPORT_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_NAME__STMTS = IMPORT_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_NAME__STMT = IMPORT_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_NAME__ADDITIONAL_COMMA = IMPORT_STMT__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Dotted as names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_NAME__DOTTED_AS_NAMES = IMPORT_STMT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>import name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_NAME_FEATURE_COUNT = IMPORT_STMT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.import_fromImpl <em>import from</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.import_fromImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getimport_from()
	 * @generated
	 */
	int IMPORT_FROM = 27;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FROM__NEXT_STATEMENTS = IMPORT_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FROM__PREV_STATEMENTS = IMPORT_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FROM__ALTERNATIVE_NEXT_STATEMENTS = IMPORT_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FROM__ALTERNATIVE_PREV_STATEMENTS = IMPORT_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FROM__STMTS = IMPORT_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FROM__STMT = IMPORT_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FROM__ADDITIONAL_COMMA = IMPORT_STMT__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Dots</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FROM__DOTS = IMPORT_STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dotted name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FROM__DOTTED_NAME = IMPORT_STMT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dots2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FROM__DOTS2 = IMPORT_STMT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Round Bracket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FROM__ROUND_BRACKET = IMPORT_STMT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Import as names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FROM__IMPORT_AS_NAMES = IMPORT_STMT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>import from</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FROM_FEATURE_COUNT = IMPORT_STMT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.import_as_nameImpl <em>import as name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.import_as_nameImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getimport_as_name()
	 * @generated
	 */
	int IMPORT_AS_NAME = 28;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AS_NAME__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AS_NAME__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AS_NAME__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AS_NAME__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AS_NAME__NAME = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AS_NAME__IDENTIFIER = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>import as name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AS_NAME_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.dotted_as_nameImpl <em>dotted as name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.dotted_as_nameImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdotted_as_name()
	 * @generated
	 */
	int DOTTED_AS_NAME = 29;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOTTED_AS_NAME__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOTTED_AS_NAME__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOTTED_AS_NAME__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOTTED_AS_NAME__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOTTED_AS_NAME__NAME = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOTTED_AS_NAME__IDENTIFIER = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>dotted as name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOTTED_AS_NAME_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.import_as_namesImpl <em>import as names</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.import_as_namesImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getimport_as_names()
	 * @generated
	 */
	int IMPORT_AS_NAMES = 30;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AS_NAMES__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AS_NAMES__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AS_NAMES__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AS_NAMES__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AS_NAMES__IMPORTS = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AS_NAMES__OPTIONAL_COMMA = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>import as names</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_AS_NAMES_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.dotted_as_namesImpl <em>dotted as names</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.dotted_as_namesImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdotted_as_names()
	 * @generated
	 */
	int DOTTED_AS_NAMES = 31;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOTTED_AS_NAMES__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOTTED_AS_NAMES__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOTTED_AS_NAMES__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOTTED_AS_NAMES__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Dotted names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOTTED_AS_NAMES__DOTTED_NAMES = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>dotted as names</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOTTED_AS_NAMES_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.global_stmtImpl <em>global stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.global_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getglobal_stmt()
	 * @generated
	 */
	int GLOBAL_STMT = 32;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_STMT__NEXT_STATEMENTS = SMALL_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_STMT__PREV_STATEMENTS = SMALL_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_STMT__ALTERNATIVE_NEXT_STATEMENTS = SMALL_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_STMT__ALTERNATIVE_PREV_STATEMENTS = SMALL_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_STMT__STMTS = SMALL_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_STMT__STMT = SMALL_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_STMT__ADDITIONAL_COMMA = SMALL_STMT__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Globals</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_STMT__GLOBALS = SMALL_STMT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>global stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_STMT_FEATURE_COUNT = SMALL_STMT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.exec_stmtImpl <em>exec stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.exec_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getexec_stmt()
	 * @generated
	 */
	int EXEC_STMT = 33;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_STMT__NEXT_STATEMENTS = SMALL_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_STMT__PREV_STATEMENTS = SMALL_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_STMT__ALTERNATIVE_NEXT_STATEMENTS = SMALL_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_STMT__ALTERNATIVE_PREV_STATEMENTS = SMALL_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_STMT__STMTS = SMALL_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_STMT__STMT = SMALL_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_STMT__ADDITIONAL_COMMA = SMALL_STMT__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_STMT__EXPR = SMALL_STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_STMT__TESTS = SMALL_STMT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>exec stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXEC_STMT_FEATURE_COUNT = SMALL_STMT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.assert_stmtImpl <em>assert stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.assert_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getassert_stmt()
	 * @generated
	 */
	int ASSERT_STMT = 34;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STMT__NEXT_STATEMENTS = SMALL_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STMT__PREV_STATEMENTS = SMALL_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STMT__ALTERNATIVE_NEXT_STATEMENTS = SMALL_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STMT__ALTERNATIVE_PREV_STATEMENTS = SMALL_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STMT__STMTS = SMALL_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STMT__STMT = SMALL_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STMT__ADDITIONAL_COMMA = SMALL_STMT__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Assers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STMT__ASSERS = SMALL_STMT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>assert stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERT_STMT_FEATURE_COUNT = SMALL_STMT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.else_if_stmtImpl <em>else if stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.else_if_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getelse_if_stmt()
	 * @generated
	 */
	int ELSE_IF_STMT = 36;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_STMT__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_STMT__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_STMT__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_STMT__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_STMT__TEST = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_STMT__SUITE = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>else if stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELSE_IF_STMT_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.if_stmtImpl <em>if stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.if_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getif_stmt()
	 * @generated
	 */
	int IF_STMT = 37;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT__NEXT_STATEMENTS = COMPOUND_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT__PREV_STATEMENTS = COMPOUND_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT__ALTERNATIVE_NEXT_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT__ALTERNATIVE_PREV_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT__TEST = COMPOUND_STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT__SUITE = COMPOUND_STMT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else if stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT__ELSE_IF_STMTS = COMPOUND_STMT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT__ELSE = COMPOUND_STMT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>if stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_STMT_FEATURE_COUNT = COMPOUND_STMT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.while_stmtImpl <em>while stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.while_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getwhile_stmt()
	 * @generated
	 */
	int WHILE_STMT = 38;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STMT__NEXT_STATEMENTS = COMPOUND_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STMT__PREV_STATEMENTS = COMPOUND_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STMT__ALTERNATIVE_NEXT_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STMT__ALTERNATIVE_PREV_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STMT__TEST = COMPOUND_STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STMT__SUITE = COMPOUND_STMT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STMT__ELSE = COMPOUND_STMT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>while stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_STMT_FEATURE_COUNT = COMPOUND_STMT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.for_stmtImpl <em>for stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.for_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getfor_stmt()
	 * @generated
	 */
	int FOR_STMT = 39;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STMT__NEXT_STATEMENTS = COMPOUND_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STMT__PREV_STATEMENTS = COMPOUND_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STMT__ALTERNATIVE_NEXT_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STMT__ALTERNATIVE_PREV_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Exprlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STMT__EXPRLIST = COMPOUND_STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Testlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STMT__TESTLIST = COMPOUND_STMT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STMT__SUITE = COMPOUND_STMT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STMT__ELSE = COMPOUND_STMT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>for stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_STMT_FEATURE_COUNT = COMPOUND_STMT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.try_stmtImpl <em>try stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.try_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#gettry_stmt()
	 * @generated
	 */
	int TRY_STMT = 40;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STMT__NEXT_STATEMENTS = COMPOUND_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STMT__PREV_STATEMENTS = COMPOUND_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STMT__ALTERNATIVE_NEXT_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STMT__ALTERNATIVE_PREV_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STMT__SUITE = COMPOUND_STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Except clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STMT__EXCEPT_CLAUSE = COMPOUND_STMT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STMT__ELSE = COMPOUND_STMT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Finally</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STMT__FINALLY = COMPOUND_STMT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>try stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_STMT_FEATURE_COUNT = COMPOUND_STMT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.with_stmtImpl <em>with stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.with_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getwith_stmt()
	 * @generated
	 */
	int WITH_STMT = 41;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_STMT__NEXT_STATEMENTS = COMPOUND_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_STMT__PREV_STATEMENTS = COMPOUND_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_STMT__ALTERNATIVE_NEXT_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_STMT__ALTERNATIVE_PREV_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>With item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_STMT__WITH_ITEM = COMPOUND_STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_STMT__SUITE = COMPOUND_STMT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>with stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_STMT_FEATURE_COUNT = COMPOUND_STMT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.with_itemImpl <em>with item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.with_itemImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getwith_item()
	 * @generated
	 */
	int WITH_ITEM = 42;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_ITEM__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_ITEM__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_ITEM__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_ITEM__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_ITEM__TEST = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_ITEM__EXPR = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>with item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WITH_ITEM_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.except_clauseImpl <em>except clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.except_clauseImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getexcept_clause()
	 * @generated
	 */
	int EXCEPT_CLAUSE = 43;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT_CLAUSE__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT_CLAUSE__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT_CLAUSE__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT_CLAUSE__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT_CLAUSE__TEST = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT_CLAUSE__SIGN = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT_CLAUSE__NEXT_TEST = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT_CLAUSE__SUITE = SPELL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>except clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCEPT_CLAUSE_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.suiteImpl <em>suite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.suiteImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getsuite()
	 * @generated
	 */
	int SUITE = 44;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE__STMTS = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>suite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUITE_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.testlist_safeImpl <em>testlist safe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.testlist_safeImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#gettestlist_safe()
	 * @generated
	 */
	int TESTLIST_SAFE = 45;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_SAFE__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_SAFE__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_SAFE__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_SAFE__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Old test</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_SAFE__OLD_TEST = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional Coma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_SAFE__OPTIONAL_COMA = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>testlist safe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_SAFE_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.testImpl <em>test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.testImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#gettest()
	 * @generated
	 */
	int TEST = 46;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.or_testImpl <em>or test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.or_testImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getor_test()
	 * @generated
	 */
	int OR_TEST = 47;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.and_testImpl <em>and test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.and_testImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getand_test()
	 * @generated
	 */
	int AND_TEST = 48;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.not_testImpl <em>not test</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.not_testImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getnot_test()
	 * @generated
	 */
	int NOT_TEST = 49;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.comparisonImpl <em>comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.comparisonImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getcomparison()
	 * @generated
	 */
	int COMPARISON = 50;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.exprImpl <em>expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.exprImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getexpr()
	 * @generated
	 */
	int EXPR = 51;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.xor_exprImpl <em>xor expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.xor_exprImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getxor_expr()
	 * @generated
	 */
	int XOR_EXPR = 52;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.and_exprImpl <em>and expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.and_exprImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getand_expr()
	 * @generated
	 */
	int AND_EXPR = 53;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.shift_exprImpl <em>shift expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.shift_exprImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getshift_expr()
	 * @generated
	 */
	int SHIFT_EXPR = 54;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.arith_exprImpl <em>arith expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.arith_exprImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getarith_expr()
	 * @generated
	 */
	int ARITH_EXPR = 55;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.termImpl <em>term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.termImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getterm()
	 * @generated
	 */
	int TERM = 56;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.factorImpl <em>factor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.factorImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getfactor()
	 * @generated
	 */
	int FACTOR = 57;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.powerImpl <em>power</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.powerImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getpower()
	 * @generated
	 */
	int POWER = 58;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.yield_or_testlist_compImpl <em>yield or testlist comp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.yield_or_testlist_compImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getyield_or_testlist_comp()
	 * @generated
	 */
	int YIELD_OR_TESTLIST_COMP = 59;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.atomImpl <em>atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.atomImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getatom()
	 * @generated
	 */
	int ATOM = 60;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.listmakerImpl <em>listmaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.listmakerImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getlistmaker()
	 * @generated
	 */
	int LISTMAKER = 61;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.testlist_compImpl <em>testlist comp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.testlist_compImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#gettestlist_comp()
	 * @generated
	 */
	int TESTLIST_COMP = 62;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.lambdefImpl <em>lambdef</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.lambdefImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getlambdef()
	 * @generated
	 */
	int LAMBDEF = 63;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.trailerImpl <em>trailer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.trailerImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#gettrailer()
	 * @generated
	 */
	int TRAILER = 64;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.subscriptlistImpl <em>subscriptlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.subscriptlistImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getsubscriptlist()
	 * @generated
	 */
	int SUBSCRIPTLIST = 65;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.subscriptImpl <em>subscript</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.subscriptImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getsubscript()
	 * @generated
	 */
	int SUBSCRIPT = 66;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.sliceopImpl <em>sliceop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.sliceopImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getsliceop()
	 * @generated
	 */
	int SLICEOP = 67;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.exprlistImpl <em>exprlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.exprlistImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getexprlist()
	 * @generated
	 */
	int EXPRLIST = 68;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.testlistImpl <em>testlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.testlistImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#gettestlist()
	 * @generated
	 */
	int TESTLIST = 69;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST__NEXT_STATEMENTS = EXPR_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST__PREV_STATEMENTS = EXPR_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST__ALTERNATIVE_NEXT_STATEMENTS = EXPR_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST__ALTERNATIVE_PREV_STATEMENTS = EXPR_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST__STMTS = EXPR_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST__STMT = EXPR_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST__ADDITIONAL_COMMA = EXPR_STMT__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST__LEFT = EXPR_STMT__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST__SYMBOL = EXPR_STMT__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST__RIGHT = EXPR_STMT__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST__TESTS = EXPR_STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST__OPTIONAL_COMMA = EXPR_STMT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>testlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_FEATURE_COUNT = EXPR_STMT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__NEXT_STATEMENTS = TESTLIST__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__PREV_STATEMENTS = TESTLIST__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ALTERNATIVE_NEXT_STATEMENTS = TESTLIST__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ALTERNATIVE_PREV_STATEMENTS = TESTLIST__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__STMTS = TESTLIST__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__STMT = TESTLIST__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__ADDITIONAL_COMMA = TESTLIST__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__LEFT = TESTLIST__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__SYMBOL = TESTLIST__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__RIGHT = TESTLIST__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__TESTS = TESTLIST__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__OPTIONAL_COMMA = TESTLIST__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__TEST = TESTLIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__COMP_FOR = TESTLIST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__TEST2 = TESTLIST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__IF_TEST = TESTLIST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST__IF_ELSE_TEST = TESTLIST_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_FEATURE_COUNT = TESTLIST_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__NEXT_STATEMENTS = TEST__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__PREV_STATEMENTS = TEST__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__ALTERNATIVE_NEXT_STATEMENTS = TEST__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__ALTERNATIVE_PREV_STATEMENTS = TEST__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__STMTS = TEST__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__STMT = TEST__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__ADDITIONAL_COMMA = TEST__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__LEFT = TEST__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__SYMBOL = TEST__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__RIGHT = TEST__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__TESTS = TEST__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__OPTIONAL_COMMA = TEST__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__TEST = TEST__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__COMP_FOR = TEST__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__TEST2 = TEST__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__IF_TEST = TEST__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__IF_ELSE_TEST = TEST__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST__SIGN = TEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>or test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_TEST_FEATURE_COUNT = TEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__NEXT_STATEMENTS = OR_TEST__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__PREV_STATEMENTS = OR_TEST__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__ALTERNATIVE_NEXT_STATEMENTS = OR_TEST__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__ALTERNATIVE_PREV_STATEMENTS = OR_TEST__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__STMTS = OR_TEST__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__STMT = OR_TEST__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__ADDITIONAL_COMMA = OR_TEST__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__LEFT = OR_TEST__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__SYMBOL = OR_TEST__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__RIGHT = OR_TEST__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__TESTS = OR_TEST__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__OPTIONAL_COMMA = OR_TEST__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__TEST = OR_TEST__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__COMP_FOR = OR_TEST__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__TEST2 = OR_TEST__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__IF_TEST = OR_TEST__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__IF_ELSE_TEST = OR_TEST__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST__SIGN = OR_TEST__SIGN;

	/**
	 * The number of structural features of the '<em>and test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_TEST_FEATURE_COUNT = OR_TEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__NEXT_STATEMENTS = AND_TEST__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__PREV_STATEMENTS = AND_TEST__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__ALTERNATIVE_NEXT_STATEMENTS = AND_TEST__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__ALTERNATIVE_PREV_STATEMENTS = AND_TEST__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__STMTS = AND_TEST__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__STMT = AND_TEST__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__ADDITIONAL_COMMA = AND_TEST__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__LEFT = AND_TEST__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__SYMBOL = AND_TEST__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__RIGHT = AND_TEST__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__TESTS = AND_TEST__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__OPTIONAL_COMMA = AND_TEST__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__TEST = AND_TEST__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__COMP_FOR = AND_TEST__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__TEST2 = AND_TEST__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__IF_TEST = AND_TEST__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__IF_ELSE_TEST = AND_TEST__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__SIGN = AND_TEST__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__NOT = AND_TEST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST__COMPARISON = AND_TEST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>not test</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_TEST_FEATURE_COUNT = AND_TEST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__NEXT_STATEMENTS = NOT_TEST__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__PREV_STATEMENTS = NOT_TEST__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__ALTERNATIVE_NEXT_STATEMENTS = NOT_TEST__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__ALTERNATIVE_PREV_STATEMENTS = NOT_TEST__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__STMTS = NOT_TEST__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__STMT = NOT_TEST__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__ADDITIONAL_COMMA = NOT_TEST__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__LEFT = NOT_TEST__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__SYMBOL = NOT_TEST__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__RIGHT = NOT_TEST__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__TESTS = NOT_TEST__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__OPTIONAL_COMMA = NOT_TEST__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__TEST = NOT_TEST__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__COMP_FOR = NOT_TEST__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__TEST2 = NOT_TEST__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__IF_TEST = NOT_TEST__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__IF_ELSE_TEST = NOT_TEST__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__SIGN = NOT_TEST__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__NOT = NOT_TEST__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__COMPARISON = NOT_TEST__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__COMP_OP = NOT_TEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = NOT_TEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__NEXT_STATEMENTS = COMPARISON__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__PREV_STATEMENTS = COMPARISON__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__ALTERNATIVE_NEXT_STATEMENTS = COMPARISON__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__ALTERNATIVE_PREV_STATEMENTS = COMPARISON__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__STMTS = COMPARISON__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__STMT = COMPARISON__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__ADDITIONAL_COMMA = COMPARISON__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__LEFT = COMPARISON__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__SYMBOL = COMPARISON__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__RIGHT = COMPARISON__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__TESTS = COMPARISON__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__OPTIONAL_COMMA = COMPARISON__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__TEST = COMPARISON__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__COMP_FOR = COMPARISON__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__TEST2 = COMPARISON__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__IF_TEST = COMPARISON__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__IF_ELSE_TEST = COMPARISON__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__SIGN = COMPARISON__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__NOT = COMPARISON__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__COMPARISON = COMPARISON__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR__COMP_OP = COMPARISON__COMP_OP;

	/**
	 * The number of structural features of the '<em>expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPR_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__NEXT_STATEMENTS = EXPR__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__PREV_STATEMENTS = EXPR__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__ALTERNATIVE_NEXT_STATEMENTS = EXPR__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__ALTERNATIVE_PREV_STATEMENTS = EXPR__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__STMTS = EXPR__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__STMT = EXPR__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__ADDITIONAL_COMMA = EXPR__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__LEFT = EXPR__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__SYMBOL = EXPR__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__RIGHT = EXPR__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__TESTS = EXPR__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__OPTIONAL_COMMA = EXPR__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__TEST = EXPR__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__COMP_FOR = EXPR__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__TEST2 = EXPR__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__IF_TEST = EXPR__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__IF_ELSE_TEST = EXPR__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__SIGN = EXPR__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__NOT = EXPR__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__COMPARISON = EXPR__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR__COMP_OP = EXPR__COMP_OP;

	/**
	 * The number of structural features of the '<em>xor expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XOR_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__NEXT_STATEMENTS = XOR_EXPR__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__PREV_STATEMENTS = XOR_EXPR__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__ALTERNATIVE_NEXT_STATEMENTS = XOR_EXPR__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__ALTERNATIVE_PREV_STATEMENTS = XOR_EXPR__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__STMTS = XOR_EXPR__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__STMT = XOR_EXPR__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__ADDITIONAL_COMMA = XOR_EXPR__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__LEFT = XOR_EXPR__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__SYMBOL = XOR_EXPR__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__RIGHT = XOR_EXPR__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__TESTS = XOR_EXPR__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__OPTIONAL_COMMA = XOR_EXPR__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__TEST = XOR_EXPR__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__COMP_FOR = XOR_EXPR__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__TEST2 = XOR_EXPR__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__IF_TEST = XOR_EXPR__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__IF_ELSE_TEST = XOR_EXPR__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__SIGN = XOR_EXPR__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__NOT = XOR_EXPR__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__COMPARISON = XOR_EXPR__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR__COMP_OP = XOR_EXPR__COMP_OP;

	/**
	 * The number of structural features of the '<em>and expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_EXPR_FEATURE_COUNT = XOR_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__NEXT_STATEMENTS = AND_EXPR__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__PREV_STATEMENTS = AND_EXPR__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__ALTERNATIVE_NEXT_STATEMENTS = AND_EXPR__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__ALTERNATIVE_PREV_STATEMENTS = AND_EXPR__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__STMTS = AND_EXPR__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__STMT = AND_EXPR__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__ADDITIONAL_COMMA = AND_EXPR__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__LEFT = AND_EXPR__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__SYMBOL = AND_EXPR__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__RIGHT = AND_EXPR__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__TESTS = AND_EXPR__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__OPTIONAL_COMMA = AND_EXPR__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__TEST = AND_EXPR__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__COMP_FOR = AND_EXPR__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__TEST2 = AND_EXPR__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__IF_TEST = AND_EXPR__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__IF_ELSE_TEST = AND_EXPR__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__SIGN = AND_EXPR__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__NOT = AND_EXPR__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__COMPARISON = AND_EXPR__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR__COMP_OP = AND_EXPR__COMP_OP;

	/**
	 * The number of structural features of the '<em>shift expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPR_FEATURE_COUNT = AND_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__NEXT_STATEMENTS = SHIFT_EXPR__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__PREV_STATEMENTS = SHIFT_EXPR__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__ALTERNATIVE_NEXT_STATEMENTS = SHIFT_EXPR__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__ALTERNATIVE_PREV_STATEMENTS = SHIFT_EXPR__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__STMTS = SHIFT_EXPR__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__STMT = SHIFT_EXPR__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__ADDITIONAL_COMMA = SHIFT_EXPR__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__LEFT = SHIFT_EXPR__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__SYMBOL = SHIFT_EXPR__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__RIGHT = SHIFT_EXPR__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__TESTS = SHIFT_EXPR__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__OPTIONAL_COMMA = SHIFT_EXPR__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__TEST = SHIFT_EXPR__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__COMP_FOR = SHIFT_EXPR__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__TEST2 = SHIFT_EXPR__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__IF_TEST = SHIFT_EXPR__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__IF_ELSE_TEST = SHIFT_EXPR__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__SIGN = SHIFT_EXPR__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__NOT = SHIFT_EXPR__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__COMPARISON = SHIFT_EXPR__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR__COMP_OP = SHIFT_EXPR__COMP_OP;

	/**
	 * The number of structural features of the '<em>arith expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITH_EXPR_FEATURE_COUNT = SHIFT_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NEXT_STATEMENTS = ARITH_EXPR__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__PREV_STATEMENTS = ARITH_EXPR__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__ALTERNATIVE_NEXT_STATEMENTS = ARITH_EXPR__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__ALTERNATIVE_PREV_STATEMENTS = ARITH_EXPR__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__STMTS = ARITH_EXPR__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__STMT = ARITH_EXPR__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__ADDITIONAL_COMMA = ARITH_EXPR__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__LEFT = ARITH_EXPR__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__SYMBOL = ARITH_EXPR__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__RIGHT = ARITH_EXPR__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__TESTS = ARITH_EXPR__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__OPTIONAL_COMMA = ARITH_EXPR__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__TEST = ARITH_EXPR__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__COMP_FOR = ARITH_EXPR__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__TEST2 = ARITH_EXPR__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__IF_TEST = ARITH_EXPR__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__IF_ELSE_TEST = ARITH_EXPR__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__SIGN = ARITH_EXPR__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__NOT = ARITH_EXPR__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__COMPARISON = ARITH_EXPR__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__COMP_OP = ARITH_EXPR__COMP_OP;

	/**
	 * The number of structural features of the '<em>term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = ARITH_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__NEXT_STATEMENTS = TERM__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__PREV_STATEMENTS = TERM__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__ALTERNATIVE_NEXT_STATEMENTS = TERM__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__ALTERNATIVE_PREV_STATEMENTS = TERM__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__STMTS = TERM__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__STMT = TERM__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__ADDITIONAL_COMMA = TERM__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__LEFT = TERM__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__SYMBOL = TERM__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__RIGHT = TERM__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__TESTS = TERM__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__OPTIONAL_COMMA = TERM__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__TEST = TERM__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__COMP_FOR = TERM__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__TEST2 = TERM__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__IF_TEST = TERM__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__IF_ELSE_TEST = TERM__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__SIGN = TERM__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__NOT = TERM__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__COMPARISON = TERM__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__COMP_OP = TERM__COMP_OP;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR__FACTOR = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>factor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACTOR_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__NEXT_STATEMENTS = FACTOR__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__PREV_STATEMENTS = FACTOR__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__ALTERNATIVE_NEXT_STATEMENTS = FACTOR__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__ALTERNATIVE_PREV_STATEMENTS = FACTOR__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__STMTS = FACTOR__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__STMT = FACTOR__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__ADDITIONAL_COMMA = FACTOR__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__LEFT = FACTOR__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__SYMBOL = FACTOR__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__RIGHT = FACTOR__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__TESTS = FACTOR__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__OPTIONAL_COMMA = FACTOR__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__TEST = FACTOR__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__COMP_FOR = FACTOR__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__TEST2 = FACTOR__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__IF_TEST = FACTOR__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__IF_ELSE_TEST = FACTOR__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__SIGN = FACTOR__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__NOT = FACTOR__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__COMPARISON = FACTOR__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__COMP_OP = FACTOR__COMP_OP;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__FACTOR = FACTOR__FACTOR;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__ATOM = FACTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trailer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER__TRAILER = FACTOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>power</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_FEATURE_COUNT = FACTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_OR_TESTLIST_COMP__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_OR_TESTLIST_COMP__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_OR_TESTLIST_COMP__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_OR_TESTLIST_COMP__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The number of structural features of the '<em>yield or testlist comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_OR_TESTLIST_COMP_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__NEXT_STATEMENTS = POWER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__PREV_STATEMENTS = POWER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__ALTERNATIVE_NEXT_STATEMENTS = POWER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__ALTERNATIVE_PREV_STATEMENTS = POWER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__STMTS = POWER__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__STMT = POWER__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__ADDITIONAL_COMMA = POWER__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__LEFT = POWER__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__SYMBOL = POWER__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__RIGHT = POWER__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__TESTS = POWER__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__OPTIONAL_COMMA = POWER__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__TEST = POWER__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__COMP_FOR = POWER__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__TEST2 = POWER__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__IF_TEST = POWER__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__IF_ELSE_TEST = POWER__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__SIGN = POWER__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__NOT = POWER__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__COMPARISON = POWER__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__COMP_OP = POWER__COMP_OP;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__FACTOR = POWER__FACTOR;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__ATOM = POWER__ATOM;

	/**
	 * The feature id for the '<em><b>Trailer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__TRAILER = POWER__TRAILER;

	/**
	 * The feature id for the '<em><b>Round Bracket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__ROUND_BRACKET = POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Yield or testlist comp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__YIELD_OR_TESTLIST_COMP = POWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Square Bracket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__SQUARE_BRACKET = POWER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Listmaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__LISTMAKER = POWER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Curly Bracket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__CURLY_BRACKET = POWER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dictorsetmaker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__DICTORSETMAKER = POWER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Testlist1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__TESTLIST1 = POWER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__NAME = POWER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Strings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__STRINGS = POWER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = POWER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTMAKER__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTMAKER__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTMAKER__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTMAKER__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTMAKER__TEST = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>List for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTMAKER__LIST_FOR = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additional Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTMAKER__ADDITIONAL_TESTS = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTMAKER__OPTIONAL_COMMA = SPELL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>listmaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTMAKER_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_COMP__NEXT_STATEMENTS = YIELD_OR_TESTLIST_COMP__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_COMP__PREV_STATEMENTS = YIELD_OR_TESTLIST_COMP__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_COMP__ALTERNATIVE_NEXT_STATEMENTS = YIELD_OR_TESTLIST_COMP__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_COMP__ALTERNATIVE_PREV_STATEMENTS = YIELD_OR_TESTLIST_COMP__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_COMP__TEST = YIELD_OR_TESTLIST_COMP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_COMP__COMP_FOR = YIELD_OR_TESTLIST_COMP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Additional Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_COMP__ADDITIONAL_TESTS = YIELD_OR_TESTLIST_COMP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_COMP__OPTIONAL_COMMA = YIELD_OR_TESTLIST_COMP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>testlist comp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST_COMP_FEATURE_COUNT = YIELD_OR_TESTLIST_COMP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__NEXT_STATEMENTS = TEST__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__PREV_STATEMENTS = TEST__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__ALTERNATIVE_NEXT_STATEMENTS = TEST__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__ALTERNATIVE_PREV_STATEMENTS = TEST__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__STMTS = TEST__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__STMT = TEST__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__ADDITIONAL_COMMA = TEST__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__LEFT = TEST__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__SYMBOL = TEST__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__RIGHT = TEST__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__TESTS = TEST__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__OPTIONAL_COMMA = TEST__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__TEST = TEST__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__COMP_FOR = TEST__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__TEST2 = TEST__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__IF_TEST = TEST__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__IF_ELSE_TEST = TEST__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Varargslist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF__VARARGSLIST = TEST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>lambdef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDEF_FEATURE_COUNT = TEST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Round Bracket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER__ROUND_BRACKET = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arglist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER__ARGLIST = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Square Bracket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER__SQUARE_BRACKET = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subscriptlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER__SUBSCRIPTLIST = SPELL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dot Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER__DOT_NAME = SPELL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>trailer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAILER_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTLIST__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTLIST__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTLIST__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTLIST__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Subscript</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTLIST__SUBSCRIPT = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTLIST__OPTIONAL_COMMA = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>subscriptlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPTLIST_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Subscript1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT__SUBSCRIPT1 = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscript2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT__SUBSCRIPT2 = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sliceop</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT__SLICEOP = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT__SYMBOL = SPELL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>subscript</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSCRIPT_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICEOP__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICEOP__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICEOP__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICEOP__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICEOP__TEST = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>sliceop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLICEOP_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRLIST__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRLIST__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRLIST__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRLIST__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRLIST__EXPRS = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRLIST__OPTIONAL_COMMA = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>exprlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRLIST_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.dictorset_entryImpl <em>dictorset entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.dictorset_entryImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdictorset_entry()
	 * @generated
	 */
	int DICTORSET_ENTRY = 70;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSET_ENTRY__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSET_ENTRY__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSET_ENTRY__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSET_ENTRY__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Test1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSET_ENTRY__TEST1 = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSET_ENTRY__TEST2 = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>dictorset entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSET_ENTRY_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.dictorsetmakerImpl <em>dictorsetmaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.dictorsetmakerImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdictorsetmaker()
	 * @generated
	 */
	int DICTORSETMAKER = 71;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSETMAKER__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSETMAKER__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSETMAKER__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSETMAKER__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSETMAKER__ENTRIES = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSETMAKER__COMP_FOR = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSETMAKER__OPTIONAL_COMMA = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSETMAKER__TESTS = SPELL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>dictorsetmaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICTORSETMAKER_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.classdefImpl <em>classdef</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.classdefImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getclassdef()
	 * @generated
	 */
	int CLASSDEF = 72;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDEF__NEXT_STATEMENTS = COMPOUND_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDEF__PREV_STATEMENTS = COMPOUND_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDEF__ALTERNATIVE_NEXT_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDEF__ALTERNATIVE_PREV_STATEMENTS = COMPOUND_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDEF__NAME = COMPOUND_STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Round Brackets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDEF__ROUND_BRACKETS = COMPOUND_STMT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Testlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDEF__TESTLIST = COMPOUND_STMT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Suite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDEF__SUITE = COMPOUND_STMT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>classdef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSDEF_FEATURE_COUNT = COMPOUND_STMT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.arglistImpl <em>arglist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.arglistImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getarglist()
	 * @generated
	 */
	int ARGLIST = 73;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGLIST__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGLIST__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGLIST__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGLIST__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGLIST__ARGUMENTS = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGLIST__ARGUMENT = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGLIST__OPTIONAL_COMMA = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dot1 test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGLIST__DOT1_TEST = SPELL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dot1 arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGLIST__DOT1_ARGUMENTS = SPELL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dot2 test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGLIST__DOT2_TEST = SPELL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>arglist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGLIST_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.argumentImpl <em>argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.argumentImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getargument()
	 * @generated
	 */
	int ARGUMENT = 74;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__TEST = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__COMP_FOR = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT__TEST2 = SPELL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.list_iterImpl <em>list iter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.list_iterImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getlist_iter()
	 * @generated
	 */
	int LIST_ITER = 75;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITER__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITER__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITER__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITER__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>List iter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITER__LIST_ITER = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>list iter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITER_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.list_forImpl <em>list for</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.list_forImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getlist_for()
	 * @generated
	 */
	int LIST_FOR = 76;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FOR__NEXT_STATEMENTS = LIST_ITER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FOR__PREV_STATEMENTS = LIST_ITER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FOR__ALTERNATIVE_NEXT_STATEMENTS = LIST_ITER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FOR__ALTERNATIVE_PREV_STATEMENTS = LIST_ITER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>List iter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FOR__LIST_ITER = LIST_ITER__LIST_ITER;

	/**
	 * The feature id for the '<em><b>Exprlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FOR__EXPRLIST = LIST_ITER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Testlist safe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FOR__TESTLIST_SAFE = LIST_ITER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>list for</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FOR_FEATURE_COUNT = LIST_ITER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.list_ifImpl <em>list if</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.list_ifImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getlist_if()
	 * @generated
	 */
	int LIST_IF = 77;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_IF__NEXT_STATEMENTS = LIST_ITER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_IF__PREV_STATEMENTS = LIST_ITER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_IF__ALTERNATIVE_NEXT_STATEMENTS = LIST_ITER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_IF__ALTERNATIVE_PREV_STATEMENTS = LIST_ITER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>List iter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_IF__LIST_ITER = LIST_ITER__LIST_ITER;

	/**
	 * The feature id for the '<em><b>Old test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_IF__OLD_TEST = LIST_ITER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>list if</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_IF_FEATURE_COUNT = LIST_ITER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.comp_iterImpl <em>comp iter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.comp_iterImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getcomp_iter()
	 * @generated
	 */
	int COMP_ITER = 78;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ITER__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ITER__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ITER__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ITER__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Comp iter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ITER__COMP_ITER = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>comp iter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_ITER_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.comp_forImpl <em>comp for</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.comp_forImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getcomp_for()
	 * @generated
	 */
	int COMP_FOR = 79;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_FOR__NEXT_STATEMENTS = COMP_ITER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_FOR__PREV_STATEMENTS = COMP_ITER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_FOR__ALTERNATIVE_NEXT_STATEMENTS = COMP_ITER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_FOR__ALTERNATIVE_PREV_STATEMENTS = COMP_ITER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Comp iter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_FOR__COMP_ITER = COMP_ITER__COMP_ITER;

	/**
	 * The feature id for the '<em><b>Exprlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_FOR__EXPRLIST = COMP_ITER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Or test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_FOR__OR_TEST = COMP_ITER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>comp for</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_FOR_FEATURE_COUNT = COMP_ITER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.comp_ifImpl <em>comp if</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.comp_ifImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getcomp_if()
	 * @generated
	 */
	int COMP_IF = 80;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_IF__NEXT_STATEMENTS = COMP_ITER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_IF__PREV_STATEMENTS = COMP_ITER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_IF__ALTERNATIVE_NEXT_STATEMENTS = COMP_ITER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_IF__ALTERNATIVE_PREV_STATEMENTS = COMP_ITER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Comp iter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_IF__COMP_ITER = COMP_ITER__COMP_ITER;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_IF__TEST = COMP_ITER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>comp if</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMP_IF_FEATURE_COUNT = COMP_ITER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.testlist1Impl <em>testlist1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.testlist1Impl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#gettestlist1()
	 * @generated
	 */
	int TESTLIST1 = 81;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST1__NEXT_STATEMENTS = SPELL_ELEMENT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST1__PREV_STATEMENTS = SPELL_ELEMENT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST1__ALTERNATIVE_NEXT_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST1__ALTERNATIVE_PREV_STATEMENTS = SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST1__TESTS = SPELL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>testlist1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TESTLIST1_FEATURE_COUNT = SPELL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.yield_exprImpl <em>yield expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.yield_exprImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getyield_expr()
	 * @generated
	 */
	int YIELD_EXPR = 82;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_EXPR__NEXT_STATEMENTS = YIELD_OR_TESTLIST__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_EXPR__PREV_STATEMENTS = YIELD_OR_TESTLIST__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_EXPR__ALTERNATIVE_NEXT_STATEMENTS = YIELD_OR_TESTLIST__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_EXPR__ALTERNATIVE_PREV_STATEMENTS = YIELD_OR_TESTLIST__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Testlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_EXPR__TESTLIST = YIELD_OR_TESTLIST_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>yield expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YIELD_EXPR_FEATURE_COUNT = YIELD_OR_TESTLIST_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.functioncallImpl <em>functioncall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.functioncallImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getfunctioncall()
	 * @generated
	 */
	int FUNCTIONCALL = 84;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONCALL__NEXT_STATEMENTS = TRAILER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONCALL__PREV_STATEMENTS = TRAILER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONCALL__ALTERNATIVE_NEXT_STATEMENTS = TRAILER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONCALL__ALTERNATIVE_PREV_STATEMENTS = TRAILER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Round Bracket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONCALL__ROUND_BRACKET = TRAILER__ROUND_BRACKET;

	/**
	 * The feature id for the '<em><b>Arglist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONCALL__ARGLIST = TRAILER__ARGLIST;

	/**
	 * The feature id for the '<em><b>Square Bracket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONCALL__SQUARE_BRACKET = TRAILER__SQUARE_BRACKET;

	/**
	 * The feature id for the '<em><b>Subscriptlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONCALL__SUBSCRIPTLIST = TRAILER__SUBSCRIPTLIST;

	/**
	 * The feature id for the '<em><b>Dot Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONCALL__DOT_NAME = TRAILER__DOT_NAME;

	/**
	 * The number of structural features of the '<em>functioncall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONCALL_FEATURE_COUNT = TRAILER_FEATURE_COUNT + 0;


	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.StepImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 86;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NEXT_STATEMENTS = POWER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PREV_STATEMENTS = POWER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ALTERNATIVE_NEXT_STATEMENTS = POWER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ALTERNATIVE_PREV_STATEMENTS = POWER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STMTS = POWER__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__STMT = POWER__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ADDITIONAL_COMMA = POWER__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__LEFT = POWER__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SYMBOL = POWER__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__RIGHT = POWER__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TESTS = POWER__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__OPTIONAL_COMMA = POWER__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TEST = POWER__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__COMP_FOR = POWER__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TEST2 = POWER__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IF_TEST = POWER__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IF_ELSE_TEST = POWER__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SIGN = POWER__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NOT = POWER__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__COMPARISON = POWER__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__COMP_OP = POWER__COMP_OP;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__FACTOR = POWER__FACTOR;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ATOM = POWER__ATOM;

	/**
	 * The feature id for the '<em><b>Trailer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TRAILER = POWER__TRAILER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ID = POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__DESCRIPTION = POWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = POWER_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.VerifyImpl <em>Verify</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.VerifyImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getVerify()
	 * @generated
	 */
	int VERIFY = 87;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__NEXT_STATEMENTS = POWER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__PREV_STATEMENTS = POWER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__ALTERNATIVE_NEXT_STATEMENTS = POWER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__ALTERNATIVE_PREV_STATEMENTS = POWER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__STMTS = POWER__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__STMT = POWER__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__ADDITIONAL_COMMA = POWER__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__LEFT = POWER__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__SYMBOL = POWER__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__RIGHT = POWER__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__TESTS = POWER__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__OPTIONAL_COMMA = POWER__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__TEST = POWER__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__COMP_FOR = POWER__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__TEST2 = POWER__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__IF_TEST = POWER__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__IF_ELSE_TEST = POWER__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__SIGN = POWER__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__NOT = POWER__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__COMPARISON = POWER__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__COMP_OP = POWER__COMP_OP;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__FACTOR = POWER__FACTOR;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__ATOM = POWER__ATOM;

	/**
	 * The feature id for the '<em><b>Trailer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__TRAILER = POWER__TRAILER;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY__ARGS = POWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verify</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFY_FEATURE_COUNT = POWER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.SendImpl <em>Send</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SendImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getSend()
	 * @generated
	 */
	int SEND = 88;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__NEXT_STATEMENTS = POWER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__PREV_STATEMENTS = POWER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__ALTERNATIVE_NEXT_STATEMENTS = POWER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__ALTERNATIVE_PREV_STATEMENTS = POWER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__STMTS = POWER__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__STMT = POWER__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__ADDITIONAL_COMMA = POWER__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__LEFT = POWER__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__SYMBOL = POWER__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__RIGHT = POWER__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__TESTS = POWER__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__OPTIONAL_COMMA = POWER__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__TEST = POWER__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__COMP_FOR = POWER__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__TEST2 = POWER__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__IF_TEST = POWER__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__IF_ELSE_TEST = POWER__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__SIGN = POWER__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__NOT = POWER__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__COMPARISON = POWER__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__COMP_OP = POWER__COMP_OP;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__FACTOR = POWER__FACTOR;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__ATOM = POWER__ATOM;

	/**
	 * The feature id for the '<em><b>Trailer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__TRAILER = POWER__TRAILER;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__COMMAND = POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__VERIFY = POWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__ARGUMENTS = POWER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__VALUES = POWER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND__ARGS = POWER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Send</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_FEATURE_COUNT = POWER_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.BuildTCImpl <em>Build TC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.BuildTCImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getBuildTC()
	 * @generated
	 */
	int BUILD_TC = 94;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.ShowTMImpl <em>Show TM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.ShowTMImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getShowTM()
	 * @generated
	 */
	int SHOW_TM = 89;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__NEXT_STATEMENTS = POWER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__PREV_STATEMENTS = POWER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__ALTERNATIVE_NEXT_STATEMENTS = POWER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__ALTERNATIVE_PREV_STATEMENTS = POWER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__STMTS = POWER__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__STMT = POWER__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__ADDITIONAL_COMMA = POWER__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__LEFT = POWER__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__SYMBOL = POWER__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__RIGHT = POWER__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__TESTS = POWER__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__OPTIONAL_COMMA = POWER__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__TEST = POWER__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__COMP_FOR = POWER__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__TEST2 = POWER__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__IF_TEST = POWER__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__IF_ELSE_TEST = POWER__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__SIGN = POWER__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__NOT = POWER__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__COMPARISON = POWER__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__COMP_OP = POWER__COMP_OP;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__FACTOR = POWER__FACTOR;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__ATOM = POWER__ATOM;

	/**
	 * The feature id for the '<em><b>Trailer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__TRAILER = POWER__TRAILER;

	/**
	 * The feature id for the '<em><b>Tms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__TMS = POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM__ARGS = POWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Show TM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHOW_TM_FEATURE_COUNT = POWER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.GetTMImpl <em>Get TM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.GetTMImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getGetTM()
	 * @generated
	 */
	int GET_TM = 90;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__NEXT_STATEMENTS = POWER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__PREV_STATEMENTS = POWER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__ALTERNATIVE_NEXT_STATEMENTS = POWER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__ALTERNATIVE_PREV_STATEMENTS = POWER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__STMTS = POWER__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__STMT = POWER__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__ADDITIONAL_COMMA = POWER__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__LEFT = POWER__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__SYMBOL = POWER__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__RIGHT = POWER__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__TESTS = POWER__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__OPTIONAL_COMMA = POWER__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__TEST = POWER__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__COMP_FOR = POWER__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__TEST2 = POWER__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__IF_TEST = POWER__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__IF_ELSE_TEST = POWER__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__SIGN = POWER__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__NOT = POWER__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__COMPARISON = POWER__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__COMP_OP = POWER__COMP_OP;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__FACTOR = POWER__FACTOR;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__ATOM = POWER__ATOM;

	/**
	 * The feature id for the '<em><b>Trailer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__TRAILER = POWER__TRAILER;

	/**
	 * The feature id for the '<em><b>Tm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__TM = POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM__ARGS = POWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Get TM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TM_FEATURE_COUNT = POWER_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.assignment_stmtImpl <em>assignment stmt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.assignment_stmtImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getassignment_stmt()
	 * @generated
	 */
	int ASSIGNMENT_STMT = 91;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STMT__NEXT_STATEMENTS = SMALL_STMT__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STMT__PREV_STATEMENTS = SMALL_STMT__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STMT__ALTERNATIVE_NEXT_STATEMENTS = SMALL_STMT__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STMT__ALTERNATIVE_PREV_STATEMENTS = SMALL_STMT__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STMT__STMTS = SMALL_STMT__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STMT__STMT = SMALL_STMT__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STMT__ADDITIONAL_COMMA = SMALL_STMT__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STMT__LEFT = SMALL_STMT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STMT__SYMBOL = SMALL_STMT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STMT__RIGHT = SMALL_STMT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STMT__ASSIGNMENTS = SMALL_STMT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>assignment stmt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_STMT_FEATURE_COUNT = SMALL_STMT_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.ChangeLanguageConfigImpl <em>Change Language Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.ChangeLanguageConfigImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getChangeLanguageConfig()
	 * @generated
	 */
	int CHANGE_LANGUAGE_CONFIG = 92;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__NEXT_STATEMENTS = POWER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__PREV_STATEMENTS = POWER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__ALTERNATIVE_NEXT_STATEMENTS = POWER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__ALTERNATIVE_PREV_STATEMENTS = POWER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__STMTS = POWER__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__STMT = POWER__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__ADDITIONAL_COMMA = POWER__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__LEFT = POWER__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__SYMBOL = POWER__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__RIGHT = POWER__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__TESTS = POWER__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__OPTIONAL_COMMA = POWER__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__TEST = POWER__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__COMP_FOR = POWER__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__TEST2 = POWER__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__IF_TEST = POWER__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__IF_ELSE_TEST = POWER__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__SIGN = POWER__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__NOT = POWER__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__COMPARISON = POWER__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__COMP_OP = POWER__COMP_OP;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__FACTOR = POWER__FACTOR;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__ATOM = POWER__ATOM;

	/**
	 * The feature id for the '<em><b>Trailer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__TRAILER = POWER__TRAILER;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__STATEMENT = POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG__ARGS = POWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Language Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_LANGUAGE_CONFIG_FEATURE_COUNT = POWER_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.SetLimitsImpl <em>Set Limits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SetLimitsImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getSetLimits()
	 * @generated
	 */
	int SET_LIMITS = 93;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__NEXT_STATEMENTS = POWER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__PREV_STATEMENTS = POWER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__ALTERNATIVE_NEXT_STATEMENTS = POWER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__ALTERNATIVE_PREV_STATEMENTS = POWER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__STMTS = POWER__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__STMT = POWER__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__ADDITIONAL_COMMA = POWER__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__LEFT = POWER__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__SYMBOL = POWER__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__RIGHT = POWER__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__TESTS = POWER__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__OPTIONAL_COMMA = POWER__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__TEST = POWER__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__COMP_FOR = POWER__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__TEST2 = POWER__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__IF_TEST = POWER__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__IF_ELSE_TEST = POWER__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__SIGN = POWER__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__NOT = POWER__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__COMPARISON = POWER__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__COMP_OP = POWER__COMP_OP;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__FACTOR = POWER__FACTOR;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__ATOM = POWER__ATOM;

	/**
	 * The feature id for the '<em><b>Trailer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__TRAILER = POWER__TRAILER;

	/**
	 * The feature id for the '<em><b>Tm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__TM = POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS__ARGS = POWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Set Limits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_LIMITS_FEATURE_COUNT = POWER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__NEXT_STATEMENTS = POWER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__PREV_STATEMENTS = POWER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__ALTERNATIVE_NEXT_STATEMENTS = POWER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__ALTERNATIVE_PREV_STATEMENTS = POWER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__STMTS = POWER__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__STMT = POWER__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__ADDITIONAL_COMMA = POWER__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__LEFT = POWER__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__SYMBOL = POWER__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__RIGHT = POWER__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__TESTS = POWER__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__OPTIONAL_COMMA = POWER__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__TEST = POWER__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__COMP_FOR = POWER__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__TEST2 = POWER__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__IF_TEST = POWER__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__IF_ELSE_TEST = POWER__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__SIGN = POWER__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__NOT = POWER__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__COMPARISON = POWER__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__COMP_OP = POWER__COMP_OP;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__FACTOR = POWER__FACTOR;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__ATOM = POWER__ATOM;

	/**
	 * The feature id for the '<em><b>Trailer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__TRAILER = POWER__TRAILER;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__COMMAND = POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verify</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__VERIFY = POWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__ARGUMENTS = POWER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__VALUES = POWER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Args</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC__ARGS = POWER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Build TC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_TC_FEATURE_COUNT = POWER_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.GotoImpl <em>Goto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.GotoImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getGoto()
	 * @generated
	 */
	int GOTO = 95;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__NEXT_STATEMENTS = POWER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__PREV_STATEMENTS = POWER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__ALTERNATIVE_NEXT_STATEMENTS = POWER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__ALTERNATIVE_PREV_STATEMENTS = POWER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__STMTS = POWER__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__STMT = POWER__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__ADDITIONAL_COMMA = POWER__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__LEFT = POWER__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__SYMBOL = POWER__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__RIGHT = POWER__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__TESTS = POWER__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__OPTIONAL_COMMA = POWER__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__TEST = POWER__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__COMP_FOR = POWER__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__TEST2 = POWER__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__IF_TEST = POWER__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__IF_ELSE_TEST = POWER__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__SIGN = POWER__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__NOT = POWER__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__COMPARISON = POWER__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__COMP_OP = POWER__COMP_OP;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__FACTOR = POWER__FACTOR;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__ATOM = POWER__ATOM;

	/**
	 * The feature id for the '<em><b>Trailer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__TRAILER = POWER__TRAILER;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__VARIABLE = POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__TARGET = POWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__EXPR = POWER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__HASH = POWER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Goto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO_FEATURE_COUNT = POWER_FEATURE_COUNT + 4;


	/**
	 * The meta object id for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.DisplayStepImpl <em>Display Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.DisplayStepImpl
	 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getDisplayStep()
	 * @generated
	 */
	int DISPLAY_STEP = 96;

	/**
	 * The feature id for the '<em><b>Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__NEXT_STATEMENTS = POWER__NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__PREV_STATEMENTS = POWER__PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Next Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__ALTERNATIVE_NEXT_STATEMENTS = POWER__ALTERNATIVE_NEXT_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Alternative Prev Statements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__ALTERNATIVE_PREV_STATEMENTS = POWER__ALTERNATIVE_PREV_STATEMENTS;

	/**
	 * The feature id for the '<em><b>Stmts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__STMTS = POWER__STMTS;

	/**
	 * The feature id for the '<em><b>Stmt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__STMT = POWER__STMT;

	/**
	 * The feature id for the '<em><b>Additional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__ADDITIONAL_COMMA = POWER__ADDITIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__LEFT = POWER__LEFT;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__SYMBOL = POWER__SYMBOL;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__RIGHT = POWER__RIGHT;

	/**
	 * The feature id for the '<em><b>Tests</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__TESTS = POWER__TESTS;

	/**
	 * The feature id for the '<em><b>Optional Comma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__OPTIONAL_COMMA = POWER__OPTIONAL_COMMA;

	/**
	 * The feature id for the '<em><b>Test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__TEST = POWER__TEST;

	/**
	 * The feature id for the '<em><b>Comp for</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__COMP_FOR = POWER__COMP_FOR;

	/**
	 * The feature id for the '<em><b>Test2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__TEST2 = POWER__TEST2;

	/**
	 * The feature id for the '<em><b>If test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__IF_TEST = POWER__IF_TEST;

	/**
	 * The feature id for the '<em><b>If else test</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__IF_ELSE_TEST = POWER__IF_ELSE_TEST;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__SIGN = POWER__SIGN;

	/**
	 * The feature id for the '<em><b>Not</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__NOT = POWER__NOT;

	/**
	 * The feature id for the '<em><b>Comparison</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__COMPARISON = POWER__COMPARISON;

	/**
	 * The feature id for the '<em><b>Comp op</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__COMP_OP = POWER__COMP_OP;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__FACTOR = POWER__FACTOR;

	/**
	 * The feature id for the '<em><b>Atom</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__ATOM = POWER__ATOM;

	/**
	 * The feature id for the '<em><b>Trailer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__TRAILER = POWER__TRAILER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__ID = POWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP__DESCRIPTION = POWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Display Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_STEP_FEATURE_COUNT = POWER_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.single_input <em>single input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>single input</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.single_input
	 * @generated
	 */
	EClass getsingle_input();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.single_input#getStmt <em>Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.single_input#getStmt()
	 * @see #getsingle_input()
	 * @generated
	 */
	EReference getsingle_input_Stmt();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.file_input <em>file input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>file input</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.file_input
	 * @generated
	 */
	EClass getfile_input();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.file_input#getStmts <em>Stmts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stmts</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.file_input#getStmts()
	 * @see #getfile_input()
	 * @generated
	 */
	EReference getfile_input_Stmts();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.eval_input <em>eval input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>eval input</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.eval_input
	 * @generated
	 */
	EClass geteval_input();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.eval_input#getTestlist <em>Testlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Testlist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.eval_input#getTestlist()
	 * @see #geteval_input()
	 * @generated
	 */
	EReference geteval_input_Testlist();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.decorator <em>decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>decorator</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.decorator
	 * @generated
	 */
	EClass getdecorator();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.decorator#getDotted_name <em>Dotted name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dotted name</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.decorator#getDotted_name()
	 * @see #getdecorator()
	 * @generated
	 */
	EAttribute getdecorator_Dotted_name();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.decorator#isRoundBracket <em>Round Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Round Bracket</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.decorator#isRoundBracket()
	 * @see #getdecorator()
	 * @generated
	 */
	EAttribute getdecorator_RoundBracket();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.decorator#getArglist <em>Arglist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arglist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.decorator#getArglist()
	 * @see #getdecorator()
	 * @generated
	 */
	EReference getdecorator_Arglist();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.decorators <em>decorators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>decorators</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.decorators
	 * @generated
	 */
	EClass getdecorators();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.decorators#getDecorators <em>Decorators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decorators</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.decorators#getDecorators()
	 * @see #getdecorators()
	 * @generated
	 */
	EReference getdecorators_Decorators();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.decorated <em>decorated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>decorated</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.decorated
	 * @generated
	 */
	EClass getdecorated();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.decorated#getDecorators <em>Decorators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Decorators</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.decorated#getDecorators()
	 * @see #getdecorated()
	 * @generated
	 */
	EReference getdecorated_Decorators();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.decorated#getDef <em>Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Def</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.decorated#getDef()
	 * @see #getdecorated()
	 * @generated
	 */
	EReference getdecorated_Def();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.funcdef <em>funcdef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>funcdef</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.funcdef
	 * @generated
	 */
	EClass getfuncdef();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.funcdef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.funcdef#getName()
	 * @see #getfuncdef()
	 * @generated
	 */
	EAttribute getfuncdef_Name();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.funcdef#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameters</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.funcdef#getParameters()
	 * @see #getfuncdef()
	 * @generated
	 */
	EReference getfuncdef_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.funcdef#getSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suite</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.funcdef#getSuite()
	 * @see #getfuncdef()
	 * @generated
	 */
	EReference getfuncdef_Suite();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.parameters <em>parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>parameters</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.parameters
	 * @generated
	 */
	EClass getparameters();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.parameters#getVarargslist <em>Varargslist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Varargslist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.parameters#getVarargslist()
	 * @see #getparameters()
	 * @generated
	 */
	EReference getparameters_Varargslist();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.varargslist_element <em>varargslist element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>varargslist element</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.varargslist_element
	 * @generated
	 */
	EClass getvarargslist_element();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.varargslist_element#getFpdef <em>Fpdef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fpdef</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.varargslist_element#getFpdef()
	 * @see #getvarargslist_element()
	 * @generated
	 */
	EReference getvarargslist_element_Fpdef();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.varargslist_element#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.varargslist_element#getTest()
	 * @see #getvarargslist_element()
	 * @generated
	 */
	EReference getvarargslist_element_Test();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.varargslist <em>varargslist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>varargslist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.varargslist
	 * @generated
	 */
	EClass getvarargslist();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getVarargs1 <em>Varargs1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Varargs1</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.varargslist#getVarargs1()
	 * @see #getvarargslist()
	 * @generated
	 */
	EReference getvarargslist_Varargs1();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getDot1Name <em>Dot1 Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dot1 Name</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.varargslist#getDot1Name()
	 * @see #getvarargslist()
	 * @generated
	 */
	EAttribute getvarargslist_Dot1Name();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getDot2Name <em>Dot2 Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dot2 Name</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.varargslist#getDot2Name()
	 * @see #getvarargslist()
	 * @generated
	 */
	EAttribute getvarargslist_Dot2Name();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getDot3Name <em>Dot3 Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dot3 Name</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.varargslist#getDot3Name()
	 * @see #getvarargslist()
	 * @generated
	 */
	EAttribute getvarargslist_Dot3Name();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getVararg2 <em>Vararg2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vararg2</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.varargslist#getVararg2()
	 * @see #getvarargslist()
	 * @generated
	 */
	EReference getvarargslist_Vararg2();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.varargslist#getVarargs3 <em>Varargs3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Varargs3</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.varargslist#getVarargs3()
	 * @see #getvarargslist()
	 * @generated
	 */
	EReference getvarargslist_Varargs3();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.varargslist#isAdditionalComma <em>Additional Comma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Comma</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.varargslist#isAdditionalComma()
	 * @see #getvarargslist()
	 * @generated
	 */
	EAttribute getvarargslist_AdditionalComma();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.fpdef <em>fpdef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>fpdef</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.fpdef
	 * @generated
	 */
	EClass getfpdef();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.fpdef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.fpdef#getName()
	 * @see #getfpdef()
	 * @generated
	 */
	EAttribute getfpdef_Name();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.fpdef#getFplist <em>Fplist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fplist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.fpdef#getFplist()
	 * @see #getfpdef()
	 * @generated
	 */
	EReference getfpdef_Fplist();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.fplist <em>fplist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>fplist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.fplist
	 * @generated
	 */
	EClass getfplist();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.fplist#getDef1 <em>Def1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Def1</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.fplist#getDef1()
	 * @see #getfplist()
	 * @generated
	 */
	EReference getfplist_Def1();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.fplist#getDefinitions <em>Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Definitions</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.fplist#getDefinitions()
	 * @see #getfplist()
	 * @generated
	 */
	EReference getfplist_Definitions();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.fplist#isOptionalSemicolon <em>Optional Semicolon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Semicolon</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.fplist#isOptionalSemicolon()
	 * @see #getfplist()
	 * @generated
	 */
	EAttribute getfplist_OptionalSemicolon();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.stmt <em>stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.stmt
	 * @generated
	 */
	EClass getstmt();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.simple_stmt <em>simple stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>simple stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.simple_stmt
	 * @generated
	 */
	EClass getsimple_stmt();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.simple_stmt#getStmt <em>Stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.simple_stmt#getStmt()
	 * @see #getsimple_stmt()
	 * @generated
	 */
	EReference getsimple_stmt_Stmt();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.simple_stmt#isAdditionalComma <em>Additional Comma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Comma</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.simple_stmt#isAdditionalComma()
	 * @see #getsimple_stmt()
	 * @generated
	 */
	EAttribute getsimple_stmt_AdditionalComma();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.small_stmt <em>small stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>small stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.small_stmt
	 * @generated
	 */
	EClass getsmall_stmt();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.expr_stmt <em>expr stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>expr stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.expr_stmt
	 * @generated
	 */
	EClass getexpr_stmt();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.expr_stmt#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.expr_stmt#getLeft()
	 * @see #getexpr_stmt()
	 * @generated
	 */
	EReference getexpr_stmt_Left();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.expr_stmt#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.expr_stmt#getSymbol()
	 * @see #getexpr_stmt()
	 * @generated
	 */
	EAttribute getexpr_stmt_Symbol();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.expr_stmt#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.expr_stmt#getRight()
	 * @see #getexpr_stmt()
	 * @generated
	 */
	EReference getexpr_stmt_Right();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.yield_or_testlist <em>yield or testlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>yield or testlist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.yield_or_testlist
	 * @generated
	 */
	EClass getyield_or_testlist();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.del_stmt <em>del stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>del stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.del_stmt
	 * @generated
	 */
	EClass getdel_stmt();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.del_stmt#getExprlist <em>Exprlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exprlist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.del_stmt#getExprlist()
	 * @see #getdel_stmt()
	 * @generated
	 */
	EReference getdel_stmt_Exprlist();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.pass_stmt <em>pass stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>pass stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.pass_stmt
	 * @generated
	 */
	EClass getpass_stmt();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.flow_stmt <em>flow stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>flow stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.flow_stmt
	 * @generated
	 */
	EClass getflow_stmt();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.break_stmt <em>break stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>break stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.break_stmt
	 * @generated
	 */
	EClass getbreak_stmt();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.continue_stmt <em>continue stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>continue stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.continue_stmt
	 * @generated
	 */
	EClass getcontinue_stmt();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.return_stmt <em>return stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>return stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.return_stmt
	 * @generated
	 */
	EClass getreturn_stmt();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.return_stmt#getTestlist <em>Testlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Testlist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.return_stmt#getTestlist()
	 * @see #getreturn_stmt()
	 * @generated
	 */
	EReference getreturn_stmt_Testlist();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.yield_stmt <em>yield stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>yield stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.yield_stmt
	 * @generated
	 */
	EClass getyield_stmt();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.yield_stmt#getYield_expr <em>Yield expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Yield expr</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.yield_stmt#getYield_expr()
	 * @see #getyield_stmt()
	 * @generated
	 */
	EReference getyield_stmt_Yield_expr();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.raise_stmt <em>raise stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>raise stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.raise_stmt
	 * @generated
	 */
	EClass getraise_stmt();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.raise_stmt#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.raise_stmt#getTests()
	 * @see #getraise_stmt()
	 * @generated
	 */
	EReference getraise_stmt_Tests();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.import_stmt <em>import stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>import stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_stmt
	 * @generated
	 */
	EClass getimport_stmt();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.import_name <em>import name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>import name</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_name
	 * @generated
	 */
	EClass getimport_name();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.import_name#getDotted_as_names <em>Dotted as names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dotted as names</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_name#getDotted_as_names()
	 * @see #getimport_name()
	 * @generated
	 */
	EReference getimport_name_Dotted_as_names();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.import_from <em>import from</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>import from</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_from
	 * @generated
	 */
	EClass getimport_from();

	/**
	 * Returns the meta object for the attribute list '{@link lu.ses.engineering.spell.controlflow.spell.import_from#getDots <em>Dots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dots</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_from#getDots()
	 * @see #getimport_from()
	 * @generated
	 */
	EAttribute getimport_from_Dots();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.import_from#getDotted_name <em>Dotted name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dotted name</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_from#getDotted_name()
	 * @see #getimport_from()
	 * @generated
	 */
	EAttribute getimport_from_Dotted_name();

	/**
	 * Returns the meta object for the attribute list '{@link lu.ses.engineering.spell.controlflow.spell.import_from#getDots2 <em>Dots2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dots2</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_from#getDots2()
	 * @see #getimport_from()
	 * @generated
	 */
	EAttribute getimport_from_Dots2();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.import_from#isRoundBracket <em>Round Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Round Bracket</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_from#isRoundBracket()
	 * @see #getimport_from()
	 * @generated
	 */
	EAttribute getimport_from_RoundBracket();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.import_from#getImport_as_names <em>Import as names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Import as names</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_from#getImport_as_names()
	 * @see #getimport_from()
	 * @generated
	 */
	EReference getimport_from_Import_as_names();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.import_as_name <em>import as name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>import as name</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_as_name
	 * @generated
	 */
	EClass getimport_as_name();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.import_as_name#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_as_name#getName()
	 * @see #getimport_as_name()
	 * @generated
	 */
	EAttribute getimport_as_name_Name();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.import_as_name#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_as_name#getIdentifier()
	 * @see #getimport_as_name()
	 * @generated
	 */
	EAttribute getimport_as_name_Identifier();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.dotted_as_name <em>dotted as name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>dotted as name</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.dotted_as_name
	 * @generated
	 */
	EClass getdotted_as_name();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.dotted_as_name#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.dotted_as_name#getName()
	 * @see #getdotted_as_name()
	 * @generated
	 */
	EAttribute getdotted_as_name_Name();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.dotted_as_name#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.dotted_as_name#getIdentifier()
	 * @see #getdotted_as_name()
	 * @generated
	 */
	EAttribute getdotted_as_name_Identifier();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.import_as_names <em>import as names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>import as names</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_as_names
	 * @generated
	 */
	EClass getimport_as_names();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.import_as_names#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_as_names#getImports()
	 * @see #getimport_as_names()
	 * @generated
	 */
	EReference getimport_as_names_Imports();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.import_as_names#isOptionalComma <em>Optional Comma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Comma</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.import_as_names#isOptionalComma()
	 * @see #getimport_as_names()
	 * @generated
	 */
	EAttribute getimport_as_names_OptionalComma();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.dotted_as_names <em>dotted as names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>dotted as names</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.dotted_as_names
	 * @generated
	 */
	EClass getdotted_as_names();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.dotted_as_names#getDotted_names <em>Dotted names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dotted names</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.dotted_as_names#getDotted_names()
	 * @see #getdotted_as_names()
	 * @generated
	 */
	EReference getdotted_as_names_Dotted_names();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.global_stmt <em>global stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>global stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.global_stmt
	 * @generated
	 */
	EClass getglobal_stmt();

	/**
	 * Returns the meta object for the attribute list '{@link lu.ses.engineering.spell.controlflow.spell.global_stmt#getGlobals <em>Globals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Globals</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.global_stmt#getGlobals()
	 * @see #getglobal_stmt()
	 * @generated
	 */
	EAttribute getglobal_stmt_Globals();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.exec_stmt <em>exec stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>exec stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.exec_stmt
	 * @generated
	 */
	EClass getexec_stmt();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.exec_stmt#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.exec_stmt#getExpr()
	 * @see #getexec_stmt()
	 * @generated
	 */
	EReference getexec_stmt_Expr();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.exec_stmt#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.exec_stmt#getTests()
	 * @see #getexec_stmt()
	 * @generated
	 */
	EReference getexec_stmt_Tests();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.assert_stmt <em>assert stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>assert stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.assert_stmt
	 * @generated
	 */
	EClass getassert_stmt();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.assert_stmt#getAssers <em>Assers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assers</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.assert_stmt#getAssers()
	 * @see #getassert_stmt()
	 * @generated
	 */
	EReference getassert_stmt_Assers();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.compound_stmt <em>compound stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>compound stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.compound_stmt
	 * @generated
	 */
	EClass getcompound_stmt();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.else_if_stmt <em>else if stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>else if stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.else_if_stmt
	 * @generated
	 */
	EClass getelse_if_stmt();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.else_if_stmt#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.else_if_stmt#getTest()
	 * @see #getelse_if_stmt()
	 * @generated
	 */
	EReference getelse_if_stmt_Test();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.else_if_stmt#getSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suite</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.else_if_stmt#getSuite()
	 * @see #getelse_if_stmt()
	 * @generated
	 */
	EReference getelse_if_stmt_Suite();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.if_stmt <em>if stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>if stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.if_stmt
	 * @generated
	 */
	EClass getif_stmt();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.if_stmt#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.if_stmt#getTest()
	 * @see #getif_stmt()
	 * @generated
	 */
	EReference getif_stmt_Test();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.if_stmt#getSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suite</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.if_stmt#getSuite()
	 * @see #getif_stmt()
	 * @generated
	 */
	EReference getif_stmt_Suite();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.if_stmt#getElse_if_stmts <em>Else if stmts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else if stmts</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.if_stmt#getElse_if_stmts()
	 * @see #getif_stmt()
	 * @generated
	 */
	EReference getif_stmt_Else_if_stmts();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.if_stmt#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.if_stmt#getElse()
	 * @see #getif_stmt()
	 * @generated
	 */
	EReference getif_stmt_Else();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.while_stmt <em>while stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>while stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.while_stmt
	 * @generated
	 */
	EClass getwhile_stmt();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.while_stmt#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.while_stmt#getTest()
	 * @see #getwhile_stmt()
	 * @generated
	 */
	EReference getwhile_stmt_Test();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.while_stmt#getSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suite</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.while_stmt#getSuite()
	 * @see #getwhile_stmt()
	 * @generated
	 */
	EReference getwhile_stmt_Suite();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.while_stmt#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.while_stmt#getElse()
	 * @see #getwhile_stmt()
	 * @generated
	 */
	EReference getwhile_stmt_Else();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.for_stmt <em>for stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>for stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.for_stmt
	 * @generated
	 */
	EClass getfor_stmt();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.for_stmt#getExprlist <em>Exprlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exprlist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.for_stmt#getExprlist()
	 * @see #getfor_stmt()
	 * @generated
	 */
	EReference getfor_stmt_Exprlist();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.for_stmt#getTestlist <em>Testlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Testlist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.for_stmt#getTestlist()
	 * @see #getfor_stmt()
	 * @generated
	 */
	EReference getfor_stmt_Testlist();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.for_stmt#getSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suite</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.for_stmt#getSuite()
	 * @see #getfor_stmt()
	 * @generated
	 */
	EReference getfor_stmt_Suite();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.for_stmt#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.for_stmt#getElse()
	 * @see #getfor_stmt()
	 * @generated
	 */
	EReference getfor_stmt_Else();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.try_stmt <em>try stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>try stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.try_stmt
	 * @generated
	 */
	EClass gettry_stmt();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.try_stmt#getSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suite</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.try_stmt#getSuite()
	 * @see #gettry_stmt()
	 * @generated
	 */
	EReference gettry_stmt_Suite();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.try_stmt#getExcept_clause <em>Except clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Except clause</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.try_stmt#getExcept_clause()
	 * @see #gettry_stmt()
	 * @generated
	 */
	EReference gettry_stmt_Except_clause();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.try_stmt#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.try_stmt#getElse()
	 * @see #gettry_stmt()
	 * @generated
	 */
	EReference gettry_stmt_Else();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.try_stmt#getFinally <em>Finally</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Finally</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.try_stmt#getFinally()
	 * @see #gettry_stmt()
	 * @generated
	 */
	EReference gettry_stmt_Finally();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.with_stmt <em>with stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>with stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.with_stmt
	 * @generated
	 */
	EClass getwith_stmt();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.with_stmt#getWith_item <em>With item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>With item</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.with_stmt#getWith_item()
	 * @see #getwith_stmt()
	 * @generated
	 */
	EReference getwith_stmt_With_item();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.with_stmt#getSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suite</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.with_stmt#getSuite()
	 * @see #getwith_stmt()
	 * @generated
	 */
	EReference getwith_stmt_Suite();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.with_item <em>with item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>with item</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.with_item
	 * @generated
	 */
	EClass getwith_item();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.with_item#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.with_item#getTest()
	 * @see #getwith_item()
	 * @generated
	 */
	EReference getwith_item_Test();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.with_item#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.with_item#getExpr()
	 * @see #getwith_item()
	 * @generated
	 */
	EReference getwith_item_Expr();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.except_clause <em>except clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>except clause</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.except_clause
	 * @generated
	 */
	EClass getexcept_clause();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.except_clause#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.except_clause#getTest()
	 * @see #getexcept_clause()
	 * @generated
	 */
	EReference getexcept_clause_Test();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.except_clause#getSign <em>Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.except_clause#getSign()
	 * @see #getexcept_clause()
	 * @generated
	 */
	EAttribute getexcept_clause_Sign();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.except_clause#getNext_test <em>Next test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Next test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.except_clause#getNext_test()
	 * @see #getexcept_clause()
	 * @generated
	 */
	EReference getexcept_clause_Next_test();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.except_clause#getSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suite</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.except_clause#getSuite()
	 * @see #getexcept_clause()
	 * @generated
	 */
	EReference getexcept_clause_Suite();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.suite <em>suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>suite</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.suite
	 * @generated
	 */
	EClass getsuite();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.suite#getStmts <em>Stmts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stmts</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.suite#getStmts()
	 * @see #getsuite()
	 * @generated
	 */
	EReference getsuite_Stmts();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.testlist_safe <em>testlist safe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>testlist safe</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist_safe
	 * @generated
	 */
	EClass gettestlist_safe();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.testlist_safe#getOld_test <em>Old test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Old test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist_safe#getOld_test()
	 * @see #gettestlist_safe()
	 * @generated
	 */
	EReference gettestlist_safe_Old_test();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.testlist_safe#isOptionalComa <em>Optional Coma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Coma</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist_safe#isOptionalComa()
	 * @see #gettestlist_safe()
	 * @generated
	 */
	EAttribute gettestlist_safe_OptionalComa();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.test <em>test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.test
	 * @generated
	 */
	EClass gettest();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.test#getIf_test <em>If test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.test#getIf_test()
	 * @see #gettest()
	 * @generated
	 */
	EReference gettest_If_test();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.test#getIf_else_test <em>If else test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If else test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.test#getIf_else_test()
	 * @see #gettest()
	 * @generated
	 */
	EReference gettest_If_else_test();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.or_test <em>or test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>or test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.or_test
	 * @generated
	 */
	EClass getor_test();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.or_test#getSign <em>Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.or_test#getSign()
	 * @see #getor_test()
	 * @generated
	 */
	EAttribute getor_test_Sign();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.and_test <em>and test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>and test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.and_test
	 * @generated
	 */
	EClass getand_test();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.not_test <em>not test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>not test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.not_test
	 * @generated
	 */
	EClass getnot_test();

	/**
	 * Returns the meta object for the attribute list '{@link lu.ses.engineering.spell.controlflow.spell.not_test#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Not</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.not_test#getNot()
	 * @see #getnot_test()
	 * @generated
	 */
	EAttribute getnot_test_Not();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.not_test#getComparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparison</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.not_test#getComparison()
	 * @see #getnot_test()
	 * @generated
	 */
	EReference getnot_test_Comparison();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.comparison <em>comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>comparison</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.comparison
	 * @generated
	 */
	EClass getcomparison();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.comparison#getComp_op <em>Comp op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comp op</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.comparison#getComp_op()
	 * @see #getcomparison()
	 * @generated
	 */
	EAttribute getcomparison_Comp_op();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.expr <em>expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>expr</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.expr
	 * @generated
	 */
	EClass getexpr();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.xor_expr <em>xor expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>xor expr</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.xor_expr
	 * @generated
	 */
	EClass getxor_expr();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.and_expr <em>and expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>and expr</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.and_expr
	 * @generated
	 */
	EClass getand_expr();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.shift_expr <em>shift expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>shift expr</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.shift_expr
	 * @generated
	 */
	EClass getshift_expr();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.arith_expr <em>arith expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>arith expr</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.arith_expr
	 * @generated
	 */
	EClass getarith_expr();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.term <em>term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>term</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.term
	 * @generated
	 */
	EClass getterm();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.factor <em>factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>factor</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.factor
	 * @generated
	 */
	EClass getfactor();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.factor#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Factor</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.factor#getFactor()
	 * @see #getfactor()
	 * @generated
	 */
	EReference getfactor_Factor();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.power <em>power</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>power</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.power
	 * @generated
	 */
	EClass getpower();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.power#getAtom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Atom</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.power#getAtom()
	 * @see #getpower()
	 * @generated
	 */
	EReference getpower_Atom();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.power#getTrailer <em>Trailer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trailer</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.power#getTrailer()
	 * @see #getpower()
	 * @generated
	 */
	EReference getpower_Trailer();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.yield_or_testlist_comp <em>yield or testlist comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>yield or testlist comp</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.yield_or_testlist_comp
	 * @generated
	 */
	EClass getyield_or_testlist_comp();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.atom <em>atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>atom</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.atom
	 * @generated
	 */
	EClass getatom();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.atom#isRoundBracket <em>Round Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Round Bracket</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.atom#isRoundBracket()
	 * @see #getatom()
	 * @generated
	 */
	EAttribute getatom_RoundBracket();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.atom#getYield_or_testlist_comp <em>Yield or testlist comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Yield or testlist comp</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.atom#getYield_or_testlist_comp()
	 * @see #getatom()
	 * @generated
	 */
	EReference getatom_Yield_or_testlist_comp();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.atom#isSquareBracket <em>Square Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Square Bracket</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.atom#isSquareBracket()
	 * @see #getatom()
	 * @generated
	 */
	EAttribute getatom_SquareBracket();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.atom#getListmaker <em>Listmaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listmaker</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.atom#getListmaker()
	 * @see #getatom()
	 * @generated
	 */
	EReference getatom_Listmaker();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.atom#isCurlyBracket <em>Curly Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curly Bracket</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.atom#isCurlyBracket()
	 * @see #getatom()
	 * @generated
	 */
	EAttribute getatom_CurlyBracket();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.atom#getDictorsetmaker <em>Dictorsetmaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dictorsetmaker</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.atom#getDictorsetmaker()
	 * @see #getatom()
	 * @generated
	 */
	EReference getatom_Dictorsetmaker();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.atom#getTestlist1 <em>Testlist1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Testlist1</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.atom#getTestlist1()
	 * @see #getatom()
	 * @generated
	 */
	EReference getatom_Testlist1();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.atom#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.atom#getName()
	 * @see #getatom()
	 * @generated
	 */
	EAttribute getatom_Name();

	/**
	 * Returns the meta object for the attribute list '{@link lu.ses.engineering.spell.controlflow.spell.atom#getStrings <em>Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Strings</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.atom#getStrings()
	 * @see #getatom()
	 * @generated
	 */
	EAttribute getatom_Strings();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.listmaker <em>listmaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>listmaker</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.listmaker
	 * @generated
	 */
	EClass getlistmaker();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.listmaker#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.listmaker#getTest()
	 * @see #getlistmaker()
	 * @generated
	 */
	EReference getlistmaker_Test();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.listmaker#getList_for <em>List for</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List for</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.listmaker#getList_for()
	 * @see #getlistmaker()
	 * @generated
	 */
	EReference getlistmaker_List_for();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.listmaker#getAdditionalTests <em>Additional Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Tests</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.listmaker#getAdditionalTests()
	 * @see #getlistmaker()
	 * @generated
	 */
	EReference getlistmaker_AdditionalTests();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.listmaker#isOptionalComma <em>Optional Comma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Comma</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.listmaker#isOptionalComma()
	 * @see #getlistmaker()
	 * @generated
	 */
	EAttribute getlistmaker_OptionalComma();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.testlist_comp <em>testlist comp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>testlist comp</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist_comp
	 * @generated
	 */
	EClass gettestlist_comp();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.testlist_comp#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist_comp#getTest()
	 * @see #gettestlist_comp()
	 * @generated
	 */
	EReference gettestlist_comp_Test();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.testlist_comp#getComp_for <em>Comp for</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comp for</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist_comp#getComp_for()
	 * @see #gettestlist_comp()
	 * @generated
	 */
	EReference gettestlist_comp_Comp_for();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.testlist_comp#getAdditionalTests <em>Additional Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Tests</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist_comp#getAdditionalTests()
	 * @see #gettestlist_comp()
	 * @generated
	 */
	EReference gettestlist_comp_AdditionalTests();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.testlist_comp#isOptionalComma <em>Optional Comma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Comma</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist_comp#isOptionalComma()
	 * @see #gettestlist_comp()
	 * @generated
	 */
	EAttribute gettestlist_comp_OptionalComma();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.lambdef <em>lambdef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>lambdef</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.lambdef
	 * @generated
	 */
	EClass getlambdef();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.lambdef#getVarargslist <em>Varargslist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Varargslist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.lambdef#getVarargslist()
	 * @see #getlambdef()
	 * @generated
	 */
	EReference getlambdef_Varargslist();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.trailer <em>trailer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>trailer</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.trailer
	 * @generated
	 */
	EClass gettrailer();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.trailer#isRoundBracket <em>Round Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Round Bracket</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.trailer#isRoundBracket()
	 * @see #gettrailer()
	 * @generated
	 */
	EAttribute gettrailer_RoundBracket();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.trailer#getArglist <em>Arglist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arglist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.trailer#getArglist()
	 * @see #gettrailer()
	 * @generated
	 */
	EReference gettrailer_Arglist();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.trailer#isSquareBracket <em>Square Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Square Bracket</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.trailer#isSquareBracket()
	 * @see #gettrailer()
	 * @generated
	 */
	EAttribute gettrailer_SquareBracket();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.trailer#getSubscriptlist <em>Subscriptlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscriptlist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.trailer#getSubscriptlist()
	 * @see #gettrailer()
	 * @generated
	 */
	EReference gettrailer_Subscriptlist();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.trailer#getDotName <em>Dot Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dot Name</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.trailer#getDotName()
	 * @see #gettrailer()
	 * @generated
	 */
	EAttribute gettrailer_DotName();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.subscriptlist <em>subscriptlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>subscriptlist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.subscriptlist
	 * @generated
	 */
	EClass getsubscriptlist();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.subscriptlist#getSubscript <em>Subscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subscript</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.subscriptlist#getSubscript()
	 * @see #getsubscriptlist()
	 * @generated
	 */
	EReference getsubscriptlist_Subscript();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.subscriptlist#isOptionalComma <em>Optional Comma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Comma</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.subscriptlist#isOptionalComma()
	 * @see #getsubscriptlist()
	 * @generated
	 */
	EAttribute getsubscriptlist_OptionalComma();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.subscript <em>subscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>subscript</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.subscript
	 * @generated
	 */
	EClass getsubscript();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.subscript#getSubscript1 <em>Subscript1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscript1</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.subscript#getSubscript1()
	 * @see #getsubscript()
	 * @generated
	 */
	EReference getsubscript_Subscript1();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.subscript#getSubscript2 <em>Subscript2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subscript2</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.subscript#getSubscript2()
	 * @see #getsubscript()
	 * @generated
	 */
	EReference getsubscript_Subscript2();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.subscript#getSliceop <em>Sliceop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sliceop</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.subscript#getSliceop()
	 * @see #getsubscript()
	 * @generated
	 */
	EReference getsubscript_Sliceop();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.subscript#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.subscript#getSymbol()
	 * @see #getsubscript()
	 * @generated
	 */
	EAttribute getsubscript_Symbol();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.sliceop <em>sliceop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>sliceop</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.sliceop
	 * @generated
	 */
	EClass getsliceop();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.sliceop#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.sliceop#getTest()
	 * @see #getsliceop()
	 * @generated
	 */
	EReference getsliceop_Test();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.exprlist <em>exprlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>exprlist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.exprlist
	 * @generated
	 */
	EClass getexprlist();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.exprlist#getExprs <em>Exprs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exprs</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.exprlist#getExprs()
	 * @see #getexprlist()
	 * @generated
	 */
	EReference getexprlist_Exprs();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.exprlist#isOptionalComma <em>Optional Comma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Comma</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.exprlist#isOptionalComma()
	 * @see #getexprlist()
	 * @generated
	 */
	EAttribute getexprlist_OptionalComma();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.testlist <em>testlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>testlist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist
	 * @generated
	 */
	EClass gettestlist();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.testlist#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist#getTests()
	 * @see #gettestlist()
	 * @generated
	 */
	EReference gettestlist_Tests();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.testlist#isOptionalComma <em>Optional Comma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Comma</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist#isOptionalComma()
	 * @see #gettestlist()
	 * @generated
	 */
	EAttribute gettestlist_OptionalComma();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.dictorset_entry <em>dictorset entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>dictorset entry</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.dictorset_entry
	 * @generated
	 */
	EClass getdictorset_entry();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.dictorset_entry#getTest1 <em>Test1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test1</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.dictorset_entry#getTest1()
	 * @see #getdictorset_entry()
	 * @generated
	 */
	EReference getdictorset_entry_Test1();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.dictorset_entry#getTest2 <em>Test2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test2</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.dictorset_entry#getTest2()
	 * @see #getdictorset_entry()
	 * @generated
	 */
	EReference getdictorset_entry_Test2();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.dictorsetmaker <em>dictorsetmaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>dictorsetmaker</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.dictorsetmaker
	 * @generated
	 */
	EClass getdictorsetmaker();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.dictorsetmaker#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.dictorsetmaker#getEntries()
	 * @see #getdictorsetmaker()
	 * @generated
	 */
	EReference getdictorsetmaker_Entries();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.dictorsetmaker#getComp_for <em>Comp for</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comp for</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.dictorsetmaker#getComp_for()
	 * @see #getdictorsetmaker()
	 * @generated
	 */
	EReference getdictorsetmaker_Comp_for();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.dictorsetmaker#isOptionalComma <em>Optional Comma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Comma</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.dictorsetmaker#isOptionalComma()
	 * @see #getdictorsetmaker()
	 * @generated
	 */
	EAttribute getdictorsetmaker_OptionalComma();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.dictorsetmaker#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.dictorsetmaker#getTests()
	 * @see #getdictorsetmaker()
	 * @generated
	 */
	EReference getdictorsetmaker_Tests();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.classdef <em>classdef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>classdef</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.classdef
	 * @generated
	 */
	EClass getclassdef();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.classdef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.classdef#getName()
	 * @see #getclassdef()
	 * @generated
	 */
	EAttribute getclassdef_Name();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.classdef#isRoundBrackets <em>Round Brackets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Round Brackets</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.classdef#isRoundBrackets()
	 * @see #getclassdef()
	 * @generated
	 */
	EAttribute getclassdef_RoundBrackets();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.classdef#getTestlist <em>Testlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Testlist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.classdef#getTestlist()
	 * @see #getclassdef()
	 * @generated
	 */
	EReference getclassdef_Testlist();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.classdef#getSuite <em>Suite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Suite</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.classdef#getSuite()
	 * @see #getclassdef()
	 * @generated
	 */
	EReference getclassdef_Suite();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.arglist <em>arglist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>arglist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.arglist
	 * @generated
	 */
	EClass getarglist();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.arglist#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.arglist#getArguments()
	 * @see #getarglist()
	 * @generated
	 */
	EReference getarglist_Arguments();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.arglist#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Argument</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.arglist#getArgument()
	 * @see #getarglist()
	 * @generated
	 */
	EReference getarglist_Argument();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.arglist#isOptionalComma <em>Optional Comma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Comma</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.arglist#isOptionalComma()
	 * @see #getarglist()
	 * @generated
	 */
	EAttribute getarglist_OptionalComma();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.arglist#getDot1_test <em>Dot1 test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dot1 test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.arglist#getDot1_test()
	 * @see #getarglist()
	 * @generated
	 */
	EReference getarglist_Dot1_test();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.arglist#getDot1_arguments <em>Dot1 arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dot1 arguments</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.arglist#getDot1_arguments()
	 * @see #getarglist()
	 * @generated
	 */
	EReference getarglist_Dot1_arguments();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.arglist#getDot2_test <em>Dot2 test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dot2 test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.arglist#getDot2_test()
	 * @see #getarglist()
	 * @generated
	 */
	EReference getarglist_Dot2_test();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.argument <em>argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>argument</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.argument
	 * @generated
	 */
	EClass getargument();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.argument#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.argument#getTest()
	 * @see #getargument()
	 * @generated
	 */
	EReference getargument_Test();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.argument#getComp_for <em>Comp for</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comp for</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.argument#getComp_for()
	 * @see #getargument()
	 * @generated
	 */
	EReference getargument_Comp_for();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.argument#getTest2 <em>Test2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test2</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.argument#getTest2()
	 * @see #getargument()
	 * @generated
	 */
	EReference getargument_Test2();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.list_iter <em>list iter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>list iter</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.list_iter
	 * @generated
	 */
	EClass getlist_iter();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.list_iter#getList_iter <em>List iter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List iter</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.list_iter#getList_iter()
	 * @see #getlist_iter()
	 * @generated
	 */
	EReference getlist_iter_List_iter();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.list_for <em>list for</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>list for</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.list_for
	 * @generated
	 */
	EClass getlist_for();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.list_for#getExprlist <em>Exprlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exprlist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.list_for#getExprlist()
	 * @see #getlist_for()
	 * @generated
	 */
	EReference getlist_for_Exprlist();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.list_for#getTestlist_safe <em>Testlist safe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Testlist safe</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.list_for#getTestlist_safe()
	 * @see #getlist_for()
	 * @generated
	 */
	EReference getlist_for_Testlist_safe();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.list_if <em>list if</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>list if</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.list_if
	 * @generated
	 */
	EClass getlist_if();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.list_if#getOld_test <em>Old test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Old test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.list_if#getOld_test()
	 * @see #getlist_if()
	 * @generated
	 */
	EReference getlist_if_Old_test();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.comp_iter <em>comp iter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>comp iter</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.comp_iter
	 * @generated
	 */
	EClass getcomp_iter();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.comp_iter#getComp_iter <em>Comp iter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comp iter</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.comp_iter#getComp_iter()
	 * @see #getcomp_iter()
	 * @generated
	 */
	EReference getcomp_iter_Comp_iter();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.comp_for <em>comp for</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>comp for</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.comp_for
	 * @generated
	 */
	EClass getcomp_for();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.comp_for#getExprlist <em>Exprlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exprlist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.comp_for#getExprlist()
	 * @see #getcomp_for()
	 * @generated
	 */
	EReference getcomp_for_Exprlist();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.comp_for#getOr_test <em>Or test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.comp_for#getOr_test()
	 * @see #getcomp_for()
	 * @generated
	 */
	EReference getcomp_for_Or_test();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.comp_if <em>comp if</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>comp if</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.comp_if
	 * @generated
	 */
	EClass getcomp_if();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.comp_if#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Test</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.comp_if#getTest()
	 * @see #getcomp_if()
	 * @generated
	 */
	EReference getcomp_if_Test();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.testlist1 <em>testlist1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>testlist1</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist1
	 * @generated
	 */
	EClass gettestlist1();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.testlist1#getTests <em>Tests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tests</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.testlist1#getTests()
	 * @see #gettestlist1()
	 * @generated
	 */
	EReference gettestlist1_Tests();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.yield_expr <em>yield expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>yield expr</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.yield_expr
	 * @generated
	 */
	EClass getyield_expr();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.yield_expr#getTestlist <em>Testlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Testlist</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.yield_expr#getTestlist()
	 * @see #getyield_expr()
	 * @generated
	 */
	EReference getyield_expr_Testlist();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.SpellElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellElement
	 * @generated
	 */
	EClass getSpellElement();

	/**
	 * Returns the meta object for the reference list '{@link lu.ses.engineering.spell.controlflow.spell.SpellElement#getNextStatements <em>Next Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Next Statements</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellElement#getNextStatements()
	 * @see #getSpellElement()
	 * @generated
	 */
	EReference getSpellElement_NextStatements();

	/**
	 * Returns the meta object for the reference list '{@link lu.ses.engineering.spell.controlflow.spell.SpellElement#getPrevStatements <em>Prev Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prev Statements</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellElement#getPrevStatements()
	 * @see #getSpellElement()
	 * @generated
	 */
	EReference getSpellElement_PrevStatements();

	/**
	 * Returns the meta object for the reference list '{@link lu.ses.engineering.spell.controlflow.spell.SpellElement#getAlternativeNextStatements <em>Alternative Next Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alternative Next Statements</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellElement#getAlternativeNextStatements()
	 * @see #getSpellElement()
	 * @generated
	 */
	EReference getSpellElement_AlternativeNextStatements();

	/**
	 * Returns the meta object for the reference list '{@link lu.ses.engineering.spell.controlflow.spell.SpellElement#getAlternativePrevStatements <em>Alternative Prev Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Alternative Prev Statements</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.SpellElement#getAlternativePrevStatements()
	 * @see #getSpellElement()
	 * @generated
	 */
	EReference getSpellElement_AlternativePrevStatements();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.functioncall <em>functioncall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>functioncall</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.functioncall
	 * @generated
	 */
	EClass getfunctioncall();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.python_input <em>python input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>python input</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.python_input
	 * @generated
	 */
	EClass getpython_input();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.Step#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Step#getId()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Id();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.Step#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Step#getDescription()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Description();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.Verify <em>Verify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verify</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Verify
	 * @generated
	 */
	EClass getVerify();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.Verify#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Args</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Verify#getArgs()
	 * @see #getVerify()
	 * @generated
	 */
	EReference getVerify_Args();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.Send <em>Send</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Send
	 * @generated
	 */
	EClass getSend();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.Send#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Send#getCommand()
	 * @see #getSend()
	 * @generated
	 */
	EReference getSend_Command();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.Send#getVerify <em>Verify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verify</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Send#getVerify()
	 * @see #getSend()
	 * @generated
	 */
	EReference getSend_Verify();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.Send#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Send#getArguments()
	 * @see #getSend()
	 * @generated
	 */
	EReference getSend_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.Send#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Send#getValues()
	 * @see #getSend()
	 * @generated
	 */
	EReference getSend_Values();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.Send#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Send#getArgs()
	 * @see #getSend()
	 * @generated
	 */
	EReference getSend_Args();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.BuildTC <em>Build TC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build TC</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.BuildTC
	 * @generated
	 */
	EClass getBuildTC();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.BuildTC#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.BuildTC#getCommand()
	 * @see #getBuildTC()
	 * @generated
	 */
	EReference getBuildTC_Command();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.BuildTC#getVerify <em>Verify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Verify</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.BuildTC#getVerify()
	 * @see #getBuildTC()
	 * @generated
	 */
	EReference getBuildTC_Verify();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.BuildTC#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.BuildTC#getArguments()
	 * @see #getBuildTC()
	 * @generated
	 */
	EReference getBuildTC_Arguments();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.BuildTC#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.BuildTC#getValues()
	 * @see #getBuildTC()
	 * @generated
	 */
	EReference getBuildTC_Values();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.BuildTC#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.BuildTC#getArgs()
	 * @see #getBuildTC()
	 * @generated
	 */
	EReference getBuildTC_Args();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.Goto <em>Goto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goto</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Goto
	 * @generated
	 */
	EClass getGoto();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.Goto#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Goto#getVariable()
	 * @see #getGoto()
	 * @generated
	 */
	EAttribute getGoto_Variable();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.Goto#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Goto#getTarget()
	 * @see #getGoto()
	 * @generated
	 */
	EAttribute getGoto_Target();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.Goto#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expr</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Goto#getExpr()
	 * @see #getGoto()
	 * @generated
	 */
	EReference getGoto_Expr();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.Goto#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.Goto#getHash()
	 * @see #getGoto()
	 * @generated
	 */
	EAttribute getGoto_Hash();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.DisplayStep <em>Display Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Step</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.DisplayStep
	 * @generated
	 */
	EClass getDisplayStep();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.DisplayStep#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.DisplayStep#getId()
	 * @see #getDisplayStep()
	 * @generated
	 */
	EReference getDisplayStep_Id();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.DisplayStep#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.DisplayStep#getDescription()
	 * @see #getDisplayStep()
	 * @generated
	 */
	EReference getDisplayStep_Description();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.ShowTM <em>Show TM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Show TM</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.ShowTM
	 * @generated
	 */
	EClass getShowTM();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.ShowTM#getTms <em>Tms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tms</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.ShowTM#getTms()
	 * @see #getShowTM()
	 * @generated
	 */
	EReference getShowTM_Tms();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.ShowTM#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.ShowTM#getArgs()
	 * @see #getShowTM()
	 * @generated
	 */
	EReference getShowTM_Args();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.GetTM <em>Get TM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get TM</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.GetTM
	 * @generated
	 */
	EClass getGetTM();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.GetTM#getTm <em>Tm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tm</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.GetTM#getTm()
	 * @see #getGetTM()
	 * @generated
	 */
	EReference getGetTM_Tm();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.GetTM#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.GetTM#getArgs()
	 * @see #getGetTM()
	 * @generated
	 */
	EReference getGetTM_Args();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.assignment_stmt <em>assignment stmt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>assignment stmt</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.assignment_stmt
	 * @generated
	 */
	EClass getassignment_stmt();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.assignment_stmt#getAssignments <em>Assignments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assignments</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.assignment_stmt#getAssignments()
	 * @see #getassignment_stmt()
	 * @generated
	 */
	EReference getassignment_stmt_Assignments();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.ChangeLanguageConfig <em>Change Language Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Language Config</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.ChangeLanguageConfig
	 * @generated
	 */
	EClass getChangeLanguageConfig();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.controlflow.spell.ChangeLanguageConfig#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.ChangeLanguageConfig#getStatement()
	 * @see #getChangeLanguageConfig()
	 * @generated
	 */
	EAttribute getChangeLanguageConfig_Statement();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.ChangeLanguageConfig#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Args</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.ChangeLanguageConfig#getArgs()
	 * @see #getChangeLanguageConfig()
	 * @generated
	 */
	EReference getChangeLanguageConfig_Args();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.spell.controlflow.spell.SetLimits <em>Set Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Limits</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.SetLimits
	 * @generated
	 */
	EClass getSetLimits();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.controlflow.spell.SetLimits#getTm <em>Tm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tm</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.SetLimits#getTm()
	 * @see #getSetLimits()
	 * @generated
	 */
	EReference getSetLimits_Tm();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.controlflow.spell.SetLimits#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Args</em>'.
	 * @see lu.ses.engineering.spell.controlflow.spell.SetLimits#getArgs()
	 * @see #getSetLimits()
	 * @generated
	 */
	EReference getSetLimits_Args();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpellFactory getSpellFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.single_inputImpl <em>single input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.single_inputImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getsingle_input()
		 * @generated
		 */
		EClass SINGLE_INPUT = eINSTANCE.getsingle_input();

		/**
		 * The meta object literal for the '<em><b>Stmt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_INPUT__STMT = eINSTANCE.getsingle_input_Stmt();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.file_inputImpl <em>file input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.file_inputImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getfile_input()
		 * @generated
		 */
		EClass FILE_INPUT = eINSTANCE.getfile_input();

		/**
		 * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_INPUT__STMTS = eINSTANCE.getfile_input_Stmts();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.eval_inputImpl <em>eval input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.eval_inputImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#geteval_input()
		 * @generated
		 */
		EClass EVAL_INPUT = eINSTANCE.geteval_input();

		/**
		 * The meta object literal for the '<em><b>Testlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVAL_INPUT__TESTLIST = eINSTANCE.geteval_input_Testlist();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.decoratorImpl <em>decorator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.decoratorImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdecorator()
		 * @generated
		 */
		EClass DECORATOR = eINSTANCE.getdecorator();

		/**
		 * The meta object literal for the '<em><b>Dotted name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATOR__DOTTED_NAME = eINSTANCE.getdecorator_Dotted_name();

		/**
		 * The meta object literal for the '<em><b>Round Bracket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECORATOR__ROUND_BRACKET = eINSTANCE.getdecorator_RoundBracket();

		/**
		 * The meta object literal for the '<em><b>Arglist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATOR__ARGLIST = eINSTANCE.getdecorator_Arglist();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.decoratorsImpl <em>decorators</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.decoratorsImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdecorators()
		 * @generated
		 */
		EClass DECORATORS = eINSTANCE.getdecorators();

		/**
		 * The meta object literal for the '<em><b>Decorators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATORS__DECORATORS = eINSTANCE.getdecorators_Decorators();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.decoratedImpl <em>decorated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.decoratedImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdecorated()
		 * @generated
		 */
		EClass DECORATED = eINSTANCE.getdecorated();

		/**
		 * The meta object literal for the '<em><b>Decorators</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATED__DECORATORS = eINSTANCE.getdecorated_Decorators();

		/**
		 * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECORATED__DEF = eINSTANCE.getdecorated_Def();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.funcdefImpl <em>funcdef</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.funcdefImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getfuncdef()
		 * @generated
		 */
		EClass FUNCDEF = eINSTANCE.getfuncdef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCDEF__NAME = eINSTANCE.getfuncdef_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCDEF__PARAMETERS = eINSTANCE.getfuncdef_Parameters();

		/**
		 * The meta object literal for the '<em><b>Suite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCDEF__SUITE = eINSTANCE.getfuncdef_Suite();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.parametersImpl <em>parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.parametersImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getparameters()
		 * @generated
		 */
		EClass PARAMETERS = eINSTANCE.getparameters();

		/**
		 * The meta object literal for the '<em><b>Varargslist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETERS__VARARGSLIST = eINSTANCE.getparameters_Varargslist();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.varargslist_elementImpl <em>varargslist element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.varargslist_elementImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getvarargslist_element()
		 * @generated
		 */
		EClass VARARGSLIST_ELEMENT = eINSTANCE.getvarargslist_element();

		/**
		 * The meta object literal for the '<em><b>Fpdef</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARARGSLIST_ELEMENT__FPDEF = eINSTANCE.getvarargslist_element_Fpdef();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARARGSLIST_ELEMENT__TEST = eINSTANCE.getvarargslist_element_Test();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.varargslistImpl <em>varargslist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.varargslistImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getvarargslist()
		 * @generated
		 */
		EClass VARARGSLIST = eINSTANCE.getvarargslist();

		/**
		 * The meta object literal for the '<em><b>Varargs1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARARGSLIST__VARARGS1 = eINSTANCE.getvarargslist_Varargs1();

		/**
		 * The meta object literal for the '<em><b>Dot1 Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARARGSLIST__DOT1_NAME = eINSTANCE.getvarargslist_Dot1Name();

		/**
		 * The meta object literal for the '<em><b>Dot2 Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARARGSLIST__DOT2_NAME = eINSTANCE.getvarargslist_Dot2Name();

		/**
		 * The meta object literal for the '<em><b>Dot3 Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARARGSLIST__DOT3_NAME = eINSTANCE.getvarargslist_Dot3Name();

		/**
		 * The meta object literal for the '<em><b>Vararg2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARARGSLIST__VARARG2 = eINSTANCE.getvarargslist_Vararg2();

		/**
		 * The meta object literal for the '<em><b>Varargs3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARARGSLIST__VARARGS3 = eINSTANCE.getvarargslist_Varargs3();

		/**
		 * The meta object literal for the '<em><b>Additional Comma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARARGSLIST__ADDITIONAL_COMMA = eINSTANCE.getvarargslist_AdditionalComma();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.fpdefImpl <em>fpdef</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.fpdefImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getfpdef()
		 * @generated
		 */
		EClass FPDEF = eINSTANCE.getfpdef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPDEF__NAME = eINSTANCE.getfpdef_Name();

		/**
		 * The meta object literal for the '<em><b>Fplist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPDEF__FPLIST = eINSTANCE.getfpdef_Fplist();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.fplistImpl <em>fplist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.fplistImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getfplist()
		 * @generated
		 */
		EClass FPLIST = eINSTANCE.getfplist();

		/**
		 * The meta object literal for the '<em><b>Def1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPLIST__DEF1 = eINSTANCE.getfplist_Def1();

		/**
		 * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FPLIST__DEFINITIONS = eINSTANCE.getfplist_Definitions();

		/**
		 * The meta object literal for the '<em><b>Optional Semicolon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPLIST__OPTIONAL_SEMICOLON = eINSTANCE.getfplist_OptionalSemicolon();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.stmtImpl <em>stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getstmt()
		 * @generated
		 */
		EClass STMT = eINSTANCE.getstmt();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.simple_stmtImpl <em>simple stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.simple_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getsimple_stmt()
		 * @generated
		 */
		EClass SIMPLE_STMT = eINSTANCE.getsimple_stmt();

		/**
		 * The meta object literal for the '<em><b>Stmt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_STMT__STMT = eINSTANCE.getsimple_stmt_Stmt();

		/**
		 * The meta object literal for the '<em><b>Additional Comma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_STMT__ADDITIONAL_COMMA = eINSTANCE.getsimple_stmt_AdditionalComma();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.small_stmtImpl <em>small stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.small_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getsmall_stmt()
		 * @generated
		 */
		EClass SMALL_STMT = eINSTANCE.getsmall_stmt();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.expr_stmtImpl <em>expr stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.expr_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getexpr_stmt()
		 * @generated
		 */
		EClass EXPR_STMT = eINSTANCE.getexpr_stmt();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPR_STMT__LEFT = eINSTANCE.getexpr_stmt_Left();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPR_STMT__SYMBOL = eINSTANCE.getexpr_stmt_Symbol();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPR_STMT__RIGHT = eINSTANCE.getexpr_stmt_Right();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.yield_or_testlistImpl <em>yield or testlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.yield_or_testlistImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getyield_or_testlist()
		 * @generated
		 */
		EClass YIELD_OR_TESTLIST = eINSTANCE.getyield_or_testlist();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.del_stmtImpl <em>del stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.del_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdel_stmt()
		 * @generated
		 */
		EClass DEL_STMT = eINSTANCE.getdel_stmt();

		/**
		 * The meta object literal for the '<em><b>Exprlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEL_STMT__EXPRLIST = eINSTANCE.getdel_stmt_Exprlist();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.pass_stmtImpl <em>pass stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.pass_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getpass_stmt()
		 * @generated
		 */
		EClass PASS_STMT = eINSTANCE.getpass_stmt();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.flow_stmtImpl <em>flow stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.flow_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getflow_stmt()
		 * @generated
		 */
		EClass FLOW_STMT = eINSTANCE.getflow_stmt();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.break_stmtImpl <em>break stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.break_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getbreak_stmt()
		 * @generated
		 */
		EClass BREAK_STMT = eINSTANCE.getbreak_stmt();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.continue_stmtImpl <em>continue stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.continue_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getcontinue_stmt()
		 * @generated
		 */
		EClass CONTINUE_STMT = eINSTANCE.getcontinue_stmt();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.return_stmtImpl <em>return stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.return_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getreturn_stmt()
		 * @generated
		 */
		EClass RETURN_STMT = eINSTANCE.getreturn_stmt();

		/**
		 * The meta object literal for the '<em><b>Testlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN_STMT__TESTLIST = eINSTANCE.getreturn_stmt_Testlist();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.yield_stmtImpl <em>yield stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.yield_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getyield_stmt()
		 * @generated
		 */
		EClass YIELD_STMT = eINSTANCE.getyield_stmt();

		/**
		 * The meta object literal for the '<em><b>Yield expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YIELD_STMT__YIELD_EXPR = eINSTANCE.getyield_stmt_Yield_expr();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.raise_stmtImpl <em>raise stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.raise_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getraise_stmt()
		 * @generated
		 */
		EClass RAISE_STMT = eINSTANCE.getraise_stmt();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAISE_STMT__TESTS = eINSTANCE.getraise_stmt_Tests();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.import_stmtImpl <em>import stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.import_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getimport_stmt()
		 * @generated
		 */
		EClass IMPORT_STMT = eINSTANCE.getimport_stmt();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.import_nameImpl <em>import name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.import_nameImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getimport_name()
		 * @generated
		 */
		EClass IMPORT_NAME = eINSTANCE.getimport_name();

		/**
		 * The meta object literal for the '<em><b>Dotted as names</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_NAME__DOTTED_AS_NAMES = eINSTANCE.getimport_name_Dotted_as_names();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.import_fromImpl <em>import from</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.import_fromImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getimport_from()
		 * @generated
		 */
		EClass IMPORT_FROM = eINSTANCE.getimport_from();

		/**
		 * The meta object literal for the '<em><b>Dots</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_FROM__DOTS = eINSTANCE.getimport_from_Dots();

		/**
		 * The meta object literal for the '<em><b>Dotted name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_FROM__DOTTED_NAME = eINSTANCE.getimport_from_Dotted_name();

		/**
		 * The meta object literal for the '<em><b>Dots2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_FROM__DOTS2 = eINSTANCE.getimport_from_Dots2();

		/**
		 * The meta object literal for the '<em><b>Round Bracket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_FROM__ROUND_BRACKET = eINSTANCE.getimport_from_RoundBracket();

		/**
		 * The meta object literal for the '<em><b>Import as names</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_FROM__IMPORT_AS_NAMES = eINSTANCE.getimport_from_Import_as_names();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.import_as_nameImpl <em>import as name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.import_as_nameImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getimport_as_name()
		 * @generated
		 */
		EClass IMPORT_AS_NAME = eINSTANCE.getimport_as_name();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_AS_NAME__NAME = eINSTANCE.getimport_as_name_Name();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_AS_NAME__IDENTIFIER = eINSTANCE.getimport_as_name_Identifier();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.dotted_as_nameImpl <em>dotted as name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.dotted_as_nameImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdotted_as_name()
		 * @generated
		 */
		EClass DOTTED_AS_NAME = eINSTANCE.getdotted_as_name();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOTTED_AS_NAME__NAME = eINSTANCE.getdotted_as_name_Name();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOTTED_AS_NAME__IDENTIFIER = eINSTANCE.getdotted_as_name_Identifier();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.import_as_namesImpl <em>import as names</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.import_as_namesImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getimport_as_names()
		 * @generated
		 */
		EClass IMPORT_AS_NAMES = eINSTANCE.getimport_as_names();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORT_AS_NAMES__IMPORTS = eINSTANCE.getimport_as_names_Imports();

		/**
		 * The meta object literal for the '<em><b>Optional Comma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_AS_NAMES__OPTIONAL_COMMA = eINSTANCE.getimport_as_names_OptionalComma();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.dotted_as_namesImpl <em>dotted as names</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.dotted_as_namesImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdotted_as_names()
		 * @generated
		 */
		EClass DOTTED_AS_NAMES = eINSTANCE.getdotted_as_names();

		/**
		 * The meta object literal for the '<em><b>Dotted names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOTTED_AS_NAMES__DOTTED_NAMES = eINSTANCE.getdotted_as_names_Dotted_names();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.global_stmtImpl <em>global stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.global_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getglobal_stmt()
		 * @generated
		 */
		EClass GLOBAL_STMT = eINSTANCE.getglobal_stmt();

		/**
		 * The meta object literal for the '<em><b>Globals</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOBAL_STMT__GLOBALS = eINSTANCE.getglobal_stmt_Globals();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.exec_stmtImpl <em>exec stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.exec_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getexec_stmt()
		 * @generated
		 */
		EClass EXEC_STMT = eINSTANCE.getexec_stmt();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_STMT__EXPR = eINSTANCE.getexec_stmt_Expr();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXEC_STMT__TESTS = eINSTANCE.getexec_stmt_Tests();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.assert_stmtImpl <em>assert stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.assert_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getassert_stmt()
		 * @generated
		 */
		EClass ASSERT_STMT = eINSTANCE.getassert_stmt();

		/**
		 * The meta object literal for the '<em><b>Assers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERT_STMT__ASSERS = eINSTANCE.getassert_stmt_Assers();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.compound_stmtImpl <em>compound stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.compound_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getcompound_stmt()
		 * @generated
		 */
		EClass COMPOUND_STMT = eINSTANCE.getcompound_stmt();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.else_if_stmtImpl <em>else if stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.else_if_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getelse_if_stmt()
		 * @generated
		 */
		EClass ELSE_IF_STMT = eINSTANCE.getelse_if_stmt();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_IF_STMT__TEST = eINSTANCE.getelse_if_stmt_Test();

		/**
		 * The meta object literal for the '<em><b>Suite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELSE_IF_STMT__SUITE = eINSTANCE.getelse_if_stmt_Suite();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.if_stmtImpl <em>if stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.if_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getif_stmt()
		 * @generated
		 */
		EClass IF_STMT = eINSTANCE.getif_stmt();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STMT__TEST = eINSTANCE.getif_stmt_Test();

		/**
		 * The meta object literal for the '<em><b>Suite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STMT__SUITE = eINSTANCE.getif_stmt_Suite();

		/**
		 * The meta object literal for the '<em><b>Else if stmts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STMT__ELSE_IF_STMTS = eINSTANCE.getif_stmt_Else_if_stmts();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_STMT__ELSE = eINSTANCE.getif_stmt_Else();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.while_stmtImpl <em>while stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.while_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getwhile_stmt()
		 * @generated
		 */
		EClass WHILE_STMT = eINSTANCE.getwhile_stmt();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STMT__TEST = eINSTANCE.getwhile_stmt_Test();

		/**
		 * The meta object literal for the '<em><b>Suite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STMT__SUITE = eINSTANCE.getwhile_stmt_Suite();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_STMT__ELSE = eINSTANCE.getwhile_stmt_Else();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.for_stmtImpl <em>for stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.for_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getfor_stmt()
		 * @generated
		 */
		EClass FOR_STMT = eINSTANCE.getfor_stmt();

		/**
		 * The meta object literal for the '<em><b>Exprlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STMT__EXPRLIST = eINSTANCE.getfor_stmt_Exprlist();

		/**
		 * The meta object literal for the '<em><b>Testlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STMT__TESTLIST = eINSTANCE.getfor_stmt_Testlist();

		/**
		 * The meta object literal for the '<em><b>Suite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STMT__SUITE = eINSTANCE.getfor_stmt_Suite();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOR_STMT__ELSE = eINSTANCE.getfor_stmt_Else();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.try_stmtImpl <em>try stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.try_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#gettry_stmt()
		 * @generated
		 */
		EClass TRY_STMT = eINSTANCE.gettry_stmt();

		/**
		 * The meta object literal for the '<em><b>Suite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_STMT__SUITE = eINSTANCE.gettry_stmt_Suite();

		/**
		 * The meta object literal for the '<em><b>Except clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_STMT__EXCEPT_CLAUSE = eINSTANCE.gettry_stmt_Except_clause();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_STMT__ELSE = eINSTANCE.gettry_stmt_Else();

		/**
		 * The meta object literal for the '<em><b>Finally</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_STMT__FINALLY = eINSTANCE.gettry_stmt_Finally();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.with_stmtImpl <em>with stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.with_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getwith_stmt()
		 * @generated
		 */
		EClass WITH_STMT = eINSTANCE.getwith_stmt();

		/**
		 * The meta object literal for the '<em><b>With item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITH_STMT__WITH_ITEM = eINSTANCE.getwith_stmt_With_item();

		/**
		 * The meta object literal for the '<em><b>Suite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITH_STMT__SUITE = eINSTANCE.getwith_stmt_Suite();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.with_itemImpl <em>with item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.with_itemImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getwith_item()
		 * @generated
		 */
		EClass WITH_ITEM = eINSTANCE.getwith_item();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITH_ITEM__TEST = eINSTANCE.getwith_item_Test();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WITH_ITEM__EXPR = eINSTANCE.getwith_item_Expr();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.except_clauseImpl <em>except clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.except_clauseImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getexcept_clause()
		 * @generated
		 */
		EClass EXCEPT_CLAUSE = eINSTANCE.getexcept_clause();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPT_CLAUSE__TEST = eINSTANCE.getexcept_clause_Test();

		/**
		 * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCEPT_CLAUSE__SIGN = eINSTANCE.getexcept_clause_Sign();

		/**
		 * The meta object literal for the '<em><b>Next test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPT_CLAUSE__NEXT_TEST = eINSTANCE.getexcept_clause_Next_test();

		/**
		 * The meta object literal for the '<em><b>Suite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXCEPT_CLAUSE__SUITE = eINSTANCE.getexcept_clause_Suite();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.suiteImpl <em>suite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.suiteImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getsuite()
		 * @generated
		 */
		EClass SUITE = eINSTANCE.getsuite();

		/**
		 * The meta object literal for the '<em><b>Stmts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUITE__STMTS = eINSTANCE.getsuite_Stmts();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.testlist_safeImpl <em>testlist safe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.testlist_safeImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#gettestlist_safe()
		 * @generated
		 */
		EClass TESTLIST_SAFE = eINSTANCE.gettestlist_safe();

		/**
		 * The meta object literal for the '<em><b>Old test</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTLIST_SAFE__OLD_TEST = eINSTANCE.gettestlist_safe_Old_test();

		/**
		 * The meta object literal for the '<em><b>Optional Coma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTLIST_SAFE__OPTIONAL_COMA = eINSTANCE.gettestlist_safe_OptionalComa();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.testImpl <em>test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.testImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#gettest()
		 * @generated
		 */
		EClass TEST = eINSTANCE.gettest();

		/**
		 * The meta object literal for the '<em><b>If test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__IF_TEST = eINSTANCE.gettest_If_test();

		/**
		 * The meta object literal for the '<em><b>If else test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST__IF_ELSE_TEST = eINSTANCE.gettest_If_else_test();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.or_testImpl <em>or test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.or_testImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getor_test()
		 * @generated
		 */
		EClass OR_TEST = eINSTANCE.getor_test();

		/**
		 * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OR_TEST__SIGN = eINSTANCE.getor_test_Sign();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.and_testImpl <em>and test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.and_testImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getand_test()
		 * @generated
		 */
		EClass AND_TEST = eINSTANCE.getand_test();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.not_testImpl <em>not test</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.not_testImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getnot_test()
		 * @generated
		 */
		EClass NOT_TEST = eINSTANCE.getnot_test();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOT_TEST__NOT = eINSTANCE.getnot_test_Not();

		/**
		 * The meta object literal for the '<em><b>Comparison</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_TEST__COMPARISON = eINSTANCE.getnot_test_Comparison();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.comparisonImpl <em>comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.comparisonImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getcomparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getcomparison();

		/**
		 * The meta object literal for the '<em><b>Comp op</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__COMP_OP = eINSTANCE.getcomparison_Comp_op();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.exprImpl <em>expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.exprImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getexpr()
		 * @generated
		 */
		EClass EXPR = eINSTANCE.getexpr();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.xor_exprImpl <em>xor expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.xor_exprImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getxor_expr()
		 * @generated
		 */
		EClass XOR_EXPR = eINSTANCE.getxor_expr();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.and_exprImpl <em>and expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.and_exprImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getand_expr()
		 * @generated
		 */
		EClass AND_EXPR = eINSTANCE.getand_expr();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.shift_exprImpl <em>shift expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.shift_exprImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getshift_expr()
		 * @generated
		 */
		EClass SHIFT_EXPR = eINSTANCE.getshift_expr();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.arith_exprImpl <em>arith expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.arith_exprImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getarith_expr()
		 * @generated
		 */
		EClass ARITH_EXPR = eINSTANCE.getarith_expr();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.termImpl <em>term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.termImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getterm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getterm();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.factorImpl <em>factor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.factorImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getfactor()
		 * @generated
		 */
		EClass FACTOR = eINSTANCE.getfactor();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACTOR__FACTOR = eINSTANCE.getfactor_Factor();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.powerImpl <em>power</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.powerImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getpower()
		 * @generated
		 */
		EClass POWER = eINSTANCE.getpower();

		/**
		 * The meta object literal for the '<em><b>Atom</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER__ATOM = eINSTANCE.getpower_Atom();

		/**
		 * The meta object literal for the '<em><b>Trailer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POWER__TRAILER = eINSTANCE.getpower_Trailer();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.yield_or_testlist_compImpl <em>yield or testlist comp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.yield_or_testlist_compImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getyield_or_testlist_comp()
		 * @generated
		 */
		EClass YIELD_OR_TESTLIST_COMP = eINSTANCE.getyield_or_testlist_comp();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.atomImpl <em>atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.atomImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getatom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getatom();

		/**
		 * The meta object literal for the '<em><b>Round Bracket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM__ROUND_BRACKET = eINSTANCE.getatom_RoundBracket();

		/**
		 * The meta object literal for the '<em><b>Yield or testlist comp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__YIELD_OR_TESTLIST_COMP = eINSTANCE.getatom_Yield_or_testlist_comp();

		/**
		 * The meta object literal for the '<em><b>Square Bracket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM__SQUARE_BRACKET = eINSTANCE.getatom_SquareBracket();

		/**
		 * The meta object literal for the '<em><b>Listmaker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__LISTMAKER = eINSTANCE.getatom_Listmaker();

		/**
		 * The meta object literal for the '<em><b>Curly Bracket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM__CURLY_BRACKET = eINSTANCE.getatom_CurlyBracket();

		/**
		 * The meta object literal for the '<em><b>Dictorsetmaker</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__DICTORSETMAKER = eINSTANCE.getatom_Dictorsetmaker();

		/**
		 * The meta object literal for the '<em><b>Testlist1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__TESTLIST1 = eINSTANCE.getatom_Testlist1();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM__NAME = eINSTANCE.getatom_Name();

		/**
		 * The meta object literal for the '<em><b>Strings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOM__STRINGS = eINSTANCE.getatom_Strings();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.listmakerImpl <em>listmaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.listmakerImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getlistmaker()
		 * @generated
		 */
		EClass LISTMAKER = eINSTANCE.getlistmaker();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTMAKER__TEST = eINSTANCE.getlistmaker_Test();

		/**
		 * The meta object literal for the '<em><b>List for</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTMAKER__LIST_FOR = eINSTANCE.getlistmaker_List_for();

		/**
		 * The meta object literal for the '<em><b>Additional Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTMAKER__ADDITIONAL_TESTS = eINSTANCE.getlistmaker_AdditionalTests();

		/**
		 * The meta object literal for the '<em><b>Optional Comma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LISTMAKER__OPTIONAL_COMMA = eINSTANCE.getlistmaker_OptionalComma();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.testlist_compImpl <em>testlist comp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.testlist_compImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#gettestlist_comp()
		 * @generated
		 */
		EClass TESTLIST_COMP = eINSTANCE.gettestlist_comp();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTLIST_COMP__TEST = eINSTANCE.gettestlist_comp_Test();

		/**
		 * The meta object literal for the '<em><b>Comp for</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTLIST_COMP__COMP_FOR = eINSTANCE.gettestlist_comp_Comp_for();

		/**
		 * The meta object literal for the '<em><b>Additional Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTLIST_COMP__ADDITIONAL_TESTS = eINSTANCE.gettestlist_comp_AdditionalTests();

		/**
		 * The meta object literal for the '<em><b>Optional Comma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTLIST_COMP__OPTIONAL_COMMA = eINSTANCE.gettestlist_comp_OptionalComma();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.lambdefImpl <em>lambdef</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.lambdefImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getlambdef()
		 * @generated
		 */
		EClass LAMBDEF = eINSTANCE.getlambdef();

		/**
		 * The meta object literal for the '<em><b>Varargslist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDEF__VARARGSLIST = eINSTANCE.getlambdef_Varargslist();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.trailerImpl <em>trailer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.trailerImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#gettrailer()
		 * @generated
		 */
		EClass TRAILER = eINSTANCE.gettrailer();

		/**
		 * The meta object literal for the '<em><b>Round Bracket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAILER__ROUND_BRACKET = eINSTANCE.gettrailer_RoundBracket();

		/**
		 * The meta object literal for the '<em><b>Arglist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAILER__ARGLIST = eINSTANCE.gettrailer_Arglist();

		/**
		 * The meta object literal for the '<em><b>Square Bracket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAILER__SQUARE_BRACKET = eINSTANCE.gettrailer_SquareBracket();

		/**
		 * The meta object literal for the '<em><b>Subscriptlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRAILER__SUBSCRIPTLIST = eINSTANCE.gettrailer_Subscriptlist();

		/**
		 * The meta object literal for the '<em><b>Dot Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAILER__DOT_NAME = eINSTANCE.gettrailer_DotName();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.subscriptlistImpl <em>subscriptlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.subscriptlistImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getsubscriptlist()
		 * @generated
		 */
		EClass SUBSCRIPTLIST = eINSTANCE.getsubscriptlist();

		/**
		 * The meta object literal for the '<em><b>Subscript</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPTLIST__SUBSCRIPT = eINSTANCE.getsubscriptlist_Subscript();

		/**
		 * The meta object literal for the '<em><b>Optional Comma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPTLIST__OPTIONAL_COMMA = eINSTANCE.getsubscriptlist_OptionalComma();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.subscriptImpl <em>subscript</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.subscriptImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getsubscript()
		 * @generated
		 */
		EClass SUBSCRIPT = eINSTANCE.getsubscript();

		/**
		 * The meta object literal for the '<em><b>Subscript1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPT__SUBSCRIPT1 = eINSTANCE.getsubscript_Subscript1();

		/**
		 * The meta object literal for the '<em><b>Subscript2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPT__SUBSCRIPT2 = eINSTANCE.getsubscript_Subscript2();

		/**
		 * The meta object literal for the '<em><b>Sliceop</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBSCRIPT__SLICEOP = eINSTANCE.getsubscript_Sliceop();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSCRIPT__SYMBOL = eINSTANCE.getsubscript_Symbol();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.sliceopImpl <em>sliceop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.sliceopImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getsliceop()
		 * @generated
		 */
		EClass SLICEOP = eINSTANCE.getsliceop();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SLICEOP__TEST = eINSTANCE.getsliceop_Test();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.exprlistImpl <em>exprlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.exprlistImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getexprlist()
		 * @generated
		 */
		EClass EXPRLIST = eINSTANCE.getexprlist();

		/**
		 * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRLIST__EXPRS = eINSTANCE.getexprlist_Exprs();

		/**
		 * The meta object literal for the '<em><b>Optional Comma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRLIST__OPTIONAL_COMMA = eINSTANCE.getexprlist_OptionalComma();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.testlistImpl <em>testlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.testlistImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#gettestlist()
		 * @generated
		 */
		EClass TESTLIST = eINSTANCE.gettestlist();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTLIST__TESTS = eINSTANCE.gettestlist_Tests();

		/**
		 * The meta object literal for the '<em><b>Optional Comma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TESTLIST__OPTIONAL_COMMA = eINSTANCE.gettestlist_OptionalComma();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.dictorset_entryImpl <em>dictorset entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.dictorset_entryImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdictorset_entry()
		 * @generated
		 */
		EClass DICTORSET_ENTRY = eINSTANCE.getdictorset_entry();

		/**
		 * The meta object literal for the '<em><b>Test1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTORSET_ENTRY__TEST1 = eINSTANCE.getdictorset_entry_Test1();

		/**
		 * The meta object literal for the '<em><b>Test2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTORSET_ENTRY__TEST2 = eINSTANCE.getdictorset_entry_Test2();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.dictorsetmakerImpl <em>dictorsetmaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.dictorsetmakerImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getdictorsetmaker()
		 * @generated
		 */
		EClass DICTORSETMAKER = eINSTANCE.getdictorsetmaker();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTORSETMAKER__ENTRIES = eINSTANCE.getdictorsetmaker_Entries();

		/**
		 * The meta object literal for the '<em><b>Comp for</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTORSETMAKER__COMP_FOR = eINSTANCE.getdictorsetmaker_Comp_for();

		/**
		 * The meta object literal for the '<em><b>Optional Comma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICTORSETMAKER__OPTIONAL_COMMA = eINSTANCE.getdictorsetmaker_OptionalComma();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICTORSETMAKER__TESTS = eINSTANCE.getdictorsetmaker_Tests();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.classdefImpl <em>classdef</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.classdefImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getclassdef()
		 * @generated
		 */
		EClass CLASSDEF = eINSTANCE.getclassdef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSDEF__NAME = eINSTANCE.getclassdef_Name();

		/**
		 * The meta object literal for the '<em><b>Round Brackets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASSDEF__ROUND_BRACKETS = eINSTANCE.getclassdef_RoundBrackets();

		/**
		 * The meta object literal for the '<em><b>Testlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSDEF__TESTLIST = eINSTANCE.getclassdef_Testlist();

		/**
		 * The meta object literal for the '<em><b>Suite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSDEF__SUITE = eINSTANCE.getclassdef_Suite();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.arglistImpl <em>arglist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.arglistImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getarglist()
		 * @generated
		 */
		EClass ARGLIST = eINSTANCE.getarglist();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGLIST__ARGUMENTS = eINSTANCE.getarglist_Arguments();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGLIST__ARGUMENT = eINSTANCE.getarglist_Argument();

		/**
		 * The meta object literal for the '<em><b>Optional Comma</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGLIST__OPTIONAL_COMMA = eINSTANCE.getarglist_OptionalComma();

		/**
		 * The meta object literal for the '<em><b>Dot1 test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGLIST__DOT1_TEST = eINSTANCE.getarglist_Dot1_test();

		/**
		 * The meta object literal for the '<em><b>Dot1 arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGLIST__DOT1_ARGUMENTS = eINSTANCE.getarglist_Dot1_arguments();

		/**
		 * The meta object literal for the '<em><b>Dot2 test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGLIST__DOT2_TEST = eINSTANCE.getarglist_Dot2_test();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.argumentImpl <em>argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.argumentImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getargument()
		 * @generated
		 */
		EClass ARGUMENT = eINSTANCE.getargument();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__TEST = eINSTANCE.getargument_Test();

		/**
		 * The meta object literal for the '<em><b>Comp for</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__COMP_FOR = eINSTANCE.getargument_Comp_for();

		/**
		 * The meta object literal for the '<em><b>Test2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARGUMENT__TEST2 = eINSTANCE.getargument_Test2();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.list_iterImpl <em>list iter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.list_iterImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getlist_iter()
		 * @generated
		 */
		EClass LIST_ITER = eINSTANCE.getlist_iter();

		/**
		 * The meta object literal for the '<em><b>List iter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ITER__LIST_ITER = eINSTANCE.getlist_iter_List_iter();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.list_forImpl <em>list for</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.list_forImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getlist_for()
		 * @generated
		 */
		EClass LIST_FOR = eINSTANCE.getlist_for();

		/**
		 * The meta object literal for the '<em><b>Exprlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_FOR__EXPRLIST = eINSTANCE.getlist_for_Exprlist();

		/**
		 * The meta object literal for the '<em><b>Testlist safe</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_FOR__TESTLIST_SAFE = eINSTANCE.getlist_for_Testlist_safe();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.list_ifImpl <em>list if</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.list_ifImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getlist_if()
		 * @generated
		 */
		EClass LIST_IF = eINSTANCE.getlist_if();

		/**
		 * The meta object literal for the '<em><b>Old test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_IF__OLD_TEST = eINSTANCE.getlist_if_Old_test();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.comp_iterImpl <em>comp iter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.comp_iterImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getcomp_iter()
		 * @generated
		 */
		EClass COMP_ITER = eINSTANCE.getcomp_iter();

		/**
		 * The meta object literal for the '<em><b>Comp iter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_ITER__COMP_ITER = eINSTANCE.getcomp_iter_Comp_iter();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.comp_forImpl <em>comp for</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.comp_forImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getcomp_for()
		 * @generated
		 */
		EClass COMP_FOR = eINSTANCE.getcomp_for();

		/**
		 * The meta object literal for the '<em><b>Exprlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_FOR__EXPRLIST = eINSTANCE.getcomp_for_Exprlist();

		/**
		 * The meta object literal for the '<em><b>Or test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_FOR__OR_TEST = eINSTANCE.getcomp_for_Or_test();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.comp_ifImpl <em>comp if</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.comp_ifImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getcomp_if()
		 * @generated
		 */
		EClass COMP_IF = eINSTANCE.getcomp_if();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMP_IF__TEST = eINSTANCE.getcomp_if_Test();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.testlist1Impl <em>testlist1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.testlist1Impl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#gettestlist1()
		 * @generated
		 */
		EClass TESTLIST1 = eINSTANCE.gettestlist1();

		/**
		 * The meta object literal for the '<em><b>Tests</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TESTLIST1__TESTS = eINSTANCE.gettestlist1_Tests();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.yield_exprImpl <em>yield expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.yield_exprImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getyield_expr()
		 * @generated
		 */
		EClass YIELD_EXPR = eINSTANCE.getyield_expr();

		/**
		 * The meta object literal for the '<em><b>Testlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference YIELD_EXPR__TESTLIST = eINSTANCE.getyield_expr_Testlist();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.SpellElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellElementImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getSpellElement()
		 * @generated
		 */
		EClass SPELL_ELEMENT = eINSTANCE.getSpellElement();

		/**
		 * The meta object literal for the '<em><b>Next Statements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPELL_ELEMENT__NEXT_STATEMENTS = eINSTANCE.getSpellElement_NextStatements();

		/**
		 * The meta object literal for the '<em><b>Prev Statements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPELL_ELEMENT__PREV_STATEMENTS = eINSTANCE.getSpellElement_PrevStatements();

		/**
		 * The meta object literal for the '<em><b>Alternative Next Statements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPELL_ELEMENT__ALTERNATIVE_NEXT_STATEMENTS = eINSTANCE.getSpellElement_AlternativeNextStatements();

		/**
		 * The meta object literal for the '<em><b>Alternative Prev Statements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPELL_ELEMENT__ALTERNATIVE_PREV_STATEMENTS = eINSTANCE.getSpellElement_AlternativePrevStatements();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.functioncallImpl <em>functioncall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.functioncallImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getfunctioncall()
		 * @generated
		 */
		EClass FUNCTIONCALL = eINSTANCE.getfunctioncall();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.python_inputImpl <em>python input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.python_inputImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getpython_input()
		 * @generated
		 */
		EClass PYTHON_INPUT = eINSTANCE.getpython_input();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.StepImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ID = eINSTANCE.getStep_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__DESCRIPTION = eINSTANCE.getStep_Description();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.VerifyImpl <em>Verify</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.VerifyImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getVerify()
		 * @generated
		 */
		EClass VERIFY = eINSTANCE.getVerify();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERIFY__ARGS = eINSTANCE.getVerify_Args();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.SendImpl <em>Send</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SendImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getSend()
		 * @generated
		 */
		EClass SEND = eINSTANCE.getSend();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND__COMMAND = eINSTANCE.getSend_Command();

		/**
		 * The meta object literal for the '<em><b>Verify</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND__VERIFY = eINSTANCE.getSend_Verify();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND__ARGUMENTS = eINSTANCE.getSend_Arguments();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND__VALUES = eINSTANCE.getSend_Values();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND__ARGS = eINSTANCE.getSend_Args();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.BuildTCImpl <em>Build TC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.BuildTCImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getBuildTC()
		 * @generated
		 */
		EClass BUILD_TC = eINSTANCE.getBuildTC();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_TC__COMMAND = eINSTANCE.getBuildTC_Command();

		/**
		 * The meta object literal for the '<em><b>Verify</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_TC__VERIFY = eINSTANCE.getBuildTC_Verify();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_TC__ARGUMENTS = eINSTANCE.getBuildTC_Arguments();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_TC__VALUES = eINSTANCE.getBuildTC_Values();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD_TC__ARGS = eINSTANCE.getBuildTC_Args();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.GotoImpl <em>Goto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.GotoImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getGoto()
		 * @generated
		 */
		EClass GOTO = eINSTANCE.getGoto();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOTO__VARIABLE = eINSTANCE.getGoto_Variable();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOTO__TARGET = eINSTANCE.getGoto_Target();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOTO__EXPR = eINSTANCE.getGoto_Expr();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GOTO__HASH = eINSTANCE.getGoto_Hash();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.DisplayStepImpl <em>Display Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.DisplayStepImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getDisplayStep()
		 * @generated
		 */
		EClass DISPLAY_STEP = eINSTANCE.getDisplayStep();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_STEP__ID = eINSTANCE.getDisplayStep_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_STEP__DESCRIPTION = eINSTANCE.getDisplayStep_Description();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.ShowTMImpl <em>Show TM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.ShowTMImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getShowTM()
		 * @generated
		 */
		EClass SHOW_TM = eINSTANCE.getShowTM();

		/**
		 * The meta object literal for the '<em><b>Tms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOW_TM__TMS = eINSTANCE.getShowTM_Tms();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHOW_TM__ARGS = eINSTANCE.getShowTM_Args();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.GetTMImpl <em>Get TM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.GetTMImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getGetTM()
		 * @generated
		 */
		EClass GET_TM = eINSTANCE.getGetTM();

		/**
		 * The meta object literal for the '<em><b>Tm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_TM__TM = eINSTANCE.getGetTM_Tm();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_TM__ARGS = eINSTANCE.getGetTM_Args();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.assignment_stmtImpl <em>assignment stmt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.assignment_stmtImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getassignment_stmt()
		 * @generated
		 */
		EClass ASSIGNMENT_STMT = eINSTANCE.getassignment_stmt();

		/**
		 * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT_STMT__ASSIGNMENTS = eINSTANCE.getassignment_stmt_Assignments();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.ChangeLanguageConfigImpl <em>Change Language Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.ChangeLanguageConfigImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getChangeLanguageConfig()
		 * @generated
		 */
		EClass CHANGE_LANGUAGE_CONFIG = eINSTANCE.getChangeLanguageConfig();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_LANGUAGE_CONFIG__STATEMENT = eINSTANCE.getChangeLanguageConfig_Statement();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHANGE_LANGUAGE_CONFIG__ARGS = eINSTANCE.getChangeLanguageConfig_Args();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.spell.controlflow.spell.impl.SetLimitsImpl <em>Set Limits</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SetLimitsImpl
		 * @see lu.ses.engineering.spell.controlflow.spell.impl.SpellPackageImpl#getSetLimits()
		 * @generated
		 */
		EClass SET_LIMITS = eINSTANCE.getSetLimits();

		/**
		 * The meta object literal for the '<em><b>Tm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_LIMITS__TM = eINSTANCE.getSetLimits_Tm();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_LIMITS__ARGS = eINSTANCE.getSetLimits_Args();

	}

} //SpellPackage
