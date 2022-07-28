package com.cwt.technicalexam.entity.accountingLine;


import com.cwt.technicalexam.dto.accountingLine.AccountingLineDTO;
import com.cwt.technicalexam.entity.enumStatus.AccountingLineStatus;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounting_line")
@JacksonXmlRootElement(localName = "AccountingLine")
public class AccountingLineXyzXML implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JacksonXmlProperty(isAttribute = true)
    @XmlAttribute(name = "index")
    protected Integer index;

    @XmlElement
    protected String typeIndicator;

    @XmlElement
    @Enumerated(EnumType.STRING)
    protected AccountingLineStatus accountingLineStatus;

    @XmlElement
    protected String fareApplication;

    @XmlElement
    protected String formOfPaymentCode;

    @XmlElement
    protected Integer linkCode;

    @XmlElement
    protected String accountingVendorCode;

    @XmlElement
    protected String chargeCategoryCoded;

//    @XmlElement
//    protected String formattedReceiptNumber;

    @XmlElement
    protected String airlineDesignator;

    @XmlElement
    private String airlineCode; //added

    @XmlElement
    protected Long documentNumber;

    @XmlElement
    protected Integer commissionPercentage;

    @XmlElement
    protected Integer commissionAmount;

    @XmlElement
    protected Double baseFare;

//    @XmlElement
//    protected String basePercent; //none

    @XmlElement
    protected Integer taxPercentage;

    @XmlElement
    protected Double taxAmount;


    protected Double totalTaxAmount;

    @XmlElement
    protected String taxSurchargeCode2;

    @XmlElement
    protected String gstCode;

    @XmlElement
    protected Double gstAmount;

    @XmlElement
    protected String gstPercent;

    @XmlElement
    protected String qstCode;

    @XmlElement
    protected Double qstAmount;

    @XmlElement
    protected Integer qstPercent;

    @XmlElement
    protected Integer creditCardNumber;

    @XmlElement
    protected String creditCardCode;

    @XmlElement
    protected String passengerName;

    @XmlElement
    protected String travelerRefIDList;

    @XmlElement
    protected String numberOfConjunctedDocuments;

    @XmlElement
    protected Integer numberOfCoupons;

    @XmlElement
    protected Integer originalTicketNumber;

    @XmlElement
    protected String originalDateOfIssue;

    @XmlElement
    protected String originalPlaceOfIssue;

    @XmlElement
    protected String fullPartialExchangeIndicator;

    @XmlElement
    protected Integer originalInvoice;

    @XmlElement
    protected String tarriffBasis;

    @XmlElement
    protected String freeFormText;

    @XmlElement
    protected String currencyCode;

    @XmlElement
    protected String segmentType;

    @XmlElement
    protected Integer segmentNumber;

    @XmlAttribute
    protected String id;

    @XmlAttribute
    protected String elementId;


    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getTypeIndicator() {
        return typeIndicator;
    }

    public void setTypeIndicator(String typeIndicator) {
        this.typeIndicator = typeIndicator;
    }

    public AccountingLineStatus getAccountingLineStatus() {
        return accountingLineStatus;
    }

    public void setAccountingLineStatus(AccountingLineStatus accountingLineStatus) {
        this.accountingLineStatus = accountingLineStatus;
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

    public Integer getLinkCode() {
        return linkCode;
    }

    public void setLinkCode(Integer linkCode) {
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

//    public String getFormattedReceiptNumber() {
//        return formattedReceiptNumber;
//    }
//
//    public void setFormattedReceiptNumber(String formattedReceiptNumber) {
//        this.formattedReceiptNumber = formattedReceiptNumber;
//    }

    public String getAirlineDesignator() {
        return airlineDesignator;
    }

    public void setAirlineDesignator(String airlineDesignator) {
        this.airlineDesignator = airlineDesignator;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }

    public Long getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(Long documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Integer getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setCommissionPercentage(Integer commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    public Integer getCommissionAmount() {
        return commissionAmount;
    }

    public void setCommissionAmount(Integer commissionAmount) {
        this.commissionAmount = commissionAmount;
    }

    public Double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(Double baseFare) {
        this.baseFare = baseFare;
    }

    public Integer getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(Integer taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
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

    public Double getGstAmount() {
        return gstAmount;
    }

    public void setGstAmount(Double gstAmount) {
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

    public Double getQstAmount() {
        return qstAmount;
    }

    public void setQstAmount(Double qstAmount) {
        this.qstAmount = qstAmount;
    }

    public Integer getQstPercent() {
        return qstPercent;
    }

    public void setQstPercent(Integer qstPercent) {
        this.qstPercent = qstPercent;
    }

    public Integer getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(Integer creditCardNumber) {
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

    public String getTravelerRefIDList() {
        return travelerRefIDList;
    }

    public void setTravelerRefIDList(String travelerRefIDList) {
        this.travelerRefIDList = travelerRefIDList;
    }

    public String getNumberOfConjunctedDocuments() {
        return numberOfConjunctedDocuments;
    }

    public void setNumberOfConjunctedDocuments(String numberOfConjunctedDocuments) {
        this.numberOfConjunctedDocuments = numberOfConjunctedDocuments;
    }

    public Integer getNumberOfCoupons() {
        return numberOfCoupons;
    }

    public void setNumberOfCoupons(Integer numberOfCoupons) {
        this.numberOfCoupons = numberOfCoupons;
    }

    public Integer getOriginalTicketNumber() {
        return originalTicketNumber;
    }

    public void setOriginalTicketNumber(Integer originalTicketNumber) {
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

    public Integer getOriginalInvoice() {
        return originalInvoice;
    }

    public void setOriginalInvoice(Integer originalInvoice) {
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

    public Integer getSegmentNumber() {
        return segmentNumber;
    }

    public void setSegmentNumber(Integer segmentNumber) {
        this.segmentNumber = segmentNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }
}
