package com.example.uhta.service;

import com.example.uhta.entity.processDocResult.ControllerResults;
import com.example.uhta.entity.uhtaDb.Attribute;
import com.example.uhta.model.requestModel.AttributeModel;
import com.example.uhta.model.requestModel.PlateModel;
import com.example.uhta.repos.ControllerResultRepos;
import com.example.uhta.repos1.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<ControllerResults> GetAllPlates(){
//        return controllerResultRepos.getAll().stream()
//                .map(this::ControllerResultToPlateModel)
//                .collect(Collectors.toList());
        return controllerResultRepos.getAll();
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
}
