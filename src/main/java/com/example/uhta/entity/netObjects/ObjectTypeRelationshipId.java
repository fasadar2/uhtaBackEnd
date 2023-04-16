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
public class ObjectTypeRelationshipId implements Serializable {
    private static final long serialVersionUID = -1154136487329714604L;
    @Column(name = "OBJECT_TYPE_ID", nullable = false)
    private Integer objectTypeId;

    @Column(name = "PARENT_OBJECT_TYPE_ID", nullable = false)
    private Integer parentObjectTypeId;

    @Column(name = "RELATIONSHIP_TYPE_ID", nullable = false)
    private Integer relationshipTypeId;



}