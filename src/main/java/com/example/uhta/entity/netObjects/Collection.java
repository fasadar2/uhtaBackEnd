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
@Table(name = "COLLECTIONS")
public class Collection {
    @Id
    @Column(name = "COLLECTION_ID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Nationalized
    @Column(name = "DESCR", length = 250)
    private String descr;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MODULE_ID", nullable = false)
    private Module module;



}