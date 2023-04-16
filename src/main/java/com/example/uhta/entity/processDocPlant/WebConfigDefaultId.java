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
public class WebConfigDefaultId implements Serializable {
    private static final long serialVersionUID = 6140242540051350340L;
    @Column(name = "UserID", nullable = false, length = 50)
    private String userID;

    @Column(name = "AssetFilter", nullable = false, length = 50)
    private String assetFilter;

    @Column(name = "ViewType", nullable = false, length = 20)
    private String viewType;

    @Column(name = "Parameter", nullable = false, length = 50)
    private String parameter;


}