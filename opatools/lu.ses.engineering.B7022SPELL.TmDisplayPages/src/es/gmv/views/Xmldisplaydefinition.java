/**
 */
package es.gmv.views;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xmldisplaydefinition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gmv.views.Xmldisplaydefinition#getMetaInformation <em>Meta Information</em>}</li>
 *   <li>{@link es.gmv.views.Xmldisplaydefinition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link es.gmv.views.Xmldisplaydefinition#getKindOfDisplay <em>Kind Of Display</em>}</li>
 *   <li>{@link es.gmv.views.Xmldisplaydefinition#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gmv.views.ViewsPackage#getXmldisplaydefinition()
 * @model abstract="true"
 *        extendedMetaData="name='xmldisplaydefinition' kind='elementOnly'"
 * @generated
 */
public interface Xmldisplaydefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Meta Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Information</em>' containment reference.
	 * @see #setMetaInformation(MetaInformation)
	 * @see es.gmv.views.ViewsPackage#getXmldisplaydefinition_MetaInformation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='metaInformation'"
	 * @generated
	 */
	MetaInformation getMetaInformation();

	/**
	 * Sets the value of the '{@link es.gmv.views.Xmldisplaydefinition#getMetaInformation <em>Meta Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Information</em>' containment reference.
	 * @see #getMetaInformation()
	 * @generated
	 */
	void setMetaInformation(MetaInformation value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see es.gmv.views.ViewsPackage#getXmldisplaydefinition_Identifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='identifier'"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link es.gmv.views.Xmldisplaydefinition#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Kind Of Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind Of Display</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind Of Display</em>' attribute.
	 * @see #setKindOfDisplay(String)
	 * @see es.gmv.views.ViewsPackage#getXmldisplaydefinition_KindOfDisplay()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='kindOfDisplay'"
	 * @generated
	 */
	String getKindOfDisplay();

	/**
	 * Sets the value of the '{@link es.gmv.views.Xmldisplaydefinition#getKindOfDisplay <em>Kind Of Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind Of Display</em>' attribute.
	 * @see #getKindOfDisplay()
	 * @generated
	 */
	void setKindOfDisplay(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see es.gmv.views.ViewsPackage#getXmldisplaydefinition_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link es.gmv.views.Xmldisplaydefinition#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Xmldisplaydefinition
