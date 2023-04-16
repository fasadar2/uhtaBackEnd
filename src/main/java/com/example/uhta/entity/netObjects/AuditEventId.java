package com.example.uhta.entity.netObjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class AuditEventId implements Serializable {
    private static final long serialVersionUID = 3079110385801666288L;
    @Column(name = "TRANS_NO", nullable = false)
    private Integer transNo;

    @Column(name = "ATTRIBUTE_ID", nullable = false)
    private Integer attributeId;



}