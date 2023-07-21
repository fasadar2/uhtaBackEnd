package com.example.uhta.service;

import com.example.uhta.dto.RegularReportDTO;
import com.example.uhta.entity.processDocResult.ControllerResults;
import com.example.uhta.model.PdfModel;

import com.example.uhta.model.reciveModel.regularReportRecive;
import com.example.uhta.model.requestModel.AttributeModel;
import com.example.uhta.model.requestModel.PlateModel;
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
    RegularReportDTO reportDTO;
    @Autowired
    createExcelService createPDF;
    @Autowired
    SendMailFileService sendMailFileService;
    public void CreateRegularReport(regularReportRecive recive){
        try{


            Instant endDateParsed = ParseToInstant(recive.getDateFinish());
            Instant startDateParsed = ParseToInstant(recive.getDateStart());
            List<ControllerResults> report =  reportDTO.CreateRegularReport(endDateParsed, startDateParsed);
            List<PdfModel> pdf = CreateListPdfModel(report,recive.getAttributeModels(),recive.getPlateModels());
            createPDF.createSheet(pdf);

            sendMailFileService.SendPdfOnMail(recive.getEmails());
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    public List<PdfModel> CreateListPdfModel(
            List<ControllerResults> report,
            List<AttributeModel> attributeModels,

            List<PlateModel>plateModels){
        List<String> attributes = new ArrayList<>();
        List<String> platesName = new ArrayList<>();
        for (AttributeModel attributeModel :attributeModels){
            attributes.add(attributeModel.getTitle());
        }
        for(PlateModel plateModel :plateModels){
            platesName.add(plateModel.getTitle());
        }
        List<PdfModel> pdfList = new ArrayList<>();
        for (ControllerResults result :report){
            List<String> desComment = new ArrayList<>();
            float osIndex = 0;
            float weight = 0;
            float efService = 0;
            PdfModel pdf = new PdfModel();
            int resId = result.getControllerID();
            String name = result.getAnalysis();
            int count = 0;
            for (ControllerResults isk :report){
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
            }if(platesName.contains(name))
            {
                if(attributes.contains("Weight"))pdf.setWeight(weight/count);
                if(attributes.contains("OscillationIndex")) pdf.setOscillationIndex(osIndex/count);
                if(attributes.contains("EffectiveServiceFactor")) pdf.setEffectiveServiceFactor(efService/count);
                if(attributes.contains("DispositionComment")) pdf.setDispositionComment(desComment);
                pdf.setName(name);
            }


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
