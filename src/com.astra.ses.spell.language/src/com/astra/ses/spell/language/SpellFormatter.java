package com.astra.ses.spell.language;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.python.pydev.core.ExtensionHelper;
import org.python.pydev.core.IInterpreterInfo;
import org.python.pydev.core.IInterpreterManager;
import org.python.pydev.core.IPyFormatStdProvider;
import org.python.pydev.core.MisconfigurationException;
import org.python.pydev.core.docutils.ParsingUtils;
import org.python.pydev.core.docutils.PySelection;
import org.python.pydev.core.docutils.SyntaxErrorException;
import org.python.pydev.core.log.Log;
import org.python.pydev.editor.actions.PyFormatStd.FormatStd;
import org.python.pydev.parser.prettyprinterv2.IFormatter;
import org.python.pydev.plugin.PydevPlugin;
import org.python.pydev.plugin.nature.SystemPythonNature;
import org.python.pydev.plugin.preferences.PyCodeFormatterPage;
import org.python.pydev.runners.SimplePythonRunner;
import org.python.pydev.shared_core.callbacks.ICallback;
import org.python.pydev.shared_core.io.FileUtils;
import org.python.pydev.shared_core.process.ProcessUtils;
import org.python.pydev.shared_core.string.FastStringBuffer;
import org.python.pydev.shared_core.string.StringUtils;
import org.python.pydev.shared_core.string.TextSelectionUtils;
import org.python.pydev.shared_core.structure.Tuple;
import org.python.pydev.shared_core.structure.Tuple3;

import com.astra.ses.spell.language.beautifier.CodeBeautifier;

public class SpellFormatter implements IFormatter {

	protected CodeBeautifier beautifier = new CodeBeautifier();

	/**
	 * @return the source code formatter to be used.
	 */
	public IFormatter getFormatter() {
		IFormatter participant = (IFormatter) ExtensionHelper.getParticipant(ExtensionHelper.PYDEV_FORMATTER, false);
		if (participant == null) {
			participant = this;
		}
		return participant;
	}

	public void formatSelection(IDocument doc, int[] regionsForSave, IPyFormatStdProvider edit, PySelection ps) {
		FormatStd formatStd = getFormat(edit);
		formatSelection(doc, regionsForSave, edit, ps, formatStd);
	}

	/**
	 * Formats the given selection
	 * 
	 * @see IFormatter
	 */
	public void formatSelection(IDocument doc, int[] regionsForSave, IPyFormatStdProvider edit, PySelection ps,
			FormatStd formatStd) {
		// Formatter formatter = new Formatter();
		// formatter.formatSelection(doc, startLine, endLineIndex, edit, ps);

		if (formatStd.formatWithAutopep8) {
			// get a copy of formatStd to avoid being overwritten by settings
            FormatStd formatStdNew = (FormatStd) (edit != null ? edit.getFormatStd() : getFormat(null));
            // no need to remember old values, as they'll always be created from scratch
			try {
				// assume it's a continuous region
				if (regionsForSave.length > 0) { // at least one line selected
					int firstSelectedLine = regionsForSave[0] + 1;
					int lastSelectedLine = regionsForSave[regionsForSave.length - 1] + 1;
					// hack, use global settings to pass down argument to
					// formatStr
					// that possibly overwrites other --range options, but
					// that's highly unlikely
					// autopep8 says that it accepts line-range, but then it
					// complains in runtime
					// so range is used instead
					formatStdNew.autopep8Parameters += " --range " + firstSelectedLine + " " + lastSelectedLine;
				}
				formatAll(doc, edit, true, formatStdNew, true);
			} catch (SyntaxErrorException e) {
				
			}
			return;
		}

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Tuple3<Integer, Integer, String>> replaces = new ArrayList();
		int firstSelectedLine = regionsForSave[0] + 1;
		int lastSelectedLine = regionsForSave[regionsForSave.length - 1];
		try {
			int offset = doc.getLineInformation(firstSelectedLine-1).getOffset();
			int length = (doc.getLineInformation(lastSelectedLine).getOffset() - offset) + doc.getLineInformation(lastSelectedLine).getLength();
		
			String docContents = doc.get(offset,length);
			String delimiter = PySelection.getDelimiter(doc);
			IDocument formatted;
			try {
//				boolean adjustForNL = false;
//				if (docContents.startsWith(" ")) {
//					docContents = "\n" + docContents;
//					adjustForNL = true;
//				}
			    String formatAll = formatAll(formatStd, true, docContents, delimiter);
			    while (!docContents.endsWith("\n") && (formatAll.endsWith("\n") || formatAll.endsWith("\r"))) {
			        formatAll = formatAll.substring(0, formatAll.length()-1);
			    }
//			    if (adjustForNL)
//			    	formatAll = formatAll.substring(1);
				formatted = new Document(formatAll);
			} catch (SyntaxErrorException e) {
				return;
			}
			doc.replace(offset, length, formatted.get());
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// Apply the formatting from bottom to top (so that the indexes are
		// still valid).
		Collections.reverse(replaces);
		for (Tuple3<Integer, Integer, String> tup : replaces) {
			try {
				doc.replace(tup.o1, tup.o2, tup.o3);
			} catch (BadLocationException e) {
				Log.log(e);
			}
		}

	}

	/**
	 * Formats the whole document
	 * 
	 * @throws SyntaxErrorException
	 * @see IFormatter
	 */
	public void formatAll(IDocument doc, IPyFormatStdProvider edit, IFile f, boolean isOpenedFile,
			boolean throwSyntaxError) throws SyntaxErrorException {
		// Formatter formatter = new Formatter();
		// formatter.formatAll(doc, edit);

        FormatStd formatStd = (FormatStd) (edit != null ? edit.getFormatStd() : getFormat(f));
		formatAll(doc, edit, isOpenedFile, formatStd, throwSyntaxError);

	}

	public void formatAll(IDocument doc, IPyFormatStdProvider edit, boolean isOpenedFile, FormatStd formatStd,
			boolean throwSyntaxError) throws SyntaxErrorException {
		String d = doc.get();

		String delimiter = PySelection.getDelimiter(doc);

		String formatted = formatAll(formatStd, throwSyntaxError, d, delimiter);

		String contents = doc.get();
		try {
			SpellFixer fixer = new SpellFixer();
			formatted = fixer.process(formatted);
		} catch (Exception e) {
			Log.log(e);
		}

		if (contents.equals(formatted)) {
			return; // it's the same: nothing to do.
		}
		if (!isOpenedFile) {
			doc.set(formatted);
		} else {
			// let's try to apply only the differences
			TextSelectionUtils.setOnlyDifferentCode(doc, contents, formatted);
		}
	}

	private String formatAll(FormatStd formatStd, boolean throwSyntaxError, String d, String delimiter)
			throws SyntaxErrorException {
		String formatted = formatStr(d, formatStd, delimiter, throwSyntaxError);

		// To finish, check the end of line.
		if (formatStd.addNewLineAtEndOfFile) {
			try {
				int len = formatted.length();
				if (len > 0) {
					char lastChar = formatted.charAt(len - 1);
					if (lastChar != '\r' && lastChar != '\n') {
						formatted += delimiter;
					}
				}
			} catch (Throwable e) {
				Log.log(e);
			}
		}
		return formatted;
	}

	/**
	 * @return the format standard that should be used to do the formatting
	 */
	public static FormatStd getFormat(IAdaptable projectAdaptable) {
		FormatStd formatStd = new FormatStd();
		// formatStd.assignWithSpaceInsideParens = PyCodeFormatterPage
		// .useAssignWithSpacesInsideParenthesis(projectAdaptable);
		// formatStd.operatorsWithSpace =
		// PyCodeFormatterPage.useOperatorsWithSpace(projectAdaptable);
		// formatStd.parametersWithSpace =
		// PyCodeFormatterPage.useSpaceForParentesis(projectAdaptable);
		// formatStd.spaceAfterComma =
		// PyCodeFormatterPage.useSpaceAfterComma(projectAdaptable);
		// formatStd.addNewLineAtEndOfFile =
		// PyCodeFormatterPage.getAddNewLineAtEndOfFile(projectAdaptable);
		// formatStd.trimLines =
		// PyCodeFormatterPage.getTrimLines(projectAdaptable);
		// formatStd.trimMultilineLiterals =
		// PyCodeFormatterPage.getTrimMultilineLiterals(projectAdaptable);
		// formatStd.spacesBeforeComment =
		// PyCodeFormatterPage.getSpacesBeforeComment(projectAdaptable);
		// formatStd.spacesInStartComment =
		// PyCodeFormatterPage.getSpacesInStartComment(projectAdaptable);
		// formatStd.formatWithAutopep8 =
		// PyCodeFormatterPage.getFormatWithAutopep8(projectAdaptable);
		// formatStd.autopep8Parameters =
		// PyCodeFormatterPage.getAutopep8Parameters(projectAdaptable);
		// formatStd.updateAutopep8();
		formatStd.assignWithSpaceInsideParens = true;
		formatStd.operatorsWithSpace = true;
		formatStd.parametersWithSpace = false;
		formatStd.spaceAfterComma = true;
		formatStd.addNewLineAtEndOfFile = true;
		formatStd.trimLines = true;
		formatStd.trimMultilineLiterals = true;
		formatStd.spacesBeforeComment = 1;
		formatStd.spacesInStartComment = 1;
		formatStd.formatWithAutopep8 = false;
		formatStd.autopep8Parameters = PyCodeFormatterPage.getAutopep8Parameters(projectAdaptable);
		formatStd.updateAutopep8();

		return formatStd;
	}

	/**
	 * This method formats a string given some standard.
	 *
	 * @param str
	 *            the string to be formatted
	 * @param std
	 *            the standard to be used
	 * @return a new (formatted) string
	 * @throws SyntaxErrorException
	 */
	/* default */String formatStr(String str, FormatStd std, String delimiter, boolean throwSyntaxError)
			throws SyntaxErrorException {
		if (std.formatWithAutopep8) {
			String parameters = std.autopep8Parameters;
			String formatted = runWithPep8BaseScript(str, parameters, "autopep8.py", str);

			formatted = StringUtils.replaceNewLines(formatted, delimiter);

			return formatted;
		} else {
			return formatStr(-1, str, std, 0, delimiter, throwSyntaxError);
		}
	}

	/**
	 * @param fileContents
	 *            the contents to be passed in the stdin.
	 * @param parameters
	 *            the parameters to pass. Note that a '-' is always added to the
	 *            parameters to signal we'll pass the file as the input in
	 *            stdin.
	 * @param script
	 *            i.e.: pep8.py, autopep8.py
	 * @return
	 */
	public static String runWithPep8BaseScript(String fileContents, String parameters, String script,
			String defaultReturn) {
		File autopep8File;
		try {
			autopep8File = PydevPlugin
					.getScriptWithinPySrc(new Path("third_party").append("pep8").append(script).toString());
		} catch (CoreException e) {
			Log.log("Unable to get " + script + " location.");
			return defaultReturn;
		}
		if (!autopep8File.exists()) {
			Log.log("Specified location for " + script + " does not exist (" + autopep8File + ").");
			return defaultReturn;
		}

		SimplePythonRunner simplePythonRunner = new SimplePythonRunner();
		IInterpreterManager pythonInterpreterManager = PydevPlugin.getPythonInterpreterManager();
		IInterpreterInfo defaultInterpreterInfo;
		try {
			defaultInterpreterInfo = pythonInterpreterManager.getDefaultInterpreterInfo(false);
		} catch (MisconfigurationException e) {
			Log.log("No default Python interpreter configured to run " + script);
			return defaultReturn;
		}
		String[] parseArguments = ProcessUtils.parseArguments(parameters);
		List<String> lst = new ArrayList<String>(Arrays.asList(parseArguments));
		lst.add("-");

		String[] cmdarray = SimplePythonRunner.preparePythonCallParameters(defaultInterpreterInfo.getExecutableOrJar(),
				autopep8File.toString(), lst.toArray(new String[0]));

		Reader inputStreamReader = new StringReader(fileContents);
		String pythonFileEncoding = FileUtils.getPythonFileEncoding(inputStreamReader, null);
		if (pythonFileEncoding == null) {
			pythonFileEncoding = "utf-8";
		}
		final String encodingUsed = pythonFileEncoding;

		SystemPythonNature nature = new SystemPythonNature(pythonInterpreterManager, defaultInterpreterInfo);
		ICallback<String[], String[]> updateEnv = new ICallback<String[], String[]>() {

			@Override
			public String[] call(String[] arg) {
				if (arg == null) {
					arg = new String[] { "PYTHONIOENCODING=" + encodingUsed };
				} else {
					arg = ProcessUtils.addOrReplaceEnvVar(arg, "PYTHONIOENCODING", encodingUsed);
				}
				return arg;
			}
		};

		Tuple<Process, String> r = simplePythonRunner.run(cmdarray, autopep8File.getParentFile(), nature,
				new NullProgressMonitor(), updateEnv);
		try {
			r.o1.getOutputStream().write(fileContents.getBytes(pythonFileEncoding));
			r.o1.getOutputStream().close();
		} catch (IOException e) {
			Log.log("Error writing contents to " + script);
			return defaultReturn;
		}
		Tuple<String, String> processOutput = SimplePythonRunner.getProcessOutput(r.o1, r.o2, new NullProgressMonitor(),
				pythonFileEncoding);

		if (processOutput.o2.length() > 0) {
			Log.log(processOutput.o2);
		}
		if (processOutput.o1.length() > 0) {
			return processOutput.o1;
		}
		return defaultReturn;
	}

	/**
	 * This method formats a string given some standard.
	 *
	 * @param str
	 *            the string to be formatted
	 * @param std
	 *            the standard to be used
	 * @param parensLevel
	 *            the level of the parenthesis available.
	 * @return a new (formatted) string
	 * @throws SyntaxErrorException
	 */
	private String formatStr(int indent, String str, FormatStd std, int parensLevel, String delimiter,
			boolean throwSyntaxError) throws SyntaxErrorException {
		char[] cs = str.toCharArray();
		FastStringBuffer buf = new FastStringBuffer();

		// Temporary buffer for some operations. Must always be cleared before
		// it's used.
		FastStringBuffer tempBuf = new FastStringBuffer();

		ParsingUtils parsingUtils = ParsingUtils.create(cs, throwSyntaxError);
		char lastChar = '\0';
		
		for (int i = 0; i < cs.length; i++) {
			char c = cs[i];

			switch (c) {
			case '\'':
			case '"':
				// ignore literals and multi-line literals, including
				// comments...
				i = parsingUtils.eatLiterals(buf, i, std.trimMultilineLiterals);
				break;

			case '#':

				i = handleComment(std, cs, buf, tempBuf, parsingUtils, i);

				
				break;

			case ',':
				i = formatForComma(std, cs, buf, i, tempBuf);
				break;
			case '(':
				i = formatForPar(parsingUtils, cs, i, std, buf, parensLevel + 1, delimiter, throwSyntaxError);
				break;

			// Things to treat:
			// +, -, *, /, %
			// ** // << >>
			// <, >, !=, <>, <=, >=, //=, *=, /=,
			// & ^ ~ |
			case '*':
				// for *, we also need to treat when it's used in varargs,
				// kwargs and list expansion
				boolean isOperator = false;
				for (int j = buf.length() - 1; j >= 0; j--) {
					char localC = buf.charAt(j);
					if (Character.isWhitespace(localC)) {
						continue;
					}
					if (localC == '(' || localC == ',') {
						// it's not an operator, but vararg. kwarg or list
						// expansion
					}
					if (Character.isJavaIdentifierPart(localC)) {
						// ok, there's a chance that it can be an operator, but
						// we still have to check
						// the chance that it's a wild import
						tempBuf.clear();
						while (Character.isJavaIdentifierPart(localC)) {
							tempBuf.append(localC);
							j--;
							if (j < 0) {
								break; // break while
							}
							localC = buf.charAt(j);
						}
						String reversed = tempBuf.reverse().toString();
						if (!reversed.equals("import") && !reversed.equals("lambda")) {
							isOperator = true;
						}
					}
					if (localC == '\'' || localC == ')' || localC == ']') {
						isOperator = true;
					}

					// If it got here (i.e.: not whitespace), get out of the for
					// loop.
					break;
				}
				if (!isOperator) {
					buf.append('*');
					break;// break switch
				}
				// Otherwise, FALLTHROUGH

			case '+':
			case '-':

				if (c == '-' || c == '+') { // could also be *

					// handle exponentials correctly: e.g.: 1e-6 cannot have a
					// space
					tempBuf.clear();
					boolean started = false;

					for (int j = buf.length() - 1;; j--) {
						if (j < 0) {
							break;
						}
						char localC = buf.charAt(j);
						if (localC == ' ' || localC == '\t') {
							if (!started) {
								continue;
							} else {
								break;
							}
						}
						started = true;
						if (Character.isJavaIdentifierPart(localC) || localC == '.') {
							tempBuf.append(localC);
						} else {
							break;// break for
						}
					}
					boolean isExponential = true;
					String partialNumber = tempBuf.reverse().toString();
					int partialLen = partialNumber.length();
					if (partialLen < 2 || !Character.isDigit(partialNumber.charAt(0))) {
						// at least 2 chars: the number and the 'e'
						isExponential = false;
					} else {
						// first char checked... now, if the last is an 'e', we
						// must leave it together no matter what
						if (partialNumber.charAt(partialLen - 1) != 'e'
								&& partialNumber.charAt(partialLen - 1) != 'E') {
							isExponential = false;
						}
					}
					if (isExponential) {
                            buf.rightTrimWhitespacesAndTabs();
						buf.append(c);
						// skip the next whitespaces from the buffer
						int initial = i;
						do {
							i++;
						} while (i < cs.length && (c = cs[i]) == ' ' || c == '\t');
						if (i > initial) {
							i--;// backup 1 because we walked 1 too much.
						}
						break;// break switch
					}
					// Otherwise, FALLTHROUGH
				}

			case '/':
			case '%':
			case '<':
			case '>':
			case '!':
			case '&':
			case '^':
			case '~':
			case '|':

				i = handleOperator(std, cs, buf, parsingUtils, i, c);
				c = cs[i];
				break;

			// check for = and == (other cases that have an = as the operator
			// should already be treated)
			case '=':
				if (i < cs.length - 1 && cs[i + 1] == '=') {
					// if == handle as if a regular operator
					i = handleOperator(std, cs, buf, parsingUtils, i, c);
					c = cs[i];
					break;
				}

				while (buf.length() > 0 && buf.lastChar() == ' ') {
					buf.deleteLast();
				}

				boolean surroundWithSpaces = std.operatorsWithSpace;
				if (parensLevel > 0) {
					surroundWithSpaces = std.assignWithSpaceInsideParens;
				}

				// add space before
				if (surroundWithSpaces) {
					buf.append(' ');
				}

				// add the operator and the '='
				buf.append('=');

				// add space after
				if (surroundWithSpaces) {
					buf.append(' ');
				}

				i = parsingUtils.eatWhitespaces(null, i + 1);
				break;
			case '[':
				int lastLinebreak = str.indexOf('\n');
				if (lastLinebreak > 0 && lastLinebreak < i) {
					indent = -2;
				}
				if (indent < 0) {
					indent++;
					int idx = i;
					while (idx > 0 && cs[idx] != '\n') {
						if (cs[idx] == '\t') {
							indent += 4;
							idx--;
						} else {
							indent++;
							idx--;
						}
					}
				}
				if (lastLinebreak > 0 && lastLinebreak < i && indent > 0) {
					// indent -= 1;
				}
				int oldi = i;
				i = parsingUtils.eatPar(i, tempBuf, '[');
				String code = new String(cs, oldi, i - oldi + 1);
				if (code.trim().length() == 2) {
					buf.append(code.trim());
					indent = -1;
					break;
				}
				String beautifiedCode = CodeBeautifier.beautifyCode(code, 80, 0);
				if (beautifiedCode != null && !beautifiedCode.isEmpty()) {
					String[] split = beautifiedCode.split("\n");
					buf.append(split[0]);
					for (int j = 1; j < split.length; j++) {
						buf.append("\n");
						buf.appendN(' ', indent);
						buf.append(split[j]);
					}
					// System.out.println();
					indent = -1;
					break;
				}
				indent = -1;
				buf.append(code);
				break;
			case '{':
				lastLinebreak = str.indexOf('\n');
				if (lastLinebreak > 0 && lastLinebreak < i) {
					indent = -2;
				}
				if (indent < 0) {
					indent++;
					int idx = i;
					while (idx > 0 && cs[idx] != '\n') {
						if (cs[idx] == '\t') {
							indent += 4;
							idx--;
						} else {
							indent++;
							idx--;
						}

					}
				}
				if (lastLinebreak > 0 && lastLinebreak < i && indent > 0) {
					// indent -= 1;
				}
				oldi = i;
				i = parsingUtils.eatPar(i, tempBuf, '{');

				code = new String(cs, oldi, i - oldi + 1);
				if (code.trim().length() == 2) {
					buf.append(code.trim());
					indent = -1;
					break;
				}
				beautifiedCode = CodeBeautifier.beautifyCode(code, 80, 0);
				if (beautifiedCode != null && !beautifiedCode.isEmpty()) {
					String[] split = beautifiedCode.split("\n");
					buf.append(split[0]);
					for (int j = 1; j < split.length; j++) {
						buf.append("\n");
						buf.appendN(' ', indent);
						buf.append(split[j]);
					}
					indent = -1;
					break;
				}

				buf.append(code);
				indent = -1;
				break;
			default:
				if (c == '\r' || c == '\n') {
					if (lastChar == ',' && std.spaceAfterComma && buf.lastChar() == ' ') {
						buf.deleteLast();
					}
					if (std.trimLines) {
                            buf.rightTrimWhitespacesAndTabs();
					}
				}
				buf.append(c);

			}
			lastChar = c;

		}
		if (parensLevel == 0 && std.trimLines) {
            buf.rightTrimWhitespacesAndTabs();
		}
		return buf.toString();
	}

	/**
	 * Handles the case where we found a '#' in the code.
	 */
	private int handleComment(FormatStd std, char[] cs, FastStringBuffer buf, FastStringBuffer tempBuf,
			ParsingUtils parsingUtils, int i) {
		if (std.spacesBeforeComment != FormatStd.DONT_HANDLE_SPACES) {
			for (int j = i - 1; j >= 0; j--) {
				char cj = cs[j];
				if (cj == '\t' || cj == ' ') {
					continue;
				}
				// Ok, found a non-whitespace -- if it's not a new line, we're
				// after some
				// code, in which case we have to put the configured amount of
				// spaces.
				if (cj != '\r' && cj != '\n') {
					String v;
					try {
						v = new String(cs, i, 4);
					} catch (Exception e) {
						v = "";
					}
					if (!"#END".equals(v)) {
						buf.rightTrimWhitespacesAndTabs();
						buf.appendN(' ', std.spacesBeforeComment);
					} else {
						buf.rightTrim();
					}
				}
				break;
			}
		}

		tempBuf.clear();
		i = parsingUtils.eatComments(tempBuf, i);
		if (std.trimLines) {
			String endLine = "";
			if (tempBuf.endsWith("\r\n")) {
				endLine = "\r\n";
				tempBuf.deleteLastChars(2);
			} else if (tempBuf.endsWith('\r') || tempBuf.endsWith('\n')) {
				endLine += tempBuf.lastChar();
				tempBuf.deleteLast();
			}
            tempBuf.rightTrimWhitespacesAndTabs();
			tempBuf.append(endLine);
		}

		formatComment(std, tempBuf);

		buf.append(tempBuf);
		return i;
	}

	/**
	 * A comment line starting or ending with one of the following will be
	 * skipped when adding spaces to the start of a comment.
	 */
	private final static String[] BLOCK_COMMENT_SKIPS = new String[] { "###", "***", "---", "===", "+++", "@@@", "!!!",
			"~~~", "END" };

	/**
	 * Adds spaces after the '#' according to the configured settings. The first
	 * char of the buffer passed (which is also the output) should always start
	 * with a '#'.
	 */
	public static void formatComment(FormatStd std, FastStringBuffer bufWithComment) {
		if (std.spacesInStartComment > 0) {
			Assert.isTrue(bufWithComment.charAt(0) == '#');
			int len = bufWithComment.length();

			char firstCharFound = '\n';
			String bufAsString = bufWithComment.toString();
			// handle cases where the code-formatting should not take place
			if (FileUtils.isPythonShebangLine(bufAsString)) {
				return;
			}

			int spacesFound = 0;
			String remainingStringContent = "";
			for (int j = 1; j < len; j++) { // start at 1 because 0 should
											// always be '#'
				if ((firstCharFound = bufWithComment.charAt(j)) != ' ') {
					remainingStringContent = bufAsString.substring(j).trim();
					break;
				}
				spacesFound += 1;
			}
			if (firstCharFound != '\r' && firstCharFound != '\n') { // Only add
																	// spaces if
																	// it wasn't
																	// an empty
																	// line.

				// handle cases where the code-formatting should not take place
				for (String s : BLOCK_COMMENT_SKIPS) {
					if (remainingStringContent.endsWith(s) || remainingStringContent.startsWith(s)) {
						return;
					}
				}
				int diff = std.spacesInStartComment - spacesFound;
				if (diff > 0) {
					bufWithComment.insertN(1, ' ', diff);
				}
			}
		}
	}

	/**
	 * Handles having an operator
	 *
	 * @param std
	 *            the coding standard to be used
	 * @param cs
	 *            the contents of the string
	 * @param buf
	 *            the buffer where the contents should be added
	 * @param parsingUtils
	 *            helper to get the contents
	 * @param i
	 *            current index
	 * @param c
	 *            current char
	 * @return the new index after handling the operator
	 */
	private int handleOperator(FormatStd std, char[] cs, FastStringBuffer buf, ParsingUtils parsingUtils, int i,
			char c) {
		// let's discover if it's an unary operator (~ + -)
		boolean isUnaryWithContents = true;

		boolean isUnary = false;
		boolean changeWhitespacesBefore = true;
		if (c == '~' || c == '+' || c == '-') {
			// could be an unary operator...
			String trimmedLastWord = buf.getLastWord().trim();
			isUnary = trimmedLastWord.length() == 0 || PySelection.ALL_KEYWORD_TOKENS.contains(trimmedLastWord);

			if (!isUnary) {
				for (char itChar : buf.reverseIterator()) {
					if (itChar == ' ' || itChar == '\t') {
						continue;
					}

					switch (itChar) {
					case '[':
					case '{':
					case '=':
						changeWhitespacesBefore = false;

					case '(':
					case ':':
						isUnaryWithContents = false;

					case '>':
					case '<':

					case '-':
					case '+':
					case '~':

					case '*':
					case '/':
					case '%':
					case '!':
					case '&':
					case '^':
					case '|':
					case ',':
						isUnary = true;
					}
					break;
				}
			} else {
				isUnaryWithContents = buf.length() > 0;
			}
		}

		// We don't want to change whitespaces before in a binary operator that
		// is in a new line.
		for (char ch : buf.reverseIterator()) {
			if (!Character.isWhitespace(ch)) {
				break;
			}
			if (ch == '\r' || ch == '\n') {
				changeWhitespacesBefore = false;
				break;
			}
		}

		if (changeWhitespacesBefore) {
			while (buf.length() > 0 && (buf.lastChar() == ' ' || buf.lastChar() == ' ')) {
				buf.deleteLast();
			}
		}

		boolean surroundWithSpaces = std.operatorsWithSpace;

		if (changeWhitespacesBefore) {
			// add spaces before
			if (isUnaryWithContents && surroundWithSpaces) {
				buf.append(' ');
			}
		}

		char localC = c;
		char prev = '\0';
		boolean backOne = true;
		while (isOperatorPart(localC, prev)) {
			buf.append(localC);
			prev = localC;
			i++;
			if (i == cs.length) {
				break;
			}
			localC = cs[i];
			if (localC == '=') {
				// when we get to an assign, we have found a full stmt (with
				// assign) -- e.g.: a \\= a += a ==
				buf.append(localC);
				backOne = false;
				break;
			}
		}
		if (backOne) {
			i--;
		}

		// add space after only if it's not unary
		if (!isUnary && surroundWithSpaces) {
			buf.append(' ');
		}

		i = parsingUtils.eatWhitespaces(null, i + 1);
		return i;
	}

	/**
	 * @param c
	 *            the char to be checked
	 * @param prev
	 * @return true if the passed char is part of an operator
	 */
	private boolean isOperatorPart(char c, char prev) {
		switch (c) {
		case '+':
		case '-':
		case '~':
			if (prev == '\0') {
				return true;
			}
			return false;

		}

		switch (c) {
		case '*':
		case '/':
		case '%':
		case '<':
		case '>':
		case '!':
		case '&':
		case '^':
		case '~':
		case '|':
		case '=':
			return true;
		}
		return false;
	}

	/**
	 * Formats the contents for when a parenthesis is found (so, go until the
	 * closing parens and format it accordingly)
	 * 
	 * @param throwSyntaxError
	 * @throws SyntaxErrorException
	 */
	private int formatForPar(final ParsingUtils parsingUtils, final char[] cs, final int i, final FormatStd std,
			final FastStringBuffer buf, final int parensLevel, final String delimiter, boolean throwSyntaxError)
			throws SyntaxErrorException {
		char c = ' ';
		FastStringBuffer locBuf = new FastStringBuffer();

		int j = i + 1;
		int start = j;
		int end = start;
		int start_bracket = -1;

		while (j < cs.length && (c = cs[j]) != ')') {

			j++;

			if (c == '\'' || c == '"') { // ignore comments or multiline
											// comments...
				j = parsingUtils.eatLiterals(null, j - 1, std.trimMultilineLiterals) + 1;
				end = j;
			} else if (c == '#') {
				j = parsingUtils.eatComments(null, j - 1) + 1;
				end = j;

			} else if (c == '(') { // open another par.
				start_bracket = j;
				if (end > start) {
					locBuf.append(cs, start, end - start);
					start = end;
				}
				j = formatForPar(parsingUtils, cs, j - 1, std, locBuf, parensLevel + 1, delimiter, throwSyntaxError)
						+ 1;
				start = j;

			} else {
				end = j;

			}
		}
		if (end > start) {
			try{
				locBuf.append(cs, start, end - start);
			} catch (ArrayIndexOutOfBoundsException ex){
				ex.printStackTrace();
			}
			
			start = end;
		}

		if (c == ')') {
			// Now, when a closing parens is found, let's see the contents of
			// the line where that parens was found
			// and if it's only whitespaces, add all those whitespaces (to
			// handle the following case:
			// a(a,
			// b
			// ) <-- we don't want to change this one.
			char c1;
			FastStringBuffer buf1 = new FastStringBuffer();

			if (locBuf.indexOf('\n') != -1 || locBuf.indexOf('\r') != -1) {
				for (int k = locBuf.length(); k > 0 && (c1 = locBuf.charAt(k - 1)) != '\n' && c1 != '\r'; k--) {
					buf1.insert(0, c1);
				}
			}
			int indent = 0;
			int idx = i;

			while (idx > 0 && cs[idx] != '\n') {
				idx--;
				indent++;
			}
			if (cs[idx] != '\n') {
				indent++;
			}
			String formatStr = formatStr(indent, trim(locBuf).toString(), std, parensLevel, delimiter,
					throwSyntaxError);
			if (!formatStr.isEmpty()) {
				String beautifiedCode = CodeBeautifier.beautifyCode("___(" + formatStr + ")", 80, 0);
				if (beautifiedCode != null)
					beautifiedCode = beautifiedCode.substring("___(".length(), beautifiedCode.length() - 1);
				FastStringBuffer t = new FastStringBuffer();
				idx = i;
				indent = 0;
				while (idx > 0 && cs[idx] != '\n') {
					if (cs[idx] == '\t') {
						indent += 4;
						idx--;
					} else {
						indent++;
						idx--;
					}
				}
				if (cs[idx] != '\n') {
					indent++;
				}
				indent -= 4;
				if (beautifiedCode != null) {
					String[] split = beautifiedCode.split("\n");
					t.append(split[0]);
					for (int j1 = 1; j1 < split.length; j1++) {
						t.append("\n");
						if (indent > 0) {
							t.appendN(' ', indent);
							t.append(split[j1]);
						} else {
							t.append(split[j1]);
						}
					}
					indent = -1;
				}

				formatStr = t.toString();
			}

			FastStringBuffer formatStrBuf = new FastStringBuffer(formatStr, 10);
			if (formatStr.trim().isEmpty())
				formatStrBuf = trim(formatStrBuf);
			String closing = ")";
			if (buf1.length() > 0 && PySelection.containsOnlyWhitespaces(buf1.toString())) {
				formatStrBuf.append(buf1);

			} else if (std.parametersWithSpace) {
				closing = " )";
			}

			if (std.parametersWithSpace) {
				if (formatStrBuf.length() == 0) {
					buf.append("()");

				} else {
					buf.append("( ");
					buf.append(formatStrBuf);
					buf.append(closing);
				}
			} else {
				buf.append('(');
				buf.append(formatStrBuf);
				buf.append(closing);
			}
			return j;
		} else {
			if (throwSyntaxError) {
				throw new SyntaxErrorException("No closing ')' found.");
			}
			// we found no closing parens but we finished looking already, so,
			// let's just add anything without
			// more formatting...
			buf.append('(');
			buf.append(locBuf);
			return j;
		}
	}

	/**
	 * We just want to trim whitespaces, not newlines!
	 * 
	 * @param locBuf
	 *            the buffer to be trimmed
	 * @return the same buffer passed as a parameter
	 */
	private FastStringBuffer trim(FastStringBuffer locBuf) {
		while (locBuf.length() > 0 && (locBuf.firstChar() == ' ' || locBuf.firstChar() == '\t')) {
			locBuf.deleteCharAt(0);
		}
		rtrim(locBuf);
		return locBuf;
	}

	/**
	 * We just want to trim whitespaces, not newlines!
	 * 
	 * @param locBuf
	 *            the buffer to be trimmed
	 * @return the same buffer passed as a parameter
	 */
	private FastStringBuffer rtrim(FastStringBuffer locBuf) {
		while (locBuf.length() > 0 && (locBuf.lastChar() == ' ' || locBuf.lastChar() == '\t')) {
			locBuf.deleteLast();
		}
		return locBuf;
	}

	/**
	 * When a comma is found, it's formatted accordingly (spaces added after
	 * it).
	 *
	 * @param std
	 *            the coding standard to be used
	 * @param cs
	 *            the contents of the document to be formatted
	 * @param buf
	 *            the buffer where the comma should be added
	 * @param i
	 *            the current index
	 * @return the new index on the original doc.
	 */
	private int formatForComma(FormatStd std, char[] cs, FastStringBuffer buf, int i,
			FastStringBuffer formatForCommaTempBuf) {
		formatForCommaTempBuf.clear();
		char c = '\0';
		while (i < cs.length - 1 && (c = cs[i + 1]) == ' ') {
			formatForCommaTempBuf.append(c);
			i++;
		}

		if (c == '#') {
			// Ok, we have a comment after a comma, let's handle it according to
			// preferences.
			buf.append(',');
			if (std.spacesBeforeComment == FormatStd.DONT_HANDLE_SPACES) {
				// Note: other cases we won't handle here as it should be
				// handled when the start of
				// a comment is found.
				buf.append(formatForCommaTempBuf);
			}
		} else {
			// Default: handle it as usual.
			if (std.spaceAfterComma) {
				buf.append(", ");
			} else {
				buf.append(',');
			}
		}
		return i;
	}
}