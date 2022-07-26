package com.example.petClinicApp.repositories;

import com.example.petClinicApp.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
