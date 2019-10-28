package lu.ses.engineering.spell.taskflow.digraph

import java.io.File
import java.io.FileInputStream
import java.io.IOException
import org.eclipse.xtend.lib.annotations.Accessors
import java.io.FileNotFoundException
import java.util.regex.Matcher
import java.util.regex.Pattern

class DiGraphHTMLGenerator {
	
	val DiGraph currentGraph = null;
	 
	@Accessors boolean allowUpdate = true;
	@Accessors boolean allowSave = true;
	@Accessors boolean allowTooltip = true;
	@Accessors boolean allowEditMenu = true;
	@Accessors boolean panicOnMissingFile = false;
	
	def getCurrentGraph(){
		return currentGraph
	}
		
	def static String getFileContents(File f) {
		var FileInputStream stream;
        try {
        	stream = new FileInputStream(f);
        	val result = new StringBuffer();
        	val buf = newByteArrayOfSize(2048);
        	for(var length = 0;(length = stream.read(buf)) > 0;){
        		result.append(new String(buf,0,length,"UTF-8"));
        	}
          	return result.toString
        } catch (Exception e) {
            throw e;
        }
    }
    
	def generateCreationLink(String type){
		return '''
			<br>
				<a href="javascript:createTaskFlowDiagram()">Start Task Flow «type» Process</a>
			<br>
		''';
	}
	
	def generateErrorMessageDiagramNotFound(){
		if (panicOnMissingFile)
			throw new IllegalArgumentException("No Procedure found!");
		return '''
				Could not find any related Diagram.<br>
				No Procedure selected!
			'''
	}
	
	def generateMappingFileNotFound(String svg){
		if (panicOnMissingFile)
			throw new FileNotFoundException(svg);
		return '''
			Could not find any related Diagram.<br>
			SVG File is missing!<br>
			«generateCreationLink("Creation")»<br>
			
		'''
	}
	
	def String patchSVG(String svg){
		var result = svg
		while (!result.startsWith("<svg")){
			result = result.split("\n",2).get(1)
		}
		if (!result.startsWith("<svg type=")){
			result = result.replaceFirst("<svg","<svg id=\"flow_diagram\" type=\"image/svg+xml\" style=\"pointer-events: none\"")
			result = result.replaceFirst("<title>[^<]*</title>","")
			result = result.replaceAll("><title>([^<]*)</title>"," title=\"$1\">")
		}
		return result;
	}
	
	private def generateActivityDiagram(File svgFile,String annotations){
		val svg = new File(svgFile.toString()).getFileContents().patchSVG();
		return try {'''
				«svg»			
«««				<img id="flow_diagram" type="image/svg+xml" SRC="«srcImage»svg" USEMAP="#mainmap" ondragstart="return false;" />
				«generateActivityDiagramMapping(svgFile)»
				<span id="annotation_container" class="annotation_container">
				«annotations»
				</span>
		'''
		} catch (Exception ex){
			'''
				<b>Error while loading Mapping File!</b><br>
				«ex.message»
			'''
		}
	}
	def generateActivityDiagramMapping(File mappingFile){
		return '''
«««			<map id="mainmap" name="mainmap">
«««				«mappingFile.readFile()»
«««			</map>
		'''
	}

	def readFile(File inFile){
		try {
			var result = ""
			val in = new FileInputStream(inFile);
			val byte[] buf = newByteArrayOfSize(4096);
		
			var length = in.read(buf)
			while (length > 0){
				result += new String(buf,0,length);
				length = in.read(buf)
			}
			in.close();
			
			return result
		} catch (IOException e) {
			e.printStackTrace();
			throw new Exception('''
					Could not open Mapping File!<br>
					Reason:<br>
					«e.message»<br>
					«generateCreationLink("Creation")»
					''')
		}
		
	}
	
	def generateTimeStamp(String imageFile,File mapFile){
		return ("" + mapFile.lastModified) + new File(imageFile).lastModified;
	}
	
	
	def createHTMLBody(File svgFile,String annotations){
		return '''
			<body>
				«IF allowTooltip»<div id="tooltips" class="tooltips"></div>«ENDIF»
				<div class="header">
					<table class="header__content-text">
					  <tr>
					    <th>«svgFile.name.replace(".svg","")»</th>
					    «IF allowUpdate»<th>
					    	<a href="javascript:createTaskFlowDiagram()">
					    		<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAACFklEQVR42mNgoDXY3SzhsL9d+tzeVtFy0jW3iAUfmWz4/eODXf/3d8q9Jk1zo5j7vg6FLz9fn/r/98PF/8enmrze2yb7Boh37qgXVcGreX+DKM+OBokP7y9N+f//9XYw/vdyy/9v9xb/v74u/vuOBunXWxtEJXAasLlSWGNLtdi3P09X///3Yj0GPrfA8/PmatF2vK7YViu16vgE3U8/zmX+/3Q88f+2aolfu5vlPz7Y4PPn6Y6g/1trJC8gnNwqarCnWTwZyQsS+xsEBDaViW7e16b07c2+oP8by0Q+rCsWjN5ULvrx+lKb/5urxM/DDTjYJbd3b6v43/3toiog/+9rk3x/oFP27a42EfsNpWIz1hWJfFxfInICpHZNgXDm2iLhvxvKxGYhXNAh9/rGuqi/+9rlju5uEbU52KP8+duzw8CoU/gGjI3gFblCFktyhWQgrmNgWV0oshIkBjdgR73Y35+PV/8/Pdvxy4460f/7O1S+///x7P/XR9v+721T+LKrWcqPQIBJXH18oAocXX9fbPr//d5SePS9vzQZGGBir0A24zRgY7mI9/Y6mS9vTpT//3t/CgoGiW2qFH1FMOWtLxJ23lQh/npLteTnC3Ms3/66kPn/3cGY/1sqJb6sKRZyJyr5zm9Q4FiVL2izsULi8+u9Qf83lEt8XZMvkkpSHphfICCwKl/08qp8kVfLcoSCCakHAL+PNBM3bX0uAAAAAElFTkSuQmCC" border="0"></img> 
					    	</a>
					    </th>«ENDIF»
					    «IF allowSave»<th>
					    	<a href="javascript:saveAnnotations()">
					    		<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAB2klEQVR42q2QD0tTURiH/Th9Cz+IUI2ihEWFUUR5WeVq4qZrKEMR96/b7u7VadKwxEYWJJSZmAODTe2Obcxc17uO5grsV+85njG4DAm88HA47/vwHLgdHafxDUUSnYMTscbAeASz2dcnQl4wmqgHxqJneCAUU23LroMd/MTMQhZ/jn63hfbk7dQsDP2L8EAwlmRWfR+EPjePw18N5E3TAc1pL91Ho1HwgH9CY98sBkKdzWBv/7AttJfug3BMBHzjKVbe/QEikp5B1T7AykbeAc1pL13PcFwEvKM6M6s2iLGUAbPG2sL3x25vKCEC98IGK5T2QIyoGra2c9j+6qSwuY5wUod0bwefiIAybLAv5ncQi8s5+rsYjMQdPI6rWFrLQ7o3A8eBuyGDrW/V8L/0DKgicCs4yVbzu5Bk3hVwpT8Dt+95k+v+OWQ/mmj1rvY/FYEbgUm2vLEDicuTRrFio1Stc/SXn7FZtHDJ+wytnvthUgSu+afYUq4KSdcdAy/el5vIO52tXnefJgJuX5q9XatAQqL2ptJE3uls9S7eT4nA5b4p9mqlhOynMoe/tJprMqIt8pPm0pn/UMQFj9HggW7vdNc5RT8626uDIPG84oTm0nEpRsOlTHf+BRMX27WEBWjWAAAAAElFTkSuQmCC" border="0"></img>
					    	</a>
					    </th>«ENDIF»
					    <th>
					    	<a href="javascript:resetAllNodes()">
					    		<img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAACDUlEQVR42q2SXU8TQRSG+QkmStI0GEsjZaUf1hYtbaYftrt0S6WtroVgRVYaaCONkBCNFyb8LC69anf2A4x3JooitNmC0nSZDfHu2K7aZFvgwjjJkzM7T/JO9pwZGvqf6z2fuyIuskWBZ23neYmfsYjP2KVuHZDKwjS1U0i1PvAPVeVp6lReSHJmzyKlwLb/+u63KUB8TG8fVIqgv30DrdcboMwlCeZoIwTnaSTnk9rxZsXwzY0XIOWn98wBmYRQLxfh9NWmwY/1NVByDBEz8S0px2jNtXLPHVXKIGdp1RSAU7EpeSauqyvL0H5ZMTgur8DObOKs/0xJxwlO3s8O9AHTCElMRG8sLUKrVDI4WV3t7ZvLPMhMhGA6zF04CYwCSIoivT4/Dyf88x5qoQByFBEcDnGXjhIHAggHg9rhIw6+Pyn0aOTnQAyFSMdfcrvfj7DvrvYtPQtHXN6g+ad2OczkQPTfI/jO5GAI9vimsNun7dMsqA+yBgfJNMjeyZ/9Z6LHT7Dba25ibcz97lMoBg0mZbAfY0CgvERweLYw5dW/RBI9190L4x7zGGs25/ZHXxDqHfk1GAXB7iLVG87fD8nuRHjUpe8FwobvVmHU1RdgdVDCyERr1+75LFy/1a6OUKb/xFYn6niye/O22vFa1Tox+A6kYaeldm2sVLvqoM5rsmChbLXh8fWL/D+tX+UhRJunNTu+AAAAAElFTkSuQmCC" border="0"></img>
					    	</a>
					    </th>
					  </tr>
					</table>
				</div>
				<div class="page__content-container">
					«generateActivityDiagram(svgFile,annotations).createPopMenuContainer»
					«IF allowEditMenu»<nav id="context-menu" class="context-menu">
					    <ul class="context-menu__items">
					      <li class="context-menu__item">
					        <a href="#" class="context-menu__link" data-action="Create"><i class="fa fa-create"></i> Create Annotation</a>
					      </li>
					      <li class="context-menu__item">
					         <a href="#" class="context-menu__link" data-action="Move"><i class="fa fa-move"></i> Toggle Move Annotation</a>
					       </li>
					      <li class="context-menu__item">
					        <a href="#" class="context-menu__link" data-action="Edit"><i class="fa fa-edit"></i> Toggle Edit Annotation</a>
					      </li>
					      <li class="context-menu__item">
					        <a href="#" class="context-menu__link" data-action="Delete"><i class="fa fa-delete"></i> Delete </a>
					      </li>
					    </ul>
					</nav>
					
					<script type='text/javascript'>«getContextMenuJS»</script>«ENDIF»
					<br />

					<br />
									
				</div>

			</body>
		'''
	}
	
	def createHTMLPage(File svgFile,String annotations){
		return '''
			<html xmlns="http://www.w3.org/1999/xhtml" lang="en" id="task_flow_page">
				«createHTMLHeader»
				«createHTMLBody(svgFile,annotations)»
			</html>
		'''
	}
	
	def createHTMLHeader(){
		return '''
			<!DOCTYPE html>
			<head>
				<meta http-equiv='x-ua-compatible' content='IE=11' />
					<title>Taskflow Diagram</title>
					<style type="text/css">
						#tooltips {
						    display: none;
						    position: absolute;
						    left 0;
						    top: 0;
						    min-width:50px;
						    color: white;
						    background-color: gainsboro;
						    box-shadow: black 2px 2px 2px;
						    padding: 5px;
						    border-radius:5px;
						    -ms-border-radius : 5px;
						    border-bottom: 1px dotted #000000; color: #000000; outline: none;
			    			text-decoration: none;
			    			white-space:pre-line;
			    			z-index: 9999;
			    			text-align: center;
						}

						.tooltipClass {
							
						    position: absolute;
						    color: black;
						    background-color: #E6E6FA;
						    z-index: 9999;
						}
						.a1:hover:after {
							content: '1234';
							position: absolute;
						}
						*[xlink:title]:hover:after {
						  content: '1234';
						  position: absolute;
						}
						*[title]:hover:after {
						  content: '456';
						  position: absolute;
						}
						title:hover:after {
						  content: '789';
						  position: absolute;
						}
						«createCSS()»
					</style>
					<script type='text/javascript'>«createPythonHighLightJS»</script>
					<script>
						try {
							
							hljs.initHighlightingOnLoad();
						} catch(e){
							alert(e.message);
						}
						
						«registerPythonLanguage()»
					</script>
					<script type='text/javascript'>
						mo_title = null;
						mo_element = null;
						function getScrollXY() {
						  var scrOfX = 0, scrOfY = 0;
						  if( typeof( window.pageYOffset ) == 'number' ) {
						    //Netscape compliant
						    scrOfY = window.pageYOffset;
						    scrOfX = window.pageXOffset;
						  } else if( document.body && ( document.body.scrollLeft || document.body.scrollTop ) ) {
						    //DOM compliant
						    scrOfY = document.body.scrollTop;
						    scrOfX = document.body.scrollLeft;
						  } else if( document.documentElement && ( document.documentElement.scrollLeft || document.documentElement.scrollTop ) ) {
						    //IE6 standards compliant mode
						    scrOfY = document.documentElement.scrollTop;
						    scrOfX = document.documentElement.scrollLeft;
						  }
						  return [ scrOfX, scrOfY ];
						}
						document.onmousemove = function (e) {
							
							var event = e || window.event;
							if (document.onmousemove.next){
								document.onmousemove.next(event);
							} else {
								document.onmousemove.next = function(e){};
							}
							var current_title;
							var scrollXY = getScrollXY();
							
							var moposx = event.clientX + scrollXY[0];  // current 
							var moposy = event.clientY + scrollXY[1];  // mouse positions
							
							var tooltips = document.getElementById("tooltips");  // element for displaying stylized tooltips (div, span etc.)
							var current_element = event.target || event.srcElement;  // the element we're currently hovering
							
							//if (curDown)
							//	return;
							if (current_element == mo_element) 
								return;  // we're still hovering the same element, so ignore
							if (current_element == tooltips || tooltips.contains(current_element)) 
								return;  // we're still hovering the same element, so ignore

							var title = "";			
							if (current_element.title){
								title = current_element.title
								
								if(title){
									current_title = title;  
								} else {
									tooltips.style.display = "none";
									tooltips.style.left = "0px";
									tooltips.style.left = "0px";
									tooltips.innerHTML = "";
									if(mo_title) mo_element.title = mo_title;
									mo_title = null;
									mo_element = null;
									return;
								}
								
								if(mo_element == null){   // this is our first element  
									mo_element = current_element;
									mo_title = current_title;
								}
								   // restore the title of the previous element
								if(mo_title)
								 mo_element.title = mo_title;
								
								mo_element = current_element;  // set current values
								mo_title = current_title;      // as default
							
								if(mo_element.title){
									var mo_current_title = mo_element.title;  // save the element title
									//alert(mo_current_title)
									mo_element.title = "";  // set it to none so it won't show over our stylized tooltip
									if(mo_current_title == "-_-_-"){   //  if the title is fake, don't display it
										tooltips.style.display = "none";
										tooltips.style.left = "0px";
										tooltips.style.left = "0px";
										tooltips.innerHTML = "";
									} else { 
										if (mo_current_title == "<TABLE>")
											return;
										tooltips.style.display = "inline-block";
										tooltips.style.left = (moposx + 10) + "px";
										tooltips.style.top = (moposy + 10) + "px";
										tooltips.innerHTML = getRepr(mo_current_title);
										hljs.highlightBlock(tooltips);
										
									}
								}
							} else {
								var current_element = document.msElementsFromRect(event.clientX-1,  event.clientY-1,2,2);
								console.log(current_element);
								if (current_element.length > 0)
									current_element = current_element[0];
								
								
								while (current_element && !current_element.getAttribute("title")){
									current_element = current_element.parentNode;
								}
								if (current_element && current_element.getAttribute("title") != "Taskflow Diagram" && current_element.getAttribute("title") != "cluster_main"){
									title = current_element.getAttribute("title");
								} else {
									tooltips.style.display = "none";
									tooltips.style.left = "0px";
									tooltips.style.left = "0px";
									tooltips.innerHTML = "";
									if(mo_title)
									    mo_element.title = mo_title;
									mo_title = null;
									mo_element = null;
									return;
								}
								
								//alert(title);
								
								if(title){
									current_title = title;  
								} else {
									tooltips.style.display = "none";
									tooltips.style.left = "0px";
									tooltips.style.left = "0px";
									tooltips.innerHTML = "";
									if(mo_title)
									    mo_element.title = mo_title;
									mo_title = null;
									mo_element = null;
									return;
								}
								
								if(mo_element == null){   // this is our first element  
									mo_element = current_element;
									mo_title = current_title;
								}
								   // restore the title of the previous element
								if(mo_title)
								    mo_element.title = mo_title;
								
								mo_element = current_element;  // set current values
								mo_title = current_title;      // as default
							
								if(mo_element.title){
									var mo_current_title = mo_element.title;  // save the element title
									//alert(mo_current_title)
									mo_element.title = "";  // set it to none so it won't show over our stylized tooltip
									if(mo_current_title == "-_-_-"){   //  if the title is fake, don't display it
										tooltips.style.display = "none";
										tooltips.style.left = "0px";
										tooltips.style.left = "0px";
										tooltips.innerHTML = "";
									} else { 
										if (mo_current_title == "<TABLE>")
											return;
										tooltips.style.display = "inline-block";
										tooltips.style.left = (moposx + 10) + "px";
										tooltips.style.top = (moposy + 10) + "px";
										tooltips.innerHTML = getRepr(mo_current_title);
										event.preventDefault();
										event.stopPropagation();
										hljs.highlightBlock(tooltips);
										
									}
								}
							} 
							
						};
						
						«createPopupJS()»
						window.onunload = function() {
						    saveAnnotations();
						}
						//window.setTimeout(functions(){ saveAnnotations();}, 60000);
						
					</script>
			</head>
		'''
	}
	def createPopMenuContainer(String body){
		return '''
			<main class="content">
			    <div class="container">
				  <ul class="annotations">
				    <li class="annotation" data-id="3">
				      <div id="task_flow" class="annotation__content">
				      	«body»
				      </div><div class="annotation__actions">
				        <i class="fa fa-create"></i>
						<i class="fa fa-move"></i>
						<i class="fa fa-delete"></i>
				      </div>
				    </li>
				  </ul>
				</div>
			</main>
		'''
	}
	def registerPythonLanguage() {
		return '''
		;
		var python = function(hljs) {
		  var PROMPT = {
		    className: 'meta',  begin: /^(>>>|\.\.\.) /
		  };
		  var STRING = {
		    className: 'string',
		    contains: [hljs.BACKSLASH_ESCAPE],
		    variants: [
		      {
		        begin: /(u|b)?r?'«»''/, end: /'«»''/,
		        contains: [PROMPT],
		        relevance: 10
		      },
		      {
		        begin: /(u|b)?r?"""/, end: /"""/,
		        contains: [PROMPT],
		        relevance: 10
		      },
		      {
		        begin: /(u|r|ur)'/, end: /'/,
		        relevance: 10
		      },
		      {
		        begin: /(u|r|ur)"/, end: /"/,
		        relevance: 10
		      },
		      {
		        begin: /(b|br)'/, end: /'/
		      },
		      {
		        begin: /(b|br)"/, end: /"/
		      },
		      hljs.APOS_STRING_MODE,
		      hljs.QUOTE_STRING_MODE
		    ]
		  };
		  var NUMBER = {
		    className: 'number', relevance: 0,
		    variants: [
		      {begin: hljs.BINARY_NUMBER_RE + '[lLjJ]?'},
		      {begin: '\\b(0o[0-7]+)[lLjJ]?'},
		      {begin: hljs.C_NUMBER_RE + '[lLjJ]?'}
		    ]
		  };
		  var PARAMS = {
		    className: 'params',
		    begin: /\(/, end: /\)/,
		    contains: ['self', PROMPT, NUMBER, STRING]
		  };
		  return {
		    aliases: ['py', 'gyp'],
		    keywords: {
		      keyword:
		        'and elif is global as in if from raise for except finally print import pass return ' +
		        'exec else break not with class assert yield try while continue del or def lambda ' +
		        'async await nonlocal|10 None True False',
		      built_in:
		        'Ellipsis NotImplemented'
		    },
		    illegal: /(<\/|->|\?)/,
		    contains: [
		      PROMPT,
		      NUMBER,
		      STRING,
		      hljs.HASH_COMMENT_MODE,
		      {
		        variants: [
		          {className: 'function', beginKeywords: 'def', relevance: 10},
		          {className: 'class', beginKeywords: 'class'}
		        ],
		        end: /:/,
		        illegal: /[${=;\n,]/,
		        contains: [
		          hljs.UNDERSCORE_TITLE_MODE,
		          PARAMS,
		          {
		            begin: /->/, endsWithParent: true,
		            keywords: 'None'
		          }
		        ]
		      },
		      {
		        className: 'meta',
		        begin: /^[\t ]*@/, end: /$/
		      },
		      {
		        begin: /\b(print|exec)\(/ // don’t highlight keywords-turned-functions in Python 3
		      }
		    ]
		  };
		}
		
		try {
			
			hljs.registerLanguage("python",python);
		} catch(e){
			alert("register init " + e.message);
		}
		'''
	}
	def createPopupJS() {
		return '''
		 
		'''
	}
	
	def createPythonHighLightJS(){
		return '''
		
		/*
		Syntax highlighting with language autodetection.
		https://highlightjs.org/
		*/
		;
		'use strict';
		if (!Object.create) {
		    Object.create = function(o, properties) {
		        if (typeof o !== 'object' && typeof o !== 'function') throw new TypeError('Object prototype may only be an Object: ' + o);
		        else if (o === null) throw new Error("This browser's implementation of Object.create is a shim and doesn't support 'null' as the first argument.");
		
		        if (typeof properties != 'undefined') throw new Error("This browser's implementation of Object.create is a shim and doesn't support a second argument.");
		
		        function F() {}
		
		        F.prototype = o;
		
		        return new F();
		    };
		}
		// Add ECMA262-5 method binding if not supported natively
		//
		if (!('bind' in Function.prototype)) {
		    Function.prototype.bind= function(owner) {
		        var that= this;
		        if (arguments.length<=1) {
		            return function() {
		                return that.apply(owner, arguments);
		            };
		        } else {
		            var args= Array.prototype.slice.call(arguments, 1);
		            return function() {
		                return that.apply(owner, arguments.length===0? args : args.concat(Array.prototype.slice.call(arguments)));
		            };
		        }
		    };
		}
		
		// Add ECMA262-5 string trim if not supported natively
		//
		if (!('trim' in String.prototype)) {
		    String.prototype.trim= function() {
		        return this.replace(/^\s+/, '').replace(/\s+$/, '');
		    };
		}
		
		// Add ECMA262-5 Array methods if not supported natively
		//
		if (!('indexOf' in Array.prototype)) {
		    Array.prototype.indexOf= function(find, i /*opt*/) {
		        if (i===undefined) i= 0;
		        if (i<0) i+= this.length;
		        if (i<0) i= 0;
		        for (var n= this.length; i<n; i++)
		            if (i in this && this[i]===find)
		                return i;
		        return -1;
		    };
		}
		if (!('lastIndexOf' in Array.prototype)) {
		    Array.prototype.lastIndexOf= function(find, i /*opt*/) {
		        if (i===undefined) i= this.length-1;
		        if (i<0) i+= this.length;
		        if (i>this.length-1) i= this.length-1;
		        for (i++; i-->0;) /* i++ because from-argument is sadly inclusive */
		            if (i in this && this[i]===find)
		                return i;
		        return -1;
		    };
		}
		if (!('forEach' in Array.prototype)) {
		    Array.prototype.forEach= function(action, that /*opt*/) {
		        for (var i= 0, n= this.length; i<n; i++)
		            if (i in this)
		                action.call(that, this[i], i, this);
		    };
		}
		if (!('map' in Array.prototype)) {
		    Array.prototype.map= function(mapper, that /*opt*/) {
		        var other= new Array(this.length);
		        for (var i= 0, n= this.length; i<n; i++)
		            if (i in this)
		                other[i]= mapper.call(that, this[i], i, this);
		        return other;
		    };
		}
		if (!('filter' in Array.prototype)) {
		    Array.prototype.filter= function(filter, that /*opt*/) {
		        var other= [], v;
		        for (var i=0, n= this.length; i<n; i++)
		            if (i in this && filter.call(that, v= this[i], i, this))
		                other.push(v);
		        return other;
		    };
		}
		if (!('every' in Array.prototype)) {
		    Array.prototype.every= function(tester, that /*opt*/) {
		        for (var i= 0, n= this.length; i<n; i++)
		            if (i in this && !tester.call(that, this[i], i, this))
		                return false;
		        return true;
		    };
		}
		if (!('some' in Array.prototype)) {
		    Array.prototype.some= function(tester, that /*opt*/) {
		        for (var i= 0, n= this.length; i<n; i++)
		            if (i in this && tester.call(that, this[i], i, this))
		                return true;
		        return false;
		    };
		}
		
		if (!document.querySelectorAll) {
		    document.querySelectorAll = function (selectors) {
		        var style = document.createElement('style'), elements = [], element;
		        document.documentElement.firstChild.appendChild(style);
		        document._qsa = [];
		
		        style.styleSheet.cssText = selectors +
		                '{x-qsa:expression(document._qsa && document._qsa.push(this))}';
		        window.scrollBy(0, 0);
		        style.parentNode.removeChild(style);
		
		        while (document._qsa.length) {
		            element = document._qsa.shift();
		            element.style.removeAttribute('x-qsa');
		            elements.push(element);
		        }
		        document._qsa = null;
		        return elements;
		    };
		}
		
		if (!document.querySelector) {
		    document.querySelector = function (selectors) {
		        var elements = document.querySelectorAll(selectors);
		        return (elements.length) ? elements[0] : null;
		    };
		}
		
			function absolutePosition(el) {
			    var
			        found,
			        left = 0,
			        top = 0,
			        width = 0,
			        height = 0,
			        offsetBase = absolutePosition.offsetBase;
			    if (!offsetBase && document.body) {
			        offsetBase = absolutePosition.offsetBase = document.createElement('div');
			        offsetBase.style.cssText = 'position:absolute;left:0;top:0';
			        document.body.appendChild(offsetBase);
			    }
			    if (el && el.ownerDocument === document && 'getBoundingClientRect' in el && offsetBase) {
			        var boundingRect = el.getBoundingClientRect();
			        var baseRect = offsetBase.getBoundingClientRect();
			        found = true;
			        left = boundingRect.left - baseRect.left;
			        top = boundingRect.top - baseRect.top;
			        width = boundingRect.right - boundingRect.left;
			        height = boundingRect.bottom - boundingRect.top;
			    }
			    return {
			        found: found,
			        left: left,
			        top: top,
			        width: width,
			        height: height,
			        right: left + width,
			        bottom: top + height
			    };
			}
			highlightNodeRec = function(child,color,width,scroll) {
		    		var el = child;
		    		if (el){
			    		var children = el.childNodes;
			    		for (var idx in children){
			    			var item = children[idx];
			    			if (item.getAttribute){
			    				var oldColor = item.getAttribute('stroke');
			    				if (oldColor){
			    					item.setAttribute('stroke',color);
			    					item.setAttribute('stroke-width',width);
			    					if (scroll){
			    						var rect = absolutePosition(item);
			    						window.scrollTo(rect.left - window.innerWidth / 2,rect.top - window.innerHeight / 2);
			    					}
			    				}
			    				highlightNodeRec(item,color,width,scroll);
			    			}
			    		}
					}
				}
		    highlightNode = function(oldVal, newVal) {
		    	if (newVal){
		    		
		    		if (oldVal){
		    			var el = document.getElementById(oldVal + ' ' +newVal);
		    			if (el){
			    			var children = el.childNodes;
				    		for (var idx in children){
				    			var item = children[idx];
				    			if (item.getAttribute){
				    				var oldColor = item.getAttribute('stroke');
				    				if (oldColor){
				    					item.setAttribute('stroke','LightCoral');
				    					item.setAttribute('stroke-width','');
				    				}
				    				highlightNodeRec(item,'LightCoral','',false);
				    			}
				    		}
			    		} else {
			    			var el = document.getElementById(newVal + ' ' + oldVal);
			    			if (el){
				    			var children = el.childNodes;
					    		for (var idx in children){
					    			var item = children[idx];
					    			if (item.getAttribute){
					    				var oldColor = item.getAttribute('stroke');
					    				if (oldColor){
					    					item.setAttribute('stroke','LightCoral');
					    					item.setAttribute('stroke-width','');
					    				}
					    				highlightNodeRec(item,'LightCoral','',false);
					    			}
					    		}
				    		}
			    		}
			    		var el = document.getElementById(oldVal);
			    		if (el){
				    		var children = el.childNodes;
				    		for (var idx in children){
				    			var item = children[idx];
				    			if (item.getAttribute){
				    				var oldColor = item.getAttribute('stroke');
				    				if (oldColor){
				    					item.setAttribute('stroke','LightCoral');
				    					item.setAttribute('stroke-width','');
				    				}
				    				highlightNodeRec(item,'LightCoral','',false);
				    			}
				    		}
				    	}
		    		}
		    		var el = document.getElementById(newVal);
		    		if (el){
			    		var children = el.childNodes;
			    		for (var idx in children){
			    			var item = children[idx];
			    			if (item.getAttribute){
			    				var oldColor = item.getAttribute('stroke');
			    				if (oldColor){
			    					item.setAttribute('stroke','red');
			    					item.setAttribute('stroke-width','2');
		    						var rect = absolutePosition(item);
		    						window.scrollTo(rect.left - window.innerWidth / 2,rect.top - window.innerHeight / 2);
			    				}
			    				highlightNodeRec(item,'red','2',true);
			    			}
			    		}
			    	} else {
			    		return false;
			    	}
		    		return true;
		    	}
		    	return false;
		    };
		    resetNodes = function(nodeId) {
		    	try{
			    	if (nodeId){
			    		var el = document.getElementById(nodeId);
			    		if (el){
				    		var children = el.childNodes;
				    		for (var idx in children){
				    			var item = children[idx];
				    			if (item.getAttribute){
				    				var oldColor = item.getAttribute('stroke');
				    				if (oldColor){
				    					item.setAttribute('stroke','black');
				    					item.setAttribute('stroke-width','');
				    				}
				    				highlightNodeRec(item,'black','',false);
				    			}
				    		}
				    	} else {
				    		return false;
				    	}
			    		return true;
			    	}
			    	return false;
		    	} catch(e){
		    		alert(e);
		    	}
		    	return false;
		    };
			resetAllNodes = function(){
				resetNodes('flow_diagram');
				return;
			};
		
		«getHighlighJS»
		«getDragJS()»
		''';
	}
	def getDragJS(){
		return '''
			;var oldMove = function(){};
			var draggable = function(){
			      return {
			          move : function(divid,xpos,ypos){
			              divid.style.left = xpos + 'px';
			              divid.style.top = ypos + 'px';
			          },
			          startMoving : function(divid,container,evt){
			              evt = evt || window.event;
			              var posX = evt.clientX,
			                  posY = evt.clientY,
			              divTop = divid.style.top,
			              divLeft = divid.style.left,
			              eWi = parseInt(divid.style.width),
			              eHe = parseInt(divid.style.height),
			              cWi = parseInt(document.getElementById(container).style.width),
			              cHe = parseInt(document.getElementById(container).style.height);
			              document.getElementById(container).style.cursor='move';
			              divTop = divTop.replace('px','');
			              divLeft = divLeft.replace('px','');
			              var diffX = posX - divLeft,
			                  diffY = posY - divTop;
			              if (document.onmousemove.backup){
			              	oldMove = document.onmousemove.backup;
			              } else {
			              	oldMove = document.onmousemove.next;
			              }
			              document.onmousemove.backup = oldMove;
			              document.onmousemove.next = function(evt){
			                  evt = evt || window.event;
			                  var posX = evt.clientX,
			                      posY = evt.clientY,
			                      aX = posX - diffX,
			                      aY = posY - diffY;
			                      if (aX < 0) aX = 0;
			                      if (aY < 0) aY = 0;
			                      if (aX + eWi > cWi) aX = cWi - eWi;
			                      if (aY + eHe > cHe) aY = cHe -eHe;
			                  draggable.move(divid,aX,aY);
			                  oldMove(evt);
			                  if (draggable.shouldExit == true){
			                  	draggable.stopMoving(container);
			                  }
			              };
			              
			          },
			          stopMoving : function(container){
			              var a = document.createElement('script');
			              document.getElementById(container).style.cursor='default';
			              document.onmousemove.next = oldMove;
			              
			          },
			      }
			  }();
			'''
	}
	def getContextMenuJS() {
		return '''
			;(function() {
			  
			  "use strict";
			
			  //////////////////////////////////////////////////////////////////////////////
			  //////////////////////////////////////////////////////////////////////////////
			  //
			  // H E L P E R    F U N C T I O N S
			  //
			  //////////////////////////////////////////////////////////////////////////////
			  //////////////////////////////////////////////////////////////////////////////
			
			  /**
			   * Function to check if we clicked inside an element with a particular class
			   * name.
			   * 
			   * @param {Object} e The event
			   * @param {String} className The class name to check against
			   * @return {Boolean}
			   */
			  function clickInsideElement( e, className ) {
			    try {
			    	var el = e.srcElement || e.target;

			    	if (el.classList && el.classList.contains(className) ) {
			      		return el;
			    	} else {
			      		while ( el = el.parentNode ) {
			        		if ( el.classList && el.classList.contains(className) ) {
			          			return el;
			        		}
			      		}
			    	}
				} catch (err){
					alert(err);
				}
			    return false;
			  }
			
			  /**
			   * Get's exact position of event.
			   * 
			   * @param {Object} e The event passed in
			   * @return {Object} Returns the x and y position
			   */
			  function getPosition(e) {
			    var posx = 0;
			    var posy = 0;
			
			    if (!e) var e = window.event;
			    
			    if (e.pageX || e.pageY) {
			      posx = e.pageX;
			      posy = e.pageY;
			    } else if (e.clientX || e.clientY) {
			      posx = e.clientX + document.body.scrollLeft + document.documentElement.scrollLeft;
			      posy = e.clientY + document.body.scrollTop + document.documentElement.scrollTop;
			    }
				//var scrollXY = getScrollXY();
										
				//posx = posx + scrollXY[0];  // current 
				//posy = posy + scrollXY[1];  // mouse positions
										
			    return {
			      x: posx,
			      y: posy
			    }
			  }
			
			  //////////////////////////////////////////////////////////////////////////////
			  //////////////////////////////////////////////////////////////////////////////
			  //
			  // C O R E    F U N C T I O N S
			  //
			  //////////////////////////////////////////////////////////////////////////////
			  //////////////////////////////////////////////////////////////////////////////
			  
			  /**
			   * Variables.
			   */
			  var contextMenuClassName = "context-menu";
			  var contextMenuItemClassName = "context-menu__item";
			  var contextMenuLinkClassName = "context-menu__link";
			  var contextMenuActive = "context-menu--active";
			
			  var taskItemClassName = "annotation";
			  var taskItemInContext;
			
			  var clickCoords;
			  var clickCoordsX;
			  var clickCoordsY;
			
			  var menu = document.querySelector("#context-menu");
			  var menuItems = menu.querySelectorAll(".context-menu__item");
			  var menuState = 0;
			  var menuWidth;
			  var menuHeight;
			  var menuPosition;
			  var menuPositionX;
			  var menuPositionY;
			
			  var windowWidth;
			  var windowHeight;
			
			  /**
			   * Initialise our application's code.
			   */
			  function init() {
			    contextListener();
			    clickListener();
			    keyupListener();
			    resizeListener();
			  }
			
			  /**
			   * Listens for contextmenu events.
			   */
			  function contextListener() {
			    document.addEventListener( "contextmenu", function(e) {
			      taskItemInContext = clickInsideElement( e, taskItemClassName );
			
			      if ( taskItemInContext ) {
			        e.preventDefault();
			        toggleMenuOn();
			        positionMenu(e);
			      } else {
			        taskItemInContext = null;
			        toggleMenuOff();
			      }
			    });
			  	
			  }
			
			  /**
			   * Listens for click events.
			   */
			  function clickListener() {
			    document.addEventListener( "click", function(e) {
			      var clickeElIsLink = clickInsideElement( e, contextMenuLinkClassName );

			      if ( clickeElIsLink ) {
			        e.preventDefault();
			        menuItemListener( clickeElIsLink );
			      } else {
			        var button = e.which || e.button;
			        if ( button === 1 ) {
			          toggleMenuOff();
			        }
			      }
			    });
			    var svg = document.getElementById("flow_diagram");
			    svg.addEventListener( "click", function(e) {
			      var clickeElIsLink = clickInsideElement( e, contextMenuLinkClassName );
			
			      if ( clickeElIsLink ) {
			        e.preventDefault();
			        menuItemListener( clickeElIsLink );
			      } else {
			        var button = e.which || e.button;
			        if ( button === 1 ) {
			          toggleMenuOff();
			        }
			      }
			    });
			  }
			
			  /**
			   * Listens for keyup events.
			   */
			  function keyupListener() {
			    window.onkeyup = function(e) {
			      if ( e.keyCode === 27 ) {
			      	draggable.stopMoving("annotation_container");
			        toggleMenuOff();
			      }
			    }
			  }
			
			  /**
			   * Window resize event listener
			   */
			  function resizeListener() {
			    window.onresize = function(e) {
			      toggleMenuOff();
			    };
			  }
			
			  /**
			   * Turns the custom context menu on.
			   */
			  function toggleMenuOn() {
			    if ( menuState !== 1 ) {
			      menuState = 1;
			      draggable.stopMoving("annotation_container");
			      menu.classList.add( contextMenuActive );
			    }
			  }
			
			  /**
			   * Turns the custom context menu off.
			   */
			  function toggleMenuOff() {
			    if ( menuState !== 0 ) {
			      menuState = 0;
			      draggable.stopMoving("annotation_container");
			      menu.classList.remove( contextMenuActive );
			    }
			  }
			    function getOffset( el ) {
			        var _x = 0;
			        var _y = 0;
			        if( el && !isNaN( el.offsetLeft ) && !isNaN( el.offsetTop ) ) {
			            _x += el.offsetLeft - el.scrollLeft;
			            _y += el.offsetTop - el.scrollTop;
			            el = el.offsetParent;
			        }
					var scrollXY = getScrollXY();
				
			        return { top: _y - scrollXY[1], left: _x - scrollXY[0]};
			    }
			  /**
			   * Positions the menu properly.
			   * 
			   * @param {Object} e The event
			   */
			  function positionMenu(e) {
			    clickCoords = getPosition(e);
			    clickCoordsX = clickCoords.x;
			    clickCoordsY = clickCoords.y;
			
			    menuWidth = menu.offsetWidth + 4;
			    menuHeight = menu.offsetHeight + 4;
			
			    windowWidth = window.innerWidth;
			    windowHeight = window.innerHeight;
			
			    if ( (windowWidth - clickCoordsX) < menuWidth ) {
			      menu.style.left = clickCoordsX + "px";
			    } else {
			      menu.style.left = clickCoordsX + "px";
			    }
			
			    if ( (windowHeight - clickCoordsY) < menuHeight ) {
			      menu.style.top =  clickCoordsY + "px";
			    } else {
			      menu.style.top = clickCoordsY + "px";
			    }
			  }
			
			  /**
			   * Dummy action function that logs an action when a menu item link is clicked
			   * 
			   * @param {HTMLElement} link The link that was clicked
			   */
			  function menuItemListener( link ) {
			    console.log( "Annotation ID - " + taskItemInContext.getAttribute("data-id") + ", Annotation action - " + link.getAttribute("data-action"));
			    switch(link.getAttribute("data-action")){
			    	case "Create":
				    	var iDiv = document.createElement('div');
					    iDiv.id = 'dynAnnotation';
					    iDiv.className = 'dynAnnotation';
					    document.getElementById('annotation_container').appendChild(iDiv);
					    iDiv.innerHTML = "Empty Annotation";
					    iDiv.style.position = "absolute";
					    iDiv.style.left = menu.style.left;
					    iDiv.style.top = menu.style.top;
					    iDiv.contentEditable  = true;
					    //iDiv.onmousedown=function(event){draggable.startMoving(this,"annotation_container",event)}; 
					    //iDiv.onmouseup=function(event){draggable.stopMoving("annotation_container")};
				    	break;
				    case "Move":

				    	var iDiv = document.elementFromPoint(getOffset(menu).left-1,  getOffset(menu).top-1);
				    	while(iDiv){
				    		if (iDiv && iDiv.className && iDiv.className == "dynAnnotation"){
						    	if(iDiv.onmousedown){
						    		iDiv.onmousedown = null;
						    		iDiv.style.border = iDiv.dragInProgress;
						    		iDiv.dragInProgress = "";
						    		if (iDiv.contentEditable != "true" && iDiv.restoreBackup)
						    			iDiv.contentEditable = true;
						    	} else {
						    		
								    iDiv.onmousedown=function(event){draggable.startMoving(this,"annotation_container",event);draggable.shouldExit = false;}; 
								    iDiv.onmouseup=function(event){draggable.stopMoving("annotation_container");draggable.shouldExit = true;};
								    iDiv.dragInProgress = iDiv.style.border;
								    iDiv.style.border = "2px dashed #bfbfbf";
								    if (iDiv.contentEditable == "true"){
								    	iDiv.restoreBackup = true;
								    	iDiv.contentEditable = false;
								    }
						    	}
						    	break;
							}
							iDiv = iDiv.parentElement;
						}
				    	break;
				    case "Edit":
						var iDiv = document.elementFromPoint(getOffset(menu).left-1,  getOffset(menu).top-1);
						while(iDiv){
							if (iDiv && iDiv.className && iDiv.className == "dynAnnotation"){
								draggable.shouldExit = true;
								if(iDiv.contentEditable == "true"){
									iDiv.contentEditable = false;
								} else {
								 	iDiv.contentEditable = true;
								}
								break;
							}
							iDiv = iDiv.parentElement;
						}
						break;
					case "Delete":
						var iDiv = document.elementFromPoint(getOffset(menu).left-1,  getOffset(menu).top-1);
						
						//alert(iDiv);
						while(iDiv){
							if (iDiv && iDiv.className && iDiv.className == "dynAnnotation"){
								iDiv.parentNode.removeChild(iDiv);
								toggleMenuOff();
								return;
							}
							iDiv = iDiv.parentElement;
						}
						var svg = document.getElementById("flow_diagram");
						try{
							var el = document.msElementsFromRect(getOffset(menu).left-1,  getOffset(menu).top-1,2,2);
							var e =  null;
							for (e in el){
								if (el[e].toString() == "[object SVGPolygonElement]" || el[e].toString() == "[object SVGPathElement]") {
									if (el[e].parentNode.getAttribute("xlink:title") != "<TABLE>"){
										if (el[e].style.opacity === "0"){
											el[e].style.opacity = 1;
											break;
										}else{
											el[e].style.opacity = 0;
											break;
										}
									} else {
										break;
									}
								}
							}
						}catch(err){alert(err);};
						break;
			    };
			   
			    toggleMenuOff();
			  }
			
			  /**
			   * Run the app.
			   */
			  init();
			
			})();
		'''
	}
	
	def getHighlighJS(){
		return '''
			/*
			Syntax highlighting with language autodetection.
			https://highlightjs.org/
			*/
			
			(function(factory) {
			
			  // Find the global object for export to both the browser and web workers.
			  var globalObject = typeof window === 'object' && window ||
			                     typeof self === 'object' && self;
			
			  // Setup highlight.js for different environments. First is Node.js or
			  // CommonJS.
			  if(typeof exports !== 'undefined') {
			    factory(exports);
			  } else if(globalObject) {
			    // Export hljs globally even when using AMD for cases when this script
			    // is loaded with others that may still expect a global hljs.
			    globalObject.hljs = factory({});
			
			    // Finally register the global hljs with AMD.
			    if(typeof define === 'function' && define.amd) {
			      define([], function() {
			        return globalObject.hljs;
			      });
			    }
			  }
			
			}(function(hljs) {
			  // Convenience variables for build-in objects
			  var ArrayProto = [],
			      objectKeys = Object.keys;
			
			  // Global internal variables used within the highlight.js library.
			  var languages = {},
			      aliases   = {};
			
			  // Regular expressions used throughout the highlight.js library.
			  var noHighlightRe    = /^(no-?highlight|plain|text)$/i,
			      languagePrefixRe = /\blang(?:uage)?-([\w-]+)\b/i,
			      fixMarkupRe      = /((^(<[^>]+>|\t|)+|(?:\n)))/gm;
			
			  var spanEndTag = '</span>';
			
			  // Global options used when within external APIs. This is modified when
			  // calling the `hljs.configure` function.
			  var options = {
			    classPrefix: 'hljs-',
			    tabReplace: null,
			    useBR: false,
			    languages: undefined
			  };
			
			  // Object map that is used to escape some common HTML characters.
			  var escapeRegexMap = {
			    '&': '&amp;',
			    '<': '&lt;',
			    '>': '&gt;'
			  };
			
			  /* Utility functions */
			
			  function escape(value) {
			    return value.replace(/[&<>]/gm, function(character) {
			      return escapeRegexMap[character];
			    });
			  }
			
			  function tag(node) {
			    return node.nodeName.toLowerCase();
			  }
			
			  function testRe(re, lexeme) {
			    var match = re && re.exec(lexeme);
			    return match && match.index === 0;
			  }
			
			  function isNotHighlighted(language) {
			    return noHighlightRe.test(language);
			  }
			
			  function blockLanguage(block) {
			    var i, match, length, _class;
			    var classes = block.className + ' ';
			
			    classes += block.parentNode ? block.parentNode.className : '';
			
			    // language-* takes precedence over non-prefixed class names.
			    match = languagePrefixRe.exec(classes);
			    if (match) {
			      return getLanguage(match[1]) ? match[1] : 'no-highlight';
			    }
			
			    classes = classes.split(/\s+/);
			
			    for (i = 0, length = classes.length; i < length; i++) {
			      _class = classes[i]
			
			      if (isNotHighlighted(_class) || getLanguage(_class)) {
			        return _class;
			      }
			    }
			  }
			
			  function inherit(parent, obj) {
			    var key;
			    var result = {};
			
			    for (key in parent)
			      result[key] = parent[key];
			    if (obj)
			      for (key in obj)
			        result[key] = obj[key];
			    return result;
			  }
			
			  /* Stream merging */
			
			  function nodeStream(node) {
			    var result = [];
			    (function _nodeStream(node, offset) {
			      for (var child = node.firstChild; child; child = child.nextSibling) {
			        if (child.nodeType === 3)
			          offset += child.nodeValue.length;
			        else if (child.nodeType === 1) {
			          result.push({
			            event: 'start',
			            offset: offset,
			            node: child
			          });
			          offset = _nodeStream(child, offset);
			          // Prevent void elements from having an end tag that would actually
			          // double them in the output. There are more void elements in HTML
			          // but we list only those realistically expected in code display.
			          if (!tag(child).match(/br|hr|img|object|input/)) {
			            result.push({
			              event: 'stop',
			              offset: offset,
			              node: child
			            });
			          }
			        }
			      }
			      return offset;
			    })(node, 0);
			    return result;
			  }
			
			  function mergeStreams(original, highlighted, value) {
			    var processed = 0;
			    var result = '';
			    var nodeStack = [];
			
			    function selectStream() {
			      if (!original.length || !highlighted.length) {
			        return original.length ? original : highlighted;
			      }
			      if (original[0].offset !== highlighted[0].offset) {
			        return (original[0].offset < highlighted[0].offset) ? original : highlighted;
			      }
			
			      /*
			      To avoid starting the stream just before it should stop the order is
			      ensured that original always starts first and closes last:
			
			      if (event1 == 'start' && event2 == 'start')
			        return original;
			      if (event1 == 'start' && event2 == 'stop')
			        return highlighted;
			      if (event1 == 'stop' && event2 == 'start')
			        return original;
			      if (event1 == 'stop' && event2 == 'stop')
			        return highlighted;
			
			      ... which is collapsed to:
			      */
			      return highlighted[0].event === 'start' ? original : highlighted;
			    }
			
			    function open(node) {
			      function attr_str(a) {return ' ' + a.nodeName + '="' + escape(a.value) + '"';}
			      result += '<' + tag(node) + ArrayProto.map.call(node.attributes, attr_str).join('') + '>';
			    }
			
			    function close(node) {
			      result += '</' + tag(node) + '>';
			    }
			
			    function render(event) {
			      (event.event === 'start' ? open : close)(event.node);
			    }
			
			    while (original.length || highlighted.length) {
			      var stream = selectStream();
			      result += escape(value.substr(processed, stream[0].offset - processed));
			      processed = stream[0].offset;
			      if (stream === original) {
			        /*
			        On any opening or closing tag of the original markup we first close
			        the entire highlighted node stack, then render the original tag along
			        with all the following original tags at the same offset and then
			        reopen all the tags on the highlighted stack.
			        */
			        nodeStack.reverse().forEach(close);
			        do {
			          render(stream.splice(0, 1)[0]);
			          stream = selectStream();
			        } while (stream === original && stream.length && stream[0].offset === processed);
			        nodeStack.reverse().forEach(open);
			      } else {
			        if (stream[0].event === 'start') {
			          nodeStack.push(stream[0].node);
			        } else {
			          nodeStack.pop();
			        }
			        render(stream.splice(0, 1)[0]);
			      }
			    }
			    return result + escape(value.substr(processed));
			  }
			
			  /* Initialization */
			
			  function compileLanguage(language) {
			
			    function reStr(re) {
			        return (re && re.source) || re;
			    }
			
			    function langRe(value, global) {
			      return new RegExp(
			        reStr(value),
			        'm' + (language.case_insensitive ? 'i' : '') + (global ? 'g' : '')
			      );
			    }
			
			    function compileMode(mode, parent) {
			      if (mode.compiled)
			        return;
			      mode.compiled = true;
			
			      mode.keywords = mode.keywords || mode.beginKeywords;
			      if (mode.keywords) {
			        var compiled_keywords = {};
			
			        var flatten = function(className, str) {
			          if (language.case_insensitive) {
			            str = str.toLowerCase();
			          }
			          str.split(' ').forEach(function(kw) {
			            var pair = kw.split('|');
			            compiled_keywords[pair[0]] = [className, pair[1] ? Number(pair[1]) : 1];
			          });
			        };
			
			        if (typeof mode.keywords === 'string') { // string
			          flatten('keyword', mode.keywords);
			        } else {
			          objectKeys(mode.keywords).forEach(function (className) {
			            flatten(className, mode.keywords[className]);
			          });
			        }
			        mode.keywords = compiled_keywords;
			      }
			      mode.lexemesRe = langRe(mode.lexemes || /\w+/, true);
			
			      if (parent) {
			        if (mode.beginKeywords) {
			          mode.begin = '\\b(' + mode.beginKeywords.split(' ').join('|') + ')\\b';
			        }
			        if (!mode.begin)
			          mode.begin = /\B|\b/;
			        mode.beginRe = langRe(mode.begin);
			        if (!mode.end && !mode.endsWithParent)
			          mode.end = /\B|\b/;
			        if (mode.end)
			          mode.endRe = langRe(mode.end);
			        mode.terminator_end = reStr(mode.end) || '';
			        if (mode.endsWithParent && parent.terminator_end)
			          mode.terminator_end += (mode.end ? '|' : '') + parent.terminator_end;
			      }
			      if (mode.illegal)
			        mode.illegalRe = langRe(mode.illegal);
			      if (mode.relevance == null)
			        mode.relevance = 1;
			      if (!mode.contains) {
			        mode.contains = [];
			      }
			      var expanded_contains = [];
			      mode.contains.forEach(function(c) {
			        if (c.variants) {
			          c.variants.forEach(function(v) {expanded_contains.push(inherit(c, v));});
			        } else {
			          expanded_contains.push(c === 'self' ? mode : c);
			        }
			      });
			      mode.contains = expanded_contains;
			      mode.contains.forEach(function(c) {compileMode(c, mode);});
			
			      if (mode.starts) {
			        compileMode(mode.starts, parent);
			      }
			
			      var terminators =
			        mode.contains.map(function(c) {
			          return c.beginKeywords ? '\\.?(' + c.begin + ')\\.?' : c.begin;
			        })
			        .concat([mode.terminator_end, mode.illegal])
			        .map(reStr)
			        .filter(Boolean);
			      mode.terminators = terminators.length ? langRe(terminators.join('|'), true) : {exec: function(/*s*/) {return null;}};
			    }
			
			    compileMode(language);
			  }
			
			  /*
			  Core highlighting function. Accepts a language name, or an alias, and a
			  string with the code to highlight. Returns an object with the following
			  properties:
			
			  - relevance (int)
			  - value (an HTML string with highlighting markup)
			
			  */
			  function highlight(name, value, ignore_illegals, continuation) {
			
			    function subMode(lexeme, mode) {
			      var i, length;
			
			      for (i = 0, length = mode.contains.length; i < length; i++) {
			        if (testRe(mode.contains[i].beginRe, lexeme)) {
			          return mode.contains[i];
			        }
			      }
			    }
			
			    function endOfMode(mode, lexeme) {
			      if (testRe(mode.endRe, lexeme)) {
			        while (mode.endsParent && mode.parent) {
			          mode = mode.parent;
			        }
			        return mode;
			      }
			      if (mode.endsWithParent) {
			        return endOfMode(mode.parent, lexeme);
			      }
			    }
			
			    function isIllegal(lexeme, mode) {
			      return !ignore_illegals && testRe(mode.illegalRe, lexeme);
			    }
			
			    function keywordMatch(mode, match) {
			      var match_str = language.case_insensitive ? match[0].toLowerCase() : match[0];
			      return mode.keywords.hasOwnProperty(match_str) && mode.keywords[match_str];
			    }
			
			    function buildSpan(classname, insideSpan, leaveOpen, noPrefix) {
			      var classPrefix = noPrefix ? '' : options.classPrefix,
			          openSpan    = '<span class="' + classPrefix,
			          closeSpan   = leaveOpen ? '' : spanEndTag
			
			      openSpan += classname + '">';
			
			      return openSpan + insideSpan + closeSpan;
			    }
			
			    function processKeywords() {
			      var keyword_match, last_index, match, result;
			
			      if (!top.keywords)
			        return escape(mode_buffer);
			
			      result = '';
			      last_index = 0;
			      top.lexemesRe.lastIndex = 0;
			      match = top.lexemesRe.exec(mode_buffer);
			
			      while (match) {
			        result += escape(mode_buffer.substr(last_index, match.index - last_index));
			        keyword_match = keywordMatch(top, match);
			        if (keyword_match) {
			          relevance += keyword_match[1];
			          result += buildSpan(keyword_match[0], escape(match[0]));
			        } else {
			          result += escape(match[0]);
			        }
			        last_index = top.lexemesRe.lastIndex;
			        match = top.lexemesRe.exec(mode_buffer);
			      }
			      return result + escape(mode_buffer.substr(last_index));
			    }
			
			    function processSubLanguage() {
			      var explicit = typeof top.subLanguage === 'string';
			      if (explicit && !languages[top.subLanguage]) {
			        return escape(mode_buffer);
			      }
			
			      var result = explicit ?
			                   highlight(top.subLanguage, mode_buffer, true, continuations[top.subLanguage]) :
			                   highlightAuto(mode_buffer, top.subLanguage.length ? top.subLanguage : undefined);
			
			      // Counting embedded language score towards the host language may be disabled
			      // with zeroing the containing mode relevance. Usecase in point is Markdown that
			      // allows XML everywhere and makes every XML snippet to have a much larger Markdown
			      // score.
			      if (top.relevance > 0) {
			        relevance += result.relevance;
			      }
			      if (explicit) {
			        continuations[top.subLanguage] = result.top;
			      }
			      return buildSpan(result.language, result.value, false, true);
			    }
			
			    function processBuffer() {
			      result += (top.subLanguage != null ? processSubLanguage() : processKeywords());
			      mode_buffer = '';
			    }
			
			    function startNewMode(mode) {
			      result += mode.className? buildSpan(mode.className, '', true): '';
			      top = Object.create(mode, {parent: {value: top}});
			    }
			
			    function processLexeme(buffer, lexeme) {
			
			      mode_buffer += buffer;
			
			      if (lexeme == null) {
			        processBuffer();
			        return 0;
			      }
			
			      var new_mode = subMode(lexeme, top);
			      if (new_mode) {
			        if (new_mode.skip) {
			          mode_buffer += lexeme;
			        } else {
			          if (new_mode.excludeBegin) {
			            mode_buffer += lexeme;
			          }
			          processBuffer();
			          if (!new_mode.returnBegin && !new_mode.excludeBegin) {
			            mode_buffer = lexeme;
			          }
			        }
			        startNewMode(new_mode, lexeme);
			        return new_mode.returnBegin ? 0 : lexeme.length;
			      }
			
			      var end_mode = endOfMode(top, lexeme);
			      if (end_mode) {
			        var origin = top;
			        if (origin.skip) {
			          mode_buffer += lexeme;
			        } else {
			          if (!(origin.returnEnd || origin.excludeEnd)) {
			            mode_buffer += lexeme;
			          }
			          processBuffer();
			          if (origin.excludeEnd) {
			            mode_buffer = lexeme;
			          }
			        }
			        do {
			          if (top.className) {
			            result += spanEndTag;
			          }
			          if (!top.skip) {
			            relevance += top.relevance;
			          }
			          top = top.parent;
			        } while (top !== end_mode.parent);
			        if (end_mode.starts) {
			          startNewMode(end_mode.starts, '');
			        }
			        return origin.returnEnd ? 0 : lexeme.length;
			      }
			
			      if (isIllegal(lexeme, top))
			        throw new Error('Illegal lexeme "' + lexeme + '" for mode "' + (top.className || '<unnamed>') + '"');
			
			      /*
			      Parser should not reach this point as all types of lexemes should be caught
			      earlier, but if it does due to some bug make sure it advances at least one
			      character forward to prevent infinite looping.
			      */
			      mode_buffer += lexeme;
			      return lexeme.length || 1;
			    }
			
			    var language = getLanguage(name);
			    if (!language) {
			      throw new Error('Unknown language: "' + name + '"');
			    }
			
			    compileLanguage(language);
			    var top = continuation || language;
			    var continuations = {}; // keep continuations for sub-languages
			    var result = '', current;
			    for(current = top; current !== language; current = current.parent) {
			      if (current.className) {
			        result = buildSpan(current.className, '', true) + result;
			      }
			    }
			    var mode_buffer = '';
			    var relevance = 0;
			    try {
			      var match, count, index = 0;
			      while (true) {
			        top.terminators.lastIndex = index;
			        match = top.terminators.exec(value);
			        if (!match)
			          break;
			        count = processLexeme(value.substr(index, match.index - index), match[0]);
			        index = match.index + count;
			      }
			      processLexeme(value.substr(index));
			      for(current = top; current.parent; current = current.parent) { // close dangling modes
			        if (current.className) {
			          result += spanEndTag;
			        }
			      }
			      return {
			        relevance: relevance,
			        value: result,
			        language: name,
			        top: top
			      };
			    } catch (e) {
			      if (e.message && e.message.indexOf('Illegal') !== -1) {
			        return {
			          relevance: 0,
			          value: escape(value)
			        };
			      } else {
			        throw e;
			      }
			    }
			  }
			
			  /*
			  Highlighting with language detection. Accepts a string with the code to
			  highlight. Returns an object with the following properties:
			
			  - language (detected language)
			  - relevance (int)
			  - value (an HTML string with highlighting markup)
			  - second_best (object with the same structure for second-best heuristically
			    detected language, may be absent)
			
			  */
			  function highlightAuto(text, languageSubset) {
			    languageSubset = languageSubset || options.languages || objectKeys(languages);
			    var result = {
			      relevance: 0,
			      value: escape(text)
			    };
			    var second_best = result;
			    languageSubset.filter(getLanguage).forEach(function(name) {
			      var current = highlight(name, text, false);
			      current.language = name;
			      if (current.relevance > second_best.relevance) {
			        second_best = current;
			      }
			      if (current.relevance > result.relevance) {
			        second_best = result;
			        result = current;
			      }
			    });
			    if (second_best.language) {
			      result.second_best = second_best;
			    }
			    return result;
			  }
			
			  /*
			  Post-processing of the highlighted markup:
			
			  - replace TABs with something more useful
			  - replace real line-breaks with '<br>' for non-pre containers
			
			  */
			  function fixMarkup(value) {
			    return !(options.tabReplace || options.useBR)
			      ? value
			      : value.replace(fixMarkupRe, function(match, p1) {
			          if (options.useBR && match === '\n') {
			            return '<br>';
			          } else if (options.tabReplace) {
			            return p1.replace(/\t/g, options.tabReplace);
			          }
			      });
			  }
			
			  function buildClassName(prevClassName, currentLang, resultLang) {
			    var language = currentLang ? aliases[currentLang] : resultLang,
			        result   = [prevClassName.trim()];
			
			    if (!prevClassName.match(/\bhljs\b/)) {
			      result.push('hljs');
			    }
			
			    if (prevClassName.indexOf(language) === -1) {
			      result.push(language);
			    }
			
			    return result.join(' ').trim();
			  }
			
			  /*
			  Applies highlighting to a DOM node containing code. Accepts a DOM node and
			  two optional parameters for fixMarkup.
			  */
			  function highlightBlock(block) {
			    var node, originalStream, result, resultNode, text;
			    var language = blockLanguage(block);
			
			    if (isNotHighlighted(language))
			        return;
			
			    if (options.useBR) {
			      node = document.createElementNS('http://www.w3.org/1999/xhtml', 'div');
			      node.innerHTML = block.innerHTML.replace(/\n/g, '').replace(/<br[ \/]*>/g, '\n');
			    } else {
			      node = block;
			    }
			    text = node.textContent;
			    result = language ? highlight(language, text, true) : highlightAuto(text);
			
			    originalStream = nodeStream(node);
			    if (originalStream.length) {
			      resultNode = document.createElementNS('http://www.w3.org/1999/xhtml', 'div');
			      resultNode.innerHTML = result.value;
			      result.value = mergeStreams(originalStream, nodeStream(resultNode), text);
			    }
			    result.value = fixMarkup(result.value);
			
			    block.innerHTML = result.value;
			    block.className = buildClassName(block.className, language, result.language);
			    block.result = {
			      language: result.language,
			      re: result.relevance
			    };
			    if (result.second_best) {
			      block.second_best = {
			        language: result.second_best.language,
			        re: result.second_best.relevance
			      };
			    }
			  }
			
			  /*
			  Updates highlight.js global options with values passed in the form of an object.
			  */
			  function configure(user_options) {
			    options = inherit(options, user_options);
			  }
			
			  /*
			  Applies highlighting to all <pre><code>..</code></pre> blocks on a page.
			  */
			  function initHighlighting() {
			    if (initHighlighting.called)
			      return;
			    initHighlighting.called = true;
			
			    var blocks = document.querySelectorAll('pre code');
			    ArrayProto.forEach.call(blocks, highlightBlock);
			  }
			
			  /*
			  Attaches highlighting to the page load event.
			  */
			  function initHighlightingOnLoad() {
			    addEventListener('DOMContentLoaded', initHighlighting, false);
			    addEventListener('load', initHighlighting, false);
			  }
			
			  function registerLanguage(name, language) {
			    var lang = languages[name] = language(hljs);
			    if (lang.aliases) {
			      lang.aliases.forEach(function(alias) {aliases[alias] = name;});
			    }
			  }
			
			  function listLanguages() {
			    return objectKeys(languages);
			  }
			
			  function getLanguage(name) {
			    name = (name || '').toLowerCase();
			    return languages[name] || languages[aliases[name]];
			  }
			
			  /* Interface definition */
			
			  hljs.highlight = highlight;
			  hljs.highlightAuto = highlightAuto;
			  hljs.fixMarkup = fixMarkup;
			  hljs.highlightBlock = highlightBlock;
			  hljs.configure = configure;
			  hljs.initHighlighting = initHighlighting;
			  hljs.initHighlightingOnLoad = initHighlightingOnLoad;
			  hljs.registerLanguage = registerLanguage;
			  hljs.listLanguages = listLanguages;
			  hljs.getLanguage = getLanguage;
			  hljs.inherit = inherit;
			
			  // Common regexps
			  hljs.IDENT_RE = '[a-zA-Z]\\w*';
			  hljs.UNDERSCORE_IDENT_RE = '[a-zA-Z_]\\w*';
			  hljs.NUMBER_RE = '\\b\\d+(\\.\\d+)?';
			  hljs.C_NUMBER_RE = '(-?)(\\b0[xX][a-fA-F0-9]+|(\\b\\d+(\\.\\d*)?|\\.\\d+)([eE][-+]?\\d+)?)'; // 0x..., 0..., decimal, float
			  hljs.BINARY_NUMBER_RE = '\\b(0b[01]+)'; // 0b...
			  hljs.RE_STARTERS_RE = '!|!=|!==|%|%=|&|&&|&=|\\*|\\*=|\\+|\\+=|,|-|-=|/=|/|:|;|<<|<<=|<=|<|===|==|=|>>>=|>>=|>=|>>>|>>|>|\\?|\\[|\\{|\\(|\\^|\\^=|\\||\\|=|\\|\\||~';
			
			  // Common modes
			  hljs.BACKSLASH_ESCAPE = {
			    begin: '\\\\[\\s\\S]', relevance: 0
			  };
			  hljs.APOS_STRING_MODE = {
			    className: 'string',
			    begin: '\'', end: '\'',
			    illegal: '\\n',
			    contains: [hljs.BACKSLASH_ESCAPE]
			  };
			  hljs.QUOTE_STRING_MODE = {
			    className: 'string',
			    begin: '"', end: '"',
			    illegal: '\\n',
			    contains: [hljs.BACKSLASH_ESCAPE]
			  };
			  hljs.PHRASAL_WORDS_MODE = {
			    begin: /\b(a|an|the|are|I'm|isn't|don't|doesn't|won't|but|just|should|pretty|simply|enough|gonna|going|wtf|so|such|will|you|your|like)\b/
			  };
			  hljs.COMMENT = function (begin, end, inherits) {
			    var mode = hljs.inherit(
			      {
			        className: 'comment',
			        begin: begin, end: end,
			        contains: []
			      },
			      inherits || {}
			    );
			    mode.contains.push(hljs.PHRASAL_WORDS_MODE);
			    mode.contains.push({
			      className: 'doctag',
			      begin: '(?:TODO|FIXME|NOTE|BUG|XXX):',
			      relevance: 0
			    });
			    return mode;
			  };
			  hljs.C_LINE_COMMENT_MODE = hljs.COMMENT('//', '$');
			  hljs.C_BLOCK_COMMENT_MODE = hljs.COMMENT('/\\*', '\\*/');
			  hljs.HASH_COMMENT_MODE = hljs.COMMENT('#', '$');
			  hljs.NUMBER_MODE = {
			    className: 'number',
			    begin: hljs.NUMBER_RE,
			    relevance: 0
			  };
			  hljs.C_NUMBER_MODE = {
			    className: 'number',
			    begin: hljs.C_NUMBER_RE,
			    relevance: 0
			  };
			  hljs.BINARY_NUMBER_MODE = {
			    className: 'number',
			    begin: hljs.BINARY_NUMBER_RE,
			    relevance: 0
			  };
			  hljs.CSS_NUMBER_MODE = {
			    className: 'number',
			    begin: hljs.NUMBER_RE + '(' +
			      '%|em|ex|ch|rem'  +
			      '|vw|vh|vmin|vmax' +
			      '|cm|mm|in|pt|pc|px' +
			      '|deg|grad|rad|turn' +
			      '|s|ms' +
			      '|Hz|kHz' +
			      '|dpi|dpcm|dppx' +
			      ')?',
			    relevance: 0
			  };
			  hljs.REGEXP_MODE = {
			    className: 'regexp',
			    begin: /\//, end: /\/[gimuy]*/,
			    illegal: /\n/,
			    contains: [
			      hljs.BACKSLASH_ESCAPE,
			      {
			        begin: /\[/, end: /\]/,
			        relevance: 0,
			        contains: [hljs.BACKSLASH_ESCAPE]
			      }
			    ]
			  };
			  hljs.TITLE_MODE = {
			    className: 'title',
			    begin: hljs.IDENT_RE,
			    relevance: 0
			  };
			  hljs.UNDERSCORE_TITLE_MODE = {
			    className: 'title',
			    begin: hljs.UNDERSCORE_IDENT_RE,
			    relevance: 0
			  };
			  hljs.METHOD_GUARD = {
			    // excludes method names from keyword processing
			    begin: '\\.\\s*' + hljs.UNDERSCORE_IDENT_RE,
			    relevance: 0
			  };
			
			  return hljs;
			}));
	'''
	}
	
	def createCSS(){
		return '''
			/*
			
			Original highlight.js style (c) Ivan Sagalaev <maniac@softwaremaniacs.org>
			
			*/
			
			.annotation__content { 
				height: 100%;
				width: auto; 
				min-width: 500px;
			}
			.header {
			  position: fixed;
			  top: 0;
			  left: 0;
			  width: 100%;
			  height: 48px;
			  z-index: 10;
			  background: #eeeeee;
			  -webkit-box-shadow: 0 7px 8px rgba(0, 0, 0, 0.12);
			  -moz-box-shadow: 0 7px 8px rgba(0, 0, 0, 0.12);
			  box-shadow: 0 7px 8px rgba(0, 0, 0, 0.12);
			}
			
			.header__content-text {
			  text-align: center;
			  margin:12.5px auto;
			}
			
			.page__content-container {
			  margin: 100px auto;
			  width: auto;
			  padding: 30px;
			}
			
			.container {
			  margin: 0 auto;
			  padding: 0 24px;
			}
			.content {
			  padding: 48px 0;
			  border-bottom: solid 2px #cfcfcf;
			}
			
			.content__footer {
			  margin-top: 12px;
			  text-align: center;
			}
			
			.overlay  {
			  border-radius: 0 .5em .5em;	
			  border: 1px solid;
			  padding: .5em;
			  margin: .5em;
			} 
			button { 
			  padding: .5em 1em;
			  margin: .5em;
			  font-size: 1em;
			  background: #666; 
			  border: 1px solid #333;
			  color: white;
			  cursor: pointer; 
			}
			 
			.overlayHidden {
			  display: none;
			}
			 
			.overlay { 
			  width: 20em; 
			  background: #fffbf0; 
			  border: 1px solid #e7c157;
			  position: absolute;
			  top: 10%;
			  right: 30%;
			  margin: auto;
			  padding: 1em;
			}
			 
			#close {
			  position: absolute;
			  margin: 0;
			  right: 0;
			  top: 0;
			  background: #c32e04;
			  color: white; 
			  font: bold 0/0 sans-serif;
			}
			
			
			.hljs {
			  display: block;
			  overflow-x: auto;
			  padding: 0.5em;
			  background: #F0F0F0;
			}
			
			
			/* Base color: saturation 0; */
			
			.hljs,
			.hljs-subst {
			  color: #444;
			}
			
			.hljs-comment {
			  color: #888888;
			}
			
			.hljs-keyword,
			.hljs-attribute,
			.hljs-selector-tag,
			.hljs-meta-keyword,
			.hljs-doctag,
			.hljs-name {
			  font-weight: bold;
			}
			
			
			/* User color: hue: 0 */
			
			.hljs-type,
			.hljs-string,
			.hljs-number,
			.hljs-selector-id,
			.hljs-selector-class,
			.hljs-quote,
			.hljs-template-tag,
			.hljs-deletion {
			  color: #880000;
			}
			
			.hljs-title,
			.hljs-section {
			  color: #880000;
			  font-weight: bold;
			}
			
			.hljs-regexp,
			.hljs-symbol,
			.hljs-variable,
			.hljs-template-variable,
			.hljs-link,
			.hljs-selector-attr,
			.hljs-selector-pseudo {
			  color: #BC6060;
			}
			
			
			/* Language color: hue: 90; */
			
			.hljs-literal {
			  color: #78A960;
			}
			
			.hljs-built_in,
			.hljs-bullet,
			.hljs-code,
			.hljs-addition {
			  color: #397300;
			}
			
			
			/* Meta color: hue: 200 */
			
			.hljs-meta {
			  color: #1f7199;
			}
			
			.hljs-meta-string {
			  color: #4d99bf;
			}
			
			
			/* Misc effects */
			
			.hljs-emphasis {
				font-style: italic;
			}
			
			.hljs-strong {
				font-weight: bold;
			}
			
			.annotations {
				list-style: none;
				margin: 0;
				padding: 0;
			}
			
			.annotation {
				justify-content: space-between;
				padding: 12px 0;
				border-bottom: solid 1px #dfdfdf;
			}
			
			.annotation:last-child {
				border-bottom: none;
			}
			
			.context-menu {
				display: none;
				position: absolute;
				z-index: 10;
				padding: 12px 0;
				width: 240px;
				background-color: #fff;
				border: solid 1px #dfdfdf;
				box-shadow: 1px 1px 2px #cfcfcf;
			}
			
			.context-menu--active {
				display: block;
			}
			
			.context-menu__items {
				list-style: none;
				margin: 0;
				padding: 0;
			}
			
			.context-menu__item {
				display: block;
				margin-bottom: 4px;
			}
			
			.context-menu__item:last-child {
				margin-bottom: 0;
			}
			
			.context-menu__link {
				display: block;
				padding: 4px 12px;
				color: #0066aa;
				text-decoration: none;
			}
			
			.context-menu__link:hover {
				color: #fff;
				background-color: #0066aa;
			}
			p {
				margin:0;
				padding:0;
			}
			a {
				pointer-events:auto;
			}
			a {
				pointer-events:auto;
			}
			a {
				pointer-events:auto;
			}
			.dynAnnotation[contenteditable="true"] {
				font-family: "Courier New", Courier, monospace;
				
				border:2px dotted #bfbfbf;
				color: #000000;
				border-radius: 5px 5px 5px 5px;
				-webkit-border-radius: 5px 5px 5px 5px;
				-moz-border-radius: 5px 5px 5px 5px;
				font-family: Verdana;
				width: auto;
				height: auto;
				font-size: 12px;
				padding: 0px 5px;
				box-shadow: inset 0 1px 0 0 #fff,inset 0 -1px 0 0 #d9d9d9,inset 0 0 0 1px #f2f2f2,0 2px 4px 0 #f2f2f2;
				-moz-box-shadow: inset 0 1px 0 0 #fff,inset 0 -1px 0 0 #d9d9d9,inset 0 0 0 1px #f2f2f2,0 2px 4px 0 #f2f2f2;
				-webkit-box-shadow: inset 0 1px 0 0 #fff,inset 0 -1px 0 0 #d9d9d9,inset 0 0 0 1px #f2f2f2,0 2px 4px 0 #f2f2f2;
				text-shadow: 0 1px 0 #fff;
				background-image: linear-gradient(to left, #f2f2f2, #f2f2f2);
				background-color: #f2f2f2;
				opacity : 1;
			}
			.dynAnnotation[contenteditable="false"] {
				font-family: "Courier New", Courier, monospace;
				
				border:1px solid #8c8c8c;
				color: #000000;
				border-radius: 5px 5px 5px 5px;
				-webkit-border-radius: 5px 5px 5px 5px;
				-moz-border-radius: 5px 5px 5px 5px;
				font-family: Verdana;
				width: auto;
				height: auto;
				font-size: 12px;
				padding: 0px 5px;
				box-shadow: inset 0 1px 0 0 #fff,inset 0 -1px 0 0 #d9d9d9,inset 0 0 0 1px #f2f2f2,0 2px 4px 0 #f2f2f2;
				-moz-box-shadow: inset 0 1px 0 0 #fff,inset 0 -1px 0 0 #d9d9d9,inset 0 0 0 1px #f2f2f2,0 2px 4px 0 #f2f2f2;
				-webkit-box-shadow: inset 0 1px 0 0 #fff,inset 0 -1px 0 0 #d9d9d9,inset 0 0 0 1px #f2f2f2,0 2px 4px 0 #f2f2f2;
				text-shadow: 0 1px 0 #fff;
				background-image: linear-gradient(to left, #f2f2f2, #f2f2f2);
				background-color: #f2f2f2;
				opacity : 1;
			}
			.dynAnnotation[contenteditable="true"]:hover, .dynAnnotation[contenteditable="true"]:active{
				border:2px solid #8c8c8c;
				color: #000000;
				box-shadow: inset 0 1px 0 0 #ffffff,inset 0 -1px 0 0 #d9d9d9,inset 0 0 0 1px #f2f2f2;
				-moz-box-shadow: inset 0 1px 0 0 #ffffff,inset 0 -1px 0 0 #d9d9d9,inset 0 0 0 1px #f2f2f2;
				-webkit-box-shadow: inset 0 1px 0 0 #ffffff,inset 0 -1px 0 0 #d9d9d9,inset 0 0 0 1px #f2f2f2;
				background-color: #f2f2f2;
				opacity : 1.0;
			}
			
		''';
	}
	def public String extractAnnotations(File htmlFile) {
		var String annotations = "";
		if (htmlFile.exists()){
			try {
				var FileInputStream in = new FileInputStream(htmlFile);
				var byte[] buf = newByteArrayOfSize(4096);
				var String oldHTML = "";
				for(var int length = -1;(length = in.read(buf)) > 0;){
					oldHTML += new String(buf,0,length,"UTF-8");
				}
				in.close();
				var Pattern annotationPattern = Pattern.compile("<span(?:(?: class=\"annotation_container\")|(?: id=\"annotation_container\"))(?:(?: class=\"annotation_container\")|(?: id=\"annotation_container\"))(?: class=\"annotation_container\")?(?: style=\"[^\"]*\")?>(.*)</span>",Pattern.DOTALL.bitwiseOr(Pattern.MULTILINE));
				var Matcher matcher = annotationPattern.matcher(oldHTML);
				while(matcher.find()){
					annotations += matcher.group(1) ;
				}
				annotations = annotations.trim();
				if (!annotations.isEmpty()){
					annotations += "\n";
				}
				//annotations.substring(annotations.length()-50);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return annotations;
	}
}