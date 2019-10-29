/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.example.mydsl.BrowserAutomationRuntimeModule
import org.xtext.example.mydsl.BrowserAutomationStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class BrowserAutomationIdeSetup extends BrowserAutomationStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new BrowserAutomationRuntimeModule, new BrowserAutomationIdeModule))
	}
	
}