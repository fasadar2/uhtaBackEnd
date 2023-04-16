package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "WebConfigDispositionEmails")
public class WebConfigDispositionEmail {
    @Id
    @Column(name = "Name", nullable = false, length = 100)
    private String id;

    @Column(name = "Enabled", nullable = false)
    private Boolean enabled = false;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SMTPServer", nullable = false)
    private WebConfigSMTPServer sMTPServer;

    @Column(name = "Subject", nullable = false, length = 100)
    private String subject;

    @Column(name = "Priority", nullable = false, length = 10)
    private String priority;

    @Column(name = "FromAddr", nullable = false, length = 100)
    private String fromAddr;

    @Column(name = "ToAddr", nullable = false, length = 1000)
    private String toAddr;

    @Column(name = "CCAddr", length = 1000)
    private String cCAddr;

    @Column(name = "BCCAddr", length = 1000)
    private String bCCAddr;

    @Column(name = "SenderAddr", length = 100)
    private String senderAddr;

    @Column(name = "ReplyToAddr", length = 100)
    private String replyToAddr;

    @Column(name = "Message", length = 1000)
    private String message;

    @Column(name = "MessageHTML", nullable = false)
    private Boolean messageHTML = false;

    @Column(name = "ModelTypes", length = 100)
    private String modelTypes;

    @Column(name = "AssetGroups", length = 1000)
    private String assetGroups;

    @Nationalized
    @Column(name = "Dispositions", length = 2000)
    private String dispositions;

    @Column(name = "SortColumn", length = 100)
    private String sortColumn;

    @Column(name = "SortAscending")
    private Boolean sortAscending;

    @Column(name = "SortBenchmarks")
    private Boolean sortBenchmarks;

    @Column(name = "UseIL")
    private Boolean useIL;

    @Column(name = "OIUserName", length = 50)
    private String oIUserName;

    @Column(name = "OIPassword", length = 100)
    private String oIPassword;

    @Column(name = "ExplicitLogin")
    private Boolean explicitLogin;

    @Column(name = "AttachPDF", nullable = false)
    private Boolean attachPDF = false;

    @Column(name = "ReportLang", length = 100)
    private String reportLang;



}