/**
 */
package lu.ses.engineering.spell.refactoring.refactoringDefinition.impl;

import lu.ses.engineering.spell.refactoring.refactoringDefinition.RefactoringDefinitionPackage;
import lu.ses.engineering.spell.refactoring.refactoringDefinition.argRefactor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>arg Refactor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.argRefactorImpl#getMnem <em>Mnem</em>}</li>
 *   <li>{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.argRefactorImpl#getRaw <em>Raw</em>}</li>
 * </ul>
 *
 * @generated
 */
public class argRefactorImpl extends MinimalEObjectImpl.Container implements argRefactor
{
  /**
   * The default value of the '{@link #getMnem() <em>Mnem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMnem()
   * @generated
   * @ordered
   */
  protected static final String MNEM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMnem() <em>Mnem</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMnem()
   * @generated
   * @ordered
   */
  protected String mnem = MNEM_EDEFAULT;

  /**
   * The default value of the '{@link #getRaw() <em>Raw</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRaw()
   * @generated
   * @ordered
   */
  protected static final String RAW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRaw() <em>Raw</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRaw()
   * @generated
   * @ordered
   */
  protected String raw = RAW_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected argRefactorImpl()
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
    return RefactoringDefinitionPackage.Literals.ARG_REFACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMnem()
  {
    return mnem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMnem(String newMnem)
  {
    String oldMnem = mnem;
    mnem = newMnem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDefinitionPackage.ARG_REFACTOR__MNEM, oldMnem, mnem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRaw()
  {
    return raw;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRaw(String newRaw)
  {
    String oldRaw = raw;
    raw = newRaw;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RefactoringDefinitionPackage.ARG_REFACTOR__RAW, oldRaw, raw));
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
      case RefactoringDefinitionPackage.ARG_REFACTOR__MNEM:
        return getMnem();
      case RefactoringDefinitionPackage.ARG_REFACTOR__RAW:
        return getRaw();
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
      case RefactoringDefinitionPackage.ARG_REFACTOR__MNEM:
        setMnem((String)newValue);
        return;
      case RefactoringDefinitionPackage.ARG_REFACTOR__RAW:
        setRaw((String)newValue);
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
      case RefactoringDefinitionPackage.ARG_REFACTOR__MNEM:
        setMnem(MNEM_EDEFAULT);
        return;
      case RefactoringDefinitionPackage.ARG_REFACTOR__RAW:
        setRaw(RAW_EDEFAULT);
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
      case RefactoringDefinitionPackage.ARG_REFACTOR__MNEM:
        return MNEM_EDEFAULT == null ? mnem != null : !MNEM_EDEFAULT.equals(mnem);
      case RefactoringDefinitionPackage.ARG_REFACTOR__RAW:
        return RAW_EDEFAULT == null ? raw != null : !RAW_EDEFAULT.equals(raw);
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (mnem: ");
    result.append(mnem);
    result.append(", raw: ");
    result.append(raw);
    result.append(')');
    return result.toString();
  }

} //argRefactorImpl
