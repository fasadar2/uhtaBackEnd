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
public class AttrSubscrListId implements Serializable {
    private static final long serialVersionUID = -4599065522303447766L;
    @Column(name = "METHOD_ID", nullable = false)
    private Integer methodId;

    @Column(name = "ATTRIBUTE_TYPE_ID", nullable = false)
    private Integer attributeTypeId;





}