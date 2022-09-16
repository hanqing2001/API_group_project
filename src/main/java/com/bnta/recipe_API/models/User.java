package com.bnta.recipe_API.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column
    private String name;

    @ManyToMany
    @JoinTable(
            name = "users_recipes",
            joinColumns = {@JoinColumn(name = "user_id",nullable = false )},
            inverseJoinColumns = {@JoinColumn(name = "recipe_id",nullable = false)}
    )
    @JsonIgnoreProperties({"favUsers"})
    private List<Recipe> favRecipes;

    public User(String name){
        this.name = name;
        this.favRecipes = new ArrayList<>();
    }

    public User(){

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long id) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Recipe> getFavRecipes() {
        return favRecipes;
    }

    public void setFavRecipes(List<Recipe> favRecipes) {
        this.favRecipes = favRecipes;
    }

    public void addRecipeToUserFavs(Recipe recipe){
        this.favRecipes.add(recipe);
    }


}

