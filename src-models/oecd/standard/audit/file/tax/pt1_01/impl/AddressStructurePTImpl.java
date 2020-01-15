/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.pt1_01.impl;

import oecd.standard.audit.file.tax.pt1_01.AddressStructurePT;
import oecd.standard.audit.file.tax.pt1_01.Pt1_01Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Structure PT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.AddressStructurePTImpl#getBuildingNumber <em>Building Number</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.AddressStructurePTImpl#getStreetName <em>Street Name</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.AddressStructurePTImpl#getAddressDetail <em>Address Detail</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.AddressStructurePTImpl#getCity <em>City</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.AddressStructurePTImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.AddressStructurePTImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.pt1_01.impl.AddressStructurePTImpl#getCountry <em>Country</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressStructurePTImpl extends EObjectImpl implements AddressStructurePT {
	/**
	 * The default value of the '{@link #getBuildingNumber() <em>Building Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILDING_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildingNumber() <em>Building Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingNumber()
	 * @generated
	 * @ordered
	 */
	protected String buildingNumber = BUILDING_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreetName() <em>Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetName()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreetName() <em>Street Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreetName()
	 * @generated
	 * @ordered
	 */
	protected String streetName = STREET_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddressDetail() <em>Address Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressDetail()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_DETAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddressDetail() <em>Address Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressDetail()
	 * @generated
	 * @ordered
	 */
	protected String addressDetail = ADDRESS_DETAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String POSTAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected String postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegion() <em>Region</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegion()
	 * @generated
	 * @ordered
	 */
	protected String region = REGION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressStructurePTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Pt1_01Package.Literals.ADDRESS_STRUCTURE_PT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuildingNumber() {
		return buildingNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingNumber(String newBuildingNumber) {
		String oldBuildingNumber = buildingNumber;
		buildingNumber = newBuildingNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.ADDRESS_STRUCTURE_PT__BUILDING_NUMBER, oldBuildingNumber, buildingNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStreetName(String newStreetName) {
		String oldStreetName = streetName;
		streetName = newStreetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.ADDRESS_STRUCTURE_PT__STREET_NAME, oldStreetName, streetName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddressDetail() {
		return addressDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressDetail(String newAddressDetail) {
		String oldAddressDetail = addressDetail;
		addressDetail = newAddressDetail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.ADDRESS_STRUCTURE_PT__ADDRESS_DETAIL, oldAddressDetail, addressDetail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.ADDRESS_STRUCTURE_PT__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(String newPostalCode) {
		String oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.ADDRESS_STRUCTURE_PT__POSTAL_CODE, oldPostalCode, postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegion() {
		return region;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegion(String newRegion) {
		String oldRegion = region;
		region = newRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.ADDRESS_STRUCTURE_PT__REGION, oldRegion, region));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Pt1_01Package.ADDRESS_STRUCTURE_PT__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__BUILDING_NUMBER:
				return getBuildingNumber();
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__STREET_NAME:
				return getStreetName();
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__ADDRESS_DETAIL:
				return getAddressDetail();
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__CITY:
				return getCity();
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__POSTAL_CODE:
				return getPostalCode();
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__REGION:
				return getRegion();
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__COUNTRY:
				return getCountry();
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
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__BUILDING_NUMBER:
				setBuildingNumber((String)newValue);
				return;
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__STREET_NAME:
				setStreetName((String)newValue);
				return;
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__ADDRESS_DETAIL:
				setAddressDetail((String)newValue);
				return;
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__CITY:
				setCity((String)newValue);
				return;
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__POSTAL_CODE:
				setPostalCode((String)newValue);
				return;
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__REGION:
				setRegion((String)newValue);
				return;
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__COUNTRY:
				setCountry((String)newValue);
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
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__BUILDING_NUMBER:
				setBuildingNumber(BUILDING_NUMBER_EDEFAULT);
				return;
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__STREET_NAME:
				setStreetName(STREET_NAME_EDEFAULT);
				return;
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__ADDRESS_DETAIL:
				setAddressDetail(ADDRESS_DETAIL_EDEFAULT);
				return;
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__POSTAL_CODE:
				setPostalCode(POSTAL_CODE_EDEFAULT);
				return;
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__REGION:
				setRegion(REGION_EDEFAULT);
				return;
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
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
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__BUILDING_NUMBER:
				return BUILDING_NUMBER_EDEFAULT == null ? buildingNumber != null : !BUILDING_NUMBER_EDEFAULT.equals(buildingNumber);
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__STREET_NAME:
				return STREET_NAME_EDEFAULT == null ? streetName != null : !STREET_NAME_EDEFAULT.equals(streetName);
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__ADDRESS_DETAIL:
				return ADDRESS_DETAIL_EDEFAULT == null ? addressDetail != null : !ADDRESS_DETAIL_EDEFAULT.equals(addressDetail);
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__POSTAL_CODE:
				return POSTAL_CODE_EDEFAULT == null ? postalCode != null : !POSTAL_CODE_EDEFAULT.equals(postalCode);
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__REGION:
				return REGION_EDEFAULT == null ? region != null : !REGION_EDEFAULT.equals(region);
			case Pt1_01Package.ADDRESS_STRUCTURE_PT__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
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
		result.append(" (buildingNumber: ");
		result.append(buildingNumber);
		result.append(", streetName: ");
		result.append(streetName);
		result.append(", addressDetail: ");
		result.append(addressDetail);
		result.append(", city: ");
		result.append(city);
		result.append(", postalCode: ");
		result.append(postalCode);
		result.append(", region: ");
		result.append(region);
		result.append(", country: ");
		result.append(country);
		result.append(')');
		return result.toString();
	}

} //AddressStructurePTImpl
