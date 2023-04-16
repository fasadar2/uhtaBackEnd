package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "AUDIT_CONFIG")
public class AuditConfig {
    @EmbeddedId
    private AuditConfigId id;

    @MapsId("attributeTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_TYPE_ID", nullable = false)
    private AttributeType attributeType;

    @MapsId("linkedAttributeTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LINKED_ATTRIBUTE_TYPE_ID", nullable = false)
    private AttributeType linkedAttributeType;

    @MapsId("attributeTypeGroupId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_TYPE_GROUP_ID", nullable = false)
    private AttributeTypeGroup attributeTypeGroup;



}