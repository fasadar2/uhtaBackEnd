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
public class WebConfigTreemapMOSpecificationId implements Serializable {
    private static final long serialVersionUID = 4198595913574492645L;
    @Column(name = "TreemapID", nullable = false)
    private Integer treemapID;

    @Column(name = "LineName", nullable = false, length = 50)
    private String lineName;

    @Column(name = "LineOrder", nullable = false)
    private Integer lineOrder;



}