/**
 */
package lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editors#getEditors <em>Editors</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getEditors()
 * @model extendedMetaData="name='editors' kind='elementOnly'"
 * @generated
 */
public interface Editors extends EObject {
	/**
	 * Returns the value of the '<em><b>Editors</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editors</em>' containment reference list.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getEditors_Editors()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='editor'"
	 * @generated
	 */
	EList<Editor> getEditors();

} // Editors
