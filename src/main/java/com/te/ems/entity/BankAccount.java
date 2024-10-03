package com.te.ems.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class BankAccount {
    @Id
    private Long accountNumber;
    private String ifsc;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "bankAccount")
    private Employee employee;
}
