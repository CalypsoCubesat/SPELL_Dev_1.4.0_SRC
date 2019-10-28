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
public class SpellDatabasePackageImpl extends EPackageImpl implements SpellDatabasePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spellDatabaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass astriumDatabaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass astriumVariableEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass astriumHeaderEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass csvEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass csvCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tcArgsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass csvTelemetryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass csvSpellEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass spellCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass databaseValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lambda_StmtEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass complexValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tupleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dictionaryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dictionaryEntryEClass = null;

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
  private EClass relDateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass astriumSpellDatabaseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass csvFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass astriumVariableCommentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass astriumHeaderCommentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass waitCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pauseCommandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dicitonaryEClass = null;

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
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SpellDatabasePackageImpl()
  {
    super(eNS_URI, SpellDatabaseFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SpellDatabasePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SpellDatabasePackage init()
  {
    if (isInited) return (SpellDatabasePackage)EPackage.Registry.INSTANCE.getEPackage(SpellDatabasePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredSpellDatabasePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    SpellDatabasePackageImpl theSpellDatabasePackage = registeredSpellDatabasePackage instanceof SpellDatabasePackageImpl ? (SpellDatabasePackageImpl)registeredSpellDatabasePackage : new SpellDatabasePackageImpl();

    isInited = true;

    // Create package meta-data objects
    theSpellDatabasePackage.createPackageContents();

    // Initialize created meta-data
    theSpellDatabasePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSpellDatabasePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SpellDatabasePackage.eNS_URI, theSpellDatabasePackage);
    return theSpellDatabasePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpellDatabase()
  {
    return spellDatabaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSpellDatabase_DatabaseEntry()
  {
    return (EReference)spellDatabaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAstriumDatabase()
  {
    return astriumDatabaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAstriumDatabase_Entries()
  {
    return (EReference)astriumDatabaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAstriumVariableEntry()
  {
    return astriumVariableEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAstriumVariableEntry_Name()
  {
    return (EAttribute)astriumVariableEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAstriumVariableEntry_AstriumTime()
  {
    return (EAttribute)astriumVariableEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAstriumVariableEntry_Value()
  {
    return (EReference)astriumVariableEntryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAstriumVariableEntry_SimpleValue()
  {
    return (EAttribute)astriumVariableEntryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAstriumHeaderEntry()
  {
    return astriumHeaderEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAstriumHeaderEntry_Name()
  {
    return (EAttribute)astriumHeaderEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAstriumHeaderEntry_AstriumTime()
  {
    return (EAttribute)astriumHeaderEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAstriumHeaderEntry_Value()
  {
    return (EReference)astriumHeaderEntryEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAstriumHeaderEntry_SimpleValue()
  {
    return (EAttribute)astriumHeaderEntryEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSVEntry()
  {
    return csvEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSVCommand()
  {
    return csvCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSVCommand_Command()
  {
    return (EAttribute)csvCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSVCommand_Args()
  {
    return (EReference)csvCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTCArgs()
  {
    return tcArgsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTCArgs_TcName()
  {
    return (EAttribute)tcArgsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTCArgs_TcValue()
  {
    return (EAttribute)tcArgsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTCArgs_TcMod()
  {
    return (EAttribute)tcArgsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTCArgs_Tolerance()
  {
    return (EAttribute)tcArgsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSVTelemetry()
  {
    return csvTelemetryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSVTelemetry_TmArg()
  {
    return (EReference)csvTelemetryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSVSpell()
  {
    return csvSpellEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSVSpell_Cmd()
  {
    return (EReference)csvSpellEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpellCommand()
  {
    return spellCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseEntry()
  {
    return databaseEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatabaseEntry_Name()
  {
    return (EAttribute)databaseEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatabaseEntry_Value()
  {
    return (EReference)databaseEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatabaseValue()
  {
    return databaseValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLambda_Stmt()
  {
    return lambda_StmtEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLambda_Stmt_Variables()
  {
    return (EAttribute)lambda_StmtEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComplexValue()
  {
    return complexValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTuple()
  {
    return tupleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTuple_Values()
  {
    return (EReference)tupleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getList()
  {
    return listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getList_Values()
  {
    return (EReference)listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDictionary()
  {
    return dictionaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDictionaryEntry()
  {
    return dictionaryEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDictionaryEntry_Key()
  {
    return (EReference)dictionaryEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDictionaryEntry_Value()
  {
    return (EReference)dictionaryEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtom()
  {
    return atomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtom_Val()
  {
    return (EAttribute)atomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRelDate()
  {
    return relDateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRelDate_Val()
  {
    return (EAttribute)relDateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDate()
  {
    return dateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDate_Val()
  {
    return (EAttribute)dateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolean()
  {
    return booleanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringValue()
  {
    return stringValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumber()
  {
    return numberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumber_ValInt()
  {
    return (EAttribute)numberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumber_ValStr()
  {
    return (EAttribute)numberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAstriumSpellDatabase()
  {
    return astriumSpellDatabaseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAstriumSpellDatabase_Database()
  {
    return (EReference)astriumSpellDatabaseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSVFile()
  {
    return csvFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCSVFile_CsvEntries()
  {
    return (EReference)csvFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAstriumVariableComment()
  {
    return astriumVariableCommentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAstriumVariableComment_Comment()
  {
    return (EAttribute)astriumVariableCommentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAstriumHeaderComment()
  {
    return astriumHeaderCommentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAstriumHeaderComment_Comment()
  {
    return (EAttribute)astriumHeaderCommentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWaitCommand()
  {
    return waitCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWaitCommand_Value()
  {
    return (EAttribute)waitCommandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWaitCommand_Unit()
  {
    return (EAttribute)waitCommandEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPauseCommand()
  {
    return pauseCommandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDicitonary()
  {
    return dicitonaryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDicitonary_Entries()
  {
    return (EReference)dicitonaryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellDatabaseFactory getSpellDatabaseFactory()
  {
    return (SpellDatabaseFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    spellDatabaseEClass = createEClass(SPELL_DATABASE);
    createEReference(spellDatabaseEClass, SPELL_DATABASE__DATABASE_ENTRY);

    astriumDatabaseEClass = createEClass(ASTRIUM_DATABASE);
    createEReference(astriumDatabaseEClass, ASTRIUM_DATABASE__ENTRIES);

    astriumVariableEntryEClass = createEClass(ASTRIUM_VARIABLE_ENTRY);
    createEAttribute(astriumVariableEntryEClass, ASTRIUM_VARIABLE_ENTRY__NAME);
    createEAttribute(astriumVariableEntryEClass, ASTRIUM_VARIABLE_ENTRY__ASTRIUM_TIME);
    createEReference(astriumVariableEntryEClass, ASTRIUM_VARIABLE_ENTRY__VALUE);
    createEAttribute(astriumVariableEntryEClass, ASTRIUM_VARIABLE_ENTRY__SIMPLE_VALUE);

    astriumHeaderEntryEClass = createEClass(ASTRIUM_HEADER_ENTRY);
    createEAttribute(astriumHeaderEntryEClass, ASTRIUM_HEADER_ENTRY__NAME);
    createEAttribute(astriumHeaderEntryEClass, ASTRIUM_HEADER_ENTRY__ASTRIUM_TIME);
    createEReference(astriumHeaderEntryEClass, ASTRIUM_HEADER_ENTRY__VALUE);
    createEAttribute(astriumHeaderEntryEClass, ASTRIUM_HEADER_ENTRY__SIMPLE_VALUE);

    csvEntryEClass = createEClass(CSV_ENTRY);

    csvCommandEClass = createEClass(CSV_COMMAND);
    createEAttribute(csvCommandEClass, CSV_COMMAND__COMMAND);
    createEReference(csvCommandEClass, CSV_COMMAND__ARGS);

    tcArgsEClass = createEClass(TC_ARGS);
    createEAttribute(tcArgsEClass, TC_ARGS__TC_NAME);
    createEAttribute(tcArgsEClass, TC_ARGS__TC_VALUE);
    createEAttribute(tcArgsEClass, TC_ARGS__TC_MOD);
    createEAttribute(tcArgsEClass, TC_ARGS__TOLERANCE);

    csvTelemetryEClass = createEClass(CSV_TELEMETRY);
    createEReference(csvTelemetryEClass, CSV_TELEMETRY__TM_ARG);

    csvSpellEClass = createEClass(CSV_SPELL);
    createEReference(csvSpellEClass, CSV_SPELL__CMD);

    spellCommandEClass = createEClass(SPELL_COMMAND);

    databaseEntryEClass = createEClass(DATABASE_ENTRY);
    createEAttribute(databaseEntryEClass, DATABASE_ENTRY__NAME);
    createEReference(databaseEntryEClass, DATABASE_ENTRY__VALUE);

    databaseValueEClass = createEClass(DATABASE_VALUE);

    lambda_StmtEClass = createEClass(LAMBDA_STMT);
    createEAttribute(lambda_StmtEClass, LAMBDA_STMT__VARIABLES);

    complexValueEClass = createEClass(COMPLEX_VALUE);

    tupleEClass = createEClass(TUPLE);
    createEReference(tupleEClass, TUPLE__VALUES);

    listEClass = createEClass(LIST);
    createEReference(listEClass, LIST__VALUES);

    dictionaryEClass = createEClass(DICTIONARY);

    dictionaryEntryEClass = createEClass(DICTIONARY_ENTRY);
    createEReference(dictionaryEntryEClass, DICTIONARY_ENTRY__KEY);
    createEReference(dictionaryEntryEClass, DICTIONARY_ENTRY__VALUE);

    atomEClass = createEClass(ATOM);
    createEAttribute(atomEClass, ATOM__VAL);

    relDateEClass = createEClass(REL_DATE);
    createEAttribute(relDateEClass, REL_DATE__VAL);

    dateEClass = createEClass(DATE);
    createEAttribute(dateEClass, DATE__VAL);

    booleanEClass = createEClass(BOOLEAN);

    stringValueEClass = createEClass(STRING_VALUE);

    numberEClass = createEClass(NUMBER);
    createEAttribute(numberEClass, NUMBER__VAL_INT);
    createEAttribute(numberEClass, NUMBER__VAL_STR);

    astriumSpellDatabaseEClass = createEClass(ASTRIUM_SPELL_DATABASE);
    createEReference(astriumSpellDatabaseEClass, ASTRIUM_SPELL_DATABASE__DATABASE);

    csvFileEClass = createEClass(CSV_FILE);
    createEReference(csvFileEClass, CSV_FILE__CSV_ENTRIES);

    astriumVariableCommentEClass = createEClass(ASTRIUM_VARIABLE_COMMENT);
    createEAttribute(astriumVariableCommentEClass, ASTRIUM_VARIABLE_COMMENT__COMMENT);

    astriumHeaderCommentEClass = createEClass(ASTRIUM_HEADER_COMMENT);
    createEAttribute(astriumHeaderCommentEClass, ASTRIUM_HEADER_COMMENT__COMMENT);

    waitCommandEClass = createEClass(WAIT_COMMAND);
    createEAttribute(waitCommandEClass, WAIT_COMMAND__VALUE);
    createEAttribute(waitCommandEClass, WAIT_COMMAND__UNIT);

    pauseCommandEClass = createEClass(PAUSE_COMMAND);

    dicitonaryEClass = createEClass(DICITONARY);
    createEReference(dicitonaryEClass, DICITONARY__ENTRIES);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    csvCommandEClass.getESuperTypes().add(this.getCSVEntry());
    csvTelemetryEClass.getESuperTypes().add(this.getCSVEntry());
    csvSpellEClass.getESuperTypes().add(this.getCSVEntry());
    lambda_StmtEClass.getESuperTypes().add(this.getAtom());
    complexValueEClass.getESuperTypes().add(this.getDatabaseValue());
    tupleEClass.getESuperTypes().add(this.getComplexValue());
    listEClass.getESuperTypes().add(this.getComplexValue());
    dictionaryEClass.getESuperTypes().add(this.getComplexValue());
    atomEClass.getESuperTypes().add(this.getDatabaseValue());
    relDateEClass.getESuperTypes().add(this.getDatabaseValue());
    dateEClass.getESuperTypes().add(this.getDatabaseValue());
    booleanEClass.getESuperTypes().add(this.getAtom());
    stringValueEClass.getESuperTypes().add(this.getAtom());
    numberEClass.getESuperTypes().add(this.getAtom());
    astriumSpellDatabaseEClass.getESuperTypes().add(this.getSpellDatabase());
    csvFileEClass.getESuperTypes().add(this.getSpellDatabase());
    astriumVariableCommentEClass.getESuperTypes().add(this.getAstriumVariableEntry());
    astriumHeaderCommentEClass.getESuperTypes().add(this.getAstriumHeaderEntry());
    waitCommandEClass.getESuperTypes().add(this.getSpellCommand());
    pauseCommandEClass.getESuperTypes().add(this.getSpellCommand());
    dicitonaryEClass.getESuperTypes().add(this.getDictionary());

    // Initialize classes and features; add operations and parameters
    initEClass(spellDatabaseEClass, SpellDatabase.class, "SpellDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSpellDatabase_DatabaseEntry(), this.getDatabaseEntry(), null, "databaseEntry", null, 0, -1, SpellDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(astriumDatabaseEClass, AstriumDatabase.class, "AstriumDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAstriumDatabase_Entries(), ecorePackage.getEObject(), null, "entries", null, 0, -1, AstriumDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(astriumVariableEntryEClass, AstriumVariableEntry.class, "AstriumVariableEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAstriumVariableEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, AstriumVariableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAstriumVariableEntry_AstriumTime(), ecorePackage.getEString(), "astriumTime", null, 0, 1, AstriumVariableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAstriumVariableEntry_Value(), this.getAtom(), null, "value", null, 0, 1, AstriumVariableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAstriumVariableEntry_SimpleValue(), ecorePackage.getEString(), "simpleValue", null, 0, 1, AstriumVariableEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(astriumHeaderEntryEClass, AstriumHeaderEntry.class, "AstriumHeaderEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAstriumHeaderEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, AstriumHeaderEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAstriumHeaderEntry_AstriumTime(), ecorePackage.getEString(), "astriumTime", null, 0, 1, AstriumHeaderEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAstriumHeaderEntry_Value(), this.getAtom(), null, "value", null, 0, 1, AstriumHeaderEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAstriumHeaderEntry_SimpleValue(), ecorePackage.getEString(), "simpleValue", null, 0, 1, AstriumHeaderEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(csvEntryEClass, CSVEntry.class, "CSVEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(csvCommandEClass, CSVCommand.class, "CSVCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCSVCommand_Command(), ecorePackage.getEString(), "command", null, 0, 1, CSVCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCSVCommand_Args(), this.getTCArgs(), null, "args", null, 0, -1, CSVCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(tcArgsEClass, TCArgs.class, "TCArgs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTCArgs_TcName(), ecorePackage.getEString(), "tcName", null, 0, 1, TCArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTCArgs_TcValue(), ecorePackage.getEString(), "tcValue", null, 0, 1, TCArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTCArgs_TcMod(), ecorePackage.getEString(), "tcMod", null, 0, 1, TCArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTCArgs_Tolerance(), ecorePackage.getEString(), "tolerance", null, 0, 1, TCArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(csvTelemetryEClass, CSVTelemetry.class, "CSVTelemetry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSVTelemetry_TmArg(), this.getTCArgs(), null, "tmArg", null, 0, 1, CSVTelemetry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(csvSpellEClass, CSVSpell.class, "CSVSpell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSVSpell_Cmd(), this.getSpellCommand(), null, "cmd", null, 0, 1, CSVSpell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(spellCommandEClass, SpellCommand.class, "SpellCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(databaseEntryEClass, DatabaseEntry.class, "DatabaseEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatabaseEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, DatabaseEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatabaseEntry_Value(), this.getDatabaseValue(), null, "value", null, 0, 1, DatabaseEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(databaseValueEClass, DatabaseValue.class, "DatabaseValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lambda_StmtEClass, Lambda_Stmt.class, "Lambda_Stmt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLambda_Stmt_Variables(), ecorePackage.getEString(), "variables", null, 0, 1, Lambda_Stmt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(complexValueEClass, ComplexValue.class, "ComplexValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(tupleEClass, Tuple.class, "Tuple", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTuple_Values(), this.getDatabaseValue(), null, "values", null, 0, -1, Tuple.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(listEClass, List.class, "List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getList_Values(), this.getDatabaseValue(), null, "values", null, 0, -1, List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dictionaryEClass, Dictionary.class, "Dictionary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dictionaryEntryEClass, DictionaryEntry.class, "DictionaryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDictionaryEntry_Key(), this.getDatabaseValue(), null, "key", null, 0, 1, DictionaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDictionaryEntry_Value(), this.getDatabaseValue(), null, "value", null, 0, 1, DictionaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomEClass, Atom.class, "Atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAtom_Val(), ecorePackage.getEString(), "val", null, 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(relDateEClass, RelDate.class, "RelDate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRelDate_Val(), ecorePackage.getEString(), "val", null, 0, 1, RelDate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDate_Val(), ecorePackage.getEString(), "val", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(booleanEClass, lu.ses.engineering.spell.spellDatabase.Boolean.class, "Boolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(numberEClass, lu.ses.engineering.spell.spellDatabase.Number.class, "Number", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumber_ValInt(), ecorePackage.getEInt(), "valInt", null, 0, 1, lu.ses.engineering.spell.spellDatabase.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNumber_ValStr(), ecorePackage.getEString(), "valStr", null, 0, 1, lu.ses.engineering.spell.spellDatabase.Number.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(astriumSpellDatabaseEClass, AstriumSpellDatabase.class, "AstriumSpellDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAstriumSpellDatabase_Database(), this.getAstriumDatabase(), null, "database", null, 0, 1, AstriumSpellDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(csvFileEClass, CSVFile.class, "CSVFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCSVFile_CsvEntries(), this.getCSVEntry(), null, "csvEntries", null, 0, -1, CSVFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(astriumVariableCommentEClass, AstriumVariableComment.class, "AstriumVariableComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAstriumVariableComment_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, AstriumVariableComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(astriumHeaderCommentEClass, AstriumHeaderComment.class, "AstriumHeaderComment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAstriumHeaderComment_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, AstriumHeaderComment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(waitCommandEClass, WaitCommand.class, "WaitCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWaitCommand_Value(), ecorePackage.getEString(), "value", null, 0, 1, WaitCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWaitCommand_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, WaitCommand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pauseCommandEClass, PauseCommand.class, "PauseCommand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dicitonaryEClass, Dicitonary.class, "Dicitonary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDicitonary_Entries(), this.getDictionaryEntry(), null, "entries", null, 0, -1, Dicitonary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SpellDatabasePackageImpl
