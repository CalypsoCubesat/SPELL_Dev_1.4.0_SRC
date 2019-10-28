/**
 */
package es.gmv.views;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.gmv.views.ViewsFactory
 * @model kind="package"
 * @generated
 */
public interface ViewsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "views";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gmv.es/views";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "views";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ViewsPackage eINSTANCE = es.gmv.views.impl.ViewsPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.gmv.views.impl.AndColumnImpl <em>And Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gmv.views.impl.AndColumnImpl
	 * @see es.gmv.views.impl.ViewsPackageImpl#getAndColumn()
	 * @generated
	 */
	int AND_COLUMN = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_COLUMN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_COLUMN__VISIBLE = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_COLUMN__WIDTH = 2;

	/**
	 * The number of structural features of the '<em>And Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_COLUMN_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>And Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.gmv.views.impl.DisplayRenderingTypeImpl <em>Display Rendering Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gmv.views.impl.DisplayRenderingTypeImpl
	 * @see es.gmv.views.impl.ViewsPackageImpl#getDisplayRenderingType()
	 * @generated
	 */
	int DISPLAY_RENDERING_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_RENDERING_TYPE__BACKGROUND = 0;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_RENDERING_TYPE__FOREGROUND = 1;

	/**
	 * The feature id for the '<em><b>Font</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_RENDERING_TYPE__FONT = 2;

	/**
	 * The number of structural features of the '<em>Display Rendering Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_RENDERING_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Display Rendering Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_RENDERING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.gmv.views.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gmv.views.impl.DocumentRootImpl
	 * @see es.gmv.views.impl.ViewsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Xmltabulardisplaydefinition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLTABULARDISPLAYDEFINITION = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.gmv.views.impl.FontTypeImpl <em>Font Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gmv.views.impl.FontTypeImpl
	 * @see es.gmv.views.impl.ViewsPackageImpl#getFontType()
	 * @generated
	 */
	int FONT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_TYPE__FAMILY = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_TYPE__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_TYPE__STYLE = 2;

	/**
	 * The number of structural features of the '<em>Font Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Font Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.gmv.views.impl.MetaInformationImpl <em>Meta Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gmv.views.impl.MetaInformationImpl
	 * @see es.gmv.views.impl.ViewsPackageImpl#getMetaInformation()
	 * @generated
	 */
	int META_INFORMATION = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__KEYWORD = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__DATE = 2;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__PARAMETER_LIST = 3;

	/**
	 * The number of structural features of the '<em>Meta Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Meta Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.gmv.views.impl.ParameterListImpl <em>Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gmv.views.impl.ParameterListImpl
	 * @see es.gmv.views.impl.ViewsPackageImpl#getParameterList()
	 * @generated
	 */
	int PARAMETER_LIST = 5;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.gmv.views.impl.RowImpl <em>Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gmv.views.impl.RowImpl
	 * @see es.gmv.views.impl.ViewsPackageImpl#getRow()
	 * @generated
	 */
	int ROW = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__NOTE = 1;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__REPRESENTATION = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__TITLE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.gmv.views.impl.XmldisplaydefinitionImpl <em>Xmldisplaydefinition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gmv.views.impl.XmldisplaydefinitionImpl
	 * @see es.gmv.views.impl.ViewsPackageImpl#getXmldisplaydefinition()
	 * @generated
	 */
	int XMLDISPLAYDEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Meta Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLDISPLAYDEFINITION__META_INFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLDISPLAYDEFINITION__IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Kind Of Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLDISPLAYDEFINITION__KIND_OF_DISPLAY = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLDISPLAYDEFINITION__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Xmldisplaydefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLDISPLAYDEFINITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Xmldisplaydefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLDISPLAYDEFINITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.gmv.views.impl.XmltabulardisplaydefinitionImpl <em>Xmltabulardisplaydefinition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gmv.views.impl.XmltabulardisplaydefinitionImpl
	 * @see es.gmv.views.impl.ViewsPackageImpl#getXmltabulardisplaydefinition()
	 * @generated
	 */
	int XMLTABULARDISPLAYDEFINITION = 8;

	/**
	 * The feature id for the '<em><b>Meta Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLTABULARDISPLAYDEFINITION__META_INFORMATION = XMLDISPLAYDEFINITION__META_INFORMATION;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLTABULARDISPLAYDEFINITION__IDENTIFIER = XMLDISPLAYDEFINITION__IDENTIFIER;

	/**
	 * The feature id for the '<em><b>Kind Of Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLTABULARDISPLAYDEFINITION__KIND_OF_DISPLAY = XMLDISPLAYDEFINITION__KIND_OF_DISPLAY;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLTABULARDISPLAYDEFINITION__VERSION = XMLDISPLAYDEFINITION__VERSION;

	/**
	 * The feature id for the '<em><b>Scrollable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLTABULARDISPLAYDEFINITION__SCROLLABLE = XMLDISPLAYDEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Column</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLTABULARDISPLAYDEFINITION__COLUMN = XMLDISPLAYDEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLTABULARDISPLAYDEFINITION__ROW = XMLDISPLAYDEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Xmltabulardisplaydefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLTABULARDISPLAYDEFINITION_FEATURE_COUNT = XMLDISPLAYDEFINITION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Xmltabulardisplaydefinition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMLTABULARDISPLAYDEFINITION_OPERATION_COUNT = XMLDISPLAYDEFINITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.gmv.views.impl.MnemonicRowImpl <em>Mnemonic Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gmv.views.impl.MnemonicRowImpl
	 * @see es.gmv.views.impl.ViewsPackageImpl#getMnemonicRow()
	 * @generated
	 */
	int MNEMONIC_ROW = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNEMONIC_ROW__NAME = ROW__NAME;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNEMONIC_ROW__NOTE = ROW__NOTE;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNEMONIC_ROW__REPRESENTATION = ROW__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNEMONIC_ROW__TITLE = ROW__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNEMONIC_ROW__TYPE = ROW__TYPE;

	/**
	 * The number of structural features of the '<em>Mnemonic Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNEMONIC_ROW_FEATURE_COUNT = ROW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mnemonic Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MNEMONIC_ROW_OPERATION_COUNT = ROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.gmv.views.impl.TmRowImpl <em>Tm Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gmv.views.impl.TmRowImpl
	 * @see es.gmv.views.impl.ViewsPackageImpl#getTmRow()
	 * @generated
	 */
	int TM_ROW = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_ROW__NAME = ROW__NAME;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_ROW__NOTE = ROW__NOTE;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_ROW__REPRESENTATION = ROW__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_ROW__TITLE = ROW__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_ROW__TYPE = ROW__TYPE;

	/**
	 * The number of structural features of the '<em>Tm Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_ROW_FEATURE_COUNT = ROW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tm Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_ROW_OPERATION_COUNT = ROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.gmv.views.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gmv.views.impl.CommentImpl
	 * @see es.gmv.views.impl.ViewsPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NAME = ROW__NAME;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__NOTE = ROW__NOTE;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__REPRESENTATION = ROW__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TITLE = ROW__TITLE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__TYPE = ROW__TYPE;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = ROW_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = ROW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.gmv.views.impl.TmDisplayPageImpl <em>Tm Display Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gmv.views.impl.TmDisplayPageImpl
	 * @see es.gmv.views.impl.ViewsPackageImpl#getTmDisplayPage()
	 * @generated
	 */
	int TM_DISPLAY_PAGE = 12;

	/**
	 * The number of structural features of the '<em>Tm Display Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_DISPLAY_PAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tm Display Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_DISPLAY_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link es.gmv.views.FontStyle <em>Font Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gmv.views.FontStyle
	 * @see es.gmv.views.impl.ViewsPackageImpl#getFontStyle()
	 * @generated
	 */
	int FONT_STYLE = 13;

	/**
	 * The meta object id for the '<em>Color Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see es.gmv.views.impl.ViewsPackageImpl#getColorType()
	 * @generated
	 */
	int COLOR_TYPE = 14;

	/**
	 * The meta object id for the '<em>Family Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see es.gmv.views.impl.ViewsPackageImpl#getFamilyType()
	 * @generated
	 */
	int FAMILY_TYPE = 15;

	/**
	 * The meta object id for the '<em>Font Style Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.gmv.views.FontStyle
	 * @see es.gmv.views.impl.ViewsPackageImpl#getFontStyleObject()
	 * @generated
	 */
	int FONT_STYLE_OBJECT = 16;


	/**
	 * Returns the meta object for class '{@link es.gmv.views.AndColumn <em>And Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Column</em>'.
	 * @see es.gmv.views.AndColumn
	 * @generated
	 */
	EClass getAndColumn();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.AndColumn#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.gmv.views.AndColumn#getName()
	 * @see #getAndColumn()
	 * @generated
	 */
	EAttribute getAndColumn_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.AndColumn#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see es.gmv.views.AndColumn#getVisible()
	 * @see #getAndColumn()
	 * @generated
	 */
	EAttribute getAndColumn_Visible();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.AndColumn#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see es.gmv.views.AndColumn#getWidth()
	 * @see #getAndColumn()
	 * @generated
	 */
	EAttribute getAndColumn_Width();

	/**
	 * Returns the meta object for class '{@link es.gmv.views.DisplayRenderingType <em>Display Rendering Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Rendering Type</em>'.
	 * @see es.gmv.views.DisplayRenderingType
	 * @generated
	 */
	EClass getDisplayRenderingType();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.DisplayRenderingType#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see es.gmv.views.DisplayRenderingType#getBackground()
	 * @see #getDisplayRenderingType()
	 * @generated
	 */
	EAttribute getDisplayRenderingType_Background();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.DisplayRenderingType#getForeground <em>Foreground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground</em>'.
	 * @see es.gmv.views.DisplayRenderingType#getForeground()
	 * @see #getDisplayRenderingType()
	 * @generated
	 */
	EAttribute getDisplayRenderingType_Foreground();

	/**
	 * Returns the meta object for the containment reference '{@link es.gmv.views.DisplayRenderingType#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Font</em>'.
	 * @see es.gmv.views.DisplayRenderingType#getFont()
	 * @see #getDisplayRenderingType()
	 * @generated
	 */
	EReference getDisplayRenderingType_Font();

	/**
	 * Returns the meta object for class '{@link es.gmv.views.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see es.gmv.views.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link es.gmv.views.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see es.gmv.views.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link es.gmv.views.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see es.gmv.views.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link es.gmv.views.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see es.gmv.views.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link es.gmv.views.DocumentRoot#getXmltabulardisplaydefinition <em>Xmltabulardisplaydefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xmltabulardisplaydefinition</em>'.
	 * @see es.gmv.views.DocumentRoot#getXmltabulardisplaydefinition()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Xmltabulardisplaydefinition();

	/**
	 * Returns the meta object for class '{@link es.gmv.views.FontType <em>Font Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Type</em>'.
	 * @see es.gmv.views.FontType
	 * @generated
	 */
	EClass getFontType();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.FontType#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see es.gmv.views.FontType#getFamily()
	 * @see #getFontType()
	 * @generated
	 */
	EAttribute getFontType_Family();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.FontType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see es.gmv.views.FontType#getHeight()
	 * @see #getFontType()
	 * @generated
	 */
	EAttribute getFontType_Height();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.FontType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see es.gmv.views.FontType#getStyle()
	 * @see #getFontType()
	 * @generated
	 */
	EAttribute getFontType_Style();

	/**
	 * Returns the meta object for class '{@link es.gmv.views.MetaInformation <em>Meta Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Information</em>'.
	 * @see es.gmv.views.MetaInformation
	 * @generated
	 */
	EClass getMetaInformation();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.MetaInformation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.gmv.views.MetaInformation#getDescription()
	 * @see #getMetaInformation()
	 * @generated
	 */
	EAttribute getMetaInformation_Description();

	/**
	 * Returns the meta object for the attribute list '{@link es.gmv.views.MetaInformation#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keyword</em>'.
	 * @see es.gmv.views.MetaInformation#getKeyword()
	 * @see #getMetaInformation()
	 * @generated
	 */
	EAttribute getMetaInformation_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.MetaInformation#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see es.gmv.views.MetaInformation#getDate()
	 * @see #getMetaInformation()
	 * @generated
	 */
	EAttribute getMetaInformation_Date();

	/**
	 * Returns the meta object for the containment reference '{@link es.gmv.views.MetaInformation#getParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter List</em>'.
	 * @see es.gmv.views.MetaInformation#getParameterList()
	 * @see #getMetaInformation()
	 * @generated
	 */
	EReference getMetaInformation_ParameterList();

	/**
	 * Returns the meta object for class '{@link es.gmv.views.ParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter List</em>'.
	 * @see es.gmv.views.ParameterList
	 * @generated
	 */
	EClass getParameterList();

	/**
	 * Returns the meta object for the attribute list '{@link es.gmv.views.ParameterList#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter</em>'.
	 * @see es.gmv.views.ParameterList#getParameter()
	 * @see #getParameterList()
	 * @generated
	 */
	EAttribute getParameterList_Parameter();

	/**
	 * Returns the meta object for class '{@link es.gmv.views.Row <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row</em>'.
	 * @see es.gmv.views.Row
	 * @generated
	 */
	EClass getRow();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.Row#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see es.gmv.views.Row#getName()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Name();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.Row#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Note</em>'.
	 * @see es.gmv.views.Row#getNote()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Note();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.Row#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Representation</em>'.
	 * @see es.gmv.views.Row#getRepresentation()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Representation();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.Row#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see es.gmv.views.Row#getTitle()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Title();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.Row#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.gmv.views.Row#getType()
	 * @see #getRow()
	 * @generated
	 */
	EAttribute getRow_Type();

	/**
	 * Returns the meta object for class '{@link es.gmv.views.Xmldisplaydefinition <em>Xmldisplaydefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xmldisplaydefinition</em>'.
	 * @see es.gmv.views.Xmldisplaydefinition
	 * @generated
	 */
	EClass getXmldisplaydefinition();

	/**
	 * Returns the meta object for the containment reference '{@link es.gmv.views.Xmldisplaydefinition#getMetaInformation <em>Meta Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Information</em>'.
	 * @see es.gmv.views.Xmldisplaydefinition#getMetaInformation()
	 * @see #getXmldisplaydefinition()
	 * @generated
	 */
	EReference getXmldisplaydefinition_MetaInformation();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.Xmldisplaydefinition#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see es.gmv.views.Xmldisplaydefinition#getIdentifier()
	 * @see #getXmldisplaydefinition()
	 * @generated
	 */
	EAttribute getXmldisplaydefinition_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.Xmldisplaydefinition#getKindOfDisplay <em>Kind Of Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Of Display</em>'.
	 * @see es.gmv.views.Xmldisplaydefinition#getKindOfDisplay()
	 * @see #getXmldisplaydefinition()
	 * @generated
	 */
	EAttribute getXmldisplaydefinition_KindOfDisplay();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.Xmldisplaydefinition#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see es.gmv.views.Xmldisplaydefinition#getVersion()
	 * @see #getXmldisplaydefinition()
	 * @generated
	 */
	EAttribute getXmldisplaydefinition_Version();

	/**
	 * Returns the meta object for class '{@link es.gmv.views.Xmltabulardisplaydefinition <em>Xmltabulardisplaydefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xmltabulardisplaydefinition</em>'.
	 * @see es.gmv.views.Xmltabulardisplaydefinition
	 * @generated
	 */
	EClass getXmltabulardisplaydefinition();

	/**
	 * Returns the meta object for the attribute '{@link es.gmv.views.Xmltabulardisplaydefinition#isScrollable <em>Scrollable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scrollable</em>'.
	 * @see es.gmv.views.Xmltabulardisplaydefinition#isScrollable()
	 * @see #getXmltabulardisplaydefinition()
	 * @generated
	 */
	EAttribute getXmltabulardisplaydefinition_Scrollable();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gmv.views.Xmltabulardisplaydefinition#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Column</em>'.
	 * @see es.gmv.views.Xmltabulardisplaydefinition#getColumn()
	 * @see #getXmltabulardisplaydefinition()
	 * @generated
	 */
	EReference getXmltabulardisplaydefinition_Column();

	/**
	 * Returns the meta object for the containment reference list '{@link es.gmv.views.Xmltabulardisplaydefinition#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row</em>'.
	 * @see es.gmv.views.Xmltabulardisplaydefinition#getRow()
	 * @see #getXmltabulardisplaydefinition()
	 * @generated
	 */
	EReference getXmltabulardisplaydefinition_Row();

	/**
	 * Returns the meta object for class '{@link es.gmv.views.MnemonicRow <em>Mnemonic Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mnemonic Row</em>'.
	 * @see es.gmv.views.MnemonicRow
	 * @generated
	 */
	EClass getMnemonicRow();

	/**
	 * Returns the meta object for class '{@link es.gmv.views.TmRow <em>Tm Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tm Row</em>'.
	 * @see es.gmv.views.TmRow
	 * @generated
	 */
	EClass getTmRow();

	/**
	 * Returns the meta object for class '{@link es.gmv.views.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see es.gmv.views.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for class '{@link es.gmv.views.TmDisplayPage <em>Tm Display Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tm Display Page</em>'.
	 * @see es.gmv.views.TmDisplayPage
	 * @generated
	 */
	EClass getTmDisplayPage();

	/**
	 * Returns the meta object for enum '{@link es.gmv.views.FontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Style</em>'.
	 * @see es.gmv.views.FontStyle
	 * @generated
	 */
	EEnum getFontStyle();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Color Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Color Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ColorType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getColorType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Family Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Family Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='family_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='\\w+'"
	 * @generated
	 */
	EDataType getFamilyType();

	/**
	 * Returns the meta object for data type '{@link es.gmv.views.FontStyle <em>Font Style Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Font Style Object</em>'.
	 * @see es.gmv.views.FontStyle
	 * @model instanceClass="es.gmv.views.FontStyle"
	 *        extendedMetaData="name='FontStyle:Object' baseType='FontStyle'"
	 * @generated
	 */
	EDataType getFontStyleObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ViewsFactory getViewsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.gmv.views.impl.AndColumnImpl <em>And Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gmv.views.impl.AndColumnImpl
		 * @see es.gmv.views.impl.ViewsPackageImpl#getAndColumn()
		 * @generated
		 */
		EClass AND_COLUMN = eINSTANCE.getAndColumn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AND_COLUMN__NAME = eINSTANCE.getAndColumn_Name();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AND_COLUMN__VISIBLE = eINSTANCE.getAndColumn_Visible();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AND_COLUMN__WIDTH = eINSTANCE.getAndColumn_Width();

		/**
		 * The meta object literal for the '{@link es.gmv.views.impl.DisplayRenderingTypeImpl <em>Display Rendering Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gmv.views.impl.DisplayRenderingTypeImpl
		 * @see es.gmv.views.impl.ViewsPackageImpl#getDisplayRenderingType()
		 * @generated
		 */
		EClass DISPLAY_RENDERING_TYPE = eINSTANCE.getDisplayRenderingType();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_RENDERING_TYPE__BACKGROUND = eINSTANCE.getDisplayRenderingType_Background();

		/**
		 * The meta object literal for the '<em><b>Foreground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISPLAY_RENDERING_TYPE__FOREGROUND = eINSTANCE.getDisplayRenderingType_Foreground();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISPLAY_RENDERING_TYPE__FONT = eINSTANCE.getDisplayRenderingType_Font();

		/**
		 * The meta object literal for the '{@link es.gmv.views.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gmv.views.impl.DocumentRootImpl
		 * @see es.gmv.views.impl.ViewsPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Xmltabulardisplaydefinition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLTABULARDISPLAYDEFINITION = eINSTANCE.getDocumentRoot_Xmltabulardisplaydefinition();

		/**
		 * The meta object literal for the '{@link es.gmv.views.impl.FontTypeImpl <em>Font Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gmv.views.impl.FontTypeImpl
		 * @see es.gmv.views.impl.ViewsPackageImpl#getFontType()
		 * @generated
		 */
		EClass FONT_TYPE = eINSTANCE.getFontType();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_TYPE__FAMILY = eINSTANCE.getFontType_Family();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_TYPE__HEIGHT = eINSTANCE.getFontType_Height();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_TYPE__STYLE = eINSTANCE.getFontType_Style();

		/**
		 * The meta object literal for the '{@link es.gmv.views.impl.MetaInformationImpl <em>Meta Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gmv.views.impl.MetaInformationImpl
		 * @see es.gmv.views.impl.ViewsPackageImpl#getMetaInformation()
		 * @generated
		 */
		EClass META_INFORMATION = eINSTANCE.getMetaInformation();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_INFORMATION__DESCRIPTION = eINSTANCE.getMetaInformation_Description();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_INFORMATION__KEYWORD = eINSTANCE.getMetaInformation_Keyword();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_INFORMATION__DATE = eINSTANCE.getMetaInformation_Date();

		/**
		 * The meta object literal for the '<em><b>Parameter List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_INFORMATION__PARAMETER_LIST = eINSTANCE.getMetaInformation_ParameterList();

		/**
		 * The meta object literal for the '{@link es.gmv.views.impl.ParameterListImpl <em>Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gmv.views.impl.ParameterListImpl
		 * @see es.gmv.views.impl.ViewsPackageImpl#getParameterList()
		 * @generated
		 */
		EClass PARAMETER_LIST = eINSTANCE.getParameterList();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_LIST__PARAMETER = eINSTANCE.getParameterList_Parameter();

		/**
		 * The meta object literal for the '{@link es.gmv.views.impl.RowImpl <em>Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gmv.views.impl.RowImpl
		 * @see es.gmv.views.impl.ViewsPackageImpl#getRow()
		 * @generated
		 */
		EClass ROW = eINSTANCE.getRow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__NAME = eINSTANCE.getRow_Name();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__NOTE = eINSTANCE.getRow_Note();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__REPRESENTATION = eINSTANCE.getRow_Representation();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__TITLE = eINSTANCE.getRow_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROW__TYPE = eINSTANCE.getRow_Type();

		/**
		 * The meta object literal for the '{@link es.gmv.views.impl.XmldisplaydefinitionImpl <em>Xmldisplaydefinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gmv.views.impl.XmldisplaydefinitionImpl
		 * @see es.gmv.views.impl.ViewsPackageImpl#getXmldisplaydefinition()
		 * @generated
		 */
		EClass XMLDISPLAYDEFINITION = eINSTANCE.getXmldisplaydefinition();

		/**
		 * The meta object literal for the '<em><b>Meta Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMLDISPLAYDEFINITION__META_INFORMATION = eINSTANCE.getXmldisplaydefinition_MetaInformation();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMLDISPLAYDEFINITION__IDENTIFIER = eINSTANCE.getXmldisplaydefinition_Identifier();

		/**
		 * The meta object literal for the '<em><b>Kind Of Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMLDISPLAYDEFINITION__KIND_OF_DISPLAY = eINSTANCE.getXmldisplaydefinition_KindOfDisplay();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMLDISPLAYDEFINITION__VERSION = eINSTANCE.getXmldisplaydefinition_Version();

		/**
		 * The meta object literal for the '{@link es.gmv.views.impl.XmltabulardisplaydefinitionImpl <em>Xmltabulardisplaydefinition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gmv.views.impl.XmltabulardisplaydefinitionImpl
		 * @see es.gmv.views.impl.ViewsPackageImpl#getXmltabulardisplaydefinition()
		 * @generated
		 */
		EClass XMLTABULARDISPLAYDEFINITION = eINSTANCE.getXmltabulardisplaydefinition();

		/**
		 * The meta object literal for the '<em><b>Scrollable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMLTABULARDISPLAYDEFINITION__SCROLLABLE = eINSTANCE.getXmltabulardisplaydefinition_Scrollable();

		/**
		 * The meta object literal for the '<em><b>Column</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMLTABULARDISPLAYDEFINITION__COLUMN = eINSTANCE.getXmltabulardisplaydefinition_Column();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMLTABULARDISPLAYDEFINITION__ROW = eINSTANCE.getXmltabulardisplaydefinition_Row();

		/**
		 * The meta object literal for the '{@link es.gmv.views.impl.MnemonicRowImpl <em>Mnemonic Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gmv.views.impl.MnemonicRowImpl
		 * @see es.gmv.views.impl.ViewsPackageImpl#getMnemonicRow()
		 * @generated
		 */
		EClass MNEMONIC_ROW = eINSTANCE.getMnemonicRow();

		/**
		 * The meta object literal for the '{@link es.gmv.views.impl.TmRowImpl <em>Tm Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gmv.views.impl.TmRowImpl
		 * @see es.gmv.views.impl.ViewsPackageImpl#getTmRow()
		 * @generated
		 */
		EClass TM_ROW = eINSTANCE.getTmRow();

		/**
		 * The meta object literal for the '{@link es.gmv.views.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gmv.views.impl.CommentImpl
		 * @see es.gmv.views.impl.ViewsPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '{@link es.gmv.views.impl.TmDisplayPageImpl <em>Tm Display Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gmv.views.impl.TmDisplayPageImpl
		 * @see es.gmv.views.impl.ViewsPackageImpl#getTmDisplayPage()
		 * @generated
		 */
		EClass TM_DISPLAY_PAGE = eINSTANCE.getTmDisplayPage();

		/**
		 * The meta object literal for the '{@link es.gmv.views.FontStyle <em>Font Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gmv.views.FontStyle
		 * @see es.gmv.views.impl.ViewsPackageImpl#getFontStyle()
		 * @generated
		 */
		EEnum FONT_STYLE = eINSTANCE.getFontStyle();

		/**
		 * The meta object literal for the '<em>Color Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see es.gmv.views.impl.ViewsPackageImpl#getColorType()
		 * @generated
		 */
		EDataType COLOR_TYPE = eINSTANCE.getColorType();

		/**
		 * The meta object literal for the '<em>Family Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see es.gmv.views.impl.ViewsPackageImpl#getFamilyType()
		 * @generated
		 */
		EDataType FAMILY_TYPE = eINSTANCE.getFamilyType();

		/**
		 * The meta object literal for the '<em>Font Style Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.gmv.views.FontStyle
		 * @see es.gmv.views.impl.ViewsPackageImpl#getFontStyleObject()
		 * @generated
		 */
		EDataType FONT_STYLE_OBJECT = eINSTANCE.getFontStyleObject();

	}

} //ViewsPackage
