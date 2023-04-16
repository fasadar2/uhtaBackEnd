package com.example.uhta.entity.processDocResult;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "EstimatorResults")
public class EstimatorResult {
    @Id
    @Column(name = "ResultID", nullable = false)
    private Integer resultID;

    @Column(name = "ObjectName", length = 50)
    private String objectName;

    @Column(name = "Project", length = 100)
    private String project;

    @Column(name = "Analysis", length = 100)
    private String analysis;

    @Column(name = "StartTime")
    private Instant startTime;

    @Column(name = "EndTime")
    private Instant endTime;

    @Column(name = "FeedbackFilter")
    private Double feedbackFilter;

    @Column(name = "AcceptedSamples")
    private Integer acceptedSamples;

    @Column(name = "AvgError")
    private Double avgError;

    @Column(name = "CumError")
    private Double cumError;

    @Column(name = "OutsideCI")
    private Integer outsideCI;

    @Column(name = "ModelIndex")
    private Double modelIndex;

    @Column(name = "InputSignals")
    private Integer inputSignals;

    @Column(name = "ErrorMessage", length = 4000)
    private String errorMessage;


}