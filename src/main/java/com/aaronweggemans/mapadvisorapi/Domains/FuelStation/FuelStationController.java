package com.aaronweggemans.mapadvisorapi.Domains.FuelStation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/fuel-stations")
public class FuelStationController {
    private final FuelStationService fuelStationService;

    @Autowired
    public FuelStationController(FuelStationService fuelStationService) {
        this.fuelStationService = fuelStationService;
    }

    @GetMapping(path = "{fuelType}")
    public List<FuelStationSummary> getFuelStations(@PathVariable String fuelType) {
        if(!fuelStationService.doesFuelTypeExist(fuelType)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "You have sent a invalid fuel type.");
        }

        return fuelStationService.getFuelStationsSummaryOnFuelType(fuelType);
    }

    @PostMapping(path = "{fuelType}/coordinates")
    public List<FuelStationSummary> getFuelStationsOnCoordinates(
        @PathVariable String fuelType,
        @RequestBody PolygonRequestDTO request
    ) {
        if(!fuelStationService.doesFuelTypeExist(fuelType)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "You have sent a invalid fuel type.");
        }

        return fuelStationService.findFuelstationsInPolygon(request, fuelType);
    }

    @GetMapping(path = "/find/{id}")
    public FuelStation findFuelStation(@PathVariable Long id) {
        if(this.fuelStationService.getFuelStationById(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This fuel station is not found.");
        }

        return this.fuelStationService.getFuelStationById(id);
    }
}
