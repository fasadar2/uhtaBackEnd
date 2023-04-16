package com.example.uhta.entity.netObjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class ObjectExistEventHistoryId implements Serializable {
    private static final long serialVersionUID = 2194139974674177114L;
    @Column(name = "OBJECT_ID", nullable = false)
    private Integer objectId;

    @Column(name = "EVENT_TIME", nullable = false)
    private Integer eventTime;

    @Column(name = "OBJECT_EVENT_TYPE_ID", nullable = false)
    private Integer objectEventTypeId;

    @Column(name = "USER_ID", nullable = false)
    private Integer userId;



}