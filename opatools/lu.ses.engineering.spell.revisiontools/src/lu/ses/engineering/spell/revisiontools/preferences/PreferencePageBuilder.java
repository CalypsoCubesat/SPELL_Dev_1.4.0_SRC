package lu.ses.engineering.spell.revisiontools.preferences;

import java.util.ArrayDeque;
import java.util.Queue;

public class PreferencePageBuilder {

	private PreferencePageBuilder parent;
	private String name;
	private String id;
	 private Queue<PreferencePageBuilder> childs = new ArrayDeque<PreferencePageBuilder>();
	 private Queue<PreferenceOptionBuilder> optionFields = new ArrayDeque<PreferenceOptionBuilder>();
	public PreferencePageBuilder(PreferencePageBuilder parent){
		this.setParent(parent);
		if (parent != null)
			parent.childs.add(this);
	}

	public PreferencePageBuilder getParent() {
		return parent;
	}

	public void setParent(PreferencePageBuilder parent) {
		this.parent = parent;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return this.name;
		
	}
	
	public void setId(String id) {
		this.id = id;
		
	}
	
	public String getId() {
		return this.id;
		
	}

	public Queue<PreferenceOptionBuilder> getOptionFields() {
		return optionFields;
	}

	public void setOptionFields(Queue<PreferenceOptionBuilder> optionFields) {
		this.optionFields = optionFields;
	}
}
