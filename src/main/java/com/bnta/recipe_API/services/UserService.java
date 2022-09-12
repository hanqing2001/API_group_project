package com.bnta.recipe_API.services;

import com.bnta.recipe_API.models.User;
import com.bnta.recipe_API.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    public User saveUser(User user){
        userRepository.save(user);
        return user;
    }

    public void removeUser(Long id){
        userRepository.deleteById(id);
    }
}
