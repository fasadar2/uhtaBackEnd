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
public class ObjectTypeCollectionId implements Serializable {
    private static final long serialVersionUID = 1768830071366692262L;
    @Column(name = "OBJECT_TYPE_ID", nullable = false)
    private Integer objectTypeId;

    @Column(name = "COLLECTION_ID", nullable = false)
    private Integer collectionId;



}