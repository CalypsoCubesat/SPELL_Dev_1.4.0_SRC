/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;

import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.arglist;
import lu.ses.engineering.spell.controlflow.spell.argument;
import lu.ses.engineering.spell.controlflow.spell.test;

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
 * An implementation of the model object '<em><b>arglist</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.arglistImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.arglistImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.arglistImpl#isOptionalComma <em>Optional Comma</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.arglistImpl#getDot1_test <em>Dot1 test</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.arglistImpl#getDot1_arguments <em>Dot1 arguments</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.arglistImpl#getDot2_test <em>Dot2 test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class arglistImpl extends SpellElementImpl implements arglist {
	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<argument> arguments;

	/**
	 * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected argument argument;

	/**
	 * The default value of the '{@link #isOptionalComma() <em>Optional Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptionalComma()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_COMMA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptionalComma() <em>Optional Comma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptionalComma()
	 * @generated
	 * @ordered
	 */
	protected boolean optionalComma = OPTIONAL_COMMA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDot1_test() <em>Dot1 test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDot1_test()
	 * @generated
	 * @ordered
	 */
	protected test dot1_test;

	/**
	 * The cached value of the '{@link #getDot1_arguments() <em>Dot1 arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDot1_arguments()
	 * @generated
	 * @ordered
	 */
	protected EList<argument> dot1_arguments;

	/**
	 * The cached value of the '{@link #getDot2_test() <em>Dot2 test</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDot2_test()
	 * @generated
	 * @ordered
	 */
	protected test dot2_test;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected arglistImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.ARGLIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<argument> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<argument>(argument.class, this, SpellPackage.ARGLIST__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public argument getArgument() {
		return argument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArgument(argument newArgument, NotificationChain msgs) {
		argument oldArgument = argument;
		argument = newArgument;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.ARGLIST__ARGUMENT, oldArgument, newArgument);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgument(argument newArgument) {
		if (newArgument != argument) {
			NotificationChain msgs = null;
			if (argument != null)
				msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ARGLIST__ARGUMENT, null, msgs);
			if (newArgument != null)
				msgs = ((InternalEObject)newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ARGLIST__ARGUMENT, null, msgs);
			msgs = basicSetArgument(newArgument, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ARGLIST__ARGUMENT, newArgument, newArgument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptionalComma() {
		return optionalComma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptionalComma(boolean newOptionalComma) {
		boolean oldOptionalComma = optionalComma;
		optionalComma = newOptionalComma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ARGLIST__OPTIONAL_COMMA, oldOptionalComma, optionalComma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test getDot1_test() {
		return dot1_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDot1_test(test newDot1_test, NotificationChain msgs) {
		test oldDot1_test = dot1_test;
		dot1_test = newDot1_test;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.ARGLIST__DOT1_TEST, oldDot1_test, newDot1_test);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDot1_test(test newDot1_test) {
		if (newDot1_test != dot1_test) {
			NotificationChain msgs = null;
			if (dot1_test != null)
				msgs = ((InternalEObject)dot1_test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ARGLIST__DOT1_TEST, null, msgs);
			if (newDot1_test != null)
				msgs = ((InternalEObject)newDot1_test).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ARGLIST__DOT1_TEST, null, msgs);
			msgs = basicSetDot1_test(newDot1_test, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ARGLIST__DOT1_TEST, newDot1_test, newDot1_test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<argument> getDot1_arguments() {
		if (dot1_arguments == null) {
			dot1_arguments = new EObjectContainmentEList<argument>(argument.class, this, SpellPackage.ARGLIST__DOT1_ARGUMENTS);
		}
		return dot1_arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public test getDot2_test() {
		return dot2_test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDot2_test(test newDot2_test, NotificationChain msgs) {
		test oldDot2_test = dot2_test;
		dot2_test = newDot2_test;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.ARGLIST__DOT2_TEST, oldDot2_test, newDot2_test);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDot2_test(test newDot2_test) {
		if (newDot2_test != dot2_test) {
			NotificationChain msgs = null;
			if (dot2_test != null)
				msgs = ((InternalEObject)dot2_test).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ARGLIST__DOT2_TEST, null, msgs);
			if (newDot2_test != null)
				msgs = ((InternalEObject)newDot2_test).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.ARGLIST__DOT2_TEST, null, msgs);
			msgs = basicSetDot2_test(newDot2_test, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.ARGLIST__DOT2_TEST, newDot2_test, newDot2_test));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.ARGLIST__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case SpellPackage.ARGLIST__ARGUMENT:
				return basicSetArgument(null, msgs);
			case SpellPackage.ARGLIST__DOT1_TEST:
				return basicSetDot1_test(null, msgs);
			case SpellPackage.ARGLIST__DOT1_ARGUMENTS:
				return ((InternalEList<?>)getDot1_arguments()).basicRemove(otherEnd, msgs);
			case SpellPackage.ARGLIST__DOT2_TEST:
				return basicSetDot2_test(null, msgs);
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
			case SpellPackage.ARGLIST__ARGUMENTS:
				return getArguments();
			case SpellPackage.ARGLIST__ARGUMENT:
				return getArgument();
			case SpellPackage.ARGLIST__OPTIONAL_COMMA:
				return isOptionalComma();
			case SpellPackage.ARGLIST__DOT1_TEST:
				return getDot1_test();
			case SpellPackage.ARGLIST__DOT1_ARGUMENTS:
				return getDot1_arguments();
			case SpellPackage.ARGLIST__DOT2_TEST:
				return getDot2_test();
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
			case SpellPackage.ARGLIST__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends argument>)newValue);
				return;
			case SpellPackage.ARGLIST__ARGUMENT:
				setArgument((argument)newValue);
				return;
			case SpellPackage.ARGLIST__OPTIONAL_COMMA:
				setOptionalComma((Boolean)newValue);
				return;
			case SpellPackage.ARGLIST__DOT1_TEST:
				setDot1_test((test)newValue);
				return;
			case SpellPackage.ARGLIST__DOT1_ARGUMENTS:
				getDot1_arguments().clear();
				getDot1_arguments().addAll((Collection<? extends argument>)newValue);
				return;
			case SpellPackage.ARGLIST__DOT2_TEST:
				setDot2_test((test)newValue);
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
			case SpellPackage.ARGLIST__ARGUMENTS:
				getArguments().clear();
				return;
			case SpellPackage.ARGLIST__ARGUMENT:
				setArgument((argument)null);
				return;
			case SpellPackage.ARGLIST__OPTIONAL_COMMA:
				setOptionalComma(OPTIONAL_COMMA_EDEFAULT);
				return;
			case SpellPackage.ARGLIST__DOT1_TEST:
				setDot1_test((test)null);
				return;
			case SpellPackage.ARGLIST__DOT1_ARGUMENTS:
				getDot1_arguments().clear();
				return;
			case SpellPackage.ARGLIST__DOT2_TEST:
				setDot2_test((test)null);
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
			case SpellPackage.ARGLIST__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case SpellPackage.ARGLIST__ARGUMENT:
				return argument != null;
			case SpellPackage.ARGLIST__OPTIONAL_COMMA:
				return optionalComma != OPTIONAL_COMMA_EDEFAULT;
			case SpellPackage.ARGLIST__DOT1_TEST:
				return dot1_test != null;
			case SpellPackage.ARGLIST__DOT1_ARGUMENTS:
				return dot1_arguments != null && !dot1_arguments.isEmpty();
			case SpellPackage.ARGLIST__DOT2_TEST:
				return dot2_test != null;
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
		result.append(" (optionalComma: ");
		result.append(optionalComma);
		result.append(')');
		return result.toString();
	}

} //arglistImpl
