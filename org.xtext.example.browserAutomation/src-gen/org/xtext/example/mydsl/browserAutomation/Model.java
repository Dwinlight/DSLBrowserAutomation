/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.browserAutomation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.browserAutomation.Model#getTisi <em>Tisi</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Tisi</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.browserAutomation.Test}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tisi</em>' containment reference list.
   * @see org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage#getModel_Tisi()
   * @model containment="true"
   * @generated
   */
  EList<Test> getTisi();

} // Model