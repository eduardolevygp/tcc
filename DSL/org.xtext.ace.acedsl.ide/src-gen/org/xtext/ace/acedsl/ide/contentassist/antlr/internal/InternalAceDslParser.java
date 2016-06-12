package org.xtext.ace.acedsl.ide.contentassist.antlr.internal;

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
import org.xtext.ace.acedsl.services.AceDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAceDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Normal'", "'Sans'", "'Serif'", "'Monospace'", "'Aplicativo'", "'{'", "'}'", "'url'", "'secao eventos'", "'secao membros'", "'secao disciplinas'", "'secao noticias'", "'Facebook'", "'estilo'", "'logo'", "'fonte'", "'corPrimaria'", "'corSecundaria'", "'corTerciaria'", "'disciplinas'", "'curso'", "'departamento'", "'periodo'"
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

    	public void setGrammarAccess(AceDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleAplicativo"
    // InternalAceDsl.g:53:1: entryRuleAplicativo : ruleAplicativo EOF ;
    public final void entryRuleAplicativo() throws RecognitionException {
        try {
            // InternalAceDsl.g:54:1: ( ruleAplicativo EOF )
            // InternalAceDsl.g:55:1: ruleAplicativo EOF
            {
             before(grammarAccess.getAplicativoRule()); 
            pushFollow(FOLLOW_1);
            ruleAplicativo();

            state._fsp--;

             after(grammarAccess.getAplicativoRule()); 
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
    // $ANTLR end "entryRuleAplicativo"


    // $ANTLR start "ruleAplicativo"
    // InternalAceDsl.g:62:1: ruleAplicativo : ( ( rule__Aplicativo__Group__0 ) ) ;
    public final void ruleAplicativo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:66:2: ( ( ( rule__Aplicativo__Group__0 ) ) )
            // InternalAceDsl.g:67:2: ( ( rule__Aplicativo__Group__0 ) )
            {
            // InternalAceDsl.g:67:2: ( ( rule__Aplicativo__Group__0 ) )
            // InternalAceDsl.g:68:3: ( rule__Aplicativo__Group__0 )
            {
             before(grammarAccess.getAplicativoAccess().getGroup()); 
            // InternalAceDsl.g:69:3: ( rule__Aplicativo__Group__0 )
            // InternalAceDsl.g:69:4: rule__Aplicativo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Aplicativo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAplicativoAccess().getGroup()); 

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
    // $ANTLR end "ruleAplicativo"


    // $ANTLR start "entryRuleSeparacaoDisciplinas"
    // InternalAceDsl.g:78:1: entryRuleSeparacaoDisciplinas : ruleSeparacaoDisciplinas EOF ;
    public final void entryRuleSeparacaoDisciplinas() throws RecognitionException {
        try {
            // InternalAceDsl.g:79:1: ( ruleSeparacaoDisciplinas EOF )
            // InternalAceDsl.g:80:1: ruleSeparacaoDisciplinas EOF
            {
             before(grammarAccess.getSeparacaoDisciplinasRule()); 
            pushFollow(FOLLOW_1);
            ruleSeparacaoDisciplinas();

            state._fsp--;

             after(grammarAccess.getSeparacaoDisciplinasRule()); 
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
    // $ANTLR end "entryRuleSeparacaoDisciplinas"


    // $ANTLR start "ruleSeparacaoDisciplinas"
    // InternalAceDsl.g:87:1: ruleSeparacaoDisciplinas : ( ( rule__SeparacaoDisciplinas__Alternatives ) ) ;
    public final void ruleSeparacaoDisciplinas() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:91:2: ( ( ( rule__SeparacaoDisciplinas__Alternatives ) ) )
            // InternalAceDsl.g:92:2: ( ( rule__SeparacaoDisciplinas__Alternatives ) )
            {
            // InternalAceDsl.g:92:2: ( ( rule__SeparacaoDisciplinas__Alternatives ) )
            // InternalAceDsl.g:93:3: ( rule__SeparacaoDisciplinas__Alternatives )
            {
             before(grammarAccess.getSeparacaoDisciplinasAccess().getAlternatives()); 
            // InternalAceDsl.g:94:3: ( rule__SeparacaoDisciplinas__Alternatives )
            // InternalAceDsl.g:94:4: rule__SeparacaoDisciplinas__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SeparacaoDisciplinas__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSeparacaoDisciplinasAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSeparacaoDisciplinas"


    // $ANTLR start "entryRuleOrganizacaoCurso"
    // InternalAceDsl.g:103:1: entryRuleOrganizacaoCurso : ruleOrganizacaoCurso EOF ;
    public final void entryRuleOrganizacaoCurso() throws RecognitionException {
        try {
            // InternalAceDsl.g:104:1: ( ruleOrganizacaoCurso EOF )
            // InternalAceDsl.g:105:1: ruleOrganizacaoCurso EOF
            {
             before(grammarAccess.getOrganizacaoCursoRule()); 
            pushFollow(FOLLOW_1);
            ruleOrganizacaoCurso();

            state._fsp--;

             after(grammarAccess.getOrganizacaoCursoRule()); 
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
    // $ANTLR end "entryRuleOrganizacaoCurso"


    // $ANTLR start "ruleOrganizacaoCurso"
    // InternalAceDsl.g:112:1: ruleOrganizacaoCurso : ( ( rule__OrganizacaoCurso__Alternatives ) ) ;
    public final void ruleOrganizacaoCurso() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:116:2: ( ( ( rule__OrganizacaoCurso__Alternatives ) ) )
            // InternalAceDsl.g:117:2: ( ( rule__OrganizacaoCurso__Alternatives ) )
            {
            // InternalAceDsl.g:117:2: ( ( rule__OrganizacaoCurso__Alternatives ) )
            // InternalAceDsl.g:118:3: ( rule__OrganizacaoCurso__Alternatives )
            {
             before(grammarAccess.getOrganizacaoCursoAccess().getAlternatives()); 
            // InternalAceDsl.g:119:3: ( rule__OrganizacaoCurso__Alternatives )
            // InternalAceDsl.g:119:4: rule__OrganizacaoCurso__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OrganizacaoCurso__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrganizacaoCursoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOrganizacaoCurso"


    // $ANTLR start "entryRuleOrganizacaoDepartamento"
    // InternalAceDsl.g:128:1: entryRuleOrganizacaoDepartamento : ruleOrganizacaoDepartamento EOF ;
    public final void entryRuleOrganizacaoDepartamento() throws RecognitionException {
        try {
            // InternalAceDsl.g:129:1: ( ruleOrganizacaoDepartamento EOF )
            // InternalAceDsl.g:130:1: ruleOrganizacaoDepartamento EOF
            {
             before(grammarAccess.getOrganizacaoDepartamentoRule()); 
            pushFollow(FOLLOW_1);
            ruleOrganizacaoDepartamento();

            state._fsp--;

             after(grammarAccess.getOrganizacaoDepartamentoRule()); 
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
    // $ANTLR end "entryRuleOrganizacaoDepartamento"


    // $ANTLR start "ruleOrganizacaoDepartamento"
    // InternalAceDsl.g:137:1: ruleOrganizacaoDepartamento : ( ( rule__OrganizacaoDepartamento__Alternatives ) ) ;
    public final void ruleOrganizacaoDepartamento() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:141:2: ( ( ( rule__OrganizacaoDepartamento__Alternatives ) ) )
            // InternalAceDsl.g:142:2: ( ( rule__OrganizacaoDepartamento__Alternatives ) )
            {
            // InternalAceDsl.g:142:2: ( ( rule__OrganizacaoDepartamento__Alternatives ) )
            // InternalAceDsl.g:143:3: ( rule__OrganizacaoDepartamento__Alternatives )
            {
             before(grammarAccess.getOrganizacaoDepartamentoAccess().getAlternatives()); 
            // InternalAceDsl.g:144:3: ( rule__OrganizacaoDepartamento__Alternatives )
            // InternalAceDsl.g:144:4: rule__OrganizacaoDepartamento__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OrganizacaoDepartamento__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOrganizacaoDepartamentoAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOrganizacaoDepartamento"


    // $ANTLR start "entryRuleEString"
    // InternalAceDsl.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAceDsl.g:154:1: ( ruleEString EOF )
            // InternalAceDsl.g:155:1: ruleEString EOF
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
    // InternalAceDsl.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAceDsl.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalAceDsl.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalAceDsl.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalAceDsl.g:169:3: ( rule__EString__Alternatives )
            // InternalAceDsl.g:169:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleSecaoEventos"
    // InternalAceDsl.g:178:1: entryRuleSecaoEventos : ruleSecaoEventos EOF ;
    public final void entryRuleSecaoEventos() throws RecognitionException {
        try {
            // InternalAceDsl.g:179:1: ( ruleSecaoEventos EOF )
            // InternalAceDsl.g:180:1: ruleSecaoEventos EOF
            {
             before(grammarAccess.getSecaoEventosRule()); 
            pushFollow(FOLLOW_1);
            ruleSecaoEventos();

            state._fsp--;

             after(grammarAccess.getSecaoEventosRule()); 
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
    // $ANTLR end "entryRuleSecaoEventos"


    // $ANTLR start "ruleSecaoEventos"
    // InternalAceDsl.g:187:1: ruleSecaoEventos : ( ( rule__SecaoEventos__Group__0 ) ) ;
    public final void ruleSecaoEventos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:191:2: ( ( ( rule__SecaoEventos__Group__0 ) ) )
            // InternalAceDsl.g:192:2: ( ( rule__SecaoEventos__Group__0 ) )
            {
            // InternalAceDsl.g:192:2: ( ( rule__SecaoEventos__Group__0 ) )
            // InternalAceDsl.g:193:3: ( rule__SecaoEventos__Group__0 )
            {
             before(grammarAccess.getSecaoEventosAccess().getGroup()); 
            // InternalAceDsl.g:194:3: ( rule__SecaoEventos__Group__0 )
            // InternalAceDsl.g:194:4: rule__SecaoEventos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SecaoEventos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecaoEventosAccess().getGroup()); 

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
    // $ANTLR end "ruleSecaoEventos"


    // $ANTLR start "entryRuleSecaoMembros"
    // InternalAceDsl.g:203:1: entryRuleSecaoMembros : ruleSecaoMembros EOF ;
    public final void entryRuleSecaoMembros() throws RecognitionException {
        try {
            // InternalAceDsl.g:204:1: ( ruleSecaoMembros EOF )
            // InternalAceDsl.g:205:1: ruleSecaoMembros EOF
            {
             before(grammarAccess.getSecaoMembrosRule()); 
            pushFollow(FOLLOW_1);
            ruleSecaoMembros();

            state._fsp--;

             after(grammarAccess.getSecaoMembrosRule()); 
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
    // $ANTLR end "entryRuleSecaoMembros"


    // $ANTLR start "ruleSecaoMembros"
    // InternalAceDsl.g:212:1: ruleSecaoMembros : ( ( rule__SecaoMembros__Group__0 ) ) ;
    public final void ruleSecaoMembros() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:216:2: ( ( ( rule__SecaoMembros__Group__0 ) ) )
            // InternalAceDsl.g:217:2: ( ( rule__SecaoMembros__Group__0 ) )
            {
            // InternalAceDsl.g:217:2: ( ( rule__SecaoMembros__Group__0 ) )
            // InternalAceDsl.g:218:3: ( rule__SecaoMembros__Group__0 )
            {
             before(grammarAccess.getSecaoMembrosAccess().getGroup()); 
            // InternalAceDsl.g:219:3: ( rule__SecaoMembros__Group__0 )
            // InternalAceDsl.g:219:4: rule__SecaoMembros__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SecaoMembros__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecaoMembrosAccess().getGroup()); 

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
    // $ANTLR end "ruleSecaoMembros"


    // $ANTLR start "entryRuleSecaoDisciplinas"
    // InternalAceDsl.g:228:1: entryRuleSecaoDisciplinas : ruleSecaoDisciplinas EOF ;
    public final void entryRuleSecaoDisciplinas() throws RecognitionException {
        try {
            // InternalAceDsl.g:229:1: ( ruleSecaoDisciplinas EOF )
            // InternalAceDsl.g:230:1: ruleSecaoDisciplinas EOF
            {
             before(grammarAccess.getSecaoDisciplinasRule()); 
            pushFollow(FOLLOW_1);
            ruleSecaoDisciplinas();

            state._fsp--;

             after(grammarAccess.getSecaoDisciplinasRule()); 
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
    // $ANTLR end "entryRuleSecaoDisciplinas"


    // $ANTLR start "ruleSecaoDisciplinas"
    // InternalAceDsl.g:237:1: ruleSecaoDisciplinas : ( ( rule__SecaoDisciplinas__Group__0 ) ) ;
    public final void ruleSecaoDisciplinas() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:241:2: ( ( ( rule__SecaoDisciplinas__Group__0 ) ) )
            // InternalAceDsl.g:242:2: ( ( rule__SecaoDisciplinas__Group__0 ) )
            {
            // InternalAceDsl.g:242:2: ( ( rule__SecaoDisciplinas__Group__0 ) )
            // InternalAceDsl.g:243:3: ( rule__SecaoDisciplinas__Group__0 )
            {
             before(grammarAccess.getSecaoDisciplinasAccess().getGroup()); 
            // InternalAceDsl.g:244:3: ( rule__SecaoDisciplinas__Group__0 )
            // InternalAceDsl.g:244:4: rule__SecaoDisciplinas__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SecaoDisciplinas__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecaoDisciplinasAccess().getGroup()); 

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
    // $ANTLR end "ruleSecaoDisciplinas"


    // $ANTLR start "entryRuleSecaoNoticias"
    // InternalAceDsl.g:253:1: entryRuleSecaoNoticias : ruleSecaoNoticias EOF ;
    public final void entryRuleSecaoNoticias() throws RecognitionException {
        try {
            // InternalAceDsl.g:254:1: ( ruleSecaoNoticias EOF )
            // InternalAceDsl.g:255:1: ruleSecaoNoticias EOF
            {
             before(grammarAccess.getSecaoNoticiasRule()); 
            pushFollow(FOLLOW_1);
            ruleSecaoNoticias();

            state._fsp--;

             after(grammarAccess.getSecaoNoticiasRule()); 
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
    // $ANTLR end "entryRuleSecaoNoticias"


    // $ANTLR start "ruleSecaoNoticias"
    // InternalAceDsl.g:262:1: ruleSecaoNoticias : ( ( rule__SecaoNoticias__Group__0 ) ) ;
    public final void ruleSecaoNoticias() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:266:2: ( ( ( rule__SecaoNoticias__Group__0 ) ) )
            // InternalAceDsl.g:267:2: ( ( rule__SecaoNoticias__Group__0 ) )
            {
            // InternalAceDsl.g:267:2: ( ( rule__SecaoNoticias__Group__0 ) )
            // InternalAceDsl.g:268:3: ( rule__SecaoNoticias__Group__0 )
            {
             before(grammarAccess.getSecaoNoticiasAccess().getGroup()); 
            // InternalAceDsl.g:269:3: ( rule__SecaoNoticias__Group__0 )
            // InternalAceDsl.g:269:4: rule__SecaoNoticias__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SecaoNoticias__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSecaoNoticiasAccess().getGroup()); 

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
    // $ANTLR end "ruleSecaoNoticias"


    // $ANTLR start "entryRuleEstilo"
    // InternalAceDsl.g:278:1: entryRuleEstilo : ruleEstilo EOF ;
    public final void entryRuleEstilo() throws RecognitionException {
        try {
            // InternalAceDsl.g:279:1: ( ruleEstilo EOF )
            // InternalAceDsl.g:280:1: ruleEstilo EOF
            {
             before(grammarAccess.getEstiloRule()); 
            pushFollow(FOLLOW_1);
            ruleEstilo();

            state._fsp--;

             after(grammarAccess.getEstiloRule()); 
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
    // $ANTLR end "entryRuleEstilo"


    // $ANTLR start "ruleEstilo"
    // InternalAceDsl.g:287:1: ruleEstilo : ( ( rule__Estilo__Group__0 ) ) ;
    public final void ruleEstilo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:291:2: ( ( ( rule__Estilo__Group__0 ) ) )
            // InternalAceDsl.g:292:2: ( ( rule__Estilo__Group__0 ) )
            {
            // InternalAceDsl.g:292:2: ( ( rule__Estilo__Group__0 ) )
            // InternalAceDsl.g:293:3: ( rule__Estilo__Group__0 )
            {
             before(grammarAccess.getEstiloAccess().getGroup()); 
            // InternalAceDsl.g:294:3: ( rule__Estilo__Group__0 )
            // InternalAceDsl.g:294:4: rule__Estilo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEstiloAccess().getGroup()); 

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
    // $ANTLR end "ruleEstilo"


    // $ANTLR start "entryRuleListaCursos"
    // InternalAceDsl.g:303:1: entryRuleListaCursos : ruleListaCursos EOF ;
    public final void entryRuleListaCursos() throws RecognitionException {
        try {
            // InternalAceDsl.g:304:1: ( ruleListaCursos EOF )
            // InternalAceDsl.g:305:1: ruleListaCursos EOF
            {
             before(grammarAccess.getListaCursosRule()); 
            pushFollow(FOLLOW_1);
            ruleListaCursos();

            state._fsp--;

             after(grammarAccess.getListaCursosRule()); 
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
    // $ANTLR end "entryRuleListaCursos"


    // $ANTLR start "ruleListaCursos"
    // InternalAceDsl.g:312:1: ruleListaCursos : ( ( rule__ListaCursos__Group__0 ) ) ;
    public final void ruleListaCursos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:316:2: ( ( ( rule__ListaCursos__Group__0 ) ) )
            // InternalAceDsl.g:317:2: ( ( rule__ListaCursos__Group__0 ) )
            {
            // InternalAceDsl.g:317:2: ( ( rule__ListaCursos__Group__0 ) )
            // InternalAceDsl.g:318:3: ( rule__ListaCursos__Group__0 )
            {
             before(grammarAccess.getListaCursosAccess().getGroup()); 
            // InternalAceDsl.g:319:3: ( rule__ListaCursos__Group__0 )
            // InternalAceDsl.g:319:4: rule__ListaCursos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListaCursos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListaCursosAccess().getGroup()); 

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
    // $ANTLR end "ruleListaCursos"


    // $ANTLR start "entryRuleListaDisciplinas"
    // InternalAceDsl.g:328:1: entryRuleListaDisciplinas : ruleListaDisciplinas EOF ;
    public final void entryRuleListaDisciplinas() throws RecognitionException {
        try {
            // InternalAceDsl.g:329:1: ( ruleListaDisciplinas EOF )
            // InternalAceDsl.g:330:1: ruleListaDisciplinas EOF
            {
             before(grammarAccess.getListaDisciplinasRule()); 
            pushFollow(FOLLOW_1);
            ruleListaDisciplinas();

            state._fsp--;

             after(grammarAccess.getListaDisciplinasRule()); 
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
    // $ANTLR end "entryRuleListaDisciplinas"


    // $ANTLR start "ruleListaDisciplinas"
    // InternalAceDsl.g:337:1: ruleListaDisciplinas : ( ( rule__ListaDisciplinas__Group__0 ) ) ;
    public final void ruleListaDisciplinas() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:341:2: ( ( ( rule__ListaDisciplinas__Group__0 ) ) )
            // InternalAceDsl.g:342:2: ( ( rule__ListaDisciplinas__Group__0 ) )
            {
            // InternalAceDsl.g:342:2: ( ( rule__ListaDisciplinas__Group__0 ) )
            // InternalAceDsl.g:343:3: ( rule__ListaDisciplinas__Group__0 )
            {
             before(grammarAccess.getListaDisciplinasAccess().getGroup()); 
            // InternalAceDsl.g:344:3: ( rule__ListaDisciplinas__Group__0 )
            // InternalAceDsl.g:344:4: rule__ListaDisciplinas__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListaDisciplinas__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListaDisciplinasAccess().getGroup()); 

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
    // $ANTLR end "ruleListaDisciplinas"


    // $ANTLR start "entryRuleListaDepartamentos"
    // InternalAceDsl.g:353:1: entryRuleListaDepartamentos : ruleListaDepartamentos EOF ;
    public final void entryRuleListaDepartamentos() throws RecognitionException {
        try {
            // InternalAceDsl.g:354:1: ( ruleListaDepartamentos EOF )
            // InternalAceDsl.g:355:1: ruleListaDepartamentos EOF
            {
             before(grammarAccess.getListaDepartamentosRule()); 
            pushFollow(FOLLOW_1);
            ruleListaDepartamentos();

            state._fsp--;

             after(grammarAccess.getListaDepartamentosRule()); 
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
    // $ANTLR end "entryRuleListaDepartamentos"


    // $ANTLR start "ruleListaDepartamentos"
    // InternalAceDsl.g:362:1: ruleListaDepartamentos : ( ( rule__ListaDepartamentos__Group__0 ) ) ;
    public final void ruleListaDepartamentos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:366:2: ( ( ( rule__ListaDepartamentos__Group__0 ) ) )
            // InternalAceDsl.g:367:2: ( ( rule__ListaDepartamentos__Group__0 ) )
            {
            // InternalAceDsl.g:367:2: ( ( rule__ListaDepartamentos__Group__0 ) )
            // InternalAceDsl.g:368:3: ( rule__ListaDepartamentos__Group__0 )
            {
             before(grammarAccess.getListaDepartamentosAccess().getGroup()); 
            // InternalAceDsl.g:369:3: ( rule__ListaDepartamentos__Group__0 )
            // InternalAceDsl.g:369:4: rule__ListaDepartamentos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListaDepartamentos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListaDepartamentosAccess().getGroup()); 

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
    // $ANTLR end "ruleListaDepartamentos"


    // $ANTLR start "entryRuleListaPeriodos"
    // InternalAceDsl.g:378:1: entryRuleListaPeriodos : ruleListaPeriodos EOF ;
    public final void entryRuleListaPeriodos() throws RecognitionException {
        try {
            // InternalAceDsl.g:379:1: ( ruleListaPeriodos EOF )
            // InternalAceDsl.g:380:1: ruleListaPeriodos EOF
            {
             before(grammarAccess.getListaPeriodosRule()); 
            pushFollow(FOLLOW_1);
            ruleListaPeriodos();

            state._fsp--;

             after(grammarAccess.getListaPeriodosRule()); 
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
    // $ANTLR end "entryRuleListaPeriodos"


    // $ANTLR start "ruleListaPeriodos"
    // InternalAceDsl.g:387:1: ruleListaPeriodos : ( ( rule__ListaPeriodos__Group__0 ) ) ;
    public final void ruleListaPeriodos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:391:2: ( ( ( rule__ListaPeriodos__Group__0 ) ) )
            // InternalAceDsl.g:392:2: ( ( rule__ListaPeriodos__Group__0 ) )
            {
            // InternalAceDsl.g:392:2: ( ( rule__ListaPeriodos__Group__0 ) )
            // InternalAceDsl.g:393:3: ( rule__ListaPeriodos__Group__0 )
            {
             before(grammarAccess.getListaPeriodosAccess().getGroup()); 
            // InternalAceDsl.g:394:3: ( rule__ListaPeriodos__Group__0 )
            // InternalAceDsl.g:394:4: rule__ListaPeriodos__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListaPeriodos__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListaPeriodosAccess().getGroup()); 

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
    // $ANTLR end "ruleListaPeriodos"


    // $ANTLR start "entryRuleCurso"
    // InternalAceDsl.g:403:1: entryRuleCurso : ruleCurso EOF ;
    public final void entryRuleCurso() throws RecognitionException {
        try {
            // InternalAceDsl.g:404:1: ( ruleCurso EOF )
            // InternalAceDsl.g:405:1: ruleCurso EOF
            {
             before(grammarAccess.getCursoRule()); 
            pushFollow(FOLLOW_1);
            ruleCurso();

            state._fsp--;

             after(grammarAccess.getCursoRule()); 
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
    // $ANTLR end "entryRuleCurso"


    // $ANTLR start "ruleCurso"
    // InternalAceDsl.g:412:1: ruleCurso : ( ( rule__Curso__Group__0 ) ) ;
    public final void ruleCurso() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:416:2: ( ( ( rule__Curso__Group__0 ) ) )
            // InternalAceDsl.g:417:2: ( ( rule__Curso__Group__0 ) )
            {
            // InternalAceDsl.g:417:2: ( ( rule__Curso__Group__0 ) )
            // InternalAceDsl.g:418:3: ( rule__Curso__Group__0 )
            {
             before(grammarAccess.getCursoAccess().getGroup()); 
            // InternalAceDsl.g:419:3: ( rule__Curso__Group__0 )
            // InternalAceDsl.g:419:4: rule__Curso__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Curso__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCursoAccess().getGroup()); 

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
    // $ANTLR end "ruleCurso"


    // $ANTLR start "entryRuleDepartamento"
    // InternalAceDsl.g:428:1: entryRuleDepartamento : ruleDepartamento EOF ;
    public final void entryRuleDepartamento() throws RecognitionException {
        try {
            // InternalAceDsl.g:429:1: ( ruleDepartamento EOF )
            // InternalAceDsl.g:430:1: ruleDepartamento EOF
            {
             before(grammarAccess.getDepartamentoRule()); 
            pushFollow(FOLLOW_1);
            ruleDepartamento();

            state._fsp--;

             after(grammarAccess.getDepartamentoRule()); 
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
    // $ANTLR end "entryRuleDepartamento"


    // $ANTLR start "ruleDepartamento"
    // InternalAceDsl.g:437:1: ruleDepartamento : ( ( rule__Departamento__Group__0 ) ) ;
    public final void ruleDepartamento() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:441:2: ( ( ( rule__Departamento__Group__0 ) ) )
            // InternalAceDsl.g:442:2: ( ( rule__Departamento__Group__0 ) )
            {
            // InternalAceDsl.g:442:2: ( ( rule__Departamento__Group__0 ) )
            // InternalAceDsl.g:443:3: ( rule__Departamento__Group__0 )
            {
             before(grammarAccess.getDepartamentoAccess().getGroup()); 
            // InternalAceDsl.g:444:3: ( rule__Departamento__Group__0 )
            // InternalAceDsl.g:444:4: rule__Departamento__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Departamento__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDepartamentoAccess().getGroup()); 

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
    // $ANTLR end "ruleDepartamento"


    // $ANTLR start "entryRulePeriodo"
    // InternalAceDsl.g:453:1: entryRulePeriodo : rulePeriodo EOF ;
    public final void entryRulePeriodo() throws RecognitionException {
        try {
            // InternalAceDsl.g:454:1: ( rulePeriodo EOF )
            // InternalAceDsl.g:455:1: rulePeriodo EOF
            {
             before(grammarAccess.getPeriodoRule()); 
            pushFollow(FOLLOW_1);
            rulePeriodo();

            state._fsp--;

             after(grammarAccess.getPeriodoRule()); 
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
    // $ANTLR end "entryRulePeriodo"


    // $ANTLR start "rulePeriodo"
    // InternalAceDsl.g:462:1: rulePeriodo : ( ( rule__Periodo__Group__0 ) ) ;
    public final void rulePeriodo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:466:2: ( ( ( rule__Periodo__Group__0 ) ) )
            // InternalAceDsl.g:467:2: ( ( rule__Periodo__Group__0 ) )
            {
            // InternalAceDsl.g:467:2: ( ( rule__Periodo__Group__0 ) )
            // InternalAceDsl.g:468:3: ( rule__Periodo__Group__0 )
            {
             before(grammarAccess.getPeriodoAccess().getGroup()); 
            // InternalAceDsl.g:469:3: ( rule__Periodo__Group__0 )
            // InternalAceDsl.g:469:4: rule__Periodo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Periodo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPeriodoAccess().getGroup()); 

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
    // $ANTLR end "rulePeriodo"


    // $ANTLR start "ruleFonte"
    // InternalAceDsl.g:478:1: ruleFonte : ( ( rule__Fonte__Alternatives ) ) ;
    public final void ruleFonte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:482:1: ( ( ( rule__Fonte__Alternatives ) ) )
            // InternalAceDsl.g:483:2: ( ( rule__Fonte__Alternatives ) )
            {
            // InternalAceDsl.g:483:2: ( ( rule__Fonte__Alternatives ) )
            // InternalAceDsl.g:484:3: ( rule__Fonte__Alternatives )
            {
             before(grammarAccess.getFonteAccess().getAlternatives()); 
            // InternalAceDsl.g:485:3: ( rule__Fonte__Alternatives )
            // InternalAceDsl.g:485:4: rule__Fonte__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Fonte__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFonteAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFonte"


    // $ANTLR start "rule__SeparacaoDisciplinas__Alternatives"
    // InternalAceDsl.g:493:1: rule__SeparacaoDisciplinas__Alternatives : ( ( ruleListaCursos ) | ( ruleListaDisciplinas ) | ( ruleListaDepartamentos ) | ( ruleListaPeriodos ) );
    public final void rule__SeparacaoDisciplinas__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:497:1: ( ( ruleListaCursos ) | ( ruleListaDisciplinas ) | ( ruleListaDepartamentos ) | ( ruleListaPeriodos ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 32:
                {
                alt1=3;
                }
                break;
            case 33:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalAceDsl.g:498:2: ( ruleListaCursos )
                    {
                    // InternalAceDsl.g:498:2: ( ruleListaCursos )
                    // InternalAceDsl.g:499:3: ruleListaCursos
                    {
                     before(grammarAccess.getSeparacaoDisciplinasAccess().getListaCursosParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleListaCursos();

                    state._fsp--;

                     after(grammarAccess.getSeparacaoDisciplinasAccess().getListaCursosParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAceDsl.g:504:2: ( ruleListaDisciplinas )
                    {
                    // InternalAceDsl.g:504:2: ( ruleListaDisciplinas )
                    // InternalAceDsl.g:505:3: ruleListaDisciplinas
                    {
                     before(grammarAccess.getSeparacaoDisciplinasAccess().getListaDisciplinasParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleListaDisciplinas();

                    state._fsp--;

                     after(grammarAccess.getSeparacaoDisciplinasAccess().getListaDisciplinasParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAceDsl.g:510:2: ( ruleListaDepartamentos )
                    {
                    // InternalAceDsl.g:510:2: ( ruleListaDepartamentos )
                    // InternalAceDsl.g:511:3: ruleListaDepartamentos
                    {
                     before(grammarAccess.getSeparacaoDisciplinasAccess().getListaDepartamentosParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleListaDepartamentos();

                    state._fsp--;

                     after(grammarAccess.getSeparacaoDisciplinasAccess().getListaDepartamentosParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAceDsl.g:516:2: ( ruleListaPeriodos )
                    {
                    // InternalAceDsl.g:516:2: ( ruleListaPeriodos )
                    // InternalAceDsl.g:517:3: ruleListaPeriodos
                    {
                     before(grammarAccess.getSeparacaoDisciplinasAccess().getListaPeriodosParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleListaPeriodos();

                    state._fsp--;

                     after(grammarAccess.getSeparacaoDisciplinasAccess().getListaPeriodosParserRuleCall_3()); 

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
    // $ANTLR end "rule__SeparacaoDisciplinas__Alternatives"


    // $ANTLR start "rule__OrganizacaoCurso__Alternatives"
    // InternalAceDsl.g:526:1: rule__OrganizacaoCurso__Alternatives : ( ( ruleListaDisciplinas ) | ( ruleListaPeriodos ) );
    public final void rule__OrganizacaoCurso__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:530:1: ( ( ruleListaDisciplinas ) | ( ruleListaPeriodos ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( (LA2_0==33) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAceDsl.g:531:2: ( ruleListaDisciplinas )
                    {
                    // InternalAceDsl.g:531:2: ( ruleListaDisciplinas )
                    // InternalAceDsl.g:532:3: ruleListaDisciplinas
                    {
                     before(grammarAccess.getOrganizacaoCursoAccess().getListaDisciplinasParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleListaDisciplinas();

                    state._fsp--;

                     after(grammarAccess.getOrganizacaoCursoAccess().getListaDisciplinasParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAceDsl.g:537:2: ( ruleListaPeriodos )
                    {
                    // InternalAceDsl.g:537:2: ( ruleListaPeriodos )
                    // InternalAceDsl.g:538:3: ruleListaPeriodos
                    {
                     before(grammarAccess.getOrganizacaoCursoAccess().getListaPeriodosParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleListaPeriodos();

                    state._fsp--;

                     after(grammarAccess.getOrganizacaoCursoAccess().getListaPeriodosParserRuleCall_1()); 

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
    // $ANTLR end "rule__OrganizacaoCurso__Alternatives"


    // $ANTLR start "rule__OrganizacaoDepartamento__Alternatives"
    // InternalAceDsl.g:547:1: rule__OrganizacaoDepartamento__Alternatives : ( ( ruleListaCursos ) | ( ruleListaDisciplinas ) | ( ruleListaPeriodos ) );
    public final void rule__OrganizacaoDepartamento__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:551:1: ( ( ruleListaCursos ) | ( ruleListaDisciplinas ) | ( ruleListaPeriodos ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt3=1;
                }
                break;
            case 30:
                {
                alt3=2;
                }
                break;
            case 33:
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
                    // InternalAceDsl.g:552:2: ( ruleListaCursos )
                    {
                    // InternalAceDsl.g:552:2: ( ruleListaCursos )
                    // InternalAceDsl.g:553:3: ruleListaCursos
                    {
                     before(grammarAccess.getOrganizacaoDepartamentoAccess().getListaCursosParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleListaCursos();

                    state._fsp--;

                     after(grammarAccess.getOrganizacaoDepartamentoAccess().getListaCursosParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAceDsl.g:558:2: ( ruleListaDisciplinas )
                    {
                    // InternalAceDsl.g:558:2: ( ruleListaDisciplinas )
                    // InternalAceDsl.g:559:3: ruleListaDisciplinas
                    {
                     before(grammarAccess.getOrganizacaoDepartamentoAccess().getListaDisciplinasParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleListaDisciplinas();

                    state._fsp--;

                     after(grammarAccess.getOrganizacaoDepartamentoAccess().getListaDisciplinasParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAceDsl.g:564:2: ( ruleListaPeriodos )
                    {
                    // InternalAceDsl.g:564:2: ( ruleListaPeriodos )
                    // InternalAceDsl.g:565:3: ruleListaPeriodos
                    {
                     before(grammarAccess.getOrganizacaoDepartamentoAccess().getListaPeriodosParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleListaPeriodos();

                    state._fsp--;

                     after(grammarAccess.getOrganizacaoDepartamentoAccess().getListaPeriodosParserRuleCall_2()); 

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
    // $ANTLR end "rule__OrganizacaoDepartamento__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalAceDsl.g:574:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:578:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalAceDsl.g:579:2: ( RULE_STRING )
                    {
                    // InternalAceDsl.g:579:2: ( RULE_STRING )
                    // InternalAceDsl.g:580:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAceDsl.g:585:2: ( RULE_ID )
                    {
                    // InternalAceDsl.g:585:2: ( RULE_ID )
                    // InternalAceDsl.g:586:3: RULE_ID
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


    // $ANTLR start "rule__Fonte__Alternatives"
    // InternalAceDsl.g:595:1: rule__Fonte__Alternatives : ( ( ( 'Normal' ) ) | ( ( 'Sans' ) ) | ( ( 'Serif' ) ) | ( ( 'Monospace' ) ) );
    public final void rule__Fonte__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:599:1: ( ( ( 'Normal' ) ) | ( ( 'Sans' ) ) | ( ( 'Serif' ) ) | ( ( 'Monospace' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAceDsl.g:600:2: ( ( 'Normal' ) )
                    {
                    // InternalAceDsl.g:600:2: ( ( 'Normal' ) )
                    // InternalAceDsl.g:601:3: ( 'Normal' )
                    {
                     before(grammarAccess.getFonteAccess().getNormalEnumLiteralDeclaration_0()); 
                    // InternalAceDsl.g:602:3: ( 'Normal' )
                    // InternalAceDsl.g:602:4: 'Normal'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonteAccess().getNormalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAceDsl.g:606:2: ( ( 'Sans' ) )
                    {
                    // InternalAceDsl.g:606:2: ( ( 'Sans' ) )
                    // InternalAceDsl.g:607:3: ( 'Sans' )
                    {
                     before(grammarAccess.getFonteAccess().getSansEnumLiteralDeclaration_1()); 
                    // InternalAceDsl.g:608:3: ( 'Sans' )
                    // InternalAceDsl.g:608:4: 'Sans'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonteAccess().getSansEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAceDsl.g:612:2: ( ( 'Serif' ) )
                    {
                    // InternalAceDsl.g:612:2: ( ( 'Serif' ) )
                    // InternalAceDsl.g:613:3: ( 'Serif' )
                    {
                     before(grammarAccess.getFonteAccess().getSerifEnumLiteralDeclaration_2()); 
                    // InternalAceDsl.g:614:3: ( 'Serif' )
                    // InternalAceDsl.g:614:4: 'Serif'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonteAccess().getSerifEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAceDsl.g:618:2: ( ( 'Monospace' ) )
                    {
                    // InternalAceDsl.g:618:2: ( ( 'Monospace' ) )
                    // InternalAceDsl.g:619:3: ( 'Monospace' )
                    {
                     before(grammarAccess.getFonteAccess().getMonospaceEnumLiteralDeclaration_3()); 
                    // InternalAceDsl.g:620:3: ( 'Monospace' )
                    // InternalAceDsl.g:620:4: 'Monospace'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getFonteAccess().getMonospaceEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__Fonte__Alternatives"


    // $ANTLR start "rule__Aplicativo__Group__0"
    // InternalAceDsl.g:628:1: rule__Aplicativo__Group__0 : rule__Aplicativo__Group__0__Impl rule__Aplicativo__Group__1 ;
    public final void rule__Aplicativo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:632:1: ( rule__Aplicativo__Group__0__Impl rule__Aplicativo__Group__1 )
            // InternalAceDsl.g:633:2: rule__Aplicativo__Group__0__Impl rule__Aplicativo__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Aplicativo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicativo__Group__1();

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
    // $ANTLR end "rule__Aplicativo__Group__0"


    // $ANTLR start "rule__Aplicativo__Group__0__Impl"
    // InternalAceDsl.g:640:1: rule__Aplicativo__Group__0__Impl : ( 'Aplicativo' ) ;
    public final void rule__Aplicativo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:644:1: ( ( 'Aplicativo' ) )
            // InternalAceDsl.g:645:1: ( 'Aplicativo' )
            {
            // InternalAceDsl.g:645:1: ( 'Aplicativo' )
            // InternalAceDsl.g:646:2: 'Aplicativo'
            {
             before(grammarAccess.getAplicativoAccess().getAplicativoKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAplicativoAccess().getAplicativoKeyword_0()); 

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
    // $ANTLR end "rule__Aplicativo__Group__0__Impl"


    // $ANTLR start "rule__Aplicativo__Group__1"
    // InternalAceDsl.g:655:1: rule__Aplicativo__Group__1 : rule__Aplicativo__Group__1__Impl rule__Aplicativo__Group__2 ;
    public final void rule__Aplicativo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:659:1: ( rule__Aplicativo__Group__1__Impl rule__Aplicativo__Group__2 )
            // InternalAceDsl.g:660:2: rule__Aplicativo__Group__1__Impl rule__Aplicativo__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Aplicativo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicativo__Group__2();

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
    // $ANTLR end "rule__Aplicativo__Group__1"


    // $ANTLR start "rule__Aplicativo__Group__1__Impl"
    // InternalAceDsl.g:667:1: rule__Aplicativo__Group__1__Impl : ( ( rule__Aplicativo__NomeAssignment_1 ) ) ;
    public final void rule__Aplicativo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:671:1: ( ( ( rule__Aplicativo__NomeAssignment_1 ) ) )
            // InternalAceDsl.g:672:1: ( ( rule__Aplicativo__NomeAssignment_1 ) )
            {
            // InternalAceDsl.g:672:1: ( ( rule__Aplicativo__NomeAssignment_1 ) )
            // InternalAceDsl.g:673:2: ( rule__Aplicativo__NomeAssignment_1 )
            {
             before(grammarAccess.getAplicativoAccess().getNomeAssignment_1()); 
            // InternalAceDsl.g:674:2: ( rule__Aplicativo__NomeAssignment_1 )
            // InternalAceDsl.g:674:3: rule__Aplicativo__NomeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Aplicativo__NomeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAplicativoAccess().getNomeAssignment_1()); 

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
    // $ANTLR end "rule__Aplicativo__Group__1__Impl"


    // $ANTLR start "rule__Aplicativo__Group__2"
    // InternalAceDsl.g:682:1: rule__Aplicativo__Group__2 : rule__Aplicativo__Group__2__Impl rule__Aplicativo__Group__3 ;
    public final void rule__Aplicativo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:686:1: ( rule__Aplicativo__Group__2__Impl rule__Aplicativo__Group__3 )
            // InternalAceDsl.g:687:2: rule__Aplicativo__Group__2__Impl rule__Aplicativo__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Aplicativo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicativo__Group__3();

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
    // $ANTLR end "rule__Aplicativo__Group__2"


    // $ANTLR start "rule__Aplicativo__Group__2__Impl"
    // InternalAceDsl.g:694:1: rule__Aplicativo__Group__2__Impl : ( '{' ) ;
    public final void rule__Aplicativo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:698:1: ( ( '{' ) )
            // InternalAceDsl.g:699:1: ( '{' )
            {
            // InternalAceDsl.g:699:1: ( '{' )
            // InternalAceDsl.g:700:2: '{'
            {
             before(grammarAccess.getAplicativoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAplicativoAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Aplicativo__Group__2__Impl"


    // $ANTLR start "rule__Aplicativo__Group__3"
    // InternalAceDsl.g:709:1: rule__Aplicativo__Group__3 : rule__Aplicativo__Group__3__Impl rule__Aplicativo__Group__4 ;
    public final void rule__Aplicativo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:713:1: ( rule__Aplicativo__Group__3__Impl rule__Aplicativo__Group__4 )
            // InternalAceDsl.g:714:2: rule__Aplicativo__Group__3__Impl rule__Aplicativo__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Aplicativo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicativo__Group__4();

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
    // $ANTLR end "rule__Aplicativo__Group__3"


    // $ANTLR start "rule__Aplicativo__Group__3__Impl"
    // InternalAceDsl.g:721:1: rule__Aplicativo__Group__3__Impl : ( ( rule__Aplicativo__UnorderedGroup_3 ) ) ;
    public final void rule__Aplicativo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:725:1: ( ( ( rule__Aplicativo__UnorderedGroup_3 ) ) )
            // InternalAceDsl.g:726:1: ( ( rule__Aplicativo__UnorderedGroup_3 ) )
            {
            // InternalAceDsl.g:726:1: ( ( rule__Aplicativo__UnorderedGroup_3 ) )
            // InternalAceDsl.g:727:2: ( rule__Aplicativo__UnorderedGroup_3 )
            {
             before(grammarAccess.getAplicativoAccess().getUnorderedGroup_3()); 
            // InternalAceDsl.g:728:2: ( rule__Aplicativo__UnorderedGroup_3 )
            // InternalAceDsl.g:728:3: rule__Aplicativo__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__Aplicativo__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getAplicativoAccess().getUnorderedGroup_3()); 

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
    // $ANTLR end "rule__Aplicativo__Group__3__Impl"


    // $ANTLR start "rule__Aplicativo__Group__4"
    // InternalAceDsl.g:736:1: rule__Aplicativo__Group__4 : rule__Aplicativo__Group__4__Impl ;
    public final void rule__Aplicativo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:740:1: ( rule__Aplicativo__Group__4__Impl )
            // InternalAceDsl.g:741:2: rule__Aplicativo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aplicativo__Group__4__Impl();

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
    // $ANTLR end "rule__Aplicativo__Group__4"


    // $ANTLR start "rule__Aplicativo__Group__4__Impl"
    // InternalAceDsl.g:747:1: rule__Aplicativo__Group__4__Impl : ( '}' ) ;
    public final void rule__Aplicativo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:751:1: ( ( '}' ) )
            // InternalAceDsl.g:752:1: ( '}' )
            {
            // InternalAceDsl.g:752:1: ( '}' )
            // InternalAceDsl.g:753:2: '}'
            {
             before(grammarAccess.getAplicativoAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAplicativoAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Aplicativo__Group__4__Impl"


    // $ANTLR start "rule__Aplicativo__Group_3_0__0"
    // InternalAceDsl.g:763:1: rule__Aplicativo__Group_3_0__0 : rule__Aplicativo__Group_3_0__0__Impl rule__Aplicativo__Group_3_0__1 ;
    public final void rule__Aplicativo__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:767:1: ( rule__Aplicativo__Group_3_0__0__Impl rule__Aplicativo__Group_3_0__1 )
            // InternalAceDsl.g:768:2: rule__Aplicativo__Group_3_0__0__Impl rule__Aplicativo__Group_3_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Aplicativo__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Aplicativo__Group_3_0__1();

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
    // $ANTLR end "rule__Aplicativo__Group_3_0__0"


    // $ANTLR start "rule__Aplicativo__Group_3_0__0__Impl"
    // InternalAceDsl.g:775:1: rule__Aplicativo__Group_3_0__0__Impl : ( 'url' ) ;
    public final void rule__Aplicativo__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:779:1: ( ( 'url' ) )
            // InternalAceDsl.g:780:1: ( 'url' )
            {
            // InternalAceDsl.g:780:1: ( 'url' )
            // InternalAceDsl.g:781:2: 'url'
            {
             before(grammarAccess.getAplicativoAccess().getUrlKeyword_3_0_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAplicativoAccess().getUrlKeyword_3_0_0()); 

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
    // $ANTLR end "rule__Aplicativo__Group_3_0__0__Impl"


    // $ANTLR start "rule__Aplicativo__Group_3_0__1"
    // InternalAceDsl.g:790:1: rule__Aplicativo__Group_3_0__1 : rule__Aplicativo__Group_3_0__1__Impl ;
    public final void rule__Aplicativo__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:794:1: ( rule__Aplicativo__Group_3_0__1__Impl )
            // InternalAceDsl.g:795:2: rule__Aplicativo__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aplicativo__Group_3_0__1__Impl();

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
    // $ANTLR end "rule__Aplicativo__Group_3_0__1"


    // $ANTLR start "rule__Aplicativo__Group_3_0__1__Impl"
    // InternalAceDsl.g:801:1: rule__Aplicativo__Group_3_0__1__Impl : ( ( rule__Aplicativo__UrlAssignment_3_0_1 ) ) ;
    public final void rule__Aplicativo__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:805:1: ( ( ( rule__Aplicativo__UrlAssignment_3_0_1 ) ) )
            // InternalAceDsl.g:806:1: ( ( rule__Aplicativo__UrlAssignment_3_0_1 ) )
            {
            // InternalAceDsl.g:806:1: ( ( rule__Aplicativo__UrlAssignment_3_0_1 ) )
            // InternalAceDsl.g:807:2: ( rule__Aplicativo__UrlAssignment_3_0_1 )
            {
             before(grammarAccess.getAplicativoAccess().getUrlAssignment_3_0_1()); 
            // InternalAceDsl.g:808:2: ( rule__Aplicativo__UrlAssignment_3_0_1 )
            // InternalAceDsl.g:808:3: rule__Aplicativo__UrlAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Aplicativo__UrlAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAplicativoAccess().getUrlAssignment_3_0_1()); 

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
    // $ANTLR end "rule__Aplicativo__Group_3_0__1__Impl"


    // $ANTLR start "rule__SecaoEventos__Group__0"
    // InternalAceDsl.g:817:1: rule__SecaoEventos__Group__0 : rule__SecaoEventos__Group__0__Impl rule__SecaoEventos__Group__1 ;
    public final void rule__SecaoEventos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:821:1: ( rule__SecaoEventos__Group__0__Impl rule__SecaoEventos__Group__1 )
            // InternalAceDsl.g:822:2: rule__SecaoEventos__Group__0__Impl rule__SecaoEventos__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SecaoEventos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecaoEventos__Group__1();

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
    // $ANTLR end "rule__SecaoEventos__Group__0"


    // $ANTLR start "rule__SecaoEventos__Group__0__Impl"
    // InternalAceDsl.g:829:1: rule__SecaoEventos__Group__0__Impl : ( 'secao eventos' ) ;
    public final void rule__SecaoEventos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:833:1: ( ( 'secao eventos' ) )
            // InternalAceDsl.g:834:1: ( 'secao eventos' )
            {
            // InternalAceDsl.g:834:1: ( 'secao eventos' )
            // InternalAceDsl.g:835:2: 'secao eventos'
            {
             before(grammarAccess.getSecaoEventosAccess().getSecaoEventosKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSecaoEventosAccess().getSecaoEventosKeyword_0()); 

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
    // $ANTLR end "rule__SecaoEventos__Group__0__Impl"


    // $ANTLR start "rule__SecaoEventos__Group__1"
    // InternalAceDsl.g:844:1: rule__SecaoEventos__Group__1 : rule__SecaoEventos__Group__1__Impl ;
    public final void rule__SecaoEventos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:848:1: ( rule__SecaoEventos__Group__1__Impl )
            // InternalAceDsl.g:849:2: rule__SecaoEventos__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecaoEventos__Group__1__Impl();

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
    // $ANTLR end "rule__SecaoEventos__Group__1"


    // $ANTLR start "rule__SecaoEventos__Group__1__Impl"
    // InternalAceDsl.g:855:1: rule__SecaoEventos__Group__1__Impl : ( ( rule__SecaoEventos__NomeAssignment_1 ) ) ;
    public final void rule__SecaoEventos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:859:1: ( ( ( rule__SecaoEventos__NomeAssignment_1 ) ) )
            // InternalAceDsl.g:860:1: ( ( rule__SecaoEventos__NomeAssignment_1 ) )
            {
            // InternalAceDsl.g:860:1: ( ( rule__SecaoEventos__NomeAssignment_1 ) )
            // InternalAceDsl.g:861:2: ( rule__SecaoEventos__NomeAssignment_1 )
            {
             before(grammarAccess.getSecaoEventosAccess().getNomeAssignment_1()); 
            // InternalAceDsl.g:862:2: ( rule__SecaoEventos__NomeAssignment_1 )
            // InternalAceDsl.g:862:3: rule__SecaoEventos__NomeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SecaoEventos__NomeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSecaoEventosAccess().getNomeAssignment_1()); 

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
    // $ANTLR end "rule__SecaoEventos__Group__1__Impl"


    // $ANTLR start "rule__SecaoMembros__Group__0"
    // InternalAceDsl.g:871:1: rule__SecaoMembros__Group__0 : rule__SecaoMembros__Group__0__Impl rule__SecaoMembros__Group__1 ;
    public final void rule__SecaoMembros__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:875:1: ( rule__SecaoMembros__Group__0__Impl rule__SecaoMembros__Group__1 )
            // InternalAceDsl.g:876:2: rule__SecaoMembros__Group__0__Impl rule__SecaoMembros__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SecaoMembros__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecaoMembros__Group__1();

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
    // $ANTLR end "rule__SecaoMembros__Group__0"


    // $ANTLR start "rule__SecaoMembros__Group__0__Impl"
    // InternalAceDsl.g:883:1: rule__SecaoMembros__Group__0__Impl : ( 'secao membros' ) ;
    public final void rule__SecaoMembros__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:887:1: ( ( 'secao membros' ) )
            // InternalAceDsl.g:888:1: ( 'secao membros' )
            {
            // InternalAceDsl.g:888:1: ( 'secao membros' )
            // InternalAceDsl.g:889:2: 'secao membros'
            {
             before(grammarAccess.getSecaoMembrosAccess().getSecaoMembrosKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSecaoMembrosAccess().getSecaoMembrosKeyword_0()); 

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
    // $ANTLR end "rule__SecaoMembros__Group__0__Impl"


    // $ANTLR start "rule__SecaoMembros__Group__1"
    // InternalAceDsl.g:898:1: rule__SecaoMembros__Group__1 : rule__SecaoMembros__Group__1__Impl ;
    public final void rule__SecaoMembros__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:902:1: ( rule__SecaoMembros__Group__1__Impl )
            // InternalAceDsl.g:903:2: rule__SecaoMembros__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecaoMembros__Group__1__Impl();

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
    // $ANTLR end "rule__SecaoMembros__Group__1"


    // $ANTLR start "rule__SecaoMembros__Group__1__Impl"
    // InternalAceDsl.g:909:1: rule__SecaoMembros__Group__1__Impl : ( ( rule__SecaoMembros__NomeAssignment_1 ) ) ;
    public final void rule__SecaoMembros__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:913:1: ( ( ( rule__SecaoMembros__NomeAssignment_1 ) ) )
            // InternalAceDsl.g:914:1: ( ( rule__SecaoMembros__NomeAssignment_1 ) )
            {
            // InternalAceDsl.g:914:1: ( ( rule__SecaoMembros__NomeAssignment_1 ) )
            // InternalAceDsl.g:915:2: ( rule__SecaoMembros__NomeAssignment_1 )
            {
             before(grammarAccess.getSecaoMembrosAccess().getNomeAssignment_1()); 
            // InternalAceDsl.g:916:2: ( rule__SecaoMembros__NomeAssignment_1 )
            // InternalAceDsl.g:916:3: rule__SecaoMembros__NomeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SecaoMembros__NomeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSecaoMembrosAccess().getNomeAssignment_1()); 

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
    // $ANTLR end "rule__SecaoMembros__Group__1__Impl"


    // $ANTLR start "rule__SecaoDisciplinas__Group__0"
    // InternalAceDsl.g:925:1: rule__SecaoDisciplinas__Group__0 : rule__SecaoDisciplinas__Group__0__Impl rule__SecaoDisciplinas__Group__1 ;
    public final void rule__SecaoDisciplinas__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:929:1: ( rule__SecaoDisciplinas__Group__0__Impl rule__SecaoDisciplinas__Group__1 )
            // InternalAceDsl.g:930:2: rule__SecaoDisciplinas__Group__0__Impl rule__SecaoDisciplinas__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SecaoDisciplinas__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecaoDisciplinas__Group__1();

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
    // $ANTLR end "rule__SecaoDisciplinas__Group__0"


    // $ANTLR start "rule__SecaoDisciplinas__Group__0__Impl"
    // InternalAceDsl.g:937:1: rule__SecaoDisciplinas__Group__0__Impl : ( 'secao disciplinas' ) ;
    public final void rule__SecaoDisciplinas__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:941:1: ( ( 'secao disciplinas' ) )
            // InternalAceDsl.g:942:1: ( 'secao disciplinas' )
            {
            // InternalAceDsl.g:942:1: ( 'secao disciplinas' )
            // InternalAceDsl.g:943:2: 'secao disciplinas'
            {
             before(grammarAccess.getSecaoDisciplinasAccess().getSecaoDisciplinasKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSecaoDisciplinasAccess().getSecaoDisciplinasKeyword_0()); 

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
    // $ANTLR end "rule__SecaoDisciplinas__Group__0__Impl"


    // $ANTLR start "rule__SecaoDisciplinas__Group__1"
    // InternalAceDsl.g:952:1: rule__SecaoDisciplinas__Group__1 : rule__SecaoDisciplinas__Group__1__Impl rule__SecaoDisciplinas__Group__2 ;
    public final void rule__SecaoDisciplinas__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:956:1: ( rule__SecaoDisciplinas__Group__1__Impl rule__SecaoDisciplinas__Group__2 )
            // InternalAceDsl.g:957:2: rule__SecaoDisciplinas__Group__1__Impl rule__SecaoDisciplinas__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SecaoDisciplinas__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecaoDisciplinas__Group__2();

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
    // $ANTLR end "rule__SecaoDisciplinas__Group__1"


    // $ANTLR start "rule__SecaoDisciplinas__Group__1__Impl"
    // InternalAceDsl.g:964:1: rule__SecaoDisciplinas__Group__1__Impl : ( ( rule__SecaoDisciplinas__NomeAssignment_1 ) ) ;
    public final void rule__SecaoDisciplinas__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:968:1: ( ( ( rule__SecaoDisciplinas__NomeAssignment_1 ) ) )
            // InternalAceDsl.g:969:1: ( ( rule__SecaoDisciplinas__NomeAssignment_1 ) )
            {
            // InternalAceDsl.g:969:1: ( ( rule__SecaoDisciplinas__NomeAssignment_1 ) )
            // InternalAceDsl.g:970:2: ( rule__SecaoDisciplinas__NomeAssignment_1 )
            {
             before(grammarAccess.getSecaoDisciplinasAccess().getNomeAssignment_1()); 
            // InternalAceDsl.g:971:2: ( rule__SecaoDisciplinas__NomeAssignment_1 )
            // InternalAceDsl.g:971:3: rule__SecaoDisciplinas__NomeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SecaoDisciplinas__NomeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSecaoDisciplinasAccess().getNomeAssignment_1()); 

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
    // $ANTLR end "rule__SecaoDisciplinas__Group__1__Impl"


    // $ANTLR start "rule__SecaoDisciplinas__Group__2"
    // InternalAceDsl.g:979:1: rule__SecaoDisciplinas__Group__2 : rule__SecaoDisciplinas__Group__2__Impl rule__SecaoDisciplinas__Group__3 ;
    public final void rule__SecaoDisciplinas__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:983:1: ( rule__SecaoDisciplinas__Group__2__Impl rule__SecaoDisciplinas__Group__3 )
            // InternalAceDsl.g:984:2: rule__SecaoDisciplinas__Group__2__Impl rule__SecaoDisciplinas__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SecaoDisciplinas__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecaoDisciplinas__Group__3();

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
    // $ANTLR end "rule__SecaoDisciplinas__Group__2"


    // $ANTLR start "rule__SecaoDisciplinas__Group__2__Impl"
    // InternalAceDsl.g:991:1: rule__SecaoDisciplinas__Group__2__Impl : ( '{' ) ;
    public final void rule__SecaoDisciplinas__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:995:1: ( ( '{' ) )
            // InternalAceDsl.g:996:1: ( '{' )
            {
            // InternalAceDsl.g:996:1: ( '{' )
            // InternalAceDsl.g:997:2: '{'
            {
             before(grammarAccess.getSecaoDisciplinasAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSecaoDisciplinasAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__SecaoDisciplinas__Group__2__Impl"


    // $ANTLR start "rule__SecaoDisciplinas__Group__3"
    // InternalAceDsl.g:1006:1: rule__SecaoDisciplinas__Group__3 : rule__SecaoDisciplinas__Group__3__Impl rule__SecaoDisciplinas__Group__4 ;
    public final void rule__SecaoDisciplinas__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1010:1: ( rule__SecaoDisciplinas__Group__3__Impl rule__SecaoDisciplinas__Group__4 )
            // InternalAceDsl.g:1011:2: rule__SecaoDisciplinas__Group__3__Impl rule__SecaoDisciplinas__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__SecaoDisciplinas__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecaoDisciplinas__Group__4();

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
    // $ANTLR end "rule__SecaoDisciplinas__Group__3"


    // $ANTLR start "rule__SecaoDisciplinas__Group__3__Impl"
    // InternalAceDsl.g:1018:1: rule__SecaoDisciplinas__Group__3__Impl : ( ( rule__SecaoDisciplinas__SeparacaoDisciplinasAssignment_3 ) ) ;
    public final void rule__SecaoDisciplinas__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1022:1: ( ( ( rule__SecaoDisciplinas__SeparacaoDisciplinasAssignment_3 ) ) )
            // InternalAceDsl.g:1023:1: ( ( rule__SecaoDisciplinas__SeparacaoDisciplinasAssignment_3 ) )
            {
            // InternalAceDsl.g:1023:1: ( ( rule__SecaoDisciplinas__SeparacaoDisciplinasAssignment_3 ) )
            // InternalAceDsl.g:1024:2: ( rule__SecaoDisciplinas__SeparacaoDisciplinasAssignment_3 )
            {
             before(grammarAccess.getSecaoDisciplinasAccess().getSeparacaoDisciplinasAssignment_3()); 
            // InternalAceDsl.g:1025:2: ( rule__SecaoDisciplinas__SeparacaoDisciplinasAssignment_3 )
            // InternalAceDsl.g:1025:3: rule__SecaoDisciplinas__SeparacaoDisciplinasAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SecaoDisciplinas__SeparacaoDisciplinasAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSecaoDisciplinasAccess().getSeparacaoDisciplinasAssignment_3()); 

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
    // $ANTLR end "rule__SecaoDisciplinas__Group__3__Impl"


    // $ANTLR start "rule__SecaoDisciplinas__Group__4"
    // InternalAceDsl.g:1033:1: rule__SecaoDisciplinas__Group__4 : rule__SecaoDisciplinas__Group__4__Impl ;
    public final void rule__SecaoDisciplinas__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1037:1: ( rule__SecaoDisciplinas__Group__4__Impl )
            // InternalAceDsl.g:1038:2: rule__SecaoDisciplinas__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecaoDisciplinas__Group__4__Impl();

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
    // $ANTLR end "rule__SecaoDisciplinas__Group__4"


    // $ANTLR start "rule__SecaoDisciplinas__Group__4__Impl"
    // InternalAceDsl.g:1044:1: rule__SecaoDisciplinas__Group__4__Impl : ( '}' ) ;
    public final void rule__SecaoDisciplinas__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1048:1: ( ( '}' ) )
            // InternalAceDsl.g:1049:1: ( '}' )
            {
            // InternalAceDsl.g:1049:1: ( '}' )
            // InternalAceDsl.g:1050:2: '}'
            {
             before(grammarAccess.getSecaoDisciplinasAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSecaoDisciplinasAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__SecaoDisciplinas__Group__4__Impl"


    // $ANTLR start "rule__SecaoNoticias__Group__0"
    // InternalAceDsl.g:1060:1: rule__SecaoNoticias__Group__0 : rule__SecaoNoticias__Group__0__Impl rule__SecaoNoticias__Group__1 ;
    public final void rule__SecaoNoticias__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1064:1: ( rule__SecaoNoticias__Group__0__Impl rule__SecaoNoticias__Group__1 )
            // InternalAceDsl.g:1065:2: rule__SecaoNoticias__Group__0__Impl rule__SecaoNoticias__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SecaoNoticias__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecaoNoticias__Group__1();

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
    // $ANTLR end "rule__SecaoNoticias__Group__0"


    // $ANTLR start "rule__SecaoNoticias__Group__0__Impl"
    // InternalAceDsl.g:1072:1: rule__SecaoNoticias__Group__0__Impl : ( 'secao noticias' ) ;
    public final void rule__SecaoNoticias__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1076:1: ( ( 'secao noticias' ) )
            // InternalAceDsl.g:1077:1: ( 'secao noticias' )
            {
            // InternalAceDsl.g:1077:1: ( 'secao noticias' )
            // InternalAceDsl.g:1078:2: 'secao noticias'
            {
             before(grammarAccess.getSecaoNoticiasAccess().getSecaoNoticiasKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSecaoNoticiasAccess().getSecaoNoticiasKeyword_0()); 

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
    // $ANTLR end "rule__SecaoNoticias__Group__0__Impl"


    // $ANTLR start "rule__SecaoNoticias__Group__1"
    // InternalAceDsl.g:1087:1: rule__SecaoNoticias__Group__1 : rule__SecaoNoticias__Group__1__Impl rule__SecaoNoticias__Group__2 ;
    public final void rule__SecaoNoticias__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1091:1: ( rule__SecaoNoticias__Group__1__Impl rule__SecaoNoticias__Group__2 )
            // InternalAceDsl.g:1092:2: rule__SecaoNoticias__Group__1__Impl rule__SecaoNoticias__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SecaoNoticias__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecaoNoticias__Group__2();

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
    // $ANTLR end "rule__SecaoNoticias__Group__1"


    // $ANTLR start "rule__SecaoNoticias__Group__1__Impl"
    // InternalAceDsl.g:1099:1: rule__SecaoNoticias__Group__1__Impl : ( ( rule__SecaoNoticias__NomeAssignment_1 ) ) ;
    public final void rule__SecaoNoticias__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1103:1: ( ( ( rule__SecaoNoticias__NomeAssignment_1 ) ) )
            // InternalAceDsl.g:1104:1: ( ( rule__SecaoNoticias__NomeAssignment_1 ) )
            {
            // InternalAceDsl.g:1104:1: ( ( rule__SecaoNoticias__NomeAssignment_1 ) )
            // InternalAceDsl.g:1105:2: ( rule__SecaoNoticias__NomeAssignment_1 )
            {
             before(grammarAccess.getSecaoNoticiasAccess().getNomeAssignment_1()); 
            // InternalAceDsl.g:1106:2: ( rule__SecaoNoticias__NomeAssignment_1 )
            // InternalAceDsl.g:1106:3: rule__SecaoNoticias__NomeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SecaoNoticias__NomeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSecaoNoticiasAccess().getNomeAssignment_1()); 

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
    // $ANTLR end "rule__SecaoNoticias__Group__1__Impl"


    // $ANTLR start "rule__SecaoNoticias__Group__2"
    // InternalAceDsl.g:1114:1: rule__SecaoNoticias__Group__2 : rule__SecaoNoticias__Group__2__Impl ;
    public final void rule__SecaoNoticias__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1118:1: ( rule__SecaoNoticias__Group__2__Impl )
            // InternalAceDsl.g:1119:2: rule__SecaoNoticias__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecaoNoticias__Group__2__Impl();

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
    // $ANTLR end "rule__SecaoNoticias__Group__2"


    // $ANTLR start "rule__SecaoNoticias__Group__2__Impl"
    // InternalAceDsl.g:1125:1: rule__SecaoNoticias__Group__2__Impl : ( ( rule__SecaoNoticias__Group_2__0 )? ) ;
    public final void rule__SecaoNoticias__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1129:1: ( ( ( rule__SecaoNoticias__Group_2__0 )? ) )
            // InternalAceDsl.g:1130:1: ( ( rule__SecaoNoticias__Group_2__0 )? )
            {
            // InternalAceDsl.g:1130:1: ( ( rule__SecaoNoticias__Group_2__0 )? )
            // InternalAceDsl.g:1131:2: ( rule__SecaoNoticias__Group_2__0 )?
            {
             before(grammarAccess.getSecaoNoticiasAccess().getGroup_2()); 
            // InternalAceDsl.g:1132:2: ( rule__SecaoNoticias__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAceDsl.g:1132:3: rule__SecaoNoticias__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SecaoNoticias__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSecaoNoticiasAccess().getGroup_2()); 

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
    // $ANTLR end "rule__SecaoNoticias__Group__2__Impl"


    // $ANTLR start "rule__SecaoNoticias__Group_2__0"
    // InternalAceDsl.g:1141:1: rule__SecaoNoticias__Group_2__0 : rule__SecaoNoticias__Group_2__0__Impl rule__SecaoNoticias__Group_2__1 ;
    public final void rule__SecaoNoticias__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1145:1: ( rule__SecaoNoticias__Group_2__0__Impl rule__SecaoNoticias__Group_2__1 )
            // InternalAceDsl.g:1146:2: rule__SecaoNoticias__Group_2__0__Impl rule__SecaoNoticias__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__SecaoNoticias__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecaoNoticias__Group_2__1();

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
    // $ANTLR end "rule__SecaoNoticias__Group_2__0"


    // $ANTLR start "rule__SecaoNoticias__Group_2__0__Impl"
    // InternalAceDsl.g:1153:1: rule__SecaoNoticias__Group_2__0__Impl : ( '{' ) ;
    public final void rule__SecaoNoticias__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1157:1: ( ( '{' ) )
            // InternalAceDsl.g:1158:1: ( '{' )
            {
            // InternalAceDsl.g:1158:1: ( '{' )
            // InternalAceDsl.g:1159:2: '{'
            {
             before(grammarAccess.getSecaoNoticiasAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSecaoNoticiasAccess().getLeftCurlyBracketKeyword_2_0()); 

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
    // $ANTLR end "rule__SecaoNoticias__Group_2__0__Impl"


    // $ANTLR start "rule__SecaoNoticias__Group_2__1"
    // InternalAceDsl.g:1168:1: rule__SecaoNoticias__Group_2__1 : rule__SecaoNoticias__Group_2__1__Impl rule__SecaoNoticias__Group_2__2 ;
    public final void rule__SecaoNoticias__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1172:1: ( rule__SecaoNoticias__Group_2__1__Impl rule__SecaoNoticias__Group_2__2 )
            // InternalAceDsl.g:1173:2: rule__SecaoNoticias__Group_2__1__Impl rule__SecaoNoticias__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__SecaoNoticias__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecaoNoticias__Group_2__2();

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
    // $ANTLR end "rule__SecaoNoticias__Group_2__1"


    // $ANTLR start "rule__SecaoNoticias__Group_2__1__Impl"
    // InternalAceDsl.g:1180:1: rule__SecaoNoticias__Group_2__1__Impl : ( ( rule__SecaoNoticias__Group_2_1__0 )? ) ;
    public final void rule__SecaoNoticias__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1184:1: ( ( ( rule__SecaoNoticias__Group_2_1__0 )? ) )
            // InternalAceDsl.g:1185:1: ( ( rule__SecaoNoticias__Group_2_1__0 )? )
            {
            // InternalAceDsl.g:1185:1: ( ( rule__SecaoNoticias__Group_2_1__0 )? )
            // InternalAceDsl.g:1186:2: ( rule__SecaoNoticias__Group_2_1__0 )?
            {
             before(grammarAccess.getSecaoNoticiasAccess().getGroup_2_1()); 
            // InternalAceDsl.g:1187:2: ( rule__SecaoNoticias__Group_2_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAceDsl.g:1187:3: rule__SecaoNoticias__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SecaoNoticias__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSecaoNoticiasAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__SecaoNoticias__Group_2__1__Impl"


    // $ANTLR start "rule__SecaoNoticias__Group_2__2"
    // InternalAceDsl.g:1195:1: rule__SecaoNoticias__Group_2__2 : rule__SecaoNoticias__Group_2__2__Impl ;
    public final void rule__SecaoNoticias__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1199:1: ( rule__SecaoNoticias__Group_2__2__Impl )
            // InternalAceDsl.g:1200:2: rule__SecaoNoticias__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecaoNoticias__Group_2__2__Impl();

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
    // $ANTLR end "rule__SecaoNoticias__Group_2__2"


    // $ANTLR start "rule__SecaoNoticias__Group_2__2__Impl"
    // InternalAceDsl.g:1206:1: rule__SecaoNoticias__Group_2__2__Impl : ( '}' ) ;
    public final void rule__SecaoNoticias__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1210:1: ( ( '}' ) )
            // InternalAceDsl.g:1211:1: ( '}' )
            {
            // InternalAceDsl.g:1211:1: ( '}' )
            // InternalAceDsl.g:1212:2: '}'
            {
             before(grammarAccess.getSecaoNoticiasAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSecaoNoticiasAccess().getRightCurlyBracketKeyword_2_2()); 

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
    // $ANTLR end "rule__SecaoNoticias__Group_2__2__Impl"


    // $ANTLR start "rule__SecaoNoticias__Group_2_1__0"
    // InternalAceDsl.g:1222:1: rule__SecaoNoticias__Group_2_1__0 : rule__SecaoNoticias__Group_2_1__0__Impl rule__SecaoNoticias__Group_2_1__1 ;
    public final void rule__SecaoNoticias__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1226:1: ( rule__SecaoNoticias__Group_2_1__0__Impl rule__SecaoNoticias__Group_2_1__1 )
            // InternalAceDsl.g:1227:2: rule__SecaoNoticias__Group_2_1__0__Impl rule__SecaoNoticias__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SecaoNoticias__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SecaoNoticias__Group_2_1__1();

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
    // $ANTLR end "rule__SecaoNoticias__Group_2_1__0"


    // $ANTLR start "rule__SecaoNoticias__Group_2_1__0__Impl"
    // InternalAceDsl.g:1234:1: rule__SecaoNoticias__Group_2_1__0__Impl : ( 'Facebook' ) ;
    public final void rule__SecaoNoticias__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1238:1: ( ( 'Facebook' ) )
            // InternalAceDsl.g:1239:1: ( 'Facebook' )
            {
            // InternalAceDsl.g:1239:1: ( 'Facebook' )
            // InternalAceDsl.g:1240:2: 'Facebook'
            {
             before(grammarAccess.getSecaoNoticiasAccess().getFacebookKeyword_2_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSecaoNoticiasAccess().getFacebookKeyword_2_1_0()); 

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
    // $ANTLR end "rule__SecaoNoticias__Group_2_1__0__Impl"


    // $ANTLR start "rule__SecaoNoticias__Group_2_1__1"
    // InternalAceDsl.g:1249:1: rule__SecaoNoticias__Group_2_1__1 : rule__SecaoNoticias__Group_2_1__1__Impl ;
    public final void rule__SecaoNoticias__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1253:1: ( rule__SecaoNoticias__Group_2_1__1__Impl )
            // InternalAceDsl.g:1254:2: rule__SecaoNoticias__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecaoNoticias__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__SecaoNoticias__Group_2_1__1"


    // $ANTLR start "rule__SecaoNoticias__Group_2_1__1__Impl"
    // InternalAceDsl.g:1260:1: rule__SecaoNoticias__Group_2_1__1__Impl : ( ( rule__SecaoNoticias__FacebookAssignment_2_1_1 ) ) ;
    public final void rule__SecaoNoticias__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1264:1: ( ( ( rule__SecaoNoticias__FacebookAssignment_2_1_1 ) ) )
            // InternalAceDsl.g:1265:1: ( ( rule__SecaoNoticias__FacebookAssignment_2_1_1 ) )
            {
            // InternalAceDsl.g:1265:1: ( ( rule__SecaoNoticias__FacebookAssignment_2_1_1 ) )
            // InternalAceDsl.g:1266:2: ( rule__SecaoNoticias__FacebookAssignment_2_1_1 )
            {
             before(grammarAccess.getSecaoNoticiasAccess().getFacebookAssignment_2_1_1()); 
            // InternalAceDsl.g:1267:2: ( rule__SecaoNoticias__FacebookAssignment_2_1_1 )
            // InternalAceDsl.g:1267:3: rule__SecaoNoticias__FacebookAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SecaoNoticias__FacebookAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSecaoNoticiasAccess().getFacebookAssignment_2_1_1()); 

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
    // $ANTLR end "rule__SecaoNoticias__Group_2_1__1__Impl"


    // $ANTLR start "rule__Estilo__Group__0"
    // InternalAceDsl.g:1276:1: rule__Estilo__Group__0 : rule__Estilo__Group__0__Impl rule__Estilo__Group__1 ;
    public final void rule__Estilo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1280:1: ( rule__Estilo__Group__0__Impl rule__Estilo__Group__1 )
            // InternalAceDsl.g:1281:2: rule__Estilo__Group__0__Impl rule__Estilo__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Estilo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estilo__Group__1();

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
    // $ANTLR end "rule__Estilo__Group__0"


    // $ANTLR start "rule__Estilo__Group__0__Impl"
    // InternalAceDsl.g:1288:1: rule__Estilo__Group__0__Impl : ( 'estilo' ) ;
    public final void rule__Estilo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1292:1: ( ( 'estilo' ) )
            // InternalAceDsl.g:1293:1: ( 'estilo' )
            {
            // InternalAceDsl.g:1293:1: ( 'estilo' )
            // InternalAceDsl.g:1294:2: 'estilo'
            {
             before(grammarAccess.getEstiloAccess().getEstiloKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEstiloAccess().getEstiloKeyword_0()); 

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
    // $ANTLR end "rule__Estilo__Group__0__Impl"


    // $ANTLR start "rule__Estilo__Group__1"
    // InternalAceDsl.g:1303:1: rule__Estilo__Group__1 : rule__Estilo__Group__1__Impl rule__Estilo__Group__2 ;
    public final void rule__Estilo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1307:1: ( rule__Estilo__Group__1__Impl rule__Estilo__Group__2 )
            // InternalAceDsl.g:1308:2: rule__Estilo__Group__1__Impl rule__Estilo__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Estilo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estilo__Group__2();

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
    // $ANTLR end "rule__Estilo__Group__1"


    // $ANTLR start "rule__Estilo__Group__1__Impl"
    // InternalAceDsl.g:1315:1: rule__Estilo__Group__1__Impl : ( '{' ) ;
    public final void rule__Estilo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1319:1: ( ( '{' ) )
            // InternalAceDsl.g:1320:1: ( '{' )
            {
            // InternalAceDsl.g:1320:1: ( '{' )
            // InternalAceDsl.g:1321:2: '{'
            {
             before(grammarAccess.getEstiloAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEstiloAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Estilo__Group__1__Impl"


    // $ANTLR start "rule__Estilo__Group__2"
    // InternalAceDsl.g:1330:1: rule__Estilo__Group__2 : rule__Estilo__Group__2__Impl rule__Estilo__Group__3 ;
    public final void rule__Estilo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1334:1: ( rule__Estilo__Group__2__Impl rule__Estilo__Group__3 )
            // InternalAceDsl.g:1335:2: rule__Estilo__Group__2__Impl rule__Estilo__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Estilo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estilo__Group__3();

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
    // $ANTLR end "rule__Estilo__Group__2"


    // $ANTLR start "rule__Estilo__Group__2__Impl"
    // InternalAceDsl.g:1342:1: rule__Estilo__Group__2__Impl : ( ( rule__Estilo__UnorderedGroup_2 ) ) ;
    public final void rule__Estilo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1346:1: ( ( ( rule__Estilo__UnorderedGroup_2 ) ) )
            // InternalAceDsl.g:1347:1: ( ( rule__Estilo__UnorderedGroup_2 ) )
            {
            // InternalAceDsl.g:1347:1: ( ( rule__Estilo__UnorderedGroup_2 ) )
            // InternalAceDsl.g:1348:2: ( rule__Estilo__UnorderedGroup_2 )
            {
             before(grammarAccess.getEstiloAccess().getUnorderedGroup_2()); 
            // InternalAceDsl.g:1349:2: ( rule__Estilo__UnorderedGroup_2 )
            // InternalAceDsl.g:1349:3: rule__Estilo__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getEstiloAccess().getUnorderedGroup_2()); 

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
    // $ANTLR end "rule__Estilo__Group__2__Impl"


    // $ANTLR start "rule__Estilo__Group__3"
    // InternalAceDsl.g:1357:1: rule__Estilo__Group__3 : rule__Estilo__Group__3__Impl ;
    public final void rule__Estilo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1361:1: ( rule__Estilo__Group__3__Impl )
            // InternalAceDsl.g:1362:2: rule__Estilo__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__Group__3__Impl();

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
    // $ANTLR end "rule__Estilo__Group__3"


    // $ANTLR start "rule__Estilo__Group__3__Impl"
    // InternalAceDsl.g:1368:1: rule__Estilo__Group__3__Impl : ( '}' ) ;
    public final void rule__Estilo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1372:1: ( ( '}' ) )
            // InternalAceDsl.g:1373:1: ( '}' )
            {
            // InternalAceDsl.g:1373:1: ( '}' )
            // InternalAceDsl.g:1374:2: '}'
            {
             before(grammarAccess.getEstiloAccess().getRightCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEstiloAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Estilo__Group__3__Impl"


    // $ANTLR start "rule__Estilo__Group_2_0__0"
    // InternalAceDsl.g:1384:1: rule__Estilo__Group_2_0__0 : rule__Estilo__Group_2_0__0__Impl rule__Estilo__Group_2_0__1 ;
    public final void rule__Estilo__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1388:1: ( rule__Estilo__Group_2_0__0__Impl rule__Estilo__Group_2_0__1 )
            // InternalAceDsl.g:1389:2: rule__Estilo__Group_2_0__0__Impl rule__Estilo__Group_2_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Estilo__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estilo__Group_2_0__1();

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
    // $ANTLR end "rule__Estilo__Group_2_0__0"


    // $ANTLR start "rule__Estilo__Group_2_0__0__Impl"
    // InternalAceDsl.g:1396:1: rule__Estilo__Group_2_0__0__Impl : ( 'logo' ) ;
    public final void rule__Estilo__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1400:1: ( ( 'logo' ) )
            // InternalAceDsl.g:1401:1: ( 'logo' )
            {
            // InternalAceDsl.g:1401:1: ( 'logo' )
            // InternalAceDsl.g:1402:2: 'logo'
            {
             before(grammarAccess.getEstiloAccess().getLogoKeyword_2_0_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEstiloAccess().getLogoKeyword_2_0_0()); 

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
    // $ANTLR end "rule__Estilo__Group_2_0__0__Impl"


    // $ANTLR start "rule__Estilo__Group_2_0__1"
    // InternalAceDsl.g:1411:1: rule__Estilo__Group_2_0__1 : rule__Estilo__Group_2_0__1__Impl ;
    public final void rule__Estilo__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1415:1: ( rule__Estilo__Group_2_0__1__Impl )
            // InternalAceDsl.g:1416:2: rule__Estilo__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__Group_2_0__1__Impl();

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
    // $ANTLR end "rule__Estilo__Group_2_0__1"


    // $ANTLR start "rule__Estilo__Group_2_0__1__Impl"
    // InternalAceDsl.g:1422:1: rule__Estilo__Group_2_0__1__Impl : ( ( rule__Estilo__LogoAssignment_2_0_1 ) ) ;
    public final void rule__Estilo__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1426:1: ( ( ( rule__Estilo__LogoAssignment_2_0_1 ) ) )
            // InternalAceDsl.g:1427:1: ( ( rule__Estilo__LogoAssignment_2_0_1 ) )
            {
            // InternalAceDsl.g:1427:1: ( ( rule__Estilo__LogoAssignment_2_0_1 ) )
            // InternalAceDsl.g:1428:2: ( rule__Estilo__LogoAssignment_2_0_1 )
            {
             before(grammarAccess.getEstiloAccess().getLogoAssignment_2_0_1()); 
            // InternalAceDsl.g:1429:2: ( rule__Estilo__LogoAssignment_2_0_1 )
            // InternalAceDsl.g:1429:3: rule__Estilo__LogoAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__LogoAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEstiloAccess().getLogoAssignment_2_0_1()); 

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
    // $ANTLR end "rule__Estilo__Group_2_0__1__Impl"


    // $ANTLR start "rule__Estilo__Group_2_1__0"
    // InternalAceDsl.g:1438:1: rule__Estilo__Group_2_1__0 : rule__Estilo__Group_2_1__0__Impl rule__Estilo__Group_2_1__1 ;
    public final void rule__Estilo__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1442:1: ( rule__Estilo__Group_2_1__0__Impl rule__Estilo__Group_2_1__1 )
            // InternalAceDsl.g:1443:2: rule__Estilo__Group_2_1__0__Impl rule__Estilo__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Estilo__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estilo__Group_2_1__1();

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
    // $ANTLR end "rule__Estilo__Group_2_1__0"


    // $ANTLR start "rule__Estilo__Group_2_1__0__Impl"
    // InternalAceDsl.g:1450:1: rule__Estilo__Group_2_1__0__Impl : ( 'fonte' ) ;
    public final void rule__Estilo__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1454:1: ( ( 'fonte' ) )
            // InternalAceDsl.g:1455:1: ( 'fonte' )
            {
            // InternalAceDsl.g:1455:1: ( 'fonte' )
            // InternalAceDsl.g:1456:2: 'fonte'
            {
             before(grammarAccess.getEstiloAccess().getFonteKeyword_2_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEstiloAccess().getFonteKeyword_2_1_0()); 

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
    // $ANTLR end "rule__Estilo__Group_2_1__0__Impl"


    // $ANTLR start "rule__Estilo__Group_2_1__1"
    // InternalAceDsl.g:1465:1: rule__Estilo__Group_2_1__1 : rule__Estilo__Group_2_1__1__Impl ;
    public final void rule__Estilo__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1469:1: ( rule__Estilo__Group_2_1__1__Impl )
            // InternalAceDsl.g:1470:2: rule__Estilo__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__Group_2_1__1__Impl();

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
    // $ANTLR end "rule__Estilo__Group_2_1__1"


    // $ANTLR start "rule__Estilo__Group_2_1__1__Impl"
    // InternalAceDsl.g:1476:1: rule__Estilo__Group_2_1__1__Impl : ( ( rule__Estilo__FonteAssignment_2_1_1 ) ) ;
    public final void rule__Estilo__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1480:1: ( ( ( rule__Estilo__FonteAssignment_2_1_1 ) ) )
            // InternalAceDsl.g:1481:1: ( ( rule__Estilo__FonteAssignment_2_1_1 ) )
            {
            // InternalAceDsl.g:1481:1: ( ( rule__Estilo__FonteAssignment_2_1_1 ) )
            // InternalAceDsl.g:1482:2: ( rule__Estilo__FonteAssignment_2_1_1 )
            {
             before(grammarAccess.getEstiloAccess().getFonteAssignment_2_1_1()); 
            // InternalAceDsl.g:1483:2: ( rule__Estilo__FonteAssignment_2_1_1 )
            // InternalAceDsl.g:1483:3: rule__Estilo__FonteAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__FonteAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEstiloAccess().getFonteAssignment_2_1_1()); 

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
    // $ANTLR end "rule__Estilo__Group_2_1__1__Impl"


    // $ANTLR start "rule__Estilo__Group_2_2__0"
    // InternalAceDsl.g:1492:1: rule__Estilo__Group_2_2__0 : rule__Estilo__Group_2_2__0__Impl rule__Estilo__Group_2_2__1 ;
    public final void rule__Estilo__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1496:1: ( rule__Estilo__Group_2_2__0__Impl rule__Estilo__Group_2_2__1 )
            // InternalAceDsl.g:1497:2: rule__Estilo__Group_2_2__0__Impl rule__Estilo__Group_2_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Estilo__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estilo__Group_2_2__1();

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
    // $ANTLR end "rule__Estilo__Group_2_2__0"


    // $ANTLR start "rule__Estilo__Group_2_2__0__Impl"
    // InternalAceDsl.g:1504:1: rule__Estilo__Group_2_2__0__Impl : ( 'corPrimaria' ) ;
    public final void rule__Estilo__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1508:1: ( ( 'corPrimaria' ) )
            // InternalAceDsl.g:1509:1: ( 'corPrimaria' )
            {
            // InternalAceDsl.g:1509:1: ( 'corPrimaria' )
            // InternalAceDsl.g:1510:2: 'corPrimaria'
            {
             before(grammarAccess.getEstiloAccess().getCorPrimariaKeyword_2_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEstiloAccess().getCorPrimariaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Estilo__Group_2_2__0__Impl"


    // $ANTLR start "rule__Estilo__Group_2_2__1"
    // InternalAceDsl.g:1519:1: rule__Estilo__Group_2_2__1 : rule__Estilo__Group_2_2__1__Impl ;
    public final void rule__Estilo__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1523:1: ( rule__Estilo__Group_2_2__1__Impl )
            // InternalAceDsl.g:1524:2: rule__Estilo__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Estilo__Group_2_2__1"


    // $ANTLR start "rule__Estilo__Group_2_2__1__Impl"
    // InternalAceDsl.g:1530:1: rule__Estilo__Group_2_2__1__Impl : ( ( rule__Estilo__CorPrimariaAssignment_2_2_1 ) ) ;
    public final void rule__Estilo__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1534:1: ( ( ( rule__Estilo__CorPrimariaAssignment_2_2_1 ) ) )
            // InternalAceDsl.g:1535:1: ( ( rule__Estilo__CorPrimariaAssignment_2_2_1 ) )
            {
            // InternalAceDsl.g:1535:1: ( ( rule__Estilo__CorPrimariaAssignment_2_2_1 ) )
            // InternalAceDsl.g:1536:2: ( rule__Estilo__CorPrimariaAssignment_2_2_1 )
            {
             before(grammarAccess.getEstiloAccess().getCorPrimariaAssignment_2_2_1()); 
            // InternalAceDsl.g:1537:2: ( rule__Estilo__CorPrimariaAssignment_2_2_1 )
            // InternalAceDsl.g:1537:3: rule__Estilo__CorPrimariaAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__CorPrimariaAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEstiloAccess().getCorPrimariaAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Estilo__Group_2_2__1__Impl"


    // $ANTLR start "rule__Estilo__Group_2_3__0"
    // InternalAceDsl.g:1546:1: rule__Estilo__Group_2_3__0 : rule__Estilo__Group_2_3__0__Impl rule__Estilo__Group_2_3__1 ;
    public final void rule__Estilo__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1550:1: ( rule__Estilo__Group_2_3__0__Impl rule__Estilo__Group_2_3__1 )
            // InternalAceDsl.g:1551:2: rule__Estilo__Group_2_3__0__Impl rule__Estilo__Group_2_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Estilo__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estilo__Group_2_3__1();

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
    // $ANTLR end "rule__Estilo__Group_2_3__0"


    // $ANTLR start "rule__Estilo__Group_2_3__0__Impl"
    // InternalAceDsl.g:1558:1: rule__Estilo__Group_2_3__0__Impl : ( 'corSecundaria' ) ;
    public final void rule__Estilo__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1562:1: ( ( 'corSecundaria' ) )
            // InternalAceDsl.g:1563:1: ( 'corSecundaria' )
            {
            // InternalAceDsl.g:1563:1: ( 'corSecundaria' )
            // InternalAceDsl.g:1564:2: 'corSecundaria'
            {
             before(grammarAccess.getEstiloAccess().getCorSecundariaKeyword_2_3_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEstiloAccess().getCorSecundariaKeyword_2_3_0()); 

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
    // $ANTLR end "rule__Estilo__Group_2_3__0__Impl"


    // $ANTLR start "rule__Estilo__Group_2_3__1"
    // InternalAceDsl.g:1573:1: rule__Estilo__Group_2_3__1 : rule__Estilo__Group_2_3__1__Impl ;
    public final void rule__Estilo__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1577:1: ( rule__Estilo__Group_2_3__1__Impl )
            // InternalAceDsl.g:1578:2: rule__Estilo__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__Group_2_3__1__Impl();

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
    // $ANTLR end "rule__Estilo__Group_2_3__1"


    // $ANTLR start "rule__Estilo__Group_2_3__1__Impl"
    // InternalAceDsl.g:1584:1: rule__Estilo__Group_2_3__1__Impl : ( ( rule__Estilo__CorSecundariaAssignment_2_3_1 ) ) ;
    public final void rule__Estilo__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1588:1: ( ( ( rule__Estilo__CorSecundariaAssignment_2_3_1 ) ) )
            // InternalAceDsl.g:1589:1: ( ( rule__Estilo__CorSecundariaAssignment_2_3_1 ) )
            {
            // InternalAceDsl.g:1589:1: ( ( rule__Estilo__CorSecundariaAssignment_2_3_1 ) )
            // InternalAceDsl.g:1590:2: ( rule__Estilo__CorSecundariaAssignment_2_3_1 )
            {
             before(grammarAccess.getEstiloAccess().getCorSecundariaAssignment_2_3_1()); 
            // InternalAceDsl.g:1591:2: ( rule__Estilo__CorSecundariaAssignment_2_3_1 )
            // InternalAceDsl.g:1591:3: rule__Estilo__CorSecundariaAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__CorSecundariaAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEstiloAccess().getCorSecundariaAssignment_2_3_1()); 

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
    // $ANTLR end "rule__Estilo__Group_2_3__1__Impl"


    // $ANTLR start "rule__Estilo__Group_2_4__0"
    // InternalAceDsl.g:1600:1: rule__Estilo__Group_2_4__0 : rule__Estilo__Group_2_4__0__Impl rule__Estilo__Group_2_4__1 ;
    public final void rule__Estilo__Group_2_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1604:1: ( rule__Estilo__Group_2_4__0__Impl rule__Estilo__Group_2_4__1 )
            // InternalAceDsl.g:1605:2: rule__Estilo__Group_2_4__0__Impl rule__Estilo__Group_2_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Estilo__Group_2_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Estilo__Group_2_4__1();

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
    // $ANTLR end "rule__Estilo__Group_2_4__0"


    // $ANTLR start "rule__Estilo__Group_2_4__0__Impl"
    // InternalAceDsl.g:1612:1: rule__Estilo__Group_2_4__0__Impl : ( 'corTerciaria' ) ;
    public final void rule__Estilo__Group_2_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1616:1: ( ( 'corTerciaria' ) )
            // InternalAceDsl.g:1617:1: ( 'corTerciaria' )
            {
            // InternalAceDsl.g:1617:1: ( 'corTerciaria' )
            // InternalAceDsl.g:1618:2: 'corTerciaria'
            {
             before(grammarAccess.getEstiloAccess().getCorTerciariaKeyword_2_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEstiloAccess().getCorTerciariaKeyword_2_4_0()); 

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
    // $ANTLR end "rule__Estilo__Group_2_4__0__Impl"


    // $ANTLR start "rule__Estilo__Group_2_4__1"
    // InternalAceDsl.g:1627:1: rule__Estilo__Group_2_4__1 : rule__Estilo__Group_2_4__1__Impl ;
    public final void rule__Estilo__Group_2_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1631:1: ( rule__Estilo__Group_2_4__1__Impl )
            // InternalAceDsl.g:1632:2: rule__Estilo__Group_2_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__Group_2_4__1__Impl();

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
    // $ANTLR end "rule__Estilo__Group_2_4__1"


    // $ANTLR start "rule__Estilo__Group_2_4__1__Impl"
    // InternalAceDsl.g:1638:1: rule__Estilo__Group_2_4__1__Impl : ( ( rule__Estilo__CorTerciariaAssignment_2_4_1 ) ) ;
    public final void rule__Estilo__Group_2_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1642:1: ( ( ( rule__Estilo__CorTerciariaAssignment_2_4_1 ) ) )
            // InternalAceDsl.g:1643:1: ( ( rule__Estilo__CorTerciariaAssignment_2_4_1 ) )
            {
            // InternalAceDsl.g:1643:1: ( ( rule__Estilo__CorTerciariaAssignment_2_4_1 ) )
            // InternalAceDsl.g:1644:2: ( rule__Estilo__CorTerciariaAssignment_2_4_1 )
            {
             before(grammarAccess.getEstiloAccess().getCorTerciariaAssignment_2_4_1()); 
            // InternalAceDsl.g:1645:2: ( rule__Estilo__CorTerciariaAssignment_2_4_1 )
            // InternalAceDsl.g:1645:3: rule__Estilo__CorTerciariaAssignment_2_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__CorTerciariaAssignment_2_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEstiloAccess().getCorTerciariaAssignment_2_4_1()); 

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
    // $ANTLR end "rule__Estilo__Group_2_4__1__Impl"


    // $ANTLR start "rule__ListaCursos__Group__0"
    // InternalAceDsl.g:1654:1: rule__ListaCursos__Group__0 : rule__ListaCursos__Group__0__Impl rule__ListaCursos__Group__1 ;
    public final void rule__ListaCursos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1658:1: ( rule__ListaCursos__Group__0__Impl rule__ListaCursos__Group__1 )
            // InternalAceDsl.g:1659:2: rule__ListaCursos__Group__0__Impl rule__ListaCursos__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ListaCursos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListaCursos__Group__1();

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
    // $ANTLR end "rule__ListaCursos__Group__0"


    // $ANTLR start "rule__ListaCursos__Group__0__Impl"
    // InternalAceDsl.g:1666:1: rule__ListaCursos__Group__0__Impl : ( ( rule__ListaCursos__CursoAssignment_0 ) ) ;
    public final void rule__ListaCursos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1670:1: ( ( ( rule__ListaCursos__CursoAssignment_0 ) ) )
            // InternalAceDsl.g:1671:1: ( ( rule__ListaCursos__CursoAssignment_0 ) )
            {
            // InternalAceDsl.g:1671:1: ( ( rule__ListaCursos__CursoAssignment_0 ) )
            // InternalAceDsl.g:1672:2: ( rule__ListaCursos__CursoAssignment_0 )
            {
             before(grammarAccess.getListaCursosAccess().getCursoAssignment_0()); 
            // InternalAceDsl.g:1673:2: ( rule__ListaCursos__CursoAssignment_0 )
            // InternalAceDsl.g:1673:3: rule__ListaCursos__CursoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListaCursos__CursoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListaCursosAccess().getCursoAssignment_0()); 

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
    // $ANTLR end "rule__ListaCursos__Group__0__Impl"


    // $ANTLR start "rule__ListaCursos__Group__1"
    // InternalAceDsl.g:1681:1: rule__ListaCursos__Group__1 : rule__ListaCursos__Group__1__Impl ;
    public final void rule__ListaCursos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1685:1: ( rule__ListaCursos__Group__1__Impl )
            // InternalAceDsl.g:1686:2: rule__ListaCursos__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListaCursos__Group__1__Impl();

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
    // $ANTLR end "rule__ListaCursos__Group__1"


    // $ANTLR start "rule__ListaCursos__Group__1__Impl"
    // InternalAceDsl.g:1692:1: rule__ListaCursos__Group__1__Impl : ( ( rule__ListaCursos__CursoAssignment_1 )* ) ;
    public final void rule__ListaCursos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1696:1: ( ( ( rule__ListaCursos__CursoAssignment_1 )* ) )
            // InternalAceDsl.g:1697:1: ( ( rule__ListaCursos__CursoAssignment_1 )* )
            {
            // InternalAceDsl.g:1697:1: ( ( rule__ListaCursos__CursoAssignment_1 )* )
            // InternalAceDsl.g:1698:2: ( rule__ListaCursos__CursoAssignment_1 )*
            {
             before(grammarAccess.getListaCursosAccess().getCursoAssignment_1()); 
            // InternalAceDsl.g:1699:2: ( rule__ListaCursos__CursoAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAceDsl.g:1699:3: rule__ListaCursos__CursoAssignment_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ListaCursos__CursoAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getListaCursosAccess().getCursoAssignment_1()); 

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
    // $ANTLR end "rule__ListaCursos__Group__1__Impl"


    // $ANTLR start "rule__ListaDisciplinas__Group__0"
    // InternalAceDsl.g:1708:1: rule__ListaDisciplinas__Group__0 : rule__ListaDisciplinas__Group__0__Impl rule__ListaDisciplinas__Group__1 ;
    public final void rule__ListaDisciplinas__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1712:1: ( rule__ListaDisciplinas__Group__0__Impl rule__ListaDisciplinas__Group__1 )
            // InternalAceDsl.g:1713:2: rule__ListaDisciplinas__Group__0__Impl rule__ListaDisciplinas__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ListaDisciplinas__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListaDisciplinas__Group__1();

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
    // $ANTLR end "rule__ListaDisciplinas__Group__0"


    // $ANTLR start "rule__ListaDisciplinas__Group__0__Impl"
    // InternalAceDsl.g:1720:1: rule__ListaDisciplinas__Group__0__Impl : ( () ) ;
    public final void rule__ListaDisciplinas__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1724:1: ( ( () ) )
            // InternalAceDsl.g:1725:1: ( () )
            {
            // InternalAceDsl.g:1725:1: ( () )
            // InternalAceDsl.g:1726:2: ()
            {
             before(grammarAccess.getListaDisciplinasAccess().getListaDisciplinasAction_0()); 
            // InternalAceDsl.g:1727:2: ()
            // InternalAceDsl.g:1727:3: 
            {
            }

             after(grammarAccess.getListaDisciplinasAccess().getListaDisciplinasAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListaDisciplinas__Group__0__Impl"


    // $ANTLR start "rule__ListaDisciplinas__Group__1"
    // InternalAceDsl.g:1735:1: rule__ListaDisciplinas__Group__1 : rule__ListaDisciplinas__Group__1__Impl ;
    public final void rule__ListaDisciplinas__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1739:1: ( rule__ListaDisciplinas__Group__1__Impl )
            // InternalAceDsl.g:1740:2: rule__ListaDisciplinas__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListaDisciplinas__Group__1__Impl();

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
    // $ANTLR end "rule__ListaDisciplinas__Group__1"


    // $ANTLR start "rule__ListaDisciplinas__Group__1__Impl"
    // InternalAceDsl.g:1746:1: rule__ListaDisciplinas__Group__1__Impl : ( 'disciplinas' ) ;
    public final void rule__ListaDisciplinas__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1750:1: ( ( 'disciplinas' ) )
            // InternalAceDsl.g:1751:1: ( 'disciplinas' )
            {
            // InternalAceDsl.g:1751:1: ( 'disciplinas' )
            // InternalAceDsl.g:1752:2: 'disciplinas'
            {
             before(grammarAccess.getListaDisciplinasAccess().getDisciplinasKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getListaDisciplinasAccess().getDisciplinasKeyword_1()); 

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
    // $ANTLR end "rule__ListaDisciplinas__Group__1__Impl"


    // $ANTLR start "rule__ListaDepartamentos__Group__0"
    // InternalAceDsl.g:1762:1: rule__ListaDepartamentos__Group__0 : rule__ListaDepartamentos__Group__0__Impl rule__ListaDepartamentos__Group__1 ;
    public final void rule__ListaDepartamentos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1766:1: ( rule__ListaDepartamentos__Group__0__Impl rule__ListaDepartamentos__Group__1 )
            // InternalAceDsl.g:1767:2: rule__ListaDepartamentos__Group__0__Impl rule__ListaDepartamentos__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ListaDepartamentos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListaDepartamentos__Group__1();

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
    // $ANTLR end "rule__ListaDepartamentos__Group__0"


    // $ANTLR start "rule__ListaDepartamentos__Group__0__Impl"
    // InternalAceDsl.g:1774:1: rule__ListaDepartamentos__Group__0__Impl : ( ( rule__ListaDepartamentos__DepartamentoAssignment_0 ) ) ;
    public final void rule__ListaDepartamentos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1778:1: ( ( ( rule__ListaDepartamentos__DepartamentoAssignment_0 ) ) )
            // InternalAceDsl.g:1779:1: ( ( rule__ListaDepartamentos__DepartamentoAssignment_0 ) )
            {
            // InternalAceDsl.g:1779:1: ( ( rule__ListaDepartamentos__DepartamentoAssignment_0 ) )
            // InternalAceDsl.g:1780:2: ( rule__ListaDepartamentos__DepartamentoAssignment_0 )
            {
             before(grammarAccess.getListaDepartamentosAccess().getDepartamentoAssignment_0()); 
            // InternalAceDsl.g:1781:2: ( rule__ListaDepartamentos__DepartamentoAssignment_0 )
            // InternalAceDsl.g:1781:3: rule__ListaDepartamentos__DepartamentoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListaDepartamentos__DepartamentoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListaDepartamentosAccess().getDepartamentoAssignment_0()); 

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
    // $ANTLR end "rule__ListaDepartamentos__Group__0__Impl"


    // $ANTLR start "rule__ListaDepartamentos__Group__1"
    // InternalAceDsl.g:1789:1: rule__ListaDepartamentos__Group__1 : rule__ListaDepartamentos__Group__1__Impl ;
    public final void rule__ListaDepartamentos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1793:1: ( rule__ListaDepartamentos__Group__1__Impl )
            // InternalAceDsl.g:1794:2: rule__ListaDepartamentos__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListaDepartamentos__Group__1__Impl();

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
    // $ANTLR end "rule__ListaDepartamentos__Group__1"


    // $ANTLR start "rule__ListaDepartamentos__Group__1__Impl"
    // InternalAceDsl.g:1800:1: rule__ListaDepartamentos__Group__1__Impl : ( ( rule__ListaDepartamentos__DepartamentoAssignment_1 )* ) ;
    public final void rule__ListaDepartamentos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1804:1: ( ( ( rule__ListaDepartamentos__DepartamentoAssignment_1 )* ) )
            // InternalAceDsl.g:1805:1: ( ( rule__ListaDepartamentos__DepartamentoAssignment_1 )* )
            {
            // InternalAceDsl.g:1805:1: ( ( rule__ListaDepartamentos__DepartamentoAssignment_1 )* )
            // InternalAceDsl.g:1806:2: ( rule__ListaDepartamentos__DepartamentoAssignment_1 )*
            {
             before(grammarAccess.getListaDepartamentosAccess().getDepartamentoAssignment_1()); 
            // InternalAceDsl.g:1807:2: ( rule__ListaDepartamentos__DepartamentoAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalAceDsl.g:1807:3: rule__ListaDepartamentos__DepartamentoAssignment_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ListaDepartamentos__DepartamentoAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getListaDepartamentosAccess().getDepartamentoAssignment_1()); 

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
    // $ANTLR end "rule__ListaDepartamentos__Group__1__Impl"


    // $ANTLR start "rule__ListaPeriodos__Group__0"
    // InternalAceDsl.g:1816:1: rule__ListaPeriodos__Group__0 : rule__ListaPeriodos__Group__0__Impl rule__ListaPeriodos__Group__1 ;
    public final void rule__ListaPeriodos__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1820:1: ( rule__ListaPeriodos__Group__0__Impl rule__ListaPeriodos__Group__1 )
            // InternalAceDsl.g:1821:2: rule__ListaPeriodos__Group__0__Impl rule__ListaPeriodos__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ListaPeriodos__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListaPeriodos__Group__1();

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
    // $ANTLR end "rule__ListaPeriodos__Group__0"


    // $ANTLR start "rule__ListaPeriodos__Group__0__Impl"
    // InternalAceDsl.g:1828:1: rule__ListaPeriodos__Group__0__Impl : ( ( rule__ListaPeriodos__PeriodoAssignment_0 ) ) ;
    public final void rule__ListaPeriodos__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1832:1: ( ( ( rule__ListaPeriodos__PeriodoAssignment_0 ) ) )
            // InternalAceDsl.g:1833:1: ( ( rule__ListaPeriodos__PeriodoAssignment_0 ) )
            {
            // InternalAceDsl.g:1833:1: ( ( rule__ListaPeriodos__PeriodoAssignment_0 ) )
            // InternalAceDsl.g:1834:2: ( rule__ListaPeriodos__PeriodoAssignment_0 )
            {
             before(grammarAccess.getListaPeriodosAccess().getPeriodoAssignment_0()); 
            // InternalAceDsl.g:1835:2: ( rule__ListaPeriodos__PeriodoAssignment_0 )
            // InternalAceDsl.g:1835:3: rule__ListaPeriodos__PeriodoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListaPeriodos__PeriodoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListaPeriodosAccess().getPeriodoAssignment_0()); 

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
    // $ANTLR end "rule__ListaPeriodos__Group__0__Impl"


    // $ANTLR start "rule__ListaPeriodos__Group__1"
    // InternalAceDsl.g:1843:1: rule__ListaPeriodos__Group__1 : rule__ListaPeriodos__Group__1__Impl ;
    public final void rule__ListaPeriodos__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1847:1: ( rule__ListaPeriodos__Group__1__Impl )
            // InternalAceDsl.g:1848:2: rule__ListaPeriodos__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListaPeriodos__Group__1__Impl();

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
    // $ANTLR end "rule__ListaPeriodos__Group__1"


    // $ANTLR start "rule__ListaPeriodos__Group__1__Impl"
    // InternalAceDsl.g:1854:1: rule__ListaPeriodos__Group__1__Impl : ( ( rule__ListaPeriodos__PeriodoAssignment_1 )* ) ;
    public final void rule__ListaPeriodos__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1858:1: ( ( ( rule__ListaPeriodos__PeriodoAssignment_1 )* ) )
            // InternalAceDsl.g:1859:1: ( ( rule__ListaPeriodos__PeriodoAssignment_1 )* )
            {
            // InternalAceDsl.g:1859:1: ( ( rule__ListaPeriodos__PeriodoAssignment_1 )* )
            // InternalAceDsl.g:1860:2: ( rule__ListaPeriodos__PeriodoAssignment_1 )*
            {
             before(grammarAccess.getListaPeriodosAccess().getPeriodoAssignment_1()); 
            // InternalAceDsl.g:1861:2: ( rule__ListaPeriodos__PeriodoAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalAceDsl.g:1861:3: rule__ListaPeriodos__PeriodoAssignment_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ListaPeriodos__PeriodoAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getListaPeriodosAccess().getPeriodoAssignment_1()); 

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
    // $ANTLR end "rule__ListaPeriodos__Group__1__Impl"


    // $ANTLR start "rule__Curso__Group__0"
    // InternalAceDsl.g:1870:1: rule__Curso__Group__0 : rule__Curso__Group__0__Impl rule__Curso__Group__1 ;
    public final void rule__Curso__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1874:1: ( rule__Curso__Group__0__Impl rule__Curso__Group__1 )
            // InternalAceDsl.g:1875:2: rule__Curso__Group__0__Impl rule__Curso__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Curso__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curso__Group__1();

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
    // $ANTLR end "rule__Curso__Group__0"


    // $ANTLR start "rule__Curso__Group__0__Impl"
    // InternalAceDsl.g:1882:1: rule__Curso__Group__0__Impl : ( 'curso' ) ;
    public final void rule__Curso__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1886:1: ( ( 'curso' ) )
            // InternalAceDsl.g:1887:1: ( 'curso' )
            {
            // InternalAceDsl.g:1887:1: ( 'curso' )
            // InternalAceDsl.g:1888:2: 'curso'
            {
             before(grammarAccess.getCursoAccess().getCursoKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCursoAccess().getCursoKeyword_0()); 

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
    // $ANTLR end "rule__Curso__Group__0__Impl"


    // $ANTLR start "rule__Curso__Group__1"
    // InternalAceDsl.g:1897:1: rule__Curso__Group__1 : rule__Curso__Group__1__Impl rule__Curso__Group__2 ;
    public final void rule__Curso__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1901:1: ( rule__Curso__Group__1__Impl rule__Curso__Group__2 )
            // InternalAceDsl.g:1902:2: rule__Curso__Group__1__Impl rule__Curso__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Curso__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curso__Group__2();

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
    // $ANTLR end "rule__Curso__Group__1"


    // $ANTLR start "rule__Curso__Group__1__Impl"
    // InternalAceDsl.g:1909:1: rule__Curso__Group__1__Impl : ( ( rule__Curso__NomeAssignment_1 ) ) ;
    public final void rule__Curso__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1913:1: ( ( ( rule__Curso__NomeAssignment_1 ) ) )
            // InternalAceDsl.g:1914:1: ( ( rule__Curso__NomeAssignment_1 ) )
            {
            // InternalAceDsl.g:1914:1: ( ( rule__Curso__NomeAssignment_1 ) )
            // InternalAceDsl.g:1915:2: ( rule__Curso__NomeAssignment_1 )
            {
             before(grammarAccess.getCursoAccess().getNomeAssignment_1()); 
            // InternalAceDsl.g:1916:2: ( rule__Curso__NomeAssignment_1 )
            // InternalAceDsl.g:1916:3: rule__Curso__NomeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Curso__NomeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCursoAccess().getNomeAssignment_1()); 

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
    // $ANTLR end "rule__Curso__Group__1__Impl"


    // $ANTLR start "rule__Curso__Group__2"
    // InternalAceDsl.g:1924:1: rule__Curso__Group__2 : rule__Curso__Group__2__Impl rule__Curso__Group__3 ;
    public final void rule__Curso__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1928:1: ( rule__Curso__Group__2__Impl rule__Curso__Group__3 )
            // InternalAceDsl.g:1929:2: rule__Curso__Group__2__Impl rule__Curso__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Curso__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curso__Group__3();

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
    // $ANTLR end "rule__Curso__Group__2"


    // $ANTLR start "rule__Curso__Group__2__Impl"
    // InternalAceDsl.g:1936:1: rule__Curso__Group__2__Impl : ( '{' ) ;
    public final void rule__Curso__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1940:1: ( ( '{' ) )
            // InternalAceDsl.g:1941:1: ( '{' )
            {
            // InternalAceDsl.g:1941:1: ( '{' )
            // InternalAceDsl.g:1942:2: '{'
            {
             before(grammarAccess.getCursoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCursoAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Curso__Group__2__Impl"


    // $ANTLR start "rule__Curso__Group__3"
    // InternalAceDsl.g:1951:1: rule__Curso__Group__3 : rule__Curso__Group__3__Impl rule__Curso__Group__4 ;
    public final void rule__Curso__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1955:1: ( rule__Curso__Group__3__Impl rule__Curso__Group__4 )
            // InternalAceDsl.g:1956:2: rule__Curso__Group__3__Impl rule__Curso__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Curso__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Curso__Group__4();

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
    // $ANTLR end "rule__Curso__Group__3"


    // $ANTLR start "rule__Curso__Group__3__Impl"
    // InternalAceDsl.g:1963:1: rule__Curso__Group__3__Impl : ( ( rule__Curso__OrganizacaoCursoAssignment_3 ) ) ;
    public final void rule__Curso__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1967:1: ( ( ( rule__Curso__OrganizacaoCursoAssignment_3 ) ) )
            // InternalAceDsl.g:1968:1: ( ( rule__Curso__OrganizacaoCursoAssignment_3 ) )
            {
            // InternalAceDsl.g:1968:1: ( ( rule__Curso__OrganizacaoCursoAssignment_3 ) )
            // InternalAceDsl.g:1969:2: ( rule__Curso__OrganizacaoCursoAssignment_3 )
            {
             before(grammarAccess.getCursoAccess().getOrganizacaoCursoAssignment_3()); 
            // InternalAceDsl.g:1970:2: ( rule__Curso__OrganizacaoCursoAssignment_3 )
            // InternalAceDsl.g:1970:3: rule__Curso__OrganizacaoCursoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Curso__OrganizacaoCursoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCursoAccess().getOrganizacaoCursoAssignment_3()); 

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
    // $ANTLR end "rule__Curso__Group__3__Impl"


    // $ANTLR start "rule__Curso__Group__4"
    // InternalAceDsl.g:1978:1: rule__Curso__Group__4 : rule__Curso__Group__4__Impl ;
    public final void rule__Curso__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1982:1: ( rule__Curso__Group__4__Impl )
            // InternalAceDsl.g:1983:2: rule__Curso__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Curso__Group__4__Impl();

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
    // $ANTLR end "rule__Curso__Group__4"


    // $ANTLR start "rule__Curso__Group__4__Impl"
    // InternalAceDsl.g:1989:1: rule__Curso__Group__4__Impl : ( '}' ) ;
    public final void rule__Curso__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:1993:1: ( ( '}' ) )
            // InternalAceDsl.g:1994:1: ( '}' )
            {
            // InternalAceDsl.g:1994:1: ( '}' )
            // InternalAceDsl.g:1995:2: '}'
            {
             before(grammarAccess.getCursoAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCursoAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Curso__Group__4__Impl"


    // $ANTLR start "rule__Departamento__Group__0"
    // InternalAceDsl.g:2005:1: rule__Departamento__Group__0 : rule__Departamento__Group__0__Impl rule__Departamento__Group__1 ;
    public final void rule__Departamento__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2009:1: ( rule__Departamento__Group__0__Impl rule__Departamento__Group__1 )
            // InternalAceDsl.g:2010:2: rule__Departamento__Group__0__Impl rule__Departamento__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Departamento__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Departamento__Group__1();

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
    // $ANTLR end "rule__Departamento__Group__0"


    // $ANTLR start "rule__Departamento__Group__0__Impl"
    // InternalAceDsl.g:2017:1: rule__Departamento__Group__0__Impl : ( 'departamento' ) ;
    public final void rule__Departamento__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2021:1: ( ( 'departamento' ) )
            // InternalAceDsl.g:2022:1: ( 'departamento' )
            {
            // InternalAceDsl.g:2022:1: ( 'departamento' )
            // InternalAceDsl.g:2023:2: 'departamento'
            {
             before(grammarAccess.getDepartamentoAccess().getDepartamentoKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDepartamentoAccess().getDepartamentoKeyword_0()); 

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
    // $ANTLR end "rule__Departamento__Group__0__Impl"


    // $ANTLR start "rule__Departamento__Group__1"
    // InternalAceDsl.g:2032:1: rule__Departamento__Group__1 : rule__Departamento__Group__1__Impl rule__Departamento__Group__2 ;
    public final void rule__Departamento__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2036:1: ( rule__Departamento__Group__1__Impl rule__Departamento__Group__2 )
            // InternalAceDsl.g:2037:2: rule__Departamento__Group__1__Impl rule__Departamento__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Departamento__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Departamento__Group__2();

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
    // $ANTLR end "rule__Departamento__Group__1"


    // $ANTLR start "rule__Departamento__Group__1__Impl"
    // InternalAceDsl.g:2044:1: rule__Departamento__Group__1__Impl : ( ( rule__Departamento__NomeAssignment_1 ) ) ;
    public final void rule__Departamento__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2048:1: ( ( ( rule__Departamento__NomeAssignment_1 ) ) )
            // InternalAceDsl.g:2049:1: ( ( rule__Departamento__NomeAssignment_1 ) )
            {
            // InternalAceDsl.g:2049:1: ( ( rule__Departamento__NomeAssignment_1 ) )
            // InternalAceDsl.g:2050:2: ( rule__Departamento__NomeAssignment_1 )
            {
             before(grammarAccess.getDepartamentoAccess().getNomeAssignment_1()); 
            // InternalAceDsl.g:2051:2: ( rule__Departamento__NomeAssignment_1 )
            // InternalAceDsl.g:2051:3: rule__Departamento__NomeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Departamento__NomeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDepartamentoAccess().getNomeAssignment_1()); 

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
    // $ANTLR end "rule__Departamento__Group__1__Impl"


    // $ANTLR start "rule__Departamento__Group__2"
    // InternalAceDsl.g:2059:1: rule__Departamento__Group__2 : rule__Departamento__Group__2__Impl rule__Departamento__Group__3 ;
    public final void rule__Departamento__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2063:1: ( rule__Departamento__Group__2__Impl rule__Departamento__Group__3 )
            // InternalAceDsl.g:2064:2: rule__Departamento__Group__2__Impl rule__Departamento__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Departamento__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Departamento__Group__3();

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
    // $ANTLR end "rule__Departamento__Group__2"


    // $ANTLR start "rule__Departamento__Group__2__Impl"
    // InternalAceDsl.g:2071:1: rule__Departamento__Group__2__Impl : ( '{' ) ;
    public final void rule__Departamento__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2075:1: ( ( '{' ) )
            // InternalAceDsl.g:2076:1: ( '{' )
            {
            // InternalAceDsl.g:2076:1: ( '{' )
            // InternalAceDsl.g:2077:2: '{'
            {
             before(grammarAccess.getDepartamentoAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDepartamentoAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Departamento__Group__2__Impl"


    // $ANTLR start "rule__Departamento__Group__3"
    // InternalAceDsl.g:2086:1: rule__Departamento__Group__3 : rule__Departamento__Group__3__Impl rule__Departamento__Group__4 ;
    public final void rule__Departamento__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2090:1: ( rule__Departamento__Group__3__Impl rule__Departamento__Group__4 )
            // InternalAceDsl.g:2091:2: rule__Departamento__Group__3__Impl rule__Departamento__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Departamento__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Departamento__Group__4();

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
    // $ANTLR end "rule__Departamento__Group__3"


    // $ANTLR start "rule__Departamento__Group__3__Impl"
    // InternalAceDsl.g:2098:1: rule__Departamento__Group__3__Impl : ( ( rule__Departamento__OrganizacaoDepartamentoAssignment_3 ) ) ;
    public final void rule__Departamento__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2102:1: ( ( ( rule__Departamento__OrganizacaoDepartamentoAssignment_3 ) ) )
            // InternalAceDsl.g:2103:1: ( ( rule__Departamento__OrganizacaoDepartamentoAssignment_3 ) )
            {
            // InternalAceDsl.g:2103:1: ( ( rule__Departamento__OrganizacaoDepartamentoAssignment_3 ) )
            // InternalAceDsl.g:2104:2: ( rule__Departamento__OrganizacaoDepartamentoAssignment_3 )
            {
             before(grammarAccess.getDepartamentoAccess().getOrganizacaoDepartamentoAssignment_3()); 
            // InternalAceDsl.g:2105:2: ( rule__Departamento__OrganizacaoDepartamentoAssignment_3 )
            // InternalAceDsl.g:2105:3: rule__Departamento__OrganizacaoDepartamentoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Departamento__OrganizacaoDepartamentoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDepartamentoAccess().getOrganizacaoDepartamentoAssignment_3()); 

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
    // $ANTLR end "rule__Departamento__Group__3__Impl"


    // $ANTLR start "rule__Departamento__Group__4"
    // InternalAceDsl.g:2113:1: rule__Departamento__Group__4 : rule__Departamento__Group__4__Impl ;
    public final void rule__Departamento__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2117:1: ( rule__Departamento__Group__4__Impl )
            // InternalAceDsl.g:2118:2: rule__Departamento__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Departamento__Group__4__Impl();

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
    // $ANTLR end "rule__Departamento__Group__4"


    // $ANTLR start "rule__Departamento__Group__4__Impl"
    // InternalAceDsl.g:2124:1: rule__Departamento__Group__4__Impl : ( '}' ) ;
    public final void rule__Departamento__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2128:1: ( ( '}' ) )
            // InternalAceDsl.g:2129:1: ( '}' )
            {
            // InternalAceDsl.g:2129:1: ( '}' )
            // InternalAceDsl.g:2130:2: '}'
            {
             before(grammarAccess.getDepartamentoAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDepartamentoAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Departamento__Group__4__Impl"


    // $ANTLR start "rule__Periodo__Group__0"
    // InternalAceDsl.g:2140:1: rule__Periodo__Group__0 : rule__Periodo__Group__0__Impl rule__Periodo__Group__1 ;
    public final void rule__Periodo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2144:1: ( rule__Periodo__Group__0__Impl rule__Periodo__Group__1 )
            // InternalAceDsl.g:2145:2: rule__Periodo__Group__0__Impl rule__Periodo__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Periodo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Periodo__Group__1();

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
    // $ANTLR end "rule__Periodo__Group__0"


    // $ANTLR start "rule__Periodo__Group__0__Impl"
    // InternalAceDsl.g:2152:1: rule__Periodo__Group__0__Impl : ( 'periodo' ) ;
    public final void rule__Periodo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2156:1: ( ( 'periodo' ) )
            // InternalAceDsl.g:2157:1: ( 'periodo' )
            {
            // InternalAceDsl.g:2157:1: ( 'periodo' )
            // InternalAceDsl.g:2158:2: 'periodo'
            {
             before(grammarAccess.getPeriodoAccess().getPeriodoKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPeriodoAccess().getPeriodoKeyword_0()); 

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
    // $ANTLR end "rule__Periodo__Group__0__Impl"


    // $ANTLR start "rule__Periodo__Group__1"
    // InternalAceDsl.g:2167:1: rule__Periodo__Group__1 : rule__Periodo__Group__1__Impl ;
    public final void rule__Periodo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2171:1: ( rule__Periodo__Group__1__Impl )
            // InternalAceDsl.g:2172:2: rule__Periodo__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Periodo__Group__1__Impl();

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
    // $ANTLR end "rule__Periodo__Group__1"


    // $ANTLR start "rule__Periodo__Group__1__Impl"
    // InternalAceDsl.g:2178:1: rule__Periodo__Group__1__Impl : ( ( rule__Periodo__NomeAssignment_1 ) ) ;
    public final void rule__Periodo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2182:1: ( ( ( rule__Periodo__NomeAssignment_1 ) ) )
            // InternalAceDsl.g:2183:1: ( ( rule__Periodo__NomeAssignment_1 ) )
            {
            // InternalAceDsl.g:2183:1: ( ( rule__Periodo__NomeAssignment_1 ) )
            // InternalAceDsl.g:2184:2: ( rule__Periodo__NomeAssignment_1 )
            {
             before(grammarAccess.getPeriodoAccess().getNomeAssignment_1()); 
            // InternalAceDsl.g:2185:2: ( rule__Periodo__NomeAssignment_1 )
            // InternalAceDsl.g:2185:3: rule__Periodo__NomeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Periodo__NomeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPeriodoAccess().getNomeAssignment_1()); 

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
    // $ANTLR end "rule__Periodo__Group__1__Impl"


    // $ANTLR start "rule__Aplicativo__UnorderedGroup_3"
    // InternalAceDsl.g:2194:1: rule__Aplicativo__UnorderedGroup_3 : rule__Aplicativo__UnorderedGroup_3__0 {...}?;
    public final void rule__Aplicativo__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAplicativoAccess().getUnorderedGroup_3());
        	
        try {
            // InternalAceDsl.g:2199:1: ( rule__Aplicativo__UnorderedGroup_3__0 {...}?)
            // InternalAceDsl.g:2200:2: rule__Aplicativo__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Aplicativo__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getAplicativoAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__Aplicativo__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getAplicativoAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getAplicativoAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicativo__UnorderedGroup_3"


    // $ANTLR start "rule__Aplicativo__UnorderedGroup_3__Impl"
    // InternalAceDsl.g:2208:1: rule__Aplicativo__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Aplicativo__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoEventosAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoMembrosAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoDisciplinasAssignment_3_3 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoNoticiasAssignment_3_4 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__EstiloAssignment_3_5 ) ) ) ) ) ;
    public final void rule__Aplicativo__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalAceDsl.g:2213:1: ( ( ({...}? => ( ( ( rule__Aplicativo__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoEventosAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoMembrosAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoDisciplinasAssignment_3_3 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoNoticiasAssignment_3_4 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__EstiloAssignment_3_5 ) ) ) ) ) )
            // InternalAceDsl.g:2214:3: ( ({...}? => ( ( ( rule__Aplicativo__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoEventosAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoMembrosAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoDisciplinasAssignment_3_3 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoNoticiasAssignment_3_4 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__EstiloAssignment_3_5 ) ) ) ) )
            {
            // InternalAceDsl.g:2214:3: ( ({...}? => ( ( ( rule__Aplicativo__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoEventosAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoMembrosAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoDisciplinasAssignment_3_3 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__SecaoNoticiasAssignment_3_4 ) ) ) ) | ({...}? => ( ( ( rule__Aplicativo__EstiloAssignment_3_5 ) ) ) ) )
            int alt11=6;
            int LA11_0 = input.LA(1);

            if ( LA11_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 1) ) {
                alt11=2;
            }
            else if ( LA11_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 2) ) {
                alt11=3;
            }
            else if ( LA11_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 3) ) {
                alt11=4;
            }
            else if ( LA11_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 4) ) {
                alt11=5;
            }
            else if ( LA11_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 5) ) {
                alt11=6;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAceDsl.g:2215:3: ({...}? => ( ( ( rule__Aplicativo__Group_3_0__0 ) ) ) )
                    {
                    // InternalAceDsl.g:2215:3: ({...}? => ( ( ( rule__Aplicativo__Group_3_0__0 ) ) ) )
                    // InternalAceDsl.g:2216:4: {...}? => ( ( ( rule__Aplicativo__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Aplicativo__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalAceDsl.g:2216:106: ( ( ( rule__Aplicativo__Group_3_0__0 ) ) )
                    // InternalAceDsl.g:2217:5: ( ( rule__Aplicativo__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalAceDsl.g:2223:5: ( ( rule__Aplicativo__Group_3_0__0 ) )
                    // InternalAceDsl.g:2224:6: ( rule__Aplicativo__Group_3_0__0 )
                    {
                     before(grammarAccess.getAplicativoAccess().getGroup_3_0()); 
                    // InternalAceDsl.g:2225:6: ( rule__Aplicativo__Group_3_0__0 )
                    // InternalAceDsl.g:2225:7: rule__Aplicativo__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Aplicativo__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAplicativoAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAceDsl.g:2230:3: ({...}? => ( ( ( rule__Aplicativo__SecaoEventosAssignment_3_1 ) ) ) )
                    {
                    // InternalAceDsl.g:2230:3: ({...}? => ( ( ( rule__Aplicativo__SecaoEventosAssignment_3_1 ) ) ) )
                    // InternalAceDsl.g:2231:4: {...}? => ( ( ( rule__Aplicativo__SecaoEventosAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Aplicativo__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalAceDsl.g:2231:106: ( ( ( rule__Aplicativo__SecaoEventosAssignment_3_1 ) ) )
                    // InternalAceDsl.g:2232:5: ( ( rule__Aplicativo__SecaoEventosAssignment_3_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalAceDsl.g:2238:5: ( ( rule__Aplicativo__SecaoEventosAssignment_3_1 ) )
                    // InternalAceDsl.g:2239:6: ( rule__Aplicativo__SecaoEventosAssignment_3_1 )
                    {
                     before(grammarAccess.getAplicativoAccess().getSecaoEventosAssignment_3_1()); 
                    // InternalAceDsl.g:2240:6: ( rule__Aplicativo__SecaoEventosAssignment_3_1 )
                    // InternalAceDsl.g:2240:7: rule__Aplicativo__SecaoEventosAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Aplicativo__SecaoEventosAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAplicativoAccess().getSecaoEventosAssignment_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAceDsl.g:2245:3: ({...}? => ( ( ( rule__Aplicativo__SecaoMembrosAssignment_3_2 ) ) ) )
                    {
                    // InternalAceDsl.g:2245:3: ({...}? => ( ( ( rule__Aplicativo__SecaoMembrosAssignment_3_2 ) ) ) )
                    // InternalAceDsl.g:2246:4: {...}? => ( ( ( rule__Aplicativo__SecaoMembrosAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Aplicativo__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalAceDsl.g:2246:106: ( ( ( rule__Aplicativo__SecaoMembrosAssignment_3_2 ) ) )
                    // InternalAceDsl.g:2247:5: ( ( rule__Aplicativo__SecaoMembrosAssignment_3_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalAceDsl.g:2253:5: ( ( rule__Aplicativo__SecaoMembrosAssignment_3_2 ) )
                    // InternalAceDsl.g:2254:6: ( rule__Aplicativo__SecaoMembrosAssignment_3_2 )
                    {
                     before(grammarAccess.getAplicativoAccess().getSecaoMembrosAssignment_3_2()); 
                    // InternalAceDsl.g:2255:6: ( rule__Aplicativo__SecaoMembrosAssignment_3_2 )
                    // InternalAceDsl.g:2255:7: rule__Aplicativo__SecaoMembrosAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Aplicativo__SecaoMembrosAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAplicativoAccess().getSecaoMembrosAssignment_3_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAceDsl.g:2260:3: ({...}? => ( ( ( rule__Aplicativo__SecaoDisciplinasAssignment_3_3 ) ) ) )
                    {
                    // InternalAceDsl.g:2260:3: ({...}? => ( ( ( rule__Aplicativo__SecaoDisciplinasAssignment_3_3 ) ) ) )
                    // InternalAceDsl.g:2261:4: {...}? => ( ( ( rule__Aplicativo__SecaoDisciplinasAssignment_3_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Aplicativo__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalAceDsl.g:2261:106: ( ( ( rule__Aplicativo__SecaoDisciplinasAssignment_3_3 ) ) )
                    // InternalAceDsl.g:2262:5: ( ( rule__Aplicativo__SecaoDisciplinasAssignment_3_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalAceDsl.g:2268:5: ( ( rule__Aplicativo__SecaoDisciplinasAssignment_3_3 ) )
                    // InternalAceDsl.g:2269:6: ( rule__Aplicativo__SecaoDisciplinasAssignment_3_3 )
                    {
                     before(grammarAccess.getAplicativoAccess().getSecaoDisciplinasAssignment_3_3()); 
                    // InternalAceDsl.g:2270:6: ( rule__Aplicativo__SecaoDisciplinasAssignment_3_3 )
                    // InternalAceDsl.g:2270:7: rule__Aplicativo__SecaoDisciplinasAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Aplicativo__SecaoDisciplinasAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getAplicativoAccess().getSecaoDisciplinasAssignment_3_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAceDsl.g:2275:3: ({...}? => ( ( ( rule__Aplicativo__SecaoNoticiasAssignment_3_4 ) ) ) )
                    {
                    // InternalAceDsl.g:2275:3: ({...}? => ( ( ( rule__Aplicativo__SecaoNoticiasAssignment_3_4 ) ) ) )
                    // InternalAceDsl.g:2276:4: {...}? => ( ( ( rule__Aplicativo__SecaoNoticiasAssignment_3_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Aplicativo__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 4)");
                    }
                    // InternalAceDsl.g:2276:106: ( ( ( rule__Aplicativo__SecaoNoticiasAssignment_3_4 ) ) )
                    // InternalAceDsl.g:2277:5: ( ( rule__Aplicativo__SecaoNoticiasAssignment_3_4 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 4);
                    				

                    					selected = true;
                    				
                    // InternalAceDsl.g:2283:5: ( ( rule__Aplicativo__SecaoNoticiasAssignment_3_4 ) )
                    // InternalAceDsl.g:2284:6: ( rule__Aplicativo__SecaoNoticiasAssignment_3_4 )
                    {
                     before(grammarAccess.getAplicativoAccess().getSecaoNoticiasAssignment_3_4()); 
                    // InternalAceDsl.g:2285:6: ( rule__Aplicativo__SecaoNoticiasAssignment_3_4 )
                    // InternalAceDsl.g:2285:7: rule__Aplicativo__SecaoNoticiasAssignment_3_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Aplicativo__SecaoNoticiasAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getAplicativoAccess().getSecaoNoticiasAssignment_3_4()); 

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalAceDsl.g:2290:3: ({...}? => ( ( ( rule__Aplicativo__EstiloAssignment_3_5 ) ) ) )
                    {
                    // InternalAceDsl.g:2290:3: ({...}? => ( ( ( rule__Aplicativo__EstiloAssignment_3_5 ) ) ) )
                    // InternalAceDsl.g:2291:4: {...}? => ( ( ( rule__Aplicativo__EstiloAssignment_3_5 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 5) ) {
                        throw new FailedPredicateException(input, "rule__Aplicativo__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 5)");
                    }
                    // InternalAceDsl.g:2291:106: ( ( ( rule__Aplicativo__EstiloAssignment_3_5 ) ) )
                    // InternalAceDsl.g:2292:5: ( ( rule__Aplicativo__EstiloAssignment_3_5 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 5);
                    				

                    					selected = true;
                    				
                    // InternalAceDsl.g:2298:5: ( ( rule__Aplicativo__EstiloAssignment_3_5 ) )
                    // InternalAceDsl.g:2299:6: ( rule__Aplicativo__EstiloAssignment_3_5 )
                    {
                     before(grammarAccess.getAplicativoAccess().getEstiloAssignment_3_5()); 
                    // InternalAceDsl.g:2300:6: ( rule__Aplicativo__EstiloAssignment_3_5 )
                    // InternalAceDsl.g:2300:7: rule__Aplicativo__EstiloAssignment_3_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Aplicativo__EstiloAssignment_3_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getAplicativoAccess().getEstiloAssignment_3_5()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAplicativoAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aplicativo__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Aplicativo__UnorderedGroup_3__0"
    // InternalAceDsl.g:2313:1: rule__Aplicativo__UnorderedGroup_3__0 : rule__Aplicativo__UnorderedGroup_3__Impl ( rule__Aplicativo__UnorderedGroup_3__1 )? ;
    public final void rule__Aplicativo__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2317:1: ( rule__Aplicativo__UnorderedGroup_3__Impl ( rule__Aplicativo__UnorderedGroup_3__1 )? )
            // InternalAceDsl.g:2318:2: rule__Aplicativo__UnorderedGroup_3__Impl ( rule__Aplicativo__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_17);
            rule__Aplicativo__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalAceDsl.g:2319:2: ( rule__Aplicativo__UnorderedGroup_3__1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( LA12_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 0) ) {
                alt12=1;
            }
            else if ( LA12_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 1) ) {
                alt12=1;
            }
            else if ( LA12_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 2) ) {
                alt12=1;
            }
            else if ( LA12_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 3) ) {
                alt12=1;
            }
            else if ( LA12_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 4) ) {
                alt12=1;
            }
            else if ( LA12_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 5) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAceDsl.g:2319:2: rule__Aplicativo__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Aplicativo__UnorderedGroup_3__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Aplicativo__UnorderedGroup_3__0"


    // $ANTLR start "rule__Aplicativo__UnorderedGroup_3__1"
    // InternalAceDsl.g:2325:1: rule__Aplicativo__UnorderedGroup_3__1 : rule__Aplicativo__UnorderedGroup_3__Impl ( rule__Aplicativo__UnorderedGroup_3__2 )? ;
    public final void rule__Aplicativo__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2329:1: ( rule__Aplicativo__UnorderedGroup_3__Impl ( rule__Aplicativo__UnorderedGroup_3__2 )? )
            // InternalAceDsl.g:2330:2: rule__Aplicativo__UnorderedGroup_3__Impl ( rule__Aplicativo__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_17);
            rule__Aplicativo__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalAceDsl.g:2331:2: ( rule__Aplicativo__UnorderedGroup_3__2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( LA13_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 0) ) {
                alt13=1;
            }
            else if ( LA13_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 1) ) {
                alt13=1;
            }
            else if ( LA13_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 2) ) {
                alt13=1;
            }
            else if ( LA13_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 3) ) {
                alt13=1;
            }
            else if ( LA13_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 4) ) {
                alt13=1;
            }
            else if ( LA13_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 5) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAceDsl.g:2331:2: rule__Aplicativo__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Aplicativo__UnorderedGroup_3__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Aplicativo__UnorderedGroup_3__1"


    // $ANTLR start "rule__Aplicativo__UnorderedGroup_3__2"
    // InternalAceDsl.g:2337:1: rule__Aplicativo__UnorderedGroup_3__2 : rule__Aplicativo__UnorderedGroup_3__Impl ( rule__Aplicativo__UnorderedGroup_3__3 )? ;
    public final void rule__Aplicativo__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2341:1: ( rule__Aplicativo__UnorderedGroup_3__Impl ( rule__Aplicativo__UnorderedGroup_3__3 )? )
            // InternalAceDsl.g:2342:2: rule__Aplicativo__UnorderedGroup_3__Impl ( rule__Aplicativo__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_17);
            rule__Aplicativo__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalAceDsl.g:2343:2: ( rule__Aplicativo__UnorderedGroup_3__3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( LA14_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 0) ) {
                alt14=1;
            }
            else if ( LA14_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 1) ) {
                alt14=1;
            }
            else if ( LA14_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 2) ) {
                alt14=1;
            }
            else if ( LA14_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 3) ) {
                alt14=1;
            }
            else if ( LA14_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 4) ) {
                alt14=1;
            }
            else if ( LA14_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 5) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalAceDsl.g:2343:2: rule__Aplicativo__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Aplicativo__UnorderedGroup_3__3();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Aplicativo__UnorderedGroup_3__2"


    // $ANTLR start "rule__Aplicativo__UnorderedGroup_3__3"
    // InternalAceDsl.g:2349:1: rule__Aplicativo__UnorderedGroup_3__3 : rule__Aplicativo__UnorderedGroup_3__Impl ( rule__Aplicativo__UnorderedGroup_3__4 )? ;
    public final void rule__Aplicativo__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2353:1: ( rule__Aplicativo__UnorderedGroup_3__Impl ( rule__Aplicativo__UnorderedGroup_3__4 )? )
            // InternalAceDsl.g:2354:2: rule__Aplicativo__UnorderedGroup_3__Impl ( rule__Aplicativo__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_17);
            rule__Aplicativo__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalAceDsl.g:2355:2: ( rule__Aplicativo__UnorderedGroup_3__4 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( LA15_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 0) ) {
                alt15=1;
            }
            else if ( LA15_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 1) ) {
                alt15=1;
            }
            else if ( LA15_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 2) ) {
                alt15=1;
            }
            else if ( LA15_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 3) ) {
                alt15=1;
            }
            else if ( LA15_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 4) ) {
                alt15=1;
            }
            else if ( LA15_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 5) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalAceDsl.g:2355:2: rule__Aplicativo__UnorderedGroup_3__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Aplicativo__UnorderedGroup_3__4();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Aplicativo__UnorderedGroup_3__3"


    // $ANTLR start "rule__Aplicativo__UnorderedGroup_3__4"
    // InternalAceDsl.g:2361:1: rule__Aplicativo__UnorderedGroup_3__4 : rule__Aplicativo__UnorderedGroup_3__Impl ( rule__Aplicativo__UnorderedGroup_3__5 )? ;
    public final void rule__Aplicativo__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2365:1: ( rule__Aplicativo__UnorderedGroup_3__Impl ( rule__Aplicativo__UnorderedGroup_3__5 )? )
            // InternalAceDsl.g:2366:2: rule__Aplicativo__UnorderedGroup_3__Impl ( rule__Aplicativo__UnorderedGroup_3__5 )?
            {
            pushFollow(FOLLOW_17);
            rule__Aplicativo__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalAceDsl.g:2367:2: ( rule__Aplicativo__UnorderedGroup_3__5 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( LA16_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 0) ) {
                alt16=1;
            }
            else if ( LA16_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 1) ) {
                alt16=1;
            }
            else if ( LA16_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 2) ) {
                alt16=1;
            }
            else if ( LA16_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 3) ) {
                alt16=1;
            }
            else if ( LA16_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 4) ) {
                alt16=1;
            }
            else if ( LA16_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), 5) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAceDsl.g:2367:2: rule__Aplicativo__UnorderedGroup_3__5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Aplicativo__UnorderedGroup_3__5();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Aplicativo__UnorderedGroup_3__4"


    // $ANTLR start "rule__Aplicativo__UnorderedGroup_3__5"
    // InternalAceDsl.g:2373:1: rule__Aplicativo__UnorderedGroup_3__5 : rule__Aplicativo__UnorderedGroup_3__Impl ;
    public final void rule__Aplicativo__UnorderedGroup_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2377:1: ( rule__Aplicativo__UnorderedGroup_3__Impl )
            // InternalAceDsl.g:2378:2: rule__Aplicativo__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aplicativo__UnorderedGroup_3__Impl();

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
    // $ANTLR end "rule__Aplicativo__UnorderedGroup_3__5"


    // $ANTLR start "rule__Estilo__UnorderedGroup_2"
    // InternalAceDsl.g:2385:1: rule__Estilo__UnorderedGroup_2 : rule__Estilo__UnorderedGroup_2__0 {...}?;
    public final void rule__Estilo__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEstiloAccess().getUnorderedGroup_2());
        	
        try {
            // InternalAceDsl.g:2390:1: ( rule__Estilo__UnorderedGroup_2__0 {...}?)
            // InternalAceDsl.g:2391:2: rule__Estilo__UnorderedGroup_2__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__UnorderedGroup_2__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEstiloAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "rule__Estilo__UnorderedGroup_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getEstiloAccess().getUnorderedGroup_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getEstiloAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estilo__UnorderedGroup_2"


    // $ANTLR start "rule__Estilo__UnorderedGroup_2__Impl"
    // InternalAceDsl.g:2399:1: rule__Estilo__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Estilo__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_4__0 ) ) ) ) ) ;
    public final void rule__Estilo__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalAceDsl.g:2404:1: ( ( ({...}? => ( ( ( rule__Estilo__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_4__0 ) ) ) ) ) )
            // InternalAceDsl.g:2405:3: ( ({...}? => ( ( ( rule__Estilo__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_4__0 ) ) ) ) )
            {
            // InternalAceDsl.g:2405:3: ( ({...}? => ( ( ( rule__Estilo__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_2__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_3__0 ) ) ) ) | ({...}? => ( ( ( rule__Estilo__Group_2_4__0 ) ) ) ) )
            int alt17=5;
            int LA17_0 = input.LA(1);

            if ( LA17_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 0) ) {
                alt17=1;
            }
            else if ( LA17_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 1) ) {
                alt17=2;
            }
            else if ( LA17_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 2) ) {
                alt17=3;
            }
            else if ( LA17_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 3) ) {
                alt17=4;
            }
            else if ( LA17_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 4) ) {
                alt17=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAceDsl.g:2406:3: ({...}? => ( ( ( rule__Estilo__Group_2_0__0 ) ) ) )
                    {
                    // InternalAceDsl.g:2406:3: ({...}? => ( ( ( rule__Estilo__Group_2_0__0 ) ) ) )
                    // InternalAceDsl.g:2407:4: {...}? => ( ( ( rule__Estilo__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Estilo__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalAceDsl.g:2407:102: ( ( ( rule__Estilo__Group_2_0__0 ) ) )
                    // InternalAceDsl.g:2408:5: ( ( rule__Estilo__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalAceDsl.g:2414:5: ( ( rule__Estilo__Group_2_0__0 ) )
                    // InternalAceDsl.g:2415:6: ( rule__Estilo__Group_2_0__0 )
                    {
                     before(grammarAccess.getEstiloAccess().getGroup_2_0()); 
                    // InternalAceDsl.g:2416:6: ( rule__Estilo__Group_2_0__0 )
                    // InternalAceDsl.g:2416:7: rule__Estilo__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Estilo__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEstiloAccess().getGroup_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalAceDsl.g:2421:3: ({...}? => ( ( ( rule__Estilo__Group_2_1__0 ) ) ) )
                    {
                    // InternalAceDsl.g:2421:3: ({...}? => ( ( ( rule__Estilo__Group_2_1__0 ) ) ) )
                    // InternalAceDsl.g:2422:4: {...}? => ( ( ( rule__Estilo__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Estilo__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalAceDsl.g:2422:102: ( ( ( rule__Estilo__Group_2_1__0 ) ) )
                    // InternalAceDsl.g:2423:5: ( ( rule__Estilo__Group_2_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalAceDsl.g:2429:5: ( ( rule__Estilo__Group_2_1__0 ) )
                    // InternalAceDsl.g:2430:6: ( rule__Estilo__Group_2_1__0 )
                    {
                     before(grammarAccess.getEstiloAccess().getGroup_2_1()); 
                    // InternalAceDsl.g:2431:6: ( rule__Estilo__Group_2_1__0 )
                    // InternalAceDsl.g:2431:7: rule__Estilo__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Estilo__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEstiloAccess().getGroup_2_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalAceDsl.g:2436:3: ({...}? => ( ( ( rule__Estilo__Group_2_2__0 ) ) ) )
                    {
                    // InternalAceDsl.g:2436:3: ({...}? => ( ( ( rule__Estilo__Group_2_2__0 ) ) ) )
                    // InternalAceDsl.g:2437:4: {...}? => ( ( ( rule__Estilo__Group_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Estilo__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 2)");
                    }
                    // InternalAceDsl.g:2437:102: ( ( ( rule__Estilo__Group_2_2__0 ) ) )
                    // InternalAceDsl.g:2438:5: ( ( rule__Estilo__Group_2_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 2);
                    				

                    					selected = true;
                    				
                    // InternalAceDsl.g:2444:5: ( ( rule__Estilo__Group_2_2__0 ) )
                    // InternalAceDsl.g:2445:6: ( rule__Estilo__Group_2_2__0 )
                    {
                     before(grammarAccess.getEstiloAccess().getGroup_2_2()); 
                    // InternalAceDsl.g:2446:6: ( rule__Estilo__Group_2_2__0 )
                    // InternalAceDsl.g:2446:7: rule__Estilo__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Estilo__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEstiloAccess().getGroup_2_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalAceDsl.g:2451:3: ({...}? => ( ( ( rule__Estilo__Group_2_3__0 ) ) ) )
                    {
                    // InternalAceDsl.g:2451:3: ({...}? => ( ( ( rule__Estilo__Group_2_3__0 ) ) ) )
                    // InternalAceDsl.g:2452:4: {...}? => ( ( ( rule__Estilo__Group_2_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Estilo__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 3)");
                    }
                    // InternalAceDsl.g:2452:102: ( ( ( rule__Estilo__Group_2_3__0 ) ) )
                    // InternalAceDsl.g:2453:5: ( ( rule__Estilo__Group_2_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 3);
                    				

                    					selected = true;
                    				
                    // InternalAceDsl.g:2459:5: ( ( rule__Estilo__Group_2_3__0 ) )
                    // InternalAceDsl.g:2460:6: ( rule__Estilo__Group_2_3__0 )
                    {
                     before(grammarAccess.getEstiloAccess().getGroup_2_3()); 
                    // InternalAceDsl.g:2461:6: ( rule__Estilo__Group_2_3__0 )
                    // InternalAceDsl.g:2461:7: rule__Estilo__Group_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Estilo__Group_2_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEstiloAccess().getGroup_2_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalAceDsl.g:2466:3: ({...}? => ( ( ( rule__Estilo__Group_2_4__0 ) ) ) )
                    {
                    // InternalAceDsl.g:2466:3: ({...}? => ( ( ( rule__Estilo__Group_2_4__0 ) ) ) )
                    // InternalAceDsl.g:2467:4: {...}? => ( ( ( rule__Estilo__Group_2_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 4) ) {
                        throw new FailedPredicateException(input, "rule__Estilo__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 4)");
                    }
                    // InternalAceDsl.g:2467:102: ( ( ( rule__Estilo__Group_2_4__0 ) ) )
                    // InternalAceDsl.g:2468:5: ( ( rule__Estilo__Group_2_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 4);
                    				

                    					selected = true;
                    				
                    // InternalAceDsl.g:2474:5: ( ( rule__Estilo__Group_2_4__0 ) )
                    // InternalAceDsl.g:2475:6: ( rule__Estilo__Group_2_4__0 )
                    {
                     before(grammarAccess.getEstiloAccess().getGroup_2_4()); 
                    // InternalAceDsl.g:2476:6: ( rule__Estilo__Group_2_4__0 )
                    // InternalAceDsl.g:2476:7: rule__Estilo__Group_2_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Estilo__Group_2_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEstiloAccess().getGroup_2_4()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEstiloAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Estilo__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__Estilo__UnorderedGroup_2__0"
    // InternalAceDsl.g:2489:1: rule__Estilo__UnorderedGroup_2__0 : rule__Estilo__UnorderedGroup_2__Impl ( rule__Estilo__UnorderedGroup_2__1 )? ;
    public final void rule__Estilo__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2493:1: ( rule__Estilo__UnorderedGroup_2__Impl ( rule__Estilo__UnorderedGroup_2__1 )? )
            // InternalAceDsl.g:2494:2: rule__Estilo__UnorderedGroup_2__Impl ( rule__Estilo__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_18);
            rule__Estilo__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalAceDsl.g:2495:2: ( rule__Estilo__UnorderedGroup_2__1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( LA18_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 0) ) {
                alt18=1;
            }
            else if ( LA18_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 1) ) {
                alt18=1;
            }
            else if ( LA18_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 2) ) {
                alt18=1;
            }
            else if ( LA18_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 3) ) {
                alt18=1;
            }
            else if ( LA18_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 4) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAceDsl.g:2495:2: rule__Estilo__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Estilo__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Estilo__UnorderedGroup_2__0"


    // $ANTLR start "rule__Estilo__UnorderedGroup_2__1"
    // InternalAceDsl.g:2501:1: rule__Estilo__UnorderedGroup_2__1 : rule__Estilo__UnorderedGroup_2__Impl ( rule__Estilo__UnorderedGroup_2__2 )? ;
    public final void rule__Estilo__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2505:1: ( rule__Estilo__UnorderedGroup_2__Impl ( rule__Estilo__UnorderedGroup_2__2 )? )
            // InternalAceDsl.g:2506:2: rule__Estilo__UnorderedGroup_2__Impl ( rule__Estilo__UnorderedGroup_2__2 )?
            {
            pushFollow(FOLLOW_18);
            rule__Estilo__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalAceDsl.g:2507:2: ( rule__Estilo__UnorderedGroup_2__2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 1) ) {
                alt19=1;
            }
            else if ( LA19_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 2) ) {
                alt19=1;
            }
            else if ( LA19_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 3) ) {
                alt19=1;
            }
            else if ( LA19_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 4) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAceDsl.g:2507:2: rule__Estilo__UnorderedGroup_2__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Estilo__UnorderedGroup_2__2();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Estilo__UnorderedGroup_2__1"


    // $ANTLR start "rule__Estilo__UnorderedGroup_2__2"
    // InternalAceDsl.g:2513:1: rule__Estilo__UnorderedGroup_2__2 : rule__Estilo__UnorderedGroup_2__Impl ( rule__Estilo__UnorderedGroup_2__3 )? ;
    public final void rule__Estilo__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2517:1: ( rule__Estilo__UnorderedGroup_2__Impl ( rule__Estilo__UnorderedGroup_2__3 )? )
            // InternalAceDsl.g:2518:2: rule__Estilo__UnorderedGroup_2__Impl ( rule__Estilo__UnorderedGroup_2__3 )?
            {
            pushFollow(FOLLOW_18);
            rule__Estilo__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalAceDsl.g:2519:2: ( rule__Estilo__UnorderedGroup_2__3 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 1) ) {
                alt20=1;
            }
            else if ( LA20_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 2) ) {
                alt20=1;
            }
            else if ( LA20_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 3) ) {
                alt20=1;
            }
            else if ( LA20_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 4) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalAceDsl.g:2519:2: rule__Estilo__UnorderedGroup_2__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Estilo__UnorderedGroup_2__3();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Estilo__UnorderedGroup_2__2"


    // $ANTLR start "rule__Estilo__UnorderedGroup_2__3"
    // InternalAceDsl.g:2525:1: rule__Estilo__UnorderedGroup_2__3 : rule__Estilo__UnorderedGroup_2__Impl ( rule__Estilo__UnorderedGroup_2__4 )? ;
    public final void rule__Estilo__UnorderedGroup_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2529:1: ( rule__Estilo__UnorderedGroup_2__Impl ( rule__Estilo__UnorderedGroup_2__4 )? )
            // InternalAceDsl.g:2530:2: rule__Estilo__UnorderedGroup_2__Impl ( rule__Estilo__UnorderedGroup_2__4 )?
            {
            pushFollow(FOLLOW_18);
            rule__Estilo__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalAceDsl.g:2531:2: ( rule__Estilo__UnorderedGroup_2__4 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 1) ) {
                alt21=1;
            }
            else if ( LA21_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 2) ) {
                alt21=1;
            }
            else if ( LA21_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 3) ) {
                alt21=1;
            }
            else if ( LA21_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), 4) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAceDsl.g:2531:2: rule__Estilo__UnorderedGroup_2__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Estilo__UnorderedGroup_2__4();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "rule__Estilo__UnorderedGroup_2__3"


    // $ANTLR start "rule__Estilo__UnorderedGroup_2__4"
    // InternalAceDsl.g:2537:1: rule__Estilo__UnorderedGroup_2__4 : rule__Estilo__UnorderedGroup_2__Impl ;
    public final void rule__Estilo__UnorderedGroup_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2541:1: ( rule__Estilo__UnorderedGroup_2__Impl )
            // InternalAceDsl.g:2542:2: rule__Estilo__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Estilo__UnorderedGroup_2__Impl();

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
    // $ANTLR end "rule__Estilo__UnorderedGroup_2__4"


    // $ANTLR start "rule__Aplicativo__NomeAssignment_1"
    // InternalAceDsl.g:2549:1: rule__Aplicativo__NomeAssignment_1 : ( ruleEString ) ;
    public final void rule__Aplicativo__NomeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2553:1: ( ( ruleEString ) )
            // InternalAceDsl.g:2554:2: ( ruleEString )
            {
            // InternalAceDsl.g:2554:2: ( ruleEString )
            // InternalAceDsl.g:2555:3: ruleEString
            {
             before(grammarAccess.getAplicativoAccess().getNomeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAplicativoAccess().getNomeEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Aplicativo__NomeAssignment_1"


    // $ANTLR start "rule__Aplicativo__UrlAssignment_3_0_1"
    // InternalAceDsl.g:2564:1: rule__Aplicativo__UrlAssignment_3_0_1 : ( ruleEString ) ;
    public final void rule__Aplicativo__UrlAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2568:1: ( ( ruleEString ) )
            // InternalAceDsl.g:2569:2: ( ruleEString )
            {
            // InternalAceDsl.g:2569:2: ( ruleEString )
            // InternalAceDsl.g:2570:3: ruleEString
            {
             before(grammarAccess.getAplicativoAccess().getUrlEStringParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAplicativoAccess().getUrlEStringParserRuleCall_3_0_1_0()); 

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
    // $ANTLR end "rule__Aplicativo__UrlAssignment_3_0_1"


    // $ANTLR start "rule__Aplicativo__SecaoEventosAssignment_3_1"
    // InternalAceDsl.g:2579:1: rule__Aplicativo__SecaoEventosAssignment_3_1 : ( ruleSecaoEventos ) ;
    public final void rule__Aplicativo__SecaoEventosAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2583:1: ( ( ruleSecaoEventos ) )
            // InternalAceDsl.g:2584:2: ( ruleSecaoEventos )
            {
            // InternalAceDsl.g:2584:2: ( ruleSecaoEventos )
            // InternalAceDsl.g:2585:3: ruleSecaoEventos
            {
             before(grammarAccess.getAplicativoAccess().getSecaoEventosSecaoEventosParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSecaoEventos();

            state._fsp--;

             after(grammarAccess.getAplicativoAccess().getSecaoEventosSecaoEventosParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Aplicativo__SecaoEventosAssignment_3_1"


    // $ANTLR start "rule__Aplicativo__SecaoMembrosAssignment_3_2"
    // InternalAceDsl.g:2594:1: rule__Aplicativo__SecaoMembrosAssignment_3_2 : ( ruleSecaoMembros ) ;
    public final void rule__Aplicativo__SecaoMembrosAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2598:1: ( ( ruleSecaoMembros ) )
            // InternalAceDsl.g:2599:2: ( ruleSecaoMembros )
            {
            // InternalAceDsl.g:2599:2: ( ruleSecaoMembros )
            // InternalAceDsl.g:2600:3: ruleSecaoMembros
            {
             before(grammarAccess.getAplicativoAccess().getSecaoMembrosSecaoMembrosParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSecaoMembros();

            state._fsp--;

             after(grammarAccess.getAplicativoAccess().getSecaoMembrosSecaoMembrosParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Aplicativo__SecaoMembrosAssignment_3_2"


    // $ANTLR start "rule__Aplicativo__SecaoDisciplinasAssignment_3_3"
    // InternalAceDsl.g:2609:1: rule__Aplicativo__SecaoDisciplinasAssignment_3_3 : ( ruleSecaoDisciplinas ) ;
    public final void rule__Aplicativo__SecaoDisciplinasAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2613:1: ( ( ruleSecaoDisciplinas ) )
            // InternalAceDsl.g:2614:2: ( ruleSecaoDisciplinas )
            {
            // InternalAceDsl.g:2614:2: ( ruleSecaoDisciplinas )
            // InternalAceDsl.g:2615:3: ruleSecaoDisciplinas
            {
             before(grammarAccess.getAplicativoAccess().getSecaoDisciplinasSecaoDisciplinasParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSecaoDisciplinas();

            state._fsp--;

             after(grammarAccess.getAplicativoAccess().getSecaoDisciplinasSecaoDisciplinasParserRuleCall_3_3_0()); 

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
    // $ANTLR end "rule__Aplicativo__SecaoDisciplinasAssignment_3_3"


    // $ANTLR start "rule__Aplicativo__SecaoNoticiasAssignment_3_4"
    // InternalAceDsl.g:2624:1: rule__Aplicativo__SecaoNoticiasAssignment_3_4 : ( ruleSecaoNoticias ) ;
    public final void rule__Aplicativo__SecaoNoticiasAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2628:1: ( ( ruleSecaoNoticias ) )
            // InternalAceDsl.g:2629:2: ( ruleSecaoNoticias )
            {
            // InternalAceDsl.g:2629:2: ( ruleSecaoNoticias )
            // InternalAceDsl.g:2630:3: ruleSecaoNoticias
            {
             before(grammarAccess.getAplicativoAccess().getSecaoNoticiasSecaoNoticiasParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSecaoNoticias();

            state._fsp--;

             after(grammarAccess.getAplicativoAccess().getSecaoNoticiasSecaoNoticiasParserRuleCall_3_4_0()); 

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
    // $ANTLR end "rule__Aplicativo__SecaoNoticiasAssignment_3_4"


    // $ANTLR start "rule__Aplicativo__EstiloAssignment_3_5"
    // InternalAceDsl.g:2639:1: rule__Aplicativo__EstiloAssignment_3_5 : ( ruleEstilo ) ;
    public final void rule__Aplicativo__EstiloAssignment_3_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2643:1: ( ( ruleEstilo ) )
            // InternalAceDsl.g:2644:2: ( ruleEstilo )
            {
            // InternalAceDsl.g:2644:2: ( ruleEstilo )
            // InternalAceDsl.g:2645:3: ruleEstilo
            {
             before(grammarAccess.getAplicativoAccess().getEstiloEstiloParserRuleCall_3_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEstilo();

            state._fsp--;

             after(grammarAccess.getAplicativoAccess().getEstiloEstiloParserRuleCall_3_5_0()); 

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
    // $ANTLR end "rule__Aplicativo__EstiloAssignment_3_5"


    // $ANTLR start "rule__SecaoEventos__NomeAssignment_1"
    // InternalAceDsl.g:2654:1: rule__SecaoEventos__NomeAssignment_1 : ( ruleEString ) ;
    public final void rule__SecaoEventos__NomeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2658:1: ( ( ruleEString ) )
            // InternalAceDsl.g:2659:2: ( ruleEString )
            {
            // InternalAceDsl.g:2659:2: ( ruleEString )
            // InternalAceDsl.g:2660:3: ruleEString
            {
             before(grammarAccess.getSecaoEventosAccess().getNomeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSecaoEventosAccess().getNomeEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SecaoEventos__NomeAssignment_1"


    // $ANTLR start "rule__SecaoMembros__NomeAssignment_1"
    // InternalAceDsl.g:2669:1: rule__SecaoMembros__NomeAssignment_1 : ( ruleEString ) ;
    public final void rule__SecaoMembros__NomeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2673:1: ( ( ruleEString ) )
            // InternalAceDsl.g:2674:2: ( ruleEString )
            {
            // InternalAceDsl.g:2674:2: ( ruleEString )
            // InternalAceDsl.g:2675:3: ruleEString
            {
             before(grammarAccess.getSecaoMembrosAccess().getNomeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSecaoMembrosAccess().getNomeEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SecaoMembros__NomeAssignment_1"


    // $ANTLR start "rule__SecaoDisciplinas__NomeAssignment_1"
    // InternalAceDsl.g:2684:1: rule__SecaoDisciplinas__NomeAssignment_1 : ( ruleEString ) ;
    public final void rule__SecaoDisciplinas__NomeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2688:1: ( ( ruleEString ) )
            // InternalAceDsl.g:2689:2: ( ruleEString )
            {
            // InternalAceDsl.g:2689:2: ( ruleEString )
            // InternalAceDsl.g:2690:3: ruleEString
            {
             before(grammarAccess.getSecaoDisciplinasAccess().getNomeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSecaoDisciplinasAccess().getNomeEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SecaoDisciplinas__NomeAssignment_1"


    // $ANTLR start "rule__SecaoDisciplinas__SeparacaoDisciplinasAssignment_3"
    // InternalAceDsl.g:2699:1: rule__SecaoDisciplinas__SeparacaoDisciplinasAssignment_3 : ( ruleSeparacaoDisciplinas ) ;
    public final void rule__SecaoDisciplinas__SeparacaoDisciplinasAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2703:1: ( ( ruleSeparacaoDisciplinas ) )
            // InternalAceDsl.g:2704:2: ( ruleSeparacaoDisciplinas )
            {
            // InternalAceDsl.g:2704:2: ( ruleSeparacaoDisciplinas )
            // InternalAceDsl.g:2705:3: ruleSeparacaoDisciplinas
            {
             before(grammarAccess.getSecaoDisciplinasAccess().getSeparacaoDisciplinasSeparacaoDisciplinasParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSeparacaoDisciplinas();

            state._fsp--;

             after(grammarAccess.getSecaoDisciplinasAccess().getSeparacaoDisciplinasSeparacaoDisciplinasParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__SecaoDisciplinas__SeparacaoDisciplinasAssignment_3"


    // $ANTLR start "rule__SecaoNoticias__NomeAssignment_1"
    // InternalAceDsl.g:2714:1: rule__SecaoNoticias__NomeAssignment_1 : ( ruleEString ) ;
    public final void rule__SecaoNoticias__NomeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2718:1: ( ( ruleEString ) )
            // InternalAceDsl.g:2719:2: ( ruleEString )
            {
            // InternalAceDsl.g:2719:2: ( ruleEString )
            // InternalAceDsl.g:2720:3: ruleEString
            {
             before(grammarAccess.getSecaoNoticiasAccess().getNomeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSecaoNoticiasAccess().getNomeEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__SecaoNoticias__NomeAssignment_1"


    // $ANTLR start "rule__SecaoNoticias__FacebookAssignment_2_1_1"
    // InternalAceDsl.g:2729:1: rule__SecaoNoticias__FacebookAssignment_2_1_1 : ( ruleEString ) ;
    public final void rule__SecaoNoticias__FacebookAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2733:1: ( ( ruleEString ) )
            // InternalAceDsl.g:2734:2: ( ruleEString )
            {
            // InternalAceDsl.g:2734:2: ( ruleEString )
            // InternalAceDsl.g:2735:3: ruleEString
            {
             before(grammarAccess.getSecaoNoticiasAccess().getFacebookEStringParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSecaoNoticiasAccess().getFacebookEStringParserRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__SecaoNoticias__FacebookAssignment_2_1_1"


    // $ANTLR start "rule__Estilo__LogoAssignment_2_0_1"
    // InternalAceDsl.g:2744:1: rule__Estilo__LogoAssignment_2_0_1 : ( ruleEString ) ;
    public final void rule__Estilo__LogoAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2748:1: ( ( ruleEString ) )
            // InternalAceDsl.g:2749:2: ( ruleEString )
            {
            // InternalAceDsl.g:2749:2: ( ruleEString )
            // InternalAceDsl.g:2750:3: ruleEString
            {
             before(grammarAccess.getEstiloAccess().getLogoEStringParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEstiloAccess().getLogoEStringParserRuleCall_2_0_1_0()); 

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
    // $ANTLR end "rule__Estilo__LogoAssignment_2_0_1"


    // $ANTLR start "rule__Estilo__FonteAssignment_2_1_1"
    // InternalAceDsl.g:2759:1: rule__Estilo__FonteAssignment_2_1_1 : ( ruleFonte ) ;
    public final void rule__Estilo__FonteAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2763:1: ( ( ruleFonte ) )
            // InternalAceDsl.g:2764:2: ( ruleFonte )
            {
            // InternalAceDsl.g:2764:2: ( ruleFonte )
            // InternalAceDsl.g:2765:3: ruleFonte
            {
             before(grammarAccess.getEstiloAccess().getFonteFonteEnumRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFonte();

            state._fsp--;

             after(grammarAccess.getEstiloAccess().getFonteFonteEnumRuleCall_2_1_1_0()); 

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
    // $ANTLR end "rule__Estilo__FonteAssignment_2_1_1"


    // $ANTLR start "rule__Estilo__CorPrimariaAssignment_2_2_1"
    // InternalAceDsl.g:2774:1: rule__Estilo__CorPrimariaAssignment_2_2_1 : ( ruleEString ) ;
    public final void rule__Estilo__CorPrimariaAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2778:1: ( ( ruleEString ) )
            // InternalAceDsl.g:2779:2: ( ruleEString )
            {
            // InternalAceDsl.g:2779:2: ( ruleEString )
            // InternalAceDsl.g:2780:3: ruleEString
            {
             before(grammarAccess.getEstiloAccess().getCorPrimariaEStringParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEstiloAccess().getCorPrimariaEStringParserRuleCall_2_2_1_0()); 

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
    // $ANTLR end "rule__Estilo__CorPrimariaAssignment_2_2_1"


    // $ANTLR start "rule__Estilo__CorSecundariaAssignment_2_3_1"
    // InternalAceDsl.g:2789:1: rule__Estilo__CorSecundariaAssignment_2_3_1 : ( ruleEString ) ;
    public final void rule__Estilo__CorSecundariaAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2793:1: ( ( ruleEString ) )
            // InternalAceDsl.g:2794:2: ( ruleEString )
            {
            // InternalAceDsl.g:2794:2: ( ruleEString )
            // InternalAceDsl.g:2795:3: ruleEString
            {
             before(grammarAccess.getEstiloAccess().getCorSecundariaEStringParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEstiloAccess().getCorSecundariaEStringParserRuleCall_2_3_1_0()); 

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
    // $ANTLR end "rule__Estilo__CorSecundariaAssignment_2_3_1"


    // $ANTLR start "rule__Estilo__CorTerciariaAssignment_2_4_1"
    // InternalAceDsl.g:2804:1: rule__Estilo__CorTerciariaAssignment_2_4_1 : ( ruleEString ) ;
    public final void rule__Estilo__CorTerciariaAssignment_2_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2808:1: ( ( ruleEString ) )
            // InternalAceDsl.g:2809:2: ( ruleEString )
            {
            // InternalAceDsl.g:2809:2: ( ruleEString )
            // InternalAceDsl.g:2810:3: ruleEString
            {
             before(grammarAccess.getEstiloAccess().getCorTerciariaEStringParserRuleCall_2_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEstiloAccess().getCorTerciariaEStringParserRuleCall_2_4_1_0()); 

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
    // $ANTLR end "rule__Estilo__CorTerciariaAssignment_2_4_1"


    // $ANTLR start "rule__ListaCursos__CursoAssignment_0"
    // InternalAceDsl.g:2819:1: rule__ListaCursos__CursoAssignment_0 : ( ruleCurso ) ;
    public final void rule__ListaCursos__CursoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2823:1: ( ( ruleCurso ) )
            // InternalAceDsl.g:2824:2: ( ruleCurso )
            {
            // InternalAceDsl.g:2824:2: ( ruleCurso )
            // InternalAceDsl.g:2825:3: ruleCurso
            {
             before(grammarAccess.getListaCursosAccess().getCursoCursoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCurso();

            state._fsp--;

             after(grammarAccess.getListaCursosAccess().getCursoCursoParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ListaCursos__CursoAssignment_0"


    // $ANTLR start "rule__ListaCursos__CursoAssignment_1"
    // InternalAceDsl.g:2834:1: rule__ListaCursos__CursoAssignment_1 : ( ruleCurso ) ;
    public final void rule__ListaCursos__CursoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2838:1: ( ( ruleCurso ) )
            // InternalAceDsl.g:2839:2: ( ruleCurso )
            {
            // InternalAceDsl.g:2839:2: ( ruleCurso )
            // InternalAceDsl.g:2840:3: ruleCurso
            {
             before(grammarAccess.getListaCursosAccess().getCursoCursoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCurso();

            state._fsp--;

             after(grammarAccess.getListaCursosAccess().getCursoCursoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ListaCursos__CursoAssignment_1"


    // $ANTLR start "rule__ListaDepartamentos__DepartamentoAssignment_0"
    // InternalAceDsl.g:2849:1: rule__ListaDepartamentos__DepartamentoAssignment_0 : ( ruleDepartamento ) ;
    public final void rule__ListaDepartamentos__DepartamentoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2853:1: ( ( ruleDepartamento ) )
            // InternalAceDsl.g:2854:2: ( ruleDepartamento )
            {
            // InternalAceDsl.g:2854:2: ( ruleDepartamento )
            // InternalAceDsl.g:2855:3: ruleDepartamento
            {
             before(grammarAccess.getListaDepartamentosAccess().getDepartamentoDepartamentoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDepartamento();

            state._fsp--;

             after(grammarAccess.getListaDepartamentosAccess().getDepartamentoDepartamentoParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ListaDepartamentos__DepartamentoAssignment_0"


    // $ANTLR start "rule__ListaDepartamentos__DepartamentoAssignment_1"
    // InternalAceDsl.g:2864:1: rule__ListaDepartamentos__DepartamentoAssignment_1 : ( ruleDepartamento ) ;
    public final void rule__ListaDepartamentos__DepartamentoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2868:1: ( ( ruleDepartamento ) )
            // InternalAceDsl.g:2869:2: ( ruleDepartamento )
            {
            // InternalAceDsl.g:2869:2: ( ruleDepartamento )
            // InternalAceDsl.g:2870:3: ruleDepartamento
            {
             before(grammarAccess.getListaDepartamentosAccess().getDepartamentoDepartamentoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDepartamento();

            state._fsp--;

             after(grammarAccess.getListaDepartamentosAccess().getDepartamentoDepartamentoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ListaDepartamentos__DepartamentoAssignment_1"


    // $ANTLR start "rule__ListaPeriodos__PeriodoAssignment_0"
    // InternalAceDsl.g:2879:1: rule__ListaPeriodos__PeriodoAssignment_0 : ( rulePeriodo ) ;
    public final void rule__ListaPeriodos__PeriodoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2883:1: ( ( rulePeriodo ) )
            // InternalAceDsl.g:2884:2: ( rulePeriodo )
            {
            // InternalAceDsl.g:2884:2: ( rulePeriodo )
            // InternalAceDsl.g:2885:3: rulePeriodo
            {
             before(grammarAccess.getListaPeriodosAccess().getPeriodoPeriodoParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePeriodo();

            state._fsp--;

             after(grammarAccess.getListaPeriodosAccess().getPeriodoPeriodoParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__ListaPeriodos__PeriodoAssignment_0"


    // $ANTLR start "rule__ListaPeriodos__PeriodoAssignment_1"
    // InternalAceDsl.g:2894:1: rule__ListaPeriodos__PeriodoAssignment_1 : ( rulePeriodo ) ;
    public final void rule__ListaPeriodos__PeriodoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2898:1: ( ( rulePeriodo ) )
            // InternalAceDsl.g:2899:2: ( rulePeriodo )
            {
            // InternalAceDsl.g:2899:2: ( rulePeriodo )
            // InternalAceDsl.g:2900:3: rulePeriodo
            {
             before(grammarAccess.getListaPeriodosAccess().getPeriodoPeriodoParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePeriodo();

            state._fsp--;

             after(grammarAccess.getListaPeriodosAccess().getPeriodoPeriodoParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ListaPeriodos__PeriodoAssignment_1"


    // $ANTLR start "rule__Curso__NomeAssignment_1"
    // InternalAceDsl.g:2909:1: rule__Curso__NomeAssignment_1 : ( ruleEString ) ;
    public final void rule__Curso__NomeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2913:1: ( ( ruleEString ) )
            // InternalAceDsl.g:2914:2: ( ruleEString )
            {
            // InternalAceDsl.g:2914:2: ( ruleEString )
            // InternalAceDsl.g:2915:3: ruleEString
            {
             before(grammarAccess.getCursoAccess().getNomeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCursoAccess().getNomeEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Curso__NomeAssignment_1"


    // $ANTLR start "rule__Curso__OrganizacaoCursoAssignment_3"
    // InternalAceDsl.g:2924:1: rule__Curso__OrganizacaoCursoAssignment_3 : ( ruleOrganizacaoCurso ) ;
    public final void rule__Curso__OrganizacaoCursoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2928:1: ( ( ruleOrganizacaoCurso ) )
            // InternalAceDsl.g:2929:2: ( ruleOrganizacaoCurso )
            {
            // InternalAceDsl.g:2929:2: ( ruleOrganizacaoCurso )
            // InternalAceDsl.g:2930:3: ruleOrganizacaoCurso
            {
             before(grammarAccess.getCursoAccess().getOrganizacaoCursoOrganizacaoCursoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOrganizacaoCurso();

            state._fsp--;

             after(grammarAccess.getCursoAccess().getOrganizacaoCursoOrganizacaoCursoParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Curso__OrganizacaoCursoAssignment_3"


    // $ANTLR start "rule__Departamento__NomeAssignment_1"
    // InternalAceDsl.g:2939:1: rule__Departamento__NomeAssignment_1 : ( ruleEString ) ;
    public final void rule__Departamento__NomeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2943:1: ( ( ruleEString ) )
            // InternalAceDsl.g:2944:2: ( ruleEString )
            {
            // InternalAceDsl.g:2944:2: ( ruleEString )
            // InternalAceDsl.g:2945:3: ruleEString
            {
             before(grammarAccess.getDepartamentoAccess().getNomeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDepartamentoAccess().getNomeEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Departamento__NomeAssignment_1"


    // $ANTLR start "rule__Departamento__OrganizacaoDepartamentoAssignment_3"
    // InternalAceDsl.g:2954:1: rule__Departamento__OrganizacaoDepartamentoAssignment_3 : ( ruleOrganizacaoDepartamento ) ;
    public final void rule__Departamento__OrganizacaoDepartamentoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2958:1: ( ( ruleOrganizacaoDepartamento ) )
            // InternalAceDsl.g:2959:2: ( ruleOrganizacaoDepartamento )
            {
            // InternalAceDsl.g:2959:2: ( ruleOrganizacaoDepartamento )
            // InternalAceDsl.g:2960:3: ruleOrganizacaoDepartamento
            {
             before(grammarAccess.getDepartamentoAccess().getOrganizacaoDepartamentoOrganizacaoDepartamentoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOrganizacaoDepartamento();

            state._fsp--;

             after(grammarAccess.getDepartamentoAccess().getOrganizacaoDepartamentoOrganizacaoDepartamentoParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Departamento__OrganizacaoDepartamentoAssignment_3"


    // $ANTLR start "rule__Periodo__NomeAssignment_1"
    // InternalAceDsl.g:2969:1: rule__Periodo__NomeAssignment_1 : ( ruleEString ) ;
    public final void rule__Periodo__NomeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAceDsl.g:2973:1: ( ( ruleEString ) )
            // InternalAceDsl.g:2974:2: ( ruleEString )
            {
            // InternalAceDsl.g:2974:2: ( ruleEString )
            // InternalAceDsl.g:2975:3: ruleEString
            {
             before(grammarAccess.getPeriodoAccess().getNomeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPeriodoAccess().getNomeEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Periodo__NomeAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000017C0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000003C0000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000017C0002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000003E000002L});

}
