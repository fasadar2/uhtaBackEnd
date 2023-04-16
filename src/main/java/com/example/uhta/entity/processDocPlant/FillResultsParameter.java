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
@Table(name = "FillResultsParameters")
public class FillResultsParameter {
    @Id
    @Column(name = "FillResultsID", nullable = false)
    private Integer fillResultsID;

    @Column(name = "TemplateClass", nullable = false, length = 100)
    private String templateClass;

    @Column(name = "Subobject", length = 50)
    private String subobject;

    @Column(name = "SourceElement", nullable = false, length = 50)
    private String sourceElement;

    @Column(name = "SourceOption", length = 50)
    private String sourceOption;

    @Column(name = "SourceTable", length = 100)
    private String sourceTable;

    @Column(name = "SourceColumn", length = 100)
    private String sourceColumn;

    @Column(name = "SourceValue", length = 50)
    private String sourceValue;

    @Column(name = "Operation", length = 20)
    private String operation;

    @Column(name = "ReferenceColumn", length = 100)
    private String referenceColumn;

    @Column(name = "ReferenceRow", length = 100)
    private String referenceRow;

    @Column(name = "DestinationTable", nullable = false, length = 100)
    private String destinationTable;

    @Column(name = "DestinationColumn", nullable = false, length = 50)
    private String destinationColumn;

    @Column(name = "UniqueRowKeyColumn", nullable = false)
    private Boolean uniqueRowKeyColumn = false;


}