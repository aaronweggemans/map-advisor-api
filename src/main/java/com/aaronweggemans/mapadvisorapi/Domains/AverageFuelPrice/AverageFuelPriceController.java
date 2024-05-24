package com.aaronweggemans.mapadvisorapi.Domains.AverageFuelPrice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/average-fuel-price")
public class AverageFuelPriceController {
    private final AverageFuelPriceService averageFuelPriceService;

    @Autowired
    public AverageFuelPriceController(AverageFuelPriceService averageFuelPriceService) {
        this.averageFuelPriceService = averageFuelPriceService;
    }

    @GetMapping
    public List<AverageFuelPrice> getAverageFuelPrice() {
        return averageFuelPriceService.getAverageFuelPrice();
    }
}
