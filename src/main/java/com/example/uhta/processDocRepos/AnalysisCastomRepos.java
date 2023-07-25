package com.example.uhta.processDocRepos;

import com.example.uhta.entity.processDoc.Analysis;
import com.example.uhta.entity.processDocResult.ControllerResults;
import com.example.uhta.model.requestModel.PlateModel;
import com.example.uhta.service.ParserAndConvertor;
import jakarta.persistence.EntityManager;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnalysisCastomRepos {
    @Autowired
    EntityManager entityManager;
    @Transactional
    public List<PlateModel> GetPlates() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Analysis> cq = cb.createQuery(Analysis.class);
        Root<Analysis> analysisRoot = cq.from(Analysis.class);
        Predicate projectIdPredicate = cb.equal(analysisRoot.get("ProjectID"),15);
        cq.where(projectIdPredicate);
        List<Analysis> tupleResult = entityManager.createQuery(cq).getResultList();

        return tupleResult.stream()
                .map(ParserAndConvertor::AnalysisToPlateModel)
                .distinct()
                .collect(Collectors.toList());

    }
}
