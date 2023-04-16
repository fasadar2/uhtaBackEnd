package com.example.uhta.entity.processDocPlant;

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
public class WebConfigColumnDefinition {
    @Id
    @Column(name = "Rank", nullable = false)
    private Integer rank;

    @Column(name = "ColumnName", nullable = false, length = 50)
    private String columnName;

    @Column(name = "Description", length = 250)
    private String description;

    @Column(name = "Type", length = 10)
    private String type;

    @Column(name = "Format", length = 50)
    private String format;

    @Column(name = "IsVisible")
    private Boolean isVisible;

    @Column(name = "ColumnTableWidth")
    private Integer columnTableWidth;

    @Column(name = "ColumnGroup", length = 20)
    private String columnGroup;

    @Column(name = "HasLowLimit")
    private Boolean hasLowLimit;

    @Column(name = "HasHighLimit")
    private Boolean hasHighLimit;

    @Column(name = "AddToFollowUpReport")
    private Boolean addToFollowUpReport;

    @Column(name = "CanEdit")
    private Boolean canEdit;

    @Column(name = "NullMessage", length = 50)
    private String nullMessage;

    @Column(name = "DontFlagViolating")
    private Boolean dontFlagViolating;


}