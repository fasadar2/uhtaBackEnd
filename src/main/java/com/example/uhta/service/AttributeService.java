package com.example.uhta.service;

import com.example.uhta.model.requestModel.AttributeModel;
import com.example.uhta.model.requestModel.PlateModel;
import com.example.uhta.LukoilRepos.ControllerResultRepos;
import com.example.uhta.SubRepos.AttributeRepository;
import com.example.uhta.processDocRepos.AnalysisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AttributeService {
    @Autowired
    AttributeRepository attributeRepository;
    @Autowired
    ControllerResultRepos controllerResultRepos;
    @Autowired
    AnalysisRepository analysisRepository;

    public List<AttributeModel> GetAllAttribute()
    {
        return attributeRepository.findAll().stream()
                .map(ParserAndConvertor::AttributeToModel)
                .collect(Collectors.toList());
    }
    public List<PlateModel> GetAllPlates(){
        List<PlateModel> plateModelList = new ArrayList<>();
        List<PlateModel> plateModels = analysisRepository.findAll().stream()
                .map(ParserAndConvertor::AnalysisToPlateModel)
                .distinct()
                .toList();
        for (PlateModel plateModel :plateModels){
            if (plateModel.getId() == 15) plateModelList.add(plateModel);
        }
        return plateModelList.stream().map(ParserAndConvertor::AnalysisToPlateModelShrot).toList();
    }


}
