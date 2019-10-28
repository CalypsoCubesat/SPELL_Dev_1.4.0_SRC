package com.astra.ses.spell.database.browser.ui;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import com.astra.ses.spell.dev.database.interfaces.ICalibration;
import com.astra.ses.spell.dev.database.interfaces.ISpellDatabase;
import com.astra.ses.spell.dev.database.interfaces.ITelecommand;
import com.astra.ses.spell.dev.database.interfaces.ITelecommandArgument;
import com.astra.ses.spell.dev.database.interfaces.ITelemetryParameter;

public class TelemetryViewDialog extends MessageDialog {

	private ITelemetryParameter tm;
	private Label tmNameLabel;
	private Label tmDescLabel;
	private Control customArea;
	private ISpellDatabase db;
	private Shell shell;

	/**
	 * @param parentShell
	 * @param tc
	 */
	public TelemetryViewDialog(Shell parentShell,ITelemetryParameter tm,ISpellDatabase db) {
		super(parentShell,"Telemetry Info Dialog",null,"",MessageDialog.NONE,0,"Close");
		this.tm = tm;
		this.db = db;
		this.shell = parentShell;
	}
	
	protected void setShellStyle(int arg0) 
	{
		 super.setShellStyle(
				 arg0 | SWT.CLOSE | SWT.MODELESS | SWT.BORDER | SWT.TITLE | SWT.ON_TOP);
         setBlockOnOpen(false);
	}
	@Override
	protected Control createMessageArea(Composite composite) {
		// TODO Auto-generated method stub
		return composite;
	}
	@Override
	protected Control createDialogArea(Composite parent) {
        // create message area
        createMessageArea(parent);
        // create the top level composite for the dialog area
        Composite composite = new Group(parent, SWT.NONE);
        GridLayout layout = new GridLayout();
        layout.marginHeight = 0;
        layout.marginWidth = 0;
        composite.setLayout(layout);
        GridData data = new GridData(GridData.FILL_BOTH);
        data.horizontalSpan = 2;
        composite.setLayoutData(data);
        // allow subclasses to add custom controls
        customArea = createCustomArea(composite);
        //If it is null create a dummy label for spacing purposes
        if (customArea == null) {
			customArea = new Label(composite, SWT.NULL);
		}
        return composite;
    }
	
	@Override
	protected Control createCustomArea(Composite parent) 
	{
		Composite composite = new Composite(parent, SWT.NONE);
		try {
			createDialogContents(composite);
		}catch (Exception e) {
			e.printStackTrace();
		}
		composite.layout();
		setDialogLocation();
		return composite;
	}


	private void createDialogContents( Composite composite )
	{
		composite.setLayout(new GridLayout(1, false));
		composite = new Composite(composite, SWT.None);
		composite.setLayout(new GridLayout(3, false));
		Label label = new Label( composite , SWT.None );
		label.setText("TC Name: ");
		label = new Label( composite , SWT.None );
		label.setText(": ");
		tmNameLabel = new Label( composite , SWT.None );
		tmNameLabel.setText(tm.getName());
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		tmNameLabel.setLayoutData(gridData);
		
		label = new Label( composite , SWT.None );
		label.setText("TC Description");
		label = new Label( composite , SWT.None );
		label.setText(": ");
		tmDescLabel = new Label( composite , SWT.None );
		tmDescLabel.setText(tm.getDescription());
		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		tmDescLabel.setLayoutData(gridData);
		
		label = new Label( composite , SWT.None );
		label.setText("TM Measuring Unit");
		label = new Label( composite , SWT.None );
		label.setText(": ");
		label = new Label( composite , SWT.None );
		label.setText(tm.getMeasuringUnit());
		

		String calibrationId = tm.getDefaultCalibrationId();
		ICalibration calibrationModel = db.getCalibrationModel(calibrationId);
		if (calibrationModel != null){
			label = new Label( composite , SWT.None );
			label.setText("TM Calibrations");
			label = new Label( composite , SWT.None );
			label.setText(": ");
			label = new Label( composite , SWT.None );
			label.setText(" ");
			
			composite = composite.getParent();
			
			composite = new Group(composite, SWT.EMBEDDED);
			composite.setLayout(new GridLayout(1,false));
			gridData = new GridData();
			gridData.horizontalAlignment = SWT.FILL;
			gridData.grabExcessHorizontalSpace = true;
			composite.setLayoutData(gridData);
			
			List tmArgList = new List(composite, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL){
				@Override
				public Point computeSize(final int wHint, final int hHint, final boolean changed) {
					final Point preferredSize = super.computeSize(wHint, hHint, changed);
					return new Point( preferredSize.x, Math.min(500, preferredSize.y));
				}
				@Override
				protected void checkSubclass () {

				}
			};
			gridData = new GridData();
			gridData.horizontalAlignment = SWT.FILL;
			gridData.grabExcessHorizontalSpace = true;
			tmArgList.setLayoutData(gridData);
			for (int rawValue = 0; rawValue < calibrationModel.getValidValues().size(); rawValue++) {
				String calibrated = calibrationModel.getCalibrated("" + rawValue);
				tmArgList.add(rawValue + " : " + calibrated);
			}
			
		}
	}

	private void setDialogLocation()
	{
		if (shell.getParent() == null)
			return;
        Rectangle parentSize = shell.getParent().getBounds();
        Rectangle shellSize = shell.getBounds();
        int locationX = (parentSize.width - shellSize.width) / 2 + parentSize.x;
        int locationY = (parentSize.height - shellSize.height) / 2 + parentSize.y;
        shell.setLocation(new Point(locationX, locationY));
	}
	
}
