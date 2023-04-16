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
@Table(name = "WebConfigTrendColors")
public class WebConfigTrendColor {
    @Id
    @Column(name = "Rank", nullable = false)
    private Integer id;

    @Column(name = "Color", length = 6)
    private String color;



}