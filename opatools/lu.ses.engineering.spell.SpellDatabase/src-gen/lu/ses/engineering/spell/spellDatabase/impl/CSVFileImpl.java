/**
 */
package lu.ses.engineering.spell.spellDatabase.impl;

import java.util.Collection;

import lu.ses.engineering.spell.spellDatabase.CSVEntry;
import lu.ses.engineering.spell.spellDatabase.CSVFile;
import lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSV File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.impl.CSVFileImpl#getCsvEntries <em>Csv Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CSVFileImpl extends SpellDatabaseImpl implements CSVFile
{
  /**
   * The cached value of the '{@link #getCsvEntries() <em>Csv Entries</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCsvEntries()
   * @generated
   * @ordered
   */
  protected EList<CSVEntry> csvEntries;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CSVFileImpl()
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
    return SpellDatabasePackage.Literals.CSV_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CSVEntry> getCsvEntries()
  {
    if (csvEntries == null)
    {
      csvEntries = new EObjectContainmentEList<CSVEntry>(CSVEntry.class, this, SpellDatabasePackage.CSV_FILE__CSV_ENTRIES);
    }
    return csvEntries;
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
      case SpellDatabasePackage.CSV_FILE__CSV_ENTRIES:
        return ((InternalEList<?>)getCsvEntries()).basicRemove(otherEnd, msgs);
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
      case SpellDatabasePackage.CSV_FILE__CSV_ENTRIES:
        return getCsvEntries();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SpellDatabasePackage.CSV_FILE__CSV_ENTRIES:
        getCsvEntries().clear();
        getCsvEntries().addAll((Collection<? extends CSVEntry>)newValue);
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
      case SpellDatabasePackage.CSV_FILE__CSV_ENTRIES:
        getCsvEntries().clear();
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
      case SpellDatabasePackage.CSV_FILE__CSV_ENTRIES:
        return csvEntries != null && !csvEntries.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CSVFileImpl
