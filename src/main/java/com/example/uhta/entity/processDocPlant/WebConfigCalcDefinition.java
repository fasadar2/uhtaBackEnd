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
@Table(name = "WebConfigCalcDefinitions")
public class WebConfigCalcDefinition {
    @Id
    @Column(name = "Name", nullable = false, length = 50)
    private String id;

    @Column(name = "Operator", nullable = false, length = 50)
    private String operator;

    @Column(name = "Type1", length = 15)
    private String type1;

    @Column(name = "Operand1", length = 1000)
    private String operand1;

    @Column(name = "Type2", length = 15)
    private String type2;

    @Column(name = "Operand2", length = 1000)
    private String operand2;

    @Column(name = "Type3", length = 15)
    private String type3;

    @Column(name = "Operand3", length = 1000)
    private String operand3;

    @Column(name = "Comment", length = 1000)
    private String comment;



}