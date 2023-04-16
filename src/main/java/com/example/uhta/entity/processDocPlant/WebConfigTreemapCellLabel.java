package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WebConfigTreemapCellLabels")
public class WebConfigTreemapCellLabel {
    @EmbeddedId
    private WebConfigTreemapCellLabelId id;

    @MapsId("treemapID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TreemapID", nullable = false)
    private WebConfigTreemapDefinition treemapID;

    @Column(name = "LabelDefinition", length = 50)
    private String labelDefinition;


}