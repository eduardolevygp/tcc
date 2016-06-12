package org.xtext.ace.acedsl.parser.antlr.internal;

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
import org.xtext.ace.acedsl.services.AceDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAceDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Aplicativo'", "'{'", "'url'", "'}'", "'secao eventos'", "'secao membros'", "'secao disciplinas'", "'secao noticias'", "'Facebook'", "'estilo'", "'logo'", "'fonte'", "'corPrimaria'", "'corSecundaria'", "'corTerciaria'", "'disciplinas'", "'curso'", "'departamento'", "'periodo'", "'Normal'", "'Sans'", "'Serif'", "'Monospace'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAceDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAceDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAceDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAceDsl.g"; }



     	private AceDslGrammarAccess grammarAccess;

        public InternalAceDslParser(TokenStream input, AceDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Aplicativo";
       	}

       	@Override
       	protected AceDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleAplicativo"
    // InternalAceDsl.g:65:1: entryRuleAplicativo returns [EObject current=null] : iv_ruleAplicativo= ruleAplicativo EOF ;
    public final EObject entryRuleAplicativo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAplicativo = null;


        try {
            // InternalAceDsl.g:65:51: (iv_ruleAplicativo= ruleAplicativo EOF )
            // InternalAceDsl.g:66:2: iv_ruleAplicativo= ruleAplicativo EOF
            {
             newCompositeNode(grammarAccess.getAplicativoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAplicativo=ruleAplicativo();

            state._fsp--;

             current =iv_ruleAplicativo; 
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
    // $ANTLR end "entryRuleAplicativo"


    // $ANTLR start "ruleAplicativo"
    // InternalAceDsl.g:72:1: ruleAplicativo returns [EObject current=null] : (otherlv_0= 'Aplicativo' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' ) ;
    public final EObject ruleAplicativo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_nome_1_0 = null;

        AntlrDatatypeRuleToken lv_url_5_0 = null;

        EObject lv_secaoEventos_6_0 = null;

        EObject lv_secaoMembros_7_0 = null;

        EObject lv_secaoDisciplinas_8_0 = null;

        EObject lv_secaoNoticias_9_0 = null;

        EObject lv_estilo_10_0 = null;



        	enterRule();

        try {
            // InternalAceDsl.g:78:2: ( (otherlv_0= 'Aplicativo' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' ) )
            // InternalAceDsl.g:79:2: (otherlv_0= 'Aplicativo' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' )
            {
            // InternalAceDsl.g:79:2: (otherlv_0= 'Aplicativo' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}' )
            // InternalAceDsl.g:80:3: otherlv_0= 'Aplicativo' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) ) ) )+ {...}?) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAplicativoAccess().getAplicativoKeyword_0());
            		
            // InternalAceDsl.g:84:3: ( (lv_nome_1_0= ruleEString ) )
            // InternalAceDsl.g:85:4: (lv_nome_1_0= ruleEString )
            {
            // InternalAceDsl.g:85:4: (lv_nome_1_0= ruleEString )
            // InternalAceDsl.g:86:5: lv_nome_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAplicativoAccess().getNomeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_nome_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAplicativoRule());
            					}
            					set(
            						current,
            						"nome",
            						lv_nome_1_0,
            						"org.xtext.ace.acedsl.AceDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAplicativoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAceDsl.g:107:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) ) ) )+ {...}?) ) )
            // InternalAceDsl.g:108:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) ) ) )+ {...}?) )
            {
            // InternalAceDsl.g:108:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) ) ) )+ {...}?) )
            // InternalAceDsl.g:109:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAplicativoAccess().getUnorderedGroup_3());
            				
            // InternalAceDsl.g:112:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) ) ) )+ {...}?)
            // InternalAceDsl.g:113:6: ( ({...}? => ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) ) ) )+ {...}?
            {
            // InternalAceDsl.g:113:6: ( ({...}? => ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) ) ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=7;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == 13 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 2) ) {
                    alt1=3;
                }
                else if ( LA1_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 3) ) {
                    alt1=4;
                }
                else if ( LA1_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 4) ) {
                    alt1=5;
                }
                else if ( LA1_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 5) ) {
                    alt1=6;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAceDsl.g:114:4: ({...}? => ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalAceDsl.g:114:4: ({...}? => ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) ) )
            	    // InternalAceDsl.g:115:5: {...}? => ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAplicativo", "getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalAceDsl.g:115:107: ( ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) ) )
            	    // InternalAceDsl.g:116:6: ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalAceDsl.g:119:9: ({...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) ) )
            	    // InternalAceDsl.g:119:10: {...}? => (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAplicativo", "true");
            	    }
            	    // InternalAceDsl.g:119:19: (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )
            	    // InternalAceDsl.g:119:20: otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getAplicativoAccess().getUrlKeyword_3_0_0());
            	    								
            	    // InternalAceDsl.g:123:9: ( (lv_url_5_0= ruleEString ) )
            	    // InternalAceDsl.g:124:10: (lv_url_5_0= ruleEString )
            	    {
            	    // InternalAceDsl.g:124:10: (lv_url_5_0= ruleEString )
            	    // InternalAceDsl.g:125:11: lv_url_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getAplicativoAccess().getUrlEStringParserRuleCall_3_0_1_0());
            	    										
            	    pushFollow(FOLLOW_6);
            	    lv_url_5_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getAplicativoRule());
            	    											}
            	    											set(
            	    												current,
            	    												"url",
            	    												lv_url_5_0,
            	    												"org.xtext.ace.acedsl.AceDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAplicativoAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAceDsl.g:148:4: ({...}? => ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) ) )
            	    {
            	    // InternalAceDsl.g:148:4: ({...}? => ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) ) )
            	    // InternalAceDsl.g:149:5: {...}? => ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAplicativo", "getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalAceDsl.g:149:107: ( ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) ) )
            	    // InternalAceDsl.g:150:6: ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalAceDsl.g:153:9: ({...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) ) )
            	    // InternalAceDsl.g:153:10: {...}? => ( (lv_secaoEventos_6_0= ruleSecaoEventos ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAplicativo", "true");
            	    }
            	    // InternalAceDsl.g:153:19: ( (lv_secaoEventos_6_0= ruleSecaoEventos ) )
            	    // InternalAceDsl.g:153:20: (lv_secaoEventos_6_0= ruleSecaoEventos )
            	    {
            	    // InternalAceDsl.g:153:20: (lv_secaoEventos_6_0= ruleSecaoEventos )
            	    // InternalAceDsl.g:154:10: lv_secaoEventos_6_0= ruleSecaoEventos
            	    {

            	    										newCompositeNode(grammarAccess.getAplicativoAccess().getSecaoEventosSecaoEventosParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_6);
            	    lv_secaoEventos_6_0=ruleSecaoEventos();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAplicativoRule());
            	    										}
            	    										set(
            	    											current,
            	    											"secaoEventos",
            	    											lv_secaoEventos_6_0,
            	    											"org.xtext.ace.acedsl.AceDsl.SecaoEventos");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAplicativoAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAceDsl.g:176:4: ({...}? => ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) ) )
            	    {
            	    // InternalAceDsl.g:176:4: ({...}? => ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) ) )
            	    // InternalAceDsl.g:177:5: {...}? => ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleAplicativo", "getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalAceDsl.g:177:107: ( ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) ) )
            	    // InternalAceDsl.g:178:6: ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalAceDsl.g:181:9: ({...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) ) )
            	    // InternalAceDsl.g:181:10: {...}? => ( (lv_secaoMembros_7_0= ruleSecaoMembros ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAplicativo", "true");
            	    }
            	    // InternalAceDsl.g:181:19: ( (lv_secaoMembros_7_0= ruleSecaoMembros ) )
            	    // InternalAceDsl.g:181:20: (lv_secaoMembros_7_0= ruleSecaoMembros )
            	    {
            	    // InternalAceDsl.g:181:20: (lv_secaoMembros_7_0= ruleSecaoMembros )
            	    // InternalAceDsl.g:182:10: lv_secaoMembros_7_0= ruleSecaoMembros
            	    {

            	    										newCompositeNode(grammarAccess.getAplicativoAccess().getSecaoMembrosSecaoMembrosParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_6);
            	    lv_secaoMembros_7_0=ruleSecaoMembros();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAplicativoRule());
            	    										}
            	    										set(
            	    											current,
            	    											"secaoMembros",
            	    											lv_secaoMembros_7_0,
            	    											"org.xtext.ace.acedsl.AceDsl.SecaoMembros");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAplicativoAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAceDsl.g:204:4: ({...}? => ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) ) )
            	    {
            	    // InternalAceDsl.g:204:4: ({...}? => ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) ) )
            	    // InternalAceDsl.g:205:5: {...}? => ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleAplicativo", "getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalAceDsl.g:205:107: ( ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) ) )
            	    // InternalAceDsl.g:206:6: ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalAceDsl.g:209:9: ({...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) ) )
            	    // InternalAceDsl.g:209:10: {...}? => ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAplicativo", "true");
            	    }
            	    // InternalAceDsl.g:209:19: ( (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas ) )
            	    // InternalAceDsl.g:209:20: (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas )
            	    {
            	    // InternalAceDsl.g:209:20: (lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas )
            	    // InternalAceDsl.g:210:10: lv_secaoDisciplinas_8_0= ruleSecaoDisciplinas
            	    {

            	    										newCompositeNode(grammarAccess.getAplicativoAccess().getSecaoDisciplinasSecaoDisciplinasParserRuleCall_3_3_0());
            	    									
            	    pushFollow(FOLLOW_6);
            	    lv_secaoDisciplinas_8_0=ruleSecaoDisciplinas();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAplicativoRule());
            	    										}
            	    										set(
            	    											current,
            	    											"secaoDisciplinas",
            	    											lv_secaoDisciplinas_8_0,
            	    											"org.xtext.ace.acedsl.AceDsl.SecaoDisciplinas");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAplicativoAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAceDsl.g:232:4: ({...}? => ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) ) )
            	    {
            	    // InternalAceDsl.g:232:4: ({...}? => ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) ) )
            	    // InternalAceDsl.g:233:5: {...}? => ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleAplicativo", "getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalAceDsl.g:233:107: ( ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) ) )
            	    // InternalAceDsl.g:234:6: ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalAceDsl.g:237:9: ({...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) ) )
            	    // InternalAceDsl.g:237:10: {...}? => ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAplicativo", "true");
            	    }
            	    // InternalAceDsl.g:237:19: ( (lv_secaoNoticias_9_0= ruleSecaoNoticias ) )
            	    // InternalAceDsl.g:237:20: (lv_secaoNoticias_9_0= ruleSecaoNoticias )
            	    {
            	    // InternalAceDsl.g:237:20: (lv_secaoNoticias_9_0= ruleSecaoNoticias )
            	    // InternalAceDsl.g:238:10: lv_secaoNoticias_9_0= ruleSecaoNoticias
            	    {

            	    										newCompositeNode(grammarAccess.getAplicativoAccess().getSecaoNoticiasSecaoNoticiasParserRuleCall_3_4_0());
            	    									
            	    pushFollow(FOLLOW_6);
            	    lv_secaoNoticias_9_0=ruleSecaoNoticias();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAplicativoRule());
            	    										}
            	    										set(
            	    											current,
            	    											"secaoNoticias",
            	    											lv_secaoNoticias_9_0,
            	    											"org.xtext.ace.acedsl.AceDsl.SecaoNoticias");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAplicativoAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalAceDsl.g:260:4: ({...}? => ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) ) )
            	    {
            	    // InternalAceDsl.g:260:4: ({...}? => ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) ) )
            	    // InternalAceDsl.g:261:5: {...}? => ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleAplicativo", "getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalAceDsl.g:261:107: ( ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) ) )
            	    // InternalAceDsl.g:262:6: ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalAceDsl.g:265:9: ({...}? => ( (lv_estilo_10_0= ruleEstilo ) ) )
            	    // InternalAceDsl.g:265:10: {...}? => ( (lv_estilo_10_0= ruleEstilo ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAplicativo", "true");
            	    }
            	    // InternalAceDsl.g:265:19: ( (lv_estilo_10_0= ruleEstilo ) )
            	    // InternalAceDsl.g:265:20: (lv_estilo_10_0= ruleEstilo )
            	    {
            	    // InternalAceDsl.g:265:20: (lv_estilo_10_0= ruleEstilo )
            	    // InternalAceDsl.g:266:10: lv_estilo_10_0= ruleEstilo
            	    {

            	    										newCompositeNode(grammarAccess.getAplicativoAccess().getEstiloEstiloParserRuleCall_3_5_0());
            	    									
            	    pushFollow(FOLLOW_6);
            	    lv_estilo_10_0=ruleEstilo();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getAplicativoRule());
            	    										}
            	    										set(
            	    											current,
            	    											"estilo",
            	    											lv_estilo_10_0,
            	    											"org.xtext.ace.acedsl.AceDsl.Estilo");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAplicativoAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAplicativoAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleAplicativo", "getUnorderedGroupHelper().canLeave(grammarAccess.getAplicativoAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAplicativoAccess().getUnorderedGroup_3());
            				

            }

            otherlv_11=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAplicativoAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleAplicativo"


    // $ANTLR start "entryRuleSeparacaoDisciplinas"
    // InternalAceDsl.g:304:1: entryRuleSeparacaoDisciplinas returns [EObject current=null] : iv_ruleSeparacaoDisciplinas= ruleSeparacaoDisciplinas EOF ;
    public final EObject entryRuleSeparacaoDisciplinas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSeparacaoDisciplinas = null;


        try {
            // InternalAceDsl.g:304:61: (iv_ruleSeparacaoDisciplinas= ruleSeparacaoDisciplinas EOF )
            // InternalAceDsl.g:305:2: iv_ruleSeparacaoDisciplinas= ruleSeparacaoDisciplinas EOF
            {
             newCompositeNode(grammarAccess.getSeparacaoDisciplinasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSeparacaoDisciplinas=ruleSeparacaoDisciplinas();

            state._fsp--;

             current =iv_ruleSeparacaoDisciplinas; 
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
    // $ANTLR end "entryRuleSeparacaoDisciplinas"


    // $ANTLR start "ruleSeparacaoDisciplinas"
    // InternalAceDsl.g:311:1: ruleSeparacaoDisciplinas returns [EObject current=null] : (this_ListaCursos_0= ruleListaCursos | this_ListaDisciplinas_1= ruleListaDisciplinas | this_ListaDepartamentos_2= ruleListaDepartamentos | this_ListaPeriodos_3= ruleListaPeriodos ) ;
    public final EObject ruleSeparacaoDisciplinas() throws RecognitionException {
        EObject current = null;

        EObject this_ListaCursos_0 = null;

        EObject this_ListaDisciplinas_1 = null;

        EObject this_ListaDepartamentos_2 = null;

        EObject this_ListaPeriodos_3 = null;



        	enterRule();

        try {
            // InternalAceDsl.g:317:2: ( (this_ListaCursos_0= ruleListaCursos | this_ListaDisciplinas_1= ruleListaDisciplinas | this_ListaDepartamentos_2= ruleListaDepartamentos | this_ListaPeriodos_3= ruleListaPeriodos ) )
            // InternalAceDsl.g:318:2: (this_ListaCursos_0= ruleListaCursos | this_ListaDisciplinas_1= ruleListaDisciplinas | this_ListaDepartamentos_2= ruleListaDepartamentos | this_ListaPeriodos_3= ruleListaPeriodos )
            {
            // InternalAceDsl.g:318:2: (this_ListaCursos_0= ruleListaCursos | this_ListaDisciplinas_1= ruleListaDisciplinas | this_ListaDepartamentos_2= ruleListaDepartamentos | this_ListaPeriodos_3= ruleListaPeriodos )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAceDsl.g:319:3: this_ListaCursos_0= ruleListaCursos
                    {

                    			newCompositeNode(grammarAccess.getSeparacaoDisciplinasAccess().getListaCursosParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListaCursos_0=ruleListaCursos();

                    state._fsp--;


                    			current = this_ListaCursos_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAceDsl.g:328:3: this_ListaDisciplinas_1= ruleListaDisciplinas
                    {

                    			newCompositeNode(grammarAccess.getSeparacaoDisciplinasAccess().getListaDisciplinasParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListaDisciplinas_1=ruleListaDisciplinas();

                    state._fsp--;


                    			current = this_ListaDisciplinas_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAceDsl.g:337:3: this_ListaDepartamentos_2= ruleListaDepartamentos
                    {

                    			newCompositeNode(grammarAccess.getSeparacaoDisciplinasAccess().getListaDepartamentosParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListaDepartamentos_2=ruleListaDepartamentos();

                    state._fsp--;


                    			current = this_ListaDepartamentos_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAceDsl.g:346:3: this_ListaPeriodos_3= ruleListaPeriodos
                    {

                    			newCompositeNode(grammarAccess.getSeparacaoDisciplinasAccess().getListaPeriodosParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListaPeriodos_3=ruleListaPeriodos();

                    state._fsp--;


                    			current = this_ListaPeriodos_3;
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
    // $ANTLR end "ruleSeparacaoDisciplinas"


    // $ANTLR start "entryRuleOrganizacaoCurso"
    // InternalAceDsl.g:358:1: entryRuleOrganizacaoCurso returns [EObject current=null] : iv_ruleOrganizacaoCurso= ruleOrganizacaoCurso EOF ;
    public final EObject entryRuleOrganizacaoCurso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganizacaoCurso = null;


        try {
            // InternalAceDsl.g:358:57: (iv_ruleOrganizacaoCurso= ruleOrganizacaoCurso EOF )
            // InternalAceDsl.g:359:2: iv_ruleOrganizacaoCurso= ruleOrganizacaoCurso EOF
            {
             newCompositeNode(grammarAccess.getOrganizacaoCursoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrganizacaoCurso=ruleOrganizacaoCurso();

            state._fsp--;

             current =iv_ruleOrganizacaoCurso; 
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
    // $ANTLR end "entryRuleOrganizacaoCurso"


    // $ANTLR start "ruleOrganizacaoCurso"
    // InternalAceDsl.g:365:1: ruleOrganizacaoCurso returns [EObject current=null] : (this_ListaDisciplinas_0= ruleListaDisciplinas | this_ListaPeriodos_1= ruleListaPeriodos ) ;
    public final EObject ruleOrganizacaoCurso() throws RecognitionException {
        EObject current = null;

        EObject this_ListaDisciplinas_0 = null;

        EObject this_ListaPeriodos_1 = null;



        	enterRule();

        try {
            // InternalAceDsl.g:371:2: ( (this_ListaDisciplinas_0= ruleListaDisciplinas | this_ListaPeriodos_1= ruleListaPeriodos ) )
            // InternalAceDsl.g:372:2: (this_ListaDisciplinas_0= ruleListaDisciplinas | this_ListaPeriodos_1= ruleListaPeriodos )
            {
            // InternalAceDsl.g:372:2: (this_ListaDisciplinas_0= ruleListaDisciplinas | this_ListaPeriodos_1= ruleListaPeriodos )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            else if ( (LA3_0==29) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAceDsl.g:373:3: this_ListaDisciplinas_0= ruleListaDisciplinas
                    {

                    			newCompositeNode(grammarAccess.getOrganizacaoCursoAccess().getListaDisciplinasParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListaDisciplinas_0=ruleListaDisciplinas();

                    state._fsp--;


                    			current = this_ListaDisciplinas_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAceDsl.g:382:3: this_ListaPeriodos_1= ruleListaPeriodos
                    {

                    			newCompositeNode(grammarAccess.getOrganizacaoCursoAccess().getListaPeriodosParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListaPeriodos_1=ruleListaPeriodos();

                    state._fsp--;


                    			current = this_ListaPeriodos_1;
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
    // $ANTLR end "ruleOrganizacaoCurso"


    // $ANTLR start "entryRuleOrganizacaoDepartamento"
    // InternalAceDsl.g:394:1: entryRuleOrganizacaoDepartamento returns [EObject current=null] : iv_ruleOrganizacaoDepartamento= ruleOrganizacaoDepartamento EOF ;
    public final EObject entryRuleOrganizacaoDepartamento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganizacaoDepartamento = null;


        try {
            // InternalAceDsl.g:394:64: (iv_ruleOrganizacaoDepartamento= ruleOrganizacaoDepartamento EOF )
            // InternalAceDsl.g:395:2: iv_ruleOrganizacaoDepartamento= ruleOrganizacaoDepartamento EOF
            {
             newCompositeNode(grammarAccess.getOrganizacaoDepartamentoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrganizacaoDepartamento=ruleOrganizacaoDepartamento();

            state._fsp--;

             current =iv_ruleOrganizacaoDepartamento; 
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
    // $ANTLR end "entryRuleOrganizacaoDepartamento"


    // $ANTLR start "ruleOrganizacaoDepartamento"
    // InternalAceDsl.g:401:1: ruleOrganizacaoDepartamento returns [EObject current=null] : (this_ListaCursos_0= ruleListaCursos | this_ListaDisciplinas_1= ruleListaDisciplinas | this_ListaPeriodos_2= ruleListaPeriodos ) ;
    public final EObject ruleOrganizacaoDepartamento() throws RecognitionException {
        EObject current = null;

        EObject this_ListaCursos_0 = null;

        EObject this_ListaDisciplinas_1 = null;

        EObject this_ListaPeriodos_2 = null;



        	enterRule();

        try {
            // InternalAceDsl.g:407:2: ( (this_ListaCursos_0= ruleListaCursos | this_ListaDisciplinas_1= ruleListaDisciplinas | this_ListaPeriodos_2= ruleListaPeriodos ) )
            // InternalAceDsl.g:408:2: (this_ListaCursos_0= ruleListaCursos | this_ListaDisciplinas_1= ruleListaDisciplinas | this_ListaPeriodos_2= ruleListaPeriodos )
            {
            // InternalAceDsl.g:408:2: (this_ListaCursos_0= ruleListaCursos | this_ListaDisciplinas_1= ruleListaDisciplinas | this_ListaPeriodos_2= ruleListaPeriodos )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 29:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalAceDsl.g:409:3: this_ListaCursos_0= ruleListaCursos
                    {

                    			newCompositeNode(grammarAccess.getOrganizacaoDepartamentoAccess().getListaCursosParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListaCursos_0=ruleListaCursos();

                    state._fsp--;


                    			current = this_ListaCursos_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAceDsl.g:418:3: this_ListaDisciplinas_1= ruleListaDisciplinas
                    {

                    			newCompositeNode(grammarAccess.getOrganizacaoDepartamentoAccess().getListaDisciplinasParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListaDisciplinas_1=ruleListaDisciplinas();

                    state._fsp--;


                    			current = this_ListaDisciplinas_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAceDsl.g:427:3: this_ListaPeriodos_2= ruleListaPeriodos
                    {

                    			newCompositeNode(grammarAccess.getOrganizacaoDepartamentoAccess().getListaPeriodosParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListaPeriodos_2=ruleListaPeriodos();

                    state._fsp--;


                    			current = this_ListaPeriodos_2;
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
    // $ANTLR end "ruleOrganizacaoDepartamento"


    // $ANTLR start "entryRuleEString"
    // InternalAceDsl.g:439:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAceDsl.g:439:47: (iv_ruleEString= ruleEString EOF )
            // InternalAceDsl.g:440:2: iv_ruleEString= ruleEString EOF
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
    // InternalAceDsl.g:446:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAceDsl.g:452:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAceDsl.g:453:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAceDsl.g:453:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAceDsl.g:454:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAceDsl.g:462:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleSecaoEventos"
    // InternalAceDsl.g:473:1: entryRuleSecaoEventos returns [EObject current=null] : iv_ruleSecaoEventos= ruleSecaoEventos EOF ;
    public final EObject entryRuleSecaoEventos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecaoEventos = null;


        try {
            // InternalAceDsl.g:473:53: (iv_ruleSecaoEventos= ruleSecaoEventos EOF )
            // InternalAceDsl.g:474:2: iv_ruleSecaoEventos= ruleSecaoEventos EOF
            {
             newCompositeNode(grammarAccess.getSecaoEventosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecaoEventos=ruleSecaoEventos();

            state._fsp--;

             current =iv_ruleSecaoEventos; 
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
    // $ANTLR end "entryRuleSecaoEventos"


    // $ANTLR start "ruleSecaoEventos"
    // InternalAceDsl.g:480:1: ruleSecaoEventos returns [EObject current=null] : (otherlv_0= 'secao eventos' ( (lv_nome_1_0= ruleEString ) ) ) ;
    public final EObject ruleSecaoEventos() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_nome_1_0 = null;



        	enterRule();

        try {
            // InternalAceDsl.g:486:2: ( (otherlv_0= 'secao eventos' ( (lv_nome_1_0= ruleEString ) ) ) )
            // InternalAceDsl.g:487:2: (otherlv_0= 'secao eventos' ( (lv_nome_1_0= ruleEString ) ) )
            {
            // InternalAceDsl.g:487:2: (otherlv_0= 'secao eventos' ( (lv_nome_1_0= ruleEString ) ) )
            // InternalAceDsl.g:488:3: otherlv_0= 'secao eventos' ( (lv_nome_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSecaoEventosAccess().getSecaoEventosKeyword_0());
            		
            // InternalAceDsl.g:492:3: ( (lv_nome_1_0= ruleEString ) )
            // InternalAceDsl.g:493:4: (lv_nome_1_0= ruleEString )
            {
            // InternalAceDsl.g:493:4: (lv_nome_1_0= ruleEString )
            // InternalAceDsl.g:494:5: lv_nome_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSecaoEventosAccess().getNomeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_nome_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecaoEventosRule());
            					}
            					set(
            						current,
            						"nome",
            						lv_nome_1_0,
            						"org.xtext.ace.acedsl.AceDsl.EString");
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
    // $ANTLR end "ruleSecaoEventos"


    // $ANTLR start "entryRuleSecaoMembros"
    // InternalAceDsl.g:515:1: entryRuleSecaoMembros returns [EObject current=null] : iv_ruleSecaoMembros= ruleSecaoMembros EOF ;
    public final EObject entryRuleSecaoMembros() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecaoMembros = null;


        try {
            // InternalAceDsl.g:515:53: (iv_ruleSecaoMembros= ruleSecaoMembros EOF )
            // InternalAceDsl.g:516:2: iv_ruleSecaoMembros= ruleSecaoMembros EOF
            {
             newCompositeNode(grammarAccess.getSecaoMembrosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecaoMembros=ruleSecaoMembros();

            state._fsp--;

             current =iv_ruleSecaoMembros; 
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
    // $ANTLR end "entryRuleSecaoMembros"


    // $ANTLR start "ruleSecaoMembros"
    // InternalAceDsl.g:522:1: ruleSecaoMembros returns [EObject current=null] : (otherlv_0= 'secao membros' ( (lv_nome_1_0= ruleEString ) ) ) ;
    public final EObject ruleSecaoMembros() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_nome_1_0 = null;



        	enterRule();

        try {
            // InternalAceDsl.g:528:2: ( (otherlv_0= 'secao membros' ( (lv_nome_1_0= ruleEString ) ) ) )
            // InternalAceDsl.g:529:2: (otherlv_0= 'secao membros' ( (lv_nome_1_0= ruleEString ) ) )
            {
            // InternalAceDsl.g:529:2: (otherlv_0= 'secao membros' ( (lv_nome_1_0= ruleEString ) ) )
            // InternalAceDsl.g:530:3: otherlv_0= 'secao membros' ( (lv_nome_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSecaoMembrosAccess().getSecaoMembrosKeyword_0());
            		
            // InternalAceDsl.g:534:3: ( (lv_nome_1_0= ruleEString ) )
            // InternalAceDsl.g:535:4: (lv_nome_1_0= ruleEString )
            {
            // InternalAceDsl.g:535:4: (lv_nome_1_0= ruleEString )
            // InternalAceDsl.g:536:5: lv_nome_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSecaoMembrosAccess().getNomeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_nome_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecaoMembrosRule());
            					}
            					set(
            						current,
            						"nome",
            						lv_nome_1_0,
            						"org.xtext.ace.acedsl.AceDsl.EString");
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
    // $ANTLR end "ruleSecaoMembros"


    // $ANTLR start "entryRuleSecaoDisciplinas"
    // InternalAceDsl.g:557:1: entryRuleSecaoDisciplinas returns [EObject current=null] : iv_ruleSecaoDisciplinas= ruleSecaoDisciplinas EOF ;
    public final EObject entryRuleSecaoDisciplinas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecaoDisciplinas = null;


        try {
            // InternalAceDsl.g:557:57: (iv_ruleSecaoDisciplinas= ruleSecaoDisciplinas EOF )
            // InternalAceDsl.g:558:2: iv_ruleSecaoDisciplinas= ruleSecaoDisciplinas EOF
            {
             newCompositeNode(grammarAccess.getSecaoDisciplinasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecaoDisciplinas=ruleSecaoDisciplinas();

            state._fsp--;

             current =iv_ruleSecaoDisciplinas; 
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
    // $ANTLR end "entryRuleSecaoDisciplinas"


    // $ANTLR start "ruleSecaoDisciplinas"
    // InternalAceDsl.g:564:1: ruleSecaoDisciplinas returns [EObject current=null] : (otherlv_0= 'secao disciplinas' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_separacaoDisciplinas_3_0= ruleSeparacaoDisciplinas ) ) otherlv_4= '}' ) ;
    public final EObject ruleSecaoDisciplinas() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nome_1_0 = null;

        EObject lv_separacaoDisciplinas_3_0 = null;



        	enterRule();

        try {
            // InternalAceDsl.g:570:2: ( (otherlv_0= 'secao disciplinas' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_separacaoDisciplinas_3_0= ruleSeparacaoDisciplinas ) ) otherlv_4= '}' ) )
            // InternalAceDsl.g:571:2: (otherlv_0= 'secao disciplinas' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_separacaoDisciplinas_3_0= ruleSeparacaoDisciplinas ) ) otherlv_4= '}' )
            {
            // InternalAceDsl.g:571:2: (otherlv_0= 'secao disciplinas' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_separacaoDisciplinas_3_0= ruleSeparacaoDisciplinas ) ) otherlv_4= '}' )
            // InternalAceDsl.g:572:3: otherlv_0= 'secao disciplinas' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_separacaoDisciplinas_3_0= ruleSeparacaoDisciplinas ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSecaoDisciplinasAccess().getSecaoDisciplinasKeyword_0());
            		
            // InternalAceDsl.g:576:3: ( (lv_nome_1_0= ruleEString ) )
            // InternalAceDsl.g:577:4: (lv_nome_1_0= ruleEString )
            {
            // InternalAceDsl.g:577:4: (lv_nome_1_0= ruleEString )
            // InternalAceDsl.g:578:5: lv_nome_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSecaoDisciplinasAccess().getNomeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_nome_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecaoDisciplinasRule());
            					}
            					set(
            						current,
            						"nome",
            						lv_nome_1_0,
            						"org.xtext.ace.acedsl.AceDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSecaoDisciplinasAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAceDsl.g:599:3: ( (lv_separacaoDisciplinas_3_0= ruleSeparacaoDisciplinas ) )
            // InternalAceDsl.g:600:4: (lv_separacaoDisciplinas_3_0= ruleSeparacaoDisciplinas )
            {
            // InternalAceDsl.g:600:4: (lv_separacaoDisciplinas_3_0= ruleSeparacaoDisciplinas )
            // InternalAceDsl.g:601:5: lv_separacaoDisciplinas_3_0= ruleSeparacaoDisciplinas
            {

            					newCompositeNode(grammarAccess.getSecaoDisciplinasAccess().getSeparacaoDisciplinasSeparacaoDisciplinasParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_separacaoDisciplinas_3_0=ruleSeparacaoDisciplinas();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecaoDisciplinasRule());
            					}
            					set(
            						current,
            						"separacaoDisciplinas",
            						lv_separacaoDisciplinas_3_0,
            						"org.xtext.ace.acedsl.AceDsl.SeparacaoDisciplinas");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSecaoDisciplinasAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSecaoDisciplinas"


    // $ANTLR start "entryRuleSecaoNoticias"
    // InternalAceDsl.g:626:1: entryRuleSecaoNoticias returns [EObject current=null] : iv_ruleSecaoNoticias= ruleSecaoNoticias EOF ;
    public final EObject entryRuleSecaoNoticias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecaoNoticias = null;


        try {
            // InternalAceDsl.g:626:54: (iv_ruleSecaoNoticias= ruleSecaoNoticias EOF )
            // InternalAceDsl.g:627:2: iv_ruleSecaoNoticias= ruleSecaoNoticias EOF
            {
             newCompositeNode(grammarAccess.getSecaoNoticiasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecaoNoticias=ruleSecaoNoticias();

            state._fsp--;

             current =iv_ruleSecaoNoticias; 
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
    // $ANTLR end "entryRuleSecaoNoticias"


    // $ANTLR start "ruleSecaoNoticias"
    // InternalAceDsl.g:633:1: ruleSecaoNoticias returns [EObject current=null] : (otherlv_0= 'secao noticias' ( (lv_nome_1_0= ruleEString ) ) (otherlv_2= '{' (otherlv_3= 'Facebook' ( (lv_Facebook_4_0= ruleEString ) ) )? otherlv_5= '}' )? ) ;
    public final EObject ruleSecaoNoticias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_nome_1_0 = null;

        AntlrDatatypeRuleToken lv_Facebook_4_0 = null;



        	enterRule();

        try {
            // InternalAceDsl.g:639:2: ( (otherlv_0= 'secao noticias' ( (lv_nome_1_0= ruleEString ) ) (otherlv_2= '{' (otherlv_3= 'Facebook' ( (lv_Facebook_4_0= ruleEString ) ) )? otherlv_5= '}' )? ) )
            // InternalAceDsl.g:640:2: (otherlv_0= 'secao noticias' ( (lv_nome_1_0= ruleEString ) ) (otherlv_2= '{' (otherlv_3= 'Facebook' ( (lv_Facebook_4_0= ruleEString ) ) )? otherlv_5= '}' )? )
            {
            // InternalAceDsl.g:640:2: (otherlv_0= 'secao noticias' ( (lv_nome_1_0= ruleEString ) ) (otherlv_2= '{' (otherlv_3= 'Facebook' ( (lv_Facebook_4_0= ruleEString ) ) )? otherlv_5= '}' )? )
            // InternalAceDsl.g:641:3: otherlv_0= 'secao noticias' ( (lv_nome_1_0= ruleEString ) ) (otherlv_2= '{' (otherlv_3= 'Facebook' ( (lv_Facebook_4_0= ruleEString ) ) )? otherlv_5= '}' )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSecaoNoticiasAccess().getSecaoNoticiasKeyword_0());
            		
            // InternalAceDsl.g:645:3: ( (lv_nome_1_0= ruleEString ) )
            // InternalAceDsl.g:646:4: (lv_nome_1_0= ruleEString )
            {
            // InternalAceDsl.g:646:4: (lv_nome_1_0= ruleEString )
            // InternalAceDsl.g:647:5: lv_nome_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSecaoNoticiasAccess().getNomeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_nome_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecaoNoticiasRule());
            					}
            					set(
            						current,
            						"nome",
            						lv_nome_1_0,
            						"org.xtext.ace.acedsl.AceDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAceDsl.g:664:3: (otherlv_2= '{' (otherlv_3= 'Facebook' ( (lv_Facebook_4_0= ruleEString ) ) )? otherlv_5= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAceDsl.g:665:4: otherlv_2= '{' (otherlv_3= 'Facebook' ( (lv_Facebook_4_0= ruleEString ) ) )? otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getSecaoNoticiasAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    // InternalAceDsl.g:669:4: (otherlv_3= 'Facebook' ( (lv_Facebook_4_0= ruleEString ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==19) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalAceDsl.g:670:5: otherlv_3= 'Facebook' ( (lv_Facebook_4_0= ruleEString ) )
                            {
                            otherlv_3=(Token)match(input,19,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getSecaoNoticiasAccess().getFacebookKeyword_2_1_0());
                            				
                            // InternalAceDsl.g:674:5: ( (lv_Facebook_4_0= ruleEString ) )
                            // InternalAceDsl.g:675:6: (lv_Facebook_4_0= ruleEString )
                            {
                            // InternalAceDsl.g:675:6: (lv_Facebook_4_0= ruleEString )
                            // InternalAceDsl.g:676:7: lv_Facebook_4_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getSecaoNoticiasAccess().getFacebookEStringParserRuleCall_2_1_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_Facebook_4_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSecaoNoticiasRule());
                            							}
                            							set(
                            								current,
                            								"Facebook",
                            								lv_Facebook_4_0,
                            								"org.xtext.ace.acedsl.AceDsl.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSecaoNoticiasAccess().getRightCurlyBracketKeyword_2_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleSecaoNoticias"


    // $ANTLR start "entryRuleEstilo"
    // InternalAceDsl.g:703:1: entryRuleEstilo returns [EObject current=null] : iv_ruleEstilo= ruleEstilo EOF ;
    public final EObject entryRuleEstilo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstilo = null;


        try {
            // InternalAceDsl.g:703:47: (iv_ruleEstilo= ruleEstilo EOF )
            // InternalAceDsl.g:704:2: iv_ruleEstilo= ruleEstilo EOF
            {
             newCompositeNode(grammarAccess.getEstiloRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEstilo=ruleEstilo();

            state._fsp--;

             current =iv_ruleEstilo; 
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
    // $ANTLR end "entryRuleEstilo"


    // $ANTLR start "ruleEstilo"
    // InternalAceDsl.g:710:1: ruleEstilo returns [EObject current=null] : (otherlv_0= 'estilo' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) ;
    public final EObject ruleEstilo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_logo_4_0 = null;

        Enumerator lv_fonte_6_0 = null;

        AntlrDatatypeRuleToken lv_corPrimaria_8_0 = null;

        AntlrDatatypeRuleToken lv_corSecundaria_10_0 = null;

        AntlrDatatypeRuleToken lv_corTerciaria_12_0 = null;



        	enterRule();

        try {
            // InternalAceDsl.g:716:2: ( (otherlv_0= 'estilo' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' ) )
            // InternalAceDsl.g:717:2: (otherlv_0= 'estilo' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            {
            // InternalAceDsl.g:717:2: (otherlv_0= 'estilo' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}' )
            // InternalAceDsl.g:718:3: otherlv_0= 'estilo' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEstiloAccess().getEstiloKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getEstiloAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAceDsl.g:726:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) ) )
            // InternalAceDsl.g:727:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalAceDsl.g:727:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) ) ) )+ {...}?) )
            // InternalAceDsl.g:728:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEstiloAccess().getUnorderedGroup_2());
            				
            // InternalAceDsl.g:731:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) ) ) )+ {...}?)
            // InternalAceDsl.g:732:6: ( ({...}? => ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) ) ) )+ {...}?
            {
            // InternalAceDsl.g:732:6: ( ({...}? => ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=6;
                int LA8_0 = input.LA(1);

                if ( LA8_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 1) ) {
                    alt8=2;
                }
                else if ( LA8_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 2) ) {
                    alt8=3;
                }
                else if ( LA8_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 3) ) {
                    alt8=4;
                }
                else if ( LA8_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 4) ) {
                    alt8=5;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAceDsl.g:733:4: ({...}? => ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalAceDsl.g:733:4: ({...}? => ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) ) )
            	    // InternalAceDsl.g:734:5: {...}? => ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEstilo", "getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalAceDsl.g:734:103: ( ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) ) )
            	    // InternalAceDsl.g:735:6: ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalAceDsl.g:738:9: ({...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) ) )
            	    // InternalAceDsl.g:738:10: {...}? => (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEstilo", "true");
            	    }
            	    // InternalAceDsl.g:738:19: (otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) ) )
            	    // InternalAceDsl.g:738:20: otherlv_3= 'logo' ( (lv_logo_4_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getEstiloAccess().getLogoKeyword_2_0_0());
            	    								
            	    // InternalAceDsl.g:742:9: ( (lv_logo_4_0= ruleEString ) )
            	    // InternalAceDsl.g:743:10: (lv_logo_4_0= ruleEString )
            	    {
            	    // InternalAceDsl.g:743:10: (lv_logo_4_0= ruleEString )
            	    // InternalAceDsl.g:744:11: lv_logo_4_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getEstiloAccess().getLogoEStringParserRuleCall_2_0_1_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_logo_4_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEstiloRule());
            	    											}
            	    											set(
            	    												current,
            	    												"logo",
            	    												lv_logo_4_0,
            	    												"org.xtext.ace.acedsl.AceDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEstiloAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalAceDsl.g:767:4: ({...}? => ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) ) )
            	    {
            	    // InternalAceDsl.g:767:4: ({...}? => ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) ) )
            	    // InternalAceDsl.g:768:5: {...}? => ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEstilo", "getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalAceDsl.g:768:103: ( ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) ) )
            	    // InternalAceDsl.g:769:6: ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalAceDsl.g:772:9: ({...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) ) )
            	    // InternalAceDsl.g:772:10: {...}? => (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEstilo", "true");
            	    }
            	    // InternalAceDsl.g:772:19: (otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) ) )
            	    // InternalAceDsl.g:772:20: otherlv_5= 'fonte' ( (lv_fonte_6_0= ruleFonte ) )
            	    {
            	    otherlv_5=(Token)match(input,22,FOLLOW_13); 

            	    									newLeafNode(otherlv_5, grammarAccess.getEstiloAccess().getFonteKeyword_2_1_0());
            	    								
            	    // InternalAceDsl.g:776:9: ( (lv_fonte_6_0= ruleFonte ) )
            	    // InternalAceDsl.g:777:10: (lv_fonte_6_0= ruleFonte )
            	    {
            	    // InternalAceDsl.g:777:10: (lv_fonte_6_0= ruleFonte )
            	    // InternalAceDsl.g:778:11: lv_fonte_6_0= ruleFonte
            	    {

            	    											newCompositeNode(grammarAccess.getEstiloAccess().getFonteFonteEnumRuleCall_2_1_1_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_fonte_6_0=ruleFonte();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEstiloRule());
            	    											}
            	    											set(
            	    												current,
            	    												"fonte",
            	    												lv_fonte_6_0,
            	    												"org.xtext.ace.acedsl.AceDsl.Fonte");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEstiloAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalAceDsl.g:801:4: ({...}? => ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalAceDsl.g:801:4: ({...}? => ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) ) )
            	    // InternalAceDsl.g:802:5: {...}? => ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEstilo", "getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalAceDsl.g:802:103: ( ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) ) )
            	    // InternalAceDsl.g:803:6: ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalAceDsl.g:806:9: ({...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) ) )
            	    // InternalAceDsl.g:806:10: {...}? => (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEstilo", "true");
            	    }
            	    // InternalAceDsl.g:806:19: (otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) ) )
            	    // InternalAceDsl.g:806:20: otherlv_7= 'corPrimaria' ( (lv_corPrimaria_8_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getEstiloAccess().getCorPrimariaKeyword_2_2_0());
            	    								
            	    // InternalAceDsl.g:810:9: ( (lv_corPrimaria_8_0= ruleEString ) )
            	    // InternalAceDsl.g:811:10: (lv_corPrimaria_8_0= ruleEString )
            	    {
            	    // InternalAceDsl.g:811:10: (lv_corPrimaria_8_0= ruleEString )
            	    // InternalAceDsl.g:812:11: lv_corPrimaria_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getEstiloAccess().getCorPrimariaEStringParserRuleCall_2_2_1_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_corPrimaria_8_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEstiloRule());
            	    											}
            	    											set(
            	    												current,
            	    												"corPrimaria",
            	    												lv_corPrimaria_8_0,
            	    												"org.xtext.ace.acedsl.AceDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEstiloAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalAceDsl.g:835:4: ({...}? => ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalAceDsl.g:835:4: ({...}? => ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) ) )
            	    // InternalAceDsl.g:836:5: {...}? => ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEstilo", "getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalAceDsl.g:836:103: ( ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) ) )
            	    // InternalAceDsl.g:837:6: ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalAceDsl.g:840:9: ({...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) ) )
            	    // InternalAceDsl.g:840:10: {...}? => (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEstilo", "true");
            	    }
            	    // InternalAceDsl.g:840:19: (otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) ) )
            	    // InternalAceDsl.g:840:20: otherlv_9= 'corSecundaria' ( (lv_corSecundaria_10_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,24,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getEstiloAccess().getCorSecundariaKeyword_2_3_0());
            	    								
            	    // InternalAceDsl.g:844:9: ( (lv_corSecundaria_10_0= ruleEString ) )
            	    // InternalAceDsl.g:845:10: (lv_corSecundaria_10_0= ruleEString )
            	    {
            	    // InternalAceDsl.g:845:10: (lv_corSecundaria_10_0= ruleEString )
            	    // InternalAceDsl.g:846:11: lv_corSecundaria_10_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getEstiloAccess().getCorSecundariaEStringParserRuleCall_2_3_1_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_corSecundaria_10_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEstiloRule());
            	    											}
            	    											set(
            	    												current,
            	    												"corSecundaria",
            	    												lv_corSecundaria_10_0,
            	    												"org.xtext.ace.acedsl.AceDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEstiloAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalAceDsl.g:869:4: ({...}? => ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalAceDsl.g:869:4: ({...}? => ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) ) )
            	    // InternalAceDsl.g:870:5: {...}? => ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEstilo", "getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalAceDsl.g:870:103: ( ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) ) )
            	    // InternalAceDsl.g:871:6: ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalAceDsl.g:874:9: ({...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) ) )
            	    // InternalAceDsl.g:874:10: {...}? => (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEstilo", "true");
            	    }
            	    // InternalAceDsl.g:874:19: (otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) ) )
            	    // InternalAceDsl.g:874:20: otherlv_11= 'corTerciaria' ( (lv_corTerciaria_12_0= ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,25,FOLLOW_3); 

            	    									newLeafNode(otherlv_11, grammarAccess.getEstiloAccess().getCorTerciariaKeyword_2_4_0());
            	    								
            	    // InternalAceDsl.g:878:9: ( (lv_corTerciaria_12_0= ruleEString ) )
            	    // InternalAceDsl.g:879:10: (lv_corTerciaria_12_0= ruleEString )
            	    {
            	    // InternalAceDsl.g:879:10: (lv_corTerciaria_12_0= ruleEString )
            	    // InternalAceDsl.g:880:11: lv_corTerciaria_12_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getEstiloAccess().getCorTerciariaEStringParserRuleCall_2_4_1_0());
            	    										
            	    pushFollow(FOLLOW_12);
            	    lv_corTerciaria_12_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEstiloRule());
            	    											}
            	    											set(
            	    												current,
            	    												"corTerciaria",
            	    												lv_corTerciaria_12_0,
            	    												"org.xtext.ace.acedsl.AceDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEstiloAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEstiloAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleEstilo", "getUnorderedGroupHelper().canLeave(grammarAccess.getEstiloAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEstiloAccess().getUnorderedGroup_2());
            				

            }

            otherlv_13=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getEstiloAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleEstilo"


    // $ANTLR start "entryRuleListaCursos"
    // InternalAceDsl.g:919:1: entryRuleListaCursos returns [EObject current=null] : iv_ruleListaCursos= ruleListaCursos EOF ;
    public final EObject entryRuleListaCursos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListaCursos = null;


        try {
            // InternalAceDsl.g:919:52: (iv_ruleListaCursos= ruleListaCursos EOF )
            // InternalAceDsl.g:920:2: iv_ruleListaCursos= ruleListaCursos EOF
            {
             newCompositeNode(grammarAccess.getListaCursosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListaCursos=ruleListaCursos();

            state._fsp--;

             current =iv_ruleListaCursos; 
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
    // $ANTLR end "entryRuleListaCursos"


    // $ANTLR start "ruleListaCursos"
    // InternalAceDsl.g:926:1: ruleListaCursos returns [EObject current=null] : ( ( (lv_curso_0_0= ruleCurso ) ) ( (lv_curso_1_0= ruleCurso ) )* ) ;
    public final EObject ruleListaCursos() throws RecognitionException {
        EObject current = null;

        EObject lv_curso_0_0 = null;

        EObject lv_curso_1_0 = null;



        	enterRule();

        try {
            // InternalAceDsl.g:932:2: ( ( ( (lv_curso_0_0= ruleCurso ) ) ( (lv_curso_1_0= ruleCurso ) )* ) )
            // InternalAceDsl.g:933:2: ( ( (lv_curso_0_0= ruleCurso ) ) ( (lv_curso_1_0= ruleCurso ) )* )
            {
            // InternalAceDsl.g:933:2: ( ( (lv_curso_0_0= ruleCurso ) ) ( (lv_curso_1_0= ruleCurso ) )* )
            // InternalAceDsl.g:934:3: ( (lv_curso_0_0= ruleCurso ) ) ( (lv_curso_1_0= ruleCurso ) )*
            {
            // InternalAceDsl.g:934:3: ( (lv_curso_0_0= ruleCurso ) )
            // InternalAceDsl.g:935:4: (lv_curso_0_0= ruleCurso )
            {
            // InternalAceDsl.g:935:4: (lv_curso_0_0= ruleCurso )
            // InternalAceDsl.g:936:5: lv_curso_0_0= ruleCurso
            {

            					newCompositeNode(grammarAccess.getListaCursosAccess().getCursoCursoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_curso_0_0=ruleCurso();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListaCursosRule());
            					}
            					add(
            						current,
            						"curso",
            						lv_curso_0_0,
            						"org.xtext.ace.acedsl.AceDsl.Curso");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAceDsl.g:953:3: ( (lv_curso_1_0= ruleCurso ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAceDsl.g:954:4: (lv_curso_1_0= ruleCurso )
            	    {
            	    // InternalAceDsl.g:954:4: (lv_curso_1_0= ruleCurso )
            	    // InternalAceDsl.g:955:5: lv_curso_1_0= ruleCurso
            	    {

            	    					newCompositeNode(grammarAccess.getListaCursosAccess().getCursoCursoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_curso_1_0=ruleCurso();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListaCursosRule());
            	    					}
            	    					add(
            	    						current,
            	    						"curso",
            	    						lv_curso_1_0,
            	    						"org.xtext.ace.acedsl.AceDsl.Curso");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
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
    // $ANTLR end "ruleListaCursos"


    // $ANTLR start "entryRuleListaDisciplinas"
    // InternalAceDsl.g:976:1: entryRuleListaDisciplinas returns [EObject current=null] : iv_ruleListaDisciplinas= ruleListaDisciplinas EOF ;
    public final EObject entryRuleListaDisciplinas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListaDisciplinas = null;


        try {
            // InternalAceDsl.g:976:57: (iv_ruleListaDisciplinas= ruleListaDisciplinas EOF )
            // InternalAceDsl.g:977:2: iv_ruleListaDisciplinas= ruleListaDisciplinas EOF
            {
             newCompositeNode(grammarAccess.getListaDisciplinasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListaDisciplinas=ruleListaDisciplinas();

            state._fsp--;

             current =iv_ruleListaDisciplinas; 
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
    // $ANTLR end "entryRuleListaDisciplinas"


    // $ANTLR start "ruleListaDisciplinas"
    // InternalAceDsl.g:983:1: ruleListaDisciplinas returns [EObject current=null] : ( () otherlv_1= 'disciplinas' ) ;
    public final EObject ruleListaDisciplinas() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAceDsl.g:989:2: ( ( () otherlv_1= 'disciplinas' ) )
            // InternalAceDsl.g:990:2: ( () otherlv_1= 'disciplinas' )
            {
            // InternalAceDsl.g:990:2: ( () otherlv_1= 'disciplinas' )
            // InternalAceDsl.g:991:3: () otherlv_1= 'disciplinas'
            {
            // InternalAceDsl.g:991:3: ()
            // InternalAceDsl.g:992:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListaDisciplinasAccess().getListaDisciplinasAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getListaDisciplinasAccess().getDisciplinasKeyword_1());
            		

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
    // $ANTLR end "ruleListaDisciplinas"


    // $ANTLR start "entryRuleListaDepartamentos"
    // InternalAceDsl.g:1006:1: entryRuleListaDepartamentos returns [EObject current=null] : iv_ruleListaDepartamentos= ruleListaDepartamentos EOF ;
    public final EObject entryRuleListaDepartamentos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListaDepartamentos = null;


        try {
            // InternalAceDsl.g:1006:59: (iv_ruleListaDepartamentos= ruleListaDepartamentos EOF )
            // InternalAceDsl.g:1007:2: iv_ruleListaDepartamentos= ruleListaDepartamentos EOF
            {
             newCompositeNode(grammarAccess.getListaDepartamentosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListaDepartamentos=ruleListaDepartamentos();

            state._fsp--;

             current =iv_ruleListaDepartamentos; 
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
    // $ANTLR end "entryRuleListaDepartamentos"


    // $ANTLR start "ruleListaDepartamentos"
    // InternalAceDsl.g:1013:1: ruleListaDepartamentos returns [EObject current=null] : ( ( (lv_departamento_0_0= ruleDepartamento ) ) ( (lv_departamento_1_0= ruleDepartamento ) )* ) ;
    public final EObject ruleListaDepartamentos() throws RecognitionException {
        EObject current = null;

        EObject lv_departamento_0_0 = null;

        EObject lv_departamento_1_0 = null;



        	enterRule();

        try {
            // InternalAceDsl.g:1019:2: ( ( ( (lv_departamento_0_0= ruleDepartamento ) ) ( (lv_departamento_1_0= ruleDepartamento ) )* ) )
            // InternalAceDsl.g:1020:2: ( ( (lv_departamento_0_0= ruleDepartamento ) ) ( (lv_departamento_1_0= ruleDepartamento ) )* )
            {
            // InternalAceDsl.g:1020:2: ( ( (lv_departamento_0_0= ruleDepartamento ) ) ( (lv_departamento_1_0= ruleDepartamento ) )* )
            // InternalAceDsl.g:1021:3: ( (lv_departamento_0_0= ruleDepartamento ) ) ( (lv_departamento_1_0= ruleDepartamento ) )*
            {
            // InternalAceDsl.g:1021:3: ( (lv_departamento_0_0= ruleDepartamento ) )
            // InternalAceDsl.g:1022:4: (lv_departamento_0_0= ruleDepartamento )
            {
            // InternalAceDsl.g:1022:4: (lv_departamento_0_0= ruleDepartamento )
            // InternalAceDsl.g:1023:5: lv_departamento_0_0= ruleDepartamento
            {

            					newCompositeNode(grammarAccess.getListaDepartamentosAccess().getDepartamentoDepartamentoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_departamento_0_0=ruleDepartamento();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListaDepartamentosRule());
            					}
            					add(
            						current,
            						"departamento",
            						lv_departamento_0_0,
            						"org.xtext.ace.acedsl.AceDsl.Departamento");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAceDsl.g:1040:3: ( (lv_departamento_1_0= ruleDepartamento ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAceDsl.g:1041:4: (lv_departamento_1_0= ruleDepartamento )
            	    {
            	    // InternalAceDsl.g:1041:4: (lv_departamento_1_0= ruleDepartamento )
            	    // InternalAceDsl.g:1042:5: lv_departamento_1_0= ruleDepartamento
            	    {

            	    					newCompositeNode(grammarAccess.getListaDepartamentosAccess().getDepartamentoDepartamentoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_departamento_1_0=ruleDepartamento();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListaDepartamentosRule());
            	    					}
            	    					add(
            	    						current,
            	    						"departamento",
            	    						lv_departamento_1_0,
            	    						"org.xtext.ace.acedsl.AceDsl.Departamento");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
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
    // $ANTLR end "ruleListaDepartamentos"


    // $ANTLR start "entryRuleListaPeriodos"
    // InternalAceDsl.g:1063:1: entryRuleListaPeriodos returns [EObject current=null] : iv_ruleListaPeriodos= ruleListaPeriodos EOF ;
    public final EObject entryRuleListaPeriodos() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListaPeriodos = null;


        try {
            // InternalAceDsl.g:1063:54: (iv_ruleListaPeriodos= ruleListaPeriodos EOF )
            // InternalAceDsl.g:1064:2: iv_ruleListaPeriodos= ruleListaPeriodos EOF
            {
             newCompositeNode(grammarAccess.getListaPeriodosRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListaPeriodos=ruleListaPeriodos();

            state._fsp--;

             current =iv_ruleListaPeriodos; 
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
    // $ANTLR end "entryRuleListaPeriodos"


    // $ANTLR start "ruleListaPeriodos"
    // InternalAceDsl.g:1070:1: ruleListaPeriodos returns [EObject current=null] : ( ( (lv_periodo_0_0= rulePeriodo ) ) ( (lv_periodo_1_0= rulePeriodo ) )* ) ;
    public final EObject ruleListaPeriodos() throws RecognitionException {
        EObject current = null;

        EObject lv_periodo_0_0 = null;

        EObject lv_periodo_1_0 = null;



        	enterRule();

        try {
            // InternalAceDsl.g:1076:2: ( ( ( (lv_periodo_0_0= rulePeriodo ) ) ( (lv_periodo_1_0= rulePeriodo ) )* ) )
            // InternalAceDsl.g:1077:2: ( ( (lv_periodo_0_0= rulePeriodo ) ) ( (lv_periodo_1_0= rulePeriodo ) )* )
            {
            // InternalAceDsl.g:1077:2: ( ( (lv_periodo_0_0= rulePeriodo ) ) ( (lv_periodo_1_0= rulePeriodo ) )* )
            // InternalAceDsl.g:1078:3: ( (lv_periodo_0_0= rulePeriodo ) ) ( (lv_periodo_1_0= rulePeriodo ) )*
            {
            // InternalAceDsl.g:1078:3: ( (lv_periodo_0_0= rulePeriodo ) )
            // InternalAceDsl.g:1079:4: (lv_periodo_0_0= rulePeriodo )
            {
            // InternalAceDsl.g:1079:4: (lv_periodo_0_0= rulePeriodo )
            // InternalAceDsl.g:1080:5: lv_periodo_0_0= rulePeriodo
            {

            					newCompositeNode(grammarAccess.getListaPeriodosAccess().getPeriodoPeriodoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_periodo_0_0=rulePeriodo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListaPeriodosRule());
            					}
            					add(
            						current,
            						"periodo",
            						lv_periodo_0_0,
            						"org.xtext.ace.acedsl.AceDsl.Periodo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAceDsl.g:1097:3: ( (lv_periodo_1_0= rulePeriodo ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalAceDsl.g:1098:4: (lv_periodo_1_0= rulePeriodo )
            	    {
            	    // InternalAceDsl.g:1098:4: (lv_periodo_1_0= rulePeriodo )
            	    // InternalAceDsl.g:1099:5: lv_periodo_1_0= rulePeriodo
            	    {

            	    					newCompositeNode(grammarAccess.getListaPeriodosAccess().getPeriodoPeriodoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_periodo_1_0=rulePeriodo();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListaPeriodosRule());
            	    					}
            	    					add(
            	    						current,
            	    						"periodo",
            	    						lv_periodo_1_0,
            	    						"org.xtext.ace.acedsl.AceDsl.Periodo");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
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
    // $ANTLR end "ruleListaPeriodos"


    // $ANTLR start "entryRuleCurso"
    // InternalAceDsl.g:1120:1: entryRuleCurso returns [EObject current=null] : iv_ruleCurso= ruleCurso EOF ;
    public final EObject entryRuleCurso() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCurso = null;


        try {
            // InternalAceDsl.g:1120:46: (iv_ruleCurso= ruleCurso EOF )
            // InternalAceDsl.g:1121:2: iv_ruleCurso= ruleCurso EOF
            {
             newCompositeNode(grammarAccess.getCursoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCurso=ruleCurso();

            state._fsp--;

             current =iv_ruleCurso; 
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
    // $ANTLR end "entryRuleCurso"


    // $ANTLR start "ruleCurso"
    // InternalAceDsl.g:1127:1: ruleCurso returns [EObject current=null] : (otherlv_0= 'curso' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_organizacaoCurso_3_0= ruleOrganizacaoCurso ) ) otherlv_4= '}' ) ;
    public final EObject ruleCurso() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nome_1_0 = null;

        EObject lv_organizacaoCurso_3_0 = null;



        	enterRule();

        try {
            // InternalAceDsl.g:1133:2: ( (otherlv_0= 'curso' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_organizacaoCurso_3_0= ruleOrganizacaoCurso ) ) otherlv_4= '}' ) )
            // InternalAceDsl.g:1134:2: (otherlv_0= 'curso' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_organizacaoCurso_3_0= ruleOrganizacaoCurso ) ) otherlv_4= '}' )
            {
            // InternalAceDsl.g:1134:2: (otherlv_0= 'curso' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_organizacaoCurso_3_0= ruleOrganizacaoCurso ) ) otherlv_4= '}' )
            // InternalAceDsl.g:1135:3: otherlv_0= 'curso' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_organizacaoCurso_3_0= ruleOrganizacaoCurso ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCursoAccess().getCursoKeyword_0());
            		
            // InternalAceDsl.g:1139:3: ( (lv_nome_1_0= ruleEString ) )
            // InternalAceDsl.g:1140:4: (lv_nome_1_0= ruleEString )
            {
            // InternalAceDsl.g:1140:4: (lv_nome_1_0= ruleEString )
            // InternalAceDsl.g:1141:5: lv_nome_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCursoAccess().getNomeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_nome_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCursoRule());
            					}
            					set(
            						current,
            						"nome",
            						lv_nome_1_0,
            						"org.xtext.ace.acedsl.AceDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getCursoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAceDsl.g:1162:3: ( (lv_organizacaoCurso_3_0= ruleOrganizacaoCurso ) )
            // InternalAceDsl.g:1163:4: (lv_organizacaoCurso_3_0= ruleOrganizacaoCurso )
            {
            // InternalAceDsl.g:1163:4: (lv_organizacaoCurso_3_0= ruleOrganizacaoCurso )
            // InternalAceDsl.g:1164:5: lv_organizacaoCurso_3_0= ruleOrganizacaoCurso
            {

            					newCompositeNode(grammarAccess.getCursoAccess().getOrganizacaoCursoOrganizacaoCursoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_organizacaoCurso_3_0=ruleOrganizacaoCurso();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCursoRule());
            					}
            					set(
            						current,
            						"organizacaoCurso",
            						lv_organizacaoCurso_3_0,
            						"org.xtext.ace.acedsl.AceDsl.OrganizacaoCurso");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCursoAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleCurso"


    // $ANTLR start "entryRuleDepartamento"
    // InternalAceDsl.g:1189:1: entryRuleDepartamento returns [EObject current=null] : iv_ruleDepartamento= ruleDepartamento EOF ;
    public final EObject entryRuleDepartamento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepartamento = null;


        try {
            // InternalAceDsl.g:1189:53: (iv_ruleDepartamento= ruleDepartamento EOF )
            // InternalAceDsl.g:1190:2: iv_ruleDepartamento= ruleDepartamento EOF
            {
             newCompositeNode(grammarAccess.getDepartamentoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepartamento=ruleDepartamento();

            state._fsp--;

             current =iv_ruleDepartamento; 
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
    // $ANTLR end "entryRuleDepartamento"


    // $ANTLR start "ruleDepartamento"
    // InternalAceDsl.g:1196:1: ruleDepartamento returns [EObject current=null] : (otherlv_0= 'departamento' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_organizacaoDepartamento_3_0= ruleOrganizacaoDepartamento ) ) otherlv_4= '}' ) ;
    public final EObject ruleDepartamento() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_nome_1_0 = null;

        EObject lv_organizacaoDepartamento_3_0 = null;



        	enterRule();

        try {
            // InternalAceDsl.g:1202:2: ( (otherlv_0= 'departamento' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_organizacaoDepartamento_3_0= ruleOrganizacaoDepartamento ) ) otherlv_4= '}' ) )
            // InternalAceDsl.g:1203:2: (otherlv_0= 'departamento' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_organizacaoDepartamento_3_0= ruleOrganizacaoDepartamento ) ) otherlv_4= '}' )
            {
            // InternalAceDsl.g:1203:2: (otherlv_0= 'departamento' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_organizacaoDepartamento_3_0= ruleOrganizacaoDepartamento ) ) otherlv_4= '}' )
            // InternalAceDsl.g:1204:3: otherlv_0= 'departamento' ( (lv_nome_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_organizacaoDepartamento_3_0= ruleOrganizacaoDepartamento ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDepartamentoAccess().getDepartamentoKeyword_0());
            		
            // InternalAceDsl.g:1208:3: ( (lv_nome_1_0= ruleEString ) )
            // InternalAceDsl.g:1209:4: (lv_nome_1_0= ruleEString )
            {
            // InternalAceDsl.g:1209:4: (lv_nome_1_0= ruleEString )
            // InternalAceDsl.g:1210:5: lv_nome_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDepartamentoAccess().getNomeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_nome_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDepartamentoRule());
            					}
            					set(
            						current,
            						"nome",
            						lv_nome_1_0,
            						"org.xtext.ace.acedsl.AceDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDepartamentoAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAceDsl.g:1231:3: ( (lv_organizacaoDepartamento_3_0= ruleOrganizacaoDepartamento ) )
            // InternalAceDsl.g:1232:4: (lv_organizacaoDepartamento_3_0= ruleOrganizacaoDepartamento )
            {
            // InternalAceDsl.g:1232:4: (lv_organizacaoDepartamento_3_0= ruleOrganizacaoDepartamento )
            // InternalAceDsl.g:1233:5: lv_organizacaoDepartamento_3_0= ruleOrganizacaoDepartamento
            {

            					newCompositeNode(grammarAccess.getDepartamentoAccess().getOrganizacaoDepartamentoOrganizacaoDepartamentoParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_organizacaoDepartamento_3_0=ruleOrganizacaoDepartamento();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDepartamentoRule());
            					}
            					set(
            						current,
            						"organizacaoDepartamento",
            						lv_organizacaoDepartamento_3_0,
            						"org.xtext.ace.acedsl.AceDsl.OrganizacaoDepartamento");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDepartamentoAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleDepartamento"


    // $ANTLR start "entryRulePeriodo"
    // InternalAceDsl.g:1258:1: entryRulePeriodo returns [EObject current=null] : iv_rulePeriodo= rulePeriodo EOF ;
    public final EObject entryRulePeriodo() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeriodo = null;


        try {
            // InternalAceDsl.g:1258:48: (iv_rulePeriodo= rulePeriodo EOF )
            // InternalAceDsl.g:1259:2: iv_rulePeriodo= rulePeriodo EOF
            {
             newCompositeNode(grammarAccess.getPeriodoRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePeriodo=rulePeriodo();

            state._fsp--;

             current =iv_rulePeriodo; 
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
    // $ANTLR end "entryRulePeriodo"


    // $ANTLR start "rulePeriodo"
    // InternalAceDsl.g:1265:1: rulePeriodo returns [EObject current=null] : (otherlv_0= 'periodo' ( (lv_nome_1_0= ruleEString ) ) ) ;
    public final EObject rulePeriodo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_nome_1_0 = null;



        	enterRule();

        try {
            // InternalAceDsl.g:1271:2: ( (otherlv_0= 'periodo' ( (lv_nome_1_0= ruleEString ) ) ) )
            // InternalAceDsl.g:1272:2: (otherlv_0= 'periodo' ( (lv_nome_1_0= ruleEString ) ) )
            {
            // InternalAceDsl.g:1272:2: (otherlv_0= 'periodo' ( (lv_nome_1_0= ruleEString ) ) )
            // InternalAceDsl.g:1273:3: otherlv_0= 'periodo' ( (lv_nome_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPeriodoAccess().getPeriodoKeyword_0());
            		
            // InternalAceDsl.g:1277:3: ( (lv_nome_1_0= ruleEString ) )
            // InternalAceDsl.g:1278:4: (lv_nome_1_0= ruleEString )
            {
            // InternalAceDsl.g:1278:4: (lv_nome_1_0= ruleEString )
            // InternalAceDsl.g:1279:5: lv_nome_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPeriodoAccess().getNomeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_nome_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPeriodoRule());
            					}
            					set(
            						current,
            						"nome",
            						lv_nome_1_0,
            						"org.xtext.ace.acedsl.AceDsl.EString");
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
    // $ANTLR end "rulePeriodo"


    // $ANTLR start "ruleFonte"
    // InternalAceDsl.g:1300:1: ruleFonte returns [Enumerator current=null] : ( (enumLiteral_0= 'Normal' ) | (enumLiteral_1= 'Sans' ) | (enumLiteral_2= 'Serif' ) | (enumLiteral_3= 'Monospace' ) ) ;
    public final Enumerator ruleFonte() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAceDsl.g:1306:2: ( ( (enumLiteral_0= 'Normal' ) | (enumLiteral_1= 'Sans' ) | (enumLiteral_2= 'Serif' ) | (enumLiteral_3= 'Monospace' ) ) )
            // InternalAceDsl.g:1307:2: ( (enumLiteral_0= 'Normal' ) | (enumLiteral_1= 'Sans' ) | (enumLiteral_2= 'Serif' ) | (enumLiteral_3= 'Monospace' ) )
            {
            // InternalAceDsl.g:1307:2: ( (enumLiteral_0= 'Normal' ) | (enumLiteral_1= 'Sans' ) | (enumLiteral_2= 'Serif' ) | (enumLiteral_3= 'Monospace' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 32:
                {
                alt12=3;
                }
                break;
            case 33:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAceDsl.g:1308:3: (enumLiteral_0= 'Normal' )
                    {
                    // InternalAceDsl.g:1308:3: (enumLiteral_0= 'Normal' )
                    // InternalAceDsl.g:1309:4: enumLiteral_0= 'Normal'
                    {
                    enumLiteral_0=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getFonteAccess().getNormalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFonteAccess().getNormalEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAceDsl.g:1316:3: (enumLiteral_1= 'Sans' )
                    {
                    // InternalAceDsl.g:1316:3: (enumLiteral_1= 'Sans' )
                    // InternalAceDsl.g:1317:4: enumLiteral_1= 'Sans'
                    {
                    enumLiteral_1=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getFonteAccess().getSansEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFonteAccess().getSansEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAceDsl.g:1324:3: (enumLiteral_2= 'Serif' )
                    {
                    // InternalAceDsl.g:1324:3: (enumLiteral_2= 'Serif' )
                    // InternalAceDsl.g:1325:4: enumLiteral_2= 'Serif'
                    {
                    enumLiteral_2=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getFonteAccess().getSerifEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFonteAccess().getSerifEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAceDsl.g:1332:3: (enumLiteral_3= 'Monospace' )
                    {
                    // InternalAceDsl.g:1332:3: (enumLiteral_3= 'Monospace' )
                    // InternalAceDsl.g:1333:4: enumLiteral_3= 'Monospace'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getFonteAccess().getMonospaceEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getFonteAccess().getMonospaceEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleFonte"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000017A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000017E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003E04000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000003C000002L});

}
