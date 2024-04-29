package com.aaronweggemans.mapadvisorapi.FuelType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/fueltypes")
public class FuelTypeController {
    private final FuelTypeService fuelTypeService;

    @Autowired
    public FuelTypeController(FuelTypeService fuelTypeService) {
        this.fuelTypeService = fuelTypeService;
    }

    @GetMapping
    public List<FuelType> getFuelTypes() {
        return fuelTypeService.getFuelTypes();
    }
}
