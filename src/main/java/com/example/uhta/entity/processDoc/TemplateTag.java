package com.example.uhta.entity.processDoc;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "TemplateTags")
public class TemplateTag {
    @Id
    @Column(name = "TagID", nullable = false)
    private Integer id;

    @Column(name = "TemplateOptionID", nullable = false)
    private Integer templateOptionID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "AnalysisID", nullable = false)
    private Analysis analysisID;

    @Column(name = "Name", nullable = false, length = 50)
    private String name;

    @Column(name = "Type", nullable = false, length = 15)
    private String type;

    @Column(name = "Required", nullable = false)
    private Boolean required = false;

    @Column(name = "DefaultValue", length = 2000)
    private String defaultValue;

    @Column(name = "Description", length = 1000)
    private String description;

    @Column(name = "TagFunction", length = 20)
    private String tagFunction;



}