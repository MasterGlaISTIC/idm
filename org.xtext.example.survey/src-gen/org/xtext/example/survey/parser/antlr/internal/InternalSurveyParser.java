package org.xtext.example.survey.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.survey.services.SurveyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSurveyParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Poll'", "'{'", "'}'", "'Question'", "'options'", "'=>'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSurveyParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSurveyParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSurveyParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g"; }



     	private SurveyGrammarAccess grammarAccess;
     	
        public InternalSurveyParser(TokenStream input, SurveyGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "survey";	
       	}
       	
       	@Override
       	protected SurveyGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulesurvey"
    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:67:1: entryRulesurvey returns [EObject current=null] : iv_rulesurvey= rulesurvey EOF ;
    public final EObject entryRulesurvey() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesurvey = null;


        try {
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:68:2: (iv_rulesurvey= rulesurvey EOF )
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:69:2: iv_rulesurvey= rulesurvey EOF
            {
             newCompositeNode(grammarAccess.getSurveyRule()); 
            pushFollow(FOLLOW_rulesurvey_in_entryRulesurvey75);
            iv_rulesurvey=rulesurvey();

            state._fsp--;

             current =iv_rulesurvey; 
            match(input,EOF,FOLLOW_EOF_in_entryRulesurvey85); 

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
    // $ANTLR end "entryRulesurvey"


    // $ANTLR start "rulesurvey"
    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:76:1: rulesurvey returns [EObject current=null] : ( (lv_polls_0_0= rulePoll ) )* ;
    public final EObject rulesurvey() throws RecognitionException {
        EObject current = null;

        EObject lv_polls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:79:28: ( ( (lv_polls_0_0= rulePoll ) )* )
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:80:1: ( (lv_polls_0_0= rulePoll ) )*
            {
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:80:1: ( (lv_polls_0_0= rulePoll ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:81:1: (lv_polls_0_0= rulePoll )
            	    {
            	    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:81:1: (lv_polls_0_0= rulePoll )
            	    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:82:3: lv_polls_0_0= rulePoll
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSurveyAccess().getPollsPollParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePoll_in_rulesurvey130);
            	    lv_polls_0_0=rulePoll();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSurveyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"polls",
            	            		lv_polls_0_0, 
            	            		"Poll");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "rulesurvey"


    // $ANTLR start "entryRulePoll"
    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:106:1: entryRulePoll returns [EObject current=null] : iv_rulePoll= rulePoll EOF ;
    public final EObject entryRulePoll() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoll = null;


        try {
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:107:2: (iv_rulePoll= rulePoll EOF )
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:108:2: iv_rulePoll= rulePoll EOF
            {
             newCompositeNode(grammarAccess.getPollRule()); 
            pushFollow(FOLLOW_rulePoll_in_entryRulePoll166);
            iv_rulePoll=rulePoll();

            state._fsp--;

             current =iv_rulePoll; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoll176); 

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
    // $ANTLR end "entryRulePoll"


    // $ANTLR start "rulePoll"
    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:115:1: rulePoll returns [EObject current=null] : (otherlv_0= 'Poll' otherlv_1= '{' ( (lv_questions_2_0= ruleQuestion ) )* otherlv_3= '}' ) ;
    public final EObject rulePoll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_questions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:118:28: ( (otherlv_0= 'Poll' otherlv_1= '{' ( (lv_questions_2_0= ruleQuestion ) )* otherlv_3= '}' ) )
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:119:1: (otherlv_0= 'Poll' otherlv_1= '{' ( (lv_questions_2_0= ruleQuestion ) )* otherlv_3= '}' )
            {
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:119:1: (otherlv_0= 'Poll' otherlv_1= '{' ( (lv_questions_2_0= ruleQuestion ) )* otherlv_3= '}' )
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:119:3: otherlv_0= 'Poll' otherlv_1= '{' ( (lv_questions_2_0= ruleQuestion ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePoll213); 

                	newLeafNode(otherlv_0, grammarAccess.getPollAccess().getPollKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_rulePoll225); 

                	newLeafNode(otherlv_1, grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:127:1: ( (lv_questions_2_0= ruleQuestion ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:128:1: (lv_questions_2_0= ruleQuestion )
            	    {
            	    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:128:1: (lv_questions_2_0= ruleQuestion )
            	    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:129:3: lv_questions_2_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_rulePoll246);
            	    lv_questions_2_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPollRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_2_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePoll259); 

                	newLeafNode(otherlv_3, grammarAccess.getPollAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "rulePoll"


    // $ANTLR start "entryRuleQuestion"
    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:157:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:158:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:159:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion295);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion305); 

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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:166:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' this_STRING_3= RULE_STRING otherlv_4= 'options' ( (lv_options_5_0= ruleoption ) )* otherlv_6= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_STRING_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_options_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:169:28: ( (otherlv_0= 'Question' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' this_STRING_3= RULE_STRING otherlv_4= 'options' ( (lv_options_5_0= ruleoption ) )* otherlv_6= '}' ) )
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:170:1: (otherlv_0= 'Question' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' this_STRING_3= RULE_STRING otherlv_4= 'options' ( (lv_options_5_0= ruleoption ) )* otherlv_6= '}' )
            {
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:170:1: (otherlv_0= 'Question' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' this_STRING_3= RULE_STRING otherlv_4= 'options' ( (lv_options_5_0= ruleoption ) )* otherlv_6= '}' )
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:170:3: otherlv_0= 'Question' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' this_STRING_3= RULE_STRING otherlv_4= 'options' ( (lv_options_5_0= ruleoption ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleQuestion342); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
                
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:174:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:175:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:175:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:176:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestion359); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getQuestionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleQuestion377); 

                	newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQuestion388); 
             
                newLeafNode(this_STRING_3, grammarAccess.getQuestionAccess().getSTRINGTerminalRuleCall_3()); 
                
            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleQuestion399); 

                	newLeafNode(otherlv_4, grammarAccess.getQuestionAccess().getOptionsKeyword_4());
                
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:204:1: ( (lv_options_5_0= ruleoption ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_STRING)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:205:1: (lv_options_5_0= ruleoption )
            	    {
            	    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:205:1: (lv_options_5_0= ruleoption )
            	    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:206:3: lv_options_5_0= ruleoption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getOptionsOptionParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleoption_in_ruleQuestion420);
            	    lv_options_5_0=ruleoption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_5_0, 
            	            		"option");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleQuestion433); 

                	newLeafNode(otherlv_6, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleoption"
    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:234:1: entryRuleoption returns [EObject current=null] : iv_ruleoption= ruleoption EOF ;
    public final EObject entryRuleoption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleoption = null;


        try {
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:235:2: (iv_ruleoption= ruleoption EOF )
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:236:2: iv_ruleoption= ruleoption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_ruleoption_in_entryRuleoption469);
            iv_ruleoption=ruleoption();

            state._fsp--;

             current =iv_ruleoption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleoption479); 

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
    // $ANTLR end "entryRuleoption"


    // $ANTLR start "ruleoption"
    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:243:1: ruleoption returns [EObject current=null] : ( (this_ID_0= RULE_ID otherlv_1= '=>' )? ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleoption() throws RecognitionException {
        EObject current = null;

        Token this_ID_0=null;
        Token otherlv_1=null;
        Token lv_text_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:246:28: ( ( (this_ID_0= RULE_ID otherlv_1= '=>' )? ( (lv_text_2_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:247:1: ( (this_ID_0= RULE_ID otherlv_1= '=>' )? ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:247:1: ( (this_ID_0= RULE_ID otherlv_1= '=>' )? ( (lv_text_2_0= RULE_STRING ) ) )
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:247:2: (this_ID_0= RULE_ID otherlv_1= '=>' )? ( (lv_text_2_0= RULE_STRING ) )
            {
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:247:2: (this_ID_0= RULE_ID otherlv_1= '=>' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:247:3: this_ID_0= RULE_ID otherlv_1= '=>'
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleoption516); 
                     
                        newLeafNode(this_ID_0, grammarAccess.getOptionAccess().getIDTerminalRuleCall_0_0()); 
                        
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleoption527); 

                        	newLeafNode(otherlv_1, grammarAccess.getOptionAccess().getEqualsSignGreaterThanSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:255:3: ( (lv_text_2_0= RULE_STRING ) )
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:256:1: (lv_text_2_0= RULE_STRING )
            {
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:256:1: (lv_text_2_0= RULE_STRING )
            // ../org.xtext.example.survey/src-gen/org/xtext/example/survey/parser/antlr/internal/InternalSurvey.g:257:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleoption546); 

            			newLeafNode(lv_text_2_0, grammarAccess.getOptionAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"STRING");
            	    

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
    // $ANTLR end "ruleoption"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulesurvey_in_entryRulesurvey75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulesurvey85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoll_in_rulesurvey130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rulePoll_in_entryRulePoll166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoll176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePoll213 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePoll225 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_ruleQuestion_in_rulePoll246 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_rulePoll259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleQuestion342 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestion359 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleQuestion377 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQuestion388 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleQuestion399 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_ruleoption_in_ruleQuestion420 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_13_in_ruleQuestion433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleoption_in_entryRuleoption469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleoption479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleoption516 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleoption527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleoption546 = new BitSet(new long[]{0x0000000000000002L});

}