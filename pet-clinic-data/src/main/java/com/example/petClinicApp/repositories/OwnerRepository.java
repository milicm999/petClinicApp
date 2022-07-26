package com.example.petClinicApp.repositories;

import com.example.petClinicApp.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastName(String lastName); //query method
}
