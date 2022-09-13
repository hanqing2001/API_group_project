package com.bnta.recipe_API.repositories;


import com.bnta.recipe_API.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // gives this interface some superpowers
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
