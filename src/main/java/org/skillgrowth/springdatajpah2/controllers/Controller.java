package org.skillgrowth.springdatajpah2.controllers;

import org.skillgrowth.springdatajpah2.models.User;
import org.skillgrowth.springdatajpah2.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {

    private final UserService userService;

    public Controller(UserService uS){
        userService = uS;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
}
