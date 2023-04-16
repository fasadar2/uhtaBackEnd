package com.example.uhta.entity.processDoc;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
public class EventSchedule {
    @Id
    @Column(name = "EventScheduleID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "AnalysisID", nullable = false)
    private Analysis analysisID;

    @Column(name = "Active", nullable = false)
    private Boolean active = false;

    @Column(name = "DSName", length = 8)
    private String dSName;

    @Column(name = "DSConn", length = 512)
    private String dSConn;

    @Column(name = "DSObject", length = 512)
    private String dSObject;

    @Column(name = "DSParams", length = 1024)
    private String dSParams;

    @Column(name = "SampleCount")
    private Integer sampleCount;

    @Column(name = "SampleInterval")
    private Integer sampleInterval;

    @Column(name = "Tags", length = 3072)
    private String tags;

    @Column(name = "Program", length = 1024)
    private String program;

    @Column(name = "ProgramArgs", length = 1024)
    private String programArgs;

    @Column(name = "StartTime")
    private Instant startTime;

    @Column(name = "Period")
    private Integer period;



}