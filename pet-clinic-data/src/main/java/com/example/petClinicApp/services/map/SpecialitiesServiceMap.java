package com.example.petClinicApp.services.map;

import com.example.petClinicApp.model.Specialty;
import com.example.petClinicApp.services.SpecialitiesServices;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class SpecialitiesServiceMap extends AbstractMapService<Specialty,Long> implements SpecialitiesServices {

    @Override
    public Set<Specialty> findALL() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty object) {
        super.deleteByObject(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
