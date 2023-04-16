package com.example.uhta.entity.processDoc;

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
@Table(name = "AnalysisElementConnections")
public class AnalysisElementConnection {
    @Id
    @Column(name = "ConnectionID", nullable = false)
    private Integer id;

    @Column(name = "ElementID", nullable = false)
    private Integer elementID;

    @Column(name = "AnalysisResultID", nullable = false)
    private Integer analysisResultID;

    @Column(name = "ColumnName", nullable = false, length = 100)
    private String columnName;

    @Column(name = "UpstreamElementID", nullable = false)
    private Integer upstreamElementID;

    @Column(name = "UpstreamAnalysisResultID", nullable = false)
    private Integer upstreamAnalysisResultID;

    @Column(name = "UpstreamColumnName", nullable = false, length = 100)
    private String upstreamColumnName;



}