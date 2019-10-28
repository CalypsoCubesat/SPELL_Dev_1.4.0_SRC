package lu.ses.engineering.spell.taskflow.digraph

import com.google.common.collect.HashMultimap
import java.io.FileInputStream
import java.util.Collection
import java.util.HashMap
import java.util.LinkedHashSet
import javax.script.ScriptEngineManager
import lu.ses.engineering.spell.controlflow.spell.SpellElement
import lu.ses.engineering.spell.flow_analysis.PythonHandler
import lu.ses.engineering.spell.flow_analysis.StepContext
import org.eclipse.core.resources.IFile
import org.eclipse.jface.preference.IPreferenceStore
import org.eclipse.jface.preference.PreferenceStore

class DiGraph {
	private var String splineType
	private var boolean detailed
	private var LinkedHashSet<DiGraphNode<?>> nodes = new LinkedHashSet<DiGraphNode<?>>()
	private var LinkedHashSet<DiGraphEdge> edges = new LinkedHashSet<DiGraphEdge>()
	private var LinkedHashSet<DiGraphProcedureCall<?>> procedureCalls = new LinkedHashSet<DiGraphProcedureCall<?>>() 
	private var LinkedHashSet<DiGraphComment> annotations = new LinkedHashSet<DiGraphComment>() 
	private IPreferenceStore prefs ;
	private var IFile file
	package HashMultimap<String,DiGraphNode<SpellElement>> referedTargets = HashMultimap.create()
	package HashMap<String,DiGraphNode<SpellElement>> knownNodes = new HashMap()
	package HashMap<String,DiGraphNode<SpellElement>> nodeNameLookup = new HashMap()
	private var LinkedHashSet<DiGraphNode<?>> handledNodes = new LinkedHashSet<DiGraphNode<?>>() 
	
	private val engine = new ScriptEngineManager().getEngineByName("js")
	
	/**
     * @param file the file we want to read
     * @return the contents of the file as a string
     */

	new(IFile file,IPreferenceStore prefs){
		this.file = file;
		this.prefs = prefs;
		if (prefs == null)
			this.prefs = new PreferenceStore();
		
	}

	def getEngine(){
		return engine;
	}
	def doCleanup(){
		referedTargets.clear
		knownNodes.clear
		nodeNameLookup.clear
	}
	
	def createReferredReferenceNode(String target){
		var referedTargetNode = nodeNameLookup.get(target)
		if (referedTargetNode == null) {
			referedTargetNode = new DiGraphNode(this,null,target);
			referedTargets.put(target,referedTargetNode);
		}
		return referedTargetNode
	}
	def registerNodes(Collection<DiGraphNode<?>> nodes){
		this.nodes.addAll(nodes);
	}
	def registerEdges(Collection<DiGraphEdge> edges){
		this.edges.addAll(edges)
	}
	def setSplineType(String spline){
		this.splineType = spline;
	}
	def filterEdges(Collection<DiGraphEdge> edges){
		val LinkedHashSet<DiGraphEdge> reversedEdges = new LinkedHashSet()
		for (edge : edges){
			val reversedEdge = edge.reverse()
			if (edges.contains(reversedEdge) && !reversedEdges.contains(edge)){
				reversedEdges.add(reversedEdge)
				edge.bothDir = true
			}
		}
		edges.removeAll(reversedEdges)
		for (edge : reversedEdges) {
			edge.delete()
		}
		return edges
	}
	def setDetailLevel(String detail){
		if (detail == null)
			this.detailed = false
		else
			this.detailed = "detailed".equals(detail.toLowerCase)
	}
	
	def isDetailed(){
		return detailed
	}
	
	def createDiGraph(PythonHandler handler){
		if (nodes.isEmpty)
			nodes = new LinkedHashSet<DiGraphNode<?>>(knownNodes.values)
			
		registerEdges(handler.stepFlowInformation)
		val lastContext = handler.getLastContext()		
		return '''
				digraph {
					subgraph main {
						"«DiGraphNode.STARTNODE.generateDotDecl»"
						"«DiGraphNode.ENDNODE.generateDotDecl»"

					}
					«IF (splineType != null && !splineType.isEmpty() && !"null".equals(splineType))»
					splines = «splineType»
					«ENDIF»
					rankdir=«prefs.getString("DotGraphOrientation")»
					node [tooltip="123" labeltooltip="678"]
					edge [tooltip="345" labeltooltip="890"]
					subgraph cluster_main {
						label = "«file.getName()»";
						«FOR node : nodes»
						«node.generateDotDecl()»
						«ENDFOR»
						«FOR proc : procedureCalls»
						«proc.generateDotDecl()»
						«ENDFOR»
						«FOR edge : edges.filterEdges»
						«edge.generateRank»
						«ENDFOR»
					}
					
					«FOR edge : edges.filterEdges»
					«edge.generateEdge»
					«ENDFOR»
					«connectLastSteps(lastContext)»
				}
				'''.toString().postProcess()
	}
	def generateEdge(DiGraphEdge edge){
		handledNodes.add(edge.firstNode)
		handledNodes.add(edge.secondNode)
		return edge.generateDotEdge
	}
	def generateRank(DiGraphEdge edge){
		if ((edge.firstNode instanceof DiGraphProcedureCall) || (edge.secondNode instanceof DiGraphProcedureCall))
			return '''{rank=same "«edge.firstNode.generateDotUniqueName»" "«edge.secondNode.generateDotUniqueName»"}'''
		else
			return ''
	}
	def connectLastSteps(StepContext lastContext){
		var String result = ''
		for(step : lastContext){
			//if (!handledNodes.contains(step)){
				if(step.isUndefined()){
					return new DiGraphEdge(DiGraphNode.STARTNODE,DiGraphNode.ENDNODE,false).generateDotEdge;
				}
				result += new DiGraphEdge(step,DiGraphNode.ENDNODE,false).generateDotEdge() + "\n	";
			//}
		}
		return result
	}
	def convertBiDirectional(LinkedHashSet<DiGraphEdge> edges){
		return edges
	}
	
	def postProcess(String text){
		return text.replaceAll("\r\n","\n");
	}
	def getAnnotations(){
		return annotations
	}
	
	def getProcedureCalls(){
		return procedureCalls
	}
}