package com.example.uhta.entity.processDoc;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Analyses")
public class Analysis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AnalysisID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "ProjectID", nullable = false)
    private Project projectID;

    @Column(name = "Name", nullable = false, length = 100)
    private String name;

    @Column(name = "Description", length = 1000)
    private String description;

    @Column(name = "CreatedBy", nullable = false, length = 100)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

    @Column(name = "CheckedOut", nullable = false)
    private Boolean checkedOut = false;

    @Column(name = "CheckedOutBy", length = 100)
    private String checkedOutBy;

    @Column(name = "ViewData")
    private byte[] viewData;

    @Column(name = "IsTemplated", nullable = false)
    private Boolean isTemplated = false;

    @Column(name = "IsRunning", nullable = false)
    private Boolean isRunning = false;

    @Column(name = "LastModified")
    private Instant lastModified;

    @Column(name = "CheckedOutDate")
    private Instant checkedOutDate;

    @Column(name = "TotalCheckedOutTime", nullable = false)
    private Double totalCheckedOutTime;

    @Column(name = "Executions", nullable = false)
    private Integer executions;

    @Column(name = "JobID", length = 40)
    private String jobID;

}