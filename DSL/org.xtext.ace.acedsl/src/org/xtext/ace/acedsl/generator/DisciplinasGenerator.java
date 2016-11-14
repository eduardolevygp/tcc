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
			replaceInFile(androidRes + "menu/activity_main_drawer.xml", "disciplines_visible", "true");
			stringsXml();
			mainFragment(arvore);
			if (arvore.containsKey("id")) {
				fsa.deleteFile(androidJava + "models/courseInfo/CourseInfoStructure.java");
				fsa.deleteFile(androidJava + "fragments/courseInfo/DepartmentsFragment.java");
			} else {
				courseInfoStructure(arvore);
			}
		}
		
		id = 1;
	}
	
	private static List<Map<String,Object>> listas = new ArrayList<>();

	private void limpaArquivos() {
		//server
		Map<String,String> parameterValues = new HashMap<>();
		parameterValues.put("disciplinas_visibility", "false");
		parameterValues.put("disciplinas_label", "");
		replaceInFile(serverConfig + "parameters.yml", parameterValues);
		replaceInFile(serverConfig + "parameters.yml.dist", parameterValues);
		
		fsa.deleteFile(serverBundle + "Controller/DisciplinasController.php");
		fsa.deleteFile(serverBundle + "Entity/Disciplina.php");
		fsa.deleteFile(serverBundle + "Form/DisciplinaType.php");
		fsa.deleteFile(serverBundle + "Repository/DisciplinaRepository.php");
		fsa.deleteFile(serverViews + "Disciplinas/index.html.twig");
		fsa.deleteFile(serverViews + "Disciplinas/lista.html.twig");
		fsa.deleteFile(serverViews + "Disciplinas/nova.html.twig");
		
		
		//app
		limpaArquivo(androidRes + "values/strings.xml", "disciplinas_strings", "disciplinas_title");
		fsa.deleteFile(androidJava + "adapters/courseInfo/CourseInfoAdapter.java");
		fsa.deleteFile(androidJava + "adapters/courseInfo/CoursesAdapter.java");
		fsa.deleteFile(androidJava + "adapters/courseInfo/CoursesListener.java");
		fsa.deleteFile(androidJava + "adapters/courseInfo/DepartmentsAdapter.java");
		fsa.deleteFile(androidJava + "adapters/courseInfo/DepartmentsListener.java");
		fsa.deleteFile(androidJava + "adapters/courseInfo/PeriodsAdapter.java");
		fsa.deleteFile(androidJava + "adapters/courseInfo/PeriodsListener.java");
		fsa.deleteFile(androidJava + "adapters/courseInfo/ProgramsAdapter.java");
		fsa.deleteFile(androidJava + "adapters/courseInfo/ProgramsListener.java");
		fsa.deleteFile(androidJava + "components/CourseInfoViewHolder.java");
		fsa.deleteFile(androidJava + "fragments/courseInfo/CourseDetailsFragment.java");
		fsa.deleteFile(androidJava + "fragments/courseInfo/CourseInfoFragment.java");
		fsa.deleteFile(androidJava + "fragments/courseInfo/CoursesFragment.java");
		fsa.deleteFile(androidJava + "fragments/courseInfo/DepartmentsFragment.java");
		fsa.deleteFile(androidJava + "fragments/courseInfo/PeriodsFragment.java");
		fsa.deleteFile(androidJava + "fragments/courseInfo/ProgramsFragment.java");
		fsa.deleteFile(androidJava + "models/courseInfo/Course.java");
		fsa.deleteFile(androidJava + "models/courseInfo/CourseDetail.java");
		fsa.deleteFile(androidJava + "models/courseInfo/CourseInfo.java");
		fsa.deleteFile(androidJava + "models/courseInfo/CourseInfoStructure.java");
		fsa.deleteFile(androidJava + "models/courseInfo/Department.java");
		fsa.deleteFile(androidJava + "models/courseInfo/Period.java");
		fsa.deleteFile(androidJava + "models/courseInfo/Program.java");
		fsa.deleteFile(androidJava + "providers/courseInfo/CourseDetailResponse.java");
		fsa.deleteFile(androidJava + "providers/courseInfo/CourseInfoProvider.java");
		fsa.deleteFile(androidJava + "providers/courseInfo/CourseListResponse.java");
		
		fsa.deleteFile(androidRes + "layout/card_view_course_info.xml");
		fsa.deleteFile(androidRes + "layout/fragment_course_details.xml");
		fsa.deleteFile(androidRes + "layout/fragment_course_info.xml");
		
		replaceInFile(androidRes + "menu/activity_main_drawer.xml", "disciplines_visible", "false");
		
		Map<String,String> mainFragReplace = new HashMap<>();
		mainFragReplace.put("import_disciplinas_fragment", "");
		mainFragReplace.put("disciplinas_construtor", "null");
		
		replaceInFile(androidJava + "MainActivity.java", mainFragReplace);
	}
	
	private void stringsXml () {
		String replacement = "";
		replacement += "    <string name=\"fragment_departments\">Escolha o departamento</string>\n";
		replacement += "    <string name=\"fragment_programs\">Escolha o curso</string>\n";
		replacement += "    <string name=\"fragment_period\">Escolha o período</string>\n";
		replacement += "    <string name=\"fragment_course\">Escolha a disciplina</string>\n";
		replacement += "    <string name=\"fragment_course_details\">Disciplina</string>";
		
		Map<String, String> reps = new HashMap<>();
		reps.put("disciplinas_strings", replacement);
		reps.put("disciplinas_title", app.getSecaoDisciplinas().getNome());
		
		replaceAllInFile(androidRes + "values/strings.xml", reps);
	}
	
	private void mainFragment(Map<String,Object> arvore) {
		String constructor = "";
		String importa = "import com.example.tcc.tccemptyapp.fragments.courseInfo.";
		String classe = (String) arvore.get("classe");
		if (classe == ListaDisciplinas.class.getName()) {
			importa += "CoursesFragment";
			constructor = "CoursesFragment.newInstance(" + arvore.get("id").toString() +")";
		} else if (classe == ListaPeriodos.class.getName()) {
			importa += "PeriodsFragment";
			constructor = "new PeriodsFragment()";
		} else if (classe == ListaCursos.class.getName()) {
			importa += "ProgramsFragment";
			constructor = "new ProgramsFragment()";
		} else {
			importa += "DepartmentsFragment";
			constructor = "new DepartmentsFragment()";
		}
		Map<String, String> replacements = new HashMap<>();
		replacements.put("import_disciplinas_fragment", importa + ";");
		replacements.put("disciplinas_construtor", constructor);
		
		replaceInFile(androidJava + "MainActivity.java", replacements);
	}
	
	@SuppressWarnings("unchecked")
	private void courseInfoStructure (Map<String,Object> arvore) {
		String classeApp = classeAppModel(arvore.get("classe").toString());
		String listaNome = classeApp.toLowerCase() + "List";
		String getterLista = "get" + classeApp + "List";

		String createStructure = "List<" + classeApp + "> baseList = new ArrayList<>();\n";
		
		for (Map<String, Object> map : (List<Map<String,Object>>) arvore.get("lista")) {
			if (map.containsKey("id")) {
				createStructure += "baseList.add(new " + classeApp + "(\""+map.get("nome").toString()+"\", "+map.get("id").toString()+""+"));\n";  
			} else {
//				createStructure += "{\n";
//				String modelName = classeApp.toLowerCase();
//				createStructure += classeApp + " "+ modelName +" = new " + classeApp + "(\""+map.get("nome").toString()+"\");\n";
//				String subClasse = classeAppModel(map.get("classe").toString());
//				String subNameList = subClasse.toLowerCase() + "s";
//				createStructure += "List<" + subClasse + "> " +  subNameList + " = new ArrayList<>();\n";
//				for (Map<String, Object> subMap : (List<Map<String,Object>>) map.get("lista")) {
//					if (subMap.containsKey("id")) {
//						createStructure += subNameList + ".add(new " + subClasse + "(\"" +subMap.get("nome").toString()+ "\", " + subMap.get("id").toString() + "));\n";
//					} else {
//						
//					}
//				}
//				createStructure += modelName += ".set" + subClasse + "List(" + subNameList + ");\n";
//				createStructure += "baseList.add("+modelName+");\n";
//				createStructure += "}\n";
				createStructure += subStructureInfo(map, "baseList", classeApp);
			}
		}
		
		createStructure += "return baseList;\n";
		
		Map<String, String> subs = new HashMap<>();
		subs.put("classe_app", classeApp);
		subs.put("lista_nome", listaNome);
		subs.put("getter_lista", getterLista);
		subs.put("create_structure", createStructure);
		replaceAllInFile(androidJava + "models/courseInfo/CourseInfoStructure.java", subs);
	}
	
	@SuppressWarnings("unchecked")
	private String subStructureInfo (Map<String,Object> map, String baseListName, String classeApp) {
		String createStructure = "";
		createStructure += "{\n";
		String modelName = classeApp.toLowerCase();
		createStructure += classeApp + " "+ modelName +" = new " + classeApp + "(\""+map.get("nome").toString()+"\");\n";
		String subClasse = classeAppModel(map.get("classe").toString());
		String subNameList = subClasse.toLowerCase() + "s";
		createStructure += "List<" + subClasse + "> " +  subNameList + " = new ArrayList<>();\n";
		for (Map<String, Object> subMap : (List<Map<String,Object>>) map.get("lista")) {
			if (subMap.containsKey("id")) {
				createStructure += subNameList + ".add(new " + subClasse + "(\"" +subMap.get("nome").toString()+ "\", " + subMap.get("id").toString() + "));\n";
			} else {
				createStructure += subStructureInfo(subMap, subNameList, subClasse);
			}
		}
		createStructure += modelName + ".set" + subClasse + "List(" + subNameList + ");\n";
		createStructure += baseListName+".add("+modelName+");\n";
		createStructure += "}\n";
		return createStructure;
	}
	
	private String classeAppModel(String classeGenerator) {
		if (classeGenerator == ListaDepartamentos.class.getName()) {
			return "Department";
		} else if (classeGenerator == ListaCursos.class.getName()) {
			return "Program";
		} else {
			return "Period";
		}
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
		String parameters = (String) fsa.readTextFile(serverConfig + "parameters.yml");
		parameters = replacePlaceholder(parameters, "disciplinas_visibility", "true");
		parameters = replacePlaceholder(parameters, "disciplinas_label", app.getSecaoDisciplinas().getNome());
		fsa.generateFile(serverConfig + "parameters.yml", parameters);
		fsa.generateFile(serverConfig + "parameters.yml.dist", parameters);
	}
	
	private void geraListaIndex(Map<String,Object> arvore) {
		replaceInFile(serverViews + "Disciplinas/index.html.twig", "disciplinas_html_twig", htmlLista(arvore));
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
		String cases = "";
		for (Iterator<Map<String, Object>> iterator = listas.iterator(); iterator.hasNext();) {
			Map<String, Object> map = iterator.next();
			cases += "case " + map.get("id").toString() + ":\n";
			cases += "$title = '" + map.get("title").toString() + "'; break;\n";
		}
		
		replaceInFile(serverBundle + "Repository/DisciplinaRepository.php", "title_cases", cases);
	}
}
