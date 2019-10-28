package lu.ses.engineering.spell.revisiontools.ui;

import java.util.Arrays;
import java.util.HashMap;

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;

public class SwitchToElementFunction extends BrowserFunction {

	private ActivityDiagramView activityDiagramView;
	private Browser diagramBrowser;
	private String funcName;
	private HashMap<Integer,Integer> indexCache = new HashMap<Integer,Integer>();
	
	public SwitchToElementFunction(ActivityDiagramView activityDiagramView,
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
			if (arguments[0] instanceof Double){
				double val = (Double)arguments[0];
				activityDiagramView.switchToLine((int)Math.round(val));
			} else if (arguments[0] instanceof Integer){
				activityDiagramView.switchToLine((Integer)arguments[0]);
			} else if (arguments[0] instanceof String){
				activityDiagramView.switchToStep((String)arguments[0]);
			}
		} else if (arguments.length > 1 && arguments[0] != null) {
			int hashCode = Arrays.deepHashCode(arguments);
			Integer index = indexCache.get(hashCode);
			if (index == null){
				index = 0;
			}
			if (arguments[index%arguments.length] instanceof Double){
				double val = (Double)arguments[index%arguments.length];
				activityDiagramView.switchToLine((int)Math.round(val));
			} else if (arguments[index%arguments.length] instanceof Integer){
				activityDiagramView.switchToLine((Integer)arguments[index%arguments.length]);
			} else if (arguments[index%arguments.length] instanceof String){
				activityDiagramView.switchToStep((String)arguments[index%arguments.length]);
			}
			index++;
			indexCache.put(hashCode, index);
		}
		
		throw new RuntimeException("Cancel Link!");
		
	}
}
