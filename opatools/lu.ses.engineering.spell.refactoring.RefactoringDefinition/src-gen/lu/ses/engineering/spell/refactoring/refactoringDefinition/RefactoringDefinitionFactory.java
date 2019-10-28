/**
 */
package lu.ses.engineering.spell.refactoring.refactoringDefinition;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.RefactoringDefinitionPackage
 * @generated
 */
public interface RefactoringDefinitionFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RefactoringDefinitionFactory eINSTANCE = lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.RefactoringDefinitionFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Refactorings</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Refactorings</em>'.
   * @generated
   */
  Refactorings createRefactorings();

  /**
   * Returns a new object of class '<em>arg Refactor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>arg Refactor</em>'.
   * @generated
   */
  argRefactor createargRefactor();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  RefactoringDefinitionPackage getRefactoringDefinitionPackage();

} //RefactoringDefinitionFactory
