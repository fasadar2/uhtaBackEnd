package com.example.uhta.repos;

import com.example.uhta.entity.processDocResult.ControllerResult;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public interface ControllerResultRepos extends CrudRepository<ControllerResult,Integer> {
    @Query(nativeQuery = true,value = "SELECT Weight,OscillationIndex,EffectiveServiceFactor,DiagnosisComment from ControllerResults where EndTime <= ? and EndTime >= ?")
    List<ControllerResult> getControllerResultByEndTimeRange(Instant endDate, Instant startDate);
    List<ControllerResult>getControllerResultByEndTimeBetween(Instant endTime, Instant endTime2);
}
