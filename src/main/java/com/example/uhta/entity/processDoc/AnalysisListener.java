package com.example.uhta.entity.processDoc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Entity
@Table(name = "AnalysisListeners")
public class AnalysisListener {
    @Id
    @Column(name = "ListenerID", nullable = false)
    private Integer id;

    @Column(name = "Host", nullable = false, length = 50)
    private String host;

    @Column(name = "Port", nullable = false)
    private Integer port;

    @Column(name = "SPID")
    private Integer spid;

    @Column(name = "LoginTime")
    private Instant loginTime;



/*
    TODO [JPA Buddy] create field to map the '\"Timestamp\"' column
     Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "\"Timestamp\"", columnDefinition = "timestamp(8)")
    private Object timestamp;
*/
}