package lu.ses.engineering.spell.revisiontools.preferences;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.Icon;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.egit.core.EclipseGitProgressTransformer;
import org.eclipse.egit.core.internal.util.ResourceUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.XMLSave.XMLTypeInfo;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLSaveImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLString;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.SubmoduleAddCommand;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.IWorkingSetManager;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IOConsoleInputStream;
import org.eclipse.ui.console.IOConsoleOutputStream;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.services.IServiceLocator;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.util.Strings;
import org.osgi.service.prefs.BackingStoreException;

import com.astra.ses.spell.dev.database.DatabaseDriverManager;
import com.astra.ses.spell.dev.database.DatabaseManager;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabaseDriver;
import com.astra.ses.spell.dev.database.properties.ProjectDatabaseProperty;
import com.google.inject.Guice;
import com.google.inject.Injector;

import es.gmv.views.AndColumn;
import es.gmv.views.DocumentRoot;
import es.gmv.views.MetaInformation;
import es.gmv.views.Row;
import es.gmv.views.ViewsFactory;
import es.gmv.views.Xmltabulardisplaydefinition;
import lu.ses.engineering.spell.controlflow.SpellGrammarRuntimeModule;
import lu.ses.engineering.spell.controlflow.spell.DisplayStep;
import lu.ses.engineering.spell.controlflow.spell.SpellElement;
import lu.ses.engineering.spell.controlflow.spell.Step;
import lu.ses.engineering.spell.controlflow.spell.file_input;
import lu.ses.engineering.spell.flow_analysis.PythonHandler;
import lu.ses.engineering.spell.refactoring.RefactoringDefinitionRuntimeModule;
import lu.ses.engineering.spell.refactoring.refactoringDefinition.Refactorings;
import lu.ses.engineering.spell.revisiontools.Activator;
import lu.ses.engineering.spell.revisiontools.Code_Coverage;
import lu.ses.engineering.spell.revisiontools.IOConsoleThread;
import lu.ses.engineering.spell.revisiontools.SpellFixer;
import lu.ses.engineering.spell.revisiontools.abort.AbortScriptCommandHandler;
import lu.ses.engineering.spell.revisiontools.hyperlinks.CompareHyperlink;
import lu.ses.engineering.spell.taskflow.digraph.DiGraph;
import lu.ses.engineering.spell.taskflow.digraph.DiGraphNode;

public class ExecutePythonScriptAction extends Action {
	public final String TOOLS_UPDATE_PATH = "\\\\beafs1\\spell\\OPAToolsWS\\OPA_SPELL_Tools\\plugins\\";
	protected Shell shell;
	protected List<IProject> selectedProjects;
	protected IOConsole myConsole;
	protected IWorkbenchPart target;
	protected int offset = 0;	
	private ScriptMenuBuilder scriptMenuBuilder;
	private IServiceLocator serviceLocator;
	private String errorMessage;
	private ISelection selectionOverride;
	private Process process;
	private static Injector injector;
	private static XtextResource refactoringResource;
	private static Injector injector2;
	private static XtextResource spellResource;
	private static boolean inited = false;
	public static void init() {
		if (inited)
			return;
		inited = true;
		injector = Guice.createInjector(new RefactoringDefinitionRuntimeModule());
		refactoringResource = injector.getInstance(XtextResource.class);
		injector2 = Guice.createInjector(new SpellGrammarRuntimeModule());
		spellResource = injector2.getInstance(XtextResource.class);
	}
	
	public String fixSpellEndTags(){
		HashSet<IProject> projects = new HashSet<IProject>();
		for (Object selObj : selectedProjects) {
			IProject iProject = fixSpellResource(selObj);
			if (iProject != null){
				projects.add(iProject);
			}
		}
		String result = "[";
		for (IProject iProject : projects) {
			result += "'"+iProject.getName()+"',";
		}
		
		return result += "]";
	}

	private IProject fixSpellResource(Object selObj) {
		try {
			SpellFixer spellFixer = new SpellFixer();
			String location = "";
			if (selObj instanceof IProject){
				IProject iProject = (IProject) selObj;
				iProject.accept(new IResourceVisitor() {
					
					@Override
					public boolean visit(IResource resource) throws CoreException {
						fixSpellResource(resource);
						return true;
					}
				});
				return iProject;
			} else if (selObj instanceof IFile){
				IFile iProject = (IFile) selObj;
				location = iProject.getLocation().toString().replaceAll("/", "\\\\");
				if (location != null && !location.isEmpty() && location.endsWith(".py"))
					spellFixer.processFile(location);
				
				return iProject.getProject();
				
			} else if (selObj instanceof IFolder){
				IFolder iProject = (IFolder) selObj;
				iProject.accept(new IResourceVisitor() {
					
					@Override
					public boolean visit(IResource resource) throws CoreException {
						fixSpellResource(resource);
						return true;
					}
				});
				return iProject.getProject();
			}

		} catch (Exception ex){

		}
		return null;
	}
	
	
	private String handleIResourceDot(final String detail,final ArrayList<Refactorings> ref,final IResource iFile){
		final StringBuilder graphList = new StringBuilder();
		if (iFile instanceof IFile){
			if ("py".equals(((IFile)iFile).getFileExtension()))
				graphList.append(createDotGraphFromIFile(detail, ref, (IFile) iFile) + ",");
		} else if (iFile instanceof IFolder) {
			IFolder iFolder = (IFolder) iFile;
			try {
				iFolder.accept(new IResourceVisitor() {
					
					@Override
					public boolean visit(IResource resource) throws CoreException {
						if (resource.equals(iFile)){
							return true;
						}
						String result = handleIResourceDot(detail, ref, resource);
						graphList.append(result);
						return false;
					}
				});
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return graphList.toString();
	}
	public String createDotGraph(String detail){
		try {
			init();
			ISelection selection = getSelection(null);
			final List<IResource> files;
			if (selection instanceof TreeSelection){
				TreeSelection s = (TreeSelection) selection;
				files = s.toList();

			} else if (selection instanceof StructuredSelection){
				StructuredSelection s = (StructuredSelection) selection;
				files = s.toList();
				//System.err.println("ERROR: Unknown selection type: " + selection);
			} else {
				files = new ArrayList<IResource>();
			}
			String graphList = "{";
			ArrayList<Refactorings> refactorings = new ArrayList<Refactorings>();
			for (IResource iFile : files) {
				graphList += handleIResourceDot(detail,refactorings,iFile);
			}
			graphList += "}";
			return graphList;
		} catch (Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	private String wrap(String text){
		return postProcessLabel(Strings.wordWrap(text.replace("\n", "\\\\n") , 60));
	}
	public String postProcessLabel(String in){
		//System.out.println();
		return in.replaceAll("(?<!\\\\)([|<>\"'])", "\\\\\\\\$1");
	}
	
	private String createDotGraphFromIFile(String detail, ArrayList<Refactorings> refactorings, IFile iFile) {
		String graphList = "";
		try {
			String pyCode = SpellFixer.getInstance().processFileOnTheFly(iFile.getLocationURI().toString().substring("file:/".length()));;
			InputStream in = new ByteArrayInputStream(pyCode.getBytes());		

			try {
				spellResource.unload();
			} catch (Exception e){

			}

			spellResource.load(in, null);
			if (!spellResource.getContents().isEmpty()){
				EObject eObject = spellResource.getContents().get(0);
				for (Diagnostic errors :spellResource.getErrors()) {
					System.err.println("Parsing ERROR line "+errors.getLine()+ ": " + errors.getMessage());
				}
				file_input spellProc = (file_input) eObject;
				PythonHandler handler = null;
				try {
					spellProc.addControlFlowInformation();
					handler = new PythonHandler(iFile,DatabaseManager.getInstance().getProjectDatabase(iFile), refactorings,Activator.getDefault().getPreferenceStore());
					handler.handle(spellProc);
					handler.waitForResult();
				} catch (Throwable t){
					t.printStackTrace();
				}
				System.out.println(handler.getStepFlowInformation());
				//System.out.println();
				
				DiGraph diGraph = handler.getDiGraph();
				
				String splineType = Activator.getDefault().getPreferenceStore().getString("DotSplineType");
				diGraph.setSplineType(splineType);
				diGraph.setDetailLevel(detail);
				String diGraphResult = diGraph.createDiGraph(handler);
				
				graphList += "'" + iFile.getLocationURI().toString().substring("file:/".length()) + "':'''" + diGraphResult + "'''";
				/*if (result.isEmpty()){
							result += iFile.getLocationURI().toString().substring("file:/".length());
						} else {
							result +="," + iFile.getLocationURI().toString().substring("file:/".length());
						}*/
				in.close();
				spellResource.getErrors().clear();


				//spellProc.clearControlFlowInformation();
				//FileOutputStream out = new FileOutputStream(iFile.getLocationURI().toString().substring("file:/".length()));

				//spellResource.save(out,SaveOptions.newBuilder().noValidation().getOptions().toOptionsMap());
				//out.close();
				//for (Diagnostic errors :spellResource.getErrors()) {
				//	System.err.println("Save ERROR line "+errors.getLine()+ ": " + errors.getMessage());
				//}
				//iFile.refreshLocal(IResource.DEPTH_ZERO, new NullProgressMonitor());
				
			} else {
				in.close();
			}

			System.out.println("\n\n\n\n\n******************************************\n\n\n");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("\n\n\n\n\n******************************************\n\n\n");
		}
		return graphList;
	}
	
	public String recreateWorkingSets(){
		//File directory = new File("M://Workspace//");
		//if (!directory.exists()){
		
		HashMap<String,List<String>> projectToProjectType = new HashMap<String, List<String>>();
		
		for (IProject iProject2 : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			
			String type = getPlatformString(iProject2.getLocation().toFile());
			if (type.startsWith("'") || type.startsWith("\""))
				type = type.substring(1,type.length()-1);
			List<String> projectList = projectToProjectType.get(type);
			if (projectList == null){
				projectToProjectType.put(type, projectList = new ArrayList<String>());
			}
			projectList.add(iProject2.getName());
		}
		
		for (Entry<String, List<String>> entry : projectToProjectType.entrySet()) {
			String projectType = entry.getKey();
			ArrayList<IAdaptable> entries = new ArrayList<IAdaptable>();
			IWorkingSet workingSet = createWorkingSet(projectType);
			List<String> projectList = entry.getValue();
			for (String project : projectList) {
				IProject iProject = ResourcesPlugin.getWorkspace().getRoot().getProject(project);
				
				entries.add(iProject);
			}
			workingSet.setElements(workingSet.adaptElements(entries.toArray(new IAdaptable[entries.size()])));
		}
		return "True";
				
	}
	
	public String closeWorkingSets(){
		ElementListSelectionDialog dlg = new ElementListSelectionDialog(Display.getDefault().getActiveShell(),new LabelProvider(){
			public String getText(Object element) {
				return ((IProject)element).getName() + " (" + getPlatformString(((IProject)element).getLocation().toFile()) + ")";
			}
		});
		dlg.setMultipleSelection(true);
		dlg.setFilter("**");
		dlg.setIgnoreCase(true);
		
		dlg.setMessage("Please select the satellite projects that should be closed.");
		//File directory = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
		
		ArrayList<IProject> openedProjects = new ArrayList<IProject>();
		for (IProject iProject : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			if (iProject.isOpen()){
				openedProjects.add(iProject);
			}
		}
		
		dlg.setElements(openedProjects.toArray());/* filter just files if you need to */
		
		if (dlg.open() != Window.OK){
			return null;
		}
		
		Object[] result = dlg.getResult();
		
		
		for (Object obj : result) {
			IProject project = (IProject) obj;
			
			String type = getPlatformString(project.getLocation().toFile());
			
			if (type.startsWith("'") || type.startsWith("\""))
				type = type.substring(1,type.length()-1);
			
			try {
				project.close(new NullProgressMonitor());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				return e.getMessage();
			}
		}
	
		return "True";
	}
		
	public String openWorkingSets(){
		ElementListSelectionDialog dlg = new ElementListSelectionDialog(Display.getDefault().getActiveShell(),new LabelProvider(){
			public String getText(Object element) {
				return ((IProject)element).getName() + " (" + getPlatformString(((IProject)element).getLocation().toFile()) + ")";
			}
		});
		dlg.setMultipleSelection(true);
		dlg.setFilter("**");
		dlg.setIgnoreCase(true);
		
		dlg.setMessage("Please select the satellite projects that should be open.");
		//File directory = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
	
		ArrayList<IProject> openedProjects = new ArrayList<IProject>();
		for (IProject iProject : ResourcesPlugin.getWorkspace().getRoot().getProjects()) {
			if (!iProject.isOpen()){
				openedProjects.add(iProject);
			}
		}
		
		dlg.setElements(openedProjects.toArray());/* filter just files if you need to */
		if (dlg.open() != Window.OK){
			return null;
		}
		
		Object[] result = dlg.getResult();
		
		
		for (Object obj : result) {
			IProject project = (IProject) obj;
			String type = getPlatformString(project.getLocation().toFile());
			if (type.startsWith("'") || type.startsWith("\""))
				type = type.substring(1,type.length()-1);
			
			try {
				project.open(new NullProgressMonitor());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				return e.getMessage();
			}
		}
	
		return "True";
	}
	
	
	private IWorkingSet createWorkingSet(String name){
		if (name == null || name.isEmpty()){
			name = "Unknown";
		}
		IWorkingSetManager manager = Activator.getDefault().getWorkbench().getWorkingSetManager();
		IWorkingSet existingWorkingSet = manager.getWorkingSet(name);

		if (existingWorkingSet != null){
			System.out.println("WorkingSet already exists:" + name + " := " + existingWorkingSet);
			return existingWorkingSet;
		}
		IWorkingSet newWorkingSet = manager.createWorkingSet(name,new IAdaptable[]{});
		manager.addWorkingSet(newWorkingSet);
		newWorkingSet.setLabel(name);
		System.out.println("Created WorkingSet:" + name + " := " + newWorkingSet);
		return newWorkingSet;
	}
	public String updateProjectsDatabases(final String dbDriver,final String basePath){
		return updateProjectsDatabases(dbDriver, basePath.split(","));
	}
	
	public static String getFileID(String defId){
		return defId.substring(0, defId.lastIndexOf("."));
	}
	private static String getPageType() {
		String[] options = new String[]{"HiFly Views","Vision"};
		int idx = showOptionDialog("Do you want to create a Hifly Views page or a Vision page?", "TM Page Type Selection", MessageDialog.QUESTION, null, options , 0);
		return options[idx];
	}
	public static int showOptionDialog(String message, String title, int messageType,
		Icon icon, String[] options, int initialValue) {

		Shell shell = new Shell(Display.getDefault().getActiveShell());
		MessageDialog dialog = new MessageDialog(shell, title, null,
				message, messageType, options, initialValue);

		int result = dialog.open();
		shell.dispose();
		return result;
	}
	
	private static void handleXmltabulardisplaydefinition(String id,
			Xmltabulardisplaydefinition def,String type) {
		def.setVersion("0");
		def.setKindOfDisplay("AND");
		String defId = getFileID(id);
		def.setIdentifier(defId);
		def.setScrollable(true);
		/*
		 
		 
		 
		     <column visible="true" name="PID"/>
    <column visible="true" name=/>
    <column visible="true" name=/>
    <column visible="true" name=/>
    <column visible="true" name="Unit"/>
    <column visible="false" name="Validity"/>
    <column visible="false" name="OOL"/>
    <column visible="false" name="Pkt mnemonic"/>
    <column visible="false" name="Description"/>
    <column visible="false" name="Sample time"/>
    <column visible="false" name="Note"/>
		 
		 
		 */
		String[] visionNames   = new String[]{
				"PID" ,"MNEMONIC","Value","Raw" ,"Unit","Validity","OOL"  ,"Pkt mnemonic","Description","Sample time","Note"
		};
		String[] visionVisible = new String[]{
				"true","true"    ,"true" ,"false","true","false"   ,"false","false"       ,"false"      ,"false"      ,"false"
				
		};	
		
		String[] hiflyNames   = new String[]{
				"Name" ,"Description","Value","Raw" ,"Unit","Validity","OOL"  ,"Pkt mnemonic","SSC","Sample time","Note"
		};
		String[] hiflyVisible = new String[]{
				"true","true"    ,"true" ,"false","false","false"   ,"true","false"       ,"false"      ,"false"      ,"false"
				
		};	
		
		if (!type.equalsIgnoreCase("HiFly Views") && !type.equalsIgnoreCase("Vision")){
			System.out.println("Please select the type of page you want to create.");
			type = getPageType();
		}

		String[] names = null;
		String[] visible = null;
		
		if (type.equalsIgnoreCase("HiFly Views")){
			names = hiflyNames;
			visible = hiflyVisible;
		} else {
			names = visionNames;
			visible = visionVisible;
		}
		
		for (int i = 0; i < visible.length; i++) {
			AndColumn col1 = ViewsFactory.eINSTANCE.createAndColumn();
			col1.setName(names[i]);
			col1.setVisible(visible[i]);
			def.getColumn().add(col1);
		}

		MetaInformation info = ViewsFactory.eINSTANCE.createMetaInformation();
		def.setMetaInformation(info);
		info.setDescription("");
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(new Date());
		XMLGregorianCalendar date2;
		try {
			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			date2.setTimezone(0);
			info.setDate(date2);
			
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		info.setParameterList(ViewsFactory.eINSTANCE.createParameterList());

	}
	private void saveData(IFile target, Xmltabulardisplaydefinition obj) throws IOException {  
		Object old = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get("xml");
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"xml", new XMLResourceFactoryImpl(){
					@Override
					public Resource createResource(URI uri) {
						XMLResourceImpl result = new XMLResourceImpl(uri){
							@Override
							protected XMLSave createXMLSave() {
								// TODO Auto-generated method stub
								return new XMLSaveImpl(createXMLHelper()){
									@Override
									protected void init(XMLResource resource,
											Map<?, ?> options) {
										super.init(resource, options);

										String temporaryFileName = null;
										if (Boolean.TRUE.equals(options.get(XMLResource.OPTION_USE_FILE_BUFFER)))
										{
											try
											{
												temporaryFileName = File.createTempFile("XMLSave", null).getPath();
											}
											catch (IOException exception)
											{
												// If we can't create a temp file then we have to ignore the option.
											}
										}
										Integer lineWidth = (Integer)options.get(XMLResource.OPTION_LINE_WIDTH);
										int effectiveLineWidth = lineWidth == null ? Integer.MAX_VALUE : lineWidth;
										String publicId = null, systemId = null;
										if (resource != null && Boolean.TRUE.equals(options.get(XMLResource.OPTION_SAVE_DOCTYPE)))
										{
											publicId = resource.getPublicId();
											systemId = resource.getSystemId();
										}

										doc = new XMLString(effectiveLineWidth, publicId, systemId, temporaryFileName){
											@Override
											protected String getElementIndent() {
												// TODO Auto-generated method stub
												return "";
											}
											
											@Override
											protected String getAttributeIndent() {
												// TODO Auto-generated method stub
												return "";
											}
											
											@Override
											protected String getElementIndent(
													int extra) {
												// TODO Auto-generated method stub
												return "";
											}
										};
										;
									}
								};
							}

							@Override
							protected XMLHelper createXMLHelper() {
								// TODO Auto-generated method stub
								return new XMLHelperImpl(this){


									@Override
									protected URI getHREF(Resource otherResource, EObject obj)
									{
										return null;
										//if (otherResource.getURI() == null)
										//	return null;
									    //return otherResource.getURI().appendFragment(getURIFragment(otherResource, obj));
									  }
									@Override
									 public String getHREF(EObject obj){
										 return null;
									 }
									
								};
								
								 
							}
							protected EList<EObject> contents;
							 
							@Override
							public EList<EObject> getContents() {
								if (contents == null)
								{
									contents = new org.eclipse.emf.common.util.BasicEList<EObject>();
								}
								return contents;
							}
						};
						
						result.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, new BasicExtendedMetaData());

						result.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, new BasicExtendedMetaData());
						
						result.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.FALSE);

						result.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
						return result;

					}
				});
		
		
		
		final ResourceSet resourceSet = new ResourceSetImpl();
		// Use XML resource instead
		Resource xmlResource = resourceSet.createResource(URI.createFileURI(target.getLocationURI().toString().substring("file:/".length())));
		DocumentRoot root = ViewsFactory.eINSTANCE.createDocumentRoot();
		root.setXmltabulardisplaydefinition(obj);
		root.getXMLNSPrefixMap().put("ns2", "http://www.gmv.es/views");
		root.getXSISchemaLocation().clear();
		xmlResource.getContents().add(root);
		try {
			HashMap map = new HashMap<Object, Object>();
			XMLTypeInfo i = new XMLTypeInfo() {
				
				@Override
				public boolean shouldSaveType(EClass objectType, EClass featureType,
						EStructuralFeature feature) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public boolean shouldSaveType(EClass objectType, EClassifier featureType,
						EStructuralFeature feature) {
					// TODO Auto-generated method stub
					return false;
				}
			};
			map.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION,i);
			xmlResource.save(map);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
					"xml",old);
		} catch (IOException e) {
			System.err.println("Failed to translate \"" + target.toString() + "\" reason was " + e.toString());
			e.printStackTrace();
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
					"xml",old);
			return;
		}
	
	}
	
	@SuppressWarnings("restriction")
	public String createTMPage(String type) {
		try {
			init();
			ISelection selection = getSelection(null);
			final List<IResource> files;
			if (selection instanceof TreeSelection){
				TreeSelection s = (TreeSelection) selection;
				files = s.toList();

			} else if (selection instanceof StructuredSelection){
				StructuredSelection s = (StructuredSelection) selection;
				files = s.toList();
				//System.err.println("ERROR: Unknown selection type: " + selection);
			} else {
				files = new ArrayList<IResource>();
			}
			Job tmPageJob = new Job("TM Page Job") {
				
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					monitor.beginTask("Creating TM Pages", files.size());
					for (IResource source : files) {
						if (source instanceof IFile) {
							monitor.subTask("Handling " + source.getName());
							String targetPath = "TMPages/displays/pages/user/proc_pages/" + source.getName().replaceFirst(".py", ".xml");
							//String oldTarget = source.getProjectRelativePath().toString().replaceFirst("Procedures", "TMPages").replaceFirst(".py", ".xml");
							IFile targetFile = source.getProject().getFile(targetPath);
							
							try {
								String processed = SpellFixer.getInstance().processFileOnTheFly(source.getLocationURI().toString().substring("file:/".length()));
								//FileInputStream in = new FileInputStream(source.getLocationURI().toString().substring("file:/".length()));		
								ByteArrayInputStream in = new ByteArrayInputStream(processed.getBytes());
								try {
									spellResource.unload();
								} catch (Exception e){
									
								}
								
								
								spellResource.load(in, null);
								if (!spellResource.getContents().isEmpty()){
									EObject eObject = spellResource.getContents().get(0);
									for (Diagnostic errors :spellResource.getErrors()) {
										System.err.println("Parsing ERROR line "+errors.getLine()+ ": " + errors.getMessage());
									}
									file_input spellProc = (file_input) eObject;
									spellProc.addControlFlowInformation();
									PythonHandler handler = new PythonHandler((IFile) source,DatabaseManager.getInstance().getProjectDatabase(source),Collections.EMPTY_LIST,Activator.getDefault().getPreferenceStore());
									handler.setCollectTM(true);
									handler.handle(spellProc);
									handler.waitForResult();
									/*if (result.isEmpty()){
										result += iFile.getLocationURI().toString().substring("file:/".length());
									} else {
										result +="," + iFile.getLocationURI().toString().substring("file:/".length());
									}*/
									LinkedHashSet<Pair<String, DiGraphNode<?>>> data = handler.getTmIdToStepMapping();
									
									Xmltabulardisplaydefinition def = ViewsFactory.eINSTANCE.createXmltabulardisplaydefinition();  //(Xmltabulardisplaydefinition) instance.getContents().get(0) ;
									handleXmltabulardisplaydefinition(targetFile.getName() ,def,type);
									LinkedHashSet<String> parameters = new LinkedHashSet<String>();
									Pair<String, DiGraphNode<?>> last = null;
									for (Pair<String, DiGraphNode<?>> row : data) {
										if (row.getSecond().getNode() == null)
											continue;
										if (row.getFirst().equals("#")) {
											if(last != null && last.getFirst().equals("#")) {
												Row viewRow = ViewsFactory.eINSTANCE.createRow();
												viewRow.setTitle("No corresponding TM found.");
												viewRow.setType("comment");
												def.getRow().add(viewRow);
												
												viewRow = ViewsFactory.eINSTANCE.createRow();
												viewRow.setType("blank");
												def.getRow().add(viewRow);
												
												viewRow = ViewsFactory.eINSTANCE.createRow();
												viewRow.setType("blank");
												def.getRow().add(viewRow);
											} else if (last != null && !last.getFirst().equals("#")){
												Row viewRow = ViewsFactory.eINSTANCE.createRow();
												viewRow.setType("blank");
												def.getRow().add(viewRow);
												
												viewRow = ViewsFactory.eINSTANCE.createRow();
												viewRow.setType("blank");
												def.getRow().add(viewRow);
											}
											Row viewRow = ViewsFactory.eINSTANCE.createRow();
											SpellElement node = row.getSecond().getNode();
											String id = "";
											String title = "";
											if (node instanceof Step) {
												id = handler.getCode(((Step) node).getId());
												title = handler.getCode(((Step) node).getDescription());
											} else if (node instanceof DisplayStep) {
												id = handler.getCode(((DisplayStep) node).getId());
												title = handler.getCode(((DisplayStep) node).getDescription());
											}
											if (id.startsWith("'")) {
												id = id.substring(1);
											}
											if (id.endsWith("'")) {
												id = id.substring(0,id.length()-1);
											}
											if (title.startsWith("'")) {
												title = title.substring(1);
											}
											if (title.endsWith("'")) {
												title = title.substring(0,title.length()-1);
											}
											viewRow.setTitle("Step " + id + " " + title);
											viewRow.setType("separator");
											def.getRow().add(viewRow);
											
										} else {
											String tm = row.getFirst();
											
											Row viewRow = ViewsFactory.eINSTANCE.createRow();
											SpellElement node = row.getSecond().getNode();
											String id = "";
											String title = "";
											if (node instanceof Step) {
												id = handler.getCode(((Step) node).getId());
												title = handler.getCode(((Step) node).getDescription());
											} else if (node instanceof DisplayStep) {
												id = handler.getCode(((DisplayStep) node).getId());
												title = handler.getCode(((DisplayStep) node).getDescription());
											}
											if (id.startsWith("'")) {
												id = id.substring(1);
											}
											if (id.endsWith("'")) {
												id = id.substring(0,id.length()-1);
											}
											if (title.startsWith("'")) {
												title = title.substring(1);
											}
											if (title.endsWith("'")) {
												title = title.substring(0,title.length()-1);
											}
											viewRow.setName(tm);
											parameters.add(tm);
											viewRow.setNote("" + id + " " + title);
											viewRow.setType("parameter");
											viewRow.setRepresentation("DB_DEFAULT");
											def.getRow().add(viewRow);
										}
										last = row;
									}
									for (String tm : parameters) {
										def.getMetaInformation().getParameterList().getParameter().add(tm);
									}
									IFolder targetDir = source.getProject().getFolder("TMPages");
									if (!targetDir.exists()) {
										try {
											monitor.subTask("Checking out TMPages");
											String scString = getSCString(source.getProject().getLocation().toFile());
											if (scString.startsWith("'")) {
												scString = scString.substring(1, scString.length() - 1);
											}
											String targetRepo = "git@scms.ses:spacecraft/"+scString+"/views";
											Repository repository = ResourceUtil.getRepository(source.getProject());
											if (repository != null) {
												Git git = new Git(repository);
											
												SubmoduleAddCommand submoduleAdd = git.submoduleAdd();
												submoduleAdd.setURI(targetRepo);
												submoduleAdd.setPath("TMPages");
												submoduleAdd.setProgressMonitor(new EclipseGitProgressTransformer(monitor));
												
												Repository subRepository = submoduleAdd.call();

												subRepository.close();
												repository.close();
											}
										} catch (Exception ex) {
											ex.printStackTrace();
										}
										
									}
									monitor.subTask("Saving " + source.getName());
									saveData(targetFile,def);
									targetFile.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
									targetFile.getProject().refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
									in.close();
									spellResource.getErrors().clear();
									spellProc.clearControlFlowInformation();
									
									
								} else {
									in.close();
								}
								
								System.out.println("\n\n\n\n\n******************************************\n\n\n");
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								System.out.println("\n\n\n\n\n******************************************\n\n\n");
							}
							monitor.worked(1);
						}
					}
					return Status.OK_STATUS;
				}
			}; 
			tmPageJob.schedule();
			
			
		} catch (Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return "True";
	}
	
	public String createTMWorkspace(){
		
		return "True";
	}
	
	public String refactorSPELLProcedure(){
		try {
			init();
			System.out.println("\n\n\n\n\n******************************************\n\n\n");
			ISelection selection = getSelection(null);
			final List<IFile> files;
			if (selection instanceof TreeSelection){
				TreeSelection s = (TreeSelection) selection;
				files = s.toList();

			} else {
				files = new ArrayList<IFile>();
			}
			Shell shell = new Shell();
			
			final FileDialog dialog = new FileDialog(shell, SWT.OPEN|SWT.MULTI);
			dialog.setFilterExtensions(new String [] {"*.refactoring"});

			String fileResult = dialog.open();
			shell.dispose();
			shell = null;
			if (fileResult == null){
				return "False";
			}
			
			Job refactorSPELL = new Job("Refactoring SPELL Procedures") {
				
				
				@Override
				protected IStatus run(IProgressMonitor monitor) {
					
					
					String[] fileNames = dialog.getFileNames();
					monitor.beginTask("Refactoring SPELL Procedures", fileNames.length + files.size());
					ArrayList<Refactorings> refactorings = new ArrayList<Refactorings>();
					for (String refactorFile : fileNames) {
						try {
							FileInputStream in = new FileInputStream(dialog.getFilterPath() + File.separator +  refactorFile);
							try {
								refactoringResource.unload();
							} catch (Exception e){
								
							}
							
							refactoringResource.load(in, null);
							
							for (Diagnostic errors :refactoringResource.getErrors()) {
								System.err.println("Parsing ERROR line "+errors.getLine()+ ": " + errors.getMessage());
							}

							if (!refactoringResource.getContents().isEmpty()){
								EObject eObject = refactoringResource.getContents().get(0);
								for (Diagnostic errors :refactoringResource.getErrors()) {
									System.err.println(errors.getMessage());
								}
								refactorings.add((Refactorings) eObject);
								//System.out.println(refactorings);
								//System.out.println(refactorings.get(0).getRefactorings().size());
								
								refactoringResource.getErrors().clear();
							}
							in.close();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						monitor.worked(1);
					}
					System.out.println("\n\n\n\n\n******************************************\n\n\n");
					for (IFile iFile : files) {
						try {
							SpellFixer.getInstance().processFile(iFile.getLocationURI().toString().substring("file:/".length()));;
							FileInputStream in = new FileInputStream(iFile.getLocationURI().toString().substring("file:/".length()));		
							
							try {
								spellResource.unload();
							} catch (Exception e){
								
							}
							
							
							spellResource.load(in, null);
							if (!spellResource.getContents().isEmpty()){
								EObject eObject = spellResource.getContents().get(0);
								for (Diagnostic errors :spellResource.getErrors()) {
									System.err.println("Parsing ERROR line "+errors.getLine()+ ": " + errors.getMessage());
								}
								file_input spellProc = (file_input) eObject;
								spellProc.addControlFlowInformation();
								PythonHandler handler = new PythonHandler(iFile,DatabaseManager.getInstance().getProjectDatabase(iFile), refactorings,Activator.getDefault().getPreferenceStore());
								handler.handle(spellProc);
								handler.waitForResult();
								/*if (result.isEmpty()){
									result += iFile.getLocationURI().toString().substring("file:/".length());
								} else {
									result +="," + iFile.getLocationURI().toString().substring("file:/".length());
								}*/
								in.close();
								spellResource.getErrors().clear();
								spellProc.clearControlFlowInformation();
								FileOutputStream out = new FileOutputStream(iFile.getLocationURI().toString().substring("file:/".length()));

								spellResource.save(out,SaveOptions.newBuilder().noValidation().getOptions().toOptionsMap());
								out.close();
								for (Diagnostic errors :spellResource.getErrors()) {
									System.err.println("Save ERROR line "+errors.getLine()+ ": " + errors.getMessage());
								}
								iFile.refreshLocal(IResource.DEPTH_ZERO, new NullProgressMonitor());
							} else {
								in.close();
							}
							
							System.out.println("\n\n\n\n\n******************************************\n\n\n");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
							System.out.println("\n\n\n\n\n******************************************\n\n\n");
						}
						monitor.worked(1);
					}
					PythonHandler.waitForMarker();
					monitor.done();
					return Status.OK_STATUS;
				}
			};
			refactorSPELL.schedule();
			return "True";
		} catch (Exception e){
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	
	public String updateProjectsDatabases(final String dbDriver,final String[] basePath){
		ProgressMonitorDialog dialog = new ProgressMonitorDialog(Display.getDefault().getActiveShell());
		errorMessage = "";
		try {
			dialog.run(true, true, new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException,
				InterruptedException {

					/*File directory = new File("M://Workspace//");
					if (!directory.exists()){
						directory = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
					}
					File[] listFiles = directory.listFiles(new FileFilter() {

						@Override
						public boolean accept(File pathname) {
							// TODO Auto-generated method stub
							return pathname.isDirectory();
						}
					});*/
					IProject[] listFiles = ResourcesPlugin.getWorkspace().getRoot().getProjects();
					
					monitor.beginTask("Updating Projects.", 2 * listFiles.length);
					monitor.subTask("Loading Project Infos.");
					HashMap<String,List<File>> projectToProjectType = new HashMap<String, List<File>>();
					HashMap<String,String> projectToScName = new HashMap<String, String>();
					List<IProject> projectList = new ArrayList<IProject>();
					for (IProject project : listFiles) {
						String type = getPlatformString(project.getLocation().toFile());
						if (type.startsWith("'") || type.startsWith("\""))
							type = type.substring(1,type.length()-1);

						projectList.add(project);
						projectToScName.put(project.getName(), getSCString(project.getLocation().toFile()));
						monitor.worked(1);
						if (monitor.isCanceled()){
							monitor.done();
							errorMessage += "ERROR: Updating Projects has been aborted.\n";
							return;
						}
					}
					monitor.subTask("Setting Up SPELL Project.");

					for (IProject project : projectList) {
						String sc = projectToScName.get(project.getName());
						IProject iProject = ResourcesPlugin.getWorkspace().getRoot().getProject(project.getName());
						if (iProject.isOpen()){
							try {
								for (String path : basePath) {
									sc = getSCString(project.getLocation().toFile());
									if (sc.startsWith("'") || sc.startsWith("\"")){
										sc = sc.substring(1, sc.length()-1);
									}
									if (project.getName().contains(sc) && updateProjectProperties(dbDriver, path.replace("%SC%", sc), sc, project)){
										
									} else {
										sc = getAlternate1SCString(project.getLocation().toFile());
										if (sc.startsWith("'") || sc.startsWith("\"")){
											sc = sc.substring(1, sc.length()-1);
										}
										if (project.getName().contains(sc) && updateProjectProperties(dbDriver, path.replace("%SC%", sc), sc, project)){
											
										} else {
											sc = getAlternate2SCString(project.getLocation().toFile());
											if (sc.startsWith("'") || sc.startsWith("\"")){
												sc = sc.substring(1, sc.length()-1);
											}
											if (project.getName().contains(sc) && updateProjectProperties(dbDriver, path.replace("%SC%", sc), sc, project)){
												continue;
											} else {
												continue;
											}
										}
									}
								
									break;
								}
								
							} catch (CoreException e) {
								errorMessage += "ERROR: " + e.getMessage() + "\n";
								e.printStackTrace();
							}
						}
						monitor.worked(1);
						if (monitor.isCanceled()){
							monitor.done();
							errorMessage += "ERROR: Updating Projects has been aborted.\n";
							return;
						}
					}
					monitor.subTask("Finished.");
					monitor.done();
				}
			});
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (!errorMessage.isEmpty()){
			return errorMessage;
		}
		return "True";
	}

	private boolean updateProjectProperties(String dbDriver, String basePath, String sc, IProject iProject)
			throws CoreException {
		if (sc.isEmpty())
			return false;

		ISpellDatabaseDriver driver = DatabaseDriverManager.getInstance().getDriver(dbDriver);
		if (driver != null){
			if (driver.checkDatabase(basePath)){
				iProject.setPersistentProperty(ProjectDatabaseProperty.GCS_DRIVER.getKey(), dbDriver);
				iProject.setPersistentProperty(ProjectDatabaseProperty.GCS_DATABASE.getKey(), basePath);
				return true;
			} else {
				iProject.setPersistentProperty(ProjectDatabaseProperty.GCS_DRIVER.getKey(), "");
				iProject.setPersistentProperty(ProjectDatabaseProperty.GCS_DATABASE.getKey(), "");
				return false;
			}
		}
		return false;
	}
	public void openReport(final String fileName){
		final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(new Path(fileName));
		Display.getDefault().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				
				
				IEditorDescriptor webView = PlatformUI.getWorkbench().getEditorRegistry().getDefaultEditor(".html");
				try {
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(new FileEditorInput(file), webView.getId());
				} catch (PartInitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
	}
	
	public String getAllProjects(){
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		StringBuilder result = new StringBuilder();
		result.append("{");
		for (IProject iProject : projects) {
			if (result.length() > 1)
			{
				result.append(",'");
				result.append(iProject.getName());
				result.append("':'");
				result.append(iProject.getLocation().toString());
				result.append("'");
			} else {
				result.append("'");
				result.append(iProject.getName());
				result.append("':'");
				result.append(iProject.getLocation().toString());
				result.append("'");
			}
		}
		result.append("}");
		return result.toString().replaceAll("/", "\\\\");
	}
	public String queryProjectList() {
		ElementListSelectionDialog dlg = new ElementListSelectionDialog(Display.getDefault().getActiveShell(),new LabelProvider(){
			public String getText(Object element) {
				return ((IProject)element).getName() + " (" + getPlatformString(new File(((IProject)element).getLocation().toString())) + ")";
			}
		});
		dlg.setMultipleSelection(true);
		dlg.setFilter("**");
		dlg.setIgnoreCase(true);
		
		dlg.setMessage("Please select the satellites for deployment of the selected files.");
		
		dlg.setElements(ResourcesPlugin.getWorkspace().getRoot().getProjects());/* filter just files if you need to */
		
		if (dlg.open() != Window.OK){
			return null;
		}
		
		Object[] result = dlg.getResult();
		String list = "";
		for (Object object : result) {
			if (list.isEmpty()){
				list += "['" + object.toString() + "'";
			} else {
				list += ",'" + object.toString() + "'";
			}
		}
		list += "]";
		return list;
	}

	private String getSCDBEntry(File f,String entryName){
		try {
			File scdb_Path_1 = new File(f.getCanonicalPath() + File.separator + "\\InputFiles\\SpacecraftDB\\SCDB.DB");
			File scdb_Path_2 = new File(f.getCanonicalPath() + File.separator + "\\InputFiles\\SPELL_FORMAT\\SpacecraftDB\\SCDB.DB");
			File scdb_Path = null;

			if (scdb_Path_1.exists()){
				scdb_Path = scdb_Path_1;
			} else if (scdb_Path_2.exists()){
				scdb_Path = scdb_Path_2;
			}
			if (scdb_Path == null)
				return "";
			BufferedReader in = new BufferedReader(new FileReader(scdb_Path));
			try {
				
				for(String line;(line = in.readLine()) != null;){

					if (line.startsWith("#"))
						continue;
					if (line.startsWith(entryName)){
						in.close();
						String[] split = line.split("\\s+");
						if (split.length > 1)
							return split[1];
						else
							return "";
					}
				}

			} finally {
				in.close();
			}
		} catch (IOException e) {
			
		}
		return "";
	}
	
	private String getPlatformString(File f){
		return getSCDBEntry(f, "PLATFORM");
	}
	
	private String getSCString(File f){
		
		String sc = getSCDBEntry(f, "SC");
		if (sc.isEmpty()){
			sc = getSCDBEntry(f, "Spacecraft_Short_Name");
		}
		
		return sc;
	}
	
	private String getAlternate1SCString(File f){
		
		String sc = getSCDBEntry(f, "Spacecraft_Short_Name");
		if (sc.isEmpty()){
			sc = getSCDBEntry(f, "FLD_SC_Name");
		}
		
		return sc;
	}
	
	private String getAlternate2SCString(File f){
		
		String sc = getSCDBEntry(f, "FLD_SC_Name");
		
		return sc;
	}
	
	
	
	protected IOConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName()))
				return (IOConsole) existing[i];
		//no console found, so create a new one
		IOConsole myConsole = new IOConsole(name, null){
		
			
		};
		
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	}
	
	protected ProcessBuilder createBuilder(String scriptName) {
 		IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		ProcessBuilder builder = new ProcessBuilder(store.getString("PYTHON_PATH"),store.getString("SPELL_CHECK_PATH")+File.separator+scriptName);
		String additional_prefs = store.getString("ADDITIONAL_PREFS");
		if (additional_prefs != null){
			String[] split = additional_prefs.split("\\|");
			for (String keyValue : split) {
				if (keyValue.isEmpty() || !keyValue.contains(":")){
					continue;
				}
				String[] keyValuePair = keyValue.split(":");
				if (keyValuePair[0].toLowerCase().equals(scriptName.toLowerCase())){
					String paramName = keyValuePair[1].trim();
					String paramValue = store.getString(paramName);
					builder.environment().put(paramName, paramValue);
				}
			}
		}
		if (store.getBoolean("EXTRACT_CHECKS") || store.getBoolean("UPDATE_CHECKS")){
			File script = new File(store.getString("SPELL_CHECK_PATH")+File.separator+scriptName);
			boolean isOutdated = false;
			long packagedVersion = -1;
			if (script.exists() && store.getBoolean("UPDATE_CHECKS")){
				try {
					packagedVersion = getClass().getResource("/scripts/" + scriptName).openConnection().getLastModified();
					long currentVersion = script.lastModified();
					if (packagedVersion > currentVersion)
						isOutdated = true;
				} catch (Exception e){

				}

			}
			if (!script.exists() || isOutdated){
				InputStream resourceAsStream = getClass().getResourceAsStream("/scripts/" + scriptName);
				byte[] buf = new byte[2048];

				try {
					FileOutputStream out = new FileOutputStream(script);
					for (int length = -1;(length = resourceAsStream.read(buf)) > 0;){
						out.write(buf,0,length);
					}
					out.close();
					resourceAsStream.close();
					if (packagedVersion > 0)
						script.setLastModified(packagedVersion);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			script = new File(store.getString("SPELL_CHECK_PATH")+File.separator+"OPA_Utils.py");
			packagedVersion = -1;
			isOutdated = false;
			if (script.exists() && store.getBoolean("UPDATE_CHECKS")){
				try {
					packagedVersion = getClass().getResource("/scripts/OPA_Utils.py").openConnection().getLastModified();
					long currentVersion = script.lastModified();
					if (packagedVersion > currentVersion)
						isOutdated = true;
				} catch (Exception e){

				}

			}
			if (!script.exists() || script.exists()){
				InputStream resourceAsStream = getClass().getResourceAsStream("/scripts/OPA_Utils.py");
				byte[] buf = new byte[2048];

				try {
					FileOutputStream out = new FileOutputStream(script);
					for (int length = -1;(length = resourceAsStream.read(buf)) > 0;){
						out.write(buf,0,length);
					}
					out.close();
					resourceAsStream.close();
					if (packagedVersion > 0)
						script.setLastModified(packagedVersion);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
		builder.environment().put("WORK_DIR",store.getString("SPELL_CHECK_PATH")+File.separator);
		builder.environment().put("AMOUNT_PROJECTS","" +selectedProjects.size());
	    
		IWorkspace workspace = ResourcesPlugin.getWorkspace();  

	    File workspaceDirectory = workspace.getRoot().getLocation().toFile();
		IPreferenceStore preferenceStore = Activator.getDefault().getPreferenceStore();
		
	    IEclipsePreferences node = new DefaultScope().getNode("lu.ses.engineering.spell.revisiontools");
	    try {
			for (String key : node.keys()) {
				String value = preferenceStore.getString(key);
				
				if (value == null || value.isEmpty())
					value = node.get(key, "");
				
				builder.environment().put(key, value);
			}
		} catch (BackingStoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    builder.environment().put("WORKSPACE", workspaceDirectory.getAbsolutePath());
		
		builder.environment().put("USE_EXTERNAL_FORMATTER", "True");
		int idx = 0;
		for (Object selObj : selectedProjects) {
			if (selObj instanceof IProject){
				IProject iProject = (IProject) selObj;
				builder.environment().put("PROJECT" + idx, iProject.getProject().getLocation().toString().replaceAll("/", "\\\\"));
				builder.environment().put("FULLPATH" + idx, iProject.getLocation().toString().replaceAll("/", "\\\\"));
				builder.environment().put("PROJECTNAME" + idx, iProject.getName());
				builder.environment().put("RELPATH" + idx, "");
				
			} else if (selObj instanceof IFile){
				IFile iProject = (IFile) selObj;
				builder.environment().put("PROJECT" + idx, iProject.getProject().getLocation().toString().replaceAll("/", "\\\\"));
				builder.environment().put("FULLPATH" + idx, iProject.getLocation().toString().replaceAll("/", "\\\\"));
				builder.environment().put("PROJECTNAME" + idx, iProject.getProject().getName());
				builder.environment().put("RELPATH" + idx, iProject.getFullPath().removeFirstSegments(1).toString().replaceAll("/", "\\\\"));
			} else if (selObj instanceof IFolder){
				IFolder iProject = (IFolder) selObj;
				builder.environment().put("PROJECT" + idx, iProject.getProject().getLocation().toString().replaceAll("/", "\\\\"));
				builder.environment().put("FULLPATH" + idx, iProject.getLocation().toString().replaceAll("/", "\\\\"));
				builder.environment().put("PROJECTNAME" + idx, iProject.getProject().getName());
				builder.environment().put("RELPATH" + idx, iProject.getFullPath().removeFirstSegments(1).toString().replaceAll("/", "\\\\"));
			}
			idx++;
		}
		
		return builder;
	}
	
	public ISelection getSelection(ExecutionEvent event) {
		if (selectionOverride != null)
			return selectionOverride;
		ISelectionService service = (ISelectionService) this.serviceLocator.getService(ISelectionService.class);
		if (service !=null){
			return service.getSelection();
		} else if (getSelectionOverride() != null) {
			return getSelectionOverride();
		} else {
			System.err.println("Could not find SelectionServeice!");
		}
		return null;
	}
	

	public void clearHyperLinkCache(){
		CompareHyperlink.idToSelectedFileMapping.clear();
	}

	
	
	
	public ExecutePythonScriptAction(ScriptMenuBuilder scriptMenuBuilder, IServiceLocator serviceLocator) {
		this.scriptMenuBuilder = scriptMenuBuilder;
		this.serviceLocator = serviceLocator;
		setId(scriptMenuBuilder.getId());
		setText(scriptMenuBuilder.getId());
	}

	@Override
	public void run() {
		
		try {
			execute(null);
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public Object execute(ExecutionEvent event) throws ExecutionException {
		IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		ISelection selection = getSelection(event);
		if (selection instanceof TreeSelection){
			TreeSelection s = (TreeSelection) selection;
			selectedProjects = s.toList();

		} else if (selection instanceof StructuredSelection){
			StructuredSelection s = (StructuredSelection) selection;
			selectedProjects = s.toList();
			//System.err.println("ERROR: Unknown selection type: " + selection);
		}
		
		ProcessBuilder builder = createBuilder(scriptMenuBuilder.getScriptName());

		
		
		String consoleId = "SPELLConsole";

		myConsole = findConsole(consoleId);
		clearHyperLinkCache();

		try {
			myConsole.activate();
			final IOConsoleOutputStream consoleOut = myConsole.newOutputStream();
			final IOConsoleOutputStream consoleErr = myConsole.newOutputStream();
			IOConsoleInputStream consoleInput = myConsole.getInputStream();
			consoleErr.setColor(Display.getCurrent().getSystemColor(SWT.COLOR_RED));
			myConsole.clearConsole();

			for (Entry<String, String> entry : scriptMenuBuilder.getOptions()) {
				builder.environment().put(entry.getKey(), entry.getValue().replaceAll("\\\\", "\\\\\\\\"));
			}
			
			if (!scriptMenuBuilder.getDynamicOptions().isEmpty()){
				ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");
				engine.put("utils",this);
				this.registerScriptExtensions(engine);
				for (Entry<String, String> entry : scriptMenuBuilder.getDynamicOptions()) {
					String script = entry.getValue();
					String result;
					try {
						result = (String) engine.eval(script);
					} catch (ScriptException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						System.out.println("ERROR in Script "+script+": " + e.toString());
						result = "ERROR in Script "+script+": " + e.toString();
					}
					if (result != null){
						builder.environment().put(entry.getKey(), result.replaceAll("\\\\", "\\\\\\\\"));
					} else {
						return null;
					}
				}

			}
			consoleOut.write("Starting "+scriptMenuBuilder.getDescription()+".\n");
			offset = ("Starting "+scriptMenuBuilder.getDescription()+".\n").length();
			builder.command().add(1, "-u");
			setProcess(builder.start());
			AbortScriptCommandHandler.runningProcess.add(getProcess());
			AbortScriptCommandHandler.updateEnabledState();
			InputStream is = getProcess().getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			final BufferedReader out = new BufferedReader(isr);
			is = getProcess().getErrorStream();
			isr = new InputStreamReader(is);
			final BufferedReader err = new BufferedReader(isr);

			Thread outThread = new IOConsoleThread(myConsole, getProcess(), out, consoleOut,consoleInput,this);
			Thread errThread = new IOConsoleThread(myConsole, getProcess(), err, consoleErr,consoleInput,this);
			
			outThread.start();
			errThread.start();
			
		 } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Status.OK_STATUS;
	}
	
	@Override
	public String getText() {
		return getId();
	}
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return super.isEnabled();
	}

	public ScriptMenuBuilder getMenuBuilder() {
		
		return scriptMenuBuilder;
	}

	public void registerScriptExtensions(ScriptEngine engine) {
		engine.put("code_coverage", Code_Coverage.getInstance(this));
	}

	public ISelection getSelectionOverride() {
		return selectionOverride;
	}

	public void setSelectionOverride(ISelection selectionOverride) {
		this.selectionOverride = selectionOverride;
	}

	public Process getProcess() {
		return process;
	}

	public void setProcess(Process process) {
		this.process = process;
	}

}
