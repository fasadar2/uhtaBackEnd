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
public class WebConfigTreemapMenuOptionId implements Serializable {
    private static final long serialVersionUID = -6501962379872109653L;
    @Column(name = "TreemapID", nullable = false)
    private Integer treemapID;

    @Column(name = "MenuOrder", nullable = false)
    private Integer menuOrder;



}