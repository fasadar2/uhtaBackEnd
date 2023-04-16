package com.example.uhta.entity.netObjects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Nationalized;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "MODULES")
public class Module {
    @Id
    @Column(name = "MODULE_ID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Nationalized
    @Column(name = "DESCR", length = 250)
    private String descr;

    @Nationalized
    @Column(name = "COMPONENT_NAME", length = 250)
    private String componentName;

    @Column(name = "IS_ENABLED", nullable = false)
    private Boolean isEnabled = false;



}