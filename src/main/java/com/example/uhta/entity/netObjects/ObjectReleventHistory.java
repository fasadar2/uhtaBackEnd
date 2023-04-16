package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "OBJECT_RELEVENT_HISTORY")
public class ObjectReleventHistory {
    @EmbeddedId
    private ObjectReleventHistoryId id;

    @MapsId("parentObjectId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PARENT_OBJECT_ID", nullable = false)
    private Object parentObject;

    @MapsId("relatedObjectId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RELATED_OBJECT_ID", nullable = false)
    private Object relatedObject;

    @MapsId("relationshipTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RELATIONSHIP_TYPE_ID", nullable = false)
    private RelationshipType relationshipType;

    @MapsId("objectEventTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OBJECT_EVENT_TYPE_ID", nullable = false)
    private ObjectEventType objectEventType;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserDatum user;



}