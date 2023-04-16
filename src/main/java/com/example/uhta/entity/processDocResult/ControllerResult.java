package com.example.uhta.entity.processDocResult;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ControllerResults")
public class ControllerResult {
    @Id
    @Column(name = "ResultID", nullable = false)
    private Integer resultID;

    @Column(name = "Project", length = 100)
    private String project;

    @Column(name = "Analysis", length = 100)
    private String analysis;

    @Column(name = "ObjectName", length = 50)
    private String objectName;

    @Column(name = "ControllerID")
    private Integer controllerID;

    @Column(name = "StartTime")
    private Instant startTime;

    @Column(name = "EndTime")
    private Instant endTime;

    @Column(name = "SampleSize")
    private Integer sampleSize;

    @Column(name = "PercentSat")
    private Double percentSat;

    @Column(name = "RPI")
    private Double rpi;

    @Column(name = "Offset")
    private Double offset;

    @Column(name = "StdError")
    private Double stdError;

    @Column(name = "OscillationIndex")
    private Double oscillationIndex;

    @Column(name = "OscillationPeriod")
    private Double oscillationPeriod;

    @Column(name = "SigmaIndex")
    private Double sigmaIndex;

    @Column(name = "mcoh")
    private Double mcoh;

    @Column(name = "XC")
    private Double xc;

    @Column(name = "PI")
    private Double pi;

    @Column(name = "MeanPV")
    private Double meanPV;

    @Column(name = "SF")
    private Double sf;

    @Column(name = "HighSaturation")
    private Double highSaturation;

    @Column(name = "LowSaturation")
    private Double lowSaturation;

    @Column(name = "SamplingTime")
    private Double samplingTime;

    @Column(name = "MeanMV")
    private Double meanMV;

    @Column(name = "StdMV")
    private Double stdMV;

    @Column(name = "StdPV")
    private Double stdPV;

    @Column(name = "SPMean")
    private Double sPMean;

    @Column(name = "SPStDev")
    private Double sPStDev;

    @Column(name = "RiseTime")
    private Double riseTime;

    @Column(name = "SettlingTime")
    private Double settlingTime;

    @Column(name = "TimeDelay")
    private Double timeDelay;

    @Column(name = "CompressionFactor")
    private Double compressionFactor;

    @Column(name = "ValveIndex")
    private Double valveIndex;

    @Column(name = "ActualPoints")
    private Integer actualPoints;

    @Column(name = "InGap")
    private Double inGap;

    @Column(name = "NLI")
    private Double nli;

    @Column(name = "Stiction")
    private Double stiction;

    @Column(name = "StictionConfidence")
    private Double stictionConfidence;

    @Column(name = "ErrorDueToStiction")
    private Double errorDueToStiction;

    @Column(name = "StictionThreshold")
    private Double stictionThreshold;

    @Column(name = "Weight")
    private Double weight;

    @Column(name = "EconomicBenefit")
    private Double economicBenefit;

    @Column(name = "ImpulseResponse")
    private Integer impulseResponse;

    @Column(name = "BenchmarkImpulseResponse")
    private Integer benchmarkImpulseResponse;

    @Column(name = "FrequencyResponse")
    private Integer frequencyResponse;

    @Column(name = "BenchmarkFrequencyResponse")
    private Integer benchmarkFrequencyResponse;

    @Column(name = "PVErr")
    private Integer pVErr;

    @Column(name = "SPErr")
    private Integer sPErr;

    @Column(name = "MeanErr")
    private Double meanErr;

    @Column(name = "AlarmCount")
    private Double alarmCount;

    @Column(name = "EventCount")
    private Double eventCount;

    @Column(name = "DiagnosisComment", length = 500)
    private String diagnosisComment;

    @Column(name = "TuningDiagnosis")
    private Integer tuningDiagnosis;

    @Column(name = "Modes")
    private Integer modes;

    @Column(name = "WasTuned")
    private Boolean wasTuned;

    @Column(name = "IAE")
    private Double iae;

    @Column(name = "FeedForwardXC")
    private Integer feedForwardXC;

    @Column(name = "TuningProportional")
    private Double tuningProportional;

    @Column(name = "TuningIntegral")
    private Double tuningIntegral;

    @Column(name = "TuningDerivative")
    private Double tuningDerivative;

    @Column(name = "TuningGamma")
    private Double tuningGamma;

    @Column(name = "TuningPVFilter")
    private Double tuningPVFilter;

    @Column(name = "TuningComment", length = 500)
    private String tuningComment;

    @Column(name = "EffectiveServiceFactor")
    private Double effectiveServiceFactor;

    @Column(name = "PercentDisposable")
    private Double percentDisposable;

    @Column(name = "ErrorMessage", length = 4000)
    private String errorMessage;

    @Column(name = "NumberOfHoursInDesiredOperatingRange")
    private Double numberOfHoursInDesiredOperatingRange;

    @Column(name = "NumberOfHoursAtOutputLimits")
    private Double numberOfHoursAtOutputLimits;

    @Column(name = "ModeChanges")
    private Integer modeChanges;

    @Column(name = "SPChangesInAutomaticMode")
    private Integer sPChangesInAutomaticMode;

    @Column(name = "OPChangesInManualMode")
    private Integer oPChangesInManualMode;

    @Column(name = "PVMax")
    private Double pVMax;

    @Column(name = "SPMax")
    private Double sPMax;

    @Column(name = "OPMax")
    private Double oPMax;

    @Column(name = "NumberOfHoursInDesiredOPRangePVWithin3Percent")
    private Double numberOfHoursInDesiredOPRangePVWithin3Percent;

    @Column(name = "PercentNotRequired")
    private Double percentNotRequired;

    @Column(name = "RecommendedSettlingTime")
    private Double recommendedSettlingTime;

    @Column(name = "AAE")
    private Double aae;

    @Column(name = "SDAE")
    private Double sdae;

    @Column(name = "InGapTransitions")
    private Double inGapTransitions;

    @Column(name = "PVOutsideLimits")
    private Double pVOutsideLimits;

    @Column(name = "PercentageBadPV")
    private Double percentageBadPV;

    @Column(name = "BadPVStatus")
    private Integer badPVStatus;

    @Column(name = "InstrumentLocation", length = 501)
    private String instrumentLocation;

    @Column(name = "PercentageSelected")
    private Double percentageSelected;

    @Column(name = "IsGap")
    private Integer isGap;

    @Column(name = "IsFeedForward")
    private Integer isFeedForward;

    @Column(name = "IsTuning")
    private Integer isTuning;

    @Column(name = "InstrumentAvailability")
    private Double instrumentAvailability;

    @Column(name = "PVOutOfRange")
    private Double pVOutOfRange;

    @Column(name = "NoOfSpikes")
    private Double noOfSpikes;

    @Column(name = "NoOfROCChanges")
    private Double noOfROCChanges;

    @Column(name = "PVBiplot")
    private Integer pVBiplot;

    @Column(name = "OPBiplot")
    private Integer oPBiplot;

    @Column(name = "ValveReversal")
    private Double valveReversal;

    @Column(name = "ResetFilteredValues")
    private Boolean resetFilteredValues;

    @Column(name = "FilteredStiction")
    private Double filteredStiction;

    @Column(name = "FilteredOSI")
    private Double filteredOSI;

    @Column(name = "FilteredPI")
    private Double filteredPI;

    @Column(name = "FilteredRPI")
    private Double filteredRPI;

    @Column(name = "FilteredSecondaryRPI")
    private Double filteredSecondaryRPI;

    @Column(name = "SecondaryRPI")
    private Double secondaryRPI;

    @Column(name = "IsWrittenToPHD")
    private Boolean isWrittenToPHD;

    @Column(name = "COV")
    private Double cov;

}