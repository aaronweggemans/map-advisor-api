package com.aaronweggemans.mapadvisorapi.Domains.Coordinate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "coordinates")
@Getter
@Setter
public class Coordinate {
    @Id
    private Long id;
    private Float southwest_lat;
    private Float southwest_lon;
    private Float northeast_lat;
    private Float northeast_lon;
}
