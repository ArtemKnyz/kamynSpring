package com.kamin.kamin.controllers;

import com.kamin.kamin.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    @GetMapping("/registrtion")
    public String registrtion(){
        return "registrtion";
    }

    @PostMapping("/registration")
    public String addUser(User user) {
        return "redirect:login";
    }


}
