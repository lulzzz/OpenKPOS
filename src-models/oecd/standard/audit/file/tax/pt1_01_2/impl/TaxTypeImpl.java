/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01_2.impl;

import java.math.BigDecimal;

import oecd.standard.audit.file.tax.pt1_01_2.Pt1_01_2Package;
import oecd.standard.audit.file.tax.pt1_01_2.TaxType;
import oecd.standard.audit.file.tax.pt1_01_2.TaxTypeType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tax Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTypeImpl#getTaxType <em>Tax Type</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTypeImpl#getTaxCountryRegion <em>Tax Country Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTypeImpl#getTaxCode <em>Tax Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTypeImpl#getTaxPercentage <em>Tax Percentage</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01_2.impl.TaxTypeImpl#getTaxAmount <em>Tax Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaxTypeImpl extends EObjectImpl implements TaxType {
	/**
	 * The default value of the '{@link #getTaxType() <em>Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxType()
	 * @generated
	 * @ordered
	 */
	protected static final TaxTypeType TAX_TYPE_EDEFAULT = TaxTypeType.IVA;

	/**
	 * The cached value of the '{@link #getTaxType() <em>Tax Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxType()
	 * @generated
	 * @ordered
	 */
	protected TaxTypeType taxType = TAX_TYPE_EDEFAULT;

	/**
	 * This is true if the Tax Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean taxTypeESet;

	/**
	 * The default value of the '{@link #getTaxCountryRegion() <em>Tax Country Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCountryRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_COUNTRY_REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxCountryRegion() <em>Tax Country Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCountryRegion()
	 * @generated
	 * @ordered
	 */
	protected String taxCountryRegion = TAX_COUNTRY_REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxCode() <em>Tax Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCode()
	 * @generated
	 * @ordered
	 */
	protected static final String TAX_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxCode() <em>Tax Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxCode()
	 * @generated
	 * @ordered
	 */
	protected String taxCode = TAX_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxPercentage() <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TAX_PERCENTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxPercentage() <em>Tax Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPercentage()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal taxPercentage = TAX_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaxAmount() <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TAX_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTaxAmount() <em>Tax Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal taxAmount = TAX_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaxTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pt1_01_2Package.Literals.TAX_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxTypeType getTaxType() {
		return taxType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxType(TaxTypeType newTaxType) {
		TaxTypeType oldTaxType = taxType;
		taxType = newTaxType == null ? TAX_TYPE_EDEFAULT : newTaxType;
		boolean oldTaxTypeESet = taxTypeESet;
		taxTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.TAX_TYPE__TAX_TYPE, oldTaxType, taxType, !oldTaxTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTaxType() {
		TaxTypeType oldTaxType = taxType;
		boolean oldTaxTypeESet = taxTypeESet;
		taxType = TAX_TYPE_EDEFAULT;
		taxTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Pt1_01_2Package.TAX_TYPE__TAX_TYPE, oldTaxType, TAX_TYPE_EDEFAULT, oldTaxTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTaxType() {
		return taxTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxCountryRegion() {
		return taxCountryRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxCountryRegion(String newTaxCountryRegion) {
		String oldTaxCountryRegion = taxCountryRegion;
		taxCountryRegion = newTaxCountryRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.TAX_TYPE__TAX_COUNTRY_REGION, oldTaxCountryRegion, taxCountryRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTaxCode() {
		return taxCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxCode(String newTaxCode) {
		String oldTaxCode = taxCode;
		taxCode = newTaxCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.TAX_TYPE__TAX_CODE, oldTaxCode, taxCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTaxPercentage() {
		return taxPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxPercentage(BigDecimal newTaxPercentage) {
		BigDecimal oldTaxPercentage = taxPercentage;
		taxPercentage = newTaxPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.TAX_TYPE__TAX_PERCENTAGE, oldTaxPercentage, taxPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getTaxAmount() {
		return taxAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxAmount(BigDecimal newTaxAmount) {
		BigDecimal oldTaxAmount = taxAmount;
		taxAmount = newTaxAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01_2Package.TAX_TYPE__TAX_AMOUNT, oldTaxAmount, taxAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Pt1_01_2Package.TAX_TYPE__TAX_TYPE:
				return getTaxType();
			case Pt1_01_2Package.TAX_TYPE__TAX_COUNTRY_REGION:
				return getTaxCountryRegion();
			case Pt1_01_2Package.TAX_TYPE__TAX_CODE:
				return getTaxCode();
			case Pt1_01_2Package.TAX_TYPE__TAX_PERCENTAGE:
				return getTaxPercentage();
			case Pt1_01_2Package.TAX_TYPE__TAX_AMOUNT:
				return getTaxAmount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Pt1_01_2Package.TAX_TYPE__TAX_TYPE:
				setTaxType((TaxTypeType)newValue);
				return;
			case Pt1_01_2Package.TAX_TYPE__TAX_COUNTRY_REGION:
				setTaxCountryRegion((String)newValue);
				return;
			case Pt1_01_2Package.TAX_TYPE__TAX_CODE:
				setTaxCode((String)newValue);
				return;
			case Pt1_01_2Package.TAX_TYPE__TAX_PERCENTAGE:
				setTaxPercentage((BigDecimal)newValue);
				return;
			case Pt1_01_2Package.TAX_TYPE__TAX_AMOUNT:
				setTaxAmount((BigDecimal)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Pt1_01_2Package.TAX_TYPE__TAX_TYPE:
				unsetTaxType();
				return;
			case Pt1_01_2Package.TAX_TYPE__TAX_COUNTRY_REGION:
				setTaxCountryRegion(TAX_COUNTRY_REGION_EDEFAULT);
				return;
			case Pt1_01_2Package.TAX_TYPE__TAX_CODE:
				setTaxCode(TAX_CODE_EDEFAULT);
				return;
			case Pt1_01_2Package.TAX_TYPE__TAX_PERCENTAGE:
				setTaxPercentage(TAX_PERCENTAGE_EDEFAULT);
				return;
			case Pt1_01_2Package.TAX_TYPE__TAX_AMOUNT:
				setTaxAmount(TAX_AMOUNT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Pt1_01_2Package.TAX_TYPE__TAX_TYPE:
				return isSetTaxType();
			case Pt1_01_2Package.TAX_TYPE__TAX_COUNTRY_REGION:
				return TAX_COUNTRY_REGION_EDEFAULT == null ? taxCountryRegion != null : !TAX_COUNTRY_REGION_EDEFAULT.equals(taxCountryRegion);
			case Pt1_01_2Package.TAX_TYPE__TAX_CODE:
				return TAX_CODE_EDEFAULT == null ? taxCode != null : !TAX_CODE_EDEFAULT.equals(taxCode);
			case Pt1_01_2Package.TAX_TYPE__TAX_PERCENTAGE:
				return TAX_PERCENTAGE_EDEFAULT == null ? taxPercentage != null : !TAX_PERCENTAGE_EDEFAULT.equals(taxPercentage);
			case Pt1_01_2Package.TAX_TYPE__TAX_AMOUNT:
				return TAX_AMOUNT_EDEFAULT == null ? taxAmount != null : !TAX_AMOUNT_EDEFAULT.equals(taxAmount);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (taxType: ");
		if (taxTypeESet) result.append(taxType); else result.append("<unset>");
		result.append(", taxCountryRegion: ");
		result.append(taxCountryRegion);
		result.append(", taxCode: ");
		result.append(taxCode);
		result.append(", taxPercentage: ");
		result.append(taxPercentage);
		result.append(", taxAmount: ");
		result.append(taxAmount);
		result.append(')');
		return result.toString();
	}

} //TaxTypeImpl
