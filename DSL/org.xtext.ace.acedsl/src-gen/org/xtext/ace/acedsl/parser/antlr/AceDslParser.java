/*
 * generated by Xtext 2.9.2
 */
package org.xtext.ace.acedsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.ace.acedsl.parser.antlr.internal.InternalAceDslParser;
import org.xtext.ace.acedsl.services.AceDslGrammarAccess;

public class AceDslParser extends AbstractAntlrParser {

	@Inject
	private AceDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAceDslParser createParser(XtextTokenStream stream) {
		return new InternalAceDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Aplicativo";
	}

	public AceDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AceDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
