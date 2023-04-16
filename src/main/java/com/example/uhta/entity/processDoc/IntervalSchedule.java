package com.example.uhta.entity.processDoc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "IntervalSchedules")
public class IntervalSchedule {
    @Id
    @Column(name = "ScheduleID", nullable = false)
    private Integer id;

    @Column(name = "Name", nullable = false, length = 100)
    private String name;

    @Column(name = "Active", nullable = false)
    private Boolean active = false;

    @Column(name = "StartDate", nullable = false)
    private Instant startDate;

    @Column(name = "RepeatInterval", nullable = false)
    private Double repeatInterval;

    @Column(name = "LastRun")
    private Instant lastRun;

    @Column(name = "LastRunStatus")
    private Integer lastRunStatus;



}