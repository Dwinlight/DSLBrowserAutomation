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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ON'", "'GOTO'", "'IS'", "'ATTRIBUT'", "'WHERE'", "'CONTAINS'", "'\"'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
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
    // InternalBrowserAutomation.g:71:1: ruleModel returns [EObject current=null] : ( (lv_tisi_0_0= ruleTest ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_tisi_0_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:77:2: ( ( (lv_tisi_0_0= ruleTest ) )* )
            // InternalBrowserAutomation.g:78:2: ( (lv_tisi_0_0= ruleTest ) )*
            {
            // InternalBrowserAutomation.g:78:2: ( (lv_tisi_0_0= ruleTest ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrowserAutomation.g:79:3: (lv_tisi_0_0= ruleTest )
            	    {
            	    // InternalBrowserAutomation.g:79:3: (lv_tisi_0_0= ruleTest )
            	    // InternalBrowserAutomation.g:80:4: lv_tisi_0_0= ruleTest
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getTisiTestParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_tisi_0_0=ruleTest();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"tisi",
            	    					lv_tisi_0_0,
            	    					"org.xtext.example.mydsl.BrowserAutomation.Test");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleTest"
    // InternalBrowserAutomation.g:100:1: entryRuleTest returns [EObject current=null] : iv_ruleTest= ruleTest EOF ;
    public final EObject entryRuleTest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTest = null;


        try {
            // InternalBrowserAutomation.g:100:45: (iv_ruleTest= ruleTest EOF )
            // InternalBrowserAutomation.g:101:2: iv_ruleTest= ruleTest EOF
            {
             newCompositeNode(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTest=ruleTest();

            state._fsp--;

             current =iv_ruleTest; 
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
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalBrowserAutomation.g:107:1: ruleTest returns [EObject current=null] : (otherlv_0= 'ON' ( (lv_b_1_0= ruleBrowser ) ) otherlv_2= 'GOTO' ( (lv_u_3_0= ruleUrl ) ) otherlv_4= 'IS' otherlv_5= 'ATTRIBUT' ( (lv_a1_6_0= ruleAttribut ) ) otherlv_7= 'WHERE' otherlv_8= 'ATTRIBUT' ( (lv_a2_9_0= ruleAttribut ) ) otherlv_10= 'CONTAINS' otherlv_11= '\"' this_STRING_12= RULE_STRING otherlv_13= '\"' ) ;
    public final EObject ruleTest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_STRING_12=null;
        Token otherlv_13=null;
        EObject lv_b_1_0 = null;

        EObject lv_u_3_0 = null;

        EObject lv_a1_6_0 = null;

        EObject lv_a2_9_0 = null;



        	enterRule();

        try {
            // InternalBrowserAutomation.g:113:2: ( (otherlv_0= 'ON' ( (lv_b_1_0= ruleBrowser ) ) otherlv_2= 'GOTO' ( (lv_u_3_0= ruleUrl ) ) otherlv_4= 'IS' otherlv_5= 'ATTRIBUT' ( (lv_a1_6_0= ruleAttribut ) ) otherlv_7= 'WHERE' otherlv_8= 'ATTRIBUT' ( (lv_a2_9_0= ruleAttribut ) ) otherlv_10= 'CONTAINS' otherlv_11= '\"' this_STRING_12= RULE_STRING otherlv_13= '\"' ) )
            // InternalBrowserAutomation.g:114:2: (otherlv_0= 'ON' ( (lv_b_1_0= ruleBrowser ) ) otherlv_2= 'GOTO' ( (lv_u_3_0= ruleUrl ) ) otherlv_4= 'IS' otherlv_5= 'ATTRIBUT' ( (lv_a1_6_0= ruleAttribut ) ) otherlv_7= 'WHERE' otherlv_8= 'ATTRIBUT' ( (lv_a2_9_0= ruleAttribut ) ) otherlv_10= 'CONTAINS' otherlv_11= '\"' this_STRING_12= RULE_STRING otherlv_13= '\"' )
            {
            // InternalBrowserAutomation.g:114:2: (otherlv_0= 'ON' ( (lv_b_1_0= ruleBrowser ) ) otherlv_2= 'GOTO' ( (lv_u_3_0= ruleUrl ) ) otherlv_4= 'IS' otherlv_5= 'ATTRIBUT' ( (lv_a1_6_0= ruleAttribut ) ) otherlv_7= 'WHERE' otherlv_8= 'ATTRIBUT' ( (lv_a2_9_0= ruleAttribut ) ) otherlv_10= 'CONTAINS' otherlv_11= '\"' this_STRING_12= RULE_STRING otherlv_13= '\"' )
            // InternalBrowserAutomation.g:115:3: otherlv_0= 'ON' ( (lv_b_1_0= ruleBrowser ) ) otherlv_2= 'GOTO' ( (lv_u_3_0= ruleUrl ) ) otherlv_4= 'IS' otherlv_5= 'ATTRIBUT' ( (lv_a1_6_0= ruleAttribut ) ) otherlv_7= 'WHERE' otherlv_8= 'ATTRIBUT' ( (lv_a2_9_0= ruleAttribut ) ) otherlv_10= 'CONTAINS' otherlv_11= '\"' this_STRING_12= RULE_STRING otherlv_13= '\"'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTestAccess().getONKeyword_0());
            		
            // InternalBrowserAutomation.g:119:3: ( (lv_b_1_0= ruleBrowser ) )
            // InternalBrowserAutomation.g:120:4: (lv_b_1_0= ruleBrowser )
            {
            // InternalBrowserAutomation.g:120:4: (lv_b_1_0= ruleBrowser )
            // InternalBrowserAutomation.g:121:5: lv_b_1_0= ruleBrowser
            {

            					newCompositeNode(grammarAccess.getTestAccess().getBBrowserParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_b_1_0=ruleBrowser();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"b",
            						lv_b_1_0,
            						"org.xtext.example.mydsl.BrowserAutomation.Browser");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTestAccess().getGOTOKeyword_2());
            		
            // InternalBrowserAutomation.g:142:3: ( (lv_u_3_0= ruleUrl ) )
            // InternalBrowserAutomation.g:143:4: (lv_u_3_0= ruleUrl )
            {
            // InternalBrowserAutomation.g:143:4: (lv_u_3_0= ruleUrl )
            // InternalBrowserAutomation.g:144:5: lv_u_3_0= ruleUrl
            {

            					newCompositeNode(grammarAccess.getTestAccess().getUUrlParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_u_3_0=ruleUrl();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"u",
            						lv_u_3_0,
            						"org.xtext.example.mydsl.BrowserAutomation.Url");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getTestAccess().getISKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getTestAccess().getATTRIBUTKeyword_5());
            		
            // InternalBrowserAutomation.g:169:3: ( (lv_a1_6_0= ruleAttribut ) )
            // InternalBrowserAutomation.g:170:4: (lv_a1_6_0= ruleAttribut )
            {
            // InternalBrowserAutomation.g:170:4: (lv_a1_6_0= ruleAttribut )
            // InternalBrowserAutomation.g:171:5: lv_a1_6_0= ruleAttribut
            {

            					newCompositeNode(grammarAccess.getTestAccess().getA1AttributParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_a1_6_0=ruleAttribut();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"a1",
            						lv_a1_6_0,
            						"org.xtext.example.mydsl.BrowserAutomation.Attribut");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_7, grammarAccess.getTestAccess().getWHEREKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_8, grammarAccess.getTestAccess().getATTRIBUTKeyword_8());
            		
            // InternalBrowserAutomation.g:196:3: ( (lv_a2_9_0= ruleAttribut ) )
            // InternalBrowserAutomation.g:197:4: (lv_a2_9_0= ruleAttribut )
            {
            // InternalBrowserAutomation.g:197:4: (lv_a2_9_0= ruleAttribut )
            // InternalBrowserAutomation.g:198:5: lv_a2_9_0= ruleAttribut
            {

            					newCompositeNode(grammarAccess.getTestAccess().getA2AttributParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_a2_9_0=ruleAttribut();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestRule());
            					}
            					set(
            						current,
            						"a2",
            						lv_a2_9_0,
            						"org.xtext.example.mydsl.BrowserAutomation.Attribut");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_10, grammarAccess.getTestAccess().getCONTAINSKeyword_10());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getTestAccess().getQuotationMarkKeyword_11());
            		
            this_STRING_12=(Token)match(input,RULE_STRING,FOLLOW_11); 

            			newLeafNode(this_STRING_12, grammarAccess.getTestAccess().getSTRINGTerminalRuleCall_12());
            		
            otherlv_13=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getTestAccess().getQuotationMarkKeyword_13());
            		

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
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleBrowser"
    // InternalBrowserAutomation.g:235:1: entryRuleBrowser returns [EObject current=null] : iv_ruleBrowser= ruleBrowser EOF ;
    public final EObject entryRuleBrowser() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrowser = null;


        try {
            // InternalBrowserAutomation.g:235:48: (iv_ruleBrowser= ruleBrowser EOF )
            // InternalBrowserAutomation.g:236:2: iv_ruleBrowser= ruleBrowser EOF
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
    // InternalBrowserAutomation.g:242:1: ruleBrowser returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleBrowser() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:248:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:249:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:249:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBrowserAutomation.g:250:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:250:3: (lv_name_0_0= RULE_ID )
            // InternalBrowserAutomation.g:251:4: lv_name_0_0= RULE_ID
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
    // InternalBrowserAutomation.g:270:1: entryRuleUrl returns [EObject current=null] : iv_ruleUrl= ruleUrl EOF ;
    public final EObject entryRuleUrl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUrl = null;


        try {
            // InternalBrowserAutomation.g:270:44: (iv_ruleUrl= ruleUrl EOF )
            // InternalBrowserAutomation.g:271:2: iv_ruleUrl= ruleUrl EOF
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
    // InternalBrowserAutomation.g:277:1: ruleUrl returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleUrl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:283:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalBrowserAutomation.g:284:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalBrowserAutomation.g:284:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalBrowserAutomation.g:285:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalBrowserAutomation.g:285:3: (lv_name_0_0= RULE_STRING )
            // InternalBrowserAutomation.g:286:4: lv_name_0_0= RULE_STRING
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


    // $ANTLR start "entryRuleAttribut"
    // InternalBrowserAutomation.g:305:1: entryRuleAttribut returns [EObject current=null] : iv_ruleAttribut= ruleAttribut EOF ;
    public final EObject entryRuleAttribut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribut = null;


        try {
            // InternalBrowserAutomation.g:305:49: (iv_ruleAttribut= ruleAttribut EOF )
            // InternalBrowserAutomation.g:306:2: iv_ruleAttribut= ruleAttribut EOF
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
    // InternalBrowserAutomation.g:312:1: ruleAttribut returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAttribut() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalBrowserAutomation.g:318:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalBrowserAutomation.g:319:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalBrowserAutomation.g:319:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalBrowserAutomation.g:320:3: (lv_name_0_0= RULE_ID )
            {
            // InternalBrowserAutomation.g:320:3: (lv_name_0_0= RULE_ID )
            // InternalBrowserAutomation.g:321:4: lv_name_0_0= RULE_ID
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});

}