package lu.ses.engineering.spell.taskflow.digraph

import lu.ses.engineering.spell.controlflow.spell.Goto
import org.eclipse.xtext.util.Strings

class DiGraphEdge {
	private DiGraphNode<?> first;
	private DiGraphNode<?> second;
	private boolean bothDir;
	private boolean constraining = true;
	new(DiGraphNode<?> first,DiGraphNode<?> second,boolean bothDir) {
		this.first = first
		this.second = second
		this.bothDir = bothDir
		this.first.outgoing.add(this)
		this.second.incoming.add(this)
		
	}
	
	new(DiGraphNode<?> first,DiGraphNode<?> second,boolean bothDir,boolean skipUpdate) {
		this.first = first
		this.second = second
		this.bothDir = bothDir
		if (!skipUpdate){
			this.first.outgoing.add(this)
			this.second.incoming.add(this)
		}
	}

	def delete(){
		this.first.outgoing.remove(this)
		this.second.incoming.remove(this)
	}

	def reverse(){
		return new DiGraphEdge(second,first,bothDir,true);
	}
	def isBothDir(){
		return bothDir;
	}
	
	def setConstraining(boolean cons){
		this.constraining = true;
		return this;
	}
	def isConstrainingGoto(){
		if (!this.second.outgoing.isEmpty){
			var incoming = (this.second.outgoing.iterator.next as DiGraphEdge).second.incoming
			if (incoming.length > 1){
				return "false";
			} else {
				return "true"
			}
		}
		return "true"
	}
	def String generateDotEdge(){
		if (second.isGoto() && (second.node as Goto).target != null){

			val newSecond = second.diGraph.createReferredReferenceNode((second.node as Goto).target)
			return '''	"«first.generateDotUniqueName»" -> "«newSecond.generateDotUniqueName»" [id="«first.startLine» «second.startLine»" style="dashed" constraint=«isConstrainingGoto()» xlabel="«second.generateDotName.wrap»" tooltip="«generateTooltip.wrap»"]'''
		}
		if (first.isGoto() && (first.node as Goto).target != null){
			return ""
		}
		
		
		if (bothDir)
			return '''	"«first.generateDotUniqueName»" -> "«second.generateDotUniqueName»" [id="«first.startLine» «second.startLine»" dir=both «IF !constraining»constraint=false «ENDIF»tooltip="«generateTooltip.wrap»"]'''
			
		return '''	"«first.generateDotUniqueName»" -> "«second.generateDotUniqueName»" [id="«first.startLine» «second.startLine»" «IF !constraining»constraint=false «ENDIF»tooltip="«generateTooltip.wrap»"]'''
	}
	def wrap(String text){
		return Strings.wordWrap(text.replace("\n", "\\\\n") , 60).postProcess()
	}
	def postProcess(String in){
		//System.out.println();
		return in.replaceAll("([|\"'])", "")
	}
	def generateTooltip(){
		return '''"«first.generateDotName»" &amp;#8594; "«second.generateDotName»"'''
	}
	
	override boolean equals(Object eq){
		if (!(eq instanceof DiGraphEdge))
			return false;
		val second = eq as DiGraphEdge
		return first.equals(second.first) && 
				this.second.equals(second.second) && 
				bothDir == second.bothDir;
	}
	override int hashCode(){
		return first.hashCode * 31 + second.hashCode;
	}
	override toString(){
		return generateTooltip;
	}
	
	def getFirstNode(){
		return first
	}
	def getSecondNode(){
		return second
	}
	def setBothDir(boolean value){
		bothDir = value
	}
	
}