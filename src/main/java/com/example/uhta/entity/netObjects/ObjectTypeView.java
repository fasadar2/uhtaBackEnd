package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "OBJECT_TYPE_VIEWS")
public class ObjectTypeView {
    @EmbeddedId
    private ObjectTypeViewId id;

    @MapsId("objectTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OBJECT_TYPE_ID", nullable = false)
    private ObjectType objectType;

    @MapsId("viewId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "VIEW_ID", nullable = false)
    private View view;

    @Column(name = "IS_DEFAULT", nullable = false)
    private Boolean isDefault = false;



}