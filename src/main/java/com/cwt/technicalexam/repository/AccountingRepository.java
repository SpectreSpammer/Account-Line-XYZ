package com.cwt.technicalexam.repository;

import com.cwt.technicalexam.entity.accountingLine.AccountingLineXyzXML;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountingRepository extends JpaRepository <AccountingLineXyzXML,Integer> {


}
