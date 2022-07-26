package com.example.petClinicApp.repositories;

import com.example.petClinicApp.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
