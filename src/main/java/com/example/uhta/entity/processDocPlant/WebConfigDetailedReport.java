package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WebConfigDetailedReports")
public class WebConfigDetailedReport {
    @Id
    @Column(name = "ObjectType", nullable = false, length = 100)
    private String objectType;

    @Column(name = "ViewName", length = 100)
    private String viewName;

    @Column(name = "ReportName", length = 100)
    private String reportName;



}