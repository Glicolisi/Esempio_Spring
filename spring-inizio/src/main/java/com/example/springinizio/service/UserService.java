package com.example.springinizio.service;

import com.example.springinizio.controller.DTO.SaveUserRequest;
import com.example.springinizio.entities.User;
import com.example.springinizio.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User save (SaveUserRequest saveUserRequest){
        //Dobbiamo vedere che non ci siano due user uguali
        //SELECT * FROM USER WHERE USERNAME = saveUserRequest.getUsername

        Optional<User> User = userRepository.findbyUsername(saveUserRequest.getUsername());
        if(User.isPresent()){
          throw new RuntimeException("Username"+saveUserRequest.getUsername());
        }else {
            User user = new User(saveUserRequest.getUsername(), saveUserRequest.getPassword());
            user= userRepository.save(user);
            return user;
        }
    }
}
