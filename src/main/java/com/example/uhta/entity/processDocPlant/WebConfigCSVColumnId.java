package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class WebConfigCSVColumnId implements Serializable {
    private static final long serialVersionUID = -1593981873997384642L;
    @Column(name = "ObjectType", nullable = false, length = 50)
    private String objectType;

    @Column(name = "CSVColumnName", nullable = false, length = 50)
    private String cSVColumnName;



}