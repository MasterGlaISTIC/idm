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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Poll'", "'{'", "'}'", "'Question'", "'CHECKBOX'", "'TEXTBOX'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g"; }



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



    // $ANTLR start "entryRuleMyDsl"
    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:68:1: entryRuleMyDsl returns [EObject current=null] : iv_ruleMyDsl= ruleMyDsl EOF ;
    public final EObject entryRuleMyDsl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMyDsl = null;


        try {
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:69:2: (iv_ruleMyDsl= ruleMyDsl EOF )
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:70:2: iv_ruleMyDsl= ruleMyDsl EOF
            {
             newCompositeNode(grammarAccess.getMyDslRule()); 
            pushFollow(FOLLOW_ruleMyDsl_in_entryRuleMyDsl75);
            iv_ruleMyDsl=ruleMyDsl();

            state._fsp--;

             current =iv_ruleMyDsl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMyDsl85); 

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
    // $ANTLR end "entryRuleMyDsl"


    // $ANTLR start "ruleMyDsl"
    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:77:1: ruleMyDsl returns [EObject current=null] : ( (lv_polls_0_0= rulePoll ) )* ;
    public final EObject ruleMyDsl() throws RecognitionException {
        EObject current = null;

        EObject lv_polls_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:80:28: ( ( (lv_polls_0_0= rulePoll ) )* )
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( (lv_polls_0_0= rulePoll ) )*
            {
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:81:1: ( (lv_polls_0_0= rulePoll ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:1: (lv_polls_0_0= rulePoll )
            	    {
            	    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:82:1: (lv_polls_0_0= rulePoll )
            	    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:83:3: lv_polls_0_0= rulePoll
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMyDslAccess().getPollsPollParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePoll_in_ruleMyDsl130);
            	    lv_polls_0_0=rulePoll();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMyDslRule());
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
    // $ANTLR end "ruleMyDsl"


    // $ANTLR start "entryRulePoll"
    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:107:1: entryRulePoll returns [EObject current=null] : iv_rulePoll= rulePoll EOF ;
    public final EObject entryRulePoll() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoll = null;


        try {
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:108:2: (iv_rulePoll= rulePoll EOF )
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:109:2: iv_rulePoll= rulePoll EOF
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
    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:116:1: rulePoll returns [EObject current=null] : (otherlv_0= 'Poll' otherlv_1= '{' ( (lv_questions_2_0= ruleQuestion ) )+ otherlv_3= '}' ) ;
    public final EObject rulePoll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_questions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:119:28: ( (otherlv_0= 'Poll' otherlv_1= '{' ( (lv_questions_2_0= ruleQuestion ) )+ otherlv_3= '}' ) )
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:1: (otherlv_0= 'Poll' otherlv_1= '{' ( (lv_questions_2_0= ruleQuestion ) )+ otherlv_3= '}' )
            {
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:1: (otherlv_0= 'Poll' otherlv_1= '{' ( (lv_questions_2_0= ruleQuestion ) )+ otherlv_3= '}' )
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:120:3: otherlv_0= 'Poll' otherlv_1= '{' ( (lv_questions_2_0= ruleQuestion ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePoll213); 

                	newLeafNode(otherlv_0, grammarAccess.getPollAccess().getPollKeyword_0());
                
            otherlv_1=(Token)match(input,12,FOLLOW_12_in_rulePoll225); 

                	newLeafNode(otherlv_1, grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:128:1: ( (lv_questions_2_0= ruleQuestion ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:129:1: (lv_questions_2_0= ruleQuestion )
            	    {
            	    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:129:1: (lv_questions_2_0= ruleQuestion )
            	    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:130:3: lv_questions_2_0= ruleQuestion
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
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
    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:158:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:159:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:160:2: iv_ruleQuestion= ruleQuestion EOF
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
    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:167:1: ruleQuestion returns [EObject current=null] : (otherlv_0= 'Question' this_ID_1= RULE_ID ( (lv_types_2_0= ruleType ) )+ ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_ID_1=null;
        Enumerator lv_types_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:170:28: ( (otherlv_0= 'Question' this_ID_1= RULE_ID ( (lv_types_2_0= ruleType ) )+ ) )
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:171:1: (otherlv_0= 'Question' this_ID_1= RULE_ID ( (lv_types_2_0= ruleType ) )+ )
            {
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:171:1: (otherlv_0= 'Question' this_ID_1= RULE_ID ( (lv_types_2_0= ruleType ) )+ )
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:171:3: otherlv_0= 'Question' this_ID_1= RULE_ID ( (lv_types_2_0= ruleType ) )+
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleQuestion342); 

                	newLeafNode(otherlv_0, grammarAccess.getQuestionAccess().getQuestionKeyword_0());
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuestion353); 
             
                newLeafNode(this_ID_1, grammarAccess.getQuestionAccess().getIDTerminalRuleCall_1()); 
                
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:179:1: ( (lv_types_2_0= ruleType ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=16)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:180:1: (lv_types_2_0= ruleType )
            	    {
            	    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:180:1: (lv_types_2_0= ruleType )
            	    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:181:3: lv_types_2_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQuestionAccess().getTypesTypeEnumRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleQuestion373);
            	    lv_types_2_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"types",
            	            		lv_types_2_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


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


    // $ANTLR start "ruleType"
    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:205:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'CHECKBOX' ) | (enumLiteral_1= 'TEXTBOX' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:207:28: ( ( (enumLiteral_0= 'CHECKBOX' ) | (enumLiteral_1= 'TEXTBOX' ) ) )
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:1: ( (enumLiteral_0= 'CHECKBOX' ) | (enumLiteral_1= 'TEXTBOX' ) )
            {
            // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:1: ( (enumLiteral_0= 'CHECKBOX' ) | (enumLiteral_1= 'TEXTBOX' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:2: (enumLiteral_0= 'CHECKBOX' )
                    {
                    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:2: (enumLiteral_0= 'CHECKBOX' )
                    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:208:4: enumLiteral_0= 'CHECKBOX'
                    {
                    enumLiteral_0=(Token)match(input,15,FOLLOW_15_in_ruleType424); 

                            current = grammarAccess.getTypeAccess().getCHECKBOXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getCHECKBOXEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:214:6: (enumLiteral_1= 'TEXTBOX' )
                    {
                    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:214:6: (enumLiteral_1= 'TEXTBOX' )
                    // ../org.xtext.example.formattage/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalMyDsl.g:214:8: enumLiteral_1= 'TEXTBOX'
                    {
                    enumLiteral_1=(Token)match(input,16,FOLLOW_16_in_ruleType441); 

                            current = grammarAccess.getTypeAccess().getTEXTBOXEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getTEXTBOXEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

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
    // $ANTLR end "ruleType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleMyDsl_in_entryRuleMyDsl75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMyDsl85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoll_in_ruleMyDsl130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rulePoll_in_entryRulePoll166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoll176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePoll213 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePoll225 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleQuestion_in_rulePoll246 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_rulePoll259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleQuestion342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuestion353 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_ruleType_in_ruleQuestion373 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_15_in_ruleType424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleType441 = new BitSet(new long[]{0x0000000000000002L});

}