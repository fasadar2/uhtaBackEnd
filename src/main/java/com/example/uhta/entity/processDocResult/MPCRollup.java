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
@Table(name = "MPCRollups")
public class MPCRollup {
    @EmbeddedId
    private MPCRollupId id;

    @Column(name = "ObjectName", nullable = false, length = 100)
    private String objectName;

    @Column(name = "\"Model Quality Index\"")
    private Double modelQualityIndex;

    @Column(name = "\"Model Quality Index (% high)\"")
    private Double modelQualityIndexHigh;

    @Column(name = "\"Model Quality Index (% low)\"")
    private Double modelQualityIndexLow;

    @Column(name = "\"MV Effective Service Factor\"")
    private Double mVEffectiveServiceFactor;

    @Column(name = "\"Service Factor\"")
    private Double serviceFactor;

    @Column(name = "\"Service Factor (% low)\"")
    private Double serviceFactorLow;

    @Column(name = "IsDispositionRow")
    private Boolean isDispositionRow;


}