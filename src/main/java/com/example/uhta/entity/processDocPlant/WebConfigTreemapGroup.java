package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WebConfigTreemapGroups")
public class WebConfigTreemapGroup {
    @Id
    @Column(name = "GroupID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TreemapID", nullable = false)
    private WebConfigTreemapDefinition treemapID;

    @Column(name = "GroupName", nullable = false, length = 50)
    private String groupName;

    @Column(name = "Parameter", nullable = false, length = 50)
    private String parameter;

    @Column(name = "ZoomToGroup", length = 50)
    private String zoomToGroup;



}