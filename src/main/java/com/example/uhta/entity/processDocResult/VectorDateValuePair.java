package com.example.uhta.entity.processDocResult;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "VectorDateValuePairs")
public class VectorDateValuePair {
    @Id
    @Column(name = "X")
    private Instant x;

    @Column(name = "Y")
    private Double y;


}