package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WebConfigDefaults")
public class WebConfigDefault {
    @EmbeddedId
    private WebConfigDefaultId id;

    @Column(name = "DefaultValue", length = 8000)
    private String defaultValue;

    @Column(name = "Description", length = 100)
    private String description;



}