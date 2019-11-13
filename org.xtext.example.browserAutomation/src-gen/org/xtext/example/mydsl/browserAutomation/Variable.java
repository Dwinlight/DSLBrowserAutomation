/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.browserAutomation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Variable#getA <em>A</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Variable#getA2 <em>A2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Variable#getV <em>V</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Variable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends Affectation
{
  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference.
   * @see #setA(Attribut)
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getVariable_A()
   * @model containment="true"
   * @generated
   */
  Attribut getA();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Variable#getA <em>A</em>}' containment reference.
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
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getVariable_A2()
   * @model containment="true"
   * @generated
   */
  Attribut getA2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Variable#getA2 <em>A2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>A2</em>' containment reference.
   * @see #getA2()
   * @generated
   */
  void setA2(Attribut value);

  /**
   * Returns the value of the '<em><b>V</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>V</em>' containment reference.
   * @see #setV(VarRef)
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getVariable_V()
   * @model containment="true"
   * @generated
   */
  VarRef getV();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Variable#getV <em>V</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>V</em>' containment reference.
   * @see #getV()
   * @generated
   */
  void setV(VarRef value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.browserAutomation.Variable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Variable