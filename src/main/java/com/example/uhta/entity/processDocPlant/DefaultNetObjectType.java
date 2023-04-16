package com.example.uhta.entity.processDocPlant;

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
@Table(name = "DefaultNetObjectTypes")
public class DefaultNetObjectType {
    @Id
    @Column(name = "NetObjectType", nullable = false, length = 100)
    private String id;



    //TODO [JPA Buddy] generate columns from DB
}