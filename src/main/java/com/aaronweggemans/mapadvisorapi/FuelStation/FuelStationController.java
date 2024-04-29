package com.aaronweggemans.mapadvisorapi.FuelStation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/fuel-stations")
public class FuelStationController {
    private final FuelStationService fuelStationService;

    @Autowired
    public FuelStationController(FuelStationService fuelStationService){
        this.fuelStationService = fuelStationService;
    }

    @GetMapping
    public List<FuelStation> getFuelStations() {
        return fuelStationService.getFuelStations();
    }
}
