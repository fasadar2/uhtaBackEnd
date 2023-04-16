package com.example.uhta.entity.netObjects;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "BLOB_VALUES")
public class BlobValue {
    @Id
    @Column(name = "ATTRIBUTE_ID", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ATTRIBUTE_ID", nullable = false)
    private Attribute attributes;

    @Column(name = "DATA_VALUE")
    private byte[] dataValue;



}