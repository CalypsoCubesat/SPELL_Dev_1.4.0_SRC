package lu.ses.engineering.spell.revisiontools.preferences;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import lu.ses.engineering.spell.revisiontools.VariousScripts;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.menus.IWorkbenchContribution;
import org.eclipse.ui.services.IServiceLocator;

public class ScriptMenuBuilder {
	
	private static HashSet<ScriptMenuBuilder> menuBuilder = new HashSet<ScriptMenuBuilder>();
	private ScriptMenuBuilder parent;
	private IContributionItem lastMenuEntry;
	private Collection<ScriptMenuBuilder> childs = new ArrayDeque<ScriptMenuBuilder>();
	
	private  HashMap<String,String> optionMap = new HashMap<String, String>();
	private  HashMap<String,String> dynOptionMap = new HashMap<String, String>();
	private String id;
	private String scriptName;
	private String description;
	
	public ScriptMenuBuilder(ScriptMenuBuilder menuBuilder2) {
		this.parent = menuBuilder2;
		if (parent != null){
			parent.childs.add(this);
		}
	}
	public static boolean hasMenus() {
		return !menuBuilder.isEmpty();
	}

	public static IContributionItem[] buildAllMenus(IServiceLocator serviceLocator){
		ArrayList<IContributionItem> childList = new ArrayList<IContributionItem>();
		
		for (ScriptMenuBuilder scriptMenuBuilder : menuBuilder) {
			childList.add(scriptMenuBuilder.buildMenuEntry(serviceLocator));
		}
		Collections.sort(childList, new Comparator<IContributionItem>() {

			@Override
			public int compare(IContributionItem o1, IContributionItem o2) {
				String id1 = o1.getId();
				String id2 = o2.getId();
				
				return id1.compareTo(id2);
			}
			
		});
		return childList.toArray(new IContributionItem[childList.size()]);

	}
	
	public static void addScriptBuilder(ScriptMenuBuilder builder){
		menuBuilder.add(builder);
	}
	
	public IContributionItem buildMenuEntry(IServiceLocator serviceLocator){
		lastMenuEntry = null;
		if (hasChilds()){
			lastMenuEntry = new VariousScripts(getId(), this);
			((IWorkbenchContribution)lastMenuEntry).initialize(serviceLocator);
		} else {
			lastMenuEntry = new PythonScriptMenuContributionItem(getId(), new ExecutePythonScriptAction(this,serviceLocator));
		}
		return lastMenuEntry;
	}
	
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public IContributionItem getMenuEntry(){
		return lastMenuEntry;
	}

	public boolean hasChilds() {
		return !childs.isEmpty();
	}

	public IContributionItem[] buildAllChildMenus(IServiceLocator serviceLocator) {
		ArrayList<IContributionItem> childList = new ArrayList<IContributionItem>();
		
		for (ScriptMenuBuilder scriptMenuBuilder : childs) {
			childList.add(scriptMenuBuilder.buildMenuEntry(serviceLocator));
		}
		
		return childList.toArray(new IContributionItem[childList.size()]);
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getScriptName() {
		return scriptName;
	}

	public void setScriptName(String scriptName) {
		this.scriptName = scriptName;
	}

	public String getDescription() {
		if (description == null || description.isEmpty())
			return getId();
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ScriptMenuBuilder getParent() {
		// TODO Auto-generated method stub
		return parent;
	}

	public void setOption(String optionKey, String optionValue) {
		optionMap.put(optionKey, optionValue);
		
	}

	public Set<Entry<String,String>> getOptions() {
		// TODO Auto-generated method stub
		return optionMap.entrySet();
	}
	
	public Set<Entry<String,String>> getDynamicOptions() {
		// TODO Auto-generated method stub
		return dynOptionMap.entrySet();
	}

	public void setDynamicOption(String optionKey, String optionValue) {
		dynOptionMap.put(optionKey, optionValue);
		
	}
	public static void removeMenus() {
		menuBuilder.clear();
		
	}
	public static void cacheAllMenus(IServiceLocator serviceLocator) {
		ArrayList<IContributionItem> childList = new ArrayList<IContributionItem>();
		
		for (ScriptMenuBuilder scriptMenuBuilder : menuBuilder) {
			IContributionItem menuEntry = scriptMenuBuilder.buildMenuEntry(serviceLocator);
			if (menuEntry instanceof VariousScripts){
				((VariousScripts)menuEntry).getContributionItems();
			}
			childList.add(menuEntry);
		}
		Collections.sort(childList, new Comparator<IContributionItem>() {

			@Override
			public int compare(IContributionItem o1, IContributionItem o2) {
				String id1 = o1.getId();
				String id2 = o2.getId();
				
				return id1.compareTo(id2);
			}
			
		});
		
	}

	
}
