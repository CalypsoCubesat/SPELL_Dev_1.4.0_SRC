package lu.ses.engineering.spell.flow_analysis;

public class CompoundPythonObject extends PythonObject {

	public CompoundPythonObject(String name,PythonObject obj1,PythonObject obj2) {
		super(name);
		//this.obj1 = obj1;
		//this.obj2 = obj2;
		this.origin.addAll(obj1.origin);
		this.origin.addAll(obj2.origin);
		
		
	}

	public static PythonObject joinObjects(PythonObject obj1,
			PythonObject obj2) {
		if (obj1 == null)
			return obj2;
		if (obj2 == null)
			return obj1;
		if (obj1.equals(obj2))
			return obj1;
		return new CompoundPythonObject(obj1.getName(), obj1, obj2);
	}
	
	

}
