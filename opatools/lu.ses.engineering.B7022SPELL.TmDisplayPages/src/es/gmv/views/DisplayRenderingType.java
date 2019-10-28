/**
 */
package es.gmv.views;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Display Rendering Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gmv.views.DisplayRenderingType#getBackground <em>Background</em>}</li>
 *   <li>{@link es.gmv.views.DisplayRenderingType#getForeground <em>Foreground</em>}</li>
 *   <li>{@link es.gmv.views.DisplayRenderingType#getFont <em>Font</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gmv.views.ViewsPackage#getDisplayRenderingType()
 * @model extendedMetaData="name='DisplayRenderingType' kind='elementOnly'"
 * @generated
 */
public interface DisplayRenderingType extends EObject {
	/**
	 * Returns the value of the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background</em>' attribute.
	 * @see #setBackground(String)
	 * @see es.gmv.views.ViewsPackage#getDisplayRenderingType_Background()
	 * @model dataType="es.gmv.views.ColorType"
	 *        extendedMetaData="kind='element' name='background'"
	 * @generated
	 */
	String getBackground();

	/**
	 * Sets the value of the '{@link es.gmv.views.DisplayRenderingType#getBackground <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background</em>' attribute.
	 * @see #getBackground()
	 * @generated
	 */
	void setBackground(String value);

	/**
	 * Returns the value of the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Foreground</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foreground</em>' attribute.
	 * @see #setForeground(String)
	 * @see es.gmv.views.ViewsPackage#getDisplayRenderingType_Foreground()
	 * @model dataType="es.gmv.views.ColorType"
	 *        extendedMetaData="kind='element' name='foreground'"
	 * @generated
	 */
	String getForeground();

	/**
	 * Sets the value of the '{@link es.gmv.views.DisplayRenderingType#getForeground <em>Foreground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foreground</em>' attribute.
	 * @see #getForeground()
	 * @generated
	 */
	void setForeground(String value);

	/**
	 * Returns the value of the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font</em>' containment reference.
	 * @see #setFont(FontType)
	 * @see es.gmv.views.ViewsPackage#getDisplayRenderingType_Font()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='font'"
	 * @generated
	 */
	FontType getFont();

	/**
	 * Sets the value of the '{@link es.gmv.views.DisplayRenderingType#getFont <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font</em>' containment reference.
	 * @see #getFont()
	 * @generated
	 */
	void setFont(FontType value);

} // DisplayRenderingType
