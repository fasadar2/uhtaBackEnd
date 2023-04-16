package com.example.uhta.entity.netObjects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Nationalized;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "OBJECT_EVENT_TYPE")
public class ObjectEventType {
    @Id
    @Column(name = "OBJECT_EVENT_TYPE_ID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "COL_EVENT_TYPE_NAME", nullable = false, length = 100)
    private String colEventTypeName;



}