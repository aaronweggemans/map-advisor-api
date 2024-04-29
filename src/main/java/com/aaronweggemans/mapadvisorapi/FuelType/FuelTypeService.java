package com.aaronweggemans.mapadvisorapi.FuelType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuelTypeService {
    private final FuelTypeRepository fuelTypeRepository;

    @Autowired
    public FuelTypeService(FuelTypeRepository fuelTypeRepository) {
        this.fuelTypeRepository = fuelTypeRepository;
    }

    public List<FuelType> getFuelTypes() {
        return fuelTypeRepository.findAll();
    }
}
