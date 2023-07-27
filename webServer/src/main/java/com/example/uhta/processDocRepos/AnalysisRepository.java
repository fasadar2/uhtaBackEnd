package com.example.uhta.processDocRepos;

import com.example.uhta.entity.processDoc.Analysis;
import com.example.uhta.entity.processDoc.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnalysisRepository extends JpaRepository<Analysis, Integer> {
}