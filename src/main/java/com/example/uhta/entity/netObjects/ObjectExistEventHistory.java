package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "OBJECT_EXIST_EVENT_HISTORY")
public class ObjectExistEventHistory {
    @EmbeddedId
    private ObjectExistEventHistoryId id;

    @MapsId("objectId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OBJECT_ID", nullable = false)
    private Object object;

    @MapsId("objectEventTypeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OBJECT_EVENT_TYPE_ID", nullable = false)
    private ObjectEventType objectEventType;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserDatum user;



}