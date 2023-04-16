package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "AUDIT_EVENTS")
public class AuditEvent {
    @EmbeddedId
    private AuditEventId id;

    @MapsId("attributeId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_ID", nullable = false)
    private Attribute attribute;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserDatum user;

    @Nationalized
    @Column(name = "DATA_VALUE", nullable = false, length = 1500)
    private String dataValue;

    @Column(name = "DATE_INSERTED", nullable = false)
    private Integer dateInserted;

    @Column(name = "EVENT_TRIG", nullable = false)
    private Boolean eventTrig = false;



}