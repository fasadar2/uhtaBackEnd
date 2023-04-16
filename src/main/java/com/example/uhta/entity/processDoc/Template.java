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
public class Template {
    @Id
    @Column(name = "TemplateID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "AnalysisID", nullable = false)
    private Analysis analysisID;

    @Column(name = "MasterController", length = 50)
    private String masterController;

    @Column(name = "LinkedNetObjectTypeID", length = 250)
    private String linkedNetObjectTypeID;

    @Column(name = "ManageNetObjectType", nullable = false)
    private Boolean manageNetObjectType = false;


}