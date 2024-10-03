package com.te.ems.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class Technology {
    @Id
    private Integer technologyId;
    @Column(unique = true)
    private String name;

}
