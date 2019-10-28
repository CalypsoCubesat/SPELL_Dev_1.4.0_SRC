/**
 */
package lu.ses.engineering.spell.refactoring.refactoringDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.RefactoringDefinitionFactory
 * @model kind="package"
 * @generated
 */
public interface RefactoringDefinitionPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "refactoringDefinition";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ses.lu/engineering/spell/refactoring/RefactoringDefinition";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "refactoringDefinition";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RefactoringDefinitionPackage eINSTANCE = lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.RefactoringDefinitionPackageImpl.init();

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.RefactoringsImpl <em>Refactorings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.RefactoringsImpl
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.RefactoringDefinitionPackageImpl#getRefactorings()
   * @generated
   */
  int REFACTORINGS = 0;

  /**
   * The feature id for the '<em><b>Refactorings</b></em>' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFACTORINGS__REFACTORINGS = 0;

  /**
   * The number of structural features of the '<em>Refactorings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFACTORINGS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.refactorMapEntryImpl <em>refactor Map Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.refactorMapEntryImpl
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.RefactoringDefinitionPackageImpl#getrefactorMapEntry()
   * @generated
   */
  int REFACTOR_MAP_ENTRY = 1;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFACTOR_MAP_ENTRY__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFACTOR_MAP_ENTRY__VALUE = 1;

  /**
   * The number of structural features of the '<em>refactor Map Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFACTOR_MAP_ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.argRefactorMapEntryImpl <em>arg Refactor Map Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.argRefactorMapEntryImpl
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.RefactoringDefinitionPackageImpl#getargRefactorMapEntry()
   * @generated
   */
  int ARG_REFACTOR_MAP_ENTRY = 2;

  /**
   * The feature id for the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_REFACTOR_MAP_ENTRY__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_REFACTOR_MAP_ENTRY__VALUE = 1;

  /**
   * The number of structural features of the '<em>arg Refactor Map Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_REFACTOR_MAP_ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.argRefactorImpl <em>arg Refactor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.argRefactorImpl
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.RefactoringDefinitionPackageImpl#getargRefactor()
   * @generated
   */
  int ARG_REFACTOR = 3;

  /**
   * The feature id for the '<em><b>Mnem</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_REFACTOR__MNEM = 0;

  /**
   * The feature id for the '<em><b>Raw</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_REFACTOR__RAW = 1;

  /**
   * The number of structural features of the '<em>arg Refactor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_REFACTOR_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.Refactorings <em>Refactorings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refactorings</em>'.
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.Refactorings
   * @generated
   */
  EClass getRefactorings();

  /**
   * Returns the meta object for the map '{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.Refactorings#getRefactorings <em>Refactorings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the map '<em>Refactorings</em>'.
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.Refactorings#getRefactorings()
   * @see #getRefactorings()
   * @generated
   */
  EReference getRefactorings_Refactorings();

  /**
   * Returns the meta object for class '{@link java.util.Map.Entry <em>refactor Map Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>refactor Map Entry</em>'.
   * @see java.util.Map.Entry
   * @model keyDataType="org.eclipse.emf.ecore.EString"
   *        valueDataType="org.eclipse.emf.ecore.EString"
   * @generated
   */
  EClass getrefactorMapEntry();

  /**
   * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see java.util.Map.Entry
   * @see #getrefactorMapEntry()
   * @generated
   */
  EAttribute getrefactorMapEntry_Key();

  /**
   * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see java.util.Map.Entry
   * @see #getrefactorMapEntry()
   * @generated
   */
  EAttribute getrefactorMapEntry_Value();

  /**
   * Returns the meta object for class '{@link java.util.Map.Entry <em>arg Refactor Map Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>arg Refactor Map Entry</em>'.
   * @see java.util.Map.Entry
   * @model keyType="lu.ses.engineering.spell.refactoring.refactoringDefinition.argRefactor" keyContainment="true"
   *        valueDataType="org.eclipse.emf.ecore.EString"
   * @generated
   */
  EClass getargRefactorMapEntry();

  /**
   * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key</em>'.
   * @see java.util.Map.Entry
   * @see #getargRefactorMapEntry()
   * @generated
   */
  EReference getargRefactorMapEntry_Key();

  /**
   * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see java.util.Map.Entry
   * @see #getargRefactorMapEntry()
   * @generated
   */
  EAttribute getargRefactorMapEntry_Value();

  /**
   * Returns the meta object for class '{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.argRefactor <em>arg Refactor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>arg Refactor</em>'.
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.argRefactor
   * @generated
   */
  EClass getargRefactor();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.argRefactor#getMnem <em>Mnem</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mnem</em>'.
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.argRefactor#getMnem()
   * @see #getargRefactor()
   * @generated
   */
  EAttribute getargRefactor_Mnem();

  /**
   * Returns the meta object for the attribute '{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.argRefactor#getRaw <em>Raw</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Raw</em>'.
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.argRefactor#getRaw()
   * @see #getargRefactor()
   * @generated
   */
  EAttribute getargRefactor_Raw();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RefactoringDefinitionFactory getRefactoringDefinitionFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.RefactoringsImpl <em>Refactorings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.RefactoringsImpl
     * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.RefactoringDefinitionPackageImpl#getRefactorings()
     * @generated
     */
    EClass REFACTORINGS = eINSTANCE.getRefactorings();

    /**
     * The meta object literal for the '<em><b>Refactorings</b></em>' map feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFACTORINGS__REFACTORINGS = eINSTANCE.getRefactorings_Refactorings();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.refactorMapEntryImpl <em>refactor Map Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.refactorMapEntryImpl
     * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.RefactoringDefinitionPackageImpl#getrefactorMapEntry()
     * @generated
     */
    EClass REFACTOR_MAP_ENTRY = eINSTANCE.getrefactorMapEntry();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFACTOR_MAP_ENTRY__KEY = eINSTANCE.getrefactorMapEntry_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFACTOR_MAP_ENTRY__VALUE = eINSTANCE.getrefactorMapEntry_Value();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.argRefactorMapEntryImpl <em>arg Refactor Map Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.argRefactorMapEntryImpl
     * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.RefactoringDefinitionPackageImpl#getargRefactorMapEntry()
     * @generated
     */
    EClass ARG_REFACTOR_MAP_ENTRY = eINSTANCE.getargRefactorMapEntry();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG_REFACTOR_MAP_ENTRY__KEY = eINSTANCE.getargRefactorMapEntry_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARG_REFACTOR_MAP_ENTRY__VALUE = eINSTANCE.getargRefactorMapEntry_Value();

    /**
     * The meta object literal for the '{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.argRefactorImpl <em>arg Refactor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.argRefactorImpl
     * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.RefactoringDefinitionPackageImpl#getargRefactor()
     * @generated
     */
    EClass ARG_REFACTOR = eINSTANCE.getargRefactor();

    /**
     * The meta object literal for the '<em><b>Mnem</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARG_REFACTOR__MNEM = eINSTANCE.getargRefactor_Mnem();

    /**
     * The meta object literal for the '<em><b>Raw</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARG_REFACTOR__RAW = eINSTANCE.getargRefactor_Raw();

  }

} //RefactoringDefinitionPackage
