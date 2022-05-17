package tacos.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.Ingredient;
@Slf4j
@Controller
@RequestMapping("/ingredient")
public class IngredientController {
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("ingredient", new Ingredient(null, null, null));
        return "addIngredient";
    }

    @PostMapping
    public String addIngredient(Ingredient ingredient, Model model) {

        model.addAttribute(ingredient);
        log.info("Ingredient saved: " + ingredient);
        return "addIngredientSuccess";
    }
}