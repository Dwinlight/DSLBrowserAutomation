/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.browserAutomation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Affectation#getV_name <em>Vname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Affectation#getA <em>A</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Affectation#getA2 <em>A2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Affectation#getS1 <em>S1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Affectation#getV <em>V</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getAffectation()
 * @model
 * @generated
 */
public interface Affectation extends EObject
{
  /**
   * Returns the value of the '<em><b>Vname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vname</em>' containment reference.
   * @see #setV_name(Variable)
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getAffectation_V_name()
   * @model containment="true"
   * @generated
   */
  Variable getV_name();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Affectation#getV_name <em>Vname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vname</em>' containment reference.
   * @see #getV_name()
   * @generated
   */
  void setV_name(Variable value);

  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(Attribut)
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getAffectation_A()
   * @model containment="true"
   * @generated
   */
  Attribut getA();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Affectation#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(Attribut value);

  /**
   * Returns the value of the '<em><b>A2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>A2</em>' containment reference.
   * @see #setA2(Attribut)
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getAffectation_A2()
   * @model containment="true"
   * @generated
   */
  Attribut getA2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Affectation#getA2 <em>A2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A2</em>' containment reference.
   * @see #getA2()
   * @generated
   */
  void setA2(Attribut value);

  /**
   * Returns the value of the '<em><b>S1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>S1</em>' attribute.
   * @see #setS1(String)
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getAffectation_S1()
   * @model
   * @generated
   */
  String getS1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Affectation#getS1 <em>S1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S1</em>' attribute.
   * @see #getS1()
   * @generated
   */
  void setS1(String value);

  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(VarRef)
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getAffectation_V()
   * @model containment="true"
   * @generated
   */
  VarRef getV();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Affectation#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(VarRef value);

} // Affectation
