package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WebConfigTreemapColors")
public class WebConfigTreemapColor {
    @Id
    @Column(name = "ColorID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TreemapID", nullable = false)
    private WebConfigTreemapDefinition treemapID;

    @Column(name = "ColorName", nullable = false, length = 50)
    private String colorName;

    @Column(name = "Parameter", nullable = false, length = 50)
    private String parameter;


}