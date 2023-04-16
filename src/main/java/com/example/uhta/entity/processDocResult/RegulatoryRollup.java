package com.example.uhta.entity.processDocResult;

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
@Table(name = "RegulatoryRollups")
public class RegulatoryRollup {
    @EmbeddedId
    private RegulatoryRollupId id;

    @Column(name = "ObjectName", nullable = false, length = 100)
    private String objectName;

    @Column(name = "\"ARC 4 Compare\"")
    private Double aRC4Compare;

    @Column(name = "\"Count ARC 3 Compare\"")
    private Double countARC3Compare;

    @Column(name = "\"Count: No Disposition\"")
    private Double countNoDisposition;

    @Column(name = "\"Count: Requires Attention Group\"")
    private Double countRequiresAttentionGroup;

    @Column(name = "\"Count: Returned to Normal Group\"")
    private Double countReturnedToNormalGroup;

    @Column(name = "\"Count: Waiting for Confirmation Group\"")
    private Double countWaitingForConfirmationGroup;

    @Column(name = "\"Count: Waiting on Report Group\"")
    private Double countWaitingOnReportGroup;

    @Column(name = "\"Effective Service Factor\"")
    private Double effectiveServiceFactor;

    @Column(name = "\"Effective Service Factor (% low)\"")
    private Double effectiveServiceFactorLow;

    @Column(name = "\"Oscillation Index\"")
    private Double oscillationIndex;

    @Column(name = "\"Oscillation Index (% high)\"")
    private Double oscillationIndexHigh;

    @Column(name = "\"Percent Saturation (% high)\"")
    private Double percentSaturationHigh;

    @Column(name = "\"Regulatory Count\"")
    private Double regulatoryCount;

    @Column(name = "\"Required Hours Compare\"")
    private Double requiredHoursCompare;

    @Column(name = "RPI")
    private Double rpi;

    @Column(name = "\"RPI (% high)\"")
    private Double rPIHigh;

    @Column(name = "\"RPI (% low)\"")
    private Double rPILow;

    @Column(name = "\"Service Factor\"")
    private Double serviceFactor;

    @Column(name = "\"Service Factor (% low)\"")
    private Double serviceFactorLow;

    @Column(name = "Stiction")
    private Double stiction;

    @Column(name = "\"Stiction (# high)\"")
    private Double stictionHigh;

    @Column(name = "\"Sum ARC Benchmark 4\"")
    private Double sumARCBenchmark4;

    @Column(name = "\"Sum Required Hours\"")
    private Double sumRequiredHours;

    @Column(name = "IsDispositionRow")
    private Boolean isDispositionRow;


}