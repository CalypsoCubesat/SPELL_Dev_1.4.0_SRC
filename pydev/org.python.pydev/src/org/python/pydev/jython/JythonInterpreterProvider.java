package org.python.pydev.jython;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.core.runtime.Platform;
import org.osgi.framework.Bundle;
import org.python.pydev.ui.pythonpathconf.AlreadyInstalledInterpreterProvider;
import org.python.pydev.ui.pythonpathconf.IInterpreterProvider;
import org.python.pydev.ui.pythonpathconf.IInterpreterProviderFactory;
import org.python.pydev.ui.pythonpathconf.JythonInterpreterProviderFactory;

public class JythonInterpreterProvider extends JythonInterpreterProviderFactory {
    @Override
    public IInterpreterProvider[] getInterpreterProviders(InterpreterType type) {
        if (type != IInterpreterProviderFactory.InterpreterType.JYTHON) {
            return null;
        }
        Set<String> pathsToSearch = new LinkedHashSet<String>();

        Bundle bundle = Platform.getBundle("org.python.pydev.jython");
        if (bundle != null) {
            String location = bundle.getLocation();
            System.out.println("Jython Plugin Path: " + location);
            pathsToSearch.add(location.substring("reference:file:".length()));
        }

        String[] searchResults = searchPaths(pathsToSearch, Arrays.asList("jython.jar"));
        if (searchResults.length > 0) {
            return AlreadyInstalledInterpreterProvider.create("jython", searchResults);
        }
        return null;

    }

}
