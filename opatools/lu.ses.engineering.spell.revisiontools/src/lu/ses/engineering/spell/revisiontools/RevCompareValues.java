package lu.ses.engineering.spell.revisiontools;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.IParameterValues;

public class RevCompareValues implements IParameterValues {

	@Override
	public Map getParameterValues() {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("REV", "REV");
		map.put("REVDATE", "REVDATE");
		map.put("REVDATECONTENT", "REVDATECONTENT");
		return map;
	}

}
