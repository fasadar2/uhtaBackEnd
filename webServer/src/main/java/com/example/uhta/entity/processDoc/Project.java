package com.example.uhta.entity.processDoc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "Projects")
public class Project {
    @Id
    @Column(name = "ProjectID", nullable = false)
    private Integer id;

    @Column(name = "Name", nullable = false, length = 100)
    private String name;

    @Column(name = "Description", length = 1000)
    private String description;

    @Column(name = "CreatedBy", nullable = false, length = 100)
    private String createdBy;

    @Column(name = "CreatedDate", nullable = false)
    private Instant createdDate;

}