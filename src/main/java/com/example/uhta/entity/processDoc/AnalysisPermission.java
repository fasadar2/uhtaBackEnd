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
@Table(name = "AnalysisPermissions")
public class AnalysisPermission {
    @Id
    @Column(name = "PermissionID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "AnalysisID", nullable = false)
    private Analysis analysisID;

    @Column(name = "UserName", nullable = false, length = 100)
    private String userName;

    @Column(name = "CanRead", nullable = false)
    private Boolean canRead = false;

    @Column(name = "CanWrite", nullable = false)
    private Boolean canWrite = false;

    @Column(name = "CanDelete", nullable = false)
    private Boolean canDelete = false;



}