package com.cwt.technicalexam.controller.monetary;


import com.cwt.technicalexam.dto.monetaryAmount.MonetaryAmountDTO;
import com.cwt.technicalexam.service.monetaryAmount.MonetaryAmountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonetaryAmountController {

    @Autowired
    MonetaryAmountService monetaryAmountService;



    @GetMapping("/monetaryAmount")
    public MonetaryAmountDTO getAllMonetaryAmount(){
       return monetaryAmountService.listOfMonetaryAmount();

    }
}
