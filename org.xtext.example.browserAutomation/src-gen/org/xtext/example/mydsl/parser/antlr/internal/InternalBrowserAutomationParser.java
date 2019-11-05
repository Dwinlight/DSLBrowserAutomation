package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.BrowserAutomationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrowserAutomationParser extends AbstractInternalAntlrParser {
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

        public InternalBrowserAutomationParser(TokenStream input, BrowserAutomationGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BrowserAutomationGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBrowserAutomation.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBrowserAutomation.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBrowserAutomation.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBrowserAutomation.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_tisi_0_0= ruleLaunch ) ) ( (lv_tisi_1_0= ruleClick ) )? ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_tisi_0_0 = null;

        EObject lv_tisi_1_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:77:2: ( ( ( (lv_tisi_0_0= ruleLaunch ) ) ( (lv_tisi_1_0= ruleClick ) )? ) )
            // InternalBrowserAutomation.g:78:2: ( ( (lv_tisi_0_0= ruleLaunch ) ) ( (lv_tisi_1_0= ruleClick ) )? )
            {
            // InternalBrowserAutomation.g:78:2: ( ( (lv_tisi_0_0= ruleLaunch ) ) ( (lv_tisi_1_0= ruleClick ) )? )
            // InternalBrowserAutomation.g:79:3: ( (lv_tisi_0_0= ruleLaunch ) ) ( (lv_tisi_1_0= ruleClick ) )?
            {
            // InternalBrowserAutomation.g:79:3: ( (lv_tisi_0_0= ruleLaunch ) )
            // InternalBrowserAutomation.g:80:4: (lv_tisi_0_0= ruleLaunch )
            {
            // InternalBrowserAutomation.g:80:4: (lv_tisi_0_0= ruleLaunch )
            // InternalBrowserAutomation.g:81:5: lv_tisi_0_0= ruleLaunch
            {

            					newCompositeNode(grammarAccess.getModelAccess().getTisiLaunchParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_tisi_0_0=ruleLaunch();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"tisi",
            						lv_tisi_0_0,
            						"org.xtext.example.mydsl.BrowserAutomation.Launch");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowserAutomation.g:98:3: ( (lv_tisi_1_0= ruleClick ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalBrowserAutomation.g:99:4: (lv_tisi_1_0= ruleClick )
                    {
                    // InternalBrowserAutomation.g:99:4: (lv_tisi_1_0= ruleClick )
                    // InternalBrowserAutomation.g:100:5: lv_tisi_1_0= ruleClick
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getTisiClickParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_tisi_1_0=ruleClick();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					add(
                    						current,
                    						"tisi",
                    						lv_tisi_1_0,
                    						"org.xtext.example.mydsl.BrowserAutomation.Click");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleLaunch"
    // InternalBrowserAutomation.g:121:1: entryRuleLaunch returns [EObject current=null] : iv_ruleLaunch= ruleLaunch EOF ;
    public final EObject entryRuleLaunch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLaunch = null;


        try {
            // InternalBrowserAutomation.g:121:47: (iv_ruleLaunch= ruleLaunch EOF )
            // InternalBrowserAutomation.g:122:2: iv_ruleLaunch= ruleLaunch EOF
            {
             newCompositeNode(grammarAccess.getLaunchRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLaunch=ruleLaunch();

            state._fsp--;

             current =iv_ruleLaunch; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLaunch"


    // $ANTLR start "ruleLaunch"
    // InternalBrowserAutomation.g:128:1: ruleLaunch returns [EObject current=null] : (otherlv_0= 'GOTO' ( (lv_u_1_0= ruleUrl ) ) otherlv_2= 'ON' ( (lv_b_3_0= ruleBrowser ) ) ) ;
    public final EObject ruleLaunch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_u_1_0 = null;

        EObject lv_b_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:134:2: ( (otherlv_0= 'GOTO' ( (lv_u_1_0= ruleUrl ) ) otherlv_2= 'ON' ( (lv_b_3_0= ruleBrowser ) ) ) )
            // InternalBrowserAutomation.g:135:2: (otherlv_0= 'GOTO' ( (lv_u_1_0= ruleUrl ) ) otherlv_2= 'ON' ( (lv_b_3_0= ruleBrowser ) ) )
            {
            // InternalBrowserAutomation.g:135:2: (otherlv_0= 'GOTO' ( (lv_u_1_0= ruleUrl ) ) otherlv_2= 'ON' ( (lv_b_3_0= ruleBrowser ) ) )
            // InternalBrowserAutomation.g:136:3: otherlv_0= 'GOTO' ( (lv_u_1_0= ruleUrl ) ) otherlv_2= 'ON' ( (lv_b_3_0= ruleBrowser ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLaunchAccess().getGOTOKeyword_0());
            		
            // InternalBrowserAutomation.g:140:3: ( (lv_u_1_0= ruleUrl ) )
            // InternalBrowserAutomation.g:141:4: (lv_u_1_0= ruleUrl )
            {
            // InternalBrowserAutomation.g:141:4: (lv_u_1_0= ruleUrl )
            // InternalBrowserAutomation.g:142:5: lv_u_1_0= ruleUrl
            {

            					newCompositeNode(grammarAccess.getLaunchAccess().getUUrlParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_u_1_0=ruleUrl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLaunchRule());
            					}
            					set(
            						current,
            						"u",
            						lv_u_1_0,
            						"org.xtext.example.mydsl.BrowserAutomation.Url");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getLaunchAccess().getONKeyword_2());
            		
            // InternalBrowserAutomation.g:163:3: ( (lv_b_3_0= ruleBrowser ) )
            // InternalBrowserAutomation.g:164:4: (lv_b_3_0= ruleBrowser )
            {
            // InternalBrowserAutomation.g:164:4: (lv_b_3_0= ruleBrowser )
            // InternalBrowserAutomation.g:165:5: lv_b_3_0= ruleBrowser
            {

            					newCompositeNode(grammarAccess.getLaunchAccess().getBBrowserParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_b_3_0=ruleBrowser();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLaunchRule());
            					}
            					set(
            						current,
            						"b",
            						lv_b_3_0,
            						"org.xtext.example.mydsl.BrowserAutomation.Browser");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLaunch"


    // $ANTLR start "entryRuleClick"
    // InternalBrowserAutomation.g:186:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalBrowserAutomation.g:186:46: (iv_ruleClick= ruleClick EOF )
            // InternalBrowserAutomation.g:187:2: iv_ruleClick= ruleClick EOF
            {
             newCompositeNode(grammarAccess.getClickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClick=ruleClick();

            state._fsp--;

             current =iv_ruleClick; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClick"


    // $ANTLR start "ruleClick"
    // InternalBrowserAutomation.g:193:1: ruleClick returns [EObject current=null] : (otherlv_0= 'CLICK' ( (lv_c_1_0= ruleComposant ) ) otherlv_2= 'WHERE' ( (lv_a_3_0= ruleAttribut ) ) otherlv_4= 'CONTAINS' this_STRING_5= RULE_STRING ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_STRING_5=null;
        EObject lv_c_1_0 = null;

        EObject lv_a_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:199:2: ( (otherlv_0= 'CLICK' ( (lv_c_1_0= ruleComposant ) ) otherlv_2= 'WHERE' ( (lv_a_3_0= ruleAttribut ) ) otherlv_4= 'CONTAINS' this_STRING_5= RULE_STRING ) )
            // InternalBrowserAutomation.g:200:2: (otherlv_0= 'CLICK' ( (lv_c_1_0= ruleComposant ) ) otherlv_2= 'WHERE' ( (lv_a_3_0= ruleAttribut ) ) otherlv_4= 'CONTAINS' this_STRING_5= RULE_STRING )
            {
            // InternalBrowserAutomation.g:200:2: (otherlv_0= 'CLICK' ( (lv_c_1_0= ruleComposant ) ) otherlv_2= 'WHERE' ( (lv_a_3_0= ruleAttribut ) ) otherlv_4= 'CONTAINS' this_STRING_5= RULE_STRING )
            // InternalBrowserAutomation.g:201:3: otherlv_0= 'CLICK' ( (lv_c_1_0= ruleComposant ) ) otherlv_2= 'WHERE' ( (lv_a_3_0= ruleAttribut ) ) otherlv_4= 'CONTAINS' this_STRING_5= RULE_STRING
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getCLICKKeyword_0());
            		
            // InternalBrowserAutomation.g:205:3: ( (lv_c_1_0= ruleComposant ) )
            // InternalBrowserAutomation.g:206:4: (lv_c_1_0= ruleComposant )
            {
            // InternalBrowserAutomation.g:206:4: (lv_c_1_0= ruleComposant )
            // InternalBrowserAutomation.g:207:5: lv_c_1_0= ruleComposant
            {

            					newCompositeNode(grammarAccess.getClickAccess().getCComposantParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_c_1_0=ruleComposant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
            					}
            					set(
            						current,
            						"c",
            						lv_c_1_0,
            						"org.xtext.example.mydsl.BrowserAutomation.Composant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getClickAccess().getWHEREKeyword_2());
            		
            // InternalBrowserAutomation.g:228:3: ( (lv_a_3_0= ruleAttribut ) )
            // InternalBrowserAutomation.g:229:4: (lv_a_3_0= ruleAttribut )
            {
            // InternalBrowserAutomation.g:229:4: (lv_a_3_0= ruleAttribut )
            // InternalBrowserAutomation.g:230:5: lv_a_3_0= ruleAttribut
            {

            					newCompositeNode(grammarAccess.getClickAccess().getAAttributParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_a_3_0=ruleAttribut();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClickRule());
            					}
            					set(
            						current,
            						"a",
            						lv_a_3_0,
            						"org.xtext.example.mydsl.BrowserAutomation.Attribut");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getClickAccess().getCONTAINSKeyword_4());
            		
            this_STRING_5=(Token)match(input,RULE_STRING,FOLLOW_2); 

            			newLeafNode(this_STRING_5, grammarAccess.getClickAccess().getSTRINGTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleComposant"
    // InternalBrowserAutomation.g:259:1: entryRuleComposant returns [EObject current=null] : iv_ruleComposant= ruleComposant EOF ;
    public final EObject entryRuleComposant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposant = null;


        try {
            // InternalBrowserAutomation.g:259:50: (iv_ruleComposant= ruleComposant EOF )
            // InternalBrowserAutomation.g:260:2: iv_ruleComposant= ruleComposant EOF
            {
             newCompositeNode(grammarAccess.getComposantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComposant=ruleComposant();

            state._fsp--;

             current =iv_ruleComposant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComposant"


    // $ANTLR start "ruleComposant"
    // InternalBrowserAutomation.g:266:1: ruleComposant returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleComposant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:272:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:273:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalBrowserAutomation.g:273:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:274:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:274:3: (lv_name_0_0= RULE_STRING )
            // InternalBrowserAutomation.g:275:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getComposantAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getComposantRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComposant"


    // $ANTLR start "entryRuleAttribut"
    // InternalBrowserAutomation.g:294:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalBrowserAutomation.g:294:49: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalBrowserAutomation.g:295:2: iv_ruleAttribut= ruleAttribut EOF
            {
             newCompositeNode(grammarAccess.getAttributRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribut=ruleAttribut();

            state._fsp--;

             current =iv_ruleAttribut; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribut"


    // $ANTLR start "ruleAttribut"
    // InternalBrowserAutomation.g:301:1: ruleAttribut returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:307:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:308:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:308:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBrowserAutomation.g:309:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:309:3: (lv_name_0_0= RULE_ID )
            // InternalBrowserAutomation.g:310:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getAttributAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAttributRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribut"


    // $ANTLR start "entryRuleBrowser"
    // InternalBrowserAutomation.g:329:1: entryRuleBrowser returns [EObject current=null] : iv_ruleBrowser= ruleBrowser EOF ;
    public final EObject entryRuleBrowser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrowser = null;


        try {
            // InternalBrowserAutomation.g:329:48: (iv_ruleBrowser= ruleBrowser EOF )
            // InternalBrowserAutomation.g:330:2: iv_ruleBrowser= ruleBrowser EOF
            {
             newCompositeNode(grammarAccess.getBrowserRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrowser=ruleBrowser();

            state._fsp--;

             current =iv_ruleBrowser; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBrowser"


    // $ANTLR start "ruleBrowser"
    // InternalBrowserAutomation.g:336:1: ruleBrowser returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBrowser() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:342:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:343:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:343:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBrowserAutomation.g:344:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:344:3: (lv_name_0_0= RULE_ID )
            // InternalBrowserAutomation.g:345:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getBrowserAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBrowserRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrowser"


    // $ANTLR start "entryRuleUrl"
    // InternalBrowserAutomation.g:364:1: entryRuleUrl returns [EObject current=null] : iv_ruleUrl= ruleUrl EOF ;
    public final EObject entryRuleUrl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrl = null;


        try {
            // InternalBrowserAutomation.g:364:44: (iv_ruleUrl= ruleUrl EOF )
            // InternalBrowserAutomation.g:365:2: iv_ruleUrl= ruleUrl EOF
            {
             newCompositeNode(grammarAccess.getUrlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUrl=ruleUrl();

            state._fsp--;

             current =iv_ruleUrl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUrl"


    // $ANTLR start "ruleUrl"
    // InternalBrowserAutomation.g:371:1: ruleUrl returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleUrl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:377:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:378:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalBrowserAutomation.g:378:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:379:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:379:3: (lv_name_0_0= RULE_STRING )
            // InternalBrowserAutomation.g:380:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getUrlAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getUrlRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUrl"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});

}