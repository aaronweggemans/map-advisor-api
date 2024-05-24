package com.aaronweggemans.mapadvisorapi.Domains.FuelStationPrice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuelStationPriceService {
    private final FuelStationPriceRepository fuelStationPriceRepository;

    @Autowired
    public FuelStationPriceService(FuelStationPriceRepository fuelStationPriceRepository) {
        this.fuelStationPriceRepository = fuelStationPriceRepository;
    }

    public List<FuelStationPrice> getAllFuelStationPrices() {
        return fuelStationPriceRepository.findAll();
    }
}
