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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'GOTO'", "'ON'", "'FIND'", "'WHERE'", "'CONTAINS'", "'EQUALS'", "'CLICK'", "'SET'", "'='", "'GET'"
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
    // InternalBrowserAutomation.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_tisi_0_0= ruleLaunch ) ) ( (lv_tisi_1_0= ruleAffectation ) )* ( (lv_tisi_2_0= ruleLaunch ) )? ( (lv_tisi_3_0= ruleSet ) )* ( (lv_tisi_4_0= ruleClick ) )* ( (lv_tisi_5_0= ruleFind ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_tisi_0_0 = null;

        EObject lv_tisi_1_0 = null;

        EObject lv_tisi_2_0 = null;

        EObject lv_tisi_3_0 = null;

        EObject lv_tisi_4_0 = null;

        EObject lv_tisi_5_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:77:2: ( ( ( (lv_tisi_0_0= ruleLaunch ) ) ( (lv_tisi_1_0= ruleAffectation ) )* ( (lv_tisi_2_0= ruleLaunch ) )? ( (lv_tisi_3_0= ruleSet ) )* ( (lv_tisi_4_0= ruleClick ) )* ( (lv_tisi_5_0= ruleFind ) )* ) )
            // InternalBrowserAutomation.g:78:2: ( ( (lv_tisi_0_0= ruleLaunch ) ) ( (lv_tisi_1_0= ruleAffectation ) )* ( (lv_tisi_2_0= ruleLaunch ) )? ( (lv_tisi_3_0= ruleSet ) )* ( (lv_tisi_4_0= ruleClick ) )* ( (lv_tisi_5_0= ruleFind ) )* )
            {
            // InternalBrowserAutomation.g:78:2: ( ( (lv_tisi_0_0= ruleLaunch ) ) ( (lv_tisi_1_0= ruleAffectation ) )* ( (lv_tisi_2_0= ruleLaunch ) )? ( (lv_tisi_3_0= ruleSet ) )* ( (lv_tisi_4_0= ruleClick ) )* ( (lv_tisi_5_0= ruleFind ) )* )
            // InternalBrowserAutomation.g:79:3: ( (lv_tisi_0_0= ruleLaunch ) ) ( (lv_tisi_1_0= ruleAffectation ) )* ( (lv_tisi_2_0= ruleLaunch ) )? ( (lv_tisi_3_0= ruleSet ) )* ( (lv_tisi_4_0= ruleClick ) )* ( (lv_tisi_5_0= ruleFind ) )*
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

            // InternalBrowserAutomation.g:98:3: ( (lv_tisi_1_0= ruleAffectation ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrowserAutomation.g:99:4: (lv_tisi_1_0= ruleAffectation )
            	    {
            	    // InternalBrowserAutomation.g:99:4: (lv_tisi_1_0= ruleAffectation )
            	    // InternalBrowserAutomation.g:100:5: lv_tisi_1_0= ruleAffectation
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTisiAffectationParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_tisi_1_0=ruleAffectation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tisi",
            	    						lv_tisi_1_0,
            	    						"org.xtext.example.mydsl.BrowserAutomation.Affectation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalBrowserAutomation.g:117:3: ( (lv_tisi_2_0= ruleLaunch ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalBrowserAutomation.g:118:4: (lv_tisi_2_0= ruleLaunch )
                    {
                    // InternalBrowserAutomation.g:118:4: (lv_tisi_2_0= ruleLaunch )
                    // InternalBrowserAutomation.g:119:5: lv_tisi_2_0= ruleLaunch
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getTisiLaunchParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_4);
                    lv_tisi_2_0=ruleLaunch();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					add(
                    						current,
                    						"tisi",
                    						lv_tisi_2_0,
                    						"org.xtext.example.mydsl.BrowserAutomation.Launch");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalBrowserAutomation.g:136:3: ( (lv_tisi_3_0= ruleSet ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalBrowserAutomation.g:137:4: (lv_tisi_3_0= ruleSet )
            	    {
            	    // InternalBrowserAutomation.g:137:4: (lv_tisi_3_0= ruleSet )
            	    // InternalBrowserAutomation.g:138:5: lv_tisi_3_0= ruleSet
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTisiSetParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_tisi_3_0=ruleSet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tisi",
            	    						lv_tisi_3_0,
            	    						"org.xtext.example.mydsl.BrowserAutomation.Set");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalBrowserAutomation.g:155:3: ( (lv_tisi_4_0= ruleClick ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBrowserAutomation.g:156:4: (lv_tisi_4_0= ruleClick )
            	    {
            	    // InternalBrowserAutomation.g:156:4: (lv_tisi_4_0= ruleClick )
            	    // InternalBrowserAutomation.g:157:5: lv_tisi_4_0= ruleClick
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTisiClickParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_tisi_4_0=ruleClick();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tisi",
            	    						lv_tisi_4_0,
            	    						"org.xtext.example.mydsl.BrowserAutomation.Click");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalBrowserAutomation.g:174:3: ( (lv_tisi_5_0= ruleFind ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalBrowserAutomation.g:175:4: (lv_tisi_5_0= ruleFind )
            	    {
            	    // InternalBrowserAutomation.g:175:4: (lv_tisi_5_0= ruleFind )
            	    // InternalBrowserAutomation.g:176:5: lv_tisi_5_0= ruleFind
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTisiFindParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_tisi_5_0=ruleFind();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tisi",
            	    						lv_tisi_5_0,
            	    						"org.xtext.example.mydsl.BrowserAutomation.Find");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // InternalBrowserAutomation.g:197:1: entryRuleLaunch returns [EObject current=null] : iv_ruleLaunch= ruleLaunch EOF ;
    public final EObject entryRuleLaunch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLaunch = null;


        try {
            // InternalBrowserAutomation.g:197:47: (iv_ruleLaunch= ruleLaunch EOF )
            // InternalBrowserAutomation.g:198:2: iv_ruleLaunch= ruleLaunch EOF
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
    // InternalBrowserAutomation.g:204:1: ruleLaunch returns [EObject current=null] : (otherlv_0= 'GOTO' ( (lv_u_1_0= ruleUrl ) ) otherlv_2= 'ON' ( (lv_b_3_0= ruleBrowser ) ) ) ;
    public final EObject ruleLaunch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_u_1_0 = null;

        EObject lv_b_3_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:210:2: ( (otherlv_0= 'GOTO' ( (lv_u_1_0= ruleUrl ) ) otherlv_2= 'ON' ( (lv_b_3_0= ruleBrowser ) ) ) )
            // InternalBrowserAutomation.g:211:2: (otherlv_0= 'GOTO' ( (lv_u_1_0= ruleUrl ) ) otherlv_2= 'ON' ( (lv_b_3_0= ruleBrowser ) ) )
            {
            // InternalBrowserAutomation.g:211:2: (otherlv_0= 'GOTO' ( (lv_u_1_0= ruleUrl ) ) otherlv_2= 'ON' ( (lv_b_3_0= ruleBrowser ) ) )
            // InternalBrowserAutomation.g:212:3: otherlv_0= 'GOTO' ( (lv_u_1_0= ruleUrl ) ) otherlv_2= 'ON' ( (lv_b_3_0= ruleBrowser ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLaunchAccess().getGOTOKeyword_0());
            		
            // InternalBrowserAutomation.g:216:3: ( (lv_u_1_0= ruleUrl ) )
            // InternalBrowserAutomation.g:217:4: (lv_u_1_0= ruleUrl )
            {
            // InternalBrowserAutomation.g:217:4: (lv_u_1_0= ruleUrl )
            // InternalBrowserAutomation.g:218:5: lv_u_1_0= ruleUrl
            {

            					newCompositeNode(grammarAccess.getLaunchAccess().getUUrlParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLaunchAccess().getONKeyword_2());
            		
            // InternalBrowserAutomation.g:239:3: ( (lv_b_3_0= ruleBrowser ) )
            // InternalBrowserAutomation.g:240:4: (lv_b_3_0= ruleBrowser )
            {
            // InternalBrowserAutomation.g:240:4: (lv_b_3_0= ruleBrowser )
            // InternalBrowserAutomation.g:241:5: lv_b_3_0= ruleBrowser
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


    // $ANTLR start "entryRuleFind"
    // InternalBrowserAutomation.g:262:1: entryRuleFind returns [EObject current=null] : iv_ruleFind= ruleFind EOF ;
    public final EObject entryRuleFind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFind = null;


        try {
            // InternalBrowserAutomation.g:262:45: (iv_ruleFind= ruleFind EOF )
            // InternalBrowserAutomation.g:263:2: iv_ruleFind= ruleFind EOF
            {
             newCompositeNode(grammarAccess.getFindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFind=ruleFind();

            state._fsp--;

             current =iv_ruleFind; 
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
    // $ANTLR end "entryRuleFind"


    // $ANTLR start "ruleFind"
    // InternalBrowserAutomation.g:269:1: ruleFind returns [EObject current=null] : (otherlv_0= 'FIND' ( (lv_c_1_0= ruleComposant ) ) otherlv_2= 'WHERE' ( (lv_a_3_0= ruleAttribut ) ) (otherlv_4= 'CONTAINS' | otherlv_5= 'EQUALS' ) (this_STRING_6= RULE_STRING | ( (lv_v_7_0= ruleVarRef ) ) ) ) ;
    public final EObject ruleFind() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_STRING_6=null;
        EObject lv_c_1_0 = null;

        EObject lv_a_3_0 = null;

        EObject lv_v_7_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:275:2: ( (otherlv_0= 'FIND' ( (lv_c_1_0= ruleComposant ) ) otherlv_2= 'WHERE' ( (lv_a_3_0= ruleAttribut ) ) (otherlv_4= 'CONTAINS' | otherlv_5= 'EQUALS' ) (this_STRING_6= RULE_STRING | ( (lv_v_7_0= ruleVarRef ) ) ) ) )
            // InternalBrowserAutomation.g:276:2: (otherlv_0= 'FIND' ( (lv_c_1_0= ruleComposant ) ) otherlv_2= 'WHERE' ( (lv_a_3_0= ruleAttribut ) ) (otherlv_4= 'CONTAINS' | otherlv_5= 'EQUALS' ) (this_STRING_6= RULE_STRING | ( (lv_v_7_0= ruleVarRef ) ) ) )
            {
            // InternalBrowserAutomation.g:276:2: (otherlv_0= 'FIND' ( (lv_c_1_0= ruleComposant ) ) otherlv_2= 'WHERE' ( (lv_a_3_0= ruleAttribut ) ) (otherlv_4= 'CONTAINS' | otherlv_5= 'EQUALS' ) (this_STRING_6= RULE_STRING | ( (lv_v_7_0= ruleVarRef ) ) ) )
            // InternalBrowserAutomation.g:277:3: otherlv_0= 'FIND' ( (lv_c_1_0= ruleComposant ) ) otherlv_2= 'WHERE' ( (lv_a_3_0= ruleAttribut ) ) (otherlv_4= 'CONTAINS' | otherlv_5= 'EQUALS' ) (this_STRING_6= RULE_STRING | ( (lv_v_7_0= ruleVarRef ) ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getFindAccess().getFINDKeyword_0());
            		
            // InternalBrowserAutomation.g:281:3: ( (lv_c_1_0= ruleComposant ) )
            // InternalBrowserAutomation.g:282:4: (lv_c_1_0= ruleComposant )
            {
            // InternalBrowserAutomation.g:282:4: (lv_c_1_0= ruleComposant )
            // InternalBrowserAutomation.g:283:5: lv_c_1_0= ruleComposant
            {

            					newCompositeNode(grammarAccess.getFindAccess().getCComposantParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
            lv_c_1_0=ruleComposant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFindRule());
            					}
            					set(
            						current,
            						"c",
            						lv_c_1_0,
            						"org.xtext.example.mydsl.BrowserAutomation.Composant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getFindAccess().getWHEREKeyword_2());
            		
            // InternalBrowserAutomation.g:304:3: ( (lv_a_3_0= ruleAttribut ) )
            // InternalBrowserAutomation.g:305:4: (lv_a_3_0= ruleAttribut )
            {
            // InternalBrowserAutomation.g:305:4: (lv_a_3_0= ruleAttribut )
            // InternalBrowserAutomation.g:306:5: lv_a_3_0= ruleAttribut
            {

            					newCompositeNode(grammarAccess.getFindAccess().getAAttributParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_a_3_0=ruleAttribut();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFindRule());
            					}
            					set(
            						current,
            						"a",
            						lv_a_3_0,
            						"org.xtext.example.mydsl.BrowserAutomation.Attribut");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowserAutomation.g:323:3: (otherlv_4= 'CONTAINS' | otherlv_5= 'EQUALS' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalBrowserAutomation.g:324:4: otherlv_4= 'CONTAINS'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getFindAccess().getCONTAINSKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:329:4: otherlv_5= 'EQUALS'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getFindAccess().getEQUALSKeyword_4_1());
                    			

                    }
                    break;

            }

            // InternalBrowserAutomation.g:334:3: (this_STRING_6= RULE_STRING | ( (lv_v_7_0= ruleVarRef ) ) )
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
                    // InternalBrowserAutomation.g:335:4: this_STRING_6= RULE_STRING
                    {
                    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				newLeafNode(this_STRING_6, grammarAccess.getFindAccess().getSTRINGTerminalRuleCall_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:340:4: ( (lv_v_7_0= ruleVarRef ) )
                    {
                    // InternalBrowserAutomation.g:340:4: ( (lv_v_7_0= ruleVarRef ) )
                    // InternalBrowserAutomation.g:341:5: (lv_v_7_0= ruleVarRef )
                    {
                    // InternalBrowserAutomation.g:341:5: (lv_v_7_0= ruleVarRef )
                    // InternalBrowserAutomation.g:342:6: lv_v_7_0= ruleVarRef
                    {

                    						newCompositeNode(grammarAccess.getFindAccess().getVVarRefParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_v_7_0=ruleVarRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFindRule());
                    						}
                    						set(
                    							current,
                    							"v",
                    							lv_v_7_0,
                    							"org.xtext.example.mydsl.BrowserAutomation.VarRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleFind"


    // $ANTLR start "entryRuleClick"
    // InternalBrowserAutomation.g:364:1: entryRuleClick returns [EObject current=null] : iv_ruleClick= ruleClick EOF ;
    public final EObject entryRuleClick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClick = null;


        try {
            // InternalBrowserAutomation.g:364:46: (iv_ruleClick= ruleClick EOF )
            // InternalBrowserAutomation.g:365:2: iv_ruleClick= ruleClick EOF
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
    // InternalBrowserAutomation.g:371:1: ruleClick returns [EObject current=null] : (otherlv_0= 'CLICK' ( (lv_c_1_0= ruleComposant ) ) otherlv_2= 'WHERE' ( (lv_a_3_0= ruleAttribut ) ) (otherlv_4= 'CONTAINS' | otherlv_5= 'EQUALS' ) (this_STRING_6= RULE_STRING | ( (lv_v_7_0= ruleVarRef ) ) ) ) ;
    public final EObject ruleClick() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_STRING_6=null;
        EObject lv_c_1_0 = null;

        EObject lv_a_3_0 = null;

        EObject lv_v_7_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:377:2: ( (otherlv_0= 'CLICK' ( (lv_c_1_0= ruleComposant ) ) otherlv_2= 'WHERE' ( (lv_a_3_0= ruleAttribut ) ) (otherlv_4= 'CONTAINS' | otherlv_5= 'EQUALS' ) (this_STRING_6= RULE_STRING | ( (lv_v_7_0= ruleVarRef ) ) ) ) )
            // InternalBrowserAutomation.g:378:2: (otherlv_0= 'CLICK' ( (lv_c_1_0= ruleComposant ) ) otherlv_2= 'WHERE' ( (lv_a_3_0= ruleAttribut ) ) (otherlv_4= 'CONTAINS' | otherlv_5= 'EQUALS' ) (this_STRING_6= RULE_STRING | ( (lv_v_7_0= ruleVarRef ) ) ) )
            {
            // InternalBrowserAutomation.g:378:2: (otherlv_0= 'CLICK' ( (lv_c_1_0= ruleComposant ) ) otherlv_2= 'WHERE' ( (lv_a_3_0= ruleAttribut ) ) (otherlv_4= 'CONTAINS' | otherlv_5= 'EQUALS' ) (this_STRING_6= RULE_STRING | ( (lv_v_7_0= ruleVarRef ) ) ) )
            // InternalBrowserAutomation.g:379:3: otherlv_0= 'CLICK' ( (lv_c_1_0= ruleComposant ) ) otherlv_2= 'WHERE' ( (lv_a_3_0= ruleAttribut ) ) (otherlv_4= 'CONTAINS' | otherlv_5= 'EQUALS' ) (this_STRING_6= RULE_STRING | ( (lv_v_7_0= ruleVarRef ) ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getCLICKKeyword_0());
            		
            // InternalBrowserAutomation.g:383:3: ( (lv_c_1_0= ruleComposant ) )
            // InternalBrowserAutomation.g:384:4: (lv_c_1_0= ruleComposant )
            {
            // InternalBrowserAutomation.g:384:4: (lv_c_1_0= ruleComposant )
            // InternalBrowserAutomation.g:385:5: lv_c_1_0= ruleComposant
            {

            					newCompositeNode(grammarAccess.getClickAccess().getCComposantParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_2=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getClickAccess().getWHEREKeyword_2());
            		
            // InternalBrowserAutomation.g:406:3: ( (lv_a_3_0= ruleAttribut ) )
            // InternalBrowserAutomation.g:407:4: (lv_a_3_0= ruleAttribut )
            {
            // InternalBrowserAutomation.g:407:4: (lv_a_3_0= ruleAttribut )
            // InternalBrowserAutomation.g:408:5: lv_a_3_0= ruleAttribut
            {

            					newCompositeNode(grammarAccess.getClickAccess().getAAttributParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalBrowserAutomation.g:425:3: (otherlv_4= 'CONTAINS' | otherlv_5= 'EQUALS' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) ) {
                alt8=1;
            }
            else if ( (LA8_0==16) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalBrowserAutomation.g:426:4: otherlv_4= 'CONTAINS'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getClickAccess().getCONTAINSKeyword_4_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:431:4: otherlv_5= 'EQUALS'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getClickAccess().getEQUALSKeyword_4_1());
                    			

                    }
                    break;

            }

            // InternalBrowserAutomation.g:436:3: (this_STRING_6= RULE_STRING | ( (lv_v_7_0= ruleVarRef ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalBrowserAutomation.g:437:4: this_STRING_6= RULE_STRING
                    {
                    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				newLeafNode(this_STRING_6, grammarAccess.getClickAccess().getSTRINGTerminalRuleCall_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:442:4: ( (lv_v_7_0= ruleVarRef ) )
                    {
                    // InternalBrowserAutomation.g:442:4: ( (lv_v_7_0= ruleVarRef ) )
                    // InternalBrowserAutomation.g:443:5: (lv_v_7_0= ruleVarRef )
                    {
                    // InternalBrowserAutomation.g:443:5: (lv_v_7_0= ruleVarRef )
                    // InternalBrowserAutomation.g:444:6: lv_v_7_0= ruleVarRef
                    {

                    						newCompositeNode(grammarAccess.getClickAccess().getVVarRefParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_v_7_0=ruleVarRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getClickRule());
                    						}
                    						set(
                    							current,
                    							"v",
                    							lv_v_7_0,
                    							"org.xtext.example.mydsl.BrowserAutomation.VarRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleClick"


    // $ANTLR start "entryRuleSet"
    // InternalBrowserAutomation.g:466:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalBrowserAutomation.g:466:44: (iv_ruleSet= ruleSet EOF )
            // InternalBrowserAutomation.g:467:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet; 
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
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalBrowserAutomation.g:473:1: ruleSet returns [EObject current=null] : (otherlv_0= 'SET' ( (lv_a_1_0= ruleAttribut ) ) (this_STRING_2= RULE_STRING | ( (lv_v_3_0= ruleVarRef ) ) ) otherlv_4= 'WHERE' ( (lv_a1_5_0= ruleAttribut ) ) (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' ) (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) ) ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_STRING_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_STRING_8=null;
        EObject lv_a_1_0 = null;

        EObject lv_v_3_0 = null;

        EObject lv_a1_5_0 = null;

        EObject lv_v_9_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:479:2: ( (otherlv_0= 'SET' ( (lv_a_1_0= ruleAttribut ) ) (this_STRING_2= RULE_STRING | ( (lv_v_3_0= ruleVarRef ) ) ) otherlv_4= 'WHERE' ( (lv_a1_5_0= ruleAttribut ) ) (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' ) (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) ) ) )
            // InternalBrowserAutomation.g:480:2: (otherlv_0= 'SET' ( (lv_a_1_0= ruleAttribut ) ) (this_STRING_2= RULE_STRING | ( (lv_v_3_0= ruleVarRef ) ) ) otherlv_4= 'WHERE' ( (lv_a1_5_0= ruleAttribut ) ) (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' ) (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) ) )
            {
            // InternalBrowserAutomation.g:480:2: (otherlv_0= 'SET' ( (lv_a_1_0= ruleAttribut ) ) (this_STRING_2= RULE_STRING | ( (lv_v_3_0= ruleVarRef ) ) ) otherlv_4= 'WHERE' ( (lv_a1_5_0= ruleAttribut ) ) (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' ) (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) ) )
            // InternalBrowserAutomation.g:481:3: otherlv_0= 'SET' ( (lv_a_1_0= ruleAttribut ) ) (this_STRING_2= RULE_STRING | ( (lv_v_3_0= ruleVarRef ) ) ) otherlv_4= 'WHERE' ( (lv_a1_5_0= ruleAttribut ) ) (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' ) (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSetAccess().getSETKeyword_0());
            		
            // InternalBrowserAutomation.g:485:3: ( (lv_a_1_0= ruleAttribut ) )
            // InternalBrowserAutomation.g:486:4: (lv_a_1_0= ruleAttribut )
            {
            // InternalBrowserAutomation.g:486:4: (lv_a_1_0= ruleAttribut )
            // InternalBrowserAutomation.g:487:5: lv_a_1_0= ruleAttribut
            {

            					newCompositeNode(grammarAccess.getSetAccess().getAAttributParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_a_1_0=ruleAttribut();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetRule());
            					}
            					set(
            						current,
            						"a",
            						lv_a_1_0,
            						"org.xtext.example.mydsl.BrowserAutomation.Attribut");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowserAutomation.g:504:3: (this_STRING_2= RULE_STRING | ( (lv_v_3_0= ruleVarRef ) ) )
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
                    // InternalBrowserAutomation.g:505:4: this_STRING_2= RULE_STRING
                    {
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_10); 

                    				newLeafNode(this_STRING_2, grammarAccess.getSetAccess().getSTRINGTerminalRuleCall_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:510:4: ( (lv_v_3_0= ruleVarRef ) )
                    {
                    // InternalBrowserAutomation.g:510:4: ( (lv_v_3_0= ruleVarRef ) )
                    // InternalBrowserAutomation.g:511:5: (lv_v_3_0= ruleVarRef )
                    {
                    // InternalBrowserAutomation.g:511:5: (lv_v_3_0= ruleVarRef )
                    // InternalBrowserAutomation.g:512:6: lv_v_3_0= ruleVarRef
                    {

                    						newCompositeNode(grammarAccess.getSetAccess().getVVarRefParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_v_3_0=ruleVarRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetRule());
                    						}
                    						set(
                    							current,
                    							"v",
                    							lv_v_3_0,
                    							"org.xtext.example.mydsl.BrowserAutomation.VarRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSetAccess().getWHEREKeyword_3());
            		
            // InternalBrowserAutomation.g:534:3: ( (lv_a1_5_0= ruleAttribut ) )
            // InternalBrowserAutomation.g:535:4: (lv_a1_5_0= ruleAttribut )
            {
            // InternalBrowserAutomation.g:535:4: (lv_a1_5_0= ruleAttribut )
            // InternalBrowserAutomation.g:536:5: lv_a1_5_0= ruleAttribut
            {

            					newCompositeNode(grammarAccess.getSetAccess().getA1AttributParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
            lv_a1_5_0=ruleAttribut();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetRule());
            					}
            					set(
            						current,
            						"a1",
            						lv_a1_5_0,
            						"org.xtext.example.mydsl.BrowserAutomation.Attribut");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalBrowserAutomation.g:553:3: (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==16) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalBrowserAutomation.g:554:4: otherlv_6= 'CONTAINS'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getSetAccess().getCONTAINSKeyword_5_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:559:4: otherlv_7= 'EQUALS'
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getSetAccess().getEQUALSKeyword_5_1());
                    			

                    }
                    break;

            }

            // InternalBrowserAutomation.g:564:3: (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalBrowserAutomation.g:565:4: this_STRING_8= RULE_STRING
                    {
                    this_STRING_8=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				newLeafNode(this_STRING_8, grammarAccess.getSetAccess().getSTRINGTerminalRuleCall_6_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:570:4: ( (lv_v_9_0= ruleVarRef ) )
                    {
                    // InternalBrowserAutomation.g:570:4: ( (lv_v_9_0= ruleVarRef ) )
                    // InternalBrowserAutomation.g:571:5: (lv_v_9_0= ruleVarRef )
                    {
                    // InternalBrowserAutomation.g:571:5: (lv_v_9_0= ruleVarRef )
                    // InternalBrowserAutomation.g:572:6: lv_v_9_0= ruleVarRef
                    {

                    						newCompositeNode(grammarAccess.getSetAccess().getVVarRefParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_v_9_0=ruleVarRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetRule());
                    						}
                    						set(
                    							current,
                    							"v",
                    							lv_v_9_0,
                    							"org.xtext.example.mydsl.BrowserAutomation.VarRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleAffectation"
    // InternalBrowserAutomation.g:594:1: entryRuleAffectation returns [EObject current=null] : iv_ruleAffectation= ruleAffectation EOF ;
    public final EObject entryRuleAffectation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAffectation = null;


        try {
            // InternalBrowserAutomation.g:594:52: (iv_ruleAffectation= ruleAffectation EOF )
            // InternalBrowserAutomation.g:595:2: iv_ruleAffectation= ruleAffectation EOF
            {
             newCompositeNode(grammarAccess.getAffectationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAffectation=ruleAffectation();

            state._fsp--;

             current =iv_ruleAffectation; 
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
    // $ANTLR end "entryRuleAffectation"


    // $ANTLR start "ruleAffectation"
    // InternalBrowserAutomation.g:601:1: ruleAffectation returns [EObject current=null] : (this_Variable_0= ruleVariable otherlv_1= '=' ( (otherlv_2= 'GET' ( (lv_a_3_0= ruleAttribut ) ) otherlv_4= 'WHERE' ( (lv_a2_5_0= ruleAttribut ) ) (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' ) (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) ) ) | this_STRING_10= RULE_STRING ) ) ;
    public final EObject ruleAffectation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_STRING_8=null;
        Token this_STRING_10=null;
        EObject this_Variable_0 = null;

        EObject lv_a_3_0 = null;

        EObject lv_a2_5_0 = null;

        EObject lv_v_9_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:607:2: ( (this_Variable_0= ruleVariable otherlv_1= '=' ( (otherlv_2= 'GET' ( (lv_a_3_0= ruleAttribut ) ) otherlv_4= 'WHERE' ( (lv_a2_5_0= ruleAttribut ) ) (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' ) (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) ) ) | this_STRING_10= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:608:2: (this_Variable_0= ruleVariable otherlv_1= '=' ( (otherlv_2= 'GET' ( (lv_a_3_0= ruleAttribut ) ) otherlv_4= 'WHERE' ( (lv_a2_5_0= ruleAttribut ) ) (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' ) (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) ) ) | this_STRING_10= RULE_STRING ) )
            {
            // InternalBrowserAutomation.g:608:2: (this_Variable_0= ruleVariable otherlv_1= '=' ( (otherlv_2= 'GET' ( (lv_a_3_0= ruleAttribut ) ) otherlv_4= 'WHERE' ( (lv_a2_5_0= ruleAttribut ) ) (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' ) (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) ) ) | this_STRING_10= RULE_STRING ) )
            // InternalBrowserAutomation.g:609:3: this_Variable_0= ruleVariable otherlv_1= '=' ( (otherlv_2= 'GET' ( (lv_a_3_0= ruleAttribut ) ) otherlv_4= 'WHERE' ( (lv_a2_5_0= ruleAttribut ) ) (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' ) (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) ) ) | this_STRING_10= RULE_STRING )
            {

            			newCompositeNode(grammarAccess.getAffectationAccess().getVariableParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_Variable_0=ruleVariable();

            state._fsp--;


            			current = this_Variable_0;
            			afterParserOrEnumRuleCall();
            		
            otherlv_1=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getAffectationAccess().getEqualsSignKeyword_1());
            		
            // InternalBrowserAutomation.g:621:3: ( (otherlv_2= 'GET' ( (lv_a_3_0= ruleAttribut ) ) otherlv_4= 'WHERE' ( (lv_a2_5_0= ruleAttribut ) ) (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' ) (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) ) ) | this_STRING_10= RULE_STRING )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_STRING) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalBrowserAutomation.g:622:4: (otherlv_2= 'GET' ( (lv_a_3_0= ruleAttribut ) ) otherlv_4= 'WHERE' ( (lv_a2_5_0= ruleAttribut ) ) (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' ) (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) ) )
                    {
                    // InternalBrowserAutomation.g:622:4: (otherlv_2= 'GET' ( (lv_a_3_0= ruleAttribut ) ) otherlv_4= 'WHERE' ( (lv_a2_5_0= ruleAttribut ) ) (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' ) (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) ) )
                    // InternalBrowserAutomation.g:623:5: otherlv_2= 'GET' ( (lv_a_3_0= ruleAttribut ) ) otherlv_4= 'WHERE' ( (lv_a2_5_0= ruleAttribut ) ) (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' ) (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) )
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_9); 

                    					newLeafNode(otherlv_2, grammarAccess.getAffectationAccess().getGETKeyword_2_0_0());
                    				
                    // InternalBrowserAutomation.g:627:5: ( (lv_a_3_0= ruleAttribut ) )
                    // InternalBrowserAutomation.g:628:6: (lv_a_3_0= ruleAttribut )
                    {
                    // InternalBrowserAutomation.g:628:6: (lv_a_3_0= ruleAttribut )
                    // InternalBrowserAutomation.g:629:7: lv_a_3_0= ruleAttribut
                    {

                    							newCompositeNode(grammarAccess.getAffectationAccess().getAAttributParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_10);
                    lv_a_3_0=ruleAttribut();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAffectationRule());
                    							}
                    							set(
                    								current,
                    								"a",
                    								lv_a_3_0,
                    								"org.xtext.example.mydsl.BrowserAutomation.Attribut");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_9); 

                    					newLeafNode(otherlv_4, grammarAccess.getAffectationAccess().getWHEREKeyword_2_0_2());
                    				
                    // InternalBrowserAutomation.g:650:5: ( (lv_a2_5_0= ruleAttribut ) )
                    // InternalBrowserAutomation.g:651:6: (lv_a2_5_0= ruleAttribut )
                    {
                    // InternalBrowserAutomation.g:651:6: (lv_a2_5_0= ruleAttribut )
                    // InternalBrowserAutomation.g:652:7: lv_a2_5_0= ruleAttribut
                    {

                    							newCompositeNode(grammarAccess.getAffectationAccess().getA2AttributParserRuleCall_2_0_3_0());
                    						
                    pushFollow(FOLLOW_11);
                    lv_a2_5_0=ruleAttribut();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getAffectationRule());
                    							}
                    							set(
                    								current,
                    								"a2",
                    								lv_a2_5_0,
                    								"org.xtext.example.mydsl.BrowserAutomation.Attribut");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalBrowserAutomation.g:669:5: (otherlv_6= 'CONTAINS' | otherlv_7= 'EQUALS' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==15) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==16) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalBrowserAutomation.g:670:6: otherlv_6= 'CONTAINS'
                            {
                            otherlv_6=(Token)match(input,15,FOLLOW_12); 

                            						newLeafNode(otherlv_6, grammarAccess.getAffectationAccess().getCONTAINSKeyword_2_0_4_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalBrowserAutomation.g:675:6: otherlv_7= 'EQUALS'
                            {
                            otherlv_7=(Token)match(input,16,FOLLOW_12); 

                            						newLeafNode(otherlv_7, grammarAccess.getAffectationAccess().getEQUALSKeyword_2_0_4_1());
                            					

                            }
                            break;

                    }

                    // InternalBrowserAutomation.g:680:5: (this_STRING_8= RULE_STRING | ( (lv_v_9_0= ruleVarRef ) ) )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==RULE_STRING) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==RULE_ID) ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalBrowserAutomation.g:681:6: this_STRING_8= RULE_STRING
                            {
                            this_STRING_8=(Token)match(input,RULE_STRING,FOLLOW_2); 

                            						newLeafNode(this_STRING_8, grammarAccess.getAffectationAccess().getSTRINGTerminalRuleCall_2_0_5_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalBrowserAutomation.g:686:6: ( (lv_v_9_0= ruleVarRef ) )
                            {
                            // InternalBrowserAutomation.g:686:6: ( (lv_v_9_0= ruleVarRef ) )
                            // InternalBrowserAutomation.g:687:7: (lv_v_9_0= ruleVarRef )
                            {
                            // InternalBrowserAutomation.g:687:7: (lv_v_9_0= ruleVarRef )
                            // InternalBrowserAutomation.g:688:8: lv_v_9_0= ruleVarRef
                            {

                            								newCompositeNode(grammarAccess.getAffectationAccess().getVVarRefParserRuleCall_2_0_5_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_v_9_0=ruleVarRef();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getAffectationRule());
                            								}
                            								set(
                            									current,
                            									"v",
                            									lv_v_9_0,
                            									"org.xtext.example.mydsl.BrowserAutomation.VarRef");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalBrowserAutomation.g:708:4: this_STRING_10= RULE_STRING
                    {
                    this_STRING_10=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				newLeafNode(this_STRING_10, grammarAccess.getAffectationAccess().getSTRINGTerminalRuleCall_2_1());
                    			

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
    // $ANTLR end "ruleAffectation"


    // $ANTLR start "entryRuleVariable"
    // InternalBrowserAutomation.g:717:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalBrowserAutomation.g:717:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalBrowserAutomation.g:718:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalBrowserAutomation.g:724:1: ruleVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:730:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:731:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:731:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBrowserAutomation.g:732:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:732:3: (lv_name_0_0= RULE_ID )
            // InternalBrowserAutomation.g:733:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableRule());
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVarRef"
    // InternalBrowserAutomation.g:752:1: entryRuleVarRef returns [EObject current=null] : iv_ruleVarRef= ruleVarRef EOF ;
    public final EObject entryRuleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRef = null;


        try {
            // InternalBrowserAutomation.g:752:47: (iv_ruleVarRef= ruleVarRef EOF )
            // InternalBrowserAutomation.g:753:2: iv_ruleVarRef= ruleVarRef EOF
            {
             newCompositeNode(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarRef=ruleVarRef();

            state._fsp--;

             current =iv_ruleVarRef; 
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
    // $ANTLR end "entryRuleVarRef"


    // $ANTLR start "ruleVarRef"
    // InternalBrowserAutomation.g:759:1: ruleVarRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVarRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:765:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:766:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:766:2: ( (otherlv_0= RULE_ID ) )
            // InternalBrowserAutomation.g:767:3: (otherlv_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:767:3: (otherlv_0= RULE_ID )
            // InternalBrowserAutomation.g:768:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVarRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVarRefAccess().getVarVariableCrossReference_0());
            			

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
    // $ANTLR end "ruleVarRef"


    // $ANTLR start "entryRuleComposant"
    // InternalBrowserAutomation.g:782:1: entryRuleComposant returns [EObject current=null] : iv_ruleComposant= ruleComposant EOF ;
    public final EObject entryRuleComposant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComposant = null;


        try {
            // InternalBrowserAutomation.g:782:50: (iv_ruleComposant= ruleComposant EOF )
            // InternalBrowserAutomation.g:783:2: iv_ruleComposant= ruleComposant EOF
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
    // InternalBrowserAutomation.g:789:1: ruleComposant returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleComposant() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:795:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:796:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:796:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBrowserAutomation.g:797:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:797:3: (lv_name_0_0= RULE_ID )
            // InternalBrowserAutomation.g:798:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getComposantAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getComposantRule());
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
    // $ANTLR end "ruleComposant"


    // $ANTLR start "entryRuleAttribut"
    // InternalBrowserAutomation.g:817:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalBrowserAutomation.g:817:49: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalBrowserAutomation.g:818:2: iv_ruleAttribut= ruleAttribut EOF
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
    // InternalBrowserAutomation.g:824:1: ruleAttribut returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:830:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:831:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:831:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBrowserAutomation.g:832:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:832:3: (lv_name_0_0= RULE_ID )
            // InternalBrowserAutomation.g:833:4: lv_name_0_0= RULE_ID
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
    // InternalBrowserAutomation.g:852:1: entryRuleBrowser returns [EObject current=null] : iv_ruleBrowser= ruleBrowser EOF ;
    public final EObject entryRuleBrowser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrowser = null;


        try {
            // InternalBrowserAutomation.g:852:48: (iv_ruleBrowser= ruleBrowser EOF )
            // InternalBrowserAutomation.g:853:2: iv_ruleBrowser= ruleBrowser EOF
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
    // InternalBrowserAutomation.g:859:1: ruleBrowser returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBrowser() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:865:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:866:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:866:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBrowserAutomation.g:867:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:867:3: (lv_name_0_0= RULE_ID )
            // InternalBrowserAutomation.g:868:4: lv_name_0_0= RULE_ID
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
    // InternalBrowserAutomation.g:887:1: entryRuleUrl returns [EObject current=null] : iv_ruleUrl= ruleUrl EOF ;
    public final EObject entryRuleUrl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrl = null;


        try {
            // InternalBrowserAutomation.g:887:44: (iv_ruleUrl= ruleUrl EOF )
            // InternalBrowserAutomation.g:888:2: iv_ruleUrl= ruleUrl EOF
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
    // InternalBrowserAutomation.g:894:1: ruleUrl returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleUrl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:900:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:901:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalBrowserAutomation.g:901:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:902:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:902:3: (lv_name_0_0= RULE_STRING )
            // InternalBrowserAutomation.g:903:4: lv_name_0_0= RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000062822L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000062002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000022002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100010L});

}