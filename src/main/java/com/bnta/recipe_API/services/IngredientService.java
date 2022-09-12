package com.bnta.recipe_API.services;

import com.bnta.recipe_API.models.Ingredient;
import com.bnta.recipe_API.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    @Autowired
    IngredientRepository ingredientRepository;

    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    public Ingredient

//    getAllIngredients: List<Ingredients>
//+ addNewIngredient: List<Ingredients>
//+ removeAningredient: Ingredient
}
