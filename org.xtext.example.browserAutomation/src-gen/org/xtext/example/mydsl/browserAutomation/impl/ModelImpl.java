/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.browserAutomation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.browserAutomation.Affectation;
import org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage;
import org.xtext.example.mydsl.browserAutomation.Click;
import org.xtext.example.mydsl.browserAutomation.Find;
import org.xtext.example.mydsl.browserAutomation.Launch;
import org.xtext.example.mydsl.browserAutomation.Model;
import org.xtext.example.mydsl.browserAutomation.Set;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.impl.ModelImpl#getTisi1 <em>Tisi1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.impl.ModelImpl#getTisi2 <em>Tisi2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.impl.ModelImpl#getTisi3 <em>Tisi3</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.impl.ModelImpl#getTisi4 <em>Tisi4</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.impl.ModelImpl#getTisi5 <em>Tisi5</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.impl.ModelImpl#getTisi6 <em>Tisi6</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getTisi1() <em>Tisi1</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTisi1()
   * @generated
   * @ordered
   */
  protected EList<Launch> tisi1;

  /**
   * The cached value of the '{@link #getTisi2() <em>Tisi2</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTisi2()
   * @generated
   * @ordered
   */
  protected EList<Affectation> tisi2;

  /**
   * The cached value of the '{@link #getTisi3() <em>Tisi3</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTisi3()
   * @generated
   * @ordered
   */
  protected EList<Launch> tisi3;

  /**
   * The cached value of the '{@link #getTisi4() <em>Tisi4</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTisi4()
   * @generated
   * @ordered
   */
  protected EList<Set> tisi4;

  /**
   * The cached value of the '{@link #getTisi5() <em>Tisi5</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTisi5()
   * @generated
   * @ordered
   */
  protected EList<Click> tisi5;

  /**
   * The cached value of the '{@link #getTisi6() <em>Tisi6</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTisi6()
   * @generated
   * @ordered
   */
  protected EList<Find> tisi6;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return BrowserAutomationPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Launch> getTisi1()
  {
    if (tisi1 == null)
    {
      tisi1 = new EObjectContainmentEList<Launch>(Launch.class, this, BrowserAutomationPackage.MODEL__TISI1);
    }
    return tisi1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Affectation> getTisi2()
  {
    if (tisi2 == null)
    {
      tisi2 = new EObjectContainmentEList<Affectation>(Affectation.class, this, BrowserAutomationPackage.MODEL__TISI2);
    }
    return tisi2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Launch> getTisi3()
  {
    if (tisi3 == null)
    {
      tisi3 = new EObjectContainmentEList<Launch>(Launch.class, this, BrowserAutomationPackage.MODEL__TISI3);
    }
    return tisi3;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Set> getTisi4()
  {
    if (tisi4 == null)
    {
      tisi4 = new EObjectContainmentEList<Set>(Set.class, this, BrowserAutomationPackage.MODEL__TISI4);
    }
    return tisi4;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Click> getTisi5()
  {
    if (tisi5 == null)
    {
      tisi5 = new EObjectContainmentEList<Click>(Click.class, this, BrowserAutomationPackage.MODEL__TISI5);
    }
    return tisi5;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Find> getTisi6()
  {
    if (tisi6 == null)
    {
      tisi6 = new EObjectContainmentEList<Find>(Find.class, this, BrowserAutomationPackage.MODEL__TISI6);
    }
    return tisi6;
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
      case BrowserAutomationPackage.MODEL__TISI1:
        return ((InternalEList<?>)getTisi1()).basicRemove(otherEnd, msgs);
      case BrowserAutomationPackage.MODEL__TISI2:
        return ((InternalEList<?>)getTisi2()).basicRemove(otherEnd, msgs);
      case BrowserAutomationPackage.MODEL__TISI3:
        return ((InternalEList<?>)getTisi3()).basicRemove(otherEnd, msgs);
      case BrowserAutomationPackage.MODEL__TISI4:
        return ((InternalEList<?>)getTisi4()).basicRemove(otherEnd, msgs);
      case BrowserAutomationPackage.MODEL__TISI5:
        return ((InternalEList<?>)getTisi5()).basicRemove(otherEnd, msgs);
      case BrowserAutomationPackage.MODEL__TISI6:
        return ((InternalEList<?>)getTisi6()).basicRemove(otherEnd, msgs);
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
      case BrowserAutomationPackage.MODEL__TISI1:
        return getTisi1();
      case BrowserAutomationPackage.MODEL__TISI2:
        return getTisi2();
      case BrowserAutomationPackage.MODEL__TISI3:
        return getTisi3();
      case BrowserAutomationPackage.MODEL__TISI4:
        return getTisi4();
      case BrowserAutomationPackage.MODEL__TISI5:
        return getTisi5();
      case BrowserAutomationPackage.MODEL__TISI6:
        return getTisi6();
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
      case BrowserAutomationPackage.MODEL__TISI1:
        getTisi1().clear();
        getTisi1().addAll((Collection<? extends Launch>)newValue);
        return;
      case BrowserAutomationPackage.MODEL__TISI2:
        getTisi2().clear();
        getTisi2().addAll((Collection<? extends Affectation>)newValue);
        return;
      case BrowserAutomationPackage.MODEL__TISI3:
        getTisi3().clear();
        getTisi3().addAll((Collection<? extends Launch>)newValue);
        return;
      case BrowserAutomationPackage.MODEL__TISI4:
        getTisi4().clear();
        getTisi4().addAll((Collection<? extends Set>)newValue);
        return;
      case BrowserAutomationPackage.MODEL__TISI5:
        getTisi5().clear();
        getTisi5().addAll((Collection<? extends Click>)newValue);
        return;
      case BrowserAutomationPackage.MODEL__TISI6:
        getTisi6().clear();
        getTisi6().addAll((Collection<? extends Find>)newValue);
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
      case BrowserAutomationPackage.MODEL__TISI1:
        getTisi1().clear();
        return;
      case BrowserAutomationPackage.MODEL__TISI2:
        getTisi2().clear();
        return;
      case BrowserAutomationPackage.MODEL__TISI3:
        getTisi3().clear();
        return;
      case BrowserAutomationPackage.MODEL__TISI4:
        getTisi4().clear();
        return;
      case BrowserAutomationPackage.MODEL__TISI5:
        getTisi5().clear();
        return;
      case BrowserAutomationPackage.MODEL__TISI6:
        getTisi6().clear();
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
      case BrowserAutomationPackage.MODEL__TISI1:
        return tisi1 != null && !tisi1.isEmpty();
      case BrowserAutomationPackage.MODEL__TISI2:
        return tisi2 != null && !tisi2.isEmpty();
      case BrowserAutomationPackage.MODEL__TISI3:
        return tisi3 != null && !tisi3.isEmpty();
      case BrowserAutomationPackage.MODEL__TISI4:
        return tisi4 != null && !tisi4.isEmpty();
      case BrowserAutomationPackage.MODEL__TISI5:
        return tisi5 != null && !tisi5.isEmpty();
      case BrowserAutomationPackage.MODEL__TISI6:
        return tisi6 != null && !tisi6.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
