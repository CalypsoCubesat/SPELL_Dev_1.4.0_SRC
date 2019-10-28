/**
 */
package lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Editor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getInputs <em>Inputs</em>}</li>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#isActive <em>Active</em>}</li>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getFactory <em>Factory</em>}</li>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getEditor()
 * @model extendedMetaData="name='editor' kind='elementOnly'"
 * @generated
 */
public interface Editor extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference.
	 * @see #setInputs(Input)
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getEditor_Inputs()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='input'"
	 * @generated
	 */
	Input getInputs();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getInputs <em>Inputs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' containment reference.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(Input value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #isSetActive()
	 * @see #unsetActive()
	 * @see #setActive(boolean)
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getEditor_Active()
	 * @model default="false" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='active'"
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isSetActive()
	 * @see #unsetActive()
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

	/**
	 * Unsets the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActive()
	 * @see #isActive()
	 * @see #setActive(boolean)
	 * @generated
	 */
	void unsetActive();

	/**
	 * Returns whether the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#isActive <em>Active</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Active</em>' attribute is set.
	 * @see #unsetActive()
	 * @see #isActive()
	 * @see #setActive(boolean)
	 * @generated
	 */
	boolean isSetActive();

	/**
	 * Returns the value of the '<em><b>Factory</b></em>' attribute.
	 * The default value is <code>"com.gmv.views.displays.TelemetryDisplayEditorInputFactory"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory</em>' attribute.
	 * @see #isSetFactory()
	 * @see #unsetFactory()
	 * @see #setFactory(String)
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getEditor_Factory()
	 * @model default="com.gmv.views.displays.TelemetryDisplayEditorInputFactory" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='factory'"
	 * @generated
	 */
	String getFactory();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getFactory <em>Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory</em>' attribute.
	 * @see #isSetFactory()
	 * @see #unsetFactory()
	 * @see #getFactory()
	 * @generated
	 */
	void setFactory(String value);

	/**
	 * Unsets the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getFactory <em>Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFactory()
	 * @see #getFactory()
	 * @see #setFactory(String)
	 * @generated
	 */
	void unsetFactory();

	/**
	 * Returns whether the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getFactory <em>Factory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Factory</em>' attribute is set.
	 * @see #unsetFactory()
	 * @see #getFactory()
	 * @see #setFactory(String)
	 * @generated
	 */
	boolean isSetFactory();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * The default value is <code>"com.gmv.views.displays.tabular.TabularDisplayEditorPart"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(String)
	 * @see lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage#getEditor_Id()
	 * @model default="com.gmv.views.displays.tabular.TabularDisplayEditorPart" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Unsets the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Editor#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(String)
	 * @generated
	 */
	boolean isSetId();

} // Editor
