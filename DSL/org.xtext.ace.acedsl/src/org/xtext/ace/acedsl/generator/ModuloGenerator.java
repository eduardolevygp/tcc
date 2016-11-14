package org.xtext.ace.acedsl.generator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.xtext.ace.acedsl.acedsl.Aplicativo;

public abstract class ModuloGenerator {

	protected Aplicativo app;
	protected IFileSystemAccess2 fsa;

	protected static String androidJava = "android/app/src/main/java/com/example/tcc/tccemptyapp/";
	protected static String androidRes = "android/app/src/main/res/";
	protected static String serverViews = "server/src/AceBundle/Resources/views/";
	protected static String serverBundle = "server/src/AceBundle/";
	protected static String serverConfig = "server/app/config/";
	
	
	public ModuloGenerator(Aplicativo app, IFileSystemAccess2 fsa) {
		this.app = app;
		this.fsa = fsa;
	}

	protected String replacePlaceholder(String fonte, String placeholderLabel, String newText) {
		return (String) fonte.replace("@@@"+placeholderLabel+"@@@", newText);
	}
	
	protected String replaceAllPlaceholder(String fonte, String placeholderLabel, String newText) {
		return (String) fonte.replaceAll("@@@"+placeholderLabel+"@@@", newText);
	}
	
	protected void limpaArquivo(String arquivo, String... placeholders) {
		String fonte = (String) fsa.readTextFile(arquivo);
		for (int i = 0; i < placeholders.length; i++) {
			fonte = replaceAllPlaceholder(fonte, placeholders[i], "");
		}
		fsa.generateFile(arquivo, fonte);
	}
	
	protected String replacePlaceholders(String fonte, Map<String, String> valores) {
		Iterator<Entry<String, String>> iter = valores.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, String> par = iter.next();
			fonte = replacePlaceholder(fonte, par.getKey(), par.getValue());
		}
		return fonte;
	}
	
	protected void replaceInFile(String arquivo, String placeholderLabel, String newText) {
		String fonte = (String) fsa.readTextFile(arquivo);
		fonte = replacePlaceholder(fonte, placeholderLabel, newText);
		fsa.generateFile(arquivo, fonte);
	}
	
	protected void replaceInFile (String arquivo, Map<String,String> valores) {
		String fonte = (String) fsa.readTextFile(arquivo);
		fonte = replacePlaceholders(fonte, valores);
		fsa.generateFile(arquivo, fonte);
	}
	
	protected void replaceAllInFile (String arquivo, Map<String,String> valores) {
		String fonte = (String) fsa.readTextFile(arquivo);
		fonte = replaceAllPlaceholders(fonte, valores);
		fsa.generateFile(arquivo, fonte);
	}
	
	protected void replaceAllInfile (String arquivo, String placeholder, String valor) {
		Map<String,String> valores = new HashMap<>();
		valores.put(placeholder, valor);
		replaceAllInFile(arquivo, valores);
	}
	
	protected String replaceAllPlaceholders(String fonte, Map<String, String> valores) {
		Iterator<Entry<String, String>> iter = valores.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, String> par = iter.next();
			fonte = replaceAllPlaceholder(fonte, par.getKey(), par.getValue());
		}
		return fonte;
	}
}
