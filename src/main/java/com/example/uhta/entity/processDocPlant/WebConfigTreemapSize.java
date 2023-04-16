package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WebConfigTreemapSizes")
public class WebConfigTreemapSize {
    @EmbeddedId
    private WebConfigTreemapSizeId id;

    @MapsId("treemapID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TreemapID", nullable = false)
    private WebConfigTreemapDefinition treemapID;

    @Column(name = "Parameter", nullable = false, length = 50)
    private String parameter;

    @Column(name = "IsInverted", nullable = false)
    private Boolean isInverted = false;

    @Column(name = "SizeRatio")
    private Integer sizeRatio;



}