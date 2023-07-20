package com.example.uhta.model.requestModel;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AttributeModel {
    private Integer id;
    private String title;
    private String description;
}
