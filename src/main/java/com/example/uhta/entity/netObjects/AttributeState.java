package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ATTRIBUTE_STATES")
public class AttributeState {
    @Id
    @Column(name = "ATTRIBUTE_ID", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_ID", nullable = false)
    private Attribute attributes;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STATE_ID", nullable = false)
    private State state;



}