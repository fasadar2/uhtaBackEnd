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
@Table(name = "FunctionTableGraphs")
public class FunctionTableGraph {
    @Id
    @Column(name = "GraphID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "FunctionID", nullable = false)
    private Function functionID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "FnTableID", nullable = false)
    private FunctionMemoryTable fnTableID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "GraphTypeID", nullable = false)
    private FunctionTableGraphType graphTypeID;

    @Column(name = "Name", nullable = false)
    private String name;

    @Column(name = "Transformation", nullable = false, length = 50)
    private String transformation;

    @Column(name = "UseSampleSize", nullable = false)
    private Boolean useSampleSize = false;

    @Column(name = "Deletable", nullable = false)
    private Boolean deletable = false;

    @Column(name = "DisplayedToUser", nullable = false)
    private Boolean displayedToUser = false;



}