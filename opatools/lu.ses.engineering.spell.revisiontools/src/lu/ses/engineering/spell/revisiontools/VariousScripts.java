package lu.ses.engineering.spell.revisiontools;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.IWorkbenchContribution;
import org.eclipse.ui.services.IServiceLocator;

import lu.ses.engineering.spell.revisiontools.preferences.ScriptMenuBuilder;

public class VariousScripts extends CompoundContributionItem implements IWorkbenchContribution {

	private IServiceLocator serviceLocator;
	private ScriptMenuBuilder builder;

	public VariousScripts() {
		super("Python Scripts");
	}

	public VariousScripts(String id) {
		super(id);
	}
	
	public VariousScripts(String id,ScriptMenuBuilder builder) {
		super(id);
		this.builder = builder;
	}
	@Override
	public IContributionItem[] getContributionItems() {
		
		if (builder == null){
			return ScriptMenuBuilder.buildAllMenus(serviceLocator);
			
		} else {
			MenuManager subMenu = new MenuManager(builder.getId(),builder.getId());
			
			IContributionItem[] allMenus = builder.buildAllChildMenus(serviceLocator);
			for (IContributionItem iContributionItem : allMenus) {
				subMenu.add(iContributionItem);
			}
			
			return new IContributionItem[]{subMenu};
		}
		
	}

	@Override
	public void initialize(IServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;		
		
	}



	@Override
	public boolean isEnabled() {
		if (builder == null){
			return builder.hasChilds();
		} else {
			return ScriptMenuBuilder.hasMenus();
		}
		
	}
}
