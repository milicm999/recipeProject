package com.maja.recipeProject.controllers;

import com.maja.recipeProject.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecipeController {


    @RequestMapping({"/recipes","/recipes/index.html","/recipes/index"})
    public String getRecipes()
    {
        return "index";
    }
}
