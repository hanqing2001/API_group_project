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
    private ArrayList<String> submittedIngredients = new ArrayList<>();

    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    public Ingredient saveIngredient(Ingredient ingredient) {
        if(submittedIngredients.contains(ingredient){
                ingredientRepository.save(ingredient);
        } else

        submittedIngredients = new ArrayList<>()saveIngredient(ingredient);
        submittedIngredients.add(savedIngredient.getName());

        // when the user passes in an ingredients
        // Check the ingredient is in the  saved ingredient list

        //if not -  save the user to the saved users list
        // if yes - reply "you have already added this ingredient!


        return ingredient;
    }

    public void removeAnIngredient(Long id) {
        ingredientRepository.deleteById(id);
    }

    public Optional<Ingredient> getIngredientById(Long id){
        return ingredientRepository.findById(id);
    }
}