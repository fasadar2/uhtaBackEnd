package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class WebConfigFilterSetValueId implements Serializable {
    private static final long serialVersionUID = 3843682994740778121L;
    @Column(name = "FilterSetID", nullable = false)
    private Integer filterSetID;

    @Column(name = "FilterID", nullable = false)
    private Integer filterID;





}