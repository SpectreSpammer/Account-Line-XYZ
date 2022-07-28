package com.cwt.technicalexam.service.monetaryPercentage;

import com.cwt.technicalexam.dto.monetaryPercentage.MonetaryPercentageDTO;
import org.springframework.stereotype.Service;


@Service
public class MonetaryPercentageServiceImpl implements MonetaryPercentageService{



    @Override
    public MonetaryPercentageDTO getAllMonetaryPercentage() {
      MonetaryPercentageDTO dto = new MonetaryPercentageDTO();

      return dto;
    }
}
