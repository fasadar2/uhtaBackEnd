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
@Table(name = "ATTR_NMBR_RULES")
public class AttrNmbrRule {
    @Id
    @Column(name = "ATTRIBUTE_TYPE_ID", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_TYPE_ID", nullable = false)
    private AttributeType attributeTypes;

    @Column(name = "MIN_VALUE", nullable = false)
    private Double minValue;

    @Column(name = "MAX_VALUE", nullable = false)
    private Double maxValue;

    @Column(name = "ALLOW_NULL", nullable = false)
    private Boolean allowNull = false;

    @Column(name = "WHOLE_ONLY", nullable = false)
    private Boolean wholeOnly = false;

    @Nationalized
    @Column(name = "OUTFORMAT", length = 100)
    private String outformat;



}