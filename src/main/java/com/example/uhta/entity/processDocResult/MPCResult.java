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
@Table(name = "MPCResults")
public class MPCResult {
    @Id
    @Column(name = "ResultID", nullable = false)
    private Integer resultID;

    @Column(name = "ObjectName", length = 50)
    private String objectName;

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

    @Column(name = "APCType", length = 15)
    private String aPCType;

    @Column(name = "Weight")
    private Double weight;

    @Column(name = "ServiceFactor")
    private Double serviceFactor;

    @Column(name = "CVServiceFactor")
    private Double cVServiceFactor;

    @Column(name = "MVServiceFactor")
    private Double mVServiceFactor;

    @Column(name = "DVServiceFactor")
    private Double dVServiceFactor;

    @Column(name = "OptimizerService")
    private Double optimizerService;

    @Column(name = "EffOptimizerService")
    private Double effOptimizerService;

    @Column(name = "CVLimitGiveup")
    private Double cVLimitGiveup;

    @Column(name = "MVLimitTracking")
    private Double mVLimitTracking;

    @Column(name = "CVRPI")
    private Double cvrpi;

    @Column(name = "MVRPI")
    private Double mvrpi;

    @Column(name = "ModelIndex")
    private Double modelIndex;

    @Column(name = "RPI")
    private Double rpi;

    @Column(name = "EconomicBenefit")
    private Double economicBenefit;

    @Column(name = "CVEffServiceFactor")
    private Double cVEffServiceFactor;

    @Column(name = "MVEffServiceFactor")
    private Double mVEffServiceFactor;

    @Column(name = "ControllerUtilization")
    private Integer controllerUtilization;

    @Column(name = "CVUtilization")
    private Integer cVUtilization;

    @Column(name = "MVUtilization")
    private Integer mVUtilization;

    @Column(name = "LimitChangeHistory")
    private Integer limitChangeHistory;

    @Column(name = "LVLimitGiveup")
    private Float lVLimitGiveup;

    @Column(name = "ErrorMessage", length = 4000)
    private String errorMessage;


}