package lu.ses.engineering.spell.revisiontools.ui;

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;

public class CreateTaskFlowFunction extends BrowserFunction {
	private ActivityDiagramView activityDiagramView;
	private Browser diagramBrowser;
	private String funcName;

	public CreateTaskFlowFunction(ActivityDiagramView activityDiagramView,
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
		
		activityDiagramView.createTaskFlowDiagram(true);
		throw new RuntimeException("Cancel Link!");
		
	}
}
