package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "WebConfigDispositionNames")
public class WebConfigDispositionName {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "Name", length = 50)
    private String name;

    @Column(name = "IncludeInFollowUpReport", nullable = false)
    private Boolean includeInFollowUpReport = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IfNowGoodChangeTo")
    private WebConfigDispositionName ifNowGoodChangeTo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IfNowBadChangeTo")
    private WebConfigDispositionName ifNowBadChangeTo;

    @Column(name = "DaysInTransition")
    private Integer daysInTransition;

    @Column(name = "IsDeleted")
    private Boolean isDeleted;



}