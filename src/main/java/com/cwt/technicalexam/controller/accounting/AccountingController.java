package com.cwt.technicalexam.controller.accounting;


import com.cwt.technicalexam.dto.accountingLine.AccountingLineDTO;
import com.cwt.technicalexam.entity.accountingLine.AccountingLineList;
import com.cwt.technicalexam.entity.accountingLine.AccountingLineXyzXML;
import com.cwt.technicalexam.service.AccountingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountingController {

    @Autowired
    AccountingService accountingService;

     @GetMapping(value = "/accounting")

    public ResponseEntity<?> getAllIndex(){
        List<AccountingLineDTO> dtoList =  accountingService.getAll();
        return new ResponseEntity<>(dtoList,HttpStatus.ACCEPTED);
    }

    /*
    //the media type is not working
    @GetMapping(value = "/entity",produces = MediaType.APPLICATION_XML_VALUE)
    public AccountingLineList findEmployees(){
        return accountingService.findAll();
    }
    */

    @GetMapping("/accounting/{index}")
    public ResponseEntity<?> getIndexById(@PathVariable Integer index){
        AccountingLineDTO dtoList =  accountingService.findById(index);
        return new ResponseEntity<>(dtoList,HttpStatus.OK);

    }


    @PostMapping(value = "/accounting",consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<AccountingLineXyzXML> saveEntity(@RequestBody AccountingLineXyzXML withoutSerial){
        AccountingLineXyzXML save = accountingService.save(withoutSerial);
        return new ResponseEntity<>(save, HttpStatus.CREATED);
    }

    @PutMapping(value = "/accounting",consumes = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<AccountingLineXyzXML> updateEmployee(@RequestBody AccountingLineXyzXML withoutSerial){
        AccountingLineXyzXML update = accountingService.save(withoutSerial);
        return new ResponseEntity<>(update, HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/accounting/{index}")
    public void deleteById(@PathVariable Integer index){
        accountingService.deleteById(index);
    }


}
