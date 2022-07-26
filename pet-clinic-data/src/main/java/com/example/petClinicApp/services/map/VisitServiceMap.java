package com.example.petClinicApp.services.map;

import com.example.petClinicApp.model.Visit;
import com.example.petClinicApp.repositories.PetRepository;
import com.example.petClinicApp.services.PetService;
import com.example.petClinicApp.services.VisitSerice;

import java.util.Set;

public class VisitServiceMap extends AbstractMapService<Visit,Long> implements VisitSerice {

    private final PetService petService;

    public VisitServiceMap(PetService petService) {
        this.petService = petService;
    }

    @Override
    public Set<Visit> findALL() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {

        if(visit.getPet()==null || visit.getPet().getOwner() == null || visit.getPet().getId()
        || visit.getPet().getOwner().getId())
        {
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(visit);
    }

    @Override
    public void delete(Visit object) {
        super.deleteByObject(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
