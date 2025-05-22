package com.aaronweggemans.mapadvisorapi.Domains.FuelStation;

import com.aaronweggemans.mapadvisorapi.Domains.FuelStationPrice.FuelStationPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import org.locationtech.jts.geom.*;

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

    public List<FuelStationSummary> getFuelStationsSummaryOnFuelType(String fuelType) {
        return getFuelStations().stream()
                .map(fuelStation -> {
                    Optional<FuelStationPrice> optionalPrice = fuelStation.getPrices().stream()
                            .filter(prices -> prices.getFueltype().contains(fuelType))
                            .findFirst();

                    if (optionalPrice.isPresent()) {
                        float price = optionalPrice.get().getPrice();
                        return new FuelStationSummary(
                                fuelStation.getId(),
                                fuelStation.getLocation_lat(),
                                fuelStation.getLocation_lon(),
                                price
                        );
                    }

                    return null;
                })
                .filter(Objects::nonNull)
                .toList();
    }

    public List<FuelStationSummary> findFuelstationsInPolygon(PolygonRequestDTO dto, String fuelType) {
        GeometryFactory geometryFactory = new GeometryFactory(new PrecisionModel(), 4326);

        Coordinate[] jtsCoords = dto.getCoordinates().stream()
                .map(c -> new Coordinate(c.getLongitude(), c.getLatitude()))
                .toArray(Coordinate[]::new);

        if (!jtsCoords[0].equals2D(jtsCoords[jtsCoords.length - 1])) {
            Coordinate[] closed = Arrays.copyOf(jtsCoords, jtsCoords.length + 1);
            closed[closed.length - 1] = closed[0];
            jtsCoords = closed;
        }

        LinearRing shell = geometryFactory.createLinearRing(jtsCoords);
        Polygon polygon = geometryFactory.createPolygon(shell);

        List<FuelStationSummary> all = getFuelStationsSummaryOnFuelType(fuelType);

        return all.stream()
                .filter(t -> {
                    Point point = geometryFactory.createPoint(new Coordinate(t.getLocation_lon(), t.getLocation_lat()));
                    return polygon.contains(point);
                })
                .sorted(Comparator.comparing(FuelStationSummary::getPrice))
                .limit(25)
                .collect(Collectors.toList());
    }

    public boolean doesFuelTypeExist(String fuelType) {
        return Set.of("autogas", "cng", "diesel", "diesel_special", "euro98", "euro95").contains(fuelType);
    }
}
