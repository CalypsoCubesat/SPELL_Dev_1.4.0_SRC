/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.varargslist;
import lu.ses.engineering.spell.controlflow.spell.varargslist_element;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>varargslist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.varargslistImpl#getVarargs1 <em>Varargs1</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.varargslistImpl#getDot1Name <em>Dot1 Name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.varargslistImpl#getDot2Name <em>Dot2 Name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.varargslistImpl#getDot3Name <em>Dot3 Name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.varargslistImpl#getVararg2 <em>Vararg2</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.varargslistImpl#getVarargs3 <em>Varargs3</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.varargslistImpl#isAdditionalComma <em>Additional Comma</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class varargslistImpl extends SpellElementImpl implements varargslist {
	/**
	 * The cached value of the '{@link #getVarargs1() <em>Varargs1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarargs1()
	 * @generated
	 * @ordered
	 */
	protected EList<varargslist_element> varargs1;

	/**
	 * The default value of the '{@link #getDot1Name() <em>Dot1 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDot1Name()
	 * @generated
	 * @ordered
	 */
	protected static final String DOT1_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDot1Name() <em>Dot1 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDot1Name()
	 * @generated
	 * @ordered
	 */
	protected String dot1Name = DOT1_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDot2Name() <em>Dot2 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDot2Name()
	 * @generated
	 * @ordered
	 */
	protected static final String DOT2_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDot2Name() <em>Dot2 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDot2Name()
	 * @generated
	 * @ordered
	 */
	protected String dot2Name = DOT2_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDot3Name() <em>Dot3 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDot3Name()
	 * @generated
	 * @ordered
	 */
	protected static final String DOT3_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDot3Name() <em>Dot3 Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDot3Name()
	 * @generated
	 * @ordered
	 */
	protected String dot3Name = DOT3_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVararg2() <em>Vararg2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVararg2()
	 * @generated
	 * @ordered
	 */
	protected varargslist_element vararg2;

	/**
	 * The cached value of the '{@link #getVarargs3() <em>Varargs3</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarargs3()
	 * @generated
	 * @ordered
	 */
	protected EList<varargslist_element> varargs3;

	/**
	 * The default value of the '{@link #isAdditionalComma() <em>Additional Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdditionalComma()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADDITIONAL_COMMA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdditionalComma() <em>Additional Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdditionalComma()
	 * @generated
	 * @ordered
	 */
	protected boolean additionalComma = ADDITIONAL_COMMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected varargslistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.VARARGSLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<varargslist_element> getVarargs1() {
		if (varargs1 == null) {
			varargs1 = new EObjectContainmentEList<varargslist_element>(varargslist_element.class, this, SpellPackage.VARARGSLIST__VARARGS1);
		}
		return varargs1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDot1Name() {
		return dot1Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDot1Name(String newDot1Name) {
		String oldDot1Name = dot1Name;
		dot1Name = newDot1Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.VARARGSLIST__DOT1_NAME, oldDot1Name, dot1Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDot2Name() {
		return dot2Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDot2Name(String newDot2Name) {
		String oldDot2Name = dot2Name;
		dot2Name = newDot2Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.VARARGSLIST__DOT2_NAME, oldDot2Name, dot2Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDot3Name() {
		return dot3Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDot3Name(String newDot3Name) {
		String oldDot3Name = dot3Name;
		dot3Name = newDot3Name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.VARARGSLIST__DOT3_NAME, oldDot3Name, dot3Name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public varargslist_element getVararg2() {
		return vararg2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVararg2(varargslist_element newVararg2, NotificationChain msgs) {
		varargslist_element oldVararg2 = vararg2;
		vararg2 = newVararg2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.VARARGSLIST__VARARG2, oldVararg2, newVararg2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVararg2(varargslist_element newVararg2) {
		if (newVararg2 != vararg2) {
			NotificationChain msgs = null;
			if (vararg2 != null)
				msgs = ((InternalEObject)vararg2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.VARARGSLIST__VARARG2, null, msgs);
			if (newVararg2 != null)
				msgs = ((InternalEObject)newVararg2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.VARARGSLIST__VARARG2, null, msgs);
			msgs = basicSetVararg2(newVararg2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.VARARGSLIST__VARARG2, newVararg2, newVararg2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<varargslist_element> getVarargs3() {
		if (varargs3 == null) {
			varargs3 = new EObjectContainmentEList<varargslist_element>(varargslist_element.class, this, SpellPackage.VARARGSLIST__VARARGS3);
		}
		return varargs3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdditionalComma() {
		return additionalComma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalComma(boolean newAdditionalComma) {
		boolean oldAdditionalComma = additionalComma;
		additionalComma = newAdditionalComma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.VARARGSLIST__ADDITIONAL_COMMA, oldAdditionalComma, additionalComma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.VARARGSLIST__VARARGS1:
				return ((InternalEList<?>)getVarargs1()).basicRemove(otherEnd, msgs);
			case SpellPackage.VARARGSLIST__VARARG2:
				return basicSetVararg2(null, msgs);
			case SpellPackage.VARARGSLIST__VARARGS3:
				return ((InternalEList<?>)getVarargs3()).basicRemove(otherEnd, msgs);
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
			case SpellPackage.VARARGSLIST__VARARGS1:
				return getVarargs1();
			case SpellPackage.VARARGSLIST__DOT1_NAME:
				return getDot1Name();
			case SpellPackage.VARARGSLIST__DOT2_NAME:
				return getDot2Name();
			case SpellPackage.VARARGSLIST__DOT3_NAME:
				return getDot3Name();
			case SpellPackage.VARARGSLIST__VARARG2:
				return getVararg2();
			case SpellPackage.VARARGSLIST__VARARGS3:
				return getVarargs3();
			case SpellPackage.VARARGSLIST__ADDITIONAL_COMMA:
				return isAdditionalComma();
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
			case SpellPackage.VARARGSLIST__VARARGS1:
				getVarargs1().clear();
				getVarargs1().addAll((Collection<? extends varargslist_element>)newValue);
				return;
			case SpellPackage.VARARGSLIST__DOT1_NAME:
				setDot1Name((String)newValue);
				return;
			case SpellPackage.VARARGSLIST__DOT2_NAME:
				setDot2Name((String)newValue);
				return;
			case SpellPackage.VARARGSLIST__DOT3_NAME:
				setDot3Name((String)newValue);
				return;
			case SpellPackage.VARARGSLIST__VARARG2:
				setVararg2((varargslist_element)newValue);
				return;
			case SpellPackage.VARARGSLIST__VARARGS3:
				getVarargs3().clear();
				getVarargs3().addAll((Collection<? extends varargslist_element>)newValue);
				return;
			case SpellPackage.VARARGSLIST__ADDITIONAL_COMMA:
				setAdditionalComma((Boolean)newValue);
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
			case SpellPackage.VARARGSLIST__VARARGS1:
				getVarargs1().clear();
				return;
			case SpellPackage.VARARGSLIST__DOT1_NAME:
				setDot1Name(DOT1_NAME_EDEFAULT);
				return;
			case SpellPackage.VARARGSLIST__DOT2_NAME:
				setDot2Name(DOT2_NAME_EDEFAULT);
				return;
			case SpellPackage.VARARGSLIST__DOT3_NAME:
				setDot3Name(DOT3_NAME_EDEFAULT);
				return;
			case SpellPackage.VARARGSLIST__VARARG2:
				setVararg2((varargslist_element)null);
				return;
			case SpellPackage.VARARGSLIST__VARARGS3:
				getVarargs3().clear();
				return;
			case SpellPackage.VARARGSLIST__ADDITIONAL_COMMA:
				setAdditionalComma(ADDITIONAL_COMMA_EDEFAULT);
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
			case SpellPackage.VARARGSLIST__VARARGS1:
				return varargs1 != null && !varargs1.isEmpty();
			case SpellPackage.VARARGSLIST__DOT1_NAME:
				return DOT1_NAME_EDEFAULT == null ? dot1Name != null : !DOT1_NAME_EDEFAULT.equals(dot1Name);
			case SpellPackage.VARARGSLIST__DOT2_NAME:
				return DOT2_NAME_EDEFAULT == null ? dot2Name != null : !DOT2_NAME_EDEFAULT.equals(dot2Name);
			case SpellPackage.VARARGSLIST__DOT3_NAME:
				return DOT3_NAME_EDEFAULT == null ? dot3Name != null : !DOT3_NAME_EDEFAULT.equals(dot3Name);
			case SpellPackage.VARARGSLIST__VARARG2:
				return vararg2 != null;
			case SpellPackage.VARARGSLIST__VARARGS3:
				return varargs3 != null && !varargs3.isEmpty();
			case SpellPackage.VARARGSLIST__ADDITIONAL_COMMA:
				return additionalComma != ADDITIONAL_COMMA_EDEFAULT;
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
		result.append(" (dot1Name: ");
		result.append(dot1Name);
		result.append(", dot2Name: ");
		result.append(dot2Name);
		result.append(", dot3Name: ");
		result.append(dot3Name);
		result.append(", additionalComma: ");
		result.append(additionalComma);
		result.append(')');
		return result.toString();
	}

} //varargslistImpl
