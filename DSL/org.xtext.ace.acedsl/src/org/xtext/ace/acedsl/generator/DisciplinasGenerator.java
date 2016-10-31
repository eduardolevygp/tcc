package org.xtext.ace.acedsl.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.xtext.ace.acedsl.acedsl.Aplicativo;
import org.xtext.ace.acedsl.acedsl.Curso;
import org.xtext.ace.acedsl.acedsl.Departamento;
import org.xtext.ace.acedsl.acedsl.ListaCursos;
import org.xtext.ace.acedsl.acedsl.ListaDepartamentos;
import org.xtext.ace.acedsl.acedsl.ListaDisciplinas;
import org.xtext.ace.acedsl.acedsl.ListaPeriodos;
import org.xtext.ace.acedsl.acedsl.Periodo;
import org.xtext.ace.acedsl.acedsl.SeparacaoDisciplinas;

public class DisciplinasGenerator extends ModuloGenerator {
	
	public DisciplinasGenerator(Aplicativo app, IFileSystemAccess2 fsa) {
		super(app, fsa);
	}

	public void generate () {
		if (app.getSecaoDisciplinas() == null) {
			limpaArquivos();
		} else {
			//chama funções para geração
			arrumaParameters();
			Map<String, Object> arvore = geraArvore();
			geraListaIndex(arvore);
			geraRepository();
		}
	}
	
	private static List<Map<String,Object>> listas = new ArrayList<>();

	private void limpaArquivos() {
		String parameters = (String) fsa.readTextFile("server/app/config/parameters.yml");
		parameters = replacePlaceholder(parameters, "disciplinas_visiblity", "false");
		parameters = replacePlaceholder(parameters, "disciplinas_label", "");
		fsa.generateFile("server/app/config/parameters.yml", parameters);
		fsa.generateFile("server/app/config/parameters.yml.dist", parameters);
		fsa.deleteFile("server/src/AceBundle/Controller/DisciplinasController.php");
		fsa.deleteFile("server/src/AceBundle/Entity/Disciplina.php");
		fsa.deleteFile("server/src/AceBundle/Form/DisciplinaType.php");
		fsa.deleteFile("server/src/AceBundle/Repository/DisciplinaRepository.php");
		fsa.deleteFile("server/src/AceBundle/Resources/views/Disciplinas/index.html.twig");
		fsa.deleteFile("server/src/AceBundle/Resources/views/Disciplinas/lista.html.twig");
		fsa.deleteFile("server/src/AceBundle/Resources/views/Disciplinas/nova.html.twig");
	}
	
	private Map<String, Object> geraArvore() {
		Map<String, Object> arvore = new HashMap<>();
		SeparacaoDisciplinas separacao = app.getSecaoDisciplinas().getSeparacaoDisciplinas();
		arvore.put("tipo", getSeparacaoLabel(separacao));
		arvore.put("classe", getSeparacaoClass(separacao));
		if (separacao instanceof ListaDisciplinas) {
			arvore.put("nome", getSeparacaoLabel(separacao));
			arvore.put("title", getSeparacaoLabel(separacao));
			arvore.put("id", generateId());
			listas.add(arvore);
		} else {
			arvore.put("lista", geraLista(separacao, ""));
		}
				
		return arvore;
	}
	
	private List<Map<String, Object>> geraLista (SeparacaoDisciplinas separacao, String accTitle) {
		List<Map<String, Object>> lista = new ArrayList<Map<String, Object>>();
		
		if (separacao instanceof ListaPeriodos) {
			ListaPeriodos listaP = (ListaPeriodos) separacao;
			Iterator<Periodo> iter = listaP.getPeriodo().listIterator();
			while (iter.hasNext()) {
				Periodo per = iter.next();
				Map<String, Object> map = new HashMap<>();
				map.put("nome", per.getNome());
				map.put("title", accTitle + per.getNome());
				map.put("id", generateId());
				listas.add(map);
				lista.add(map);
			}
		} else if (separacao instanceof ListaCursos) {
			ListaCursos listaC = (ListaCursos) separacao;
			Iterator<Curso> iter = listaC.getCurso().listIterator();
			while(iter.hasNext()) {
				Curso cur = iter.next();
				Map<String,Object> map = new HashMap<>();
				map.put("nome", cur.getNome());
				if (cur.getOrganizacaoCurso().getOrganizacao() instanceof ListaDisciplinas) {
					map.put("title", accTitle + cur.getNome());
					map.put("id", generateId());
					listas.add(map);
				} else {
					map.put("tipo", getSeparacaoLabel(cur.getOrganizacaoCurso().getOrganizacao()));
					map.put("classe", getSeparacaoClass(cur.getOrganizacaoCurso().getOrganizacao()));
					map.put("lista", geraLista(cur.getOrganizacaoCurso().getOrganizacao(), accTitle + cur.getNome() + " - "));	
				}
				lista.add(map);
			}
		} else if (separacao instanceof ListaDepartamentos) {
			ListaDepartamentos listaD = (ListaDepartamentos) separacao;
			Iterator<Departamento> iter = listaD.getDepartamento().listIterator();
			while(iter.hasNext()) {
				Departamento dep = iter.next();
				Map<String,Object> map = new HashMap<>();
				map.put("nome", dep.getNome());
				if (dep.getOrganizacaoDepartamento().getOrganizacao() instanceof ListaDisciplinas) {
					map.put("title", accTitle + dep.getNome());
					map.put("id", generateId());
					listas.add(map);
				} else {
					map.put("tipo", getSeparacaoLabel(dep.getOrganizacaoDepartamento().getOrganizacao()));
					map.put("classe", getSeparacaoClass(dep.getOrganizacaoDepartamento().getOrganizacao()));
					map.put("lista", geraLista(dep.getOrganizacaoDepartamento().getOrganizacao(), accTitle + dep.getNome() + " - "));
				}
				lista.add(map);
			}
		}
		
		return lista;
	}
	
	private String getSeparacaoLabel(SeparacaoDisciplinas sep) {
		if (sep instanceof ListaDisciplinas) return "Disciplinas";
		if (sep instanceof ListaPeriodos) return "Períodos";
		if (sep instanceof ListaCursos) return "Cursos";
		return "Departamentos";
	}
	
	private String getSeparacaoClass(SeparacaoDisciplinas sep) {
		if (sep instanceof ListaDisciplinas) return ListaDisciplinas.class.getName();
		if (sep instanceof ListaPeriodos) return ListaPeriodos.class.getName();
		if (sep instanceof ListaCursos) return ListaCursos.class.getName();
		return ListaDepartamentos.class.getName();
	}
	
	private static int id = 1;
	private int generateId() {
		return id++;
	}
	
	private void arrumaParameters() {
		String parameters = (String) fsa.readTextFile("server/app/config/parameters.yml");
		parameters = replacePlaceholder(parameters, "disciplinas_visibility", "true");
		parameters = replacePlaceholder(parameters, "disciplinas_label", app.getSecaoDisciplinas().getNome());
		fsa.generateFile("server/app/config/parameters.yml", parameters);
		fsa.generateFile("server/app/config/parameters.yml.dist", parameters);
	}
	
	private void geraListaIndex(Map<String,Object> arvore) {
		String fonte = (String) fsa.readTextFile("server/src/AceBundle/Resources/views/Disciplinas/index.html.twig");
		fonte = replacePlaceholder(fonte, "disciplinas_html_twig", htmlLista(arvore));
		fsa.generateFile("server/src/AceBundle/Resources/views/Disciplinas/index.html.twig", fonte);
	}
	
	@SuppressWarnings("unchecked")
	private String htmlLista(Map<String,Object> arvore) {
		String html = "";
		//caso de ser direto disciplinas
		if (arvore.containsKey("id")) {
			return linkHtml(arvore);
		}
		
		html += "<span class=\"tipo\">"+arvore.get("tipo")+"</span>\n";
		html +="<ul>\n";
		html += liHtml((List<Map<String,Object>>)arvore.get("lista"));
		html += "</ul>\n";
		return html;
	}
	
	private String linkHtml (Map<String, Object> arvore) {
		String html = "<a class=\"titulo\" href=\"{{ path('disciplinas_lista', {'id': ";
		html += arvore.get("id");
		html += "}) }} \">";
		html += arvore.get("nome");
		html += "</a>";
		return html;
	}
	
	@SuppressWarnings("unchecked")
	private String liHtml (List<Map<String, Object>> lista) {
		String html = "";
		for (Iterator<Map<String, Object>> iter = lista.iterator(); iter.hasNext();) {
			Map<String, Object> map = iter.next();
			html += "<li>\n";
			if (map.containsKey("id")) {
				html += linkHtml(map);
			} else {
				html += "<span class=\"titulo\">"+map.get("nome")+"</span>\n";
				html += "<span class=\"tipo\">"+map.get("tipo")+"</span>\n";
				html += "<ul>\n";
				html += liHtml((List<Map<String,Object>>)map.get("lista"));
				html += "</ul>\n";
			}
			html += "</li>\n";
		}
		return html;
	}

	private void geraRepository() {
		String repo = (String) fsa.readTextFile("server/src/AceBundle/Repository/DisciplinaRepository.php");
		String cases = "";
		for (Iterator<Map<String, Object>> iterator = listas.iterator(); iterator.hasNext();) {
			Map<String, Object> map = iterator.next();
			cases += "case " + map.get("id").toString() + ":\n";
			cases += "$title = '" + map.get("title").toString() + "'; break;\n";
		}
		repo = replacePlaceholder(repo, "title_cases", cases);
		fsa.generateFile("server/src/AceBundle/Repository/DisciplinaRepository.php", repo);
	}
}
