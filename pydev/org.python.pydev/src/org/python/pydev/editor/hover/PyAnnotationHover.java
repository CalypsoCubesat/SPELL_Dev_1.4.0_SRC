/**
 * Copyright (c) 2005-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Eclipse Public License (EPL).
 * Please see the license.txt included with this distribution for details.
 * Any modifications to this file must keep this entire header intact.
 */
/*
 * Created on 02/08/2005
 *
 * @author Fabio Zadrozny
 */
package org.python.pydev.editor.hover;

import java.util.Iterator;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.ILineDiffInfo;
import org.eclipse.jface.text.source.ISourceViewer;
import org.python.pydev.core.log.Log;
import org.python.pydev.editor.codefolding.MarkerAnnotationAndPosition;
import org.python.pydev.editor.codefolding.PySourceViewer;
import org.python.pydev.shared_core.string.FastStringBuffer;
import org.python.pydev.shared_ui.utils.PyMarkerUtils;

public class PyAnnotationHover implements IAnnotationHover {

    public PyAnnotationHover(ISourceViewer sourceViewer) {
    }

    @Override
    public String getHoverInfo(ISourceViewer sourceViewer, int lineNumber) {
        FastStringBuffer buf = new FastStringBuffer();

        if (sourceViewer instanceof PySourceViewer) {
            PySourceViewer s = (PySourceViewer) sourceViewer;

            for (MarkerAnnotationAndPosition marker : s.getMarkersAtLine(lineNumber, null)) {
                try {
                    if (buf.length() > 0) {
                        buf.append("\n");
                    }
                    IMarker m = marker.markerAnnotation.getMarker();
                    if (PyMarkerUtils.showToUser(m)) {
                        buf.appendObject(m.getAttribute(IMarker.MESSAGE));
                    }
                } catch (CoreException e) {
                    Log.log(e);
                }
            }
            if (buf.isEmpty()) {
                IDocument document = sourceViewer.getDocument();
                try {
                    IRegion line = document.getLineInformation(lineNumber);
                    IAnnotationModel annotationModel = s.getAnnotationModel();
                    Iterator<Annotation> annotationIterator = annotationModel.getAnnotationIterator();
                    while (annotationIterator.hasNext()) {
                        Annotation next = annotationIterator.next();
                        if (next instanceof ILineDiffInfo) {
                            continue;
                        }
                        if (!next.isMarkedDeleted()) {
                            Position position = annotationModel.getPosition(next);
                            if (position.overlapsWith(line.getOffset(), 1)) {
                                if (buf.length() > 0) {
                                    buf.append("\n");
                                }
                                if (!buf.toString().contains(next.getText())) {
                                    buf.appendObject(next.getText());
                                }

                            }
                        }
                    }
                } catch (BadLocationException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }

        }
        return buf.toString();
    }

}
