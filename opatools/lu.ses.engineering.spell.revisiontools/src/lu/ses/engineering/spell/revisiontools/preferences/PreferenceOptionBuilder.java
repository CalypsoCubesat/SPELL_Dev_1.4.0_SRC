package lu.ses.engineering.spell.revisiontools.preferences;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ColorFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.ListEditor;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.preference.ScaleFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;

public class PreferenceOptionBuilder {
	enum PreferenceType{
		BOOLEAN(BooleanFieldEditor.class){
			@Override
			public  <T> T cast(String line) {
				// TODO Auto-generated method stub
				return (T) Boolean.valueOf(line.toLowerCase());
			}
			
			@Override
			public boolean isBoolean() {
				// TODO Auto-generated method stub
				return true;
			}
			
			
		},
		FILE(FileFieldEditor.class),
		DIRECTORY(DirectoryFieldEditor.class),
		COLOR(ColorFieldEditor.class),
		INTEGER(IntegerFieldEditor.class){
			@Override
			public <T> T cast(String line) {
				// TODO Auto-generated method stub
				return (T) Long.valueOf(line);
			}
			@Override
			public boolean isInteger() {
				// TODO Auto-generated method stub
				return true;
			}
		},
		SCALE(ScaleFieldEditor.class){
			@Override
			public <T> T cast(String line) {
				// TODO Auto-generated method stub
				return (T) Long.valueOf(line);
			}
			@Override
			public boolean isInteger() {
				// TODO Auto-generated method stub
				return true;
			}
		},
		STRING(StringFieldEditor.class),
		RADIO(RadioGroupFieldEditor.class){
			@Override
			public FieldEditor build(PreferenceOptionBuilder optBuilder,
					Composite parent) {
				ArrayList<String[]> values = new ArrayList<String[]>();
				for (String validValue : optBuilder.getValidValues()) {
					if (validValue.contains(":")){
						values.add(validValue.split(":"));
					} else {
						values.add(new String[]{validValue,validValue});
					}
					
				}
				return new RadioGroupFieldEditor(optBuilder.name, optBuilder.getText(), 1,values.toArray(new String[][]{}), parent, true);
				
			}
		},
		COMBO(ComboFieldEditor.class){
			@Override
			public FieldEditor build(PreferenceOptionBuilder optBuilder,
					Composite parent) {
				ArrayList<String[]> values = new ArrayList<String[]>();
				for (String validValue : optBuilder.getValidValues()) {
					if (validValue.contains(":")){
						values.add(validValue.split(":"));
					} else {
						values.add(new String[]{validValue,validValue});
					}
					
				}
				return new ComboFieldEditor(optBuilder.name, optBuilder.getText(), values.toArray(new String[][]{}), parent);
				
			}
		},
		Default(StringFieldEditor.class),
		LABEL(FieldEditor.class){
			@Override
			public FieldEditor build(PreferenceOptionBuilder optBuilder,
					Composite parent) {
				return new FieldEditor(optBuilder.name,optBuilder.text,parent) {
					private Label label;

					@Override
					protected void init(String name, String text) {					
						super.init("__", text);
					};
					
					@Override
					public int getNumberOfControls() {
						// TODO Auto-generated method stub
						return 1;
					}
					
					@Override
					protected void doStore() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					protected void doLoadDefault() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					protected void doLoad() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					protected void doFillIntoGrid(Composite parent, int numColumns) {
						label =getLabelControl(parent);
						GridData gd = new GridData();
						gd.horizontalSpan = 1;
						// We only grab excess space if we have to
						// If another field editor has more columns then
						// we assume it is setting the width.
						gd.grabExcessHorizontalSpace = gd.horizontalSpan == 1;
						label.setLayoutData(gd);
					}
					
					@Override
					protected void adjustForNumColumns(int numColumns) {
				        GridData gd = (GridData) label.getLayoutData();
				        gd.horizontalSpan = 1;
				        // We only grab excess space if we have to
				        // If another field editor has more columns then
				        // we assume it is setting the width.
				        gd.grabExcessHorizontalSpace = gd.horizontalSpan == 1;
				        label.setLayoutData(gd);
					}
				};
			}
		},
		SEPARATOR(FieldEditor.class){
			@Override
			public FieldEditor build(PreferenceOptionBuilder optBuilder,
					Composite parent) {
				return new FieldEditor(optBuilder.name,optBuilder.text,parent) {
					private Label label;

					@Override
					protected void init(String name, String text) {					
						super.init("", "");
					};
					
					@Override
					public int getNumberOfControls() {
						// TODO Auto-generated method stub
						return 1;
					}
					
					@Override
					protected void doStore() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					protected void doLoadDefault() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					protected void doLoad() {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					protected void doFillIntoGrid(Composite parent, int numColumns) {
						label = new Label(parent, SWT.SEPARATOR | SWT.HORIZONTAL);
						label.setFont(parent.getFont());

						label.addDisposeListener(new DisposeListener() {
							@Override
							public void widgetDisposed(DisposeEvent event) {
								label = null;
							}
						});

						label.setLayoutData(new GridData(SWT.FILL, SWT.END, true, false, 2, 1));
					}
					
					@Override
					protected void adjustForNumColumns(int numColumns) {
						label.setLayoutData(new GridData(SWT.FILL, SWT.END, true, false, 2, 1));
						
					}
				};
			}
		},
		DICT(StringFieldEditor.class),
		LIST(FieldEditor.class){
			@Override
			public FieldEditor build(final PreferenceOptionBuilder optBuilder,
					Composite parent) {
				ListEditor editor = new ListEditor(optBuilder.getName(),optBuilder.getText(),parent) {
				
					@Override
					protected String[] parseString(String stringList) {
						// TODO Auto-generated method stub
						return stringList.split("\\|");
					}
					
					@Override
					protected String getNewInputObject() {
						switch (optBuilder.subType){
						case DIRECTORY:
							DirectoryDialog dirDialog = new DirectoryDialog(getShell(),SWT.APPLICATION_MODAL);
							dirDialog.setText( "Please select a value for " + optBuilder.getName());
							
							return  dirDialog.open();
						case FILE:
							
							FileDialog fileDialog = new FileDialog(getShell(),SWT.OPEN | SWT.APPLICATION_MODAL);
							fileDialog.setText( "Please select a File for " + optBuilder.getName());
							
							return  fileDialog.open();
						case DICT:
							InputDialog dialog = new InputDialog(getShell(), "Value Selection Dialog for " + optBuilder.getName(), "Please select a key for " + optBuilder.getName(), "", null);
							dialog.setBlockOnOpen(true);
							int open = dialog.open();
							if (open == SWT.CANCEL)
								return null;
							String key = dialog.getValue();
							dialog = new InputDialog(getShell(), "Value Selection Dialog for " + optBuilder.getName(), "Please select a value for " + optBuilder.getName(), "", null);
							dialog.setBlockOnOpen(true);
							open = dialog.open();
							if (open == SWT.CANCEL)
								return null;
							String value = dialog.getValue();
							return key + ":" + value;
						default:
							dialog = new InputDialog(getShell(), "Value Selection Dialog for " + optBuilder.getName(), "Please select a value for " + optBuilder.getName(), "", null);
							dialog.setBlockOnOpen(true);
							open = dialog.open();
							if (open == SWT.CANCEL)
								return null;
							return dialog.getValue();
						}
						
					}
					
					@Override
					protected String createList(String[] items) {
						String result = "";
						for (String string : items) {
							if (!result.isEmpty()){
								result += "|" + string;
							} else {
								result = string;
							}
						}
						return result;
					}
				};
				return editor;
			}
		}
		;
		private Class<? extends FieldEditor> editor;

		
		private PreferenceType(Class<? extends FieldEditor> editor) {
			this.editor = editor;			
		}
		
		public Class<? extends FieldEditor> getEditor() {
			return editor;
		}

		public <T> T cast(String line) {
			// TODO Auto-generated method stub
			return (T) line;
		}

		public boolean isString() {
			return !(isBoolean() || isInteger() || isDouble());
		}

		public boolean isBoolean() {
			// TODO Auto-generated method stub
			return false;
		}

		public boolean isInteger() {
			// TODO Auto-generated method stub
			return false;
		}

		public boolean isDouble() {
			// TODO Auto-generated method stub
			return false;
		}
		
		public FieldEditor build(PreferenceOptionBuilder optBuilder,Composite parent){
			try {
				Constructor<? extends FieldEditor> constructor = this.getEditor().getDeclaredConstructor(String.class,String.class,Composite.class);
				return constructor.newInstance(optBuilder.name,optBuilder.text,parent);
				
			}  catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			return null;
		}


	}
	private String text = "";
	private String name = "";
	private PreferenceType type = null;
	private PreferenceType subType = null;
	private Queue<String> validValues = new ArrayDeque<String>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public PreferenceType getType() {
		return type;
	}
	public void setType(String type) {
		try {
			this.type = PreferenceType.valueOf(type.toUpperCase());
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public FieldEditor createFieldEditor(FieldEditorPreferencePage page,Composite parent){
		if (type != null){
			return type.build(this, parent);
		}
		return null;
	}
	public Queue<String> getValidValues() {
		return validValues;
	}

	public void setValidValues(Queue<String> validValues) {
		this.validValues = validValues;
	}
	public PreferenceType getSubType() {
		return subType;
	}
	public void setSubType(String subType) {
		try {
			this.subType = PreferenceType.valueOf(subType.toUpperCase());
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
