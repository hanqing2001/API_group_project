package com.bnta.recipe_API.controllers;

import com.bnta.recipe_API.models.User;
import com.bnta.recipe_API.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public ResponseEntity<User> addNewUser(@RequestBody User user){
        User newUser = userRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userRepository.findAll();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<String> removeUser(Long id){
        String userName = userRepository.findById(id).get().getName();
        userRepository.deleteById(id);
        String message = "User " + userName + " has been deleted";
        return new ResponseEntity<>(message,HttpStatus.OK);
    }
}
