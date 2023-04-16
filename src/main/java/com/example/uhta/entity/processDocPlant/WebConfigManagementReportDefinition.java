package com.example.uhta.entity.processDocPlant;

import jakarta.persistence.*;
import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "WebConfigManagementReportDefinitions")
public class WebConfigManagementReportDefinition {
    @Id
    @Column(name = "ReportName", nullable = false, length = 100)
    private String id;

    @Column(name = "ObjectID")
    private Integer objectID;

    @Column(name = "PlantPath", length = 1000)
    private String plantPath;

    @Column(name = "Depth")
    private Integer depth;

    @Column(name = "Trend1KPIList", length = 1000)
    private String trend1KPIList;

    @Column(name = "Trend2KPIList", length = 1000)
    private String trend2KPIList;

    @Column(name = "SMTPServer", length = 50)
    private String sMTPServer;

    @Column(name = "Priority", length = 10)
    private String priority;

    @Column(name = "ToAddr", length = 1000)
    private String toAddr;

    @Column(name = "CCAddr", length = 1000)
    private String cCAddr;

    @Column(name = "BCCAddr", length = 1000)
    private String bCCAddr;

    @Column(name = "Subject", length = 1000)
    private String subject;

    @Column(name = "ReplyToAddr", length = 1000)
    private String replyToAddr;

    @Column(name = "Frequency", length = 100)
    private String frequency;

    @Column(name = "Enabled")
    private Boolean enabled;

    @Column(name = "DisplayChildren")
    private Boolean displayChildren;

    @Column(name = "BusinessUnit", length = 100)
    private String businessUnit;

    @Column(name = "TreemapColor", length = 100)
    private String treemapColor;

    @Column(name = "TreemapSize", length = 100)
    private String treemapSize;

    @Column(name = "TreemapGroup", length = 100)
    private String treemapGroup;

    @Column(name = "PdfConversionDelay")
    private Integer pdfConversionDelay;

    @Column(name = "ImageConversionDelay")
    private Integer imageConversionDelay;

    @Lob
    @Column(name = "AnnotationTreemap")
    private String annotationTreemap;

    @Lob
    @Column(name = "AnnotationTrend1")
    private String annotationTrend1;

    @Lob
    @Column(name = "AnnotationTrend2")
    private String annotationTrend2;

    @Lob
    @Column(name = "AnnotationDetailedTrend")
    private String annotationDetailedTrend;

    @Lob
    @Column(name = "TreeMapHeader")
    private String treeMapHeader;

    @Lob
    @Column(name = "MainTrendHeader")
    private String mainTrendHeader;

    @Lob
    @Column(name = "DetailTrendHeader")
    private String detailTrendHeader;


}