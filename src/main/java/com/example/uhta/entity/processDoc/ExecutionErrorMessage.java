package com.example.uhta.entity.processDoc;

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
@Table(name = "ExecutionErrorMessages")
public class ExecutionErrorMessage {
    @Id
    @Column(name = "MessageID", nullable = false)
    private Integer id;

    @Column(name = "FunctionID", nullable = false)
    private Integer functionID;

    @Column(name = "ErrorID", nullable = false)
    private Integer errorID;

    @Column(name = "Message", length = 300)
    private String message;

    @Column(name = "Priority")
    private Integer priority;



}