/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.browserAutomation.ui.internal.BrowserAutomationActivator;

public class BrowserAutomationUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return BrowserAutomationActivator.getInstance().getInjector("org.xtext.example.mydsl.BrowserAutomation");
	}

}