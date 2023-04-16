package com.example.uhta.entity.processDoc;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "FunctionTableGraphVectors")
public class FunctionTableGraphVector {
    @Id
    @Column(name = "GraphVectorID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "GraphID", nullable = false)
    private FunctionTableGraph graphID;

    @Column(name = "GraphAxisTypeID", nullable = false)
    private Integer graphAxisTypeID;

    @Column(name = "FnTableID", nullable = false)
    private Integer fnTableID;

    @Column(name = "FnTableColumnID", nullable = false)
    private Integer fnTableColumnID;

    @Column(name = "Param1", nullable = false, length = 250)
    private String param1;

    @Column(name = "Param2", nullable = false, length = 250)
    private String param2;

    @Column(name = "Param3", nullable = false, length = 250)
    private String param3;

    @Column(name = "Color", nullable = false)
    private Integer color;

    @Column(name = "Deletable", nullable = false)
    private Boolean deletable = false;



}