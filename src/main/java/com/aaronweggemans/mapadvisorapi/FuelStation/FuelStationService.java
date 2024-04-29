package com.aaronweggemans.mapadvisorapi.FuelStation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
