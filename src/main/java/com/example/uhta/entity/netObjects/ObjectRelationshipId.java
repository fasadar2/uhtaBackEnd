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
public class ObjectRelationshipId implements Serializable {
    private static final long serialVersionUID = 5737913590096897436L;
    @Column(name = "RELATED_OBJECT_ID", nullable = false)
    private Integer relatedObjectId;

    @Column(name = "PARENT_OBJECT_ID", nullable = false)
    private Integer parentObjectId;

    @Column(name = "RELATIONSHIP_TYPE_ID", nullable = false)
    private Integer relationshipTypeId;



}