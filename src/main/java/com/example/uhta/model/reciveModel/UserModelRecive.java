package com.example.uhta.model.reciveModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class UserModelRecive {
    private String login;
    private String password;
}
