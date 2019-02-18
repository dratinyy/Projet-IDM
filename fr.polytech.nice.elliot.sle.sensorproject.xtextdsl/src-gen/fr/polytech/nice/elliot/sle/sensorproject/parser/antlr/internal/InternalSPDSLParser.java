package fr.polytech.nice.elliot.sle.sensorproject.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.polytech.nice.elliot.sle.sensorproject.services.SPDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSPDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "'{'", "'nodes'", "','", "'}'", "'Node'", "'Sensor'", "'Filter'", "'previousNode'"
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
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalSPDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSPDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSPDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSPDSL.g"; }



     	private SPDSLGrammarAccess grammarAccess;

        public InternalSPDSLParser(TokenStream input, SPDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "System";
       	}

       	@Override
       	protected SPDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystem"
    // InternalSPDSL.g:64:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalSPDSL.g:64:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalSPDSL.g:65:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalSPDSL.g:71:1: ruleSystem returns [EObject current=null] : ( () otherlv_1= 'System' otherlv_2= '{' (otherlv_3= 'nodes' otherlv_4= '{' ( (lv_nodes_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_nodes_7_0= ruleNode ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_nodes_5_0 = null;

        EObject lv_nodes_7_0 = null;



        	enterRule();

        try {
            // InternalSPDSL.g:77:2: ( ( () otherlv_1= 'System' otherlv_2= '{' (otherlv_3= 'nodes' otherlv_4= '{' ( (lv_nodes_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_nodes_7_0= ruleNode ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalSPDSL.g:78:2: ( () otherlv_1= 'System' otherlv_2= '{' (otherlv_3= 'nodes' otherlv_4= '{' ( (lv_nodes_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_nodes_7_0= ruleNode ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalSPDSL.g:78:2: ( () otherlv_1= 'System' otherlv_2= '{' (otherlv_3= 'nodes' otherlv_4= '{' ( (lv_nodes_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_nodes_7_0= ruleNode ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalSPDSL.g:79:3: () otherlv_1= 'System' otherlv_2= '{' (otherlv_3= 'nodes' otherlv_4= '{' ( (lv_nodes_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_nodes_7_0= ruleNode ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalSPDSL.g:79:3: ()
            // InternalSPDSL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSystemAccess().getSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSystemAccess().getSystemKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSPDSL.g:94:3: (otherlv_3= 'nodes' otherlv_4= '{' ( (lv_nodes_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_nodes_7_0= ruleNode ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSPDSL.g:95:4: otherlv_3= 'nodes' otherlv_4= '{' ( (lv_nodes_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_nodes_7_0= ruleNode ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSystemAccess().getNodesKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalSPDSL.g:103:4: ( (lv_nodes_5_0= ruleNode ) )
                    // InternalSPDSL.g:104:5: (lv_nodes_5_0= ruleNode )
                    {
                    // InternalSPDSL.g:104:5: (lv_nodes_5_0= ruleNode )
                    // InternalSPDSL.g:105:6: lv_nodes_5_0= ruleNode
                    {

                    						newCompositeNode(grammarAccess.getSystemAccess().getNodesNodeParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_nodes_5_0=ruleNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSystemRule());
                    						}
                    						add(
                    							current,
                    							"nodes",
                    							lv_nodes_5_0,
                    							"fr.polytech.nice.elliot.sle.sensorproject.SPDSL.Node");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSPDSL.g:122:4: (otherlv_6= ',' ( (lv_nodes_7_0= ruleNode ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSPDSL.g:123:5: otherlv_6= ',' ( (lv_nodes_7_0= ruleNode ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSystemAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalSPDSL.g:127:5: ( (lv_nodes_7_0= ruleNode ) )
                    	    // InternalSPDSL.g:128:6: (lv_nodes_7_0= ruleNode )
                    	    {
                    	    // InternalSPDSL.g:128:6: (lv_nodes_7_0= ruleNode )
                    	    // InternalSPDSL.g:129:7: lv_nodes_7_0= ruleNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getSystemAccess().getNodesNodeParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_nodes_7_0=ruleNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSystemRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodes",
                    	    								lv_nodes_7_0,
                    	    								"fr.polytech.nice.elliot.sle.sensorproject.SPDSL.Node");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleNode"
    // InternalSPDSL.g:160:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalSPDSL.g:160:45: (iv_ruleNode= ruleNode EOF )
            // InternalSPDSL.g:161:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalSPDSL.g:167:1: ruleNode returns [EObject current=null] : (this_Node_Impl_0= ruleNode_Impl | this_Sensor_1= ruleSensor | this_Filter_2= ruleFilter ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_Node_Impl_0 = null;

        EObject this_Sensor_1 = null;

        EObject this_Filter_2 = null;



        	enterRule();

        try {
            // InternalSPDSL.g:173:2: ( (this_Node_Impl_0= ruleNode_Impl | this_Sensor_1= ruleSensor | this_Filter_2= ruleFilter ) )
            // InternalSPDSL.g:174:2: (this_Node_Impl_0= ruleNode_Impl | this_Sensor_1= ruleSensor | this_Filter_2= ruleFilter )
            {
            // InternalSPDSL.g:174:2: (this_Node_Impl_0= ruleNode_Impl | this_Sensor_1= ruleSensor | this_Filter_2= ruleFilter )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSPDSL.g:175:3: this_Node_Impl_0= ruleNode_Impl
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getNode_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Node_Impl_0=ruleNode_Impl();

                    state._fsp--;


                    			current = this_Node_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSPDSL.g:184:3: this_Sensor_1= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_1=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSPDSL.g:193:3: this_Filter_2= ruleFilter
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getFilterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Filter_2=ruleFilter();

                    state._fsp--;


                    			current = this_Filter_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNode_Impl"
    // InternalSPDSL.g:205:1: entryRuleNode_Impl returns [EObject current=null] : iv_ruleNode_Impl= ruleNode_Impl EOF ;
    public final EObject entryRuleNode_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode_Impl = null;


        try {
            // InternalSPDSL.g:205:50: (iv_ruleNode_Impl= ruleNode_Impl EOF )
            // InternalSPDSL.g:206:2: iv_ruleNode_Impl= ruleNode_Impl EOF
            {
             newCompositeNode(grammarAccess.getNode_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode_Impl=ruleNode_Impl();

            state._fsp--;

             current =iv_ruleNode_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNode_Impl"


    // $ANTLR start "ruleNode_Impl"
    // InternalSPDSL.g:212:1: ruleNode_Impl returns [EObject current=null] : ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleNode_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSPDSL.g:218:2: ( ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSPDSL.g:219:2: ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSPDSL.g:219:2: ( () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSPDSL.g:220:3: () otherlv_1= 'Node' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSPDSL.g:220:3: ()
            // InternalSPDSL.g:221:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNode_ImplAccess().getNodeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getNode_ImplAccess().getNodeKeyword_1());
            		
            // InternalSPDSL.g:231:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSPDSL.g:232:4: (lv_name_2_0= ruleEString )
            {
            // InternalSPDSL.g:232:4: (lv_name_2_0= ruleEString )
            // InternalSPDSL.g:233:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNode_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNode_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.polytech.nice.elliot.sle.sensorproject.SPDSL.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleNode_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalSPDSL.g:254:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSPDSL.g:254:47: (iv_ruleEString= ruleEString EOF )
            // InternalSPDSL.g:255:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSPDSL.g:261:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSPDSL.g:267:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSPDSL.g:268:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSPDSL.g:268:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSPDSL.g:269:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSPDSL.g:277:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleSensor"
    // InternalSPDSL.g:288:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalSPDSL.g:288:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalSPDSL.g:289:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSPDSL.g:295:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSPDSL.g:301:2: ( ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalSPDSL.g:302:2: ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalSPDSL.g:302:2: ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalSPDSL.g:303:3: () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalSPDSL.g:303:3: ()
            // InternalSPDSL.g:304:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		
            // InternalSPDSL.g:314:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSPDSL.g:315:4: (lv_name_2_0= ruleEString )
            {
            // InternalSPDSL.g:315:4: (lv_name_2_0= ruleEString )
            // InternalSPDSL.g:316:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.polytech.nice.elliot.sle.sensorproject.SPDSL.EString");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleFilter"
    // InternalSPDSL.g:337:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalSPDSL.g:337:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalSPDSL.g:338:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalSPDSL.g:344:1: ruleFilter returns [EObject current=null] : ( () otherlv_1= 'Filter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'previousNode' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalSPDSL.g:350:2: ( ( () otherlv_1= 'Filter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'previousNode' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalSPDSL.g:351:2: ( () otherlv_1= 'Filter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'previousNode' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalSPDSL.g:351:2: ( () otherlv_1= 'Filter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'previousNode' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalSPDSL.g:352:3: () otherlv_1= 'Filter' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'previousNode' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalSPDSL.g:352:3: ()
            // InternalSPDSL.g:353:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFilterAccess().getFilterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getFilterAccess().getFilterKeyword_1());
            		
            // InternalSPDSL.g:363:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSPDSL.g:364:4: (lv_name_2_0= ruleEString )
            {
            // InternalSPDSL.g:364:4: (lv_name_2_0= ruleEString )
            // InternalSPDSL.g:365:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFilterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.polytech.nice.elliot.sle.sensorproject.SPDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSPDSL.g:386:3: (otherlv_4= 'previousNode' ( ( ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSPDSL.g:387:4: otherlv_4= 'previousNode' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getFilterAccess().getPreviousNodeKeyword_4_0());
                    			
                    // InternalSPDSL.g:391:4: ( ( ruleEString ) )
                    // InternalSPDSL.g:392:5: ( ruleEString )
                    {
                    // InternalSPDSL.g:392:5: ( ruleEString )
                    // InternalSPDSL.g:393:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFilterAccess().getPreviousNodeNodeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleFilter"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000088000L});

}