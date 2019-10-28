/**
 */
package lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Workspace#getProcedures <em>Procedures</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getWorkspace()
 * @model
 * @generated
 */
public interface Workspace extends EObject {
	/**
	 * Returns the value of the '<em><b>Procedures</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedures</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedures</em>' map.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getWorkspace_Procedures()
	 * @model mapType="lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.EStringToLayoutMapEntry<org.eclipse.emf.ecore.EString, lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout>"
	 * @generated
	 */
	EMap<String, Layout> getProcedures();

} // Workspace
