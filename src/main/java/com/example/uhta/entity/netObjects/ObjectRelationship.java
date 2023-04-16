package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "OBJECT_RELATIONSHIPS")
public class ObjectRelationship {
    @EmbeddedId
    private ObjectRelationshipId id;

    @MapsId("relatedObjectId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RELATED_OBJECT_ID", nullable = false)
    private Object relatedObject;

    @MapsId("parentObjectId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PARENT_OBJECT_ID", nullable = false)
    private Object parentObject;

    @MapsId("relationshipTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RELATIONSHIP_TYPE_ID", nullable = false)
    private RelationshipType relationshipType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "NEXTSIBLINGID")
    private Object nextsiblingid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PREVSIBLINGID")
    private Object prevsiblingid;



}