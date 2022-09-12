package com.bnta.recipe_API.models;

public class Ingredient {

    private long id;
    private String name;
    private boolean isGlutenFree;
    private boolean isVegan;
    private boolean isVegetarian;
    private Allergen allergensContained;

    public void Ingredient(){}

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
