package com.aaronweggemans.mapadvisorapi.Domains.Country;

import com.aaronweggemans.mapadvisorapi.Domains.Question.Question;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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

    @OneToMany(mappedBy = "country_id")
    private List<Question> questions;
}
