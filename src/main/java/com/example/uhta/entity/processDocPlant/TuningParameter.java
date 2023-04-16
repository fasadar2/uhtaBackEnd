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
@Table(name = "TuningParameters")
public class TuningParameter {
    @Id
    @Column(name = "ParameterName", length = 200)
    private String parameterName;

    @Column(name = "NormalizedName", length = 200)
    private String normalizedName;



}