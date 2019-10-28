package org.python.pydev.debug.newconsole;

import static org.python.pydev.debug.newconsole.PromptType.ALPHA;
import static org.python.pydev.debug.newconsole.PromptType.CANCEL;
import static org.python.pydev.debug.newconsole.PromptType.LIST;
import static org.python.pydev.debug.newconsole.PromptType.NO;
import static org.python.pydev.debug.newconsole.PromptType.NUM;
import static org.python.pydev.debug.newconsole.PromptType.OK;
import static org.python.pydev.debug.newconsole.PromptType.OK_CANCEL;
import static org.python.pydev.debug.newconsole.PromptType.YES;
import static org.python.pydev.debug.newconsole.PromptType.YES_NO;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

public class DebugInputHelper {
    public static String requestInput(final String promptText, final Integer promptType, final Object[] options) {
        final String[] result = new String[] { null };
        final ArrayList<String> buttonOptions = new ArrayList<>();
        if (YES.matches(promptType)) {
            buttonOptions.add("YES");
        } else if (NO.matches(promptType)) {
            buttonOptions.add("NO");
        } else if (OK.matches(promptType)) {
            buttonOptions.add("OK");
        } else if (CANCEL.matches(promptType)) {
            buttonOptions.add("CANCEL");
        } else if (YES_NO.matches(promptType)) {
            buttonOptions.add("YES");
            buttonOptions.add("NO");
        } else if (OK_CANCEL.matches(promptType)) {
            buttonOptions.add("OK");
            buttonOptions.add("CANCEL");
        } else {
        }
        if (!buttonOptions.isEmpty()) {

            Display.getDefault().syncExec(new Runnable() {

                @Override
                public void run() {
                    Shell shell = new Shell(Display.getDefault().getActiveShell());

                    MessageDialog dialog = new MessageDialog(shell, "SPELL Prompt", null,
                            promptText, MessageDialog.INFORMATION,
                            buttonOptions.toArray(new String[buttonOptions.size()]),
                            0) {
                        @Override
                        protected void setShellStyle(int newShellStyle) {
                            super.setShellStyle(SWT.CLOSE | SWT.MODELESS | SWT.BORDER | SWT.TITLE | SWT.ON_TOP);
                            setBlockOnOpen(false);
                        }
                    };
                    if (shell.getParent() != null) {
                        Rectangle parentSize = shell.getParent().getBounds();
                        Rectangle shellSize = shell.getBounds();
                        int locationX = (parentSize.width - shellSize.width) / 2 + parentSize.x;
                        int locationY = (parentSize.height - shellSize.height) / 2 + parentSize.y;
                        shell.setLocation(new Point(locationX, locationY));
                    }
                    int selectedIndex = dialog.open();
                    shell.dispose();
                    result[0] = buttonOptions.get(selectedIndex);
                }
            });

            return "'" + result[0] + "'";
        }
        if (options.length > 0) {
            Display.getDefault().syncExec(new Runnable() {

                @Override
                public void run() {
                    Shell shell = new Shell(Display.getDefault().getActiveShell());
                    //                                        Point pt = Display.getDefault().getCursorLocation();
                    //                                        Monitor primaryMonitor = Display.getDefault().getPrimaryMonitor ();
                    //                                        Rectangle bounds = primaryMonitor.getBounds ();
                    //                                        Rectangle rect = shell.getBounds ();
                    //                                        int x = bounds.x + (bounds.width - rect.width) / 2 ;
                    //                                        int y = bounds.y + (bounds.height - rect.height) / 2 ;
                    //                                        shell.setLocation (x, y);
                    ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, new LabelProvider()) {
                        @Override
                        protected void setShellStyle(int newShellStyle) {
                            super.setShellStyle(
                                    SWT.CLOSE | SWT.MODELESS | SWT.BORDER | SWT.ON_TOP | SWT.SINGLE);
                            setBlockOnOpen(false);
                            setMultipleSelection(false);
                        }
                    };
                    dialog.setTitle(promptText);
                    dialog.setElements(options);
                    if (shell.getParent() != null) {
                        Rectangle parentSize = shell.getParent().getBounds();
                        Rectangle shellSize = shell.getBounds();
                        int locationX = (parentSize.width - shellSize.width) / 2 + parentSize.x;
                        int locationY = (parentSize.height - shellSize.height) / 2 + parentSize.y;
                        shell.setLocation(new Point(locationX, locationY));
                    }
                    int dialog_result = dialog.open();

                    if (dialog_result == Dialog.OK) {
                        if (NUM.matches(promptType) || ALPHA.matches(promptType)) {
                            result[0] = dialog.getFirstResult().toString();
                            if (result[0].contains(":")) {
                                if (LIST.matches(promptType)) {
                                    //result[0] = result[0].substring(result[0].indexOf(":") + 1).trim();
                                } else {
                                    //result[0] = result[0].substring(0, result[0].indexOf(":")).trim();
                                }

                            }
                            if (!NUM.matches(promptType)) {
                                result[0] = "'" + result[0] + "'";
                            }

                        } else {
                            if (LIST.matches(promptType)) {
                                result[0] = dialog.getFirstResult().toString();
                                result[0] = "'" + result[0].substring(0, result[0].indexOf(":")).trim() + "'";
                            } else {
                                result[0] = "'" + dialog.getFirstResult().toString() + "'";
                            }

                        }

                    }
                }
            });

            return result[0];
        } else if (NUM.matches(promptType)) {
            Display.getDefault().syncExec(new Runnable() {

                @Override
                public void run() {
                    Shell shell = new Shell(Display.getDefault().getActiveShell());

                    InputDialog dialog = new InputDialog(shell, "SPELL Input Dialog", promptText, "",
                            new IInputValidator() {

                                @Override
                                public String isValid(String newText) {
                                    try {
                                        Integer.parseInt(newText);
                                        return null;
                                    } catch (Exception ex) {

                                    }
                                    try {
                                        Integer.parseInt(newText, 16);
                                        return null;
                                    } catch (Exception ex) {

                                    }
                                    try {
                                        Integer.parseInt(newText, 2);
                                        return null;
                                    } catch (Exception ex) {

                                    }
                                    try {
                                        Long.parseLong(newText);
                                        return null;
                                    } catch (Exception ex) {

                                    }
                                    try {
                                        Long.parseLong(newText, 16);
                                        return null;
                                    } catch (Exception ex) {

                                    }
                                    try {
                                        Long.parseLong(newText, 2);
                                        return null;
                                    } catch (Exception ex) {

                                    }
                                    try {
                                        Double.parseDouble(newText);
                                        return null;
                                    } catch (Exception ex) {

                                    }
                                    return "Value is not a number!";
                                }
                            }) {
                        @Override
                        protected void setShellStyle(int newShellStyle) {
                            super.setShellStyle(SWT.CLOSE | SWT.MODELESS | SWT.BORDER | SWT.TITLE | SWT.ON_TOP);
                            setBlockOnOpen(false);
                        }
                    };
                    if (shell.getParent() != null) {
                        Rectangle parentSize = shell.getParent().getBounds();
                        Rectangle shellSize = shell.getBounds();
                        int locationX = (parentSize.width - shellSize.width) / 2 + parentSize.x;
                        int locationY = (parentSize.height - shellSize.height) / 2 + parentSize.y;
                        shell.setLocation(new Point(locationX, locationY));
                    }
                    int dialog_result = dialog.open();
                    if (dialog_result == Dialog.OK) {
                        result[0] = dialog.getValue();
                    }
                    shell.dispose();
                }
            });
        } else if (ALPHA.matches(promptType)) {
            Display.getDefault().syncExec(new Runnable() {

                @Override
                public void run() {
                    Shell shell = new Shell(Display.getDefault().getActiveShell());

                    InputDialog dialog = new InputDialog(shell, "SPELL Input Dialog", promptText, "",
                            new IInputValidator() {

                                @Override
                                public String isValid(String newText) {
                                    return null;
                                }
                            }) {
                        @Override
                        protected void setShellStyle(int newShellStyle) {
                            super.setShellStyle(SWT.CLOSE | SWT.MODELESS | SWT.BORDER | SWT.TITLE | SWT.ON_TOP);
                            setBlockOnOpen(false);
                        }
                    };
                    if (shell.getParent() != null) {
                        Rectangle parentSize = shell.getParent().getBounds();
                        Rectangle shellSize = shell.getBounds();
                        int locationX = (parentSize.width - shellSize.width) / 2 + parentSize.x;
                        int locationY = (parentSize.height - shellSize.height) / 2 + parentSize.y;
                        shell.setLocation(new Point(locationX, locationY));
                    }
                    int dialog_result = dialog.open();
                    if (dialog_result == Dialog.OK) {
                        result[0] = dialog.getValue();
                    }
                    shell.dispose();
                }
            });
            return "'" + result[0] + "'";
        } else {
            Display.getDefault().syncExec(new Runnable() {

                @Override
                public void run() {
                    Shell shell = new Shell(Display.getDefault().getActiveShell());

                    InputDialog dialog = new InputDialog(shell, "SPELL Input Dialog",
                            promptText + "\nType is undefined. Please enter SPELL Code!", "",
                            new IInputValidator() {

                                @Override
                                public String isValid(String newText) {
                                    return null;
                                }
                            }) {
                        @Override
                        protected void setShellStyle(int newShellStyle) {
                            super.setShellStyle(SWT.CLOSE | SWT.MODELESS | SWT.BORDER | SWT.TITLE | SWT.ON_TOP);
                            setBlockOnOpen(false);
                        }
                    };
                    if (shell.getParent() != null) {
                        Rectangle parentSize = shell.getParent().getBounds();
                        Rectangle shellSize = shell.getBounds();
                        int locationX = (parentSize.width - shellSize.width) / 2 + parentSize.x;
                        int locationY = (parentSize.height - shellSize.height) / 2 + parentSize.y;
                        shell.setLocation(new Point(locationX, locationY));
                    }
                    int dialog_result = dialog.open();
                    if (dialog_result == Dialog.OK) {
                        result[0] = dialog.getValue();
                    }
                    shell.dispose();
                }
            });
        }
        return result[0];
    }
}
