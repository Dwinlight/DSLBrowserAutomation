/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.browserAutomation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Find</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Find#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Find#getA <em>A</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Find#getV <em>V</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getFind()
 * @model
 * @generated
 */
public interface Find extends EObject
{
  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(Composant)
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getFind_C()
   * @model containment="true"
   * @generated
   */
  Composant getC();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Find#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(Composant value);

  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(Attribut)
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getFind_A()
   * @model containment="true"
   * @generated
   */
  Attribut getA();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Find#getA <em>A</em>}' containment reference.
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
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getFind_V()
   * @model containment="true"
   * @generated
   */
  VarRef getV();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Find#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(VarRef value);

} // Find