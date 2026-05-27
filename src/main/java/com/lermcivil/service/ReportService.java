package com.lermcivil.service;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import org.springframework.stereotype.Service;

@Service
public class ReportService {

    public String generatePdf() throws Exception {

        // Create folder if not exists
        java.io.File directory = new java.io.File("sample-reports");

        if (!directory.exists()) {
            directory.mkdirs();
        }

        // PDF path
        String path = "sample-reports/soil-test-report-sample.pdf";

        // Create PDF writer
        PdfWriter writer = new PdfWriter(path);

        // Create PDF document
        PdfDocument pdf = new PdfDocument(writer);

        // Create document object
        Document document = new Document(pdf);

        // Add report content
        document.add(new Paragraph("LERM Civil Laboratory"));

        document.add(new Paragraph("================================"));

        document.add(new Paragraph("SOIL TEST REPORT"));

        document.add(new Paragraph(""));

        document.add(new Paragraph("Customer Name : Demo Client"));

        document.add(new Paragraph("Project Name : Metro Construction"));

        document.add(new Paragraph("Sample ID : S-1001"));

        document.add(new Paragraph("Soil Type : Clay Soil"));

        document.add(new Paragraph("Moisture Content : 18%"));

        document.add(new Paragraph("Test Status : Approved"));

        document.add(new Paragraph("Lab Engineer : Agnes"));

        document.add(new Paragraph(""));

        document.add(new Paragraph("Generated using Spring Boot PDF Service"));

        // Close document
        document.close();

        return "PDF Generated Successfully";
    }
}