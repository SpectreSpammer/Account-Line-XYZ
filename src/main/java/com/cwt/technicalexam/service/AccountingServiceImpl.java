package com.cwt.technicalexam.service;


import com.cwt.technicalexam.dto.accountingLine.AccountingLineDTO;
import com.cwt.technicalexam.entity.accountingLine.AccountingLineList;
import com.cwt.technicalexam.entity.accountingLine.AccountingLineXyzXML;
import com.cwt.technicalexam.exception.AccountingException;
import com.cwt.technicalexam.repository.AccountingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountingServiceImpl implements AccountingService {

    @Autowired
    private AccountingRepository accountingRepository;

    @Override
    public List<AccountingLineDTO> getAll() {
        List<AccountingLineDTO> productDTOList = accountingRepository.findAll().stream().map(AccountingLineDTO::new).collect(Collectors.toList());
        return productDTOList;
    }


    @Override
    public AccountingLineDTO findById(Integer index) {
        AccountingLineXyzXML accountingLineXyzXML =  accountingRepository.findById(index).orElseThrow(() -> new AccountingException("Index " +  index + " not found"));
        return  new AccountingLineDTO(accountingLineXyzXML);
    }


    @Override
    public AccountingLineDTO update(AccountingLineDTO accountingLineXyzXML) {
        return null;
    }

    @Override
    public AccountingLineXyzXML save(AccountingLineXyzXML accountingLineXyzXML) {
        return accountingRepository.save(accountingLineXyzXML);
    }

    @Override
    public AccountingLineXyzXML update(AccountingLineXyzXML accountingLineXyzXML) {
        return accountingRepository.save(accountingLineXyzXML);
    }

    @Override
    public void deleteById(Integer index) {
        accountingRepository.deleteById(index);

    }
}
