package com.aaronweggemans.mapadvisorapi.Domains.Question;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "questions")
@Getter
@Setter
public class Question {
    @Id
    private Long id;
    private Long country_id;
    private String description;
}
