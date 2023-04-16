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
@Table(name = "InstrumentRollups")
public class InstrumentRollup {
    @EmbeddedId
    private InstrumentRollupId id;

    @Column(name = "ObjectName", nullable = false, length = 100)
    private String objectName;

    @Column(name = "\"Service Factor\"")
    private Double serviceFactor;

    @Column(name = "\"Service Factor (% low)\"")
    private Double serviceFactorLow;

    @Column(name = "IsDispositionRow")
    private Boolean isDispositionRow;


}