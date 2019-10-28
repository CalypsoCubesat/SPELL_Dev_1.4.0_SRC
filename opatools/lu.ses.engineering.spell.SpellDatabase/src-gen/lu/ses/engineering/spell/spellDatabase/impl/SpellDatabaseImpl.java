/**
 */
package lu.ses.engineering.spell.spellDatabase.impl;

import java.util.Collection;

import lu.ses.engineering.spell.spellDatabase.DatabaseEntry;
import lu.ses.engineering.spell.spellDatabase.SpellDatabase;
import lu.ses.engineering.spell.spellDatabase.SpellDatabasePackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spell Database</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.spellDatabase.impl.SpellDatabaseImpl#getDatabaseEntry <em>Database Entry</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpellDatabaseImpl extends MinimalEObjectImpl.Container implements SpellDatabase
{
  /**
   * The cached value of the '{@link #getDatabaseEntry() <em>Database Entry</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatabaseEntry()
   * @generated
   * @ordered
   */
  protected EList<DatabaseEntry> databaseEntry;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpellDatabaseImpl()
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
    return SpellDatabasePackage.Literals.SPELL_DATABASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DatabaseEntry> getDatabaseEntry()
  {
    if (databaseEntry == null)
    {
      databaseEntry = new EObjectContainmentEList<DatabaseEntry>(DatabaseEntry.class, this, SpellDatabasePackage.SPELL_DATABASE__DATABASE_ENTRY);
    }
    return databaseEntry;
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
      case SpellDatabasePackage.SPELL_DATABASE__DATABASE_ENTRY:
        return ((InternalEList<?>)getDatabaseEntry()).basicRemove(otherEnd, msgs);
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
      case SpellDatabasePackage.SPELL_DATABASE__DATABASE_ENTRY:
        return getDatabaseEntry();
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
      case SpellDatabasePackage.SPELL_DATABASE__DATABASE_ENTRY:
        getDatabaseEntry().clear();
        getDatabaseEntry().addAll((Collection<? extends DatabaseEntry>)newValue);
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
      case SpellDatabasePackage.SPELL_DATABASE__DATABASE_ENTRY:
        getDatabaseEntry().clear();
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
      case SpellDatabasePackage.SPELL_DATABASE__DATABASE_ENTRY:
        return databaseEntry != null && !databaseEntry.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SpellDatabaseImpl
