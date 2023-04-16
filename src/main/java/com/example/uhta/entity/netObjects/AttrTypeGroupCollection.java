package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ATTR_TYPE_GROUP_COLLECTIONS")
public class AttrTypeGroupCollection {
    @EmbeddedId
    private AttrTypeGroupCollectionId id;

    @MapsId("attributeTypeGroupId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_TYPE_GROUP_ID", nullable = false)
    private AttributeTypeGroup attributeTypeGroup;

    @MapsId("collectionId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "COLLECTION_ID", nullable = false)
    private Collection collection;

    @Column(name = "REQUIRED", nullable = false)
    private Integer required;



}