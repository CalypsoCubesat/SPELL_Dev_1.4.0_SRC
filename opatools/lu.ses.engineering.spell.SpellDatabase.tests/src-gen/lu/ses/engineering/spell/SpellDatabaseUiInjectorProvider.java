/*
 * generated by Xtext
 */
package lu.ses.engineering.spell;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SpellDatabaseUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return lu.ses.engineering.spell.ui.internal.SpellDatabaseActivator.getInstance().getInjector("lu.ses.engineering.spell.SpellDatabase");
	}

}
