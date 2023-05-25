package org.skillgrowth.springdatajpah2.services;

import org.skillgrowth.springdatajpah2.dtos.UserDTO;
import org.skillgrowth.springdatajpah2.models.User;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class UserToDTOMapper implements Function<User, UserDTO> {

    @Override
    public UserDTO apply(User user) {
        return new UserDTO(user.getId(), user.getUsername());
    }
}
