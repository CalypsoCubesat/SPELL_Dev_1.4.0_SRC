package lu.ses.engineering.spell.revisiontools;

import org.eclipse.core.runtime.preferences.DefaultScope;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.ui.IStartup;

public class SpellDevFixer implements IStartup {

	@Override
	public void earlyStartup() {
		IEclipsePreferences node = new DefaultScope().getNode("org.python.pydev");

		node.put("TITLE_EDITOR_SHOW_EXTENSION", "true");
		node.put("TITLE_EDITOR_NAMES_UNIQUE", "false");
		
	}

}
