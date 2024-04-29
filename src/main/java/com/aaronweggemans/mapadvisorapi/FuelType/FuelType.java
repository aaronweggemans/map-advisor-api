package com.aaronweggemans.mapadvisorapi.FuelType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "fueltypes")
@Getter
@Setter
public class FuelType {
    @Id
    private String code;
    private String name;
}
