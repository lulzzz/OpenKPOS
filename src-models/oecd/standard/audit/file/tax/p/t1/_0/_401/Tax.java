/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.Tax#getTaxType <em>Tax Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.Tax#getTaxCountryRegion <em>Tax Country Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.Tax#getTaxCode <em>Tax Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.Tax#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.Tax#getTaxAmount <em>Tax Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getTax()
 * @model extendedMetaData="name='Tax' kind='elementOnly'"
 * @generated
 */
public interface Tax extends EObject {
	/**
	 * Returns the value of the '<em><b>Tax Type</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._401.TaxTypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TaxTypeType
	 * @see #isSetTaxType()
	 * @see #unsetTaxType()
	 * @see #setTaxType(TaxTypeType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getTax_TaxType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='TaxType' namespace='##targetNamespace'"
	 * @generated
	 */
	TaxTypeType getTaxType();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.Tax#getTaxType <em>Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Type</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._401.TaxTypeType
	 * @see #isSetTaxType()
	 * @see #unsetTaxType()
	 * @see #getTaxType()
	 * @generated
	 */
	void setTaxType(TaxTypeType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.Tax#getTaxType <em>Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTaxType()
	 * @see #getTaxType()
	 * @see #setTaxType(TaxTypeType)
	 * @generated
	 */
	void unsetTaxType();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.Tax#getTaxType <em>Tax Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tax Type</em>' attribute is set.
	 * @see #unsetTaxType()
	 * @see #getTaxType()
	 * @see #setTaxType(TaxTypeType)
	 * @generated
	 */
	boolean isSetTaxType();

	/**
	 * Returns the value of the '<em><b>Tax Country Region</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Country Region</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Country Region</em>' attribute.
	 * @see #setTaxCountryRegion(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getTax_TaxCountryRegion()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.TaxCountryRegionType" required="true"
	 *        extendedMetaData="kind='element' name='TaxCountryRegion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxCountryRegion();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.Tax#getTaxCountryRegion <em>Tax Country Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Country Region</em>' attribute.
	 * @see #getTaxCountryRegion()
	 * @generated
	 */
	void setTaxCountryRegion(String value);

	/**
	 * Returns the value of the '<em><b>Tax Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Code</em>' attribute.
	 * @see #setTaxCode(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getTax_TaxCode()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.TaxCodeType" required="true"
	 *        extendedMetaData="kind='element' name='TaxCode' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTaxCode();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.Tax#getTaxCode <em>Tax Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Code</em>' attribute.
	 * @see #getTaxCode()
	 * @generated
	 */
	void setTaxCode(String value);

	/**
	 * Returns the value of the '<em><b>Tax Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Percentage</em>' attribute.
	 * @see #setTaxPercentage(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getTax_TaxPercentage()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFdecimalType"
	 *        extendedMetaData="kind='element' name='TaxPercentage' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTaxPercentage();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.Tax#getTaxPercentage <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Percentage</em>' attribute.
	 * @see #getTaxPercentage()
	 * @generated
	 */
	void setTaxPercentage(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Tax Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Amount</em>' attribute.
	 * @see #setTaxAmount(BigDecimal)
	 * @see oecd.standard.audit.file.tax.p.t1._0._401._401Package#getTax_TaxAmount()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._401.SAFmonetaryType"
	 *        extendedMetaData="kind='element' name='TaxAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getTaxAmount();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._401.Tax#getTaxAmount <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tax Amount</em>' attribute.
	 * @see #getTaxAmount()
	 * @generated
	 */
	void setTaxAmount(BigDecimal value);

} // Tax
