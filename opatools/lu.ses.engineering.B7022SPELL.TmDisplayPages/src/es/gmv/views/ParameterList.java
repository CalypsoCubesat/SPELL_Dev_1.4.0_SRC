/**
 */
package es.gmv.views;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.gmv.views.ParameterList#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.gmv.views.ViewsPackage#getParameterList()
 * @model extendedMetaData="name='ParameterList' kind='elementOnly'"
 * @generated
 */
public interface ParameterList extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' attribute list.
	 * @see es.gmv.views.ViewsPackage#getParameterList_Parameter()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='parameter'"
	 * @generated
	 */
	EList<String> getParameter();

} // ParameterList
