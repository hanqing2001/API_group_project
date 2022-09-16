package com.bnta.recipe_API.services;

import com.bnta.recipe_API.models.Ingredient;
import com.bnta.recipe_API.models.Recipe;

import com.bnta.recipe_API.repositories.IngredientRepository;
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

    @Autowired
    IngredientRepository ingredientRepository;

    // get all recipes

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    // Method to: get a specific recipe, get recipe by id
    //    Optional: means it either has something in it or it doesn't
    public Optional<Recipe> getRecipeById(Long id){
        return recipeRepository.findById(id);
    }

    public List<Recipe> getRecipeByIngredientId(long id){
        Ingredient ingredient = ingredientRepository.findById(id).get();

        return recipeRepository.findByIngredients(ingredient);
    }

    public List<Recipe> getRecipeByIngredientName(String ingredient){
        List<Recipe> recipes = recipeRepository.findByIngredientsName(ingredient);
        return recipes;
    }

    // loop through ingredients and check if they are vegan
    // if one is not, set isVegan to be false
    public void updateRequirements(Long id){
        Recipe recipe = recipeRepository.findById(id).get();
        for (Ingredient ingredient: recipe.getIngredients()){
            if (!ingredient.isGlutenFree()){
                recipe.setGlutenFree(false);
            }
            if (!ingredient.isVegan()){
                recipe.setVegan(false);
                recipe.setVegetarian(false);
            }
            if (!ingredient.isVegetarian()){
                recipe.setVegetarian(false);
            }
            // we might not have,
        }
    }

    public List<Recipe> findByIsVegan(boolean isVegan){
        return recipeRepository.findByIsVegan(isVegan);
    }
     public List<Recipe> findByIsVegetarian(boolean isVegetarian){
        return recipeRepository.findByIsVegetarian(isVegetarian);
     }

     public List<Recipe> findByIsGlutenFree(boolean isGlutenFree){
        return recipeRepository.findByIsGlutenFree(isGlutenFree);
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
//Method to addRecipe:
    //    Method to: take recipe object + persist to repository
    public Recipe saveRecipe(Recipe recipe) {
        Recipe savedRecipe = recipeRepository.save(recipe); //gives it a row in the table and gives it an id
        this.updateRequirements(savedRecipe.getId());
        return recipe; // can use if statements with returned value
    }
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




