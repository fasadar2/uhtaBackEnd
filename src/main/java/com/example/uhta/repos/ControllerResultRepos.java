package com.example.uhta.repos;

import com.example.uhta.entity.processDocResult.ControllerResult;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ControllerResultRepos extends CrudRepository<ControllerResult,Integer> {
    @Query(nativeQuery = true,value = "SELECT * from ControllerResults where EndTime <= ? and EndTime >= ?")
    List<ControllerResult> getControllerResultByEndTimeRange(LocalDateTime endDate,LocalDateTime startDate);
}
