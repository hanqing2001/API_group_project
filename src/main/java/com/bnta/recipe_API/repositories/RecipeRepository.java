package com.bnta.recipe_API.repositories;


import com.bnta.recipe_API.models.Ingredient;
import com.bnta.recipe_API.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // gives this interface some superpowers
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

//    List<Recipe> findByIsVeganTrue();
//    List<Recipe> findByIsVegetarianTrue();
//    List<Recipe> findByIsGlutenFreeTrue();
//
    List<Recipe> findByIngredients(Ingredient ingredients);
}
