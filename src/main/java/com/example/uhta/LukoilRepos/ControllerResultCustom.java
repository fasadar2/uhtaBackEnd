package com.example.uhta.LukoilRepos;


import org.springframework.stereotype.Service;


@Service
public class ControllerResultCustom {
//	@Autowired
//	EntityManager entityManager;
//
////	@Transactional
////	public List<PlateModel> GetPlates() {
//////		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//////		CriteriaQuery<ControllerResults> cq = cb.createQuery(ControllerResults.class);
//////		Root<ControllerResults> controllerResultsRoot = cq.from(ControllerResults.class);
//////		cq.select(controllerResultsRoot).distinct(true);
//////		List<ControllerResults> tupleResult = entityManager.createQuery(cq).getResultList();
//////
//////		return tupleResult.stream()
//////                      .map(ParserAndConvertor::ControllerResultToPlateModel)
//////                      .distinct()
//////											.collect(Collectors.toList());
//////
//////	}
}
