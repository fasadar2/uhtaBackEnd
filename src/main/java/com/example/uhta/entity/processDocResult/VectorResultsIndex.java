package com.example.uhta.entity.processDocResult;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.Instant;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class VectorResultsIndex {
    @Id
    @Column(name = "Project", length = 100)
    private String project;

    @Column(name = "Analysis", length = 100)
    private String analysis;

    @Column(name = "ObjectName", length = 50)
    private String objectName;

    @Column(name = "VectorType", length = 30)
    private String vectorType;

    @Column(name = "EndTime")
    private Instant endTime;

    @Column(name = "\"Table\"", length = 100)
    private String table;

    @Column(name = "\"Index\"", nullable = false)
    private Integer index;



}