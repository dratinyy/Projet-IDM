package fr.polytech.nice.elliot.sle.sensorproject.ide.contentassist.antlr.internal;

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
import fr.polytech.nice.elliot.sle.sensorproject.services.SPDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSPDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'System'", "'{'", "'}'", "'nodes'", "','", "'Node'", "'Sensor'", "'Filter'", "'previousNode'"
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

    	public void setGrammarAccess(SPDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSystem"
    // InternalSPDSL.g:53:1: entryRuleSystem : ruleSystem EOF ;
    public final void entryRuleSystem() throws RecognitionException {
        try {
            // InternalSPDSL.g:54:1: ( ruleSystem EOF )
            // InternalSPDSL.g:55:1: ruleSystem EOF
            {
             before(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleSystem();

            state._fsp--;

             after(grammarAccess.getSystemRule()); 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalSPDSL.g:62:1: ruleSystem : ( ( rule__System__Group__0 ) ) ;
    public final void ruleSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:66:2: ( ( ( rule__System__Group__0 ) ) )
            // InternalSPDSL.g:67:2: ( ( rule__System__Group__0 ) )
            {
            // InternalSPDSL.g:67:2: ( ( rule__System__Group__0 ) )
            // InternalSPDSL.g:68:3: ( rule__System__Group__0 )
            {
             before(grammarAccess.getSystemAccess().getGroup()); 
            // InternalSPDSL.g:69:3: ( rule__System__Group__0 )
            // InternalSPDSL.g:69:4: rule__System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getGroup()); 

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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleNode"
    // InternalSPDSL.g:78:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalSPDSL.g:79:1: ( ruleNode EOF )
            // InternalSPDSL.g:80:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalSPDSL.g:87:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:91:2: ( ( ( rule__Node__Alternatives ) ) )
            // InternalSPDSL.g:92:2: ( ( rule__Node__Alternatives ) )
            {
            // InternalSPDSL.g:92:2: ( ( rule__Node__Alternatives ) )
            // InternalSPDSL.g:93:3: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // InternalSPDSL.g:94:3: ( rule__Node__Alternatives )
            // InternalSPDSL.g:94:4: rule__Node__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Node__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleNode_Impl"
    // InternalSPDSL.g:103:1: entryRuleNode_Impl : ruleNode_Impl EOF ;
    public final void entryRuleNode_Impl() throws RecognitionException {
        try {
            // InternalSPDSL.g:104:1: ( ruleNode_Impl EOF )
            // InternalSPDSL.g:105:1: ruleNode_Impl EOF
            {
             before(grammarAccess.getNode_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleNode_Impl();

            state._fsp--;

             after(grammarAccess.getNode_ImplRule()); 
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
    // $ANTLR end "entryRuleNode_Impl"


    // $ANTLR start "ruleNode_Impl"
    // InternalSPDSL.g:112:1: ruleNode_Impl : ( ( rule__Node_Impl__Group__0 ) ) ;
    public final void ruleNode_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:116:2: ( ( ( rule__Node_Impl__Group__0 ) ) )
            // InternalSPDSL.g:117:2: ( ( rule__Node_Impl__Group__0 ) )
            {
            // InternalSPDSL.g:117:2: ( ( rule__Node_Impl__Group__0 ) )
            // InternalSPDSL.g:118:3: ( rule__Node_Impl__Group__0 )
            {
             before(grammarAccess.getNode_ImplAccess().getGroup()); 
            // InternalSPDSL.g:119:3: ( rule__Node_Impl__Group__0 )
            // InternalSPDSL.g:119:4: rule__Node_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleNode_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalSPDSL.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSPDSL.g:129:1: ( ruleEString EOF )
            // InternalSPDSL.g:130:1: ruleEString EOF
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
    // InternalSPDSL.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSPDSL.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSPDSL.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalSPDSL.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSPDSL.g:144:3: ( rule__EString__Alternatives )
            // InternalSPDSL.g:144:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleSensor"
    // InternalSPDSL.g:153:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalSPDSL.g:154:1: ( ruleSensor EOF )
            // InternalSPDSL.g:155:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalSPDSL.g:162:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:166:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalSPDSL.g:167:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalSPDSL.g:167:2: ( ( rule__Sensor__Group__0 ) )
            // InternalSPDSL.g:168:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalSPDSL.g:169:3: ( rule__Sensor__Group__0 )
            // InternalSPDSL.g:169:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleFilter"
    // InternalSPDSL.g:178:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalSPDSL.g:179:1: ( ruleFilter EOF )
            // InternalSPDSL.g:180:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalSPDSL.g:187:1: ruleFilter : ( ( rule__Filter__Group__0 ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:191:2: ( ( ( rule__Filter__Group__0 ) ) )
            // InternalSPDSL.g:192:2: ( ( rule__Filter__Group__0 ) )
            {
            // InternalSPDSL.g:192:2: ( ( rule__Filter__Group__0 ) )
            // InternalSPDSL.g:193:3: ( rule__Filter__Group__0 )
            {
             before(grammarAccess.getFilterAccess().getGroup()); 
            // InternalSPDSL.g:194:3: ( rule__Filter__Group__0 )
            // InternalSPDSL.g:194:4: rule__Filter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getGroup()); 

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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "rule__Node__Alternatives"
    // InternalSPDSL.g:202:1: rule__Node__Alternatives : ( ( ruleNode_Impl ) | ( ruleSensor ) | ( ruleFilter ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:206:1: ( ( ruleNode_Impl ) | ( ruleSensor ) | ( ruleFilter ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt1=1;
                }
                break;
            case 17:
                {
                alt1=2;
                }
                break;
            case 18:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalSPDSL.g:207:2: ( ruleNode_Impl )
                    {
                    // InternalSPDSL.g:207:2: ( ruleNode_Impl )
                    // InternalSPDSL.g:208:3: ruleNode_Impl
                    {
                     before(grammarAccess.getNodeAccess().getNode_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNode_Impl();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getNode_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSPDSL.g:213:2: ( ruleSensor )
                    {
                    // InternalSPDSL.g:213:2: ( ruleSensor )
                    // InternalSPDSL.g:214:3: ruleSensor
                    {
                     before(grammarAccess.getNodeAccess().getSensorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSensor();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getSensorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSPDSL.g:219:2: ( ruleFilter )
                    {
                    // InternalSPDSL.g:219:2: ( ruleFilter )
                    // InternalSPDSL.g:220:3: ruleFilter
                    {
                     before(grammarAccess.getNodeAccess().getFilterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFilter();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getFilterParserRuleCall_2()); 

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
    // $ANTLR end "rule__Node__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSPDSL.g:229:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:233:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSPDSL.g:234:2: ( RULE_STRING )
                    {
                    // InternalSPDSL.g:234:2: ( RULE_STRING )
                    // InternalSPDSL.g:235:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSPDSL.g:240:2: ( RULE_ID )
                    {
                    // InternalSPDSL.g:240:2: ( RULE_ID )
                    // InternalSPDSL.g:241:3: RULE_ID
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


    // $ANTLR start "rule__System__Group__0"
    // InternalSPDSL.g:250:1: rule__System__Group__0 : rule__System__Group__0__Impl rule__System__Group__1 ;
    public final void rule__System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:254:1: ( rule__System__Group__0__Impl rule__System__Group__1 )
            // InternalSPDSL.g:255:2: rule__System__Group__0__Impl rule__System__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__1();

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
    // $ANTLR end "rule__System__Group__0"


    // $ANTLR start "rule__System__Group__0__Impl"
    // InternalSPDSL.g:262:1: rule__System__Group__0__Impl : ( () ) ;
    public final void rule__System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:266:1: ( ( () ) )
            // InternalSPDSL.g:267:1: ( () )
            {
            // InternalSPDSL.g:267:1: ( () )
            // InternalSPDSL.g:268:2: ()
            {
             before(grammarAccess.getSystemAccess().getSystemAction_0()); 
            // InternalSPDSL.g:269:2: ()
            // InternalSPDSL.g:269:3: 
            {
            }

             after(grammarAccess.getSystemAccess().getSystemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__System__Group__0__Impl"


    // $ANTLR start "rule__System__Group__1"
    // InternalSPDSL.g:277:1: rule__System__Group__1 : rule__System__Group__1__Impl rule__System__Group__2 ;
    public final void rule__System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:281:1: ( rule__System__Group__1__Impl rule__System__Group__2 )
            // InternalSPDSL.g:282:2: rule__System__Group__1__Impl rule__System__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__2();

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
    // $ANTLR end "rule__System__Group__1"


    // $ANTLR start "rule__System__Group__1__Impl"
    // InternalSPDSL.g:289:1: rule__System__Group__1__Impl : ( 'System' ) ;
    public final void rule__System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:293:1: ( ( 'System' ) )
            // InternalSPDSL.g:294:1: ( 'System' )
            {
            // InternalSPDSL.g:294:1: ( 'System' )
            // InternalSPDSL.g:295:2: 'System'
            {
             before(grammarAccess.getSystemAccess().getSystemKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getSystemKeyword_1()); 

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
    // $ANTLR end "rule__System__Group__1__Impl"


    // $ANTLR start "rule__System__Group__2"
    // InternalSPDSL.g:304:1: rule__System__Group__2 : rule__System__Group__2__Impl rule__System__Group__3 ;
    public final void rule__System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:308:1: ( rule__System__Group__2__Impl rule__System__Group__3 )
            // InternalSPDSL.g:309:2: rule__System__Group__2__Impl rule__System__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__3();

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
    // $ANTLR end "rule__System__Group__2"


    // $ANTLR start "rule__System__Group__2__Impl"
    // InternalSPDSL.g:316:1: rule__System__Group__2__Impl : ( '{' ) ;
    public final void rule__System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:320:1: ( ( '{' ) )
            // InternalSPDSL.g:321:1: ( '{' )
            {
            // InternalSPDSL.g:321:1: ( '{' )
            // InternalSPDSL.g:322:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__System__Group__2__Impl"


    // $ANTLR start "rule__System__Group__3"
    // InternalSPDSL.g:331:1: rule__System__Group__3 : rule__System__Group__3__Impl rule__System__Group__4 ;
    public final void rule__System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:335:1: ( rule__System__Group__3__Impl rule__System__Group__4 )
            // InternalSPDSL.g:336:2: rule__System__Group__3__Impl rule__System__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group__4();

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
    // $ANTLR end "rule__System__Group__3"


    // $ANTLR start "rule__System__Group__3__Impl"
    // InternalSPDSL.g:343:1: rule__System__Group__3__Impl : ( ( rule__System__Group_3__0 )? ) ;
    public final void rule__System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:347:1: ( ( ( rule__System__Group_3__0 )? ) )
            // InternalSPDSL.g:348:1: ( ( rule__System__Group_3__0 )? )
            {
            // InternalSPDSL.g:348:1: ( ( rule__System__Group_3__0 )? )
            // InternalSPDSL.g:349:2: ( rule__System__Group_3__0 )?
            {
             before(grammarAccess.getSystemAccess().getGroup_3()); 
            // InternalSPDSL.g:350:2: ( rule__System__Group_3__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalSPDSL.g:350:3: rule__System__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__System__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemAccess().getGroup_3()); 

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
    // $ANTLR end "rule__System__Group__3__Impl"


    // $ANTLR start "rule__System__Group__4"
    // InternalSPDSL.g:358:1: rule__System__Group__4 : rule__System__Group__4__Impl ;
    public final void rule__System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:362:1: ( rule__System__Group__4__Impl )
            // InternalSPDSL.g:363:2: rule__System__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group__4__Impl();

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
    // $ANTLR end "rule__System__Group__4"


    // $ANTLR start "rule__System__Group__4__Impl"
    // InternalSPDSL.g:369:1: rule__System__Group__4__Impl : ( '}' ) ;
    public final void rule__System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:373:1: ( ( '}' ) )
            // InternalSPDSL.g:374:1: ( '}' )
            {
            // InternalSPDSL.g:374:1: ( '}' )
            // InternalSPDSL.g:375:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__System__Group__4__Impl"


    // $ANTLR start "rule__System__Group_3__0"
    // InternalSPDSL.g:385:1: rule__System__Group_3__0 : rule__System__Group_3__0__Impl rule__System__Group_3__1 ;
    public final void rule__System__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:389:1: ( rule__System__Group_3__0__Impl rule__System__Group_3__1 )
            // InternalSPDSL.g:390:2: rule__System__Group_3__0__Impl rule__System__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__System__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_3__1();

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
    // $ANTLR end "rule__System__Group_3__0"


    // $ANTLR start "rule__System__Group_3__0__Impl"
    // InternalSPDSL.g:397:1: rule__System__Group_3__0__Impl : ( 'nodes' ) ;
    public final void rule__System__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:401:1: ( ( 'nodes' ) )
            // InternalSPDSL.g:402:1: ( 'nodes' )
            {
            // InternalSPDSL.g:402:1: ( 'nodes' )
            // InternalSPDSL.g:403:2: 'nodes'
            {
             before(grammarAccess.getSystemAccess().getNodesKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getNodesKeyword_3_0()); 

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
    // $ANTLR end "rule__System__Group_3__0__Impl"


    // $ANTLR start "rule__System__Group_3__1"
    // InternalSPDSL.g:412:1: rule__System__Group_3__1 : rule__System__Group_3__1__Impl rule__System__Group_3__2 ;
    public final void rule__System__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:416:1: ( rule__System__Group_3__1__Impl rule__System__Group_3__2 )
            // InternalSPDSL.g:417:2: rule__System__Group_3__1__Impl rule__System__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__System__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_3__2();

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
    // $ANTLR end "rule__System__Group_3__1"


    // $ANTLR start "rule__System__Group_3__1__Impl"
    // InternalSPDSL.g:424:1: rule__System__Group_3__1__Impl : ( '{' ) ;
    public final void rule__System__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:428:1: ( ( '{' ) )
            // InternalSPDSL.g:429:1: ( '{' )
            {
            // InternalSPDSL.g:429:1: ( '{' )
            // InternalSPDSL.g:430:2: '{'
            {
             before(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getLeftCurlyBracketKeyword_3_1()); 

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
    // $ANTLR end "rule__System__Group_3__1__Impl"


    // $ANTLR start "rule__System__Group_3__2"
    // InternalSPDSL.g:439:1: rule__System__Group_3__2 : rule__System__Group_3__2__Impl rule__System__Group_3__3 ;
    public final void rule__System__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:443:1: ( rule__System__Group_3__2__Impl rule__System__Group_3__3 )
            // InternalSPDSL.g:444:2: rule__System__Group_3__2__Impl rule__System__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__System__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_3__3();

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
    // $ANTLR end "rule__System__Group_3__2"


    // $ANTLR start "rule__System__Group_3__2__Impl"
    // InternalSPDSL.g:451:1: rule__System__Group_3__2__Impl : ( ( rule__System__NodesAssignment_3_2 ) ) ;
    public final void rule__System__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:455:1: ( ( ( rule__System__NodesAssignment_3_2 ) ) )
            // InternalSPDSL.g:456:1: ( ( rule__System__NodesAssignment_3_2 ) )
            {
            // InternalSPDSL.g:456:1: ( ( rule__System__NodesAssignment_3_2 ) )
            // InternalSPDSL.g:457:2: ( rule__System__NodesAssignment_3_2 )
            {
             before(grammarAccess.getSystemAccess().getNodesAssignment_3_2()); 
            // InternalSPDSL.g:458:2: ( rule__System__NodesAssignment_3_2 )
            // InternalSPDSL.g:458:3: rule__System__NodesAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__System__NodesAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNodesAssignment_3_2()); 

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
    // $ANTLR end "rule__System__Group_3__2__Impl"


    // $ANTLR start "rule__System__Group_3__3"
    // InternalSPDSL.g:466:1: rule__System__Group_3__3 : rule__System__Group_3__3__Impl rule__System__Group_3__4 ;
    public final void rule__System__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:470:1: ( rule__System__Group_3__3__Impl rule__System__Group_3__4 )
            // InternalSPDSL.g:471:2: rule__System__Group_3__3__Impl rule__System__Group_3__4
            {
            pushFollow(FOLLOW_7);
            rule__System__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_3__4();

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
    // $ANTLR end "rule__System__Group_3__3"


    // $ANTLR start "rule__System__Group_3__3__Impl"
    // InternalSPDSL.g:478:1: rule__System__Group_3__3__Impl : ( ( rule__System__Group_3_3__0 )* ) ;
    public final void rule__System__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:482:1: ( ( ( rule__System__Group_3_3__0 )* ) )
            // InternalSPDSL.g:483:1: ( ( rule__System__Group_3_3__0 )* )
            {
            // InternalSPDSL.g:483:1: ( ( rule__System__Group_3_3__0 )* )
            // InternalSPDSL.g:484:2: ( rule__System__Group_3_3__0 )*
            {
             before(grammarAccess.getSystemAccess().getGroup_3_3()); 
            // InternalSPDSL.g:485:2: ( rule__System__Group_3_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSPDSL.g:485:3: rule__System__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__System__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getSystemAccess().getGroup_3_3()); 

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
    // $ANTLR end "rule__System__Group_3__3__Impl"


    // $ANTLR start "rule__System__Group_3__4"
    // InternalSPDSL.g:493:1: rule__System__Group_3__4 : rule__System__Group_3__4__Impl ;
    public final void rule__System__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:497:1: ( rule__System__Group_3__4__Impl )
            // InternalSPDSL.g:498:2: rule__System__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_3__4__Impl();

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
    // $ANTLR end "rule__System__Group_3__4"


    // $ANTLR start "rule__System__Group_3__4__Impl"
    // InternalSPDSL.g:504:1: rule__System__Group_3__4__Impl : ( '}' ) ;
    public final void rule__System__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:508:1: ( ( '}' ) )
            // InternalSPDSL.g:509:1: ( '}' )
            {
            // InternalSPDSL.g:509:1: ( '}' )
            // InternalSPDSL.g:510:2: '}'
            {
             before(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getRightCurlyBracketKeyword_3_4()); 

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
    // $ANTLR end "rule__System__Group_3__4__Impl"


    // $ANTLR start "rule__System__Group_3_3__0"
    // InternalSPDSL.g:520:1: rule__System__Group_3_3__0 : rule__System__Group_3_3__0__Impl rule__System__Group_3_3__1 ;
    public final void rule__System__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:524:1: ( rule__System__Group_3_3__0__Impl rule__System__Group_3_3__1 )
            // InternalSPDSL.g:525:2: rule__System__Group_3_3__0__Impl rule__System__Group_3_3__1
            {
            pushFollow(FOLLOW_6);
            rule__System__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__System__Group_3_3__1();

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
    // $ANTLR end "rule__System__Group_3_3__0"


    // $ANTLR start "rule__System__Group_3_3__0__Impl"
    // InternalSPDSL.g:532:1: rule__System__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__System__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:536:1: ( ( ',' ) )
            // InternalSPDSL.g:537:1: ( ',' )
            {
            // InternalSPDSL.g:537:1: ( ',' )
            // InternalSPDSL.g:538:2: ','
            {
             before(grammarAccess.getSystemAccess().getCommaKeyword_3_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSystemAccess().getCommaKeyword_3_3_0()); 

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
    // $ANTLR end "rule__System__Group_3_3__0__Impl"


    // $ANTLR start "rule__System__Group_3_3__1"
    // InternalSPDSL.g:547:1: rule__System__Group_3_3__1 : rule__System__Group_3_3__1__Impl ;
    public final void rule__System__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:551:1: ( rule__System__Group_3_3__1__Impl )
            // InternalSPDSL.g:552:2: rule__System__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__System__Group_3_3__1__Impl();

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
    // $ANTLR end "rule__System__Group_3_3__1"


    // $ANTLR start "rule__System__Group_3_3__1__Impl"
    // InternalSPDSL.g:558:1: rule__System__Group_3_3__1__Impl : ( ( rule__System__NodesAssignment_3_3_1 ) ) ;
    public final void rule__System__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:562:1: ( ( ( rule__System__NodesAssignment_3_3_1 ) ) )
            // InternalSPDSL.g:563:1: ( ( rule__System__NodesAssignment_3_3_1 ) )
            {
            // InternalSPDSL.g:563:1: ( ( rule__System__NodesAssignment_3_3_1 ) )
            // InternalSPDSL.g:564:2: ( rule__System__NodesAssignment_3_3_1 )
            {
             before(grammarAccess.getSystemAccess().getNodesAssignment_3_3_1()); 
            // InternalSPDSL.g:565:2: ( rule__System__NodesAssignment_3_3_1 )
            // InternalSPDSL.g:565:3: rule__System__NodesAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__System__NodesAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemAccess().getNodesAssignment_3_3_1()); 

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
    // $ANTLR end "rule__System__Group_3_3__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group__0"
    // InternalSPDSL.g:574:1: rule__Node_Impl__Group__0 : rule__Node_Impl__Group__0__Impl rule__Node_Impl__Group__1 ;
    public final void rule__Node_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:578:1: ( rule__Node_Impl__Group__0__Impl rule__Node_Impl__Group__1 )
            // InternalSPDSL.g:579:2: rule__Node_Impl__Group__0__Impl rule__Node_Impl__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Node_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group__1();

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
    // $ANTLR end "rule__Node_Impl__Group__0"


    // $ANTLR start "rule__Node_Impl__Group__0__Impl"
    // InternalSPDSL.g:586:1: rule__Node_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Node_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:590:1: ( ( () ) )
            // InternalSPDSL.g:591:1: ( () )
            {
            // InternalSPDSL.g:591:1: ( () )
            // InternalSPDSL.g:592:2: ()
            {
             before(grammarAccess.getNode_ImplAccess().getNodeAction_0()); 
            // InternalSPDSL.g:593:2: ()
            // InternalSPDSL.g:593:3: 
            {
            }

             after(grammarAccess.getNode_ImplAccess().getNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node_Impl__Group__0__Impl"


    // $ANTLR start "rule__Node_Impl__Group__1"
    // InternalSPDSL.g:601:1: rule__Node_Impl__Group__1 : rule__Node_Impl__Group__1__Impl rule__Node_Impl__Group__2 ;
    public final void rule__Node_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:605:1: ( rule__Node_Impl__Group__1__Impl rule__Node_Impl__Group__2 )
            // InternalSPDSL.g:606:2: rule__Node_Impl__Group__1__Impl rule__Node_Impl__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Node_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group__2();

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
    // $ANTLR end "rule__Node_Impl__Group__1"


    // $ANTLR start "rule__Node_Impl__Group__1__Impl"
    // InternalSPDSL.g:613:1: rule__Node_Impl__Group__1__Impl : ( 'Node' ) ;
    public final void rule__Node_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:617:1: ( ( 'Node' ) )
            // InternalSPDSL.g:618:1: ( 'Node' )
            {
            // InternalSPDSL.g:618:1: ( 'Node' )
            // InternalSPDSL.g:619:2: 'Node'
            {
             before(grammarAccess.getNode_ImplAccess().getNodeKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNode_ImplAccess().getNodeKeyword_1()); 

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
    // $ANTLR end "rule__Node_Impl__Group__1__Impl"


    // $ANTLR start "rule__Node_Impl__Group__2"
    // InternalSPDSL.g:628:1: rule__Node_Impl__Group__2 : rule__Node_Impl__Group__2__Impl ;
    public final void rule__Node_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:632:1: ( rule__Node_Impl__Group__2__Impl )
            // InternalSPDSL.g:633:2: rule__Node_Impl__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node_Impl__Group__2__Impl();

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
    // $ANTLR end "rule__Node_Impl__Group__2"


    // $ANTLR start "rule__Node_Impl__Group__2__Impl"
    // InternalSPDSL.g:639:1: rule__Node_Impl__Group__2__Impl : ( ( rule__Node_Impl__NameAssignment_2 ) ) ;
    public final void rule__Node_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:643:1: ( ( ( rule__Node_Impl__NameAssignment_2 ) ) )
            // InternalSPDSL.g:644:1: ( ( rule__Node_Impl__NameAssignment_2 ) )
            {
            // InternalSPDSL.g:644:1: ( ( rule__Node_Impl__NameAssignment_2 ) )
            // InternalSPDSL.g:645:2: ( rule__Node_Impl__NameAssignment_2 )
            {
             before(grammarAccess.getNode_ImplAccess().getNameAssignment_2()); 
            // InternalSPDSL.g:646:2: ( rule__Node_Impl__NameAssignment_2 )
            // InternalSPDSL.g:646:3: rule__Node_Impl__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Node_Impl__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNode_ImplAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Node_Impl__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalSPDSL.g:655:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:659:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalSPDSL.g:660:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

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
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalSPDSL.g:667:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:671:1: ( ( () ) )
            // InternalSPDSL.g:672:1: ( () )
            {
            // InternalSPDSL.g:672:1: ( () )
            // InternalSPDSL.g:673:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalSPDSL.g:674:2: ()
            // InternalSPDSL.g:674:3: 
            {
            }

             after(grammarAccess.getSensorAccess().getSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalSPDSL.g:682:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:686:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalSPDSL.g:687:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

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
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalSPDSL.g:694:1: rule__Sensor__Group__1__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:698:1: ( ( 'Sensor' ) )
            // InternalSPDSL.g:699:1: ( 'Sensor' )
            {
            // InternalSPDSL.g:699:1: ( 'Sensor' )
            // InternalSPDSL.g:700:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_1()); 

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
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalSPDSL.g:709:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:713:1: ( rule__Sensor__Group__2__Impl )
            // InternalSPDSL.g:714:2: rule__Sensor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2__Impl();

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
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalSPDSL.g:720:1: rule__Sensor__Group__2__Impl : ( ( rule__Sensor__NameAssignment_2 ) ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:724:1: ( ( ( rule__Sensor__NameAssignment_2 ) ) )
            // InternalSPDSL.g:725:1: ( ( rule__Sensor__NameAssignment_2 ) )
            {
            // InternalSPDSL.g:725:1: ( ( rule__Sensor__NameAssignment_2 ) )
            // InternalSPDSL.g:726:2: ( rule__Sensor__NameAssignment_2 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_2()); 
            // InternalSPDSL.g:727:2: ( rule__Sensor__NameAssignment_2 )
            // InternalSPDSL.g:727:3: rule__Sensor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Filter__Group__0"
    // InternalSPDSL.g:736:1: rule__Filter__Group__0 : rule__Filter__Group__0__Impl rule__Filter__Group__1 ;
    public final void rule__Filter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:740:1: ( rule__Filter__Group__0__Impl rule__Filter__Group__1 )
            // InternalSPDSL.g:741:2: rule__Filter__Group__0__Impl rule__Filter__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Filter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__1();

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
    // $ANTLR end "rule__Filter__Group__0"


    // $ANTLR start "rule__Filter__Group__0__Impl"
    // InternalSPDSL.g:748:1: rule__Filter__Group__0__Impl : ( () ) ;
    public final void rule__Filter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:752:1: ( ( () ) )
            // InternalSPDSL.g:753:1: ( () )
            {
            // InternalSPDSL.g:753:1: ( () )
            // InternalSPDSL.g:754:2: ()
            {
             before(grammarAccess.getFilterAccess().getFilterAction_0()); 
            // InternalSPDSL.g:755:2: ()
            // InternalSPDSL.g:755:3: 
            {
            }

             after(grammarAccess.getFilterAccess().getFilterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Group__0__Impl"


    // $ANTLR start "rule__Filter__Group__1"
    // InternalSPDSL.g:763:1: rule__Filter__Group__1 : rule__Filter__Group__1__Impl rule__Filter__Group__2 ;
    public final void rule__Filter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:767:1: ( rule__Filter__Group__1__Impl rule__Filter__Group__2 )
            // InternalSPDSL.g:768:2: rule__Filter__Group__1__Impl rule__Filter__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Filter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__2();

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
    // $ANTLR end "rule__Filter__Group__1"


    // $ANTLR start "rule__Filter__Group__1__Impl"
    // InternalSPDSL.g:775:1: rule__Filter__Group__1__Impl : ( 'Filter' ) ;
    public final void rule__Filter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:779:1: ( ( 'Filter' ) )
            // InternalSPDSL.g:780:1: ( 'Filter' )
            {
            // InternalSPDSL.g:780:1: ( 'Filter' )
            // InternalSPDSL.g:781:2: 'Filter'
            {
             before(grammarAccess.getFilterAccess().getFilterKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getFilterKeyword_1()); 

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
    // $ANTLR end "rule__Filter__Group__1__Impl"


    // $ANTLR start "rule__Filter__Group__2"
    // InternalSPDSL.g:790:1: rule__Filter__Group__2 : rule__Filter__Group__2__Impl rule__Filter__Group__3 ;
    public final void rule__Filter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:794:1: ( rule__Filter__Group__2__Impl rule__Filter__Group__3 )
            // InternalSPDSL.g:795:2: rule__Filter__Group__2__Impl rule__Filter__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Filter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__3();

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
    // $ANTLR end "rule__Filter__Group__2"


    // $ANTLR start "rule__Filter__Group__2__Impl"
    // InternalSPDSL.g:802:1: rule__Filter__Group__2__Impl : ( ( rule__Filter__NameAssignment_2 ) ) ;
    public final void rule__Filter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:806:1: ( ( ( rule__Filter__NameAssignment_2 ) ) )
            // InternalSPDSL.g:807:1: ( ( rule__Filter__NameAssignment_2 ) )
            {
            // InternalSPDSL.g:807:1: ( ( rule__Filter__NameAssignment_2 ) )
            // InternalSPDSL.g:808:2: ( rule__Filter__NameAssignment_2 )
            {
             before(grammarAccess.getFilterAccess().getNameAssignment_2()); 
            // InternalSPDSL.g:809:2: ( rule__Filter__NameAssignment_2 )
            // InternalSPDSL.g:809:3: rule__Filter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Filter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Filter__Group__2__Impl"


    // $ANTLR start "rule__Filter__Group__3"
    // InternalSPDSL.g:817:1: rule__Filter__Group__3 : rule__Filter__Group__3__Impl rule__Filter__Group__4 ;
    public final void rule__Filter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:821:1: ( rule__Filter__Group__3__Impl rule__Filter__Group__4 )
            // InternalSPDSL.g:822:2: rule__Filter__Group__3__Impl rule__Filter__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Filter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__4();

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
    // $ANTLR end "rule__Filter__Group__3"


    // $ANTLR start "rule__Filter__Group__3__Impl"
    // InternalSPDSL.g:829:1: rule__Filter__Group__3__Impl : ( '{' ) ;
    public final void rule__Filter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:833:1: ( ( '{' ) )
            // InternalSPDSL.g:834:1: ( '{' )
            {
            // InternalSPDSL.g:834:1: ( '{' )
            // InternalSPDSL.g:835:2: '{'
            {
             before(grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Filter__Group__3__Impl"


    // $ANTLR start "rule__Filter__Group__4"
    // InternalSPDSL.g:844:1: rule__Filter__Group__4 : rule__Filter__Group__4__Impl rule__Filter__Group__5 ;
    public final void rule__Filter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:848:1: ( rule__Filter__Group__4__Impl rule__Filter__Group__5 )
            // InternalSPDSL.g:849:2: rule__Filter__Group__4__Impl rule__Filter__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Filter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group__5();

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
    // $ANTLR end "rule__Filter__Group__4"


    // $ANTLR start "rule__Filter__Group__4__Impl"
    // InternalSPDSL.g:856:1: rule__Filter__Group__4__Impl : ( ( rule__Filter__Group_4__0 )? ) ;
    public final void rule__Filter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:860:1: ( ( ( rule__Filter__Group_4__0 )? ) )
            // InternalSPDSL.g:861:1: ( ( rule__Filter__Group_4__0 )? )
            {
            // InternalSPDSL.g:861:1: ( ( rule__Filter__Group_4__0 )? )
            // InternalSPDSL.g:862:2: ( rule__Filter__Group_4__0 )?
            {
             before(grammarAccess.getFilterAccess().getGroup_4()); 
            // InternalSPDSL.g:863:2: ( rule__Filter__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSPDSL.g:863:3: rule__Filter__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filter__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Filter__Group__4__Impl"


    // $ANTLR start "rule__Filter__Group__5"
    // InternalSPDSL.g:871:1: rule__Filter__Group__5 : rule__Filter__Group__5__Impl ;
    public final void rule__Filter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:875:1: ( rule__Filter__Group__5__Impl )
            // InternalSPDSL.g:876:2: rule__Filter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group__5__Impl();

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
    // $ANTLR end "rule__Filter__Group__5"


    // $ANTLR start "rule__Filter__Group__5__Impl"
    // InternalSPDSL.g:882:1: rule__Filter__Group__5__Impl : ( '}' ) ;
    public final void rule__Filter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:886:1: ( ( '}' ) )
            // InternalSPDSL.g:887:1: ( '}' )
            {
            // InternalSPDSL.g:887:1: ( '}' )
            // InternalSPDSL.g:888:2: '}'
            {
             before(grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Filter__Group__5__Impl"


    // $ANTLR start "rule__Filter__Group_4__0"
    // InternalSPDSL.g:898:1: rule__Filter__Group_4__0 : rule__Filter__Group_4__0__Impl rule__Filter__Group_4__1 ;
    public final void rule__Filter__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:902:1: ( rule__Filter__Group_4__0__Impl rule__Filter__Group_4__1 )
            // InternalSPDSL.g:903:2: rule__Filter__Group_4__0__Impl rule__Filter__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__Filter__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Filter__Group_4__1();

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
    // $ANTLR end "rule__Filter__Group_4__0"


    // $ANTLR start "rule__Filter__Group_4__0__Impl"
    // InternalSPDSL.g:910:1: rule__Filter__Group_4__0__Impl : ( 'previousNode' ) ;
    public final void rule__Filter__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:914:1: ( ( 'previousNode' ) )
            // InternalSPDSL.g:915:1: ( 'previousNode' )
            {
            // InternalSPDSL.g:915:1: ( 'previousNode' )
            // InternalSPDSL.g:916:2: 'previousNode'
            {
             before(grammarAccess.getFilterAccess().getPreviousNodeKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getPreviousNodeKeyword_4_0()); 

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
    // $ANTLR end "rule__Filter__Group_4__0__Impl"


    // $ANTLR start "rule__Filter__Group_4__1"
    // InternalSPDSL.g:925:1: rule__Filter__Group_4__1 : rule__Filter__Group_4__1__Impl ;
    public final void rule__Filter__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:929:1: ( rule__Filter__Group_4__1__Impl )
            // InternalSPDSL.g:930:2: rule__Filter__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Group_4__1__Impl();

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
    // $ANTLR end "rule__Filter__Group_4__1"


    // $ANTLR start "rule__Filter__Group_4__1__Impl"
    // InternalSPDSL.g:936:1: rule__Filter__Group_4__1__Impl : ( ( rule__Filter__PreviousNodeAssignment_4_1 ) ) ;
    public final void rule__Filter__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:940:1: ( ( ( rule__Filter__PreviousNodeAssignment_4_1 ) ) )
            // InternalSPDSL.g:941:1: ( ( rule__Filter__PreviousNodeAssignment_4_1 ) )
            {
            // InternalSPDSL.g:941:1: ( ( rule__Filter__PreviousNodeAssignment_4_1 ) )
            // InternalSPDSL.g:942:2: ( rule__Filter__PreviousNodeAssignment_4_1 )
            {
             before(grammarAccess.getFilterAccess().getPreviousNodeAssignment_4_1()); 
            // InternalSPDSL.g:943:2: ( rule__Filter__PreviousNodeAssignment_4_1 )
            // InternalSPDSL.g:943:3: rule__Filter__PreviousNodeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Filter__PreviousNodeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getPreviousNodeAssignment_4_1()); 

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
    // $ANTLR end "rule__Filter__Group_4__1__Impl"


    // $ANTLR start "rule__System__NodesAssignment_3_2"
    // InternalSPDSL.g:952:1: rule__System__NodesAssignment_3_2 : ( ruleNode ) ;
    public final void rule__System__NodesAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:956:1: ( ( ruleNode ) )
            // InternalSPDSL.g:957:2: ( ruleNode )
            {
            // InternalSPDSL.g:957:2: ( ruleNode )
            // InternalSPDSL.g:958:3: ruleNode
            {
             before(grammarAccess.getSystemAccess().getNodesNodeParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getNodesNodeParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__System__NodesAssignment_3_2"


    // $ANTLR start "rule__System__NodesAssignment_3_3_1"
    // InternalSPDSL.g:967:1: rule__System__NodesAssignment_3_3_1 : ( ruleNode ) ;
    public final void rule__System__NodesAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:971:1: ( ( ruleNode ) )
            // InternalSPDSL.g:972:2: ( ruleNode )
            {
            // InternalSPDSL.g:972:2: ( ruleNode )
            // InternalSPDSL.g:973:3: ruleNode
            {
             before(grammarAccess.getSystemAccess().getNodesNodeParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getSystemAccess().getNodesNodeParserRuleCall_3_3_1_0()); 

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
    // $ANTLR end "rule__System__NodesAssignment_3_3_1"


    // $ANTLR start "rule__Node_Impl__NameAssignment_2"
    // InternalSPDSL.g:982:1: rule__Node_Impl__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Node_Impl__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:986:1: ( ( ruleEString ) )
            // InternalSPDSL.g:987:2: ( ruleEString )
            {
            // InternalSPDSL.g:987:2: ( ruleEString )
            // InternalSPDSL.g:988:3: ruleEString
            {
             before(grammarAccess.getNode_ImplAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNode_ImplAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Node_Impl__NameAssignment_2"


    // $ANTLR start "rule__Sensor__NameAssignment_2"
    // InternalSPDSL.g:997:1: rule__Sensor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Sensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:1001:1: ( ( ruleEString ) )
            // InternalSPDSL.g:1002:2: ( ruleEString )
            {
            // InternalSPDSL.g:1002:2: ( ruleEString )
            // InternalSPDSL.g:1003:3: ruleEString
            {
             before(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Sensor__NameAssignment_2"


    // $ANTLR start "rule__Filter__NameAssignment_2"
    // InternalSPDSL.g:1012:1: rule__Filter__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Filter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:1016:1: ( ( ruleEString ) )
            // InternalSPDSL.g:1017:2: ( ruleEString )
            {
            // InternalSPDSL.g:1017:2: ( ruleEString )
            // InternalSPDSL.g:1018:3: ruleEString
            {
             before(grammarAccess.getFilterAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Filter__NameAssignment_2"


    // $ANTLR start "rule__Filter__PreviousNodeAssignment_4_1"
    // InternalSPDSL.g:1027:1: rule__Filter__PreviousNodeAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Filter__PreviousNodeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSPDSL.g:1031:1: ( ( ( ruleEString ) ) )
            // InternalSPDSL.g:1032:2: ( ( ruleEString ) )
            {
            // InternalSPDSL.g:1032:2: ( ( ruleEString ) )
            // InternalSPDSL.g:1033:3: ( ruleEString )
            {
             before(grammarAccess.getFilterAccess().getPreviousNodeNodeCrossReference_4_1_0()); 
            // InternalSPDSL.g:1034:3: ( ruleEString )
            // InternalSPDSL.g:1035:4: ruleEString
            {
             before(grammarAccess.getFilterAccess().getPreviousNodeNodeEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFilterAccess().getPreviousNodeNodeEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getFilterAccess().getPreviousNodeNodeCrossReference_4_1_0()); 

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
    // $ANTLR end "rule__Filter__PreviousNodeAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000082000L});

}