package com.lermcivil.controller;

import com.lermcivil.service.OdooIntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OdooController {

    @Autowired
    private OdooIntegrationService odooService;

    @GetMapping("/sync-customer")
    public String syncCustomer() {

        return odooService.syncCustomer();
    }

    @GetMapping("/sync-invoice")
    public String syncInvoice() {

        return odooService.syncInvoice();
    }

    @GetMapping("/approve-sample")
    public String approveSample() {

        return odooService.approveSample();
    }

    @GetMapping("/sample-status")
    public String sampleStatus() {

        return odooService.sampleStatus();
    }
}