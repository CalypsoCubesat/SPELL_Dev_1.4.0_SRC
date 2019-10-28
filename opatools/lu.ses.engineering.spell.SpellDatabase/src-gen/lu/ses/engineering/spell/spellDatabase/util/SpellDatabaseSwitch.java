/**
 */
package lu.ses.engineering.spell.spellDatabase.util;

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
import lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage;
import lu.ses.engineering.spell.spellDatabase.StringValue;
import lu.ses.engineering.spell.spellDatabase.TCArgs;
import lu.ses.engineering.spell.spellDatabase.Tuple;
import lu.ses.engineering.spell.spellDatabase.WaitCommand;

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
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage
 * @generated
 */
public class SpellDatabaseSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SpellDatabasePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellDatabaseSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SpellDatabasePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SpellDatabasePackage.SPELL_DATABASE:
      {
        SpellDatabase spellDatabase = (SpellDatabase)theEObject;
        T result = caseSpellDatabase(spellDatabase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.ASTRIUM_DATABASE:
      {
        AstriumDatabase astriumDatabase = (AstriumDatabase)theEObject;
        T result = caseAstriumDatabase(astriumDatabase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.ASTRIUM_VARIABLE_ENTRY:
      {
        AstriumVariableEntry astriumVariableEntry = (AstriumVariableEntry)theEObject;
        T result = caseAstriumVariableEntry(astriumVariableEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY:
      {
        AstriumHeaderEntry astriumHeaderEntry = (AstriumHeaderEntry)theEObject;
        T result = caseAstriumHeaderEntry(astriumHeaderEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.CSV_ENTRY:
      {
        CSVEntry csvEntry = (CSVEntry)theEObject;
        T result = caseCSVEntry(csvEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.CSV_COMMAND:
      {
        CSVCommand csvCommand = (CSVCommand)theEObject;
        T result = caseCSVCommand(csvCommand);
        if (result == null) result = caseCSVEntry(csvCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.TC_ARGS:
      {
        TCArgs tcArgs = (TCArgs)theEObject;
        T result = caseTCArgs(tcArgs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.CSV_TELEMETRY:
      {
        CSVTelemetry csvTelemetry = (CSVTelemetry)theEObject;
        T result = caseCSVTelemetry(csvTelemetry);
        if (result == null) result = caseCSVEntry(csvTelemetry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.CSV_SPELL:
      {
        CSVSpell csvSpell = (CSVSpell)theEObject;
        T result = caseCSVSpell(csvSpell);
        if (result == null) result = caseCSVEntry(csvSpell);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.SPELL_COMMAND:
      {
        SpellCommand spellCommand = (SpellCommand)theEObject;
        T result = caseSpellCommand(spellCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.DATABASE_ENTRY:
      {
        DatabaseEntry databaseEntry = (DatabaseEntry)theEObject;
        T result = caseDatabaseEntry(databaseEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.DATABASE_VALUE:
      {
        DatabaseValue databaseValue = (DatabaseValue)theEObject;
        T result = caseDatabaseValue(databaseValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.LAMBDA_STMT:
      {
        Lambda_Stmt lambda_Stmt = (Lambda_Stmt)theEObject;
        T result = caseLambda_Stmt(lambda_Stmt);
        if (result == null) result = caseAtom(lambda_Stmt);
        if (result == null) result = caseDatabaseValue(lambda_Stmt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.COMPLEX_VALUE:
      {
        ComplexValue complexValue = (ComplexValue)theEObject;
        T result = caseComplexValue(complexValue);
        if (result == null) result = caseDatabaseValue(complexValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.TUPLE:
      {
        Tuple tuple = (Tuple)theEObject;
        T result = caseTuple(tuple);
        if (result == null) result = caseComplexValue(tuple);
        if (result == null) result = caseDatabaseValue(tuple);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.LIST:
      {
        List list = (List)theEObject;
        T result = caseList(list);
        if (result == null) result = caseComplexValue(list);
        if (result == null) result = caseDatabaseValue(list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.DICTIONARY:
      {
        Dictionary dictionary = (Dictionary)theEObject;
        T result = caseDictionary(dictionary);
        if (result == null) result = caseComplexValue(dictionary);
        if (result == null) result = caseDatabaseValue(dictionary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.DICTIONARY_ENTRY:
      {
        DictionaryEntry dictionaryEntry = (DictionaryEntry)theEObject;
        T result = caseDictionaryEntry(dictionaryEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.ATOM:
      {
        Atom atom = (Atom)theEObject;
        T result = caseAtom(atom);
        if (result == null) result = caseDatabaseValue(atom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.REL_DATE:
      {
        RelDate relDate = (RelDate)theEObject;
        T result = caseRelDate(relDate);
        if (result == null) result = caseDatabaseValue(relDate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.DATE:
      {
        Date date = (Date)theEObject;
        T result = caseDate(date);
        if (result == null) result = caseDatabaseValue(date);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.BOOLEAN:
      {
        lu.ses.engineering.spell.spellDatabase.Boolean boolean_ = (lu.ses.engineering.spell.spellDatabase.Boolean)theEObject;
        T result = caseBoolean(boolean_);
        if (result == null) result = caseAtom(boolean_);
        if (result == null) result = caseDatabaseValue(boolean_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.STRING_VALUE:
      {
        StringValue stringValue = (StringValue)theEObject;
        T result = caseStringValue(stringValue);
        if (result == null) result = caseAtom(stringValue);
        if (result == null) result = caseDatabaseValue(stringValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.NUMBER:
      {
        lu.ses.engineering.spell.spellDatabase.Number number = (lu.ses.engineering.spell.spellDatabase.Number)theEObject;
        T result = caseNumber(number);
        if (result == null) result = caseAtom(number);
        if (result == null) result = caseDatabaseValue(number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.ASTRIUM_SPELL_DATABASE:
      {
        AstriumSpellDatabase astriumSpellDatabase = (AstriumSpellDatabase)theEObject;
        T result = caseAstriumSpellDatabase(astriumSpellDatabase);
        if (result == null) result = caseSpellDatabase(astriumSpellDatabase);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.CSV_FILE:
      {
        CSVFile csvFile = (CSVFile)theEObject;
        T result = caseCSVFile(csvFile);
        if (result == null) result = caseSpellDatabase(csvFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.ASTRIUM_VARIABLE_COMMENT:
      {
        AstriumVariableComment astriumVariableComment = (AstriumVariableComment)theEObject;
        T result = caseAstriumVariableComment(astriumVariableComment);
        if (result == null) result = caseAstriumVariableEntry(astriumVariableComment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.ASTRIUM_HEADER_COMMENT:
      {
        AstriumHeaderComment astriumHeaderComment = (AstriumHeaderComment)theEObject;
        T result = caseAstriumHeaderComment(astriumHeaderComment);
        if (result == null) result = caseAstriumHeaderEntry(astriumHeaderComment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.WAIT_COMMAND:
      {
        WaitCommand waitCommand = (WaitCommand)theEObject;
        T result = caseWaitCommand(waitCommand);
        if (result == null) result = caseSpellCommand(waitCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.PAUSE_COMMAND:
      {
        PauseCommand pauseCommand = (PauseCommand)theEObject;
        T result = casePauseCommand(pauseCommand);
        if (result == null) result = caseSpellCommand(pauseCommand);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SpellDatabasePackage.DICITONARY:
      {
        Dicitonary dicitonary = (Dicitonary)theEObject;
        T result = caseDicitonary(dicitonary);
        if (result == null) result = caseDictionary(dicitonary);
        if (result == null) result = caseComplexValue(dicitonary);
        if (result == null) result = caseDatabaseValue(dicitonary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spell Database</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spell Database</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpellDatabase(SpellDatabase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Astrium Database</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Astrium Database</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAstriumDatabase(AstriumDatabase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Astrium Variable Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Astrium Variable Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAstriumVariableEntry(AstriumVariableEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Astrium Header Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Astrium Header Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAstriumHeaderEntry(AstriumHeaderEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSV Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSV Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSVEntry(CSVEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSV Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSV Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSVCommand(CSVCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TC Args</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TC Args</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTCArgs(TCArgs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSV Telemetry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSV Telemetry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSVTelemetry(CSVTelemetry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSV Spell</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSV Spell</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSVSpell(CSVSpell object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spell Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spell Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpellCommand(SpellCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Database Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Database Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatabaseEntry(DatabaseEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Database Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Database Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatabaseValue(DatabaseValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lambda Stmt</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lambda Stmt</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLambda_Stmt(Lambda_Stmt object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Complex Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Complex Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComplexValue(ComplexValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tuple</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tuple</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTuple(Tuple object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseList(List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dictionary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dictionary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDictionary(Dictionary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dictionary Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dictionary Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDictionaryEntry(DictionaryEntry object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtom(Atom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rel Date</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rel Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRelDate(RelDate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Date</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Date</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDate(Date object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolean(lu.ses.engineering.spell.spellDatabase.Boolean object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValue(StringValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumber(lu.ses.engineering.spell.spellDatabase.Number object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Astrium Spell Database</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Astrium Spell Database</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAstriumSpellDatabase(AstriumSpellDatabase object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSV File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSV File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSVFile(CSVFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Astrium Variable Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Astrium Variable Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAstriumVariableComment(AstriumVariableComment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Astrium Header Comment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Astrium Header Comment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAstriumHeaderComment(AstriumHeaderComment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wait Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wait Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWaitCommand(WaitCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pause Command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pause Command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePauseCommand(PauseCommand object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dicitonary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dicitonary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDicitonary(Dicitonary object)
  {
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SpellDatabaseSwitch
