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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage
 * @generated
 */
public class SpellDatabaseAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SpellDatabasePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpellDatabaseAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SpellDatabasePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpellDatabaseSwitch<Adapter> modelSwitch =
    new SpellDatabaseSwitch<Adapter>()
    {
      @Override
      public Adapter caseSpellDatabase(SpellDatabase object)
      {
        return createSpellDatabaseAdapter();
      }
      @Override
      public Adapter caseAstriumDatabase(AstriumDatabase object)
      {
        return createAstriumDatabaseAdapter();
      }
      @Override
      public Adapter caseAstriumVariableEntry(AstriumVariableEntry object)
      {
        return createAstriumVariableEntryAdapter();
      }
      @Override
      public Adapter caseAstriumHeaderEntry(AstriumHeaderEntry object)
      {
        return createAstriumHeaderEntryAdapter();
      }
      @Override
      public Adapter caseCSVEntry(CSVEntry object)
      {
        return createCSVEntryAdapter();
      }
      @Override
      public Adapter caseCSVCommand(CSVCommand object)
      {
        return createCSVCommandAdapter();
      }
      @Override
      public Adapter caseTCArgs(TCArgs object)
      {
        return createTCArgsAdapter();
      }
      @Override
      public Adapter caseCSVTelemetry(CSVTelemetry object)
      {
        return createCSVTelemetryAdapter();
      }
      @Override
      public Adapter caseCSVSpell(CSVSpell object)
      {
        return createCSVSpellAdapter();
      }
      @Override
      public Adapter caseSpellCommand(SpellCommand object)
      {
        return createSpellCommandAdapter();
      }
      @Override
      public Adapter caseDatabaseEntry(DatabaseEntry object)
      {
        return createDatabaseEntryAdapter();
      }
      @Override
      public Adapter caseDatabaseValue(DatabaseValue object)
      {
        return createDatabaseValueAdapter();
      }
      @Override
      public Adapter caseLambda_Stmt(Lambda_Stmt object)
      {
        return createLambda_StmtAdapter();
      }
      @Override
      public Adapter caseComplexValue(ComplexValue object)
      {
        return createComplexValueAdapter();
      }
      @Override
      public Adapter caseTuple(Tuple object)
      {
        return createTupleAdapter();
      }
      @Override
      public Adapter caseList(List object)
      {
        return createListAdapter();
      }
      @Override
      public Adapter caseDictionary(Dictionary object)
      {
        return createDictionaryAdapter();
      }
      @Override
      public Adapter caseDictionaryEntry(DictionaryEntry object)
      {
        return createDictionaryEntryAdapter();
      }
      @Override
      public Adapter caseAtom(Atom object)
      {
        return createAtomAdapter();
      }
      @Override
      public Adapter caseRelDate(RelDate object)
      {
        return createRelDateAdapter();
      }
      @Override
      public Adapter caseDate(Date object)
      {
        return createDateAdapter();
      }
      @Override
      public Adapter caseBoolean(lu.ses.engineering.spell.spellDatabase.Boolean object)
      {
        return createBooleanAdapter();
      }
      @Override
      public Adapter caseStringValue(StringValue object)
      {
        return createStringValueAdapter();
      }
      @Override
      public Adapter caseNumber(lu.ses.engineering.spell.spellDatabase.Number object)
      {
        return createNumberAdapter();
      }
      @Override
      public Adapter caseAstriumSpellDatabase(AstriumSpellDatabase object)
      {
        return createAstriumSpellDatabaseAdapter();
      }
      @Override
      public Adapter caseCSVFile(CSVFile object)
      {
        return createCSVFileAdapter();
      }
      @Override
      public Adapter caseAstriumVariableComment(AstriumVariableComment object)
      {
        return createAstriumVariableCommentAdapter();
      }
      @Override
      public Adapter caseAstriumHeaderComment(AstriumHeaderComment object)
      {
        return createAstriumHeaderCommentAdapter();
      }
      @Override
      public Adapter caseWaitCommand(WaitCommand object)
      {
        return createWaitCommandAdapter();
      }
      @Override
      public Adapter casePauseCommand(PauseCommand object)
      {
        return createPauseCommandAdapter();
      }
      @Override
      public Adapter caseDicitonary(Dicitonary object)
      {
        return createDicitonaryAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.SpellDatabase <em>Spell Database</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.SpellDatabase
   * @generated
   */
  public Adapter createSpellDatabaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.AstriumDatabase <em>Astrium Database</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumDatabase
   * @generated
   */
  public Adapter createAstriumDatabaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry <em>Astrium Variable Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumVariableEntry
   * @generated
   */
  public Adapter createAstriumVariableEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.AstriumHeaderEntry <em>Astrium Header Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumHeaderEntry
   * @generated
   */
  public Adapter createAstriumHeaderEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.CSVEntry <em>CSV Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.CSVEntry
   * @generated
   */
  public Adapter createCSVEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.CSVCommand <em>CSV Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.CSVCommand
   * @generated
   */
  public Adapter createCSVCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.TCArgs <em>TC Args</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.TCArgs
   * @generated
   */
  public Adapter createTCArgsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.CSVTelemetry <em>CSV Telemetry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.CSVTelemetry
   * @generated
   */
  public Adapter createCSVTelemetryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.CSVSpell <em>CSV Spell</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.CSVSpell
   * @generated
   */
  public Adapter createCSVSpellAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.SpellCommand <em>Spell Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.SpellCommand
   * @generated
   */
  public Adapter createSpellCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.DatabaseEntry <em>Database Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.DatabaseEntry
   * @generated
   */
  public Adapter createDatabaseEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.DatabaseValue <em>Database Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.DatabaseValue
   * @generated
   */
  public Adapter createDatabaseValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.Lambda_Stmt <em>Lambda Stmt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.Lambda_Stmt
   * @generated
   */
  public Adapter createLambda_StmtAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.ComplexValue <em>Complex Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.ComplexValue
   * @generated
   */
  public Adapter createComplexValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.Tuple <em>Tuple</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.Tuple
   * @generated
   */
  public Adapter createTupleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.List
   * @generated
   */
  public Adapter createListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.Dictionary <em>Dictionary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.Dictionary
   * @generated
   */
  public Adapter createDictionaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.DictionaryEntry <em>Dictionary Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.DictionaryEntry
   * @generated
   */
  public Adapter createDictionaryEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.Atom
   * @generated
   */
  public Adapter createAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.RelDate <em>Rel Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.RelDate
   * @generated
   */
  public Adapter createRelDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.Date <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.Date
   * @generated
   */
  public Adapter createDateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.Boolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.Boolean
   * @generated
   */
  public Adapter createBooleanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.StringValue
   * @generated
   */
  public Adapter createStringValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.Number <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.Number
   * @generated
   */
  public Adapter createNumberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.AstriumSpellDatabase <em>Astrium Spell Database</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumSpellDatabase
   * @generated
   */
  public Adapter createAstriumSpellDatabaseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.CSVFile <em>CSV File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.CSVFile
   * @generated
   */
  public Adapter createCSVFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.AstriumVariableComment <em>Astrium Variable Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumVariableComment
   * @generated
   */
  public Adapter createAstriumVariableCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.AstriumHeaderComment <em>Astrium Header Comment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.AstriumHeaderComment
   * @generated
   */
  public Adapter createAstriumHeaderCommentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.WaitCommand <em>Wait Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.WaitCommand
   * @generated
   */
  public Adapter createWaitCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.PauseCommand <em>Pause Command</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.PauseCommand
   * @generated
   */
  public Adapter createPauseCommandAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link lu.ses.engineering.spell.spellDatabase.Dicitonary <em>Dicitonary</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see lu.ses.engineering.spell.spellDatabase.Dicitonary
   * @generated
   */
  public Adapter createDicitonaryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SpellDatabaseAdapterFactory
