package com.example.uhta.repos1;

import com.example.uhta.entity.uhtaDb.PatternAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatternAttributeRepository extends JpaRepository<PatternAttribute, Long> {
}