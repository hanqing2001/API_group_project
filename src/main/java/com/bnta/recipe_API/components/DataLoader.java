package com.bnta.recipe_API.components;

import com.bnta.recipe_API.models.Allergen;
import com.bnta.recipe_API.models.Ingredient;
import com.bnta.recipe_API.models.Recipe;
import com.bnta.recipe_API.models.User;
import com.bnta.recipe_API.repositories.IngredientRepository;
import com.bnta.recipe_API.repositories.RecipeRepository;
import com.bnta.recipe_API.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    IngredientRepository ingredientRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user1 = new User("Sakusan");
        User user2 = new User("Danielle");
        User user3 = new User("Carla");
        User user4 = new User("Hanqing");
        User user5 = new User("Anna");
        User user6 = new User("Iain");
        User user7 = new User("Colin");
        User user8 = new User("Zsolt");
        User user9 = new User("Richard");

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);
        userRepository.save(user5);
        userRepository.save(user6);
        userRepository.save(user7);
        userRepository.save(user8);
        userRepository.save(user9);

        List<Ingredient> ratatouilleIngredientsList = new ArrayList<>(); //RatatouilleIngredientsList
        List<Ingredient> garlicGingerNoodlesIngredientsList = new ArrayList<>(); //GarlicGingerNoodlesIngredientsList
        List<Ingredient> smokySalmonIngredientsList = new ArrayList<>(); // SmokySalmonIngredientsList
        List<Ingredient> garlicScrambledEggsIngredientsList = new ArrayList<>(); //GarlicScrambledEggsIngredientsList
        List<Ingredient> smokedSalmonToastIngredientsList= new ArrayList<>();
        List<Ingredient> soyMarinatedEggsList = new ArrayList<>();
        List<Ingredient> spicyGingerPastaIngredientsList = new ArrayList<>();
        List<Ingredient> gingerSobaNoodlesIngredientsList= new ArrayList<>();

        Ingredient ingredient1 = new Ingredient("tomato",true,true,true, Allergen.NONE);
        Ingredient ingredient2 = new Ingredient("ginger",true,true,true, Allergen.NONE);
        Ingredient ingredient3 = new Ingredient("salmon",true,false,false, Allergen.FISH);
        Ingredient ingredient4 = new Ingredient("white pasta",false,true,true, Allergen.NONE);
        Ingredient ingredient5 = new Ingredient("eggs",true,false,true, Allergen.EGGS);
        Ingredient ingredient6 = new Ingredient("soy sauce",false,true,true, Allergen.NONE);
        Ingredient ingredient7 = new Ingredient("garlic",true,true,true, Allergen.NONE);
        Ingredient ingredient8 = new Ingredient("white bread",false,true,true, Allergen.WHEAT);

        ingredientRepository.save(ingredient1);
        ingredientRepository.save(ingredient2);
        ingredientRepository.save(ingredient3);
        ingredientRepository.save(ingredient4);
        ingredientRepository.save(ingredient5);
        ingredientRepository.save(ingredient6);
        ingredientRepository.save(ingredient7);
        ingredientRepository.save(ingredient8);


        ratatouilleIngredientsList.add(ingredient1);
        ratatouilleIngredientsList.add(ingredient7);

        garlicGingerNoodlesIngredientsList.add(ingredient7);
        garlicGingerNoodlesIngredientsList.add(ingredient4);
        garlicGingerNoodlesIngredientsList.add(ingredient2);

        smokedSalmonToastIngredientsList.add(ingredient3);
        smokedSalmonToastIngredientsList.add(ingredient8);

        garlicScrambledEggsIngredientsList.add(ingredient5);
        garlicScrambledEggsIngredientsList.add(ingredient6);
        garlicScrambledEggsIngredientsList.add(ingredient7);

        soyMarinatedEggsList.add(ingredient5);
        soyMarinatedEggsList.add(ingredient6);
        soyMarinatedEggsList.add(ingredient7);

        smokySalmonIngredientsList.add(ingredient3);
        smokySalmonIngredientsList.add(ingredient8);

        spicyGingerPastaIngredientsList.add(ingredient1);
        spicyGingerPastaIngredientsList.add(ingredient2);
        spicyGingerPastaIngredientsList.add(ingredient4);

        gingerSobaNoodlesIngredientsList.add(ingredient2);
        gingerSobaNoodlesIngredientsList.add(ingredient6);

        Recipe recipe1 = new Recipe("Ratatouille",5,75,212,4);
        recipe1.setIngredients(ratatouilleIngredientsList);
        recipeRepository.save(recipe1);

        Recipe recipe2 = new Recipe("Garlic Ginger Noodles",5,15,186,2);
        recipe2.setIngredients(garlicGingerNoodlesIngredientsList);
        recipeRepository.save(recipe2);

        Recipe recipe3 = new Recipe("Smoky Salmon",4,11,363,2);
        recipe3.setIngredients(smokySalmonIngredientsList);
        recipeRepository.save(recipe3);

        Recipe recipe4 = new Recipe("Garlic Scrambled Eggs",5,75,212,4);
        recipe4.setIngredients(garlicScrambledEggsIngredientsList);
        recipeRepository.save(recipe4);

        Recipe recipe5 = new Recipe("Soy Marinated Eggs",3,18,250,6);
        recipe5.setIngredients(soyMarinatedEggsList);
        recipeRepository.save(recipe5);

        Recipe recipe6 = new Recipe("Smoked Salmon Toast",4,10,189,7);
        recipe6.setIngredients(smokedSalmonToastIngredientsList);
        recipeRepository.save(recipe6);

        Recipe recipe7 = new Recipe("Spicy Ginger Pasta",5,75,212,4);
        recipe7.setIngredients(spicyGingerPastaIngredientsList);
        recipeRepository.save(recipe7);

        Recipe recipe8 = new Recipe("Ginger Soba Noodles",4,10,299,4);
        recipe8.setIngredients(gingerSobaNoodlesIngredientsList);
        recipeRepository.save(recipe8);
    }
}