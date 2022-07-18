package com.example.petClinicApp.model.services.map;

import com.example.petClinicApp.model.Vet;
import org.springframework.stereotype.Service;
import com.example.petClinicApp.model.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    @Override
    public Set<Vet> findALL() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.deleteByObject(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
