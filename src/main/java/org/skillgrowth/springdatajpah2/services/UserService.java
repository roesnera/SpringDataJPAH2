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
    private final UserToDTOMapper userToDtoMapper;

    public UserService(UserRepository uR, UserToDTOMapper utdtom){
        userRepository = uR;
        userRepository.save(new User("Adam", "password"));
        userToDtoMapper = utdtom;
    }

    public List<UserDTO> getAllUsers(){
        return userRepository.findAll().stream()
                    .map(userToDtoMapper)
                    .collect(Collectors.toList());
    }
}
