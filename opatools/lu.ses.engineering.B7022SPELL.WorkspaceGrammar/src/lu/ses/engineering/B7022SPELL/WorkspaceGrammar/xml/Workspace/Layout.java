/**
 */
package lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getNodes <em>Nodes</em>}</li>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getName <em>Name</em>}</li>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getIsCalled <em>Is Called</em>}</li>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getCalls <em>Calls</em>}</li>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#isMissing <em>Missing</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getLayout()
 * @model extendedMetaData="name='Layout' kind='elementOnly'"
 * @generated
 */
public interface Layout extends Workspace {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getLayout_Nodes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='node'"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getLayout_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Called</b></em>' reference list.
	 * The list contents are of type {@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout}.
	 * It is bidirectional and its opposite is '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getCalls <em>Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Called</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Called</em>' reference list.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getLayout_IsCalled()
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getCalls
	 * @model opposite="calls"
	 * @generated
	 */
	EList<Layout> getIsCalled();

	/**
	 * Returns the value of the '<em><b>Calls</b></em>' reference list.
	 * The list contents are of type {@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout}.
	 * It is bidirectional and its opposite is '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getIsCalled <em>Is Called</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Calls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Calls</em>' reference list.
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getLayout_Calls()
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#getIsCalled
	 * @model opposite="isCalled"
	 * @generated
	 */
	EList<Layout> getCalls();

	/**
	 * Returns the value of the '<em><b>Missing</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Missing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Missing</em>' attribute.
	 * @see #setMissing(boolean)
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getLayout_Missing()
	 * @model default="false"
	 * @generated
	 */
	boolean isMissing();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout#isMissing <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Missing</em>' attribute.
	 * @see #isMissing()
	 * @generated
	 */
	void setMissing(boolean value);

} // Layout
