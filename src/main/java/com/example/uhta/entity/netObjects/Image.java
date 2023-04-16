package com.example.uhta.entity.netObjects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.hibernate.annotations.Nationalized;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "IMAGES")
public class Image {
    @Id
    @Column(name = "IMAGE_ID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "IMAGE_NAME", nullable = false, length = 100)
    private String imageName;

    @Nationalized
    @Column(name = "IMAGE_LOCATION", nullable = false, length = 250)
    private String imageLocation;



}