/*
 * generated by Xtext
 */
package lu.ses.engineering.spell.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import lu.ses.engineering.spell.ui.internal.SpellDatabaseActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SpellDatabaseExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SpellDatabaseActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SpellDatabaseActivator.getInstance().getInjector(SpellDatabaseActivator.LU_SES_ENGINEERING_SPELL_SPELLDATABASE);
	}
	
}
