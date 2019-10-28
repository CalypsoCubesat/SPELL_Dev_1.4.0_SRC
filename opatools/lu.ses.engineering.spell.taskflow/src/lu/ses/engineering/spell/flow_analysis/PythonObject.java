package lu.ses.engineering.spell.flow_analysis;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import lu.ses.engineering.spell.controlflow.spell.SpellElement;

public class PythonObject {
	protected String name = "";
	
	protected HashMap<String,PythonObject> knownMemberDomain = new HashMap<String, PythonObject>();
	protected HashSet<Domain> knownValueDomain= new HashSet<Domain>();

	protected LinkedHashSet<SpellElement> origin = new LinkedHashSet<SpellElement>();

	private boolean unknownMembers;
	
	public PythonObject(String name,SpellElement origin) {
		this.name = name;
		this.origin.add(origin);
	}
	
	public PythonObject(String name) {
		this.name = name;
	}
	
	public void addValueDomain(Domain domain){
		knownValueDomain.add(domain);
	}
	
	public void addMember(String name,PythonObject obj){
		knownMemberDomain.put(name, obj);
	}
	
	public PythonObject getMember(String name){
		return knownMemberDomain.get(name);
	}
	
	public Domain getValue() {
		Domain domain = new Domain();
		for (Domain d: knownValueDomain) {
			domain.append(d);
		}
		return domain;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setUnknownMembers(boolean b){
		this.unknownMembers = b;
	}
	
	private boolean hasUnknownMembers() {
		return unknownMembers;

	}

	public SpellElement getOrigin() {
		Iterator<SpellElement> iterator = origin.iterator();
		SpellElement origin = null;
		while (iterator.hasNext()){
			origin = iterator.next();
		}
		return origin;
	}
}
