package com.aaronweggemans.mapadvisorapi.AverageFuelPrice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "avgfuelprice")
@Getter
@Setter
public class AverageFuelPrice {
    @Id
    private Long id;
    private String fueltype;
    private Float price;
    private String updated;
}
