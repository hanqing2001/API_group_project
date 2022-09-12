package com.bnta.recipe_API.repositories;

import com.bnta.recipe_API.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {



}
