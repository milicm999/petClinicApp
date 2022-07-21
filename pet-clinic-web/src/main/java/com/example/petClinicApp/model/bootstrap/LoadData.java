package com.example.petClinicApp.model.bootstrap;

import com.example.petClinicApp.model.Owner;
import com.example.petClinicApp.model.Pet;
import com.example.petClinicApp.model.PetType;
import com.example.petClinicApp.model.Vet;
import com.example.petClinicApp.model.services.PetTypeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.petClinicApp.model.services.OwnerService;
import com.example.petClinicApp.model.services.VetService;

import java.time.LocalDate;

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
        PetType savedDogPetType=petTypeService.save(dog);

        PetType cat=new PetType();
        cat.setName("cat");
        PetType savedCatPetType=petTypeService.save(cat);

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

        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setFirstName("Dragan");
        vet2.setLastName("Zivanovic");

        vetService.save(vet2);

        System.out.println("Vets are loaded....");
    }
}
