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
    public ResponseEntity<List<Ingredient>> displayAllIngredients(){
        List<Ingredient> ingredients = ingredientService.getAllIngredients();
        return new ResponseEntity<>(ingredients, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Ingredient> submitNewIngredient;

    @DeleteMapping
    public

//    + submitNewlngredient(): Response Entity<List<Recipe> >
//            • displayAllingredients): ResponseEntity<List<Ingredient>>
//+ removeAnIngredient®: ResponseEntity<String>


}
