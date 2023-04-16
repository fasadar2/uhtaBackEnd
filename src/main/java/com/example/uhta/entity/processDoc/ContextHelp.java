package com.example.uhta.entity.processDoc;

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
public class ContextHelp {
    @Id
    @Column(name = "ContextID", nullable = false)
    private Integer id;

    @Column(name = "HelpID", nullable = false)
    private Integer helpID;

    @Column(name = "ControlID", nullable = false)
    private Integer controlID;

    @Column(name = "TipText", length = 500)
    private String tipText;



}