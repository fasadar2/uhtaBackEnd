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
    String Description;
    String AssetType;
    float weight;
    float oscillationIndex;
    float serviceFactor;
    float effectiveServiceFactor;
    LocalDateTime disspositionFlaggedDate;
    LocalDateTime disspositionEntryDate;
    String  disposition;
    int weeksInCurrentDisposition;
    List<String> dispositionComment;


}
