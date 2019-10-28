package lu.ses.engineering.spell.flow_analysis;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lu.ses.engineering.spell.controlflow.spell.SpellElement;

public class PythonAction {
	
	public static final int FALL_BACK_TYPE = 3;
	public static final int SEPERATED_CONTEXT_TYPE = 2;
	public static final int SAME_CONTEXT_TYPE = 1;
	public static final int NONE_TYPE = 0;
	public static final PythonAction None = new PythonAction(NONE_TYPE);
	public static final PythonAction StartBranchInSameContext = new PythonAction(SAME_CONTEXT_TYPE);
	public static final PythonAction StartSeperatedBranches = new PythonAction(SEPERATED_CONTEXT_TYPE);
	public static final PythonAction FallBack = new PythonAction(FALL_BACK_TYPE);
	static {
		
	}
	private int type;
	private SpellElement source = null;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + type;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PythonAction other = (PythonAction) obj;
		if (type != other.type)
			return false;
		return true;
	}

	private ArrayDeque<SpellElement> nextSources = new ArrayDeque<SpellElement>();

	private SpellElement vars;

	public PythonAction(int type) {
		this.setType(type);
		// TODO Auto-generated constructor stub
	}
	
	public PythonAction(PythonAction pythonAction) {
		this.nextSources = new ArrayDeque<SpellElement>(pythonAction.nextSources);
		this.vars = pythonAction.vars;
		this.setType(pythonAction.getType());
		this.source = pythonAction.source;
	}

	public SpellElement getSource() {
		return source;
	}

	public PythonAction setSource(SpellElement source) {
		PythonAction newAction = new PythonAction(this);
		newAction.source = source;
				
		return newAction;
	}
	public PythonAction setVars(SpellElement vars) {
		PythonAction newAction = new PythonAction(this);
		newAction.vars = vars;
				
				
		return newAction;
	}
	
	
	public PythonAction setSourceList(List<SpellElement> source) {
		if (source == null || source.isEmpty()){
			source = null;
			return this;
		}
		if (source.size() > 0){
			List<SpellElement> list = new ArrayList<SpellElement>();
			for (SpellElement s : source) {
				if (s != null){
					list.add(s);
				}
			}
			
			nextSources.addAll(list);
			this.source = nextSources.pollFirst();
		}		
		return this;
	}
	
	
	public SpellElement getNextSource(){
		if (nextSources.isEmpty())
			return null;
		else
			return nextSources.pollFirst();
	}

	public SpellElement getVars() {
		vars = null;
		return vars;		
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
	
}
