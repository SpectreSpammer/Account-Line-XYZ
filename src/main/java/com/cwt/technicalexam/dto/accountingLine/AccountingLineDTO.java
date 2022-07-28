package com.cwt.technicalexam.dto.accountingLine;


import com.cwt.technicalexam.entity.accountingLine.AccountingLineXyzXML;
import com.cwt.technicalexam.entity.enumStatus.AccountingLineStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountingLineDTO {



    protected Integer index;

    protected String typeIndicator;

    protected AccountingLineStatus accountingLineStatus;

    protected String fareApplication;

    protected String formOfPaymentCode;

    protected Integer linkCode;

    protected String accountingVendorCode;

    protected String chargeCategoryCoded;

//    protected String formattedReceiptNumber;

    protected String airlineDesignator;

    private String airlineCode; //added

    protected Long documentNumber;

    protected Integer commissionPercentage;

    protected Integer commissionAmount;

    protected Double baseFare;

//    @XmlElement
//    protected String basePercent; //none

    protected Integer taxPercentage;

    protected Double taxAmount;

    protected Double totalTaxAmount;

    protected Double totalTaxSurcharge;

    protected String taxSurchargeCode2;

    protected String gstCode;

    protected Double gstAmount;

    protected String gstPercent;

    protected String qstCode;

    protected Double qstAmount;

    protected Integer qstPercent;

    protected Integer creditCardNumber;

    protected String creditCardCode;

    protected String passengerName;

    protected String travelerRefIDList;

    protected String numberOfConjunctedDocuments;

    protected Integer numberOfCoupons;

    protected Integer originalTicketNumber;

    protected String originalDateOfIssue;

    protected String originalPlaceOfIssue;

    protected String fullPartialExchangeIndicator;

    protected Integer originalInvoice;

    protected String tarriffBasis;

    protected String freeFormText;

    protected String currencyCode;

    protected String segmentType;

    protected Integer segmentNumber;

    protected String id;

    protected String elementId;


    public  AccountingLineDTO(AccountingLineXyzXML accountingLineXyzXML) {
        this.index = accountingLineXyzXML.getIndex();
        this.typeIndicator = accountingLineXyzXML.getTypeIndicator();
        this.accountingLineStatus = accountingLineXyzXML.getAccountingLineStatus();

        this.fareApplication = accountingLineXyzXML.getFareApplication();
        this.formOfPaymentCode = accountingLineXyzXML.getFormOfPaymentCode();
        this.linkCode = accountingLineXyzXML.getLinkCode();
        this.accountingVendorCode = accountingLineXyzXML.getAccountingVendorCode();
        this.chargeCategoryCoded = accountingLineXyzXML.getChargeCategoryCoded();
       // this.formattedReceiptNumber = accountingLineXyzXML.getFormattedReceiptNumber();
        this.airlineDesignator = accountingLineXyzXML.getAirlineDesignator();
        this.airlineCode = accountingLineXyzXML.getAirlineCode();
        this.documentNumber = accountingLineXyzXML.getDocumentNumber();
        this.commissionPercentage = accountingLineXyzXML.getCommissionPercentage();
        this.commissionAmount = accountingLineXyzXML.getCommissionAmount();
        this.baseFare = accountingLineXyzXML.getBaseFare();
        this.taxPercentage = accountingLineXyzXML.getTaxPercentage();
        this.taxAmount = accountingLineXyzXML.getTaxAmount();

//        this.totalTaxAmount = getTotalTaxAmount();
        //setTotalTaxAmount(this.getTotalTaxAmount(getTotalTaxAmount()));

        this.qstAmount =accountingLineXyzXML.getQstAmount();
        this.gstAmount = accountingLineXyzXML.getGstAmount();
        this.taxSurchargeCode2 = accountingLineXyzXML.getTaxSurchargeCode2();
        this.gstCode = accountingLineXyzXML.getGstCode();

        this.gstPercent = accountingLineXyzXML.getGstPercent();
        this.qstCode = accountingLineXyzXML.getQstCode();
        this.qstPercent = accountingLineXyzXML.getQstPercent();

        this.creditCardNumber = accountingLineXyzXML.getCreditCardNumber();

        this.totalTaxAmount = this.TotalTaxAmount(this.getTaxAmount());
        this.totalTaxSurcharge = this.getTotalTaxSurcharge(this.getGstAmount(),this.getQstAmount());

        this.creditCardCode = accountingLineXyzXML.getCreditCardCode();
        this.passengerName = accountingLineXyzXML.getPassengerName();
        this.travelerRefIDList = accountingLineXyzXML.getTravelerRefIDList();
        this.numberOfConjunctedDocuments = accountingLineXyzXML.getNumberOfConjunctedDocuments();
        this.numberOfCoupons = accountingLineXyzXML.getNumberOfCoupons();
        this.originalTicketNumber = accountingLineXyzXML.getOriginalTicketNumber();
        this.originalDateOfIssue = accountingLineXyzXML.getOriginalDateOfIssue();
        this.originalPlaceOfIssue = accountingLineXyzXML.getOriginalPlaceOfIssue();
        this.fullPartialExchangeIndicator = accountingLineXyzXML.getFullPartialExchangeIndicator();
        this.originalInvoice = accountingLineXyzXML.getOriginalInvoice();
        this.tarriffBasis = accountingLineXyzXML.getTarriffBasis();
        this.freeFormText = accountingLineXyzXML.getFreeFormText();
        this.currencyCode = accountingLineXyzXML.getCurrencyCode();
        this.segmentType = accountingLineXyzXML.getSegmentType();
        this.segmentNumber = accountingLineXyzXML.getSegmentNumber();
        this.id = accountingLineXyzXML.getId();
        this.elementId = accountingLineXyzXML.getElementId();
    }

    public Double TotalTaxAmount(Double taxAmount) {

        Double result = taxAmount + getTotalTaxSurcharge(this.gstAmount,this.getQstAmount());
        return result;
    }

    public Double getTotalTaxSurcharge(Double gstAmount,Double qstAmount){
        Double result = gstAmount+qstAmount;
                 return result;
    }



}
