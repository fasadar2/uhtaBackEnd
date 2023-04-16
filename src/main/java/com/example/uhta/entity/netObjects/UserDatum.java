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
@Table(name = "USER_DATA")
public class UserDatum {
    @Id
    @Column(name = "USER_ID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "NAME", nullable = false, length = 126)
    private String name;

    @Nationalized
    @Column(name = "USER_PWD", nullable = false, length = 100)
    private String userPwd;

    @Column(name = "IS_ADMIN", nullable = false)
    private Boolean isAdmin = false;

    @Column(name = "ARCHIVED", nullable = false)
    private Boolean archived = false;



}