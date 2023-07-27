package com.example.uhta.controller;


import com.example.uhta.model.requestModel.AttributeModel;
import com.example.uhta.model.requestModel.PlateModel;
import com.example.uhta.service.AttributeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attribute")
@CrossOrigin(origins = "http://localhost:3000")
@RestControllerAdvice
@Tag(name = "AttributeApi")
public class AtributeController {
    @Autowired
    AttributeService attributeService;
    @GetMapping(path = "/get-attributes")
    public List<AttributeModel> GetAllAttributes(){
        return attributeService.GetAllAttribute();
    }
    @GetMapping(path = "/get-plates")
    public List<PlateModel> GetAllPlates(){
        return attributeService.GetAllPlates();
    }
}
