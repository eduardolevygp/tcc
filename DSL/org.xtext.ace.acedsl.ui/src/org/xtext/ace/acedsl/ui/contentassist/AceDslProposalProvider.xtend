/*
 * generated by Xtext 2.9.2
 */
package org.xtext.ace.acedsl.ui.contentassist

import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import org.eclipse.swt.widgets.ColorDialog
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.ui.editor.contentassist.ReplacementTextApplier

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class AceDslProposalProvider extends AbstractAceDslProposalProvider {
	
	override complete_Cor(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		
		val ConfigurableCompletionProposal colorProposal =  createCompletionProposal("Escolher cor...", context) as ConfigurableCompletionProposal;
		colorProposal.textApplier = new ReplacementTextApplier() {
			
			override getActualReplacementString(ConfigurableCompletionProposal proposal) {
				val ColorDialog dialog = new ColorDialog(Display.getDefault().getActiveShell());
				val RGB color = dialog.open();
				return "\"#" + toHexTwoDigits(color.red) + toHexTwoDigits(color.green) + toHexTwoDigits(color.blue) + "\"";
			}
			
		}
		
		acceptor.accept(colorProposal);
		
		super.complete_Cor(model, ruleCall, context, acceptor);
				
	}
	
	def String toHexTwoDigits(int number) {
		var String hex = Integer.toHexString(number).toUpperCase();
		if (hex.length == 1) {
			hex = "0" + hex;
		}
		return hex;
	
	}	
	
	
	override complete_Logo(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		
		val ConfigurableCompletionProposal fileProposal = createCompletionProposal("Escolher arquivo...", context) as ConfigurableCompletionProposal;
		fileProposal.textApplier = new ReplacementTextApplier() {
			
			override getActualReplacementString(ConfigurableCompletionProposal proposal) {
				
				val FileDialog fileDialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.OPEN);
				
				val List<String> extensions = newArrayList("*.gif; *.jpg; *.jpeg; *.png");
				val List<String> filterNames = newArrayList("Imagem (gif, jpg, jpeg, png)");
				fileDialog.setFilterExtensions(extensions);
				fileDialog.setFilterNames(filterNames);
				
				var String path = fileDialog.open().replace('\\', '/');
				if (path == null) {
					path = "";
				}
				return "\"" + path + "\"";
			}
			
		}		
		
		acceptor.accept(fileProposal);
		super.complete_Logo(model, ruleCall, context, acceptor);
	}
	
}
