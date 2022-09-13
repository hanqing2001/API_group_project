package com.bnta.recipe_API.repositories;

import com.bnta.recipe_API.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe,Long> {
}
