/*
* generated by Xtext
*/
package lu.ses.engineering.spell.controlflow;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SpellGrammarUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return lu.ses.engineering.spell.controlflow.ui.internal.SpellGrammarActivator.getInstance().getInjector("lu.ses.engineering.spell.controlflow.SpellGrammar");
	}
	
}
