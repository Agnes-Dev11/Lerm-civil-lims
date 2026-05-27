package com.lermcivil.service;

import org.springframework.stereotype.Service;

@Service
public class OdooIntegrationService {

    public String syncCustomer() {

        return "Customer synced successfully with Odoo ERP";
    }

    public String syncInvoice() {

        return "Invoice synced successfully with Odoo ERP";
    }

    public String approveSample() {

        return "Laboratory sample approved successfully";
    }

    public String sampleStatus() {

        return "Sample Testing Completed";
    }
}