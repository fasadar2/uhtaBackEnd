package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "OBJECT_TYPE_COLLECTIONS")
public class ObjectTypeCollection {
    @EmbeddedId
    private ObjectTypeCollectionId id;

    @MapsId("objectTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OBJECT_TYPE_ID", nullable = false)
    private ObjectType objectType;

    @MapsId("collectionId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COLLECTION_ID", nullable = false)
    private Collection collection;



}