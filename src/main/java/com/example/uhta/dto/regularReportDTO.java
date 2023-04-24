package com.example.uhta.dto;

import com.example.uhta.entity.processDocResult.ControllerResult;
import com.example.uhta.repos.ControllerResultRepos;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class regularReportDTO {
    @Autowired
    ControllerResultRepos controllerResultRepos;
    @Transactional
public List<ControllerResult> CreateRegularReport(LocalDateTime endTime, LocalDateTime startTime){
return controllerResultRepos.getControllerResultByEndTimeRange(endTime,startTime);
}
}
