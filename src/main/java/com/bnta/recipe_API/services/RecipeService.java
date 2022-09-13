package com.bnta.recipe_API.services;

import com.bnta.recipe_API.models.Recipe;

import com.bnta.recipe_API.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository recipeRepository;

    // get all recipes

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    // Method to: get a specific recipe, get recipe by id
    //    Optional: means it either has something in it or it doesn't
    public Optional<Recipe> getRecipeById(Long id){
        return recipeRepository.findById(id);
    }



//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    //add rating:?????????????????????
//    public Recipe saveRating(Recipe recipe) {
//        recipeRepository.save(recipe);
//        return recipe;
//    }
//
//
//
//
////Method to addRecipe:
//    //    Method to: take recipe object + persist to repository
//    public Recipe saveRecipe(Recipe recipe) {
//        recipeRepository.save(new(recipe);
//        return recipe;
//    }
//
//    //Method to get dietaryRequirement(String):List<Recipe>
//    public List<Recipe> getDietaryRequirement(){
//        return recipeRepository.getDietaryRequirement();
//    }
//
//    //Method to remove recipe (by id):
//
//    @DeleteMapping("/deleteRecipe{id}")
//    public void deleteRecipe(@PathVariable Float id) {
//
//        RecipeRepository.deleteById(id);
//
//    public void removeRecipe(Long recipeId) {
//        recipeRepository.removeRecipe(recipeId);
//    }
//
//    //Method to getByRating:
//
//    public Optional<Recipe> findByRating(Float rating ) {
//        return recipeRepository.findByRating(rating);
//
//    }
//
//    //Method to getByMaxCaloriesPerServing(int):
//
//
//    //Method to getAllergenInfo
//
//    public Recipe
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
//
//
////
////    public Optional<Recipe> getRecipes(String string){
////        return recipeRepository.getRecipes(string);
////    }
//





}




