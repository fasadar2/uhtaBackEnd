package com.example.uhta.service;

import com.example.uhta.entity.processDocResult.ControllerResults;
import com.example.uhta.entity.uhtaDb.Attribute;
import com.example.uhta.entity.uhtaDb.Pattern;
import com.example.uhta.entity.uhtaDb.User;
import com.example.uhta.model.PdfModel;
import com.example.uhta.model.UserModel;
import com.example.uhta.model.requestModel.AttributeModel;
import com.example.uhta.model.requestModel.PatternModelReq;
import com.example.uhta.model.requestModel.PlateModel;
import lombok.experimental.UtilityClass;


import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class ParserAndConvertor {
    public Instant ParseToInstant(String time){
        String pattern = "yyyy-MM-dd HH:mm";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime localDateTime = LocalDateTime.parse(time, dateTimeFormatter);
        ZoneId zoneId = ZoneId.of("Africa/Addis_Ababa");
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        return zonedDateTime.toInstant();
    }
    public  AttributeModel AttributeToModel(Attribute attribute){
        return AttributeModel.builder()
                .id(attribute.getId())
                .title(attribute.getTitle())
                .description(attribute.getDescription())
                .build();
    }
    public  PlateModel ControllerResultToPlateModel(ControllerResults controllerResults){
        String title = controllerResults.getAnalysis()
                .substring(11);
        title = title.substring(0, (title.length() - 1) / 2 );
        return PlateModel.builder()
                .id(0)
                .title(title)
                .description("null")
                .build();
    }
    public  PatternModelReq PatternToPatternModel(Pattern pattern){

        return PatternModelReq.builder()
                .id(pattern.getId())
                .desc(pattern.getDesc())
                .title(pattern.getName())
                .userID(UserToUserModel(pattern.getUserID()))
                .dateOfCreate(pattern.getDateOfCreate())
                .frequency(pattern.getFrequency())
                .isActive(pattern.getIsActive())
                .build();
    }
    public  UserModel UserToUserModel(User user){
        return UserModel.builder()
                .id(user.getId())
                .name(user.getFio())
                .build();
    }

    public List<PdfModel> RegularReportToPdfModel(
            List<ControllerResults> report,
            List<AttributeModel> attributeModels,
            List<PlateModel>plateModels){
        List<String> attributes = new ArrayList<>();
        List<String> attributeContains = new ArrayList<>();
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
            String plateName = result.getAnalysis()
                    .substring(11);
            plateName = plateName.substring(0, (plateName.length() - 1) / 2 );

            String name = result.getObjectName();
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
            }if(platesName.contains(plateName))
            {
                if(attributes.contains("Weight"))
                {
                    pdf.setWeight(weight/count);
                    attributeContains.add("Weight");
                }
                if(attributes.contains("OscillationIndex")){
                    pdf.setOscillationIndex(osIndex/count);
                    attributeContains.add("OscillationIndex");
                }
                if(attributes.contains("EffectiveServiceFactor")) {
                    pdf.setEffectiveServiceFactor(efService / count);
                    attributeContains.add("EffectiveServiceFactor");
                }
                if(attributes.contains("DispositionComment")) {
                    pdf.setDispositionComment(desComment);
                    attributeContains.add("DispositionComment");
                }
                pdf.setName(name);
            }
            pdf.setAttributesContains(attributeContains);

            pdfList.add(pdf);
        }
        return pdfList;
    }
}
