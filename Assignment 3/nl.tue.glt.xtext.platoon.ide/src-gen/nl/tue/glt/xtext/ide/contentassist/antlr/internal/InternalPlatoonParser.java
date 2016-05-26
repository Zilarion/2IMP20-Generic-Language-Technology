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
import nl.tue.glt.xtext.services.PlatoonGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlatoonParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'LV'", "'route'", "'FV'", "'front'", "'runner'", "'forward('", "')'", "'turn'", "'-'", "'Left'", "'Right'", "'<='", "'headway'"
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

    	public void setGrammarAccess(PlatoonGrammarAccess grammarAccess) {
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
    // InternalPlatoon.g:53:1: entryRuleWorld : ruleWorld EOF ;
    public final void entryRuleWorld() throws RecognitionException {
        try {
            // InternalPlatoon.g:54:1: ( ruleWorld EOF )
            // InternalPlatoon.g:55:1: ruleWorld EOF
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
    // InternalPlatoon.g:62:1: ruleWorld : ( ( rule__World__Group__0 ) ) ;
    public final void ruleWorld() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:66:2: ( ( ( rule__World__Group__0 ) ) )
            // InternalPlatoon.g:67:2: ( ( rule__World__Group__0 ) )
            {
            // InternalPlatoon.g:67:2: ( ( rule__World__Group__0 ) )
            // InternalPlatoon.g:68:3: ( rule__World__Group__0 )
            {
             before(grammarAccess.getWorldAccess().getGroup()); 
            // InternalPlatoon.g:69:3: ( rule__World__Group__0 )
            // InternalPlatoon.g:69:4: rule__World__Group__0
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


    // $ANTLR start "entryRuleLeadingVehicle"
    // InternalPlatoon.g:78:1: entryRuleLeadingVehicle : ruleLeadingVehicle EOF ;
    public final void entryRuleLeadingVehicle() throws RecognitionException {
        try {
            // InternalPlatoon.g:79:1: ( ruleLeadingVehicle EOF )
            // InternalPlatoon.g:80:1: ruleLeadingVehicle EOF
            {
             before(grammarAccess.getLeadingVehicleRule()); 
            pushFollow(FOLLOW_1);
            ruleLeadingVehicle();

            state._fsp--;

             after(grammarAccess.getLeadingVehicleRule()); 
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
    // $ANTLR end "entryRuleLeadingVehicle"


    // $ANTLR start "ruleLeadingVehicle"
    // InternalPlatoon.g:87:1: ruleLeadingVehicle : ( ( rule__LeadingVehicle__Group__0 ) ) ;
    public final void ruleLeadingVehicle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:91:2: ( ( ( rule__LeadingVehicle__Group__0 ) ) )
            // InternalPlatoon.g:92:2: ( ( rule__LeadingVehicle__Group__0 ) )
            {
            // InternalPlatoon.g:92:2: ( ( rule__LeadingVehicle__Group__0 ) )
            // InternalPlatoon.g:93:3: ( rule__LeadingVehicle__Group__0 )
            {
             before(grammarAccess.getLeadingVehicleAccess().getGroup()); 
            // InternalPlatoon.g:94:3: ( rule__LeadingVehicle__Group__0 )
            // InternalPlatoon.g:94:4: rule__LeadingVehicle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeadingVehicle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeadingVehicleAccess().getGroup()); 

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
    // $ANTLR end "ruleLeadingVehicle"


    // $ANTLR start "entryRuleFollowVehicle"
    // InternalPlatoon.g:103:1: entryRuleFollowVehicle : ruleFollowVehicle EOF ;
    public final void entryRuleFollowVehicle() throws RecognitionException {
        try {
            // InternalPlatoon.g:104:1: ( ruleFollowVehicle EOF )
            // InternalPlatoon.g:105:1: ruleFollowVehicle EOF
            {
             before(grammarAccess.getFollowVehicleRule()); 
            pushFollow(FOLLOW_1);
            ruleFollowVehicle();

            state._fsp--;

             after(grammarAccess.getFollowVehicleRule()); 
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
    // $ANTLR end "entryRuleFollowVehicle"


    // $ANTLR start "ruleFollowVehicle"
    // InternalPlatoon.g:112:1: ruleFollowVehicle : ( ( rule__FollowVehicle__Group__0 ) ) ;
    public final void ruleFollowVehicle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:116:2: ( ( ( rule__FollowVehicle__Group__0 ) ) )
            // InternalPlatoon.g:117:2: ( ( rule__FollowVehicle__Group__0 ) )
            {
            // InternalPlatoon.g:117:2: ( ( rule__FollowVehicle__Group__0 ) )
            // InternalPlatoon.g:118:3: ( rule__FollowVehicle__Group__0 )
            {
             before(grammarAccess.getFollowVehicleAccess().getGroup()); 
            // InternalPlatoon.g:119:3: ( rule__FollowVehicle__Group__0 )
            // InternalPlatoon.g:119:4: rule__FollowVehicle__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FollowVehicle__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFollowVehicleAccess().getGroup()); 

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
    // $ANTLR end "ruleFollowVehicle"


    // $ANTLR start "entryRuleEString"
    // InternalPlatoon.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPlatoon.g:129:1: ( ruleEString EOF )
            // InternalPlatoon.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalPlatoon.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalPlatoon.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalPlatoon.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalPlatoon.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalPlatoon.g:144:3: ( rule__EString__Alternatives )
            // InternalPlatoon.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleVehicle_Impl"
    // InternalPlatoon.g:153:1: entryRuleVehicle_Impl : ruleVehicle_Impl EOF ;
    public final void entryRuleVehicle_Impl() throws RecognitionException {
        try {
            // InternalPlatoon.g:154:1: ( ruleVehicle_Impl EOF )
            // InternalPlatoon.g:155:1: ruleVehicle_Impl EOF
            {
             before(grammarAccess.getVehicle_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleVehicle_Impl();

            state._fsp--;

             after(grammarAccess.getVehicle_ImplRule()); 
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
    // $ANTLR end "entryRuleVehicle_Impl"


    // $ANTLR start "ruleVehicle_Impl"
    // InternalPlatoon.g:162:1: ruleVehicle_Impl : ( ( rule__Vehicle_Impl__Group__0 ) ) ;
    public final void ruleVehicle_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:166:2: ( ( ( rule__Vehicle_Impl__Group__0 ) ) )
            // InternalPlatoon.g:167:2: ( ( rule__Vehicle_Impl__Group__0 ) )
            {
            // InternalPlatoon.g:167:2: ( ( rule__Vehicle_Impl__Group__0 ) )
            // InternalPlatoon.g:168:3: ( rule__Vehicle_Impl__Group__0 )
            {
             before(grammarAccess.getVehicle_ImplAccess().getGroup()); 
            // InternalPlatoon.g:169:3: ( rule__Vehicle_Impl__Group__0 )
            // InternalPlatoon.g:169:4: rule__Vehicle_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Vehicle_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVehicle_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleVehicle_Impl"


    // $ANTLR start "entryRuleCommand_Impl"
    // InternalPlatoon.g:178:1: entryRuleCommand_Impl : ruleCommand_Impl EOF ;
    public final void entryRuleCommand_Impl() throws RecognitionException {
        try {
            // InternalPlatoon.g:179:1: ( ruleCommand_Impl EOF )
            // InternalPlatoon.g:180:1: ruleCommand_Impl EOF
            {
             before(grammarAccess.getCommand_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand_Impl();

            state._fsp--;

             after(grammarAccess.getCommand_ImplRule()); 
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
    // $ANTLR end "entryRuleCommand_Impl"


    // $ANTLR start "ruleCommand_Impl"
    // InternalPlatoon.g:187:1: ruleCommand_Impl : ( () ) ;
    public final void ruleCommand_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:191:2: ( ( () ) )
            // InternalPlatoon.g:192:2: ( () )
            {
            // InternalPlatoon.g:192:2: ( () )
            // InternalPlatoon.g:193:3: ()
            {
             before(grammarAccess.getCommand_ImplAccess().getCommandAction()); 
            // InternalPlatoon.g:194:3: ()
            // InternalPlatoon.g:194:4: 
            {
            }

             after(grammarAccess.getCommand_ImplAccess().getCommandAction()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommand_Impl"


    // $ANTLR start "entryRuleForwardCommand"
    // InternalPlatoon.g:203:1: entryRuleForwardCommand : ruleForwardCommand EOF ;
    public final void entryRuleForwardCommand() throws RecognitionException {
        try {
            // InternalPlatoon.g:204:1: ( ruleForwardCommand EOF )
            // InternalPlatoon.g:205:1: ruleForwardCommand EOF
            {
             before(grammarAccess.getForwardCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleForwardCommand();

            state._fsp--;

             after(grammarAccess.getForwardCommandRule()); 
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
    // $ANTLR end "entryRuleForwardCommand"


    // $ANTLR start "ruleForwardCommand"
    // InternalPlatoon.g:212:1: ruleForwardCommand : ( ( rule__ForwardCommand__Group__0 ) ) ;
    public final void ruleForwardCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:216:2: ( ( ( rule__ForwardCommand__Group__0 ) ) )
            // InternalPlatoon.g:217:2: ( ( rule__ForwardCommand__Group__0 ) )
            {
            // InternalPlatoon.g:217:2: ( ( rule__ForwardCommand__Group__0 ) )
            // InternalPlatoon.g:218:3: ( rule__ForwardCommand__Group__0 )
            {
             before(grammarAccess.getForwardCommandAccess().getGroup()); 
            // InternalPlatoon.g:219:3: ( rule__ForwardCommand__Group__0 )
            // InternalPlatoon.g:219:4: rule__ForwardCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForwardCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForwardCommandAccess().getGroup()); 

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
    // $ANTLR end "ruleForwardCommand"


    // $ANTLR start "entryRuleTurnCommand"
    // InternalPlatoon.g:228:1: entryRuleTurnCommand : ruleTurnCommand EOF ;
    public final void entryRuleTurnCommand() throws RecognitionException {
        try {
            // InternalPlatoon.g:229:1: ( ruleTurnCommand EOF )
            // InternalPlatoon.g:230:1: ruleTurnCommand EOF
            {
             before(grammarAccess.getTurnCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleTurnCommand();

            state._fsp--;

             after(grammarAccess.getTurnCommandRule()); 
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
    // $ANTLR end "entryRuleTurnCommand"


    // $ANTLR start "ruleTurnCommand"
    // InternalPlatoon.g:237:1: ruleTurnCommand : ( ( rule__TurnCommand__Group__0 ) ) ;
    public final void ruleTurnCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:241:2: ( ( ( rule__TurnCommand__Group__0 ) ) )
            // InternalPlatoon.g:242:2: ( ( rule__TurnCommand__Group__0 ) )
            {
            // InternalPlatoon.g:242:2: ( ( rule__TurnCommand__Group__0 ) )
            // InternalPlatoon.g:243:3: ( rule__TurnCommand__Group__0 )
            {
             before(grammarAccess.getTurnCommandAccess().getGroup()); 
            // InternalPlatoon.g:244:3: ( rule__TurnCommand__Group__0 )
            // InternalPlatoon.g:244:4: rule__TurnCommand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TurnCommand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnCommandAccess().getGroup()); 

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
    // $ANTLR end "ruleTurnCommand"


    // $ANTLR start "entryRuleEInt"
    // InternalPlatoon.g:253:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalPlatoon.g:254:1: ( ruleEInt EOF )
            // InternalPlatoon.g:255:1: ruleEInt EOF
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
    // InternalPlatoon.g:262:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:266:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalPlatoon.g:267:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalPlatoon.g:267:2: ( ( rule__EInt__Group__0 ) )
            // InternalPlatoon.g:268:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalPlatoon.g:269:3: ( rule__EInt__Group__0 )
            // InternalPlatoon.g:269:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleDirection_Impl"
    // InternalPlatoon.g:278:1: entryRuleDirection_Impl : ruleDirection_Impl EOF ;
    public final void entryRuleDirection_Impl() throws RecognitionException {
        try {
            // InternalPlatoon.g:279:1: ( ruleDirection_Impl EOF )
            // InternalPlatoon.g:280:1: ruleDirection_Impl EOF
            {
             before(grammarAccess.getDirection_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleDirection_Impl();

            state._fsp--;

             after(grammarAccess.getDirection_ImplRule()); 
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
    // $ANTLR end "entryRuleDirection_Impl"


    // $ANTLR start "ruleDirection_Impl"
    // InternalPlatoon.g:287:1: ruleDirection_Impl : ( () ) ;
    public final void ruleDirection_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:291:2: ( ( () ) )
            // InternalPlatoon.g:292:2: ( () )
            {
            // InternalPlatoon.g:292:2: ( () )
            // InternalPlatoon.g:293:3: ()
            {
             before(grammarAccess.getDirection_ImplAccess().getDirectionAction()); 
            // InternalPlatoon.g:294:3: ()
            // InternalPlatoon.g:294:4: 
            {
            }

             after(grammarAccess.getDirection_ImplAccess().getDirectionAction()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirection_Impl"


    // $ANTLR start "entryRuleLeft"
    // InternalPlatoon.g:303:1: entryRuleLeft : ruleLeft EOF ;
    public final void entryRuleLeft() throws RecognitionException {
        try {
            // InternalPlatoon.g:304:1: ( ruleLeft EOF )
            // InternalPlatoon.g:305:1: ruleLeft EOF
            {
             before(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            ruleLeft();

            state._fsp--;

             after(grammarAccess.getLeftRule()); 
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
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalPlatoon.g:312:1: ruleLeft : ( ( rule__Left__Group__0 ) ) ;
    public final void ruleLeft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:316:2: ( ( ( rule__Left__Group__0 ) ) )
            // InternalPlatoon.g:317:2: ( ( rule__Left__Group__0 ) )
            {
            // InternalPlatoon.g:317:2: ( ( rule__Left__Group__0 ) )
            // InternalPlatoon.g:318:3: ( rule__Left__Group__0 )
            {
             before(grammarAccess.getLeftAccess().getGroup()); 
            // InternalPlatoon.g:319:3: ( rule__Left__Group__0 )
            // InternalPlatoon.g:319:4: rule__Left__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Left__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftAccess().getGroup()); 

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
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleRight"
    // InternalPlatoon.g:328:1: entryRuleRight : ruleRight EOF ;
    public final void entryRuleRight() throws RecognitionException {
        try {
            // InternalPlatoon.g:329:1: ( ruleRight EOF )
            // InternalPlatoon.g:330:1: ruleRight EOF
            {
             before(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            ruleRight();

            state._fsp--;

             after(grammarAccess.getRightRule()); 
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
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalPlatoon.g:337:1: ruleRight : ( ( rule__Right__Group__0 ) ) ;
    public final void ruleRight() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:341:2: ( ( ( rule__Right__Group__0 ) ) )
            // InternalPlatoon.g:342:2: ( ( rule__Right__Group__0 ) )
            {
            // InternalPlatoon.g:342:2: ( ( rule__Right__Group__0 ) )
            // InternalPlatoon.g:343:3: ( rule__Right__Group__0 )
            {
             before(grammarAccess.getRightAccess().getGroup()); 
            // InternalPlatoon.g:344:3: ( rule__Right__Group__0 )
            // InternalPlatoon.g:344:4: rule__Right__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Right__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightAccess().getGroup()); 

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
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleConstraint_Impl"
    // InternalPlatoon.g:353:1: entryRuleConstraint_Impl : ruleConstraint_Impl EOF ;
    public final void entryRuleConstraint_Impl() throws RecognitionException {
        try {
            // InternalPlatoon.g:354:1: ( ruleConstraint_Impl EOF )
            // InternalPlatoon.g:355:1: ruleConstraint_Impl EOF
            {
             before(grammarAccess.getConstraint_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint_Impl();

            state._fsp--;

             after(grammarAccess.getConstraint_ImplRule()); 
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
    // $ANTLR end "entryRuleConstraint_Impl"


    // $ANTLR start "ruleConstraint_Impl"
    // InternalPlatoon.g:362:1: ruleConstraint_Impl : ( () ) ;
    public final void ruleConstraint_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:366:2: ( ( () ) )
            // InternalPlatoon.g:367:2: ( () )
            {
            // InternalPlatoon.g:367:2: ( () )
            // InternalPlatoon.g:368:3: ()
            {
             before(grammarAccess.getConstraint_ImplAccess().getConstraintAction()); 
            // InternalPlatoon.g:369:3: ()
            // InternalPlatoon.g:369:4: 
            {
            }

             after(grammarAccess.getConstraint_ImplAccess().getConstraintAction()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraint_Impl"


    // $ANTLR start "entryRuleHeadwayConstraint"
    // InternalPlatoon.g:378:1: entryRuleHeadwayConstraint : ruleHeadwayConstraint EOF ;
    public final void entryRuleHeadwayConstraint() throws RecognitionException {
        try {
            // InternalPlatoon.g:379:1: ( ruleHeadwayConstraint EOF )
            // InternalPlatoon.g:380:1: ruleHeadwayConstraint EOF
            {
             before(grammarAccess.getHeadwayConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleHeadwayConstraint();

            state._fsp--;

             after(grammarAccess.getHeadwayConstraintRule()); 
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
    // $ANTLR end "entryRuleHeadwayConstraint"


    // $ANTLR start "ruleHeadwayConstraint"
    // InternalPlatoon.g:387:1: ruleHeadwayConstraint : ( ( rule__HeadwayConstraint__Group__0 ) ) ;
    public final void ruleHeadwayConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:391:2: ( ( ( rule__HeadwayConstraint__Group__0 ) ) )
            // InternalPlatoon.g:392:2: ( ( rule__HeadwayConstraint__Group__0 ) )
            {
            // InternalPlatoon.g:392:2: ( ( rule__HeadwayConstraint__Group__0 ) )
            // InternalPlatoon.g:393:3: ( rule__HeadwayConstraint__Group__0 )
            {
             before(grammarAccess.getHeadwayConstraintAccess().getGroup()); 
            // InternalPlatoon.g:394:3: ( rule__HeadwayConstraint__Group__0 )
            // InternalPlatoon.g:394:4: rule__HeadwayConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HeadwayConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHeadwayConstraintAccess().getGroup()); 

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
    // $ANTLR end "ruleHeadwayConstraint"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPlatoon.g:402:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:406:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalPlatoon.g:407:2: ( RULE_STRING )
                    {
                    // InternalPlatoon.g:407:2: ( RULE_STRING )
                    // InternalPlatoon.g:408:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPlatoon.g:413:2: ( RULE_ID )
                    {
                    // InternalPlatoon.g:413:2: ( RULE_ID )
                    // InternalPlatoon.g:414:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__World__Group__0"
    // InternalPlatoon.g:423:1: rule__World__Group__0 : rule__World__Group__0__Impl rule__World__Group__1 ;
    public final void rule__World__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:427:1: ( rule__World__Group__0__Impl rule__World__Group__1 )
            // InternalPlatoon.g:428:2: rule__World__Group__0__Impl rule__World__Group__1
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
    // InternalPlatoon.g:435:1: rule__World__Group__0__Impl : ( ( rule__World__PlatoonAssignment_0 ) ) ;
    public final void rule__World__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:439:1: ( ( ( rule__World__PlatoonAssignment_0 ) ) )
            // InternalPlatoon.g:440:1: ( ( rule__World__PlatoonAssignment_0 ) )
            {
            // InternalPlatoon.g:440:1: ( ( rule__World__PlatoonAssignment_0 ) )
            // InternalPlatoon.g:441:2: ( rule__World__PlatoonAssignment_0 )
            {
             before(grammarAccess.getWorldAccess().getPlatoonAssignment_0()); 
            // InternalPlatoon.g:442:2: ( rule__World__PlatoonAssignment_0 )
            // InternalPlatoon.g:442:3: rule__World__PlatoonAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__World__PlatoonAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getPlatoonAssignment_0()); 

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
    // $ANTLR end "rule__World__Group__0__Impl"


    // $ANTLR start "rule__World__Group__1"
    // InternalPlatoon.g:450:1: rule__World__Group__1 : rule__World__Group__1__Impl rule__World__Group__2 ;
    public final void rule__World__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:454:1: ( rule__World__Group__1__Impl rule__World__Group__2 )
            // InternalPlatoon.g:455:2: rule__World__Group__1__Impl rule__World__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalPlatoon.g:462:1: rule__World__Group__1__Impl : ( ( rule__World__RouteAssignment_1 ) ) ;
    public final void rule__World__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:466:1: ( ( ( rule__World__RouteAssignment_1 ) ) )
            // InternalPlatoon.g:467:1: ( ( rule__World__RouteAssignment_1 ) )
            {
            // InternalPlatoon.g:467:1: ( ( rule__World__RouteAssignment_1 ) )
            // InternalPlatoon.g:468:2: ( rule__World__RouteAssignment_1 )
            {
             before(grammarAccess.getWorldAccess().getRouteAssignment_1()); 
            // InternalPlatoon.g:469:2: ( rule__World__RouteAssignment_1 )
            // InternalPlatoon.g:469:3: rule__World__RouteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__World__RouteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getRouteAssignment_1()); 

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
    // InternalPlatoon.g:477:1: rule__World__Group__2 : rule__World__Group__2__Impl ;
    public final void rule__World__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:481:1: ( rule__World__Group__2__Impl )
            // InternalPlatoon.g:482:2: rule__World__Group__2__Impl
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
    // InternalPlatoon.g:488:1: rule__World__Group__2__Impl : ( ( rule__World__ConstraintAssignment_2 ) ) ;
    public final void rule__World__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:492:1: ( ( ( rule__World__ConstraintAssignment_2 ) ) )
            // InternalPlatoon.g:493:1: ( ( rule__World__ConstraintAssignment_2 ) )
            {
            // InternalPlatoon.g:493:1: ( ( rule__World__ConstraintAssignment_2 ) )
            // InternalPlatoon.g:494:2: ( rule__World__ConstraintAssignment_2 )
            {
             before(grammarAccess.getWorldAccess().getConstraintAssignment_2()); 
            // InternalPlatoon.g:495:2: ( rule__World__ConstraintAssignment_2 )
            // InternalPlatoon.g:495:3: rule__World__ConstraintAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__World__ConstraintAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getConstraintAssignment_2()); 

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


    // $ANTLR start "rule__LeadingVehicle__Group__0"
    // InternalPlatoon.g:504:1: rule__LeadingVehicle__Group__0 : rule__LeadingVehicle__Group__0__Impl rule__LeadingVehicle__Group__1 ;
    public final void rule__LeadingVehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:508:1: ( rule__LeadingVehicle__Group__0__Impl rule__LeadingVehicle__Group__1 )
            // InternalPlatoon.g:509:2: rule__LeadingVehicle__Group__0__Impl rule__LeadingVehicle__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LeadingVehicle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeadingVehicle__Group__1();

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
    // $ANTLR end "rule__LeadingVehicle__Group__0"


    // $ANTLR start "rule__LeadingVehicle__Group__0__Impl"
    // InternalPlatoon.g:516:1: rule__LeadingVehicle__Group__0__Impl : ( 'LV' ) ;
    public final void rule__LeadingVehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:520:1: ( ( 'LV' ) )
            // InternalPlatoon.g:521:1: ( 'LV' )
            {
            // InternalPlatoon.g:521:1: ( 'LV' )
            // InternalPlatoon.g:522:2: 'LV'
            {
             before(grammarAccess.getLeadingVehicleAccess().getLVKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getLeadingVehicleAccess().getLVKeyword_0()); 

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
    // $ANTLR end "rule__LeadingVehicle__Group__0__Impl"


    // $ANTLR start "rule__LeadingVehicle__Group__1"
    // InternalPlatoon.g:531:1: rule__LeadingVehicle__Group__1 : rule__LeadingVehicle__Group__1__Impl rule__LeadingVehicle__Group__2 ;
    public final void rule__LeadingVehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:535:1: ( rule__LeadingVehicle__Group__1__Impl rule__LeadingVehicle__Group__2 )
            // InternalPlatoon.g:536:2: rule__LeadingVehicle__Group__1__Impl rule__LeadingVehicle__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LeadingVehicle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeadingVehicle__Group__2();

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
    // $ANTLR end "rule__LeadingVehicle__Group__1"


    // $ANTLR start "rule__LeadingVehicle__Group__1__Impl"
    // InternalPlatoon.g:543:1: rule__LeadingVehicle__Group__1__Impl : ( ( rule__LeadingVehicle__IdAssignment_1 ) ) ;
    public final void rule__LeadingVehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:547:1: ( ( ( rule__LeadingVehicle__IdAssignment_1 ) ) )
            // InternalPlatoon.g:548:1: ( ( rule__LeadingVehicle__IdAssignment_1 ) )
            {
            // InternalPlatoon.g:548:1: ( ( rule__LeadingVehicle__IdAssignment_1 ) )
            // InternalPlatoon.g:549:2: ( rule__LeadingVehicle__IdAssignment_1 )
            {
             before(grammarAccess.getLeadingVehicleAccess().getIdAssignment_1()); 
            // InternalPlatoon.g:550:2: ( rule__LeadingVehicle__IdAssignment_1 )
            // InternalPlatoon.g:550:3: rule__LeadingVehicle__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LeadingVehicle__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLeadingVehicleAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__LeadingVehicle__Group__1__Impl"


    // $ANTLR start "rule__LeadingVehicle__Group__2"
    // InternalPlatoon.g:558:1: rule__LeadingVehicle__Group__2 : rule__LeadingVehicle__Group__2__Impl rule__LeadingVehicle__Group__3 ;
    public final void rule__LeadingVehicle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:562:1: ( rule__LeadingVehicle__Group__2__Impl rule__LeadingVehicle__Group__3 )
            // InternalPlatoon.g:563:2: rule__LeadingVehicle__Group__2__Impl rule__LeadingVehicle__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__LeadingVehicle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeadingVehicle__Group__3();

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
    // $ANTLR end "rule__LeadingVehicle__Group__2"


    // $ANTLR start "rule__LeadingVehicle__Group__2__Impl"
    // InternalPlatoon.g:570:1: rule__LeadingVehicle__Group__2__Impl : ( 'route' ) ;
    public final void rule__LeadingVehicle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:574:1: ( ( 'route' ) )
            // InternalPlatoon.g:575:1: ( 'route' )
            {
            // InternalPlatoon.g:575:1: ( 'route' )
            // InternalPlatoon.g:576:2: 'route'
            {
             before(grammarAccess.getLeadingVehicleAccess().getRouteKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getLeadingVehicleAccess().getRouteKeyword_2()); 

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
    // $ANTLR end "rule__LeadingVehicle__Group__2__Impl"


    // $ANTLR start "rule__LeadingVehicle__Group__3"
    // InternalPlatoon.g:585:1: rule__LeadingVehicle__Group__3 : rule__LeadingVehicle__Group__3__Impl ;
    public final void rule__LeadingVehicle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:589:1: ( rule__LeadingVehicle__Group__3__Impl )
            // InternalPlatoon.g:590:2: rule__LeadingVehicle__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeadingVehicle__Group__3__Impl();

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
    // $ANTLR end "rule__LeadingVehicle__Group__3"


    // $ANTLR start "rule__LeadingVehicle__Group__3__Impl"
    // InternalPlatoon.g:596:1: rule__LeadingVehicle__Group__3__Impl : ( ( rule__LeadingVehicle__RouteAssignment_3 ) ) ;
    public final void rule__LeadingVehicle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:600:1: ( ( ( rule__LeadingVehicle__RouteAssignment_3 ) ) )
            // InternalPlatoon.g:601:1: ( ( rule__LeadingVehicle__RouteAssignment_3 ) )
            {
            // InternalPlatoon.g:601:1: ( ( rule__LeadingVehicle__RouteAssignment_3 ) )
            // InternalPlatoon.g:602:2: ( rule__LeadingVehicle__RouteAssignment_3 )
            {
             before(grammarAccess.getLeadingVehicleAccess().getRouteAssignment_3()); 
            // InternalPlatoon.g:603:2: ( rule__LeadingVehicle__RouteAssignment_3 )
            // InternalPlatoon.g:603:3: rule__LeadingVehicle__RouteAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LeadingVehicle__RouteAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLeadingVehicleAccess().getRouteAssignment_3()); 

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
    // $ANTLR end "rule__LeadingVehicle__Group__3__Impl"


    // $ANTLR start "rule__FollowVehicle__Group__0"
    // InternalPlatoon.g:612:1: rule__FollowVehicle__Group__0 : rule__FollowVehicle__Group__0__Impl rule__FollowVehicle__Group__1 ;
    public final void rule__FollowVehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:616:1: ( rule__FollowVehicle__Group__0__Impl rule__FollowVehicle__Group__1 )
            // InternalPlatoon.g:617:2: rule__FollowVehicle__Group__0__Impl rule__FollowVehicle__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__FollowVehicle__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowVehicle__Group__1();

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
    // $ANTLR end "rule__FollowVehicle__Group__0"


    // $ANTLR start "rule__FollowVehicle__Group__0__Impl"
    // InternalPlatoon.g:624:1: rule__FollowVehicle__Group__0__Impl : ( 'FV' ) ;
    public final void rule__FollowVehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:628:1: ( ( 'FV' ) )
            // InternalPlatoon.g:629:1: ( 'FV' )
            {
            // InternalPlatoon.g:629:1: ( 'FV' )
            // InternalPlatoon.g:630:2: 'FV'
            {
             before(grammarAccess.getFollowVehicleAccess().getFVKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFollowVehicleAccess().getFVKeyword_0()); 

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
    // $ANTLR end "rule__FollowVehicle__Group__0__Impl"


    // $ANTLR start "rule__FollowVehicle__Group__1"
    // InternalPlatoon.g:639:1: rule__FollowVehicle__Group__1 : rule__FollowVehicle__Group__1__Impl rule__FollowVehicle__Group__2 ;
    public final void rule__FollowVehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:643:1: ( rule__FollowVehicle__Group__1__Impl rule__FollowVehicle__Group__2 )
            // InternalPlatoon.g:644:2: rule__FollowVehicle__Group__1__Impl rule__FollowVehicle__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__FollowVehicle__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowVehicle__Group__2();

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
    // $ANTLR end "rule__FollowVehicle__Group__1"


    // $ANTLR start "rule__FollowVehicle__Group__1__Impl"
    // InternalPlatoon.g:651:1: rule__FollowVehicle__Group__1__Impl : ( ( rule__FollowVehicle__IdAssignment_1 ) ) ;
    public final void rule__FollowVehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:655:1: ( ( ( rule__FollowVehicle__IdAssignment_1 ) ) )
            // InternalPlatoon.g:656:1: ( ( rule__FollowVehicle__IdAssignment_1 ) )
            {
            // InternalPlatoon.g:656:1: ( ( rule__FollowVehicle__IdAssignment_1 ) )
            // InternalPlatoon.g:657:2: ( rule__FollowVehicle__IdAssignment_1 )
            {
             before(grammarAccess.getFollowVehicleAccess().getIdAssignment_1()); 
            // InternalPlatoon.g:658:2: ( rule__FollowVehicle__IdAssignment_1 )
            // InternalPlatoon.g:658:3: rule__FollowVehicle__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FollowVehicle__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFollowVehicleAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__FollowVehicle__Group__1__Impl"


    // $ANTLR start "rule__FollowVehicle__Group__2"
    // InternalPlatoon.g:666:1: rule__FollowVehicle__Group__2 : rule__FollowVehicle__Group__2__Impl rule__FollowVehicle__Group__3 ;
    public final void rule__FollowVehicle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:670:1: ( rule__FollowVehicle__Group__2__Impl rule__FollowVehicle__Group__3 )
            // InternalPlatoon.g:671:2: rule__FollowVehicle__Group__2__Impl rule__FollowVehicle__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__FollowVehicle__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowVehicle__Group__3();

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
    // $ANTLR end "rule__FollowVehicle__Group__2"


    // $ANTLR start "rule__FollowVehicle__Group__2__Impl"
    // InternalPlatoon.g:678:1: rule__FollowVehicle__Group__2__Impl : ( 'front' ) ;
    public final void rule__FollowVehicle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:682:1: ( ( 'front' ) )
            // InternalPlatoon.g:683:1: ( 'front' )
            {
            // InternalPlatoon.g:683:1: ( 'front' )
            // InternalPlatoon.g:684:2: 'front'
            {
             before(grammarAccess.getFollowVehicleAccess().getFrontKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFollowVehicleAccess().getFrontKeyword_2()); 

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
    // $ANTLR end "rule__FollowVehicle__Group__2__Impl"


    // $ANTLR start "rule__FollowVehicle__Group__3"
    // InternalPlatoon.g:693:1: rule__FollowVehicle__Group__3 : rule__FollowVehicle__Group__3__Impl rule__FollowVehicle__Group__4 ;
    public final void rule__FollowVehicle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:697:1: ( rule__FollowVehicle__Group__3__Impl rule__FollowVehicle__Group__4 )
            // InternalPlatoon.g:698:2: rule__FollowVehicle__Group__3__Impl rule__FollowVehicle__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__FollowVehicle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowVehicle__Group__4();

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
    // $ANTLR end "rule__FollowVehicle__Group__3"


    // $ANTLR start "rule__FollowVehicle__Group__3__Impl"
    // InternalPlatoon.g:705:1: rule__FollowVehicle__Group__3__Impl : ( 'runner' ) ;
    public final void rule__FollowVehicle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:709:1: ( ( 'runner' ) )
            // InternalPlatoon.g:710:1: ( 'runner' )
            {
            // InternalPlatoon.g:710:1: ( 'runner' )
            // InternalPlatoon.g:711:2: 'runner'
            {
             before(grammarAccess.getFollowVehicleAccess().getRunnerKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFollowVehicleAccess().getRunnerKeyword_3()); 

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
    // $ANTLR end "rule__FollowVehicle__Group__3__Impl"


    // $ANTLR start "rule__FollowVehicle__Group__4"
    // InternalPlatoon.g:720:1: rule__FollowVehicle__Group__4 : rule__FollowVehicle__Group__4__Impl ;
    public final void rule__FollowVehicle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:724:1: ( rule__FollowVehicle__Group__4__Impl )
            // InternalPlatoon.g:725:2: rule__FollowVehicle__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FollowVehicle__Group__4__Impl();

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
    // $ANTLR end "rule__FollowVehicle__Group__4"


    // $ANTLR start "rule__FollowVehicle__Group__4__Impl"
    // InternalPlatoon.g:731:1: rule__FollowVehicle__Group__4__Impl : ( ( rule__FollowVehicle__FrontRunnerAssignment_4 ) ) ;
    public final void rule__FollowVehicle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:735:1: ( ( ( rule__FollowVehicle__FrontRunnerAssignment_4 ) ) )
            // InternalPlatoon.g:736:1: ( ( rule__FollowVehicle__FrontRunnerAssignment_4 ) )
            {
            // InternalPlatoon.g:736:1: ( ( rule__FollowVehicle__FrontRunnerAssignment_4 ) )
            // InternalPlatoon.g:737:2: ( rule__FollowVehicle__FrontRunnerAssignment_4 )
            {
             before(grammarAccess.getFollowVehicleAccess().getFrontRunnerAssignment_4()); 
            // InternalPlatoon.g:738:2: ( rule__FollowVehicle__FrontRunnerAssignment_4 )
            // InternalPlatoon.g:738:3: rule__FollowVehicle__FrontRunnerAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FollowVehicle__FrontRunnerAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFollowVehicleAccess().getFrontRunnerAssignment_4()); 

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
    // $ANTLR end "rule__FollowVehicle__Group__4__Impl"


    // $ANTLR start "rule__Vehicle_Impl__Group__0"
    // InternalPlatoon.g:747:1: rule__Vehicle_Impl__Group__0 : rule__Vehicle_Impl__Group__0__Impl rule__Vehicle_Impl__Group__1 ;
    public final void rule__Vehicle_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:751:1: ( rule__Vehicle_Impl__Group__0__Impl rule__Vehicle_Impl__Group__1 )
            // InternalPlatoon.g:752:2: rule__Vehicle_Impl__Group__0__Impl rule__Vehicle_Impl__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Vehicle_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Vehicle_Impl__Group__1();

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
    // $ANTLR end "rule__Vehicle_Impl__Group__0"


    // $ANTLR start "rule__Vehicle_Impl__Group__0__Impl"
    // InternalPlatoon.g:759:1: rule__Vehicle_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Vehicle_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:763:1: ( ( () ) )
            // InternalPlatoon.g:764:1: ( () )
            {
            // InternalPlatoon.g:764:1: ( () )
            // InternalPlatoon.g:765:2: ()
            {
             before(grammarAccess.getVehicle_ImplAccess().getVehicleAction_0()); 
            // InternalPlatoon.g:766:2: ()
            // InternalPlatoon.g:766:3: 
            {
            }

             after(grammarAccess.getVehicle_ImplAccess().getVehicleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vehicle_Impl__Group__0__Impl"


    // $ANTLR start "rule__Vehicle_Impl__Group__1"
    // InternalPlatoon.g:774:1: rule__Vehicle_Impl__Group__1 : rule__Vehicle_Impl__Group__1__Impl ;
    public final void rule__Vehicle_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:778:1: ( rule__Vehicle_Impl__Group__1__Impl )
            // InternalPlatoon.g:779:2: rule__Vehicle_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Vehicle_Impl__Group__1__Impl();

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
    // $ANTLR end "rule__Vehicle_Impl__Group__1"


    // $ANTLR start "rule__Vehicle_Impl__Group__1__Impl"
    // InternalPlatoon.g:785:1: rule__Vehicle_Impl__Group__1__Impl : ( ( rule__Vehicle_Impl__IdAssignment_1 ) ) ;
    public final void rule__Vehicle_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:789:1: ( ( ( rule__Vehicle_Impl__IdAssignment_1 ) ) )
            // InternalPlatoon.g:790:1: ( ( rule__Vehicle_Impl__IdAssignment_1 ) )
            {
            // InternalPlatoon.g:790:1: ( ( rule__Vehicle_Impl__IdAssignment_1 ) )
            // InternalPlatoon.g:791:2: ( rule__Vehicle_Impl__IdAssignment_1 )
            {
             before(grammarAccess.getVehicle_ImplAccess().getIdAssignment_1()); 
            // InternalPlatoon.g:792:2: ( rule__Vehicle_Impl__IdAssignment_1 )
            // InternalPlatoon.g:792:3: rule__Vehicle_Impl__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Vehicle_Impl__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVehicle_ImplAccess().getIdAssignment_1()); 

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
    // $ANTLR end "rule__Vehicle_Impl__Group__1__Impl"


    // $ANTLR start "rule__ForwardCommand__Group__0"
    // InternalPlatoon.g:801:1: rule__ForwardCommand__Group__0 : rule__ForwardCommand__Group__0__Impl rule__ForwardCommand__Group__1 ;
    public final void rule__ForwardCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:805:1: ( rule__ForwardCommand__Group__0__Impl rule__ForwardCommand__Group__1 )
            // InternalPlatoon.g:806:2: rule__ForwardCommand__Group__0__Impl rule__ForwardCommand__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ForwardCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForwardCommand__Group__1();

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
    // $ANTLR end "rule__ForwardCommand__Group__0"


    // $ANTLR start "rule__ForwardCommand__Group__0__Impl"
    // InternalPlatoon.g:813:1: rule__ForwardCommand__Group__0__Impl : ( 'forward(' ) ;
    public final void rule__ForwardCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:817:1: ( ( 'forward(' ) )
            // InternalPlatoon.g:818:1: ( 'forward(' )
            {
            // InternalPlatoon.g:818:1: ( 'forward(' )
            // InternalPlatoon.g:819:2: 'forward('
            {
             before(grammarAccess.getForwardCommandAccess().getForwardKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getForwardCommandAccess().getForwardKeyword_0()); 

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
    // $ANTLR end "rule__ForwardCommand__Group__0__Impl"


    // $ANTLR start "rule__ForwardCommand__Group__1"
    // InternalPlatoon.g:828:1: rule__ForwardCommand__Group__1 : rule__ForwardCommand__Group__1__Impl rule__ForwardCommand__Group__2 ;
    public final void rule__ForwardCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:832:1: ( rule__ForwardCommand__Group__1__Impl rule__ForwardCommand__Group__2 )
            // InternalPlatoon.g:833:2: rule__ForwardCommand__Group__1__Impl rule__ForwardCommand__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ForwardCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForwardCommand__Group__2();

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
    // $ANTLR end "rule__ForwardCommand__Group__1"


    // $ANTLR start "rule__ForwardCommand__Group__1__Impl"
    // InternalPlatoon.g:840:1: rule__ForwardCommand__Group__1__Impl : ( ( rule__ForwardCommand__DistanceAssignment_1 ) ) ;
    public final void rule__ForwardCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:844:1: ( ( ( rule__ForwardCommand__DistanceAssignment_1 ) ) )
            // InternalPlatoon.g:845:1: ( ( rule__ForwardCommand__DistanceAssignment_1 ) )
            {
            // InternalPlatoon.g:845:1: ( ( rule__ForwardCommand__DistanceAssignment_1 ) )
            // InternalPlatoon.g:846:2: ( rule__ForwardCommand__DistanceAssignment_1 )
            {
             before(grammarAccess.getForwardCommandAccess().getDistanceAssignment_1()); 
            // InternalPlatoon.g:847:2: ( rule__ForwardCommand__DistanceAssignment_1 )
            // InternalPlatoon.g:847:3: rule__ForwardCommand__DistanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForwardCommand__DistanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForwardCommandAccess().getDistanceAssignment_1()); 

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
    // $ANTLR end "rule__ForwardCommand__Group__1__Impl"


    // $ANTLR start "rule__ForwardCommand__Group__2"
    // InternalPlatoon.g:855:1: rule__ForwardCommand__Group__2 : rule__ForwardCommand__Group__2__Impl ;
    public final void rule__ForwardCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:859:1: ( rule__ForwardCommand__Group__2__Impl )
            // InternalPlatoon.g:860:2: rule__ForwardCommand__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForwardCommand__Group__2__Impl();

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
    // $ANTLR end "rule__ForwardCommand__Group__2"


    // $ANTLR start "rule__ForwardCommand__Group__2__Impl"
    // InternalPlatoon.g:866:1: rule__ForwardCommand__Group__2__Impl : ( ')' ) ;
    public final void rule__ForwardCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:870:1: ( ( ')' ) )
            // InternalPlatoon.g:871:1: ( ')' )
            {
            // InternalPlatoon.g:871:1: ( ')' )
            // InternalPlatoon.g:872:2: ')'
            {
             before(grammarAccess.getForwardCommandAccess().getRightParenthesisKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getForwardCommandAccess().getRightParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__ForwardCommand__Group__2__Impl"


    // $ANTLR start "rule__TurnCommand__Group__0"
    // InternalPlatoon.g:882:1: rule__TurnCommand__Group__0 : rule__TurnCommand__Group__0__Impl rule__TurnCommand__Group__1 ;
    public final void rule__TurnCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:886:1: ( rule__TurnCommand__Group__0__Impl rule__TurnCommand__Group__1 )
            // InternalPlatoon.g:887:2: rule__TurnCommand__Group__0__Impl rule__TurnCommand__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__TurnCommand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnCommand__Group__1();

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
    // $ANTLR end "rule__TurnCommand__Group__0"


    // $ANTLR start "rule__TurnCommand__Group__0__Impl"
    // InternalPlatoon.g:894:1: rule__TurnCommand__Group__0__Impl : ( () ) ;
    public final void rule__TurnCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:898:1: ( ( () ) )
            // InternalPlatoon.g:899:1: ( () )
            {
            // InternalPlatoon.g:899:1: ( () )
            // InternalPlatoon.g:900:2: ()
            {
             before(grammarAccess.getTurnCommandAccess().getTurnCommandAction_0()); 
            // InternalPlatoon.g:901:2: ()
            // InternalPlatoon.g:901:3: 
            {
            }

             after(grammarAccess.getTurnCommandAccess().getTurnCommandAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnCommand__Group__0__Impl"


    // $ANTLR start "rule__TurnCommand__Group__1"
    // InternalPlatoon.g:909:1: rule__TurnCommand__Group__1 : rule__TurnCommand__Group__1__Impl rule__TurnCommand__Group__2 ;
    public final void rule__TurnCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:913:1: ( rule__TurnCommand__Group__1__Impl rule__TurnCommand__Group__2 )
            // InternalPlatoon.g:914:2: rule__TurnCommand__Group__1__Impl rule__TurnCommand__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TurnCommand__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TurnCommand__Group__2();

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
    // $ANTLR end "rule__TurnCommand__Group__1"


    // $ANTLR start "rule__TurnCommand__Group__1__Impl"
    // InternalPlatoon.g:921:1: rule__TurnCommand__Group__1__Impl : ( 'turn' ) ;
    public final void rule__TurnCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:925:1: ( ( 'turn' ) )
            // InternalPlatoon.g:926:1: ( 'turn' )
            {
            // InternalPlatoon.g:926:1: ( 'turn' )
            // InternalPlatoon.g:927:2: 'turn'
            {
             before(grammarAccess.getTurnCommandAccess().getTurnKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTurnCommandAccess().getTurnKeyword_1()); 

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
    // $ANTLR end "rule__TurnCommand__Group__1__Impl"


    // $ANTLR start "rule__TurnCommand__Group__2"
    // InternalPlatoon.g:936:1: rule__TurnCommand__Group__2 : rule__TurnCommand__Group__2__Impl ;
    public final void rule__TurnCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:940:1: ( rule__TurnCommand__Group__2__Impl )
            // InternalPlatoon.g:941:2: rule__TurnCommand__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TurnCommand__Group__2__Impl();

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
    // $ANTLR end "rule__TurnCommand__Group__2"


    // $ANTLR start "rule__TurnCommand__Group__2__Impl"
    // InternalPlatoon.g:947:1: rule__TurnCommand__Group__2__Impl : ( ( rule__TurnCommand__DirectionAssignment_2 ) ) ;
    public final void rule__TurnCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:951:1: ( ( ( rule__TurnCommand__DirectionAssignment_2 ) ) )
            // InternalPlatoon.g:952:1: ( ( rule__TurnCommand__DirectionAssignment_2 ) )
            {
            // InternalPlatoon.g:952:1: ( ( rule__TurnCommand__DirectionAssignment_2 ) )
            // InternalPlatoon.g:953:2: ( rule__TurnCommand__DirectionAssignment_2 )
            {
             before(grammarAccess.getTurnCommandAccess().getDirectionAssignment_2()); 
            // InternalPlatoon.g:954:2: ( rule__TurnCommand__DirectionAssignment_2 )
            // InternalPlatoon.g:954:3: rule__TurnCommand__DirectionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TurnCommand__DirectionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTurnCommandAccess().getDirectionAssignment_2()); 

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
    // $ANTLR end "rule__TurnCommand__Group__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalPlatoon.g:963:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:967:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalPlatoon.g:968:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalPlatoon.g:975:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:979:1: ( ( ( '-' )? ) )
            // InternalPlatoon.g:980:1: ( ( '-' )? )
            {
            // InternalPlatoon.g:980:1: ( ( '-' )? )
            // InternalPlatoon.g:981:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalPlatoon.g:982:2: ( '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPlatoon.g:982:3: '-'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalPlatoon.g:990:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:994:1: ( rule__EInt__Group__1__Impl )
            // InternalPlatoon.g:995:2: rule__EInt__Group__1__Impl
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
    // InternalPlatoon.g:1001:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1005:1: ( ( RULE_INT ) )
            // InternalPlatoon.g:1006:1: ( RULE_INT )
            {
            // InternalPlatoon.g:1006:1: ( RULE_INT )
            // InternalPlatoon.g:1007:2: RULE_INT
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


    // $ANTLR start "rule__Left__Group__0"
    // InternalPlatoon.g:1017:1: rule__Left__Group__0 : rule__Left__Group__0__Impl rule__Left__Group__1 ;
    public final void rule__Left__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1021:1: ( rule__Left__Group__0__Impl rule__Left__Group__1 )
            // InternalPlatoon.g:1022:2: rule__Left__Group__0__Impl rule__Left__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Left__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Left__Group__1();

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
    // $ANTLR end "rule__Left__Group__0"


    // $ANTLR start "rule__Left__Group__0__Impl"
    // InternalPlatoon.g:1029:1: rule__Left__Group__0__Impl : ( () ) ;
    public final void rule__Left__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1033:1: ( ( () ) )
            // InternalPlatoon.g:1034:1: ( () )
            {
            // InternalPlatoon.g:1034:1: ( () )
            // InternalPlatoon.g:1035:2: ()
            {
             before(grammarAccess.getLeftAccess().getLeftAction_0()); 
            // InternalPlatoon.g:1036:2: ()
            // InternalPlatoon.g:1036:3: 
            {
            }

             after(grammarAccess.getLeftAccess().getLeftAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Left__Group__0__Impl"


    // $ANTLR start "rule__Left__Group__1"
    // InternalPlatoon.g:1044:1: rule__Left__Group__1 : rule__Left__Group__1__Impl ;
    public final void rule__Left__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1048:1: ( rule__Left__Group__1__Impl )
            // InternalPlatoon.g:1049:2: rule__Left__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Left__Group__1__Impl();

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
    // $ANTLR end "rule__Left__Group__1"


    // $ANTLR start "rule__Left__Group__1__Impl"
    // InternalPlatoon.g:1055:1: rule__Left__Group__1__Impl : ( 'Left' ) ;
    public final void rule__Left__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1059:1: ( ( 'Left' ) )
            // InternalPlatoon.g:1060:1: ( 'Left' )
            {
            // InternalPlatoon.g:1060:1: ( 'Left' )
            // InternalPlatoon.g:1061:2: 'Left'
            {
             before(grammarAccess.getLeftAccess().getLeftKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getLeftAccess().getLeftKeyword_1()); 

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
    // $ANTLR end "rule__Left__Group__1__Impl"


    // $ANTLR start "rule__Right__Group__0"
    // InternalPlatoon.g:1071:1: rule__Right__Group__0 : rule__Right__Group__0__Impl rule__Right__Group__1 ;
    public final void rule__Right__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1075:1: ( rule__Right__Group__0__Impl rule__Right__Group__1 )
            // InternalPlatoon.g:1076:2: rule__Right__Group__0__Impl rule__Right__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Right__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Right__Group__1();

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
    // $ANTLR end "rule__Right__Group__0"


    // $ANTLR start "rule__Right__Group__0__Impl"
    // InternalPlatoon.g:1083:1: rule__Right__Group__0__Impl : ( () ) ;
    public final void rule__Right__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1087:1: ( ( () ) )
            // InternalPlatoon.g:1088:1: ( () )
            {
            // InternalPlatoon.g:1088:1: ( () )
            // InternalPlatoon.g:1089:2: ()
            {
             before(grammarAccess.getRightAccess().getRightAction_0()); 
            // InternalPlatoon.g:1090:2: ()
            // InternalPlatoon.g:1090:3: 
            {
            }

             after(grammarAccess.getRightAccess().getRightAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Right__Group__0__Impl"


    // $ANTLR start "rule__Right__Group__1"
    // InternalPlatoon.g:1098:1: rule__Right__Group__1 : rule__Right__Group__1__Impl ;
    public final void rule__Right__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1102:1: ( rule__Right__Group__1__Impl )
            // InternalPlatoon.g:1103:2: rule__Right__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Right__Group__1__Impl();

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
    // $ANTLR end "rule__Right__Group__1"


    // $ANTLR start "rule__Right__Group__1__Impl"
    // InternalPlatoon.g:1109:1: rule__Right__Group__1__Impl : ( 'Right' ) ;
    public final void rule__Right__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1113:1: ( ( 'Right' ) )
            // InternalPlatoon.g:1114:1: ( 'Right' )
            {
            // InternalPlatoon.g:1114:1: ( 'Right' )
            // InternalPlatoon.g:1115:2: 'Right'
            {
             before(grammarAccess.getRightAccess().getRightKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRightAccess().getRightKeyword_1()); 

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
    // $ANTLR end "rule__Right__Group__1__Impl"


    // $ANTLR start "rule__HeadwayConstraint__Group__0"
    // InternalPlatoon.g:1125:1: rule__HeadwayConstraint__Group__0 : rule__HeadwayConstraint__Group__0__Impl rule__HeadwayConstraint__Group__1 ;
    public final void rule__HeadwayConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1129:1: ( rule__HeadwayConstraint__Group__0__Impl rule__HeadwayConstraint__Group__1 )
            // InternalPlatoon.g:1130:2: rule__HeadwayConstraint__Group__0__Impl rule__HeadwayConstraint__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__HeadwayConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeadwayConstraint__Group__1();

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
    // $ANTLR end "rule__HeadwayConstraint__Group__0"


    // $ANTLR start "rule__HeadwayConstraint__Group__0__Impl"
    // InternalPlatoon.g:1137:1: rule__HeadwayConstraint__Group__0__Impl : ( ( rule__HeadwayConstraint__MinAssignment_0 ) ) ;
    public final void rule__HeadwayConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1141:1: ( ( ( rule__HeadwayConstraint__MinAssignment_0 ) ) )
            // InternalPlatoon.g:1142:1: ( ( rule__HeadwayConstraint__MinAssignment_0 ) )
            {
            // InternalPlatoon.g:1142:1: ( ( rule__HeadwayConstraint__MinAssignment_0 ) )
            // InternalPlatoon.g:1143:2: ( rule__HeadwayConstraint__MinAssignment_0 )
            {
             before(grammarAccess.getHeadwayConstraintAccess().getMinAssignment_0()); 
            // InternalPlatoon.g:1144:2: ( rule__HeadwayConstraint__MinAssignment_0 )
            // InternalPlatoon.g:1144:3: rule__HeadwayConstraint__MinAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__HeadwayConstraint__MinAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getHeadwayConstraintAccess().getMinAssignment_0()); 

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
    // $ANTLR end "rule__HeadwayConstraint__Group__0__Impl"


    // $ANTLR start "rule__HeadwayConstraint__Group__1"
    // InternalPlatoon.g:1152:1: rule__HeadwayConstraint__Group__1 : rule__HeadwayConstraint__Group__1__Impl rule__HeadwayConstraint__Group__2 ;
    public final void rule__HeadwayConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1156:1: ( rule__HeadwayConstraint__Group__1__Impl rule__HeadwayConstraint__Group__2 )
            // InternalPlatoon.g:1157:2: rule__HeadwayConstraint__Group__1__Impl rule__HeadwayConstraint__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__HeadwayConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeadwayConstraint__Group__2();

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
    // $ANTLR end "rule__HeadwayConstraint__Group__1"


    // $ANTLR start "rule__HeadwayConstraint__Group__1__Impl"
    // InternalPlatoon.g:1164:1: rule__HeadwayConstraint__Group__1__Impl : ( '<=' ) ;
    public final void rule__HeadwayConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1168:1: ( ( '<=' ) )
            // InternalPlatoon.g:1169:1: ( '<=' )
            {
            // InternalPlatoon.g:1169:1: ( '<=' )
            // InternalPlatoon.g:1170:2: '<='
            {
             before(grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__HeadwayConstraint__Group__1__Impl"


    // $ANTLR start "rule__HeadwayConstraint__Group__2"
    // InternalPlatoon.g:1179:1: rule__HeadwayConstraint__Group__2 : rule__HeadwayConstraint__Group__2__Impl rule__HeadwayConstraint__Group__3 ;
    public final void rule__HeadwayConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1183:1: ( rule__HeadwayConstraint__Group__2__Impl rule__HeadwayConstraint__Group__3 )
            // InternalPlatoon.g:1184:2: rule__HeadwayConstraint__Group__2__Impl rule__HeadwayConstraint__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__HeadwayConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeadwayConstraint__Group__3();

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
    // $ANTLR end "rule__HeadwayConstraint__Group__2"


    // $ANTLR start "rule__HeadwayConstraint__Group__2__Impl"
    // InternalPlatoon.g:1191:1: rule__HeadwayConstraint__Group__2__Impl : ( 'headway' ) ;
    public final void rule__HeadwayConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1195:1: ( ( 'headway' ) )
            // InternalPlatoon.g:1196:1: ( 'headway' )
            {
            // InternalPlatoon.g:1196:1: ( 'headway' )
            // InternalPlatoon.g:1197:2: 'headway'
            {
             before(grammarAccess.getHeadwayConstraintAccess().getHeadwayKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getHeadwayConstraintAccess().getHeadwayKeyword_2()); 

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
    // $ANTLR end "rule__HeadwayConstraint__Group__2__Impl"


    // $ANTLR start "rule__HeadwayConstraint__Group__3"
    // InternalPlatoon.g:1206:1: rule__HeadwayConstraint__Group__3 : rule__HeadwayConstraint__Group__3__Impl rule__HeadwayConstraint__Group__4 ;
    public final void rule__HeadwayConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1210:1: ( rule__HeadwayConstraint__Group__3__Impl rule__HeadwayConstraint__Group__4 )
            // InternalPlatoon.g:1211:2: rule__HeadwayConstraint__Group__3__Impl rule__HeadwayConstraint__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__HeadwayConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeadwayConstraint__Group__4();

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
    // $ANTLR end "rule__HeadwayConstraint__Group__3"


    // $ANTLR start "rule__HeadwayConstraint__Group__3__Impl"
    // InternalPlatoon.g:1218:1: rule__HeadwayConstraint__Group__3__Impl : ( '<=' ) ;
    public final void rule__HeadwayConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1222:1: ( ( '<=' ) )
            // InternalPlatoon.g:1223:1: ( '<=' )
            {
            // InternalPlatoon.g:1223:1: ( '<=' )
            // InternalPlatoon.g:1224:2: '<='
            {
             before(grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_3()); 

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
    // $ANTLR end "rule__HeadwayConstraint__Group__3__Impl"


    // $ANTLR start "rule__HeadwayConstraint__Group__4"
    // InternalPlatoon.g:1233:1: rule__HeadwayConstraint__Group__4 : rule__HeadwayConstraint__Group__4__Impl ;
    public final void rule__HeadwayConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1237:1: ( rule__HeadwayConstraint__Group__4__Impl )
            // InternalPlatoon.g:1238:2: rule__HeadwayConstraint__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeadwayConstraint__Group__4__Impl();

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
    // $ANTLR end "rule__HeadwayConstraint__Group__4"


    // $ANTLR start "rule__HeadwayConstraint__Group__4__Impl"
    // InternalPlatoon.g:1244:1: rule__HeadwayConstraint__Group__4__Impl : ( ( rule__HeadwayConstraint__MaxAssignment_4 ) ) ;
    public final void rule__HeadwayConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1248:1: ( ( ( rule__HeadwayConstraint__MaxAssignment_4 ) ) )
            // InternalPlatoon.g:1249:1: ( ( rule__HeadwayConstraint__MaxAssignment_4 ) )
            {
            // InternalPlatoon.g:1249:1: ( ( rule__HeadwayConstraint__MaxAssignment_4 ) )
            // InternalPlatoon.g:1250:2: ( rule__HeadwayConstraint__MaxAssignment_4 )
            {
             before(grammarAccess.getHeadwayConstraintAccess().getMaxAssignment_4()); 
            // InternalPlatoon.g:1251:2: ( rule__HeadwayConstraint__MaxAssignment_4 )
            // InternalPlatoon.g:1251:3: rule__HeadwayConstraint__MaxAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__HeadwayConstraint__MaxAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getHeadwayConstraintAccess().getMaxAssignment_4()); 

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
    // $ANTLR end "rule__HeadwayConstraint__Group__4__Impl"


    // $ANTLR start "rule__World__PlatoonAssignment_0"
    // InternalPlatoon.g:1260:1: rule__World__PlatoonAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__World__PlatoonAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1264:1: ( ( ( RULE_ID ) ) )
            // InternalPlatoon.g:1265:2: ( ( RULE_ID ) )
            {
            // InternalPlatoon.g:1265:2: ( ( RULE_ID ) )
            // InternalPlatoon.g:1266:3: ( RULE_ID )
            {
             before(grammarAccess.getWorldAccess().getPlatoonPlatoonCrossReference_0_0()); 
            // InternalPlatoon.g:1267:3: ( RULE_ID )
            // InternalPlatoon.g:1268:4: RULE_ID
            {
             before(grammarAccess.getWorldAccess().getPlatoonPlatoonIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorldAccess().getPlatoonPlatoonIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getWorldAccess().getPlatoonPlatoonCrossReference_0_0()); 

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
    // $ANTLR end "rule__World__PlatoonAssignment_0"


    // $ANTLR start "rule__World__RouteAssignment_1"
    // InternalPlatoon.g:1279:1: rule__World__RouteAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__World__RouteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1283:1: ( ( ( RULE_ID ) ) )
            // InternalPlatoon.g:1284:2: ( ( RULE_ID ) )
            {
            // InternalPlatoon.g:1284:2: ( ( RULE_ID ) )
            // InternalPlatoon.g:1285:3: ( RULE_ID )
            {
             before(grammarAccess.getWorldAccess().getRouteRouteCrossReference_1_0()); 
            // InternalPlatoon.g:1286:3: ( RULE_ID )
            // InternalPlatoon.g:1287:4: RULE_ID
            {
             before(grammarAccess.getWorldAccess().getRouteRouteIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorldAccess().getRouteRouteIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getWorldAccess().getRouteRouteCrossReference_1_0()); 

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
    // $ANTLR end "rule__World__RouteAssignment_1"


    // $ANTLR start "rule__World__ConstraintAssignment_2"
    // InternalPlatoon.g:1298:1: rule__World__ConstraintAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__World__ConstraintAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1302:1: ( ( ( RULE_ID ) ) )
            // InternalPlatoon.g:1303:2: ( ( RULE_ID ) )
            {
            // InternalPlatoon.g:1303:2: ( ( RULE_ID ) )
            // InternalPlatoon.g:1304:3: ( RULE_ID )
            {
             before(grammarAccess.getWorldAccess().getConstraintConstraintsCrossReference_2_0()); 
            // InternalPlatoon.g:1305:3: ( RULE_ID )
            // InternalPlatoon.g:1306:4: RULE_ID
            {
             before(grammarAccess.getWorldAccess().getConstraintConstraintsIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWorldAccess().getConstraintConstraintsIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getWorldAccess().getConstraintConstraintsCrossReference_2_0()); 

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
    // $ANTLR end "rule__World__ConstraintAssignment_2"


    // $ANTLR start "rule__LeadingVehicle__IdAssignment_1"
    // InternalPlatoon.g:1317:1: rule__LeadingVehicle__IdAssignment_1 : ( ruleEString ) ;
    public final void rule__LeadingVehicle__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1321:1: ( ( ruleEString ) )
            // InternalPlatoon.g:1322:2: ( ruleEString )
            {
            // InternalPlatoon.g:1322:2: ( ruleEString )
            // InternalPlatoon.g:1323:3: ruleEString
            {
             before(grammarAccess.getLeadingVehicleAccess().getIdEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeadingVehicleAccess().getIdEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__LeadingVehicle__IdAssignment_1"


    // $ANTLR start "rule__LeadingVehicle__RouteAssignment_3"
    // InternalPlatoon.g:1332:1: rule__LeadingVehicle__RouteAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__LeadingVehicle__RouteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1336:1: ( ( ( ruleEString ) ) )
            // InternalPlatoon.g:1337:2: ( ( ruleEString ) )
            {
            // InternalPlatoon.g:1337:2: ( ( ruleEString ) )
            // InternalPlatoon.g:1338:3: ( ruleEString )
            {
             before(grammarAccess.getLeadingVehicleAccess().getRouteRouteCrossReference_3_0()); 
            // InternalPlatoon.g:1339:3: ( ruleEString )
            // InternalPlatoon.g:1340:4: ruleEString
            {
             before(grammarAccess.getLeadingVehicleAccess().getRouteRouteEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeadingVehicleAccess().getRouteRouteEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getLeadingVehicleAccess().getRouteRouteCrossReference_3_0()); 

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
    // $ANTLR end "rule__LeadingVehicle__RouteAssignment_3"


    // $ANTLR start "rule__FollowVehicle__IdAssignment_1"
    // InternalPlatoon.g:1351:1: rule__FollowVehicle__IdAssignment_1 : ( ruleEString ) ;
    public final void rule__FollowVehicle__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1355:1: ( ( ruleEString ) )
            // InternalPlatoon.g:1356:2: ( ruleEString )
            {
            // InternalPlatoon.g:1356:2: ( ruleEString )
            // InternalPlatoon.g:1357:3: ruleEString
            {
             before(grammarAccess.getFollowVehicleAccess().getIdEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFollowVehicleAccess().getIdEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__FollowVehicle__IdAssignment_1"


    // $ANTLR start "rule__FollowVehicle__FrontRunnerAssignment_4"
    // InternalPlatoon.g:1366:1: rule__FollowVehicle__FrontRunnerAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__FollowVehicle__FrontRunnerAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1370:1: ( ( ( ruleEString ) ) )
            // InternalPlatoon.g:1371:2: ( ( ruleEString ) )
            {
            // InternalPlatoon.g:1371:2: ( ( ruleEString ) )
            // InternalPlatoon.g:1372:3: ( ruleEString )
            {
             before(grammarAccess.getFollowVehicleAccess().getFrontRunnerVehicleCrossReference_4_0()); 
            // InternalPlatoon.g:1373:3: ( ruleEString )
            // InternalPlatoon.g:1374:4: ruleEString
            {
             before(grammarAccess.getFollowVehicleAccess().getFrontRunnerVehicleEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFollowVehicleAccess().getFrontRunnerVehicleEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getFollowVehicleAccess().getFrontRunnerVehicleCrossReference_4_0()); 

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
    // $ANTLR end "rule__FollowVehicle__FrontRunnerAssignment_4"


    // $ANTLR start "rule__Vehicle_Impl__IdAssignment_1"
    // InternalPlatoon.g:1385:1: rule__Vehicle_Impl__IdAssignment_1 : ( ruleEString ) ;
    public final void rule__Vehicle_Impl__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1389:1: ( ( ruleEString ) )
            // InternalPlatoon.g:1390:2: ( ruleEString )
            {
            // InternalPlatoon.g:1390:2: ( ruleEString )
            // InternalPlatoon.g:1391:3: ruleEString
            {
             before(grammarAccess.getVehicle_ImplAccess().getIdEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVehicle_ImplAccess().getIdEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Vehicle_Impl__IdAssignment_1"


    // $ANTLR start "rule__ForwardCommand__DistanceAssignment_1"
    // InternalPlatoon.g:1400:1: rule__ForwardCommand__DistanceAssignment_1 : ( ruleEInt ) ;
    public final void rule__ForwardCommand__DistanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1404:1: ( ( ruleEInt ) )
            // InternalPlatoon.g:1405:2: ( ruleEInt )
            {
            // InternalPlatoon.g:1405:2: ( ruleEInt )
            // InternalPlatoon.g:1406:3: ruleEInt
            {
             before(grammarAccess.getForwardCommandAccess().getDistanceEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getForwardCommandAccess().getDistanceEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ForwardCommand__DistanceAssignment_1"


    // $ANTLR start "rule__TurnCommand__DirectionAssignment_2"
    // InternalPlatoon.g:1415:1: rule__TurnCommand__DirectionAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__TurnCommand__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1419:1: ( ( ( ruleEString ) ) )
            // InternalPlatoon.g:1420:2: ( ( ruleEString ) )
            {
            // InternalPlatoon.g:1420:2: ( ( ruleEString ) )
            // InternalPlatoon.g:1421:3: ( ruleEString )
            {
             before(grammarAccess.getTurnCommandAccess().getDirectionDirectionCrossReference_2_0()); 
            // InternalPlatoon.g:1422:3: ( ruleEString )
            // InternalPlatoon.g:1423:4: ruleEString
            {
             before(grammarAccess.getTurnCommandAccess().getDirectionDirectionEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTurnCommandAccess().getDirectionDirectionEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTurnCommandAccess().getDirectionDirectionCrossReference_2_0()); 

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
    // $ANTLR end "rule__TurnCommand__DirectionAssignment_2"


    // $ANTLR start "rule__HeadwayConstraint__MinAssignment_0"
    // InternalPlatoon.g:1434:1: rule__HeadwayConstraint__MinAssignment_0 : ( ruleEInt ) ;
    public final void rule__HeadwayConstraint__MinAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1438:1: ( ( ruleEInt ) )
            // InternalPlatoon.g:1439:2: ( ruleEInt )
            {
            // InternalPlatoon.g:1439:2: ( ruleEInt )
            // InternalPlatoon.g:1440:3: ruleEInt
            {
             before(grammarAccess.getHeadwayConstraintAccess().getMinEIntParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getHeadwayConstraintAccess().getMinEIntParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__HeadwayConstraint__MinAssignment_0"


    // $ANTLR start "rule__HeadwayConstraint__MaxAssignment_4"
    // InternalPlatoon.g:1449:1: rule__HeadwayConstraint__MaxAssignment_4 : ( ruleEInt ) ;
    public final void rule__HeadwayConstraint__MaxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1453:1: ( ( ruleEInt ) )
            // InternalPlatoon.g:1454:2: ( ruleEInt )
            {
            // InternalPlatoon.g:1454:2: ( ruleEInt )
            // InternalPlatoon.g:1455:3: ruleEInt
            {
             before(grammarAccess.getHeadwayConstraintAccess().getMaxEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getHeadwayConstraintAccess().getMaxEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__HeadwayConstraint__MaxAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});

}