package com.example.uhta.entity.processDocPlant;

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
@Table(name = "WebConfigSMTPServers")
public class WebConfigSMTPServer {
    @Id
    @Column(name = "Name", nullable = false, length = 50)
    private String id;

    @Column(name = "Host", nullable = false, length = 50)
    private String host;

    @Column(name = "Port", nullable = false)
    private Integer port;

    @Column(name = "EnableSSL", nullable = false)
    private Boolean enableSSL = false;

    @Column(name = "UseDefaultCredentials", nullable = false)
    private Boolean useDefaultCredentials = false;

    @Column(name = "UserName", length = 100)
    private String userName;

    @Column(name = "Password", length = 100)
    private String password;

    @Column(name = "DomainName", length = 100)
    private String domainName;

    @Column(name = "PickupDirectory", length = 256)
    private String pickupDirectory;

    @Column(name = "Timeout", nullable = false)
    private Integer timeout;



}