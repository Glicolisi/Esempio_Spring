package com.example.springinizio.controller;

import com.example.springinizio.entities.User;
import com.example.springinizio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/save")
    public void saveUser (){
        User user = new User();
        user.setUsername("root");
        user.setPassword("password");
        userRepository.save(user);
    }

    @PostMapping("/save/1")
    public User saveUser (@RequestBody User user){

        return userRepository.save(user);

    }
}
