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
@Table(name = "WebConfigRollups")
public class WebConfigRollup {
    @EmbeddedId
    private WebConfigRollupId id;

    @Column(name = "Type", nullable = false, length = 10)
    private String type;

    @Column(name = "ColumnName", length = 50)
    private String columnName;

    @Column(name = "AggregateFunction", nullable = false, length = 20)
    private String aggregateFunction;

    @Column(name = "AggregateAttribute", nullable = false, length = 100)
    private String aggregateAttribute;

}