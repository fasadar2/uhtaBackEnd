package com.example.uhta.entity.processDoc;

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
@Table(name = "FunctionTableGraphTypes")
public class FunctionTableGraphType {
    @Id
    @Column(name = "GraphTypeID", nullable = false)
    private Integer id;

    @Column(name = "Name", nullable = false, length = 40)
    private String name;



}