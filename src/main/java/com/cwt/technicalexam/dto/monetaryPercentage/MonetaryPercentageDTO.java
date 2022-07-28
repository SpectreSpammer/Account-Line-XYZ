package com.cwt.technicalexam.dto.monetaryPercentage;


import com.cwt.technicalexam.entity.amount.MonetaryAmountEntity;
import com.cwt.technicalexam.entity.percentage.MonetaryPercentageEntity;
import com.cwt.technicalexam.entityXML.amount.MonetaryAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonetaryPercentageDTO {

    private String code;
    private MonetaryAmountEntity amount;
    private BigDecimal percentage;


    public MonetaryPercentageDTO(MonetaryPercentageEntity monetaryPercentage){
        this.code = monetaryPercentage.getCode();
        this.amount = monetaryPercentage.getAmount();
        this.percentage = monetaryPercentage.getPercentage();
    }

}
