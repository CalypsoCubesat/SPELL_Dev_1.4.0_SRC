/**
 */
package lu.ses.engineering.spell.refactoring.refactoringDefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>arg Refactor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.argRefactor#getMnem <em>Mnem</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.argRefactor#getRaw <em>Raw</em>}</li>
 * </ul>
 *
 * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.RefactoringDefinitionPackage#getargRefactor()
 * @model
 * @generated
 */
public interface argRefactor extends EObject
{
  /**
   * Returns the value of the '<em><b>Mnem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mnem</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mnem</em>' attribute.
   * @see #setMnem(String)
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.RefactoringDefinitionPackage#getargRefactor_Mnem()
   * @model
   * @generated
   */
  String getMnem();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.argRefactor#getMnem <em>Mnem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mnem</em>' attribute.
   * @see #getMnem()
   * @generated
   */
  void setMnem(String value);

  /**
   * Returns the value of the '<em><b>Raw</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Raw</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Raw</em>' attribute.
   * @see #setRaw(String)
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.RefactoringDefinitionPackage#getargRefactor_Raw()
   * @model
   * @generated
   */
  String getRaw();

  /**
   * Sets the value of the '{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.argRefactor#getRaw <em>Raw</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Raw</em>' attribute.
   * @see #getRaw()
   * @generated
   */
  void setRaw(String value);

} // argRefactor
