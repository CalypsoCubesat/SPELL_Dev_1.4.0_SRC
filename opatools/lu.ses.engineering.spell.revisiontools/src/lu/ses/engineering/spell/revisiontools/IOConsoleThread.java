package lu.ses.engineering.spell.revisiontools;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import lu.ses.engineering.spell.revisiontools.hyperlinks.CompareHyperlink;
import lu.ses.engineering.spell.revisiontools.hyperlinks.HyperLinkContainer;
import lu.ses.engineering.spell.revisiontools.hyperlinks.ResourceHyperLink;
import lu.ses.engineering.spell.revisiontools.preferences.ExecutePythonScriptAction;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.console.IOConsole;
import org.eclipse.ui.console.IOConsoleOutputStream;

public final class IOConsoleThread extends Thread {
	/**
	 * 
	 */

	private final Process process;
	private final BufferedReader out;
	private IOConsoleOutputStream consoleOut;
	public String line;
	public IOConsole myConsole;
	private static Color red = null;
	private static Color black = null;
	private static Color green = null;
	private static Color darkRed = null;
	private static Color[] colors = new Color[36];
    private Queue<IOConsoleOutputStream> oldStreams = new ArrayDeque<IOConsoleOutputStream>();
	private boolean dirty = true;
	private List<HyperLinkContainer> hyperlinks = new ArrayList<HyperLinkContainer>();
    private int localOffset = 0;
    private List<HyperLinkContainer> allHyperlinks = new ArrayList<HyperLinkContainer>();
	private ExecutePythonScriptAction pythonHandler;
	private InputStream in;
	private int lineNumber = 1;
	private String workspacePath;
	
	public IOConsoleThread(IOConsole con, Process process, BufferedReader out,
			IOConsoleOutputStream consoleOut) {
		this(con,process,out,consoleOut,null);
	}
	public IOConsoleThread(IOConsole con, Process process, BufferedReader out,
			IOConsoleOutputStream consoleOut,InputStream in) {
		this.myConsole = con;
		this.process = process;
		this.out = out;
		this.consoleOut = consoleOut;
		this.in = in;
		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				
				if (darkRed == null)
					darkRed = Display.getDefault().getSystemColor(SWT.COLOR_DARK_RED);
				if (red == null)
					red = Display.getDefault().getSystemColor(SWT.COLOR_RED);
				if (black == null)
					black = Display.getDefault().getSystemColor(SWT.COLOR_BLACK);
				if (green == null)
					green = Display.getDefault().getSystemColor(SWT.COLOR_DARK_GREEN);
				for (int i = 0; i < colors.length; i++) {
					colors[i] = Display.getDefault().getSystemColor(i+1);
				}
			}
		});

	}
    public IOConsoleThread(IOConsole myConsole2, Process process2,
			BufferedReader err, IOConsoleOutputStream consoleErr,InputStream in,
			ExecutePythonScriptAction executePythonScriptAction) {
		this(myConsole2,process2,err,consoleErr,in);
		this.pythonHandler = executePythonScriptAction;
	}

	@Override
	public void run() {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();  

	    File workspaceDirectory = workspace.getRoot().getLocation().toFile();
	    workspacePath = workspaceDirectory.getAbsolutePath();
		lineNumber = 1;
		while (true){

			try {
				while ((line = out.readLine()) != null) {
					localOffset = 0;
					boolean skipNL = handleLine();
                   
                   if (!skipNL){
                	   lineNumber++;
                	   consoleOut.write("\n");
                   }
                   if (!hyperlinks.isEmpty()){
                	   Thread hyperlinkThread = new Thread(){
                		   List<HyperLinkContainer> links = new ArrayList<HyperLinkContainer>(hyperlinks);
                		   int localLineNumber = lineNumber;
                		   @Override
                		   public void run() {
            				   while (!links.isEmpty()){
            					   int offset = getLineOffset(localLineNumber-1);
            					   
            					   for (Iterator<HyperLinkContainer> iterator = links
            							.iterator(); iterator.hasNext();) {
            						   
            						HyperLinkContainer hyperLinkContainer = iterator.next();
            						try {
            							myConsole.addHyperlink(hyperLinkContainer.getH(), offset + hyperLinkContainer.getOffset(), hyperLinkContainer.getLength());
            							while (myConsole.getHyperlink(offset + hyperLinkContainer.getOffset()) == null){
            								try {
            									Thread.sleep(25);
            								} catch (InterruptedException e) {
            									// TODO Auto-generated catch block
            									e.printStackTrace();
            								}
            							}
            							iterator.remove();


            						} catch (BadLocationException e) {
            							//e.printStackTrace();
            						}
            					   }
            				   }
                		   }  
                	   };
                	   hyperlinkThread.start();
                	   hyperlinks.clear();
                   }
                 

				}
			} catch (IOException e1) {

			}


			try {
				process.exitValue();
				for (IOConsoleOutputStream ioConsoleOutputStream : oldStreams) {
					try {
						ioConsoleOutputStream.close();
					} catch (Exception ex){
						
					}
				}
				return;
			} catch (Exception e) {

			}
		}

	}

	private boolean handleLine() throws IOException {
		CompareHyperlink hyperlink = null;
		boolean skipNL = false;
		if (line.matches(".*<\\d?\\d>.*")){
			String tag = line.replaceFirst(".*<(\\d?\\d)>.*","$1");
			
			if (line.matches("<\\d?\\d>")) skipNL = true;
			
			splitSetColorAndHandleLine("<"+ tag +">",colors[Integer.valueOf(tag)-1]);
			return skipNL;
		}
		if (line.trim().contains("<red>")){
			if (line.equals("<red>")) skipNL = true;
			
			splitSetColorAndHandleLine("<red>",red);
			return skipNL;
		} 
		if (line.trim().contains("<darkRed>")){
			if (line.equals("<darkRed>")) skipNL = true;
			
			splitSetColorAndHandleLine("<darkRed>",darkRed);
			return skipNL;
		} 
		if (line.trim().contains("<black>")){
			if (line.equals("<black>")) skipNL = true;
			splitSetColorAndHandleLine("<black>",black);

			return skipNL;
		}
		if (line.trim().contains("<green>")){
			if (line.equals("<green>")) skipNL = true;
			splitSetColorAndHandleLine("<green>",green);

			return skipNL;
		}
		if (line.trim().contains("<resetFont>")){
			if (line.equals("<resetFont>")) skipNL = true;
			splitReSetFontAndHandleLine("<resetFont>", SWT.NORMAL);
			return skipNL;
		}
		if (line.trim().contains("<BOLD>")){
			if (line.equals("<BOLD>")) skipNL = true;
			splitSetFontAndHandleLine("<BOLD>", SWT.BOLD);
			return skipNL;
		}
		if (line.trim().contains("<!BOLD>")){
			if (line.equals("<!BOLD>")) skipNL = true;
			splitUnSetFontAndHandleLine("<!BOLD>", SWT.BOLD);
			return skipNL;
		}
		if (line.trim().contains("<ITALIC>")){
			if (line.equals("<ITALIC>")) skipNL = true;
			splitSetFontAndHandleLine("<ITALIC>", SWT.ITALIC);
			return skipNL;
		}
		if (line.trim().contains("<!ITALIC>")){
			if (line.equals("<!ITALIC>")) skipNL = true;
			splitUnSetFontAndHandleLine("<ITALIC>", SWT.ITALIC);
			return skipNL;
		}
		if (line.contains("<|exec_silent")){
			Pattern pattern = Pattern.compile(".*(<)\\|exec_silent\\|(\\s*)(.+)\\|>.*");
			Matcher matcher = pattern.matcher(line);
			final String commandLine;
			String returnValue = "";
			try {
				if (matcher.find()){
					commandLine = matcher.group(3);	
					
					
					ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");
					
					if (pythonHandler != null){
						engine.put("utils",this.pythonHandler);
						this.pythonHandler.registerScriptExtensions(engine);
					}

					Object retVal = engine.eval(commandLine);
				}
			} catch (Exception e){
				e.printStackTrace();
			}
			String oldLine = line;
			line =  line.replaceFirst("(.*)<\\|exec_silent\\|(\\s*)(.+)\\|>(.*)", "$1$4");
			if (!oldLine.equals(line)){
				return handleLine();
			}
		}
		if (line.contains("<|open_shell")){
			Pattern pattern = Pattern.compile(".*(<)\\|open_shell\\|>.*");
			Matcher matcher = pattern.matcher(line);
			final String commandLine;
			String returnValue = "";
			try {
				if (matcher.find()){
					String cmd = matcher.group(3);
					cmd = cmd.replaceAll("\\\\", "\\\\\\\\").replaceAll("\"", "\\\"");
					if (in != null){
						commandLine = "code_coverage.openShell(input,consoleOut)" ;	
					} else { 
						commandLine = "code_coverage.openShell(null,consoleOut)" ;	
					}
						
					
					
					
					ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");
					
					if (pythonHandler != null){
						engine.put("utils",this.pythonHandler);
						if (in != null){
							engine.put("input",this.in);
						}
						engine.put("consoleOut",this.consoleOut);
						this.pythonHandler.registerScriptExtensions(engine);
					}

					Object retVal = engine.eval(commandLine);
					if (retVal instanceof String){
						returnValue = (String) retVal;
					} else {
						
					}
				}
			} catch (Exception e){
				e.printStackTrace();
			}
			String oldLine = line;
			line =  line.replaceFirst("(.*)<\\|open_shell\\|>(.*)", "$1"+returnValue+"$4");
			if (!oldLine.equals(line)){
				return handleLine();
			}
			
		}
		if (line.contains("<|exec")){
			Pattern pattern = Pattern.compile(".*(<)\\|exec\\|(\\s*)(.+)\\|>.*");
			Matcher matcher = pattern.matcher(line);
			final String commandLine;
			String returnValue = "";
			try {
				if (matcher.find()){
					commandLine = matcher.group(3);	
					
					
					ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");
					
					if (pythonHandler != null){
						engine.put("utils",this.pythonHandler);
						this.pythonHandler.registerScriptExtensions(engine);
					}
					Object retVal = engine.eval(commandLine);
					if (retVal instanceof String){
						returnValue = (String) retVal;
					} else {
						
					}

				}
			} catch (Exception e){
				e.printStackTrace();
			}
			String oldLine = line;
			line =  line.replaceFirst("(.*)<\\|exec\\|(\\s*)(.+)\\|>(.*)", "$1"+returnValue+"$4");
			if (!oldLine.equals(line)){
				return handleLine();
			}
		}
		
		if (line.contains("<|U")){
			Pattern pattern = Pattern.compile(".*(<)\\|U\\|(\\s*)(\\w+)\\s*\\|>.*");
			Matcher matcher = pattern.matcher(line);
			final String name;
			try {
				if (matcher.find()){
					name = matcher.group(3);					
					
					Display.getDefault().asyncExec(new Runnable() {

						@Override
						public void run() {
							IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
							try {
								if (project != null){
									try {
										consoleOut.flush();
									} catch (IOException e) {
					
									}
									System.out.println("Refreshing Project " + project.getName());
									project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
								} else {
									System.err.println("Project " + name + " not found.");
								}
								
							} catch (CoreException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					});

				}
			} catch (Exception e){
				e.printStackTrace();
			}
			line =  line.replaceFirst("(.*)<\\|U\\|(\\s*)(\\w+)\\|>(.*)", "$1$4");
			
		}
		if (line.contains("<|cmp")){
			Pattern pattern = Pattern.compile(".*(<)\\|cmp\\|(\\s*)(\\w+)\\s*\\|(\\w+)\\|([^|]*)\\|>.*");
			Matcher matcher = pattern.matcher(line);
			String name = "";
			String id = "";
			String fileName = "";
			int cmpOffset = -1;
			try {
				if (matcher.find()){
					name = matcher.group(3);
					id = matcher.group(4);
					fileName = matcher.group(5);
					cmpOffset = matcher.start(1) + matcher.group(2).length();
					hyperlink = new CompareHyperlink(myConsole,name, id, fileName,localOffset +cmpOffset,null);
				}
			} catch (Exception e){
				e.printStackTrace();
			}
			line =  line.replaceFirst("(.*)<\\|cmp\\|(\\s*)(\\w+)\\|\\w+\\|[^\\|]*\\|>(.*)", "$1$2\\[v$3\\]$4");

		}
		dirty = true;

		consoleOut.write(line);
		
		
		consoleOut.flush();

		if (hyperlink != null){
			try {
				hyperlinks.add(new HyperLinkContainer(hyperlink, hyperlink.getOffset(), hyperlink.getLength()));

			} catch (Exception e){
				e.printStackTrace();
			}
		}

		Pattern p = Pattern.compile(".*("+workspacePath.replaceAll("\\\\", "\\\\\\\\")+".*\\.(?:(?:py)|(?:DB))(?:.* line \\d+)?).*",Pattern.CASE_INSENSITIVE);
		Matcher matcher = p.matcher(line);
		//System.out.println(" *DBG* line: "+line);
		if (matcher.find()){
			final String file = matcher.group(1);
			int localGroupOffset = matcher.start(1);
			int localLength = matcher.end(1) - matcher.start(1);

			try {
				
				this.hyperlinks.add(new HyperLinkContainer(new ResourceHyperLink(this,file), localOffset + localGroupOffset, localLength));
			} catch (Exception ex){
				//try {
				//System.out.println(" *DBG* " +this.myConsole.getDocument().get(this.myConsole.getDocument().getLineInformation(this.myConsole.getDocument().getNumberOfLines()-2).getOffset(),this.myConsole.getDocument().getLineInformation(this.myConsole.getDocument().getNumberOfLines()-2).getLength() ));
				//System.out.println(" *DBG* " + (this.myConsole.getDocument().getLength() - this.myConsole.getDocument().getLineInformation(this.myConsole.getDocument().getNumberOfLines()-2).getOffset()+ localOffset +  localLength-1 ));
				//} catch (BadLocationException e) {

				//}
				ex.printStackTrace();
			}
		}
		localOffset += line.length();
		return skipNL;
	}
	
	private int getLineOffset(int lineNumber){

		int offset = -1;
		while (offset == -1){
			synchronized (this) {
				try {
					offset = this.myConsole.getDocument().getLineOffset(lineNumber);
				} catch (BadLocationException e) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException ex) {
					}
				}
			}
		}
		return offset;
	}
	private void splitReSetFontAndHandleLine(String tag, final int c) throws IOException {
		String[] split = line.split(tag,2);
		line = split[0];

		if (!line.trim().isEmpty()){

			handleLine();
		}
		if (split.length > 1)
			line = split[1];
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				if (dirty){
					IOConsoleOutputStream stream = myConsole.newOutputStream();
					stream.setFontStyle( c);
					stream.setColor(consoleOut.getColor());
//					try {
//						consoleOut.close();
//					} catch (IOException e) {
//
//					}
					oldStreams.add(consoleOut);
					consoleOut = stream;
					dirty = false;
				} else {
					consoleOut.setFontStyle( c);
				}								
			}
		});
		if (!line.trim().isEmpty()){

			handleLine();
		}
	}
	private void splitSetFontAndHandleLine(String tag, final int c) throws IOException {
		String[] split = line.split(tag,2);
		line = split[0];

		if (!line.trim().isEmpty()){

			handleLine();
		}
		if (split.length > 1)
			line = split[1];
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				if (dirty){
//
//					try {
//						//consoleOut.close();
//					} catch (IOException e) {
//
//					}
					IOConsoleOutputStream stream = myConsole.newOutputStream();
					stream.setFontStyle(consoleOut.getFontStyle() | c);
					stream.setColor(consoleOut.getColor());
					oldStreams.add(consoleOut);
					consoleOut = stream;
					dirty = false;
				} else {
					consoleOut.setFontStyle(consoleOut.getFontStyle() | c);
				}								
			}
		});
		if (!line.trim().isEmpty()){

			handleLine();
		} 
	}
	private void splitUnSetFontAndHandleLine(String tag, final int c) throws IOException {
		String[] split = line.split(tag,2);
		line = split[0];

		if (!line.trim().isEmpty()){

			handleLine();
		}
		if (split.length > 1)
			line = split[1];
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				if (dirty){
					

//					try {
//						//consoleOut.close();
//					} catch (IOException e) {
//
//					}
					IOConsoleOutputStream stream = myConsole.newOutputStream();
					stream.setFontStyle(consoleOut.getFontStyle() & ~c);
					stream.setColor(consoleOut.getColor());
					oldStreams.add(consoleOut);
					consoleOut = stream;
					dirty = false;
				} else {
					consoleOut.setFontStyle(consoleOut.getFontStyle() & ~c);
				}								
			}
		});
		if (!line.trim().isEmpty()){

			handleLine();
		} 
			
	}
	private void splitSetColorAndHandleLine(String tag,final Color c) throws IOException {
		String[] split = line.split(tag,2);
		line = split[0];

		if (!line.trim().isEmpty()){

			handleLine();
		}
		if (split.length > 1)
			line = split[1];
		Display.getDefault().syncExec(new Runnable() {

			@Override
			public void run() {
				if (dirty){

//					try {
//						consoleOut.close();
//					} catch (IOException e) {
//
//					}
					IOConsoleOutputStream stream = myConsole.newOutputStream();
					stream.setColor(c);
					stream.setFontStyle(consoleOut.getFontStyle());
					oldStreams.add(consoleOut);
					consoleOut = stream;
					dirty = false;
				} else {
					consoleOut.setColor(c);
				}								
			}
		});
		if (!line.trim().isEmpty()){
			handleLine();
		}
	}
}