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
@Table(name = "RELATIONSHIP_TYPES")
public class RelationshipType {
    @Id
    @Column(name = "RELATIONSHIP_TYPE_ID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Nationalized
    @Column(name = "DESCR", length = 250)
    private String descr;

    @Column(name = "STRENGTH", nullable = false)
    private Integer strength;



}