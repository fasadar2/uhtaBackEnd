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
public class MPCModeMap {
    @Id
    @Column(name = "ModeName", nullable = false, length = 50)
    private String modeName;

    @Column(name = "ModeNumber", nullable = false)
    private Integer modeNumber;

    @Column(name = "Color", length = 10)
    private String color;



}