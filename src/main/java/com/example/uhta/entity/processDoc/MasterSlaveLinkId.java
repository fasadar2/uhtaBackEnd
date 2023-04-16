package com.example.uhta.entity.processDoc;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class MasterSlaveLinkId implements Serializable {
    private static final long serialVersionUID = 2857157015691919765L;
    @Column(name = "MasterProjectName", nullable = false, length = 100)
    private String masterProjectName;

    @Column(name = "MasterAnalysisName", nullable = false, length = 100)
    private String masterAnalysisName;

    @Column(name = "MasterControllerName", nullable = false, length = 100)
    private String masterControllerName;

    @Column(name = "SlaveProjectName", nullable = false, length = 100)
    private String slaveProjectName;

    @Column(name = "SlaveAnalysisName", nullable = false, length = 100)
    private String slaveAnalysisName;

    @Column(name = "SlaveControllerName", nullable = false, length = 100)
    private String slaveControllerName;



}