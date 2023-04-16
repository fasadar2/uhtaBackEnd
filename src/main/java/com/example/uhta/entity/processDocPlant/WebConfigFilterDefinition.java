package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WebConfigFilterDefinitions")
public class WebConfigFilterDefinition {
    @Id
    @Column(name = "FilterID", nullable = false)
    private Integer id;

    @Column(name = "ColumnName", nullable = false, length = 50)
    private String columnName;

    @Column(name = "FilterType", nullable = false, length = 50)
    private String filterType;

    @Column(name = "IsDisplayed", nullable = false)
    private Boolean isDisplayed = false;



}