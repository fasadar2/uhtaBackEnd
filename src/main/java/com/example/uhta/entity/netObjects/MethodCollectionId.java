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
public class MethodCollectionId implements Serializable {
    private static final long serialVersionUID = 2241471615340546093L;
    @Column(name = "METHOD_ID", nullable = false)
    private Integer methodId;

    @Column(name = "COLLECTION_ID", nullable = false)
    private Integer collectionId;



}