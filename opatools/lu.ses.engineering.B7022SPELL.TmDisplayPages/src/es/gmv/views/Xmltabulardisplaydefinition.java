/**
 */
package es.gmv.views;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xmltabulardisplaydefinition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gmv.views.Xmltabulardisplaydefinition#isScrollable <em>Scrollable</em>}</li>
 *   <li>{@link es.gmv.views.Xmltabulardisplaydefinition#getColumn <em>Column</em>}</li>
 *   <li>{@link es.gmv.views.Xmltabulardisplaydefinition#getRow <em>Row</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gmv.views.ViewsPackage#getXmltabulardisplaydefinition()
 * @model extendedMetaData="name='xmltabulardisplaydefinition' kind='elementOnly'"
 * @generated
 */
public interface Xmltabulardisplaydefinition extends Xmldisplaydefinition, TmDisplayPage {
	/**
	 * Returns the value of the '<em><b>Scrollable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scrollable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scrollable</em>' attribute.
	 * @see #isSetScrollable()
	 * @see #unsetScrollable()
	 * @see #setScrollable(boolean)
	 * @see es.gmv.views.ViewsPackage#getXmltabulardisplaydefinition_Scrollable()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='scrollable'"
	 * @generated
	 */
	boolean isScrollable();

	/**
	 * Sets the value of the '{@link es.gmv.views.Xmltabulardisplaydefinition#isScrollable <em>Scrollable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scrollable</em>' attribute.
	 * @see #isSetScrollable()
	 * @see #unsetScrollable()
	 * @see #isScrollable()
	 * @generated
	 */
	void setScrollable(boolean value);

	/**
	 * Unsets the value of the '{@link es.gmv.views.Xmltabulardisplaydefinition#isScrollable <em>Scrollable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScrollable()
	 * @see #isScrollable()
	 * @see #setScrollable(boolean)
	 * @generated
	 */
	void unsetScrollable();

	/**
	 * Returns whether the value of the '{@link es.gmv.views.Xmltabulardisplaydefinition#isScrollable <em>Scrollable</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scrollable</em>' attribute is set.
	 * @see #unsetScrollable()
	 * @see #isScrollable()
	 * @see #setScrollable(boolean)
	 * @generated
	 */
	boolean isSetScrollable();

	/**
	 * Returns the value of the '<em><b>Column</b></em>' containment reference list.
	 * The list contents are of type {@link es.gmv.views.AndColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' containment reference list.
	 * @see es.gmv.views.ViewsPackage#getXmltabulardisplaydefinition_Column()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='column'"
	 * @generated
	 */
	EList<AndColumn> getColumn();

	/**
	 * Returns the value of the '<em><b>Row</b></em>' containment reference list.
	 * The list contents are of type {@link es.gmv.views.Row}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Row</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Row</em>' containment reference list.
	 * @see es.gmv.views.ViewsPackage#getXmltabulardisplaydefinition_Row()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='row'"
	 * @generated
	 */
	EList<Row> getRow();

} // Xmltabulardisplaydefinition
