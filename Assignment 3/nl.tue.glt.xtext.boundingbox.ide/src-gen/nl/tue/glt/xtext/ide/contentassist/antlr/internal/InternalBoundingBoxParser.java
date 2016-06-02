package nl.tue.glt.xtext.ide.contentassist.antlr.internal;

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
import nl.tue.glt.xtext.services.BoundingBoxGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBoundingBoxParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(BoundingBoxGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleWorld"
    // InternalBoundingBox.g:53:1: entryRuleWorld : ruleWorld EOF ;
    public final void entryRuleWorld() throws RecognitionException {
        try {
            // InternalBoundingBox.g:54:1: ( ruleWorld EOF )
            // InternalBoundingBox.g:55:1: ruleWorld EOF
            {
             before(grammarAccess.getWorldRule()); 
            pushFollow(FOLLOW_1);
            ruleWorld();

            state._fsp--;

             after(grammarAccess.getWorldRule()); 
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
    // $ANTLR end "entryRuleWorld"


    // $ANTLR start "ruleWorld"
    // InternalBoundingBox.g:62:1: ruleWorld : ( ( rule__World__Group__0 ) ) ;
    public final void ruleWorld() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:66:2: ( ( ( rule__World__Group__0 ) ) )
            // InternalBoundingBox.g:67:2: ( ( rule__World__Group__0 ) )
            {
            // InternalBoundingBox.g:67:2: ( ( rule__World__Group__0 ) )
            // InternalBoundingBox.g:68:3: ( rule__World__Group__0 )
            {
             before(grammarAccess.getWorldAccess().getGroup()); 
            // InternalBoundingBox.g:69:3: ( rule__World__Group__0 )
            // InternalBoundingBox.g:69:4: rule__World__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__World__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getGroup()); 

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
    // $ANTLR end "ruleWorld"


    // $ANTLR start "entryRuleMove"
    // InternalBoundingBox.g:78:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalBoundingBox.g:79:1: ( ruleMove EOF )
            // InternalBoundingBox.g:80:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
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
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalBoundingBox.g:87:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:91:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalBoundingBox.g:92:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalBoundingBox.g:92:2: ( ( rule__Move__Group__0 ) )
            // InternalBoundingBox.g:93:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalBoundingBox.g:94:3: ( rule__Move__Group__0 )
            // InternalBoundingBox.g:94:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

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
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleEInt"
    // InternalBoundingBox.g:103:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalBoundingBox.g:104:1: ( ruleEInt EOF )
            // InternalBoundingBox.g:105:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalBoundingBox.g:112:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:116:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalBoundingBox.g:117:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalBoundingBox.g:117:2: ( ( rule__EInt__Group__0 ) )
            // InternalBoundingBox.g:118:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalBoundingBox.g:119:3: ( rule__EInt__Group__0 )
            // InternalBoundingBox.g:119:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleMoveUp"
    // InternalBoundingBox.g:128:1: entryRuleMoveUp : ruleMoveUp EOF ;
    public final void entryRuleMoveUp() throws RecognitionException {
        try {
            // InternalBoundingBox.g:129:1: ( ruleMoveUp EOF )
            // InternalBoundingBox.g:130:1: ruleMoveUp EOF
            {
             before(grammarAccess.getMoveUpRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveUp();

            state._fsp--;

             after(grammarAccess.getMoveUpRule()); 
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
    // $ANTLR end "entryRuleMoveUp"


    // $ANTLR start "ruleMoveUp"
    // InternalBoundingBox.g:137:1: ruleMoveUp : ( ( rule__MoveUp__Group__0 ) ) ;
    public final void ruleMoveUp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:141:2: ( ( ( rule__MoveUp__Group__0 ) ) )
            // InternalBoundingBox.g:142:2: ( ( rule__MoveUp__Group__0 ) )
            {
            // InternalBoundingBox.g:142:2: ( ( rule__MoveUp__Group__0 ) )
            // InternalBoundingBox.g:143:3: ( rule__MoveUp__Group__0 )
            {
             before(grammarAccess.getMoveUpAccess().getGroup()); 
            // InternalBoundingBox.g:144:3: ( rule__MoveUp__Group__0 )
            // InternalBoundingBox.g:144:4: rule__MoveUp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveUp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveUpAccess().getGroup()); 

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
    // $ANTLR end "ruleMoveUp"


    // $ANTLR start "entryRuleMoveDown"
    // InternalBoundingBox.g:153:1: entryRuleMoveDown : ruleMoveDown EOF ;
    public final void entryRuleMoveDown() throws RecognitionException {
        try {
            // InternalBoundingBox.g:154:1: ( ruleMoveDown EOF )
            // InternalBoundingBox.g:155:1: ruleMoveDown EOF
            {
             before(grammarAccess.getMoveDownRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveDown();

            state._fsp--;

             after(grammarAccess.getMoveDownRule()); 
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
    // $ANTLR end "entryRuleMoveDown"


    // $ANTLR start "ruleMoveDown"
    // InternalBoundingBox.g:162:1: ruleMoveDown : ( ( rule__MoveDown__Group__0 ) ) ;
    public final void ruleMoveDown() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:166:2: ( ( ( rule__MoveDown__Group__0 ) ) )
            // InternalBoundingBox.g:167:2: ( ( rule__MoveDown__Group__0 ) )
            {
            // InternalBoundingBox.g:167:2: ( ( rule__MoveDown__Group__0 ) )
            // InternalBoundingBox.g:168:3: ( rule__MoveDown__Group__0 )
            {
             before(grammarAccess.getMoveDownAccess().getGroup()); 
            // InternalBoundingBox.g:169:3: ( rule__MoveDown__Group__0 )
            // InternalBoundingBox.g:169:4: rule__MoveDown__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveDown__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveDownAccess().getGroup()); 

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
    // $ANTLR end "ruleMoveDown"


    // $ANTLR start "entryRuleMoveLeft"
    // InternalBoundingBox.g:178:1: entryRuleMoveLeft : ruleMoveLeft EOF ;
    public final void entryRuleMoveLeft() throws RecognitionException {
        try {
            // InternalBoundingBox.g:179:1: ( ruleMoveLeft EOF )
            // InternalBoundingBox.g:180:1: ruleMoveLeft EOF
            {
             before(grammarAccess.getMoveLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveLeft();

            state._fsp--;

             after(grammarAccess.getMoveLeftRule()); 
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
    // $ANTLR end "entryRuleMoveLeft"


    // $ANTLR start "ruleMoveLeft"
    // InternalBoundingBox.g:187:1: ruleMoveLeft : ( ( rule__MoveLeft__Group__0 ) ) ;
    public final void ruleMoveLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:191:2: ( ( ( rule__MoveLeft__Group__0 ) ) )
            // InternalBoundingBox.g:192:2: ( ( rule__MoveLeft__Group__0 ) )
            {
            // InternalBoundingBox.g:192:2: ( ( rule__MoveLeft__Group__0 ) )
            // InternalBoundingBox.g:193:3: ( rule__MoveLeft__Group__0 )
            {
             before(grammarAccess.getMoveLeftAccess().getGroup()); 
            // InternalBoundingBox.g:194:3: ( rule__MoveLeft__Group__0 )
            // InternalBoundingBox.g:194:4: rule__MoveLeft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveLeft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveLeftAccess().getGroup()); 

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
    // $ANTLR end "ruleMoveLeft"


    // $ANTLR start "entryRuleMoveRight"
    // InternalBoundingBox.g:203:1: entryRuleMoveRight : ruleMoveRight EOF ;
    public final void entryRuleMoveRight() throws RecognitionException {
        try {
            // InternalBoundingBox.g:204:1: ( ruleMoveRight EOF )
            // InternalBoundingBox.g:205:1: ruleMoveRight EOF
            {
             before(grammarAccess.getMoveRightRule()); 
            pushFollow(FOLLOW_1);
            ruleMoveRight();

            state._fsp--;

             after(grammarAccess.getMoveRightRule()); 
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
    // $ANTLR end "entryRuleMoveRight"


    // $ANTLR start "ruleMoveRight"
    // InternalBoundingBox.g:212:1: ruleMoveRight : ( ( rule__MoveRight__Group__0 ) ) ;
    public final void ruleMoveRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:216:2: ( ( ( rule__MoveRight__Group__0 ) ) )
            // InternalBoundingBox.g:217:2: ( ( rule__MoveRight__Group__0 ) )
            {
            // InternalBoundingBox.g:217:2: ( ( rule__MoveRight__Group__0 ) )
            // InternalBoundingBox.g:218:3: ( rule__MoveRight__Group__0 )
            {
             before(grammarAccess.getMoveRightAccess().getGroup()); 
            // InternalBoundingBox.g:219:3: ( rule__MoveRight__Group__0 )
            // InternalBoundingBox.g:219:4: rule__MoveRight__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoveRight__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveRightAccess().getGroup()); 

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
    // $ANTLR end "ruleMoveRight"


    // $ANTLR start "rule__Move__Alternatives_0"
    // InternalBoundingBox.g:227:1: rule__Move__Alternatives_0 : ( ( ruleMoveUp ) | ( ruleMoveDown ) | ( ruleMoveLeft ) | ( ruleMoveRight ) );
    public final void rule__Move__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:231:1: ( ( ruleMoveUp ) | ( ruleMoveDown ) | ( ruleMoveLeft ) | ( ruleMoveRight ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 16:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalBoundingBox.g:232:2: ( ruleMoveUp )
                    {
                    // InternalBoundingBox.g:232:2: ( ruleMoveUp )
                    // InternalBoundingBox.g:233:3: ruleMoveUp
                    {
                     before(grammarAccess.getMoveAccess().getMoveUpParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveUp();

                    state._fsp--;

                     after(grammarAccess.getMoveAccess().getMoveUpParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBoundingBox.g:238:2: ( ruleMoveDown )
                    {
                    // InternalBoundingBox.g:238:2: ( ruleMoveDown )
                    // InternalBoundingBox.g:239:3: ruleMoveDown
                    {
                     before(grammarAccess.getMoveAccess().getMoveDownParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveDown();

                    state._fsp--;

                     after(grammarAccess.getMoveAccess().getMoveDownParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBoundingBox.g:244:2: ( ruleMoveLeft )
                    {
                    // InternalBoundingBox.g:244:2: ( ruleMoveLeft )
                    // InternalBoundingBox.g:245:3: ruleMoveLeft
                    {
                     before(grammarAccess.getMoveAccess().getMoveLeftParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveLeft();

                    state._fsp--;

                     after(grammarAccess.getMoveAccess().getMoveLeftParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBoundingBox.g:250:2: ( ruleMoveRight )
                    {
                    // InternalBoundingBox.g:250:2: ( ruleMoveRight )
                    // InternalBoundingBox.g:251:3: ruleMoveRight
                    {
                     before(grammarAccess.getMoveAccess().getMoveRightParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMoveRight();

                    state._fsp--;

                     after(grammarAccess.getMoveAccess().getMoveRightParserRuleCall_0_3()); 

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
    // $ANTLR end "rule__Move__Alternatives_0"


    // $ANTLR start "rule__World__Group__0"
    // InternalBoundingBox.g:260:1: rule__World__Group__0 : rule__World__Group__0__Impl rule__World__Group__1 ;
    public final void rule__World__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:264:1: ( rule__World__Group__0__Impl rule__World__Group__1 )
            // InternalBoundingBox.g:265:2: rule__World__Group__0__Impl rule__World__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__World__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__World__Group__1();

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
    // $ANTLR end "rule__World__Group__0"


    // $ANTLR start "rule__World__Group__0__Impl"
    // InternalBoundingBox.g:272:1: rule__World__Group__0__Impl : ( () ) ;
    public final void rule__World__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:276:1: ( ( () ) )
            // InternalBoundingBox.g:277:1: ( () )
            {
            // InternalBoundingBox.g:277:1: ( () )
            // InternalBoundingBox.g:278:2: ()
            {
             before(grammarAccess.getWorldAccess().getWorldAction_0()); 
            // InternalBoundingBox.g:279:2: ()
            // InternalBoundingBox.g:279:3: 
            {
            }

             after(grammarAccess.getWorldAccess().getWorldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__World__Group__0__Impl"


    // $ANTLR start "rule__World__Group__1"
    // InternalBoundingBox.g:287:1: rule__World__Group__1 : rule__World__Group__1__Impl rule__World__Group__2 ;
    public final void rule__World__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:291:1: ( rule__World__Group__1__Impl rule__World__Group__2 )
            // InternalBoundingBox.g:292:2: rule__World__Group__1__Impl rule__World__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__World__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__World__Group__2();

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
    // $ANTLR end "rule__World__Group__1"


    // $ANTLR start "rule__World__Group__1__Impl"
    // InternalBoundingBox.g:299:1: rule__World__Group__1__Impl : ( 'Box:' ) ;
    public final void rule__World__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:303:1: ( ( 'Box:' ) )
            // InternalBoundingBox.g:304:1: ( 'Box:' )
            {
            // InternalBoundingBox.g:304:1: ( 'Box:' )
            // InternalBoundingBox.g:305:2: 'Box:'
            {
             before(grammarAccess.getWorldAccess().getBoxKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getWorldAccess().getBoxKeyword_1()); 

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
    // $ANTLR end "rule__World__Group__1__Impl"


    // $ANTLR start "rule__World__Group__2"
    // InternalBoundingBox.g:314:1: rule__World__Group__2 : rule__World__Group__2__Impl ;
    public final void rule__World__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:318:1: ( rule__World__Group__2__Impl )
            // InternalBoundingBox.g:319:2: rule__World__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__World__Group__2__Impl();

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
    // $ANTLR end "rule__World__Group__2"


    // $ANTLR start "rule__World__Group__2__Impl"
    // InternalBoundingBox.g:325:1: rule__World__Group__2__Impl : ( ( ( rule__World__MoveCommandsAssignment_2 ) ) ( ( rule__World__MoveCommandsAssignment_2 )* ) ) ;
    public final void rule__World__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:329:1: ( ( ( ( rule__World__MoveCommandsAssignment_2 ) ) ( ( rule__World__MoveCommandsAssignment_2 )* ) ) )
            // InternalBoundingBox.g:330:1: ( ( ( rule__World__MoveCommandsAssignment_2 ) ) ( ( rule__World__MoveCommandsAssignment_2 )* ) )
            {
            // InternalBoundingBox.g:330:1: ( ( ( rule__World__MoveCommandsAssignment_2 ) ) ( ( rule__World__MoveCommandsAssignment_2 )* ) )
            // InternalBoundingBox.g:331:2: ( ( rule__World__MoveCommandsAssignment_2 ) ) ( ( rule__World__MoveCommandsAssignment_2 )* )
            {
            // InternalBoundingBox.g:331:2: ( ( rule__World__MoveCommandsAssignment_2 ) )
            // InternalBoundingBox.g:332:3: ( rule__World__MoveCommandsAssignment_2 )
            {
             before(grammarAccess.getWorldAccess().getMoveCommandsAssignment_2()); 
            // InternalBoundingBox.g:333:3: ( rule__World__MoveCommandsAssignment_2 )
            // InternalBoundingBox.g:333:4: rule__World__MoveCommandsAssignment_2
            {
            pushFollow(FOLLOW_5);
            rule__World__MoveCommandsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getMoveCommandsAssignment_2()); 

            }

            // InternalBoundingBox.g:336:2: ( ( rule__World__MoveCommandsAssignment_2 )* )
            // InternalBoundingBox.g:337:3: ( rule__World__MoveCommandsAssignment_2 )*
            {
             before(grammarAccess.getWorldAccess().getMoveCommandsAssignment_2()); 
            // InternalBoundingBox.g:338:3: ( rule__World__MoveCommandsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=13 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalBoundingBox.g:338:4: rule__World__MoveCommandsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__World__MoveCommandsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getWorldAccess().getMoveCommandsAssignment_2()); 

            }


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
    // $ANTLR end "rule__World__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalBoundingBox.g:348:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:352:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalBoundingBox.g:353:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

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
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalBoundingBox.g:360:1: rule__Move__Group__0__Impl : ( ( rule__Move__Alternatives_0 ) ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:364:1: ( ( ( rule__Move__Alternatives_0 ) ) )
            // InternalBoundingBox.g:365:1: ( ( rule__Move__Alternatives_0 ) )
            {
            // InternalBoundingBox.g:365:1: ( ( rule__Move__Alternatives_0 ) )
            // InternalBoundingBox.g:366:2: ( rule__Move__Alternatives_0 )
            {
             before(grammarAccess.getMoveAccess().getAlternatives_0()); 
            // InternalBoundingBox.g:367:2: ( rule__Move__Alternatives_0 )
            // InternalBoundingBox.g:367:3: rule__Move__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalBoundingBox.g:375:1: rule__Move__Group__1 : rule__Move__Group__1__Impl ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:379:1: ( rule__Move__Group__1__Impl )
            // InternalBoundingBox.g:380:2: rule__Move__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__1__Impl();

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
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalBoundingBox.g:386:1: rule__Move__Group__1__Impl : ( ( rule__Move__DistanceAssignment_1 ) ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:390:1: ( ( ( rule__Move__DistanceAssignment_1 ) ) )
            // InternalBoundingBox.g:391:1: ( ( rule__Move__DistanceAssignment_1 ) )
            {
            // InternalBoundingBox.g:391:1: ( ( rule__Move__DistanceAssignment_1 ) )
            // InternalBoundingBox.g:392:2: ( rule__Move__DistanceAssignment_1 )
            {
             before(grammarAccess.getMoveAccess().getDistanceAssignment_1()); 
            // InternalBoundingBox.g:393:2: ( rule__Move__DistanceAssignment_1 )
            // InternalBoundingBox.g:393:3: rule__Move__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Move__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getDistanceAssignment_1()); 

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
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalBoundingBox.g:402:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:406:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalBoundingBox.g:407:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalBoundingBox.g:414:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:418:1: ( ( ( '-' )? ) )
            // InternalBoundingBox.g:419:1: ( ( '-' )? )
            {
            // InternalBoundingBox.g:419:1: ( ( '-' )? )
            // InternalBoundingBox.g:420:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalBoundingBox.g:421:2: ( '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBoundingBox.g:421:3: '-'
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalBoundingBox.g:429:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:433:1: ( rule__EInt__Group__1__Impl )
            // InternalBoundingBox.g:434:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalBoundingBox.g:440:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:444:1: ( ( RULE_INT ) )
            // InternalBoundingBox.g:445:1: ( RULE_INT )
            {
            // InternalBoundingBox.g:445:1: ( RULE_INT )
            // InternalBoundingBox.g:446:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__MoveUp__Group__0"
    // InternalBoundingBox.g:456:1: rule__MoveUp__Group__0 : rule__MoveUp__Group__0__Impl rule__MoveUp__Group__1 ;
    public final void rule__MoveUp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:460:1: ( rule__MoveUp__Group__0__Impl rule__MoveUp__Group__1 )
            // InternalBoundingBox.g:461:2: rule__MoveUp__Group__0__Impl rule__MoveUp__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MoveUp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveUp__Group__1();

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
    // $ANTLR end "rule__MoveUp__Group__0"


    // $ANTLR start "rule__MoveUp__Group__0__Impl"
    // InternalBoundingBox.g:468:1: rule__MoveUp__Group__0__Impl : ( () ) ;
    public final void rule__MoveUp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:472:1: ( ( () ) )
            // InternalBoundingBox.g:473:1: ( () )
            {
            // InternalBoundingBox.g:473:1: ( () )
            // InternalBoundingBox.g:474:2: ()
            {
             before(grammarAccess.getMoveUpAccess().getMoveUpAction_0()); 
            // InternalBoundingBox.g:475:2: ()
            // InternalBoundingBox.g:475:3: 
            {
            }

             after(grammarAccess.getMoveUpAccess().getMoveUpAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveUp__Group__0__Impl"


    // $ANTLR start "rule__MoveUp__Group__1"
    // InternalBoundingBox.g:483:1: rule__MoveUp__Group__1 : rule__MoveUp__Group__1__Impl ;
    public final void rule__MoveUp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:487:1: ( rule__MoveUp__Group__1__Impl )
            // InternalBoundingBox.g:488:2: rule__MoveUp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveUp__Group__1__Impl();

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
    // $ANTLR end "rule__MoveUp__Group__1"


    // $ANTLR start "rule__MoveUp__Group__1__Impl"
    // InternalBoundingBox.g:494:1: rule__MoveUp__Group__1__Impl : ( 'up' ) ;
    public final void rule__MoveUp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:498:1: ( ( 'up' ) )
            // InternalBoundingBox.g:499:1: ( 'up' )
            {
            // InternalBoundingBox.g:499:1: ( 'up' )
            // InternalBoundingBox.g:500:2: 'up'
            {
             before(grammarAccess.getMoveUpAccess().getUpKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMoveUpAccess().getUpKeyword_1()); 

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
    // $ANTLR end "rule__MoveUp__Group__1__Impl"


    // $ANTLR start "rule__MoveDown__Group__0"
    // InternalBoundingBox.g:510:1: rule__MoveDown__Group__0 : rule__MoveDown__Group__0__Impl rule__MoveDown__Group__1 ;
    public final void rule__MoveDown__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:514:1: ( rule__MoveDown__Group__0__Impl rule__MoveDown__Group__1 )
            // InternalBoundingBox.g:515:2: rule__MoveDown__Group__0__Impl rule__MoveDown__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__MoveDown__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveDown__Group__1();

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
    // $ANTLR end "rule__MoveDown__Group__0"


    // $ANTLR start "rule__MoveDown__Group__0__Impl"
    // InternalBoundingBox.g:522:1: rule__MoveDown__Group__0__Impl : ( () ) ;
    public final void rule__MoveDown__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:526:1: ( ( () ) )
            // InternalBoundingBox.g:527:1: ( () )
            {
            // InternalBoundingBox.g:527:1: ( () )
            // InternalBoundingBox.g:528:2: ()
            {
             before(grammarAccess.getMoveDownAccess().getMoveDownAction_0()); 
            // InternalBoundingBox.g:529:2: ()
            // InternalBoundingBox.g:529:3: 
            {
            }

             after(grammarAccess.getMoveDownAccess().getMoveDownAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveDown__Group__0__Impl"


    // $ANTLR start "rule__MoveDown__Group__1"
    // InternalBoundingBox.g:537:1: rule__MoveDown__Group__1 : rule__MoveDown__Group__1__Impl ;
    public final void rule__MoveDown__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:541:1: ( rule__MoveDown__Group__1__Impl )
            // InternalBoundingBox.g:542:2: rule__MoveDown__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveDown__Group__1__Impl();

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
    // $ANTLR end "rule__MoveDown__Group__1"


    // $ANTLR start "rule__MoveDown__Group__1__Impl"
    // InternalBoundingBox.g:548:1: rule__MoveDown__Group__1__Impl : ( 'down' ) ;
    public final void rule__MoveDown__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:552:1: ( ( 'down' ) )
            // InternalBoundingBox.g:553:1: ( 'down' )
            {
            // InternalBoundingBox.g:553:1: ( 'down' )
            // InternalBoundingBox.g:554:2: 'down'
            {
             before(grammarAccess.getMoveDownAccess().getDownKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMoveDownAccess().getDownKeyword_1()); 

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
    // $ANTLR end "rule__MoveDown__Group__1__Impl"


    // $ANTLR start "rule__MoveLeft__Group__0"
    // InternalBoundingBox.g:564:1: rule__MoveLeft__Group__0 : rule__MoveLeft__Group__0__Impl rule__MoveLeft__Group__1 ;
    public final void rule__MoveLeft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:568:1: ( rule__MoveLeft__Group__0__Impl rule__MoveLeft__Group__1 )
            // InternalBoundingBox.g:569:2: rule__MoveLeft__Group__0__Impl rule__MoveLeft__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__MoveLeft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveLeft__Group__1();

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
    // $ANTLR end "rule__MoveLeft__Group__0"


    // $ANTLR start "rule__MoveLeft__Group__0__Impl"
    // InternalBoundingBox.g:576:1: rule__MoveLeft__Group__0__Impl : ( () ) ;
    public final void rule__MoveLeft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:580:1: ( ( () ) )
            // InternalBoundingBox.g:581:1: ( () )
            {
            // InternalBoundingBox.g:581:1: ( () )
            // InternalBoundingBox.g:582:2: ()
            {
             before(grammarAccess.getMoveLeftAccess().getMoveLeftAction_0()); 
            // InternalBoundingBox.g:583:2: ()
            // InternalBoundingBox.g:583:3: 
            {
            }

             after(grammarAccess.getMoveLeftAccess().getMoveLeftAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveLeft__Group__0__Impl"


    // $ANTLR start "rule__MoveLeft__Group__1"
    // InternalBoundingBox.g:591:1: rule__MoveLeft__Group__1 : rule__MoveLeft__Group__1__Impl ;
    public final void rule__MoveLeft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:595:1: ( rule__MoveLeft__Group__1__Impl )
            // InternalBoundingBox.g:596:2: rule__MoveLeft__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveLeft__Group__1__Impl();

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
    // $ANTLR end "rule__MoveLeft__Group__1"


    // $ANTLR start "rule__MoveLeft__Group__1__Impl"
    // InternalBoundingBox.g:602:1: rule__MoveLeft__Group__1__Impl : ( 'left' ) ;
    public final void rule__MoveLeft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:606:1: ( ( 'left' ) )
            // InternalBoundingBox.g:607:1: ( 'left' )
            {
            // InternalBoundingBox.g:607:1: ( 'left' )
            // InternalBoundingBox.g:608:2: 'left'
            {
             before(grammarAccess.getMoveLeftAccess().getLeftKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMoveLeftAccess().getLeftKeyword_1()); 

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
    // $ANTLR end "rule__MoveLeft__Group__1__Impl"


    // $ANTLR start "rule__MoveRight__Group__0"
    // InternalBoundingBox.g:618:1: rule__MoveRight__Group__0 : rule__MoveRight__Group__0__Impl rule__MoveRight__Group__1 ;
    public final void rule__MoveRight__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:622:1: ( rule__MoveRight__Group__0__Impl rule__MoveRight__Group__1 )
            // InternalBoundingBox.g:623:2: rule__MoveRight__Group__0__Impl rule__MoveRight__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MoveRight__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoveRight__Group__1();

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
    // $ANTLR end "rule__MoveRight__Group__0"


    // $ANTLR start "rule__MoveRight__Group__0__Impl"
    // InternalBoundingBox.g:630:1: rule__MoveRight__Group__0__Impl : ( () ) ;
    public final void rule__MoveRight__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:634:1: ( ( () ) )
            // InternalBoundingBox.g:635:1: ( () )
            {
            // InternalBoundingBox.g:635:1: ( () )
            // InternalBoundingBox.g:636:2: ()
            {
             before(grammarAccess.getMoveRightAccess().getMoveRightAction_0()); 
            // InternalBoundingBox.g:637:2: ()
            // InternalBoundingBox.g:637:3: 
            {
            }

             after(grammarAccess.getMoveRightAccess().getMoveRightAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoveRight__Group__0__Impl"


    // $ANTLR start "rule__MoveRight__Group__1"
    // InternalBoundingBox.g:645:1: rule__MoveRight__Group__1 : rule__MoveRight__Group__1__Impl ;
    public final void rule__MoveRight__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:649:1: ( rule__MoveRight__Group__1__Impl )
            // InternalBoundingBox.g:650:2: rule__MoveRight__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoveRight__Group__1__Impl();

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
    // $ANTLR end "rule__MoveRight__Group__1"


    // $ANTLR start "rule__MoveRight__Group__1__Impl"
    // InternalBoundingBox.g:656:1: rule__MoveRight__Group__1__Impl : ( 'right' ) ;
    public final void rule__MoveRight__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:660:1: ( ( 'right' ) )
            // InternalBoundingBox.g:661:1: ( 'right' )
            {
            // InternalBoundingBox.g:661:1: ( 'right' )
            // InternalBoundingBox.g:662:2: 'right'
            {
             before(grammarAccess.getMoveRightAccess().getRightKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMoveRightAccess().getRightKeyword_1()); 

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
    // $ANTLR end "rule__MoveRight__Group__1__Impl"


    // $ANTLR start "rule__World__MoveCommandsAssignment_2"
    // InternalBoundingBox.g:672:1: rule__World__MoveCommandsAssignment_2 : ( ruleMove ) ;
    public final void rule__World__MoveCommandsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:676:1: ( ( ruleMove ) )
            // InternalBoundingBox.g:677:2: ( ruleMove )
            {
            // InternalBoundingBox.g:677:2: ( ruleMove )
            // InternalBoundingBox.g:678:3: ruleMove
            {
             before(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getWorldAccess().getMoveCommandsMoveParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__World__MoveCommandsAssignment_2"


    // $ANTLR start "rule__Move__DistanceAssignment_1"
    // InternalBoundingBox.g:687:1: rule__Move__DistanceAssignment_1 : ( ruleEInt ) ;
    public final void rule__Move__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBoundingBox.g:691:1: ( ( ruleEInt ) )
            // InternalBoundingBox.g:692:2: ( ruleEInt )
            {
            // InternalBoundingBox.g:692:2: ( ruleEInt )
            // InternalBoundingBox.g:693:3: ruleEInt
            {
             before(grammarAccess.getMoveAccess().getDistanceEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getDistanceEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Move__DistanceAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});

}