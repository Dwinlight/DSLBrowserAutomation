/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.BrowserAutomationRuntimeModule;
import org.xtext.example.mydsl.BrowserAutomationStandaloneSetup;
import org.xtext.example.mydsl.ide.BrowserAutomationIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class BrowserAutomationIdeSetup extends BrowserAutomationStandaloneSetup {
  @Override
  public Injector createInjector() {
    BrowserAutomationRuntimeModule _browserAutomationRuntimeModule = new BrowserAutomationRuntimeModule();
    BrowserAutomationIdeModule _browserAutomationIdeModule = new BrowserAutomationIdeModule();
    return Guice.createInjector(Modules2.mixin(_browserAutomationRuntimeModule, _browserAutomationIdeModule));
  }
}
