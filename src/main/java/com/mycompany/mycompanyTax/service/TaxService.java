package com.mycompany.mycompanyTax.service;

import com.mycompany.mycompanyTax.model.TaxReq;
import com.mycompany.mycompanyTax.model.TaxResp;
import com.mycompany.mycompanyTax.util.TaxUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaxService {

    @Autowired
    TaxUtil taxUtil;

    public TaxResp calculateTax(TaxReq taxReq ){
        return new TaxResp(taxUtil.getNetCash(taxReq),
                taxUtil.getTaxCredit(taxReq.getMedicalAidMembers()),
                taxUtil.getPayeAfterTaxCredit(taxReq),
                taxUtil.getPayeBeforTaxCredit(taxReq));
    }
}
