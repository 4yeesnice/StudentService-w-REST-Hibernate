package com.example.StudentService.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.LocalDate;
import java.time.Period;


@Data
@Entity
public class Students {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    @Transient
    private int age;

    @Column(unique = true)
    private String email;

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
