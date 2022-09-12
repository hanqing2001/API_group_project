package com.bnta.recipe_API.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.OneToMany;
import java.util.List;

public class Recipe {

//    PROPERTIES:::::::::::::;

    private long id;
    private String name;
    private int averageRating;

    private List<Ingredient> ingredients;
    private int time;
    private int calories;
    private int servings;
    private boolean isVegan;
    private boolean isVegetarian;
    private boolean isGlutenFree;

//    CONSTRUCTOR::::::::::

    public Recipe(Long id, String name, int averageRating, List<Ingredient> ingredients, int time, int calories, int servings, boolean isVegan, boolean isVegetarian, boolean isGlutenFree) {
        this.id = id;
        this.name = name;
        this.averageRating = averageRating;
        this.ingredients = ingredients;
        this.time = time;
        this.calories = calories;
        this.servings = servings;
        this.isVegan = isVegan;
        this.isVegetarian = isVegetarian;
        this.isGlutenFree = isGlutenFree;
    }

    // no arg constructor
    public Recipe(){

    }

//    GETTERS+SETTERS::::::::::


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

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
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

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }




}
