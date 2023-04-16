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
@Table(name = "AnalysisElements")
public class AnalysisElement {
    @Id
    @Column(name = "ElementID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "AnalysisID", nullable = false)
    private Analysis analysisID;

    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "FunctionID", nullable = false)
    private Function functionID;

    @Column(name = "Executed", nullable = false)
    private Boolean executed = false;

    @Column(name = "Locked", nullable = false)
    private Boolean locked = false;

    @Column(name = "Executing", nullable = false)
    private Boolean executing = false;

    @Column(name = "ResultTablesWritten", nullable = false)
    private Integer resultTablesWritten;



}