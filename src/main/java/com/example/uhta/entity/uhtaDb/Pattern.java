package com.example.uhta.entity.uhtaDb;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Pattern {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Nationalized
    @Lob
    @Column(name = "Name", nullable = false)
    private String name;

    @Nationalized
    @Lob
    @Column(name = "\"Desc\"")
    private String desc;

    @Column(name = "DateOfCreate", nullable = false)
    private LocalDate dateOfCreate;

    @Column(name = "Frequency")
    private Integer frequency;

    @Column(name = "IsActive", nullable = false)
    private Boolean isActive = false;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "UserID", nullable = false)
    private User userID;

}