/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl;

import org.xtext.example.mydsl.BrowserAutomationStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class BrowserAutomationStandaloneSetup extends BrowserAutomationStandaloneSetupGenerated {
  public static void doSetup() {
    new BrowserAutomationStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
