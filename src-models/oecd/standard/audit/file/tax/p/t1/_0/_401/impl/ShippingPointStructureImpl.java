/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._401.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import oecd.standard.audit.file.tax.p.t1._0._401.AddressStructure;
import oecd.standard.audit.file.tax.p.t1._0._401.ShippingPointStructure;
import oecd.standard.audit.file.tax.p.t1._0._401._401Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shipping Point Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.ShippingPointStructureImpl#getDeliveryID <em>Delivery ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.ShippingPointStructureImpl#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.ShippingPointStructureImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.ShippingPointStructureImpl#getWarehouseID <em>Warehouse ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.ShippingPointStructureImpl#getLocationID <em>Location ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._401.impl.ShippingPointStructureImpl#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShippingPointStructureImpl extends EObjectImpl implements ShippingPointStructure {
	/**
	 * The cached value of the '{@link #getDeliveryID() <em>Delivery ID</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryID()
	 * @generated
	 * @ordered
	 */
	protected EList<String> deliveryID;

	/**
	 * The default value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DELIVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar deliveryDate = DELIVERY_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressStructure address;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShippingPointStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _401Package.eINSTANCE.getShippingPointStructure();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDeliveryID() {
		if (deliveryID == null) {
			deliveryID = new EDataTypeEList<String>(String.class, this, _401Package.SHIPPING_POINT_STRUCTURE__DELIVERY_ID);
		}
		return deliveryID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDate(XMLGregorianCalendar newDeliveryDate) {
		XMLGregorianCalendar oldDeliveryDate = deliveryDate;
		deliveryDate = newDeliveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.SHIPPING_POINT_STRUCTURE__DELIVERY_DATE, oldDeliveryDate, deliveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, _401Package.SHIPPING_POINT_STRUCTURE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getWarehouseID() {
		return getGroup().list(_401Package.eINSTANCE.getShippingPointStructure_WarehouseID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLocationID() {
		return getGroup().list(_401Package.eINSTANCE.getShippingPointStructure_LocationID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressStructure getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(AddressStructure newAddress, NotificationChain msgs) {
		AddressStructure oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _401Package.SHIPPING_POINT_STRUCTURE__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(AddressStructure newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _401Package.SHIPPING_POINT_STRUCTURE__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _401Package.SHIPPING_POINT_STRUCTURE__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _401Package.SHIPPING_POINT_STRUCTURE__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _401Package.SHIPPING_POINT_STRUCTURE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case _401Package.SHIPPING_POINT_STRUCTURE__ADDRESS:
				return basicSetAddress(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _401Package.SHIPPING_POINT_STRUCTURE__DELIVERY_ID:
				return getDeliveryID();
			case _401Package.SHIPPING_POINT_STRUCTURE__DELIVERY_DATE:
				return getDeliveryDate();
			case _401Package.SHIPPING_POINT_STRUCTURE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case _401Package.SHIPPING_POINT_STRUCTURE__WAREHOUSE_ID:
				return getWarehouseID();
			case _401Package.SHIPPING_POINT_STRUCTURE__LOCATION_ID:
				return getLocationID();
			case _401Package.SHIPPING_POINT_STRUCTURE__ADDRESS:
				return getAddress();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _401Package.SHIPPING_POINT_STRUCTURE__DELIVERY_ID:
				getDeliveryID().clear();
				getDeliveryID().addAll((Collection<? extends String>)newValue);
				return;
			case _401Package.SHIPPING_POINT_STRUCTURE__DELIVERY_DATE:
				setDeliveryDate((XMLGregorianCalendar)newValue);
				return;
			case _401Package.SHIPPING_POINT_STRUCTURE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case _401Package.SHIPPING_POINT_STRUCTURE__WAREHOUSE_ID:
				getWarehouseID().clear();
				getWarehouseID().addAll((Collection<? extends String>)newValue);
				return;
			case _401Package.SHIPPING_POINT_STRUCTURE__LOCATION_ID:
				getLocationID().clear();
				getLocationID().addAll((Collection<? extends String>)newValue);
				return;
			case _401Package.SHIPPING_POINT_STRUCTURE__ADDRESS:
				setAddress((AddressStructure)newValue);
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
			case _401Package.SHIPPING_POINT_STRUCTURE__DELIVERY_ID:
				getDeliveryID().clear();
				return;
			case _401Package.SHIPPING_POINT_STRUCTURE__DELIVERY_DATE:
				setDeliveryDate(DELIVERY_DATE_EDEFAULT);
				return;
			case _401Package.SHIPPING_POINT_STRUCTURE__GROUP:
				getGroup().clear();
				return;
			case _401Package.SHIPPING_POINT_STRUCTURE__WAREHOUSE_ID:
				getWarehouseID().clear();
				return;
			case _401Package.SHIPPING_POINT_STRUCTURE__LOCATION_ID:
				getLocationID().clear();
				return;
			case _401Package.SHIPPING_POINT_STRUCTURE__ADDRESS:
				setAddress((AddressStructure)null);
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
			case _401Package.SHIPPING_POINT_STRUCTURE__DELIVERY_ID:
				return deliveryID != null && !deliveryID.isEmpty();
			case _401Package.SHIPPING_POINT_STRUCTURE__DELIVERY_DATE:
				return DELIVERY_DATE_EDEFAULT == null ? deliveryDate != null : !DELIVERY_DATE_EDEFAULT.equals(deliveryDate);
			case _401Package.SHIPPING_POINT_STRUCTURE__GROUP:
				return group != null && !group.isEmpty();
			case _401Package.SHIPPING_POINT_STRUCTURE__WAREHOUSE_ID:
				return !getWarehouseID().isEmpty();
			case _401Package.SHIPPING_POINT_STRUCTURE__LOCATION_ID:
				return !getLocationID().isEmpty();
			case _401Package.SHIPPING_POINT_STRUCTURE__ADDRESS:
				return address != null;
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
		result.append(" (deliveryID: ");
		result.append(deliveryID);
		result.append(", deliveryDate: ");
		result.append(deliveryDate);
		result.append(", group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //ShippingPointStructureImpl
