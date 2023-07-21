package com.example.uhta.model.reciveModel;

import com.example.uhta.entity.uhtaDb.Attribute;
import com.example.uhta.model.requestModel.AttributeModel;
import com.example.uhta.model.requestModel.PlateModel;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class regularReportRecive {
    List<PlateModel> plateModels;
    List<AttributeModel> attributeModels;
    List<String> emails;
    String dateStart;
    String dateFinish;


}
