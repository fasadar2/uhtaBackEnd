package com.example.uhta.entity.processDocResult;

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
public class DetailedReportSettingId implements Serializable {
    private static final long serialVersionUID = -216515460002876097L;
    @Column(name = "UserID", nullable = false, length = 50)
    private String userID;

    @Column(name = "Project", nullable = false, length = 100)
    private String project;

    @Column(name = "Analysis", nullable = false, length = 100)
    private String analysis;

    @Column(name = "ControllerName", nullable = false, length = 50)
    private String controllerName;

    @Column(name = "ObjectName", nullable = false, length = 50)
    private String objectName;

    @Column(name = "PropertyName", nullable = false, length = 50)
    private String propertyName;

}