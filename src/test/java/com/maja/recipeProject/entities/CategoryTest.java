package com.maja.recipeProject.entities;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class CategoryTest {

    Category category;

    @BeforeEach
    public void setUp() {
        category = new Category();
    }

    @Test
    void getId() throws Exception {

        Long id = 4L;
        category.setId(id);
        assertEquals(id, category.getId());
        log.debug("Test passed : getId()");
    }

    @Test
    void getDescription() {
        String description = "Indian";
        category.setDescription(description);
        assertEquals(description, category.getDescription());
        log.debug("Test passed: getDescription()");
    }

    @Test
    void getRecipes() {
        Recipe recipe = new Recipe();
        Recipe recipe1 = new Recipe();
        category.getRecipes().add(recipe);
        category.getRecipes().add(recipe1);
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(recipe);
        recipes.add(recipe1);
        assertEquals(recipes, category.getRecipes());
        log.debug("Test passed : getRecipes()");

    }
}