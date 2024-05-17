package com.aaronweggemans.mapadvisorapi.FuelStation;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FuelStationSummary {
    @Id
    private String id;
    private Float location_lat;
    private Float location_lon;
    private Float price;
}

