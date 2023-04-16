package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "OBJECT_TYPE_RELATIONSHIPS")
public class ObjectTypeRelationship {
    @EmbeddedId
    private ObjectTypeRelationshipId id;

    @MapsId("objectTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OBJECT_TYPE_ID", nullable = false)
    private ObjectType objectType;

    @MapsId("parentObjectTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PARENT_OBJECT_TYPE_ID", nullable = false)
    private ObjectType parentObjectType;

    @MapsId("relationshipTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RELATIONSHIP_TYPE_ID", nullable = false)
    private RelationshipType relationshipType;

    @Column(name = "MULTIPLES", nullable = false)
    private Integer multiples;



}