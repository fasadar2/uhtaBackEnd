package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class WebConfigTreemapMOSpecification {
    @EmbeddedId
    private WebConfigTreemapMOSpecificationId id;

    @MapsId("treemapID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TreemapID", nullable = false)
    private WebConfigTreemapDefinition treemapID;

    @Column(name = "LineType", nullable = false, length = 50)
    private String lineType;

    @Column(name = "LineValue", length = 50)
    private String lineValue;

    @Column(name = "LineColor", length = 6)
    private String lineColor;

    @Column(name = "Justification", length = 10)
    private String justification;

    @Column(name = "LineWidth")
    private Integer lineWidth;

    @Column(name = "LineBolded")
    private Boolean lineBolded;

    @Column(name = "PercentWidth")
    private Double percentWidth;

    @Column(name = "NoDataMessage", length = 50)
    private String noDataMessage;

    @Column(name = "ValuePrecision")
    private Integer valuePrecision;


}