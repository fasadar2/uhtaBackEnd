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
public class ObjectPermissionId implements Serializable {
    private static final long serialVersionUID = -9009709892264832629L;
    @Column(name = "OBJECT_ID", nullable = false)
    private Integer objectId;

    @Column(name = "USER_ID", nullable = false)
    private Integer userId;



}