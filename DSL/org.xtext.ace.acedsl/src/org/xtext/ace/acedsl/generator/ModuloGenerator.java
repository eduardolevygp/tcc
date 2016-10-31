package org.xtext.ace.acedsl.generator;

import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.xtext.ace.acedsl.acedsl.Aplicativo;

public abstract class ModuloGenerator {

	protected Aplicativo app;
	protected IFileSystemAccess2 fsa;

	public ModuloGenerator(Aplicativo app, IFileSystemAccess2 fsa) {
		this.app = app;
		this.fsa = fsa;
	}

	protected String replacePlaceholder(String fonte, String placeholderLabel, String newText) {
		return (String) fonte.replace("@@@"+placeholderLabel+"@@@", newText);
	}
}
