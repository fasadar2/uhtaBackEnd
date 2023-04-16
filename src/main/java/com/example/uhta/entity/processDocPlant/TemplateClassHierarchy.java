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
public class TemplateClassHierarchy {
    @Id
    @Column(name = "TCHID", nullable = false)
    private Integer id;

    @Column(name = "TemplateOrClass", nullable = false, length = 40)
    private String templateOrClass;

    @Column(name = "ParentID", nullable = false)
    private Integer parentID;



}