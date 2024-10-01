package com.te.ems.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class Employee {
    @Id
    private String id;
    @Column(unique = true)
    private String employeeId;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private LocalDate dateOfJoining;
    private Double salary;

    @Enumerated
    private Gender gender;

}
