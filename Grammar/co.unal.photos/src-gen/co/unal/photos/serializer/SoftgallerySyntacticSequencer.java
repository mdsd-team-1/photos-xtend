/*
 * generated by Xtext 2.17.1
 */
package co.unal.photos.serializer;

import co.unal.photos.services.SoftgalleryGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SoftgallerySyntacticSequencer extends AbstractSyntacticSequencer {

	protected SoftgalleryGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SoftgalleryGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getReactInformationTypeRule())
			return getReactInformationTypeToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getReactLibraryTypeRule())
			return getReactLibraryTypeToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getReactRequestRule())
			return getReactRequestToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRequestMappingTypeConfRule())
			return getRequestMappingTypeConfToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ReactInformationType:
	 * 'ReactReadme' | 'ReactAditionalInfo';
	 */
	protected String getReactInformationTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ReactReadme";
	}
	
	/**
	 * ReactLibraryType:
	 * 'ReactDesign' | 'ReactRouting' | 'ComponentManagement' |
	 * 'StoreManagement' | 'ReactDeployment' | 'ConfigurationLibrary';
	 */
	protected String getReactLibraryTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ReactDesign";
	}
	
	/**
	 * ReactRequest: 
	 * 'Wrapper' | 'AuxWrapper';
	 */
	protected String getReactRequestToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "Wrapper";
	}
	
	/**
	 * RequestMappingTypeConf:
	 * 'PostMapping' | 'GetMapping' | 'PutMapping' | 'DeleteMapping';
	 */
	protected String getRequestMappingTypeConfToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "PostMapping";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

}
