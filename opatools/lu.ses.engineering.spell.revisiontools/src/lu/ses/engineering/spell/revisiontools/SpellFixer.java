package lu.ses.engineering.spell.revisiontools;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.google.common.base.Strings;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.LinkedHashMultimap;

public class SpellFixer {

	private static String[] getEndDefStr(int i,String... initial){
		ArrayList<String> strs = new ArrayList<String>();
		strs.addAll(Arrays.asList(initial));
		for (int j = 1; j < i; j++) {
			strs.add("#" + Strings.repeat("=", j));
		}
		return strs.toArray(new String[strs.size()]);
	}

	public enum SpellRequiredTags {
		IF("if",new String[]{"elif","else"},"#ENDIF"),
		DEF("def",new String[]{},"#ENDDEF"),				
		CLASS("class",new String[]{},"#ENDCLASS"),
		WHILE("while",new String[]{"else"},"#ENDWHILE"),
		FOR("for",new String[]{"else"},"#ENDFOR"),
		WITH("with",new String[]{},"#ENDWITH"),
		TRY("try",new String[]{"else","finally","except"},"#ENDTRY"){
			private int amt = 0;
			@Override
			public boolean acceptEndTag(String parse){
				return amt > 0;
			}
			@Override
			public void handle(String parse){
				amt++;
			}
			@Override
			public void reset(){
				amt = 0;
			}
		},
		BADENDTAGS("BADENDTAGS",new String[]{},"#ENDEXCEPT")
		;
		
		
		private HashSet<String> endTags = new HashSet<String>();
		private HashSet<String> skipTags = new HashSet<String>();
		private String preferredEndTag;
		SpellRequiredTags(String entryCode,String[] skippedTags,String... endTags){
			skipTags.addAll(Arrays.asList(skippedTags));
			this.endTags.addAll(Arrays.asList(endTags));
			allEndTags.addAll(Arrays.asList(endTags));
			allStartTags.add(entryCode);
			if (endTags.length > 0)
				preferredEndTag = endTags[0];
		}
		
		public HashSet<String> getSkipTags() {
			return skipTags;
		}

		public HashSet<String> getEndTags() {
			return endTags;
		}

		public String getEndTag(){
			return preferredEndTag;
		}

		public boolean acceptEndTag(String parse){
			return true;
		}

		public void handle(String parse){

		}
		public void reset(){

		}
	}
	
	private static HashSet<String> allEndTags = new HashSet<String>();
	private static HashSet<String> allStartTags = new HashSet<String>();
	
	private ArrayDeque<SimpleEntry<SpellRequiredTags,Integer>> stack = new ArrayDeque<SimpleEntry<SpellRequiredTags,Integer>>();
	private HashMap<Integer, Integer> lineMappings;
	
	public static SpellFixer getInstance(){
		return new SpellFixer();
	}
	
	public SpellFixer() {
		SpellRequiredTags.CLASS.getClass();
		SpellRequiredTags.IF.getClass();
		SpellRequiredTags.DEF.getClass();
		SpellRequiredTags.WHILE.getClass();
		SpellRequiredTags.WITH.getClass();
		SpellRequiredTags.FOR.getClass();
		SpellRequiredTags.TRY.getClass();
		
		
	}
	
	private int getIndent(String codeLine){
		int indent = 0;
		char[] chars = codeLine.toCharArray();
		for (int i = 0; i < codeLine.length(); i++) {
			if (chars[i] == ' ' || chars[i] == '\t'){
				indent++;
			} else {
				return indent;
			}
		}
		
		return indent;
	}
	
	public void processFile(String fileName){
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(fileName);

			String pythonCode = "";
			byte[] arr = new byte[4096];
			int length = -1;
			while ((length = inputStream.read(arr)) > 0){
				pythonCode += new String(arr,0,length);
			}
			
			pythonCode = pythonCode.replaceAll("(?<!\\\\)\\\\(?!\\\\)(?![btnfru\"'\\\\])(?!\r)(?!\n)", "\\\\\\\\");
			pythonCode = pythonCode.replaceAll("#endif", "#ENDIF");
			pythonCode = pythonCode.replaceAll("#endtry", "#ENDTRY");
			pythonCode = pythonCode.replaceAll("#endwhile", "#ENDWHILE");
			pythonCode = pythonCode.replaceAll("#enddef", "#ENDDEF");
			pythonCode = pythonCode.replaceAll("#endclass", "#ENDCLASS");
			pythonCode = pythonCode.replaceAll("#endfor", "#ENDFOR");
			pythonCode = pythonCode.replaceAll("#endwith", "#ENDWITH");
			pythonCode = process(pythonCode);
			FileOutputStream fileOutputStream = new FileOutputStream(fileName);
			fileOutputStream.write(pythonCode.getBytes());
			inputStream.close();
			fileOutputStream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String processFileOnTheFly(String fileName){
		FileInputStream inputStream;
		try {
			inputStream = new FileInputStream(fileName);

			String pythonCode = "";
			byte[] arr = new byte[4096];
			int length = -1;
			while ((length = inputStream.read(arr)) > 0){
				pythonCode += new String(arr,0,length);
			}
			
			pythonCode = pythonCode.replaceAll("(?<!\\\\)\\\\(?!\\\\)(?![btnfru\"'\\\\])(?!\r)(?!\n)", "\\\\\\\\");
			pythonCode = pythonCode.replaceAll("#endif", "#ENDIF");
			pythonCode = pythonCode.replaceAll("#endtry", "#ENDTRY");
			pythonCode = pythonCode.replaceAll("#endwhile", "#ENDWHILE");
			pythonCode = pythonCode.replaceAll("#enddef", "#ENDDEF");
			pythonCode = pythonCode.replaceAll("#endclass", "#ENDCLASS");
			pythonCode = pythonCode.replaceAll("#endfor", "#ENDFOR");
			pythonCode = pythonCode.replaceAll("#endwith", "#ENDWITH");
			pythonCode = process(pythonCode);
		
			inputStream.close();
			
			return pythonCode;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	
	public String process(String pythonCode){
		int lastIndent = 0;
		int currentIndent = 0;
		//pythonCode = pythonCode.replaceAll("\\\r\n", "");
		//pythonCode = pythonCode.replaceAll("\\\n\r", "");
		//pythonCode = pythonCode.replaceAll("\\\n", "");
		pythonCode = pythonCode.replaceAll("\t", "    ");
		String[] pythonCodeLines = pythonCode.split("\r?\n\r?");
		LinkedHashMultimap<Integer, String> additionalEndTags = LinkedHashMultimap.create();
		HashSet<Integer> validEndTags = new HashSet<Integer>();
		HashSet<Integer> possibleInvalidEndTags = new HashSet<Integer>();
		boolean inMLComment = false;
		int currentLine = 0;
		for (String line : pythonCodeLines) {
			currentIndent = getIndent(line);
			String codeLine = line.substring(currentIndent);
			
			String statement = codeLine.replaceFirst("(\\w+)\\W.*", "$1");
			
			if (codeLine.startsWith("'''") || codeLine.startsWith("\"\"\"")){
				if (!codeLine.substring(3).contains("'''") && !codeLine.substring(3).contains("\"\"\"")){
					inMLComment = !inMLComment;
				}				
				currentLine++;
				continue;
			} else {
				if (inMLComment && (codeLine.trim().endsWith("'''") || codeLine.trim().endsWith("\"\"\""))){
					inMLComment = !inMLComment;
					currentLine++;
					continue;
				}
				if (inMLComment){
					currentLine++;
					continue;
				}
			}
			
			
			if (allStartTags.contains(statement)){
				if (currentLine > 0){
					String prevCodeLine = pythonCodeLines[currentLine-1];
					if (prevCodeLine != null && (prevCodeLine.endsWith("\\") || isMultiLineString(pythonCodeLines[currentLine],prevCodeLine))){
						currentLine++;
						continue;
					}
				}
				
				SpellRequiredTags requiredTag = SpellRequiredTags.valueOf(statement.toUpperCase());
				requiredTag.reset();
				int delayedCheck = -1;
				boolean inLocalMLComment = false;
				for (int i = currentLine+1; i < pythonCodeLines.length+1; i++) {
					if (i == pythonCodeLines.length){
						if (delayedCheck >= 0)
							i = delayedCheck+1;
						
						String indentedString = createIndentedString(currentIndent,requiredTag.getEndTag());
						while (i > 0 && (pythonCodeLines[i-1].trim().isEmpty() || (pythonCodeLines[i-1].length() < indentedString.length() && pythonCodeLines[i-1].trim().startsWith("#")))){
							i--;
						}
						
						additionalEndTags.put(i-1, indentedString);
						// missing endTag
						break;
					}					
					String currentCodeLine = pythonCodeLines[i];
					int currentSubIndent = getIndent(currentCodeLine);
					String currentCode = currentCodeLine.substring(currentSubIndent);
					
					String prevCodeLine    = null;
					if (currentCode.startsWith("'''") || currentCode.startsWith("\"\"\"")){
						if (!currentCode.substring(3).contains("'''") && !currentCode.substring(3).contains("\"\"\"")){
							inLocalMLComment = !inLocalMLComment;
						}
						//i++;
						continue;
					} else {
						if (inLocalMLComment && (currentCode.trim().endsWith("'''") || currentCode.trim().endsWith("\"\"\""))){
							inLocalMLComment = !inLocalMLComment;
							//i++;
							continue;
						}
						if (inLocalMLComment){
							//i++;
							continue;
						}
					}
					if (i > 0){
						prevCodeLine = pythonCodeLines[i-1];
						if (prevCodeLine != null && (prevCodeLine.endsWith("\\") || isMultiLineString(pythonCodeLines[i],prevCodeLine))){
							if (delayedCheck != -1)
								delayedCheck = i;
							continue;
						}
					}
					if (currentCodeLine.trim().isEmpty())
						continue;
					
					
					if (canSkipToPosition(currentCodeLine,currentIndent)){
						
 						currentCodeLine = currentCodeLine.substring(currentIndent);
						char c = currentCodeLine.charAt(0);
						if (c == ' ' || c == '\t'){
							delayedCheck = i;
							continue;
						}
						if (c == '#'){
							String possibleEndTag = currentCodeLine.replaceFirst("(#\\w+)\\W.*", "$1");
							if (requiredTag.getEndTags().contains(possibleEndTag)){
								//System.out.println("found end tag");
								//if (delayedCheck >= 0){
								//	i = delayedCheck;
								//}
								if (requiredTag.acceptEndTag(possibleEndTag)){
									boolean probablyInvalidMarker = false;
									for (int idx = i+1; idx < pythonCodeLines.length; idx++) {
										String nextCodeLine = pythonCodeLines[idx];
										String prevCodeLine2 = null;
										if (i > 0){
											prevCodeLine2 = pythonCodeLines[idx-1];
											if (prevCodeLine2 != null && (prevCodeLine2.endsWith("\\") || isMultiLineString(nextCodeLine, prevCodeLine2) )){
												continue;
											}
										}
										if (nextCodeLine.trim().isEmpty())
											continue;
										if (canSkipToPosition(nextCodeLine,currentIndent)){
											nextCodeLine = nextCodeLine.substring(currentIndent);
											char nextC = nextCodeLine.charAt(0);
											if ((nextC == ' ' || nextC == '\t')){
												probablyInvalidMarker = true;
												break;
											}
											if (nextC != '#'){
												String possibleSkipTag = nextCodeLine.replaceFirst("(\\w+)\\W.*", "$1");
												if (requiredTag.getSkipTags().contains(possibleSkipTag)){
													probablyInvalidMarker = true;
													break;
												} else {
													break;
												}
											}
										} else {
											if (currentCodeLine.trim().startsWith("#")){
												continue;
											}
											break;
										}
									}

									if (!probablyInvalidMarker) {
										validEndTags.add(i);
									} else {
										possibleInvalidEndTags.add(i);
										continue;
									}
								} else {
									possibleInvalidEndTags.add(i);
									delayedCheck = -1;
									continue;
								}
								break;
							}
							//System.out.println("missing end tag");
							
							//delayedCheck = i;
							continue;
							//additionalEndTags.put(i-1, createIndentedString(currentIndent,requiredTag.getEndTag()));
							//break;
						} else {
							String possibleSkipTag = currentCodeLine.replaceFirst("(\\w+)\\W.*", "$1");
							if (requiredTag.getSkipTags().contains(possibleSkipTag)){
								//System.out.println("skip tag ");
								requiredTag.handle(possibleSkipTag);
								delayedCheck = i;
								continue;
							}
							//System.out.println("missing end tag");
							if (delayedCheck >= 0){
								i = delayedCheck+1;
							}
							String indentedString = createIndentedString(currentIndent,requiredTag.getEndTag());
							while (i > 0 && (pythonCodeLines[i-1].trim().isEmpty() || (pythonCodeLines[i-1].length() < indentedString.length() && pythonCodeLines[i-1].trim().startsWith("#")))){
								i--;
							}
							
							additionalEndTags.put(i-1, indentedString);
							break;
						}
						
					} else {
						if (currentCodeLine.trim().startsWith("#")){
							if (delayedCheck == -1)
								delayedCheck = i;
							continue;
						}
						if (delayedCheck >= 0){
							i = delayedCheck+1;
						}
						String indentedString = createIndentedString(currentIndent,requiredTag.getEndTag());
						while (i > 0 && (pythonCodeLines[i-1].trim().isEmpty() || (pythonCodeLines[i-1].length() < indentedString.length() && pythonCodeLines[i-1].trim().startsWith("#")))){
							i--;
						}
						
						additionalEndTags.put(i-1, indentedString);
						// missing endTag
						break;
					}
				}
			}
			if (allEndTags.contains(statement)){
				possibleInvalidEndTags.add(currentLine);
			}
			currentLine++;
		}
		StringBuilder spellCode = new StringBuilder();
		int currentLineIdx = 0;
		setLineMappings(new HashMap<Integer,Integer>());
		for (int line = 0; line < pythonCodeLines.length+1; line++) {
			if (line == pythonCodeLines.length){
				Set<String> missingEndTags = additionalEndTags.get(line);
				if (!missingEndTags.isEmpty()){
					for (String endTag : missingEndTags) {
						currentLineIdx++;
						spellCode.append(endTag + "\n");
					}
				}
			} else {
				if (!(possibleInvalidEndTags.contains(line) && !validEndTags.contains(line))){
					if (!pythonCodeLines[line].trim().startsWith("#")){
						String danglindEndTag = pythonCodeLines[line].trim().replaceFirst(".*(#END\\w+).*", "$1");
						if (allEndTags.contains(danglindEndTag)){
							pythonCodeLines[line] = pythonCodeLines[line].replace(danglindEndTag, "");
						}
					}
					getLineMappings().put(currentLineIdx,line);
					currentLineIdx++;
					spellCode.append(pythonCodeLines[line] + "\n");
				}			
				List<String> missingEndTags = new ArrayList<String>(additionalEndTags.get(line));
				Collections.sort(missingEndTags, new Comparator<String>() {

					@Override
					public int compare(String o1, String o2) {
						// TODO Auto-generated method stub
						return getIndent(o2) - getIndent(o1);
					}
					
				});
				if (!missingEndTags.isEmpty()){
					for (String endTag : missingEndTags) {
						currentLineIdx++;
						spellCode.append(endTag + "\n");
					}
				}
			}
		}
		//System.out.println(spellCode);
		String string = spellCode.toString();
		
		return spellCode.toString();
	}

	private boolean isMultiLineString(String currentCodeLine, String prevCodeLine) {
		// TODO Auto-generated method stub
		boolean multiLineTest1 = currentCodeLine.trim().startsWith("'") && prevCodeLine.trim().endsWith("'");
		boolean multiLineTest2 = currentCodeLine.trim().startsWith("\"") && prevCodeLine.trim().endsWith("\"");
		return multiLineTest1 || multiLineTest2;
	}

	private String createIndentedString(int currentIndent, String endTag) {
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < currentIndent; i++) {
			b.append(' ');
		}
		b.append(endTag);
		return b.toString();
	}

	private boolean canSkipToPosition(String currentCodeLine, int currentIndent) {
		char[] charArray = currentCodeLine.toCharArray();		
		for (int i = 0; i < currentIndent; i++) {
			if (charArray[i] != ' ' && charArray[i] != '\t')
				return false;
			if (charArray[i] == '\t')
				i += 3;
		}

		return true;
		
	}

	public HashMap<Integer, Integer> getLineMappings() {
		return lineMappings;
	}
	
	public void setLineMappings(HashMap<Integer, Integer> lineMappings) {
		this.lineMappings = lineMappings;
	}
	
}
