package com.example.uhta.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserModel {

    private Integer id;
    private String  name;
    private String surname;
    private boolean isAdmin;
    private String email;

}
