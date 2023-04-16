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
public class ModeMap {
    @Id
    @Column(name = "ModeName", nullable = false, length = 50)
    private String modeName;

    @Column(name = "ModeNumber", nullable = false)
    private Integer modeNumber;

    @Column(name = "Active", nullable = false)
    private Boolean active = false;

    @Column(name = "Color", length = 10)
    private String color;

    @Column(name = "DisplayName", length = 50)
    private String displayName;

    @Column(name = "IsClosedLoop")
    private Boolean isClosedLoop;

    @Column(name = "IsAuto", nullable = false)
    private Boolean isAuto = false;

    @Column(name = "IsManual", nullable = false)
    private Boolean isManual = false;

    @Column(name = "AltModeNumber")
    private Integer altModeNumber;


}