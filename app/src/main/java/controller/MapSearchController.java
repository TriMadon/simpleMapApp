package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CoordinateService;

@RestController
@RequestMapping("/search")
public class MapSearchController {
    final CoordinateService coordinateService;

    @Autowired
    public MapSearchController(CoordinateService coordinateService) {
        this.coordinateService = coordinateService;
    }

    
}
