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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Left'", "'Right'", "'platoon'", "':'", "'route'", "'constraints'", "'LV'", "'FV'", "'front'", "'runner'", "'forward'", "'('", "')'", "'turn'", "'<='", "'headway'"
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


    // $ANTLR start "entryRuleCommand"
    // InternalPlatoon.g:78:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // InternalPlatoon.g:79:1: ( ruleCommand EOF )
            // InternalPlatoon.g:80:1: ruleCommand EOF
            {
             before(grammarAccess.getCommandRule()); 
            pushFollow(FOLLOW_1);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getCommandRule()); 
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
    // $ANTLR end "entryRuleCommand"


    // $ANTLR start "ruleCommand"
    // InternalPlatoon.g:87:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:91:2: ( ( ( rule__Command__Alternatives ) ) )
            // InternalPlatoon.g:92:2: ( ( rule__Command__Alternatives ) )
            {
            // InternalPlatoon.g:92:2: ( ( rule__Command__Alternatives ) )
            // InternalPlatoon.g:93:3: ( rule__Command__Alternatives )
            {
             before(grammarAccess.getCommandAccess().getAlternatives()); 
            // InternalPlatoon.g:94:3: ( rule__Command__Alternatives )
            // InternalPlatoon.g:94:4: rule__Command__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Command__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommandAccess().getAlternatives()); 

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
    // $ANTLR end "ruleCommand"


    // $ANTLR start "entryRuleConstraint"
    // InternalPlatoon.g:103:1: entryRuleConstraint : ruleConstraint EOF ;
    public final void entryRuleConstraint() throws RecognitionException {
        try {
            // InternalPlatoon.g:104:1: ( ruleConstraint EOF )
            // InternalPlatoon.g:105:1: ruleConstraint EOF
            {
             before(grammarAccess.getConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintRule()); 
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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalPlatoon.g:112:1: ruleConstraint : ( ruleHeadwayConstraint ) ;
    public final void ruleConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:116:2: ( ( ruleHeadwayConstraint ) )
            // InternalPlatoon.g:117:2: ( ruleHeadwayConstraint )
            {
            // InternalPlatoon.g:117:2: ( ruleHeadwayConstraint )
            // InternalPlatoon.g:118:3: ruleHeadwayConstraint
            {
             before(grammarAccess.getConstraintAccess().getHeadwayConstraintParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleHeadwayConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintAccess().getHeadwayConstraintParserRuleCall()); 

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRulePlatoon"
    // InternalPlatoon.g:128:1: entryRulePlatoon : rulePlatoon EOF ;
    public final void entryRulePlatoon() throws RecognitionException {
        try {
            // InternalPlatoon.g:129:1: ( rulePlatoon EOF )
            // InternalPlatoon.g:130:1: rulePlatoon EOF
            {
             before(grammarAccess.getPlatoonRule()); 
            pushFollow(FOLLOW_1);
            rulePlatoon();

            state._fsp--;

             after(grammarAccess.getPlatoonRule()); 
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
    // $ANTLR end "entryRulePlatoon"


    // $ANTLR start "rulePlatoon"
    // InternalPlatoon.g:137:1: rulePlatoon : ( ( rule__Platoon__Group__0 ) ) ;
    public final void rulePlatoon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:141:2: ( ( ( rule__Platoon__Group__0 ) ) )
            // InternalPlatoon.g:142:2: ( ( rule__Platoon__Group__0 ) )
            {
            // InternalPlatoon.g:142:2: ( ( rule__Platoon__Group__0 ) )
            // InternalPlatoon.g:143:3: ( rule__Platoon__Group__0 )
            {
             before(grammarAccess.getPlatoonAccess().getGroup()); 
            // InternalPlatoon.g:144:3: ( rule__Platoon__Group__0 )
            // InternalPlatoon.g:144:4: rule__Platoon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Platoon__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlatoonAccess().getGroup()); 

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
    // $ANTLR end "rulePlatoon"


    // $ANTLR start "entryRuleRoute"
    // InternalPlatoon.g:153:1: entryRuleRoute : ruleRoute EOF ;
    public final void entryRuleRoute() throws RecognitionException {
        try {
            // InternalPlatoon.g:154:1: ( ruleRoute EOF )
            // InternalPlatoon.g:155:1: ruleRoute EOF
            {
             before(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_1);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRouteRule()); 
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
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // InternalPlatoon.g:162:1: ruleRoute : ( ( rule__Route__Group__0 ) ) ;
    public final void ruleRoute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:166:2: ( ( ( rule__Route__Group__0 ) ) )
            // InternalPlatoon.g:167:2: ( ( rule__Route__Group__0 ) )
            {
            // InternalPlatoon.g:167:2: ( ( rule__Route__Group__0 ) )
            // InternalPlatoon.g:168:3: ( rule__Route__Group__0 )
            {
             before(grammarAccess.getRouteAccess().getGroup()); 
            // InternalPlatoon.g:169:3: ( rule__Route__Group__0 )
            // InternalPlatoon.g:169:4: rule__Route__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Route__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getGroup()); 

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
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleConstraints"
    // InternalPlatoon.g:178:1: entryRuleConstraints : ruleConstraints EOF ;
    public final void entryRuleConstraints() throws RecognitionException {
        try {
            // InternalPlatoon.g:179:1: ( ruleConstraints EOF )
            // InternalPlatoon.g:180:1: ruleConstraints EOF
            {
             before(grammarAccess.getConstraintsRule()); 
            pushFollow(FOLLOW_1);
            ruleConstraints();

            state._fsp--;

             after(grammarAccess.getConstraintsRule()); 
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
    // $ANTLR end "entryRuleConstraints"


    // $ANTLR start "ruleConstraints"
    // InternalPlatoon.g:187:1: ruleConstraints : ( ( rule__Constraints__Group__0 ) ) ;
    public final void ruleConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:191:2: ( ( ( rule__Constraints__Group__0 ) ) )
            // InternalPlatoon.g:192:2: ( ( rule__Constraints__Group__0 ) )
            {
            // InternalPlatoon.g:192:2: ( ( rule__Constraints__Group__0 ) )
            // InternalPlatoon.g:193:3: ( rule__Constraints__Group__0 )
            {
             before(grammarAccess.getConstraintsAccess().getGroup()); 
            // InternalPlatoon.g:194:3: ( rule__Constraints__Group__0 )
            // InternalPlatoon.g:194:4: rule__Constraints__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getGroup()); 

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
    // $ANTLR end "ruleConstraints"


    // $ANTLR start "entryRuleLeadingVehicle"
    // InternalPlatoon.g:203:1: entryRuleLeadingVehicle : ruleLeadingVehicle EOF ;
    public final void entryRuleLeadingVehicle() throws RecognitionException {
        try {
            // InternalPlatoon.g:204:1: ( ruleLeadingVehicle EOF )
            // InternalPlatoon.g:205:1: ruleLeadingVehicle EOF
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
    // InternalPlatoon.g:212:1: ruleLeadingVehicle : ( ( rule__LeadingVehicle__Group__0 ) ) ;
    public final void ruleLeadingVehicle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:216:2: ( ( ( rule__LeadingVehicle__Group__0 ) ) )
            // InternalPlatoon.g:217:2: ( ( rule__LeadingVehicle__Group__0 ) )
            {
            // InternalPlatoon.g:217:2: ( ( rule__LeadingVehicle__Group__0 ) )
            // InternalPlatoon.g:218:3: ( rule__LeadingVehicle__Group__0 )
            {
             before(grammarAccess.getLeadingVehicleAccess().getGroup()); 
            // InternalPlatoon.g:219:3: ( rule__LeadingVehicle__Group__0 )
            // InternalPlatoon.g:219:4: rule__LeadingVehicle__Group__0
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
    // InternalPlatoon.g:228:1: entryRuleFollowVehicle : ruleFollowVehicle EOF ;
    public final void entryRuleFollowVehicle() throws RecognitionException {
        try {
            // InternalPlatoon.g:229:1: ( ruleFollowVehicle EOF )
            // InternalPlatoon.g:230:1: ruleFollowVehicle EOF
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
    // InternalPlatoon.g:237:1: ruleFollowVehicle : ( ( rule__FollowVehicle__Group__0 ) ) ;
    public final void ruleFollowVehicle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:241:2: ( ( ( rule__FollowVehicle__Group__0 ) ) )
            // InternalPlatoon.g:242:2: ( ( rule__FollowVehicle__Group__0 ) )
            {
            // InternalPlatoon.g:242:2: ( ( rule__FollowVehicle__Group__0 ) )
            // InternalPlatoon.g:243:3: ( rule__FollowVehicle__Group__0 )
            {
             before(grammarAccess.getFollowVehicleAccess().getGroup()); 
            // InternalPlatoon.g:244:3: ( rule__FollowVehicle__Group__0 )
            // InternalPlatoon.g:244:4: rule__FollowVehicle__Group__0
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
    // InternalPlatoon.g:253:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalPlatoon.g:254:1: ( ruleEString EOF )
            // InternalPlatoon.g:255:1: ruleEString EOF
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
    // InternalPlatoon.g:262:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:266:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalPlatoon.g:267:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalPlatoon.g:267:2: ( ( rule__EString__Alternatives ) )
            // InternalPlatoon.g:268:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalPlatoon.g:269:3: ( rule__EString__Alternatives )
            // InternalPlatoon.g:269:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleForwardCommand"
    // InternalPlatoon.g:278:1: entryRuleForwardCommand : ruleForwardCommand EOF ;
    public final void entryRuleForwardCommand() throws RecognitionException {
        try {
            // InternalPlatoon.g:279:1: ( ruleForwardCommand EOF )
            // InternalPlatoon.g:280:1: ruleForwardCommand EOF
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
    // InternalPlatoon.g:287:1: ruleForwardCommand : ( ( rule__ForwardCommand__Group__0 ) ) ;
    public final void ruleForwardCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:291:2: ( ( ( rule__ForwardCommand__Group__0 ) ) )
            // InternalPlatoon.g:292:2: ( ( rule__ForwardCommand__Group__0 ) )
            {
            // InternalPlatoon.g:292:2: ( ( rule__ForwardCommand__Group__0 ) )
            // InternalPlatoon.g:293:3: ( rule__ForwardCommand__Group__0 )
            {
             before(grammarAccess.getForwardCommandAccess().getGroup()); 
            // InternalPlatoon.g:294:3: ( rule__ForwardCommand__Group__0 )
            // InternalPlatoon.g:294:4: rule__ForwardCommand__Group__0
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
    // InternalPlatoon.g:303:1: entryRuleTurnCommand : ruleTurnCommand EOF ;
    public final void entryRuleTurnCommand() throws RecognitionException {
        try {
            // InternalPlatoon.g:304:1: ( ruleTurnCommand EOF )
            // InternalPlatoon.g:305:1: ruleTurnCommand EOF
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
    // InternalPlatoon.g:312:1: ruleTurnCommand : ( ( rule__TurnCommand__Group__0 ) ) ;
    public final void ruleTurnCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:316:2: ( ( ( rule__TurnCommand__Group__0 ) ) )
            // InternalPlatoon.g:317:2: ( ( rule__TurnCommand__Group__0 ) )
            {
            // InternalPlatoon.g:317:2: ( ( rule__TurnCommand__Group__0 ) )
            // InternalPlatoon.g:318:3: ( rule__TurnCommand__Group__0 )
            {
             before(grammarAccess.getTurnCommandAccess().getGroup()); 
            // InternalPlatoon.g:319:3: ( rule__TurnCommand__Group__0 )
            // InternalPlatoon.g:319:4: rule__TurnCommand__Group__0
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


    // $ANTLR start "entryRuleDirection"
    // InternalPlatoon.g:328:1: entryRuleDirection : ruleDirection EOF ;
    public final void entryRuleDirection() throws RecognitionException {
        try {
            // InternalPlatoon.g:329:1: ( ruleDirection EOF )
            // InternalPlatoon.g:330:1: ruleDirection EOF
            {
             before(grammarAccess.getDirectionRule()); 
            pushFollow(FOLLOW_1);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getDirectionRule()); 
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
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // InternalPlatoon.g:337:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:341:2: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalPlatoon.g:342:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalPlatoon.g:342:2: ( ( rule__Direction__Alternatives ) )
            // InternalPlatoon.g:343:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalPlatoon.g:344:3: ( rule__Direction__Alternatives )
            // InternalPlatoon.g:344:4: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "entryRuleHeadwayConstraint"
    // InternalPlatoon.g:353:1: entryRuleHeadwayConstraint : ruleHeadwayConstraint EOF ;
    public final void entryRuleHeadwayConstraint() throws RecognitionException {
        try {
            // InternalPlatoon.g:354:1: ( ruleHeadwayConstraint EOF )
            // InternalPlatoon.g:355:1: ruleHeadwayConstraint EOF
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
    // InternalPlatoon.g:362:1: ruleHeadwayConstraint : ( ( rule__HeadwayConstraint__Group__0 ) ) ;
    public final void ruleHeadwayConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:366:2: ( ( ( rule__HeadwayConstraint__Group__0 ) ) )
            // InternalPlatoon.g:367:2: ( ( rule__HeadwayConstraint__Group__0 ) )
            {
            // InternalPlatoon.g:367:2: ( ( rule__HeadwayConstraint__Group__0 ) )
            // InternalPlatoon.g:368:3: ( rule__HeadwayConstraint__Group__0 )
            {
             before(grammarAccess.getHeadwayConstraintAccess().getGroup()); 
            // InternalPlatoon.g:369:3: ( rule__HeadwayConstraint__Group__0 )
            // InternalPlatoon.g:369:4: rule__HeadwayConstraint__Group__0
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


    // $ANTLR start "rule__Command__Alternatives"
    // InternalPlatoon.g:377:1: rule__Command__Alternatives : ( ( ruleForwardCommand ) | ( ruleTurnCommand ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:381:1: ( ( ruleForwardCommand ) | ( ruleTurnCommand ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalPlatoon.g:382:2: ( ruleForwardCommand )
                    {
                    // InternalPlatoon.g:382:2: ( ruleForwardCommand )
                    // InternalPlatoon.g:383:3: ruleForwardCommand
                    {
                     before(grammarAccess.getCommandAccess().getForwardCommandParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleForwardCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getForwardCommandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPlatoon.g:388:2: ( ruleTurnCommand )
                    {
                    // InternalPlatoon.g:388:2: ( ruleTurnCommand )
                    // InternalPlatoon.g:389:3: ruleTurnCommand
                    {
                     before(grammarAccess.getCommandAccess().getTurnCommandParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTurnCommand();

                    state._fsp--;

                     after(grammarAccess.getCommandAccess().getTurnCommandParserRuleCall_1()); 

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
    // $ANTLR end "rule__Command__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalPlatoon.g:398:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:402:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalPlatoon.g:403:2: ( RULE_STRING )
                    {
                    // InternalPlatoon.g:403:2: ( RULE_STRING )
                    // InternalPlatoon.g:404:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPlatoon.g:409:2: ( RULE_ID )
                    {
                    // InternalPlatoon.g:409:2: ( RULE_ID )
                    // InternalPlatoon.g:410:3: RULE_ID
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


    // $ANTLR start "rule__Direction__Alternatives"
    // InternalPlatoon.g:419:1: rule__Direction__Alternatives : ( ( 'Left' ) | ( 'Right' ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:423:1: ( ( 'Left' ) | ( 'Right' ) )
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
                    // InternalPlatoon.g:424:2: ( 'Left' )
                    {
                    // InternalPlatoon.g:424:2: ( 'Left' )
                    // InternalPlatoon.g:425:3: 'Left'
                    {
                     before(grammarAccess.getDirectionAccess().getLeftKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getDirectionAccess().getLeftKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPlatoon.g:430:2: ( 'Right' )
                    {
                    // InternalPlatoon.g:430:2: ( 'Right' )
                    // InternalPlatoon.g:431:3: 'Right'
                    {
                     before(grammarAccess.getDirectionAccess().getRightKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getDirectionAccess().getRightKeyword_1()); 

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
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__World__Group__0"
    // InternalPlatoon.g:440:1: rule__World__Group__0 : rule__World__Group__0__Impl rule__World__Group__1 ;
    public final void rule__World__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:444:1: ( rule__World__Group__0__Impl rule__World__Group__1 )
            // InternalPlatoon.g:445:2: rule__World__Group__0__Impl rule__World__Group__1
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
    // InternalPlatoon.g:452:1: rule__World__Group__0__Impl : ( () ) ;
    public final void rule__World__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:456:1: ( ( () ) )
            // InternalPlatoon.g:457:1: ( () )
            {
            // InternalPlatoon.g:457:1: ( () )
            // InternalPlatoon.g:458:2: ()
            {
             before(grammarAccess.getWorldAccess().getWorldAction_0()); 
            // InternalPlatoon.g:459:2: ()
            // InternalPlatoon.g:459:3: 
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
    // InternalPlatoon.g:467:1: rule__World__Group__1 : rule__World__Group__1__Impl rule__World__Group__2 ;
    public final void rule__World__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:471:1: ( rule__World__Group__1__Impl rule__World__Group__2 )
            // InternalPlatoon.g:472:2: rule__World__Group__1__Impl rule__World__Group__2
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
    // InternalPlatoon.g:479:1: rule__World__Group__1__Impl : ( ( rule__World__PlatoonAssignment_1 ) ) ;
    public final void rule__World__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:483:1: ( ( ( rule__World__PlatoonAssignment_1 ) ) )
            // InternalPlatoon.g:484:1: ( ( rule__World__PlatoonAssignment_1 ) )
            {
            // InternalPlatoon.g:484:1: ( ( rule__World__PlatoonAssignment_1 ) )
            // InternalPlatoon.g:485:2: ( rule__World__PlatoonAssignment_1 )
            {
             before(grammarAccess.getWorldAccess().getPlatoonAssignment_1()); 
            // InternalPlatoon.g:486:2: ( rule__World__PlatoonAssignment_1 )
            // InternalPlatoon.g:486:3: rule__World__PlatoonAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__World__PlatoonAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getPlatoonAssignment_1()); 

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
    // InternalPlatoon.g:494:1: rule__World__Group__2 : rule__World__Group__2__Impl rule__World__Group__3 ;
    public final void rule__World__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:498:1: ( rule__World__Group__2__Impl rule__World__Group__3 )
            // InternalPlatoon.g:499:2: rule__World__Group__2__Impl rule__World__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__World__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__World__Group__3();

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
    // InternalPlatoon.g:506:1: rule__World__Group__2__Impl : ( ( rule__World__RouteAssignment_2 ) ) ;
    public final void rule__World__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:510:1: ( ( ( rule__World__RouteAssignment_2 ) ) )
            // InternalPlatoon.g:511:1: ( ( rule__World__RouteAssignment_2 ) )
            {
            // InternalPlatoon.g:511:1: ( ( rule__World__RouteAssignment_2 ) )
            // InternalPlatoon.g:512:2: ( rule__World__RouteAssignment_2 )
            {
             before(grammarAccess.getWorldAccess().getRouteAssignment_2()); 
            // InternalPlatoon.g:513:2: ( rule__World__RouteAssignment_2 )
            // InternalPlatoon.g:513:3: rule__World__RouteAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__World__RouteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getRouteAssignment_2()); 

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


    // $ANTLR start "rule__World__Group__3"
    // InternalPlatoon.g:521:1: rule__World__Group__3 : rule__World__Group__3__Impl ;
    public final void rule__World__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:525:1: ( rule__World__Group__3__Impl )
            // InternalPlatoon.g:526:2: rule__World__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__World__Group__3__Impl();

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
    // $ANTLR end "rule__World__Group__3"


    // $ANTLR start "rule__World__Group__3__Impl"
    // InternalPlatoon.g:532:1: rule__World__Group__3__Impl : ( ( rule__World__ConstraintsAssignment_3 ) ) ;
    public final void rule__World__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:536:1: ( ( ( rule__World__ConstraintsAssignment_3 ) ) )
            // InternalPlatoon.g:537:1: ( ( rule__World__ConstraintsAssignment_3 ) )
            {
            // InternalPlatoon.g:537:1: ( ( rule__World__ConstraintsAssignment_3 ) )
            // InternalPlatoon.g:538:2: ( rule__World__ConstraintsAssignment_3 )
            {
             before(grammarAccess.getWorldAccess().getConstraintsAssignment_3()); 
            // InternalPlatoon.g:539:2: ( rule__World__ConstraintsAssignment_3 )
            // InternalPlatoon.g:539:3: rule__World__ConstraintsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__World__ConstraintsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorldAccess().getConstraintsAssignment_3()); 

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
    // $ANTLR end "rule__World__Group__3__Impl"


    // $ANTLR start "rule__Platoon__Group__0"
    // InternalPlatoon.g:548:1: rule__Platoon__Group__0 : rule__Platoon__Group__0__Impl rule__Platoon__Group__1 ;
    public final void rule__Platoon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:552:1: ( rule__Platoon__Group__0__Impl rule__Platoon__Group__1 )
            // InternalPlatoon.g:553:2: rule__Platoon__Group__0__Impl rule__Platoon__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Platoon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platoon__Group__1();

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
    // $ANTLR end "rule__Platoon__Group__0"


    // $ANTLR start "rule__Platoon__Group__0__Impl"
    // InternalPlatoon.g:560:1: rule__Platoon__Group__0__Impl : ( () ) ;
    public final void rule__Platoon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:564:1: ( ( () ) )
            // InternalPlatoon.g:565:1: ( () )
            {
            // InternalPlatoon.g:565:1: ( () )
            // InternalPlatoon.g:566:2: ()
            {
             before(grammarAccess.getPlatoonAccess().getPlatoonAction_0()); 
            // InternalPlatoon.g:567:2: ()
            // InternalPlatoon.g:567:3: 
            {
            }

             after(grammarAccess.getPlatoonAccess().getPlatoonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Platoon__Group__0__Impl"


    // $ANTLR start "rule__Platoon__Group__1"
    // InternalPlatoon.g:575:1: rule__Platoon__Group__1 : rule__Platoon__Group__1__Impl rule__Platoon__Group__2 ;
    public final void rule__Platoon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:579:1: ( rule__Platoon__Group__1__Impl rule__Platoon__Group__2 )
            // InternalPlatoon.g:580:2: rule__Platoon__Group__1__Impl rule__Platoon__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Platoon__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platoon__Group__2();

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
    // $ANTLR end "rule__Platoon__Group__1"


    // $ANTLR start "rule__Platoon__Group__1__Impl"
    // InternalPlatoon.g:587:1: rule__Platoon__Group__1__Impl : ( 'platoon' ) ;
    public final void rule__Platoon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:591:1: ( ( 'platoon' ) )
            // InternalPlatoon.g:592:1: ( 'platoon' )
            {
            // InternalPlatoon.g:592:1: ( 'platoon' )
            // InternalPlatoon.g:593:2: 'platoon'
            {
             before(grammarAccess.getPlatoonAccess().getPlatoonKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPlatoonAccess().getPlatoonKeyword_1()); 

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
    // $ANTLR end "rule__Platoon__Group__1__Impl"


    // $ANTLR start "rule__Platoon__Group__2"
    // InternalPlatoon.g:602:1: rule__Platoon__Group__2 : rule__Platoon__Group__2__Impl rule__Platoon__Group__3 ;
    public final void rule__Platoon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:606:1: ( rule__Platoon__Group__2__Impl rule__Platoon__Group__3 )
            // InternalPlatoon.g:607:2: rule__Platoon__Group__2__Impl rule__Platoon__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Platoon__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platoon__Group__3();

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
    // $ANTLR end "rule__Platoon__Group__2"


    // $ANTLR start "rule__Platoon__Group__2__Impl"
    // InternalPlatoon.g:614:1: rule__Platoon__Group__2__Impl : ( ':' ) ;
    public final void rule__Platoon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:618:1: ( ( ':' ) )
            // InternalPlatoon.g:619:1: ( ':' )
            {
            // InternalPlatoon.g:619:1: ( ':' )
            // InternalPlatoon.g:620:2: ':'
            {
             before(grammarAccess.getPlatoonAccess().getColonKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPlatoonAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Platoon__Group__2__Impl"


    // $ANTLR start "rule__Platoon__Group__3"
    // InternalPlatoon.g:629:1: rule__Platoon__Group__3 : rule__Platoon__Group__3__Impl rule__Platoon__Group__4 ;
    public final void rule__Platoon__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:633:1: ( rule__Platoon__Group__3__Impl rule__Platoon__Group__4 )
            // InternalPlatoon.g:634:2: rule__Platoon__Group__3__Impl rule__Platoon__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Platoon__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Platoon__Group__4();

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
    // $ANTLR end "rule__Platoon__Group__3"


    // $ANTLR start "rule__Platoon__Group__3__Impl"
    // InternalPlatoon.g:641:1: rule__Platoon__Group__3__Impl : ( ( rule__Platoon__LVAssignment_3 ) ) ;
    public final void rule__Platoon__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:645:1: ( ( ( rule__Platoon__LVAssignment_3 ) ) )
            // InternalPlatoon.g:646:1: ( ( rule__Platoon__LVAssignment_3 ) )
            {
            // InternalPlatoon.g:646:1: ( ( rule__Platoon__LVAssignment_3 ) )
            // InternalPlatoon.g:647:2: ( rule__Platoon__LVAssignment_3 )
            {
             before(grammarAccess.getPlatoonAccess().getLVAssignment_3()); 
            // InternalPlatoon.g:648:2: ( rule__Platoon__LVAssignment_3 )
            // InternalPlatoon.g:648:3: rule__Platoon__LVAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Platoon__LVAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPlatoonAccess().getLVAssignment_3()); 

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
    // $ANTLR end "rule__Platoon__Group__3__Impl"


    // $ANTLR start "rule__Platoon__Group__4"
    // InternalPlatoon.g:656:1: rule__Platoon__Group__4 : rule__Platoon__Group__4__Impl ;
    public final void rule__Platoon__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:660:1: ( rule__Platoon__Group__4__Impl )
            // InternalPlatoon.g:661:2: rule__Platoon__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Platoon__Group__4__Impl();

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
    // $ANTLR end "rule__Platoon__Group__4"


    // $ANTLR start "rule__Platoon__Group__4__Impl"
    // InternalPlatoon.g:667:1: rule__Platoon__Group__4__Impl : ( ( rule__Platoon__FVAssignment_4 )? ) ;
    public final void rule__Platoon__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:671:1: ( ( ( rule__Platoon__FVAssignment_4 )? ) )
            // InternalPlatoon.g:672:1: ( ( rule__Platoon__FVAssignment_4 )? )
            {
            // InternalPlatoon.g:672:1: ( ( rule__Platoon__FVAssignment_4 )? )
            // InternalPlatoon.g:673:2: ( rule__Platoon__FVAssignment_4 )?
            {
             before(grammarAccess.getPlatoonAccess().getFVAssignment_4()); 
            // InternalPlatoon.g:674:2: ( rule__Platoon__FVAssignment_4 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalPlatoon.g:674:3: rule__Platoon__FVAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Platoon__FVAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPlatoonAccess().getFVAssignment_4()); 

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
    // $ANTLR end "rule__Platoon__Group__4__Impl"


    // $ANTLR start "rule__Route__Group__0"
    // InternalPlatoon.g:683:1: rule__Route__Group__0 : rule__Route__Group__0__Impl rule__Route__Group__1 ;
    public final void rule__Route__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:687:1: ( rule__Route__Group__0__Impl rule__Route__Group__1 )
            // InternalPlatoon.g:688:2: rule__Route__Group__0__Impl rule__Route__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Route__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__1();

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
    // $ANTLR end "rule__Route__Group__0"


    // $ANTLR start "rule__Route__Group__0__Impl"
    // InternalPlatoon.g:695:1: rule__Route__Group__0__Impl : ( () ) ;
    public final void rule__Route__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:699:1: ( ( () ) )
            // InternalPlatoon.g:700:1: ( () )
            {
            // InternalPlatoon.g:700:1: ( () )
            // InternalPlatoon.g:701:2: ()
            {
             before(grammarAccess.getRouteAccess().getRouteAction_0()); 
            // InternalPlatoon.g:702:2: ()
            // InternalPlatoon.g:702:3: 
            {
            }

             after(grammarAccess.getRouteAccess().getRouteAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Route__Group__0__Impl"


    // $ANTLR start "rule__Route__Group__1"
    // InternalPlatoon.g:710:1: rule__Route__Group__1 : rule__Route__Group__1__Impl rule__Route__Group__2 ;
    public final void rule__Route__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:714:1: ( rule__Route__Group__1__Impl rule__Route__Group__2 )
            // InternalPlatoon.g:715:2: rule__Route__Group__1__Impl rule__Route__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Route__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__2();

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
    // $ANTLR end "rule__Route__Group__1"


    // $ANTLR start "rule__Route__Group__1__Impl"
    // InternalPlatoon.g:722:1: rule__Route__Group__1__Impl : ( 'route' ) ;
    public final void rule__Route__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:726:1: ( ( 'route' ) )
            // InternalPlatoon.g:727:1: ( 'route' )
            {
            // InternalPlatoon.g:727:1: ( 'route' )
            // InternalPlatoon.g:728:2: 'route'
            {
             before(grammarAccess.getRouteAccess().getRouteKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getRouteKeyword_1()); 

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
    // $ANTLR end "rule__Route__Group__1__Impl"


    // $ANTLR start "rule__Route__Group__2"
    // InternalPlatoon.g:737:1: rule__Route__Group__2 : rule__Route__Group__2__Impl rule__Route__Group__3 ;
    public final void rule__Route__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:741:1: ( rule__Route__Group__2__Impl rule__Route__Group__3 )
            // InternalPlatoon.g:742:2: rule__Route__Group__2__Impl rule__Route__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Route__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__3();

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
    // $ANTLR end "rule__Route__Group__2"


    // $ANTLR start "rule__Route__Group__2__Impl"
    // InternalPlatoon.g:749:1: rule__Route__Group__2__Impl : ( ( rule__Route__NameAssignment_2 ) ) ;
    public final void rule__Route__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:753:1: ( ( ( rule__Route__NameAssignment_2 ) ) )
            // InternalPlatoon.g:754:1: ( ( rule__Route__NameAssignment_2 ) )
            {
            // InternalPlatoon.g:754:1: ( ( rule__Route__NameAssignment_2 ) )
            // InternalPlatoon.g:755:2: ( rule__Route__NameAssignment_2 )
            {
             before(grammarAccess.getRouteAccess().getNameAssignment_2()); 
            // InternalPlatoon.g:756:2: ( rule__Route__NameAssignment_2 )
            // InternalPlatoon.g:756:3: rule__Route__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Route__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Route__Group__2__Impl"


    // $ANTLR start "rule__Route__Group__3"
    // InternalPlatoon.g:764:1: rule__Route__Group__3 : rule__Route__Group__3__Impl rule__Route__Group__4 ;
    public final void rule__Route__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:768:1: ( rule__Route__Group__3__Impl rule__Route__Group__4 )
            // InternalPlatoon.g:769:2: rule__Route__Group__3__Impl rule__Route__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Route__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__4();

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
    // $ANTLR end "rule__Route__Group__3"


    // $ANTLR start "rule__Route__Group__3__Impl"
    // InternalPlatoon.g:776:1: rule__Route__Group__3__Impl : ( ':' ) ;
    public final void rule__Route__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:780:1: ( ( ':' ) )
            // InternalPlatoon.g:781:1: ( ':' )
            {
            // InternalPlatoon.g:781:1: ( ':' )
            // InternalPlatoon.g:782:2: ':'
            {
             before(grammarAccess.getRouteAccess().getColonKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRouteAccess().getColonKeyword_3()); 

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
    // $ANTLR end "rule__Route__Group__3__Impl"


    // $ANTLR start "rule__Route__Group__4"
    // InternalPlatoon.g:791:1: rule__Route__Group__4 : rule__Route__Group__4__Impl rule__Route__Group__5 ;
    public final void rule__Route__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:795:1: ( rule__Route__Group__4__Impl rule__Route__Group__5 )
            // InternalPlatoon.g:796:2: rule__Route__Group__4__Impl rule__Route__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Route__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Route__Group__5();

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
    // $ANTLR end "rule__Route__Group__4"


    // $ANTLR start "rule__Route__Group__4__Impl"
    // InternalPlatoon.g:803:1: rule__Route__Group__4__Impl : ( ( rule__Route__CommandsAssignment_4 ) ) ;
    public final void rule__Route__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:807:1: ( ( ( rule__Route__CommandsAssignment_4 ) ) )
            // InternalPlatoon.g:808:1: ( ( rule__Route__CommandsAssignment_4 ) )
            {
            // InternalPlatoon.g:808:1: ( ( rule__Route__CommandsAssignment_4 ) )
            // InternalPlatoon.g:809:2: ( rule__Route__CommandsAssignment_4 )
            {
             before(grammarAccess.getRouteAccess().getCommandsAssignment_4()); 
            // InternalPlatoon.g:810:2: ( rule__Route__CommandsAssignment_4 )
            // InternalPlatoon.g:810:3: rule__Route__CommandsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Route__CommandsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getCommandsAssignment_4()); 

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
    // $ANTLR end "rule__Route__Group__4__Impl"


    // $ANTLR start "rule__Route__Group__5"
    // InternalPlatoon.g:818:1: rule__Route__Group__5 : rule__Route__Group__5__Impl ;
    public final void rule__Route__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:822:1: ( rule__Route__Group__5__Impl )
            // InternalPlatoon.g:823:2: rule__Route__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Route__Group__5__Impl();

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
    // $ANTLR end "rule__Route__Group__5"


    // $ANTLR start "rule__Route__Group__5__Impl"
    // InternalPlatoon.g:829:1: rule__Route__Group__5__Impl : ( ( rule__Route__CommandsAssignment_5 )* ) ;
    public final void rule__Route__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:833:1: ( ( ( rule__Route__CommandsAssignment_5 )* ) )
            // InternalPlatoon.g:834:1: ( ( rule__Route__CommandsAssignment_5 )* )
            {
            // InternalPlatoon.g:834:1: ( ( rule__Route__CommandsAssignment_5 )* )
            // InternalPlatoon.g:835:2: ( rule__Route__CommandsAssignment_5 )*
            {
             before(grammarAccess.getRouteAccess().getCommandsAssignment_5()); 
            // InternalPlatoon.g:836:2: ( rule__Route__CommandsAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21||LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPlatoon.g:836:3: rule__Route__CommandsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Route__CommandsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getRouteAccess().getCommandsAssignment_5()); 

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
    // $ANTLR end "rule__Route__Group__5__Impl"


    // $ANTLR start "rule__Constraints__Group__0"
    // InternalPlatoon.g:845:1: rule__Constraints__Group__0 : rule__Constraints__Group__0__Impl rule__Constraints__Group__1 ;
    public final void rule__Constraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:849:1: ( rule__Constraints__Group__0__Impl rule__Constraints__Group__1 )
            // InternalPlatoon.g:850:2: rule__Constraints__Group__0__Impl rule__Constraints__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Constraints__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__1();

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
    // $ANTLR end "rule__Constraints__Group__0"


    // $ANTLR start "rule__Constraints__Group__0__Impl"
    // InternalPlatoon.g:857:1: rule__Constraints__Group__0__Impl : ( 'constraints' ) ;
    public final void rule__Constraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:861:1: ( ( 'constraints' ) )
            // InternalPlatoon.g:862:1: ( 'constraints' )
            {
            // InternalPlatoon.g:862:1: ( 'constraints' )
            // InternalPlatoon.g:863:2: 'constraints'
            {
             before(grammarAccess.getConstraintsAccess().getConstraintsKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConstraintsAccess().getConstraintsKeyword_0()); 

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
    // $ANTLR end "rule__Constraints__Group__0__Impl"


    // $ANTLR start "rule__Constraints__Group__1"
    // InternalPlatoon.g:872:1: rule__Constraints__Group__1 : rule__Constraints__Group__1__Impl rule__Constraints__Group__2 ;
    public final void rule__Constraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:876:1: ( rule__Constraints__Group__1__Impl rule__Constraints__Group__2 )
            // InternalPlatoon.g:877:2: rule__Constraints__Group__1__Impl rule__Constraints__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Constraints__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__2();

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
    // $ANTLR end "rule__Constraints__Group__1"


    // $ANTLR start "rule__Constraints__Group__1__Impl"
    // InternalPlatoon.g:884:1: rule__Constraints__Group__1__Impl : ( ':' ) ;
    public final void rule__Constraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:888:1: ( ( ':' ) )
            // InternalPlatoon.g:889:1: ( ':' )
            {
            // InternalPlatoon.g:889:1: ( ':' )
            // InternalPlatoon.g:890:2: ':'
            {
             before(grammarAccess.getConstraintsAccess().getColonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getConstraintsAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Constraints__Group__1__Impl"


    // $ANTLR start "rule__Constraints__Group__2"
    // InternalPlatoon.g:899:1: rule__Constraints__Group__2 : rule__Constraints__Group__2__Impl rule__Constraints__Group__3 ;
    public final void rule__Constraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:903:1: ( rule__Constraints__Group__2__Impl rule__Constraints__Group__3 )
            // InternalPlatoon.g:904:2: rule__Constraints__Group__2__Impl rule__Constraints__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Constraints__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constraints__Group__3();

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
    // $ANTLR end "rule__Constraints__Group__2"


    // $ANTLR start "rule__Constraints__Group__2__Impl"
    // InternalPlatoon.g:911:1: rule__Constraints__Group__2__Impl : ( ( rule__Constraints__ConstraintsAssignment_2 ) ) ;
    public final void rule__Constraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:915:1: ( ( ( rule__Constraints__ConstraintsAssignment_2 ) ) )
            // InternalPlatoon.g:916:1: ( ( rule__Constraints__ConstraintsAssignment_2 ) )
            {
            // InternalPlatoon.g:916:1: ( ( rule__Constraints__ConstraintsAssignment_2 ) )
            // InternalPlatoon.g:917:2: ( rule__Constraints__ConstraintsAssignment_2 )
            {
             before(grammarAccess.getConstraintsAccess().getConstraintsAssignment_2()); 
            // InternalPlatoon.g:918:2: ( rule__Constraints__ConstraintsAssignment_2 )
            // InternalPlatoon.g:918:3: rule__Constraints__ConstraintsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__ConstraintsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConstraintsAccess().getConstraintsAssignment_2()); 

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
    // $ANTLR end "rule__Constraints__Group__2__Impl"


    // $ANTLR start "rule__Constraints__Group__3"
    // InternalPlatoon.g:926:1: rule__Constraints__Group__3 : rule__Constraints__Group__3__Impl ;
    public final void rule__Constraints__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:930:1: ( rule__Constraints__Group__3__Impl )
            // InternalPlatoon.g:931:2: rule__Constraints__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constraints__Group__3__Impl();

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
    // $ANTLR end "rule__Constraints__Group__3"


    // $ANTLR start "rule__Constraints__Group__3__Impl"
    // InternalPlatoon.g:937:1: rule__Constraints__Group__3__Impl : ( ( rule__Constraints__ConstraintsAssignment_3 )* ) ;
    public final void rule__Constraints__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:941:1: ( ( ( rule__Constraints__ConstraintsAssignment_3 )* ) )
            // InternalPlatoon.g:942:1: ( ( rule__Constraints__ConstraintsAssignment_3 )* )
            {
            // InternalPlatoon.g:942:1: ( ( rule__Constraints__ConstraintsAssignment_3 )* )
            // InternalPlatoon.g:943:2: ( rule__Constraints__ConstraintsAssignment_3 )*
            {
             before(grammarAccess.getConstraintsAccess().getConstraintsAssignment_3()); 
            // InternalPlatoon.g:944:2: ( rule__Constraints__ConstraintsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_INT) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPlatoon.g:944:3: rule__Constraints__ConstraintsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Constraints__ConstraintsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getConstraintsAccess().getConstraintsAssignment_3()); 

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
    // $ANTLR end "rule__Constraints__Group__3__Impl"


    // $ANTLR start "rule__LeadingVehicle__Group__0"
    // InternalPlatoon.g:953:1: rule__LeadingVehicle__Group__0 : rule__LeadingVehicle__Group__0__Impl rule__LeadingVehicle__Group__1 ;
    public final void rule__LeadingVehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:957:1: ( rule__LeadingVehicle__Group__0__Impl rule__LeadingVehicle__Group__1 )
            // InternalPlatoon.g:958:2: rule__LeadingVehicle__Group__0__Impl rule__LeadingVehicle__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalPlatoon.g:965:1: rule__LeadingVehicle__Group__0__Impl : ( () ) ;
    public final void rule__LeadingVehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:969:1: ( ( () ) )
            // InternalPlatoon.g:970:1: ( () )
            {
            // InternalPlatoon.g:970:1: ( () )
            // InternalPlatoon.g:971:2: ()
            {
             before(grammarAccess.getLeadingVehicleAccess().getLeadingVehicleAction_0()); 
            // InternalPlatoon.g:972:2: ()
            // InternalPlatoon.g:972:3: 
            {
            }

             after(grammarAccess.getLeadingVehicleAccess().getLeadingVehicleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeadingVehicle__Group__0__Impl"


    // $ANTLR start "rule__LeadingVehicle__Group__1"
    // InternalPlatoon.g:980:1: rule__LeadingVehicle__Group__1 : rule__LeadingVehicle__Group__1__Impl rule__LeadingVehicle__Group__2 ;
    public final void rule__LeadingVehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:984:1: ( rule__LeadingVehicle__Group__1__Impl rule__LeadingVehicle__Group__2 )
            // InternalPlatoon.g:985:2: rule__LeadingVehicle__Group__1__Impl rule__LeadingVehicle__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalPlatoon.g:992:1: rule__LeadingVehicle__Group__1__Impl : ( 'LV' ) ;
    public final void rule__LeadingVehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:996:1: ( ( 'LV' ) )
            // InternalPlatoon.g:997:1: ( 'LV' )
            {
            // InternalPlatoon.g:997:1: ( 'LV' )
            // InternalPlatoon.g:998:2: 'LV'
            {
             before(grammarAccess.getLeadingVehicleAccess().getLVKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLeadingVehicleAccess().getLVKeyword_1()); 

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
    // InternalPlatoon.g:1007:1: rule__LeadingVehicle__Group__2 : rule__LeadingVehicle__Group__2__Impl rule__LeadingVehicle__Group__3 ;
    public final void rule__LeadingVehicle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1011:1: ( rule__LeadingVehicle__Group__2__Impl rule__LeadingVehicle__Group__3 )
            // InternalPlatoon.g:1012:2: rule__LeadingVehicle__Group__2__Impl rule__LeadingVehicle__Group__3
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
    // InternalPlatoon.g:1019:1: rule__LeadingVehicle__Group__2__Impl : ( ( rule__LeadingVehicle__NameAssignment_2 ) ) ;
    public final void rule__LeadingVehicle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1023:1: ( ( ( rule__LeadingVehicle__NameAssignment_2 ) ) )
            // InternalPlatoon.g:1024:1: ( ( rule__LeadingVehicle__NameAssignment_2 ) )
            {
            // InternalPlatoon.g:1024:1: ( ( rule__LeadingVehicle__NameAssignment_2 ) )
            // InternalPlatoon.g:1025:2: ( rule__LeadingVehicle__NameAssignment_2 )
            {
             before(grammarAccess.getLeadingVehicleAccess().getNameAssignment_2()); 
            // InternalPlatoon.g:1026:2: ( rule__LeadingVehicle__NameAssignment_2 )
            // InternalPlatoon.g:1026:3: rule__LeadingVehicle__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeadingVehicle__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeadingVehicleAccess().getNameAssignment_2()); 

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
    // InternalPlatoon.g:1034:1: rule__LeadingVehicle__Group__3 : rule__LeadingVehicle__Group__3__Impl rule__LeadingVehicle__Group__4 ;
    public final void rule__LeadingVehicle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1038:1: ( rule__LeadingVehicle__Group__3__Impl rule__LeadingVehicle__Group__4 )
            // InternalPlatoon.g:1039:2: rule__LeadingVehicle__Group__3__Impl rule__LeadingVehicle__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__LeadingVehicle__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeadingVehicle__Group__4();

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
    // InternalPlatoon.g:1046:1: rule__LeadingVehicle__Group__3__Impl : ( 'route' ) ;
    public final void rule__LeadingVehicle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1050:1: ( ( 'route' ) )
            // InternalPlatoon.g:1051:1: ( 'route' )
            {
            // InternalPlatoon.g:1051:1: ( 'route' )
            // InternalPlatoon.g:1052:2: 'route'
            {
             before(grammarAccess.getLeadingVehicleAccess().getRouteKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLeadingVehicleAccess().getRouteKeyword_3()); 

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


    // $ANTLR start "rule__LeadingVehicle__Group__4"
    // InternalPlatoon.g:1061:1: rule__LeadingVehicle__Group__4 : rule__LeadingVehicle__Group__4__Impl ;
    public final void rule__LeadingVehicle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1065:1: ( rule__LeadingVehicle__Group__4__Impl )
            // InternalPlatoon.g:1066:2: rule__LeadingVehicle__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeadingVehicle__Group__4__Impl();

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
    // $ANTLR end "rule__LeadingVehicle__Group__4"


    // $ANTLR start "rule__LeadingVehicle__Group__4__Impl"
    // InternalPlatoon.g:1072:1: rule__LeadingVehicle__Group__4__Impl : ( ( rule__LeadingVehicle__RouteAssignment_4 ) ) ;
    public final void rule__LeadingVehicle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1076:1: ( ( ( rule__LeadingVehicle__RouteAssignment_4 ) ) )
            // InternalPlatoon.g:1077:1: ( ( rule__LeadingVehicle__RouteAssignment_4 ) )
            {
            // InternalPlatoon.g:1077:1: ( ( rule__LeadingVehicle__RouteAssignment_4 ) )
            // InternalPlatoon.g:1078:2: ( rule__LeadingVehicle__RouteAssignment_4 )
            {
             before(grammarAccess.getLeadingVehicleAccess().getRouteAssignment_4()); 
            // InternalPlatoon.g:1079:2: ( rule__LeadingVehicle__RouteAssignment_4 )
            // InternalPlatoon.g:1079:3: rule__LeadingVehicle__RouteAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LeadingVehicle__RouteAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLeadingVehicleAccess().getRouteAssignment_4()); 

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
    // $ANTLR end "rule__LeadingVehicle__Group__4__Impl"


    // $ANTLR start "rule__FollowVehicle__Group__0"
    // InternalPlatoon.g:1088:1: rule__FollowVehicle__Group__0 : rule__FollowVehicle__Group__0__Impl rule__FollowVehicle__Group__1 ;
    public final void rule__FollowVehicle__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1092:1: ( rule__FollowVehicle__Group__0__Impl rule__FollowVehicle__Group__1 )
            // InternalPlatoon.g:1093:2: rule__FollowVehicle__Group__0__Impl rule__FollowVehicle__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalPlatoon.g:1100:1: rule__FollowVehicle__Group__0__Impl : ( () ) ;
    public final void rule__FollowVehicle__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1104:1: ( ( () ) )
            // InternalPlatoon.g:1105:1: ( () )
            {
            // InternalPlatoon.g:1105:1: ( () )
            // InternalPlatoon.g:1106:2: ()
            {
             before(grammarAccess.getFollowVehicleAccess().getFollowVehicleAction_0()); 
            // InternalPlatoon.g:1107:2: ()
            // InternalPlatoon.g:1107:3: 
            {
            }

             after(grammarAccess.getFollowVehicleAccess().getFollowVehicleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowVehicle__Group__0__Impl"


    // $ANTLR start "rule__FollowVehicle__Group__1"
    // InternalPlatoon.g:1115:1: rule__FollowVehicle__Group__1 : rule__FollowVehicle__Group__1__Impl rule__FollowVehicle__Group__2 ;
    public final void rule__FollowVehicle__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1119:1: ( rule__FollowVehicle__Group__1__Impl rule__FollowVehicle__Group__2 )
            // InternalPlatoon.g:1120:2: rule__FollowVehicle__Group__1__Impl rule__FollowVehicle__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalPlatoon.g:1127:1: rule__FollowVehicle__Group__1__Impl : ( 'FV' ) ;
    public final void rule__FollowVehicle__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1131:1: ( ( 'FV' ) )
            // InternalPlatoon.g:1132:1: ( 'FV' )
            {
            // InternalPlatoon.g:1132:1: ( 'FV' )
            // InternalPlatoon.g:1133:2: 'FV'
            {
             before(grammarAccess.getFollowVehicleAccess().getFVKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFollowVehicleAccess().getFVKeyword_1()); 

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
    // InternalPlatoon.g:1142:1: rule__FollowVehicle__Group__2 : rule__FollowVehicle__Group__2__Impl rule__FollowVehicle__Group__3 ;
    public final void rule__FollowVehicle__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1146:1: ( rule__FollowVehicle__Group__2__Impl rule__FollowVehicle__Group__3 )
            // InternalPlatoon.g:1147:2: rule__FollowVehicle__Group__2__Impl rule__FollowVehicle__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalPlatoon.g:1154:1: rule__FollowVehicle__Group__2__Impl : ( ( rule__FollowVehicle__NameAssignment_2 ) ) ;
    public final void rule__FollowVehicle__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1158:1: ( ( ( rule__FollowVehicle__NameAssignment_2 ) ) )
            // InternalPlatoon.g:1159:1: ( ( rule__FollowVehicle__NameAssignment_2 ) )
            {
            // InternalPlatoon.g:1159:1: ( ( rule__FollowVehicle__NameAssignment_2 ) )
            // InternalPlatoon.g:1160:2: ( rule__FollowVehicle__NameAssignment_2 )
            {
             before(grammarAccess.getFollowVehicleAccess().getNameAssignment_2()); 
            // InternalPlatoon.g:1161:2: ( rule__FollowVehicle__NameAssignment_2 )
            // InternalPlatoon.g:1161:3: rule__FollowVehicle__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FollowVehicle__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFollowVehicleAccess().getNameAssignment_2()); 

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
    // InternalPlatoon.g:1169:1: rule__FollowVehicle__Group__3 : rule__FollowVehicle__Group__3__Impl rule__FollowVehicle__Group__4 ;
    public final void rule__FollowVehicle__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1173:1: ( rule__FollowVehicle__Group__3__Impl rule__FollowVehicle__Group__4 )
            // InternalPlatoon.g:1174:2: rule__FollowVehicle__Group__3__Impl rule__FollowVehicle__Group__4
            {
            pushFollow(FOLLOW_15);
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
    // InternalPlatoon.g:1181:1: rule__FollowVehicle__Group__3__Impl : ( 'front' ) ;
    public final void rule__FollowVehicle__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1185:1: ( ( 'front' ) )
            // InternalPlatoon.g:1186:1: ( 'front' )
            {
            // InternalPlatoon.g:1186:1: ( 'front' )
            // InternalPlatoon.g:1187:2: 'front'
            {
             before(grammarAccess.getFollowVehicleAccess().getFrontKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFollowVehicleAccess().getFrontKeyword_3()); 

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
    // InternalPlatoon.g:1196:1: rule__FollowVehicle__Group__4 : rule__FollowVehicle__Group__4__Impl rule__FollowVehicle__Group__5 ;
    public final void rule__FollowVehicle__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1200:1: ( rule__FollowVehicle__Group__4__Impl rule__FollowVehicle__Group__5 )
            // InternalPlatoon.g:1201:2: rule__FollowVehicle__Group__4__Impl rule__FollowVehicle__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__FollowVehicle__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowVehicle__Group__5();

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
    // InternalPlatoon.g:1208:1: rule__FollowVehicle__Group__4__Impl : ( 'runner' ) ;
    public final void rule__FollowVehicle__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1212:1: ( ( 'runner' ) )
            // InternalPlatoon.g:1213:1: ( 'runner' )
            {
            // InternalPlatoon.g:1213:1: ( 'runner' )
            // InternalPlatoon.g:1214:2: 'runner'
            {
             before(grammarAccess.getFollowVehicleAccess().getRunnerKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFollowVehicleAccess().getRunnerKeyword_4()); 

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


    // $ANTLR start "rule__FollowVehicle__Group__5"
    // InternalPlatoon.g:1223:1: rule__FollowVehicle__Group__5 : rule__FollowVehicle__Group__5__Impl ;
    public final void rule__FollowVehicle__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1227:1: ( rule__FollowVehicle__Group__5__Impl )
            // InternalPlatoon.g:1228:2: rule__FollowVehicle__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FollowVehicle__Group__5__Impl();

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
    // $ANTLR end "rule__FollowVehicle__Group__5"


    // $ANTLR start "rule__FollowVehicle__Group__5__Impl"
    // InternalPlatoon.g:1234:1: rule__FollowVehicle__Group__5__Impl : ( ( rule__FollowVehicle__FollowsAssignment_5 ) ) ;
    public final void rule__FollowVehicle__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1238:1: ( ( ( rule__FollowVehicle__FollowsAssignment_5 ) ) )
            // InternalPlatoon.g:1239:1: ( ( rule__FollowVehicle__FollowsAssignment_5 ) )
            {
            // InternalPlatoon.g:1239:1: ( ( rule__FollowVehicle__FollowsAssignment_5 ) )
            // InternalPlatoon.g:1240:2: ( rule__FollowVehicle__FollowsAssignment_5 )
            {
             before(grammarAccess.getFollowVehicleAccess().getFollowsAssignment_5()); 
            // InternalPlatoon.g:1241:2: ( rule__FollowVehicle__FollowsAssignment_5 )
            // InternalPlatoon.g:1241:3: rule__FollowVehicle__FollowsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FollowVehicle__FollowsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFollowVehicleAccess().getFollowsAssignment_5()); 

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
    // $ANTLR end "rule__FollowVehicle__Group__5__Impl"


    // $ANTLR start "rule__ForwardCommand__Group__0"
    // InternalPlatoon.g:1250:1: rule__ForwardCommand__Group__0 : rule__ForwardCommand__Group__0__Impl rule__ForwardCommand__Group__1 ;
    public final void rule__ForwardCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1254:1: ( rule__ForwardCommand__Group__0__Impl rule__ForwardCommand__Group__1 )
            // InternalPlatoon.g:1255:2: rule__ForwardCommand__Group__0__Impl rule__ForwardCommand__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalPlatoon.g:1262:1: rule__ForwardCommand__Group__0__Impl : ( () ) ;
    public final void rule__ForwardCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1266:1: ( ( () ) )
            // InternalPlatoon.g:1267:1: ( () )
            {
            // InternalPlatoon.g:1267:1: ( () )
            // InternalPlatoon.g:1268:2: ()
            {
             before(grammarAccess.getForwardCommandAccess().getForwardCommandAction_0()); 
            // InternalPlatoon.g:1269:2: ()
            // InternalPlatoon.g:1269:3: 
            {
            }

             after(grammarAccess.getForwardCommandAccess().getForwardCommandAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForwardCommand__Group__0__Impl"


    // $ANTLR start "rule__ForwardCommand__Group__1"
    // InternalPlatoon.g:1277:1: rule__ForwardCommand__Group__1 : rule__ForwardCommand__Group__1__Impl rule__ForwardCommand__Group__2 ;
    public final void rule__ForwardCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1281:1: ( rule__ForwardCommand__Group__1__Impl rule__ForwardCommand__Group__2 )
            // InternalPlatoon.g:1282:2: rule__ForwardCommand__Group__1__Impl rule__ForwardCommand__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalPlatoon.g:1289:1: rule__ForwardCommand__Group__1__Impl : ( 'forward' ) ;
    public final void rule__ForwardCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1293:1: ( ( 'forward' ) )
            // InternalPlatoon.g:1294:1: ( 'forward' )
            {
            // InternalPlatoon.g:1294:1: ( 'forward' )
            // InternalPlatoon.g:1295:2: 'forward'
            {
             before(grammarAccess.getForwardCommandAccess().getForwardKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getForwardCommandAccess().getForwardKeyword_1()); 

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
    // InternalPlatoon.g:1304:1: rule__ForwardCommand__Group__2 : rule__ForwardCommand__Group__2__Impl rule__ForwardCommand__Group__3 ;
    public final void rule__ForwardCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1308:1: ( rule__ForwardCommand__Group__2__Impl rule__ForwardCommand__Group__3 )
            // InternalPlatoon.g:1309:2: rule__ForwardCommand__Group__2__Impl rule__ForwardCommand__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ForwardCommand__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForwardCommand__Group__3();

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
    // InternalPlatoon.g:1316:1: rule__ForwardCommand__Group__2__Impl : ( '(' ) ;
    public final void rule__ForwardCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1320:1: ( ( '(' ) )
            // InternalPlatoon.g:1321:1: ( '(' )
            {
            // InternalPlatoon.g:1321:1: ( '(' )
            // InternalPlatoon.g:1322:2: '('
            {
             before(grammarAccess.getForwardCommandAccess().getLeftParenthesisKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getForwardCommandAccess().getLeftParenthesisKeyword_2()); 

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


    // $ANTLR start "rule__ForwardCommand__Group__3"
    // InternalPlatoon.g:1331:1: rule__ForwardCommand__Group__3 : rule__ForwardCommand__Group__3__Impl rule__ForwardCommand__Group__4 ;
    public final void rule__ForwardCommand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1335:1: ( rule__ForwardCommand__Group__3__Impl rule__ForwardCommand__Group__4 )
            // InternalPlatoon.g:1336:2: rule__ForwardCommand__Group__3__Impl rule__ForwardCommand__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__ForwardCommand__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForwardCommand__Group__4();

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
    // $ANTLR end "rule__ForwardCommand__Group__3"


    // $ANTLR start "rule__ForwardCommand__Group__3__Impl"
    // InternalPlatoon.g:1343:1: rule__ForwardCommand__Group__3__Impl : ( ( rule__ForwardCommand__DistanceAssignment_3 ) ) ;
    public final void rule__ForwardCommand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1347:1: ( ( ( rule__ForwardCommand__DistanceAssignment_3 ) ) )
            // InternalPlatoon.g:1348:1: ( ( rule__ForwardCommand__DistanceAssignment_3 ) )
            {
            // InternalPlatoon.g:1348:1: ( ( rule__ForwardCommand__DistanceAssignment_3 ) )
            // InternalPlatoon.g:1349:2: ( rule__ForwardCommand__DistanceAssignment_3 )
            {
             before(grammarAccess.getForwardCommandAccess().getDistanceAssignment_3()); 
            // InternalPlatoon.g:1350:2: ( rule__ForwardCommand__DistanceAssignment_3 )
            // InternalPlatoon.g:1350:3: rule__ForwardCommand__DistanceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForwardCommand__DistanceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForwardCommandAccess().getDistanceAssignment_3()); 

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
    // $ANTLR end "rule__ForwardCommand__Group__3__Impl"


    // $ANTLR start "rule__ForwardCommand__Group__4"
    // InternalPlatoon.g:1358:1: rule__ForwardCommand__Group__4 : rule__ForwardCommand__Group__4__Impl ;
    public final void rule__ForwardCommand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1362:1: ( rule__ForwardCommand__Group__4__Impl )
            // InternalPlatoon.g:1363:2: rule__ForwardCommand__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForwardCommand__Group__4__Impl();

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
    // $ANTLR end "rule__ForwardCommand__Group__4"


    // $ANTLR start "rule__ForwardCommand__Group__4__Impl"
    // InternalPlatoon.g:1369:1: rule__ForwardCommand__Group__4__Impl : ( ')' ) ;
    public final void rule__ForwardCommand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1373:1: ( ( ')' ) )
            // InternalPlatoon.g:1374:1: ( ')' )
            {
            // InternalPlatoon.g:1374:1: ( ')' )
            // InternalPlatoon.g:1375:2: ')'
            {
             before(grammarAccess.getForwardCommandAccess().getRightParenthesisKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getForwardCommandAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__ForwardCommand__Group__4__Impl"


    // $ANTLR start "rule__TurnCommand__Group__0"
    // InternalPlatoon.g:1385:1: rule__TurnCommand__Group__0 : rule__TurnCommand__Group__0__Impl rule__TurnCommand__Group__1 ;
    public final void rule__TurnCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1389:1: ( rule__TurnCommand__Group__0__Impl rule__TurnCommand__Group__1 )
            // InternalPlatoon.g:1390:2: rule__TurnCommand__Group__0__Impl rule__TurnCommand__Group__1
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
    // InternalPlatoon.g:1397:1: rule__TurnCommand__Group__0__Impl : ( () ) ;
    public final void rule__TurnCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1401:1: ( ( () ) )
            // InternalPlatoon.g:1402:1: ( () )
            {
            // InternalPlatoon.g:1402:1: ( () )
            // InternalPlatoon.g:1403:2: ()
            {
             before(grammarAccess.getTurnCommandAccess().getTurnCommandAction_0()); 
            // InternalPlatoon.g:1404:2: ()
            // InternalPlatoon.g:1404:3: 
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
    // InternalPlatoon.g:1412:1: rule__TurnCommand__Group__1 : rule__TurnCommand__Group__1__Impl rule__TurnCommand__Group__2 ;
    public final void rule__TurnCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1416:1: ( rule__TurnCommand__Group__1__Impl rule__TurnCommand__Group__2 )
            // InternalPlatoon.g:1417:2: rule__TurnCommand__Group__1__Impl rule__TurnCommand__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalPlatoon.g:1424:1: rule__TurnCommand__Group__1__Impl : ( 'turn' ) ;
    public final void rule__TurnCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1428:1: ( ( 'turn' ) )
            // InternalPlatoon.g:1429:1: ( 'turn' )
            {
            // InternalPlatoon.g:1429:1: ( 'turn' )
            // InternalPlatoon.g:1430:2: 'turn'
            {
             before(grammarAccess.getTurnCommandAccess().getTurnKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalPlatoon.g:1439:1: rule__TurnCommand__Group__2 : rule__TurnCommand__Group__2__Impl ;
    public final void rule__TurnCommand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1443:1: ( rule__TurnCommand__Group__2__Impl )
            // InternalPlatoon.g:1444:2: rule__TurnCommand__Group__2__Impl
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
    // InternalPlatoon.g:1450:1: rule__TurnCommand__Group__2__Impl : ( ( rule__TurnCommand__DirectionAssignment_2 ) ) ;
    public final void rule__TurnCommand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1454:1: ( ( ( rule__TurnCommand__DirectionAssignment_2 ) ) )
            // InternalPlatoon.g:1455:1: ( ( rule__TurnCommand__DirectionAssignment_2 ) )
            {
            // InternalPlatoon.g:1455:1: ( ( rule__TurnCommand__DirectionAssignment_2 ) )
            // InternalPlatoon.g:1456:2: ( rule__TurnCommand__DirectionAssignment_2 )
            {
             before(grammarAccess.getTurnCommandAccess().getDirectionAssignment_2()); 
            // InternalPlatoon.g:1457:2: ( rule__TurnCommand__DirectionAssignment_2 )
            // InternalPlatoon.g:1457:3: rule__TurnCommand__DirectionAssignment_2
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


    // $ANTLR start "rule__HeadwayConstraint__Group__0"
    // InternalPlatoon.g:1466:1: rule__HeadwayConstraint__Group__0 : rule__HeadwayConstraint__Group__0__Impl rule__HeadwayConstraint__Group__1 ;
    public final void rule__HeadwayConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1470:1: ( rule__HeadwayConstraint__Group__0__Impl rule__HeadwayConstraint__Group__1 )
            // InternalPlatoon.g:1471:2: rule__HeadwayConstraint__Group__0__Impl rule__HeadwayConstraint__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPlatoon.g:1478:1: rule__HeadwayConstraint__Group__0__Impl : ( () ) ;
    public final void rule__HeadwayConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1482:1: ( ( () ) )
            // InternalPlatoon.g:1483:1: ( () )
            {
            // InternalPlatoon.g:1483:1: ( () )
            // InternalPlatoon.g:1484:2: ()
            {
             before(grammarAccess.getHeadwayConstraintAccess().getHeadwayConstraintAction_0()); 
            // InternalPlatoon.g:1485:2: ()
            // InternalPlatoon.g:1485:3: 
            {
            }

             after(grammarAccess.getHeadwayConstraintAccess().getHeadwayConstraintAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HeadwayConstraint__Group__0__Impl"


    // $ANTLR start "rule__HeadwayConstraint__Group__1"
    // InternalPlatoon.g:1493:1: rule__HeadwayConstraint__Group__1 : rule__HeadwayConstraint__Group__1__Impl rule__HeadwayConstraint__Group__2 ;
    public final void rule__HeadwayConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1497:1: ( rule__HeadwayConstraint__Group__1__Impl rule__HeadwayConstraint__Group__2 )
            // InternalPlatoon.g:1498:2: rule__HeadwayConstraint__Group__1__Impl rule__HeadwayConstraint__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalPlatoon.g:1505:1: rule__HeadwayConstraint__Group__1__Impl : ( ( rule__HeadwayConstraint__MinAssignment_1 ) ) ;
    public final void rule__HeadwayConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1509:1: ( ( ( rule__HeadwayConstraint__MinAssignment_1 ) ) )
            // InternalPlatoon.g:1510:1: ( ( rule__HeadwayConstraint__MinAssignment_1 ) )
            {
            // InternalPlatoon.g:1510:1: ( ( rule__HeadwayConstraint__MinAssignment_1 ) )
            // InternalPlatoon.g:1511:2: ( rule__HeadwayConstraint__MinAssignment_1 )
            {
             before(grammarAccess.getHeadwayConstraintAccess().getMinAssignment_1()); 
            // InternalPlatoon.g:1512:2: ( rule__HeadwayConstraint__MinAssignment_1 )
            // InternalPlatoon.g:1512:3: rule__HeadwayConstraint__MinAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__HeadwayConstraint__MinAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHeadwayConstraintAccess().getMinAssignment_1()); 

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
    // InternalPlatoon.g:1520:1: rule__HeadwayConstraint__Group__2 : rule__HeadwayConstraint__Group__2__Impl rule__HeadwayConstraint__Group__3 ;
    public final void rule__HeadwayConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1524:1: ( rule__HeadwayConstraint__Group__2__Impl rule__HeadwayConstraint__Group__3 )
            // InternalPlatoon.g:1525:2: rule__HeadwayConstraint__Group__2__Impl rule__HeadwayConstraint__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalPlatoon.g:1532:1: rule__HeadwayConstraint__Group__2__Impl : ( '<=' ) ;
    public final void rule__HeadwayConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1536:1: ( ( '<=' ) )
            // InternalPlatoon.g:1537:1: ( '<=' )
            {
            // InternalPlatoon.g:1537:1: ( '<=' )
            // InternalPlatoon.g:1538:2: '<='
            {
             before(grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_2()); 

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
    // InternalPlatoon.g:1547:1: rule__HeadwayConstraint__Group__3 : rule__HeadwayConstraint__Group__3__Impl rule__HeadwayConstraint__Group__4 ;
    public final void rule__HeadwayConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1551:1: ( rule__HeadwayConstraint__Group__3__Impl rule__HeadwayConstraint__Group__4 )
            // InternalPlatoon.g:1552:2: rule__HeadwayConstraint__Group__3__Impl rule__HeadwayConstraint__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalPlatoon.g:1559:1: rule__HeadwayConstraint__Group__3__Impl : ( 'headway' ) ;
    public final void rule__HeadwayConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1563:1: ( ( 'headway' ) )
            // InternalPlatoon.g:1564:1: ( 'headway' )
            {
            // InternalPlatoon.g:1564:1: ( 'headway' )
            // InternalPlatoon.g:1565:2: 'headway'
            {
             before(grammarAccess.getHeadwayConstraintAccess().getHeadwayKeyword_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getHeadwayConstraintAccess().getHeadwayKeyword_3()); 

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
    // InternalPlatoon.g:1574:1: rule__HeadwayConstraint__Group__4 : rule__HeadwayConstraint__Group__4__Impl rule__HeadwayConstraint__Group__5 ;
    public final void rule__HeadwayConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1578:1: ( rule__HeadwayConstraint__Group__4__Impl rule__HeadwayConstraint__Group__5 )
            // InternalPlatoon.g:1579:2: rule__HeadwayConstraint__Group__4__Impl rule__HeadwayConstraint__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__HeadwayConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HeadwayConstraint__Group__5();

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
    // InternalPlatoon.g:1586:1: rule__HeadwayConstraint__Group__4__Impl : ( '<=' ) ;
    public final void rule__HeadwayConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1590:1: ( ( '<=' ) )
            // InternalPlatoon.g:1591:1: ( '<=' )
            {
            // InternalPlatoon.g:1591:1: ( '<=' )
            // InternalPlatoon.g:1592:2: '<='
            {
             before(grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_4()); 

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


    // $ANTLR start "rule__HeadwayConstraint__Group__5"
    // InternalPlatoon.g:1601:1: rule__HeadwayConstraint__Group__5 : rule__HeadwayConstraint__Group__5__Impl ;
    public final void rule__HeadwayConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1605:1: ( rule__HeadwayConstraint__Group__5__Impl )
            // InternalPlatoon.g:1606:2: rule__HeadwayConstraint__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HeadwayConstraint__Group__5__Impl();

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
    // $ANTLR end "rule__HeadwayConstraint__Group__5"


    // $ANTLR start "rule__HeadwayConstraint__Group__5__Impl"
    // InternalPlatoon.g:1612:1: rule__HeadwayConstraint__Group__5__Impl : ( ( rule__HeadwayConstraint__MaxAssignment_5 ) ) ;
    public final void rule__HeadwayConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1616:1: ( ( ( rule__HeadwayConstraint__MaxAssignment_5 ) ) )
            // InternalPlatoon.g:1617:1: ( ( rule__HeadwayConstraint__MaxAssignment_5 ) )
            {
            // InternalPlatoon.g:1617:1: ( ( rule__HeadwayConstraint__MaxAssignment_5 ) )
            // InternalPlatoon.g:1618:2: ( rule__HeadwayConstraint__MaxAssignment_5 )
            {
             before(grammarAccess.getHeadwayConstraintAccess().getMaxAssignment_5()); 
            // InternalPlatoon.g:1619:2: ( rule__HeadwayConstraint__MaxAssignment_5 )
            // InternalPlatoon.g:1619:3: rule__HeadwayConstraint__MaxAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__HeadwayConstraint__MaxAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getHeadwayConstraintAccess().getMaxAssignment_5()); 

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
    // $ANTLR end "rule__HeadwayConstraint__Group__5__Impl"


    // $ANTLR start "rule__World__PlatoonAssignment_1"
    // InternalPlatoon.g:1628:1: rule__World__PlatoonAssignment_1 : ( rulePlatoon ) ;
    public final void rule__World__PlatoonAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1632:1: ( ( rulePlatoon ) )
            // InternalPlatoon.g:1633:2: ( rulePlatoon )
            {
            // InternalPlatoon.g:1633:2: ( rulePlatoon )
            // InternalPlatoon.g:1634:3: rulePlatoon
            {
             before(grammarAccess.getWorldAccess().getPlatoonPlatoonParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlatoon();

            state._fsp--;

             after(grammarAccess.getWorldAccess().getPlatoonPlatoonParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__World__PlatoonAssignment_1"


    // $ANTLR start "rule__World__RouteAssignment_2"
    // InternalPlatoon.g:1643:1: rule__World__RouteAssignment_2 : ( ruleRoute ) ;
    public final void rule__World__RouteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1647:1: ( ( ruleRoute ) )
            // InternalPlatoon.g:1648:2: ( ruleRoute )
            {
            // InternalPlatoon.g:1648:2: ( ruleRoute )
            // InternalPlatoon.g:1649:3: ruleRoute
            {
             before(grammarAccess.getWorldAccess().getRouteRouteParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getWorldAccess().getRouteRouteParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__World__RouteAssignment_2"


    // $ANTLR start "rule__World__ConstraintsAssignment_3"
    // InternalPlatoon.g:1658:1: rule__World__ConstraintsAssignment_3 : ( ruleConstraints ) ;
    public final void rule__World__ConstraintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1662:1: ( ( ruleConstraints ) )
            // InternalPlatoon.g:1663:2: ( ruleConstraints )
            {
            // InternalPlatoon.g:1663:2: ( ruleConstraints )
            // InternalPlatoon.g:1664:3: ruleConstraints
            {
             before(grammarAccess.getWorldAccess().getConstraintsConstraintsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraints();

            state._fsp--;

             after(grammarAccess.getWorldAccess().getConstraintsConstraintsParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__World__ConstraintsAssignment_3"


    // $ANTLR start "rule__Platoon__LVAssignment_3"
    // InternalPlatoon.g:1673:1: rule__Platoon__LVAssignment_3 : ( ruleLeadingVehicle ) ;
    public final void rule__Platoon__LVAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1677:1: ( ( ruleLeadingVehicle ) )
            // InternalPlatoon.g:1678:2: ( ruleLeadingVehicle )
            {
            // InternalPlatoon.g:1678:2: ( ruleLeadingVehicle )
            // InternalPlatoon.g:1679:3: ruleLeadingVehicle
            {
             before(grammarAccess.getPlatoonAccess().getLVLeadingVehicleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLeadingVehicle();

            state._fsp--;

             after(grammarAccess.getPlatoonAccess().getLVLeadingVehicleParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Platoon__LVAssignment_3"


    // $ANTLR start "rule__Platoon__FVAssignment_4"
    // InternalPlatoon.g:1688:1: rule__Platoon__FVAssignment_4 : ( ruleFollowVehicle ) ;
    public final void rule__Platoon__FVAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1692:1: ( ( ruleFollowVehicle ) )
            // InternalPlatoon.g:1693:2: ( ruleFollowVehicle )
            {
            // InternalPlatoon.g:1693:2: ( ruleFollowVehicle )
            // InternalPlatoon.g:1694:3: ruleFollowVehicle
            {
             before(grammarAccess.getPlatoonAccess().getFVFollowVehicleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFollowVehicle();

            state._fsp--;

             after(grammarAccess.getPlatoonAccess().getFVFollowVehicleParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Platoon__FVAssignment_4"


    // $ANTLR start "rule__Route__NameAssignment_2"
    // InternalPlatoon.g:1703:1: rule__Route__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Route__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1707:1: ( ( ruleEString ) )
            // InternalPlatoon.g:1708:2: ( ruleEString )
            {
            // InternalPlatoon.g:1708:2: ( ruleEString )
            // InternalPlatoon.g:1709:3: ruleEString
            {
             before(grammarAccess.getRouteAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Route__NameAssignment_2"


    // $ANTLR start "rule__Route__CommandsAssignment_4"
    // InternalPlatoon.g:1718:1: rule__Route__CommandsAssignment_4 : ( ruleCommand ) ;
    public final void rule__Route__CommandsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1722:1: ( ( ruleCommand ) )
            // InternalPlatoon.g:1723:2: ( ruleCommand )
            {
            // InternalPlatoon.g:1723:2: ( ruleCommand )
            // InternalPlatoon.g:1724:3: ruleCommand
            {
             before(grammarAccess.getRouteAccess().getCommandsCommandParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getCommandsCommandParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Route__CommandsAssignment_4"


    // $ANTLR start "rule__Route__CommandsAssignment_5"
    // InternalPlatoon.g:1733:1: rule__Route__CommandsAssignment_5 : ( ruleCommand ) ;
    public final void rule__Route__CommandsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1737:1: ( ( ruleCommand ) )
            // InternalPlatoon.g:1738:2: ( ruleCommand )
            {
            // InternalPlatoon.g:1738:2: ( ruleCommand )
            // InternalPlatoon.g:1739:3: ruleCommand
            {
             before(grammarAccess.getRouteAccess().getCommandsCommandParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCommand();

            state._fsp--;

             after(grammarAccess.getRouteAccess().getCommandsCommandParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Route__CommandsAssignment_5"


    // $ANTLR start "rule__Constraints__ConstraintsAssignment_2"
    // InternalPlatoon.g:1748:1: rule__Constraints__ConstraintsAssignment_2 : ( ruleConstraint ) ;
    public final void rule__Constraints__ConstraintsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1752:1: ( ( ruleConstraint ) )
            // InternalPlatoon.g:1753:2: ( ruleConstraint )
            {
            // InternalPlatoon.g:1753:2: ( ruleConstraint )
            // InternalPlatoon.g:1754:3: ruleConstraint
            {
             before(grammarAccess.getConstraintsAccess().getConstraintsConstraintParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintsAccess().getConstraintsConstraintParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Constraints__ConstraintsAssignment_2"


    // $ANTLR start "rule__Constraints__ConstraintsAssignment_3"
    // InternalPlatoon.g:1763:1: rule__Constraints__ConstraintsAssignment_3 : ( ruleConstraint ) ;
    public final void rule__Constraints__ConstraintsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1767:1: ( ( ruleConstraint ) )
            // InternalPlatoon.g:1768:2: ( ruleConstraint )
            {
            // InternalPlatoon.g:1768:2: ( ruleConstraint )
            // InternalPlatoon.g:1769:3: ruleConstraint
            {
             before(grammarAccess.getConstraintsAccess().getConstraintsConstraintParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConstraint();

            state._fsp--;

             after(grammarAccess.getConstraintsAccess().getConstraintsConstraintParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Constraints__ConstraintsAssignment_3"


    // $ANTLR start "rule__LeadingVehicle__NameAssignment_2"
    // InternalPlatoon.g:1778:1: rule__LeadingVehicle__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LeadingVehicle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1782:1: ( ( ruleEString ) )
            // InternalPlatoon.g:1783:2: ( ruleEString )
            {
            // InternalPlatoon.g:1783:2: ( ruleEString )
            // InternalPlatoon.g:1784:3: ruleEString
            {
             before(grammarAccess.getLeadingVehicleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeadingVehicleAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LeadingVehicle__NameAssignment_2"


    // $ANTLR start "rule__LeadingVehicle__RouteAssignment_4"
    // InternalPlatoon.g:1793:1: rule__LeadingVehicle__RouteAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__LeadingVehicle__RouteAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1797:1: ( ( ( ruleEString ) ) )
            // InternalPlatoon.g:1798:2: ( ( ruleEString ) )
            {
            // InternalPlatoon.g:1798:2: ( ( ruleEString ) )
            // InternalPlatoon.g:1799:3: ( ruleEString )
            {
             before(grammarAccess.getLeadingVehicleAccess().getRouteRouteCrossReference_4_0()); 
            // InternalPlatoon.g:1800:3: ( ruleEString )
            // InternalPlatoon.g:1801:4: ruleEString
            {
             before(grammarAccess.getLeadingVehicleAccess().getRouteRouteEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeadingVehicleAccess().getRouteRouteEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getLeadingVehicleAccess().getRouteRouteCrossReference_4_0()); 

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
    // $ANTLR end "rule__LeadingVehicle__RouteAssignment_4"


    // $ANTLR start "rule__FollowVehicle__NameAssignment_2"
    // InternalPlatoon.g:1812:1: rule__FollowVehicle__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__FollowVehicle__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1816:1: ( ( ruleEString ) )
            // InternalPlatoon.g:1817:2: ( ruleEString )
            {
            // InternalPlatoon.g:1817:2: ( ruleEString )
            // InternalPlatoon.g:1818:3: ruleEString
            {
             before(grammarAccess.getFollowVehicleAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFollowVehicleAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FollowVehicle__NameAssignment_2"


    // $ANTLR start "rule__FollowVehicle__FollowsAssignment_5"
    // InternalPlatoon.g:1827:1: rule__FollowVehicle__FollowsAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__FollowVehicle__FollowsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1831:1: ( ( ( ruleEString ) ) )
            // InternalPlatoon.g:1832:2: ( ( ruleEString ) )
            {
            // InternalPlatoon.g:1832:2: ( ( ruleEString ) )
            // InternalPlatoon.g:1833:3: ( ruleEString )
            {
             before(grammarAccess.getFollowVehicleAccess().getFollowsVehicleCrossReference_5_0()); 
            // InternalPlatoon.g:1834:3: ( ruleEString )
            // InternalPlatoon.g:1835:4: ruleEString
            {
             before(grammarAccess.getFollowVehicleAccess().getFollowsVehicleEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFollowVehicleAccess().getFollowsVehicleEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getFollowVehicleAccess().getFollowsVehicleCrossReference_5_0()); 

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
    // $ANTLR end "rule__FollowVehicle__FollowsAssignment_5"


    // $ANTLR start "rule__ForwardCommand__DistanceAssignment_3"
    // InternalPlatoon.g:1846:1: rule__ForwardCommand__DistanceAssignment_3 : ( RULE_INT ) ;
    public final void rule__ForwardCommand__DistanceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1850:1: ( ( RULE_INT ) )
            // InternalPlatoon.g:1851:2: ( RULE_INT )
            {
            // InternalPlatoon.g:1851:2: ( RULE_INT )
            // InternalPlatoon.g:1852:3: RULE_INT
            {
             before(grammarAccess.getForwardCommandAccess().getDistanceINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getForwardCommandAccess().getDistanceINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ForwardCommand__DistanceAssignment_3"


    // $ANTLR start "rule__TurnCommand__DirectionAssignment_2"
    // InternalPlatoon.g:1861:1: rule__TurnCommand__DirectionAssignment_2 : ( ruleDirection ) ;
    public final void rule__TurnCommand__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1865:1: ( ( ruleDirection ) )
            // InternalPlatoon.g:1866:2: ( ruleDirection )
            {
            // InternalPlatoon.g:1866:2: ( ruleDirection )
            // InternalPlatoon.g:1867:3: ruleDirection
            {
             before(grammarAccess.getTurnCommandAccess().getDirectionDirectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getTurnCommandAccess().getDirectionDirectionParserRuleCall_2_0()); 

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


    // $ANTLR start "rule__HeadwayConstraint__MinAssignment_1"
    // InternalPlatoon.g:1876:1: rule__HeadwayConstraint__MinAssignment_1 : ( RULE_INT ) ;
    public final void rule__HeadwayConstraint__MinAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1880:1: ( ( RULE_INT ) )
            // InternalPlatoon.g:1881:2: ( RULE_INT )
            {
            // InternalPlatoon.g:1881:2: ( RULE_INT )
            // InternalPlatoon.g:1882:3: RULE_INT
            {
             before(grammarAccess.getHeadwayConstraintAccess().getMinINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHeadwayConstraintAccess().getMinINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__HeadwayConstraint__MinAssignment_1"


    // $ANTLR start "rule__HeadwayConstraint__MaxAssignment_5"
    // InternalPlatoon.g:1891:1: rule__HeadwayConstraint__MaxAssignment_5 : ( RULE_INT ) ;
    public final void rule__HeadwayConstraint__MaxAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPlatoon.g:1895:1: ( ( RULE_INT ) )
            // InternalPlatoon.g:1896:2: ( RULE_INT )
            {
            // InternalPlatoon.g:1896:2: ( RULE_INT )
            // InternalPlatoon.g:1897:3: RULE_INT
            {
             before(grammarAccess.getHeadwayConstraintAccess().getMaxINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getHeadwayConstraintAccess().getMaxINTTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__HeadwayConstraint__MaxAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});

}