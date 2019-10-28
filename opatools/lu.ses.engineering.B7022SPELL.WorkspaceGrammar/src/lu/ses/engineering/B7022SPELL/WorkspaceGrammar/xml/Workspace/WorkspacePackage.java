/**
 */
package lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspaceFactory
 * @model kind="package"
 * @generated
 */
public interface WorkspacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Workspace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ses.com/workspace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workspace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkspacePackage eINSTANCE = lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspacePackageImpl.init();

	/**
	 * The meta object id for the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.LayoutImpl
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspacePackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 0;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.NodeImpl
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspacePackageImpl#getNode()
	 * @generated
	 */
	int NODE = 1;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.EditorsImpl <em>Editors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.EditorsImpl
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspacePackageImpl#getEditors()
	 * @generated
	 */
	int EDITORS = 2;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.EditorImpl <em>Editor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.EditorImpl
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspacePackageImpl#getEditor()
	 * @generated
	 */
	int EDITOR = 3;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.InputImpl
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspacePackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 4;

	/**
	 * The meta object id for the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspaceImpl <em>Workspace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspaceImpl
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspacePackageImpl#getWorkspace()
	 * @generated
	 */
	int WORKSPACE = 5;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE__PROCEDURES = 0;

	/**
	 * The number of structural features of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Workspace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKSPACE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Procedures</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__PROCEDURES = WORKSPACE__PROCEDURES;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NODES = WORKSPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__NAME = WORKSPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Called</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__IS_CALLED = WORKSPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Calls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__CALLS = WORKSPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Missing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__MISSING = WORKSPACE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = WORKSPACE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_OPERATION_COUNT = WORKSPACE_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EDITORS = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Editors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITORS__EDITORS = 0;

	/**
	 * The number of structural features of the '<em>Editors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITORS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Editors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITORS_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__ACTIVE = 1;

	/**
	 * The feature id for the '<em><b>Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__FACTORY = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR__ID = 3;

	/**
	 * The number of structural features of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Editor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDITOR_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DISPLAY_NAME = 0;

	/**
	 * The feature id for the '<em><b>New</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NEW = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.EStringToLayoutMapEntryImpl <em>EString To Layout Map Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.EStringToLayoutMapEntryImpl
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspacePackageImpl#getEStringToLayoutMapEntry()
	 * @generated
	 */
	int ESTRING_TO_LAYOUT_MAP_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_LAYOUT_MAP_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_LAYOUT_MAP_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To Layout Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_LAYOUT_MAP_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EString To Layout Map Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_LAYOUT_MAP_ENTRY_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getNodes()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Nodes();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getName()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Name();

	/**
	 * Returns the meta object for the reference list '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getIsCalled <em>Is Called</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Called</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getIsCalled()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_IsCalled();

	/**
	 * Returns the meta object for the reference list '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Calls</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getCalls()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Calls();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#isMissing <em>Missing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Missing</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#isMissing()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Missing();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Node#getEditors <em>Editors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Editors</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Node#getEditors()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Editors();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Node#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Node#getType()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Type();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editors <em>Editors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editors</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editors
	 * @generated
	 */
	EClass getEditors();

	/**
	 * Returns the meta object for the containment reference list '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editors#getEditors <em>Editors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Editors</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editors#getEditors()
	 * @see #getEditors()
	 * @generated
	 */
	EReference getEditors_Editors();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor <em>Editor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Editor</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor
	 * @generated
	 */
	EClass getEditor();

	/**
	 * Returns the meta object for the containment reference '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inputs</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getInputs()
	 * @see #getEditor()
	 * @generated
	 */
	EReference getEditor_Inputs();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#isActive()
	 * @see #getEditor()
	 * @generated
	 */
	EAttribute getEditor_Active();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getFactory <em>Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factory</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getFactory()
	 * @see #getEditor()
	 * @generated
	 */
	EAttribute getEditor_Factory();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getId()
	 * @see #getEditor()
	 * @generated
	 */
	EAttribute getEditor_Id();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#getDisplayName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#isNew <em>New</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#isNew()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_New();

	/**
	 * Returns the meta object for the attribute '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the meta object for class '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Workspace <em>Workspace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workspace</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Workspace
	 * @generated
	 */
	EClass getWorkspace();

	/**
	 * Returns the meta object for the map '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Workspace#getProcedures <em>Procedures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Procedures</em>'.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Workspace#getProcedures()
	 * @see #getWorkspace()
	 * @generated
	 */
	EReference getWorkspace_Procedures();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To Layout Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To Layout Map Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout" valueContainment="true"
	 * @generated
	 */
	EClass getEStringToLayoutMapEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToLayoutMapEntry()
	 * @generated
	 */
	EAttribute getEStringToLayoutMapEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToLayoutMapEntry()
	 * @generated
	 */
	EReference getEStringToLayoutMapEntry_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkspaceFactory getWorkspaceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.LayoutImpl
		 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspacePackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__NODES = eINSTANCE.getLayout_Nodes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__NAME = eINSTANCE.getLayout_Name();

		/**
		 * The meta object literal for the '<em><b>Is Called</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__IS_CALLED = eINSTANCE.getLayout_IsCalled();

		/**
		 * The meta object literal for the '<em><b>Calls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__CALLS = eINSTANCE.getLayout_Calls();

		/**
		 * The meta object literal for the '<em><b>Missing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__MISSING = eINSTANCE.getLayout_Missing();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.NodeImpl
		 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspacePackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Editors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__EDITORS = eINSTANCE.getNode_Editors();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__TYPE = eINSTANCE.getNode_Type();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.EditorsImpl <em>Editors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.EditorsImpl
		 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspacePackageImpl#getEditors()
		 * @generated
		 */
		EClass EDITORS = eINSTANCE.getEditors();

		/**
		 * The meta object literal for the '<em><b>Editors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITORS__EDITORS = eINSTANCE.getEditors_Editors();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.EditorImpl <em>Editor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.EditorImpl
		 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspacePackageImpl#getEditor()
		 * @generated
		 */
		EClass EDITOR = eINSTANCE.getEditor();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EDITOR__INPUTS = eINSTANCE.getEditor_Inputs();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR__ACTIVE = eINSTANCE.getEditor_Active();

		/**
		 * The meta object literal for the '<em><b>Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR__FACTORY = eINSTANCE.getEditor_Factory();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDITOR__ID = eINSTANCE.getEditor_Id();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.InputImpl
		 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspacePackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__DISPLAY_NAME = eINSTANCE.getInput_DisplayName();

		/**
		 * The meta object literal for the '<em><b>New</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NEW = eINSTANCE.getInput_New();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TYPE = eINSTANCE.getInput_Type();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspaceImpl <em>Workspace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspaceImpl
		 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspacePackageImpl#getWorkspace()
		 * @generated
		 */
		EClass WORKSPACE = eINSTANCE.getWorkspace();

		/**
		 * The meta object literal for the '<em><b>Procedures</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKSPACE__PROCEDURES = eINSTANCE.getWorkspace_Procedures();

		/**
		 * The meta object literal for the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.EStringToLayoutMapEntryImpl <em>EString To Layout Map Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.EStringToLayoutMapEntryImpl
		 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.WorkspacePackageImpl#getEStringToLayoutMapEntry()
		 * @generated
		 */
		EClass ESTRING_TO_LAYOUT_MAP_ENTRY = eINSTANCE.getEStringToLayoutMapEntry();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_LAYOUT_MAP_ENTRY__KEY = eINSTANCE.getEStringToLayoutMapEntry_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRING_TO_LAYOUT_MAP_ENTRY__VALUE = eINSTANCE.getEStringToLayoutMapEntry_Value();

	}

} //WorkspacePackage
