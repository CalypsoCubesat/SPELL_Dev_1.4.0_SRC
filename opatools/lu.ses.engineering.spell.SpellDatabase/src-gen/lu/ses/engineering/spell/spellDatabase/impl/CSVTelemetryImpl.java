/**
 */
package lu.ses.engineering.spell.spellDatabase.impl;

import lu.ses.engineering.spell.spellDatabase.CSVTelemetry;
import lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage;
import lu.ses.engineering.spell.spellDatabase.TCArgs;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSV Telemetry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.impl.CSVTelemetryImpl#getTmArg <em>Tm Arg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSVTelemetryImpl extends CSVEntryImpl implements CSVTelemetry
{
  /**
   * The cached value of the '{@link #getTmArg() <em>Tm Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTmArg()
   * @generated
   * @ordered
   */
  protected TCArgs tmArg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CSVTelemetryImpl()
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
    return SpellDatabasePackage.Literals.CSV_TELEMETRY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TCArgs getTmArg()
  {
    return tmArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTmArg(TCArgs newTmArg, NotificationChain msgs)
  {
    TCArgs oldTmArg = tmArg;
    tmArg = newTmArg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SpellDatabasePackage.CSV_TELEMETRY__TM_ARG, oldTmArg, newTmArg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTmArg(TCArgs newTmArg)
  {
    if (newTmArg != tmArg)
    {
      NotificationChain msgs = null;
      if (tmArg != null)
        msgs = ((InternalEObject)tmArg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SpellDatabasePackage.CSV_TELEMETRY__TM_ARG, null, msgs);
      if (newTmArg != null)
        msgs = ((InternalEObject)newTmArg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SpellDatabasePackage.CSV_TELEMETRY__TM_ARG, null, msgs);
      msgs = basicSetTmArg(newTmArg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SpellDatabasePackage.CSV_TELEMETRY__TM_ARG, newTmArg, newTmArg));
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
      case SpellDatabasePackage.CSV_TELEMETRY__TM_ARG:
        return basicSetTmArg(null, msgs);
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
      case SpellDatabasePackage.CSV_TELEMETRY__TM_ARG:
        return getTmArg();
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
      case SpellDatabasePackage.CSV_TELEMETRY__TM_ARG:
        setTmArg((TCArgs)newValue);
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
      case SpellDatabasePackage.CSV_TELEMETRY__TM_ARG:
        setTmArg((TCArgs)null);
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
      case SpellDatabasePackage.CSV_TELEMETRY__TM_ARG:
        return tmArg != null;
    }
    return super.eIsSet(featureID);
  }

} //CSVTelemetryImpl
