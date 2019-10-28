/**
 */
package com.astra.ses.spell.dev.database.webapi.dbModel;

import com.astra.ses.spell.dev.database.interfaces.IDatabaseElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Database Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getFullName <em>Full Name</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getDescription <em>Description</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getName <em>Name</em>}</li>
 *   <li>{@link com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getCachedWebAPIData <em>Cached Web API Data</em>}</li>
 * </ul>
 *
 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getDatabaseElement()
 * @model instanceClass="com.astra.ses.spell.dev.database.interfaces.IDatabaseElement"
 * @generated
 */
public class DatabaseElement extends MinimalEObjectImpl.Container implements IDatabaseElement {
	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected String fullName = FULL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCachedWebAPIData() <em>Cached Web API Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachedWebAPIData()
	 * @generated
	 * @ordered
	 */
	protected static final String CACHED_WEB_API_DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCachedWebAPIData() <em>Cached Web API Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCachedWebAPIData()
	 * @generated
	 * @ordered
	 */
	protected String cachedWebAPIData = CACHED_WEB_API_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseElement() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DbModelPackage.Literals.DATABASE_ELEMENT;
	}

	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Full Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getDatabaseElement_FullName()
	 * @model
	 * @generated
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	public void setFullName(String newFullName) {
		String oldFullName = fullName;
		fullName = newFullName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.DATABASE_ELEMENT__FULL_NAME, oldFullName, fullName));
	}

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getDatabaseElement_Description()
	 * @model
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.DATABASE_ELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getDatabaseElement_Name()
	 * @model
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.DATABASE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Cached Web API Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cached Web API Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cached Web API Data</em>' attribute.
	 * @see #setCachedWebAPIData(String)
	 * @see com.astra.ses.spell.dev.database.webapi.dbModel.DbModelPackage#getDatabaseElement_CachedWebAPIData()
	 * @model
	 * @generated
	 */
	public String getCachedWebAPIData() {
		return cachedWebAPIData;
	}

	/**
	 * Sets the value of the '{@link com.astra.ses.spell.dev.database.interfaces.IDatabaseElement#getCachedWebAPIData <em>Cached Web API Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cached Web API Data</em>' attribute.
	 * @see #getCachedWebAPIData()
	 * @generated
	 */
	public void setCachedWebAPIData(String newCachedWebAPIData) {
		String oldCachedWebAPIData = cachedWebAPIData;
		cachedWebAPIData = newCachedWebAPIData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DbModelPackage.DATABASE_ELEMENT__CACHED_WEB_API_DATA, oldCachedWebAPIData, cachedWebAPIData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DbModelPackage.DATABASE_ELEMENT__FULL_NAME:
				return getFullName();
			case DbModelPackage.DATABASE_ELEMENT__DESCRIPTION:
				return getDescription();
			case DbModelPackage.DATABASE_ELEMENT__NAME:
				return getName();
			case DbModelPackage.DATABASE_ELEMENT__CACHED_WEB_API_DATA:
				return getCachedWebAPIData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DbModelPackage.DATABASE_ELEMENT__FULL_NAME:
				setFullName((String)newValue);
				return;
			case DbModelPackage.DATABASE_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case DbModelPackage.DATABASE_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case DbModelPackage.DATABASE_ELEMENT__CACHED_WEB_API_DATA:
				setCachedWebAPIData((String)newValue);
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
			case DbModelPackage.DATABASE_ELEMENT__FULL_NAME:
				setFullName(FULL_NAME_EDEFAULT);
				return;
			case DbModelPackage.DATABASE_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case DbModelPackage.DATABASE_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DbModelPackage.DATABASE_ELEMENT__CACHED_WEB_API_DATA:
				setCachedWebAPIData(CACHED_WEB_API_DATA_EDEFAULT);
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
			case DbModelPackage.DATABASE_ELEMENT__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? fullName != null : !FULL_NAME_EDEFAULT.equals(fullName);
			case DbModelPackage.DATABASE_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case DbModelPackage.DATABASE_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DbModelPackage.DATABASE_ELEMENT__CACHED_WEB_API_DATA:
				return CACHED_WEB_API_DATA_EDEFAULT == null ? cachedWebAPIData != null : !CACHED_WEB_API_DATA_EDEFAULT.equals(cachedWebAPIData);
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
		result.append(" (fullName: ");
		result.append(fullName);
		result.append(", description: ");
		result.append(description);
		result.append(", name: ");
		result.append(name);
		result.append(", cachedWebAPIData: ");
		result.append(cachedWebAPIData);
		result.append(')');
		return result.toString();
	}

} // DatabaseElement
