package com.example.petClinicApp.repositories;

import com.example.petClinicApp.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
