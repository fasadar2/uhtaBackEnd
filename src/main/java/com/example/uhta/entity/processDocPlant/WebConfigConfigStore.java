package com.example.uhta.entity.processDocPlant;

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
public class WebConfigConfigStore {
    @Id
    @Column(name = "ConfigID", nullable = false)
    private Integer id;

    @Column(name = "ConfigStore")
    private byte[] configStore;



}