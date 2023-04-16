package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WebConfigTreemapMenuOptions")
public class WebConfigTreemapMenuOption {
    @EmbeddedId
    private WebConfigTreemapMenuOptionId id;

    @MapsId("treemapID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TreemapID", nullable = false)
    private WebConfigTreemapDefinition treemapID;

    @Column(name = "MenuItemName", nullable = false, length = 50)
    private String menuItemName;

    @Column(name = "MenuItemAction", length = 350)
    private String menuItemAction;



}