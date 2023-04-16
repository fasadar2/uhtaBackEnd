package com.example.uhta.entity.netObjects;

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
@Table(name = "VERSION_INFO")
public class VersionInfo {
    @Id
    @Column(name = "MAJOR", nullable = false)
    private Integer major;

    @Column(name = "MINOR", nullable = false)
    private Integer minor;

    @Column(name = "REVISION", nullable = false)
    private Integer revision;



}