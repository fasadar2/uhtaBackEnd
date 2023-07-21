package com.example.uhta.service;

import com.example.uhta.entity.processDocResult.ControllerResults;
import com.example.uhta.entity.uhtaDb.Pattern;
import com.example.uhta.entity.uhtaDb.User;
import com.example.uhta.model.UserModel;
import com.example.uhta.model.reciveModel.PatternModel;
import com.example.uhta.model.requestModel.PatternModelReq;
import com.example.uhta.model.requestModel.PlateModel;
import com.example.uhta.repos1.PatternRepository;
import com.example.uhta.repos1.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatternService {
    @Autowired
    PatternRepository patternRepository;
    @Autowired
    UserRepository userRepository;
    public List<PatternModelReq> GetAllPattern(){
        return patternRepository.getPatterns().stream()
                .map(this::PatternToPatternModel)
                .collect(Collectors.toList());
    }
    public Pattern SetPattern(PatternModel model){
        return patternRepository.save(Pattern.builder()
                .userID(userRepository.getUserById(model.getUser()))
                .isActive(model.getIsActive())
                .dateOfCreate(LocalDate.now())
                .desc(model.getDescription())
                .frequency(model.getFrequency())
                .name(model.getTitle())
                .build());
    }
    private boolean BitConverter(Integer bool ){
        if (bool == 1) return true;
        else return false;
    }
    private Integer BitConverter(boolean bool ){
        if (bool) return 1;
        else return 0;
    }
    private PatternModelReq PatternToPatternModel(Pattern pattern){

        return PatternModelReq.builder()
                .id(pattern.getId())
                .desc(pattern.getDesc())
                .name(pattern.getName())
                .userID( UserToUserModel(pattern.getUserID()))
                .dateOfCreate(pattern.getDateOfCreate())
                .frequency(pattern.getFrequency())
                .isActive(pattern.getIsActive())
                .build();
    }
    private UserModel UserToUserModel(User user){
        return UserModel.builder()
                .id(user.getId())
                .name(user.getFio())
                .build();
    }
}
