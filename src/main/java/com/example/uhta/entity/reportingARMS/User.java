package com.example.uhta.entity.reportingARMS;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "\"User\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "Login", nullable = false, length = 32)
    private String login;

    @Nationalized
    @Column(name = "Password", nullable = false, length = 64)
    private String password;

    @Nationalized
    @Column(name = "FIO", length = 128)
    private String fio;

}