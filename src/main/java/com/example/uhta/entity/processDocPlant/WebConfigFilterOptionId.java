package com.example.uhta.entity.processDocPlant;

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
public class WebConfigFilterOptionId implements Serializable {
    private static final long serialVersionUID = 5945885829802219358L;
    @Column(name = "FilterID", nullable = false)
    private Integer filterID;

    @Column(name = "OptionName", nullable = false, length = 50)
    private String optionName;



}