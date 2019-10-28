/**
 */
package lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#isNew <em>New</em>}</li>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getInput()
 * @model extendedMetaData="name='input' kind='elementOnly'"
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #isSetDisplayName()
	 * @see #unsetDisplayName()
	 * @see #setDisplayName(String)
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getInput_DisplayName()
	 * @model default="" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='displayName'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #isSetDisplayName()
	 * @see #unsetDisplayName()
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Unsets the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDisplayName()
	 * @see #getDisplayName()
	 * @see #setDisplayName(String)
	 * @generated
	 */
	void unsetDisplayName();

	/**
	 * Returns whether the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#getDisplayName <em>Display Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Display Name</em>' attribute is set.
	 * @see #unsetDisplayName()
	 * @see #getDisplayName()
	 * @see #setDisplayName(String)
	 * @generated
	 */
	boolean isSetDisplayName();

	/**
	 * Returns the value of the '<em><b>New</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New</em>' attribute.
	 * @see #isSetNew()
	 * @see #unsetNew()
	 * @see #setNew(boolean)
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getInput_New()
	 * @model default="true" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='new'"
	 * @generated
	 */
	boolean isNew();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#isNew <em>New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New</em>' attribute.
	 * @see #isSetNew()
	 * @see #unsetNew()
	 * @see #isNew()
	 * @generated
	 */
	void setNew(boolean value);

	/**
	 * Unsets the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#isNew <em>New</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNew()
	 * @see #isNew()
	 * @see #setNew(boolean)
	 * @generated
	 */
	void unsetNew();

	/**
	 * Returns whether the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#isNew <em>New</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>New</em>' attribute is set.
	 * @see #unsetNew()
	 * @see #isNew()
	 * @see #setNew(boolean)
	 * @generated
	 */
	boolean isSetNew();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(String)
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getInput_Type()
	 * @model default="AND" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Unsets the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Input#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(String)
	 * @generated
	 */
	boolean isSetType();

} // Input
