package com.example.uhta.model.reciveModel;


import com.example.uhta.model.UserModel;
import com.example.uhta.model.requestModel.AttributeModel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class PatternModel {
    private Integer id;
    private String title;
    private String description;
    private UserModel user;
    private String date;
    private Integer frequency;
    @JsonProperty("isActive")
    private Boolean isActive;

    private List<AttributeModel> attributes;

}
