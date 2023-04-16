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
@Table(name = "WebConfigCSVColumns")
public class WebConfigCSVColumn {
    @EmbeddedId
    private WebConfigCSVColumnId id;

    @Column(name = "ForwardCalc", nullable = false, length = 50)
    private String forwardCalc;

    @Column(name = "CalcArg", length = 100)
    private String calcArg;



}