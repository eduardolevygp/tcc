/*
 * generated by Xtext 2.9.2
 */
package org.xtext.ace.acedsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.ace.acedsl.ide.contentassist.antlr.internal.InternalAceDslParser;
import org.xtext.ace.acedsl.services.AceDslGrammarAccess;

public class AceDslParser extends AbstractContentAssistParser {

	@Inject
	private AceDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalAceDslParser createParser() {
		InternalAceDslParser result = new InternalAceDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSeparacaoDisciplinasAccess().getAlternatives(), "rule__SeparacaoDisciplinas__Alternatives");
					put(grammarAccess.getOrganizacaoCursoAccess().getAlternatives(), "rule__OrganizacaoCurso__Alternatives");
					put(grammarAccess.getOrganizacaoDepartamentoAccess().getAlternatives(), "rule__OrganizacaoDepartamento__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getFonteAccess().getAlternatives(), "rule__Fonte__Alternatives");
					put(grammarAccess.getAplicativoAccess().getGroup(), "rule__Aplicativo__Group__0");
					put(grammarAccess.getAplicativoAccess().getGroup_3_0(), "rule__Aplicativo__Group_3_0__0");
					put(grammarAccess.getSecaoEventosAccess().getGroup(), "rule__SecaoEventos__Group__0");
					put(grammarAccess.getSecaoMembrosAccess().getGroup(), "rule__SecaoMembros__Group__0");
					put(grammarAccess.getSecaoDisciplinasAccess().getGroup(), "rule__SecaoDisciplinas__Group__0");
					put(grammarAccess.getSecaoNoticiasAccess().getGroup(), "rule__SecaoNoticias__Group__0");
					put(grammarAccess.getSecaoNoticiasAccess().getGroup_2(), "rule__SecaoNoticias__Group_2__0");
					put(grammarAccess.getSecaoNoticiasAccess().getGroup_2_1(), "rule__SecaoNoticias__Group_2_1__0");
					put(grammarAccess.getEstiloAccess().getGroup(), "rule__Estilo__Group__0");
					put(grammarAccess.getEstiloAccess().getGroup_2_0(), "rule__Estilo__Group_2_0__0");
					put(grammarAccess.getEstiloAccess().getGroup_2_1(), "rule__Estilo__Group_2_1__0");
					put(grammarAccess.getEstiloAccess().getGroup_2_2(), "rule__Estilo__Group_2_2__0");
					put(grammarAccess.getEstiloAccess().getGroup_2_3(), "rule__Estilo__Group_2_3__0");
					put(grammarAccess.getEstiloAccess().getGroup_2_4(), "rule__Estilo__Group_2_4__0");
					put(grammarAccess.getListaCursosAccess().getGroup(), "rule__ListaCursos__Group__0");
					put(grammarAccess.getListaDisciplinasAccess().getGroup(), "rule__ListaDisciplinas__Group__0");
					put(grammarAccess.getListaDepartamentosAccess().getGroup(), "rule__ListaDepartamentos__Group__0");
					put(grammarAccess.getListaPeriodosAccess().getGroup(), "rule__ListaPeriodos__Group__0");
					put(grammarAccess.getCursoAccess().getGroup(), "rule__Curso__Group__0");
					put(grammarAccess.getDepartamentoAccess().getGroup(), "rule__Departamento__Group__0");
					put(grammarAccess.getPeriodoAccess().getGroup(), "rule__Periodo__Group__0");
					put(grammarAccess.getAplicativoAccess().getNomeAssignment_1(), "rule__Aplicativo__NomeAssignment_1");
					put(grammarAccess.getAplicativoAccess().getUrlAssignment_3_0_1(), "rule__Aplicativo__UrlAssignment_3_0_1");
					put(grammarAccess.getAplicativoAccess().getSecaoEventosAssignment_3_1(), "rule__Aplicativo__SecaoEventosAssignment_3_1");
					put(grammarAccess.getAplicativoAccess().getSecaoMembrosAssignment_3_2(), "rule__Aplicativo__SecaoMembrosAssignment_3_2");
					put(grammarAccess.getAplicativoAccess().getSecaoDisciplinasAssignment_3_3(), "rule__Aplicativo__SecaoDisciplinasAssignment_3_3");
					put(grammarAccess.getAplicativoAccess().getSecaoNoticiasAssignment_3_4(), "rule__Aplicativo__SecaoNoticiasAssignment_3_4");
					put(grammarAccess.getAplicativoAccess().getEstiloAssignment_3_5(), "rule__Aplicativo__EstiloAssignment_3_5");
					put(grammarAccess.getSecaoEventosAccess().getNomeAssignment_1(), "rule__SecaoEventos__NomeAssignment_1");
					put(grammarAccess.getSecaoMembrosAccess().getNomeAssignment_1(), "rule__SecaoMembros__NomeAssignment_1");
					put(grammarAccess.getSecaoDisciplinasAccess().getNomeAssignment_1(), "rule__SecaoDisciplinas__NomeAssignment_1");
					put(grammarAccess.getSecaoDisciplinasAccess().getSeparacaoDisciplinasAssignment_3(), "rule__SecaoDisciplinas__SeparacaoDisciplinasAssignment_3");
					put(grammarAccess.getSecaoNoticiasAccess().getNomeAssignment_1(), "rule__SecaoNoticias__NomeAssignment_1");
					put(grammarAccess.getSecaoNoticiasAccess().getFacebookAssignment_2_1_1(), "rule__SecaoNoticias__FacebookAssignment_2_1_1");
					put(grammarAccess.getEstiloAccess().getLogoAssignment_2_0_1(), "rule__Estilo__LogoAssignment_2_0_1");
					put(grammarAccess.getEstiloAccess().getFonteAssignment_2_1_1(), "rule__Estilo__FonteAssignment_2_1_1");
					put(grammarAccess.getEstiloAccess().getCorPrimariaAssignment_2_2_1(), "rule__Estilo__CorPrimariaAssignment_2_2_1");
					put(grammarAccess.getEstiloAccess().getCorSecundariaAssignment_2_3_1(), "rule__Estilo__CorSecundariaAssignment_2_3_1");
					put(grammarAccess.getEstiloAccess().getCorTerciariaAssignment_2_4_1(), "rule__Estilo__CorTerciariaAssignment_2_4_1");
					put(grammarAccess.getListaCursosAccess().getCursoAssignment_0(), "rule__ListaCursos__CursoAssignment_0");
					put(grammarAccess.getListaCursosAccess().getCursoAssignment_1(), "rule__ListaCursos__CursoAssignment_1");
					put(grammarAccess.getListaDepartamentosAccess().getDepartamentoAssignment_0(), "rule__ListaDepartamentos__DepartamentoAssignment_0");
					put(grammarAccess.getListaDepartamentosAccess().getDepartamentoAssignment_1(), "rule__ListaDepartamentos__DepartamentoAssignment_1");
					put(grammarAccess.getListaPeriodosAccess().getPeriodoAssignment_0(), "rule__ListaPeriodos__PeriodoAssignment_0");
					put(grammarAccess.getListaPeriodosAccess().getPeriodoAssignment_1(), "rule__ListaPeriodos__PeriodoAssignment_1");
					put(grammarAccess.getCursoAccess().getNomeAssignment_1(), "rule__Curso__NomeAssignment_1");
					put(grammarAccess.getCursoAccess().getOrganizacaoCursoAssignment_3(), "rule__Curso__OrganizacaoCursoAssignment_3");
					put(grammarAccess.getDepartamentoAccess().getNomeAssignment_1(), "rule__Departamento__NomeAssignment_1");
					put(grammarAccess.getDepartamentoAccess().getOrganizacaoDepartamentoAssignment_3(), "rule__Departamento__OrganizacaoDepartamentoAssignment_3");
					put(grammarAccess.getPeriodoAccess().getNomeAssignment_1(), "rule__Periodo__NomeAssignment_1");
					put(grammarAccess.getAplicativoAccess().getUnorderedGroup_3(), "rule__Aplicativo__UnorderedGroup_3");
					put(grammarAccess.getEstiloAccess().getUnorderedGroup_2(), "rule__Estilo__UnorderedGroup_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalAceDslParser typedParser = (InternalAceDslParser) parser;
			typedParser.entryRuleAplicativo();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AceDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AceDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
