package com.example.uhta.controller;

import com.example.uhta.entity.uhtaDb.User;
import com.example.uhta.model.reciveModel.RegularReportRecive;
import com.example.uhta.model.reciveModel.UserModelRecive;
import com.example.uhta.model.requestModel.requestModel;
import com.example.uhta.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:3000")
@RestControllerAdvice
public class AuthController {
    @Autowired
    AuthService authService;
    @PostMapping(path = "/signup",consumes = MediaType.APPLICATION_JSON_VALUE)
    public User CreateReportRegular(@RequestBody UserModelRecive recive ){

        return authService.Auth(recive);

    }

}
