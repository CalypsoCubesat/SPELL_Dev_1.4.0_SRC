/**
 */
package lu.ses.engineering.spell.refactoring.refactoringDefinition.impl;

import lu.ses.engineering.spell.refactoring.refactoringDefinition.RefactoringDefinitionPackage;
import lu.ses.engineering.spell.refactoring.refactoringDefinition.Refactorings;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refactorings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lu.ses.engineering.spell.refactoring.refactoringDefinition.impl.RefactoringsImpl#getRefactorings <em>Refactorings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefactoringsImpl extends MinimalEObjectImpl.Container implements Refactorings
{
  /**
   * The cached value of the '{@link #getRefactorings() <em>Refactorings</em>}' map.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefactorings()
   * @generated
   * @ordered
   */
  protected EMap<String, String> refactorings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefactoringsImpl()
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
    return RefactoringDefinitionPackage.Literals.REFACTORINGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EMap<String, String> getRefactorings()
  {
    if (refactorings == null)
    {
      refactorings = new EcoreEMap<String,String>(RefactoringDefinitionPackage.Literals.REFACTOR_MAP_ENTRY, refactorMapEntryImpl.class, this, RefactoringDefinitionPackage.REFACTORINGS__REFACTORINGS);
    }
    return refactorings;
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
      case RefactoringDefinitionPackage.REFACTORINGS__REFACTORINGS:
        return ((InternalEList<?>)getRefactorings()).basicRemove(otherEnd, msgs);
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
      case RefactoringDefinitionPackage.REFACTORINGS__REFACTORINGS:
        if (coreType) return getRefactorings();
        else return getRefactorings().map();
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
      case RefactoringDefinitionPackage.REFACTORINGS__REFACTORINGS:
        ((EStructuralFeature.Setting)getRefactorings()).set(newValue);
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
      case RefactoringDefinitionPackage.REFACTORINGS__REFACTORINGS:
        getRefactorings().clear();
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
      case RefactoringDefinitionPackage.REFACTORINGS__REFACTORINGS:
        return refactorings != null && !refactorings.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RefactoringsImpl
