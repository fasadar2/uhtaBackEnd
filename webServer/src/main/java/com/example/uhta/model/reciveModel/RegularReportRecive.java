package com.example.uhta.model.reciveModel;

import com.example.uhta.model.requestModel.AttributeModel;
import com.example.uhta.model.requestModel.PlateModel;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegularReportRecive {
    List<PlateModel> plates;
    List<AttributeModel> attributes;
    List<String> emails;
    String dateStart;
    String dateFinish;
}
