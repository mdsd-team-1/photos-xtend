/**
 * generated by Xtext 2.17.1
 */
package co.unal.photos.softgallery.impl;

import co.unal.photos.softgallery.ComponentsLogic;
import co.unal.photos.softgallery.ComponentsUI;
import co.unal.photos.softgallery.ReactComponents;
import co.unal.photos.softgallery.SoftgalleryPackage;

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
 * An implementation of the model object '<em><b>React Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co.unal.photos.softgallery.impl.ReactComponentsImpl#getComponentslogic <em>Componentslogic</em>}</li>
 *   <li>{@link co.unal.photos.softgallery.impl.ReactComponentsImpl#getComponentsui <em>Componentsui</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactComponentsImpl extends MinimalEObjectImpl.Container implements ReactComponents
{
  /**
   * The cached value of the '{@link #getComponentslogic() <em>Componentslogic</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentslogic()
   * @generated
   * @ordered
   */
  protected EList<ComponentsLogic> componentslogic;

  /**
   * The cached value of the '{@link #getComponentsui() <em>Componentsui</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComponentsui()
   * @generated
   * @ordered
   */
  protected EList<ComponentsUI> componentsui;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReactComponentsImpl()
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
    return SoftgalleryPackage.Literals.REACT_COMPONENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ComponentsLogic> getComponentslogic()
  {
    if (componentslogic == null)
    {
      componentslogic = new EObjectContainmentEList<ComponentsLogic>(ComponentsLogic.class, this, SoftgalleryPackage.REACT_COMPONENTS__COMPONENTSLOGIC);
    }
    return componentslogic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ComponentsUI> getComponentsui()
  {
    if (componentsui == null)
    {
      componentsui = new EObjectContainmentEList<ComponentsUI>(ComponentsUI.class, this, SoftgalleryPackage.REACT_COMPONENTS__COMPONENTSUI);
    }
    return componentsui;
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
      case SoftgalleryPackage.REACT_COMPONENTS__COMPONENTSLOGIC:
        return ((InternalEList<?>)getComponentslogic()).basicRemove(otherEnd, msgs);
      case SoftgalleryPackage.REACT_COMPONENTS__COMPONENTSUI:
        return ((InternalEList<?>)getComponentsui()).basicRemove(otherEnd, msgs);
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
      case SoftgalleryPackage.REACT_COMPONENTS__COMPONENTSLOGIC:
        return getComponentslogic();
      case SoftgalleryPackage.REACT_COMPONENTS__COMPONENTSUI:
        return getComponentsui();
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
      case SoftgalleryPackage.REACT_COMPONENTS__COMPONENTSLOGIC:
        getComponentslogic().clear();
        getComponentslogic().addAll((Collection<? extends ComponentsLogic>)newValue);
        return;
      case SoftgalleryPackage.REACT_COMPONENTS__COMPONENTSUI:
        getComponentsui().clear();
        getComponentsui().addAll((Collection<? extends ComponentsUI>)newValue);
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
      case SoftgalleryPackage.REACT_COMPONENTS__COMPONENTSLOGIC:
        getComponentslogic().clear();
        return;
      case SoftgalleryPackage.REACT_COMPONENTS__COMPONENTSUI:
        getComponentsui().clear();
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
      case SoftgalleryPackage.REACT_COMPONENTS__COMPONENTSLOGIC:
        return componentslogic != null && !componentslogic.isEmpty();
      case SoftgalleryPackage.REACT_COMPONENTS__COMPONENTSUI:
        return componentsui != null && !componentsui.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ReactComponentsImpl