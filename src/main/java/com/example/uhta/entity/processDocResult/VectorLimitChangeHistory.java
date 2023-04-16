package com.example.uhta.entity.processDocResult;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.Instant;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class VectorLimitChangeHistory {
    @Column(name = "\"Index\"")
    private Integer index;
@Id
    @Column(name = "UniqueID")
    private Integer uniqueID;

    @Column(name = "\"Time\"")
    private Instant time;

    @Column(name = "Variable", length = 150)
    private String variable;

    @Column(name = "\"Tag Type\"", length = 3)
    private String tagType;

    @Column(name = "Parameter", length = 50)
    private String parameter;

    @Column(name = "\"From\"")
    private Double from;

    @Column(name = "\"To\"")
    private Double to;



}