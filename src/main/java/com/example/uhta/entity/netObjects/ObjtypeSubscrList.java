package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "OBJTYPE_SUBSCR_LIST")
public class ObjtypeSubscrList {
    @EmbeddedId
    private ObjtypeSubscrListId id;

    @MapsId("objectTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OBJECT_TYPE_ID", nullable = false)
    private ObjectType objectType;

    @MapsId("moduleId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MODULE_ID", nullable = false)
    private Module module;

    @Column(name = "LEVELS_UP")
    private Integer levelsUp;

    @Column(name = "UPSEARCHOBJECT_TYPE_ID")
    private Integer upsearchobjectTypeId;



}