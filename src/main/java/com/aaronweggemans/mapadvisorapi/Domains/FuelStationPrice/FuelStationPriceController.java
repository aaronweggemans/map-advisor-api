package com.aaronweggemans.mapadvisorapi.Domains.FuelStationPrice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/fuel-station-price")
public class FuelStationPriceController {
    private final FuelStationPriceService fuelStationPriceService;

    @Autowired
    public FuelStationPriceController(FuelStationPriceService fuelStationPriceService) {
        this.fuelStationPriceService = fuelStationPriceService;
    }

    @GetMapping
    public List<FuelStationPrice> getFuelStationPrice() {
        return fuelStationPriceService.getAllFuelStationPrices();
    }
}
