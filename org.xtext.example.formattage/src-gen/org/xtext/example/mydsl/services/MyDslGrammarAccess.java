/*
* generated by Xtext
*/
package org.xtext.example.mydsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class MyDslElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MyDsl");
		private final Assignment cPollsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPollsPollParserRuleCall_0 = (RuleCall)cPollsAssignment.eContents().get(0);
		
		//MyDsl:
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
		//	"Poll" "{" questions+=Question+ "}";
		public ParserRule getRule() { return rule; }

		//"Poll" "{" questions+=Question+ "}"
		public Group getGroup() { return cGroup; }

		//"Poll"
		public Keyword getPollKeyword_0() { return cPollKeyword_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }

		//questions+=Question+
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
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cTypesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypesTypeEnumRuleCall_2_0 = (RuleCall)cTypesAssignment_2.eContents().get(0);
		
		//Question:
		//	"Question" ID types+=Type+;
		public ParserRule getRule() { return rule; }

		//"Question" ID types+=Type+
		public Group getGroup() { return cGroup; }

		//"Question"
		public Keyword getQuestionKeyword_0() { return cQuestionKeyword_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }

		//types+=Type+
		public Assignment getTypesAssignment_2() { return cTypesAssignment_2; }

		//Type
		public RuleCall getTypesTypeEnumRuleCall_2_0() { return cTypesTypeEnumRuleCall_2_0; }
	}
	
	
	public class TypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCHECKBOXEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCHECKBOXCHECKBOXKeyword_0_0 = (Keyword)cCHECKBOXEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cTEXTBOXEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cTEXTBOXTEXTBOXKeyword_1_0 = (Keyword)cTEXTBOXEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Type:
		//	CHECKBOX | TEXTBOX;
		public EnumRule getRule() { return rule; }

		//CHECKBOX | TEXTBOX
		public Alternatives getAlternatives() { return cAlternatives; }

		//CHECKBOX
		public EnumLiteralDeclaration getCHECKBOXEnumLiteralDeclaration_0() { return cCHECKBOXEnumLiteralDeclaration_0; }

		//"CHECKBOX"
		public Keyword getCHECKBOXCHECKBOXKeyword_0_0() { return cCHECKBOXCHECKBOXKeyword_0_0; }

		//TEXTBOX
		public EnumLiteralDeclaration getTEXTBOXEnumLiteralDeclaration_1() { return cTEXTBOXEnumLiteralDeclaration_1; }

		//"TEXTBOX"
		public Keyword getTEXTBOXTEXTBOXKeyword_1_0() { return cTEXTBOXTEXTBOXKeyword_1_0; }
	}
	
	private final MyDslElements pMyDsl;
	private final PollElements pPoll;
	private final QuestionElements pQuestion;
	private final TypeElements unknownRuleType;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMyDsl = new MyDslElements();
		this.pPoll = new PollElements();
		this.pQuestion = new QuestionElements();
		this.unknownRuleType = new TypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
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

	
	//MyDsl:
	//	polls+=Poll*;
	public MyDslElements getMyDslAccess() {
		return pMyDsl;
	}
	
	public ParserRule getMyDslRule() {
		return getMyDslAccess().getRule();
	}

	//Poll:
	//	"Poll" "{" questions+=Question+ "}";
	public PollElements getPollAccess() {
		return pPoll;
	}
	
	public ParserRule getPollRule() {
		return getPollAccess().getRule();
	}

	//Question:
	//	"Question" ID types+=Type+;
	public QuestionElements getQuestionAccess() {
		return pQuestion;
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}

	//enum Type:
	//	CHECKBOX | TEXTBOX;
	public TypeElements getTypeAccess() {
		return unknownRuleType;
	}
	
	public EnumRule getTypeRule() {
		return getTypeAccess().getRule();
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
