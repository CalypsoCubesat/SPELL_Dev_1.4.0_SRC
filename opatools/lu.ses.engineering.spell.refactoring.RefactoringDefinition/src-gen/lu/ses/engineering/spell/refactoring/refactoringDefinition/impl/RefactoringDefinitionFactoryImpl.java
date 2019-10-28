/**
 */
package lu.ses.engineering.spell.refactoring.refactoringDefinition.impl;

import java.util.Map;

import lu.ses.engineering.spell.refactoring.refactoringDefinition.*;

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
public class RefactoringDefinitionFactoryImpl extends EFactoryImpl implements RefactoringDefinitionFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RefactoringDefinitionFactory init()
  {
    try
    {
      RefactoringDefinitionFactory theRefactoringDefinitionFactory = (RefactoringDefinitionFactory)EPackage.Registry.INSTANCE.getEFactory(RefactoringDefinitionPackage.eNS_URI);
      if (theRefactoringDefinitionFactory != null)
      {
        return theRefactoringDefinitionFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RefactoringDefinitionFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefactoringDefinitionFactoryImpl()
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
      case RefactoringDefinitionPackage.REFACTORINGS: return createRefactorings();
      case RefactoringDefinitionPackage.REFACTOR_MAP_ENTRY: return (EObject)createrefactorMapEntry();
      case RefactoringDefinitionPackage.ARG_REFACTOR_MAP_ENTRY: return (EObject)createargRefactorMapEntry();
      case RefactoringDefinitionPackage.ARG_REFACTOR: return createargRefactor();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Refactorings createRefactorings()
  {
    RefactoringsImpl refactorings = new RefactoringsImpl();
    return refactorings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map.Entry<String, String> createrefactorMapEntry()
  {
    refactorMapEntryImpl refactorMapEntry = new refactorMapEntryImpl();
    return refactorMapEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Map.Entry<argRefactor, String> createargRefactorMapEntry()
  {
    argRefactorMapEntryImpl argRefactorMapEntry = new argRefactorMapEntryImpl();
    return argRefactorMapEntry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public argRefactor createargRefactor()
  {
    argRefactorImpl argRefactor = new argRefactorImpl();
    return argRefactor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefactoringDefinitionPackage getRefactoringDefinitionPackage()
  {
    return (RefactoringDefinitionPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RefactoringDefinitionPackage getPackage()
  {
    return RefactoringDefinitionPackage.eINSTANCE;
  }

} //RefactoringDefinitionFactoryImpl
