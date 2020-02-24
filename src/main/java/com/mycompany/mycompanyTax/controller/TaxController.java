package com.mycompany.mycompanyTax.controller;

import com.mycompany.mycompanyTax.model.TaxReq;
import com.mycompany.mycompanyTax.model.TaxResp;
import com.mycompany.mycompanyTax.service.TaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/v1")
public class TaxController {

    @Autowired
    TaxService service;

    @PostMapping(value = "/tax")
    public TaxResp getTax(TaxReq taxReq){
        return service.calculateTax(taxReq);
    }
}
