package com.example.uhta.entity.processDoc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "AnalysisMessages")
public class AnalysisMessage {
    @Id
    @Column(name = "UniqueID", nullable = false)
    private Integer id;

    @Column(name = "MessageID", nullable = false)
    private Integer messageID;

    @Column(name = "Description", nullable = false, length = 50)
    private String description;



}