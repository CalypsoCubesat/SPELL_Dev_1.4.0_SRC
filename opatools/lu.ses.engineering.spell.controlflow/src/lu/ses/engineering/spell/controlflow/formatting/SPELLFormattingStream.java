package lu.ses.engineering.spell.controlflow.formatting;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.formatting.IElementMatcherProvider.IElementMatcher;
import org.eclipse.xtext.formatting.impl.AbstractFormattingConfig.ElementLocator;
import org.eclipse.xtext.formatting.impl.AbstractFormattingConfig.ElementPattern;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.formatting.impl.FormattingConfig.IndentationLocatorEnd;
import org.eclipse.xtext.formatting.impl.FormattingConfig.LinewrapLocator;
import org.eclipse.xtext.formatting.impl.FormattingConfig.SpaceLocator;
import org.eclipse.xtext.formatting.impl.FormattingConfigBasedStream;
import org.eclipse.xtext.parsetree.reconstr.IHiddenTokenHelper;
import org.eclipse.xtext.parsetree.reconstr.ITokenStream;
import org.eclipse.xtext.util.Pair;

class SPELLFormattingStream extends FormattingConfigBasedStream {

	protected class SPELLLine extends Line {
		
		protected int flushingSemaphore = 0; // if flushingSemaphore == 0 the line will be flushed, otherwise flushing is suppressed until the value is 0 again
		protected boolean shouldFlush = false; // if this line was tried to flush
		protected boolean alreadyFlushed = false;
		protected int flushEndIndex = 0;
		protected ITokenStream flushTokenStream = null;
		
		protected SPELLLine(List<LineEntry> initialEntries, int leftover) {
			super(initialEntries, leftover);
		}
	
		protected void flushingSemaphoreIncrement() { this.flushingSemaphore++; }
		protected void flushingSemaphoreDecrement() { this.flushingSemaphore--; }
		
		@Override
		public Line add(LineEntry lineEntry) throws IOException {
		
			for (ElementLocator leadingLocator : ((SPELLLineEntry) lineEntry).getLeadingLocators()) {
				if (leadingLocator instanceof IndentationLocatorEnd){
					//((SPELLLineEntry)lineEntry).decrementIndent();
					this.indent = getIndentation(((SPELLLineEntry)lineEntry).getIndent());
			
					
				}
			}
			return super.add(lineEntry);
		}
		
		@Override
		protected void flush(ITokenStream intoStream, int endIndex)
				throws IOException {
			
			/*for (int i = 0; i < endIndex; i++) {
				SPELLLineEntry e = (SPELLLineEntry) this.entries.get(i);
				e.setValue(e.getValue().replaceAll("(?<!\r)\n",""));

			}*/

			super.flush(intoStream, endIndex);
		}
	
		@Override
		public String getSpacesStr(LineEntry entry, boolean isLineStart) {
			String spaces = super.getSpacesStr(entry, isLineStart);
			/*if (spaces != null && spaces.equals(" ")) {
				// Suppress additional white space between every two tokens when serializing EMF models/graphs into source code
				// FIXME: Note that also formatting directives like setSpace() are affected by this change, so using setSpace(' ') with
				// only one white space should result into an unintended '' (nothing) at the moment
				return null;
			}*/
			
			// enable combination of leading spaces and indentation, i.e.
			// setSpace() AND setIndentationIncrement() can be used in combination in formatter
			// otherwise setSpace() overwrites setIndentationIncrement()
			if (((SPELLLineEntry) entry).isLeadingSpaceDefined() &&
				this.isIndentationDefined(isLineStart)) {
				spaces += this.indent;
			}
			
			return spaces;
		}
		
		/**
		 * Check if there is indentation defined for this line, e.g. by using setIndentationIncrement() in the formmatter. 
		 */
		public boolean isIndentationDefined(boolean isLineStart) {
			return isLineStart && indent != null && indent.length() > 0;
		}
		
	}
	
	protected class SPELLLineEntry extends LineEntry {

		protected int position; // the textual position of the line entry in the corresponding line
		
		public SPELLLineEntry(EObject grammarElement, String value,
                boolean isHidden, Set<ElementLocator> beforeLocators,
                String leadingWS, int indent, ParserRule hiddenTokenDefition) {
            super(grammarElement, value, isHidden, beforeLocators, leadingWS, indent,
                    hiddenTokenDefition);
            this.position = 0;
        }
		
		public int getIndent() {
			// TODO Auto-generated method stub
			return indent;
		}

		public void decrementIndent() {
			if (super.indent > 0){
				super.indent--;
			};				
		}

		public boolean isHidden() {
			// TODO Auto-generated method stub
			return isHidden;
		}
		
		
		
		/**
		 * Check if there are leading spaces defined for this line entry, e.g. by using setSpace() in the formatter.
		 */
		public boolean isLeadingSpaceDefined() {
			for (ElementLocator leadingLocator : leadingLocators) {
				if (leadingLocator instanceof SpaceLocator) {
					return true;
				}
			}
			return false;
		}
		
		public Set<ElementLocator> getLeadingLocators() {
			return this.leadingLocators;
		}
		
		public String getValue() {
			return this.value;
		}
		
		public void setValue(String value) {
			this.value = value;
		}
		
		public EObject getGrammarElement() {
			return this.grammarElement;
		}
		
		public String getLeadingWS() {
			return this.leadingWS;
		}
		@Override
		protected boolean isBreak() {
			if (!isBreakable())
				return false;
			if (this.value.endsWith("\n"))
				return true;
			
			for (ElementLocator e : leadingLocators) {
				if (e instanceof LinewrapLocator) {
					if (((LinewrapLocator) e).getMinWrap() > 0)
						return true;
					if (countExistingLeadingNewlines() > 0)
						return true;
				}
			}
			return false;
		}
		@Override
		protected boolean isBreakable() {
			if (leadingLocators == null)
				return false;
			for (ElementLocator e : leadingLocators) {
				if (e instanceof LinewrapLocator && ((LinewrapLocator) e).getMaxWrap() == 0)
					return false;
				if (e instanceof SpaceLocator)
					return false;
			}
			return hiddenTokenHelper.getWhitespaceRuleFor(hiddenTokenDefinition, getLineSeparator()) != null;
		}
		
	}
	
	public SPELLFormattingStream(ITokenStream out, String indentation,
            FormattingConfig cfg, IElementMatcher<ElementPattern> matcher,
            IHiddenTokenHelper hiddenTokenHelper, boolean preserveSpaces) {
        super(out, indentation, cfg, matcher, hiddenTokenHelper, preserveSpaces);
    }
	
	@Override
	protected Line createLine(
	        List<LineEntry> initialEntries, int leftover) {
		return new SPELLLine(initialEntries, leftover);
	}
	
	@Override
	public LineEntry createLineEntry(EObject grammarElement, String value,
	        boolean isHidden, Set<ElementLocator> beforeLocators,
	        String leadingWS, int indent, ParserRule hiddenTokenDefition) {
		return new SPELLLineEntry(grammarElement, value, isHidden, beforeLocators, leadingWS, indent, hiddenTokenDefition);
	}

	
	@Override
	public void writeHidden(EObject grammarElement, String value)
			throws IOException {
		boolean isWhitespace = grammarElement instanceof AbstractRule
				&& hiddenTokenHelper.isWhitespace((AbstractRule) grammarElement);
		if (isWhitespace || cfg.getWhitespaceRule() == grammarElement) {
			if (preservedWS == null) {
				preservedWS = value;
			} else {
				preservedWS += value;
			}
			//addLineEntry(grammarElement, value, false);
		} else {
			addLineEntry(grammarElement, value, false);
		}
	}
}