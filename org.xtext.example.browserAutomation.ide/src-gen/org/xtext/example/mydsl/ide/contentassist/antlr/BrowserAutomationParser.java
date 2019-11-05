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
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getLaunchAccess().getGroup(), "rule__Launch__Group__0");
			builder.put(grammarAccess.getClickAccess().getGroup(), "rule__Click__Group__0");
			builder.put(grammarAccess.getGreetingAccess().getGroup(), "rule__Greeting__Group__0");
			builder.put(grammarAccess.getModelAccess().getTisiAssignment_0(), "rule__Model__TisiAssignment_0");
			builder.put(grammarAccess.getModelAccess().getTisiAssignment_1(), "rule__Model__TisiAssignment_1");
			builder.put(grammarAccess.getLaunchAccess().getUAssignment_1(), "rule__Launch__UAssignment_1");
			builder.put(grammarAccess.getLaunchAccess().getBAssignment_3(), "rule__Launch__BAssignment_3");
			builder.put(grammarAccess.getClickAccess().getCAssignment_1(), "rule__Click__CAssignment_1");
			builder.put(grammarAccess.getClickAccess().getAAssignment_3(), "rule__Click__AAssignment_3");
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
