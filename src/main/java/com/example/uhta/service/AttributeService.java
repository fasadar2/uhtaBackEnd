package com.example.uhta.service;

import com.example.uhta.model.requestModel.AttributeModel;
import com.example.uhta.model.requestModel.PlateModel;
import com.example.uhta.repos.ControllerResultRepos;
import com.example.uhta.repos1.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
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
        return attributeRepository.findAll().stream()
                .map(ParserAndConvertor::AttributeToModel)
                .collect(Collectors.toList());
    }
    public List<PlateModel> GetAllPlates(){
        Instant endDateParsed = Instant.now();
        Instant startDateParsed = ParserAndConvertor.ParseToInstant("2023-02-01 00:00");
        return  controllerResultRepos.getControllerResultByEndTimeBetween(startDateParsed,endDateParsed).stream().distinct()
                .map(ParserAndConvertor::ControllerResultToPlateModel)
                .collect(Collectors.toList());
    }


}
