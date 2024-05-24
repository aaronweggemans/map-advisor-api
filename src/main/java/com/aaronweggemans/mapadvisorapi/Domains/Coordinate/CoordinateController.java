package com.aaronweggemans.mapadvisorapi.Domains.Coordinate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/coordinates")
public class CoordinateController {
    private final CoordinateService coordinateService;

    public CoordinateController(CoordinateService coordinateService) {
        this.coordinateService = coordinateService;
    }

    @GetMapping
    public List<Coordinate> getCoordinates() {
        return coordinateService.getCoordinates();
    }
}
