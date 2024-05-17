package com.aaronweggemans.mapadvisorapi.FuelStation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class FuelStationService {
    private final FuelStationRepository fuelStationRepository;

    @Autowired
    public FuelStationService(FuelStationRepository fuelStationRepository) {
        this.fuelStationRepository = fuelStationRepository;
    }

    public List<FuelStation> getFuelStations() {
        return fuelStationRepository.findAll();
    }

    public FuelStation getFuelStationById(Long id) {
        return fuelStationRepository.findById(id).orElse(null);
    }

    public boolean isExistingFuelType(String fuelType) {
        return Set.of("autogas", "cng", "diesel", "diesel_special", "euro98", "euro95").contains(fuelType);
    }

}
