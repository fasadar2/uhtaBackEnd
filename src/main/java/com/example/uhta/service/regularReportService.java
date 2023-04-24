package com.example.uhta.service;

import com.example.uhta.dto.regularReportDTO;
import com.example.uhta.entity.processDocResult.ControllerResult;
import com.example.uhta.model.reciveModel.regularReportRecive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class regularReportService {
    @Autowired
    regularReportDTO reportDTO;
    public void CreateRegularReport(String endDate,String startDate){
        try{
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            LocalDateTime endDateParsed =LocalDateTime.parse(endDate, formatter);
            LocalDateTime startDateParsed = LocalDateTime.parse(startDate, formatter);
            List<ControllerResult> report =  reportDTO.CreateRegularReport(endDateParsed, startDateParsed);
        }catch (Exception e){

        }

    }
}
