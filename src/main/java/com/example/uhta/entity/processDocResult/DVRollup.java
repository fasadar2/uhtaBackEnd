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
@Table(name = "DVRollups")
public class DVRollup {
    @EmbeddedId
    private DVRollupId id;

    @Column(name = "ObjectName", nullable = false, length = 100)
    private String objectName;

    @Column(name = "\"Oscillation Index\"")
    private Double oscillationIndex;

    @Column(name = "\"Oscillation Index (% high)\"")
    private Double oscillationIndexHigh;

    @Column(name = "\"Service Factor\"")
    private Double serviceFactor;

    @Column(name = "\"Service Factor (% low)\"")
    private Double serviceFactorLow;

    @Column(name = "IsDispositionRow")
    private Boolean isDispositionRow;

}