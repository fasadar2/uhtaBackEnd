package com.example.uhta.entity.processDocResult;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "VectorXYPairs")
public class VectorXYPair {
    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "\"Index\"", nullable = false, referencedColumnName = "Index")
    private VectorResultsIndex index;

    @Column(name = "X")
    private Double x;

    @Column(name = "Y")
    private Double y;



}