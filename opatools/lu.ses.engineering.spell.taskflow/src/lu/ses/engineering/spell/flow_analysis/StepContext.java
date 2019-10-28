package lu.ses.engineering.spell.flow_analysis;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import lu.ses.engineering.spell.controlflow.spell.SpellElement;
import lu.ses.engineering.spell.taskflow.digraph.DiGraph;
import lu.ses.engineering.spell.taskflow.digraph.DiGraphComment;
import lu.ses.engineering.spell.taskflow.digraph.DiGraphNode;

public class StepContext implements Iterable<DiGraphNode<?>> {

	private HashSet<DiGraphNode<?>> id = new HashSet<DiGraphNode<?>>();
	private HashMap<DiGraphNode<?>,Boolean> handled = new HashMap<DiGraphNode<?>, Boolean>();
	private ArrayDeque<StepContext> delayedContexts;
	private LinkedHashSet<DiGraphComment> annotations ;
	private DiGraph diGraph;
	private boolean deadEnd = false;
	
	public StepContext(DiGraphNode<?> node,StepContext parent) {
		this.diGraph = node.getDiGraph();
		if (parent == null)
			this.delayedContexts = new ArrayDeque<StepContext>();
		else
			this.delayedContexts = new ArrayDeque<StepContext>(parent.delayedContexts);
		if (parent != null)
			this.deadEnd = parent.deadEnd;
		this.annotations = new LinkedHashSet<>();
		this.id.add(node);
	}
	public StepContext(StepContext context) {
		this.delayedContexts = new ArrayDeque<StepContext>(context.delayedContexts);
		this.deadEnd = context.deadEnd;
		this.annotations = new LinkedHashSet<>(context.annotations);
		this.id.addAll(context.id);
	}
	public StepContext joinContext(StepContext last) {
		StepContext merge = new StepContext(this);
		merge.handled.putAll(handled);
		merge.handled.putAll(last.handled);
		merge.id.addAll(last.id);
		
		if (merge.annotations != last.getAnnotations())
			merge.annotations.addAll(last.getAnnotations());
		return merge;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		Iterator<DiGraphNode<?>> iterator = id.iterator();
		while(iterator.hasNext()){
			DiGraphNode<?> node = iterator.next();
			result = prime * result + ((node == null) ? 0 : node.hashCode());
		}
		
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StepContext other = (StepContext) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	public DiGraphNode<?> getName() {
		if (id.isEmpty())
			return new DiGraphNode<SpellElement>(diGraph,null);
		return id.iterator().next();
	}

	@Override
	public Iterator<DiGraphNode<?>> iterator() {
		// TODO Auto-generated method stub
		return id.iterator();
	}
	
	public boolean hasBeenHandled(DiGraphNode<?> name){
		Boolean boolean1 = handled.get(name);
		if (boolean1 == null)
			return false;
		else
			return boolean1;
	}
	
	public void setHandled(DiGraphNode<?> name){
		handled.put(name, true);
	}
	
	public HashSet<DiGraphNode<?>> getId() {
		return id;
	}
	public void addDelayedContext(StepContext currentContext) {
		delayedContexts.add(currentContext);
		
	}
	public ArrayDeque<StepContext> getDelayedContexts() {
		return delayedContexts;
	}
	public void setDelayedContexts(ArrayDeque<StepContext> delayedContexts) {
		if (delayedContexts == this.delayedContexts)
			return;
		if (this.delayedContexts.isEmpty())
			this.delayedContexts = new ArrayDeque<StepContext>(delayedContexts);
		else
			this.delayedContexts.addAll(delayedContexts);
	}
	
	public void setDeadEnd(boolean deadEnd){
		this.deadEnd = deadEnd;
	}
	public boolean isDeadEnd(){
		return deadEnd;
	}
	public LinkedHashSet<DiGraphComment> getAnnotations() {
		return annotations;
	}
	public void setAnnotations(LinkedHashSet<DiGraphComment> annotations) {
		this.annotations = annotations;
	}
	@Override
	public String toString(){
		return "<current Steps " + id.toString() + ">";
		
	}
}
