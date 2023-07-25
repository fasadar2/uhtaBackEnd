package com.example.uhta.LukoilRepos;

import com.example.uhta.entity.processDocResult.ControllerResults;
import com.example.uhta.model.requestModel.PlateModel;
import com.example.uhta.service.ParserAndConvertor;
import jakarta.persistence.EntityManager;


import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ControllerResultCustom {
	@Autowired
	EntityManager entityManager;

	@Transactional
	public List<PlateModel> GetPlates() {
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
		CriteriaQuery<ControllerResults> cq = cb.createQuery(ControllerResults.class);
		Root<ControllerResults> controllerResultsRoot = cq.from(ControllerResults.class);
		cq.select(controllerResultsRoot).distinct(true);
		List<ControllerResults> tupleResult = entityManager.createQuery(cq).getResultList();

		return tupleResult.stream()
                      .map(ParserAndConvertor::ControllerResultToPlateModel)
                      .distinct()
											.collect(Collectors.toList());

	}
}
