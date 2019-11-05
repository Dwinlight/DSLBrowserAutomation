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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GOTO'", "'ON'", "'CLICK'", "'WHERE'", "'CONTAINS'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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


    // $ANTLR start "entryRuleClick"
    // InternalBrowserAutomation.g:103:1: entryRuleClick : ruleClick EOF ;
    public final void entryRuleClick() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:104:1: ( ruleClick EOF )
            // InternalBrowserAutomation.g:105:1: ruleClick EOF
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
    // InternalBrowserAutomation.g:112:1: ruleClick : ( ( rule__Click__Group__0 ) ) ;
    public final void ruleClick() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:116:2: ( ( ( rule__Click__Group__0 ) ) )
            // InternalBrowserAutomation.g:117:2: ( ( rule__Click__Group__0 ) )
            {
            // InternalBrowserAutomation.g:117:2: ( ( rule__Click__Group__0 ) )
            // InternalBrowserAutomation.g:118:3: ( rule__Click__Group__0 )
            {
             before(grammarAccess.getClickAccess().getGroup()); 
            // InternalBrowserAutomation.g:119:3: ( rule__Click__Group__0 )
            // InternalBrowserAutomation.g:119:4: rule__Click__Group__0
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


    // $ANTLR start "entryRuleComposant"
    // InternalBrowserAutomation.g:128:1: entryRuleComposant : ruleComposant EOF ;
    public final void entryRuleComposant() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:129:1: ( ruleComposant EOF )
            // InternalBrowserAutomation.g:130:1: ruleComposant EOF
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
    // InternalBrowserAutomation.g:137:1: ruleComposant : ( ( rule__Composant__NameAssignment ) ) ;
    public final void ruleComposant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:141:2: ( ( ( rule__Composant__NameAssignment ) ) )
            // InternalBrowserAutomation.g:142:2: ( ( rule__Composant__NameAssignment ) )
            {
            // InternalBrowserAutomation.g:142:2: ( ( rule__Composant__NameAssignment ) )
            // InternalBrowserAutomation.g:143:3: ( rule__Composant__NameAssignment )
            {
             before(grammarAccess.getComposantAccess().getNameAssignment()); 
            // InternalBrowserAutomation.g:144:3: ( rule__Composant__NameAssignment )
            // InternalBrowserAutomation.g:144:4: rule__Composant__NameAssignment
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
    // InternalBrowserAutomation.g:153:1: entryRuleAttribut : ruleAttribut EOF ;
    public final void entryRuleAttribut() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:154:1: ( ruleAttribut EOF )
            // InternalBrowserAutomation.g:155:1: ruleAttribut EOF
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
    // InternalBrowserAutomation.g:162:1: ruleAttribut : ( ( rule__Attribut__NameAssignment ) ) ;
    public final void ruleAttribut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:166:2: ( ( ( rule__Attribut__NameAssignment ) ) )
            // InternalBrowserAutomation.g:167:2: ( ( rule__Attribut__NameAssignment ) )
            {
            // InternalBrowserAutomation.g:167:2: ( ( rule__Attribut__NameAssignment ) )
            // InternalBrowserAutomation.g:168:3: ( rule__Attribut__NameAssignment )
            {
             before(grammarAccess.getAttributAccess().getNameAssignment()); 
            // InternalBrowserAutomation.g:169:3: ( rule__Attribut__NameAssignment )
            // InternalBrowserAutomation.g:169:4: rule__Attribut__NameAssignment
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
    // InternalBrowserAutomation.g:178:1: entryRuleBrowser : ruleBrowser EOF ;
    public final void entryRuleBrowser() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:179:1: ( ruleBrowser EOF )
            // InternalBrowserAutomation.g:180:1: ruleBrowser EOF
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
    // InternalBrowserAutomation.g:187:1: ruleBrowser : ( ( rule__Browser__NameAssignment ) ) ;
    public final void ruleBrowser() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:191:2: ( ( ( rule__Browser__NameAssignment ) ) )
            // InternalBrowserAutomation.g:192:2: ( ( rule__Browser__NameAssignment ) )
            {
            // InternalBrowserAutomation.g:192:2: ( ( rule__Browser__NameAssignment ) )
            // InternalBrowserAutomation.g:193:3: ( rule__Browser__NameAssignment )
            {
             before(grammarAccess.getBrowserAccess().getNameAssignment()); 
            // InternalBrowserAutomation.g:194:3: ( rule__Browser__NameAssignment )
            // InternalBrowserAutomation.g:194:4: rule__Browser__NameAssignment
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
    // InternalBrowserAutomation.g:203:1: entryRuleUrl : ruleUrl EOF ;
    public final void entryRuleUrl() throws RecognitionException {
        try {
            // InternalBrowserAutomation.g:204:1: ( ruleUrl EOF )
            // InternalBrowserAutomation.g:205:1: ruleUrl EOF
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
    // InternalBrowserAutomation.g:212:1: ruleUrl : ( ( rule__Url__NameAssignment ) ) ;
    public final void ruleUrl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:216:2: ( ( ( rule__Url__NameAssignment ) ) )
            // InternalBrowserAutomation.g:217:2: ( ( rule__Url__NameAssignment ) )
            {
            // InternalBrowserAutomation.g:217:2: ( ( rule__Url__NameAssignment ) )
            // InternalBrowserAutomation.g:218:3: ( rule__Url__NameAssignment )
            {
             before(grammarAccess.getUrlAccess().getNameAssignment()); 
            // InternalBrowserAutomation.g:219:3: ( rule__Url__NameAssignment )
            // InternalBrowserAutomation.g:219:4: rule__Url__NameAssignment
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


    // $ANTLR start "rule__Model__Group__0"
    // InternalBrowserAutomation.g:227:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:231:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalBrowserAutomation.g:232:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalBrowserAutomation.g:239:1: rule__Model__Group__0__Impl : ( ( rule__Model__TisiAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:243:1: ( ( ( rule__Model__TisiAssignment_0 ) ) )
            // InternalBrowserAutomation.g:244:1: ( ( rule__Model__TisiAssignment_0 ) )
            {
            // InternalBrowserAutomation.g:244:1: ( ( rule__Model__TisiAssignment_0 ) )
            // InternalBrowserAutomation.g:245:2: ( rule__Model__TisiAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getTisiAssignment_0()); 
            // InternalBrowserAutomation.g:246:2: ( rule__Model__TisiAssignment_0 )
            // InternalBrowserAutomation.g:246:3: rule__Model__TisiAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__TisiAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getTisiAssignment_0()); 

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
    // InternalBrowserAutomation.g:254:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:258:1: ( rule__Model__Group__1__Impl )
            // InternalBrowserAutomation.g:259:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // InternalBrowserAutomation.g:265:1: rule__Model__Group__1__Impl : ( ( rule__Model__TisiAssignment_1 )? ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:269:1: ( ( ( rule__Model__TisiAssignment_1 )? ) )
            // InternalBrowserAutomation.g:270:1: ( ( rule__Model__TisiAssignment_1 )? )
            {
            // InternalBrowserAutomation.g:270:1: ( ( rule__Model__TisiAssignment_1 )? )
            // InternalBrowserAutomation.g:271:2: ( rule__Model__TisiAssignment_1 )?
            {
             before(grammarAccess.getModelAccess().getTisiAssignment_1()); 
            // InternalBrowserAutomation.g:272:2: ( rule__Model__TisiAssignment_1 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBrowserAutomation.g:272:3: rule__Model__TisiAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__TisiAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getTisiAssignment_1()); 

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


    // $ANTLR start "rule__Launch__Group__0"
    // InternalBrowserAutomation.g:281:1: rule__Launch__Group__0 : rule__Launch__Group__0__Impl rule__Launch__Group__1 ;
    public final void rule__Launch__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:285:1: ( rule__Launch__Group__0__Impl rule__Launch__Group__1 )
            // InternalBrowserAutomation.g:286:2: rule__Launch__Group__0__Impl rule__Launch__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBrowserAutomation.g:293:1: rule__Launch__Group__0__Impl : ( 'GOTO' ) ;
    public final void rule__Launch__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:297:1: ( ( 'GOTO' ) )
            // InternalBrowserAutomation.g:298:1: ( 'GOTO' )
            {
            // InternalBrowserAutomation.g:298:1: ( 'GOTO' )
            // InternalBrowserAutomation.g:299:2: 'GOTO'
            {
             before(grammarAccess.getLaunchAccess().getGOTOKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:308:1: rule__Launch__Group__1 : rule__Launch__Group__1__Impl rule__Launch__Group__2 ;
    public final void rule__Launch__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:312:1: ( rule__Launch__Group__1__Impl rule__Launch__Group__2 )
            // InternalBrowserAutomation.g:313:2: rule__Launch__Group__1__Impl rule__Launch__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalBrowserAutomation.g:320:1: rule__Launch__Group__1__Impl : ( ( rule__Launch__UAssignment_1 ) ) ;
    public final void rule__Launch__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:324:1: ( ( ( rule__Launch__UAssignment_1 ) ) )
            // InternalBrowserAutomation.g:325:1: ( ( rule__Launch__UAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:325:1: ( ( rule__Launch__UAssignment_1 ) )
            // InternalBrowserAutomation.g:326:2: ( rule__Launch__UAssignment_1 )
            {
             before(grammarAccess.getLaunchAccess().getUAssignment_1()); 
            // InternalBrowserAutomation.g:327:2: ( rule__Launch__UAssignment_1 )
            // InternalBrowserAutomation.g:327:3: rule__Launch__UAssignment_1
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
    // InternalBrowserAutomation.g:335:1: rule__Launch__Group__2 : rule__Launch__Group__2__Impl rule__Launch__Group__3 ;
    public final void rule__Launch__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:339:1: ( rule__Launch__Group__2__Impl rule__Launch__Group__3 )
            // InternalBrowserAutomation.g:340:2: rule__Launch__Group__2__Impl rule__Launch__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalBrowserAutomation.g:347:1: rule__Launch__Group__2__Impl : ( 'ON' ) ;
    public final void rule__Launch__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:351:1: ( ( 'ON' ) )
            // InternalBrowserAutomation.g:352:1: ( 'ON' )
            {
            // InternalBrowserAutomation.g:352:1: ( 'ON' )
            // InternalBrowserAutomation.g:353:2: 'ON'
            {
             before(grammarAccess.getLaunchAccess().getONKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:362:1: rule__Launch__Group__3 : rule__Launch__Group__3__Impl ;
    public final void rule__Launch__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:366:1: ( rule__Launch__Group__3__Impl )
            // InternalBrowserAutomation.g:367:2: rule__Launch__Group__3__Impl
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
    // InternalBrowserAutomation.g:373:1: rule__Launch__Group__3__Impl : ( ( rule__Launch__BAssignment_3 ) ) ;
    public final void rule__Launch__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:377:1: ( ( ( rule__Launch__BAssignment_3 ) ) )
            // InternalBrowserAutomation.g:378:1: ( ( rule__Launch__BAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:378:1: ( ( rule__Launch__BAssignment_3 ) )
            // InternalBrowserAutomation.g:379:2: ( rule__Launch__BAssignment_3 )
            {
             before(grammarAccess.getLaunchAccess().getBAssignment_3()); 
            // InternalBrowserAutomation.g:380:2: ( rule__Launch__BAssignment_3 )
            // InternalBrowserAutomation.g:380:3: rule__Launch__BAssignment_3
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


    // $ANTLR start "rule__Click__Group__0"
    // InternalBrowserAutomation.g:389:1: rule__Click__Group__0 : rule__Click__Group__0__Impl rule__Click__Group__1 ;
    public final void rule__Click__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:393:1: ( rule__Click__Group__0__Impl rule__Click__Group__1 )
            // InternalBrowserAutomation.g:394:2: rule__Click__Group__0__Impl rule__Click__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalBrowserAutomation.g:401:1: rule__Click__Group__0__Impl : ( 'CLICK' ) ;
    public final void rule__Click__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:405:1: ( ( 'CLICK' ) )
            // InternalBrowserAutomation.g:406:1: ( 'CLICK' )
            {
            // InternalBrowserAutomation.g:406:1: ( 'CLICK' )
            // InternalBrowserAutomation.g:407:2: 'CLICK'
            {
             before(grammarAccess.getClickAccess().getCLICKKeyword_0()); 
            match(input,13,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:416:1: rule__Click__Group__1 : rule__Click__Group__1__Impl rule__Click__Group__2 ;
    public final void rule__Click__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:420:1: ( rule__Click__Group__1__Impl rule__Click__Group__2 )
            // InternalBrowserAutomation.g:421:2: rule__Click__Group__1__Impl rule__Click__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalBrowserAutomation.g:428:1: rule__Click__Group__1__Impl : ( ( rule__Click__CAssignment_1 ) ) ;
    public final void rule__Click__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:432:1: ( ( ( rule__Click__CAssignment_1 ) ) )
            // InternalBrowserAutomation.g:433:1: ( ( rule__Click__CAssignment_1 ) )
            {
            // InternalBrowserAutomation.g:433:1: ( ( rule__Click__CAssignment_1 ) )
            // InternalBrowserAutomation.g:434:2: ( rule__Click__CAssignment_1 )
            {
             before(grammarAccess.getClickAccess().getCAssignment_1()); 
            // InternalBrowserAutomation.g:435:2: ( rule__Click__CAssignment_1 )
            // InternalBrowserAutomation.g:435:3: rule__Click__CAssignment_1
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
    // InternalBrowserAutomation.g:443:1: rule__Click__Group__2 : rule__Click__Group__2__Impl rule__Click__Group__3 ;
    public final void rule__Click__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:447:1: ( rule__Click__Group__2__Impl rule__Click__Group__3 )
            // InternalBrowserAutomation.g:448:2: rule__Click__Group__2__Impl rule__Click__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalBrowserAutomation.g:455:1: rule__Click__Group__2__Impl : ( 'WHERE' ) ;
    public final void rule__Click__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:459:1: ( ( 'WHERE' ) )
            // InternalBrowserAutomation.g:460:1: ( 'WHERE' )
            {
            // InternalBrowserAutomation.g:460:1: ( 'WHERE' )
            // InternalBrowserAutomation.g:461:2: 'WHERE'
            {
             before(grammarAccess.getClickAccess().getWHEREKeyword_2()); 
            match(input,14,FOLLOW_2); 
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
    // InternalBrowserAutomation.g:470:1: rule__Click__Group__3 : rule__Click__Group__3__Impl rule__Click__Group__4 ;
    public final void rule__Click__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:474:1: ( rule__Click__Group__3__Impl rule__Click__Group__4 )
            // InternalBrowserAutomation.g:475:2: rule__Click__Group__3__Impl rule__Click__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalBrowserAutomation.g:482:1: rule__Click__Group__3__Impl : ( ( rule__Click__AAssignment_3 ) ) ;
    public final void rule__Click__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:486:1: ( ( ( rule__Click__AAssignment_3 ) ) )
            // InternalBrowserAutomation.g:487:1: ( ( rule__Click__AAssignment_3 ) )
            {
            // InternalBrowserAutomation.g:487:1: ( ( rule__Click__AAssignment_3 ) )
            // InternalBrowserAutomation.g:488:2: ( rule__Click__AAssignment_3 )
            {
             before(grammarAccess.getClickAccess().getAAssignment_3()); 
            // InternalBrowserAutomation.g:489:2: ( rule__Click__AAssignment_3 )
            // InternalBrowserAutomation.g:489:3: rule__Click__AAssignment_3
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
    // InternalBrowserAutomation.g:497:1: rule__Click__Group__4 : rule__Click__Group__4__Impl rule__Click__Group__5 ;
    public final void rule__Click__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:501:1: ( rule__Click__Group__4__Impl rule__Click__Group__5 )
            // InternalBrowserAutomation.g:502:2: rule__Click__Group__4__Impl rule__Click__Group__5
            {
            pushFollow(FOLLOW_4);
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
    // InternalBrowserAutomation.g:509:1: rule__Click__Group__4__Impl : ( 'CONTAINS' ) ;
    public final void rule__Click__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:513:1: ( ( 'CONTAINS' ) )
            // InternalBrowserAutomation.g:514:1: ( 'CONTAINS' )
            {
            // InternalBrowserAutomation.g:514:1: ( 'CONTAINS' )
            // InternalBrowserAutomation.g:515:2: 'CONTAINS'
            {
             before(grammarAccess.getClickAccess().getCONTAINSKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getCONTAINSKeyword_4()); 

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
    // InternalBrowserAutomation.g:524:1: rule__Click__Group__5 : rule__Click__Group__5__Impl ;
    public final void rule__Click__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:528:1: ( rule__Click__Group__5__Impl )
            // InternalBrowserAutomation.g:529:2: rule__Click__Group__5__Impl
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
    // InternalBrowserAutomation.g:535:1: rule__Click__Group__5__Impl : ( RULE_STRING ) ;
    public final void rule__Click__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:539:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:540:1: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:540:1: ( RULE_STRING )
            // InternalBrowserAutomation.g:541:2: RULE_STRING
            {
             before(grammarAccess.getClickAccess().getSTRINGTerminalRuleCall_5()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getClickAccess().getSTRINGTerminalRuleCall_5()); 

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


    // $ANTLR start "rule__Model__TisiAssignment_0"
    // InternalBrowserAutomation.g:551:1: rule__Model__TisiAssignment_0 : ( ruleLaunch ) ;
    public final void rule__Model__TisiAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:555:1: ( ( ruleLaunch ) )
            // InternalBrowserAutomation.g:556:2: ( ruleLaunch )
            {
            // InternalBrowserAutomation.g:556:2: ( ruleLaunch )
            // InternalBrowserAutomation.g:557:3: ruleLaunch
            {
             before(grammarAccess.getModelAccess().getTisiLaunchParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLaunch();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTisiLaunchParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__TisiAssignment_0"


    // $ANTLR start "rule__Model__TisiAssignment_1"
    // InternalBrowserAutomation.g:566:1: rule__Model__TisiAssignment_1 : ( ruleClick ) ;
    public final void rule__Model__TisiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:570:1: ( ( ruleClick ) )
            // InternalBrowserAutomation.g:571:2: ( ruleClick )
            {
            // InternalBrowserAutomation.g:571:2: ( ruleClick )
            // InternalBrowserAutomation.g:572:3: ruleClick
            {
             before(grammarAccess.getModelAccess().getTisiClickParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleClick();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTisiClickParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__TisiAssignment_1"


    // $ANTLR start "rule__Launch__UAssignment_1"
    // InternalBrowserAutomation.g:581:1: rule__Launch__UAssignment_1 : ( ruleUrl ) ;
    public final void rule__Launch__UAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:585:1: ( ( ruleUrl ) )
            // InternalBrowserAutomation.g:586:2: ( ruleUrl )
            {
            // InternalBrowserAutomation.g:586:2: ( ruleUrl )
            // InternalBrowserAutomation.g:587:3: ruleUrl
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
    // InternalBrowserAutomation.g:596:1: rule__Launch__BAssignment_3 : ( ruleBrowser ) ;
    public final void rule__Launch__BAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:600:1: ( ( ruleBrowser ) )
            // InternalBrowserAutomation.g:601:2: ( ruleBrowser )
            {
            // InternalBrowserAutomation.g:601:2: ( ruleBrowser )
            // InternalBrowserAutomation.g:602:3: ruleBrowser
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


    // $ANTLR start "rule__Click__CAssignment_1"
    // InternalBrowserAutomation.g:611:1: rule__Click__CAssignment_1 : ( ruleComposant ) ;
    public final void rule__Click__CAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:615:1: ( ( ruleComposant ) )
            // InternalBrowserAutomation.g:616:2: ( ruleComposant )
            {
            // InternalBrowserAutomation.g:616:2: ( ruleComposant )
            // InternalBrowserAutomation.g:617:3: ruleComposant
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
    // InternalBrowserAutomation.g:626:1: rule__Click__AAssignment_3 : ( ruleAttribut ) ;
    public final void rule__Click__AAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:630:1: ( ( ruleAttribut ) )
            // InternalBrowserAutomation.g:631:2: ( ruleAttribut )
            {
            // InternalBrowserAutomation.g:631:2: ( ruleAttribut )
            // InternalBrowserAutomation.g:632:3: ruleAttribut
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


    // $ANTLR start "rule__Composant__NameAssignment"
    // InternalBrowserAutomation.g:641:1: rule__Composant__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Composant__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:645:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:646:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:646:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:647:3: RULE_STRING
            {
             before(grammarAccess.getComposantAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComposantAccess().getNameSTRINGTerminalRuleCall_0()); 

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
    // InternalBrowserAutomation.g:656:1: rule__Attribut__NameAssignment : ( RULE_ID ) ;
    public final void rule__Attribut__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:660:1: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:661:2: ( RULE_ID )
            {
            // InternalBrowserAutomation.g:661:2: ( RULE_ID )
            // InternalBrowserAutomation.g:662:3: RULE_ID
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
    // InternalBrowserAutomation.g:671:1: rule__Browser__NameAssignment : ( RULE_ID ) ;
    public final void rule__Browser__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:675:1: ( ( RULE_ID ) )
            // InternalBrowserAutomation.g:676:2: ( RULE_ID )
            {
            // InternalBrowserAutomation.g:676:2: ( RULE_ID )
            // InternalBrowserAutomation.g:677:3: RULE_ID
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
    // InternalBrowserAutomation.g:686:1: rule__Url__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Url__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrowserAutomation.g:690:1: ( ( RULE_STRING ) )
            // InternalBrowserAutomation.g:691:2: ( RULE_STRING )
            {
            // InternalBrowserAutomation.g:691:2: ( RULE_STRING )
            // InternalBrowserAutomation.g:692:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});

}