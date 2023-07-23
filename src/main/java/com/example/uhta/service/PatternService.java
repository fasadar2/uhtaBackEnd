package com.example.uhta.service;


import com.example.uhta.entity.uhtaDb.Pattern;
import com.example.uhta.model.reciveModel.PatternModel;
import com.example.uhta.model.requestModel.PatternModelReq;

import com.example.uhta.SubRepos.PatternRepository;
import com.example.uhta.SubRepos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalDate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatternService {
    @Autowired
    PatternRepository patternRepository;
    @Autowired
    UserRepository userRepository;
    public List<PatternModelReq> GetAllPattern(){
        return patternRepository.findAll().stream()
                .map(ParserAndConvertor::PatternToPatternModel)
                .collect(Collectors.toList());
    }
    public Pattern SetPattern(PatternModel model){
        return patternRepository.save(Pattern.builder()
                .userID(userRepository.getUserById(model.getUser().getId()))
                .isActive(model.getIsActive())
                .dateOfCreate(LocalDate.now())
                .desc(model.getDescription())
                .frequency(model.getFrequency())
                .name(model.getTitle())
                .build());
    }


}
