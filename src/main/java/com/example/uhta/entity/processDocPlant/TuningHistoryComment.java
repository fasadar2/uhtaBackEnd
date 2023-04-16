package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TuningHistoryComments")
public class TuningHistoryComment {
    @Id
    @Column(name = "UniqueID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "TuningHistoryID", nullable = false)
    private TuningHistory tuningHistoryID;

    @Lob
    @Column(name = "UserName")
    private String userName;

    @Column(name = "\"Time\"")
    private Instant time;

    @Lob
    @Column(name = "Comment")
    private String comment;



}