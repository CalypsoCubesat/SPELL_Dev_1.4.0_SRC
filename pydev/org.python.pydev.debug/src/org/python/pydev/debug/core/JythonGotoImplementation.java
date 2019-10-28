package org.python.pydev.debug.core;

import org.python.core.PyFrame;

public class JythonGotoImplementation {

    public void gotoLine(PyFrame frame, int newLine) {
        System.out.println("frame: " + frame + " line: " + newLine);
        frame.f_lasti = newLine;
        try {
            throw new RuntimeException("");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
