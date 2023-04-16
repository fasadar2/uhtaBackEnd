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
@Table(name = "CronSchedules")
public class CronSchedule {
    @Id
    @Column(name = "ScheduleID", nullable = false)
    private Integer id;

    @Column(name = "Name", nullable = false, length = 100)
    private String name;

    @Column(name = "Active", nullable = false)
    private Boolean active = false;

    @Column(name = "Months", nullable = false, length = 50)
    private String months;

    @Column(name = "DaysOfMonth", nullable = false, length = 100)
    private String daysOfMonth;

    @Column(name = "DaysOfWeek", nullable = false, length = 50)
    private String daysOfWeek;

    @Column(name = "Hours", nullable = false, length = 75)
    private String hours;

    @Column(name = "Minutes", nullable = false, length = 100)
    private String minutes;

    @Column(name = "Seconds", nullable = false, length = 100)
    private String seconds;

    @Column(name = "LastRun")
    private Instant lastRun;

    @Column(name = "LastRunStatus")
    private Integer lastRunStatus;



}