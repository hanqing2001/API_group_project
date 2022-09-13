package com.bnta.recipe_API.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity(name = "ingredients")
public class Ingredient {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String name;
    @Column
    private boolean isGlutenFree;
    @Column
    private boolean isVegan;
    @Column
    private boolean isVegetarian;

    @Column
    private Allergen allergensContained;


    @ManyToMany
    @JoinTable(
         name = "ingredients_recipe",
         joinColumns = {@JoinColumn(name = "ingredient_id", nullable = false)},
         inverseJoinColumns =  {@JoinColumn(name = "recipe_id", nullable = false)}
    )
    @JsonIgnoreProperties ({"ingredients"})
    private List<Recipe> recipes;

    public Ingredient(){}

    public Ingredient(String name, boolean isGlutenFree, boolean isVegan, boolean isVegetarian, Allergen allergensContained) {
        this.name = name;
        this.isGlutenFree = isGlutenFree;
        this.isVegan = isVegan;
        this.isVegetarian = isVegetarian;
        this.allergensContained = allergensContained;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public Allergen getAllergensContained() {
        return allergensContained;
    }

    public void setAllergensContained(Allergen allergensContained) {
        this.allergensContained = allergensContained;
    }
}
