package com.example.petClinicApp.model.bootstrap;

import com.example.petClinicApp.model.Owner;
import com.example.petClinicApp.model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import services.OwnerService;
import services.VetService;
import services.map.OwnerServiceMap;
import services.map.VetServiceMap;

@Component
public class LoadData implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public LoadData()
    {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1=new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Maja");
        owner1.setLastName("Milic");

        ownerService.save(owner1);

        Owner owner2=new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Nemanja");
        owner2.setLastName("Despotovic");

        ownerService.save(owner2);

        System.out.println("Owners are loaded...");

        Vet vet1= new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Goran");
        vet1.setLastName("Vasiljevic");

        vetService.save(vet1);

        Vet vet2= new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Dragan");
        vet2.setLastName("Zivanovic");

        vetService.save(vet2);

        System.out.println("Vets are loaded....");
    }
}
