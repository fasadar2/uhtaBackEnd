package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WebConfigGroupDispositionRelations")
public class WebConfigGroupDispositionRelation {
    @Id
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "GroupID", nullable = false)
    private WebConfigGroupDispositionName groupID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "DispositionID", nullable = false)
    private WebConfigDispositionName dispositionID;



}