package com.aaronweggemans.mapadvisorapi.Domains.Country;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "countries")
@Getter
@Setter
public class Country {
    @Id
    private Long id;
    private String country_name;
    private Float latitude;
    private Float longitude;
}
