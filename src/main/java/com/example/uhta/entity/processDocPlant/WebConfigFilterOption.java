package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WebConfigFilterOptions")
public class WebConfigFilterOption {
    @EmbeddedId
    private WebConfigFilterOptionId id;

    @MapsId("filterID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FilterID", nullable = false)
    private WebConfigFilterDefinition filterID;

    @Column(name = "OptionType", length = 50)
    private String optionType;

    @Column(name = "OptionOrder", nullable = false)
    private Integer optionOrder;



}