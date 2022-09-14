package com.bnta.recipe_API.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

//@Entity is a table named = "..." :
@Entity(name = "recipes")
public class Recipe {

//    PROPERTIES:::::::::::::;

    //@Id ...
    @Id
    //@GeneratedValue... automatically generating an id for each property that increments every time as more are added
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column adds a column the name(field) in the table:
    @Column
    private Long id;
    @Column
    private String name;

    //Float primitive data type?? To allow decimals of e.g. 3.5 rating
    @Column
    private float averageRating;

    //@JsonIgnoreProperties TO AVOID INFINITE dependencies LOOP ISSUE.

    //added ,"recipes" to JsonIgnoreProperties because error prompted to collapse repeating annotation:
    @JsonIgnoreProperties({"recipe", "ingredients", "recipes"})

    /*added cascade = CascadeType.All because :
    You should include cascade="all" (if using xml) or cascade=CascadeType.ALL
    (if using annotations) on your collection mapping.
This happens because you have a collection in your entity,
and that collection has one or more items which are not present in the database.
By specifying the above options you tell hibernate to save them to the database when saving their parent.
     */

    // Can ingredients have many recipes?? (ManyToMany)

    //@ManyToMany(mappedBy = "...") - Annotation with attribute

    @ManyToMany (cascade = CascadeType.ALL)
    @JoinTable(
            name = "ingredients_recipe",
            joinColumns = {@JoinColumn(name = "recipe_id", nullable = false)},
            inverseJoinColumns =  {@JoinColumn(name = "ingredients_id", nullable = false)}
    )
    private List<Ingredient> ingredients;
    @Column
    private int time;
    @Column
    private int calories;
    @Column
    private int servings;
    @Column
    private boolean isVegan;
    @Column
    private boolean isVegetarian;
    @Column
    private boolean isGlutenFree;
    @ManyToMany
    @JoinTable(
            name = "users_recipes",
            joinColumns = {@JoinColumn(name = "recipe_id",nullable = false)},
            inverseJoinColumns = {@JoinColumn(name = "user_id",nullable = false)}
    )
    @JsonIgnoreProperties({"favRecipes"})
    private List<User> favUsers;

    private float noRatedUsers;

    //added new recipe ingredients property:
    private List<Ingredient> recipeIngredients;

//    CONSTRUCTOR::::::::::

    public Recipe(String name, float averageRating,int time, int calories, int servings,
                  List<Ingredient> ingredients) {
        this.name = name;
        this.averageRating = averageRating;
        this.time = time;
        this.calories = calories;
        this.servings = servings;
        this.favUsers = new ArrayList<>();
        this.noRatedUsers = 0;
        this.isVegan = true;
        this.isVegetarian = true;
        this.isGlutenFree = true;
        this.ingredients = ingredients;
        //added this.recipeIngredients:
        this.recipeIngredients = new ArrayList<>();
        setRequirements(); //calls method once ingredients are set
        // this needs to be called every time an ingredient is added
    }

//    METHOD TO LINK RECIPE TO INGREDIENT
    //added List<Ingredient> getRecipeIngredients:
    public List<Ingredient> getRecipeIngredients() {
        return recipeIngredients;
    }
    //added SetRecipeIngredients
    public void setRecipeIngredients (List<Ingredient> recipeIngredients) {
        this.recipeIngredients = recipeIngredients;
    }


//     public void setRequirements(){
//        for (Ingredient ingredient: ingredients){
//            if (!ingredient.isGlutenFree()){
//                this.isGlutenFree = false;
//            }
//           if (!ingredient.isVegan()){
//               this.isVegan = false;
//               this.isVegetarian = false;
//           }
//           if (!ingredient.isVegetarian()){
//               this.isVegetarian = false;
//           }
//        }
//
//     }

    // no arg constructor/ empty constructor
    public Recipe(){

    }

//    GETTERS+SETTERS::::::::::


    //For the id property:
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    //For the Name Property:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //For the AverageRating property:
    public float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(float averageRating) {
        this.averageRating = averageRating;
    }

    //For the list of Ingredients property:
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    //For the time (recipe duration) property:
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    //For the calories' property:
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    //For the servings' property:
    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    //For the isVegan property:
    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    //For the isVegetarian property:
    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    //For the isGluten property:
    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<User> getFavUsers() {
        return favUsers;
    }

    public void setFavUsers(List<User> favUsers) {
        this.favUsers = favUsers;
    }

    public float getNoRatedUsers() {
        return noRatedUsers;
    }

    public void setNoRatedUsers(float noRatedUsers) {
        this.noRatedUsers = noRatedUsers;
    }




    // FOR READABILITY PURPOSES. WITHOUT @OVERRIDE, THE DATA WILL SHOW AS NUMBERS (COMPUTER LANG) e.g. banana could be written as 6Kbceq2 etc

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", averageRating=" + averageRating +
                ", ingredients=" + ingredients +
                ", time=" + time +
                ", calories=" + calories +
                ", servings=" + servings +
                ", isVegan=" + isVegan +
                ", isVegetarian=" + isVegetarian +
                ", isGlutenFree=" + isGlutenFree +
                '}';
    }


}
