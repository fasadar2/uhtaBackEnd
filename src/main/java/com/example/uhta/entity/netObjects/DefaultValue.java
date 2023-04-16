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
@Table(name = "DEFAULT_VALUES")
public class DefaultValue {
    @Id
    @Column(name = "ATTRIBUTE_TYPE_ID", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_TYPE_ID", nullable = false)
    private AttributeType attributeTypes;

    @Nationalized
    @Column(name = "DATA_VALUE", length = 1500)
    private String dataValue;



}