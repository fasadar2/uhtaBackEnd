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
@Table(name = "ATTRIBUTE_VALUES")
public class AttributeValue {
    @Id
    @Column(name = "ATTRIBUTE_ID", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_ID", nullable = false)
    private Attribute attributes;

    @Nationalized
    @Column(name = "DATA_VALUE", length = 1500)
    private String dataValue;



}