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
public class GroupAttributeTypeId implements Serializable {
    private static final long serialVersionUID = 8128661615682413686L;
    @Column(name = "ATTRIBUTE_TYPE_ID", nullable = false)
    private Integer attributeTypeId;

    @Column(name = "ATTRIBUTE_TYPE_GROUP_ID", nullable = false)
    private Integer attributeTypeGroupId;



}