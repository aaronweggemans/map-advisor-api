package com.aaronweggemans.mapadvisorapi.Domains.Country;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CountryService {
    private final CountryRepository countryRepository;
    private final EntityManager entityManager;

    @Autowired
    public CountryService(CountryRepository countryRepository, EntityManager entityManager) {
        this.countryRepository = countryRepository;
        this.entityManager = entityManager;
    }

    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    public Country getRandomCountry() {
        long count = ((Number) entityManager.createNativeQuery("select count(*) from countries")
                .getSingleResult()).longValue();

        // Check could be removed
        if (count == 0) {
            throw new IllegalStateException("No countries found in the database.");
        }

        return (Country) entityManager.createQuery("select c from Country c")
                .setFirstResult(new Random().nextInt((int) count))
                .setMaxResults(1)
                .getSingleResult();
    }

    public Country findCountry(Long id) {
        return countryRepository.findById(id).orElse(null);
    }
}
