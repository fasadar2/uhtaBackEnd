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
@Table(name = "FunctionMemoryTableColumns")
public class FunctionMemoryTableColumn {
    @Id
    @Column(name = "FnTableColumnID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "FnTableID", nullable = false)
    private FunctionMemoryTable fnTableID;

    @Column(name = "Name", nullable = false, length = 100)
    private String name;

    @Column(name = "Type", nullable = false, length = 15)
    private String type;

    @Column(name = "Width")
    private Integer width;

    @Column(name = "Description", length = 100)
    private String description;

    @Column(name = "Optional")
    private Integer optional;

    @Column(name = "Array")
    private Integer array;



}