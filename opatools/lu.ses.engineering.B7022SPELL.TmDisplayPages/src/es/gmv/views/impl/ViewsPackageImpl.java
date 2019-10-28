/**
 */
package es.gmv.views.impl;

import es.gmv.views.AndColumn;
import es.gmv.views.Comment;
import es.gmv.views.DisplayRenderingType;
import es.gmv.views.DocumentRoot;
import es.gmv.views.FontStyle;
import es.gmv.views.FontType;
import es.gmv.views.MetaInformation;
import es.gmv.views.MnemonicRow;
import es.gmv.views.ParameterList;
import es.gmv.views.Row;
import es.gmv.views.TmDisplayPage;
import es.gmv.views.TmRow;
import es.gmv.views.ViewsFactory;
import es.gmv.views.ViewsPackage;
import es.gmv.views.Xmldisplaydefinition;
import es.gmv.views.Xmltabulardisplaydefinition;
import es.gmv.views.util.ViewsValidator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewsPackageImpl extends EPackageImpl implements ViewsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass displayRenderingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fontTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmldisplaydefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmltabulardisplaydefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mnemonicRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tmDisplayPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType familyTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fontStyleObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see es.gmv.views.ViewsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ViewsPackageImpl() {
		super(eNS_URI, ViewsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ViewsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ViewsPackage init() {
		if (isInited) return (ViewsPackage)EPackage.Registry.INSTANCE.getEPackage(ViewsPackage.eNS_URI);

		// Obtain or create and register package
		ViewsPackageImpl theViewsPackage = (ViewsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ViewsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ViewsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theViewsPackage.createPackageContents();

		// Initialize created meta-data
		theViewsPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theViewsPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return ViewsValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theViewsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ViewsPackage.eNS_URI, theViewsPackage);
		return theViewsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAndColumn() {
		return andColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAndColumn_Name() {
		return (EAttribute)andColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAndColumn_Visible() {
		return (EAttribute)andColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAndColumn_Width() {
		return (EAttribute)andColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisplayRenderingType() {
		return displayRenderingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayRenderingType_Background() {
		return (EAttribute)displayRenderingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisplayRenderingType_Foreground() {
		return (EAttribute)displayRenderingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisplayRenderingType_Font() {
		return (EReference)displayRenderingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Xmltabulardisplaydefinition() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFontType() {
		return fontTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontType_Family() {
		return (EAttribute)fontTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontType_Height() {
		return (EAttribute)fontTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFontType_Style() {
		return (EAttribute)fontTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaInformation() {
		return metaInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaInformation_Description() {
		return (EAttribute)metaInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaInformation_Keyword() {
		return (EAttribute)metaInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaInformation_Date() {
		return (EAttribute)metaInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaInformation_ParameterList() {
		return (EReference)metaInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterList() {
		return parameterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterList_Parameter() {
		return (EAttribute)parameterListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRow() {
		return rowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRow_Name() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRow_Note() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRow_Representation() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRow_Title() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRow_Type() {
		return (EAttribute)rowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXmldisplaydefinition() {
		return xmldisplaydefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXmldisplaydefinition_MetaInformation() {
		return (EReference)xmldisplaydefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXmldisplaydefinition_Identifier() {
		return (EAttribute)xmldisplaydefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXmldisplaydefinition_KindOfDisplay() {
		return (EAttribute)xmldisplaydefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXmldisplaydefinition_Version() {
		return (EAttribute)xmldisplaydefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXmltabulardisplaydefinition() {
		return xmltabulardisplaydefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXmltabulardisplaydefinition_Scrollable() {
		return (EAttribute)xmltabulardisplaydefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXmltabulardisplaydefinition_Column() {
		return (EReference)xmltabulardisplaydefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXmltabulardisplaydefinition_Row() {
		return (EReference)xmltabulardisplaydefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMnemonicRow() {
		return mnemonicRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTmRow() {
		return tmRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTmDisplayPage() {
		return tmDisplayPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontStyle() {
		return fontStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColorType() {
		return colorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFamilyType() {
		return familyTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFontStyleObject() {
		return fontStyleObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewsFactory getViewsFactory() {
		return (ViewsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		andColumnEClass = createEClass(AND_COLUMN);
		createEAttribute(andColumnEClass, AND_COLUMN__NAME);
		createEAttribute(andColumnEClass, AND_COLUMN__VISIBLE);
		createEAttribute(andColumnEClass, AND_COLUMN__WIDTH);

		displayRenderingTypeEClass = createEClass(DISPLAY_RENDERING_TYPE);
		createEAttribute(displayRenderingTypeEClass, DISPLAY_RENDERING_TYPE__BACKGROUND);
		createEAttribute(displayRenderingTypeEClass, DISPLAY_RENDERING_TYPE__FOREGROUND);
		createEReference(displayRenderingTypeEClass, DISPLAY_RENDERING_TYPE__FONT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLTABULARDISPLAYDEFINITION);

		fontTypeEClass = createEClass(FONT_TYPE);
		createEAttribute(fontTypeEClass, FONT_TYPE__FAMILY);
		createEAttribute(fontTypeEClass, FONT_TYPE__HEIGHT);
		createEAttribute(fontTypeEClass, FONT_TYPE__STYLE);

		metaInformationEClass = createEClass(META_INFORMATION);
		createEAttribute(metaInformationEClass, META_INFORMATION__DESCRIPTION);
		createEAttribute(metaInformationEClass, META_INFORMATION__KEYWORD);
		createEAttribute(metaInformationEClass, META_INFORMATION__DATE);
		createEReference(metaInformationEClass, META_INFORMATION__PARAMETER_LIST);

		parameterListEClass = createEClass(PARAMETER_LIST);
		createEAttribute(parameterListEClass, PARAMETER_LIST__PARAMETER);

		rowEClass = createEClass(ROW);
		createEAttribute(rowEClass, ROW__NAME);
		createEAttribute(rowEClass, ROW__NOTE);
		createEAttribute(rowEClass, ROW__REPRESENTATION);
		createEAttribute(rowEClass, ROW__TITLE);
		createEAttribute(rowEClass, ROW__TYPE);

		xmldisplaydefinitionEClass = createEClass(XMLDISPLAYDEFINITION);
		createEReference(xmldisplaydefinitionEClass, XMLDISPLAYDEFINITION__META_INFORMATION);
		createEAttribute(xmldisplaydefinitionEClass, XMLDISPLAYDEFINITION__IDENTIFIER);
		createEAttribute(xmldisplaydefinitionEClass, XMLDISPLAYDEFINITION__KIND_OF_DISPLAY);
		createEAttribute(xmldisplaydefinitionEClass, XMLDISPLAYDEFINITION__VERSION);

		xmltabulardisplaydefinitionEClass = createEClass(XMLTABULARDISPLAYDEFINITION);
		createEAttribute(xmltabulardisplaydefinitionEClass, XMLTABULARDISPLAYDEFINITION__SCROLLABLE);
		createEReference(xmltabulardisplaydefinitionEClass, XMLTABULARDISPLAYDEFINITION__COLUMN);
		createEReference(xmltabulardisplaydefinitionEClass, XMLTABULARDISPLAYDEFINITION__ROW);

		mnemonicRowEClass = createEClass(MNEMONIC_ROW);

		tmRowEClass = createEClass(TM_ROW);

		commentEClass = createEClass(COMMENT);

		tmDisplayPageEClass = createEClass(TM_DISPLAY_PAGE);

		// Create enums
		fontStyleEEnum = createEEnum(FONT_STYLE);

		// Create data types
		colorTypeEDataType = createEDataType(COLOR_TYPE);
		familyTypeEDataType = createEDataType(FAMILY_TYPE);
		fontStyleObjectEDataType = createEDataType(FONT_STYLE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xmltabulardisplaydefinitionEClass.getESuperTypes().add(this.getXmldisplaydefinition());
		xmltabulardisplaydefinitionEClass.getESuperTypes().add(this.getTmDisplayPage());
		mnemonicRowEClass.getESuperTypes().add(this.getRow());
		tmRowEClass.getESuperTypes().add(this.getRow());
		commentEClass.getESuperTypes().add(this.getRow());

		// Initialize classes, features, and operations; add parameters
		initEClass(andColumnEClass, AndColumn.class, "AndColumn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAndColumn_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, AndColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAndColumn_Visible(), theXMLTypePackage.getString(), "visible", "true", 0, 1, AndColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAndColumn_Width(), theXMLTypePackage.getInt(), "width", "1", 0, 1, AndColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(displayRenderingTypeEClass, DisplayRenderingType.class, "DisplayRenderingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisplayRenderingType_Background(), this.getColorType(), "background", null, 0, 1, DisplayRenderingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisplayRenderingType_Foreground(), this.getColorType(), "foreground", null, 0, 1, DisplayRenderingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisplayRenderingType_Font(), this.getFontType(), null, "font", null, 0, 1, DisplayRenderingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Xmltabulardisplaydefinition(), this.getXmltabulardisplaydefinition(), null, "xmltabulardisplaydefinition", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(fontTypeEClass, FontType.class, "FontType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFontType_Family(), this.getFamilyType(), "family", null, 1, 1, FontType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFontType_Height(), theXMLTypePackage.getUnsignedInt(), "height", null, 0, 1, FontType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFontType_Style(), this.getFontStyle(), "style", null, 0, 1, FontType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaInformationEClass, MetaInformation.class, "MetaInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaInformation_Description(), theXMLTypePackage.getString(), "description", "", 1, 1, MetaInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaInformation_Keyword(), theXMLTypePackage.getString(), "keyword", "", 0, -1, MetaInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaInformation_Date(), theXMLTypePackage.getDateTime(), "date", null, 1, 1, MetaInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaInformation_ParameterList(), this.getParameterList(), null, "parameterList", null, 1, 1, MetaInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterList_Parameter(), theXMLTypePackage.getString(), "parameter", null, 0, -1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rowEClass, Row.class, "Row", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRow_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRow_Note(), theXMLTypePackage.getString(), "note", "", 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRow_Representation(), theXMLTypePackage.getString(), "representation", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRow_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRow_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Row.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmldisplaydefinitionEClass, Xmldisplaydefinition.class, "Xmldisplaydefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmldisplaydefinition_MetaInformation(), this.getMetaInformation(), null, "metaInformation", null, 1, 1, Xmldisplaydefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmldisplaydefinition_Identifier(), theXMLTypePackage.getString(), "identifier", null, 0, 1, Xmldisplaydefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmldisplaydefinition_KindOfDisplay(), theXMLTypePackage.getString(), "kindOfDisplay", null, 0, 1, Xmldisplaydefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmldisplaydefinition_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, Xmldisplaydefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmltabulardisplaydefinitionEClass, Xmltabulardisplaydefinition.class, "Xmltabulardisplaydefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmltabulardisplaydefinition_Scrollable(), theXMLTypePackage.getBoolean(), "scrollable", "false", 1, 1, Xmltabulardisplaydefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmltabulardisplaydefinition_Column(), this.getAndColumn(), null, "column", null, 1, -1, Xmltabulardisplaydefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmltabulardisplaydefinition_Row(), this.getRow(), null, "row", null, 1, -1, Xmltabulardisplaydefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mnemonicRowEClass, MnemonicRow.class, "MnemonicRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tmRowEClass, TmRow.class, "TmRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tmDisplayPageEClass, TmDisplayPage.class, "TmDisplayPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(fontStyleEEnum, FontStyle.class, "FontStyle");
		addEEnumLiteral(fontStyleEEnum, FontStyle.NORMAL);
		addEEnumLiteral(fontStyleEEnum, FontStyle.BOLD);
		addEEnumLiteral(fontStyleEEnum, FontStyle.ITALIC);

		// Initialize data types
		initEDataType(colorTypeEDataType, String.class, "ColorType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(familyTypeEDataType, String.class, "FamilyType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fontStyleObjectEDataType, FontStyle.class, "FontStyleObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (andColumnEClass, 
		   source, 
		   new String[] {
			 "name", "and_column",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getAndColumn_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getAndColumn_Visible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "visible"
		   });		
		addAnnotation
		  (getAndColumn_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width"
		   });		
		addAnnotation
		  (colorTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "ColorType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });		
		addAnnotation
		  (displayRenderingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "DisplayRenderingType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDisplayRenderingType_Background(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "background"
		   });		
		addAnnotation
		  (getDisplayRenderingType_Foreground(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "foreground"
		   });		
		addAnnotation
		  (getDisplayRenderingType_Font(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "font"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Xmltabulardisplaydefinition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "xmltabulardisplaydefinition",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (familyTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "family_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "\\w+"
		   });		
		addAnnotation
		  (fontStyleEEnum, 
		   source, 
		   new String[] {
			 "name", "FontStyle"
		   });		
		addAnnotation
		  (fontStyleObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "FontStyle:Object",
			 "baseType", "FontStyle"
		   });		
		addAnnotation
		  (fontTypeEClass, 
		   source, 
		   new String[] {
			 "name", "FontType",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFontType_Family(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "family"
		   });		
		addAnnotation
		  (getFontType_Height(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "height"
		   });		
		addAnnotation
		  (getFontType_Style(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "style"
		   });		
		addAnnotation
		  (metaInformationEClass, 
		   source, 
		   new String[] {
			 "name", "MetaInformation",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMetaInformation_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "description"
		   });		
		addAnnotation
		  (getMetaInformation_Keyword(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keyword"
		   });		
		addAnnotation
		  (getMetaInformation_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date"
		   });		
		addAnnotation
		  (getMetaInformation_ParameterList(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parameterList"
		   });		
		addAnnotation
		  (parameterListEClass, 
		   source, 
		   new String[] {
			 "name", "ParameterList",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getParameterList_Parameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parameter"
		   });		
		addAnnotation
		  (rowEClass, 
		   source, 
		   new String[] {
			 "name", "row",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getRow_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getRow_Note(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "note"
		   });		
		addAnnotation
		  (getRow_Representation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "representation"
		   });		
		addAnnotation
		  (getRow_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (getRow_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (xmldisplaydefinitionEClass, 
		   source, 
		   new String[] {
			 "name", "xmldisplaydefinition",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getXmldisplaydefinition_MetaInformation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "metaInformation"
		   });		
		addAnnotation
		  (getXmldisplaydefinition_Identifier(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "identifier"
		   });		
		addAnnotation
		  (getXmldisplaydefinition_KindOfDisplay(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kindOfDisplay"
		   });		
		addAnnotation
		  (getXmldisplaydefinition_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (xmltabulardisplaydefinitionEClass, 
		   source, 
		   new String[] {
			 "name", "xmltabulardisplaydefinition",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getXmltabulardisplaydefinition_Scrollable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "scrollable"
		   });		
		addAnnotation
		  (getXmltabulardisplaydefinition_Column(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "column"
		   });		
		addAnnotation
		  (getXmltabulardisplaydefinition_Row(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "row"
		   });		
		addAnnotation
		  (mnemonicRowEClass, 
		   source, 
		   new String[] {
			 "name", "row",
			 "kind", "empty"
		   });		
		addAnnotation
		  (tmRowEClass, 
		   source, 
		   new String[] {
			 "name", "row",
			 "kind", "empty"
		   });		
		addAnnotation
		  (commentEClass, 
		   source, 
		   new String[] {
			 "name", "row",
			 "kind", "empty"
		   });
	}

} //ViewsPackageImpl
