/**
 */
package lu.ses.engineering.spell.controlflow.spell.impl;

import java.util.Collection;
import lu.ses.engineering.spell.controlflow.spell.BuildTC;
import lu.ses.engineering.spell.controlflow.spell.Send;
import lu.ses.engineering.spell.controlflow.spell.SpellPackage;
import lu.ses.engineering.spell.controlflow.spell.arglist;

import lu.ses.engineering.spell.controlflow.spell.atom;
import lu.ses.engineering.spell.controlflow.spell.test;
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
 * An implementation of the model object '<em><b>Send</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.SendImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.SendImpl#getVerify <em>Verify</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.SendImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.SendImpl#getValues <em>Values</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.controlflow.spell.impl.SendImpl#getArgs <em>Args</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendImpl extends powerImpl implements Send {
	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected arglist command;

	/**
	 * The cached value of the '{@link #getVerify() <em>Verify</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerify()
	 * @generated
	 * @ordered
	 */
	protected arglist verify;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EList<test> arguments;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<test> values;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<arglist> args;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpellPackage.Literals.SEND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arglist getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommand(arglist newCommand, NotificationChain msgs) {
		arglist oldCommand = command;
		command = newCommand;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.SEND__COMMAND, oldCommand, newCommand);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(arglist newCommand) {
		if (newCommand != command) {
			NotificationChain msgs = null;
			if (command != null)
				msgs = ((InternalEObject)command).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.SEND__COMMAND, null, msgs);
			if (newCommand != null)
				msgs = ((InternalEObject)newCommand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.SEND__COMMAND, null, msgs);
			msgs = basicSetCommand(newCommand, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.SEND__COMMAND, newCommand, newCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public arglist getVerify() {
		return verify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerify(arglist newVerify, NotificationChain msgs) {
		arglist oldVerify = verify;
		verify = newVerify;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellPackage.SEND__VERIFY, oldVerify, newVerify);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerify(arglist newVerify) {
		if (newVerify != verify) {
			NotificationChain msgs = null;
			if (verify != null)
				msgs = ((InternalEObject)verify).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellPackage.SEND__VERIFY, null, msgs);
			if (newVerify != null)
				msgs = ((InternalEObject)newVerify).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellPackage.SEND__VERIFY, null, msgs);
			msgs = basicSetVerify(newVerify, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpellPackage.SEND__VERIFY, newVerify, newVerify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<test> getArguments() {
		if (arguments == null) {
			arguments = new EObjectContainmentEList<test>(test.class, this, SpellPackage.SEND__ARGUMENTS);
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<test> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<test>(test.class, this, SpellPackage.SEND__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<arglist> getArgs() {
		if (args == null) {
			args = new EObjectContainmentEList<arglist>(arglist.class, this, SpellPackage.SEND__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpellPackage.SEND__COMMAND:
				return basicSetCommand(null, msgs);
			case SpellPackage.SEND__VERIFY:
				return basicSetVerify(null, msgs);
			case SpellPackage.SEND__ARGUMENTS:
				return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
			case SpellPackage.SEND__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
			case SpellPackage.SEND__ARGS:
				return ((InternalEList<?>)getArgs()).basicRemove(otherEnd, msgs);
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
			case SpellPackage.SEND__COMMAND:
				return getCommand();
			case SpellPackage.SEND__VERIFY:
				return getVerify();
			case SpellPackage.SEND__ARGUMENTS:
				return getArguments();
			case SpellPackage.SEND__VALUES:
				return getValues();
			case SpellPackage.SEND__ARGS:
				return getArgs();
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
			case SpellPackage.SEND__COMMAND:
				setCommand((arglist)newValue);
				return;
			case SpellPackage.SEND__VERIFY:
				setVerify((arglist)newValue);
				return;
			case SpellPackage.SEND__ARGUMENTS:
				getArguments().clear();
				getArguments().addAll((Collection<? extends test>)newValue);
				return;
			case SpellPackage.SEND__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends test>)newValue);
				return;
			case SpellPackage.SEND__ARGS:
				getArgs().clear();
				getArgs().addAll((Collection<? extends arglist>)newValue);
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
			case SpellPackage.SEND__COMMAND:
				setCommand((arglist)null);
				return;
			case SpellPackage.SEND__VERIFY:
				setVerify((arglist)null);
				return;
			case SpellPackage.SEND__ARGUMENTS:
				getArguments().clear();
				return;
			case SpellPackage.SEND__VALUES:
				getValues().clear();
				return;
			case SpellPackage.SEND__ARGS:
				getArgs().clear();
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
			case SpellPackage.SEND__COMMAND:
				return command != null;
			case SpellPackage.SEND__VERIFY:
				return verify != null;
			case SpellPackage.SEND__ARGUMENTS:
				return arguments != null && !arguments.isEmpty();
			case SpellPackage.SEND__VALUES:
				return values != null && !values.isEmpty();
			case SpellPackage.SEND__ARGS:
				return args != null && !args.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SendImpl
