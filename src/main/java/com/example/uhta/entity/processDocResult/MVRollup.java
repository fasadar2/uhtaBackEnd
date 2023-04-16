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
@Table(name = "MVRollups")
public class MVRollup {
    @EmbeddedId
    private MVRollupId id;

    @Column(name = "ObjectName", nullable = false, length = 100)
    private String objectName;

    @Column(name = "\"Effective Service Factor\"")
    private Double effectiveServiceFactor;

    @Column(name = "\"Effective Service Factor (% low)\"")
    private Double effectiveServiceFactorLow;

    @Column(name = "\"Oscillation Index\"")
    private Double oscillationIndex;

    @Column(name = "\"Oscillation Index (% high)\"")
    private Double oscillationIndexHigh;

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

    @Column(name = "IsDispositionRow")
    private Boolean isDispositionRow;


}