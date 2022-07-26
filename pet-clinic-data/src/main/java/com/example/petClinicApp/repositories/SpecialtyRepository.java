package com.example.petClinicApp.repositories;

import com.example.petClinicApp.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty,Long> {
}
