package lu.ses.engineering.spell.revisiontools.preferences;

import java.util.HashMap;

import org.eclipse.jface.action.ActionContributionItem;

public class PythonScriptMenuContributionItem extends ActionContributionItem {
	private static HashMap<String,ExecutePythonScriptAction> pythonActions= new HashMap<String,ExecutePythonScriptAction>();
	
	private String id;
	
	public PythonScriptMenuContributionItem(String id,ExecutePythonScriptAction action) {
		super(action);
		synchronized (pythonActions) {
			pythonActions.put(id, action);
		}
	}
	
	public String getText(){
		return id;
	}
	
	public static ExecutePythonScriptAction getAction(String id){
		synchronized (pythonActions) {
			return pythonActions.get(id);
		}
	}
}
