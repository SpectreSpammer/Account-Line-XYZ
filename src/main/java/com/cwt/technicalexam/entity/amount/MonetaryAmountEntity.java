package com.cwt.technicalexam.entity.amount;

import com.cwt.technicalexam.dto.monetaryAmount.MonetaryAmountDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class MonetaryAmountEntity {

    private String formattedValue;

    private String currencyCode;

    private Long value;

    private Integer numberOfDecimals;

    public MonetaryAmountEntity(MonetaryAmountDTO monetaryAmountDTO){
        this.formattedValue = monetaryAmountDTO.getFormattedValue();
        this.currencyCode = monetaryAmountDTO.getCurrencyCode();
        this.value = monetaryAmountDTO.getValue();

    }
}
