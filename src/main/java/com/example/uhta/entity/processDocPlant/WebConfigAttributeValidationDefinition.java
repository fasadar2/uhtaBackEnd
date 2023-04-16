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
@Table(name = "WebConfigAttributeValidationDefinitions")
public class WebConfigAttributeValidationDefinition {
    @Id
    @Column(name = "AttributeValidationDefinitionID", nullable = false)
    private Integer id;

    @Column(name = "ObjectType", nullable = false, length = 50)
    private String objectType;

    @Column(name = "AttributeName", nullable = false, length = 100)
    private String attributeName;

    @Column(name = "Operation", nullable = false, length = 15)
    private String operation;

    @Column(name = "Operand", length = 100)
    private String operand;

    @Column(name = "ErrorString", length = 100)
    private String errorString;



}