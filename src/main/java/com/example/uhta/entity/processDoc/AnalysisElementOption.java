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
@Table(name = "AnalysisElementOptions")
public class AnalysisElementOption {
    @Id
    @Column(name = "OptionID", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "ElementID", nullable = false)
    private AnalysisElement elementID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "FnOptionID", nullable = false)
    private FunctionOption fnOptionID;

    @Column(name = "IsLongOption", nullable = false)
    private Boolean isLongOption = false;

    @Column(name = "\"Value\"", length = 300)
    private String value;

    @Lob
    @Column(name = "LongValue")
    private String longValue;



}