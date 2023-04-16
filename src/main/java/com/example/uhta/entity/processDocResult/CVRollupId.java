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
public class CVRollupId implements Serializable {
    private static final long serialVersionUID = 6504494182530767830L;
    @Column(name = "ObjectID", nullable = false)
    private Integer objectID;

    @Column(name = "EndTime", nullable = false)
    private Instant endTime;


}