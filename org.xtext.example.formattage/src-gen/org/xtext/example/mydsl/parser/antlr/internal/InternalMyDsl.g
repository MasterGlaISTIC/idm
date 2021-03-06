/*
* generated by Xtext
*/
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;
 	
    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "MyDsl";	
   	}
   	
   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleMyDsl
entryRuleMyDsl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMyDslRule()); }
	 iv_ruleMyDsl=ruleMyDsl 
	 { $current=$iv_ruleMyDsl.current; } 
	 EOF 
;

// Rule MyDsl
ruleMyDsl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getMyDslAccess().getPollsPollParserRuleCall_0()); 
	    }
		lv_polls_0_0=rulePoll		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMyDslRule());
	        }
       		add(
       			$current, 
       			"polls",
        		lv_polls_0_0, 
        		"Poll");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRulePoll
entryRulePoll returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPollRule()); }
	 iv_rulePoll=rulePoll 
	 { $current=$iv_rulePoll.current; } 
	 EOF 
;

// Rule Poll
rulePoll returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Poll' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPollAccess().getPollKeyword_0());
    }
	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_2_0()); 
	    }
		lv_questions_2_0=ruleQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPollRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_2_0, 
        		"Question");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_3='}' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPollAccess().getRightCurlyBracketKeyword_3());
    }
)
;





// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	 iv_ruleQuestion=ruleQuestion 
	 { $current=$iv_ruleQuestion.current; } 
	 EOF 
;

// Rule Question
ruleQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Question' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
    }
this_ID_1=RULE_ID
    { 
    newLeafNode(this_ID_1, grammarAccess.getQuestionAccess().getIDTerminalRuleCall_1()); 
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getQuestionAccess().getTypesTypeEnumRuleCall_2_0()); 
	    }
		lv_types_2_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getQuestionRule());
	        }
       		add(
       			$current, 
       			"types",
        		lv_types_2_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)+)
;





// Rule Type
ruleType returns [Enumerator current=null] 
    @init { enterRule(); }
    @after { leaveRule(); }:
((	enumLiteral_0='CHECKBOX' 
	{
        $current = grammarAccess.getTypeAccess().getCHECKBOXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getCHECKBOXEnumLiteralDeclaration_0()); 
    }
)
    |(	enumLiteral_1='TEXTBOX' 
	{
        $current = grammarAccess.getTypeAccess().getTEXTBOXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
        newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getTEXTBOXEnumLiteralDeclaration_1()); 
    }
));



RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


