package com.bnta.recipe_API.controllers;

import com.bnta.recipe_API.models.Recipe;
import com.bnta.recipe_API.models.User;
import com.bnta.recipe_API.repositories.RecipeRepository;
import com.bnta.recipe_API.repositories.UserRepository;
import com.bnta.recipe_API.services.RecipeService;
import com.bnta.recipe_API.services.UserService;
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

    @Autowired
    UserService userService;

    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    RecipeService recipeService;

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

    @DeleteMapping(value = {"/{id}"})
    public ResponseEntity<String> removeUser(@PathVariable Long id){
        String userName = userRepository.findById(id).get().getName();
        userRepository.deleteById(id);
        String message = "User " + userName + " has been deleted";
        return new ResponseEntity<>(message,HttpStatus.OK);
    }

    @PutMapping("/fav")
    public ResponseEntity<User> addRecipeToUserFavs(
            @RequestParam Long userId,
            @RequestParam Long recipeId){
        userService.addRecipeToUserFavs(recipeId,userId);
        User user = userRepository.findById(userId).get();
        userRepository.save(user);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @PostMapping("/rating")
    public ResponseEntity<Recipe> addRating(
            @RequestParam Long recipeId,
            @RequestParam float rating
    ){
        Recipe targetRecipe = recipeRepository.findById(recipeId).get();
        userService.addRating(recipeId,rating);
        return new ResponseEntity<>(targetRecipe,HttpStatus.OK);
    }



}
