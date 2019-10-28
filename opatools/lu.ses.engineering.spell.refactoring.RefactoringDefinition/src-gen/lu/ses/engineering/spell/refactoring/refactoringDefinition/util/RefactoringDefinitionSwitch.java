/**
 */
package lu.ses.engineering.spell.refactoring.refactoringDefinition.util;

import java.util.Map;

import lu.ses.engineering.spell.refactoring.refactoringDefinition.*;

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
 * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.RefactoringDefinitionPackage
 * @generated
 */
public class RefactoringDefinitionSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RefactoringDefinitionPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefactoringDefinitionSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = RefactoringDefinitionPackage.eINSTANCE;
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
      case RefactoringDefinitionPackage.REFACTORINGS:
      {
        Refactorings refactorings = (Refactorings)theEObject;
        T result = caseRefactorings(refactorings);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RefactoringDefinitionPackage.REFACTOR_MAP_ENTRY:
      {
        @SuppressWarnings("unchecked") Map.Entry<String, String> refactorMapEntry = (Map.Entry<String, String>)theEObject;
        T result = caserefactorMapEntry(refactorMapEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RefactoringDefinitionPackage.ARG_REFACTOR_MAP_ENTRY:
      {
        @SuppressWarnings("unchecked") Map.Entry<argRefactor, String> argRefactorMapEntry = (Map.Entry<argRefactor, String>)theEObject;
        T result = caseargRefactorMapEntry(argRefactorMapEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case RefactoringDefinitionPackage.ARG_REFACTOR:
      {
        argRefactor argRefactor = (argRefactor)theEObject;
        T result = caseargRefactor(argRefactor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refactorings</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refactorings</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefactorings(Refactorings object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>refactor Map Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>refactor Map Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserefactorMapEntry(Map.Entry<String, String> object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>arg Refactor Map Entry</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>arg Refactor Map Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseargRefactorMapEntry(Map.Entry<argRefactor, String> object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>arg Refactor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>arg Refactor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseargRefactor(argRefactor object)
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

} //RefactoringDefinitionSwitch
