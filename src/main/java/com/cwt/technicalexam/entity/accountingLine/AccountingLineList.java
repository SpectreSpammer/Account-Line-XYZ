package com.cwt.technicalexam.entity.accountingLine;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement
@Data
public class AccountingLineList implements Serializable {

    private static final long serialVersionUID = 8768848284389900534L;

    @JacksonXmlProperty(localName = "AccountingLine")
    private List<AccountingLineXyzXML> accountingLineXyzXMLList = new ArrayList<>();

    public List<AccountingLineXyzXML> getAccountingLineXyzXMLList() {
        return accountingLineXyzXMLList;
    }

    public void setAccountingLineXyzXMLList(List<AccountingLineXyzXML> accountingLineXyzXMLList) {
        this.accountingLineXyzXMLList = accountingLineXyzXMLList;
    }
}
