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
@Table(name = "AnalysisIntervalSchedules")
public class AnalysisIntervalSchedule {
    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "AnalysisID", nullable = false)
    private Analysis analysisID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ScheduleID", nullable = false)
    private IntervalSchedule scheduleID;



}