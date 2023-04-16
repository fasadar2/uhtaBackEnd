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
public class WebConfigTreemapDefinition {
    @Id
    @Column(name = "TreemapID", nullable = false)
    private Integer id;

    @Column(name = "UserID", nullable = false, length = 50)
    private String userID;

    @Column(name = "AssetType", nullable = false, length = 50)
    private String assetType;



}