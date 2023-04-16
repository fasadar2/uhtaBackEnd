package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "OBJECT_PERMISSIONS")
public class ObjectPermission {
    @EmbeddedId
    private ObjectPermissionId id;

    @MapsId("objectId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "OBJECT_ID", nullable = false)
    private Object object;

    @MapsId("userId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    private UserDatum user;

    @Column(name = "PERM_LEVEL", nullable = false)
    private Integer permLevel;



}