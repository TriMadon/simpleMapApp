package com.simple_map.app.controller;

import com.simple_map.app.model.Coordinates;
import com.simple_map.app.service.CoordinateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping(value = "/search")
public class MapSearchController {
    final CoordinateService coordinateService;

    @Autowired
    public MapSearchController(CoordinateService coordinateService) {
        this.coordinateService = coordinateService;
    }

    @RequestMapping
    public String changeCoordinates(@RequestParam String enteredLocation, Model model){
        if (enteredLocation.isEmpty())
            return defaultPage(model);
        Optional<Coordinates> resultingCoordinates = coordinateService.getCoordinatesByQuery(enteredLocation);
        if (resultingCoordinates.isPresent()){
            model.addAttribute("lon", resultingCoordinates.get().getLongitude());
            model.addAttribute("lat", resultingCoordinates.get().getLatitude());
            return "index";
        } else
            return errorPage(model);
    }

    private String defaultPage(Model model){
        model.addAttribute("lon", 0);
        model.addAttribute("lat", 0);
        return "index";
    }


    private String errorPage(Model model) {
        model.addAttribute("errorExists", true);
        model.addAttribute("errorMessage", "Error: Invalid search query or non-existent location");
        return "index";
    }
}
