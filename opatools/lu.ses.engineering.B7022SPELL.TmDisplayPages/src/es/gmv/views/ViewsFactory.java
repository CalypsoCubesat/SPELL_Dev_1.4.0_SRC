/**
 */
package es.gmv.views;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.gmv.views.ViewsPackage
 * @generated
 */
public interface ViewsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsFactory eINSTANCE = es.gmv.views.impl.ViewsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>And Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Column</em>'.
	 * @generated
	 */
	AndColumn createAndColumn();

	/**
	 * Returns a new object of class '<em>Display Rendering Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Display Rendering Type</em>'.
	 * @generated
	 */
	DisplayRenderingType createDisplayRenderingType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Font Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Font Type</em>'.
	 * @generated
	 */
	FontType createFontType();

	/**
	 * Returns a new object of class '<em>Meta Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Information</em>'.
	 * @generated
	 */
	MetaInformation createMetaInformation();

	/**
	 * Returns a new object of class '<em>Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter List</em>'.
	 * @generated
	 */
	ParameterList createParameterList();

	/**
	 * Returns a new object of class '<em>Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Row</em>'.
	 * @generated
	 */
	Row createRow();

	/**
	 * Returns a new object of class '<em>Xmltabulardisplaydefinition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Xmltabulardisplaydefinition</em>'.
	 * @generated
	 */
	Xmltabulardisplaydefinition createXmltabulardisplaydefinition();

	/**
	 * Returns a new object of class '<em>Mnemonic Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mnemonic Row</em>'.
	 * @generated
	 */
	MnemonicRow createMnemonicRow();

	/**
	 * Returns a new object of class '<em>Tm Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tm Row</em>'.
	 * @generated
	 */
	TmRow createTmRow();

	/**
	 * Returns a new object of class '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comment</em>'.
	 * @generated
	 */
	Comment createComment();

	/**
	 * Returns a new object of class '<em>Tm Display Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tm Display Page</em>'.
	 * @generated
	 */
	TmDisplayPage createTmDisplayPage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ViewsPackage getViewsPackage();

} //ViewsFactory
