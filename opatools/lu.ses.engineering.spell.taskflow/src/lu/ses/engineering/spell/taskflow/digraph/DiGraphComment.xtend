package lu.ses.engineering.spell.taskflow.digraph

import lu.ses.engineering.spell.controlflow.spell.SpellElement
import lu.ses.engineering.spell.controlflow.spell.else_if_stmt
import lu.ses.engineering.spell.controlflow.spell.for_stmt
import lu.ses.engineering.spell.controlflow.spell.if_stmt
import lu.ses.engineering.spell.controlflow.spell.while_stmt
import lu.ses.engineering.spell.flow_analysis.PythonHandler

class DiGraphComment extends DiGraphNode<SpellElement>{
	
	protected String cond
	
	String prefix
	
	new(DiGraph graph, SpellElement node) {
		super(graph, node)
		this.cond = node.getCode();
		this.prefix = ''
		graph.annotations.add(this)
	}
	new(DiGraph graph, SpellElement node,String prefix) {
		super(graph, node)
		this.prefix = prefix
		this.cond = node.getCode();
		
		graph.annotations.add(this)
	}
	new(DiGraph graph, String cond) {
		super(graph,null)
		this.cond = cond;
		this.prefix = ''
		graph.annotations.add(this)
	}
	
	def setPrefix(String prefix){
		this.prefix = prefix;
	}
	
	
	def static boolean isValid(String str,PythonHandler handler){
		val origin = handler.locals.get(str);
		return origin != null && str != null && str.contains("Prompt") 
	}
	
	
	override equals(Object other){
		if (!(other instanceof DiGraphComment))
			return false;
		return other.hashCode() == this.hashCode();
	}
	
	override hashCode(){
		return generateTooltip().hashCode()
	}
	
	override String generateDotDecl(){
		if (dotDecl.isEmpty()){
			//dotDecl = generateDotDecl(this.node)
		}
		return dotDecl
	}
	
	override String generateDotName(){
		if (dotName.isEmpty()){
			//dotName = generateDotName(this.node)
		}
		return dotName
	}
	override generateDotUniqueName(){
		if (dotUniqueName.isEmpty()){
			//dotUniqueName = generateDotUniqueName(this.node)
		}
		
		return dotUniqueName
	}
	def String generateContextDescription(){
		if (this.node == null)
			return ''
		else
			return generateContextDescription(this.node)
	}
	private def dispatch String generateContextDescription(SpellElement element){
		if (element.eContainer() == null){
			return ''
		} else {
			return generateContextDescription(element.eContainer() as SpellElement)
		}
	}
	private def dispatch String generateContextDescription(for_stmt for_s){
		return 'for '
	} 
	private def dispatch String generateContextDescription(while_stmt while_s){
		return 'while '
	} 
	private def dispatch String generateContextDescription(if_stmt if_s){
		return 'if '
	} 
	private def dispatch String generateContextDescription(else_if_stmt if_s){
		return 'elif '
	} 
	def generateTooltip(){
		return '''«generateContextDescription»«this.prefix»«this.cond.replaceAll("\n","<br/>")»«IF this.node != null»: «IF prefix != null && !prefix.isEmpty()»and «ELSE»...«ENDIF»«ENDIF»'''
	}
}