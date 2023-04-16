package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class WebConfigCalcAggregateFunction {
    @Id
    @Column(name = "CalcAttributeName", nullable = false, length = 100)
    private String calcAttributeName;

    @Column(name = "AttributeName", nullable = false, length = 100)
    private String attributeName;

    @Column(name = "TableName", nullable = false, length = 50)
    private String tableName;

    @Column(name = "OriginalAggregateFunction", nullable = false, length = 10)
    private String originalAggregateFunction;

    @Column(name = "ModifiedAggregateFunction", nullable = false, length = 10)
    private String modifiedAggregateFunction;



}