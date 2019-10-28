/**
 */
package es.gmv.views.impl;

import es.gmv.views.AndColumn;
import es.gmv.views.Row;
import es.gmv.views.ViewsPackage;
import es.gmv.views.Xmltabulardisplaydefinition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xmltabulardisplaydefinition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gmv.views.impl.XmltabulardisplaydefinitionImpl#isScrollable <em>Scrollable</em>}</li>
 *   <li>{@link es.gmv.views.impl.XmltabulardisplaydefinitionImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link es.gmv.views.impl.XmltabulardisplaydefinitionImpl#getRow <em>Row</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XmltabulardisplaydefinitionImpl extends XmldisplaydefinitionImpl implements Xmltabulardisplaydefinition {
	/**
	 * The default value of the '{@link #isScrollable() <em>Scrollable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScrollable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SCROLLABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isScrollable() <em>Scrollable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isScrollable()
	 * @generated
	 * @ordered
	 */
	protected boolean scrollable = SCROLLABLE_EDEFAULT;

	/**
	 * This is true if the Scrollable attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scrollableESet;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected EList<AndColumn> column;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected EList<Row> row;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmltabulardisplaydefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.XMLTABULARDISPLAYDEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isScrollable() {
		return scrollable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrollable(boolean newScrollable) {
		boolean oldScrollable = scrollable;
		scrollable = newScrollable;
		boolean oldScrollableESet = scrollableESet;
		scrollableESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.XMLTABULARDISPLAYDEFINITION__SCROLLABLE, oldScrollable, scrollable, !oldScrollableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScrollable() {
		boolean oldScrollable = scrollable;
		boolean oldScrollableESet = scrollableESet;
		scrollable = SCROLLABLE_EDEFAULT;
		scrollableESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ViewsPackage.XMLTABULARDISPLAYDEFINITION__SCROLLABLE, oldScrollable, SCROLLABLE_EDEFAULT, oldScrollableESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScrollable() {
		return scrollableESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AndColumn> getColumn() {
		if (column == null) {
			column = new EObjectContainmentEList<AndColumn>(AndColumn.class, this, ViewsPackage.XMLTABULARDISPLAYDEFINITION__COLUMN);
		}
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Row> getRow() {
		if (row == null) {
			row = new EObjectContainmentEList<Row>(Row.class, this, ViewsPackage.XMLTABULARDISPLAYDEFINITION__ROW);
		}
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.XMLTABULARDISPLAYDEFINITION__COLUMN:
				return ((InternalEList<?>)getColumn()).basicRemove(otherEnd, msgs);
			case ViewsPackage.XMLTABULARDISPLAYDEFINITION__ROW:
				return ((InternalEList<?>)getRow()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewsPackage.XMLTABULARDISPLAYDEFINITION__SCROLLABLE:
				return isScrollable();
			case ViewsPackage.XMLTABULARDISPLAYDEFINITION__COLUMN:
				return getColumn();
			case ViewsPackage.XMLTABULARDISPLAYDEFINITION__ROW:
				return getRow();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewsPackage.XMLTABULARDISPLAYDEFINITION__SCROLLABLE:
				setScrollable((Boolean)newValue);
				return;
			case ViewsPackage.XMLTABULARDISPLAYDEFINITION__COLUMN:
				getColumn().clear();
				getColumn().addAll((Collection<? extends AndColumn>)newValue);
				return;
			case ViewsPackage.XMLTABULARDISPLAYDEFINITION__ROW:
				getRow().clear();
				getRow().addAll((Collection<? extends Row>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ViewsPackage.XMLTABULARDISPLAYDEFINITION__SCROLLABLE:
				unsetScrollable();
				return;
			case ViewsPackage.XMLTABULARDISPLAYDEFINITION__COLUMN:
				getColumn().clear();
				return;
			case ViewsPackage.XMLTABULARDISPLAYDEFINITION__ROW:
				getRow().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ViewsPackage.XMLTABULARDISPLAYDEFINITION__SCROLLABLE:
				return isSetScrollable();
			case ViewsPackage.XMLTABULARDISPLAYDEFINITION__COLUMN:
				return column != null && !column.isEmpty();
			case ViewsPackage.XMLTABULARDISPLAYDEFINITION__ROW:
				return row != null && !row.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (scrollable: ");
		if (scrollableESet) result.append(scrollable); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //XmltabulardisplaydefinitionImpl
