/**
 */
package es.gmv.views.impl;

import es.gmv.views.MetaInformation;
import es.gmv.views.ViewsPackage;
import es.gmv.views.Xmldisplaydefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xmldisplaydefinition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gmv.views.impl.XmldisplaydefinitionImpl#getMetaInformation <em>Meta Information</em>}</li>
 *   <li>{@link es.gmv.views.impl.XmldisplaydefinitionImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link es.gmv.views.impl.XmldisplaydefinitionImpl#getKindOfDisplay <em>Kind Of Display</em>}</li>
 *   <li>{@link es.gmv.views.impl.XmldisplaydefinitionImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class XmldisplaydefinitionImpl extends MinimalEObjectImpl.Container implements Xmldisplaydefinition {
	/**
	 * The cached value of the '{@link #getMetaInformation() <em>Meta Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaInformation()
	 * @generated
	 * @ordered
	 */
	protected MetaInformation metaInformation;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getKindOfDisplay() <em>Kind Of Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_OF_DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKindOfDisplay() <em>Kind Of Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKindOfDisplay()
	 * @generated
	 * @ordered
	 */
	protected String kindOfDisplay = KIND_OF_DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XmldisplaydefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.XMLDISPLAYDEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaInformation getMetaInformation() {
		return metaInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaInformation(MetaInformation newMetaInformation, NotificationChain msgs) {
		MetaInformation oldMetaInformation = metaInformation;
		metaInformation = newMetaInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewsPackage.XMLDISPLAYDEFINITION__META_INFORMATION, oldMetaInformation, newMetaInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaInformation(MetaInformation newMetaInformation) {
		if (newMetaInformation != metaInformation) {
			NotificationChain msgs = null;
			if (metaInformation != null)
				msgs = ((InternalEObject)metaInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.XMLDISPLAYDEFINITION__META_INFORMATION, null, msgs);
			if (newMetaInformation != null)
				msgs = ((InternalEObject)newMetaInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.XMLDISPLAYDEFINITION__META_INFORMATION, null, msgs);
			msgs = basicSetMetaInformation(newMetaInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.XMLDISPLAYDEFINITION__META_INFORMATION, newMetaInformation, newMetaInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.XMLDISPLAYDEFINITION__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKindOfDisplay() {
		return kindOfDisplay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKindOfDisplay(String newKindOfDisplay) {
		String oldKindOfDisplay = kindOfDisplay;
		kindOfDisplay = newKindOfDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.XMLDISPLAYDEFINITION__KIND_OF_DISPLAY, oldKindOfDisplay, kindOfDisplay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.XMLDISPLAYDEFINITION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.XMLDISPLAYDEFINITION__META_INFORMATION:
				return basicSetMetaInformation(null, msgs);
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
			case ViewsPackage.XMLDISPLAYDEFINITION__META_INFORMATION:
				return getMetaInformation();
			case ViewsPackage.XMLDISPLAYDEFINITION__IDENTIFIER:
				return getIdentifier();
			case ViewsPackage.XMLDISPLAYDEFINITION__KIND_OF_DISPLAY:
				return getKindOfDisplay();
			case ViewsPackage.XMLDISPLAYDEFINITION__VERSION:
				return getVersion();
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
			case ViewsPackage.XMLDISPLAYDEFINITION__META_INFORMATION:
				setMetaInformation((MetaInformation)newValue);
				return;
			case ViewsPackage.XMLDISPLAYDEFINITION__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case ViewsPackage.XMLDISPLAYDEFINITION__KIND_OF_DISPLAY:
				setKindOfDisplay((String)newValue);
				return;
			case ViewsPackage.XMLDISPLAYDEFINITION__VERSION:
				setVersion((String)newValue);
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
			case ViewsPackage.XMLDISPLAYDEFINITION__META_INFORMATION:
				setMetaInformation((MetaInformation)null);
				return;
			case ViewsPackage.XMLDISPLAYDEFINITION__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case ViewsPackage.XMLDISPLAYDEFINITION__KIND_OF_DISPLAY:
				setKindOfDisplay(KIND_OF_DISPLAY_EDEFAULT);
				return;
			case ViewsPackage.XMLDISPLAYDEFINITION__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case ViewsPackage.XMLDISPLAYDEFINITION__META_INFORMATION:
				return metaInformation != null;
			case ViewsPackage.XMLDISPLAYDEFINITION__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case ViewsPackage.XMLDISPLAYDEFINITION__KIND_OF_DISPLAY:
				return KIND_OF_DISPLAY_EDEFAULT == null ? kindOfDisplay != null : !KIND_OF_DISPLAY_EDEFAULT.equals(kindOfDisplay);
			case ViewsPackage.XMLDISPLAYDEFINITION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", kindOfDisplay: ");
		result.append(kindOfDisplay);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //XmldisplaydefinitionImpl
