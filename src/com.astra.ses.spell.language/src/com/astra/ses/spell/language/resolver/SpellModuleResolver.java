package com.astra.ses.spell.language.resolver;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.python.pydev.editor.codecompletion.IPythonModuleResolver;

public class SpellModuleResolver implements IPythonModuleResolver {

	public SpellModuleResolver() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String resolveModule(IProject project, IPath moduleLocation, List<IPath> baseLocations) {
		if (moduleLocation.getFileExtension().equalsIgnoreCase("py")) {
			return moduleLocation.lastSegment().substring(0,moduleLocation.lastSegment().lastIndexOf(".py"));
		}
		
		return null;
	}

	@Override
	public Collection<IPath> findAllModules(IProject project, IProgressMonitor monitor) {
		if (project == null)
			return null;
		final HashSet<IPath> modules = new HashSet<IPath>();
		try {
			project.accept(new IResourceVisitor() {
				
				@Override
				public boolean visit(IResource resource) throws CoreException {
					if (resource instanceof IFile) {
						if (resource.getFileExtension() != null && resource.getFileExtension().equalsIgnoreCase("py")) {
							modules.add(resource.getLocation());
						}
					}
					if (resource.getName().equals(".git") || resource.getName().equals(".svn"))
						return false;
					return true;
				}
			});
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return modules;
	}

}
