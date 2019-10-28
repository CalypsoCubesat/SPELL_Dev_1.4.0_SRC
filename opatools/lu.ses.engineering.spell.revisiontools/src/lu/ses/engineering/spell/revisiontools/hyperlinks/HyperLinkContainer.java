package lu.ses.engineering.spell.revisiontools.hyperlinks;

import org.eclipse.ui.console.IHyperlink2;

public class HyperLinkContainer {


	private IHyperlink2 h;
	private int offset;
	private int length;

	public HyperLinkContainer(IHyperlink2 h,int offset,int length) {
		this.setH(h);
		this.setOffset(offset);
		this.setLength(length);

		// TODO Auto-generated constructor stub
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public IHyperlink2 getH() {
		return h;
	}

	public void setH(IHyperlink2 h) {
		this.h = h;
	}
}
