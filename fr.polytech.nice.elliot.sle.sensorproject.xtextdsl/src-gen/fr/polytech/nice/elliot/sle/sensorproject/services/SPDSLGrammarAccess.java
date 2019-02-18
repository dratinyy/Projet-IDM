/*
 * generated by Xtext 2.14.0
 */
package fr.polytech.nice.elliot.sle.sensorproject.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class SPDSLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class SystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.polytech.nice.elliot.sle.sensorproject.SPDSL.System");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSystemAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSystemKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cNodesKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cNodesAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cNodesNodeParserRuleCall_3_2_0 = (RuleCall)cNodesAssignment_3_2.eContents().get(0);
		private final Group cGroup_3_3 = (Group)cGroup_3.eContents().get(3);
		private final Keyword cCommaKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Assignment cNodesAssignment_3_3_1 = (Assignment)cGroup_3_3.eContents().get(1);
		private final RuleCall cNodesNodeParserRuleCall_3_3_1_0 = (RuleCall)cNodesAssignment_3_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_4 = (Keyword)cGroup_3.eContents().get(4);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//System:
		//	{System}
		//	'System'
		//	'{' ('nodes' '{' nodes+=Node ("," nodes+=Node)* '}')?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{System} 'System' '{' ('nodes' '{' nodes+=Node ("," nodes+=Node)* '}')? '}'
		public Group getGroup() { return cGroup; }
		
		//{System}
		public Action getSystemAction_0() { return cSystemAction_0; }
		
		//'System'
		public Keyword getSystemKeyword_1() { return cSystemKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('nodes' '{' nodes+=Node ("," nodes+=Node)* '}')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'nodes'
		public Keyword getNodesKeyword_3_0() { return cNodesKeyword_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_1() { return cLeftCurlyBracketKeyword_3_1; }
		
		//nodes+=Node
		public Assignment getNodesAssignment_3_2() { return cNodesAssignment_3_2; }
		
		//Node
		public RuleCall getNodesNodeParserRuleCall_3_2_0() { return cNodesNodeParserRuleCall_3_2_0; }
		
		//("," nodes+=Node)*
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//","
		public Keyword getCommaKeyword_3_3_0() { return cCommaKeyword_3_3_0; }
		
		//nodes+=Node
		public Assignment getNodesAssignment_3_3_1() { return cNodesAssignment_3_3_1; }
		
		//Node
		public RuleCall getNodesNodeParserRuleCall_3_3_1_0() { return cNodesNodeParserRuleCall_3_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_4() { return cRightCurlyBracketKeyword_3_4; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class NodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.polytech.nice.elliot.sle.sensorproject.SPDSL.Node");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNode_ImplParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSensorParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cFilterParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Node:
		//	Node_Impl | Sensor | Filter;
		@Override public ParserRule getRule() { return rule; }
		
		//Node_Impl | Sensor | Filter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Node_Impl
		public RuleCall getNode_ImplParserRuleCall_0() { return cNode_ImplParserRuleCall_0; }
		
		//Sensor
		public RuleCall getSensorParserRuleCall_1() { return cSensorParserRuleCall_1; }
		
		//Filter
		public RuleCall getFilterParserRuleCall_2() { return cFilterParserRuleCall_2; }
	}
	public class Node_ImplElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.polytech.nice.elliot.sle.sensorproject.SPDSL.Node_Impl");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cNodeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cNodeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Node_Impl Node:
		//	{Node}
		//	'Node'
		//	name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{Node} 'Node' name=EString
		public Group getGroup() { return cGroup; }
		
		//{Node}
		public Action getNodeAction_0() { return cNodeAction_0; }
		
		//'Node'
		public Keyword getNodeKeyword_1() { return cNodeKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.polytech.nice.elliot.sle.sensorproject.SPDSL.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class SensorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.polytech.nice.elliot.sle.sensorproject.SPDSL.Sensor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSensorAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cSensorKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Sensor:
		//	{Sensor}
		//	'Sensor'
		//	name=EString;
		@Override public ParserRule getRule() { return rule; }
		
		//{Sensor} 'Sensor' name=EString
		public Group getGroup() { return cGroup; }
		
		//{Sensor}
		public Action getSensorAction_0() { return cSensorAction_0; }
		
		//'Sensor'
		public Keyword getSensorKeyword_1() { return cSensorKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
	}
	public class FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "fr.polytech.nice.elliot.sle.sensorproject.SPDSL.Filter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFilterAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cFilterKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cPreviousNodeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cPreviousNodeAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cPreviousNodeNodeCrossReference_4_1_0 = (CrossReference)cPreviousNodeAssignment_4_1.eContents().get(0);
		private final RuleCall cPreviousNodeNodeEStringParserRuleCall_4_1_0_1 = (RuleCall)cPreviousNodeNodeCrossReference_4_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Filter:
		//	{Filter}
		//	'Filter'
		//	name=EString
		//	'{' ('previousNode' previousNode=[Node|EString])?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Filter} 'Filter' name=EString '{' ('previousNode' previousNode=[Node|EString])? '}'
		public Group getGroup() { return cGroup; }
		
		//{Filter}
		public Action getFilterAction_0() { return cFilterAction_0; }
		
		//'Filter'
		public Keyword getFilterKeyword_1() { return cFilterKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('previousNode' previousNode=[Node|EString])?
		public Group getGroup_4() { return cGroup_4; }
		
		//'previousNode'
		public Keyword getPreviousNodeKeyword_4_0() { return cPreviousNodeKeyword_4_0; }
		
		//previousNode=[Node|EString]
		public Assignment getPreviousNodeAssignment_4_1() { return cPreviousNodeAssignment_4_1; }
		
		//[Node|EString]
		public CrossReference getPreviousNodeNodeCrossReference_4_1_0() { return cPreviousNodeNodeCrossReference_4_1_0; }
		
		//EString
		public RuleCall getPreviousNodeNodeEStringParserRuleCall_4_1_0_1() { return cPreviousNodeNodeEStringParserRuleCall_4_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	
	
	private final SystemElements pSystem;
	private final NodeElements pNode;
	private final Node_ImplElements pNode_Impl;
	private final EStringElements pEString;
	private final SensorElements pSensor;
	private final FilterElements pFilter;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SPDSLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSystem = new SystemElements();
		this.pNode = new NodeElements();
		this.pNode_Impl = new Node_ImplElements();
		this.pEString = new EStringElements();
		this.pSensor = new SensorElements();
		this.pFilter = new FilterElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.polytech.nice.elliot.sle.sensorproject.SPDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//System:
	//	{System}
	//	'System'
	//	'{' ('nodes' '{' nodes+=Node ("," nodes+=Node)* '}')?
	//	'}';
	public SystemElements getSystemAccess() {
		return pSystem;
	}
	
	public ParserRule getSystemRule() {
		return getSystemAccess().getRule();
	}
	
	//Node:
	//	Node_Impl | Sensor | Filter;
	public NodeElements getNodeAccess() {
		return pNode;
	}
	
	public ParserRule getNodeRule() {
		return getNodeAccess().getRule();
	}
	
	//Node_Impl Node:
	//	{Node}
	//	'Node'
	//	name=EString;
	public Node_ImplElements getNode_ImplAccess() {
		return pNode_Impl;
	}
	
	public ParserRule getNode_ImplRule() {
		return getNode_ImplAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Sensor:
	//	{Sensor}
	//	'Sensor'
	//	name=EString;
	public SensorElements getSensorAccess() {
		return pSensor;
	}
	
	public ParserRule getSensorRule() {
		return getSensorAccess().getRule();
	}
	
	//Filter:
	//	{Filter}
	//	'Filter'
	//	name=EString
	//	'{' ('previousNode' previousNode=[Node|EString])?
	//	'}';
	public FilterElements getFilterAccess() {
		return pFilter;
	}
	
	public ParserRule getFilterRule() {
		return getFilterAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
