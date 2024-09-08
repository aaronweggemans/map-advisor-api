package com.aaronweggemans.mapadvisorapi.Domains.Country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/countries")
public class CountryController {
    private final CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping
    public List<Country> getCountries() {
        return countryService.getCountries();
    }

    @GetMapping("random")
    public Country getRandomCountry() {
        return countryService.getRandomCountry();
    }

    @GetMapping("find/{id}")
    public Country findCountry(@PathVariable Long id) {
        return countryService.findCountry(id);
    }
}
