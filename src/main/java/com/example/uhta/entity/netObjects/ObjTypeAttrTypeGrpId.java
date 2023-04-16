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
public class ObjTypeAttrTypeGrpId implements Serializable {
    private static final long serialVersionUID = 4737750738479613907L;
    @Column(name = "OBJECT_TYPE_ID", nullable = false)
    private Integer objectTypeId;

    @Column(name = "ATTRIBUTE_TYPE_GROUP_ID", nullable = false)
    private Integer attributeTypeGroupId;



}