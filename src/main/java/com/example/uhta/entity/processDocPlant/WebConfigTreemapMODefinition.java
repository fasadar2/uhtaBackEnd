package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class WebConfigTreemapMODefinition {
    @Id
    @Column(name = "TreemapID", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TreemapID", nullable = false)
    private WebConfigTreemapDefinition webConfigTreemapDefinition;

    @Column(name = "MODefinition", length = 50)
    private String mODefinition;


}