package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ATTRIBUTE_GROUPS")
public class AttributeGroup {
    @Id
    @Column(name = "ATTRIBUTE_GROUP_ID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OBJECT_ID", nullable = false)
    private Object object;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_TYPE_GROUP_ID", nullable = false)
    private AttributeTypeGroup attributeTypeGroup;

    @Column(name = "ARCHIVED", nullable = false)
    private Boolean archived = false;



}