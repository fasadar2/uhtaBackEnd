package com.example.uhta.entity.processDoc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
public class Tune {
    @Id
    @Column(name = "UniqueID", nullable = false)
    private Integer uniqueID;

    @Column(name = "ControllerName", nullable = false, length = 500)
    private String controllerName;

    @Column(name = "ControllerID")
    private Integer controllerID;


}