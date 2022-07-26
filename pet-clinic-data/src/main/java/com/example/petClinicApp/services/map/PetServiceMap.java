package com.example.petClinicApp.services.map;

import com.example.petClinicApp.model.Pet;
import com.example.petClinicApp.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {

    @Override
    public Set<Pet> findALL() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.deleteByObject(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
