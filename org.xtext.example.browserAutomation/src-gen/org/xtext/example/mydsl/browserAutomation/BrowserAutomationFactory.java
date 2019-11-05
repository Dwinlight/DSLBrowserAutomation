/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.browserAutomation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage
 * @generated
 */
public interface BrowserAutomationFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BrowserAutomationFactory eINSTANCE = org.xtext.example.mydsl.browserAutomation.impl.BrowserAutomationFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Launch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Launch</em>'.
   * @generated
   */
  Launch createLaunch();

  /**
   * Returns a new object of class '<em>Click</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Click</em>'.
   * @generated
   */
  Click createClick();

  /**
   * Returns a new object of class '<em>Composant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composant</em>'.
   * @generated
   */
  Composant createComposant();

  /**
   * Returns a new object of class '<em>Attribut</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribut</em>'.
   * @generated
   */
  Attribut createAttribut();

  /**
   * Returns a new object of class '<em>Content</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Content</em>'.
   * @generated
   */
  Content createContent();

  /**
   * Returns a new object of class '<em>Browser</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Browser</em>'.
   * @generated
   */
  Browser createBrowser();

  /**
   * Returns a new object of class '<em>Url</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Url</em>'.
   * @generated
   */
  Url createUrl();

  /**
   * Returns a new object of class '<em>Greeting</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Greeting</em>'.
   * @generated
   */
  Greeting createGreeting();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BrowserAutomationPackage getBrowserAutomationPackage();

} //BrowserAutomationFactory
