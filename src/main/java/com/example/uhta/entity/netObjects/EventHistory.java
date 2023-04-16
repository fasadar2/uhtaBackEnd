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
@Table(name = "EVENT_HISTORY")
public class EventHistory {
    @Id
    @Column(name = "TRANS_NO", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OBJECT_ID", nullable = false)
    private Object object;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_TYPE_GROUP_ID", nullable = false)
    private AttributeTypeGroup attributeTypeGroup;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_TYPE_ID", nullable = false)
    private AttributeType attributeType;

    @Nationalized
    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Nationalized
    @Column(name = "STATUS", length = 500)
    private String status;

    @Column(name = "EVENT_TIME", nullable = false)
    private Integer eventTime;



}