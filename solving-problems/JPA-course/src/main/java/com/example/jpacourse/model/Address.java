package com.example.jpacourse.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String number;

    @OneToOne(mappedBy = "address")
    private Client client;

    public Address(){}

    public Address(String street, String number) {
        this.street = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", client= '" + client + '\''+
                '}';
    }
}
