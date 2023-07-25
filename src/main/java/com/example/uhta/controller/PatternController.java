package com.example.uhta.controller;

import com.example.uhta.entity.uhtaDb.Pattern;
import com.example.uhta.model.reciveModel.PatternModel;
import com.example.uhta.model.reciveModel.RegularReportRecive;
import com.example.uhta.model.requestModel.PatternModelReq;
import com.example.uhta.model.requestModel.requestModel;
import com.example.uhta.service.PatternService;
import com.example.uhta.service.RegularReportService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pattern")
@CrossOrigin(origins = "http://localhost:3000")
@RestControllerAdvice
@Tag(name = "PatternApi")
public class PatternController {
	@Autowired
	PatternService patternService;
	@Autowired
	RegularReportService regularReport;

	@GetMapping(path = "get-patterns")
	public List<PatternModelReq> GetAllPatterns() {
		var patterns = patternService.GetAllPattern();
		return patterns;
	}

	@PostMapping(path = "/add-pattern", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Pattern SetPattern(@RequestBody PatternModel patternModel) {
		System.out.println("Addpattern");

		return patternService.SetPattern(patternModel);
	}

	@PostMapping(path = "/report", consumes = MediaType.APPLICATION_JSON_VALUE)
	public requestModel CreateReportRegular(@RequestBody RegularReportRecive recive) {
		try {
			regularReport.CreateRegularReport(recive);
			return new requestModel(1, "Отчет успешно создан");
		} catch(Exception e) {
			return new requestModel(0, e.getMessage());
		}

	}
}
