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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'platoon'", "':'", "'route'", "'constraints'", "'LV'", "'FV'", "'front'", "'runner'", "'forward'", "'('", "')'", "'turn'", "'Left'", "'Right'", "'<='", "'headway'"
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
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalPlatoon.g:71:1: ruleWorld returns [EObject current=null] : ( () ( (lv_platoon_1_0= rulePlatoon ) ) ( (lv_route_2_0= ruleRoute ) ) ( (lv_constraints_3_0= ruleConstraints ) ) ) ;
    public final EObject ruleWorld() throws RecognitionException {
        EObject current = null;

        EObject lv_platoon_1_0 = null;

        EObject lv_route_2_0 = null;

        EObject lv_constraints_3_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:77:2: ( ( () ( (lv_platoon_1_0= rulePlatoon ) ) ( (lv_route_2_0= ruleRoute ) ) ( (lv_constraints_3_0= ruleConstraints ) ) ) )
            // InternalPlatoon.g:78:2: ( () ( (lv_platoon_1_0= rulePlatoon ) ) ( (lv_route_2_0= ruleRoute ) ) ( (lv_constraints_3_0= ruleConstraints ) ) )
            {
            // InternalPlatoon.g:78:2: ( () ( (lv_platoon_1_0= rulePlatoon ) ) ( (lv_route_2_0= ruleRoute ) ) ( (lv_constraints_3_0= ruleConstraints ) ) )
            // InternalPlatoon.g:79:3: () ( (lv_platoon_1_0= rulePlatoon ) ) ( (lv_route_2_0= ruleRoute ) ) ( (lv_constraints_3_0= ruleConstraints ) )
            {
            // InternalPlatoon.g:79:3: ()
            // InternalPlatoon.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorldAccess().getWorldAction_0(),
            					current);
            			

            }

            // InternalPlatoon.g:86:3: ( (lv_platoon_1_0= rulePlatoon ) )
            // InternalPlatoon.g:87:4: (lv_platoon_1_0= rulePlatoon )
            {
            // InternalPlatoon.g:87:4: (lv_platoon_1_0= rulePlatoon )
            // InternalPlatoon.g:88:5: lv_platoon_1_0= rulePlatoon
            {

            					newCompositeNode(grammarAccess.getWorldAccess().getPlatoonPlatoonParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_platoon_1_0=rulePlatoon();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorldRule());
            					}
            					set(
            						current,
            						"platoon",
            						lv_platoon_1_0,
            						"nl.tue.glt.xtext.Platoon.Platoon");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlatoon.g:105:3: ( (lv_route_2_0= ruleRoute ) )
            // InternalPlatoon.g:106:4: (lv_route_2_0= ruleRoute )
            {
            // InternalPlatoon.g:106:4: (lv_route_2_0= ruleRoute )
            // InternalPlatoon.g:107:5: lv_route_2_0= ruleRoute
            {

            					newCompositeNode(grammarAccess.getWorldAccess().getRouteRouteParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_route_2_0=ruleRoute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorldRule());
            					}
            					set(
            						current,
            						"route",
            						lv_route_2_0,
            						"nl.tue.glt.xtext.Platoon.Route");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlatoon.g:124:3: ( (lv_constraints_3_0= ruleConstraints ) )
            // InternalPlatoon.g:125:4: (lv_constraints_3_0= ruleConstraints )
            {
            // InternalPlatoon.g:125:4: (lv_constraints_3_0= ruleConstraints )
            // InternalPlatoon.g:126:5: lv_constraints_3_0= ruleConstraints
            {

            					newCompositeNode(grammarAccess.getWorldAccess().getConstraintsConstraintsParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_constraints_3_0=ruleConstraints();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorldRule());
            					}
            					set(
            						current,
            						"constraints",
            						lv_constraints_3_0,
            						"nl.tue.glt.xtext.Platoon.Constraints");
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
    // $ANTLR end "ruleWorld"


    // $ANTLR start "entryRuleCommand"
    // InternalPlatoon.g:147:1: entryRuleCommand returns [EObject current=null] : iv_ruleCommand= ruleCommand EOF ;
    public final EObject entryRuleCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommand = null;


        try {
            // InternalPlatoon.g:147:48: (iv_ruleCommand= ruleCommand EOF )
            // InternalPlatoon.g:148:2: iv_ruleCommand= ruleCommand EOF
            {
             newCompositeNode(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommand=ruleCommand();

            state._fsp--;

             current =iv_ruleCommand; 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalPlatoon.g:154:1: ruleCommand returns [EObject current=null] : (this_ForwardCommand_0= ruleForwardCommand | this_TurnCommand_1= ruleTurnCommand ) ;
    public final EObject ruleCommand() throws RecognitionException {
        EObject current = null;

        EObject this_ForwardCommand_0 = null;

        EObject this_TurnCommand_1 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:160:2: ( (this_ForwardCommand_0= ruleForwardCommand | this_TurnCommand_1= ruleTurnCommand ) )
            // InternalPlatoon.g:161:2: (this_ForwardCommand_0= ruleForwardCommand | this_TurnCommand_1= ruleTurnCommand )
            {
            // InternalPlatoon.g:161:2: (this_ForwardCommand_0= ruleForwardCommand | this_TurnCommand_1= ruleTurnCommand )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==19) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPlatoon.g:162:3: this_ForwardCommand_0= ruleForwardCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getForwardCommandParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForwardCommand_0=ruleForwardCommand();

                    state._fsp--;


                    			current = this_ForwardCommand_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPlatoon.g:171:3: this_TurnCommand_1= ruleTurnCommand
                    {

                    			newCompositeNode(grammarAccess.getCommandAccess().getTurnCommandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TurnCommand_1=ruleTurnCommand();

                    state._fsp--;


                    			current = this_TurnCommand_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleConstraint"
    // InternalPlatoon.g:183:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // InternalPlatoon.g:183:51: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalPlatoon.g:184:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalPlatoon.g:190:1: ruleConstraint returns [EObject current=null] : this_HeadwayConstraint_0= ruleHeadwayConstraint ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_HeadwayConstraint_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:196:2: (this_HeadwayConstraint_0= ruleHeadwayConstraint )
            // InternalPlatoon.g:197:2: this_HeadwayConstraint_0= ruleHeadwayConstraint
            {

            		newCompositeNode(grammarAccess.getConstraintAccess().getHeadwayConstraintParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_HeadwayConstraint_0=ruleHeadwayConstraint();

            state._fsp--;


            		current = this_HeadwayConstraint_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRulePlatoon"
    // InternalPlatoon.g:208:1: entryRulePlatoon returns [EObject current=null] : iv_rulePlatoon= rulePlatoon EOF ;
    public final EObject entryRulePlatoon() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlatoon = null;


        try {
            // InternalPlatoon.g:208:48: (iv_rulePlatoon= rulePlatoon EOF )
            // InternalPlatoon.g:209:2: iv_rulePlatoon= rulePlatoon EOF
            {
             newCompositeNode(grammarAccess.getPlatoonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlatoon=rulePlatoon();

            state._fsp--;

             current =iv_rulePlatoon; 
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
    // $ANTLR end "entryRulePlatoon"


    // $ANTLR start "rulePlatoon"
    // InternalPlatoon.g:215:1: rulePlatoon returns [EObject current=null] : ( () otherlv_1= 'platoon' otherlv_2= ':' ( (lv_LV_3_0= ruleLeadingVehicle ) ) ( (lv_FV_4_0= ruleFollowVehicle ) )? ) ;
    public final EObject rulePlatoon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_LV_3_0 = null;

        EObject lv_FV_4_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:221:2: ( ( () otherlv_1= 'platoon' otherlv_2= ':' ( (lv_LV_3_0= ruleLeadingVehicle ) ) ( (lv_FV_4_0= ruleFollowVehicle ) )? ) )
            // InternalPlatoon.g:222:2: ( () otherlv_1= 'platoon' otherlv_2= ':' ( (lv_LV_3_0= ruleLeadingVehicle ) ) ( (lv_FV_4_0= ruleFollowVehicle ) )? )
            {
            // InternalPlatoon.g:222:2: ( () otherlv_1= 'platoon' otherlv_2= ':' ( (lv_LV_3_0= ruleLeadingVehicle ) ) ( (lv_FV_4_0= ruleFollowVehicle ) )? )
            // InternalPlatoon.g:223:3: () otherlv_1= 'platoon' otherlv_2= ':' ( (lv_LV_3_0= ruleLeadingVehicle ) ) ( (lv_FV_4_0= ruleFollowVehicle ) )?
            {
            // InternalPlatoon.g:223:3: ()
            // InternalPlatoon.g:224:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlatoonAccess().getPlatoonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getPlatoonAccess().getPlatoonKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPlatoonAccess().getColonKeyword_2());
            		
            // InternalPlatoon.g:238:3: ( (lv_LV_3_0= ruleLeadingVehicle ) )
            // InternalPlatoon.g:239:4: (lv_LV_3_0= ruleLeadingVehicle )
            {
            // InternalPlatoon.g:239:4: (lv_LV_3_0= ruleLeadingVehicle )
            // InternalPlatoon.g:240:5: lv_LV_3_0= ruleLeadingVehicle
            {

            					newCompositeNode(grammarAccess.getPlatoonAccess().getLVLeadingVehicleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_LV_3_0=ruleLeadingVehicle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlatoonRule());
            					}
            					set(
            						current,
            						"LV",
            						lv_LV_3_0,
            						"nl.tue.glt.xtext.Platoon.LeadingVehicle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlatoon.g:257:3: ( (lv_FV_4_0= ruleFollowVehicle ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPlatoon.g:258:4: (lv_FV_4_0= ruleFollowVehicle )
                    {
                    // InternalPlatoon.g:258:4: (lv_FV_4_0= ruleFollowVehicle )
                    // InternalPlatoon.g:259:5: lv_FV_4_0= ruleFollowVehicle
                    {

                    					newCompositeNode(grammarAccess.getPlatoonAccess().getFVFollowVehicleParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_FV_4_0=ruleFollowVehicle();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPlatoonRule());
                    					}
                    					add(
                    						current,
                    						"FV",
                    						lv_FV_4_0,
                    						"nl.tue.glt.xtext.Platoon.FollowVehicle");
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
    // $ANTLR end "rulePlatoon"


    // $ANTLR start "entryRuleRoute"
    // InternalPlatoon.g:280:1: entryRuleRoute returns [EObject current=null] : iv_ruleRoute= ruleRoute EOF ;
    public final EObject entryRuleRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoute = null;


        try {
            // InternalPlatoon.g:280:46: (iv_ruleRoute= ruleRoute EOF )
            // InternalPlatoon.g:281:2: iv_ruleRoute= ruleRoute EOF
            {
             newCompositeNode(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoute=ruleRoute();

            state._fsp--;

             current =iv_ruleRoute; 
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
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // InternalPlatoon.g:287:1: ruleRoute returns [EObject current=null] : ( () otherlv_1= 'route' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_commands_4_0= ruleCommand ) ) ( (lv_commands_5_0= ruleCommand ) )* ) ;
    public final EObject ruleRoute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_commands_4_0 = null;

        EObject lv_commands_5_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:293:2: ( ( () otherlv_1= 'route' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_commands_4_0= ruleCommand ) ) ( (lv_commands_5_0= ruleCommand ) )* ) )
            // InternalPlatoon.g:294:2: ( () otherlv_1= 'route' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_commands_4_0= ruleCommand ) ) ( (lv_commands_5_0= ruleCommand ) )* )
            {
            // InternalPlatoon.g:294:2: ( () otherlv_1= 'route' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_commands_4_0= ruleCommand ) ) ( (lv_commands_5_0= ruleCommand ) )* )
            // InternalPlatoon.g:295:3: () otherlv_1= 'route' ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( (lv_commands_4_0= ruleCommand ) ) ( (lv_commands_5_0= ruleCommand ) )*
            {
            // InternalPlatoon.g:295:3: ()
            // InternalPlatoon.g:296:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRouteAccess().getRouteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRouteAccess().getRouteKeyword_1());
            		
            // InternalPlatoon.g:306:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlatoon.g:307:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlatoon.g:307:4: (lv_name_2_0= ruleEString )
            // InternalPlatoon.g:308:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"nl.tue.glt.xtext.Platoon.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getRouteAccess().getColonKeyword_3());
            		
            // InternalPlatoon.g:329:3: ( (lv_commands_4_0= ruleCommand ) )
            // InternalPlatoon.g:330:4: (lv_commands_4_0= ruleCommand )
            {
            // InternalPlatoon.g:330:4: (lv_commands_4_0= ruleCommand )
            // InternalPlatoon.g:331:5: lv_commands_4_0= ruleCommand
            {

            					newCompositeNode(grammarAccess.getRouteAccess().getCommandsCommandParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_commands_4_0=ruleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRouteRule());
            					}
            					add(
            						current,
            						"commands",
            						lv_commands_4_0,
            						"nl.tue.glt.xtext.Platoon.Command");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlatoon.g:348:3: ( (lv_commands_5_0= ruleCommand ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19||LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPlatoon.g:349:4: (lv_commands_5_0= ruleCommand )
            	    {
            	    // InternalPlatoon.g:349:4: (lv_commands_5_0= ruleCommand )
            	    // InternalPlatoon.g:350:5: lv_commands_5_0= ruleCommand
            	    {

            	    					newCompositeNode(grammarAccess.getRouteAccess().getCommandsCommandParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_commands_5_0=ruleCommand();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRouteRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commands",
            	    						lv_commands_5_0,
            	    						"nl.tue.glt.xtext.Platoon.Command");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleConstraints"
    // InternalPlatoon.g:371:1: entryRuleConstraints returns [EObject current=null] : iv_ruleConstraints= ruleConstraints EOF ;
    public final EObject entryRuleConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraints = null;


        try {
            // InternalPlatoon.g:371:52: (iv_ruleConstraints= ruleConstraints EOF )
            // InternalPlatoon.g:372:2: iv_ruleConstraints= ruleConstraints EOF
            {
             newCompositeNode(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstraints=ruleConstraints();

            state._fsp--;

             current =iv_ruleConstraints; 
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
    // $ANTLR end "entryRuleConstraints"


    // $ANTLR start "ruleConstraints"
    // InternalPlatoon.g:378:1: ruleConstraints returns [EObject current=null] : (otherlv_0= 'constraints' otherlv_1= ':' ( (lv_constraints_2_0= ruleConstraint ) ) ( (lv_constraints_3_0= ruleConstraint ) )* ) ;
    public final EObject ruleConstraints() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:384:2: ( (otherlv_0= 'constraints' otherlv_1= ':' ( (lv_constraints_2_0= ruleConstraint ) ) ( (lv_constraints_3_0= ruleConstraint ) )* ) )
            // InternalPlatoon.g:385:2: (otherlv_0= 'constraints' otherlv_1= ':' ( (lv_constraints_2_0= ruleConstraint ) ) ( (lv_constraints_3_0= ruleConstraint ) )* )
            {
            // InternalPlatoon.g:385:2: (otherlv_0= 'constraints' otherlv_1= ':' ( (lv_constraints_2_0= ruleConstraint ) ) ( (lv_constraints_3_0= ruleConstraint ) )* )
            // InternalPlatoon.g:386:3: otherlv_0= 'constraints' otherlv_1= ':' ( (lv_constraints_2_0= ruleConstraint ) ) ( (lv_constraints_3_0= ruleConstraint ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getConstraintsAccess().getConstraintsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getConstraintsAccess().getColonKeyword_1());
            		
            // InternalPlatoon.g:394:3: ( (lv_constraints_2_0= ruleConstraint ) )
            // InternalPlatoon.g:395:4: (lv_constraints_2_0= ruleConstraint )
            {
            // InternalPlatoon.g:395:4: (lv_constraints_2_0= ruleConstraint )
            // InternalPlatoon.g:396:5: lv_constraints_2_0= ruleConstraint
            {

            					newCompositeNode(grammarAccess.getConstraintsAccess().getConstraintsConstraintParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_constraints_2_0=ruleConstraint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            					}
            					add(
            						current,
            						"constraints",
            						lv_constraints_2_0,
            						"nl.tue.glt.xtext.Platoon.Constraint");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlatoon.g:413:3: ( (lv_constraints_3_0= ruleConstraint ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_INT) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPlatoon.g:414:4: (lv_constraints_3_0= ruleConstraint )
            	    {
            	    // InternalPlatoon.g:414:4: (lv_constraints_3_0= ruleConstraint )
            	    // InternalPlatoon.g:415:5: lv_constraints_3_0= ruleConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getConstraintsAccess().getConstraintsConstraintParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_constraints_3_0=ruleConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConstraintsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_3_0,
            	    						"nl.tue.glt.xtext.Platoon.Constraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleConstraints"


    // $ANTLR start "entryRuleLeadingVehicle"
    // InternalPlatoon.g:436:1: entryRuleLeadingVehicle returns [EObject current=null] : iv_ruleLeadingVehicle= ruleLeadingVehicle EOF ;
    public final EObject entryRuleLeadingVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeadingVehicle = null;


        try {
            // InternalPlatoon.g:436:55: (iv_ruleLeadingVehicle= ruleLeadingVehicle EOF )
            // InternalPlatoon.g:437:2: iv_ruleLeadingVehicle= ruleLeadingVehicle EOF
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
    // InternalPlatoon.g:443:1: ruleLeadingVehicle returns [EObject current=null] : ( () otherlv_1= 'LV' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'route' ( ( ruleEString ) ) ) ;
    public final EObject ruleLeadingVehicle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:449:2: ( ( () otherlv_1= 'LV' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'route' ( ( ruleEString ) ) ) )
            // InternalPlatoon.g:450:2: ( () otherlv_1= 'LV' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'route' ( ( ruleEString ) ) )
            {
            // InternalPlatoon.g:450:2: ( () otherlv_1= 'LV' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'route' ( ( ruleEString ) ) )
            // InternalPlatoon.g:451:3: () otherlv_1= 'LV' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'route' ( ( ruleEString ) )
            {
            // InternalPlatoon.g:451:3: ()
            // InternalPlatoon.g:452:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeadingVehicleAccess().getLeadingVehicleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLeadingVehicleAccess().getLVKeyword_1());
            		
            // InternalPlatoon.g:462:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlatoon.g:463:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlatoon.g:463:4: (lv_name_2_0= ruleEString )
            // InternalPlatoon.g:464:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLeadingVehicleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeadingVehicleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"nl.tue.glt.xtext.Platoon.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getLeadingVehicleAccess().getRouteKeyword_3());
            		
            // InternalPlatoon.g:485:3: ( ( ruleEString ) )
            // InternalPlatoon.g:486:4: ( ruleEString )
            {
            // InternalPlatoon.g:486:4: ( ruleEString )
            // InternalPlatoon.g:487:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeadingVehicleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLeadingVehicleAccess().getRouteRouteCrossReference_4_0());
            				
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
    // InternalPlatoon.g:505:1: entryRuleFollowVehicle returns [EObject current=null] : iv_ruleFollowVehicle= ruleFollowVehicle EOF ;
    public final EObject entryRuleFollowVehicle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowVehicle = null;


        try {
            // InternalPlatoon.g:505:54: (iv_ruleFollowVehicle= ruleFollowVehicle EOF )
            // InternalPlatoon.g:506:2: iv_ruleFollowVehicle= ruleFollowVehicle EOF
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
    // InternalPlatoon.g:512:1: ruleFollowVehicle returns [EObject current=null] : ( () otherlv_1= 'FV' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'front' otherlv_4= 'runner' ( ( ruleEString ) ) ) ;
    public final EObject ruleFollowVehicle() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:518:2: ( ( () otherlv_1= 'FV' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'front' otherlv_4= 'runner' ( ( ruleEString ) ) ) )
            // InternalPlatoon.g:519:2: ( () otherlv_1= 'FV' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'front' otherlv_4= 'runner' ( ( ruleEString ) ) )
            {
            // InternalPlatoon.g:519:2: ( () otherlv_1= 'FV' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'front' otherlv_4= 'runner' ( ( ruleEString ) ) )
            // InternalPlatoon.g:520:3: () otherlv_1= 'FV' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'front' otherlv_4= 'runner' ( ( ruleEString ) )
            {
            // InternalPlatoon.g:520:3: ()
            // InternalPlatoon.g:521:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFollowVehicleAccess().getFollowVehicleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFollowVehicleAccess().getFVKeyword_1());
            		
            // InternalPlatoon.g:531:3: ( (lv_name_2_0= ruleEString ) )
            // InternalPlatoon.g:532:4: (lv_name_2_0= ruleEString )
            {
            // InternalPlatoon.g:532:4: (lv_name_2_0= ruleEString )
            // InternalPlatoon.g:533:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFollowVehicleAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFollowVehicleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"nl.tue.glt.xtext.Platoon.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getFollowVehicleAccess().getFrontKeyword_3());
            		
            otherlv_4=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getFollowVehicleAccess().getRunnerKeyword_4());
            		
            // InternalPlatoon.g:558:3: ( ( ruleEString ) )
            // InternalPlatoon.g:559:4: ( ruleEString )
            {
            // InternalPlatoon.g:559:4: ( ruleEString )
            // InternalPlatoon.g:560:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFollowVehicleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFollowVehicleAccess().getFollowsVehicleCrossReference_5_0());
            				
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
    // InternalPlatoon.g:578:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalPlatoon.g:578:47: (iv_ruleEString= ruleEString EOF )
            // InternalPlatoon.g:579:2: iv_ruleEString= ruleEString EOF
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
    // InternalPlatoon.g:585:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalPlatoon.g:591:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalPlatoon.g:592:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalPlatoon.g:592:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalPlatoon.g:593:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPlatoon.g:601:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleForwardCommand"
    // InternalPlatoon.g:612:1: entryRuleForwardCommand returns [EObject current=null] : iv_ruleForwardCommand= ruleForwardCommand EOF ;
    public final EObject entryRuleForwardCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForwardCommand = null;


        try {
            // InternalPlatoon.g:612:55: (iv_ruleForwardCommand= ruleForwardCommand EOF )
            // InternalPlatoon.g:613:2: iv_ruleForwardCommand= ruleForwardCommand EOF
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
    // InternalPlatoon.g:619:1: ruleForwardCommand returns [EObject current=null] : ( () otherlv_1= 'forward' otherlv_2= '(' ( (lv_distance_3_0= RULE_INT ) ) otherlv_4= ')' ) ;
    public final EObject ruleForwardCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_distance_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalPlatoon.g:625:2: ( ( () otherlv_1= 'forward' otherlv_2= '(' ( (lv_distance_3_0= RULE_INT ) ) otherlv_4= ')' ) )
            // InternalPlatoon.g:626:2: ( () otherlv_1= 'forward' otherlv_2= '(' ( (lv_distance_3_0= RULE_INT ) ) otherlv_4= ')' )
            {
            // InternalPlatoon.g:626:2: ( () otherlv_1= 'forward' otherlv_2= '(' ( (lv_distance_3_0= RULE_INT ) ) otherlv_4= ')' )
            // InternalPlatoon.g:627:3: () otherlv_1= 'forward' otherlv_2= '(' ( (lv_distance_3_0= RULE_INT ) ) otherlv_4= ')'
            {
            // InternalPlatoon.g:627:3: ()
            // InternalPlatoon.g:628:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForwardCommandAccess().getForwardCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardCommandAccess().getForwardKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getForwardCommandAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPlatoon.g:642:3: ( (lv_distance_3_0= RULE_INT ) )
            // InternalPlatoon.g:643:4: (lv_distance_3_0= RULE_INT )
            {
            // InternalPlatoon.g:643:4: (lv_distance_3_0= RULE_INT )
            // InternalPlatoon.g:644:5: lv_distance_3_0= RULE_INT
            {
            lv_distance_3_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_distance_3_0, grammarAccess.getForwardCommandAccess().getDistanceINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForwardCommandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"distance",
            						lv_distance_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getForwardCommandAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalPlatoon.g:668:1: entryRuleTurnCommand returns [EObject current=null] : iv_ruleTurnCommand= ruleTurnCommand EOF ;
    public final EObject entryRuleTurnCommand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnCommand = null;


        try {
            // InternalPlatoon.g:668:52: (iv_ruleTurnCommand= ruleTurnCommand EOF )
            // InternalPlatoon.g:669:2: iv_ruleTurnCommand= ruleTurnCommand EOF
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
    // InternalPlatoon.g:675:1: ruleTurnCommand returns [EObject current=null] : ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleDirection ) ) ) ;
    public final EObject ruleTurnCommand() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_direction_2_0 = null;



        	enterRule();

        try {
            // InternalPlatoon.g:681:2: ( ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleDirection ) ) ) )
            // InternalPlatoon.g:682:2: ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleDirection ) ) )
            {
            // InternalPlatoon.g:682:2: ( () otherlv_1= 'turn' ( (lv_direction_2_0= ruleDirection ) ) )
            // InternalPlatoon.g:683:3: () otherlv_1= 'turn' ( (lv_direction_2_0= ruleDirection ) )
            {
            // InternalPlatoon.g:683:3: ()
            // InternalPlatoon.g:684:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTurnCommandAccess().getTurnCommandAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getTurnCommandAccess().getTurnKeyword_1());
            		
            // InternalPlatoon.g:694:3: ( (lv_direction_2_0= ruleDirection ) )
            // InternalPlatoon.g:695:4: (lv_direction_2_0= ruleDirection )
            {
            // InternalPlatoon.g:695:4: (lv_direction_2_0= ruleDirection )
            // InternalPlatoon.g:696:5: lv_direction_2_0= ruleDirection
            {

            					newCompositeNode(grammarAccess.getTurnCommandAccess().getDirectionDirectionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_direction_2_0=ruleDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTurnCommandRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_2_0,
            						"nl.tue.glt.xtext.Platoon.Direction");
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


    // $ANTLR start "entryRuleDirection"
    // InternalPlatoon.g:717:1: entryRuleDirection returns [String current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final String entryRuleDirection() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDirection = null;


        try {
            // InternalPlatoon.g:717:49: (iv_ruleDirection= ruleDirection EOF )
            // InternalPlatoon.g:718:2: iv_ruleDirection= ruleDirection EOF
            {
             newCompositeNode(grammarAccess.getDirectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirection=ruleDirection();

            state._fsp--;

             current =iv_ruleDirection.getText(); 
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
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // InternalPlatoon.g:724:1: ruleDirection returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'Left' | kw= 'Right' ) ;
    public final AntlrDatatypeRuleToken ruleDirection() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPlatoon.g:730:2: ( (kw= 'Left' | kw= 'Right' ) )
            // InternalPlatoon.g:731:2: (kw= 'Left' | kw= 'Right' )
            {
            // InternalPlatoon.g:731:2: (kw= 'Left' | kw= 'Right' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPlatoon.g:732:3: kw= 'Left'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDirectionAccess().getLeftKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPlatoon.g:738:3: kw= 'Right'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDirectionAccess().getRightKeyword_1());
                    		

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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "entryRuleHeadwayConstraint"
    // InternalPlatoon.g:747:1: entryRuleHeadwayConstraint returns [EObject current=null] : iv_ruleHeadwayConstraint= ruleHeadwayConstraint EOF ;
    public final EObject entryRuleHeadwayConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeadwayConstraint = null;


        try {
            // InternalPlatoon.g:747:58: (iv_ruleHeadwayConstraint= ruleHeadwayConstraint EOF )
            // InternalPlatoon.g:748:2: iv_ruleHeadwayConstraint= ruleHeadwayConstraint EOF
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
    // InternalPlatoon.g:754:1: ruleHeadwayConstraint returns [EObject current=null] : ( () ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '<=' otherlv_3= 'headway' otherlv_4= '<=' ( (lv_max_5_0= RULE_INT ) ) ) ;
    public final EObject ruleHeadwayConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_min_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_max_5_0=null;


        	enterRule();

        try {
            // InternalPlatoon.g:760:2: ( ( () ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '<=' otherlv_3= 'headway' otherlv_4= '<=' ( (lv_max_5_0= RULE_INT ) ) ) )
            // InternalPlatoon.g:761:2: ( () ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '<=' otherlv_3= 'headway' otherlv_4= '<=' ( (lv_max_5_0= RULE_INT ) ) )
            {
            // InternalPlatoon.g:761:2: ( () ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '<=' otherlv_3= 'headway' otherlv_4= '<=' ( (lv_max_5_0= RULE_INT ) ) )
            // InternalPlatoon.g:762:3: () ( (lv_min_1_0= RULE_INT ) ) otherlv_2= '<=' otherlv_3= 'headway' otherlv_4= '<=' ( (lv_max_5_0= RULE_INT ) )
            {
            // InternalPlatoon.g:762:3: ()
            // InternalPlatoon.g:763:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeadwayConstraintAccess().getHeadwayConstraintAction_0(),
            					current);
            			

            }

            // InternalPlatoon.g:769:3: ( (lv_min_1_0= RULE_INT ) )
            // InternalPlatoon.g:770:4: (lv_min_1_0= RULE_INT )
            {
            // InternalPlatoon.g:770:4: (lv_min_1_0= RULE_INT )
            // InternalPlatoon.g:771:5: lv_min_1_0= RULE_INT
            {
            lv_min_1_0=(Token)match(input,RULE_INT,FOLLOW_18); 

            					newLeafNode(lv_min_1_0, grammarAccess.getHeadwayConstraintAccess().getMinINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeadwayConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getHeadwayConstraintAccess().getHeadwayKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_4());
            		
            // InternalPlatoon.g:799:3: ( (lv_max_5_0= RULE_INT ) )
            // InternalPlatoon.g:800:4: (lv_max_5_0= RULE_INT )
            {
            // InternalPlatoon.g:800:4: (lv_max_5_0= RULE_INT )
            // InternalPlatoon.g:801:5: lv_max_5_0= RULE_INT
            {
            lv_max_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_max_5_0, grammarAccess.getHeadwayConstraintAccess().getMaxINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeadwayConstraintRule());
            					}
            					setWithLastConsumed(
            						current,
            						"max",
            						lv_max_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000480002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});

}