/*
 * generated by Xtext
 */
package lu.ses.engineering.B7022SPELL.WorkspaceGrammar.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractReportGrammarValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.ses.com/workspace"));
		return result;
	}
}
