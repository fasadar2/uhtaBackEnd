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
@Table(name = "FunctionMemoryTables")
public class FunctionMemoryTable {
    @Id
    @Column(name = "FnTableID", nullable = false)
    private Integer id;

    @Column(name = "FunctionID")
    private Integer functionID;

    @Column(name = "IsDynamic", nullable = false)
    private Boolean isDynamic = false;

    @Column(name = "Type", nullable = false)
    private Integer type;

    @Column(name = "Name", nullable = false, length = 100)
    private String name;

    @Column(name = "Description", length = 500)
    private String description;

    @Column(name = "DefaultPersistent", nullable = false)
    private Boolean defaultPersistent = false;

    @Column(name = "IsDisplayed", nullable = false)
    private Boolean isDisplayed = false;

    @Column(name = "RuntimeTemplate", nullable = false)
    private Boolean runtimeTemplate = false;

    @Column(name = "DeferLoad", nullable = false)
    private Boolean deferLoad = false;



}