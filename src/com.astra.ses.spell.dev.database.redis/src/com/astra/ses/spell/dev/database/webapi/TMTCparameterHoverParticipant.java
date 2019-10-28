package com.astra.ses.spell.dev.database.webapi;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.ITypedRegion;
import org.python.pydev.core.docutils.PySelection;
import org.python.pydev.core.log.Log;
import org.python.pydev.editor.PyInformationPresenter;
import org.python.pydev.editor.codefolding.PySourceViewer;
import org.python.pydev.editor.hover.AbstractPyEditorTextHover;
import org.python.pydev.shared_core.string.FastStringBuffer;

import com.astra.ses.spell.dev.database.DatabaseManager;
import com.astra.ses.spell.dev.database.interfaces.ICalibration;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.interfaces.ITelecommand;
import com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter;

public class TMTCparameterHoverParticipant extends AbstractPyEditorTextHover {

	@Override
	public boolean isContentTypeSupported(String contentType) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		FastStringBuffer buf = new FastStringBuffer();
		if (textViewer == null || textViewer.getDocument() == null)
			return null;
		if (((org.eclipse.jface.text.AbstractDocument) textViewer.getDocument())
				.getDocumentPartitioner("__PYTHON_PARTITION_TYPE") == null)
			return null;
		ITypedRegion partition = ((org.eclipse.jface.text.AbstractDocument) textViewer.getDocument())
				.getDocumentPartitioner("__PYTHON_PARTITION_TYPE").getPartition(hoverRegion.getOffset());
		if ("__python_singleline_bytes_or_unicode1".equals(partition.getType())) {
			String possibleTMTC;
			try {
				possibleTMTC = textViewer.getDocument().get(partition.getOffset(), partition.getLength()).substring(1);

				if ( (textViewer instanceof PySourceViewer) && (possibleTMTC.startsWith("C ") || possibleTMTC.startsWith("T "))) {
					PySourceViewer s = (PySourceViewer) textViewer;
					int line = textViewer.getDocument().getLineOfOffset(partition.getOffset());
					PySelection ps = new PySelection(s.getDocument(), line,
							partition.getOffset() - textViewer.getDocument().getLineOffset(line),
							partition.getLength());

					try {
						String hoverText = getHoverText(partition, s, ps, textSelection);
						if (hoverText != null && hoverText.trim().length() > 0) {
							if (buf.length() > 0) {
								buf.append(PyInformationPresenter.LINE_DELIM);
							}
							buf.append(hoverText);
						}
					} catch (Exception e) {
						// clients should not make the hover fail!
						Log.log(e);
					}
				}
			} catch (BadLocationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return buf.toString();
	};

	public String getHoverText(IRegion hoverRegion, PySourceViewer s, PySelection ps, ITextSelection textSelection) {
		if (hoverRegion instanceof ITypedRegion) {
			String selectedText = ps.getSelectedText();
			selectedText = selectedText.substring(1, selectedText.length() - 1);
			IProject prj = (IProject) ((IAdaptable) s).getAdapter(IProject.class);
			ISpellDatabase projectDatabase = DatabaseManager.getInstance().getProjectDatabase(prj);
			if (projectDatabase != null) {
				if (selectedText.startsWith("T ")) {
					ITelemetryParameter telemetryModel = projectDatabase.getTelemetryModel(selectedText.split(" ")[1]);
					if (telemetryModel != null) {
						String tmDescription = "TM Found:\n";
						tmDescription += "T <pydev_hint_bold>" + telemetryModel.getName() + "</pydev_hint_bold> "
								+ telemetryModel.getDescription() + "\n";
						tmDescription += "\tUnit: " + telemetryModel.getMeasuringUnit() + "\n";
						if (!telemetryModel.getDefaultCalibrationId().isEmpty()) {
							tmDescription += "\tValid Values: " + telemetryModel.getCalibrations() + "   \n";
						}

						return tmDescription;
					} else {
						return "Could not find TM " + selectedText + "!";
					}

				} else if (selectedText.startsWith("C ")) {
					ITelecommand telecommandModel = projectDatabase.getTelecommandModel(selectedText.split(" ")[1]);
					if (telecommandModel != null) {
						String tcDescription = "TC Found\n";
						tcDescription += "C <pydev_hint_bold>" + telecommandModel.getName() + "</pydev_hint_bold> "
								+ telecommandModel.getDescription() + "\n";

						for (ITelecommandArgument arg : telecommandModel.getArguments()) {
							if (arg.isOptional()) {
								tcDescription += "\tO";
								String calibrationId = arg.getCalibrationId();
								if (calibrationId.isEmpty()) {
									tcDescription += " " + arg.getName() + " = " + arg.getType().toString() + " (in "
											+ arg.getUnits() + ")\n";
								} else {
									ICalibration calibrationModel = projectDatabase.getCalibrationModel(calibrationId);
									tcDescription += " " + arg.getName() + " = " + arg.getUnits() + " -> "
											+ calibrationModel.getValidValues().toString() + "\n";
								}
								;
							} else {
								tcDescription += "\tM";
								String calibrationId = arg.getCalibrationId();
								if (calibrationId.isEmpty()) {
									tcDescription += " <pydev_hint_bold>" + arg.getName() + "</pydev_hint_bold> = "
											+ arg.getType().toString() + " (in " + arg.getUnits() + ")\n";
								} else {
									ICalibration calibrationModel = projectDatabase.getCalibrationModel(calibrationId);
									tcDescription += " <pydev_hint_bold>" + arg.getName() + "</pydev_hint_bold> = "
											+ arg.getUnits() + " -> " + calibrationModel.getValidValues().toString()
											+ "\n";
								}
							}
						}
						return tcDescription;
					} else {
						return "Could not find TC " + selectedText + "!";
					}

				}
			}
		}
		return null;
	}

}
