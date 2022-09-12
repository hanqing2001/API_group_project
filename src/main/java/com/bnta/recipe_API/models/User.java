package com.bnta.recipe_API.models;

import javax.persistence.*;

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column
    private String name;

    public User(String name){
        this.userId = userId;
        this.name = name;
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
}
