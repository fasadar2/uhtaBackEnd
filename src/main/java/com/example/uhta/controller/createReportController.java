package com.example.uhta.controller;

import com.example.uhta.model.reciveModel.regularReportRecive;
import com.example.uhta.model.requestModel.requestModel;
import com.example.uhta.service.regularReportService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class createReportController {
    @Autowired
    regularReportService regularReport;
    @PostMapping(path = "/regularReport",consumes = MediaType.APPLICATION_JSON_VALUE)
    private requestModel CreateRportRegular(@RequestBody regularReportRecive recive ){

        try {
            regularReport.CreateRegularReport(recive.getEndDate(),recive.getStartDate());
            return new requestModel(1,"Отчет успешно создан");
        }catch (Exception e){
            return new requestModel(0,e.getMessage());
        }

    }
}
