package com.maja.recipeProject.controllers;

import com.maja.recipeProject.repositories.RecipeRepository;
import com.maja.recipeProject.services.RecipeService;
import com.maja.recipeProject.services.RecipeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@Slf4j
public class RecipeControllerTest {

    @Mock
    RecipeService recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Mock
    Model model;

    @Before
    public void setUp()
    {
        MockitoAnnotations.initMocks(this);
        recipeService=new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipes() {

        verify(recipeService,times(1)).getRecipes();
        verify(model,times(1)).addAttribute();
    }
}