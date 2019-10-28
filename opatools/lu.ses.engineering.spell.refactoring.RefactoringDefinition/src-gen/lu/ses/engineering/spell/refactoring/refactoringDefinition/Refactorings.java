/**
 */
package lu.ses.engineering.spell.refactoring.refactoringDefinition;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refactorings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.Refactorings#getRefactorings <em>Refactorings</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.RefactoringDefinitionPackage#getRefactorings()
 * @model
 * @generated
 */
public interface Refactorings extends EObject
{
  /**
   * Returns the value of the '<em><b>Refactorings</b></em>' map.
   * The key is of type {@link java.lang.String},
   * and the value is of type {@link java.lang.String},
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refactorings</em>' map isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refactorings</em>' map.
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.RefactoringDefinitionPackage#getRefactorings_Refactorings()
   * @model mapType="lu.ses.engineering.spell.refactoring.refactoringDefinition.refactorMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
   * @generated
   */
  EMap<String, String> getRefactorings();

} // Refactorings
