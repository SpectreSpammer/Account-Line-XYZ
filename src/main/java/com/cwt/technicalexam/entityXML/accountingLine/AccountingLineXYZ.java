package com.cwt.technicalexam.entityXML.accountingLine;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounting_xyz")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingLine.XYZ", propOrder = {
        "typeIndicator",
        "fareApplication",
        "formOfPaymentCode",
        "linkCode",
        "accountingVendorCode",
        "chargeCategoryCoded",
        "airlineDesignator",
        "documentNumber",
        "commissionPercentage",
        "commissionAmount",
        "baseFare",
        "basePercent",
        "taxPercentage",
        "taxAmount",
        "taxSurchargeCode2",
        "gstCode",
        "gstAmount",
        "gstPercent",
        "qstCode",
        "qstAmount",
        "qstPercent",
        "creditCardNumber",
        "creditCardCode",
        "passengerName",
        "numberOfConjunctedDocuments",
        "numberOfCoupons",
        "originalTicketNumber",
        "originalDateOfIssue",
        "originalPlaceOfIssue",
        "fullPartialExchangeIndicator",
        "originalInvoice",
        "tarriffBasis",
        "freeFormText",
        "currencyCode",
        "segmentType",
        "segmentNumber"
})
public class AccountingLineXYZ implements Serializable
{

    @XmlElement(name = "TypeIndicator")
    protected String typeIndicator;
    @XmlElement(name = "FareApplication")
    protected String fareApplication;
    @XmlElement(name = "FormOfPaymentCode")
    protected String formOfPaymentCode;
    @XmlElement(name = "LinkCode")
    protected String linkCode;
    @XmlElement(name = "AccountingVendorCode")
    protected String accountingVendorCode;
    @XmlElement(name = "ChargeCategoryCoded")
    protected String chargeCategoryCoded;
    @XmlElement(name = "AirlineDesignator")
    protected String airlineDesignator;
    @XmlElement(name = "DocumentNumber")
    protected String documentNumber;
    @XmlElement(name = "CommissionPercentage")
    protected String commissionPercentage;
    @XmlElement(name = "CommissionAmount")
    protected String commissionAmount;
    @XmlElement(name = "BaseFare")
    protected String baseFare;
    @XmlElement(name = "BasePercent")
    protected String basePercent;
    @XmlElement(name = "TaxPercentage")
    protected String taxPercentage;
    @XmlElement(name = "TaxAmount")
    protected String taxAmount;
    @XmlElement(name = "TaxSurchargeCode2")
    protected String taxSurchargeCode2;
    @XmlElement(name = "GSTCode")
    protected String gstCode;
    @XmlElement(name = "GSTAmount")
    protected String gstAmount;
    @XmlElement(name = "GSTPercent")
    protected String gstPercent;
    @XmlElement(name = "QSTCode")
    protected String qstCode;
    @XmlElement(name = "QSTAmount")
    protected String qstAmount;
    @XmlElement(name = "QSTPercent")
    protected String qstPercent;
    @XmlElement(name = "CreditCardNumber")
    protected String creditCardNumber;
    @XmlElement(name = "CreditCardCode")
    protected String creditCardCode;
    @XmlElement(name = "PassengerName")
    protected String passengerName;
    @XmlElement(name = "NumberOfConjunctedDocuments")
    protected String numberOfConjunctedDocuments;
    @XmlElement(name = "NumberOfCoupons")
    protected String numberOfCoupons;
    @XmlElement(name = "OriginalTicketNumber")
    protected String originalTicketNumber;
    @XmlElement(name = "OriginalDateOfIssue")
    protected String originalDateOfIssue;
    @XmlElement(name = "OriginalPlaceOfIssue")
    protected String originalPlaceOfIssue;
    @XmlElement(name = "FullPartialExchangeIndicator")
    protected String fullPartialExchangeIndicator;
    @XmlElement(name = "OriginalInvoice")
    protected String originalInvoice;
    @XmlElement(name = "TarriffBasis")
    protected String tarriffBasis;
    @XmlElement(name = "FreeFormText")
    protected String freeFormText;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "SegmentType")
    protected String segmentType;
    @XmlElement(name = "SegmentNumber")
    protected String segmentNumber;

    @XmlAttribute(name = "id")
    protected String id;

    @Id
    @XmlAttribute(name = "index")
    protected Integer index;

    @XmlAttribute(name = "elementId")
    protected String elementId;




    public String getTypeIndicator() {
        return typeIndicator;
    }

    public void setTypeIndicator(String typeIndicator) {
        this.typeIndicator = typeIndicator;
    }

    public String getFareApplication() {
        return fareApplication;
    }

    public void setFareApplication(String fareApplication) {
        this.fareApplication = fareApplication;
    }

    public String getFormOfPaymentCode() {
        return formOfPaymentCode;
    }

    public void setFormOfPaymentCode(String formOfPaymentCode) {
        this.formOfPaymentCode = formOfPaymentCode;
    }

    public String getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(String linkCode) {
        this.linkCode = linkCode;
    }

    public String getAccountingVendorCode() {
        return accountingVendorCode;
    }

    public void setAccountingVendorCode(String accountingVendorCode) {
        this.accountingVendorCode = accountingVendorCode;
    }

    public String getChargeCategoryCoded() {
        return chargeCategoryCoded;
    }

    public void setChargeCategoryCoded(String chargeCategoryCoded) {
        this.chargeCategoryCoded = chargeCategoryCoded;
    }

    public String getAirlineDesignator() {
        return airlineDesignator;
    }

    public void setAirlineDesignator(String airlineDesignator) {
        this.airlineDesignator = airlineDesignator;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(String commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public String getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(String commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public String getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(String baseFare) {
        this.baseFare = baseFare;
    }

    public String getBasePercent() {
        return basePercent;
    }

    public void setBasePercent(String basePercent) {
        this.basePercent = basePercent;
    }

    public String getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(String taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public String getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(String taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getTaxSurchargeCode2() {
        return taxSurchargeCode2;
    }

    public void setTaxSurchargeCode2(String taxSurchargeCode2) {
        this.taxSurchargeCode2 = taxSurchargeCode2;
    }

    public String getGstCode() {
        return gstCode;
    }

    public void setGstCode(String gstCode) {
        this.gstCode = gstCode;
    }

    public String getGstAmount() {
        return gstAmount;
    }

    public void setGstAmount(String gstAmount) {
        this.gstAmount = gstAmount;
    }

    public String getGstPercent() {
        return gstPercent;
    }

    public void setGstPercent(String gstPercent) {
        this.gstPercent = gstPercent;
    }

    public String getQstCode() {
        return qstCode;
    }

    public void setQstCode(String qstCode) {
        this.qstCode = qstCode;
    }

    public String getQstAmount() {
        return qstAmount;
    }

    public void setQstAmount(String qstAmount) {
        this.qstAmount = qstAmount;
    }

    public String getQstPercent() {
        return qstPercent;
    }

    public void setQstPercent(String qstPercent) {
        this.qstPercent = qstPercent;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardCode() {
        return creditCardCode;
    }

    public void setCreditCardCode(String creditCardCode) {
        this.creditCardCode = creditCardCode;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getNumberOfConjunctedDocuments() {
        return numberOfConjunctedDocuments;
    }

    public void setNumberOfConjunctedDocuments(String numberOfConjunctedDocuments) {
        this.numberOfConjunctedDocuments = numberOfConjunctedDocuments;
    }

    public String getNumberOfCoupons() {
        return numberOfCoupons;
    }

    public void setNumberOfCoupons(String numberOfCoupons) {
        this.numberOfCoupons = numberOfCoupons;
    }

    public String getOriginalTicketNumber() {
        return originalTicketNumber;
    }

    public void setOriginalTicketNumber(String originalTicketNumber) {
        this.originalTicketNumber = originalTicketNumber;
    }

    public String getOriginalDateOfIssue() {
        return originalDateOfIssue;
    }

    public void setOriginalDateOfIssue(String originalDateOfIssue) {
        this.originalDateOfIssue = originalDateOfIssue;
    }

    public String getOriginalPlaceOfIssue() {
        return originalPlaceOfIssue;
    }

    public void setOriginalPlaceOfIssue(String originalPlaceOfIssue) {
        this.originalPlaceOfIssue = originalPlaceOfIssue;
    }

    public String getFullPartialExchangeIndicator() {
        return fullPartialExchangeIndicator;
    }

    public void setFullPartialExchangeIndicator(String fullPartialExchangeIndicator) {
        this.fullPartialExchangeIndicator = fullPartialExchangeIndicator;
    }

    public String getOriginalInvoice() {
        return originalInvoice;
    }

    public void setOriginalInvoice(String originalInvoice) {
        this.originalInvoice = originalInvoice;
    }

    public String getTarriffBasis() {
        return tarriffBasis;
    }

    public void setTarriffBasis(String tarriffBasis) {
        this.tarriffBasis = tarriffBasis;
    }

    public String getFreeFormText() {
        return freeFormText;
    }

    public void setFreeFormText(String freeFormText) {
        this.freeFormText = freeFormText;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getSegmentType() {
        return segmentType;
    }

    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
    }

    public String getSegmentNumber() {
        return segmentNumber;
    }

    public void setSegmentNumber(String segmentNumber) {
        this.segmentNumber = segmentNumber;
    }

    public String getId(String index) {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }
}
