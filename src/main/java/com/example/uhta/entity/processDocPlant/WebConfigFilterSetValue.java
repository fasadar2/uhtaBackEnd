package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "WebConfigFilterSetValues")
public class WebConfigFilterSetValue {
    @EmbeddedId
    private WebConfigFilterSetValueId id;

    @MapsId("filterSetID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "FilterSetID", nullable = false)
    private WebConfigFilterSetDefinition filterSetID;

    @MapsId("filterID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FilterID", nullable = false)
    private WebConfigFilterDefinition filterID;

    @Nationalized
    @Column(name = "FilterValue", length = 3000)
    private String filterValue;



}