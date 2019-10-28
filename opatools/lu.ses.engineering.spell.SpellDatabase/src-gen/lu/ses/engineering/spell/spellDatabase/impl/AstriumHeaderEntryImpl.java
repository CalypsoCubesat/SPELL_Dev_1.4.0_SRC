/**
 */
package lu.ses.engineering.spell.spellDatabase.impl;

import lu.ses.engineering.spell.spellDatabase.AstriumHeaderEntry;
import lu.ses.engineering.spell.spellDatabase.Atom;
import lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Astrium Header Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumHeaderEntryImpl#getName <em>Name</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumHeaderEntryImpl#getAstriumTime <em>Astrium Time</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumHeaderEntryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.impl.AstriumHeaderEntryImpl#getSimpleValue <em>Simple Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AstriumHeaderEntryImpl extends MinimalEObjectImpl.Container implements AstriumHeaderEntry
{
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
   * The default value of the '{@link #getAstriumTime() <em>Astrium Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAstriumTime()
   * @generated
   * @ordered
   */
  protected static final String ASTRIUM_TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAstriumTime() <em>Astrium Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAstriumTime()
   * @generated
   * @ordered
   */
  protected String astriumTime = ASTRIUM_TIME_EDEFAULT;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Atom value;

  /**
   * The default value of the '{@link #getSimpleValue() <em>Simple Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleValue()
   * @generated
   * @ordered
   */
  protected static final String SIMPLE_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSimpleValue() <em>Simple Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSimpleValue()
   * @generated
   * @ordered
   */
  protected String simpleValue = SIMPLE_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AstriumHeaderEntryImpl()
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
    return SpellDatabasePackage.Literals.ASTRIUM_HEADER_ENTRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAstriumTime()
  {
    return astriumTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAstriumTime(String newAstriumTime)
  {
    String oldAstriumTime = astriumTime;
    astriumTime = newAstriumTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__ASTRIUM_TIME, oldAstriumTime, astriumTime));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Atom newValue, NotificationChain msgs)
  {
    Atom oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Atom newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSimpleValue()
  {
    return simpleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSimpleValue(String newSimpleValue)
  {
    String oldSimpleValue = simpleValue;
    simpleValue = newSimpleValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__SIMPLE_VALUE, oldSimpleValue, simpleValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__VALUE:
        return basicSetValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__NAME:
        return getName();
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__ASTRIUM_TIME:
        return getAstriumTime();
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__VALUE:
        return getValue();
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__SIMPLE_VALUE:
        return getSimpleValue();
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
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__NAME:
        setName((String)newValue);
        return;
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__ASTRIUM_TIME:
        setAstriumTime((String)newValue);
        return;
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__VALUE:
        setValue((Atom)newValue);
        return;
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__SIMPLE_VALUE:
        setSimpleValue((String)newValue);
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
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__ASTRIUM_TIME:
        setAstriumTime(ASTRIUM_TIME_EDEFAULT);
        return;
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__VALUE:
        setValue((Atom)null);
        return;
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__SIMPLE_VALUE:
        setSimpleValue(SIMPLE_VALUE_EDEFAULT);
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
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__ASTRIUM_TIME:
        return ASTRIUM_TIME_EDEFAULT == null ? astriumTime != null : !ASTRIUM_TIME_EDEFAULT.equals(astriumTime);
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__VALUE:
        return value != null;
      case SpellDatabasePackage.ASTRIUM_HEADER_ENTRY__SIMPLE_VALUE:
        return SIMPLE_VALUE_EDEFAULT == null ? simpleValue != null : !SIMPLE_VALUE_EDEFAULT.equals(simpleValue);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", astriumTime: ");
    result.append(astriumTime);
    result.append(", simpleValue: ");
    result.append(simpleValue);
    result.append(')');
    return result.toString();
  }

} //AstriumHeaderEntryImpl
