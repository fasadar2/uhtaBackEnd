package com.example.uhta.entity.processDoc;

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
@Table(name = "MasterSlaveLinks")
public class MasterSlaveLink {
    @EmbeddedId
    private MasterSlaveLinkId id;

    @Column(name = "IsActive", nullable = false)
    private Boolean isActive = false;

    @Column(name = "IsManual", nullable = false)
    private Boolean isManual = false;



}