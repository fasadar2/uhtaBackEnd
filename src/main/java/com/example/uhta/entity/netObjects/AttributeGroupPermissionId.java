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
public class AttributeGroupPermissionId implements Serializable {
    private static final long serialVersionUID = -8910807026042842533L;
    @Column(name = "ATTRIBUTE_GROUP_ID", nullable = false)
    private Integer attributeGroupId;

    @Column(name = "USER_ID", nullable = false)
    private Integer userId;



}