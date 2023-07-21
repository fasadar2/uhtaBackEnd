package com.example.uhta.model.requestModel;

import com.example.uhta.entity.uhtaDb.User;
import com.example.uhta.model.UserModel;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;

@Builder
@Data
public class PatternModelReq {
    private Integer id;
    private String name;
    private String desc;
    private LocalDate dateOfCreate;
    private Integer frequency;
    private Boolean isActive;
    private UserModel userID;

}
