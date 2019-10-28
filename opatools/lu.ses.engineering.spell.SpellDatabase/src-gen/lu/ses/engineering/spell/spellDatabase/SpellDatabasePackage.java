/**
 */
package lu.ses.engineering.spell.spellDatabase;

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
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabaseFactory
 * @model kind="package"
 * @generated
 */
public interface SpellDatabasePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "spellDatabase";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ses.lu/engineering/spell/SpellDatabase";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "spellDatabase";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpellDatabasePackage eINSTANCE = lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl.init();

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.SpellDatabaseImpl <em>Spell Database</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabaseImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getSpellDatabase()
   * @generated
   */
  int SPELL_DATABASE = 0;

  /**
   * The feature id for the '<em><b>Database Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_DATABASE__DATABASE_ENTRY = 0;

  /**
   * The number of structural features of the '<em>Spell Database</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_DATABASE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumDatabaseImpl <em>Astrium Database</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.AstriumDatabaseImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getAstriumDatabase()
   * @generated
   */
  int ASTRIUM_DATABASE = 1;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_DATABASE__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Astrium Database</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_DATABASE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumVariableEntryImpl <em>Astrium Variable Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.AstriumVariableEntryImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getAstriumVariableEntry()
   * @generated
   */
  int ASTRIUM_VARIABLE_ENTRY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_VARIABLE_ENTRY__NAME = 0;

  /**
   * The feature id for the '<em><b>Astrium Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_VARIABLE_ENTRY__ASTRIUM_TIME = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_VARIABLE_ENTRY__VALUE = 2;

  /**
   * The feature id for the '<em><b>Simple Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_VARIABLE_ENTRY__SIMPLE_VALUE = 3;

  /**
   * The number of structural features of the '<em>Astrium Variable Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_VARIABLE_ENTRY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumHeaderEntryImpl <em>Astrium Header Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.AstriumHeaderEntryImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getAstriumHeaderEntry()
   * @generated
   */
  int ASTRIUM_HEADER_ENTRY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_HEADER_ENTRY__NAME = 0;

  /**
   * The feature id for the '<em><b>Astrium Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_HEADER_ENTRY__ASTRIUM_TIME = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_HEADER_ENTRY__VALUE = 2;

  /**
   * The feature id for the '<em><b>Simple Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_HEADER_ENTRY__SIMPLE_VALUE = 3;

  /**
   * The number of structural features of the '<em>Astrium Header Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_HEADER_ENTRY_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.CSVEntryImpl <em>CSV Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.CSVEntryImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getCSVEntry()
   * @generated
   */
  int CSV_ENTRY = 4;

  /**
   * The number of structural features of the '<em>CSV Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSV_ENTRY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.CSVCommandImpl <em>CSV Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.CSVCommandImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getCSVCommand()
   * @generated
   */
  int CSV_COMMAND = 5;

  /**
   * The feature id for the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSV_COMMAND__COMMAND = CSV_ENTRY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSV_COMMAND__ARGS = CSV_ENTRY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>CSV Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSV_COMMAND_FEATURE_COUNT = CSV_ENTRY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.TCArgsImpl <em>TC Args</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.TCArgsImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getTCArgs()
   * @generated
   */
  int TC_ARGS = 6;

  /**
   * The feature id for the '<em><b>Tc Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TC_ARGS__TC_NAME = 0;

  /**
   * The feature id for the '<em><b>Tc Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TC_ARGS__TC_VALUE = 1;

  /**
   * The feature id for the '<em><b>Tc Mod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TC_ARGS__TC_MOD = 2;

  /**
   * The feature id for the '<em><b>Tolerance</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TC_ARGS__TOLERANCE = 3;

  /**
   * The number of structural features of the '<em>TC Args</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TC_ARGS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.CSVTelemetryImpl <em>CSV Telemetry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.CSVTelemetryImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getCSVTelemetry()
   * @generated
   */
  int CSV_TELEMETRY = 7;

  /**
   * The feature id for the '<em><b>Tm Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSV_TELEMETRY__TM_ARG = CSV_ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CSV Telemetry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSV_TELEMETRY_FEATURE_COUNT = CSV_ENTRY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.CSVSpellImpl <em>CSV Spell</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.CSVSpellImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getCSVSpell()
   * @generated
   */
  int CSV_SPELL = 8;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSV_SPELL__CMD = CSV_ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CSV Spell</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSV_SPELL_FEATURE_COUNT = CSV_ENTRY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.SpellCommandImpl <em>Spell Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellCommandImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getSpellCommand()
   * @generated
   */
  int SPELL_COMMAND = 9;

  /**
   * The number of structural features of the '<em>Spell Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPELL_COMMAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.DatabaseEntryImpl <em>Database Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.DatabaseEntryImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getDatabaseEntry()
   * @generated
   */
  int DATABASE_ENTRY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_ENTRY__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_ENTRY__VALUE = 1;

  /**
   * The number of structural features of the '<em>Database Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.DatabaseValueImpl <em>Database Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.DatabaseValueImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getDatabaseValue()
   * @generated
   */
  int DATABASE_VALUE = 11;

  /**
   * The number of structural features of the '<em>Database Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATABASE_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.AtomImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getAtom()
   * @generated
   */
  int ATOM = 18;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__VAL = DATABASE_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = DATABASE_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.Lambda_StmtImpl <em>Lambda Stmt</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.Lambda_StmtImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getLambda_Stmt()
   * @generated
   */
  int LAMBDA_STMT = 12;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAMBDA_STMT__VAL = ATOM__VAL;

  /**
   * The feature id for the '<em><b>Variables</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAMBDA_STMT__VARIABLES = ATOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Lambda Stmt</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAMBDA_STMT_FEATURE_COUNT = ATOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.ComplexValueImpl <em>Complex Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.ComplexValueImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getComplexValue()
   * @generated
   */
  int COMPLEX_VALUE = 13;

  /**
   * The number of structural features of the '<em>Complex Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPLEX_VALUE_FEATURE_COUNT = DATABASE_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.TupleImpl <em>Tuple</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.TupleImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getTuple()
   * @generated
   */
  int TUPLE = 14;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE__VALUES = COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Tuple</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TUPLE_FEATURE_COUNT = COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.ListImpl <em>List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.ListImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getList()
   * @generated
   */
  int LIST = 15;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__VALUES = COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_FEATURE_COUNT = COMPLEX_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.DictionaryImpl <em>Dictionary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.DictionaryImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getDictionary()
   * @generated
   */
  int DICTIONARY = 16;

  /**
   * The number of structural features of the '<em>Dictionary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_FEATURE_COUNT = COMPLEX_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.DictionaryEntryImpl <em>Dictionary Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.DictionaryEntryImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getDictionaryEntry()
   * @generated
   */
  int DICTIONARY_ENTRY = 17;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_ENTRY__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_ENTRY__VALUE = 1;

  /**
   * The number of structural features of the '<em>Dictionary Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICTIONARY_ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.RelDateImpl <em>Rel Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.RelDateImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getRelDate()
   * @generated
   */
  int REL_DATE = 19;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_DATE__VAL = DATABASE_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Rel Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_DATE_FEATURE_COUNT = DATABASE_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.DateImpl <em>Date</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.DateImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getDate()
   * @generated
   */
  int DATE = 20;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE__VAL = DATABASE_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Date</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATE_FEATURE_COUNT = DATABASE_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.BooleanImpl <em>Boolean</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.BooleanImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getBoolean()
   * @generated
   */
  int BOOLEAN = 21;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN__VAL = ATOM__VAL;

  /**
   * The number of structural features of the '<em>Boolean</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_FEATURE_COUNT = ATOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.StringValueImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 22;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VAL = ATOM__VAL;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = ATOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.NumberImpl <em>Number</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.NumberImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getNumber()
   * @generated
   */
  int NUMBER = 23;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__VAL = ATOM__VAL;

  /**
   * The feature id for the '<em><b>Val Int</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__VAL_INT = ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Val Str</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER__VAL_STR = ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Number</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_FEATURE_COUNT = ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumSpellDatabaseImpl <em>Astrium Spell Database</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.AstriumSpellDatabaseImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getAstriumSpellDatabase()
   * @generated
   */
  int ASTRIUM_SPELL_DATABASE = 24;

  /**
   * The feature id for the '<em><b>Database Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_SPELL_DATABASE__DATABASE_ENTRY = SPELL_DATABASE__DATABASE_ENTRY;

  /**
   * The feature id for the '<em><b>Database</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_SPELL_DATABASE__DATABASE = SPELL_DATABASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Astrium Spell Database</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_SPELL_DATABASE_FEATURE_COUNT = SPELL_DATABASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.CSVFileImpl <em>CSV File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.CSVFileImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getCSVFile()
   * @generated
   */
  int CSV_FILE = 25;

  /**
   * The feature id for the '<em><b>Database Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSV_FILE__DATABASE_ENTRY = SPELL_DATABASE__DATABASE_ENTRY;

  /**
   * The feature id for the '<em><b>Csv Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSV_FILE__CSV_ENTRIES = SPELL_DATABASE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CSV File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSV_FILE_FEATURE_COUNT = SPELL_DATABASE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumVariableCommentImpl <em>Astrium Variable Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.AstriumVariableCommentImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getAstriumVariableComment()
   * @generated
   */
  int ASTRIUM_VARIABLE_COMMENT = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_VARIABLE_COMMENT__NAME = ASTRIUM_VARIABLE_ENTRY__NAME;

  /**
   * The feature id for the '<em><b>Astrium Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_VARIABLE_COMMENT__ASTRIUM_TIME = ASTRIUM_VARIABLE_ENTRY__ASTRIUM_TIME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_VARIABLE_COMMENT__VALUE = ASTRIUM_VARIABLE_ENTRY__VALUE;

  /**
   * The feature id for the '<em><b>Simple Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_VARIABLE_COMMENT__SIMPLE_VALUE = ASTRIUM_VARIABLE_ENTRY__SIMPLE_VALUE;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_VARIABLE_COMMENT__COMMENT = ASTRIUM_VARIABLE_ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Astrium Variable Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_VARIABLE_COMMENT_FEATURE_COUNT = ASTRIUM_VARIABLE_ENTRY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumHeaderCommentImpl <em>Astrium Header Comment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.AstriumHeaderCommentImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getAstriumHeaderComment()
   * @generated
   */
  int ASTRIUM_HEADER_COMMENT = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_HEADER_COMMENT__NAME = ASTRIUM_HEADER_ENTRY__NAME;

  /**
   * The feature id for the '<em><b>Astrium Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_HEADER_COMMENT__ASTRIUM_TIME = ASTRIUM_HEADER_ENTRY__ASTRIUM_TIME;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_HEADER_COMMENT__VALUE = ASTRIUM_HEADER_ENTRY__VALUE;

  /**
   * The feature id for the '<em><b>Simple Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_HEADER_COMMENT__SIMPLE_VALUE = ASTRIUM_HEADER_ENTRY__SIMPLE_VALUE;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_HEADER_COMMENT__COMMENT = ASTRIUM_HEADER_ENTRY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Astrium Header Comment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASTRIUM_HEADER_COMMENT_FEATURE_COUNT = ASTRIUM_HEADER_ENTRY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.WaitCommandImpl <em>Wait Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.WaitCommandImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getWaitCommand()
   * @generated
   */
  int WAIT_COMMAND = 28;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT_COMMAND__VALUE = SPELL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT_COMMAND__UNIT = SPELL_COMMAND_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Wait Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAIT_COMMAND_FEATURE_COUNT = SPELL_COMMAND_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.PauseCommandImpl <em>Pause Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.PauseCommandImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getPauseCommand()
   * @generated
   */
  int PAUSE_COMMAND = 29;

  /**
   * The number of structural features of the '<em>Pause Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAUSE_COMMAND_FEATURE_COUNT = SPELL_COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.spellDatabase.impl.DicitonaryImpl <em>Dicitonary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.spellDatabase.impl.DicitonaryImpl
   * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getDicitonary()
   * @generated
   */
  int DICITONARY = 30;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICITONARY__ENTRIES = DICTIONARY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dicitonary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICITONARY_FEATURE_COUNT = DICTIONARY_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.SpellDatabase <em>Spell Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spell Database</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabase
   * @generated
   */
  EClass getSpellDatabase();

  /**
   * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.spellDatabase.SpellDatabase#getDatabaseEntry <em>Database Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Database Entry</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabase#getDatabaseEntry()
   * @see #getSpellDatabase()
   * @generated
   */
  EReference getSpellDatabase_DatabaseEntry();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.AstriumDatabase <em>Astrium Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Astrium Database</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumDatabase
   * @generated
   */
  EClass getAstriumDatabase();

  /**
   * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.spellDatabase.AstriumDatabase#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumDatabase#getEntries()
   * @see #getAstriumDatabase()
   * @generated
   */
  EReference getAstriumDatabase_Entries();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry <em>Astrium Variable Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Astrium Variable Entry</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry
   * @generated
   */
  EClass getAstriumVariableEntry();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getName()
   * @see #getAstriumVariableEntry()
   * @generated
   */
  EAttribute getAstriumVariableEntry_Name();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getAstriumTime <em>Astrium Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Astrium Time</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getAstriumTime()
   * @see #getAstriumVariableEntry()
   * @generated
   */
  EAttribute getAstriumVariableEntry_AstriumTime();

  /**
   * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getValue()
   * @see #getAstriumVariableEntry()
   * @generated
   */
  EReference getAstriumVariableEntry_Value();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getSimpleValue <em>Simple Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simple Value</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry#getSimpleValue()
   * @see #getAstriumVariableEntry()
   * @generated
   */
  EAttribute getAstriumVariableEntry_SimpleValue();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.AstriumHeaderEntry <em>Astrium Header Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Astrium Header Entry</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumHeaderEntry
   * @generated
   */
  EClass getAstriumHeaderEntry();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.AstriumHeaderEntry#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumHeaderEntry#getName()
   * @see #getAstriumHeaderEntry()
   * @generated
   */
  EAttribute getAstriumHeaderEntry_Name();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.AstriumHeaderEntry#getAstriumTime <em>Astrium Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Astrium Time</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumHeaderEntry#getAstriumTime()
   * @see #getAstriumHeaderEntry()
   * @generated
   */
  EAttribute getAstriumHeaderEntry_AstriumTime();

  /**
   * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.spellDatabase.AstriumHeaderEntry#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumHeaderEntry#getValue()
   * @see #getAstriumHeaderEntry()
   * @generated
   */
  EReference getAstriumHeaderEntry_Value();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.AstriumHeaderEntry#getSimpleValue <em>Simple Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Simple Value</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumHeaderEntry#getSimpleValue()
   * @see #getAstriumHeaderEntry()
   * @generated
   */
  EAttribute getAstriumHeaderEntry_SimpleValue();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.CSVEntry <em>CSV Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSV Entry</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.CSVEntry
   * @generated
   */
  EClass getCSVEntry();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.CSVCommand <em>CSV Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSV Command</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.CSVCommand
   * @generated
   */
  EClass getCSVCommand();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.CSVCommand#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Command</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.CSVCommand#getCommand()
   * @see #getCSVCommand()
   * @generated
   */
  EAttribute getCSVCommand_Command();

  /**
   * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.spellDatabase.CSVCommand#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Args</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.CSVCommand#getArgs()
   * @see #getCSVCommand()
   * @generated
   */
  EReference getCSVCommand_Args();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.TCArgs <em>TC Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TC Args</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.TCArgs
   * @generated
   */
  EClass getTCArgs();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.TCArgs#getTcName <em>Tc Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tc Name</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.TCArgs#getTcName()
   * @see #getTCArgs()
   * @generated
   */
  EAttribute getTCArgs_TcName();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.TCArgs#getTcValue <em>Tc Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tc Value</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.TCArgs#getTcValue()
   * @see #getTCArgs()
   * @generated
   */
  EAttribute getTCArgs_TcValue();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.TCArgs#getTcMod <em>Tc Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tc Mod</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.TCArgs#getTcMod()
   * @see #getTCArgs()
   * @generated
   */
  EAttribute getTCArgs_TcMod();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.TCArgs#getTolerance <em>Tolerance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tolerance</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.TCArgs#getTolerance()
   * @see #getTCArgs()
   * @generated
   */
  EAttribute getTCArgs_Tolerance();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.CSVTelemetry <em>CSV Telemetry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSV Telemetry</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.CSVTelemetry
   * @generated
   */
  EClass getCSVTelemetry();

  /**
   * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.spellDatabase.CSVTelemetry#getTmArg <em>Tm Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tm Arg</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.CSVTelemetry#getTmArg()
   * @see #getCSVTelemetry()
   * @generated
   */
  EReference getCSVTelemetry_TmArg();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.CSVSpell <em>CSV Spell</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSV Spell</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.CSVSpell
   * @generated
   */
  EClass getCSVSpell();

  /**
   * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.spellDatabase.CSVSpell#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.CSVSpell#getCmd()
   * @see #getCSVSpell()
   * @generated
   */
  EReference getCSVSpell_Cmd();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.SpellCommand <em>Spell Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Spell Command</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.SpellCommand
   * @generated
   */
  EClass getSpellCommand();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.DatabaseEntry <em>Database Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Entry</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.DatabaseEntry
   * @generated
   */
  EClass getDatabaseEntry();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.DatabaseEntry#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.DatabaseEntry#getName()
   * @see #getDatabaseEntry()
   * @generated
   */
  EAttribute getDatabaseEntry_Name();

  /**
   * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.spellDatabase.DatabaseEntry#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.DatabaseEntry#getValue()
   * @see #getDatabaseEntry()
   * @generated
   */
  EReference getDatabaseEntry_Value();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.DatabaseValue <em>Database Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Database Value</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.DatabaseValue
   * @generated
   */
  EClass getDatabaseValue();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.Lambda_Stmt <em>Lambda Stmt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lambda Stmt</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.Lambda_Stmt
   * @generated
   */
  EClass getLambda_Stmt();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.Lambda_Stmt#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variables</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.Lambda_Stmt#getVariables()
   * @see #getLambda_Stmt()
   * @generated
   */
  EAttribute getLambda_Stmt_Variables();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.ComplexValue <em>Complex Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Complex Value</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.ComplexValue
   * @generated
   */
  EClass getComplexValue();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.Tuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tuple</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.Tuple
   * @generated
   */
  EClass getTuple();

  /**
   * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.spellDatabase.Tuple#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.Tuple#getValues()
   * @see #getTuple()
   * @generated
   */
  EReference getTuple_Values();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.List
   * @generated
   */
  EClass getList();

  /**
   * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.spellDatabase.List#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.List#getValues()
   * @see #getList()
   * @generated
   */
  EReference getList_Values();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.Dictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dictionary</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.Dictionary
   * @generated
   */
  EClass getDictionary();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.DictionaryEntry <em>Dictionary Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dictionary Entry</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.DictionaryEntry
   * @generated
   */
  EClass getDictionaryEntry();

  /**
   * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.spellDatabase.DictionaryEntry#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.DictionaryEntry#getKey()
   * @see #getDictionaryEntry()
   * @generated
   */
  EReference getDictionaryEntry_Key();

  /**
   * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.spellDatabase.DictionaryEntry#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.DictionaryEntry#getValue()
   * @see #getDictionaryEntry()
   * @generated
   */
  EReference getDictionaryEntry_Value();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.Atom
   * @generated
   */
  EClass getAtom();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.Atom#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.Atom#getVal()
   * @see #getAtom()
   * @generated
   */
  EAttribute getAtom_Val();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.RelDate <em>Rel Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rel Date</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.RelDate
   * @generated
   */
  EClass getRelDate();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.RelDate#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.RelDate#getVal()
   * @see #getRelDate()
   * @generated
   */
  EAttribute getRelDate_Val();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Date</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.Date
   * @generated
   */
  EClass getDate();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.Date#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.Date#getVal()
   * @see #getDate()
   * @generated
   */
  EAttribute getDate_Val();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.Boolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.Boolean
   * @generated
   */
  EClass getBoolean();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.Number
   * @generated
   */
  EClass getNumber();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.Number#getValInt <em>Val Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val Int</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.Number#getValInt()
   * @see #getNumber()
   * @generated
   */
  EAttribute getNumber_ValInt();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.Number#getValStr <em>Val Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val Str</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.Number#getValStr()
   * @see #getNumber()
   * @generated
   */
  EAttribute getNumber_ValStr();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.AstriumSpellDatabase <em>Astrium Spell Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Astrium Spell Database</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumSpellDatabase
   * @generated
   */
  EClass getAstriumSpellDatabase();

  /**
   * Returns the meta object for the containment reference '{@link lu.ses.engineering.spell.spellDatabase.AstriumSpellDatabase#getDatabase <em>Database</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Database</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumSpellDatabase#getDatabase()
   * @see #getAstriumSpellDatabase()
   * @generated
   */
  EReference getAstriumSpellDatabase_Database();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.CSVFile <em>CSV File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSV File</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.CSVFile
   * @generated
   */
  EClass getCSVFile();

  /**
   * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.spellDatabase.CSVFile#getCsvEntries <em>Csv Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Csv Entries</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.CSVFile#getCsvEntries()
   * @see #getCSVFile()
   * @generated
   */
  EReference getCSVFile_CsvEntries();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableComment <em>Astrium Variable Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Astrium Variable Comment</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumVariableComment
   * @generated
   */
  EClass getAstriumVariableComment();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableComment#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumVariableComment#getComment()
   * @see #getAstriumVariableComment()
   * @generated
   */
  EAttribute getAstriumVariableComment_Comment();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.AstriumHeaderComment <em>Astrium Header Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Astrium Header Comment</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumHeaderComment
   * @generated
   */
  EClass getAstriumHeaderComment();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.AstriumHeaderComment#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumHeaderComment#getComment()
   * @see #getAstriumHeaderComment()
   * @generated
   */
  EAttribute getAstriumHeaderComment_Comment();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.WaitCommand <em>Wait Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wait Command</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.WaitCommand
   * @generated
   */
  EClass getWaitCommand();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.WaitCommand#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.WaitCommand#getValue()
   * @see #getWaitCommand()
   * @generated
   */
  EAttribute getWaitCommand_Value();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.spellDatabase.WaitCommand#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.WaitCommand#getUnit()
   * @see #getWaitCommand()
   * @generated
   */
  EAttribute getWaitCommand_Unit();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.PauseCommand <em>Pause Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pause Command</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.PauseCommand
   * @generated
   */
  EClass getPauseCommand();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.spellDatabase.Dicitonary <em>Dicitonary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dicitonary</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.Dicitonary
   * @generated
   */
  EClass getDicitonary();

  /**
   * Returns the meta object for the containment reference list '{@link lu.ses.engineering.spell.spellDatabase.Dicitonary#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see lu.ses.engineering.spell.spellDatabase.Dicitonary#getEntries()
   * @see #getDicitonary()
   * @generated
   */
  EReference getDicitonary_Entries();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SpellDatabaseFactory getSpellDatabaseFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.SpellDatabaseImpl <em>Spell Database</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabaseImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getSpellDatabase()
     * @generated
     */
    EClass SPELL_DATABASE = eINSTANCE.getSpellDatabase();

    /**
     * The meta object literal for the '<em><b>Database Entry</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPELL_DATABASE__DATABASE_ENTRY = eINSTANCE.getSpellDatabase_DatabaseEntry();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumDatabaseImpl <em>Astrium Database</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.AstriumDatabaseImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getAstriumDatabase()
     * @generated
     */
    EClass ASTRIUM_DATABASE = eINSTANCE.getAstriumDatabase();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASTRIUM_DATABASE__ENTRIES = eINSTANCE.getAstriumDatabase_Entries();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumVariableEntryImpl <em>Astrium Variable Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.AstriumVariableEntryImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getAstriumVariableEntry()
     * @generated
     */
    EClass ASTRIUM_VARIABLE_ENTRY = eINSTANCE.getAstriumVariableEntry();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASTRIUM_VARIABLE_ENTRY__NAME = eINSTANCE.getAstriumVariableEntry_Name();

    /**
     * The meta object literal for the '<em><b>Astrium Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASTRIUM_VARIABLE_ENTRY__ASTRIUM_TIME = eINSTANCE.getAstriumVariableEntry_AstriumTime();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASTRIUM_VARIABLE_ENTRY__VALUE = eINSTANCE.getAstriumVariableEntry_Value();

    /**
     * The meta object literal for the '<em><b>Simple Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASTRIUM_VARIABLE_ENTRY__SIMPLE_VALUE = eINSTANCE.getAstriumVariableEntry_SimpleValue();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumHeaderEntryImpl <em>Astrium Header Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.AstriumHeaderEntryImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getAstriumHeaderEntry()
     * @generated
     */
    EClass ASTRIUM_HEADER_ENTRY = eINSTANCE.getAstriumHeaderEntry();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASTRIUM_HEADER_ENTRY__NAME = eINSTANCE.getAstriumHeaderEntry_Name();

    /**
     * The meta object literal for the '<em><b>Astrium Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASTRIUM_HEADER_ENTRY__ASTRIUM_TIME = eINSTANCE.getAstriumHeaderEntry_AstriumTime();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASTRIUM_HEADER_ENTRY__VALUE = eINSTANCE.getAstriumHeaderEntry_Value();

    /**
     * The meta object literal for the '<em><b>Simple Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASTRIUM_HEADER_ENTRY__SIMPLE_VALUE = eINSTANCE.getAstriumHeaderEntry_SimpleValue();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.CSVEntryImpl <em>CSV Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.CSVEntryImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getCSVEntry()
     * @generated
     */
    EClass CSV_ENTRY = eINSTANCE.getCSVEntry();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.CSVCommandImpl <em>CSV Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.CSVCommandImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getCSVCommand()
     * @generated
     */
    EClass CSV_COMMAND = eINSTANCE.getCSVCommand();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSV_COMMAND__COMMAND = eINSTANCE.getCSVCommand_Command();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSV_COMMAND__ARGS = eINSTANCE.getCSVCommand_Args();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.TCArgsImpl <em>TC Args</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.TCArgsImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getTCArgs()
     * @generated
     */
    EClass TC_ARGS = eINSTANCE.getTCArgs();

    /**
     * The meta object literal for the '<em><b>Tc Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TC_ARGS__TC_NAME = eINSTANCE.getTCArgs_TcName();

    /**
     * The meta object literal for the '<em><b>Tc Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TC_ARGS__TC_VALUE = eINSTANCE.getTCArgs_TcValue();

    /**
     * The meta object literal for the '<em><b>Tc Mod</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TC_ARGS__TC_MOD = eINSTANCE.getTCArgs_TcMod();

    /**
     * The meta object literal for the '<em><b>Tolerance</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TC_ARGS__TOLERANCE = eINSTANCE.getTCArgs_Tolerance();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.CSVTelemetryImpl <em>CSV Telemetry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.CSVTelemetryImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getCSVTelemetry()
     * @generated
     */
    EClass CSV_TELEMETRY = eINSTANCE.getCSVTelemetry();

    /**
     * The meta object literal for the '<em><b>Tm Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSV_TELEMETRY__TM_ARG = eINSTANCE.getCSVTelemetry_TmArg();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.CSVSpellImpl <em>CSV Spell</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.CSVSpellImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getCSVSpell()
     * @generated
     */
    EClass CSV_SPELL = eINSTANCE.getCSVSpell();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSV_SPELL__CMD = eINSTANCE.getCSVSpell_Cmd();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.SpellCommandImpl <em>Spell Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellCommandImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getSpellCommand()
     * @generated
     */
    EClass SPELL_COMMAND = eINSTANCE.getSpellCommand();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.DatabaseEntryImpl <em>Database Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.DatabaseEntryImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getDatabaseEntry()
     * @generated
     */
    EClass DATABASE_ENTRY = eINSTANCE.getDatabaseEntry();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATABASE_ENTRY__NAME = eINSTANCE.getDatabaseEntry_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATABASE_ENTRY__VALUE = eINSTANCE.getDatabaseEntry_Value();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.DatabaseValueImpl <em>Database Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.DatabaseValueImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getDatabaseValue()
     * @generated
     */
    EClass DATABASE_VALUE = eINSTANCE.getDatabaseValue();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.Lambda_StmtImpl <em>Lambda Stmt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.Lambda_StmtImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getLambda_Stmt()
     * @generated
     */
    EClass LAMBDA_STMT = eINSTANCE.getLambda_Stmt();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAMBDA_STMT__VARIABLES = eINSTANCE.getLambda_Stmt_Variables();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.ComplexValueImpl <em>Complex Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.ComplexValueImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getComplexValue()
     * @generated
     */
    EClass COMPLEX_VALUE = eINSTANCE.getComplexValue();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.TupleImpl <em>Tuple</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.TupleImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getTuple()
     * @generated
     */
    EClass TUPLE = eINSTANCE.getTuple();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TUPLE__VALUES = eINSTANCE.getTuple_Values();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.ListImpl <em>List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.ListImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getList()
     * @generated
     */
    EClass LIST = eINSTANCE.getList();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST__VALUES = eINSTANCE.getList_Values();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.DictionaryImpl <em>Dictionary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.DictionaryImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getDictionary()
     * @generated
     */
    EClass DICTIONARY = eINSTANCE.getDictionary();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.DictionaryEntryImpl <em>Dictionary Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.DictionaryEntryImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getDictionaryEntry()
     * @generated
     */
    EClass DICTIONARY_ENTRY = eINSTANCE.getDictionaryEntry();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICTIONARY_ENTRY__KEY = eINSTANCE.getDictionaryEntry_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICTIONARY_ENTRY__VALUE = eINSTANCE.getDictionaryEntry_Value();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.AtomImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getAtom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getAtom();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOM__VAL = eINSTANCE.getAtom_Val();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.RelDateImpl <em>Rel Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.RelDateImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getRelDate()
     * @generated
     */
    EClass REL_DATE = eINSTANCE.getRelDate();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REL_DATE__VAL = eINSTANCE.getRelDate_Val();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.DateImpl <em>Date</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.DateImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getDate()
     * @generated
     */
    EClass DATE = eINSTANCE.getDate();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATE__VAL = eINSTANCE.getDate_Val();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.BooleanImpl <em>Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.BooleanImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getBoolean()
     * @generated
     */
    EClass BOOLEAN = eINSTANCE.getBoolean();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.StringValueImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.NumberImpl <em>Number</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.NumberImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getNumber()
     * @generated
     */
    EClass NUMBER = eINSTANCE.getNumber();

    /**
     * The meta object literal for the '<em><b>Val Int</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER__VAL_INT = eINSTANCE.getNumber_ValInt();

    /**
     * The meta object literal for the '<em><b>Val Str</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER__VAL_STR = eINSTANCE.getNumber_ValStr();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumSpellDatabaseImpl <em>Astrium Spell Database</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.AstriumSpellDatabaseImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getAstriumSpellDatabase()
     * @generated
     */
    EClass ASTRIUM_SPELL_DATABASE = eINSTANCE.getAstriumSpellDatabase();

    /**
     * The meta object literal for the '<em><b>Database</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASTRIUM_SPELL_DATABASE__DATABASE = eINSTANCE.getAstriumSpellDatabase_Database();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.CSVFileImpl <em>CSV File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.CSVFileImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getCSVFile()
     * @generated
     */
    EClass CSV_FILE = eINSTANCE.getCSVFile();

    /**
     * The meta object literal for the '<em><b>Csv Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CSV_FILE__CSV_ENTRIES = eINSTANCE.getCSVFile_CsvEntries();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumVariableCommentImpl <em>Astrium Variable Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.AstriumVariableCommentImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getAstriumVariableComment()
     * @generated
     */
    EClass ASTRIUM_VARIABLE_COMMENT = eINSTANCE.getAstriumVariableComment();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASTRIUM_VARIABLE_COMMENT__COMMENT = eINSTANCE.getAstriumVariableComment_Comment();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumHeaderCommentImpl <em>Astrium Header Comment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.AstriumHeaderCommentImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getAstriumHeaderComment()
     * @generated
     */
    EClass ASTRIUM_HEADER_COMMENT = eINSTANCE.getAstriumHeaderComment();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASTRIUM_HEADER_COMMENT__COMMENT = eINSTANCE.getAstriumHeaderComment_Comment();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.WaitCommandImpl <em>Wait Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.WaitCommandImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getWaitCommand()
     * @generated
     */
    EClass WAIT_COMMAND = eINSTANCE.getWaitCommand();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAIT_COMMAND__VALUE = eINSTANCE.getWaitCommand_Value();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAIT_COMMAND__UNIT = eINSTANCE.getWaitCommand_Unit();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.PauseCommandImpl <em>Pause Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.PauseCommandImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getPauseCommand()
     * @generated
     */
    EClass PAUSE_COMMAND = eINSTANCE.getPauseCommand();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.spellDatabase.impl.DicitonaryImpl <em>Dicitonary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.spellDatabase.impl.DicitonaryImpl
     * @see lu.ses.engineering.spell.spellDatabase.impl.SpellDatabasePackageImpl#getDicitonary()
     * @generated
     */
    EClass DICITONARY = eINSTANCE.getDicitonary();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICITONARY__ENTRIES = eINSTANCE.getDicitonary_Entries();

  }

} //SpellDatabasePackage
