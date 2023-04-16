package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ATTRIBUTES")
public class Attribute {
    @Id
    @Column(name = "ATTRIBUTE_ID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_TYPE_ID", nullable = false)
    private AttributeType attributeType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_GROUP_ID", nullable = false)
    private AttributeGroup attributeGroup;

    @Column(name = "ARCHIVED", nullable = false)
    private Boolean archived = false;





}