/*
 * generated by Xtext 2.9.2
 */
package org.xtext.ace.acedsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AceDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/ace/acedsl/parser/antlr/internal/InternalAceDsl.tokens");
	}
}