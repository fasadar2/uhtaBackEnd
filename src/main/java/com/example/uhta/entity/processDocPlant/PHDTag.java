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
@Table(name = "PHDTags")
public class PHDTag {
    @Id
    @Column(name = "TagID", nullable = false)
    private Integer tagID;

    @Column(name = "ServerID", nullable = false)
    private Integer serverID;

    @Column(name = "Tag", nullable = false, length = 50)
    private String tag;



}