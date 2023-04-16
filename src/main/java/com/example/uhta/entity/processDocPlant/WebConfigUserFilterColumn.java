package com.example.uhta.entity.processDocPlant;

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
@Table(name = "WebConfigUserFilterColumns")
public class WebConfigUserFilterColumn {
    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "FilterSetID", nullable = false)
    private WebConfigFilterSetDefinition filterSetID;

    @Column(name = "ColumnName", nullable = false, length = 50)
    private String columnName;

    @Column(name = "IsShown", nullable = false)
    private Boolean isShown = false;



}