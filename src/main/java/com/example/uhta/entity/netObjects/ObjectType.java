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
@Table(name = "OBJECT_TYPES")
public class ObjectType {
    @Id
    @Column(name = "OBJECT_TYPE_ID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Nationalized
    @Column(name = "DESCR", length = 250)
    private String descr;

    @Column(name = "ARCHIVED", nullable = false)
    private Boolean archived = false;

    @Column(name = "TREE_ENABLED", nullable = false)
    private Boolean treeEnabled = false;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "INHERITED_FROM_ID", nullable = false)
    private ObjectType inheritedFrom;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IMAGE_INDEX", nullable = false)
    private Image imageIndex;



}