package lu.ses.engineering.spell.controlflow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultCommentAssociater;
import org.eclipse.xtext.parsetree.reconstr.impl.NodeIterator;
import org.eclipse.xtext.parsetree.reconstr.impl.TokenUtil;
import org.eclipse.xtext.util.ITextRegionWithLineInformation;
import org.eclipse.xtext.util.Pair;

import com.google.inject.Inject;

public class SpellCommentAssociater extends DefaultCommentAssociater {

	@Inject
	protected TokenUtil tokenUtil;
	@Override
	public Map<ILeafNode, EObject> associateCommentsWithSemanticEObjects(EObject model, Set<ICompositeNode> roots) {
		Map<ILeafNode, EObject> mapping = new HashMap<ILeafNode, EObject>();
		for (ICompositeNode rootNode : roots)
			associateCommentsWithSemanticEObjects(mapping, rootNode);
		return mapping;
	}
	public boolean isCommentNode(INode node) {
		if (node instanceof ILeafNode && ((ILeafNode) node).isHidden()
				&& node.getGrammarElement() instanceof AbstractRule)
			return isComment((AbstractRule) node.getGrammarElement());
		return false;
	}
	
	
	private boolean isComment(AbstractRule rule) {
		// TODO Auto-generated method stub WS
		return rule != null && ("WS".equals(rule.getName()) || "ML_COMMENT".equals(rule.getName()) || "SL_COMMENT".equals(rule.getName()));
	}
	
	/**
	 * This implementation associates each comment with the next following semantic token's EObject, except for the
	 * case, where a line of the document end by a semantic element followed by a comment. Then, the the comment is
	 * associated with this preceding semantic token.
	 */
	@Override
	protected void associateCommentsWithSemanticEObjects(Map<ILeafNode, EObject> mapping, ICompositeNode rootNode) {
		//		System.out.println(EmfFormatter.objToStr(rootNode));
		EObject currentEObject = null;
		List<ILeafNode> currentComments = new ArrayList<ILeafNode>();

		NodeIterator nodeIterator = new NodeIterator(rootNode);
		// rewind to previous token with token owner 
		while (nodeIterator.hasPrevious() && currentEObject == null) {
			INode node = nodeIterator.previous();
			if (tokenUtil.isToken(node)) {
				currentEObject = tokenUtil.getTokenOwner(node);
			}
		}
		while (nodeIterator.hasNext()) {
			INode node = nodeIterator.next();
			if (isCommentNode(node)) {
				currentComments.add((ILeafNode) node);
			}
			boolean isToken = tokenUtil.isToken(node);
			if ((node instanceof ILeafNode || isToken) && currentEObject != null) {
				ITextRegionWithLineInformation textRegion = node.getTextRegionWithLineInformation();
				if (textRegion.getLineNumber() != textRegion.getEndLineNumber()) {
					// found a newline -> associating existing comments with currentEObject
					addMapping(mapping, currentComments, currentEObject);
					currentEObject = null;
				}
			}
			if (isToken) {
				Pair<List<ILeafNode>, List<ILeafNode>> leadingAndTrailingHiddenTokens = tokenUtil
						.getLeadingAndTrailingHiddenTokens(node);
				for (ILeafNode leadingHiddenNode : leadingAndTrailingHiddenTokens.getFirst()) {
					if (isCommentNode(leadingHiddenNode)) {
						currentComments.add(leadingHiddenNode);
					}
				}
				nodeIterator.prune();
				currentEObject = tokenUtil.getTokenOwner(node);
				if (currentEObject != null) {
					addMapping(mapping, currentComments, currentEObject);
					if (node.getOffset() > rootNode.getEndOffset()) {
						// found next EObject outside rootNode
						break;
					}
				}
			}
		}
		if (!currentComments.isEmpty()) {
			if (currentEObject != null) {
				addMapping(mapping, currentComments, currentEObject);
			} else {
				EObject objectForRemainingComments = getEObjectForRemainingComments(rootNode);
				if (objectForRemainingComments != null) {
					addMapping(mapping, currentComments, objectForRemainingComments);
				}
			}
		}
	}
	@Override
	protected void addMapping(Map<ILeafNode, EObject> mapping, List<ILeafNode> currentComments, EObject currentEObject) {
		for (ILeafNode l : currentComments)
			mapping.put(l, currentEObject);
		currentComments.clear();
	}
	@Override
	protected EObject getEObjectForRemainingComments(ICompositeNode rootNode) {
		TreeIterator<INode> i = rootNode.getAsTreeIterable().iterator();
		while (i.hasNext()) {
			INode o = i.next();
			if (o.hasDirectSemanticElement())
				return o.getSemanticElement();
		}
		return null;
	}
}
