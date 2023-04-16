package com.example.uhta.entity.netObjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class AttrTypeGroupCollectionId implements Serializable {
    private static final long serialVersionUID = 7935100022814076527L;
    @Column(name = "ATTRIBUTE_TYPE_GROUP_ID", nullable = false)
    private Integer attributeTypeGroupId;

    @Column(name = "COLLECTION_ID", nullable = false)
    private Integer collectionId;





}