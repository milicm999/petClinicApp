package com.example.petClinicApp.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "visits")
public class Visit extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "description")
    private String description;

}
