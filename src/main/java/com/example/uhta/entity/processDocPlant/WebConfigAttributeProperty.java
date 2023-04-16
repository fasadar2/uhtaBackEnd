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
@Table(name = "WebConfigAttributeProperties")
public class WebConfigAttributeProperty {
    @Id
    @Column(name = "ObjectType", length = 100)
    private String objectType;

    @Column(name = "AttributeName", length = 100)
    private String attributeName;

    @Column(name = "IsHidden")
    private Boolean isHidden;

    @Column(name = "IsPNetTag")
    private Boolean isPNetTag;



}