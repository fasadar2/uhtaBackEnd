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

@Table()
public class ControllerResults {
    @Id
    @Column(name = "\"ResultID\"", nullable = false)
    private Integer resultID;

    @Column(name = "\"PROJECT\"", length = 100)
    private String project;

    @Column(name = "\"ANALYSIS\"", length = 100)
    private String analysis;

    @Column(name = "\"OBJECTNAME\"", length = 50)
    private String objectName;

    @Column(name = "\"CONTROLLERID\"")
    private Integer controllerID;

    @Column(name = "\"STARTTIME\"")
    private Instant startTime;

    @Column(name = "\"ENDTIME\"")
    private Instant endTime;

    @Column(name = "\"SAMPLESIZE\"")
    private Integer sampleSize;

    @Column(name = "\"PERCENTSAT\"")
    private Double percentSat;

    @Column(name = "\"RPI\"")
    private Double rpi;

    @Column(name = "\"OFFSET\"")
    private Double offset;

    @Column(name = "\"STDERROR\"")
    private Double stdError;

    @Column(name = "\"OSCILLATIONINDEX\"")
    private Double oscillationIndex;

    @Column(name = "\"OSCILLATIONPERIOD\"")
    private Double oscillationPeriod;

    @Column(name = "\"SIGMAINDEX\"")
    private Double sigmaIndex;

    @Column(name = "\"MCOH\"")
    private Double mcoh;

    @Column(name = "\"XC\"")
    private Double xc;

    @Column(name = "\"PI\"")
    private Double pi;

    @Column(name = "\"MEANPV\"")
    private Double meanPV;

    @Column(name = "\"SF\"")
    private Double sf;

    @Column(name = "\"HIGHSATURATION\"")
    private Double highSaturation;

    @Column(name = "\"LOWSATURATION\"")
    private Double lowSaturation;

    @Column(name = "\"SAMPLINGTIME\"")
    private Double samplingTime;

    @Column(name = "\"MEANMV\"")
    private Double meanMV;

    @Column(name = "\"STDMV\"")
    private Double stdMV;

    @Column(name = "\"STDPV\"")
    private Double stdPV;

    @Column(name = "\"SPMEAN\"")
    private Double sPMean;

    @Column(name = "\"SPSTDEV\"")
    private Double sPStDev;

    @Column(name = "\"RISETIME\"")
    private Double riseTime;

    @Column(name = "\"SETTLINGTIME\"")
    private Double settlingTime;

    @Column(name = "\"TIMEDELAY\"")
    private Double timeDelay;

    @Column(name = "\"COMPRESSIONFACTOR\"")
    private Double compressionFactor;

    @Column(name = "\"VALVEINDEX\"")
    private Double valveIndex;

    @Column(name = "\"ACTUALPOINTS\"")
    private Integer actualPoints;

    @Column(name = "\"INGAP\"")
    private Double inGap;

    @Column(name = "\"NLI\"")
    private Double nli;

    @Column(name = "\"STICTION\"")
    private Double stiction;

    @Column(name = "\"STICTIONCONFIDENCE\"")
    private Double stictionConfidence;

    @Column(name = "\"ERRORDUETOSTICTION\"")
    private Double errorDueToStiction;

    @Column(name = "\"STICTIONTHRESHOLD\"")
    private Double stictionThreshold;

    @Column(name = "\"WEIGHT\"")
    private Double weight;

    @Column(name = "\"ECONOMICBENEFIT\"")
    private Double economicBenefit;

    @Column(name = "\"IMPULSERESPONSE\"")
    private Integer impulseResponse;

    @Column(name = "\"BENCHMARKIMPULSERESPONSE\"")
    private Integer benchmarkImpulseResponse;

    @Column(name = "\"FREQUENCYRESPONSE\"")
    private Integer frequencyResponse;

    @Column(name = "\"BENCHMARKFREQUENCYRESPONSE\"")
    private Integer benchmarkFrequencyResponse;

    @Column(name = "\"PVERR\"")
    private Integer pVErr;

    @Column(name = "\"SPERR\"")
    private Integer sPErr;

    @Column(name = "\"MEANERR\"")
    private Double meanErr;

    @Column(name = "\"ALARMCOUNT\"")
    private Double alarmCount;

    @Column(name = "\"EVENTCOUNT\"")
    private Double eventCount;

    @Column(name = "\"DIAGNOSISCOMMENT\"", length = 500)
    private String diagnosisComment;

    @Column(name = "\"TUNINGDIAGNOSIS\"")
    private Integer tuningDiagnosis;

    @Column(name = "\"MODES\"")
    private Integer modes;

    @Column(name = "\"WASTUNED\"")
    private Boolean wasTuned;

    @Column(name = "\"IAE\"")
    private Double iae;

    @Column(name = "\"FEEDFORWARDXC\"")
    private Integer feedForwardXC;

    @Column(name = "\"TUNINGPROPORTIONAL\"")
    private Double tuningProportional;

    @Column(name = "\"TUNINGINTEGRAL\"")
    private Double tuningIntegral;

    @Column(name = "\"TUNINGDERIVATIVE\"")
    private Double tuningDerivative;

    @Column(name = "\"TUNINGGAMMA\"")
    private Double tuningGamma;

    @Column(name = "\"TUNINGPVFILTER\"")
    private Double tuningPVFilter;

    @Column(name = "\"TUNINGCOMMENT\"", length = 500)
    private String tuningComment;

    @Column(name = "\"EFFECTIVESERVICEFACTOR\"")
    private Double effectiveServiceFactor;

    @Column(name = "\"PERCENTDISPOSABLE\"")
    private Double percentDisposable;

    @Column(name = "\"ERRORMESSAGE\"", length = 4000)
    private String errorMessage;

    @Column(name = "\"NUMBEROFHOURSINDESIREDOPERATINGRANGE\"")
    private Double numberOfHoursInDesiredOperatingRange;

    @Column(name = "\"NUMBEROFHOURSATOUTPUTLIMITS\"")
    private Double numberOfHoursAtOutputLimits;

    @Column(name = "\"MODECHANGES\"")
    private Integer modeChanges;

    @Column(name = "\"SPCHANGESINAUTOMATICMODE\"")
    private Integer sPChangesInAutomaticMode;

    @Column(name = "\"OPCHANGESINMANUALMODE\"")
    private Integer oPChangesInManualMode;

    @Column(name = "\"PVMAX\"")
    private Double pVMax;

    @Column(name = "\"SPMAX\"")
    private Double sPMax;

    @Column(name = "\"OPMAX\"")
    private Double oPMax;

    @Column(name = "\"NUMBEROFHOURSINDESIREDOPRANGEPVWITHIN3PERCENT\"")
    private Double numberOfHoursInDesiredOPRangePVWithin3Percent;

    @Column(name = "\"PERCENTNOTREQUIRED\"")
    private Double percentNotRequired;

    @Column(name = "\"RECOMMENDEDSETTLINGTIME\"")
    private Double recommendedSettlingTime;

    @Column(name = "\"AAE\"")
    private Double aae;

    @Column(name = "\"SDAE\"")
    private Double sdae;

    @Column(name = "\"INGAPTRANSITIONS\"")
    private Double inGapTransitions;

    @Column(name = "\"PVOUTSIDELIMITS\"")
    private Double pVOutsideLimits;

    @Column(name = "\"PERCENTAGEBADPV\"")
    private Double percentageBadPV;

    @Column(name = "\"BADPVSTATUS\"")
    private Integer badPVStatus;

    @Column(name = "\"INSTRUMENTLOCATION\"", length = 501)
    private String instrumentLocation;

    @Column(name = "\"PERCENTAGESELECTED\"")
    private Double percentageSelected;

    @Column(name = "\"ISGAP\"")
    private Integer isGap;

    @Column(name = "\"ISFEEDFORWARD\"")
    private Integer isFeedForward;

    @Column(name = "\"ISTUNING\"")
    private Integer isTuning;

    @Column(name = "\"INSTRUMENTAVAILABILITY\"")
    private Double instrumentAvailability;

    @Column(name = "\"PVOUTOFRANGE\"")
    private Double pVOutOfRange;

    @Column(name = "\"NOOFSPIKES\"")
    private Double noOfSpikes;

    @Column(name = "\"NOOFROCCHANGES\"")
    private Double noOfROCChanges;

    @Column(name = "\"PVBIPLOT\"")
    private Integer pVBiplot;

    @Column(name = "\"OPBIPLOT\"")
    private Integer oPBiplot;

    @Column(name = "\"VALVEREVERSAL\"")
    private Double valveReversal;

    @Column(name = "\"RESETFILTEREDVALUES\"")
    private Boolean resetFilteredValues;

    @Column(name = "\"FILTEREDSTICTION\"")
    private Double filteredStiction;

    @Column(name = "\"FILTEREDOSI\"")
    private Double filteredOSI;

    @Column(name = "\"FILTEREDPI\"")
    private Double filteredPI;

    @Column(name = "\"FILTEREDRPI\"")
    private Double filteredRPI;

    @Column(name = "\"FILTEREDSECONDARYRPI\"")
    private Double filteredSecondaryRPI;

    @Column(name = "\"SECONDARYRPI\"")
    private Double secondaryRPI;

    @Column(name = "\"ISWRITTENTOPHD\"")
    private Boolean isWrittenToPHD;

    @Column(name = "\"COV\"")
    private Double cov;

}