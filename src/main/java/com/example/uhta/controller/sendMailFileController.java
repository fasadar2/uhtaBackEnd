package com.example.uhta.controller;
import com.example.uhta.service.sendMailFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.uhta.model.requestModel.requestModel;
@RestController
public class sendMailFileController {
    @Autowired sendMailFileService sendReport;

    @PostMapping(path = "/sendReport", consumes = MediaType.APPLICATION_JSON_VALUE)
    private requestModel SendFile(){

        try{
            sendReport.SendPdfOnMail("createreport@mail.ru","K1lnk2tJNhQDAa4TfsqX","orlov.maksim.02@gmail.com");
            return new requestModel(1,"Отчет отправлен");
        } catch (Exception e) {
            return new requestModel(0,e.getMessage());
        }
    }
}
