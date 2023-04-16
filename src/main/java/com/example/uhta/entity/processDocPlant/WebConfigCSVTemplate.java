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
@Table(name = "WebConfigCSVTemplates")
public class WebConfigCSVTemplate {
    @Id
    @Column(name = "ObjectType", nullable = false, length = 50)
    private String id;

    @Column(name = "TemplateName", nullable = false, length = 100)
    private String templateName;

    @Column(name = "AutoGenerate", nullable = false)
    private Boolean autoGenerate = false;



}