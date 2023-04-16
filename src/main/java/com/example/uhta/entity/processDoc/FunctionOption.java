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
@Table(name = "FunctionOptions")
public class FunctionOption {
    @Id
    @Column(name = "FnOptionID", nullable = false)
    private Integer id;

    @Column(name = "FunctionID", nullable = false)
    private Integer functionID;

    @Column(name = "Name", nullable = false, length = 100)
    private String name;

    @Column(name = "DisplayName", nullable = false, length = 100)
    private String displayName;

    @Column(name = "DefaultValue", length = 1000)
    private String defaultValue;

    @Column(name = "Optional", nullable = false)
    private Boolean optional = false;

    @Column(name = "Description", length = 500)
    private String description;

    @Column(name = "Type", nullable = false, length = 15)
    private String type;



}