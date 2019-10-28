/**
 */
package es.gmv.views;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gmv.views.FontType#getFamily <em>Family</em>}</li>
 *   <li>{@link es.gmv.views.FontType#getHeight <em>Height</em>}</li>
 *   <li>{@link es.gmv.views.FontType#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gmv.views.ViewsPackage#getFontType()
 * @model extendedMetaData="name='FontType' kind='elementOnly'"
 * @generated
 */
public interface FontType extends EObject {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see es.gmv.views.ViewsPackage#getFontType_Family()
	 * @model dataType="es.gmv.views.FamilyType" required="true"
	 *        extendedMetaData="kind='element' name='family'"
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link es.gmv.views.FontType#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #setHeight(long)
	 * @see es.gmv.views.ViewsPackage#getFontType_Height()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.UnsignedInt"
	 *        extendedMetaData="kind='element' name='height'"
	 * @generated
	 */
	long getHeight();

	/**
	 * Sets the value of the '{@link es.gmv.views.FontType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #isSetHeight()
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(long value);

	/**
	 * Unsets the value of the '{@link es.gmv.views.FontType#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHeight()
	 * @see #getHeight()
	 * @see #setHeight(long)
	 * @generated
	 */
	void unsetHeight();

	/**
	 * Returns whether the value of the '{@link es.gmv.views.FontType#getHeight <em>Height</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Height</em>' attribute is set.
	 * @see #unsetHeight()
	 * @see #getHeight()
	 * @see #setHeight(long)
	 * @generated
	 */
	boolean isSetHeight();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * The literals are from the enumeration {@link es.gmv.views.FontStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see es.gmv.views.FontStyle
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #setStyle(FontStyle)
	 * @see es.gmv.views.ViewsPackage#getFontType_Style()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='style'"
	 * @generated
	 */
	FontStyle getStyle();

	/**
	 * Sets the value of the '{@link es.gmv.views.FontType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see es.gmv.views.FontStyle
	 * @see #isSetStyle()
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(FontStyle value);

	/**
	 * Unsets the value of the '{@link es.gmv.views.FontType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStyle()
	 * @see #getStyle()
	 * @see #setStyle(FontStyle)
	 * @generated
	 */
	void unsetStyle();

	/**
	 * Returns whether the value of the '{@link es.gmv.views.FontType#getStyle <em>Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Style</em>' attribute is set.
	 * @see #unsetStyle()
	 * @see #getStyle()
	 * @see #setStyle(FontStyle)
	 * @generated
	 */
	boolean isSetStyle();

} // FontType
