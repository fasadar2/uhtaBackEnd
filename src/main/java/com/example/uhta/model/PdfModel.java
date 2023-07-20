package com.example.uhta.model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class PdfModel {
    private String name;
    private String AssetType;
    private float weight;
    private float oscillationIndex;
    private float serviceFactor;
    private float effectiveServiceFactor;
    private LocalDateTime disspositionFlaggedDate;
    private LocalDateTime disspositionEntryDate;
    private String  disposition;
    private int weeksInCurrentDisposition;
    private List<String> dispositionComment;


}
