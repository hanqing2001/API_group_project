package com.bnta.recipe_API.repositories;


import com.bnta.recipe_API.models.Ingredient;
import com.bnta.recipe_API.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // gives this interface some superpowers
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

//    List<Recipe> findByIsVeganTrue();
//    List<Recipe> findByIsVegetarianTrue();
//    List<Recipe> findByIsGlutenFreeTrue();
//
    List<Recipe> findByIngredients(Ingredient ingredients);

    List<Recipe> findByIngredientsName(String ingredient);

    List<Recipe> findByIsVegan(Boolean isVegan);

    List<Recipe> findByIsGlutenFree(Boolean isGlutenFree);

    List<Recipe> findByIsVegetarian(Boolean isVegetarian);


//    @Query(
//            "SELECT recipes FROM recipes WHERE recipes.ingredients.name IN :recipes.ingredients = ingredient1"
//
//    )
//    List<Recipe> findByMultipleIngredientsName(
//            @Param("ingredient1") String ingredient1,
//            @Param("ingredient2") String ingredient2
//
//    );
//    List<Recipe> findByIngredientsNameAndIngredientsName(String name1, String name2);

}

