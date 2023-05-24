package org.skillgrowth.springdatajpah2.services;

import org.skillgrowth.springdatajpah2.models.User;
import org.skillgrowth.springdatajpah2.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository uR){
        userRepository = uR;
        userRepository.save(new User("Adam", "password"));
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
