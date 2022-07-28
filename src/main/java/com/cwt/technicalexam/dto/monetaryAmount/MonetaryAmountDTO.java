package com.cwt.technicalexam.dto.monetaryAmount;



import com.cwt.technicalexam.entity.amount.MonetaryAmountEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MonetaryAmountDTO {

    @NotBlank(message = "Formatted Value can't Be Null/Blank!!")
    private String formattedValue;

    @NotBlank(message = "Currency Code can't Be Null/Blank!!")
    private String currencyCode;


    @NotBlank(message = "Value can't Be Null/Blank!!")
    private Long value;

    private Integer numberOfDecimals;


    public MonetaryAmountDTO(MonetaryAmountEntity monetaryAmountEntity){
        this.formattedValue = monetaryAmountEntity.getFormattedValue();
        this.currencyCode = monetaryAmountEntity.getCurrencyCode();
        this.value = monetaryAmountEntity.getValue();


    }



}
