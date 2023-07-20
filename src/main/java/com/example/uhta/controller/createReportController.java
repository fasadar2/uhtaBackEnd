package com.example.uhta.controller;

import com.example.uhta.model.reciveModel.regularReportRecive;
import com.example.uhta.model.requestModel.requestModel;
import com.example.uhta.service.regularReportService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/report")
@CrossOrigin(origins = "http://localhost:3000")
@RestControllerAdvice
@Tag(name = "EXERCISE API")
public class createReportController {
    @Autowired
    regularReportService regularReport;
    @Operation(summary = "Get exercise with list inventory and list img",
            description = "Получение упражнения со списком инвентаря и списком изображений")
    @PostMapping(path = "/regularReport",consumes = MediaType.APPLICATION_JSON_VALUE)

    public requestModel CreateReportRegular(@RequestBody regularReportRecive recive ){

        try {
            regularReport.CreateRegularReport(recive.getEndDate(),recive.getStartDate());
            return new requestModel(1,"Отчет успешно создан");
        }catch (Exception e){
            return new requestModel(0,e.getMessage());
        }

    }
}
