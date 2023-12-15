package ru.sberbank.lab2.jsonvsproto.dto;



public class Address {
    private final int countryCode;
    private final String city;
    private final String street;

    public Address(int countryCode, String city, String street) {
        this.countryCode = countryCode;
        this.city = city;
        this.street = street;
    }

    public Address(){
        this.city = null;
        this.countryCode = 0;
        this.street = null;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "{Address " +
                "country_code=" + countryCode +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
