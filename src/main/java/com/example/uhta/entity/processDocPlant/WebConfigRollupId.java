package com.example.uhta.entity.processDocPlant;

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
public class WebConfigRollupId implements Serializable {
    private static final long serialVersionUID = 6386125266884881011L;
    @Column(name = "ModelType", nullable = false, length = 100)
    private String modelType;

    @Column(name = "AttributeName", nullable = false, length = 100)
    private String attributeName;



}