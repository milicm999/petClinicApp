package com.example.petClinicApp.model.bootstrap;

import com.example.petClinicApp.model.*;
import com.example.petClinicApp.services.PetTypeService;
import com.example.petClinicApp.services.SpecialitiesServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.petClinicApp.services.OwnerService;
import com.example.petClinicApp.services.VetService;

import java.time.LocalDate;

@Component
public class LoadData implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    private final PetTypeService petTypeService;
    private final SpecialitiesServices specialitiesServices;

    public LoadData(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialitiesServices specialitiesServices)
    {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialitiesServices = specialitiesServices;
    }

    @Override
    public void run(String... args) throws Exception {
        int count=petTypeService.findALL().size();
        if(count==0) {
            loadData();
        }
    }
    private void loadData()
    {

        PetType dog=new PetType();
        dog.setName("dog");
        PetType savedDogPetType=petTypeService.save(dog);

        PetType cat=new PetType();
        cat.setName("cat");
        PetType savedCatPetType=petTypeService.save(cat);

        Specialty radiology=new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadiology=specialitiesServices.save(radiology);

        Specialty surgery=new Specialty();
        surgery.setDescription("Surgery");
        Specialty savedSurgery=specialitiesServices.save(surgery);

        Specialty dentistry=new Specialty();
        dentistry.setDescription("Dentistry");
        Specialty savedDentistry=specialitiesServices.save(dentistry);

        Owner owner1=new Owner();
        owner1.setFirstName("Maja");
        owner1.setLastName("Milic");
        owner1.setAddress("Masarikova 4");
        owner1.setCity("Beograd");
        owner1.setTelephone("065352487");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setFirstName("Nemanja");
        owner2.setLastName("Despotovic");
        owner2.setAddress("Kralja Urosa II 8");
        owner2.setCity("Beograd");
        owner2.setTelephone("065352568");

        ownerService.save(owner2);

        Pet nemanjinPas=new Pet();
        nemanjinPas.setName("Cezar");
        nemanjinPas.setPetType(savedDogPetType);
        nemanjinPas.setOwner(owner2);
        nemanjinPas.setBirthDay(LocalDate.now());
        owner2.getPets().add(nemanjinPas);

        Pet majinPas=new Pet();
        majinPas.setName("Tara");
        majinPas.setOwner(owner1);
        majinPas.setBirthDay(LocalDate.now());
        majinPas.setPetType(savedDogPetType);
        owner1.getPets().add(majinPas);

        System.out.println("Owners are loaded...");

        Vet vet1= new Vet();
        vet1.setFirstName("Goran");
        vet1.setLastName("Vasiljevic");
        vet1.getSpecialities().add(surgery);

        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setFirstName("Dragan");
        vet2.setLastName("Zivanovic");
        vet2.getSpecialities().add(radiology);

        vetService.save(vet2);

        System.out.println("Vets are loaded....");
    }
}
