package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WebConfigCalcAttributeDefinitions")
public class WebConfigCalcAttributeDefinition {
    @EmbeddedId
    private WebConfigCalcAttributeDefinitionId id;

    @Column(name = "Type", nullable = false, length = 15)
    private String type;

    @Column(name = "SubAttribute", length = 100)
    private String subAttribute;

    @Column(name = "ForwardCalc", length = 50)
    private String forwardCalc;

    @Column(name = "ReverseCalc", length = 50)
    private String reverseCalc;

    @Column(name = "LowLimitCalc", length = 50)
    private String lowLimitCalc;

    @Column(name = "HighLimitCalc", length = 50)
    private String highLimitCalc;

    @Column(name = "IncludeInSummary", nullable = false)
    private Boolean includeInSummary = false;

    @Column(name = "IncludeInRollups")
    private Boolean includeInRollups;



}