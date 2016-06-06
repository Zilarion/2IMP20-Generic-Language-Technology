/*
 * generated by Xtext 2.10.0
 */
package nl.tue.glt.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import nl.tue.glt.xtext.ide.contentassist.antlr.internal.InternalPlatoonParser;
import nl.tue.glt.xtext.services.PlatoonGrammarAccess;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class PlatoonParser extends AbstractContentAssistParser {

	@Inject
	private PlatoonGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalPlatoonParser createParser() {
		InternalPlatoonParser result = new InternalPlatoonParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getCommandAccess().getAlternatives(), "rule__Command__Alternatives");
					put(grammarAccess.getVehicleAccess().getAlternatives(), "rule__Vehicle__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getDirectionAccess().getAlternatives(), "rule__Direction__Alternatives");
					put(grammarAccess.getWorldAccess().getGroup(), "rule__World__Group__0");
					put(grammarAccess.getPlatoonAccess().getGroup(), "rule__Platoon__Group__0");
					put(grammarAccess.getRouteAccess().getGroup(), "rule__Route__Group__0");
					put(grammarAccess.getConstraintsAccess().getGroup(), "rule__Constraints__Group__0");
					put(grammarAccess.getLeadingVehicleAccess().getGroup(), "rule__LeadingVehicle__Group__0");
					put(grammarAccess.getFollowVehicleAccess().getGroup(), "rule__FollowVehicle__Group__0");
					put(grammarAccess.getForwardCommandAccess().getGroup(), "rule__ForwardCommand__Group__0");
					put(grammarAccess.getTurnCommandAccess().getGroup(), "rule__TurnCommand__Group__0");
					put(grammarAccess.getHeadwayConstraintAccess().getGroup(), "rule__HeadwayConstraint__Group__0");
					put(grammarAccess.getWorldAccess().getPlatoonAssignment_1(), "rule__World__PlatoonAssignment_1");
					put(grammarAccess.getWorldAccess().getRouteAssignment_2(), "rule__World__RouteAssignment_2");
					put(grammarAccess.getWorldAccess().getConstraintsAssignment_3(), "rule__World__ConstraintsAssignment_3");
					put(grammarAccess.getPlatoonAccess().getLVAssignment_3(), "rule__Platoon__LVAssignment_3");
					put(grammarAccess.getPlatoonAccess().getFVAssignment_4(), "rule__Platoon__FVAssignment_4");
					put(grammarAccess.getRouteAccess().getIdAssignment_2(), "rule__Route__IdAssignment_2");
					put(grammarAccess.getRouteAccess().getCommandsAssignment_4(), "rule__Route__CommandsAssignment_4");
					put(grammarAccess.getRouteAccess().getCommandsAssignment_5(), "rule__Route__CommandsAssignment_5");
					put(grammarAccess.getConstraintsAccess().getConstraintsAssignment_2(), "rule__Constraints__ConstraintsAssignment_2");
					put(grammarAccess.getConstraintsAccess().getConstraintsAssignment_3(), "rule__Constraints__ConstraintsAssignment_3");
					put(grammarAccess.getLeadingVehicleAccess().getIdAssignment_2(), "rule__LeadingVehicle__IdAssignment_2");
					put(grammarAccess.getLeadingVehicleAccess().getRouteAssignment_4(), "rule__LeadingVehicle__RouteAssignment_4");
					put(grammarAccess.getFollowVehicleAccess().getIdAssignment_2(), "rule__FollowVehicle__IdAssignment_2");
					put(grammarAccess.getFollowVehicleAccess().getFollowsAssignment_5(), "rule__FollowVehicle__FollowsAssignment_5");
					put(grammarAccess.getForwardCommandAccess().getDistanceAssignment_3(), "rule__ForwardCommand__DistanceAssignment_3");
					put(grammarAccess.getTurnCommandAccess().getDirectionAssignment_2(), "rule__TurnCommand__DirectionAssignment_2");
					put(grammarAccess.getHeadwayConstraintAccess().getMinAssignment_1(), "rule__HeadwayConstraint__MinAssignment_1");
					put(grammarAccess.getHeadwayConstraintAccess().getMaxAssignment_5(), "rule__HeadwayConstraint__MaxAssignment_5");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalPlatoonParser typedParser = (InternalPlatoonParser) parser;
			typedParser.entryRuleWorld();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PlatoonGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PlatoonGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
