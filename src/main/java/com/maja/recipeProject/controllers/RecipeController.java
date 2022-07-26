package com.maja.recipeProject.controllers;

import com.maja.recipeProject.entities.Category;
import com.maja.recipeProject.entities.UnitOfMeasure;
import com.maja.recipeProject.repositories.CategoryRepository;
import com.maja.recipeProject.repositories.UnitOfMeasureRepository;
import com.maja.recipeProject.services.RecipeService;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/recipes","/recipes/index.html","/recipes/index"})
    public String getRecipes(Model model)
    {
        model.addAttribute("recipes",recipeService.getRecipes());
        return "index";
    }
}
