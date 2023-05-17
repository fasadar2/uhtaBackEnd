package com.example.uhta.controller;
import com.example.uhta.service.sendMailFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.uhta.model.requestModel.requestModel;
@RestController
public class sendMailFileController {
    @Autowired sendMailFileService sendReport;

    @GetMapping(path = "/test")
    private requestModel SendFile(){

            return new requestModel(0,"esa");

    }
}
