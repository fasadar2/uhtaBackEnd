package com.example.uhta.service;

import com.example.uhta.dto.regularReportDTO;
import com.example.uhta.entity.processDocResult.ControllerResult;
import com.example.uhta.model.PdfModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class regularReportService {
    @Autowired
    regularReportDTO reportDTO;
    @Autowired
    createExcelService createPDF;
    public void CreateRegularReport(String endDate, String startDate){
        try{


            Instant endDateParsed = ParseToInstant(endDate);
            Instant startDateParsed = ParseToInstant(startDate);
            List<ControllerResult> report =  reportDTO.CreateRegularReport(endDateParsed, startDateParsed);
            List<PdfModel> pdf = CreateListPdfModel(report);
            createPDF.createSheet(pdf);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public List<PdfModel> CreateListPdfModel(List<ControllerResult> report){
        List<PdfModel> pdfList = new ArrayList<>();
        for (ControllerResult result :report){
            List<String> desComment = new ArrayList<>();
            float osIndex = 0;
            float weight = 0;
            float efService = 0;
            PdfModel pdf = new PdfModel();
            int resId = result.getControllerID();
            int count = 0;
            for (ControllerResult isk :report){
                if(resId == isk.getControllerID()){
                    count++;
                    if (isk.getWeight() == null){
                        weight+=0;
                    }else{
                        weight+= isk.getWeight();
                    }

                    if (isk.getOscillationIndex() == null){
                        osIndex+=0;
                    } else {
                        osIndex += isk.getOscillationIndex();
                    }
                    if (isk.getEffectiveServiceFactor() == null){
                        efService+=0;
                    } else {
                        efService += isk.getEffectiveServiceFactor();
                    }

                    desComment.add(isk.getDiagnosisComment());
                }
            }
            pdf.setWeight(weight/count);
            pdf.setOscillationIndex(osIndex/count);
            pdf.setEffectiveServiceFactor(efService/count);
            pdf.setDispositionComment(desComment);
            pdfList.add(pdf);
        }
        return pdfList;
    }
    public Instant ParseToInstant(String time){
        String pattern = "yyyy-MM-dd HH:mm";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime localDateTime = LocalDateTime.parse(time, dateTimeFormatter);
        ZoneId zoneId = ZoneId.of("Africa/Addis_Ababa");
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        return zonedDateTime.toInstant();
    }
}
