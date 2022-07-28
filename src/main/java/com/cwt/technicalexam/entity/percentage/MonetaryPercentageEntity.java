package com.cwt.technicalexam.entity.percentage;

import com.cwt.technicalexam.dto.monetaryPercentage.MonetaryPercentageDTO;
import com.cwt.technicalexam.entity.amount.MonetaryAmountEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import java.math.BigDecimal;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class MonetaryPercentageEntity {

    private String code;
    @Embedded
    private MonetaryAmountEntity amount;
    private BigDecimal percentage;

    public MonetaryPercentageEntity(MonetaryPercentageDTO monetaryPercentageDTO){
        this.code = monetaryPercentageDTO.getCode();
        this.amount = monetaryPercentageDTO.getAmount();
        this.percentage = monetaryPercentageDTO.getPercentage();
    }
}
