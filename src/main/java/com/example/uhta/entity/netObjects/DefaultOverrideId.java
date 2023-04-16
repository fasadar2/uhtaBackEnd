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
public class DefaultOverrideId implements Serializable {
    private static final long serialVersionUID = -4737095764402746998L;
    @Column(name = "ATTRIBUTE_TYPE_ID", nullable = false)
    private Integer attributeTypeId;

    @Column(name = "ATTRIBUTE_TYPE_GROUP_ID", nullable = false)
    private Integer attributeTypeGroupId;

    @Column(name = "OBJECT_TYPE_ID", nullable = false)
    private Integer objectTypeId;



}