/**
 */
package lu.ses.engineering.spell.spellDatabase.impl;

import lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage;
import lu.ses.engineering.spell.spellDatabase.TCArgs;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TC Args</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.impl.TCArgsImpl#getTcName <em>Tc Name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.impl.TCArgsImpl#getTcValue <em>Tc Value</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.impl.TCArgsImpl#getTcMod <em>Tc Mod</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.impl.TCArgsImpl#getTolerance <em>Tolerance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCArgsImpl extends MinimalEObjectImpl.Container implements TCArgs
{
  /**
   * The default value of the '{@link #getTcName() <em>Tc Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTcName()
   * @generated
   * @ordered
   */
  protected static final String TC_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTcName() <em>Tc Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTcName()
   * @generated
   * @ordered
   */
  protected String tcName = TC_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getTcValue() <em>Tc Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTcValue()
   * @generated
   * @ordered
   */
  protected static final String TC_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTcValue() <em>Tc Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTcValue()
   * @generated
   * @ordered
   */
  protected String tcValue = TC_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getTcMod() <em>Tc Mod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTcMod()
   * @generated
   * @ordered
   */
  protected static final String TC_MOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTcMod() <em>Tc Mod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTcMod()
   * @generated
   * @ordered
   */
  protected String tcMod = TC_MOD_EDEFAULT;

  /**
   * The default value of the '{@link #getTolerance() <em>Tolerance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTolerance()
   * @generated
   * @ordered
   */
  protected static final String TOLERANCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTolerance() <em>Tolerance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTolerance()
   * @generated
   * @ordered
   */
  protected String tolerance = TOLERANCE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TCArgsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SpellDatabasePackage.Literals.TC_ARGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTcName()
  {
    return tcName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTcName(String newTcName)
  {
    String oldTcName = tcName;
    tcName = newTcName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpellDatabasePackage.TC_ARGS__TC_NAME, oldTcName, tcName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTcValue()
  {
    return tcValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTcValue(String newTcValue)
  {
    String oldTcValue = tcValue;
    tcValue = newTcValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpellDatabasePackage.TC_ARGS__TC_VALUE, oldTcValue, tcValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTcMod()
  {
    return tcMod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTcMod(String newTcMod)
  {
    String oldTcMod = tcMod;
    tcMod = newTcMod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpellDatabasePackage.TC_ARGS__TC_MOD, oldTcMod, tcMod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTolerance()
  {
    return tolerance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTolerance(String newTolerance)
  {
    String oldTolerance = tolerance;
    tolerance = newTolerance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpellDatabasePackage.TC_ARGS__TOLERANCE, oldTolerance, tolerance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SpellDatabasePackage.TC_ARGS__TC_NAME:
        return getTcName();
      case SpellDatabasePackage.TC_ARGS__TC_VALUE:
        return getTcValue();
      case SpellDatabasePackage.TC_ARGS__TC_MOD:
        return getTcMod();
      case SpellDatabasePackage.TC_ARGS__TOLERANCE:
        return getTolerance();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpellDatabasePackage.TC_ARGS__TC_NAME:
        setTcName((String)newValue);
        return;
      case SpellDatabasePackage.TC_ARGS__TC_VALUE:
        setTcValue((String)newValue);
        return;
      case SpellDatabasePackage.TC_ARGS__TC_MOD:
        setTcMod((String)newValue);
        return;
      case SpellDatabasePackage.TC_ARGS__TOLERANCE:
        setTolerance((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SpellDatabasePackage.TC_ARGS__TC_NAME:
        setTcName(TC_NAME_EDEFAULT);
        return;
      case SpellDatabasePackage.TC_ARGS__TC_VALUE:
        setTcValue(TC_VALUE_EDEFAULT);
        return;
      case SpellDatabasePackage.TC_ARGS__TC_MOD:
        setTcMod(TC_MOD_EDEFAULT);
        return;
      case SpellDatabasePackage.TC_ARGS__TOLERANCE:
        setTolerance(TOLERANCE_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SpellDatabasePackage.TC_ARGS__TC_NAME:
        return TC_NAME_EDEFAULT == null ? tcName != null : !TC_NAME_EDEFAULT.equals(tcName);
      case SpellDatabasePackage.TC_ARGS__TC_VALUE:
        return TC_VALUE_EDEFAULT == null ? tcValue != null : !TC_VALUE_EDEFAULT.equals(tcValue);
      case SpellDatabasePackage.TC_ARGS__TC_MOD:
        return TC_MOD_EDEFAULT == null ? tcMod != null : !TC_MOD_EDEFAULT.equals(tcMod);
      case SpellDatabasePackage.TC_ARGS__TOLERANCE:
        return TOLERANCE_EDEFAULT == null ? tolerance != null : !TOLERANCE_EDEFAULT.equals(tolerance);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (tcName: ");
    result.append(tcName);
    result.append(", tcValue: ");
    result.append(tcValue);
    result.append(", tcMod: ");
    result.append(tcMod);
    result.append(", tolerance: ");
    result.append(tolerance);
    result.append(')');
    return result.toString();
  }

} //TCArgsImpl
