package com.example.uhta.service;

import com.example.uhta.SubRepos.UserRepository;
import com.example.uhta.model.reciveModel.UserModelRecive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    UserRepository userRepository;
    public UserModelRecive Auth(UserModelRecive userModel){
        return ParserAndConvertor.UserToUserModelRecive(userRepository.getUserByLoginAndPassword(userModel.getLogin(), userModel.getPassword()));
    }
}
