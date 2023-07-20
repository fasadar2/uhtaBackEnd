package com.example.uhta.repos;

import com.example.uhta.entity.processDocResult.ControllerResults;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public interface ControllerResultRepos extends CrudRepository<ControllerResults,Integer> {
    @Query(nativeQuery = true,value =
            "SELECT Weight,OscillationIndex,EffectiveServiceFactor,DiagnosisComment from ControllerResults where EndTime <= ? and EndTime >= ?")
    List<ControllerResults> getControllerResultByEndTimeRange(Instant endDate, Instant startDate);
    List<ControllerResults>getControllerResultByEndTimeBetween(Instant endTime, Instant endTime2);
    @Query(nativeQuery = true,value = "SELECT ControllerID, ObjectName from \"ControllerResults\" ")
    List<ControllerResults>getAllPlates();
    @Query("select c.objectName, c.controllerID from ControllerResults c")
    List<ControllerResults>getAll();
}
