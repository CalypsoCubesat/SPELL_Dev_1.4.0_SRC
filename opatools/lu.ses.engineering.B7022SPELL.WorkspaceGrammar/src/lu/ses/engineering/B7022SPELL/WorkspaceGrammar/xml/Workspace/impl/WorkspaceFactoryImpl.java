/**
 */
package lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl;

import java.util.Map;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.*;
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
public class WorkspaceFactoryImpl extends EFactoryImpl implements WorkspaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkspaceFactory init() {
		try {
			WorkspaceFactory theWorkspaceFactory = (WorkspaceFactory)EPackage.Registry.INSTANCE.getEFactory(WorkspacePackage.eNS_URI);
			if (theWorkspaceFactory != null) {
				return theWorkspaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WorkspaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkspaceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WorkspacePackage.LAYOUT: return createLayout();
			case WorkspacePackage.NODE: return createNode();
			case WorkspacePackage.EDITORS: return createEditors();
			case WorkspacePackage.EDITOR: return createEditor();
			case WorkspacePackage.INPUT: return createInput();
			case WorkspacePackage.WORKSPACE: return createWorkspace();
			case WorkspacePackage.ESTRING_TO_LAYOUT_MAP_ENTRY: return (EObject)createEStringToLayoutMapEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layout createLayout() {
		LayoutImpl layout = new LayoutImpl();
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Editors createEditors() {
		EditorsImpl editors = new EditorsImpl();
		return editors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Editor createEditor() {
		EditorImpl editor = new EditorImpl();
		return editor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Workspace createWorkspace() {
		WorkspaceImpl workspace = new WorkspaceImpl();
		return workspace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Layout> createEStringToLayoutMapEntry() {
		EStringToLayoutMapEntryImpl eStringToLayoutMapEntry = new EStringToLayoutMapEntryImpl();
		return eStringToLayoutMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkspacePackage getWorkspacePackage() {
		return (WorkspacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WorkspacePackage getPackage() {
		return WorkspacePackage.eINSTANCE;
	}

} //WorkspaceFactoryImpl
