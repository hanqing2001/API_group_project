package com.bnta.recipe_API.services;

import com.bnta.recipe_API.models.Ingredient;
import com.bnta.recipe_API.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

    @Autowired
    IngredientRepository ingredientRepository;
    private ArrayList<Ingredient> submittedIngredients = new ArrayList<>();

    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    public String saveIngredient(Ingredient ingredient) {
        List ingredientNames = ingredientRepository.findByName(ingredient.getName());
        if(ingredientRepository.findByName(ingredient.getName()).isEmpty()) {
            ingredientRepository.save(ingredient);
            return "You have added your ingredient!";
        }  else if (ingredientNames != null){
        //.equals(ingredient.getName()) )) {
            return "You have already added this ingredient!";
        } else {
            ingredientRepository.save(ingredient);
            return "saved ingredient";
        }
    }


    public void removeAnIngredient(Long id) {
        ingredientRepository.deleteById(id);
    }

    public Optional<Ingredient> getIngredientById(Long id) {
        return ingredientRepository.findById(id);
    }
}
