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

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
        userRepository.save(user4);

        Ingredient ingredient1 = new Ingredient("Tomato",true,true,true, Allergen.NONE);
        List<Ingredient> ingredients = new ArrayList<>();
        ingredientRepository.save(ingredient1);

        Recipe recipe1 = new Recipe("Ratatouille",5,75,212,4,ingredients);
        recipe1.addIngredientToRecipe(ingredient1);
        recipe1.setRequirements();
        recipeRepository.save(recipe1);




    }
}
