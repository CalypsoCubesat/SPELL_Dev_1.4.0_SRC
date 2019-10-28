/**
 */
package es.gmv.views.impl;

import es.gmv.views.DisplayRenderingType;
import es.gmv.views.FontType;
import es.gmv.views.ViewsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Display Rendering Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.gmv.views.impl.DisplayRenderingTypeImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link es.gmv.views.impl.DisplayRenderingTypeImpl#getForeground <em>Foreground</em>}</li>
 *   <li>{@link es.gmv.views.impl.DisplayRenderingTypeImpl#getFont <em>Font</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisplayRenderingTypeImpl extends MinimalEObjectImpl.Container implements DisplayRenderingType {
	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected String background = BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getForeground() <em>Foreground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected static final String FOREGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeground() <em>Foreground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected String foreground = FOREGROUND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected FontType font;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisplayRenderingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewsPackage.Literals.DISPLAY_RENDERING_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(String newBackground) {
		String oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.DISPLAY_RENDERING_TYPE__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForeground() {
		return foreground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeground(String newForeground) {
		String oldForeground = foreground;
		foreground = newForeground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.DISPLAY_RENDERING_TYPE__FOREGROUND, oldForeground, foreground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontType getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFont(FontType newFont, NotificationChain msgs) {
		FontType oldFont = font;
		font = newFont;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ViewsPackage.DISPLAY_RENDERING_TYPE__FONT, oldFont, newFont);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(FontType newFont) {
		if (newFont != font) {
			NotificationChain msgs = null;
			if (font != null)
				msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.DISPLAY_RENDERING_TYPE__FONT, null, msgs);
			if (newFont != null)
				msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ViewsPackage.DISPLAY_RENDERING_TYPE__FONT, null, msgs);
			msgs = basicSetFont(newFont, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewsPackage.DISPLAY_RENDERING_TYPE__FONT, newFont, newFont));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewsPackage.DISPLAY_RENDERING_TYPE__FONT:
				return basicSetFont(null, msgs);
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
			case ViewsPackage.DISPLAY_RENDERING_TYPE__BACKGROUND:
				return getBackground();
			case ViewsPackage.DISPLAY_RENDERING_TYPE__FOREGROUND:
				return getForeground();
			case ViewsPackage.DISPLAY_RENDERING_TYPE__FONT:
				return getFont();
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
			case ViewsPackage.DISPLAY_RENDERING_TYPE__BACKGROUND:
				setBackground((String)newValue);
				return;
			case ViewsPackage.DISPLAY_RENDERING_TYPE__FOREGROUND:
				setForeground((String)newValue);
				return;
			case ViewsPackage.DISPLAY_RENDERING_TYPE__FONT:
				setFont((FontType)newValue);
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
			case ViewsPackage.DISPLAY_RENDERING_TYPE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case ViewsPackage.DISPLAY_RENDERING_TYPE__FOREGROUND:
				setForeground(FOREGROUND_EDEFAULT);
				return;
			case ViewsPackage.DISPLAY_RENDERING_TYPE__FONT:
				setFont((FontType)null);
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
			case ViewsPackage.DISPLAY_RENDERING_TYPE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case ViewsPackage.DISPLAY_RENDERING_TYPE__FOREGROUND:
				return FOREGROUND_EDEFAULT == null ? foreground != null : !FOREGROUND_EDEFAULT.equals(foreground);
			case ViewsPackage.DISPLAY_RENDERING_TYPE__FONT:
				return font != null;
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
		result.append(" (background: ");
		result.append(background);
		result.append(", foreground: ");
		result.append(foreground);
		result.append(')');
		return result.toString();
	}

} //DisplayRenderingTypeImpl
