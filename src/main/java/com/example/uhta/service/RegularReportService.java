package com.example.uhta.service;

import com.example.uhta.entity.processDocResult.ControllerResults;
import com.example.uhta.model.PdfModel;

import com.example.uhta.model.reciveModel.RegularReportRecive;
import com.example.uhta.LukoilRepos.ControllerResultRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class RegularReportService {
	@Autowired
	CreateExcelService createPDF;
	@Autowired
	SendMailFileService sendMailFileService;
	@Autowired
	ControllerResultRepos controllerResultRepos;

	public void CreateRegularReport(RegularReportRecive recive) {
		try {
			Instant endDateParsed = ParserAndConvertor.ParseToInstant(recive.getDateFinish());
			Instant startDateParsed = ParserAndConvertor.ParseToInstant(recive.getDateStart());
			List<ControllerResults> report = controllerResultRepos.getControllerResultByEndTimeBetween(startDateParsed,
																																																 endDateParsed);
			List<PdfModel> pdf = ParserAndConvertor.RegularReportToPdfModel(report, recive.getAttributes(),
																																			recive.getPlates());
			String name = createPDF.createSheet(pdf);

			sendMailFileService.SendPdfOnMail(recive.getEmails(), name);
		} catch(Exception e) {
			e.printStackTrace();
		}


	}


}
