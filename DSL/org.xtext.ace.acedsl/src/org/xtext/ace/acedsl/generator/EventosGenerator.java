package org.xtext.ace.acedsl.generator;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.xtext.ace.acedsl.acedsl.Aplicativo;

public class EventosGenerator extends ModuloGenerator {

	public EventosGenerator(Aplicativo app, IFileSystemAccess2 fsa) {
		super(app, fsa);
	}

	public void generate() {
		if (app.getSecaoEventos() == null) {
			limpaArquivosApp();
			limpaArquivosServer();
		} else {
			geraArquivosApp();
			geraArquivosServer();
		}
	}
	
	private void limpaArquivosApp() {
		fsa.deleteFile(androidJava + "adapters/events/EventsAdapter.java");
		fsa.deleteFile(androidJava + "adapters/events/EventsListener.java");
		fsa.deleteFile(androidJava + "fragments/events/EventsFragment.java");
		fsa.deleteFile(androidJava + "fragments/events/EventDetailsFragment.java");
		fsa.deleteFile(androidJava + "models/Event.java");
		fsa.deleteFile(androidJava + "providers/events/EventDetailsResponse.java");
		fsa.deleteFile(androidJava + "providers/events/EventsProvider.java");
		fsa.deleteFile(androidJava + "providers/events/EventsResponse.java");
		fsa.deleteFile(androidRes + "layout/fragment_events.xml");
		fsa.deleteFile(androidRes + "layout/fragment_event_detail.xml");
		fsa.deleteFile(androidRes + "layout/card_view_event.xml");
		
		Map<String,String> mainActReps = new HashMap<>();
		mainActReps.put("import_events_fragment", "");
		mainActReps.put("events_constructor", "null");
		
		replaceInFile(androidJava + "MainActivity.java", mainActReps);
		
		limpaArquivo(androidRes + "values/strings.xml", "events_title");
		
		replaceInFile(androidRes + "menu/activity_main_drawer.xml", "events_visible", "false");
	}
	
	private void limpaArquivosServer() {
		Map<String,String> paramsReps = new HashMap<>();
		paramsReps.put("eventos_visibility", "false");
		paramsReps.put("eventos_label", "");
		replaceInFile(serverConfig + "parameters.yml" , paramsReps);
		replaceInFile(serverConfig + "parameters.yml.dist" , paramsReps);
		
		fsa.deleteFile(serverBundle + "Controller/EventoController.php");
		fsa.deleteFile(serverBundle + "Entity/Evento.php");
		fsa.deleteFile(serverBundle + "Form/EventoType.php");
		fsa.deleteFile(serverBundle + "Repository/EventoRepository.php");
		fsa.deleteFile(serverViews + "Evento/editar.html.twig");
		fsa.deleteFile(serverViews + "Evento/index.html.twig");
		fsa.deleteFile(serverViews + "Evento/novo.html.twig");
	}
	
	private void geraArquivosApp() {
		Map<String,String> mainActReps = new HashMap<>();
		mainActReps.put("import_events_fragment", "import com.example.tcc.tccemptyapp.fragments.events.EventsFragment;");
		mainActReps.put("events_constructor", "new EventsFragment()");
		replaceInFile(androidJava + "MainActivity.java", mainActReps);
		
		replaceAllInfile(androidRes + "values/strings.xml", "events_title", app.getSecaoEventos().getNome());
		
		replaceInFile(androidRes + "menu/activity_main_drawer.xml", "events_visible", "true");
	}
	
	private void geraArquivosServer() {
		Map<String,String> paramsReps = new HashMap<>();
		paramsReps.put("eventos_visibility", "true");
		paramsReps.put("eventos_label", app.getSecaoEventos().getNome());
		replaceInFile(serverConfig + "parameters.yml" , paramsReps);
		replaceInFile(serverConfig + "parameters.yml.dist" , paramsReps);
	}
	
}
