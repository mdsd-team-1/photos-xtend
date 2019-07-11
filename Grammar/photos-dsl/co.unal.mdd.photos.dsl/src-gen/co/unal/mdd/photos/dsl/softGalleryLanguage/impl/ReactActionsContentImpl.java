/**
 * generated by Xtext 2.18.0
 */
package co.unal.mdd.photos.dsl.softGalleryLanguage.impl;

import co.unal.mdd.photos.dsl.softGalleryLanguage.ReactActionsContent;
import co.unal.mdd.photos.dsl.softGalleryLanguage.ReactServicesRelation;
import co.unal.mdd.photos.dsl.softGalleryLanguage.SoftGalleryLanguagePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>React Actions Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.mdd.photos.dsl.softGalleryLanguage.impl.ReactActionsContentImpl#getReactrelcontent <em>Reactrelcontent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactActionsContentImpl extends MinimalEObjectImpl.Container implements ReactActionsContent
{
  /**
   * The cached value of the '{@link #getReactrelcontent() <em>Reactrelcontent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReactrelcontent()
   * @generated
   * @ordered
   */
  protected EList<ReactServicesRelation> reactrelcontent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReactActionsContentImpl()
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
    return SoftGalleryLanguagePackage.Literals.REACT_ACTIONS_CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ReactServicesRelation> getReactrelcontent()
  {
    if (reactrelcontent == null)
    {
      reactrelcontent = new EObjectContainmentEList<ReactServicesRelation>(ReactServicesRelation.class, this, SoftGalleryLanguagePackage.REACT_ACTIONS_CONTENT__REACTRELCONTENT);
    }
    return reactrelcontent;
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
      case SoftGalleryLanguagePackage.REACT_ACTIONS_CONTENT__REACTRELCONTENT:
        return ((InternalEList<?>)getReactrelcontent()).basicRemove(otherEnd, msgs);
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
      case SoftGalleryLanguagePackage.REACT_ACTIONS_CONTENT__REACTRELCONTENT:
        return getReactrelcontent();
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
      case SoftGalleryLanguagePackage.REACT_ACTIONS_CONTENT__REACTRELCONTENT:
        getReactrelcontent().clear();
        getReactrelcontent().addAll((Collection<? extends ReactServicesRelation>)newValue);
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
      case SoftGalleryLanguagePackage.REACT_ACTIONS_CONTENT__REACTRELCONTENT:
        getReactrelcontent().clear();
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
      case SoftGalleryLanguagePackage.REACT_ACTIONS_CONTENT__REACTRELCONTENT:
        return reactrelcontent != null && !reactrelcontent.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ReactActionsContentImpl
