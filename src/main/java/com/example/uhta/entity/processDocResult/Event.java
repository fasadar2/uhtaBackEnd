package com.example.uhta.entity.processDocResult;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EventID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EventTypeID")
    private EventType eventTypeID;

    @Column(name = "StartTime")
    private Instant startTime;

    @Column(name = "EndTime")
    private Instant endTime;

    @Column(name = "Tag", length = 10)
    private String tag;

    @Column(name = "SubTag", length = 100)
    private String subTag;


}