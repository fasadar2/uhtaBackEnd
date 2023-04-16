package com.example.uhta.entity.processDoc;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "FunctionOptionRestrictions")
public class FunctionOptionRestriction {
    @Id
    @Column(name = "RestrictionID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "FnOptionID", nullable = false)
    private FunctionOption fnOptionID;

    @Column(name = "Modifiable", nullable = false)
    private Boolean modifiable = false;

    @Column(name = "Operation", nullable = false, length = 10)
    private String operation;

    @Column(name = "Operand", length = 1000)
    private String operand;

    @Column(name = "Condition")
    private Integer condition;



}