package com.bnta.recipe_API.repositories;

import com.bnta.recipe_API.models.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientRepository extends JpaRepository<Ingredient, Long>{

    List<Ingredient> findByName(String name);
}
