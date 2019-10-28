/**
 */
package lu.ses.engineering.spell.spellDatabase;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage
 * @generated
 */
public interface SpellDatabaseFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SpellDatabaseFactory eINSTANCE = lu.ses.engineering.spell.spellDatabase.impl.SpellDatabaseFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Spell Database</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spell Database</em>'.
   * @generated
   */
  SpellDatabase createSpellDatabase();

  /**
   * Returns a new object of class '<em>Astrium Database</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Astrium Database</em>'.
   * @generated
   */
  AstriumDatabase createAstriumDatabase();

  /**
   * Returns a new object of class '<em>Astrium Variable Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Astrium Variable Entry</em>'.
   * @generated
   */
  AstriumVariableEntry createAstriumVariableEntry();

  /**
   * Returns a new object of class '<em>Astrium Header Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Astrium Header Entry</em>'.
   * @generated
   */
  AstriumHeaderEntry createAstriumHeaderEntry();

  /**
   * Returns a new object of class '<em>CSV Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSV Entry</em>'.
   * @generated
   */
  CSVEntry createCSVEntry();

  /**
   * Returns a new object of class '<em>CSV Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSV Command</em>'.
   * @generated
   */
  CSVCommand createCSVCommand();

  /**
   * Returns a new object of class '<em>TC Args</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>TC Args</em>'.
   * @generated
   */
  TCArgs createTCArgs();

  /**
   * Returns a new object of class '<em>CSV Telemetry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSV Telemetry</em>'.
   * @generated
   */
  CSVTelemetry createCSVTelemetry();

  /**
   * Returns a new object of class '<em>CSV Spell</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSV Spell</em>'.
   * @generated
   */
  CSVSpell createCSVSpell();

  /**
   * Returns a new object of class '<em>Spell Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Spell Command</em>'.
   * @generated
   */
  SpellCommand createSpellCommand();

  /**
   * Returns a new object of class '<em>Database Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database Entry</em>'.
   * @generated
   */
  DatabaseEntry createDatabaseEntry();

  /**
   * Returns a new object of class '<em>Database Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Database Value</em>'.
   * @generated
   */
  DatabaseValue createDatabaseValue();

  /**
   * Returns a new object of class '<em>Lambda Stmt</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lambda Stmt</em>'.
   * @generated
   */
  Lambda_Stmt createLambda_Stmt();

  /**
   * Returns a new object of class '<em>Complex Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Complex Value</em>'.
   * @generated
   */
  ComplexValue createComplexValue();

  /**
   * Returns a new object of class '<em>Tuple</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tuple</em>'.
   * @generated
   */
  Tuple createTuple();

  /**
   * Returns a new object of class '<em>List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List</em>'.
   * @generated
   */
  List createList();

  /**
   * Returns a new object of class '<em>Dictionary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dictionary</em>'.
   * @generated
   */
  Dictionary createDictionary();

  /**
   * Returns a new object of class '<em>Dictionary Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dictionary Entry</em>'.
   * @generated
   */
  DictionaryEntry createDictionaryEntry();

  /**
   * Returns a new object of class '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atom</em>'.
   * @generated
   */
  Atom createAtom();

  /**
   * Returns a new object of class '<em>Rel Date</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rel Date</em>'.
   * @generated
   */
  RelDate createRelDate();

  /**
   * Returns a new object of class '<em>Date</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Date</em>'.
   * @generated
   */
  Date createDate();

  /**
   * Returns a new object of class '<em>Boolean</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean</em>'.
   * @generated
   */
  Boolean createBoolean();

  /**
   * Returns a new object of class '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value</em>'.
   * @generated
   */
  StringValue createStringValue();

  /**
   * Returns a new object of class '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number</em>'.
   * @generated
   */
  Number createNumber();

  /**
   * Returns a new object of class '<em>Astrium Spell Database</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Astrium Spell Database</em>'.
   * @generated
   */
  AstriumSpellDatabase createAstriumSpellDatabase();

  /**
   * Returns a new object of class '<em>CSV File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSV File</em>'.
   * @generated
   */
  CSVFile createCSVFile();

  /**
   * Returns a new object of class '<em>Astrium Variable Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Astrium Variable Comment</em>'.
   * @generated
   */
  AstriumVariableComment createAstriumVariableComment();

  /**
   * Returns a new object of class '<em>Astrium Header Comment</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Astrium Header Comment</em>'.
   * @generated
   */
  AstriumHeaderComment createAstriumHeaderComment();

  /**
   * Returns a new object of class '<em>Wait Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Wait Command</em>'.
   * @generated
   */
  WaitCommand createWaitCommand();

  /**
   * Returns a new object of class '<em>Pause Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pause Command</em>'.
   * @generated
   */
  PauseCommand createPauseCommand();

  /**
   * Returns a new object of class '<em>Dicitonary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dicitonary</em>'.
   * @generated
   */
  Dicitonary createDicitonary();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SpellDatabasePackage getSpellDatabasePackage();

} //SpellDatabaseFactory
