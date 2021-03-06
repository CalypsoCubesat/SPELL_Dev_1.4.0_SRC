package lu.ses.engineering.spell.revisiontools.hyperlinks;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.ITypedElement;
import org.eclipse.compare.ZipFileStructureCreator;
import org.eclipse.compare.contentmergeviewer.ContentMergeViewer;
import org.eclipse.compare.internal.BufferedResourceNode;
import org.eclipse.compare.internal.CompareMessages;
import org.eclipse.compare.internal.CompareUIPlugin;
import org.eclipse.compare.internal.CompareWithOtherResourceDialog;
import org.eclipse.compare.internal.Utilities;
import org.eclipse.compare.structuremergeviewer.DiffNode;
import org.eclipse.compare.structuremergeviewer.DiffTreeViewer;
import org.eclipse.compare.structuremergeviewer.Differencer;
import org.eclipse.compare.structuremergeviewer.IDiffContainer;
import org.eclipse.compare.structuremergeviewer.IDiffElement;
import org.eclipse.compare.structuremergeviewer.IStructureComparator;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;


/**
 * A two-way or three-way compare for arbitrary IResources.
 */
class ResourceCompareInput extends CompareEditorInput {
	
	private static final boolean NORMALIZE_CASE= true;
	
	private boolean fThreeWay= false;
	private Object fRoot;
	private IStructureComparator fAncestor;
	private IStructureComparator fLeft;
	private IStructureComparator fRight;
	private IResource fAncestorResource;
	private IResource fLeftResource;
	private IResource fRightResource;
	private DiffTreeViewer fDiffViewer;
	private IAction fOpenAction;
	
	class MyDiffNode extends DiffNode {
		
		private boolean fDirty= false;
		private ITypedElement fLastId;
		private String fLastName;
		
		
		public MyDiffNode(IDiffContainer parent, int description, ITypedElement ancestor, ITypedElement left, ITypedElement right) {
			super(parent, description, ancestor, left, right);
		}
		public void fireChange() {
			super.fireChange();
			setDirty(true);
			fDirty= true;
			if (fDiffViewer != null)
				fDiffViewer.refresh(this);
		}
		void clearDirty() {
			fDirty= false;
		}
		public String getName() {
			if (fLastName == null)
				fLastName= super.getName();
			if (fDirty)
				return '<' + fLastName + '>';
			return fLastName;
		}
		
		public ITypedElement getId() {
			ITypedElement id= super.getId();
			if (id == null)
				return fLastId;
			fLastId= id;
			return id;
		}
	}
	
	static class FilteredBufferedResourceNode extends BufferedResourceNode {
		FilteredBufferedResourceNode(IResource resource) {
			super(resource);
		}
		protected IStructureComparator createChild(IResource child) {
			String name= child.getName();
			if (CompareUIPlugin.getDefault().filter(name, child instanceof IContainer, false))
				return null;
			return (IStructureComparator) new FilteredBufferedResourceNode(child);
		}
	}
	
	/*
	 * Creates an compare editor input for the given selection.
	 */
	ResourceCompareInput(CompareConfiguration config) {
		super(config);
		try {
			final IPropertyChangeListener oldListener = getField(this, CompareEditorInput.class.getDeclaredField("fDirtyStateListener"));
			IPropertyChangeListener newListener = new IPropertyChangeListener() {
				IPropertyChangeListener old = oldListener;
				@Override
				public void propertyChange(PropertyChangeEvent e) {
					String propertyName= e.getProperty();
					if (CompareEditorInput.DIRTY_STATE.equals(propertyName)) {
						boolean changed= false;
						Object newValue= e.getNewValue();
						if (newValue instanceof Boolean)
							changed= ((Boolean)newValue).booleanValue();
						//System.out.println(" *Compare DBG* listener setDirty: " + changed + " old:" + isDirty() + " source: " + e.getSource());
						if(!changed)
							return;
					}
					old.propertyChange(e);
					
				}
			};
			setField(this, CompareEditorInput.class.getDeclaredField("fDirtyStateListener"),newListener);
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	static void setField(Object This,Field field, Object newValue) throws Exception {
		field.setAccessible(true);

		Field modifiersField = Field.class.getDeclaredField("modifiers");
		modifiersField.setAccessible(true);
		modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

		field.set(This, newValue);
	}
	static <T> T getField(Object This,Field field) throws Exception {
		field.setAccessible(true);

		Field modifiersField = Field.class.getDeclaredField("modifiers");
		modifiersField.setAccessible(true);
		modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

		return (T) field.get(This);
	}

	public Viewer createDiffViewer(Composite parent) {
		fDiffViewer= new DiffTreeViewer(parent, getCompareConfiguration()) {
			protected void fillContextMenu(IMenuManager manager) {
				
				if (fOpenAction == null) {
					fOpenAction= new Action() {
						public void run() {
							handleOpen(null);
						}
					};
					Utilities.initAction(fOpenAction, getBundle(), "action.CompareContents."); //$NON-NLS-1$
				}
				
				boolean enable= false;
				ISelection selection= getSelection();
				if (selection instanceof IStructuredSelection) {
					IStructuredSelection ss= (IStructuredSelection)selection;
					if (ss.size() == 1) {
						Object element= ss.getFirstElement();
						if (element instanceof MyDiffNode) {
							ITypedElement te= ((MyDiffNode) element).getId();
							if (te != null)
								enable= !ITypedElement.FOLDER_TYPE.equals(te.getType());
						} else
							enable= true;
					}
				}
				fOpenAction.setEnabled(enable);
				
				manager.add(fOpenAction);
				
				super.fillContextMenu(manager);
			}
		};
		return fDiffViewer;
	}

	
	// If the compare is three-way, this method asks the user which resource
	// to use as the ancestor. Depending on the value of
	// showSelectAncestorDialog flag it uses different dialogs to get the
	// feedback from the user. Returns false if the user cancels the prompt,
	// true otherwise.
	boolean setSelection(IResource[] selection, boolean showSelectAncestorDialog) {

		//= Utilities.getResources(s);

		fAncestorResource= null;
		fAncestor= null;
		fLeftResource= selection[0];
		fRightResource= selection[1];

		fLeft= getStructure(fLeftResource);
		fRight= getStructure(fRightResource);
		return true;
	}

	private boolean checkSelection(IResource[] resources) {
		for (int i = 0; i < resources.length; i++)
			if (resources[i] == null)
				return false;
		return true;
	}

	/*
	 * Returns true if compare can be executed for the given selection.
	 */
	public boolean isEnabled(IResource... selection) {
		
		//IResource[] selection= Utilities.getResources(s);
		if (selection.length < 2 || selection.length > 3)
			return false;

		boolean threeWay= selection.length == 3;
		
		if (threeWay)
			// It only makes sense if they're all mutually comparable.
			// If not, the user should compare two of them.
			return comparable(selection[0], selection[1])
				&& comparable(selection[0], selection[2])
				&& comparable(selection[1], selection[2]);
		
		return comparable(selection[0], selection[1]);
	}
	
	/**
	 * Initializes the images in the compare configuration.
	 */
	void initializeCompareConfiguration() {
		CompareConfiguration cc= getCompareConfiguration();
		if (fLeftResource != null) {
			cc.setLeftLabel(buildLabel(fLeftResource));
			cc.setLeftImage(CompareUIPlugin.getImage(fLeftResource));
		}
		if (fRightResource != null) {
			cc.setRightLabel(buildLabel(fRightResource));
			cc.setRightImage(CompareUIPlugin.getImage(fRightResource));
		}
		if (fThreeWay && fAncestorResource != null) {			
			cc.setAncestorLabel(buildLabel(fAncestorResource));
			cc.setAncestorImage(CompareUIPlugin.getImage(fAncestorResource));
		}
	}
	
	/*
	 * Returns true if both resources are either structured or unstructured.
	 */
	private boolean comparable(IResource c1, IResource c2) {
		return hasStructure(c1) == hasStructure(c2);
	}
	
	/*
	 * Returns true if the given argument has a structure.
	 */
	private boolean hasStructure(IResource input) {
		
		if (input instanceof IContainer)
			return true;
			
		if (input instanceof IFile) {
			IFile file= (IFile) input;
			String type= file.getFileExtension();
			if (type != null) {
				type= normalizeCase(type);
				return "JAR".equals(type) || "ZIP".equals(type);	//$NON-NLS-2$ //$NON-NLS-1$
			}
		}
		
		return false;
	}
	
	/*
	 * Creates a <code>IStructureComparator</code> for the given input.
	 * Returns <code>null</code> if no <code>IStructureComparator</code>
	 * can be found for the <code>IResource</code>.
	 */
	private IStructureComparator getStructure(IResource input) {
		
		if (input instanceof IContainer)
			return new FilteredBufferedResourceNode(input);
			
		if (input instanceof IFile) {
			IStructureComparator rn= new FilteredBufferedResourceNode(input);
			IFile file= (IFile) input;
			String type= normalizeCase(file.getFileExtension());
			if ("JAR".equals(type) || "ZIP".equals(type)) //$NON-NLS-2$ //$NON-NLS-1$
				return new ZipFileStructureCreator().getStructure(rn);
			return rn;
		}
		return null;
	}
	
	/*
	 * Performs a two-way or three-way diff on the current selection.
	 */
	public Object prepareInput(IProgressMonitor pm) throws InvocationTargetException {
				
		try {
			// fix for PR 1GFMLFB: ITPUI:WIN2000 - files that are out of sync with the file system appear as empty							
			fLeftResource.refreshLocal(IResource.DEPTH_INFINITE, pm);
			fRightResource.refreshLocal(IResource.DEPTH_INFINITE, pm);
			if (fThreeWay && fAncestorResource != null)
				fAncestorResource.refreshLocal(IResource.DEPTH_INFINITE, pm);
			// end fix						
				
			pm.beginTask(Utilities.getString("ResourceCompare.taskName"), IProgressMonitor.UNKNOWN); //$NON-NLS-1$

			String leftLabel= fLeftResource.getName();
			String rightLabel= fRightResource.getName();
			
			String title;
			if (fThreeWay) {			
				String format= Utilities.getString("ResourceCompare.threeWay.title"); //$NON-NLS-1$
				String ancestorLabel= fAncestorResource.getName();
				title= MessageFormat.format(format, new String[] {ancestorLabel, leftLabel, rightLabel});	
			} else {
				String format= Utilities.getString("ResourceCompare.twoWay.title"); //$NON-NLS-1$
				title= MessageFormat.format(format, new String[] {leftLabel, rightLabel});
			}
			setTitle(title);
			
			Differencer d= new Differencer() {
				protected Object visit(Object parent, int description, Object ancestor, Object left, Object right) {
					return new MyDiffNode((IDiffContainer) parent, description, (ITypedElement)ancestor, (ITypedElement)left, (ITypedElement)right);
				}
			};
			
			fRoot= d.findDifferences(fThreeWay, pm, null, fAncestor, fLeft, fRight);
			return fRoot;
			
		} catch (CoreException ex) {
			throw new InvocationTargetException(ex);
		} finally {
			pm.done();
		}
	}
	
	public String getToolTipText() {
		if (fLeftResource != null && fRightResource != null) {
			String leftLabel= fLeftResource.getFullPath().makeRelative().toString();
			String rightLabel= fRightResource.getFullPath().makeRelative().toString();			
			if (fThreeWay) {			
				String format= Utilities.getString("ResourceCompare.threeWay.tooltip"); //$NON-NLS-1$
				String ancestorLabel= fAncestorResource.getFullPath().makeRelative().toString();
				return MessageFormat.format(format, new String[] {ancestorLabel, leftLabel, rightLabel});
			}
			String format= Utilities.getString("ResourceCompare.twoWay.tooltip"); //$NON-NLS-1$
			return MessageFormat.format(format, new String[] {leftLabel, rightLabel});
		}
		// fall back
		return super.getToolTipText();
	}
	
	private String buildLabel(IResource r) {
		// for a linked resource in a hidden project use its local file system location
		if (r.isLinked() && r.getProject().isHidden())
			return r.getLocation().toString();
		String n= r.getFullPath().toString();
		if (n.charAt(0) == IPath.SEPARATOR)
			return n.substring(1);
		return n;
	}
	
	
	
	@Override
	public boolean isDirty() {
		//System.out.println(" *Compare DBG* isDirty:" + super.isDirty());			
		//System.out.println(" *Compare DBG* 		isLeftDirty:" + super.isLeftSaveNeeded());
		//System.out.println(" *Compare DBG* 		isRightDirty:" + super.isRightSaveNeeded());
		return super.isDirty();
	}

	
	
	
	public void saveChanges(IProgressMonitor pm) throws CoreException {
		//System.out.println(" *Compare DBG* save started");
		super.saveChanges(pm);
		if (fRoot instanceof DiffNode) {
			try {
				commit(pm, (DiffNode) fRoot);
			} finally {
				if (fDiffViewer != null)
					fDiffViewer.refresh();				
				setDirty(false);
			}
		}
	}
	
	/*
	 * Recursively walks the diff tree and commits all changes.
	 */
	private static void commit(IProgressMonitor pm, DiffNode node) throws CoreException {
		//System.out.println(" *Compare DBG* commit:" + node);
		if (node instanceof MyDiffNode)		
			((MyDiffNode)node).clearDirty();
		
		ITypedElement left= node.getLeft();
		if (left instanceof BufferedResourceNode)
			((BufferedResourceNode) left).commit(pm);
			
		ITypedElement right= node.getRight();
		if (right instanceof BufferedResourceNode)
			((BufferedResourceNode) right).commit(pm);

		IDiffElement[] children= node.getChildren();
		if (children != null) {
			for (int i= 0; i < children.length; i++) {
				IDiffElement element= children[i];
				if (element instanceof DiffNode)
					commit(pm, (DiffNode) element);
			}
		}
	}
	
	/* (non Javadoc)
	 * see IAdaptable.getAdapter
	 */
	public Object getAdapter(Class adapter) {
		if (IFile.class.equals(adapter)) {
		    IProgressMonitor pm= new NullProgressMonitor();
			// flush changes in any dirty viewer
			flushViewers(pm);
		    IFile[] files= (IFile[]) getAdapter(IFile[].class);
		    if (files != null && files.length > 0)
		        return files[0];	// can only return one: limitation on IDE.saveAllEditors; see #64617
		    return null;
		}
		if (IFile[].class.equals(adapter)) {
		    HashSet collector= new HashSet();
		    collectDirtyResources(fRoot, collector);
		    return collector.toArray(new IFile[collector.size()]);
		}
		return super.getAdapter(adapter);
	}
	
	private void collectDirtyResources(Object o, Set collector) {
		if (o instanceof DiffNode) {
		    DiffNode node= (DiffNode) o;
			
			ITypedElement left= node.getLeft();
			if (left instanceof BufferedResourceNode) {
			    BufferedResourceNode bn= (BufferedResourceNode) left;
			    if (bn.isDirty()) {
			        IResource resource= bn.getResource();
			        if (resource instanceof IFile)
			            collector.add(resource);
			    }
			}

			ITypedElement right= node.getRight();
			if (right instanceof BufferedResourceNode) {
			    BufferedResourceNode bn= (BufferedResourceNode) right;
			    if (bn.isDirty()) {
			        IResource resource= bn.getResource();
			        if (resource instanceof IFile)
			            collector.add(resource);
			    }
			}
				
			IDiffElement[] children= node.getChildren();
			if (children != null) {
				for (int i= 0; i < children.length; i++) {
					IDiffElement element= children[i];
					if (element instanceof DiffNode)
					    collectDirtyResources(element, collector);
				}
			}
		}
	}
	
	private static String normalizeCase(String s) {
		if (NORMALIZE_CASE && s != null)
			return s.toUpperCase();
		return s;
	}
	
	public boolean canRunAsJob() {
		return true;
	}
}