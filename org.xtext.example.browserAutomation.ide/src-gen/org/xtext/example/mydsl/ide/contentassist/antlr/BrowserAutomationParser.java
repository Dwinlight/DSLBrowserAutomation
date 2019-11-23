/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalBrowserAutomationParser;
import org.xtext.example.mydsl.services.BrowserAutomationGrammarAccess;

public class BrowserAutomationParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(BrowserAutomationGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, BrowserAutomationGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getFindAccess().getAlternatives_4(), "rule__Find__Alternatives_4");
			builder.put(grammarAccess.getFindAccess().getAlternatives_5(), "rule__Find__Alternatives_5");
			builder.put(grammarAccess.getClickAccess().getAlternatives_4(), "rule__Click__Alternatives_4");
			builder.put(grammarAccess.getClickAccess().getAlternatives_5(), "rule__Click__Alternatives_5");
			builder.put(grammarAccess.getSetAccess().getAlternatives_2(), "rule__Set__Alternatives_2");
			builder.put(grammarAccess.getSetAccess().getAlternatives_5(), "rule__Set__Alternatives_5");
			builder.put(grammarAccess.getSetAccess().getAlternatives_6(), "rule__Set__Alternatives_6");
			builder.put(grammarAccess.getAffectationAccess().getAlternatives_2(), "rule__Affectation__Alternatives_2");
			builder.put(grammarAccess.getAffectationAccess().getAlternatives_2_0_4(), "rule__Affectation__Alternatives_2_0_4");
			builder.put(grammarAccess.getAffectationAccess().getAlternatives_2_0_5(), "rule__Affectation__Alternatives_2_0_5");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getLaunchAccess().getGroup(), "rule__Launch__Group__0");
			builder.put(grammarAccess.getFindAccess().getGroup(), "rule__Find__Group__0");
			builder.put(grammarAccess.getClickAccess().getGroup(), "rule__Click__Group__0");
			builder.put(grammarAccess.getSetAccess().getGroup(), "rule__Set__Group__0");
			builder.put(grammarAccess.getAffectationAccess().getGroup(), "rule__Affectation__Group__0");
			builder.put(grammarAccess.getAffectationAccess().getGroup_2_0(), "rule__Affectation__Group_2_0__0");
			builder.put(grammarAccess.getGreetingAccess().getGroup(), "rule__Greeting__Group__0");
			builder.put(grammarAccess.getModelAccess().getTisi1Assignment_0(), "rule__Model__Tisi1Assignment_0");
			builder.put(grammarAccess.getModelAccess().getTisi2Assignment_1(), "rule__Model__Tisi2Assignment_1");
			builder.put(grammarAccess.getModelAccess().getTisi3Assignment_2(), "rule__Model__Tisi3Assignment_2");
			builder.put(grammarAccess.getModelAccess().getTisi4Assignment_3(), "rule__Model__Tisi4Assignment_3");
			builder.put(grammarAccess.getModelAccess().getTisi5Assignment_4(), "rule__Model__Tisi5Assignment_4");
			builder.put(grammarAccess.getModelAccess().getTisi6Assignment_5(), "rule__Model__Tisi6Assignment_5");
			builder.put(grammarAccess.getLaunchAccess().getUAssignment_1(), "rule__Launch__UAssignment_1");
			builder.put(grammarAccess.getLaunchAccess().getBAssignment_3(), "rule__Launch__BAssignment_3");
			builder.put(grammarAccess.getFindAccess().getCAssignment_1(), "rule__Find__CAssignment_1");
			builder.put(grammarAccess.getFindAccess().getAAssignment_3(), "rule__Find__AAssignment_3");
			builder.put(grammarAccess.getFindAccess().getSAssignment_5_0(), "rule__Find__SAssignment_5_0");
			builder.put(grammarAccess.getFindAccess().getVAssignment_5_1(), "rule__Find__VAssignment_5_1");
			builder.put(grammarAccess.getClickAccess().getCAssignment_1(), "rule__Click__CAssignment_1");
			builder.put(grammarAccess.getClickAccess().getAAssignment_3(), "rule__Click__AAssignment_3");
			builder.put(grammarAccess.getClickAccess().getSAssignment_5_0(), "rule__Click__SAssignment_5_0");
			builder.put(grammarAccess.getClickAccess().getVAssignment_5_1(), "rule__Click__VAssignment_5_1");
			builder.put(grammarAccess.getSetAccess().getAAssignment_1(), "rule__Set__AAssignment_1");
			builder.put(grammarAccess.getSetAccess().getVAssignment_2_1(), "rule__Set__VAssignment_2_1");
			builder.put(grammarAccess.getSetAccess().getA1Assignment_4(), "rule__Set__A1Assignment_4");
			builder.put(grammarAccess.getSetAccess().getS1Assignment_6_0(), "rule__Set__S1Assignment_6_0");
			builder.put(grammarAccess.getSetAccess().getVAssignment_6_1(), "rule__Set__VAssignment_6_1");
			builder.put(grammarAccess.getAffectationAccess().getAAssignment_2_0_1(), "rule__Affectation__AAssignment_2_0_1");
			builder.put(grammarAccess.getAffectationAccess().getA2Assignment_2_0_3(), "rule__Affectation__A2Assignment_2_0_3");
			builder.put(grammarAccess.getAffectationAccess().getVAssignment_2_0_5_1(), "rule__Affectation__VAssignment_2_0_5_1");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment(), "rule__Variable__NameAssignment");
			builder.put(grammarAccess.getVarRefAccess().getVarAssignment(), "rule__VarRef__VarAssignment");
			builder.put(grammarAccess.getComposantAccess().getNameAssignment(), "rule__Composant__NameAssignment");
			builder.put(grammarAccess.getAttributAccess().getNameAssignment(), "rule__Attribut__NameAssignment");
			builder.put(grammarAccess.getContentAccess().getContenuAssignment(), "rule__Content__ContenuAssignment");
			builder.put(grammarAccess.getBrowserAccess().getNameAssignment(), "rule__Browser__NameAssignment");
			builder.put(grammarAccess.getUrlAccess().getNameAssignment(), "rule__Url__NameAssignment");
			builder.put(grammarAccess.getGreetingAccess().getNameAssignment_1(), "rule__Greeting__NameAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private BrowserAutomationGrammarAccess grammarAccess;

	@Override
	protected InternalBrowserAutomationParser createParser() {
		InternalBrowserAutomationParser result = new InternalBrowserAutomationParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public BrowserAutomationGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BrowserAutomationGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
