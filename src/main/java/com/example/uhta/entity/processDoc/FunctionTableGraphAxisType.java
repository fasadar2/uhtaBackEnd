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
@Table(name = "FunctionTableGraphAxisTypes")
public class FunctionTableGraphAxisType {
    @Id
    @Column(name = "GraphAxisTypeID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "GraphTypeID", nullable = false)
    private FunctionTableGraphType graphTypeID;

    @Column(name = "Name", nullable = false, length = 40)
    private String name;

    @Column(name = "IsUnique", nullable = false)
    private Boolean isUnique = false;

    @Column(name = "IsLogarithmic", nullable = false)
    private Boolean isLogarithmic = false;

    @Column(name = "IsExternalTable", nullable = false)
    private Boolean isExternalTable = false;



}