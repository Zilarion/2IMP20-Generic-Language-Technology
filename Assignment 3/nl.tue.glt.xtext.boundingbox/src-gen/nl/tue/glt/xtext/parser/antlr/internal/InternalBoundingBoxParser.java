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
import nl.tue.glt.xtext.services.BoundingBoxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBoundingBoxParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Box:'", "'-'", "'up'", "'down'", "'left'", "'right'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=4;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalBoundingBoxParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBoundingBoxParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBoundingBoxParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBoundingBox.g"; }



     	private BoundingBoxGrammarAccess grammarAccess;

        public InternalBoundingBoxParser(TokenStream input, BoundingBoxGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "World";
       	}

       	@Override
       	protected BoundingBoxGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWorld"
    // InternalBoundingBox.g:64:1: entryRuleWorld returns [EObject current=null] : iv_ruleWorld= ruleWorld EOF ;
    public final EObject entryRuleWorld() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorld = null;


        try {
            // InternalBoundingBox.g:64:46: (iv_ruleWorld= ruleWorld EOF )
            // InternalBoundingBox.g:65:2: iv_ruleWorld= ruleWorld EOF
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
    // InternalBoundingBox.g:71:1: ruleWorld returns [EObject current=null] : ( () otherlv_1= 'Box:' ( (lv_moveCommands_2_0= ruleMove ) )+ ) ;
    public final EObject ruleWorld() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_moveCommands_2_0 = null;



        	enterRule();

        try {
            // InternalBoundingBox.g:77:2: ( ( () otherlv_1= 'Box:' ( (lv_moveCommands_2_0= ruleMove ) )+ ) )
            // InternalBoundingBox.g:78:2: ( () otherlv_1= 'Box:' ( (lv_moveCommands_2_0= ruleMove ) )+ )
            {
            // InternalBoundingBox.g:78:2: ( () otherlv_1= 'Box:' ( (lv_moveCommands_2_0= ruleMove ) )+ )
            // InternalBoundingBox.g:79:3: () otherlv_1= 'Box:' ( (lv_moveCommands_2_0= ruleMove ) )+
            {
            // InternalBoundingBox.g:79:3: ()
            // InternalBoundingBox.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorldAccess().getWorldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWorldAccess().getBoxKeyword_1());
            		
            // InternalBoundingBox.g:90:3: ( (lv_moveCommands_2_0= ruleMove ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=13 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBoundingBox.g:91:4: (lv_moveCommands_2_0= ruleMove )
            	    {
            	    // InternalBoundingBox.g:91:4: (lv_moveCommands_2_0= ruleMove )
            	    // InternalBoundingBox.g:92:5: lv_moveCommands_2_0= ruleMove
            	    {

            	    					newCompositeNode(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_moveCommands_2_0=ruleMove();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWorldRule());
            	    					}
            	    					add(
            	    						current,
            	    						"moveCommands",
            	    						lv_moveCommands_2_0,
            	    						"nl.tue.glt.xtext.BoundingBox.Move");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleWorld"


    // $ANTLR start "entryRuleMove"
    // InternalBoundingBox.g:113:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalBoundingBox.g:113:45: (iv_ruleMove= ruleMove EOF )
            // InternalBoundingBox.g:114:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalBoundingBox.g:120:1: ruleMove returns [EObject current=null] : ( (this_MoveUp_0= ruleMoveUp | this_MoveDown_1= ruleMoveDown | this_MoveLeft_2= ruleMoveLeft | this_MoveRight_3= ruleMoveRight ) ( (lv_distance_4_0= ruleEInt ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        EObject this_MoveUp_0 = null;

        EObject this_MoveDown_1 = null;

        EObject this_MoveLeft_2 = null;

        EObject this_MoveRight_3 = null;

        AntlrDatatypeRuleToken lv_distance_4_0 = null;



        	enterRule();

        try {
            // InternalBoundingBox.g:126:2: ( ( (this_MoveUp_0= ruleMoveUp | this_MoveDown_1= ruleMoveDown | this_MoveLeft_2= ruleMoveLeft | this_MoveRight_3= ruleMoveRight ) ( (lv_distance_4_0= ruleEInt ) ) ) )
            // InternalBoundingBox.g:127:2: ( (this_MoveUp_0= ruleMoveUp | this_MoveDown_1= ruleMoveDown | this_MoveLeft_2= ruleMoveLeft | this_MoveRight_3= ruleMoveRight ) ( (lv_distance_4_0= ruleEInt ) ) )
            {
            // InternalBoundingBox.g:127:2: ( (this_MoveUp_0= ruleMoveUp | this_MoveDown_1= ruleMoveDown | this_MoveLeft_2= ruleMoveLeft | this_MoveRight_3= ruleMoveRight ) ( (lv_distance_4_0= ruleEInt ) ) )
            // InternalBoundingBox.g:128:3: (this_MoveUp_0= ruleMoveUp | this_MoveDown_1= ruleMoveDown | this_MoveLeft_2= ruleMoveLeft | this_MoveRight_3= ruleMoveRight ) ( (lv_distance_4_0= ruleEInt ) )
            {
            // InternalBoundingBox.g:128:3: (this_MoveUp_0= ruleMoveUp | this_MoveDown_1= ruleMoveDown | this_MoveLeft_2= ruleMoveLeft | this_MoveRight_3= ruleMoveRight )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalBoundingBox.g:129:4: this_MoveUp_0= ruleMoveUp
                    {

                    				newCompositeNode(grammarAccess.getMoveAccess().getMoveUpParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_5);
                    this_MoveUp_0=ruleMoveUp();

                    state._fsp--;


                    				current = this_MoveUp_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalBoundingBox.g:138:4: this_MoveDown_1= ruleMoveDown
                    {

                    				newCompositeNode(grammarAccess.getMoveAccess().getMoveDownParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_MoveDown_1=ruleMoveDown();

                    state._fsp--;


                    				current = this_MoveDown_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalBoundingBox.g:147:4: this_MoveLeft_2= ruleMoveLeft
                    {

                    				newCompositeNode(grammarAccess.getMoveAccess().getMoveLeftParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_5);
                    this_MoveLeft_2=ruleMoveLeft();

                    state._fsp--;


                    				current = this_MoveLeft_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalBoundingBox.g:156:4: this_MoveRight_3= ruleMoveRight
                    {

                    				newCompositeNode(grammarAccess.getMoveAccess().getMoveRightParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_5);
                    this_MoveRight_3=ruleMoveRight();

                    state._fsp--;


                    				current = this_MoveRight_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalBoundingBox.g:165:3: ( (lv_distance_4_0= ruleEInt ) )
            // InternalBoundingBox.g:166:4: (lv_distance_4_0= ruleEInt )
            {
            // InternalBoundingBox.g:166:4: (lv_distance_4_0= ruleEInt )
            // InternalBoundingBox.g:167:5: lv_distance_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getDistanceEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_distance_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_4_0,
            						"nl.tue.glt.xtext.BoundingBox.EInt");
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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleEInt"
    // InternalBoundingBox.g:188:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalBoundingBox.g:188:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalBoundingBox.g:189:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalBoundingBox.g:195:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalBoundingBox.g:201:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalBoundingBox.g:202:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalBoundingBox.g:202:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalBoundingBox.g:203:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalBoundingBox.g:203:3: (kw= '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBoundingBox.g:204:4: kw= '-'
                    {
                    kw=(Token)match(input,12,FOLLOW_6); 

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


    // $ANTLR start "entryRuleMoveUp"
    // InternalBoundingBox.g:221:1: entryRuleMoveUp returns [EObject current=null] : iv_ruleMoveUp= ruleMoveUp EOF ;
    public final EObject entryRuleMoveUp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveUp = null;


        try {
            // InternalBoundingBox.g:221:47: (iv_ruleMoveUp= ruleMoveUp EOF )
            // InternalBoundingBox.g:222:2: iv_ruleMoveUp= ruleMoveUp EOF
            {
             newCompositeNode(grammarAccess.getMoveUpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveUp=ruleMoveUp();

            state._fsp--;

             current =iv_ruleMoveUp; 
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
    // $ANTLR end "entryRuleMoveUp"


    // $ANTLR start "ruleMoveUp"
    // InternalBoundingBox.g:228:1: ruleMoveUp returns [EObject current=null] : ( () otherlv_1= 'up' ) ;
    public final EObject ruleMoveUp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBoundingBox.g:234:2: ( ( () otherlv_1= 'up' ) )
            // InternalBoundingBox.g:235:2: ( () otherlv_1= 'up' )
            {
            // InternalBoundingBox.g:235:2: ( () otherlv_1= 'up' )
            // InternalBoundingBox.g:236:3: () otherlv_1= 'up'
            {
            // InternalBoundingBox.g:236:3: ()
            // InternalBoundingBox.g:237:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveUpAccess().getMoveUpAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveUpAccess().getUpKeyword_1());
            		

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
    // $ANTLR end "ruleMoveUp"


    // $ANTLR start "entryRuleMoveDown"
    // InternalBoundingBox.g:251:1: entryRuleMoveDown returns [EObject current=null] : iv_ruleMoveDown= ruleMoveDown EOF ;
    public final EObject entryRuleMoveDown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveDown = null;


        try {
            // InternalBoundingBox.g:251:49: (iv_ruleMoveDown= ruleMoveDown EOF )
            // InternalBoundingBox.g:252:2: iv_ruleMoveDown= ruleMoveDown EOF
            {
             newCompositeNode(grammarAccess.getMoveDownRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveDown=ruleMoveDown();

            state._fsp--;

             current =iv_ruleMoveDown; 
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
    // $ANTLR end "entryRuleMoveDown"


    // $ANTLR start "ruleMoveDown"
    // InternalBoundingBox.g:258:1: ruleMoveDown returns [EObject current=null] : ( () otherlv_1= 'down' ) ;
    public final EObject ruleMoveDown() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBoundingBox.g:264:2: ( ( () otherlv_1= 'down' ) )
            // InternalBoundingBox.g:265:2: ( () otherlv_1= 'down' )
            {
            // InternalBoundingBox.g:265:2: ( () otherlv_1= 'down' )
            // InternalBoundingBox.g:266:3: () otherlv_1= 'down'
            {
            // InternalBoundingBox.g:266:3: ()
            // InternalBoundingBox.g:267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveDownAccess().getMoveDownAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveDownAccess().getDownKeyword_1());
            		

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
    // $ANTLR end "ruleMoveDown"


    // $ANTLR start "entryRuleMoveLeft"
    // InternalBoundingBox.g:281:1: entryRuleMoveLeft returns [EObject current=null] : iv_ruleMoveLeft= ruleMoveLeft EOF ;
    public final EObject entryRuleMoveLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveLeft = null;


        try {
            // InternalBoundingBox.g:281:49: (iv_ruleMoveLeft= ruleMoveLeft EOF )
            // InternalBoundingBox.g:282:2: iv_ruleMoveLeft= ruleMoveLeft EOF
            {
             newCompositeNode(grammarAccess.getMoveLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveLeft=ruleMoveLeft();

            state._fsp--;

             current =iv_ruleMoveLeft; 
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
    // $ANTLR end "entryRuleMoveLeft"


    // $ANTLR start "ruleMoveLeft"
    // InternalBoundingBox.g:288:1: ruleMoveLeft returns [EObject current=null] : ( () otherlv_1= 'left' ) ;
    public final EObject ruleMoveLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBoundingBox.g:294:2: ( ( () otherlv_1= 'left' ) )
            // InternalBoundingBox.g:295:2: ( () otherlv_1= 'left' )
            {
            // InternalBoundingBox.g:295:2: ( () otherlv_1= 'left' )
            // InternalBoundingBox.g:296:3: () otherlv_1= 'left'
            {
            // InternalBoundingBox.g:296:3: ()
            // InternalBoundingBox.g:297:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveLeftAccess().getMoveLeftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveLeftAccess().getLeftKeyword_1());
            		

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
    // $ANTLR end "ruleMoveLeft"


    // $ANTLR start "entryRuleMoveRight"
    // InternalBoundingBox.g:311:1: entryRuleMoveRight returns [EObject current=null] : iv_ruleMoveRight= ruleMoveRight EOF ;
    public final EObject entryRuleMoveRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoveRight = null;


        try {
            // InternalBoundingBox.g:311:50: (iv_ruleMoveRight= ruleMoveRight EOF )
            // InternalBoundingBox.g:312:2: iv_ruleMoveRight= ruleMoveRight EOF
            {
             newCompositeNode(grammarAccess.getMoveRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoveRight=ruleMoveRight();

            state._fsp--;

             current =iv_ruleMoveRight; 
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
    // $ANTLR end "entryRuleMoveRight"


    // $ANTLR start "ruleMoveRight"
    // InternalBoundingBox.g:318:1: ruleMoveRight returns [EObject current=null] : ( () otherlv_1= 'right' ) ;
    public final EObject ruleMoveRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalBoundingBox.g:324:2: ( ( () otherlv_1= 'right' ) )
            // InternalBoundingBox.g:325:2: ( () otherlv_1= 'right' )
            {
            // InternalBoundingBox.g:325:2: ( () otherlv_1= 'right' )
            // InternalBoundingBox.g:326:3: () otherlv_1= 'right'
            {
            // InternalBoundingBox.g:326:3: ()
            // InternalBoundingBox.g:327:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMoveRightAccess().getMoveRightAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveRightAccess().getRightKeyword_1());
            		

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
    // $ANTLR end "ruleMoveRight"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});

}