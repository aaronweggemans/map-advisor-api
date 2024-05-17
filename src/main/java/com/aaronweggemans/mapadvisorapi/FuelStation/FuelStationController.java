package com.aaronweggemans.mapadvisorapi.FuelStation;

import com.aaronweggemans.mapadvisorapi.FuelStationPrice.FuelStationPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
        if(!fuelStationService.isExistingFuelType(fuelType)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "You have sent a invalid fuel type.");
        }

        return fuelStationService.getFuelStations().stream()
                .map(fuelStation -> {
                    Optional<FuelStationPrice> optionalPrice = fuelStation.getPrices().stream()
                            .filter(prices -> prices.getFueltype().contains(fuelType))
                            .findFirst();

                    if (optionalPrice.isPresent()) {
                        float price = optionalPrice.get().getPrice();
                        return new FuelStationSummary(
                                fuelStation.getId(),
                                fuelStation.getLocation_lat(),
                                fuelStation.getLocation_lon(),
                                price
                        );
                    }

                    return null;
                })
                .filter(Objects::nonNull) // Filter out null elements
                .toList();
    }

    @GetMapping(path = "/find/{id}")
    public FuelStation findFuelStation(@PathVariable Long id) {
        if(this.fuelStationService.getFuelStationById(id) == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This fuel station is not found.");
        }

        return this.fuelStationService.getFuelStationById(id);
    }
}
