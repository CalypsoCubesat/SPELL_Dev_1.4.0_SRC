/**
 */
package lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl;

import java.util.Collection;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Layout;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.Node;
import lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.WorkspacePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.LayoutImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.LayoutImpl#getName <em>Name</em>}</li>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.LayoutImpl#getIsCalled <em>Is Called</em>}</li>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.LayoutImpl#getCalls <em>Calls</em>}</li>
 *   <li>{@link lu.ses.engineering.B7022SPELL.WorkspaceGrammar.xml.Workspace.impl.LayoutImpl#isMissing <em>Missing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LayoutImpl extends WorkspaceImpl implements Layout {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

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
	 * The cached value of the '{@link #getIsCalled() <em>Is Called</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCalled()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> isCalled;

	/**
	 * The cached value of the '{@link #getCalls() <em>Calls</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalls()
	 * @generated
	 * @ordered
	 */
	protected EList<Layout> calls;

	/**
	 * The default value of the '{@link #isMissing() <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMissing()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MISSING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMissing() <em>Missing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMissing()
	 * @generated
	 * @ordered
	 */
	protected boolean missing = MISSING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkspacePackage.Literals.LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, WorkspacePackage.LAYOUT__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkspacePackage.LAYOUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layout> getIsCalled() {
		if (isCalled == null) {
			isCalled = new EObjectWithInverseResolvingEList.ManyInverse<Layout>(Layout.class, this, WorkspacePackage.LAYOUT__IS_CALLED, WorkspacePackage.LAYOUT__CALLS);
		}
		return isCalled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Layout> getCalls() {
		if (calls == null) {
			calls = new EObjectWithInverseResolvingEList.ManyInverse<Layout>(Layout.class, this, WorkspacePackage.LAYOUT__CALLS, WorkspacePackage.LAYOUT__IS_CALLED);
		}
		return calls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMissing() {
		return missing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMissing(boolean newMissing) {
		boolean oldMissing = missing;
		missing = newMissing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkspacePackage.LAYOUT__MISSING, oldMissing, missing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkspacePackage.LAYOUT__IS_CALLED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIsCalled()).basicAdd(otherEnd, msgs);
			case WorkspacePackage.LAYOUT__CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCalls()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkspacePackage.LAYOUT__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case WorkspacePackage.LAYOUT__IS_CALLED:
				return ((InternalEList<?>)getIsCalled()).basicRemove(otherEnd, msgs);
			case WorkspacePackage.LAYOUT__CALLS:
				return ((InternalEList<?>)getCalls()).basicRemove(otherEnd, msgs);
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
			case WorkspacePackage.LAYOUT__NODES:
				return getNodes();
			case WorkspacePackage.LAYOUT__NAME:
				return getName();
			case WorkspacePackage.LAYOUT__IS_CALLED:
				return getIsCalled();
			case WorkspacePackage.LAYOUT__CALLS:
				return getCalls();
			case WorkspacePackage.LAYOUT__MISSING:
				return isMissing();
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
			case WorkspacePackage.LAYOUT__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case WorkspacePackage.LAYOUT__NAME:
				setName((String)newValue);
				return;
			case WorkspacePackage.LAYOUT__IS_CALLED:
				getIsCalled().clear();
				getIsCalled().addAll((Collection<? extends Layout>)newValue);
				return;
			case WorkspacePackage.LAYOUT__CALLS:
				getCalls().clear();
				getCalls().addAll((Collection<? extends Layout>)newValue);
				return;
			case WorkspacePackage.LAYOUT__MISSING:
				setMissing((Boolean)newValue);
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
			case WorkspacePackage.LAYOUT__NODES:
				getNodes().clear();
				return;
			case WorkspacePackage.LAYOUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkspacePackage.LAYOUT__IS_CALLED:
				getIsCalled().clear();
				return;
			case WorkspacePackage.LAYOUT__CALLS:
				getCalls().clear();
				return;
			case WorkspacePackage.LAYOUT__MISSING:
				setMissing(MISSING_EDEFAULT);
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
			case WorkspacePackage.LAYOUT__NODES:
				return nodes != null && !nodes.isEmpty();
			case WorkspacePackage.LAYOUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkspacePackage.LAYOUT__IS_CALLED:
				return isCalled != null && !isCalled.isEmpty();
			case WorkspacePackage.LAYOUT__CALLS:
				return calls != null && !calls.isEmpty();
			case WorkspacePackage.LAYOUT__MISSING:
				return missing != MISSING_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", missing: ");
		result.append(missing);
		result.append(')');
		return result.toString();
	}

} //LayoutImpl
