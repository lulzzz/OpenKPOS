/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package oecd.standard.audit.file.tax.p.t1._0._301;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Status Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getMovementStatus <em>Movement Status</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getMovementStatusDate <em>Movement Status Date</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getReason <em>Reason</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getSourceID <em>Source ID</em>}</li>
 *   <li>{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getSourceBilling <em>Source Billing</em>}</li>
 * </ul>
 * </p>
 *
 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType2()
 * @model extendedMetaData="name='DocumentStatus_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface DocumentStatusType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Movement Status</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._301.MovementStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * N para Normal, T para Por conta de terceiros, A para Documento anulado, F para Documento faturado, quando para este documento tambem existe na tabela 4.1. para Documentos comerciais a clientes (SalesInvoices) o correspondente do tipo fatura ou fatura simplificada, R para Documento de resumo doutros documentos criados noutras aplicacoes e gerado nesta aplicacao 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Movement Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementStatusType
	 * @see #isSetMovementStatus()
	 * @see #unsetMovementStatus()
	 * @see #setMovementStatus(MovementStatusType)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType2_MovementStatus()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='MovementStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	MovementStatusType getMovementStatus();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getMovementStatus <em>Movement Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Status</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.MovementStatusType
	 * @see #isSetMovementStatus()
	 * @see #unsetMovementStatus()
	 * @see #getMovementStatus()
	 * @generated
	 */
	void setMovementStatus(MovementStatusType value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getMovementStatus <em>Movement Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMovementStatus()
	 * @see #getMovementStatus()
	 * @see #setMovementStatus(MovementStatusType)
	 * @generated
	 */
	void unsetMovementStatus();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getMovementStatus <em>Movement Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Movement Status</em>' attribute is set.
	 * @see #unsetMovementStatus()
	 * @see #getMovementStatus()
	 * @see #setMovementStatus(MovementStatusType)
	 * @generated
	 */
	boolean isSetMovementStatus();

	/**
	 * Returns the value of the '<em><b>Movement Status Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Movement Status Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Movement Status Date</em>' attribute.
	 * @see #setMovementStatusDate(XMLGregorianCalendar)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType2_MovementStatusDate()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.SAFdateTimeType" required="true"
	 *        extendedMetaData="kind='element' name='MovementStatusDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getMovementStatusDate();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getMovementStatusDate <em>Movement Status Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Movement Status Date</em>' attribute.
	 * @see #getMovementStatusDate()
	 * @generated
	 */
	void setMovementStatusDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType2_Reason()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.SAFPTtextTypeMandatoryMax50Car"
	 *        extendedMetaData="kind='element' name='Reason' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Source ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source ID</em>' attribute.
	 * @see #setSourceID(String)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType2_SourceID()
	 * @model dataType="oecd.standard.audit.file.tax.p.t1._0._301.SAFPTtextTypeMandatoryMax30Car" required="true"
	 *        extendedMetaData="kind='element' name='SourceID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceID();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getSourceID <em>Source ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source ID</em>' attribute.
	 * @see #getSourceID()
	 * @generated
	 */
	void setSourceID(String value);

	/**
	 * Returns the value of the '<em><b>Source Billing</b></em>' attribute.
	 * The literals are from the enumeration {@link oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Billing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Billing</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling
	 * @see #isSetSourceBilling()
	 * @see #unsetSourceBilling()
	 * @see #setSourceBilling(SAFTPTSourceBilling)
	 * @see oecd.standard.audit.file.tax.p.t1._0._301._301Package#getDocumentStatusType2_SourceBilling()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='SourceBilling' namespace='##targetNamespace'"
	 * @generated
	 */
	SAFTPTSourceBilling getSourceBilling();

	/**
	 * Sets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getSourceBilling <em>Source Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Billing</em>' attribute.
	 * @see oecd.standard.audit.file.tax.p.t1._0._301.SAFTPTSourceBilling
	 * @see #isSetSourceBilling()
	 * @see #unsetSourceBilling()
	 * @see #getSourceBilling()
	 * @generated
	 */
	void setSourceBilling(SAFTPTSourceBilling value);

	/**
	 * Unsets the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getSourceBilling <em>Source Billing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSourceBilling()
	 * @see #getSourceBilling()
	 * @see #setSourceBilling(SAFTPTSourceBilling)
	 * @generated
	 */
	void unsetSourceBilling();

	/**
	 * Returns whether the value of the '{@link oecd.standard.audit.file.tax.p.t1._0._301.DocumentStatusType2#getSourceBilling <em>Source Billing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source Billing</em>' attribute is set.
	 * @see #unsetSourceBilling()
	 * @see #getSourceBilling()
	 * @see #setSourceBilling(SAFTPTSourceBilling)
	 * @generated
	 */
	boolean isSetSourceBilling();

} // DocumentStatusType2
