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
@Table(name = "LVResults")
public class LVResult {
    @Id
    @Column(name = "ResultID", nullable = false)
    private Integer resultID;

    @Column(name = "ControllerName", length = 50)
    private String controllerName;

    @Column(name = "ObjectName", length = 50)
    private String objectName;

    @Column(name = "TagOrder")
    private Integer tagOrder;

    @Column(name = "ElementID", nullable = false)
    private Integer elementID;

    @Column(name = "Analysis", length = 100)
    private String analysis;

    @Column(name = "Project", length = 100)
    private String project;

    @Column(name = "StartTime")
    private Instant startTime;

    @Column(name = "EndTime")
    private Instant endTime;

    @Column(name = "OutputFile")
    private String outputFile;

    @Column(name = "ServiceFactor")
    private Double serviceFactor;

    @Column(name = "OscillationIndex")
    private Double oscillationIndex;

    @Column(name = "OscillationPeriod")
    private Double oscillationPeriod;

    @Column(name = "EffServiceFactor")
    private Double effServiceFactor;

    @Column(name = "ModelIndex")
    private Double modelIndex;

    @Column(name = "MVCorrelation")
    private Integer mVCorrelation;

    @Column(name = "NLI")
    private Double nli;

    @Column(name = "PhaseIndex")
    private Double phaseIndex;

    @Column(name = "StdDev")
    private Float stdDev;

    @Column(name = "Mean")
    private Float mean;

    @Column(name = "HighLimitViolation")
    private Float highLimitViolation;

    @Column(name = "LowLimitViolation")
    private Float lowLimitViolation;

    @Column(name = "LimitGiveup")
    private Float limitGiveup;

    @Column(name = "Gain")
    private Integer gain;

    @Column(name = "FrequencyResponsePV")
    private Integer frequencyResponsePV;

    @Column(name = "FrequencyResponsePred")
    private Integer frequencyResponsePred;

    @Column(name = "AutoCorrelation")
    private Integer autoCorrelation;

    @Column(name = "AverageViolation")
    private Float averageViolation;

    @Column(name = "PeakViolation")
    private Float peakViolation;

    @Column(name = "HighLimit")
    private Float highLimit;

    @Column(name = "LowLimit")
    private Float lowLimit;

    @Column(name = "LimitChanges")
    private Float limitChanges;

    @Column(name = "ErrorMessage", length = 4000)
    private String errorMessage;


}