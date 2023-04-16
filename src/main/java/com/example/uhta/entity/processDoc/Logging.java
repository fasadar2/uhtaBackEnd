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
public class Logging {
    @Id
    @Column(name = "Active", nullable = false)
    private Integer active;



    //TODO [JPA Buddy] generate columns from DB
}