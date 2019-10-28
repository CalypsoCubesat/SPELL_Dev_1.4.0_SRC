package lu.ses.engineering.spell.revisiontools.preferences;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import lu.ses.engineering.spell.revisiontools.Activator;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.State;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceManager;
import org.eclipse.jface.preference.PreferenceNode;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.RegistryToggleState;
import org.osgi.framework.Bundle;

public class SPELLToolsPreferenceInitializer extends AbstractPreferenceInitializer {
	
	private static final int START_STAGE = 0;
	private static final int PAGE_STAGE = 1;
	private static final int SCRIPT_STAGE = 3;
	private static final int OPTION_STAGE = 2;
	
	private PreferencePageBuilder builder = null;
	private static boolean initialised = false;
	
	
	
	@Override
	public void initializeDefaultPreferences() {
		if (isInitialised())
			return;
		setInitialised(true);
		final IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		try {
			store.setValue("CHECK_LEVEL","REV");
			store.setValue("SELECTION_ALGO","AUTO_HEADER");
			store.addPropertyChangeListener(new IPropertyChangeListener() {
				
				@Override
				public void propertyChange(PropertyChangeEvent event) {
					String property = event.getProperty();
					if (property.equals("CHECK_LEVEL")) {
						if (event.getOldValue() != null && !event.getOldValue().equals(event.getNewValue())){
							String currentCheckLevel = (String) event.getNewValue();
							if (currentCheckLevel == null || currentCheckLevel.isEmpty()){
								return;
							}
						    ICommandService commandService = (ICommandService) PlatformUI.getWorkbench().getService(ICommandService.class); 
						    
						    Command command1 = commandService.getCommand("lu.ses.engineering.spell.revisiontools.RevChecker");  
						    Command command2 = commandService.getCommand("lu.ses.engineering.spell.revisiontools.RevDateChecker");  
						    Command command3 = commandService.getCommand("lu.ses.engineering.spell.revisiontools.RevDateContentChecker"); 
						    
						    State state1 = command1.getState(RegistryToggleState.STATE_ID);
						    State state2 = command2.getState(RegistryToggleState.STATE_ID);
						    State state3 = command3.getState(RegistryToggleState.STATE_ID);
						    
						    if ("REV".equals(currentCheckLevel)) {
						    	state1.setValue(Boolean.TRUE);
						    	state2.setValue(Boolean.FALSE);
						    	state3.setValue(Boolean.FALSE);
						    } else if ("REVDATE".equals(currentCheckLevel)) {
						    	state1.setValue(Boolean.FALSE);
						    	state2.setValue(Boolean.TRUE);
						    	state3.setValue(Boolean.FALSE);
						    } else if ("REVDATECONTENT".equals(currentCheckLevel)) {
						    	state1.setValue(Boolean.FALSE);
						    	state2.setValue(Boolean.FALSE);
						    	state3.setValue(Boolean.TRUE);
						    } else {
						    	state1.setValue(Boolean.TRUE);
						    	state2.setValue(Boolean.FALSE);
						    	state3.setValue(Boolean.FALSE);
						    }

						}
					}
					
				}
			});

			if (store.getDefaultString("PYTHON_PATH") == null || store.getDefaultString("PYTHON_PATH").isEmpty()){
				String defaultPythonPath = Platform.getPreferencesService().getString("org.python.pydev", "INTERPRETER_PATH_NEW", "D:\\Program Files\\SES\\SPELL\\cots\\Python-2.5\\python.exe", null); 
				int startIndex = defaultPythonPath.indexOf("Executable:") + "Executable:".length();
				int endIndex = defaultPythonPath.indexOf("|");
				if (defaultPythonPath.indexOf("Executable:") == -1){
					startIndex = defaultPythonPath.indexOf("<executable>") + "<executable>".length();
					endIndex = defaultPythonPath.indexOf("</executable>");
				} 

				defaultPythonPath = defaultPythonPath.substring(startIndex,endIndex);
				System.out.println("[*] SPELL Tools: Python path found: " + defaultPythonPath);
				if (!(new File(defaultPythonPath)).exists()){
					System.out.println("[*] SPELL Tools: Could not find Python Interpreter. Reverting to default path.");
					defaultPythonPath = "D:\\Program Files\\SES\\SPELL\\cots\\Python-2.5\\python.exe";
					if (!new File(defaultPythonPath).exists()){
						defaultPythonPath = "D:\\Programs\\SES\\SPELL\\cots\\Python-2.5\\python.exe";
					}
				}
				store.setDefault("PYTHON_PATH", defaultPythonPath);
				if (!defaultPythonPath.equals("D:\\Program Files\\SES\\SPELL\\cots\\Python-2.5\\python.exe")){
					store.setValue("PYTHON_PATH", defaultPythonPath);
				}
			}
		} catch (Exception e){
			String defaultPythonPath = "D:\\Program Files\\SES\\SPELL\\cots\\Python-2.5\\python.exe";
			if (!new File(defaultPythonPath).exists()){
				defaultPythonPath = "D:\\Programs\\SES\\SPELL\\cots\\Python-2.5\\python.exe";
			}
			store.setDefault("PYTHON_PATH", defaultPythonPath);
		}
		
		File scriptDir = new File("\\\\beafs1\\Spell\\");
		if (!scriptDir.exists()){
			scriptDir = new File("M:\\SpellScripts\\");

			
			if (new File("M:\\").exists()){
				
				if (!scriptDir.exists())
					scriptDir.mkdir();
			
				store.setDefault("SPELL_CHECK_PATH", "M:\\SpellScripts\\");

				store.setDefault("UPDATE_CHECKS", true);
				store.setDefault("EXTRACT_CHECKS", true);
			} else {
				scriptDir = new File("C:\\SpellScripts\\");
				
				if (new File("C://").exists()){
					if (!scriptDir.exists())
						scriptDir.mkdir();
					
					store.setDefault("SPELL_CHECK_PATH", "C:\\SpellScripts\\");

					store.setDefault("UPDATE_CHECKS", true);
					store.setDefault("EXTRACT_CHECKS", true);
				} else {
					store.setDefault("SPELL_CHECK_PATH", "");

					store.setDefault("UPDATE_CHECKS", false);
					store.setDefault("EXTRACT_CHECKS", false);
				}
			}

		} else {
			store.setDefault("SPELL_CHECK_PATH", "\\\\beafs1\\Spell\\");

			store.setDefault("UPDATE_CHECKS", true);
			store.setDefault("EXTRACT_CHECKS", true);
		}
		
		try {
			Bundle bundle = Platform.getBundle("lu.ses.engineering.spell.revisiontools");
			
			if (bundle != null){

				Enumeration<URL> entries = bundle.findEntries("scripts", "*.py", false);
				while (entries.hasMoreElements()){
					URL element = entries.nextElement();
					BufferedReader in = new BufferedReader(new InputStreamReader(element.openStream()));
					String script = element.getFile();
					int endIdx = script.lastIndexOf("/");
					if (endIdx == -1)
						endIdx = script.lastIndexOf("\\");
					if (endIdx != -1)
						script = script.substring(endIdx+1);
					handlePageAddition(in,store,script);
					in.close();
				}
			} else {
				File jarFile = new File(getClass().getProtectionDomain().getCodeSource().getLocation().getPath());
				LinkedList<String> scripts = new LinkedList<String>();
				if(jarFile.isFile()) {  // Run with JAR file
					JarFile jar = new JarFile(jarFile);
					final Enumeration<JarEntry> entries = jar.entries(); //gives ALL entries in jar
					while(entries.hasMoreElements()) {
						final String name = entries.nextElement().getName();
						if (!name.startsWith("scripts/") && name.endsWith(".py")) { //filter according to the path
							scripts.add(name);
						}
					}
					jar.close();

				}
				for (String script : scripts) {
					BufferedReader in = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(script)));
					int endIdx = script.lastIndexOf("/");
					if (endIdx == -1)
						endIdx = script.lastIndexOf("\\");
					if (endIdx != -1)
						script = script.substring(endIdx+1);
					handlePageAddition(in,store,script);
					in.close();
				}

			}
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	private void handlePageAddition(BufferedReader in,IPreferenceStore store,String script) throws IOException {
		try {
		int stage = START_STAGE;
		String context = "custompage"; 
		PreferenceOptionBuilder optionBuilder = null;
		ScriptMenuBuilder menuBuilder = null;
		for (String line = null;(line = in.readLine())!= null;){
			line = line.trim();
			if (line.startsWith("#"))
				continue;
			switch (stage) {
			case START_STAGE:
				if (line.startsWith("<Page>")){
					builder = new PreferencePageBuilder(builder);	
					stage = PAGE_STAGE;
				} else
				if (line.startsWith("<Menu>")){
					menuBuilder = new ScriptMenuBuilder(menuBuilder);	
					menuBuilder.setScriptName(script);
					stage = SCRIPT_STAGE;
				}
				
				break;
			case SCRIPT_STAGE:
				if (line.startsWith("<Text>")){
					int endIdx = line.indexOf("</Text>");
					if (endIdx != -1){
						line = line.substring("<Text>".length(),endIdx);	
					} else {
						line = line.substring("<Text>".length());	
					}

					menuBuilder.setId(line);
				} else if (line.startsWith("<File>")){
					int endIdx = line.indexOf("</File>");
					if (endIdx != -1){
						line = line.substring("<File>".length(),endIdx);	
					} else {
						line = line.substring("<File>".length());	
					}

					menuBuilder.setScriptName(line);
				} else if (line.startsWith("<Description>")){
					int endIdx = line.indexOf("</Description>");
					if (endIdx != -1){
						line = line.substring("<Description>".length(),endIdx);	
					} else {
						line = line.substring("<Description>".length());
						String nextLine = in.readLine();
						while (endIdx == -1){
							endIdx = nextLine.indexOf("</Description>");
							if (endIdx != -1){
								line += nextLine.substring(0,endIdx);
							} else {
								line += nextLine;
								nextLine = in.readLine();
							}

						}
					}
					menuBuilder.setDescription(line);
				} else if (line.startsWith("<Option>")){
					int endIdx = line.indexOf("</Option>");
					if (endIdx != -1){
						line = line.substring("<Option>".length(),endIdx);	
					} else {
						line = line.substring("<Option>".length());
						String nextLine = in.readLine();
						while (endIdx == -1){
							endIdx = nextLine.indexOf("</Option>");
							if (endIdx != -1){
								line += nextLine.substring(0,endIdx);
							} else {
								line += nextLine;
								nextLine = in.readLine();
							}

						}
					}
					String[] option = line.split("\\|",2);
					menuBuilder.setOption(option[0],option[1]);
				} else if (line.startsWith("<DynamicOption>")){
					int endIdx = line.indexOf("</DynamicOption>");
					if (endIdx != -1){
						line = line.substring("<DynamicOption>".length(),endIdx);	
					} else {
						line = line.substring("<DynamicOption>".length());
						String nextLine = in.readLine();
						while (endIdx == -1){
							endIdx = nextLine.indexOf("</DynamicOption>");
							if (endIdx != -1){
								line += nextLine.substring(0,endIdx);
							} else {
								line += nextLine;
								nextLine = in.readLine();
							}

						}
					}
					String[] option = line.split("\\|",2);
					menuBuilder.setDynamicOption(option[0],option[1]);
				} else if (line.startsWith("<Menu>")){
					menuBuilder = new ScriptMenuBuilder(menuBuilder);
					menuBuilder.setScriptName(script);
				} else if (line.startsWith("</Menu>")){
					if (menuBuilder.getParent() == null){
						stage = START_STAGE;
						ScriptMenuBuilder.addScriptBuilder(menuBuilder);
					}
					menuBuilder = menuBuilder.getParent();
				}
				break;
			case PAGE_STAGE:
				if (line.startsWith("<Name>")) {
					int endIdx = line.indexOf("</Name>");
					if (endIdx != -1){
						line = line.substring("<Name>".length(),endIdx);	
					} else {
						line = line.substring("<Name>".length());	
					}

					builder.setName(line);
				} else if (line.startsWith("<Id>")) {
					int endIdx = line.indexOf("</Id>");
					if (endIdx != -1){
						line = line.substring("<Id>".length(),endIdx);	
					} else {
						line = line.substring("<Id>".length());	
					}
					context += line;
					builder.setId(context);
				} else if (line.startsWith("<Option>")){
					stage = OPTION_STAGE;
					optionBuilder = new PreferenceOptionBuilder();
				} else if (line.startsWith("</Page>")){
					stage = START_STAGE;
					if (builder.getParent() != null){
						builder = builder.getParent();
						context = builder.getId();
					} else {
						PreferenceManager pm = PlatformUI.getWorkbench().getPreferenceManager();
						
						PreferenceNode node = new PreferenceNode(builder.getId(),builder.getName(),null,"not used"){
							private PreferencePageBuilder prefBuilder = builder;
							@Override
							public void createPage() {
								GenericPreferencePage page = new GenericPreferencePage(prefBuilder);
						        
						        page.setTitle(prefBuilder.getName());
						        
						        setPage(page);
						        
							}
						};
						
						if (!pm.addTo("lu.ses.engineering.spell.revisiontools.SpellToolsPrefs", node)){
							pm.addTo("com.astra.ses.spell.dev.preferences/lu.ses.engineering.spell.revisiontools.SpellToolsPrefs", node);
						}
						builder = null;
					}
					
				}
			case OPTION_STAGE:
				if (line.startsWith("<Name>")) {
					int endIdx = line.indexOf("</Name>");
					if (endIdx != -1){
						line = line.substring("<Name>".length(),endIdx);	
					} else {
						line = line.substring("<Name>".length());	
					}
					store.setValue("ADDITIONAL_PREFS", store.getString("ADDITIONAL_PREFS") + "|" + script + ":" + line);
					optionBuilder.setName(line);
				} else if (line.startsWith("<Text>")) {
					int endIdx = line.indexOf("</Text>");
					if (endIdx != -1){
						line = line.substring("<Text>".length(),endIdx);	
					} else {
						line = line.substring("<Text>".length());	
					}
	
					optionBuilder.setText(line);
				} else if (line.startsWith("<Type>")) {
					int endIdx = line.indexOf("</Type>");
					if (endIdx != -1){
						line = line.substring("<Type>".length(),endIdx);	
					} else {
						line = line.substring("<Type>".length());	
					}
	
					optionBuilder.setType(line);
				} else if (line.startsWith("<SubType>")) {
					int endIdx = line.indexOf("</SubType>");
					if (endIdx != -1){
						line = line.substring("<SubType>".length(),endIdx);	
					} else {
						line = line.substring("<SubType>".length());	
					}
	
					optionBuilder.setSubType(line);
				} else if (line.startsWith("<Value>")) {
					int endIdx = line.indexOf("</Value>");
					if (endIdx != -1){
						line = line.substring("<Value>".length(),endIdx);	
					} else {
						line = line.substring("<Value>".length());	
					}
	
					optionBuilder.getValidValues().add(line);
				}else if (line.startsWith("<Default>")) {
					int endIdx = line.indexOf("</Default>");
					if (endIdx != -1){
						line = line.substring("<Default>".length(),endIdx);	
					} else {
						line = line.substring("<Default>".length());
						String nextLine = in.readLine();
						while (endIdx == -1){
							endIdx = nextLine.indexOf("</Default>");
							if (endIdx != -1){
								line += nextLine.substring(0,endIdx);
							} else {
								line += nextLine;
								nextLine = in.readLine();
							}
							
						}
					}
					if (optionBuilder.getType().isBoolean()){
						store.setDefault(optionBuilder.getName(), (Boolean)optionBuilder.getType().cast(line));
					} else if (optionBuilder.getType().isInteger()){
						store.setDefault(optionBuilder.getName(), (Long)optionBuilder.getType().cast(line));
					} else if (optionBuilder.getType().isDouble()){
						store.setDefault(optionBuilder.getName(), (Double)optionBuilder.getType().cast(line));
					} else {
						store.setDefault(optionBuilder.getName(), (String)optionBuilder.getType().cast(line));
					}
					
				} else if (line.startsWith("</Option>")){
					stage = PAGE_STAGE;
					builder.getOptionFields().add(optionBuilder);
					optionBuilder = null;
				}
			
			
			}
			 
			
		}
		} catch (Exception e){
			System.err.println("Error while loading script " + script);
			e.printStackTrace();
		}
	}

	public static boolean isInitialised() {
		return initialised;
	}

	public static void setInitialised(boolean initialised) {
		SPELLToolsPreferenceInitializer.initialised = initialised;
		if (!initialised){

			ScriptMenuBuilder.removeMenus();
		}
	}

}
