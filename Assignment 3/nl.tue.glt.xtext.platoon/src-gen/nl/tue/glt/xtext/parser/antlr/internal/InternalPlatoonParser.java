package nl.tue.glt.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import nl.tue.glt.xtext.services.PlatoonGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlatoonParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LV'", "'route'", "'FV'", "'front'", "'runner'", "'forward('", "')'", "'turn'", "'-'", "'Left'", "'Right'", "'<='", "'headway'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPlatoonParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlatoonParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPlatoonParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPlatoon.g"; }



     	private PlatoonGrammarAccess grammarAccess;

        public InternalPlatoonParser(TokenStream input, PlatoonGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "World";
       	}

       	@Override
       	protected PlatoonGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWorld"
    // InternalPlatoon.g:64:1: entryRuleWorld returns [EObject current=null] : iv_ruleWorld= ruleWorld EOF ;
    public final EObject entryRuleWorld() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorld = null;


        try {
            // InternalPlatoon.g:64:46: (iv_ruleWorld= ruleWorld EOF )
            // InternalPlatoon.g:65:2: iv_ruleWorld= ruleWorld EOF
            {
             newCompositeNode(grammarAccess.getWorldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorld=ruleWorld();

            state._fsp--;

             current =iv_ruleWorld; 
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
    // $ANTLR end "entryRuleWorld"


    // $ANTLR start "ruleWorld"
    // InternalPlatoon.g:71:1: ruleWorld returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleWorld() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPlatoon.g:77:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalPlatoon.g:78:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalPlatoon.g:78:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalPlatoon.g:79:3: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ( (otherlv_2= RULE_ID ) )
            {
            // InternalPlatoon.g:79:3: ( (otherlv_0= RULE_ID ) )
            // InternalPlatoon.g:80:4: (otherlv_0= RULE_ID )
            {
            // InternalPlatoon.g:80:4: (otherlv_0= RULE_ID )
            // InternalPlatoon.g:81:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorldRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_0, grammarAccess.getWorldAccess().getPlatoonPlatoonCrossReference_0_0());
            				

            }


            }

            // InternalPlatoon.g:92:3: ( (otherlv_1= RULE_ID ) )
            // InternalPlatoon.g:93:4: (otherlv_1= RULE_ID )
            {
            // InternalPlatoon.g:93:4: (otherlv_1= RULE_ID )
            // InternalPlatoon.g:94:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorldRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_3); 

            					newLeafNode(otherlv_1, grammarAccess.getWorldAccess().getRouteRouteCrossReference_1_0());
            				

            }


            }

            // InternalPlatoon.g:105:3: ( (otherlv_2= RULE_ID ) )
            // InternalPlatoon.g:106:4: (otherlv_2= RULE_ID )
            {
            // InternalPlatoon.g:106:4: (otherlv_2= RULE_ID )
            // InternalPlatoon.g:107:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorldRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getWorldAccess().getConstraintConstraintsCrossReference_2_0());
            				

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
    // $ANTLR end "ruleWorld"


    // $ANTLR start "entryRuleLeadingVehicle"
    // InternalPlatoon.g:122:1: entryRuleLeadingVehicle returns [EObject current=null] : iv_ruleLeadingVehicle= ruleLeadingVehicle EOF ;
    public final EObject entryRuleLeadingVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeadingVehicle = null;


        try {
            // InternalPlatoon.g:122:55: (iv_ruleLeadingVehicle= ruleLeadingVehicle EOF )
            // InternalPlatoon.g:123:2: iv_ruleLeadingVehicle= ruleLeadingVehicle EOF
            {
             newCompositeNode(grammarAccess.getLeadingVehicleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeadingVehicle=ruleLeadingVehicle();

            state._fsp--;

             current =iv_ruleLeadingVehicle; 
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
    // $ANTLR end "entryRuleLeadingVehicle"


    // $ANTLR start "ruleLeadingVehicle"
    // InternalPlatoon.g:129:1: ruleLeadingVehicle returns [EObject current=null] : (otherlv_0= 'LV' ( (lv_id_1_0= ruleEString ) ) otherlv_2= 'route' ( ( ruleEString ) ) ) ;
    public final EObject ruleLeadingVehicle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:135:2: ( (otherlv_0= 'LV' ( (lv_id_1_0= ruleEString ) ) otherlv_2= 'route' ( ( ruleEString ) ) ) )
            // InternalPlatoon.g:136:2: (otherlv_0= 'LV' ( (lv_id_1_0= ruleEString ) ) otherlv_2= 'route' ( ( ruleEString ) ) )
            {
            // InternalPlatoon.g:136:2: (otherlv_0= 'LV' ( (lv_id_1_0= ruleEString ) ) otherlv_2= 'route' ( ( ruleEString ) ) )
            // InternalPlatoon.g:137:3: otherlv_0= 'LV' ( (lv_id_1_0= ruleEString ) ) otherlv_2= 'route' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getLeadingVehicleAccess().getLVKeyword_0());
            		
            // InternalPlatoon.g:141:3: ( (lv_id_1_0= ruleEString ) )
            // InternalPlatoon.g:142:4: (lv_id_1_0= ruleEString )
            {
            // InternalPlatoon.g:142:4: (lv_id_1_0= ruleEString )
            // InternalPlatoon.g:143:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLeadingVehicleAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeadingVehicleRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"nl.tue.glt.xtext.Platoon.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getLeadingVehicleAccess().getRouteKeyword_2());
            		
            // InternalPlatoon.g:164:3: ( ( ruleEString ) )
            // InternalPlatoon.g:165:4: ( ruleEString )
            {
            // InternalPlatoon.g:165:4: ( ruleEString )
            // InternalPlatoon.g:166:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeadingVehicleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLeadingVehicleAccess().getRouteRouteCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleLeadingVehicle"


    // $ANTLR start "entryRuleFollowVehicle"
    // InternalPlatoon.g:184:1: entryRuleFollowVehicle returns [EObject current=null] : iv_ruleFollowVehicle= ruleFollowVehicle EOF ;
    public final EObject entryRuleFollowVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowVehicle = null;


        try {
            // InternalPlatoon.g:184:54: (iv_ruleFollowVehicle= ruleFollowVehicle EOF )
            // InternalPlatoon.g:185:2: iv_ruleFollowVehicle= ruleFollowVehicle EOF
            {
             newCompositeNode(grammarAccess.getFollowVehicleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFollowVehicle=ruleFollowVehicle();

            state._fsp--;

             current =iv_ruleFollowVehicle; 
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
    // $ANTLR end "entryRuleFollowVehicle"


    // $ANTLR start "ruleFollowVehicle"
    // InternalPlatoon.g:191:1: ruleFollowVehicle returns [EObject current=null] : (otherlv_0= 'FV' ( (lv_id_1_0= ruleEString ) ) otherlv_2= 'front' otherlv_3= 'runner' ( ( ruleEString ) ) ) ;
    public final EObject ruleFollowVehicle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:197:2: ( (otherlv_0= 'FV' ( (lv_id_1_0= ruleEString ) ) otherlv_2= 'front' otherlv_3= 'runner' ( ( ruleEString ) ) ) )
            // InternalPlatoon.g:198:2: (otherlv_0= 'FV' ( (lv_id_1_0= ruleEString ) ) otherlv_2= 'front' otherlv_3= 'runner' ( ( ruleEString ) ) )
            {
            // InternalPlatoon.g:198:2: (otherlv_0= 'FV' ( (lv_id_1_0= ruleEString ) ) otherlv_2= 'front' otherlv_3= 'runner' ( ( ruleEString ) ) )
            // InternalPlatoon.g:199:3: otherlv_0= 'FV' ( (lv_id_1_0= ruleEString ) ) otherlv_2= 'front' otherlv_3= 'runner' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFollowVehicleAccess().getFVKeyword_0());
            		
            // InternalPlatoon.g:203:3: ( (lv_id_1_0= ruleEString ) )
            // InternalPlatoon.g:204:4: (lv_id_1_0= ruleEString )
            {
            // InternalPlatoon.g:204:4: (lv_id_1_0= ruleEString )
            // InternalPlatoon.g:205:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFollowVehicleAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFollowVehicleRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"nl.tue.glt.xtext.Platoon.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getFollowVehicleAccess().getFrontKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getFollowVehicleAccess().getRunnerKeyword_3());
            		
            // InternalPlatoon.g:230:3: ( ( ruleEString ) )
            // InternalPlatoon.g:231:4: ( ruleEString )
            {
            // InternalPlatoon.g:231:4: ( ruleEString )
            // InternalPlatoon.g:232:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFollowVehicleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFollowVehicleAccess().getFrontRunnerVehicleCrossReference_4_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleFollowVehicle"


    // $ANTLR start "entryRuleEString"
    // InternalPlatoon.g:250:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPlatoon.g:250:47: (iv_ruleEString= ruleEString EOF )
            // InternalPlatoon.g:251:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPlatoon.g:257:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPlatoon.g:263:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPlatoon.g:264:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPlatoon.g:264:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPlatoon.g:265:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPlatoon.g:273:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleVehicle_Impl"
    // InternalPlatoon.g:284:1: entryRuleVehicle_Impl returns [EObject current=null] : iv_ruleVehicle_Impl= ruleVehicle_Impl EOF ;
    public final EObject entryRuleVehicle_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVehicle_Impl = null;


        try {
            // InternalPlatoon.g:284:53: (iv_ruleVehicle_Impl= ruleVehicle_Impl EOF )
            // InternalPlatoon.g:285:2: iv_ruleVehicle_Impl= ruleVehicle_Impl EOF
            {
             newCompositeNode(grammarAccess.getVehicle_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVehicle_Impl=ruleVehicle_Impl();

            state._fsp--;

             current =iv_ruleVehicle_Impl; 
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
    // $ANTLR end "entryRuleVehicle_Impl"


    // $ANTLR start "ruleVehicle_Impl"
    // InternalPlatoon.g:291:1: ruleVehicle_Impl returns [EObject current=null] : ( () ( (lv_id_1_0= ruleEString ) ) ) ;
    public final EObject ruleVehicle_Impl() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_id_1_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:297:2: ( ( () ( (lv_id_1_0= ruleEString ) ) ) )
            // InternalPlatoon.g:298:2: ( () ( (lv_id_1_0= ruleEString ) ) )
            {
            // InternalPlatoon.g:298:2: ( () ( (lv_id_1_0= ruleEString ) ) )
            // InternalPlatoon.g:299:3: () ( (lv_id_1_0= ruleEString ) )
            {
            // InternalPlatoon.g:299:3: ()
            // InternalPlatoon.g:300:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVehicle_ImplAccess().getVehicleAction_0(),
            					current);
            			

            }

            // InternalPlatoon.g:306:3: ( (lv_id_1_0= ruleEString ) )
            // InternalPlatoon.g:307:4: (lv_id_1_0= ruleEString )
            {
            // InternalPlatoon.g:307:4: (lv_id_1_0= ruleEString )
            // InternalPlatoon.g:308:5: lv_id_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVehicle_ImplAccess().getIdEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_id_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVehicle_ImplRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"nl.tue.glt.xtext.Platoon.EString");
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
    // $ANTLR end "ruleVehicle_Impl"


    // $ANTLR start "entryRuleCommand_Impl"
    // InternalPlatoon.g:329:1: entryRuleCommand_Impl returns [EObject current=null] : iv_ruleCommand_Impl= ruleCommand_Impl EOF ;
    public final EObject entryRuleCommand_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand_Impl = null;


        try {
            // InternalPlatoon.g:329:53: (iv_ruleCommand_Impl= ruleCommand_Impl EOF )
            // InternalPlatoon.g:330:2: iv_ruleCommand_Impl= ruleCommand_Impl EOF
            {
             newCompositeNode(grammarAccess.getCommand_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand_Impl=ruleCommand_Impl();

            state._fsp--;

             current =iv_ruleCommand_Impl; 
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
    // $ANTLR end "entryRuleCommand_Impl"


    // $ANTLR start "ruleCommand_Impl"
    // InternalPlatoon.g:336:1: ruleCommand_Impl returns [EObject current=null] : () ;
    public final EObject ruleCommand_Impl() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalPlatoon.g:342:2: ( () )
            // InternalPlatoon.g:343:2: ()
            {
            // InternalPlatoon.g:343:2: ()
            // InternalPlatoon.g:344:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getCommand_ImplAccess().getCommandAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCommand_Impl"


    // $ANTLR start "entryRuleForwardCommand"
    // InternalPlatoon.g:353:1: entryRuleForwardCommand returns [EObject current=null] : iv_ruleForwardCommand= ruleForwardCommand EOF ;
    public final EObject entryRuleForwardCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardCommand = null;


        try {
            // InternalPlatoon.g:353:55: (iv_ruleForwardCommand= ruleForwardCommand EOF )
            // InternalPlatoon.g:354:2: iv_ruleForwardCommand= ruleForwardCommand EOF
            {
             newCompositeNode(grammarAccess.getForwardCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForwardCommand=ruleForwardCommand();

            state._fsp--;

             current =iv_ruleForwardCommand; 
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
    // $ANTLR end "entryRuleForwardCommand"


    // $ANTLR start "ruleForwardCommand"
    // InternalPlatoon.g:360:1: ruleForwardCommand returns [EObject current=null] : (otherlv_0= 'forward(' ( (lv_distance_1_0= ruleEInt ) ) otherlv_2= ')' ) ;
    public final EObject ruleForwardCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_distance_1_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:366:2: ( (otherlv_0= 'forward(' ( (lv_distance_1_0= ruleEInt ) ) otherlv_2= ')' ) )
            // InternalPlatoon.g:367:2: (otherlv_0= 'forward(' ( (lv_distance_1_0= ruleEInt ) ) otherlv_2= ')' )
            {
            // InternalPlatoon.g:367:2: (otherlv_0= 'forward(' ( (lv_distance_1_0= ruleEInt ) ) otherlv_2= ')' )
            // InternalPlatoon.g:368:3: otherlv_0= 'forward(' ( (lv_distance_1_0= ruleEInt ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getForwardCommandAccess().getForwardKeyword_0());
            		
            // InternalPlatoon.g:372:3: ( (lv_distance_1_0= ruleEInt ) )
            // InternalPlatoon.g:373:4: (lv_distance_1_0= ruleEInt )
            {
            // InternalPlatoon.g:373:4: (lv_distance_1_0= ruleEInt )
            // InternalPlatoon.g:374:5: lv_distance_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getForwardCommandAccess().getDistanceEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_distance_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForwardCommandRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_1_0,
            						"nl.tue.glt.xtext.Platoon.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getForwardCommandAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleForwardCommand"


    // $ANTLR start "entryRuleTurnCommand"
    // InternalPlatoon.g:399:1: entryRuleTurnCommand returns [EObject current=null] : iv_ruleTurnCommand= ruleTurnCommand EOF ;
    public final EObject entryRuleTurnCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnCommand = null;


        try {
            // InternalPlatoon.g:399:52: (iv_ruleTurnCommand= ruleTurnCommand EOF )
            // InternalPlatoon.g:400:2: iv_ruleTurnCommand= ruleTurnCommand EOF
            {
             newCompositeNode(grammarAccess.getTurnCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTurnCommand=ruleTurnCommand();

            state._fsp--;

             current =iv_ruleTurnCommand; 
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
    // $ANTLR end "entryRuleTurnCommand"


    // $ANTLR start "ruleTurnCommand"
    // InternalPlatoon.g:406:1: ruleTurnCommand returns [EObject current=null] : ( () otherlv_1= 'turn' ( ( ruleEString ) ) ) ;
    public final EObject ruleTurnCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPlatoon.g:412:2: ( ( () otherlv_1= 'turn' ( ( ruleEString ) ) ) )
            // InternalPlatoon.g:413:2: ( () otherlv_1= 'turn' ( ( ruleEString ) ) )
            {
            // InternalPlatoon.g:413:2: ( () otherlv_1= 'turn' ( ( ruleEString ) ) )
            // InternalPlatoon.g:414:3: () otherlv_1= 'turn' ( ( ruleEString ) )
            {
            // InternalPlatoon.g:414:3: ()
            // InternalPlatoon.g:415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnCommandAccess().getTurnCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnCommandAccess().getTurnKeyword_1());
            		
            // InternalPlatoon.g:425:3: ( ( ruleEString ) )
            // InternalPlatoon.g:426:4: ( ruleEString )
            {
            // InternalPlatoon.g:426:4: ( ruleEString )
            // InternalPlatoon.g:427:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTurnCommandRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTurnCommandAccess().getDirectionDirectionCrossReference_2_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


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
    // $ANTLR end "ruleTurnCommand"


    // $ANTLR start "entryRuleEInt"
    // InternalPlatoon.g:445:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalPlatoon.g:445:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalPlatoon.g:446:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalPlatoon.g:452:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalPlatoon.g:458:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalPlatoon.g:459:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalPlatoon.g:459:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalPlatoon.g:460:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalPlatoon.g:460:3: (kw= '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPlatoon.g:461:4: kw= '-'
                    {
                    kw=(Token)match(input,19,FOLLOW_10); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleDirection_Impl"
    // InternalPlatoon.g:478:1: entryRuleDirection_Impl returns [EObject current=null] : iv_ruleDirection_Impl= ruleDirection_Impl EOF ;
    public final EObject entryRuleDirection_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirection_Impl = null;


        try {
            // InternalPlatoon.g:478:55: (iv_ruleDirection_Impl= ruleDirection_Impl EOF )
            // InternalPlatoon.g:479:2: iv_ruleDirection_Impl= ruleDirection_Impl EOF
            {
             newCompositeNode(grammarAccess.getDirection_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirection_Impl=ruleDirection_Impl();

            state._fsp--;

             current =iv_ruleDirection_Impl; 
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
    // $ANTLR end "entryRuleDirection_Impl"


    // $ANTLR start "ruleDirection_Impl"
    // InternalPlatoon.g:485:1: ruleDirection_Impl returns [EObject current=null] : () ;
    public final EObject ruleDirection_Impl() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalPlatoon.g:491:2: ( () )
            // InternalPlatoon.g:492:2: ()
            {
            // InternalPlatoon.g:492:2: ()
            // InternalPlatoon.g:493:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getDirection_ImplAccess().getDirectionAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirection_Impl"


    // $ANTLR start "entryRuleLeft"
    // InternalPlatoon.g:502:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalPlatoon.g:502:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalPlatoon.g:503:2: iv_ruleLeft= ruleLeft EOF
            {
             newCompositeNode(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeft=ruleLeft();

            state._fsp--;

             current =iv_ruleLeft; 
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
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalPlatoon.g:509:1: ruleLeft returns [EObject current=null] : ( () otherlv_1= 'Left' ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPlatoon.g:515:2: ( ( () otherlv_1= 'Left' ) )
            // InternalPlatoon.g:516:2: ( () otherlv_1= 'Left' )
            {
            // InternalPlatoon.g:516:2: ( () otherlv_1= 'Left' )
            // InternalPlatoon.g:517:3: () otherlv_1= 'Left'
            {
            // InternalPlatoon.g:517:3: ()
            // InternalPlatoon.g:518:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeftAccess().getLeftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getLeftKeyword_1());
            		

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
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // InternalPlatoon.g:532:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalPlatoon.g:532:46: (iv_ruleRight= ruleRight EOF )
            // InternalPlatoon.g:533:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight; 
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
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalPlatoon.g:539:1: ruleRight returns [EObject current=null] : ( () otherlv_1= 'Right' ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPlatoon.g:545:2: ( ( () otherlv_1= 'Right' ) )
            // InternalPlatoon.g:546:2: ( () otherlv_1= 'Right' )
            {
            // InternalPlatoon.g:546:2: ( () otherlv_1= 'Right' )
            // InternalPlatoon.g:547:3: () otherlv_1= 'Right'
            {
            // InternalPlatoon.g:547:3: ()
            // InternalPlatoon.g:548:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRightAccess().getRightAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getRightAccess().getRightKeyword_1());
            		

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
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleConstraint_Impl"
    // InternalPlatoon.g:562:1: entryRuleConstraint_Impl returns [EObject current=null] : iv_ruleConstraint_Impl= ruleConstraint_Impl EOF ;
    public final EObject entryRuleConstraint_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint_Impl = null;


        try {
            // InternalPlatoon.g:562:56: (iv_ruleConstraint_Impl= ruleConstraint_Impl EOF )
            // InternalPlatoon.g:563:2: iv_ruleConstraint_Impl= ruleConstraint_Impl EOF
            {
             newCompositeNode(grammarAccess.getConstraint_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint_Impl=ruleConstraint_Impl();

            state._fsp--;

             current =iv_ruleConstraint_Impl; 
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
    // $ANTLR end "entryRuleConstraint_Impl"


    // $ANTLR start "ruleConstraint_Impl"
    // InternalPlatoon.g:569:1: ruleConstraint_Impl returns [EObject current=null] : () ;
    public final EObject ruleConstraint_Impl() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalPlatoon.g:575:2: ( () )
            // InternalPlatoon.g:576:2: ()
            {
            // InternalPlatoon.g:576:2: ()
            // InternalPlatoon.g:577:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getConstraint_ImplAccess().getConstraintAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint_Impl"


    // $ANTLR start "entryRuleHeadwayConstraint"
    // InternalPlatoon.g:586:1: entryRuleHeadwayConstraint returns [EObject current=null] : iv_ruleHeadwayConstraint= ruleHeadwayConstraint EOF ;
    public final EObject entryRuleHeadwayConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeadwayConstraint = null;


        try {
            // InternalPlatoon.g:586:58: (iv_ruleHeadwayConstraint= ruleHeadwayConstraint EOF )
            // InternalPlatoon.g:587:2: iv_ruleHeadwayConstraint= ruleHeadwayConstraint EOF
            {
             newCompositeNode(grammarAccess.getHeadwayConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeadwayConstraint=ruleHeadwayConstraint();

            state._fsp--;

             current =iv_ruleHeadwayConstraint; 
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
    // $ANTLR end "entryRuleHeadwayConstraint"


    // $ANTLR start "ruleHeadwayConstraint"
    // InternalPlatoon.g:593:1: ruleHeadwayConstraint returns [EObject current=null] : ( ( (lv_min_0_0= ruleEInt ) ) otherlv_1= '<=' otherlv_2= 'headway' otherlv_3= '<=' ( (lv_max_4_0= ruleEInt ) ) ) ;
    public final EObject ruleHeadwayConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_min_0_0 = null;

        AntlrDatatypeRuleToken lv_max_4_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:599:2: ( ( ( (lv_min_0_0= ruleEInt ) ) otherlv_1= '<=' otherlv_2= 'headway' otherlv_3= '<=' ( (lv_max_4_0= ruleEInt ) ) ) )
            // InternalPlatoon.g:600:2: ( ( (lv_min_0_0= ruleEInt ) ) otherlv_1= '<=' otherlv_2= 'headway' otherlv_3= '<=' ( (lv_max_4_0= ruleEInt ) ) )
            {
            // InternalPlatoon.g:600:2: ( ( (lv_min_0_0= ruleEInt ) ) otherlv_1= '<=' otherlv_2= 'headway' otherlv_3= '<=' ( (lv_max_4_0= ruleEInt ) ) )
            // InternalPlatoon.g:601:3: ( (lv_min_0_0= ruleEInt ) ) otherlv_1= '<=' otherlv_2= 'headway' otherlv_3= '<=' ( (lv_max_4_0= ruleEInt ) )
            {
            // InternalPlatoon.g:601:3: ( (lv_min_0_0= ruleEInt ) )
            // InternalPlatoon.g:602:4: (lv_min_0_0= ruleEInt )
            {
            // InternalPlatoon.g:602:4: (lv_min_0_0= ruleEInt )
            // InternalPlatoon.g:603:5: lv_min_0_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getHeadwayConstraintAccess().getMinEIntParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_min_0_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeadwayConstraintRule());
            					}
            					set(
            						current,
            						"min",
            						lv_min_0_0,
            						"nl.tue.glt.xtext.Platoon.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getHeadwayConstraintAccess().getHeadwayKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_3());
            		
            // InternalPlatoon.g:632:3: ( (lv_max_4_0= ruleEInt ) )
            // InternalPlatoon.g:633:4: (lv_max_4_0= ruleEInt )
            {
            // InternalPlatoon.g:633:4: (lv_max_4_0= ruleEInt )
            // InternalPlatoon.g:634:5: lv_max_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getHeadwayConstraintAccess().getMaxEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_max_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeadwayConstraintRule());
            					}
            					set(
            						current,
            						"max",
            						lv_max_4_0,
            						"nl.tue.glt.xtext.Platoon.EInt");
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
    // $ANTLR end "ruleHeadwayConstraint"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});

}