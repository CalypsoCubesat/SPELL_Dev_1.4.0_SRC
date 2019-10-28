/**
 */
package lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl;

import java.util.Map;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editors;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Node;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Workspace;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspaceFactory;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage;
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
public class WorkspacePackageImpl extends EPackageImpl implements WorkspacePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass editorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workspaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStringToLayoutMapEntryEClass = null;

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
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WorkspacePackageImpl() {
		super(eNS_URI, WorkspaceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link WorkspacePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WorkspacePackage init() {
		if (isInited) return (WorkspacePackage)EPackage.Registry.INSTANCE.getEPackage(WorkspacePackage.eNS_URI);

		// Obtain or create and register package
		WorkspacePackageImpl theWorkspacePackage = (WorkspacePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WorkspacePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WorkspacePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theWorkspacePackage.createPackageContents();

		// Initialize created meta-data
		theWorkspacePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWorkspacePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WorkspacePackage.eNS_URI, theWorkspacePackage);
		return theWorkspacePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Nodes() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Name() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_IsCalled() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Calls() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Missing() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_Editors() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Type() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditors() {
		return editorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditors_Editors() {
		return (EReference)editorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEditor() {
		return editorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEditor_Inputs() {
		return (EReference)editorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditor_Active() {
		return (EAttribute)editorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditor_Factory() {
		return (EAttribute)editorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEditor_Id() {
		return (EAttribute)editorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_DisplayName() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_New() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInput_Type() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkspace() {
		return workspaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkspace_Procedures() {
		return (EReference)workspaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStringToLayoutMapEntry() {
		return eStringToLayoutMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStringToLayoutMapEntry_Key() {
		return (EAttribute)eStringToLayoutMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEStringToLayoutMapEntry_Value() {
		return (EReference)eStringToLayoutMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkspaceFactory getWorkspaceFactory() {
		return (WorkspaceFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		layoutEClass = createEClass(LAYOUT);
		createEReference(layoutEClass, LAYOUT__NODES);
		createEAttribute(layoutEClass, LAYOUT__NAME);
		createEReference(layoutEClass, LAYOUT__IS_CALLED);
		createEReference(layoutEClass, LAYOUT__CALLS);
		createEAttribute(layoutEClass, LAYOUT__MISSING);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__EDITORS);
		createEAttribute(nodeEClass, NODE__TYPE);

		editorsEClass = createEClass(EDITORS);
		createEReference(editorsEClass, EDITORS__EDITORS);

		editorEClass = createEClass(EDITOR);
		createEReference(editorEClass, EDITOR__INPUTS);
		createEAttribute(editorEClass, EDITOR__ACTIVE);
		createEAttribute(editorEClass, EDITOR__FACTORY);
		createEAttribute(editorEClass, EDITOR__ID);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__DISPLAY_NAME);
		createEAttribute(inputEClass, INPUT__NEW);
		createEAttribute(inputEClass, INPUT__TYPE);

		workspaceEClass = createEClass(WORKSPACE);
		createEReference(workspaceEClass, WORKSPACE__PROCEDURES);

		eStringToLayoutMapEntryEClass = createEClass(ESTRING_TO_LAYOUT_MAP_ENTRY);
		createEAttribute(eStringToLayoutMapEntryEClass, ESTRING_TO_LAYOUT_MAP_ENTRY__KEY);
		createEReference(eStringToLayoutMapEntryEClass, ESTRING_TO_LAYOUT_MAP_ENTRY__VALUE);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		layoutEClass.getESuperTypes().add(this.getWorkspace());

		// Initialize classes, features, and operations; add parameters
		initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayout_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Name(), ecorePackage.getEString(), "name", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_IsCalled(), this.getLayout(), this.getLayout_Calls(), "isCalled", null, 0, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayout_Calls(), this.getLayout(), this.getLayout_IsCalled(), "calls", null, 0, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Missing(), ecorePackage.getEBoolean(), "missing", "false", 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_Editors(), this.getEditors(), null, "editors", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Type(), ecorePackage.getEString(), "type", "leaf", 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editorsEClass, Editors.class, "Editors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEditors_Editors(), this.getEditor(), null, "editors", null, 1, -1, Editors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(editorEClass, Editor.class, "Editor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEditor_Inputs(), this.getInput(), null, "inputs", null, 1, 1, Editor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditor_Active(), ecorePackage.getEBoolean(), "active", "false", 0, 1, Editor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditor_Factory(), ecorePackage.getEString(), "factory", "com.gmv.views.displays.TelemetryDisplayEditorInputFactory", 0, 1, Editor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEditor_Id(), ecorePackage.getEString(), "id", "com.gmv.views.displays.tabular.TabularDisplayEditorPart", 0, 1, Editor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_DisplayName(), ecorePackage.getEString(), "displayName", "", 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_New(), ecorePackage.getEBoolean(), "new", "true", 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Type(), ecorePackage.getEString(), "type", "AND", 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(workspaceEClass, Workspace.class, "Workspace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWorkspace_Procedures(), this.getEStringToLayoutMapEntry(), null, "procedures", null, 0, -1, Workspace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStringToLayoutMapEntryEClass, Map.Entry.class, "EStringToLayoutMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStringToLayoutMapEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStringToLayoutMapEntry_Value(), this.getLayout(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (layoutEClass, 
		   source, 
		   new String[] {
			 "name", "Layout",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getLayout_Nodes(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "node"
		   });	
		addAnnotation
		  (nodeEClass, 
		   source, 
		   new String[] {
			 "name", "Node",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getNode_Editors(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "editors"
		   });	
		addAnnotation
		  (getNode_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });	
		addAnnotation
		  (editorsEClass, 
		   source, 
		   new String[] {
			 "name", "editors",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEditors_Editors(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "editor"
		   });	
		addAnnotation
		  (editorEClass, 
		   source, 
		   new String[] {
			 "name", "editor",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEditor_Inputs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "input"
		   });	
		addAnnotation
		  (getEditor_Active(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "active"
		   });	
		addAnnotation
		  (getEditor_Factory(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "factory"
		   });	
		addAnnotation
		  (getEditor_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });	
		addAnnotation
		  (inputEClass, 
		   source, 
		   new String[] {
			 "name", "input",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getInput_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "displayName"
		   });	
		addAnnotation
		  (getInput_New(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "new"
		   });	
		addAnnotation
		  (getInput_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });
	}

} //WorkspacePackageImpl
