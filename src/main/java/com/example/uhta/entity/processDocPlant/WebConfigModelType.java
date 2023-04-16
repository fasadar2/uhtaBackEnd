package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WebConfigModelTypes")
public class WebConfigModelType {
    @Id
    @Column(name = "NetObjectType", nullable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ModelType", nullable = false)
    private WebConfigModelTypeDefinition modelType;


}