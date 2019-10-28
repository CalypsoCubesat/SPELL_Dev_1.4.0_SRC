package lu.ses.engineering.spell.taskflow.digraph

import lu.ses.engineering.spell.controlflow.spell.SpellElement
import lu.ses.engineering.spell.controlflow.spell.Goto
import lu.ses.engineering.spell.controlflow.spell.Step
import lu.ses.engineering.spell.controlflow.spell.DisplayStep
import org.eclipse.xtext.util.Strings
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import javax.script.ScriptEngineManager
import java.util.HashMap
import com.google.common.collect.HashMultimap
import java.util.ArrayDeque
import java.util.Collections
import java.util.HashSet
import java.util.LinkedHashSet

class DiGraphNode<T extends SpellElement> {
	public static final DiGraphNode STARTNODE = new DiGraphNode(null,null)
	public static final DiGraphNode ENDNODE = new DiGraphNode(null,null)
	protected static final val validEscapes = "(?:amp;)|(?:lt;)|(?:gt;)|(?:nbsp;)"
	protected static final val HashMap<String,(String)=>String> escapes = {
		val e = new HashMap<String,(String)=>String>()
		e.put("&",[String s| if (!s.matches(validEscapes)) "&amp;" else "&"])
		e.put("<",[String s|"&lt;"])
		e.put(">",[String s|"&gt;"])
		return e
	}
	protected var T node
	protected var String dotName = ''
	protected var String dotDecl = ''
	protected var String dotUniqueName = ''
	protected var DiGraph diGraph
	protected var DiGraphNode duplicate = null
	protected String referedTarget = ''
	protected String annotationStr = ''
	protected val annotations = new ArrayDeque<DiGraphComment>()
	protected val conditions = new ArrayDeque<DiGraphComment>()
	
	protected val incoming = new HashSet<DiGraphEdge>()
	protected val outgoing = new HashSet<DiGraphEdge>()
	protected new(){
		
	}
	new(DiGraph graph,T node){
		this.diGraph = graph
		this.node = node;
		if (!isUndefined()){
			val currentName = generateDotName()
			duplicate = diGraph.knownNodes.put(generateDotUniqueName(),this as DiGraphNode)
			diGraph.nodeNameLookup.put(currentName,this as DiGraphNode)
			val targets = diGraph.referedTargets.get(currentName);
			for (target : targets){
				target.node = node as SpellElement
			}
			
			targets.clear()
		}
	}
	new(DiGraph graph,T node,String refered){
		this.diGraph = graph
		this.referedTarget = refered
	}
	def isConstrainingGoto(){
		if (this.incoming.length > 0){
			return "true";
		} else {
			for(in : incoming){
				if (!in.isBidirectional){
					return "false"
				}
			} 
			return "true"
		}
	}
	def isBidirectional(DiGraphEdge e){
		return e.isBothDir;
	}
	def getIncoming(){
		return incoming;
	}
	def getOutgoing(){
		return outgoing;
	}
	def getNode(){
		return node;
	}
	def getDetailed(){
		return diGraph.isDetailed()
	}
	def getDiGraph(){
		return diGraph
	}
	def unquote(String quoted){
		if (quoted.startsWith("'") && quoted.endsWith("'"))
			return quoted.substring(1,quoted.length - 1)
				if (quoted.startsWith("\"") && quoted.endsWith("\""))
			return quoted.substring(1,quoted.length - 1)
		return quoted
	}
	def wrap(String text){
		return Strings.wordWrap(text.replaceAll("'?\\s*\\\\\\s*\n\\s*'?", "").replace("'","").unquote() , 40).postProcess()
	}
	def toTable(String text){
		if (text.isEmpty)
			return ''
		return "<FONT POINT-SIZE=\"10\">" + text.replace("\n", "</FONT> \n</TD>\n</TR><TR>\n<TD>\n<FONT POINT-SIZE=\"10\">") + "</FONT>"
	}
	def postProcess(String in){
		//System.out.println();
		return in.replaceAll("(?<!\\\\)([|<>\"'])", "\\\\\\\\$1")
	}
	def isUndefined(){
		return this.node === null && this.referedTarget.isEmpty()
	}
	def isGoto(){
		return !isUndefined() && this.node instanceof Goto
	}
	
	def String generateDotDecl(){
		if (this === STARTNODE)
			return 'Procedure Started'
		if (this === ENDNODE)
			return 'Procedure Ended'
		if (isUndefined())
			return 'Undefined'
		if (this.node === null)
			return 'Node Not Found : '+this.referedTarget+''
		if (dotDecl.isEmpty()){
			dotDecl = generateDotDecl(this.node)
		}
		return dotDecl
	}
	
	def String generateDotName(){
		if (isUndefined())
			return generateDotDecl()
		if (this.node == null)
			return 'Node Not Found : '+this.referedTarget+''
		if (dotName.isEmpty()){
			dotName = generateDotName(this.node)
		}
		return dotName
	}
	def String generateDotUniqueName(){
		if (isUndefined())
			return generateDotDecl()
		if (this.node == null)
			return 'Node Not Found : '+this.referedTarget+''
		if (dotUniqueName.isEmpty()){
			dotUniqueName = generateDotUniqueName(this.node)
		}

		return dotUniqueName
	}
	
	private def dispatch String generateDotName(SpellElement element){
		return ''''''
	}
	
	private def dispatch String generateDotName(Goto goto){
		if (goto.target != null)
			return '''Goto «goto.target»'''
		if (goto.variable != null)
			return '''Goto eval(«goto.variable»)'''
		if (goto.expr != null)
			return '''Goto eval(«goto.expr.code»)'''
	}
	private def dispatch String generateDotName(Step step){
		if (step.id.strings.length > 0)
			return '''«step.getId().getStrings().get(0)»'''
		if (step.id.name != null)
			return '''«step.getId().name»'''
	}
	private def dispatch String generateDotName(DisplayStep step){
		var stepId = "";
		try {
			stepId = diGraph.engine.eval(step.getId().code) as String;
		} catch (Exception e){
			stepId = step.getId().code;
		}
		return '''«stepId»'''
	}
	
	private def dispatch String generateDotUniqueName(SpellElement element){
		return ''''''
	}
	private def dispatch String generateDotUniqueName(Goto goto){
		if (goto.target != null)
			return '''Goto «goto.target»###«goto.hash»###'''
		if (goto.variable != null)
			return '''Goto «goto.variable»###«goto.hash»###'''
		if (goto.expr != null)
			return '''Goto «goto.expr.code»###«goto.hash»###'''
	}
	private def dispatch generateDotUniqueName(Step step){
		return step.generateDotName + " ###" + getStepDesc(this.node as Step).hashCode() + "###"
	}
	private def dispatch generateDotUniqueName(DisplayStep step){
		return step.generateDotName + " ###" + getStepDesc(this.node as DisplayStep).hashCode() + "### ###" + this.node.hashCode() + "###"
	}
	private def dispatch generateDotDecl(SpellElement element){
		return ''''''
	}
	
	private def dispatch generateDotDecl(Goto goto){
		if (goto.target != null)
			//return '''		"«generateDotUniqueName»" [label=<«createLabel(generateDotName.wrap)»> shape=none constraint=false URL="javascript:jumpToLine(«goto.startLine»)"];'''
			return ''
		if (goto.variable != null)
			return '''		"«generateDotUniqueName»" [id="«startLine»" label=<«createLabel(generateDotName.wrap.escapeHTML)»> shape=none constraint=«isConstrainingGoto()» URL="javascript:jumpToLine(«goto.startLine»)"];'''
		if (goto.expr != null)
			return '''		"«generateDotUniqueName»" [id="«startLine»" label=<«createLabel(generateDotName.wrap.escapeHTML)»> shape=none constraint=«isConstrainingGoto()» URL="javascript:jumpToLine(«goto.startLine»)"];'''
		
	}
	
	private def dispatch generateDotDecl(Step step) {
		if (detailed)
			return '''		"«generateDotUniqueName»" [id="«startLine»" label=<«createLabel(generateDotName.wrap.escapeHTML,step.stepDesc.wrap.escapeHTML.toTable)»> shape=«roundedBoxShape» margin="0.0,0.055" URL="javascript:jumpToLine(«step.startLine»);"];
			'''
		else
			return '''		"«generateDotUniqueName»" [id="«startLine»" label=<«createLabel(generateDotName.wrap.escapeHTML)»> title="«step.stepDesc.wrap»" shape=«roundedBoxShape» margin="0.0,0.055" URL="javascript:jumpToLine(«step.startLine»);"];
			'''
	}
	
	private def dispatch generateDotDecl(DisplayStep step) {
		if (detailed)
			return '''		"«generateDotUniqueName»" [id="«startLine»" label=<«createLabel(generateDotName.wrap.escapeHTML,step.stepDesc.wrap.escapeHTML.toTable)»> shape=«roundedBoxShape» margin="0.0,0.055" URL="javascript:jumpToLine(«step.startLine»);"];
			'''
		else
			return '''		"«generateDotUniqueName»" [id="«startLine»" label=<«createLabel(generateDotName.wrap.escapeHTML)»> title="«step.stepDesc.wrap»" shape=«roundedBoxShape» margin="0.0,0.055" URL="javascript:jumpToLine(«step.startLine»);"];
			'''
	}
	
	def getRoundedBoxShape() {
		return '''box style="rounded"'''
	}
	
	def getStepDesc(Step step){
		var String stepDesc = "";
		try {
			stepDesc = diGraph.engine.eval(step.getDescription().code) as String;
		} catch (Exception e){
			stepDesc = step.getDescription().code;
		}
		return stepDesc
	}
	def getStepDesc(DisplayStep step){
		var String stepDesc = "";
		try {
			stepDesc = diGraph.engine.eval(step.getDescription().code) as String;
		} catch (Exception e){
			stepDesc = step.getDescription().code;
		}
		return stepDesc
	}
	
	def String getStartLine(){
		if (node === null){
			if (this == STARTNODE) {
				return "node1";
			} else if (this == ENDNODE){
				return "node2";
			}else{
				return "-1"; 
			}
		}

		return "" + getStartLine(node);
	}
	def static getStartLine(SpellElement element){

		return NodeModelUtils.getNode(element).getStartLine()
	}
	def static getCode(SpellElement e){
		//NodeModelUtils.getTokenText(NodeModelUtils.findActualNodeFor(e));
		return NodeModelUtils.findActualNodeFor(e).getText().trim();
	}
	
	override boolean equals(Object eq){
		if (!(eq instanceof DiGraphNode<?>))
			return false;
		val second = eq as DiGraphNode<?>
		return second.generateDotUniqueName().equals(generateDotUniqueName())
	}
	
	override int hashCode(){
		return generateDotUniqueName.hashCode;
	}
	
	override toString(){
		return generateDotUniqueName;
	}
	def static String generateAnnotationTooltips(ArrayDeque<DiGraphComment> annot){
		return '''«FOR annotation : annot SEPARATOR '<br />'»
				«annotation.generateTooltip()»
			«ENDFOR»'''
	}
	def String makePython(Iterable<DiGraphComment> annot){
		return '''<pre><code class="python">«FOR annotation : annot SEPARATOR '<br/>'»
				«annotation.generateTooltip()»
			«ENDFOR»</code></pre>'''.toString().replaceAll("\r?\n","").replaceAll("\"","&qoute;")
		
	}
	
	def createLabel(String... rows){
		val LinkedHashSet<DiGraphNode> duplicates = new LinkedHashSet<DiGraphNode>();
		
		var current = duplicate;
		while (current != null){
			duplicates.add(current);
			current = current.duplicate;
		};
		return '''
			<TABLE BORDER="0" CELLBORDER="0" CELLSPACING="0" ID="«startLine»" TOOLTIP="">
				
				«FOR row : rows SEPARATOR '<HR/>'»
				<TR>
					<TD>«row» </TD>
					«IF !annotations.isEmpty || !conditions.isEmpty»
					«IF !conditions.isEmpty»
					<TD«IF (duplicates.collectStartLines != null && !isGoto())» ROWSPAN="2"«ENDIF»>
«««						«IF row == rows.get(0)»<TABLE VALIGN="TOP" WIDTH="5" BORDER="0" CELLBORDER="0" CELLPADDING = "0" CELLSPACING="-5">
«««							<TR>
«««								<TD VALIGN="TOP" HREF="" TITLE="«conditions.sortBy([DiGraphComment x| x.node.getStartLine]).makePython.escapeHTML.trim»">
«««									<B>?</B>
«««								</TD>
«««							</TR>
«««						</TABLE>«ENDIF»
					</TD>
					«ENDIF»
					«IF !annotations.isEmpty»
«««					<TD«IF (duplicates.collectStartLines != null && !isGoto())» ROWSPAN="2"«ENDIF»>
«««						<TABLE VALIGN="TOP" WIDTH="5" BORDER="0" CELLBORDER="0" CELLPADDING = "0" CELLSPACING="-5">
«««							<TR>
«««								<TD VALIGN="TOP" HREF="" TITLE="«annotations.generateAnnotationTooltips.escapeHTML.trim»">
«««									<B>!</B>
«««								</TD>
«««							</TR>
«««						</TABLE>
«««					</TD>
					«ENDIF»
					«ENDIF»
				</TR> 
				«ENDFOR»
				«IF (duplicates.collectStartLines != null && !isGoto())»
				<HR/>
				<TR>
					<TD HREF="javascript:jumpToLine(«duplicates.collectStartLines»)"><B><FONT COLOR="red">«duplicates.size()» Duplicate«IF duplicates.size() > 1»s«ENDIF» found!</FONT></B></TD>
				</TR> 
				«ENDIF»

			</TABLE>
		'''
	}
	
	def collectStartLines(LinkedHashSet<DiGraphNode> nodes){
		var q = new LinkedHashSet<Integer>()
		for (node : nodes){
			q.add(node.node.startLine)
		}
		q.remove(this.node.startLine as Integer)
		if (q.isEmpty)
			return null;
			
		return '''
				«FOR dupl : q SEPARATOR ','»
				«dupl»
				«ENDFOR»
				
		'''		
	}
	def dispatch String escapeHTML(CharSequence html){
		return html.toString().escapeHTML;
	}
	def dispatch String escapeHTML(String html){
		
		val escapedHTML = new StringBuilder()
		for (i : 0 ..< html.length){
			val currentChar = "" + html.charAt(i)
			val currentHandler = escapes.get(currentChar)
			if (currentHandler != null){
				escapedHTML.append(currentHandler.apply(html.substring(i)));
			} else {
				escapedHTML.append(currentChar);
			}
		}
		
		return escapedHTML.toString()
	}
	def addCondition(DiGraphComment annotation){
		this.conditions.add(annotation);
	}
	def addAnnotation(DiGraphComment annotation){
		this.annotations.add(annotation);
	}
	
}