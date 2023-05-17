package com.example.uhta.dto;

import com.example.uhta.entity.processDocResult.ControllerResult;
import com.example.uhta.repos.ControllerResultRepos;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class regularReportDTO {
    @Autowired
    ControllerResultRepos controllerResultRepos;
    @Transactional
public List<ControllerResult> CreateRegularReport(Instant endTime, Instant startTime){
return controllerResultRepos.getControllerResultByEndTimeBetween(startTime,endTime);
}
}
