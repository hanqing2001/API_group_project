package com.bnta.recipe_API.services;

import com.bnta.recipe_API.models.Recipe;
import com.bnta.recipe_API.models.User;
import com.bnta.recipe_API.repositories.RecipeRepository;
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

    @Autowired
    RecipeRepository recipeRepository;

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

    public void addRecipeToUserFavs(Long recipeId, Long userId){
        User targetUser = userRepository.findById(userId).get();
        Recipe targetRecipe = recipeRepository.findById(recipeId).get();
        targetUser.addRecipeToUserFavs(targetRecipe);
    }

    public void addRating(Long id, Float rating){
        Recipe targetRecipe = recipeRepository.findById(id).get();
        Float newAverageRating = ((rating + (targetRecipe.getNoRatedUsers() * targetRecipe.getAverageRating() )) / (1 + targetRecipe.getNoRatedUsers() ) );
        targetRecipe.setAverageRating(newAverageRating);
        targetRecipe.setNoRatedUsers(targetRecipe.getNoRatedUsers() + 1);
        recipeRepository.save(targetRecipe);
    }
}
