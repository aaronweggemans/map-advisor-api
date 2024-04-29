package com.aaronweggemans.mapadvisorapi.AverageFuelPrice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AverageFuelPriceService {
    private final AverageFuelPriceRepository averageFuelPriceRepository;

    @Autowired
    public AverageFuelPriceService(AverageFuelPriceRepository averageFuelPriceRepository) {
        this.averageFuelPriceRepository = averageFuelPriceRepository;
    }

    public List<AverageFuelPrice> getAverageFuelPrice() {
        return averageFuelPriceRepository.findAll();
    }
}
