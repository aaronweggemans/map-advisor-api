package com.aaronweggemans.mapadvisorapi.FuelStationPrice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "fuelstationprice")
@Getter
@Setter
public class FuelStationPrice {
    @Id
    private Long id;
    private String fueltype;
    private String station;
    private Float price;
    private String price_level;
    private String record;
    private String source;
}