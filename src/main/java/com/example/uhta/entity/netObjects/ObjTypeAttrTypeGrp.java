package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "OBJ_TYPE_ATTR_TYPE_GRPS")
public class ObjTypeAttrTypeGrp {
    @EmbeddedId
    private ObjTypeAttrTypeGrpId id;

    @MapsId("objectTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OBJECT_TYPE_ID", nullable = false)
    private ObjectType objectType;

    @MapsId("attributeTypeGroupId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_TYPE_GROUP_ID", nullable = false)
    private AttributeTypeGroup attributeTypeGroup;

    @Column(name = "ARCHIVED", nullable = false)
    private Boolean archived = false;



}