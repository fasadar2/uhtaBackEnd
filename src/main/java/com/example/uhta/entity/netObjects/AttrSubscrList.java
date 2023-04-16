package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ATTR_SUBSCR_LIST")
public class AttrSubscrList {
    @EmbeddedId
    private AttrSubscrListId id;

    @MapsId("methodId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "METHOD_ID", nullable = false)
    private Method method;

    @MapsId("attributeTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_TYPE_ID", nullable = false)
    private AttributeType attributeType;

    @Column(name = "LEVELS_UP", nullable = false)
    private Integer levelsUp;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OBJECT_TYPE_ID", nullable = false)
    private ObjectType objectType;



}