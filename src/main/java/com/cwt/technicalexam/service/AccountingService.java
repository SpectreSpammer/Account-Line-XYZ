package com.cwt.technicalexam.service;

import com.cwt.technicalexam.dto.accountingLine.AccountingLineDTO;
import com.cwt.technicalexam.entity.accountingLine.AccountingLineList;
import com.cwt.technicalexam.entity.accountingLine.AccountingLineXyzXML;

import java.util.List;

public interface AccountingService {

    List<AccountingLineDTO> getAll();

    AccountingLineDTO findById(Integer index);

    AccountingLineXyzXML save(AccountingLineXyzXML accountingLineXyzXML);

    AccountingLineXyzXML update(AccountingLineXyzXML accountingLineXyzXML);

    void deleteById(Integer index);



}
