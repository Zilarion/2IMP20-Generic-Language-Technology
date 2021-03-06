/*
 * generated by Xtext 2.10.0
 */
grammar InternalPlatoon;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package nl.tue.glt.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleWorld
entryRuleWorld
:
{ before(grammarAccess.getWorldRule()); }
	 ruleWorld
{ after(grammarAccess.getWorldRule()); } 
	 EOF 
;

// Rule World
ruleWorld 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getWorldAccess().getGroup()); }
		(rule__World__Group__0)
		{ after(grammarAccess.getWorldAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCommand
entryRuleCommand
:
{ before(grammarAccess.getCommandRule()); }
	 ruleCommand
{ after(grammarAccess.getCommandRule()); } 
	 EOF 
;

// Rule Command
ruleCommand 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCommandAccess().getAlternatives()); }
		(rule__Command__Alternatives)
		{ after(grammarAccess.getCommandAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConstraint
entryRuleConstraint
:
{ before(grammarAccess.getConstraintRule()); }
	 ruleConstraint
{ after(grammarAccess.getConstraintRule()); } 
	 EOF 
;

// Rule Constraint
ruleConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConstraintAccess().getHeadwayConstraintParserRuleCall()); }
		ruleHeadwayConstraint
		{ after(grammarAccess.getConstraintAccess().getHeadwayConstraintParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlatoon
entryRulePlatoon
:
{ before(grammarAccess.getPlatoonRule()); }
	 rulePlatoon
{ after(grammarAccess.getPlatoonRule()); } 
	 EOF 
;

// Rule Platoon
rulePlatoon 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlatoonAccess().getGroup()); }
		(rule__Platoon__Group__0)
		{ after(grammarAccess.getPlatoonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRoute
entryRuleRoute
:
{ before(grammarAccess.getRouteRule()); }
	 ruleRoute
{ after(grammarAccess.getRouteRule()); } 
	 EOF 
;

// Rule Route
ruleRoute 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRouteAccess().getGroup()); }
		(rule__Route__Group__0)
		{ after(grammarAccess.getRouteAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConstraints
entryRuleConstraints
:
{ before(grammarAccess.getConstraintsRule()); }
	 ruleConstraints
{ after(grammarAccess.getConstraintsRule()); } 
	 EOF 
;

// Rule Constraints
ruleConstraints 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConstraintsAccess().getGroup()); }
		(rule__Constraints__Group__0)
		{ after(grammarAccess.getConstraintsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLeadingVehicle
entryRuleLeadingVehicle
:
{ before(grammarAccess.getLeadingVehicleRule()); }
	 ruleLeadingVehicle
{ after(grammarAccess.getLeadingVehicleRule()); } 
	 EOF 
;

// Rule LeadingVehicle
ruleLeadingVehicle 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLeadingVehicleAccess().getGroup()); }
		(rule__LeadingVehicle__Group__0)
		{ after(grammarAccess.getLeadingVehicleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFollowVehicle
entryRuleFollowVehicle
:
{ before(grammarAccess.getFollowVehicleRule()); }
	 ruleFollowVehicle
{ after(grammarAccess.getFollowVehicleRule()); } 
	 EOF 
;

// Rule FollowVehicle
ruleFollowVehicle 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFollowVehicleAccess().getGroup()); }
		(rule__FollowVehicle__Group__0)
		{ after(grammarAccess.getFollowVehicleAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleForwardCommand
entryRuleForwardCommand
:
{ before(grammarAccess.getForwardCommandRule()); }
	 ruleForwardCommand
{ after(grammarAccess.getForwardCommandRule()); } 
	 EOF 
;

// Rule ForwardCommand
ruleForwardCommand 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getForwardCommandAccess().getGroup()); }
		(rule__ForwardCommand__Group__0)
		{ after(grammarAccess.getForwardCommandAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTurnCommand
entryRuleTurnCommand
:
{ before(grammarAccess.getTurnCommandRule()); }
	 ruleTurnCommand
{ after(grammarAccess.getTurnCommandRule()); } 
	 EOF 
;

// Rule TurnCommand
ruleTurnCommand 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTurnCommandAccess().getGroup()); }
		(rule__TurnCommand__Group__0)
		{ after(grammarAccess.getTurnCommandAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDirection
entryRuleDirection
:
{ before(grammarAccess.getDirectionRule()); }
	 ruleDirection
{ after(grammarAccess.getDirectionRule()); } 
	 EOF 
;

// Rule Direction
ruleDirection 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDirectionAccess().getAlternatives()); }
		(rule__Direction__Alternatives)
		{ after(grammarAccess.getDirectionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHeadwayConstraint
entryRuleHeadwayConstraint
:
{ before(grammarAccess.getHeadwayConstraintRule()); }
	 ruleHeadwayConstraint
{ after(grammarAccess.getHeadwayConstraintRule()); } 
	 EOF 
;

// Rule HeadwayConstraint
ruleHeadwayConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHeadwayConstraintAccess().getGroup()); }
		(rule__HeadwayConstraint__Group__0)
		{ after(grammarAccess.getHeadwayConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Command__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCommandAccess().getForwardCommandParserRuleCall_0()); }
		ruleForwardCommand
		{ after(grammarAccess.getCommandAccess().getForwardCommandParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getCommandAccess().getTurnCommandParserRuleCall_1()); }
		ruleTurnCommand
		{ after(grammarAccess.getCommandAccess().getTurnCommandParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Direction__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDirectionAccess().getLeftKeyword_0()); }
		'Left'
		{ after(grammarAccess.getDirectionAccess().getLeftKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getDirectionAccess().getRightKeyword_1()); }
		'Right'
		{ after(grammarAccess.getDirectionAccess().getRightKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__World__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__World__Group__0__Impl
	rule__World__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__World__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorldAccess().getWorldAction_0()); }
	()
	{ after(grammarAccess.getWorldAccess().getWorldAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__World__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__World__Group__1__Impl
	rule__World__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__World__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorldAccess().getPlatoonAssignment_1()); }
	(rule__World__PlatoonAssignment_1)
	{ after(grammarAccess.getWorldAccess().getPlatoonAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__World__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__World__Group__2__Impl
	rule__World__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__World__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorldAccess().getRouteAssignment_2()); }
	(rule__World__RouteAssignment_2)
	{ after(grammarAccess.getWorldAccess().getRouteAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__World__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__World__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__World__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getWorldAccess().getConstraintsAssignment_3()); }
	(rule__World__ConstraintsAssignment_3)
	{ after(grammarAccess.getWorldAccess().getConstraintsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Platoon__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Platoon__Group__0__Impl
	rule__Platoon__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Platoon__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlatoonAccess().getPlatoonAction_0()); }
	()
	{ after(grammarAccess.getPlatoonAccess().getPlatoonAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Platoon__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Platoon__Group__1__Impl
	rule__Platoon__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Platoon__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlatoonAccess().getPlatoonKeyword_1()); }
	'platoon'
	{ after(grammarAccess.getPlatoonAccess().getPlatoonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Platoon__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Platoon__Group__2__Impl
	rule__Platoon__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Platoon__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlatoonAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getPlatoonAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Platoon__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Platoon__Group__3__Impl
	rule__Platoon__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Platoon__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlatoonAccess().getLVAssignment_3()); }
	(rule__Platoon__LVAssignment_3)
	{ after(grammarAccess.getPlatoonAccess().getLVAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Platoon__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Platoon__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Platoon__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlatoonAccess().getFVAssignment_4()); }
	(rule__Platoon__FVAssignment_4)?
	{ after(grammarAccess.getPlatoonAccess().getFVAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Route__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Route__Group__0__Impl
	rule__Route__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Route__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRouteAccess().getRouteAction_0()); }
	()
	{ after(grammarAccess.getRouteAccess().getRouteAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Route__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Route__Group__1__Impl
	rule__Route__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Route__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRouteAccess().getRouteKeyword_1()); }
	'route'
	{ after(grammarAccess.getRouteAccess().getRouteKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Route__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Route__Group__2__Impl
	rule__Route__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Route__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRouteAccess().getNameAssignment_2()); }
	(rule__Route__NameAssignment_2)
	{ after(grammarAccess.getRouteAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Route__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Route__Group__3__Impl
	rule__Route__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Route__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRouteAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getRouteAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Route__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Route__Group__4__Impl
	rule__Route__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Route__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRouteAccess().getCommandsAssignment_4()); }
	(rule__Route__CommandsAssignment_4)
	{ after(grammarAccess.getRouteAccess().getCommandsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Route__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Route__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Route__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRouteAccess().getCommandsAssignment_5()); }
	(rule__Route__CommandsAssignment_5)*
	{ after(grammarAccess.getRouteAccess().getCommandsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Constraints__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constraints__Group__0__Impl
	rule__Constraints__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraints__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstraintsAccess().getConstraintsKeyword_0()); }
	'constraints'
	{ after(grammarAccess.getConstraintsAccess().getConstraintsKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraints__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constraints__Group__1__Impl
	rule__Constraints__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraints__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstraintsAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getConstraintsAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraints__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constraints__Group__2__Impl
	rule__Constraints__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraints__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstraintsAccess().getConstraintsAssignment_2()); }
	(rule__Constraints__ConstraintsAssignment_2)
	{ after(grammarAccess.getConstraintsAccess().getConstraintsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraints__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Constraints__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraints__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConstraintsAccess().getConstraintsAssignment_3()); }
	(rule__Constraints__ConstraintsAssignment_3)*
	{ after(grammarAccess.getConstraintsAccess().getConstraintsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LeadingVehicle__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LeadingVehicle__Group__0__Impl
	rule__LeadingVehicle__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LeadingVehicle__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeadingVehicleAccess().getLeadingVehicleAction_0()); }
	()
	{ after(grammarAccess.getLeadingVehicleAccess().getLeadingVehicleAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LeadingVehicle__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LeadingVehicle__Group__1__Impl
	rule__LeadingVehicle__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LeadingVehicle__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeadingVehicleAccess().getLVKeyword_1()); }
	'LV'
	{ after(grammarAccess.getLeadingVehicleAccess().getLVKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LeadingVehicle__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LeadingVehicle__Group__2__Impl
	rule__LeadingVehicle__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__LeadingVehicle__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeadingVehicleAccess().getNameAssignment_2()); }
	(rule__LeadingVehicle__NameAssignment_2)
	{ after(grammarAccess.getLeadingVehicleAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LeadingVehicle__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LeadingVehicle__Group__3__Impl
	rule__LeadingVehicle__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__LeadingVehicle__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeadingVehicleAccess().getRouteKeyword_3()); }
	'route'
	{ after(grammarAccess.getLeadingVehicleAccess().getRouteKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LeadingVehicle__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LeadingVehicle__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LeadingVehicle__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLeadingVehicleAccess().getRouteAssignment_4()); }
	(rule__LeadingVehicle__RouteAssignment_4)
	{ after(grammarAccess.getLeadingVehicleAccess().getRouteAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FollowVehicle__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FollowVehicle__Group__0__Impl
	rule__FollowVehicle__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowVehicle__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFollowVehicleAccess().getFollowVehicleAction_0()); }
	()
	{ after(grammarAccess.getFollowVehicleAccess().getFollowVehicleAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowVehicle__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FollowVehicle__Group__1__Impl
	rule__FollowVehicle__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowVehicle__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFollowVehicleAccess().getFVKeyword_1()); }
	'FV'
	{ after(grammarAccess.getFollowVehicleAccess().getFVKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowVehicle__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FollowVehicle__Group__2__Impl
	rule__FollowVehicle__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowVehicle__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFollowVehicleAccess().getNameAssignment_2()); }
	(rule__FollowVehicle__NameAssignment_2)
	{ after(grammarAccess.getFollowVehicleAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowVehicle__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FollowVehicle__Group__3__Impl
	rule__FollowVehicle__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowVehicle__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFollowVehicleAccess().getFrontKeyword_3()); }
	'front'
	{ after(grammarAccess.getFollowVehicleAccess().getFrontKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowVehicle__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FollowVehicle__Group__4__Impl
	rule__FollowVehicle__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowVehicle__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFollowVehicleAccess().getRunnerKeyword_4()); }
	'runner'
	{ after(grammarAccess.getFollowVehicleAccess().getRunnerKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowVehicle__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FollowVehicle__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowVehicle__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFollowVehicleAccess().getFollowsAssignment_5()); }
	(rule__FollowVehicle__FollowsAssignment_5)
	{ after(grammarAccess.getFollowVehicleAccess().getFollowsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ForwardCommand__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForwardCommand__Group__0__Impl
	rule__ForwardCommand__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ForwardCommand__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForwardCommandAccess().getForwardCommandAction_0()); }
	()
	{ after(grammarAccess.getForwardCommandAccess().getForwardCommandAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForwardCommand__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForwardCommand__Group__1__Impl
	rule__ForwardCommand__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ForwardCommand__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForwardCommandAccess().getForwardKeyword_1()); }
	'forward'
	{ after(grammarAccess.getForwardCommandAccess().getForwardKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForwardCommand__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForwardCommand__Group__2__Impl
	rule__ForwardCommand__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ForwardCommand__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForwardCommandAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getForwardCommandAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForwardCommand__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForwardCommand__Group__3__Impl
	rule__ForwardCommand__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ForwardCommand__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForwardCommandAccess().getDistanceAssignment_3()); }
	(rule__ForwardCommand__DistanceAssignment_3)
	{ after(grammarAccess.getForwardCommandAccess().getDistanceAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForwardCommand__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForwardCommand__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ForwardCommand__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForwardCommandAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getForwardCommandAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TurnCommand__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnCommand__Group__0__Impl
	rule__TurnCommand__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnCommand__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnCommandAccess().getTurnCommandAction_0()); }
	()
	{ after(grammarAccess.getTurnCommandAccess().getTurnCommandAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnCommand__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnCommand__Group__1__Impl
	rule__TurnCommand__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnCommand__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnCommandAccess().getTurnKeyword_1()); }
	'turn'
	{ after(grammarAccess.getTurnCommandAccess().getTurnKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnCommand__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TurnCommand__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnCommand__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTurnCommandAccess().getDirectionAssignment_2()); }
	(rule__TurnCommand__DirectionAssignment_2)
	{ after(grammarAccess.getTurnCommandAccess().getDirectionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__HeadwayConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HeadwayConstraint__Group__0__Impl
	rule__HeadwayConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HeadwayConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeadwayConstraintAccess().getHeadwayConstraintAction_0()); }
	()
	{ after(grammarAccess.getHeadwayConstraintAccess().getHeadwayConstraintAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeadwayConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HeadwayConstraint__Group__1__Impl
	rule__HeadwayConstraint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HeadwayConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeadwayConstraintAccess().getMinAssignment_1()); }
	(rule__HeadwayConstraint__MinAssignment_1)
	{ after(grammarAccess.getHeadwayConstraintAccess().getMinAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeadwayConstraint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HeadwayConstraint__Group__2__Impl
	rule__HeadwayConstraint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HeadwayConstraint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_2()); }
	'<='
	{ after(grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeadwayConstraint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HeadwayConstraint__Group__3__Impl
	rule__HeadwayConstraint__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__HeadwayConstraint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeadwayConstraintAccess().getHeadwayKeyword_3()); }
	'headway'
	{ after(grammarAccess.getHeadwayConstraintAccess().getHeadwayKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeadwayConstraint__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HeadwayConstraint__Group__4__Impl
	rule__HeadwayConstraint__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__HeadwayConstraint__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_4()); }
	'<='
	{ after(grammarAccess.getHeadwayConstraintAccess().getLessThanSignEqualsSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeadwayConstraint__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HeadwayConstraint__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HeadwayConstraint__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHeadwayConstraintAccess().getMaxAssignment_5()); }
	(rule__HeadwayConstraint__MaxAssignment_5)
	{ after(grammarAccess.getHeadwayConstraintAccess().getMaxAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__World__PlatoonAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorldAccess().getPlatoonPlatoonParserRuleCall_1_0()); }
		rulePlatoon
		{ after(grammarAccess.getWorldAccess().getPlatoonPlatoonParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__World__RouteAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorldAccess().getRouteRouteParserRuleCall_2_0()); }
		ruleRoute
		{ after(grammarAccess.getWorldAccess().getRouteRouteParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__World__ConstraintsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getWorldAccess().getConstraintsConstraintsParserRuleCall_3_0()); }
		ruleConstraints
		{ after(grammarAccess.getWorldAccess().getConstraintsConstraintsParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Platoon__LVAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlatoonAccess().getLVLeadingVehicleParserRuleCall_3_0()); }
		ruleLeadingVehicle
		{ after(grammarAccess.getPlatoonAccess().getLVLeadingVehicleParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Platoon__FVAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlatoonAccess().getFVFollowVehicleParserRuleCall_4_0()); }
		ruleFollowVehicle
		{ after(grammarAccess.getPlatoonAccess().getFVFollowVehicleParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Route__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRouteAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getRouteAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Route__CommandsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRouteAccess().getCommandsCommandParserRuleCall_4_0()); }
		ruleCommand
		{ after(grammarAccess.getRouteAccess().getCommandsCommandParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Route__CommandsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRouteAccess().getCommandsCommandParserRuleCall_5_0()); }
		ruleCommand
		{ after(grammarAccess.getRouteAccess().getCommandsCommandParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraints__ConstraintsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstraintsAccess().getConstraintsConstraintParserRuleCall_2_0()); }
		ruleConstraint
		{ after(grammarAccess.getConstraintsAccess().getConstraintsConstraintParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Constraints__ConstraintsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConstraintsAccess().getConstraintsConstraintParserRuleCall_3_0()); }
		ruleConstraint
		{ after(grammarAccess.getConstraintsAccess().getConstraintsConstraintParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LeadingVehicle__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLeadingVehicleAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getLeadingVehicleAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LeadingVehicle__RouteAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLeadingVehicleAccess().getRouteRouteCrossReference_4_0()); }
		(
			{ before(grammarAccess.getLeadingVehicleAccess().getRouteRouteEStringParserRuleCall_4_0_1()); }
			ruleEString
			{ after(grammarAccess.getLeadingVehicleAccess().getRouteRouteEStringParserRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getLeadingVehicleAccess().getRouteRouteCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowVehicle__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFollowVehicleAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getFollowVehicleAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FollowVehicle__FollowsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFollowVehicleAccess().getFollowsVehicleCrossReference_5_0()); }
		(
			{ before(grammarAccess.getFollowVehicleAccess().getFollowsVehicleEStringParserRuleCall_5_0_1()); }
			ruleEString
			{ after(grammarAccess.getFollowVehicleAccess().getFollowsVehicleEStringParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getFollowVehicleAccess().getFollowsVehicleCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForwardCommand__DistanceAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForwardCommandAccess().getDistanceINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getForwardCommandAccess().getDistanceINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TurnCommand__DirectionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTurnCommandAccess().getDirectionDirectionParserRuleCall_2_0()); }
		ruleDirection
		{ after(grammarAccess.getTurnCommandAccess().getDirectionDirectionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeadwayConstraint__MinAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHeadwayConstraintAccess().getMinINTTerminalRuleCall_1_0()); }
		RULE_INT
		{ after(grammarAccess.getHeadwayConstraintAccess().getMinINTTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HeadwayConstraint__MaxAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHeadwayConstraintAccess().getMaxINTTerminalRuleCall_5_0()); }
		RULE_INT
		{ after(grammarAccess.getHeadwayConstraintAccess().getMaxINTTerminalRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
