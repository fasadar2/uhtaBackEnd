package com.example.uhta.service;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import com.example.uhta.model.PdfModel;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.springframework.stereotype.Service;

@Service

public class CreatePdfService {
    public  void createPDF(List<PdfModel> pdf) throws IOException
    {
        Date date = new Date();
        String dataS = date.toString();
        // Вывод текущей даты и времени с использованием toString()

        PDDocument pdfdoc= new PDDocument();
        PDPage pdfPage = new PDPage();
        AddContent(pdfdoc,pdfPage,pdf);
        pdfdoc.addPage(pdfPage);

//path where the PDF file will be store
        pdfdoc.save("D:\\uhtaPDF\\Отчет.pdf");
//prints the message if the PDF is created successfully
        System.out.println("PDF created");
//closes the document
        pdfdoc.close();
    }
    private void AddContent( PDDocument pdfdoc,PDPage pdfPage,List<PdfModel> pdf)throws IOException{
        int row = 0;

        PDPageContentStream contentStream = new PDPageContentStream(pdfdoc, pdfPage);
        contentStream.beginText();
        contentStream.setFont(PDType1Font.TIMES_ROMAN, 12);
        contentStream.newLineAtOffset(25, 750);
        for (PdfModel pdfS:pdf){
            String text = Float.toString(pdfS.getWeight());
            contentStream.showText(text);
            int Row = 750-row*10;
            contentStream.newLineAtOffset(25, Row);
            row++;
        }

        contentStream.endText();
        contentStream.close();
    }
}
