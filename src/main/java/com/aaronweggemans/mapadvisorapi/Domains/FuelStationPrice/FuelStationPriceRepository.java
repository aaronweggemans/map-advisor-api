package com.aaronweggemans.mapadvisorapi.Domains.FuelStationPrice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuelStationPriceRepository extends JpaRepository<FuelStationPrice, Long> {
}
