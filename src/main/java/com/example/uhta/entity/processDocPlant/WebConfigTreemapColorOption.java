package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WebConfigTreemapColorOptions")
public class WebConfigTreemapColorOption {
    @EmbeddedId
    private WebConfigTreemapColorOptionId id;

    @MapsId("colorID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ColorID", nullable = false)
    private WebConfigTreemapColor colorID;

    @Column(name = "Color", nullable = false, length = 6)
    private String color;

    @Column(name = "ParamValue", nullable = false)
    private Double paramValue;

    @Column(name = "Label", length = 50)
    private String label;



}