package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "GROUP_ATTRIBUTE_TYPES")
public class GroupAttributeType {
    @EmbeddedId
    private GroupAttributeTypeId id;

    @MapsId("attributeTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_TYPE_ID", nullable = false)
    private AttributeType attributeType;

    @MapsId("attributeTypeGroupId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_TYPE_GROUP_ID", nullable = false)
    private AttributeTypeGroup attributeTypeGroup;

    @Column(name = "ARCHIVED", nullable = false)
    private Integer archived;

    @Column(name = "AUDIT_ENABLED", nullable = false)
    private Boolean auditEnabled = false;



}