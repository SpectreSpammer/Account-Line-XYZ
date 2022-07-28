package com.cwt.technicalexam.controller.exception;


import com.cwt.technicalexam.entity.errorResponse.AccountingErrorResponse;
import com.cwt.technicalexam.exception.AccountingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AccountingExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<AccountingErrorResponse> accountErrorResponse(AccountingException accountingException){

        AccountingErrorResponse accountingErrorResponse = new AccountingErrorResponse();
        accountingErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        accountingErrorResponse.setMessage(accountingErrorResponse.getMessage());

        return new ResponseEntity<>(accountingErrorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<AccountingErrorResponse> accountErrorResponse(Exception e){
        AccountingErrorResponse accountingErrorResponse = new AccountingErrorResponse();
        accountingErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        accountingErrorResponse.setMessage(e.getMessage());

        return new ResponseEntity<>(accountingErrorResponse,HttpStatus.BAD_REQUEST);
    }
}

