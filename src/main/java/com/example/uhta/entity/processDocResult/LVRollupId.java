package com.example.uhta.entity.processDocResult;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class LVRollupId implements Serializable {
    private static final long serialVersionUID = -3630013487591178705L;
    @Column(name = "ObjectID", nullable = false)
    private Integer objectID;

    @Column(name = "EndTime", nullable = false)
    private Instant endTime;


}