package com.cwt.technicalexam.service.monetaryPercentage;

import com.cwt.technicalexam.dto.monetaryPercentage.MonetaryPercentageDTO;
import org.springframework.stereotype.Service;


@Service
public interface MonetaryPercentageService {

    MonetaryPercentageDTO getAllMonetaryPercentage();
}
