package com.aaronweggemans.mapadvisorapi.Coordinate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinateRepository extends JpaRepository<Coordinate, Long> {
}
