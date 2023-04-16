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
@Table(name = "WebConfigModelTypeDefinitions")
public class WebConfigModelTypeDefinition {
    @Id
    @Column(name = "ModelType", nullable = false, length = 50)
    private String id;

    @Column(name = "Rank")
    private Integer rank;

    @Column(name = "IsHidden", nullable = false)
    private Boolean isHidden = false;

    @Column(name = "HasChildren", nullable = false)
    private Boolean hasChildren = false;

    @Column(name = "HasRollups", nullable = false)
    private Boolean hasRollups = false;

    @Column(name = "NeverRollup", nullable = false)
    private Boolean neverRollup = false;


}