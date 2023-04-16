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
@Table(name = "AnalysisResultTables")
public class AnalysisResultTable {
    @Id
    @Column(name = "AnalysisResultID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "ElementID", nullable = false)
    private AnalysisElement elementID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "FnTableID", nullable = false)
    private FunctionMemoryTable fnTableID;

    @Column(name = "Name", nullable = false, length = 100)
    private String name;

    @Column(name = "Persistent", nullable = false)
    private Boolean persistent = false;

    @Column(name = "Runtime", nullable = false)
    private Boolean runtime = false;

    @Column(name = "RuntimeName", length = 100)
    private String runtimeName;



}