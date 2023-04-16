package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "METHOD_COLLECTIONS")
public class MethodCollection {
    @EmbeddedId
    private MethodCollectionId id;

    @MapsId("methodId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "METHOD_ID", nullable = false)
    private Method method;

    @MapsId("collectionId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COLLECTION_ID", nullable = false)
    private Collection collection;



}