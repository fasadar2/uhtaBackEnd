package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "VIEW_COLLECTIONS")
public class ViewCollection {
    @EmbeddedId
    private ViewCollectionId id;

    @MapsId("viewId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VIEW_ID", nullable = false)
    private View view;

    @MapsId("collectionId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COLLECTION_ID", nullable = false)
    private Collection collection;



}