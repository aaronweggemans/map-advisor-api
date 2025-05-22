package com.aaronweggemans.mapadvisorapi.Domains.FuelStation;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PolygonRequestDTO {
    private List<CoordinateDTO> coordinates;
}
