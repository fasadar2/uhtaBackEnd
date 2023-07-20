package com.example.uhta.model.reciveModel;

import com.example.uhta.model.UserModel;
import com.example.uhta.model.requestModel.AttributeModel;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class PatternModel {
    private Integer id;
    private String title;
    private String description;
    private UserModel user;
    private String date;
    private String frequency;
    private boolean isActive;
    private List<AttributeModel> attributes;
}
