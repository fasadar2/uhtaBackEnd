package com.example.uhta.entity.uhtaDb;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Attribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AttributeID", nullable = false)
    private Integer id;

    @Nationalized
    @Lob
    @Column(name = "Title")
    private String title;

    @Nationalized
    @Lob
    @Column(name = "Description")
    private String description;

}