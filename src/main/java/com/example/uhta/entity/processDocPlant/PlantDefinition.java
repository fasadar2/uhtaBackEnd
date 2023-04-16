package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class PlantDefinition {
    @Id
    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @Column(name = "\"Value\"", nullable = false, length = 50)
    private String value;



}