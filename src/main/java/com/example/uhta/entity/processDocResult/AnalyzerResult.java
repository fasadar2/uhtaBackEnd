package com.example.uhta.entity.processDocResult;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "AnalyzerResults")
public class AnalyzerResult {
    @Id
    @Column(name = "ResultID", nullable = false)
    private Integer resultID;

    @Column(name = "ObjectName", length = 50)
    private String objectName;

    @Column(name = "Analysis", length = 100)
    private String analysis;

    @Column(name = "Project", length = 100)
    private String project;

    @Column(name = "StartTime")
    private Instant startTime;

    @Column(name = "EndTime")
    private Instant endTime;

    @Column(name = "HiLimit")
    private Double hiLimit;

    @Column(name = "LowLimit")
    private Double lowLimit;

    @Column(name = "HiLowReset")
    private Integer hiLowReset;

    @Column(name = "HiLowErrors")
    private Integer hiLowErrors;

    @Column(name = "HiLowTracking")
    private Double hiLowTracking;

    @Column(name = "SpikeTracking")
    private Double spikeTracking;

    @Column(name = "SpikeTolerance")
    private Double spikeTolerance;

    @Column(name = "SpikeErrors")
    private Integer spikeErrors;

    @Column(name = "SpikeReset")
    private Integer spikeReset;

    @Column(name = "FreezeTracking")
    private Double freezeTracking;

    @Column(name = "FreezeTolerance")
    private Double freezeTolerance;

    @Column(name = "FreezeAllowed")
    private Integer freezeAllowed;

    @Column(name = "FreezeErrors")
    private Integer freezeErrors;

    @Column(name = "FreezeReset")
    private Integer freezeReset;

    @Column(name = "ROCTracking")
    private Double rOCTracking;

    @Column(name = "ROCTolerance")
    private Double rOCTolerance;

    @Column(name = "ROCErrors")
    private Integer rOCErrors;

    @Column(name = "ROCReset")
    private Integer rOCReset;

    @Column(name = "SamplePeriod")
    private Double samplePeriod;

    @Column(name = "ErrorMessage", length = 4000)
    private String errorMessage;

    @Column(name = "MeanPV")
    private Double meanPV;

    @Column(name = "StdPV")
    private Double stdPV;

    @Column(name = "SF")
    private Double sf;

    @Column(name = "PVOutsideLimits")
    private Double pVOutsideLimits;

    @Column(name = "Weight")
    private Double weight;



}