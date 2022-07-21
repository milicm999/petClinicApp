package com.example.petClinicApp.model.services.map;

import com.example.petClinicApp.model.Speciality;
import com.example.petClinicApp.model.Vet;
import com.example.petClinicApp.model.services.SpecialitiesServices;
import org.springframework.stereotype.Service;
import com.example.petClinicApp.model.services.VetService;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    private final SpecialitiesServices specialitiesServices;
    private final SpecialitiesServiceMap specialitiesServiceMap;

    public VetServiceMap(SpecialitiesServices specialitiesServices, SpecialitiesServiceMap specialitiesServiceMap) {
        this.specialitiesServices = specialitiesServices;
        this.specialitiesServiceMap = specialitiesServiceMap;
    }

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

        if(object.getSpecialities().size()>0)
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId()==null){
                    Speciality savedSpeciality=specialitiesServices.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });

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
