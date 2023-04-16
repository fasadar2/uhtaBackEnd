package com.example.uhta.entity.netObjects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Nationalized;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "ATTRIBUTE_TYPE_GROUPS")
public class AttributeTypeGroup {
    @Id
    @Column(name = "ATTRIBUTE_TYPE_GROUP_ID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Nationalized
    @Column(name = "DESCR", length = 250)
    private String descr;

    @Column(name = "ARCHIVED", nullable = false)
    private Boolean archived = false;

    @Nationalized
    @Column(name = "DATA_TYPE", nullable = false, length = 1)
    private String dataType;



}