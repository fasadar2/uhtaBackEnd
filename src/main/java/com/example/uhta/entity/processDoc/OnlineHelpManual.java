package com.example.uhta.entity.processDoc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "OnlineHelpManuals")
public class OnlineHelpManual {
    @Id
    @Column(name = "ManualID", nullable = false)
    private Integer id;

    @Column(name = "ManualName", length = 50)
    private String manualName;

    @Column(name = "HelpLink", length = 500)
    private String helpLink;

    @Column(name = "Installed", nullable = false)
    private Boolean installed = false;



}