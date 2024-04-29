package com.aaronweggemans.mapadvisorapi.FuelStation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "fuelstations")
@Getter
@Setter
public class FuelStation {
    @Id
    private String id;
    private String name;
    private String brand_name;
    private String display_name;
    private Float location_lat;
    private Float location_lon;
    private String street;
    private String postal_code;
    private String city;
    private Float coordinate;
}
