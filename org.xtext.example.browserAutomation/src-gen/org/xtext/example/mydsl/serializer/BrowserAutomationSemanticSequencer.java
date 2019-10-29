/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.browserAutomation.Attribut;
import org.xtext.example.mydsl.browserAutomation.Browser;
import org.xtext.example.mydsl.browserAutomation.BrowserAutomationPackage;
import org.xtext.example.mydsl.browserAutomation.Greeting;
import org.xtext.example.mydsl.browserAutomation.Model;
import org.xtext.example.mydsl.browserAutomation.Test;
import org.xtext.example.mydsl.browserAutomation.Url;
import org.xtext.example.mydsl.services.BrowserAutomationGrammarAccess;

@SuppressWarnings("all")
public class BrowserAutomationSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private BrowserAutomationGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == BrowserAutomationPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case BrowserAutomationPackage.ATTRIBUT:
				sequence_Attribut(context, (Attribut) semanticObject); 
				return; 
			case BrowserAutomationPackage.BROWSER:
				sequence_Browser(context, (Browser) semanticObject); 
				return; 
			case BrowserAutomationPackage.GREETING:
				sequence_Greeting(context, (Greeting) semanticObject); 
				return; 
			case BrowserAutomationPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case BrowserAutomationPackage.TEST:
				sequence_Test(context, (Test) semanticObject); 
				return; 
			case BrowserAutomationPackage.URL:
				sequence_Url(context, (Url) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Attribut returns Attribut
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Attribut(ISerializationContext context, Attribut semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.ATTRIBUT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.ATTRIBUT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Browser returns Browser
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Browser(ISerializationContext context, Browser semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.BROWSER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.BROWSER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBrowserAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Greeting returns Greeting
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Greeting(ISerializationContext context, Greeting semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.GREETING__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.GREETING__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     tisi+=Test+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Test returns Test
	 *
	 * Constraint:
	 *     (b=Browser u=Url a1=Attribut a2=Attribut)
	 */
	protected void sequence_Test(ISerializationContext context, Test semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.TEST__B) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.TEST__B));
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.TEST__U) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.TEST__U));
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.TEST__A1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.TEST__A1));
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.TEST__A2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.TEST__A2));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTestAccess().getBBrowserParserRuleCall_1_0(), semanticObject.getB());
		feeder.accept(grammarAccess.getTestAccess().getUUrlParserRuleCall_3_0(), semanticObject.getU());
		feeder.accept(grammarAccess.getTestAccess().getA1AttributParserRuleCall_6_0(), semanticObject.getA1());
		feeder.accept(grammarAccess.getTestAccess().getA2AttributParserRuleCall_9_0(), semanticObject.getA2());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Url returns Url
	 *
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_Url(ISerializationContext context, Url semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, BrowserAutomationPackage.Literals.URL__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, BrowserAutomationPackage.Literals.URL__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUrlAccess().getNameSTRINGTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}