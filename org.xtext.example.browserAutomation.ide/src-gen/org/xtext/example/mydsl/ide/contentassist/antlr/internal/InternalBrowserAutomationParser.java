package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.BrowserAutomationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrowserAutomationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CONTAINS'", "'EQUALS'", "'GOTO'", "'ON'", "'FIND'", "'WHERE'", "'CLICK'", "'SET'", "'='", "'GET'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalBrowserAutomationParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBrowserAutomationParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBrowserAutomationParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBrowserAutomation.g"; }


    	private BrowserAutomationGrammarAccess grammarAccess;

    	public void setGrammarAccess(BrowserAutomationGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalBrowserAutomation.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:54:1: ( ruleModel EOF )
            // InternalBrowserAutomation.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBrowserAutomation.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalBrowserAutomation.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalBrowserAutomation.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalBrowserAutomation.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalBrowserAutomation.g:69:3: ( rule__Model__Group__0 )
            // InternalBrowserAutomation.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleLaunch"
    // InternalBrowserAutomation.g:78:1: entryRuleLaunch : ruleLaunch EOF ;
    public final void entryRuleLaunch() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:79:1: ( ruleLaunch EOF )
            // InternalBrowserAutomation.g:80:1: ruleLaunch EOF
            {
             before(grammarAccess.getLaunchRule()); 
            pushFollow(FOLLOW_1);
            ruleLaunch();

            state._fsp--;

             after(grammarAccess.getLaunchRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLaunch"


    // $ANTLR start "ruleLaunch"
    // InternalBrowserAutomation.g:87:1: ruleLaunch : ( ( rule__Launch__Group__0 ) ) ;
    public final void ruleLaunch() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:91:2: ( ( ( rule__Launch__Group__0 ) ) )
            // InternalBrowserAutomation.g:92:2: ( ( rule__Launch__Group__0 ) )
            {
            // InternalBrowserAutomation.g:92:2: ( ( rule__Launch__Group__0 ) )
            // InternalBrowserAutomation.g:93:3: ( rule__Launch__Group__0 )
            {
             before(grammarAccess.getLaunchAccess().getGroup()); 
            // InternalBrowserAutomation.g:94:3: ( rule__Launch__Group__0 )
            // InternalBrowserAutomation.g:94:4: rule__Launch__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Launch__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLaunchAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLaunch"


    // $ANTLR start "entryRuleFind"
    // InternalBrowserAutomation.g:103:1: entryRuleFind : ruleFind EOF ;
    public final void entryRuleFind() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:104:1: ( ruleFind EOF )
            // InternalBrowserAutomation.g:105:1: ruleFind EOF
            {
             before(grammarAccess.getFindRule()); 
            pushFollow(FOLLOW_1);
            ruleFind();

            state._fsp--;

             after(grammarAccess.getFindRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFind"


    // $ANTLR start "ruleFind"
    // InternalBrowserAutomation.g:112:1: ruleFind : ( ( rule__Find__Group__0 ) ) ;
    public final void ruleFind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:116:2: ( ( ( rule__Find__Group__0 ) ) )
            // InternalBrowserAutomation.g:117:2: ( ( rule__Find__Group__0 ) )
            {
            // InternalBrowserAutomation.g:117:2: ( ( rule__Find__Group__0 ) )
            // InternalBrowserAutomation.g:118:3: ( rule__Find__Group__0 )
            {
             before(grammarAccess.getFindAccess().getGroup()); 
            // InternalBrowserAutomation.g:119:3: ( rule__Find__Group__0 )
            // InternalBrowserAutomation.g:119:4: rule__Find__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Find__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFindAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFind"


    // $ANTLR start "entryRuleClick"
    // InternalBrowserAutomation.g:128:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:129:1: ( ruleClick EOF )
            // InternalBrowserAutomation.g:130:1: ruleClick EOF
            {
             before(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getClickRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalBrowserAutomation.g:137:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:141:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalBrowserAutomation.g:142:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalBrowserAutomation.g:142:2: ( ( rule__Click__Group__0 ) )
            // InternalBrowserAutomation.g:143:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalBrowserAutomation.g:144:3: ( rule__Click__Group__0 )
            // InternalBrowserAutomation.g:144:4: rule__Click__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleSet"
    // InternalBrowserAutomation.g:153:1: entryRuleSet : ruleSet EOF ;
    public final void entryRuleSet() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:154:1: ( ruleSet EOF )
            // InternalBrowserAutomation.g:155:1: ruleSet EOF
            {
             before(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            ruleSet();

            state._fsp--;

             after(grammarAccess.getSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalBrowserAutomation.g:162:1: ruleSet : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:166:2: ( ( ( rule__Set__Group__0 ) ) )
            // InternalBrowserAutomation.g:167:2: ( ( rule__Set__Group__0 ) )
            {
            // InternalBrowserAutomation.g:167:2: ( ( rule__Set__Group__0 ) )
            // InternalBrowserAutomation.g:168:3: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // InternalBrowserAutomation.g:169:3: ( rule__Set__Group__0 )
            // InternalBrowserAutomation.g:169:4: rule__Set__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleAffectation"
    // InternalBrowserAutomation.g:178:1: entryRuleAffectation : ruleAffectation EOF ;
    public final void entryRuleAffectation() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:179:1: ( ruleAffectation EOF )
            // InternalBrowserAutomation.g:180:1: ruleAffectation EOF
            {
             before(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_1);
            ruleAffectation();

            state._fsp--;

             after(grammarAccess.getAffectationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalBrowserAutomation.g:187:1: ruleAffectation : ( ( rule__Affectation__Group__0 ) ) ;
    public final void ruleAffectation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:191:2: ( ( ( rule__Affectation__Group__0 ) ) )
            // InternalBrowserAutomation.g:192:2: ( ( rule__Affectation__Group__0 ) )
            {
            // InternalBrowserAutomation.g:192:2: ( ( rule__Affectation__Group__0 ) )
            // InternalBrowserAutomation.g:193:3: ( rule__Affectation__Group__0 )
            {
             before(grammarAccess.getAffectationAccess().getGroup()); 
            // InternalBrowserAutomation.g:194:3: ( rule__Affectation__Group__0 )
            // InternalBrowserAutomation.g:194:4: rule__Affectation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleVariable"
    // InternalBrowserAutomation.g:203:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:204:1: ( ruleVariable EOF )
            // InternalBrowserAutomation.g:205:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalBrowserAutomation.g:212:1: ruleVariable : ( ( rule__Variable__NameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:216:2: ( ( ( rule__Variable__NameAssignment ) ) )
            // InternalBrowserAutomation.g:217:2: ( ( rule__Variable__NameAssignment ) )
            {
            // InternalBrowserAutomation.g:217:2: ( ( rule__Variable__NameAssignment ) )
            // InternalBrowserAutomation.g:218:3: ( rule__Variable__NameAssignment )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment()); 
            // InternalBrowserAutomation.g:219:3: ( rule__Variable__NameAssignment )
            // InternalBrowserAutomation.g:219:4: rule__Variable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVarRef"
    // InternalBrowserAutomation.g:228:1: entryRuleVarRef : ruleVarRef EOF ;
    public final void entryRuleVarRef() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:229:1: ( ruleVarRef EOF )
            // InternalBrowserAutomation.g:230:1: ruleVarRef EOF
            {
             before(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_1);
            ruleVarRef();

            state._fsp--;

             after(grammarAccess.getVarRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarRef"


    // $ANTLR start "ruleVarRef"
    // InternalBrowserAutomation.g:237:1: ruleVarRef : ( ( rule__VarRef__VarAssignment ) ) ;
    public final void ruleVarRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:241:2: ( ( ( rule__VarRef__VarAssignment ) ) )
            // InternalBrowserAutomation.g:242:2: ( ( rule__VarRef__VarAssignment ) )
            {
            // InternalBrowserAutomation.g:242:2: ( ( rule__VarRef__VarAssignment ) )
            // InternalBrowserAutomation.g:243:3: ( rule__VarRef__VarAssignment )
            {
             before(grammarAccess.getVarRefAccess().getVarAssignment()); 
            // InternalBrowserAutomation.g:244:3: ( rule__VarRef__VarAssignment )
            // InternalBrowserAutomation.g:244:4: rule__VarRef__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VarRef__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVarRefAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarRef"


    // $ANTLR start "entryRuleComposant"
    // InternalBrowserAutomation.g:253:1: entryRuleComposant : ruleComposant EOF ;
    public final void entryRuleComposant() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:254:1: ( ruleComposant EOF )
            // InternalBrowserAutomation.g:255:1: ruleComposant EOF
            {
             before(grammarAccess.getComposantRule()); 
            pushFollow(FOLLOW_1);
            ruleComposant();

            state._fsp--;

             after(grammarAccess.getComposantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComposant"


    // $ANTLR start "ruleComposant"
    // InternalBrowserAutomation.g:262:1: ruleComposant : ( ( rule__Composant__NameAssignment ) ) ;
    public final void ruleComposant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:266:2: ( ( ( rule__Composant__NameAssignment ) ) )
            // InternalBrowserAutomation.g:267:2: ( ( rule__Composant__NameAssignment ) )
            {
            // InternalBrowserAutomation.g:267:2: ( ( rule__Composant__NameAssignment ) )
            // InternalBrowserAutomation.g:268:3: ( rule__Composant__NameAssignment )
            {
             before(grammarAccess.getComposantAccess().getNameAssignment()); 
            // InternalBrowserAutomation.g:269:3: ( rule__Composant__NameAssignment )
            // InternalBrowserAutomation.g:269:4: rule__Composant__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Composant__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getComposantAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComposant"


    // $ANTLR start "entryRuleAttribut"
    // InternalBrowserAutomation.g:278:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:279:1: ( ruleAttribut EOF )
            // InternalBrowserAutomation.g:280:1: ruleAttribut EOF
            {
             before(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getAttributRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalBrowserAutomation.g:287:1: ruleAttribut : ( ( rule__Attribut__NameAssignment ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:291:2: ( ( ( rule__Attribut__NameAssignment ) ) )
            // InternalBrowserAutomation.g:292:2: ( ( rule__Attribut__NameAssignment ) )
            {
            // InternalBrowserAutomation.g:292:2: ( ( rule__Attribut__NameAssignment ) )
            // InternalBrowserAutomation.g:293:3: ( rule__Attribut__NameAssignment )
            {
             before(grammarAccess.getAttributAccess().getNameAssignment()); 
            // InternalBrowserAutomation.g:294:3: ( rule__Attribut__NameAssignment )
            // InternalBrowserAutomation.g:294:4: rule__Attribut__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Attribut__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleBrowser"
    // InternalBrowserAutomation.g:303:1: entryRuleBrowser : ruleBrowser EOF ;
    public final void entryRuleBrowser() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:304:1: ( ruleBrowser EOF )
            // InternalBrowserAutomation.g:305:1: ruleBrowser EOF
            {
             before(grammarAccess.getBrowserRule()); 
            pushFollow(FOLLOW_1);
            ruleBrowser();

            state._fsp--;

             after(grammarAccess.getBrowserRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBrowser"


    // $ANTLR start "ruleBrowser"
    // InternalBrowserAutomation.g:312:1: ruleBrowser : ( ( rule__Browser__NameAssignment ) ) ;
    public final void ruleBrowser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:316:2: ( ( ( rule__Browser__NameAssignment ) ) )
            // InternalBrowserAutomation.g:317:2: ( ( rule__Browser__NameAssignment ) )
            {
            // InternalBrowserAutomation.g:317:2: ( ( rule__Browser__NameAssignment ) )
            // InternalBrowserAutomation.g:318:3: ( rule__Browser__NameAssignment )
            {
             before(grammarAccess.getBrowserAccess().getNameAssignment()); 
            // InternalBrowserAutomation.g:319:3: ( rule__Browser__NameAssignment )
            // InternalBrowserAutomation.g:319:4: rule__Browser__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Browser__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBrowserAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBrowser"


    // $ANTLR start "entryRuleUrl"
    // InternalBrowserAutomation.g:328:1: entryRuleUrl : ruleUrl EOF ;
    public final void entryRuleUrl() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:329:1: ( ruleUrl EOF )
            // InternalBrowserAutomation.g:330:1: ruleUrl EOF
            {
             before(grammarAccess.getUrlRule()); 
            pushFollow(FOLLOW_1);
            ruleUrl();

            state._fsp--;

             after(grammarAccess.getUrlRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUrl"


    // $ANTLR start "ruleUrl"
    // InternalBrowserAutomation.g:337:1: ruleUrl : ( ( rule__Url__NameAssignment ) ) ;
    public final void ruleUrl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:341:2: ( ( ( rule__Url__NameAssignment ) ) )
            // InternalBrowserAutomation.g:342:2: ( ( rule__Url__NameAssignment ) )
            {
            // InternalBrowserAutomation.g:342:2: ( ( rule__Url__NameAssignment ) )
            // InternalBrowserAutomation.g:343:3: ( rule__Url__NameAssignment )
            {
             before(grammarAccess.getUrlAccess().getNameAssignment()); 
            // InternalBrowserAutomation.g:344:3: ( rule__Url__NameAssignment )
            // InternalBrowserAutomation.g:344:4: rule__Url__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Url__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getUrlAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUrl"


    // $ANTLR start "rule__Find__Alternatives_4"
    // InternalBrowserAutomation.g:352:1: rule__Find__Alternatives_4 : ( ( 'CONTAINS' ) | ( 'EQUALS' ) );
    public final void rule__Find__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:356:1: ( ( 'CONTAINS' ) | ( 'EQUALS' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalBrowserAutomation.g:357:2: ( 'CONTAINS' )
                    {
                    // InternalBrowserAutomation.g:357:2: ( 'CONTAINS' )
                    // InternalBrowserAutomation.g:358:3: 'CONTAINS'
                    {
                     before(grammarAccess.getFindAccess().getCONTAINSKeyword_4_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getFindAccess().getCONTAINSKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:363:2: ( 'EQUALS' )
                    {
                    // InternalBrowserAutomation.g:363:2: ( 'EQUALS' )
                    // InternalBrowserAutomation.g:364:3: 'EQUALS'
                    {
                     before(grammarAccess.getFindAccess().getEQUALSKeyword_4_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getFindAccess().getEQUALSKeyword_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Alternatives_4"


    // $ANTLR start "rule__Find__Alternatives_5"
    // InternalBrowserAutomation.g:373:1: rule__Find__Alternatives_5 : ( ( ( rule__Find__SAssignment_5_0 ) ) | ( ( rule__Find__VAssignment_5_1 ) ) );
    public final void rule__Find__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:377:1: ( ( ( rule__Find__SAssignment_5_0 ) ) | ( ( rule__Find__VAssignment_5_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBrowserAutomation.g:378:2: ( ( rule__Find__SAssignment_5_0 ) )
                    {
                    // InternalBrowserAutomation.g:378:2: ( ( rule__Find__SAssignment_5_0 ) )
                    // InternalBrowserAutomation.g:379:3: ( rule__Find__SAssignment_5_0 )
                    {
                     before(grammarAccess.getFindAccess().getSAssignment_5_0()); 
                    // InternalBrowserAutomation.g:380:3: ( rule__Find__SAssignment_5_0 )
                    // InternalBrowserAutomation.g:380:4: rule__Find__SAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Find__SAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFindAccess().getSAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:384:2: ( ( rule__Find__VAssignment_5_1 ) )
                    {
                    // InternalBrowserAutomation.g:384:2: ( ( rule__Find__VAssignment_5_1 ) )
                    // InternalBrowserAutomation.g:385:3: ( rule__Find__VAssignment_5_1 )
                    {
                     before(grammarAccess.getFindAccess().getVAssignment_5_1()); 
                    // InternalBrowserAutomation.g:386:3: ( rule__Find__VAssignment_5_1 )
                    // InternalBrowserAutomation.g:386:4: rule__Find__VAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Find__VAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFindAccess().getVAssignment_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Alternatives_5"


    // $ANTLR start "rule__Click__Alternatives_4"
    // InternalBrowserAutomation.g:394:1: rule__Click__Alternatives_4 : ( ( 'CONTAINS' ) | ( 'EQUALS' ) );
    public final void rule__Click__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:398:1: ( ( 'CONTAINS' ) | ( 'EQUALS' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalBrowserAutomation.g:399:2: ( 'CONTAINS' )
                    {
                    // InternalBrowserAutomation.g:399:2: ( 'CONTAINS' )
                    // InternalBrowserAutomation.g:400:3: 'CONTAINS'
                    {
                     before(grammarAccess.getClickAccess().getCONTAINSKeyword_4_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getClickAccess().getCONTAINSKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:405:2: ( 'EQUALS' )
                    {
                    // InternalBrowserAutomation.g:405:2: ( 'EQUALS' )
                    // InternalBrowserAutomation.g:406:3: 'EQUALS'
                    {
                     before(grammarAccess.getClickAccess().getEQUALSKeyword_4_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getClickAccess().getEQUALSKeyword_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Alternatives_4"


    // $ANTLR start "rule__Click__Alternatives_5"
    // InternalBrowserAutomation.g:415:1: rule__Click__Alternatives_5 : ( ( ( rule__Click__SAssignment_5_0 ) ) | ( ( rule__Click__VAssignment_5_1 ) ) );
    public final void rule__Click__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:419:1: ( ( ( rule__Click__SAssignment_5_0 ) ) | ( ( rule__Click__VAssignment_5_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalBrowserAutomation.g:420:2: ( ( rule__Click__SAssignment_5_0 ) )
                    {
                    // InternalBrowserAutomation.g:420:2: ( ( rule__Click__SAssignment_5_0 ) )
                    // InternalBrowserAutomation.g:421:3: ( rule__Click__SAssignment_5_0 )
                    {
                     before(grammarAccess.getClickAccess().getSAssignment_5_0()); 
                    // InternalBrowserAutomation.g:422:3: ( rule__Click__SAssignment_5_0 )
                    // InternalBrowserAutomation.g:422:4: rule__Click__SAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Click__SAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickAccess().getSAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:426:2: ( ( rule__Click__VAssignment_5_1 ) )
                    {
                    // InternalBrowserAutomation.g:426:2: ( ( rule__Click__VAssignment_5_1 ) )
                    // InternalBrowserAutomation.g:427:3: ( rule__Click__VAssignment_5_1 )
                    {
                     before(grammarAccess.getClickAccess().getVAssignment_5_1()); 
                    // InternalBrowserAutomation.g:428:3: ( rule__Click__VAssignment_5_1 )
                    // InternalBrowserAutomation.g:428:4: rule__Click__VAssignment_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Click__VAssignment_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getClickAccess().getVAssignment_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Alternatives_5"


    // $ANTLR start "rule__Set__Alternatives_2"
    // InternalBrowserAutomation.g:436:1: rule__Set__Alternatives_2 : ( ( RULE_STRING ) | ( ( rule__Set__VAssignment_2_1 ) ) );
    public final void rule__Set__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:440:1: ( ( RULE_STRING ) | ( ( rule__Set__VAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalBrowserAutomation.g:441:2: ( RULE_STRING )
                    {
                    // InternalBrowserAutomation.g:441:2: ( RULE_STRING )
                    // InternalBrowserAutomation.g:442:3: RULE_STRING
                    {
                     before(grammarAccess.getSetAccess().getSTRINGTerminalRuleCall_2_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getSetAccess().getSTRINGTerminalRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:447:2: ( ( rule__Set__VAssignment_2_1 ) )
                    {
                    // InternalBrowserAutomation.g:447:2: ( ( rule__Set__VAssignment_2_1 ) )
                    // InternalBrowserAutomation.g:448:3: ( rule__Set__VAssignment_2_1 )
                    {
                     before(grammarAccess.getSetAccess().getVAssignment_2_1()); 
                    // InternalBrowserAutomation.g:449:3: ( rule__Set__VAssignment_2_1 )
                    // InternalBrowserAutomation.g:449:4: rule__Set__VAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Set__VAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetAccess().getVAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Alternatives_2"


    // $ANTLR start "rule__Set__Alternatives_5"
    // InternalBrowserAutomation.g:457:1: rule__Set__Alternatives_5 : ( ( 'CONTAINS' ) | ( 'EQUALS' ) );
    public final void rule__Set__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:461:1: ( ( 'CONTAINS' ) | ( 'EQUALS' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBrowserAutomation.g:462:2: ( 'CONTAINS' )
                    {
                    // InternalBrowserAutomation.g:462:2: ( 'CONTAINS' )
                    // InternalBrowserAutomation.g:463:3: 'CONTAINS'
                    {
                     before(grammarAccess.getSetAccess().getCONTAINSKeyword_5_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getSetAccess().getCONTAINSKeyword_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:468:2: ( 'EQUALS' )
                    {
                    // InternalBrowserAutomation.g:468:2: ( 'EQUALS' )
                    // InternalBrowserAutomation.g:469:3: 'EQUALS'
                    {
                     before(grammarAccess.getSetAccess().getEQUALSKeyword_5_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getSetAccess().getEQUALSKeyword_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Alternatives_5"


    // $ANTLR start "rule__Set__Alternatives_6"
    // InternalBrowserAutomation.g:478:1: rule__Set__Alternatives_6 : ( ( ( rule__Set__S1Assignment_6_0 ) ) | ( ( rule__Set__VAssignment_6_1 ) ) );
    public final void rule__Set__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:482:1: ( ( ( rule__Set__S1Assignment_6_0 ) ) | ( ( rule__Set__VAssignment_6_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalBrowserAutomation.g:483:2: ( ( rule__Set__S1Assignment_6_0 ) )
                    {
                    // InternalBrowserAutomation.g:483:2: ( ( rule__Set__S1Assignment_6_0 ) )
                    // InternalBrowserAutomation.g:484:3: ( rule__Set__S1Assignment_6_0 )
                    {
                     before(grammarAccess.getSetAccess().getS1Assignment_6_0()); 
                    // InternalBrowserAutomation.g:485:3: ( rule__Set__S1Assignment_6_0 )
                    // InternalBrowserAutomation.g:485:4: rule__Set__S1Assignment_6_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Set__S1Assignment_6_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetAccess().getS1Assignment_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:489:2: ( ( rule__Set__VAssignment_6_1 ) )
                    {
                    // InternalBrowserAutomation.g:489:2: ( ( rule__Set__VAssignment_6_1 ) )
                    // InternalBrowserAutomation.g:490:3: ( rule__Set__VAssignment_6_1 )
                    {
                     before(grammarAccess.getSetAccess().getVAssignment_6_1()); 
                    // InternalBrowserAutomation.g:491:3: ( rule__Set__VAssignment_6_1 )
                    // InternalBrowserAutomation.g:491:4: rule__Set__VAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Set__VAssignment_6_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetAccess().getVAssignment_6_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Alternatives_6"


    // $ANTLR start "rule__Affectation__Alternatives_2"
    // InternalBrowserAutomation.g:499:1: rule__Affectation__Alternatives_2 : ( ( ( rule__Affectation__Group_2_0__0 ) ) | ( RULE_STRING ) );
    public final void rule__Affectation__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:503:1: ( ( ( rule__Affectation__Group_2_0__0 ) ) | ( RULE_STRING ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBrowserAutomation.g:504:2: ( ( rule__Affectation__Group_2_0__0 ) )
                    {
                    // InternalBrowserAutomation.g:504:2: ( ( rule__Affectation__Group_2_0__0 ) )
                    // InternalBrowserAutomation.g:505:3: ( rule__Affectation__Group_2_0__0 )
                    {
                     before(grammarAccess.getAffectationAccess().getGroup_2_0()); 
                    // InternalBrowserAutomation.g:506:3: ( rule__Affectation__Group_2_0__0 )
                    // InternalBrowserAutomation.g:506:4: rule__Affectation__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Affectation__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAffectationAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:510:2: ( RULE_STRING )
                    {
                    // InternalBrowserAutomation.g:510:2: ( RULE_STRING )
                    // InternalBrowserAutomation.g:511:3: RULE_STRING
                    {
                     before(grammarAccess.getAffectationAccess().getSTRINGTerminalRuleCall_2_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAffectationAccess().getSTRINGTerminalRuleCall_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Alternatives_2"


    // $ANTLR start "rule__Affectation__Alternatives_2_0_4"
    // InternalBrowserAutomation.g:520:1: rule__Affectation__Alternatives_2_0_4 : ( ( 'CONTAINS' ) | ( 'EQUALS' ) );
    public final void rule__Affectation__Alternatives_2_0_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:524:1: ( ( 'CONTAINS' ) | ( 'EQUALS' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            else if ( (LA9_0==12) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBrowserAutomation.g:525:2: ( 'CONTAINS' )
                    {
                    // InternalBrowserAutomation.g:525:2: ( 'CONTAINS' )
                    // InternalBrowserAutomation.g:526:3: 'CONTAINS'
                    {
                     before(grammarAccess.getAffectationAccess().getCONTAINSKeyword_2_0_4_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getAffectationAccess().getCONTAINSKeyword_2_0_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:531:2: ( 'EQUALS' )
                    {
                    // InternalBrowserAutomation.g:531:2: ( 'EQUALS' )
                    // InternalBrowserAutomation.g:532:3: 'EQUALS'
                    {
                     before(grammarAccess.getAffectationAccess().getEQUALSKeyword_2_0_4_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getAffectationAccess().getEQUALSKeyword_2_0_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Alternatives_2_0_4"


    // $ANTLR start "rule__Affectation__Alternatives_2_0_5"
    // InternalBrowserAutomation.g:541:1: rule__Affectation__Alternatives_2_0_5 : ( ( RULE_STRING ) | ( ( rule__Affectation__VAssignment_2_0_5_1 ) ) );
    public final void rule__Affectation__Alternatives_2_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:545:1: ( ( RULE_STRING ) | ( ( rule__Affectation__VAssignment_2_0_5_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalBrowserAutomation.g:546:2: ( RULE_STRING )
                    {
                    // InternalBrowserAutomation.g:546:2: ( RULE_STRING )
                    // InternalBrowserAutomation.g:547:3: RULE_STRING
                    {
                     before(grammarAccess.getAffectationAccess().getSTRINGTerminalRuleCall_2_0_5_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAffectationAccess().getSTRINGTerminalRuleCall_2_0_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:552:2: ( ( rule__Affectation__VAssignment_2_0_5_1 ) )
                    {
                    // InternalBrowserAutomation.g:552:2: ( ( rule__Affectation__VAssignment_2_0_5_1 ) )
                    // InternalBrowserAutomation.g:553:3: ( rule__Affectation__VAssignment_2_0_5_1 )
                    {
                     before(grammarAccess.getAffectationAccess().getVAssignment_2_0_5_1()); 
                    // InternalBrowserAutomation.g:554:3: ( rule__Affectation__VAssignment_2_0_5_1 )
                    // InternalBrowserAutomation.g:554:4: rule__Affectation__VAssignment_2_0_5_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Affectation__VAssignment_2_0_5_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAffectationAccess().getVAssignment_2_0_5_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Alternatives_2_0_5"


    // $ANTLR start "rule__Model__Group__0"
    // InternalBrowserAutomation.g:562:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:566:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalBrowserAutomation.g:567:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalBrowserAutomation.g:574:1: rule__Model__Group__0__Impl : ( ( rule__Model__Tisi1Assignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:578:1: ( ( ( rule__Model__Tisi1Assignment_0 ) ) )
            // InternalBrowserAutomation.g:579:1: ( ( rule__Model__Tisi1Assignment_0 ) )
            {
            // InternalBrowserAutomation.g:579:1: ( ( rule__Model__Tisi1Assignment_0 ) )
            // InternalBrowserAutomation.g:580:2: ( rule__Model__Tisi1Assignment_0 )
            {
             before(grammarAccess.getModelAccess().getTisi1Assignment_0()); 
            // InternalBrowserAutomation.g:581:2: ( rule__Model__Tisi1Assignment_0 )
            // InternalBrowserAutomation.g:581:3: rule__Model__Tisi1Assignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Tisi1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTisi1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalBrowserAutomation.g:589:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:593:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalBrowserAutomation.g:594:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalBrowserAutomation.g:601:1: rule__Model__Group__1__Impl : ( ( rule__Model__Tisi2Assignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:605:1: ( ( ( rule__Model__Tisi2Assignment_1 )* ) )
            // InternalBrowserAutomation.g:606:1: ( ( rule__Model__Tisi2Assignment_1 )* )
            {
            // InternalBrowserAutomation.g:606:1: ( ( rule__Model__Tisi2Assignment_1 )* )
            // InternalBrowserAutomation.g:607:2: ( rule__Model__Tisi2Assignment_1 )*
            {
             before(grammarAccess.getModelAccess().getTisi2Assignment_1()); 
            // InternalBrowserAutomation.g:608:2: ( rule__Model__Tisi2Assignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalBrowserAutomation.g:608:3: rule__Model__Tisi2Assignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__Tisi2Assignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTisi2Assignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalBrowserAutomation.g:616:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:620:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalBrowserAutomation.g:621:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalBrowserAutomation.g:628:1: rule__Model__Group__2__Impl : ( ( rule__Model__Tisi3Assignment_2 )? ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:632:1: ( ( ( rule__Model__Tisi3Assignment_2 )? ) )
            // InternalBrowserAutomation.g:633:1: ( ( rule__Model__Tisi3Assignment_2 )? )
            {
            // InternalBrowserAutomation.g:633:1: ( ( rule__Model__Tisi3Assignment_2 )? )
            // InternalBrowserAutomation.g:634:2: ( rule__Model__Tisi3Assignment_2 )?
            {
             before(grammarAccess.getModelAccess().getTisi3Assignment_2()); 
            // InternalBrowserAutomation.g:635:2: ( rule__Model__Tisi3Assignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalBrowserAutomation.g:635:3: rule__Model__Tisi3Assignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Tisi3Assignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getTisi3Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalBrowserAutomation.g:643:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:647:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalBrowserAutomation.g:648:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalBrowserAutomation.g:655:1: rule__Model__Group__3__Impl : ( ( rule__Model__Tisi4Assignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:659:1: ( ( ( rule__Model__Tisi4Assignment_3 )* ) )
            // InternalBrowserAutomation.g:660:1: ( ( rule__Model__Tisi4Assignment_3 )* )
            {
            // InternalBrowserAutomation.g:660:1: ( ( rule__Model__Tisi4Assignment_3 )* )
            // InternalBrowserAutomation.g:661:2: ( rule__Model__Tisi4Assignment_3 )*
            {
             before(grammarAccess.getModelAccess().getTisi4Assignment_3()); 
            // InternalBrowserAutomation.g:662:2: ( rule__Model__Tisi4Assignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBrowserAutomation.g:662:3: rule__Model__Tisi4Assignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__Tisi4Assignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTisi4Assignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__Model__Group__4"
    // InternalBrowserAutomation.g:670:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:674:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalBrowserAutomation.g:675:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalBrowserAutomation.g:682:1: rule__Model__Group__4__Impl : ( ( rule__Model__Tisi5Assignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:686:1: ( ( ( rule__Model__Tisi5Assignment_4 )* ) )
            // InternalBrowserAutomation.g:687:1: ( ( rule__Model__Tisi5Assignment_4 )* )
            {
            // InternalBrowserAutomation.g:687:1: ( ( rule__Model__Tisi5Assignment_4 )* )
            // InternalBrowserAutomation.g:688:2: ( rule__Model__Tisi5Assignment_4 )*
            {
             before(grammarAccess.getModelAccess().getTisi5Assignment_4()); 
            // InternalBrowserAutomation.g:689:2: ( rule__Model__Tisi5Assignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBrowserAutomation.g:689:3: rule__Model__Tisi5Assignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__Tisi5Assignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTisi5Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalBrowserAutomation.g:697:1: rule__Model__Group__5 : rule__Model__Group__5__Impl ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:701:1: ( rule__Model__Group__5__Impl )
            // InternalBrowserAutomation.g:702:2: rule__Model__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalBrowserAutomation.g:708:1: rule__Model__Group__5__Impl : ( ( rule__Model__Tisi6Assignment_5 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:712:1: ( ( ( rule__Model__Tisi6Assignment_5 )* ) )
            // InternalBrowserAutomation.g:713:1: ( ( rule__Model__Tisi6Assignment_5 )* )
            {
            // InternalBrowserAutomation.g:713:1: ( ( rule__Model__Tisi6Assignment_5 )* )
            // InternalBrowserAutomation.g:714:2: ( rule__Model__Tisi6Assignment_5 )*
            {
             before(grammarAccess.getModelAccess().getTisi6Assignment_5()); 
            // InternalBrowserAutomation.g:715:2: ( rule__Model__Tisi6Assignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalBrowserAutomation.g:715:3: rule__Model__Tisi6Assignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__Tisi6Assignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTisi6Assignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Launch__Group__0"
    // InternalBrowserAutomation.g:724:1: rule__Launch__Group__0 : rule__Launch__Group__0__Impl rule__Launch__Group__1 ;
    public final void rule__Launch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:728:1: ( rule__Launch__Group__0__Impl rule__Launch__Group__1 )
            // InternalBrowserAutomation.g:729:2: rule__Launch__Group__0__Impl rule__Launch__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Launch__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Launch__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Launch__Group__0"


    // $ANTLR start "rule__Launch__Group__0__Impl"
    // InternalBrowserAutomation.g:736:1: rule__Launch__Group__0__Impl : ( 'GOTO' ) ;
    public final void rule__Launch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:740:1: ( ( 'GOTO' ) )
            // InternalBrowserAutomation.g:741:1: ( 'GOTO' )
            {
            // InternalBrowserAutomation.g:741:1: ( 'GOTO' )
            // InternalBrowserAutomation.g:742:2: 'GOTO'
            {
             before(grammarAccess.getLaunchAccess().getGOTOKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLaunchAccess().getGOTOKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Launch__Group__0__Impl"


    // $ANTLR start "rule__Launch__Group__1"
    // InternalBrowserAutomation.g:751:1: rule__Launch__Group__1 : rule__Launch__Group__1__Impl rule__Launch__Group__2 ;
    public final void rule__Launch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:755:1: ( rule__Launch__Group__1__Impl rule__Launch__Group__2 )
            // InternalBrowserAutomation.g:756:2: rule__Launch__Group__1__Impl rule__Launch__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Launch__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Launch__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Launch__Group__1"


    // $ANTLR start "rule__Launch__Group__1__Impl"
    // InternalBrowserAutomation.g:763:1: rule__Launch__Group__1__Impl : ( ( rule__Launch__UAssignment_1 ) ) ;
    public final void rule__Launch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:767:1: ( ( ( rule__Launch__UAssignment_1 ) ) )
            // InternalBrowserAutomation.g:768:1: ( ( rule__Launch__UAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:768:1: ( ( rule__Launch__UAssignment_1 ) )
            // InternalBrowserAutomation.g:769:2: ( rule__Launch__UAssignment_1 )
            {
             before(grammarAccess.getLaunchAccess().getUAssignment_1()); 
            // InternalBrowserAutomation.g:770:2: ( rule__Launch__UAssignment_1 )
            // InternalBrowserAutomation.g:770:3: rule__Launch__UAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Launch__UAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLaunchAccess().getUAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Launch__Group__1__Impl"


    // $ANTLR start "rule__Launch__Group__2"
    // InternalBrowserAutomation.g:778:1: rule__Launch__Group__2 : rule__Launch__Group__2__Impl rule__Launch__Group__3 ;
    public final void rule__Launch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:782:1: ( rule__Launch__Group__2__Impl rule__Launch__Group__3 )
            // InternalBrowserAutomation.g:783:2: rule__Launch__Group__2__Impl rule__Launch__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Launch__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Launch__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Launch__Group__2"


    // $ANTLR start "rule__Launch__Group__2__Impl"
    // InternalBrowserAutomation.g:790:1: rule__Launch__Group__2__Impl : ( 'ON' ) ;
    public final void rule__Launch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:794:1: ( ( 'ON' ) )
            // InternalBrowserAutomation.g:795:1: ( 'ON' )
            {
            // InternalBrowserAutomation.g:795:1: ( 'ON' )
            // InternalBrowserAutomation.g:796:2: 'ON'
            {
             before(grammarAccess.getLaunchAccess().getONKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLaunchAccess().getONKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Launch__Group__2__Impl"


    // $ANTLR start "rule__Launch__Group__3"
    // InternalBrowserAutomation.g:805:1: rule__Launch__Group__3 : rule__Launch__Group__3__Impl ;
    public final void rule__Launch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:809:1: ( rule__Launch__Group__3__Impl )
            // InternalBrowserAutomation.g:810:2: rule__Launch__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Launch__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Launch__Group__3"


    // $ANTLR start "rule__Launch__Group__3__Impl"
    // InternalBrowserAutomation.g:816:1: rule__Launch__Group__3__Impl : ( ( rule__Launch__BAssignment_3 ) ) ;
    public final void rule__Launch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:820:1: ( ( ( rule__Launch__BAssignment_3 ) ) )
            // InternalBrowserAutomation.g:821:1: ( ( rule__Launch__BAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:821:1: ( ( rule__Launch__BAssignment_3 ) )
            // InternalBrowserAutomation.g:822:2: ( rule__Launch__BAssignment_3 )
            {
             before(grammarAccess.getLaunchAccess().getBAssignment_3()); 
            // InternalBrowserAutomation.g:823:2: ( rule__Launch__BAssignment_3 )
            // InternalBrowserAutomation.g:823:3: rule__Launch__BAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Launch__BAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLaunchAccess().getBAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Launch__Group__3__Impl"


    // $ANTLR start "rule__Find__Group__0"
    // InternalBrowserAutomation.g:832:1: rule__Find__Group__0 : rule__Find__Group__0__Impl rule__Find__Group__1 ;
    public final void rule__Find__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:836:1: ( rule__Find__Group__0__Impl rule__Find__Group__1 )
            // InternalBrowserAutomation.g:837:2: rule__Find__Group__0__Impl rule__Find__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Find__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Find__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__0"


    // $ANTLR start "rule__Find__Group__0__Impl"
    // InternalBrowserAutomation.g:844:1: rule__Find__Group__0__Impl : ( 'FIND' ) ;
    public final void rule__Find__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:848:1: ( ( 'FIND' ) )
            // InternalBrowserAutomation.g:849:1: ( 'FIND' )
            {
            // InternalBrowserAutomation.g:849:1: ( 'FIND' )
            // InternalBrowserAutomation.g:850:2: 'FIND'
            {
             before(grammarAccess.getFindAccess().getFINDKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFindAccess().getFINDKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__0__Impl"


    // $ANTLR start "rule__Find__Group__1"
    // InternalBrowserAutomation.g:859:1: rule__Find__Group__1 : rule__Find__Group__1__Impl rule__Find__Group__2 ;
    public final void rule__Find__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:863:1: ( rule__Find__Group__1__Impl rule__Find__Group__2 )
            // InternalBrowserAutomation.g:864:2: rule__Find__Group__1__Impl rule__Find__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Find__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Find__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__1"


    // $ANTLR start "rule__Find__Group__1__Impl"
    // InternalBrowserAutomation.g:871:1: rule__Find__Group__1__Impl : ( ( rule__Find__CAssignment_1 ) ) ;
    public final void rule__Find__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:875:1: ( ( ( rule__Find__CAssignment_1 ) ) )
            // InternalBrowserAutomation.g:876:1: ( ( rule__Find__CAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:876:1: ( ( rule__Find__CAssignment_1 ) )
            // InternalBrowserAutomation.g:877:2: ( rule__Find__CAssignment_1 )
            {
             before(grammarAccess.getFindAccess().getCAssignment_1()); 
            // InternalBrowserAutomation.g:878:2: ( rule__Find__CAssignment_1 )
            // InternalBrowserAutomation.g:878:3: rule__Find__CAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Find__CAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFindAccess().getCAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__1__Impl"


    // $ANTLR start "rule__Find__Group__2"
    // InternalBrowserAutomation.g:886:1: rule__Find__Group__2 : rule__Find__Group__2__Impl rule__Find__Group__3 ;
    public final void rule__Find__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:890:1: ( rule__Find__Group__2__Impl rule__Find__Group__3 )
            // InternalBrowserAutomation.g:891:2: rule__Find__Group__2__Impl rule__Find__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Find__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Find__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__2"


    // $ANTLR start "rule__Find__Group__2__Impl"
    // InternalBrowserAutomation.g:898:1: rule__Find__Group__2__Impl : ( 'WHERE' ) ;
    public final void rule__Find__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:902:1: ( ( 'WHERE' ) )
            // InternalBrowserAutomation.g:903:1: ( 'WHERE' )
            {
            // InternalBrowserAutomation.g:903:1: ( 'WHERE' )
            // InternalBrowserAutomation.g:904:2: 'WHERE'
            {
             before(grammarAccess.getFindAccess().getWHEREKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFindAccess().getWHEREKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__2__Impl"


    // $ANTLR start "rule__Find__Group__3"
    // InternalBrowserAutomation.g:913:1: rule__Find__Group__3 : rule__Find__Group__3__Impl rule__Find__Group__4 ;
    public final void rule__Find__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:917:1: ( rule__Find__Group__3__Impl rule__Find__Group__4 )
            // InternalBrowserAutomation.g:918:2: rule__Find__Group__3__Impl rule__Find__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Find__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Find__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__3"


    // $ANTLR start "rule__Find__Group__3__Impl"
    // InternalBrowserAutomation.g:925:1: rule__Find__Group__3__Impl : ( ( rule__Find__AAssignment_3 ) ) ;
    public final void rule__Find__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:929:1: ( ( ( rule__Find__AAssignment_3 ) ) )
            // InternalBrowserAutomation.g:930:1: ( ( rule__Find__AAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:930:1: ( ( rule__Find__AAssignment_3 ) )
            // InternalBrowserAutomation.g:931:2: ( rule__Find__AAssignment_3 )
            {
             before(grammarAccess.getFindAccess().getAAssignment_3()); 
            // InternalBrowserAutomation.g:932:2: ( rule__Find__AAssignment_3 )
            // InternalBrowserAutomation.g:932:3: rule__Find__AAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Find__AAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFindAccess().getAAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__3__Impl"


    // $ANTLR start "rule__Find__Group__4"
    // InternalBrowserAutomation.g:940:1: rule__Find__Group__4 : rule__Find__Group__4__Impl rule__Find__Group__5 ;
    public final void rule__Find__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:944:1: ( rule__Find__Group__4__Impl rule__Find__Group__5 )
            // InternalBrowserAutomation.g:945:2: rule__Find__Group__4__Impl rule__Find__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Find__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Find__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__4"


    // $ANTLR start "rule__Find__Group__4__Impl"
    // InternalBrowserAutomation.g:952:1: rule__Find__Group__4__Impl : ( ( rule__Find__Alternatives_4 ) ) ;
    public final void rule__Find__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:956:1: ( ( ( rule__Find__Alternatives_4 ) ) )
            // InternalBrowserAutomation.g:957:1: ( ( rule__Find__Alternatives_4 ) )
            {
            // InternalBrowserAutomation.g:957:1: ( ( rule__Find__Alternatives_4 ) )
            // InternalBrowserAutomation.g:958:2: ( rule__Find__Alternatives_4 )
            {
             before(grammarAccess.getFindAccess().getAlternatives_4()); 
            // InternalBrowserAutomation.g:959:2: ( rule__Find__Alternatives_4 )
            // InternalBrowserAutomation.g:959:3: rule__Find__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Find__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getFindAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__4__Impl"


    // $ANTLR start "rule__Find__Group__5"
    // InternalBrowserAutomation.g:967:1: rule__Find__Group__5 : rule__Find__Group__5__Impl ;
    public final void rule__Find__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:971:1: ( rule__Find__Group__5__Impl )
            // InternalBrowserAutomation.g:972:2: rule__Find__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Find__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__5"


    // $ANTLR start "rule__Find__Group__5__Impl"
    // InternalBrowserAutomation.g:978:1: rule__Find__Group__5__Impl : ( ( rule__Find__Alternatives_5 ) ) ;
    public final void rule__Find__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:982:1: ( ( ( rule__Find__Alternatives_5 ) ) )
            // InternalBrowserAutomation.g:983:1: ( ( rule__Find__Alternatives_5 ) )
            {
            // InternalBrowserAutomation.g:983:1: ( ( rule__Find__Alternatives_5 ) )
            // InternalBrowserAutomation.g:984:2: ( rule__Find__Alternatives_5 )
            {
             before(grammarAccess.getFindAccess().getAlternatives_5()); 
            // InternalBrowserAutomation.g:985:2: ( rule__Find__Alternatives_5 )
            // InternalBrowserAutomation.g:985:3: rule__Find__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Find__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getFindAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__Group__5__Impl"


    // $ANTLR start "rule__Click__Group__0"
    // InternalBrowserAutomation.g:994:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:998:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalBrowserAutomation.g:999:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Click__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0"


    // $ANTLR start "rule__Click__Group__0__Impl"
    // InternalBrowserAutomation.g:1006:1: rule__Click__Group__0__Impl : ( 'CLICK' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1010:1: ( ( 'CLICK' ) )
            // InternalBrowserAutomation.g:1011:1: ( 'CLICK' )
            {
            // InternalBrowserAutomation.g:1011:1: ( 'CLICK' )
            // InternalBrowserAutomation.g:1012:2: 'CLICK'
            {
             before(grammarAccess.getClickAccess().getCLICKKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getCLICKKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__0__Impl"


    // $ANTLR start "rule__Click__Group__1"
    // InternalBrowserAutomation.g:1021:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1025:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalBrowserAutomation.g:1026:2: rule__Click__Group__1__Impl rule__Click__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Click__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1"


    // $ANTLR start "rule__Click__Group__1__Impl"
    // InternalBrowserAutomation.g:1033:1: rule__Click__Group__1__Impl : ( ( rule__Click__CAssignment_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1037:1: ( ( ( rule__Click__CAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1038:1: ( ( rule__Click__CAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1038:1: ( ( rule__Click__CAssignment_1 ) )
            // InternalBrowserAutomation.g:1039:2: ( rule__Click__CAssignment_1 )
            {
             before(grammarAccess.getClickAccess().getCAssignment_1()); 
            // InternalBrowserAutomation.g:1040:2: ( rule__Click__CAssignment_1 )
            // InternalBrowserAutomation.g:1040:3: rule__Click__CAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Click__CAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getCAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__1__Impl"


    // $ANTLR start "rule__Click__Group__2"
    // InternalBrowserAutomation.g:1048:1: rule__Click__Group__2 : rule__Click__Group__2__Impl rule__Click__Group__3 ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1052:1: ( rule__Click__Group__2__Impl rule__Click__Group__3 )
            // InternalBrowserAutomation.g:1053:2: rule__Click__Group__2__Impl rule__Click__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Click__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__2"


    // $ANTLR start "rule__Click__Group__2__Impl"
    // InternalBrowserAutomation.g:1060:1: rule__Click__Group__2__Impl : ( 'WHERE' ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1064:1: ( ( 'WHERE' ) )
            // InternalBrowserAutomation.g:1065:1: ( 'WHERE' )
            {
            // InternalBrowserAutomation.g:1065:1: ( 'WHERE' )
            // InternalBrowserAutomation.g:1066:2: 'WHERE'
            {
             before(grammarAccess.getClickAccess().getWHEREKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getWHEREKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__2__Impl"


    // $ANTLR start "rule__Click__Group__3"
    // InternalBrowserAutomation.g:1075:1: rule__Click__Group__3 : rule__Click__Group__3__Impl rule__Click__Group__4 ;
    public final void rule__Click__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1079:1: ( rule__Click__Group__3__Impl rule__Click__Group__4 )
            // InternalBrowserAutomation.g:1080:2: rule__Click__Group__3__Impl rule__Click__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Click__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__3"


    // $ANTLR start "rule__Click__Group__3__Impl"
    // InternalBrowserAutomation.g:1087:1: rule__Click__Group__3__Impl : ( ( rule__Click__AAssignment_3 ) ) ;
    public final void rule__Click__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1091:1: ( ( ( rule__Click__AAssignment_3 ) ) )
            // InternalBrowserAutomation.g:1092:1: ( ( rule__Click__AAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:1092:1: ( ( rule__Click__AAssignment_3 ) )
            // InternalBrowserAutomation.g:1093:2: ( rule__Click__AAssignment_3 )
            {
             before(grammarAccess.getClickAccess().getAAssignment_3()); 
            // InternalBrowserAutomation.g:1094:2: ( rule__Click__AAssignment_3 )
            // InternalBrowserAutomation.g:1094:3: rule__Click__AAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Click__AAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getAAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__3__Impl"


    // $ANTLR start "rule__Click__Group__4"
    // InternalBrowserAutomation.g:1102:1: rule__Click__Group__4 : rule__Click__Group__4__Impl rule__Click__Group__5 ;
    public final void rule__Click__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1106:1: ( rule__Click__Group__4__Impl rule__Click__Group__5 )
            // InternalBrowserAutomation.g:1107:2: rule__Click__Group__4__Impl rule__Click__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Click__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Click__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__4"


    // $ANTLR start "rule__Click__Group__4__Impl"
    // InternalBrowserAutomation.g:1114:1: rule__Click__Group__4__Impl : ( ( rule__Click__Alternatives_4 ) ) ;
    public final void rule__Click__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1118:1: ( ( ( rule__Click__Alternatives_4 ) ) )
            // InternalBrowserAutomation.g:1119:1: ( ( rule__Click__Alternatives_4 ) )
            {
            // InternalBrowserAutomation.g:1119:1: ( ( rule__Click__Alternatives_4 ) )
            // InternalBrowserAutomation.g:1120:2: ( rule__Click__Alternatives_4 )
            {
             before(grammarAccess.getClickAccess().getAlternatives_4()); 
            // InternalBrowserAutomation.g:1121:2: ( rule__Click__Alternatives_4 )
            // InternalBrowserAutomation.g:1121:3: rule__Click__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Click__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__4__Impl"


    // $ANTLR start "rule__Click__Group__5"
    // InternalBrowserAutomation.g:1129:1: rule__Click__Group__5 : rule__Click__Group__5__Impl ;
    public final void rule__Click__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1133:1: ( rule__Click__Group__5__Impl )
            // InternalBrowserAutomation.g:1134:2: rule__Click__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Click__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__5"


    // $ANTLR start "rule__Click__Group__5__Impl"
    // InternalBrowserAutomation.g:1140:1: rule__Click__Group__5__Impl : ( ( rule__Click__Alternatives_5 ) ) ;
    public final void rule__Click__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1144:1: ( ( ( rule__Click__Alternatives_5 ) ) )
            // InternalBrowserAutomation.g:1145:1: ( ( rule__Click__Alternatives_5 ) )
            {
            // InternalBrowserAutomation.g:1145:1: ( ( rule__Click__Alternatives_5 ) )
            // InternalBrowserAutomation.g:1146:2: ( rule__Click__Alternatives_5 )
            {
             before(grammarAccess.getClickAccess().getAlternatives_5()); 
            // InternalBrowserAutomation.g:1147:2: ( rule__Click__Alternatives_5 )
            // InternalBrowserAutomation.g:1147:3: rule__Click__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Click__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getClickAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__Group__5__Impl"


    // $ANTLR start "rule__Set__Group__0"
    // InternalBrowserAutomation.g:1156:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1160:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // InternalBrowserAutomation.g:1161:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0"


    // $ANTLR start "rule__Set__Group__0__Impl"
    // InternalBrowserAutomation.g:1168:1: rule__Set__Group__0__Impl : ( 'SET' ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1172:1: ( ( 'SET' ) )
            // InternalBrowserAutomation.g:1173:1: ( 'SET' )
            {
            // InternalBrowserAutomation.g:1173:1: ( 'SET' )
            // InternalBrowserAutomation.g:1174:2: 'SET'
            {
             before(grammarAccess.getSetAccess().getSETKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getSETKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0__Impl"


    // $ANTLR start "rule__Set__Group__1"
    // InternalBrowserAutomation.g:1183:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1187:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // InternalBrowserAutomation.g:1188:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1"


    // $ANTLR start "rule__Set__Group__1__Impl"
    // InternalBrowserAutomation.g:1195:1: rule__Set__Group__1__Impl : ( ( rule__Set__AAssignment_1 ) ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1199:1: ( ( ( rule__Set__AAssignment_1 ) ) )
            // InternalBrowserAutomation.g:1200:1: ( ( rule__Set__AAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:1200:1: ( ( rule__Set__AAssignment_1 ) )
            // InternalBrowserAutomation.g:1201:2: ( rule__Set__AAssignment_1 )
            {
             before(grammarAccess.getSetAccess().getAAssignment_1()); 
            // InternalBrowserAutomation.g:1202:2: ( rule__Set__AAssignment_1 )
            // InternalBrowserAutomation.g:1202:3: rule__Set__AAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Set__AAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getAAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1__Impl"


    // $ANTLR start "rule__Set__Group__2"
    // InternalBrowserAutomation.g:1210:1: rule__Set__Group__2 : rule__Set__Group__2__Impl rule__Set__Group__3 ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1214:1: ( rule__Set__Group__2__Impl rule__Set__Group__3 )
            // InternalBrowserAutomation.g:1215:2: rule__Set__Group__2__Impl rule__Set__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Set__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__2"


    // $ANTLR start "rule__Set__Group__2__Impl"
    // InternalBrowserAutomation.g:1222:1: rule__Set__Group__2__Impl : ( ( rule__Set__Alternatives_2 ) ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1226:1: ( ( ( rule__Set__Alternatives_2 ) ) )
            // InternalBrowserAutomation.g:1227:1: ( ( rule__Set__Alternatives_2 ) )
            {
            // InternalBrowserAutomation.g:1227:1: ( ( rule__Set__Alternatives_2 ) )
            // InternalBrowserAutomation.g:1228:2: ( rule__Set__Alternatives_2 )
            {
             before(grammarAccess.getSetAccess().getAlternatives_2()); 
            // InternalBrowserAutomation.g:1229:2: ( rule__Set__Alternatives_2 )
            // InternalBrowserAutomation.g:1229:3: rule__Set__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Set__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__2__Impl"


    // $ANTLR start "rule__Set__Group__3"
    // InternalBrowserAutomation.g:1237:1: rule__Set__Group__3 : rule__Set__Group__3__Impl rule__Set__Group__4 ;
    public final void rule__Set__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1241:1: ( rule__Set__Group__3__Impl rule__Set__Group__4 )
            // InternalBrowserAutomation.g:1242:2: rule__Set__Group__3__Impl rule__Set__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Set__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__3"


    // $ANTLR start "rule__Set__Group__3__Impl"
    // InternalBrowserAutomation.g:1249:1: rule__Set__Group__3__Impl : ( 'WHERE' ) ;
    public final void rule__Set__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1253:1: ( ( 'WHERE' ) )
            // InternalBrowserAutomation.g:1254:1: ( 'WHERE' )
            {
            // InternalBrowserAutomation.g:1254:1: ( 'WHERE' )
            // InternalBrowserAutomation.g:1255:2: 'WHERE'
            {
             before(grammarAccess.getSetAccess().getWHEREKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getWHEREKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__3__Impl"


    // $ANTLR start "rule__Set__Group__4"
    // InternalBrowserAutomation.g:1264:1: rule__Set__Group__4 : rule__Set__Group__4__Impl rule__Set__Group__5 ;
    public final void rule__Set__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1268:1: ( rule__Set__Group__4__Impl rule__Set__Group__5 )
            // InternalBrowserAutomation.g:1269:2: rule__Set__Group__4__Impl rule__Set__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Set__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__4"


    // $ANTLR start "rule__Set__Group__4__Impl"
    // InternalBrowserAutomation.g:1276:1: rule__Set__Group__4__Impl : ( ( rule__Set__A1Assignment_4 ) ) ;
    public final void rule__Set__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1280:1: ( ( ( rule__Set__A1Assignment_4 ) ) )
            // InternalBrowserAutomation.g:1281:1: ( ( rule__Set__A1Assignment_4 ) )
            {
            // InternalBrowserAutomation.g:1281:1: ( ( rule__Set__A1Assignment_4 ) )
            // InternalBrowserAutomation.g:1282:2: ( rule__Set__A1Assignment_4 )
            {
             before(grammarAccess.getSetAccess().getA1Assignment_4()); 
            // InternalBrowserAutomation.g:1283:2: ( rule__Set__A1Assignment_4 )
            // InternalBrowserAutomation.g:1283:3: rule__Set__A1Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Set__A1Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getA1Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__4__Impl"


    // $ANTLR start "rule__Set__Group__5"
    // InternalBrowserAutomation.g:1291:1: rule__Set__Group__5 : rule__Set__Group__5__Impl rule__Set__Group__6 ;
    public final void rule__Set__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1295:1: ( rule__Set__Group__5__Impl rule__Set__Group__6 )
            // InternalBrowserAutomation.g:1296:2: rule__Set__Group__5__Impl rule__Set__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Set__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__5"


    // $ANTLR start "rule__Set__Group__5__Impl"
    // InternalBrowserAutomation.g:1303:1: rule__Set__Group__5__Impl : ( ( rule__Set__Alternatives_5 ) ) ;
    public final void rule__Set__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1307:1: ( ( ( rule__Set__Alternatives_5 ) ) )
            // InternalBrowserAutomation.g:1308:1: ( ( rule__Set__Alternatives_5 ) )
            {
            // InternalBrowserAutomation.g:1308:1: ( ( rule__Set__Alternatives_5 ) )
            // InternalBrowserAutomation.g:1309:2: ( rule__Set__Alternatives_5 )
            {
             before(grammarAccess.getSetAccess().getAlternatives_5()); 
            // InternalBrowserAutomation.g:1310:2: ( rule__Set__Alternatives_5 )
            // InternalBrowserAutomation.g:1310:3: rule__Set__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Set__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__5__Impl"


    // $ANTLR start "rule__Set__Group__6"
    // InternalBrowserAutomation.g:1318:1: rule__Set__Group__6 : rule__Set__Group__6__Impl ;
    public final void rule__Set__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1322:1: ( rule__Set__Group__6__Impl )
            // InternalBrowserAutomation.g:1323:2: rule__Set__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__6"


    // $ANTLR start "rule__Set__Group__6__Impl"
    // InternalBrowserAutomation.g:1329:1: rule__Set__Group__6__Impl : ( ( rule__Set__Alternatives_6 ) ) ;
    public final void rule__Set__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1333:1: ( ( ( rule__Set__Alternatives_6 ) ) )
            // InternalBrowserAutomation.g:1334:1: ( ( rule__Set__Alternatives_6 ) )
            {
            // InternalBrowserAutomation.g:1334:1: ( ( rule__Set__Alternatives_6 ) )
            // InternalBrowserAutomation.g:1335:2: ( rule__Set__Alternatives_6 )
            {
             before(grammarAccess.getSetAccess().getAlternatives_6()); 
            // InternalBrowserAutomation.g:1336:2: ( rule__Set__Alternatives_6 )
            // InternalBrowserAutomation.g:1336:3: rule__Set__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Set__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__6__Impl"


    // $ANTLR start "rule__Affectation__Group__0"
    // InternalBrowserAutomation.g:1345:1: rule__Affectation__Group__0 : rule__Affectation__Group__0__Impl rule__Affectation__Group__1 ;
    public final void rule__Affectation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1349:1: ( rule__Affectation__Group__0__Impl rule__Affectation__Group__1 )
            // InternalBrowserAutomation.g:1350:2: rule__Affectation__Group__0__Impl rule__Affectation__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Affectation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__0"


    // $ANTLR start "rule__Affectation__Group__0__Impl"
    // InternalBrowserAutomation.g:1357:1: rule__Affectation__Group__0__Impl : ( ruleVariable ) ;
    public final void rule__Affectation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1361:1: ( ( ruleVariable ) )
            // InternalBrowserAutomation.g:1362:1: ( ruleVariable )
            {
            // InternalBrowserAutomation.g:1362:1: ( ruleVariable )
            // InternalBrowserAutomation.g:1363:2: ruleVariable
            {
             before(grammarAccess.getAffectationAccess().getVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getAffectationAccess().getVariableParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__0__Impl"


    // $ANTLR start "rule__Affectation__Group__1"
    // InternalBrowserAutomation.g:1372:1: rule__Affectation__Group__1 : rule__Affectation__Group__1__Impl rule__Affectation__Group__2 ;
    public final void rule__Affectation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1376:1: ( rule__Affectation__Group__1__Impl rule__Affectation__Group__2 )
            // InternalBrowserAutomation.g:1377:2: rule__Affectation__Group__1__Impl rule__Affectation__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Affectation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__1"


    // $ANTLR start "rule__Affectation__Group__1__Impl"
    // InternalBrowserAutomation.g:1384:1: rule__Affectation__Group__1__Impl : ( '=' ) ;
    public final void rule__Affectation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1388:1: ( ( '=' ) )
            // InternalBrowserAutomation.g:1389:1: ( '=' )
            {
            // InternalBrowserAutomation.g:1389:1: ( '=' )
            // InternalBrowserAutomation.g:1390:2: '='
            {
             before(grammarAccess.getAffectationAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__1__Impl"


    // $ANTLR start "rule__Affectation__Group__2"
    // InternalBrowserAutomation.g:1399:1: rule__Affectation__Group__2 : rule__Affectation__Group__2__Impl ;
    public final void rule__Affectation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1403:1: ( rule__Affectation__Group__2__Impl )
            // InternalBrowserAutomation.g:1404:2: rule__Affectation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__2"


    // $ANTLR start "rule__Affectation__Group__2__Impl"
    // InternalBrowserAutomation.g:1410:1: rule__Affectation__Group__2__Impl : ( ( rule__Affectation__Alternatives_2 ) ) ;
    public final void rule__Affectation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1414:1: ( ( ( rule__Affectation__Alternatives_2 ) ) )
            // InternalBrowserAutomation.g:1415:1: ( ( rule__Affectation__Alternatives_2 ) )
            {
            // InternalBrowserAutomation.g:1415:1: ( ( rule__Affectation__Alternatives_2 ) )
            // InternalBrowserAutomation.g:1416:2: ( rule__Affectation__Alternatives_2 )
            {
             before(grammarAccess.getAffectationAccess().getAlternatives_2()); 
            // InternalBrowserAutomation.g:1417:2: ( rule__Affectation__Alternatives_2 )
            // InternalBrowserAutomation.g:1417:3: rule__Affectation__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group__2__Impl"


    // $ANTLR start "rule__Affectation__Group_2_0__0"
    // InternalBrowserAutomation.g:1426:1: rule__Affectation__Group_2_0__0 : rule__Affectation__Group_2_0__0__Impl rule__Affectation__Group_2_0__1 ;
    public final void rule__Affectation__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1430:1: ( rule__Affectation__Group_2_0__0__Impl rule__Affectation__Group_2_0__1 )
            // InternalBrowserAutomation.g:1431:2: rule__Affectation__Group_2_0__0__Impl rule__Affectation__Group_2_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Affectation__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_2_0__0"


    // $ANTLR start "rule__Affectation__Group_2_0__0__Impl"
    // InternalBrowserAutomation.g:1438:1: rule__Affectation__Group_2_0__0__Impl : ( 'GET' ) ;
    public final void rule__Affectation__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1442:1: ( ( 'GET' ) )
            // InternalBrowserAutomation.g:1443:1: ( 'GET' )
            {
            // InternalBrowserAutomation.g:1443:1: ( 'GET' )
            // InternalBrowserAutomation.g:1444:2: 'GET'
            {
             before(grammarAccess.getAffectationAccess().getGETKeyword_2_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getGETKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_2_0__0__Impl"


    // $ANTLR start "rule__Affectation__Group_2_0__1"
    // InternalBrowserAutomation.g:1453:1: rule__Affectation__Group_2_0__1 : rule__Affectation__Group_2_0__1__Impl rule__Affectation__Group_2_0__2 ;
    public final void rule__Affectation__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1457:1: ( rule__Affectation__Group_2_0__1__Impl rule__Affectation__Group_2_0__2 )
            // InternalBrowserAutomation.g:1458:2: rule__Affectation__Group_2_0__1__Impl rule__Affectation__Group_2_0__2
            {
            pushFollow(FOLLOW_11);
            rule__Affectation__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_2_0__1"


    // $ANTLR start "rule__Affectation__Group_2_0__1__Impl"
    // InternalBrowserAutomation.g:1465:1: rule__Affectation__Group_2_0__1__Impl : ( ( rule__Affectation__AAssignment_2_0_1 ) ) ;
    public final void rule__Affectation__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1469:1: ( ( ( rule__Affectation__AAssignment_2_0_1 ) ) )
            // InternalBrowserAutomation.g:1470:1: ( ( rule__Affectation__AAssignment_2_0_1 ) )
            {
            // InternalBrowserAutomation.g:1470:1: ( ( rule__Affectation__AAssignment_2_0_1 ) )
            // InternalBrowserAutomation.g:1471:2: ( rule__Affectation__AAssignment_2_0_1 )
            {
             before(grammarAccess.getAffectationAccess().getAAssignment_2_0_1()); 
            // InternalBrowserAutomation.g:1472:2: ( rule__Affectation__AAssignment_2_0_1 )
            // InternalBrowserAutomation.g:1472:3: rule__Affectation__AAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__AAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getAAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_2_0__1__Impl"


    // $ANTLR start "rule__Affectation__Group_2_0__2"
    // InternalBrowserAutomation.g:1480:1: rule__Affectation__Group_2_0__2 : rule__Affectation__Group_2_0__2__Impl rule__Affectation__Group_2_0__3 ;
    public final void rule__Affectation__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1484:1: ( rule__Affectation__Group_2_0__2__Impl rule__Affectation__Group_2_0__3 )
            // InternalBrowserAutomation.g:1485:2: rule__Affectation__Group_2_0__2__Impl rule__Affectation__Group_2_0__3
            {
            pushFollow(FOLLOW_10);
            rule__Affectation__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group_2_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_2_0__2"


    // $ANTLR start "rule__Affectation__Group_2_0__2__Impl"
    // InternalBrowserAutomation.g:1492:1: rule__Affectation__Group_2_0__2__Impl : ( 'WHERE' ) ;
    public final void rule__Affectation__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1496:1: ( ( 'WHERE' ) )
            // InternalBrowserAutomation.g:1497:1: ( 'WHERE' )
            {
            // InternalBrowserAutomation.g:1497:1: ( 'WHERE' )
            // InternalBrowserAutomation.g:1498:2: 'WHERE'
            {
             before(grammarAccess.getAffectationAccess().getWHEREKeyword_2_0_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAffectationAccess().getWHEREKeyword_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_2_0__2__Impl"


    // $ANTLR start "rule__Affectation__Group_2_0__3"
    // InternalBrowserAutomation.g:1507:1: rule__Affectation__Group_2_0__3 : rule__Affectation__Group_2_0__3__Impl rule__Affectation__Group_2_0__4 ;
    public final void rule__Affectation__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1511:1: ( rule__Affectation__Group_2_0__3__Impl rule__Affectation__Group_2_0__4 )
            // InternalBrowserAutomation.g:1512:2: rule__Affectation__Group_2_0__3__Impl rule__Affectation__Group_2_0__4
            {
            pushFollow(FOLLOW_12);
            rule__Affectation__Group_2_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group_2_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_2_0__3"


    // $ANTLR start "rule__Affectation__Group_2_0__3__Impl"
    // InternalBrowserAutomation.g:1519:1: rule__Affectation__Group_2_0__3__Impl : ( ( rule__Affectation__A2Assignment_2_0_3 ) ) ;
    public final void rule__Affectation__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1523:1: ( ( ( rule__Affectation__A2Assignment_2_0_3 ) ) )
            // InternalBrowserAutomation.g:1524:1: ( ( rule__Affectation__A2Assignment_2_0_3 ) )
            {
            // InternalBrowserAutomation.g:1524:1: ( ( rule__Affectation__A2Assignment_2_0_3 ) )
            // InternalBrowserAutomation.g:1525:2: ( rule__Affectation__A2Assignment_2_0_3 )
            {
             before(grammarAccess.getAffectationAccess().getA2Assignment_2_0_3()); 
            // InternalBrowserAutomation.g:1526:2: ( rule__Affectation__A2Assignment_2_0_3 )
            // InternalBrowserAutomation.g:1526:3: rule__Affectation__A2Assignment_2_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__A2Assignment_2_0_3();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getA2Assignment_2_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_2_0__3__Impl"


    // $ANTLR start "rule__Affectation__Group_2_0__4"
    // InternalBrowserAutomation.g:1534:1: rule__Affectation__Group_2_0__4 : rule__Affectation__Group_2_0__4__Impl rule__Affectation__Group_2_0__5 ;
    public final void rule__Affectation__Group_2_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1538:1: ( rule__Affectation__Group_2_0__4__Impl rule__Affectation__Group_2_0__5 )
            // InternalBrowserAutomation.g:1539:2: rule__Affectation__Group_2_0__4__Impl rule__Affectation__Group_2_0__5
            {
            pushFollow(FOLLOW_13);
            rule__Affectation__Group_2_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Affectation__Group_2_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_2_0__4"


    // $ANTLR start "rule__Affectation__Group_2_0__4__Impl"
    // InternalBrowserAutomation.g:1546:1: rule__Affectation__Group_2_0__4__Impl : ( ( rule__Affectation__Alternatives_2_0_4 ) ) ;
    public final void rule__Affectation__Group_2_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1550:1: ( ( ( rule__Affectation__Alternatives_2_0_4 ) ) )
            // InternalBrowserAutomation.g:1551:1: ( ( rule__Affectation__Alternatives_2_0_4 ) )
            {
            // InternalBrowserAutomation.g:1551:1: ( ( rule__Affectation__Alternatives_2_0_4 ) )
            // InternalBrowserAutomation.g:1552:2: ( rule__Affectation__Alternatives_2_0_4 )
            {
             before(grammarAccess.getAffectationAccess().getAlternatives_2_0_4()); 
            // InternalBrowserAutomation.g:1553:2: ( rule__Affectation__Alternatives_2_0_4 )
            // InternalBrowserAutomation.g:1553:3: rule__Affectation__Alternatives_2_0_4
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Alternatives_2_0_4();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getAlternatives_2_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_2_0__4__Impl"


    // $ANTLR start "rule__Affectation__Group_2_0__5"
    // InternalBrowserAutomation.g:1561:1: rule__Affectation__Group_2_0__5 : rule__Affectation__Group_2_0__5__Impl ;
    public final void rule__Affectation__Group_2_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1565:1: ( rule__Affectation__Group_2_0__5__Impl )
            // InternalBrowserAutomation.g:1566:2: rule__Affectation__Group_2_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Group_2_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_2_0__5"


    // $ANTLR start "rule__Affectation__Group_2_0__5__Impl"
    // InternalBrowserAutomation.g:1572:1: rule__Affectation__Group_2_0__5__Impl : ( ( rule__Affectation__Alternatives_2_0_5 ) ) ;
    public final void rule__Affectation__Group_2_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1576:1: ( ( ( rule__Affectation__Alternatives_2_0_5 ) ) )
            // InternalBrowserAutomation.g:1577:1: ( ( rule__Affectation__Alternatives_2_0_5 ) )
            {
            // InternalBrowserAutomation.g:1577:1: ( ( rule__Affectation__Alternatives_2_0_5 ) )
            // InternalBrowserAutomation.g:1578:2: ( rule__Affectation__Alternatives_2_0_5 )
            {
             before(grammarAccess.getAffectationAccess().getAlternatives_2_0_5()); 
            // InternalBrowserAutomation.g:1579:2: ( rule__Affectation__Alternatives_2_0_5 )
            // InternalBrowserAutomation.g:1579:3: rule__Affectation__Alternatives_2_0_5
            {
            pushFollow(FOLLOW_2);
            rule__Affectation__Alternatives_2_0_5();

            state._fsp--;


            }

             after(grammarAccess.getAffectationAccess().getAlternatives_2_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__Group_2_0__5__Impl"


    // $ANTLR start "rule__Model__Tisi1Assignment_0"
    // InternalBrowserAutomation.g:1588:1: rule__Model__Tisi1Assignment_0 : ( ruleLaunch ) ;
    public final void rule__Model__Tisi1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1592:1: ( ( ruleLaunch ) )
            // InternalBrowserAutomation.g:1593:2: ( ruleLaunch )
            {
            // InternalBrowserAutomation.g:1593:2: ( ruleLaunch )
            // InternalBrowserAutomation.g:1594:3: ruleLaunch
            {
             before(grammarAccess.getModelAccess().getTisi1LaunchParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLaunch();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTisi1LaunchParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Tisi1Assignment_0"


    // $ANTLR start "rule__Model__Tisi2Assignment_1"
    // InternalBrowserAutomation.g:1603:1: rule__Model__Tisi2Assignment_1 : ( ruleAffectation ) ;
    public final void rule__Model__Tisi2Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1607:1: ( ( ruleAffectation ) )
            // InternalBrowserAutomation.g:1608:2: ( ruleAffectation )
            {
            // InternalBrowserAutomation.g:1608:2: ( ruleAffectation )
            // InternalBrowserAutomation.g:1609:3: ruleAffectation
            {
             before(grammarAccess.getModelAccess().getTisi2AffectationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAffectation();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTisi2AffectationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Tisi2Assignment_1"


    // $ANTLR start "rule__Model__Tisi3Assignment_2"
    // InternalBrowserAutomation.g:1618:1: rule__Model__Tisi3Assignment_2 : ( ruleLaunch ) ;
    public final void rule__Model__Tisi3Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1622:1: ( ( ruleLaunch ) )
            // InternalBrowserAutomation.g:1623:2: ( ruleLaunch )
            {
            // InternalBrowserAutomation.g:1623:2: ( ruleLaunch )
            // InternalBrowserAutomation.g:1624:3: ruleLaunch
            {
             before(grammarAccess.getModelAccess().getTisi3LaunchParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLaunch();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTisi3LaunchParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Tisi3Assignment_2"


    // $ANTLR start "rule__Model__Tisi4Assignment_3"
    // InternalBrowserAutomation.g:1633:1: rule__Model__Tisi4Assignment_3 : ( ruleSet ) ;
    public final void rule__Model__Tisi4Assignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1637:1: ( ( ruleSet ) )
            // InternalBrowserAutomation.g:1638:2: ( ruleSet )
            {
            // InternalBrowserAutomation.g:1638:2: ( ruleSet )
            // InternalBrowserAutomation.g:1639:3: ruleSet
            {
             before(grammarAccess.getModelAccess().getTisi4SetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSet();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTisi4SetParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Tisi4Assignment_3"


    // $ANTLR start "rule__Model__Tisi5Assignment_4"
    // InternalBrowserAutomation.g:1648:1: rule__Model__Tisi5Assignment_4 : ( ruleClick ) ;
    public final void rule__Model__Tisi5Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1652:1: ( ( ruleClick ) )
            // InternalBrowserAutomation.g:1653:2: ( ruleClick )
            {
            // InternalBrowserAutomation.g:1653:2: ( ruleClick )
            // InternalBrowserAutomation.g:1654:3: ruleClick
            {
             before(grammarAccess.getModelAccess().getTisi5ClickParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTisi5ClickParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Tisi5Assignment_4"


    // $ANTLR start "rule__Model__Tisi6Assignment_5"
    // InternalBrowserAutomation.g:1663:1: rule__Model__Tisi6Assignment_5 : ( ruleFind ) ;
    public final void rule__Model__Tisi6Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1667:1: ( ( ruleFind ) )
            // InternalBrowserAutomation.g:1668:2: ( ruleFind )
            {
            // InternalBrowserAutomation.g:1668:2: ( ruleFind )
            // InternalBrowserAutomation.g:1669:3: ruleFind
            {
             before(grammarAccess.getModelAccess().getTisi6FindParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFind();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTisi6FindParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Tisi6Assignment_5"


    // $ANTLR start "rule__Launch__UAssignment_1"
    // InternalBrowserAutomation.g:1678:1: rule__Launch__UAssignment_1 : ( ruleUrl ) ;
    public final void rule__Launch__UAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1682:1: ( ( ruleUrl ) )
            // InternalBrowserAutomation.g:1683:2: ( ruleUrl )
            {
            // InternalBrowserAutomation.g:1683:2: ( ruleUrl )
            // InternalBrowserAutomation.g:1684:3: ruleUrl
            {
             before(grammarAccess.getLaunchAccess().getUUrlParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUrl();

            state._fsp--;

             after(grammarAccess.getLaunchAccess().getUUrlParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Launch__UAssignment_1"


    // $ANTLR start "rule__Launch__BAssignment_3"
    // InternalBrowserAutomation.g:1693:1: rule__Launch__BAssignment_3 : ( ruleBrowser ) ;
    public final void rule__Launch__BAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1697:1: ( ( ruleBrowser ) )
            // InternalBrowserAutomation.g:1698:2: ( ruleBrowser )
            {
            // InternalBrowserAutomation.g:1698:2: ( ruleBrowser )
            // InternalBrowserAutomation.g:1699:3: ruleBrowser
            {
             before(grammarAccess.getLaunchAccess().getBBrowserParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBrowser();

            state._fsp--;

             after(grammarAccess.getLaunchAccess().getBBrowserParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Launch__BAssignment_3"


    // $ANTLR start "rule__Find__CAssignment_1"
    // InternalBrowserAutomation.g:1708:1: rule__Find__CAssignment_1 : ( ruleComposant ) ;
    public final void rule__Find__CAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1712:1: ( ( ruleComposant ) )
            // InternalBrowserAutomation.g:1713:2: ( ruleComposant )
            {
            // InternalBrowserAutomation.g:1713:2: ( ruleComposant )
            // InternalBrowserAutomation.g:1714:3: ruleComposant
            {
             before(grammarAccess.getFindAccess().getCComposantParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComposant();

            state._fsp--;

             after(grammarAccess.getFindAccess().getCComposantParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__CAssignment_1"


    // $ANTLR start "rule__Find__AAssignment_3"
    // InternalBrowserAutomation.g:1723:1: rule__Find__AAssignment_3 : ( ruleAttribut ) ;
    public final void rule__Find__AAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1727:1: ( ( ruleAttribut ) )
            // InternalBrowserAutomation.g:1728:2: ( ruleAttribut )
            {
            // InternalBrowserAutomation.g:1728:2: ( ruleAttribut )
            // InternalBrowserAutomation.g:1729:3: ruleAttribut
            {
             before(grammarAccess.getFindAccess().getAAttributParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getFindAccess().getAAttributParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__AAssignment_3"


    // $ANTLR start "rule__Find__SAssignment_5_0"
    // InternalBrowserAutomation.g:1738:1: rule__Find__SAssignment_5_0 : ( RULE_STRING ) ;
    public final void rule__Find__SAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1742:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:1743:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:1743:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:1744:3: RULE_STRING
            {
             before(grammarAccess.getFindAccess().getSSTRINGTerminalRuleCall_5_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFindAccess().getSSTRINGTerminalRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__SAssignment_5_0"


    // $ANTLR start "rule__Find__VAssignment_5_1"
    // InternalBrowserAutomation.g:1753:1: rule__Find__VAssignment_5_1 : ( ruleVarRef ) ;
    public final void rule__Find__VAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1757:1: ( ( ruleVarRef ) )
            // InternalBrowserAutomation.g:1758:2: ( ruleVarRef )
            {
            // InternalBrowserAutomation.g:1758:2: ( ruleVarRef )
            // InternalBrowserAutomation.g:1759:3: ruleVarRef
            {
             before(grammarAccess.getFindAccess().getVVarRefParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarRef();

            state._fsp--;

             after(grammarAccess.getFindAccess().getVVarRefParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Find__VAssignment_5_1"


    // $ANTLR start "rule__Click__CAssignment_1"
    // InternalBrowserAutomation.g:1768:1: rule__Click__CAssignment_1 : ( ruleComposant ) ;
    public final void rule__Click__CAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1772:1: ( ( ruleComposant ) )
            // InternalBrowserAutomation.g:1773:2: ( ruleComposant )
            {
            // InternalBrowserAutomation.g:1773:2: ( ruleComposant )
            // InternalBrowserAutomation.g:1774:3: ruleComposant
            {
             before(grammarAccess.getClickAccess().getCComposantParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComposant();

            state._fsp--;

             after(grammarAccess.getClickAccess().getCComposantParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__CAssignment_1"


    // $ANTLR start "rule__Click__AAssignment_3"
    // InternalBrowserAutomation.g:1783:1: rule__Click__AAssignment_3 : ( ruleAttribut ) ;
    public final void rule__Click__AAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1787:1: ( ( ruleAttribut ) )
            // InternalBrowserAutomation.g:1788:2: ( ruleAttribut )
            {
            // InternalBrowserAutomation.g:1788:2: ( ruleAttribut )
            // InternalBrowserAutomation.g:1789:3: ruleAttribut
            {
             before(grammarAccess.getClickAccess().getAAttributParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getClickAccess().getAAttributParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__AAssignment_3"


    // $ANTLR start "rule__Click__SAssignment_5_0"
    // InternalBrowserAutomation.g:1798:1: rule__Click__SAssignment_5_0 : ( RULE_STRING ) ;
    public final void rule__Click__SAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1802:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:1803:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:1803:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:1804:3: RULE_STRING
            {
             before(grammarAccess.getClickAccess().getSSTRINGTerminalRuleCall_5_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getSSTRINGTerminalRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__SAssignment_5_0"


    // $ANTLR start "rule__Click__VAssignment_5_1"
    // InternalBrowserAutomation.g:1813:1: rule__Click__VAssignment_5_1 : ( ruleVarRef ) ;
    public final void rule__Click__VAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1817:1: ( ( ruleVarRef ) )
            // InternalBrowserAutomation.g:1818:2: ( ruleVarRef )
            {
            // InternalBrowserAutomation.g:1818:2: ( ruleVarRef )
            // InternalBrowserAutomation.g:1819:3: ruleVarRef
            {
             before(grammarAccess.getClickAccess().getVVarRefParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarRef();

            state._fsp--;

             after(grammarAccess.getClickAccess().getVVarRefParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Click__VAssignment_5_1"


    // $ANTLR start "rule__Set__AAssignment_1"
    // InternalBrowserAutomation.g:1828:1: rule__Set__AAssignment_1 : ( ruleAttribut ) ;
    public final void rule__Set__AAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1832:1: ( ( ruleAttribut ) )
            // InternalBrowserAutomation.g:1833:2: ( ruleAttribut )
            {
            // InternalBrowserAutomation.g:1833:2: ( ruleAttribut )
            // InternalBrowserAutomation.g:1834:3: ruleAttribut
            {
             before(grammarAccess.getSetAccess().getAAttributParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getSetAccess().getAAttributParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__AAssignment_1"


    // $ANTLR start "rule__Set__VAssignment_2_1"
    // InternalBrowserAutomation.g:1843:1: rule__Set__VAssignment_2_1 : ( ruleVarRef ) ;
    public final void rule__Set__VAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1847:1: ( ( ruleVarRef ) )
            // InternalBrowserAutomation.g:1848:2: ( ruleVarRef )
            {
            // InternalBrowserAutomation.g:1848:2: ( ruleVarRef )
            // InternalBrowserAutomation.g:1849:3: ruleVarRef
            {
             before(grammarAccess.getSetAccess().getVVarRefParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarRef();

            state._fsp--;

             after(grammarAccess.getSetAccess().getVVarRefParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__VAssignment_2_1"


    // $ANTLR start "rule__Set__A1Assignment_4"
    // InternalBrowserAutomation.g:1858:1: rule__Set__A1Assignment_4 : ( ruleAttribut ) ;
    public final void rule__Set__A1Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1862:1: ( ( ruleAttribut ) )
            // InternalBrowserAutomation.g:1863:2: ( ruleAttribut )
            {
            // InternalBrowserAutomation.g:1863:2: ( ruleAttribut )
            // InternalBrowserAutomation.g:1864:3: ruleAttribut
            {
             before(grammarAccess.getSetAccess().getA1AttributParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getSetAccess().getA1AttributParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__A1Assignment_4"


    // $ANTLR start "rule__Set__S1Assignment_6_0"
    // InternalBrowserAutomation.g:1873:1: rule__Set__S1Assignment_6_0 : ( RULE_STRING ) ;
    public final void rule__Set__S1Assignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1877:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:1878:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:1878:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:1879:3: RULE_STRING
            {
             before(grammarAccess.getSetAccess().getS1STRINGTerminalRuleCall_6_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getS1STRINGTerminalRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__S1Assignment_6_0"


    // $ANTLR start "rule__Set__VAssignment_6_1"
    // InternalBrowserAutomation.g:1888:1: rule__Set__VAssignment_6_1 : ( ruleVarRef ) ;
    public final void rule__Set__VAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1892:1: ( ( ruleVarRef ) )
            // InternalBrowserAutomation.g:1893:2: ( ruleVarRef )
            {
            // InternalBrowserAutomation.g:1893:2: ( ruleVarRef )
            // InternalBrowserAutomation.g:1894:3: ruleVarRef
            {
             before(grammarAccess.getSetAccess().getVVarRefParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarRef();

            state._fsp--;

             after(grammarAccess.getSetAccess().getVVarRefParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__VAssignment_6_1"


    // $ANTLR start "rule__Affectation__AAssignment_2_0_1"
    // InternalBrowserAutomation.g:1903:1: rule__Affectation__AAssignment_2_0_1 : ( ruleAttribut ) ;
    public final void rule__Affectation__AAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1907:1: ( ( ruleAttribut ) )
            // InternalBrowserAutomation.g:1908:2: ( ruleAttribut )
            {
            // InternalBrowserAutomation.g:1908:2: ( ruleAttribut )
            // InternalBrowserAutomation.g:1909:3: ruleAttribut
            {
             before(grammarAccess.getAffectationAccess().getAAttributParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getAffectationAccess().getAAttributParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__AAssignment_2_0_1"


    // $ANTLR start "rule__Affectation__A2Assignment_2_0_3"
    // InternalBrowserAutomation.g:1918:1: rule__Affectation__A2Assignment_2_0_3 : ( ruleAttribut ) ;
    public final void rule__Affectation__A2Assignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1922:1: ( ( ruleAttribut ) )
            // InternalBrowserAutomation.g:1923:2: ( ruleAttribut )
            {
            // InternalBrowserAutomation.g:1923:2: ( ruleAttribut )
            // InternalBrowserAutomation.g:1924:3: ruleAttribut
            {
             before(grammarAccess.getAffectationAccess().getA2AttributParserRuleCall_2_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribut();

            state._fsp--;

             after(grammarAccess.getAffectationAccess().getA2AttributParserRuleCall_2_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__A2Assignment_2_0_3"


    // $ANTLR start "rule__Affectation__VAssignment_2_0_5_1"
    // InternalBrowserAutomation.g:1933:1: rule__Affectation__VAssignment_2_0_5_1 : ( ruleVarRef ) ;
    public final void rule__Affectation__VAssignment_2_0_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1937:1: ( ( ruleVarRef ) )
            // InternalBrowserAutomation.g:1938:2: ( ruleVarRef )
            {
            // InternalBrowserAutomation.g:1938:2: ( ruleVarRef )
            // InternalBrowserAutomation.g:1939:3: ruleVarRef
            {
             before(grammarAccess.getAffectationAccess().getVVarRefParserRuleCall_2_0_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVarRef();

            state._fsp--;

             after(grammarAccess.getAffectationAccess().getVVarRefParserRuleCall_2_0_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Affectation__VAssignment_2_0_5_1"


    // $ANTLR start "rule__Variable__NameAssignment"
    // InternalBrowserAutomation.g:1948:1: rule__Variable__NameAssignment : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1952:1: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:1953:2: ( RULE_ID )
            {
            // InternalBrowserAutomation.g:1953:2: ( RULE_ID )
            // InternalBrowserAutomation.g:1954:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment"


    // $ANTLR start "rule__VarRef__VarAssignment"
    // InternalBrowserAutomation.g:1963:1: rule__VarRef__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VarRef__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1967:1: ( ( ( RULE_ID ) ) )
            // InternalBrowserAutomation.g:1968:2: ( ( RULE_ID ) )
            {
            // InternalBrowserAutomation.g:1968:2: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:1969:3: ( RULE_ID )
            {
             before(grammarAccess.getVarRefAccess().getVarVariableCrossReference_0()); 
            // InternalBrowserAutomation.g:1970:3: ( RULE_ID )
            // InternalBrowserAutomation.g:1971:4: RULE_ID
            {
             before(grammarAccess.getVarRefAccess().getVarVariableIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarRefAccess().getVarVariableIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVarRefAccess().getVarVariableCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarRef__VarAssignment"


    // $ANTLR start "rule__Composant__NameAssignment"
    // InternalBrowserAutomation.g:1982:1: rule__Composant__NameAssignment : ( RULE_ID ) ;
    public final void rule__Composant__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:1986:1: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:1987:2: ( RULE_ID )
            {
            // InternalBrowserAutomation.g:1987:2: ( RULE_ID )
            // InternalBrowserAutomation.g:1988:3: RULE_ID
            {
             before(grammarAccess.getComposantAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComposantAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Composant__NameAssignment"


    // $ANTLR start "rule__Attribut__NameAssignment"
    // InternalBrowserAutomation.g:1997:1: rule__Attribut__NameAssignment : ( RULE_ID ) ;
    public final void rule__Attribut__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2001:1: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:2002:2: ( RULE_ID )
            {
            // InternalBrowserAutomation.g:2002:2: ( RULE_ID )
            // InternalBrowserAutomation.g:2003:3: RULE_ID
            {
             before(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribut__NameAssignment"


    // $ANTLR start "rule__Browser__NameAssignment"
    // InternalBrowserAutomation.g:2012:1: rule__Browser__NameAssignment : ( RULE_ID ) ;
    public final void rule__Browser__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2016:1: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:2017:2: ( RULE_ID )
            {
            // InternalBrowserAutomation.g:2017:2: ( RULE_ID )
            // InternalBrowserAutomation.g:2018:3: RULE_ID
            {
             before(grammarAccess.getBrowserAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBrowserAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Browser__NameAssignment"


    // $ANTLR start "rule__Url__NameAssignment"
    // InternalBrowserAutomation.g:2027:1: rule__Url__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Url__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:2031:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:2032:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:2032:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:2033:3: RULE_STRING
            {
             before(grammarAccess.getUrlAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getUrlAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Url__NameAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000006A020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100010L});

}