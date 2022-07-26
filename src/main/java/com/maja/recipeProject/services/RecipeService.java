package com.maja.recipeProject.services;

import com.maja.recipeProject.entities.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

}
