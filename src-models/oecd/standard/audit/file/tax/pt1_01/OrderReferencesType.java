/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order References Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.OrderReferencesType#getOriginatingON <em>Originating ON</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.OrderReferencesType#getOrderDate <em>Order Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getOrderReferencesType()
 * @model extendedMetaData="name='OrderReferences_._type' kind='elementOnly'"
 * @generated
 */
public interface OrderReferencesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Originating ON</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originating ON</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originating ON</em>' attribute.
	 * @see #setOriginatingON(String)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getOrderReferencesType_OriginatingON()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFPTtextTypeMandatoryMax30Car"
	 *        extendedMetaData="kind='element' name='OriginatingON' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOriginatingON();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.OrderReferencesType#getOriginatingON <em>Originating ON</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originating ON</em>' attribute.
	 * @see #getOriginatingON()
	 * @generated
	 */
	void setOriginatingON(String value);

	/**
	 * Returns the value of the '<em><b>Order Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Date</em>' attribute.
	 * @see #setOrderDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.pt1_01.Pt1_01Package#getOrderReferencesType_OrderDate()
	 * @model dataType="oecd.standard.audit.file.tax.pt1_01.SAFdateType"
	 *        extendedMetaData="kind='element' name='OrderDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getOrderDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.pt1_01.OrderReferencesType#getOrderDate <em>Order Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Date</em>' attribute.
	 * @see #getOrderDate()
	 * @generated
	 */
	void setOrderDate(XMLGregorianCalendar value);

} // OrderReferencesType
