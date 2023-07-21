package com.example.uhta.dto;

import com.example.uhta.entity.processDocResult.ControllerResults;
import com.example.uhta.repos.ControllerResultRepos;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class RegularReportDTO {
    @Autowired
    ControllerResultRepos controllerResultRepos;
    @Transactional("userTransactionManager")
public List<ControllerResults> CreateRegularReport(Instant endTime, Instant startTime){
return controllerResultRepos.getControllerResultByEndTimeBetween(startTime,endTime);
}
}
