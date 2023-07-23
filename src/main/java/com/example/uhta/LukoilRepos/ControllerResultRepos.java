package com.example.uhta.LukoilRepos;

import com.example.uhta.entity.processDocResult.ControllerResults;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public interface ControllerResultRepos extends CrudRepository<ControllerResults,Integer> {

    List<ControllerResults>getControllerResultByEndTimeBetween(Instant endTime, Instant endTime2);

}
