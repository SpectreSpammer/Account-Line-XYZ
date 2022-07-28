package com.cwt.technicalexam.service.monetaryAmount;

import com.cwt.technicalexam.dto.monetaryAmount.MonetaryAmountDTO;
import org.springframework.stereotype.Service;

@Service
public interface MonetaryAmountService {

    MonetaryAmountDTO listOfMonetaryAmount();
}
