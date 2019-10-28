package lu.ses.engineering.spell.taskflow.digraph

import lu.ses.engineering.spell.controlflow.spell.SpellElement
import lu.ses.engineering.spell.controlflow.spell.import_from
import lu.ses.engineering.spell.controlflow.spell.import_name
import lu.ses.engineering.spell.flow_analysis.StepContext

class DiGraphProcedureCall<T extends SpellElement> extends DiGraphNode<T>{
	
	private DiGraph diGraph
	
	private String procedureName
	
	private T node
	
	private T origin
	
	StepContext context
	
	new(DiGraph graph,T node,T origin,String procedureName,StepContext context){
		this.diGraph = graph
		this.node = node;
		
		this.diGraph = graph
		this.node = node;
		this.origin = origin;
		this.procedureName = procedureName
		this.context = context
		graph.procedureCalls.add(this)
		
		if (!isUndefined()){
			val currentName = generateDotName()
			duplicate = diGraph.knownNodes.put(generateDotUniqueName(),this as DiGraphNode)
			val targets = diGraph.referedTargets.get(currentName);
			for (target : targets){
				target.node = node as SpellElement
			}
			
			targets.clear()
		}
	}
	
	def setContext(StepContext context){
		this.context = context
	}
	
	override equals(Object other){
		if (!(other instanceof DiGraphProcedureCall<?>))
			return false;
		return other.hashCode() == this.hashCode();
	}
	
	override hashCode(){
		return generateDotUniqueName().hashCode()
	}
	
	def dispatch static boolean isValid(Object element){
		return false
	}
	def dispatch static boolean isValid(import_name element){
		return true
	}
	def dispatch static boolean isValid(import_from element){
		return true
	}
	def dispatch static boolean isValid(String str){
		return "StartProc".equals(str)
	}
	
	override String generateDotUniqueName(){
		return generateDotName + " ###" + this.context.hashCode + "###"
	}
	override String generateDotName(){
		return this.procedureName
	}
	override generateDotDecl(){
		return generateDotDecl(this.node)
	}
	private def dispatch generateDotDecl(SpellElement element){
		return '''		"«generateDotUniqueName»" [label=<«createStartProcLabel(generateDotName.wrap)»> title="«generateDotName.wrap.escapeHTML»" shape=none margin="0.0,0.055" constraint=false URL="javascript:jumpToLine(«this.node.startLine»)"];'''
		
	}
	
	private def dispatch generateDotDecl(import_from imp_from){
		return '''		"«generateDotUniqueName»" [label=<«createStartProcLabel(generateDotName.wrap)»> title="«generateDotName.wrap.escapeHTML»" shape=none margin="0.0,0.055" constraint=false URL="javascript:jumpToLine(«origin.startLine»,«this.node.startLine»)"];'''
		
	}
	
	private def dispatch generateDotDecl(import_name imp_name) {
		return '''		"«generateDotUniqueName»" [label=<«createStartProcLabel(generateDotName.wrap)»> title="«generateDotName.wrap.escapeHTML»" shape=none margin="0.0,0.055" constraint=false URL="javascript:jumpToLine(«origin.startLine»,«this.node.startLine»)"];'''
		
	}
	def createStartProcLabel(String... rows){
		return '''
			<TABLE BORDER="1" CELLBORDER="1" CELLSPACING="0">
				«FOR row : rows SEPARATOR '<HR/>'»
				<TR>
					<TD> </TD>
					<TD >«row.escapeHTML»</TD>
					<TD HREF="javascript:openEditor('«generateDotName.wrap.escapeHTML.replaceAll("'","\'")»')" TOOLTIP="Open Procedure «generateDotName.wrap.escapeHTML»">&gt;</TD>
				</TR> 
				«ENDFOR»
			</TABLE>
		'''
	}
	
	
}