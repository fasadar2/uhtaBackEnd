package com.example.uhta.service;

import com.example.uhta.model.PdfModel;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.List;

@Service
public class CreateExcelService {
    public void createSheet(List<PdfModel> pdf) {
        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet("January");

            Field[] fields = pdf.get(0).getClass().getDeclaredFields();


            HSSFRow rowHeads = sheet.createRow((short) 0);
            for(int i = 0; i < fields.length; i++)
                rowHeads.createCell(i).setCellValue(fields[i].getName());

            for(int i = 0; i < pdf.size(); i++) {
                // TODO: Сделать notNull
                HSSFRow hssfRow = sheet.createRow(i + 1);
                hssfRow.createCell(0).setCellValue(pdf.get(i).getName());
                hssfRow.createCell(1).setCellValue(pdf.get(i).getAssetType());
                hssfRow.createCell(2).setCellValue(pdf.get(i).getWeight());
                hssfRow.createCell(3).setCellValue(pdf.get(i).getOscillationIndex());
                hssfRow.createCell(4).setCellValue(pdf.get(i).getServiceFactor());
                hssfRow.createCell(5).setCellValue(pdf.get(i).getEffectiveServiceFactor());
                hssfRow.createCell(6).setCellValue(pdf.get(i).getDisspositionFlaggedDate());//category ? categoryToDto(exercise.getCategory()) : null
                hssfRow.createCell(7).setCellValue(pdf.get(i).getDisspositionEntryDate());
                hssfRow.createCell(8).setCellValue(pdf.get(i).getDisposition());
                hssfRow.createCell(9).setCellValue(pdf.get(i).getWeeksInCurrentDisposition());
                if (pdf.get(i).getDispositionComment() != null)hssfRow.createCell(10).setCellValue(String.join("\n", pdf.get(i).getDispositionComment()));

            }

            String filename = "Report.xls";
            FileOutputStream fileOut = new FileOutputStream(filename);
            workbook.write(fileOut);
            fileOut.close();
            workbook.close();

            System.out.println("Excel file has been generated successfully.");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
