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
@Table(name = "WebConfigGroupDispositionNames")
public class WebConfigGroupDispositionName {
    @Id
    @Column(name = "GroupID", nullable = false)
    private Integer id;

    @Column(name = "GroupName", length = 50)
    private String groupName;

    }

