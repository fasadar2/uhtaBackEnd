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
@Table(name = "WebConfigOptimizationDefinitions")
public class WebConfigOptimizationDefinition {
    @Id
    @Column(name = "KpiName", nullable = false, length = 100)
    private String id;

    @Column(name = "XmlString", length = 2000)
    private String xmlString;


}