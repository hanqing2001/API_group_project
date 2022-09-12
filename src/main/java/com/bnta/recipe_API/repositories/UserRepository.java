package com.bnta.recipe_API.repositories;

import com.bnta.recipe_API.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
