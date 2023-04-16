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
@Table(name = "WebConfigMetaData")
public class WebConfigMetaDatum {
    @Id
    @Column(name = "ObjectType", length = 100)
    private String objectType;

    @Column(name = "AttributeName", length = 100)
    private String attributeName;

    @Column(name = "Type", length = 10)
    private String type;

    @Column(name = "DatabaseName", length = 50)
    private String databaseName;

    @Column(name = "TableName", length = 50)
    private String tableName;

    @Column(name = "ColumnName", length = 50)
    private String columnName;

    @Column(name = "ReferenceColumn", length = 50)
    private String referenceColumn;

    @Column(name = "ParentColumn", length = 50)
    private String parentColumn;

    @Column(name = "DateColumn", length = 50)
    private String dateColumn;

    @Column(name = "AggregateFunction", length = 10)
    private String aggregateFunction;

    @Column(name = "IncludeInSummary")
    private Boolean includeInSummary;

    @Column(name = "IncludeInRollups")
    private Boolean includeInRollups;

    @Column(name = "DateRangeFunction", length = 50)
    private String dateRangeFunction;



}