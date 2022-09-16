package com.bnta.recipe_API.controllers;

import com.bnta.recipe_API.models.Ingredient;
import com.bnta.recipe_API.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "/ingredients")
public class IngredientController {

    @Autowired
    IngredientService ingredientService;

    @GetMapping
    public ResponseEntity<List<Ingredient>> displayAllIngredients() {
        List<Ingredient> ingredients = ingredientService.getAllIngredients();
        return new ResponseEntity<>(ingredients, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> submitNewIngredient(@RequestBody Ingredient ingredient) {
        String savedIngredient = ingredientService.saveIngredient(ingredient);

        return new ResponseEntity<>(savedIngredient, HttpStatus.CREATED);
    }

    @DeleteMapping (value = "/deleteIngredient/{id}")
    public ResponseEntity<String> removeAnIngredient(@PathVariable Long id) {

        String ingredientName = ingredientService.getIngredientById(id).get().getName();
        String message = String.format("The ingredient: %s has been removed.", ingredientName);
        ingredientService.removeAnIngredient(id);
        //String message = "This ingredient has been removed";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }


}
