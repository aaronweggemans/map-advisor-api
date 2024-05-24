package com.aaronweggemans.mapadvisorapi.Domains.Coordinate;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoordinateService {
    private final CoordinateRepository coordinateRepository;

    public CoordinateService(CoordinateRepository coordinateRepository) {
        this.coordinateRepository = coordinateRepository;
    }

    public List<Coordinate> getCoordinates() {
        return coordinateRepository.findAll();
    }
}
