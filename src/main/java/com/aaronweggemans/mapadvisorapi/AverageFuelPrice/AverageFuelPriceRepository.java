package com.aaronweggemans.mapadvisorapi.AverageFuelPrice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AverageFuelPriceRepository extends JpaRepository<AverageFuelPrice, Long> {
}
