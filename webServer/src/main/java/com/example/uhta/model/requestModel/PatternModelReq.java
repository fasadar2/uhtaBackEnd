package com.example.uhta.model.requestModel;

import com.example.uhta.model.UserModel;
import lombok.*;

import java.time.LocalDate;

@Builder
@Data
public class PatternModelReq {
	private Integer id;
	private String title;
	private String desc;
	private LocalDate dateOfCreate;
	private Integer frequency;
	private Boolean isActive;
	private UserModel userID;
}
