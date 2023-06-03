package com.example.uhta;

import com.example.uhta.controller.sendMailFileController;
import com.example.uhta.dto.regularReportDTO;
import com.example.uhta.entity.processDocResult.ControllerResult;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class dtoTest {
    @Autowired
    regularReportDTO reportDTO;
    @Autowired
    sendMailFileController sendController;
    private Instant ParseToInstant(String time){
        String pattern = "yyyy-MM-dd HH:mm";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime localDateTime = LocalDateTime.parse(time, dateTimeFormatter);
        ZoneId zoneId = ZoneId.of("Africa/Addis_Ababa");
        ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
        return zonedDateTime.toInstant();
    }
    @Test
    public void testController(){
        Assertions.assertEquals(sendController.SendFile().getCode(),0 );
    }
    @Test
    public void testDTO(){
        List<ControllerResult> results = new ArrayList<>();
        Assertions.assertInstanceOf(results.getClass(), reportDTO.CreateRegularReport(ParseToInstant("2023-02-01 00:00"),ParseToInstant("2023-02-01 00:00")));
    }


}
