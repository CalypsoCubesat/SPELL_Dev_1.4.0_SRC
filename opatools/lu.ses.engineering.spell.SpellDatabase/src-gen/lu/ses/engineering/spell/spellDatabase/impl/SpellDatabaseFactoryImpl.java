/**
 */
package lu.ses.engineering.spell.spellDatabase.impl;

import lu.ses.engineering.spell.spellDatabase.AstriumDatabase;
import lu.ses.engineering.spell.spellDatabase.AstriumHeaderComment;
import lu.ses.engineering.spell.spellDatabase.AstriumHeaderEntry;
import lu.ses.engineering.spell.spellDatabase.AstriumSpellDatabase;
import lu.ses.engineering.spell.spellDatabase.AstriumVariableComment;
import lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry;
import lu.ses.engineering.spell.spellDatabase.Atom;
import lu.ses.engineering.spell.spellDatabase.CSVCommand;
import lu.ses.engineering.spell.spellDatabase.CSVEntry;
import lu.ses.engineering.spell.spellDatabase.CSVFile;
import lu.ses.engineering.spell.spellDatabase.CSVSpell;
import lu.ses.engineering.spell.spellDatabase.CSVTelemetry;
import lu.ses.engineering.spell.spellDatabase.ComplexValue;
import lu.ses.engineering.spell.spellDatabase.DatabaseEntry;
import lu.ses.engineering.spell.spellDatabase.DatabaseValue;
import lu.ses.engineering.spell.spellDatabase.Date;
import lu.ses.engineering.spell.spellDatabase.Dicitonary;
import lu.ses.engineering.spell.spellDatabase.Dictionary;
import lu.ses.engineering.spell.spellDatabase.DictionaryEntry;
import lu.ses.engineering.spell.spellDatabase.Lambda_Stmt;
import lu.ses.engineering.spell.spellDatabase.List;
import lu.ses.engineering.spell.spellDatabase.PauseCommand;
import lu.ses.engineering.spell.spellDatabase.RelDate;
import lu.ses.engineering.spell.spellDatabase.SpellCommand;
import lu.ses.engineering.spell.spellDatabase.SpellDatabase;
import lu.ses.engineering.spell.spellDatabase.SpellDatabaseFactory;
import lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage;
import lu.ses.engineering.spell.spellDatabase.StringValue;
import lu.ses.engineering.spell.spellDatabase.TCArgs;
import lu.ses.engineering.spell.spellDatabase.Tuple;
import lu.ses.engineering.spell.spellDatabase.WaitCommand;

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
public class SpellDatabaseFactoryImpl extends EFactoryImpl implements SpellDatabaseFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SpellDatabaseFactory init()
  {
    try
    {
      SpellDatabaseFactory theSpellDatabaseFactory = (SpellDatabaseFactory)EPackage.Registry.INSTANCE.getEFactory(SpellDatabasePackage.eNS_URI);
      if (theSpellDatabaseFactory != null)
      {
        return theSpellDatabaseFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SpellDatabaseFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellDatabaseFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SpellDatabasePackage.SPELL_DATABASE: return createSpellDatabase();
      case SpellDatabasePackage.ASTRIUM_DATABASE: return createAstriumDatabase();
      case SpellDatabasePackage.ASTRIUM_VARIABLE_ENTRY: return createAstriumVariableEntry();
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY: return createAstriumHeaderEntry();
      case SpellDatabasePackage.CSV_ENTRY: return createCSVEntry();
      case SpellDatabasePackage.CSV_COMMAND: return createCSVCommand();
      case SpellDatabasePackage.TC_ARGS: return createTCArgs();
      case SpellDatabasePackage.CSV_TELEMETRY: return createCSVTelemetry();
      case SpellDatabasePackage.CSV_SPELL: return createCSVSpell();
      case SpellDatabasePackage.SPELL_COMMAND: return createSpellCommand();
      case SpellDatabasePackage.DATABASE_ENTRY: return createDatabaseEntry();
      case SpellDatabasePackage.DATABASE_VALUE: return createDatabaseValue();
      case SpellDatabasePackage.LAMBDA_STMT: return createLambda_Stmt();
      case SpellDatabasePackage.COMPLEX_VALUE: return createComplexValue();
      case SpellDatabasePackage.TUPLE: return createTuple();
      case SpellDatabasePackage.LIST: return createList();
      case SpellDatabasePackage.DICTIONARY: return createDictionary();
      case SpellDatabasePackage.DICTIONARY_ENTRY: return createDictionaryEntry();
      case SpellDatabasePackage.ATOM: return createAtom();
      case SpellDatabasePackage.REL_DATE: return createRelDate();
      case SpellDatabasePackage.DATE: return createDate();
      case SpellDatabasePackage.BOOLEAN: return createBoolean();
      case SpellDatabasePackage.STRING_VALUE: return createStringValue();
      case SpellDatabasePackage.NUMBER: return createNumber();
      case SpellDatabasePackage.ASTRIUM_SPELL_DATABASE: return createAstriumSpellDatabase();
      case SpellDatabasePackage.CSV_FILE: return createCSVFile();
      case SpellDatabasePackage.ASTRIUM_VARIABLE_COMMENT: return createAstriumVariableComment();
      case SpellDatabasePackage.ASTRIUM_HEADER_COMMENT: return createAstriumHeaderComment();
      case SpellDatabasePackage.WAIT_COMMAND: return createWaitCommand();
      case SpellDatabasePackage.PAUSE_COMMAND: return createPauseCommand();
      case SpellDatabasePackage.DICITONARY: return createDicitonary();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellDatabase createSpellDatabase()
  {
    SpellDatabaseImpl spellDatabase = new SpellDatabaseImpl();
    return spellDatabase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstriumDatabase createAstriumDatabase()
  {
    AstriumDatabaseImpl astriumDatabase = new AstriumDatabaseImpl();
    return astriumDatabase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstriumVariableEntry createAstriumVariableEntry()
  {
    AstriumVariableEntryImpl astriumVariableEntry = new AstriumVariableEntryImpl();
    return astriumVariableEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstriumHeaderEntry createAstriumHeaderEntry()
  {
    AstriumHeaderEntryImpl astriumHeaderEntry = new AstriumHeaderEntryImpl();
    return astriumHeaderEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSVEntry createCSVEntry()
  {
    CSVEntryImpl csvEntry = new CSVEntryImpl();
    return csvEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSVCommand createCSVCommand()
  {
    CSVCommandImpl csvCommand = new CSVCommandImpl();
    return csvCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TCArgs createTCArgs()
  {
    TCArgsImpl tcArgs = new TCArgsImpl();
    return tcArgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSVTelemetry createCSVTelemetry()
  {
    CSVTelemetryImpl csvTelemetry = new CSVTelemetryImpl();
    return csvTelemetry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSVSpell createCSVSpell()
  {
    CSVSpellImpl csvSpell = new CSVSpellImpl();
    return csvSpell;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellCommand createSpellCommand()
  {
    SpellCommandImpl spellCommand = new SpellCommandImpl();
    return spellCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseEntry createDatabaseEntry()
  {
    DatabaseEntryImpl databaseEntry = new DatabaseEntryImpl();
    return databaseEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatabaseValue createDatabaseValue()
  {
    DatabaseValueImpl databaseValue = new DatabaseValueImpl();
    return databaseValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Lambda_Stmt createLambda_Stmt()
  {
    Lambda_StmtImpl lambda_Stmt = new Lambda_StmtImpl();
    return lambda_Stmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexValue createComplexValue()
  {
    ComplexValueImpl complexValue = new ComplexValueImpl();
    return complexValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tuple createTuple()
  {
    TupleImpl tuple = new TupleImpl();
    return tuple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List createList()
  {
    ListImpl list = new ListImpl();
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dictionary createDictionary()
  {
    DictionaryImpl dictionary = new DictionaryImpl();
    return dictionary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DictionaryEntry createDictionaryEntry()
  {
    DictionaryEntryImpl dictionaryEntry = new DictionaryEntryImpl();
    return dictionaryEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom createAtom()
  {
    AtomImpl atom = new AtomImpl();
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelDate createRelDate()
  {
    RelDateImpl relDate = new RelDateImpl();
    return relDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date createDate()
  {
    DateImpl date = new DateImpl();
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public lu.ses.engineering.spell.spellDatabase.Boolean createBoolean()
  {
    BooleanImpl boolean_ = new BooleanImpl();
    return boolean_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValue createStringValue()
  {
    StringValueImpl stringValue = new StringValueImpl();
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public lu.ses.engineering.spell.spellDatabase.Number createNumber()
  {
    NumberImpl number = new NumberImpl();
    return number;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstriumSpellDatabase createAstriumSpellDatabase()
  {
    AstriumSpellDatabaseImpl astriumSpellDatabase = new AstriumSpellDatabaseImpl();
    return astriumSpellDatabase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSVFile createCSVFile()
  {
    CSVFileImpl csvFile = new CSVFileImpl();
    return csvFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstriumVariableComment createAstriumVariableComment()
  {
    AstriumVariableCommentImpl astriumVariableComment = new AstriumVariableCommentImpl();
    return astriumVariableComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AstriumHeaderComment createAstriumHeaderComment()
  {
    AstriumHeaderCommentImpl astriumHeaderComment = new AstriumHeaderCommentImpl();
    return astriumHeaderComment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WaitCommand createWaitCommand()
  {
    WaitCommandImpl waitCommand = new WaitCommandImpl();
    return waitCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PauseCommand createPauseCommand()
  {
    PauseCommandImpl pauseCommand = new PauseCommandImpl();
    return pauseCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dicitonary createDicitonary()
  {
    DicitonaryImpl dicitonary = new DicitonaryImpl();
    return dicitonary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellDatabasePackage getSpellDatabasePackage()
  {
    return (SpellDatabasePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SpellDatabasePackage getPackage()
  {
    return SpellDatabasePackage.eINSTANCE;
  }

} //SpellDatabaseFactoryImpl
