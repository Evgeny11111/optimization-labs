package ru.sberbank.lab2.jsonvsproto.dto;


import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String firstName;
    private final String lastName;
    private final List<Address> address;

    public Person(String firstName, String lastName, List<Address> address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Person(){
        this.firstName = null;
        this.lastName = null;
        this.address = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<Address> getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "{Person " +
                "firstName='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", addresses" + address + '\'' +
                '}';
    }
}
