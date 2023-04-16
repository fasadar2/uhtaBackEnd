package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ATTRIBUTE_GROUP_PERMISSIONS")
public class AttributeGroupPermission {
    @EmbeddedId
    private AttributeGroupPermissionId id;

    @MapsId("attributeGroupId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_GROUP_ID", nullable = false)
    private AttributeGroup attributeGroup;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserDatum user;

    @Column(name = "PERM_LEVEL", nullable = false)
    private Integer permLevel;



}