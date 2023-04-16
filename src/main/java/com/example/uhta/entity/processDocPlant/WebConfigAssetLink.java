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
@Table(name = "WebConfigAssetLinks")
public class WebConfigAssetLink {
    @Id
    @Column(name = "Name", length = 50)
    private String name;

    @Column(name = "UserComment", length = 150)
    private String userComment;

    @Column(name = "SourceAttributeName", length = 100)
    private String sourceAttributeName;

    @Column(name = "TargetAttributeName", length = 100)
    private String targetAttributeName;

    @Column(name = "TargetObjectType", length = 100)
    private String targetObjectType;

    @Column(name = "HasMultipleSourceAssets")
    private Boolean hasMultipleSourceAssets;

    @Column(name = "HasMultipleTargetAssets")
    private Boolean hasMultipleTargetAssets;



}