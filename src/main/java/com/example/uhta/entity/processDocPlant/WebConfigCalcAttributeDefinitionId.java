package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class WebConfigCalcAttributeDefinitionId implements Serializable {
    private static final long serialVersionUID = 8687117382877216655L;
    @Column(name = "ObjectType", nullable = false, length = 50)
    private String objectType;

    @Column(name = "AttributeName", nullable = false, length = 100)
    private String attributeName;


}