package com.example.uhta.entity.uhtaDb;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class PatternAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PatternID")
    private Pattern patternID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AttributeID")
    private Attribute attributeID;

    @Column(name = "IsActive")
    private byte[] isActive;

}