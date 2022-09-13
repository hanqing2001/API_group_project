package com.bnta.recipe_API.components;

import com.bnta.recipe_API.models.Recipe;
import com.bnta.recipe_API.models.User;
import com.bnta.recipe_API.repositories.RecipeRepository;
import com.bnta.recipe_API.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RecipeRepository recipeRepository;


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

        Recipe recipe1 = new Recipe("Ratatouille",5,75,212,4,false,true,false);

        recipeRepository.save(recipe1);




    }
}
