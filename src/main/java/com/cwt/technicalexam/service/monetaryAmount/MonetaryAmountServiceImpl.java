package com.cwt.technicalexam.service.monetaryAmount;

import com.cwt.technicalexam.dto.monetaryAmount.MonetaryAmountDTO;
import org.springframework.stereotype.Service;


@Service
public class MonetaryAmountServiceImpl implements MonetaryAmountService{


    @Override
    public MonetaryAmountDTO listOfMonetaryAmount() {
        MonetaryAmountDTO monetaryAmountDTO = new MonetaryAmountDTO();
        monetaryAmountDTO.setCurrencyCode("USD");
        return monetaryAmountDTO;
    }
}
