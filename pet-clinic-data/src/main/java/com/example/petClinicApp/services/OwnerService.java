package com.example.petClinicApp.services;

import com.example.petClinicApp.model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String lastName);

}
