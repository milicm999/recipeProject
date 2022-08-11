package com.maja.recipeProject.services;

import com.maja.recipeProject.entities.Recipe;
import com.maja.recipeProject.repositories.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@Slf4j
public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService=new RecipeServiceImpl(recipeRepository);
    }
    @Test
    public void getRecipes() throws Exception{
        Recipe recipe = new Recipe();
        Recipe recipe1 = new Recipe();
        Set<Recipe> recipes = new HashSet<>();
        recipeRepository.save(recipe);
        recipeRepository.save(recipe1);
        recipeRepository.findAll().forEach(recipes::add);
        assertEquals(recipes,recipeService.getRecipes());
        verify(recipeRepository,times(2)).findAll();
        log.debug("Test passed : getRecipes()");
    }
}