package com.example.uhta.service;

import com.example.uhta.entity.processDocResult.ControllerResults;
import com.example.uhta.entity.uhtaDb.Attribute;
import com.example.uhta.model.requestModel.AttributeModel;
import com.example.uhta.model.requestModel.PlateModel;
import com.example.uhta.repos.ControllerResultRepos;
import com.example.uhta.repos1.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AttributeService {
    @Autowired
    AttributeRepository attributeRepository;
    @Autowired
    ControllerResultRepos controllerResultRepos;
    public List<AttributeModel> GetAllAttribute()
    {
        return attributeRepository.getAttributes().stream()
                .map(this::AttributeToModel)
                .collect(Collectors.toList());
    }
    public List<PlateModel> GetAllPlates(){
        Instant endDateParsed = ParseToInstant("2023-02-10 00:00");
        Instant startDateParsed = ParseToInstant("2023-02-01 00:00");
        return  controllerResultRepos.getControllerResultByEndTimeBetween(startDateParsed,endDateParsed).stream().distinct()
                .map(this::ControllerResultToPlateModel)
                .collect(Collectors.toList());
    }
    private AttributeModel AttributeToModel(Attribute attribute){
        return AttributeModel.builder()
                .id(attribute.getId())
                .title(attribute.getTitle())
                .description(attribute.getDescription())
                .build();
    }
    private PlateModel ControllerResultToPlateModel(ControllerResults controllerResults){
        return PlateModel.builder()
                .id(controllerResults.getControllerID())
                .title(controllerResults.getObjectName())
                .description("null")
                .build();
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
