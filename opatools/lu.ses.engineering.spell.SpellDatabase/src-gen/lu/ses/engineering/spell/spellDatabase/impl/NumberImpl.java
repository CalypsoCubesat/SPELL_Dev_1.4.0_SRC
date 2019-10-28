/**
 */
package lu.ses.engineering.spell.spellDatabase.impl;

import lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.impl.NumberImpl#getValInt <em>Val Int</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.impl.NumberImpl#getValStr <em>Val Str</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumberImpl extends AtomImpl implements lu.ses.engineering.spell.spellDatabase.Number
{
  /**
   * The default value of the '{@link #getValInt() <em>Val Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValInt()
   * @generated
   * @ordered
   */
  protected static final int VAL_INT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValInt() <em>Val Int</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValInt()
   * @generated
   * @ordered
   */
  protected int valInt = VAL_INT_EDEFAULT;

  /**
   * The default value of the '{@link #getValStr() <em>Val Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValStr()
   * @generated
   * @ordered
   */
  protected static final String VAL_STR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValStr() <em>Val Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValStr()
   * @generated
   * @ordered
   */
  protected String valStr = VAL_STR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NumberImpl()
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
    return SpellDatabasePackage.Literals.NUMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValInt()
  {
    return valInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValInt(int newValInt)
  {
    int oldValInt = valInt;
    valInt = newValInt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpellDatabasePackage.NUMBER__VAL_INT, oldValInt, valInt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValStr()
  {
    return valStr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValStr(String newValStr)
  {
    String oldValStr = valStr;
    valStr = newValStr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpellDatabasePackage.NUMBER__VAL_STR, oldValStr, valStr));
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
      case SpellDatabasePackage.NUMBER__VAL_INT:
        return getValInt();
      case SpellDatabasePackage.NUMBER__VAL_STR:
        return getValStr();
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
      case SpellDatabasePackage.NUMBER__VAL_INT:
        setValInt((Integer)newValue);
        return;
      case SpellDatabasePackage.NUMBER__VAL_STR:
        setValStr((String)newValue);
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
      case SpellDatabasePackage.NUMBER__VAL_INT:
        setValInt(VAL_INT_EDEFAULT);
        return;
      case SpellDatabasePackage.NUMBER__VAL_STR:
        setValStr(VAL_STR_EDEFAULT);
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
      case SpellDatabasePackage.NUMBER__VAL_INT:
        return valInt != VAL_INT_EDEFAULT;
      case SpellDatabasePackage.NUMBER__VAL_STR:
        return VAL_STR_EDEFAULT == null ? valStr != null : !VAL_STR_EDEFAULT.equals(valStr);
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
    result.append(" (valInt: ");
    result.append(valInt);
    result.append(", valStr: ");
    result.append(valStr);
    result.append(')');
    return result.toString();
  }

} //NumberImpl
