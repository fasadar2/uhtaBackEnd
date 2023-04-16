package com.example.uhta.entity.processDocResult;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MVResults")
public class MVResult {
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

    @Column(name = "ServiceFactor")
    private Double serviceFactor;

    @Column(name = "EffServiceFactor")
    private Double effServiceFactor;

    @Column(name = "OptimizationTime")
    private Double optimizationTime;

    @Column(name = "LimitTracking")
    private Double limitTracking;

    @Column(name = "MoveSizeLimit")
    private Double moveSizeLimit;

    @Column(name = "RPI")
    private Double rpi;

    @Column(name = "OscillationIndex")
    private Double oscillationIndex;

    @Column(name = "OscillationPeriod")
    private Double oscillationPeriod;

    @Column(name = "Saturation")
    private Double saturation;

    @Column(name = "SaturationHigh")
    private Double saturationHigh;

    @Column(name = "SaturationLow")
    private Double saturationLow;

    @Column(name = "LimitChanges")
    private Double limitChanges;

    @Column(name = "HighLimit")
    private Double highLimit;

    @Column(name = "LowLimit")
    private Double lowLimit;

    @Column(name = "HighLimitViolation")
    private Double highLimitViolation;

    @Column(name = "LowLimitViolation")
    private Double lowLimitViolation;

    @Column(name = "Utilization")
    private Integer utilization;

    @Column(name = "EffectiveUtilization")
    private Integer effectiveUtilization;

    @Column(name = "HighLimitHistory")
    private Integer highLimitHistory;

    @Column(name = "LowLimitHistory")
    private Integer lowLimitHistory;

    @Column(name = "SteadyState")
    private Integer steadyState;

    @Column(name = "MV")
    private Integer mv;

    @Column(name = "FutureValue")
    private Integer futureValue;

    @Column(name = "MovesizeHigh")
    private Integer movesizeHigh;

    @Column(name = "MovesizeLow")
    private Integer movesizeLow;

    @Column(name = "Movesize")
    private Integer movesize;

    @Column(name = "Optimization", length = 20)
    private String optimization;

    @Column(name = "CVUtilization")
    private Integer cVUtilization;

    @Column(name = "StdDev")
    private Double stdDev;

    @Column(name = "Objective", length = 50)
    private String objective;

    @Column(name = "CVCorrelation")
    private Integer cVCorrelation;

    @Column(name = "Gain")
    private Integer gain;

    @Column(name = "Mean")
    private Float mean;

    @Column(name = "ErrorMessage", length = 4000)
    private String errorMessage;


}