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
public class StateSubscrListId implements Serializable {
    private static final long serialVersionUID = -5806413160228055235L;
    @Column(name = "METHOD_ID", nullable = false)
    private Integer methodId;

    @Column(name = "STATE_ID", nullable = false)
    private Integer stateId;



}