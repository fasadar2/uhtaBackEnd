package com.example.uhta.service;

import com.example.uhta.SubRepos.UserRepository;
import com.example.uhta.entity.uhtaDb.User;
import com.example.uhta.model.reciveModel.UserModelRecive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    UserRepository userRepository;
    public User Auth(UserModelRecive userModel){
        return userRepository.getUserByLoginAndPassword(userModel.getLogin(), userModel.getPassword());
    }
}
