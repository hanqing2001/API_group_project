package com.bnta.recipe_API.controllers;

import com.bnta.recipe_API.models.Ingredient;
import com.bnta.recipe_API.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
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
    public ResponseEntity<Ingredient> submitNewIngredient(@RequestBody Ingredient ingredient) {
        Ingredient savedIngredient = ingredientService.saveIngredient(ingredient);
        return new ResponseEntity<>(ingredient, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<String> removeAnIngredient(Long id) {
        ingredientService.removeAnIngredient(id);
        String ingredient = ingredientService.getIngredientById(id).get().getName();
        String message = String.format("This %s has been removed,", ingredient);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }

}
