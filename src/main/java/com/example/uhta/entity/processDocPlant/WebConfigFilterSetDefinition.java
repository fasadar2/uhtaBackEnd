package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WebConfigFilterSetDefinitions")
public class WebConfigFilterSetDefinition {
    @Id
    @Column(name = "FilterSetID", nullable = false)
    private Integer id;

    @Column(name = "UserID", nullable = false, length = 50)
    private String userID;

    @Column(name = "GroupName", nullable = false, length = 50)
    private String groupName;

    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @Column(name = "ModelTypes", length = 100)
    private String modelTypes;

    @Column(name = "SortColumn", length = 50)
    private String sortColumn;

    @Column(name = "SortAscending")
    private Boolean sortAscending;

    @Column(name = "SortBenchmarks")
    private Boolean sortBenchmarks;

    @Column(name = "IsReadOnly", nullable = false)
    private Boolean isReadOnly = false;



}