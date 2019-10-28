package com.astra.ses.spell.language.beautifier;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

import org.python.pydev.core.IGrammarVersionProvider;
import org.python.pydev.core.MisconfigurationException;
import org.python.pydev.parser.jython.SimpleNode;
import org.python.pydev.parser.jython.ast.Call;
import org.python.pydev.parser.jython.ast.Dict;
import org.python.pydev.parser.jython.ast.List;
import org.python.pydev.parser.jython.ast.Str;
import org.python.pydev.parser.jython.ast.Tuple;
import org.python.pydev.parser.jython.ast.VisitorBase;
import org.python.pydev.parser.prettyprinterv2.ILinePart;
import org.python.pydev.parser.prettyprinterv2.PrettyPrinterDocV2;
import org.python.pydev.parser.prettyprinterv2.PrettyPrinterPrefsV2;
import org.python.pydev.parser.prettyprinterv2.PrettyPrinterV2;
import org.python.pydev.parser.prettyprinterv2.PrettyPrinterVisitorV2;
import org.python.pydev.parser.visitors.NodeUtils;
import org.python.pydev.shared_core.string.StringUtils;

import com.google.common.base.Objects;

public class SpellParser {

	public static Paragraph getNodeValue(SimpleNode node, int indent, Paragraph parent,final boolean ignoreBackslash) {
		return new TextParagraph(printNode(node, indent, parent,ignoreBackslash), false, parent);
	}

	public static String printNode(SimpleNode node, final int indent, final Paragraph parent,final boolean ignoreBackslash) {
		IGrammarVersionProvider iGrammarVersionProvider = new IGrammarVersionProvider() {

			public int getGrammarVersion() throws MisconfigurationException {
				// Always calculate at the present time based on the editor configuration.
				return IGrammarVersionProvider.GRAMMAR_PYTHON_VERSION_2_7;
			}

			@Override
			public AdditionalGrammarVersionsToCheck getAdditionalGrammarVersions() throws MisconfigurationException {
				// TODO Auto-generated method stub
				return null;
			}
		};
		final int[] firstOffset = { Integer.MAX_VALUE };
		try {
			node.accept(new VisitorBase() {

				@Override
				protected Object unhandled_node(SimpleNode node) throws Exception {
					if (node.beginColumn < firstOffset[0])
						firstOffset[0] = node.beginColumn;
					return null;
				}

				@Override
				public void traverse(SimpleNode node) throws Exception {
					node.traverse(this);
				}
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		final int deltaIndent = firstOffset[0];
		PrettyPrinterV2 prettyPrinterV2 = new PrettyPrinterV2(
				new PrettyPrinterPrefsV2("\n", "    ", iGrammarVersionProvider)) {
			@Override
			protected PrettyPrinterVisitorV2 createPrettyPrinterVisitor(PrettyPrinterDocV2 doc) {
				PrettyPrinterVisitorV2 printer = new PrettyPrinterVisitorV2(this.prefs, doc) {
					
					protected final String[] strTypes = new String[] { "'''", "\"\"\"", "'", "\"" };

					@Override
					public Object visitStr(Str node) throws Exception {

						int id = this.doc.pushRecordChanges();
						Object visitStr = super.visitStr(node);
						// doc.add(node.beginLine, node.beginColumn,s , node);

						if (NodeUtils.getStringToPrint(node).length() > 90) {
							String old = NodeUtils.getStringToPrint(node);
							if (!old.startsWith("'T ") && !old.startsWith("'C ")) {
								
								
								String r = breakAt(old, 80,true).trim();
								if (!old.equals(r))
									replaceChanges(id, r);
							}
						}
						return visitStr;
					}

					@Override
					public Object visitTuple(Tuple node) throws Exception {
						boolean empty = this.doc.linesToColAndContents.isEmpty();
						int id = this.doc.pushRecordChanges();
						Object c = super.visitTuple(node);
						if (!empty) {
							// only handle tuples embedded in Strings
							// pure Tuples are handled by SPELLFormatter
							String tupleContent = SpellParser.printNode(node, 0, parent,ignoreBackslash);
							String formatted = CodeBeautifier.beautifyCode("____" + tupleContent, 80, 0);
							if (formatted != null) {
								formatted = formatted.substring(4);
								String indent = StringUtils.repeatString(" ", node.beginColumn - deltaIndent - 4);
								String[] split = formatted.split("\n", Integer.MAX_VALUE);
								StringBuilder result = new StringBuilder();
								result.append(split[0]);
								for (int i = 1; i < split.length; i++) {
									result.append("\n");
									result.append(indent);
									result.append(split[i]);
								}
								replaceChanges(id, result.toString());
							}
						}
						return c;
					}

					@Override
					public Object visitDict(Dict node) throws Exception {
						int id = this.doc.pushRecordChanges();
						Object c = super.visitDict(node);

						Paragraph p = DictParser.parse(node, 0, 80, parent);
						p.buildOrder(0);
						// p.addIndent(node.beginColumn + indent - 1 - p.getPrefixString(0).length());
						String args = p.makeAlignedString(0).trim();
						String indent = StringUtils.repeatString(" ", node.beginColumn - deltaIndent);
						String[] split = args.split("\n", Integer.MAX_VALUE);
						StringBuilder result = new StringBuilder();
						result.append(split[0]);
						for (int i = 1; i < split.length; i++) {
							result.append("\n");
							result.append(indent);
							result.append(split[i]);
						}
						replaceChanges(id, result.toString());
						return c;
					}

					@Override
					public Object visitList(List node) throws Exception {
						int id = this.doc.pushRecordChanges();
						Object c = super.visitList(node);

						Paragraph p = ListParser.parse(node, 0, 80, parent);
						// p.addIndent(node.beginColumn + indent - 1 - p.getPrefixString(0).length());
						p.buildOrder(0);
						String args = p.makeAlignedString(0).trim();
						String indent = StringUtils.repeatString(" ", node.beginColumn - deltaIndent);
						String[] split = args.split("\n", Integer.MAX_VALUE);
						StringBuilder result = new StringBuilder();
						result.append(split[0]);
						for (int i = 1; i < split.length; i++) {
							result.append("\n");
							result.append(indent);
							result.append(split[i]);
						}
						replaceChanges(id, result.toString());
						return c;
					}

					@Override
					public Object visitCall(Call node) throws Exception {
						int id = this.doc.pushRecordChanges();
						Object c = super.visitCall(node);

						Paragraph p = CallParser.parse(node, 0, 80, parent);
						// p.addIndent(node.beginColumn + indent - 4);
						p.buildOrder(0);
						String args = p.makeAlignedString(0).trim();
						String indent = StringUtils.repeatString(" ", node.func.beginColumn - deltaIndent - 1);
						String[] split = args.split("\n", Integer.MAX_VALUE);
						StringBuilder result = new StringBuilder();
						result.append(split[0]);
						for (int i = 1; i < split.length; i++) {
							result.append("\n");
							result.append(indent);
							result.append(split[i]);
						}
						replaceChanges(id, result.toString());
						return c;
					}

					private void replaceChanges(int id, String args) {
						java.util.List<ILinePart> recordChanges = doc.popRecordChanges(id);
						ArrayList<String> replacements = new ArrayList<String>();
						replacements.add(recordChanges.get(0).toString());
						replacements.add(args);
						for (int i = 1; i < recordChanges.size(); i++) {
							replacements.add(recordChanges.get(i).toString());
							replacements.add("");
						}
						doc.replaceRecorded(recordChanges, replacements.toArray(new String[0]));
						recordChanges.get(0).setSkipNewline(true);
					}
				};
				printer.setIgnoreStrJoinBackslash(ignoreBackslash);
				return printer;
			}
		};
		try {

			String trim = prettyPrinterV2.print(node);
			if (trim.charAt(trim.length() - 2) == ',')
				trim = trim.substring(0, trim.length() - 2);
			else if (trim.charAt(trim.length() - 2) == ':')
				trim = trim.substring(0, trim.length() - 2);
			else if (trim.charAt(trim.length() - 2) == '=')
				trim = trim.substring(0, trim.length() - 2);
			else if (trim.charAt(trim.length() - 1) == '\n')
				trim = trim.substring(0, trim.length() - 1);
			if (trim.matches("^((?:[^#'])|(?:'(?:[^']|\\\\')*'))+#.+$") && !trim.contains("\n")) {
				trim = trim.replaceFirst("^((?:(?:[^#'])|(?:'(?:[^']|\\\\')*'))+)#.+$", "$1");
				if (trim.charAt(trim.length() - 1) == ',')
					trim = trim.substring(0, trim.length() - 1);
			}

			
			trim =  trim.replaceAll("\n+", "\n");

			return trim;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static String breakAt(final String block, final int width, final boolean onlyInString) {
		int targetWidth = width;

		boolean _contains = block.contains("\n");
		if (_contains) {
			return block;
		}
		final String[] lines = block.split("\n");
		String result = "";
		for (final String l : lines) {
			{
				if (((!result.isEmpty()) && (!result.endsWith(" ")))) {
					String _result = result;
					result = (_result + " ");
				}
				String _result_1 = result;
				result = (_result_1 + l);
			}
		}
		final StringTokenizer tokenizer = new StringTokenizer(result, " \t\'\\[]", true);
		final StringBuilder builder = new StringBuilder();
		int lastLineBreakoffset = 0;
		boolean inString = false;
		boolean isNL = false;
		boolean isEscape = false;
		int escapeIdx = (-1);
		int inArray = 0;
		while (tokenizer.hasMoreTokens()) {
			{
				String word = tokenizer.nextToken();
				final boolean wasInString = inString;
				if ((Objects.equal(word, "\'") && (!wasInString))) {
					inString = true;
				}
				if (((!(inString || (!onlyInString))) && (Objects.equal(word, "[") || Objects.equal(word, "(")))) {
					inArray++;
				}
				if ((Objects.equal(word, "\\") && (!isEscape))) {
					isEscape = true;
					int _length = builder.length();
					int _plus = (_length + 1);
					escapeIdx = _plus;
				}
				if ((!isEscape)) {
					if ((isNL && Objects.equal(word, " "))) {
						isNL = false;
						word = "";
					} else {
						if ((isNL && Objects.equal(word, "\'"))) {
							isNL = false;
							int _length_1 = builder.length();
							int _minus = (_length_1 - 1);
							int _length_2 = builder.length();
							builder.delete(_minus, _length_2);
							if (inString) {
								inString = false;
								word = "";
							} else {
							}
						}
					}
				}
				isNL = false;
				if ((isEscape && word.startsWith("n"))) {
					int _length_3 = builder.length();
					lastLineBreakoffset = _length_3;
					builder.append("n");
					if (onlyInString) {
						builder.append("\'");
					}
					builder.append("\n");
					if (onlyInString) {
						builder.append("\'");
					}
					String _substring = word.substring(1);
					boolean _isEmpty = _substring.isEmpty();
					if (_isEmpty) {
						isNL = true;
					} else {
						String _substring_1 = word.substring(1);
						builder.append(_substring_1);
						isNL = false;
					}
				} else {
					int nextNL = 10000;
					if (builder.length() < result.length())
						nextNL = builder.length() - lastLineBreakoffset + result.substring(builder.length()).indexOf("\\n");
					boolean shouldAddNL = ((builder.length() - lastLineBreakoffset) > targetWidth);
					boolean isNLWithinGraceLimit = (builder.length() - lastLineBreakoffset)+0.25*targetWidth > nextNL;
					
					if (((((shouldAddNL && !isNLWithinGraceLimit) && (!Objects.equal(word, "\'")))
							&& (!isEscape)) && (inArray == 0)) && (inString || (!onlyInString))) {
						boolean _contains_1 = Collections
								.<String>unmodifiableSet(new HashSet<String>(Arrays.asList(".", "!", ",")))
								.contains(word);
						if (_contains_1) {
							builder.append(word);
						} else {
							int _length_4 = builder.length();
							lastLineBreakoffset = _length_4;
							if (inString) {
								if (onlyInString) {
									builder.append("\\n\'");
								}
							}
							builder.append("\n");
							if (inString) {
								if (onlyInString) {
									builder.append("\'");
								}
							}
							boolean _notEquals = (!Objects.equal(word, " "));
							if (_notEquals) {
								builder.append(word);
							}
						}
					} else {
						builder.append(word);
					}
				}
				if ((((inArray > 0) && (!(inString || (!onlyInString))))
						&& (Objects.equal(word, "]") || Objects.equal(word, ")")))) {
					inArray--;
				}
				if ((((!isEscape) && Objects.equal(word, "\'")) && wasInString)) {
					inString = false;
				}
				if ((isEscape && (escapeIdx != builder.length()))) {
					isEscape = false;
				}
			}
		}
		return builder.toString();
	}

}
