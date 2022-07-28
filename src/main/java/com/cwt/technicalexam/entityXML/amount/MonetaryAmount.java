package com.cwt.technicalexam.entityXML.amount;

import com.cwt.technicalexam.dto.monetaryAmount.MonetaryAmountDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "monetaryAmount")
@XmlAccessorType(XmlAccessType.FIELD)
@Builder
public class MonetaryAmount implements Serializable {

    private static final long serialVersionUID = 6498027380354019510L;

    private String formattedValue;

    private String currencyCode;

    private Long value;

    private Integer numberOfDecimals;

    public MonetaryAmount(MonetaryAmountDTO monetaryAmountDTO){
        this.formattedValue = monetaryAmountDTO.getFormattedValue();
        this.currencyCode = monetaryAmountDTO.getCurrencyCode();
        this.value = monetaryAmountDTO.getValue();
        this.numberOfDecimals = monetaryAmountDTO.getNumberOfDecimals();
    }
}
