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
public class WebConfigTreemapCellLabelId implements Serializable {
    private static final long serialVersionUID = 893046427171065958L;
    @Column(name = "TreemapID", nullable = false)
    private Integer treemapID;

    @Column(name = "CellLabel", nullable = false, length = 50)
    private String cellLabel;



}