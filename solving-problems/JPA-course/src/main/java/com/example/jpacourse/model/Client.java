package com.example.jpacourse.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String DNI;

    @OneToOne( cascade = CascadeType.ALL )
    @JoinTable( name = "fk_address" )
    private Address address;

    public Client(){}

    public Client(String firstName, String lastName, String DNI) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DNI='" + DNI + '\'' +
                ", address=" + address +
                '}';
    }
}
