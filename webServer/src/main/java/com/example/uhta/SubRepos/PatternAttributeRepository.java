package com.example.uhta.SubRepos;

import com.example.uhta.entity.uhtaDb.PatternAttribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatternAttributeRepository extends JpaRepository<PatternAttribute, Long> {
}