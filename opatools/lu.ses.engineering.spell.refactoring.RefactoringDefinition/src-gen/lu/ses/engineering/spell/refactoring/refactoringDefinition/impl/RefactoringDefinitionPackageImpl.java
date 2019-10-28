/**
 */
package lu.ses.engineering.spell.refactoring.refactoringDefinition.impl;

import java.util.Map;

import lu.ses.engineering.spell.refactoring.refactoringDefinition.RefactoringDefinitionFactory;
import lu.ses.engineering.spell.refactoring.refactoringDefinition.RefactoringDefinitionPackage;
import lu.ses.engineering.spell.refactoring.refactoringDefinition.Refactorings;
import lu.ses.engineering.spell.refactoring.refactoringDefinition.argRefactor;

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
public class RefactoringDefinitionPackageImpl extends EPackageImpl implements RefactoringDefinitionPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refactoringsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refactorMapEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argRefactorMapEntryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argRefactorEClass = null;

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
   * @see lu.ses.engineering.spell.refactoring.refactoringDefinition.RefactoringDefinitionPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RefactoringDefinitionPackageImpl()
  {
    super(eNS_URI, RefactoringDefinitionFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link RefactoringDefinitionPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RefactoringDefinitionPackage init()
  {
    if (isInited) return (RefactoringDefinitionPackage)EPackage.Registry.INSTANCE.getEPackage(RefactoringDefinitionPackage.eNS_URI);

    // Obtain or create and register package
    RefactoringDefinitionPackageImpl theRefactoringDefinitionPackage = (RefactoringDefinitionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RefactoringDefinitionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RefactoringDefinitionPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRefactoringDefinitionPackage.createPackageContents();

    // Initialize created meta-data
    theRefactoringDefinitionPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRefactoringDefinitionPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RefactoringDefinitionPackage.eNS_URI, theRefactoringDefinitionPackage);
    return theRefactoringDefinitionPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefactorings()
  {
    return refactoringsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefactorings_Refactorings()
  {
    return (EReference)refactoringsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getrefactorMapEntry()
  {
    return refactorMapEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrefactorMapEntry_Key()
  {
    return (EAttribute)refactorMapEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getrefactorMapEntry_Value()
  {
    return (EAttribute)refactorMapEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getargRefactorMapEntry()
  {
    return argRefactorMapEntryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getargRefactorMapEntry_Key()
  {
    return (EReference)argRefactorMapEntryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getargRefactorMapEntry_Value()
  {
    return (EAttribute)argRefactorMapEntryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getargRefactor()
  {
    return argRefactorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getargRefactor_Mnem()
  {
    return (EAttribute)argRefactorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getargRefactor_Raw()
  {
    return (EAttribute)argRefactorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefactoringDefinitionFactory getRefactoringDefinitionFactory()
  {
    return (RefactoringDefinitionFactory)getEFactoryInstance();
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
    refactoringsEClass = createEClass(REFACTORINGS);
    createEReference(refactoringsEClass, REFACTORINGS__REFACTORINGS);

    refactorMapEntryEClass = createEClass(REFACTOR_MAP_ENTRY);
    createEAttribute(refactorMapEntryEClass, REFACTOR_MAP_ENTRY__KEY);
    createEAttribute(refactorMapEntryEClass, REFACTOR_MAP_ENTRY__VALUE);

    argRefactorMapEntryEClass = createEClass(ARG_REFACTOR_MAP_ENTRY);
    createEReference(argRefactorMapEntryEClass, ARG_REFACTOR_MAP_ENTRY__KEY);
    createEAttribute(argRefactorMapEntryEClass, ARG_REFACTOR_MAP_ENTRY__VALUE);

    argRefactorEClass = createEClass(ARG_REFACTOR);
    createEAttribute(argRefactorEClass, ARG_REFACTOR__MNEM);
    createEAttribute(argRefactorEClass, ARG_REFACTOR__RAW);
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

    // Initialize classes and features; add operations and parameters
    initEClass(refactoringsEClass, Refactorings.class, "Refactorings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefactorings_Refactorings(), this.getrefactorMapEntry(), null, "refactorings", null, 0, -1, Refactorings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refactorMapEntryEClass, Map.Entry.class, "refactorMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getrefactorMapEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getrefactorMapEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argRefactorMapEntryEClass, Map.Entry.class, "argRefactorMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
    initEReference(getargRefactorMapEntry_Key(), this.getargRefactor(), null, "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getargRefactorMapEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argRefactorEClass, argRefactor.class, "argRefactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getargRefactor_Mnem(), ecorePackage.getEString(), "mnem", null, 0, 1, argRefactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getargRefactor_Raw(), ecorePackage.getEString(), "raw", null, 0, 1, argRefactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RefactoringDefinitionPackageImpl
