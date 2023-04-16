package com.example.uhta.entity.processDocPlant;

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
public class TuningHistory {
    @Id
    @Column(name = "UniqueID", nullable = false)
    private Integer id;

    @Column(name = "ObjectID")
    private Integer objectID;

    @Column(name = "\"Time\"")
    private Instant time;

    @Column(name = "Proportional")
    private Double proportional;

    @Column(name = "Integral")
    private Double integral;

    @Column(name = "Derivative")
    private Double derivative;

    @Column(name = "Gamma")
    private Double gamma;

    @Column(name = "\"PV Filter\"")
    private Double pVFilter;



}