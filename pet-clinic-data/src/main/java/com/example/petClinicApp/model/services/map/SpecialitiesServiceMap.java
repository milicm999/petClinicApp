package com.example.petClinicApp.model.services.map;

import com.example.petClinicApp.model.Speciality;
import com.example.petClinicApp.model.services.SpecialitiesServices;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialitiesServiceMap extends AbstractMapService<Speciality,Long> implements SpecialitiesServices {

    @Override
    public Set<Speciality> findALL() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.deleteByObject(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
