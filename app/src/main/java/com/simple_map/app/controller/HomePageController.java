package com.simple_map.app.controller;

import com.simple_map.app.model.Coordinates;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class HomePageController {

    @RequestMapping
    public String getHomePage(Model model){
        Coordinates resultingCoordinates = new Coordinates(0.0, 0.0);
        model.addAttribute("lon", resultingCoordinates.getLongitude());
        model.addAttribute("lat", resultingCoordinates.getLatitude());
        return "index";
    }
}
