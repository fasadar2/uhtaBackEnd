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
@Table(name = "DetailedReportSettings")
public class DetailedReportSetting {
    @EmbeddedId
    private DetailedReportSettingId id;

    @Column(name = "PropertyValue", nullable = false, length = 100)
    private String propertyValue;

}