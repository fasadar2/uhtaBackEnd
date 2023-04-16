package com.example.uhta.entity.processDoc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class OnlineHelp {
    @Id
    @Column(name = "HelpID", nullable = false)
    private Integer id;

    @Column(name = "ResourceName", nullable = false, length = 100)
    private String resourceName;

    @Column(name = "ContextLinkID", length = 500)
    private String contextLinkID;

    @Column(name = "HelpLinkID", length = 500)
    private String helpLinkID;

    @Column(name = "Description")
    private String description;



}