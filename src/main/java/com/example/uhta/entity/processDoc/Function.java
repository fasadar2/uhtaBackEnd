package com.example.uhta.entity.processDoc;

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
@Table(name = "Functions")
public class Function {
    @Id
    @Column(name = "FunctionID", nullable = false)
    private Integer id;

    @Column(name = "\"Module\"", nullable = false, length = 100)
    private String module;

    @Column(name = "Name", nullable = false, length = 100)
    private String name;

    @Column(name = "DisplayName", nullable = false, length = 100)
    private String displayName;

    @Column(name = "Description", length = 500)
    private String description;

    @Column(name = "PropertiesFunction", length = 100)
    private String propertiesFunction;

    @Column(name = "StencilFunction", length = 100)
    private String stencilFunction;

    @Column(name = "Abbreviation", nullable = false, length = 10)
    private String abbreviation;

    @Column(name = "ClassID")
    private Integer classID;



}