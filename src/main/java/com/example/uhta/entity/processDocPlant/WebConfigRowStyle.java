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
@Table(name = "WebConfigRowStyles")
public class WebConfigRowStyle {
    @Id
    @Column(name = "AttributeName", nullable = false, length = 50)
    private String attributeName;

    @Column(name = "AttributeValue", nullable = false, length = 100)
    private String attributeValue;

    @Column(name = "NotEqual", nullable = false)
    private Boolean notEqual = false;

    @Column(name = "CssProperty", nullable = false, length = 50)
    private String cssProperty;

    @Column(name = "CssValue", nullable = false, length = 50)
    private String cssValue;

    @Column(name = "Rank", nullable = false)
    private Integer rank;


}