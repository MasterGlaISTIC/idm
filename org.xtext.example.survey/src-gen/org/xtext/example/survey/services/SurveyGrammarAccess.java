/*
* generated by Xtext
*/
package org.xtext.example.survey.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SurveyGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SurveyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "survey");
		private final Assignment cPollsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPollsPollParserRuleCall_0 = (RuleCall)cPollsAssignment.eContents().get(0);
		
		//survey:
		//	polls+=Poll*;
		public ParserRule getRule() { return rule; }

		//polls+=Poll*
		public Assignment getPollsAssignment() { return cPollsAssignment; }

		//Poll
		public RuleCall getPollsPollParserRuleCall_0() { return cPollsPollParserRuleCall_0; }
	}

	public class PollElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Poll");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPollKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cQuestionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cQuestionsQuestionParserRuleCall_2_0 = (RuleCall)cQuestionsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Poll:
		//	"Poll" "{" questions+=Question* "}";
		public ParserRule getRule() { return rule; }

		//"Poll" "{" questions+=Question* "}"
		public Group getGroup() { return cGroup; }

		//"Poll"
		public Keyword getPollKeyword_0() { return cPollKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//questions+=Question*
		public Assignment getQuestionsAssignment_2() { return cQuestionsAssignment_2; }

		//Question
		public RuleCall getQuestionsQuestionParserRuleCall_2_0() { return cQuestionsQuestionParserRuleCall_2_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}

	public class QuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Question");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cSTRINGTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cOptionsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cOptionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cOptionsOptionParserRuleCall_5_0 = (RuleCall)cOptionsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Question:
		//	"Question" name=ID? "{" STRING "options" options+=option* "}";
		public ParserRule getRule() { return rule; }

		//"Question" name=ID? "{" STRING "options" options+=option* "}"
		public Group getGroup() { return cGroup; }

		//"Question"
		public Keyword getQuestionKeyword_0() { return cQuestionKeyword_0; }

		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_3() { return cSTRINGTerminalRuleCall_3; }

		//"options"
		public Keyword getOptionsKeyword_4() { return cOptionsKeyword_4; }

		//options+=option*
		public Assignment getOptionsAssignment_5() { return cOptionsAssignment_5; }

		//option
		public RuleCall getOptionsOptionParserRuleCall_5_0() { return cOptionsOptionParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class OptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "option");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_0_0 = (RuleCall)cGroup_0.eContents().get(0);
		private final Keyword cEqualsSignGreaterThanSignKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cTextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTextSTRINGTerminalRuleCall_1_0 = (RuleCall)cTextAssignment_1.eContents().get(0);
		
		//option:
		//	(ID "=>")? text=STRING;
		public ParserRule getRule() { return rule; }

		//(ID "=>")? text=STRING
		public Group getGroup() { return cGroup; }

		//(ID "=>")?
		public Group getGroup_0() { return cGroup_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_0_0() { return cIDTerminalRuleCall_0_0; }

		//"=>"
		public Keyword getEqualsSignGreaterThanSignKeyword_0_1() { return cEqualsSignGreaterThanSignKeyword_0_1; }

		//text=STRING
		public Assignment getTextAssignment_1() { return cTextAssignment_1; }

		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_1_0() { return cTextSTRINGTerminalRuleCall_1_0; }
	}
	
	
	private final SurveyElements pSurvey;
	private final PollElements pPoll;
	private final QuestionElements pQuestion;
	private final OptionElements pOption;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SurveyGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSurvey = new SurveyElements();
		this.pPoll = new PollElements();
		this.pQuestion = new QuestionElements();
		this.pOption = new OptionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.survey.Survey".equals(grammar.getName())) {
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
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//survey:
	//	polls+=Poll*;
	public SurveyElements getSurveyAccess() {
		return pSurvey;
	}
	
	public ParserRule getSurveyRule() {
		return getSurveyAccess().getRule();
	}

	//Poll:
	//	"Poll" "{" questions+=Question* "}";
	public PollElements getPollAccess() {
		return pPoll;
	}
	
	public ParserRule getPollRule() {
		return getPollAccess().getRule();
	}

	//Question:
	//	"Question" name=ID? "{" STRING "options" options+=option* "}";
	public QuestionElements getQuestionAccess() {
		return pQuestion;
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}

	//option:
	//	(ID "=>")? text=STRING;
	public OptionElements getOptionAccess() {
		return pOption;
	}
	
	public ParserRule getOptionRule() {
		return getOptionAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
