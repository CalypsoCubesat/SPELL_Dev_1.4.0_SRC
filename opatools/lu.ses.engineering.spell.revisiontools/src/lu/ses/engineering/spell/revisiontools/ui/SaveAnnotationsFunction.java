package lu.ses.engineering.spell.revisiontools.ui;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.HashMap;

import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;

public class SaveAnnotationsFunction extends BrowserFunction {

	private ActivityDiagramView activityDiagramView;
	private Browser diagramBrowser;
	private String funcName;
	private HashMap<Integer,Integer> indexCache = new HashMap<Integer,Integer>();
	
	public SaveAnnotationsFunction(ActivityDiagramView activityDiagramView,
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
		
		try {
			File htmlFile = activityDiagramView.getLastPath();
			if (htmlFile == null)
				htmlFile = activityDiagramView.getCurrentPath();
			activityDiagramView.setLastPath(null);
			
			String html = diagramBrowser.getText();
			FileOutputStream out = new FileOutputStream(htmlFile);
			out.write(html.getBytes());
			out.close();
			
			int startIndex = html.indexOf("<svg");
			int endIndex = html.indexOf("</svg>") + "</svg>".length();
			String svg = html.substring(startIndex,endIndex);
			FileOutputStream svgOut = new FileOutputStream(htmlFile.toString().replaceAll("\\.html", "\\.svg"));
			svgOut.write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\"\n\"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">\n\n".getBytes());
			svgOut.write(svg.replaceAll("( |\t)( |\t)( |\t)( |\t)+"," ").getBytes());
			svgOut.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		throw new RuntimeException("Cancel Link!");
		
	}
}
