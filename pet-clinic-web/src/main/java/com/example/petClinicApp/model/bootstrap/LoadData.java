package com.example.petClinicApp.model.bootstrap;

import com.example.petClinicApp.model.Owner;
import com.example.petClinicApp.model.PetType;
import com.example.petClinicApp.model.Vet;
import com.example.petClinicApp.model.services.PetTypeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.petClinicApp.model.services.OwnerService;
import com.example.petClinicApp.model.services.VetService;

@Component
public class LoadData implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    private final PetTypeService petTypeService;

    public LoadData(OwnerService ownerService, VetService vetService, PetTypeService petTypeService)
    {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog=new PetType();
        dog.setName("dog");
        PetType setDogPetType=petTypeService.save(dog);

        PetType cat=new PetType();
        cat.setName("cat");
        PetType setCatPetType=petTypeService.save(cat);

        Owner owner1=new Owner();
        owner1.setFirstName("Maja");
        owner1.setLastName("Milic");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setFirstName("Nemanja");
        owner2.setLastName("Despotovic");

        ownerService.save(owner2);

        System.out.println("Owners are loaded...");

        Vet vet1= new Vet();
        vet1.setFirstName("Goran");
        vet1.setLastName("Vasiljevic");

        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setFirstName("Dragan");
        vet2.setLastName("Zivanovic");

        vetService.save(vet2);

        System.out.println("Vets are loaded....");
    }
}
