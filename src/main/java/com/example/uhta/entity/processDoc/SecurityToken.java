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
@Table(name = "SecurityTokens")
public class SecurityToken {
    @Id
    @Column(name = "TokenID", nullable = false)
    private Integer id;

    @Column(name = "UserName", nullable = false, length = 50)
    private String userName;

    @Column(name = "KeyName", nullable = false, length = 50)
    private String keyName;

    @Column(name = "Token1")
    private byte[] token1;

    @Column(name = "Token2")
    private byte[] token2;



}