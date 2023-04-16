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
public class ObjtypeSubscrListId implements Serializable {
    private static final long serialVersionUID = -656360307748669775L;
    @Column(name = "OBJECT_TYPE_ID", nullable = false)
    private Integer objectTypeId;

    @Column(name = "MODULE_ID", nullable = false)
    private Integer moduleId;



}