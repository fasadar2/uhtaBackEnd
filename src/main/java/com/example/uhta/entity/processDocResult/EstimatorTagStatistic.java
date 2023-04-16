package com.example.uhta.entity.processDocResult;

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
@Table(name = "EstimatorTagStatistics")
public class EstimatorTagStatistic {
    @Column(name = "\"Index\"")
    private Integer index;
@Id
    @Column(name = "UniqueID")
    private Integer uniqueID;

    @Column(name = "Tag", length = 100)
    private String tag;

    @Column(name = "\"Service Factor\"")
    private Double serviceFactor;

    @Column(name = "\"Correlation to Error\"")
    private Double correlationToError;

}