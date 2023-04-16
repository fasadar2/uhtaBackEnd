package com.example.uhta.entity.processDoc;

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
public class SiamConfiguration {
    @Id
    @Column(name = "Name", nullable = false, length = 100)
    private String id;

    @Column(name = "CfgValues", nullable = false, length = 1500)
    private String cfgValues;



}