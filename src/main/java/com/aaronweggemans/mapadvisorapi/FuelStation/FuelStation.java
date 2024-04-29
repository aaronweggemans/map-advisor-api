package com.aaronweggemans.mapadvisorapi.FuelStation;

import com.aaronweggemans.mapadvisorapi.Coordinate.Coordinate;
import com.aaronweggemans.mapadvisorapi.FuelStationPrice.FuelStationPrice;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

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

    @ManyToOne(cascade = { CascadeType.ALL })
    @JoinColumn(name = "coordinate")
    private Coordinate coordinate;

    @OneToMany(mappedBy = "station")
    private List<FuelStationPrice> prices;
}
