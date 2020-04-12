package com.kamynof.kamyn.controllers;

import com.kamynof.kamyn.model.User;
import com.kamynof.kamyn.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class someController {

    private final UserService userService;

    @GetMapping("/hello/{id}")
    public User sayHello(@PathVariable Long id){
              return userService.getUser(id);
    }



}
