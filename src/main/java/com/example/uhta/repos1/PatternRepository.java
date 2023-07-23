package com.example.uhta.repos1;

import com.example.uhta.entity.uhtaDb.Pattern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatternRepository extends JpaRepository<Pattern, Integer> {
@Query("SELECT p FROM Pattern p JOIN User u ON u.id = p.userID.id")
List<Pattern> getPatterns();
}