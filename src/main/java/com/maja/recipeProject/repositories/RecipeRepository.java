package com.maja.recipeProject.repositories;

import com.maja.recipeProject.entities.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {


}
