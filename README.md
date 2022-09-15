# RecAPI Backend Project

***If you have something to steam, roast or peel, we will guide you to your meal!***

<p align="center">
<img src="https://static.vecteezy.com/system/resources/previews/006/412/982/non_2x/english-breakfast-fried-eggs-with-bacon-in-a-cast-iron-skillet-vector.jpg" align="center" width="650" height="250"/>
</p>

## Table of Contents
- [Who We Are](#who-we-are)
- [Project Overview](#project-overview)
- [Setup & Instructions](#setup-&-instructions)
- [Minimum Viable Product(MVP)](#Minimum-Viable-Product(MVP))
- [Further Implementations & Extensions](#Further-Implementations-&-Extensions)

<br>

## Who We Are
We are **Spring Boot Busters** - 4 members of Cohort 6 from the Bright Network Technology Academy!: 

<details>
<summary>Sakusan</summary>
  - GitHub: (https://github.com/sakusanpuwan)
</details>

<details>
<summary>Danielle</summary>
  - GitHub:(https://github.com/DaniK178)
</details>

<details>
<summary>Carla</summary>
  - GitHub:(https://github.com/Carla022)
</details>
 
<details>
<summary>Hanqing</summary>
  - GitHub:(https://github.com/hanqing2001)
 </details>

## Project Overview

A collaborative project assigned by Bright Network Technology Academy. This project pesented the team with the opportunity to showcase backend skills and understanding of **Java, Spring Boot** and **Postman** for testing.

To develop a well-thought-through API, the team got together to conduct research and devised plans to deliver within a week:

We all love a tasty home meal, but sometimes matching the right recipe with the ingredients in the pantry can prove difficult. With RecAPI, simply **create a profile** *(you can add dietary requirements)*, tell us **what is in stock** and we'll **offer thousands of dishes** you can enjoy. 

**What makes RecAPI different**

Happy with a recipe? leave a rating to let others know how much you loved it! or add it to favorites so you will always have it at hand.


## Setup & Instructions

## Minimum Viable Product(MVP)

## Commands

The classes have a numebr of CRUD functionality: 

| Request Type  | Request Path                                                                         | Description                                  |
|---------------|--------------------------------------------------------------------------------------|----------------------------------------------|
| POST          | `http://localhost:8080/users`                                                        | Creates a new user                           |
| GET           | `http://localhost:8080/users`                                                        | Retrieves all users                          |
| DELETE        | `http://localhost:8080/users/10`                                                     | Delete an user                               |
| GET           | `http://localhost:8080/recipe`                                                       | Retrieves all recipes                        |
| PUT           | `http://localhost:8080/users/fav?userId={id}&recipeId={id}`                          | Adds a recipe to the User's favourites       |
| POST          | `http://localhost:8080/ingredients`                                                  | Creates a new ingredient                     |
| GET           | `http://localhost:8080/ingredients`                                                  | Retrieves all ingredients                    |
| DELETE        | `http://localhost:8080/ingredients/deleteIngredient/{id}`                            | Delete an ingredient                         |
| POST          | `http://localhost:8080/users/rating?rating={id}&recipeId={id}`                       | Adds a rating to a recipe                    |
| GET           | `http://localhost:8080/recipe/ingredient?ingredientId={id}`                          | Retrieve a recipe by the ingredient ID       |
| GET           | `http://localhost:8080/recipe/ingredient/name?ingredient1={name}&ingredient2={name}` | Retrieve a recipe by ingredient Name         |
| GET           | `http://localhost:8080/recipe/requirement?{dietary requirement}=true`                | Retrieve recipies by the dietary requirement |

## Further Implementations & Extensions

To expand our API - here are some things we could implement:
- Add food groups to the ingredients, and therefore be able to categorise and choose ingredients based on this
- Be able to remove a recipe from the User's favourite list
- Display the ratings given by each user
- Add a new ingredient, and search recipes that contain this ingredient.


## Minimum Viable Product(MVP)
