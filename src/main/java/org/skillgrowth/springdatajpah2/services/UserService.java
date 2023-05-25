package org.skillgrowth.springdatajpah2.services;

import org.skillgrowth.springdatajpah2.dtos.UserDTO;
import org.skillgrowth.springdatajpah2.models.User;
import org.skillgrowth.springdatajpah2.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository uR){
        userRepository = uR;
        userRepository.save(new User("Adam", "password"));
    }

    public List<UserDTO> getAllUsers(){
        return userRepository.findAll().stream()
                    .map(i -> new UserDTO(i.getId(), i.getUsername()))
                    .collect(Collectors.toList());
    }
}
