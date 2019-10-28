/**
 */
package es.gmv.views.util;

import es.gmv.views.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.gmv.views.ViewsPackage
 * @generated
 */
public class ViewsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ViewsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ViewsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewsSwitch<Adapter> modelSwitch =
		new ViewsSwitch<Adapter>() {
			@Override
			public Adapter caseAndColumn(AndColumn object) {
				return createAndColumnAdapter();
			}
			@Override
			public Adapter caseDisplayRenderingType(DisplayRenderingType object) {
				return createDisplayRenderingTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseFontType(FontType object) {
				return createFontTypeAdapter();
			}
			@Override
			public Adapter caseMetaInformation(MetaInformation object) {
				return createMetaInformationAdapter();
			}
			@Override
			public Adapter caseParameterList(ParameterList object) {
				return createParameterListAdapter();
			}
			@Override
			public Adapter caseRow(Row object) {
				return createRowAdapter();
			}
			@Override
			public Adapter caseXmldisplaydefinition(Xmldisplaydefinition object) {
				return createXmldisplaydefinitionAdapter();
			}
			@Override
			public Adapter caseXmltabulardisplaydefinition(Xmltabulardisplaydefinition object) {
				return createXmltabulardisplaydefinitionAdapter();
			}
			@Override
			public Adapter caseMnemonicRow(MnemonicRow object) {
				return createMnemonicRowAdapter();
			}
			@Override
			public Adapter caseTmRow(TmRow object) {
				return createTmRowAdapter();
			}
			@Override
			public Adapter caseComment(Comment object) {
				return createCommentAdapter();
			}
			@Override
			public Adapter caseTmDisplayPage(TmDisplayPage object) {
				return createTmDisplayPageAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.gmv.views.AndColumn <em>And Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gmv.views.AndColumn
	 * @generated
	 */
	public Adapter createAndColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gmv.views.DisplayRenderingType <em>Display Rendering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gmv.views.DisplayRenderingType
	 * @generated
	 */
	public Adapter createDisplayRenderingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gmv.views.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gmv.views.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gmv.views.FontType <em>Font Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gmv.views.FontType
	 * @generated
	 */
	public Adapter createFontTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gmv.views.MetaInformation <em>Meta Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gmv.views.MetaInformation
	 * @generated
	 */
	public Adapter createMetaInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gmv.views.ParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gmv.views.ParameterList
	 * @generated
	 */
	public Adapter createParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gmv.views.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gmv.views.Row
	 * @generated
	 */
	public Adapter createRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gmv.views.Xmldisplaydefinition <em>Xmldisplaydefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gmv.views.Xmldisplaydefinition
	 * @generated
	 */
	public Adapter createXmldisplaydefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gmv.views.Xmltabulardisplaydefinition <em>Xmltabulardisplaydefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gmv.views.Xmltabulardisplaydefinition
	 * @generated
	 */
	public Adapter createXmltabulardisplaydefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gmv.views.MnemonicRow <em>Mnemonic Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gmv.views.MnemonicRow
	 * @generated
	 */
	public Adapter createMnemonicRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gmv.views.TmRow <em>Tm Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gmv.views.TmRow
	 * @generated
	 */
	public Adapter createTmRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gmv.views.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gmv.views.Comment
	 * @generated
	 */
	public Adapter createCommentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.gmv.views.TmDisplayPage <em>Tm Display Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.gmv.views.TmDisplayPage
	 * @generated
	 */
	public Adapter createTmDisplayPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ViewsAdapterFactory
