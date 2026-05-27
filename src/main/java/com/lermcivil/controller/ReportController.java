package com.lermcivil.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReportController {

    @GetMapping("/generate-report")
    public String getPdfReport() {

        return "redirect:/soil-test-report-sample.pdf";
    }
}