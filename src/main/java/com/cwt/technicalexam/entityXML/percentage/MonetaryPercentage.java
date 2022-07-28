package com.cwt.technicalexam.entityXML.percentage;

import com.cwt.technicalexam.entityXML.amount.MonetaryAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement(name = "monetaryPercentage")
@XmlAccessorType(XmlAccessType.FIELD)
@Builder
public class MonetaryPercentage implements Serializable {

    private static final long serialVersionUID = 273943458886964984L;

    private String code;
    private MonetaryAmount amount; //CommissionPercentage
    private BigDecimal percentage; //CommissionAmount
}
