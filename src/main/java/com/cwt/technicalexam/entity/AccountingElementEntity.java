package com.cwt.technicalexam.entity;

import com.cwt.technicalexam.entityXML.accountingLine.AccountingLineXYZ;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@JacksonXmlRootElement
@Data
public class AccountingElementEntity implements Serializable {



   @JacksonXmlProperty(localName = "AccountingLine")
    private List<AccountingLineXYZ> accountingLineXYZList = new ArrayList<>();

}
