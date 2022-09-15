# RecAPI Backend Project

***If you have something to steam, roast or peel, we will guide you to your meal!***
<img src="https://static.vecteezy.com/system/resources/previews/006/412/982/non_2x/english-breakfast-fried-eggs-with-bacon-in-a-cast-iron-skillet-vector.jpg" width="750" height="265"/>

## Table of Contents
- [Who We Are](#who-we-are)
- [Project Overview](#project-overview)
- [Setup & Instructions](#setup-&-instructions)
- [Minimum Viable Product(MVP)](#Minimum-Viable-Product(MVP))
- [Further Implementations & Extensions](#Further-Implementations-&-Extensions)

<br>

## Who We Are
We are **Spring Boot Busters** - 4 members of Cohort 6 from the Bright Network Technology Academy!: 

**Sakusan**
  - GitHub: (https://github.com/sakusanpuwan)

**Danielle**
  - GitHub:(https://github.com/DaniK178)

**Carla**
  - GitHub:(https://github.com/Carla022)
  
**Hanqing**
  - GitHub:(https://github.com/hanqing2001)

## Project Overview

## Setup & Instructions

## Minimum Viable Product(MVP)

## Commands

| Request Type  | Request Path                                                                       | Description                             |   |   |
|---------------|------------------------------------------------------------------------------------|-----------------------------------------|---|---|
| POST          | http://localhost:8080/users                                                        | Creates a new user                      |   |   |
| GET           | http://localhost:8080/users                                                        | Retrieves all users                     |   |   |
| DELETE        | http://localhost:8080/users/{id}                                                   | Delete an user                          |   |   |
| GET           | http://localhost:8080/recipe                                                       | Retrieves all recipes                   |   |   |
| PUT           | http://localhost:8080/users/fav?userId={id}&recipeId={id}                          | Adds a recipe to the User's favourites  |   |   |
| POST          | http://localhost:8080/ingredients                                                  | Creates a new ingredient                |   |   |
| GET           | http://localhost:8080/ingredients                                                  | Retrieves all ingredients               |   |   |
| DELETE        | http://localhost:8080/ingredients/deleteIngredient/{id}                            | Delete an ingredient                    |   |   |
| POST          | http://localhost:8080/users/rating?rating={id}&recipeId={id}                       | Adds a rating to a recipe               |   |   |
| GET           | http://localhost:8080/recipe/ingredient?ingredientId={id}                          | Retrieve a recipe by the ingredient ID  |   |   |
| GET           | http://localhost:8080/recipe/ingredient/name?ingredient1={name}&ingredient2={name} | Retrieve a recipe by ingredient Name    |   |   |

## Further Implementations & Extensions
To expand our API - here are some things we could implement:
- Add food groups to the ingredients, and therefore be able to categorise and choose ingredients based on this
- Be able to remove a recipe from the User's favourite list
- Display the ratings given by each user
- Add a new ingredient, and search recipes that contain this ingredient.


## Minimum Viable Product(MVP)
