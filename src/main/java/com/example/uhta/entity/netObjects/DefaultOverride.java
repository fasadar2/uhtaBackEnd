package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "DEFAULT_OVERRIDES")
public class DefaultOverride {
    @EmbeddedId
    private DefaultOverrideId id;

    @MapsId("attributeTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_TYPE_ID", nullable = false)
    private AttributeType attributeType;

    @MapsId("attributeTypeGroupId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_TYPE_GROUP_ID", nullable = false)
    private AttributeTypeGroup attributeTypeGroup;

    @MapsId("objectTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OBJECT_TYPE_ID", nullable = false)
    private ObjectType objectType;

    @Nationalized
    @Column(name = "DATA_VALUE", length = 1500)
    private String dataValue;



}