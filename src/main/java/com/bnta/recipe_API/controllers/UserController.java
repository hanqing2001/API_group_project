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
    UserService userService;

    @Autowired
    RecipeService recipeService;

    @PostMapping
    public ResponseEntity<User> addNewUser(@RequestBody User user){
        User newUser = userService.addUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }

    @DeleteMapping(value = {"/{id}"})
    public ResponseEntity<String> removeUser(@PathVariable Long id){
        userService.removeUser(id);
        String message = "User " + id + " has been deleted";
        return new ResponseEntity<>(message,HttpStatus.OK);
    }

    @PutMapping("/fav")
    public ResponseEntity<String> addRecipeToUserFavs(
            @RequestParam Long userId,
            @RequestParam Long recipeId){
        userService.addRecipeToUserFavs(recipeId,userId);
        String message = "Recipe " + recipeId + " has been added to favourites";
        return new ResponseEntity<>(message,HttpStatus.OK);
    }

    @PostMapping("/rating")
    public ResponseEntity<String> addRating(
            @RequestParam Long recipeId,
            @RequestParam float rating
    ){
        userService.addRating(recipeId,rating);
        String message = "A rating of "+ rating+" has been added to recipe "+recipeId;
        return new ResponseEntity<>(message,HttpStatus.OK);
    }



}
