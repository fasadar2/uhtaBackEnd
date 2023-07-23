package com.example.uhta.service;

import com.example.uhta.LukoilRepos.ControllerResultCustom;
import com.example.uhta.model.requestModel.AttributeModel;
import com.example.uhta.model.requestModel.PlateModel;
import com.example.uhta.LukoilRepos.ControllerResultRepos;
import com.example.uhta.SubRepos.AttributeRepository;
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
    @Autowired
    ControllerResultCustom controllerResultCustom;

    public List<AttributeModel> GetAllAttribute()
    {
        return attributeRepository.findAll().stream()
                .map(ParserAndConvertor::AttributeToModel)
                .collect(Collectors.toList());
    }
    public List<PlateModel> GetAllPlates(){
        return  controllerResultCustom.GetPlates();
    }


}
