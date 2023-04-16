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
public class WebConfigTreemapColorOptionId implements Serializable {
    private static final long serialVersionUID = -1343177242543838660L;
    @Column(name = "ColorID", nullable = false)
    private Integer colorID;

    @Column(name = "ColorOrder", nullable = false)
    private Integer colorOrder;



}