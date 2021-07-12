package com.example.jpacourse.bootstrap;

import com.example.jpacourse.model.Address;
import com.example.jpacourse.model.Client;
import com.example.jpacourse.repository.AddressRepository;
import com.example.jpacourse.repository.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BootStrap implements CommandLineRunner {

    final ClientRepository clientRepository;
    final AddressRepository addressRepository;

    public BootStrap(ClientRepository clientRepository, AddressRepository addressRepository) {
        this.clientRepository = clientRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        createClient();

        List<Client> clientList = clientRepository.findAll();
        clientList.forEach(client -> System.out.println(client.toString()));

        showAllAddress();
    }

    private void createClient(){
        Client client = new Client("Carlos", "Araiza", "111122");
        Address address = new Address("Arequipa", "750");

        client.setAddress( address );

        clientRepository.save( client );
    }

    private void showAllAddress(){
        addressRepository.findAll().forEach(System.out::println);
    }
}
