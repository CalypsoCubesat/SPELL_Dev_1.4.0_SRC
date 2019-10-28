package lu.ses.engineering.spell.revisiontools.ui;

import java.util.Arrays;
import java.util.HashMap;

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;

public class GetReprElementFunction extends BrowserFunction {

	private ActivityDiagramView activityDiagramView;
	private Browser diagramBrowser;
	private String funcName;
	private HashMap<Integer,Integer> indexCache = new HashMap<Integer,Integer>();
	
	public GetReprElementFunction(ActivityDiagramView activityDiagramView,
			Browser diagramBrowser, String funcName) {
		super(diagramBrowser,funcName);
		this.activityDiagramView = activityDiagramView;
		this.diagramBrowser = diagramBrowser;
		this.funcName = funcName;

	}
	
	@Override
	public Object function (Object[] arguments) {
		/*for (int i = 0; i < arguments.length; i++) {
			Object arg = arguments[i];
			if (arg == null) {
				System.out.println ("\t-->null");
			} else {
				System.out.println ("\t-->" + arg.getClass ().getName () + ": " + arg.toString ());
			}
		}*/
		
		
		if (arguments.length == 1 && arguments[0] != null){

			if (arguments[0] instanceof String){
				String mangled = (String) arguments[0];
				mangled = mangled.replaceAll("###-?\\d+###", "");
				return mangled;
			} else {
				return arguments[0];
			}
		} 
		
		throw new RuntimeException("Cancel Link!");
		
	}
}
