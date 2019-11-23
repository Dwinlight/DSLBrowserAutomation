/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.browserAutomation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Set#getA <em>A</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Set#getV <em>V</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Set#getA1 <em>A1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Set#getS1 <em>S1</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getSet()
 * @model
 * @generated
 */
public interface Set extends EObject
{
  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(Attribut)
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getSet_A()
   * @model containment="true"
   * @generated
   */
  Attribut getA();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Set#getA <em>A</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A</em>' containment reference.
   * @see #getA()
   * @generated
   */
  void setA(Attribut value);

  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(VarRef)
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getSet_V()
   * @model containment="true"
   * @generated
   */
  VarRef getV();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Set#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(VarRef value);

  /**
   * Returns the value of the '<em><b>A1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>A1</em>' containment reference.
   * @see #setA1(Attribut)
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getSet_A1()
   * @model containment="true"
   * @generated
   */
  Attribut getA1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Set#getA1 <em>A1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A1</em>' containment reference.
   * @see #getA1()
   * @generated
   */
  void setA1(Attribut value);

  /**
   * Returns the value of the '<em><b>S1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>S1</em>' attribute.
   * @see #setS1(String)
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getSet_S1()
   * @model
   * @generated
   */
  String getS1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Set#getS1 <em>S1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S1</em>' attribute.
   * @see #getS1()
   * @generated
   */
  void setS1(String value);

} // Set
