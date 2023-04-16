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
@Table(name = "TemplateTagRestrictions")
public class TemplateTagRestriction {
    @Id
    @Column(name = "TemplateRestrictionID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "TagID", nullable = false)
    private TemplateTag tagID;

    @Column(name = "Modifiable", nullable = false)
    private Boolean modifiable = false;

    @Column(name = "Operation", nullable = false, length = 10)
    private String operation;

    @Column(name = "Operand", length = 1000)
    private String operand;

    @Column(name = "Condition")
    private Integer condition;


}