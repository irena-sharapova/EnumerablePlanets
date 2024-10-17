package org.launchcode.controllers;

import org.springframework.ui.Model;
//import ch.qos.logback.core.model.Model;
import org.launchcode.models.Planets;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanetController {

    @GetMapping("/")
    public String displayIndex(Model model) {
        model.addAttribute("planets", Planets.values());
        return "index";
    }
}
