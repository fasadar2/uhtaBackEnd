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
@Table(name = "DVResults")
public class DVResult {
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

    @Column(name = "OutputFile")
    private String outputFile;

    @Column(name = "ServiceFactor")
    private Double serviceFactor;

    @Column(name = "OscillationIndex")
    private Double oscillationIndex;

    @Column(name = "OscillationPeriod")
    private Double oscillationPeriod;

    @Column(name = "StdDev")
    private Float stdDev;

    @Column(name = "Mean")
    private Float mean;

    @Column(name = "ErrorMessage", length = 4000)
    private String errorMessage;

    @Column(name = "CVUtilization")
    private Integer cVUtilization;


}