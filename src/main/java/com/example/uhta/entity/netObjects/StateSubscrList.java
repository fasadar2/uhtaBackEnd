package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "STATE_SUBSCR_LIST")
public class StateSubscrList {
    @EmbeddedId
    private StateSubscrListId id;

    @MapsId("methodId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "METHOD_ID", nullable = false)
    private Method method;

    @MapsId("stateId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STATE_ID", nullable = false)
    private State state;

    @Column(name = "LEVELS_UP", nullable = false)
    private Integer levelsUp;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OBJECT_TYPE_ID", nullable = false)
    private ObjectType objectType;



}